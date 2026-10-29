import json,struct,sys
from pathlib import Path
from decode_quickjs_atoms import decode,readleb
ROOT=Path(r'D:\CodexScratch\xlamMOD\script-capture')
class Reader:
 def __init__(self,p):
  self.path=p;self.a=json.loads(p.with_suffix('.atoms.json').read_text());self.b=p.read_bytes();self.pos=self.a['body_offset'];self.functions=[];self.meta={x['op']:x['types'] for x in json.loads((ROOT/'opcode-metadata.json').read_text())};self.tags={}
 def byte(self):
  x=self.b[self.pos];self.pos+=1;return x
 def leb(self):
  n,self.pos=readleb(self.b,self.pos);return n
 def atom(self):
  n=self.leb()
  if n&1:return {'integer':n>>1}
  n>>=1
  if n<228:return {'builtin':n}
  assert n-228<self.a['count'],('atom',n,self.pos)
  return {'atom':n-228}
 def obj(self):
  start=self.pos;tag=self.byte();self.tags[tag]=self.tags.get(tag,0)+1
  if tag==0x29:
   v={'type':'module','name':self.atom(),'requires':[self.atom() for _ in range(self.leb())]}
   assert self.leb()==0,'module exports';assert self.leb()==0,'module stars';assert self.leb()==0,'module imports';v['async']=self.byte();v['body']=self.obj();return v
  if tag==0x47:
   f={'id':len(self.functions),'offset':start};self.functions.append(f)
   f['flags']=self.byte()|(self.byte()<<8);f['mode']=self.byte();f['name']=self.atom()
   for key in ['arg_count','var_count','defined_args','stack_size','closure_count','cpool_count','bytecode_len']:f[key]=self.leb()
   assert self.byte()==0,'flag1';assert self.byte()==0,'flag2';assert self.leb()==0,'extras'
   n=self.leb();assert n==0 or n==f['arg_count']+f['var_count'],('locals',n)
   f['locals']=[{'name':self.atom(),'scope_level':self.leb(),'scope_next':self.leb()-1,'flags':self.byte()} for _ in range(n)]
   f['closures']=[{'name':self.atom(),'index':self.leb(),'flags':self.byte()} for _ in range(f['closure_count'])]
   assert f['bytecode_len']==0,'nonempty old bytecode'
   assert not f['flags']&1024,'debug'
   f['constants']=[self.obj() for _ in range(f['cpool_count'])]
   f['ir_offset']=self.pos;f['register_count']=self.leb();n=self.leb();f['ir_name']=self.atom();f['instructions']=[]
   assert n<1000000,('instruction count',n)
   for i in range(n):
    offset=self.pos;op=self.leb();assert op in self.meta,('opcode',op,offset,'function',f['id'],'index',i)
    args=[]
    for kind in self.meta[op]:
     if kind==1:args.append(self.atom())
     else:
      value=self.leb();args.append((value>>1)^-(value&1) if kind==3 else value)
    f['instructions'].append({'op':op,'args':args,'offset':offset})
   f['end']=self.pos
   return {'function':f['id']}
  if tag==0x1d:
   v=struct.unpack_from('<d',self.b,self.pos)[0];self.pos+=8;return {'number':v}
  if tag==0x41:
   v=self.leb();return {'number':(v>>1)^-(v&1)}
  if tag==0x57:
   length=self.leb();wide=length&1;n=(length>>1)<<wide;raw=self.b[self.pos:self.pos+n];self.pos+=n;return {'string':decode(raw,wide).decode('utf-16-le' if wide else 'latin1',errors='surrogatepass')}
  if tag in [0x25,0x4d,0x2f,0x59]:return {'literal_tag':tag}
  raise ValueError(('unknown tag',hex(tag),'offset',start,'function_count',len(self.functions)))
if __name__=='__main__':
 paths=sorted(ROOT.glob('*/003-reader*.bin')) if '--all' not in sys.argv else sorted(ROOT.glob('*/*reader*.bin'))
 for p in paths:
  r=Reader(p)
  obj=r.obj();assert r.pos==len(r.b),('trailing',len(r.b)-r.pos)
  out={'file':p.name,'size':len(r.b),'consumed':r.pos,'tags':r.tags,'root':obj,'functions':r.functions};p.with_suffix('.ir.json').write_text(json.dumps(out,ensure_ascii=True,indent=2))
  print(p.name,'SUCCESS',len(r.functions),'functions',sum(len(f['instructions']) for f in r.functions),'instructions','tags',r.tags)
