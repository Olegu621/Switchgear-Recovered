import json,struct,sys
from pathlib import Path
from unicorn import *
from unicorn.arm64_const import *
ROOT=Path(__file__).resolve().parent.parent
OUT=ROOT/'data'
u=Uc(UC_ARCH_ARM64,UC_MODE_ARM);base=0x10000000
u.mem_map(base,0x900000);u.mem_write(base,(ROOT/'native/fusion-emulated-image.bin').read_bytes())
u.mem_write(base+0x88c1d4,(OUT/'string-decoder-tables.bin').read_bytes())
u.mem_map(0x70000000,0x1000000);u.mem_map(0x72000000,0x10000)
CTX=0x70001000;RT=0x70002000;STATE=0x70003000;DATA=0x70100000;ALLOC=0x70500000;END=0x72000000
u.mem_write(CTX+0x18,struct.pack('<Q',RT));u.mem_write(RT,struct.pack('<Q',END+0x1000))
def alloc(uc,a,s,d):uc.reg_write(UC_ARM64_REG_X0,ALLOC);uc.reg_write(UC_ARM64_REG_PC,uc.reg_read(UC_ARM64_REG_LR))
def copy(uc,a,s,d):
 dst=uc.reg_read(UC_ARM64_REG_X0);src=uc.reg_read(UC_ARM64_REG_X1);n=uc.reg_read(UC_ARM64_REG_X2);uc.mem_write(dst,bytes(uc.mem_read(src,n)));uc.reg_write(UC_ARM64_REG_PC,uc.reg_read(UC_ARM64_REG_LR))
u.hook_add(UC_HOOK_CODE,alloc,begin=END+0x1000,end=END+0x1000);u.hook_add(UC_HOOK_CODE,copy,begin=base+0x668280,end=base+0x668280)
def leb(n):
 b=[]
 while n>=128:b.append((n&127)|128);n>>=7
 return bytes(b+[n])
def readleb(data,p):
 n=0;shift=0;start=p
 while True:
  v=data[p];p+=1;n|=(v&127)<<shift
  if v<128:return n,p
  shift+=7
  if shift>35:raise ValueError('bad LEB')
keys={}
def decode(raw,wide):
 n=len(raw)
 if n not in keys:
  encoded=leb((n//(2 if wide else 1))*2+wide)+bytes(n)
  u.mem_write(DATA,encoded);u.mem_write(STATE,bytes(128));u.mem_write(STATE,struct.pack('<QQQQ',CTX,DATA,DATA,DATA+len(encoded)))
  u.reg_write(UC_ARM64_REG_X0,STATE);u.reg_write(UC_ARM64_REG_SP,0x70fff000);u.reg_write(UC_ARM64_REG_LR,END)
  u.emu_start(base+0x59b2a0,END,count=800000000)
  if u.reg_read(UC_ARM64_REG_PC)!=END:raise RuntimeError(f'Decoder did not finish n={n} pc={u.reg_read(UC_ARM64_REG_PC):x}')
  keys[n]=bytes(u.mem_read(ALLOC+16,n))
 return bytes(x^y for x,y in zip(raw,keys[n]))
if __name__=='__main__':
 paths=sorted(OUT.glob('*/003-reader*'))
 if '--all' in sys.argv:paths=sorted(OUT.glob('*/*reader*.bin'))
 for p in paths:
  b=p.read_bytes();n,pos=readleb(b,1);atoms=[]
  for i in range(n):
   start=pos;length,pos=readleb(b,pos);wide=length&1;count=length>>1;size=count<<wide
   raw=b[pos:pos+size]
   if len(raw)!=size:raise ValueError('Truncated atom')
   decoded=decode(raw,wide);text=decoded.decode('utf-16-le' if wide else 'latin1',errors='surrogatepass');atoms.append({'index':i,'offset':start,'size':size,'wide':wide,'text':text});pos+=size
   if i<12:print(i,size,repr(text[:60]),flush=True)
  dest=p.with_suffix('.atoms.json');dest.write_text(json.dumps({'input':p.name,'version':b[0],'count':n,'body_offset':pos,'atoms':atoms},ensure_ascii=True,indent=2),encoding='utf8')
  print(p.name,'atoms',n,'body_offset',pos,'decoded',dest,flush=True)
  print('preview',[(x['index'],x['text'][:80]) for x in atoms[:20]],flush=True)

