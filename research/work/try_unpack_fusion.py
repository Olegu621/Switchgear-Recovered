import io,json,struct,time,hashlib,lief
from pathlib import Path
from unicorn import *
from unicorn.arm64_const import *
from elftools.elf.elffile import ELFFile

root=Path(__file__).resolve().parent.parent
data=(root/'outputs/switchgear-recovered/apktool/lib/arm64-v8a/libFUSION.so').read_bytes()
elf=ELFFile(io.BytesIO(data))
base=0x10000000
u=Uc(UC_ARCH_ARM64,UC_MODE_ARM)
u.mem_map(base,0x900000)
regions=[]
for seg in elf.iter_segments():
 if seg['p_type']=='PT_LOAD':
  u.mem_write(base+seg['p_vaddr'],seg.data());regions.append((seg['p_vaddr'],seg['p_filesz']))
parsed=lief.parse(list(data))
for reloc in parsed.relocations:
 if str(reloc.type)=='TYPE.AARCH64_RELATIVE':
  addend=struct.unpack('<Q',bytes(u.mem_read(base+reloc.address,8)))[0] if str(reloc.encoding)=='ENCODING.RELR' else reloc.addend
  u.mem_write(base+reloc.address,struct.pack('<Q',base+addend))
stack=0x70000000;tls=0x71000000;end=0x72000000
for addr,size in [(stack,0x200000),(tls,0x10000),(end,0x1000)]:u.mem_map(addr,size)
u.reg_write(UC_ARM64_REG_SP,stack+0x180000)
u.reg_write(UC_ARM64_REG_TPIDR_EL0,tls+0x8000)
u.reg_write(UC_ARM64_REG_X30,end)
events=[];nextmap=0x40000000;allocations=[]
def event(x):
 if len(events)<200:events.append(x)
def invalid(uc,access,address,size,value,_):
 event({'event':'unmapped','access':access,'address':hex(address),'size':size,'pc':hex(uc.reg_read(UC_ARM64_REG_PC)),'registers':[hex(uc.reg_read(UC_ARM64_REG_X0+i)) for i in range(29)]})
 return False
def intr(uc,intno,_):
 global nextmap
 pc=uc.reg_read(UC_ARM64_REG_PC);number=uc.reg_read(UC_ARM64_REG_X8)
 args=[uc.reg_read(UC_ARM64_REG_X0+i) for i in range(6)]
 insn=bytes(uc.mem_read(pc-4,4))
 event({'event':'interrupt','intno':intno,'pc':hex(pc),'instruction':insn.hex(),'syscall':number,'args':[hex(a) for a in args]})
 if intno!=2:
  uc.emu_stop();return
 if number in (226,215,233,167):ret=0
 elif number in (172,178):ret=31337
 elif number==222:
  size=(args[1]+4095)&~4095;ret=args[0] or nextmap
  try:
   uc.mem_map(ret,size);allocations.append((ret,size))
  except UcError:pass
  nextmap=max(nextmap,ret+size+0x10000)
 elif number in (56,63,57,78,79):ret=(1<<64)-2
 elif number==48:ret=(1<<64)-(14 if args[1]==0 else 2)
 else:
  uc.emu_stop();return
 uc.reg_write(UC_ARM64_REG_X0,ret)
u.hook_add(UC_HOOK_MEM_INVALID,invalid)
u.hook_add(UC_HOOK_INTR,intr)
t=time.time();err=None
try:u.emu_start(base+0x8000,end,timeout=25_000_000,count=2_000_000_000)
except UcError as ex:err=str(ex)
changed=[]
for addr,size in regions:
 current=bytes(u.mem_read(base+addr,size))
 seg=next(s for s in elf.iter_segments() if s['p_type']=='PT_LOAD' and s['p_vaddr']==addr)
 before=seg.data()
 pages=[hex(addr+i) for i in range(0,size,0x1000) if current[i:i+0x1000]!=before[i:i+0x1000]]
 if pages:changed.append({'segment':hex(addr),'changed_pages':pages,'sha256':hashlib.sha256(current).hexdigest()})
report={'status':'static emulation only; not Android execution','elapsed':time.time()-t,'error':err,'pc':hex(u.reg_read(UC_ARM64_REG_PC)),'returned':u.reg_read(UC_ARM64_REG_PC)==end,'events':events,'changed':changed}
out=root/'outputs/switchgear-recovered/native-analysis'
(out/'fusion-emulated-image.bin').write_bytes(bytes(u.mem_read(base,0x900000)))
report['memory_image']={'path':'native-analysis/fusion-emulated-image.bin','base':hex(base),'size':0x900000}
report['allocations']=[]
for address,size in allocations:
 name=f'fusion-heap-{address:x}.bin';block=bytes(u.mem_read(address,size))
 (out/name).write_bytes(block)
 report['allocations'].append({'path':'native-analysis/'+name,'base':hex(address),'size':size,'sha256':hashlib.sha256(block).hexdigest()})
(root/'outputs/switchgear-recovered/evidence/fusion-emulation.json').write_text(json.dumps(report,indent=2),encoding='utf-8')
print(json.dumps(report)[:12000])
