import json,hashlib,struct,sys
from pathlib import Path
from decode_quickjs_atoms import decode,leb
from parse_protected_quickjs import Reader,ROOT
def atom(v):
 if 'atom'in v:return leb((v['atom']+228)*2)
 if 'builtin'in v:return leb(v['builtin']*2)
 return leb(v['integer']*2+1)
def string(s,wide):
 raw=s.encode('utf-16-le' if wide else 'latin1',errors='surrogatepass');return leb((len(raw)//(2 if wide else 1))*2+wide)+decode(raw,wide)
def obj(v):
 if v.get('type')=='module':return bytes([0x29])+atom(v['name'])+leb(len(v['requires']))+b''.join(map(atom,v['requires']))+bytes(3)+bytes([v['async']])+obj(v['body'])
 if 'function'in v:
  f=r.functions[v['function']];b=bytearray([0x47])+struct.pack('<HB',f['flags'],f['mode'])+atom(f['name'])
  for k in ['arg_count','var_count','defined_args','stack_size','closure_count','cpool_count','bytecode_len']:b+=leb(f[k])
  b+=bytes(3)+leb(len(f['locals']))
  for x in f['locals']:b+=atom(x['name'])+leb(x['scope_level'])+leb(x['scope_next']+1)+bytes([x['flags']])
  for x in f['closures']:b+=atom(x['name'])+leb(x['index'])+bytes([x['flags']])
  b+=b''.join(obj(x) for x in f['constants'])
  b+=leb(f['register_count'])+leb(len(f['instructions']))+atom(f['ir_name'])
  for ins in f['instructions']:
   b+=leb(ins['op'])
   for kind,value in zip(r.meta[ins['op']],ins['args']):b+=atom(value) if kind==1 else leb(((value<<1)^ (value>>31))&0xffffffff if kind==3 else value)
  return b
 if 'string'in v:
  # Inline wide flag must be retained; main sample has narrow strings only.
  return bytes([0x57])+string(v['string'],any(ord(c)>255 for c in v['string']))
 if 'number'in v:
  # Preserve the original tag by distinguishing Python int vs float.
  n=v['number'];return bytes([0x1d])+struct.pack('<d',n) if isinstance(n,float) else bytes([0x41])+leb(((n<<1)^(n>>31))&0xffffffff)
 if 'literal_tag'in v:return bytes([v['literal_tag']])
 raise ValueError(v)
if __name__=='__main__':
 paths=sorted(ROOT.glob('*/003-reader*.bin')) if '--all' not in sys.argv else sorted(ROOT.glob('*/*reader*.bin'))
 for p in paths:
  r=Reader(p);root=r.obj();assert r.pos==len(r.b)
  b=bytes([r.a['version']])+leb(r.a['count'])+b''.join(string(x['text'],x['wide']) for x in r.a['atoms'])+obj(root)
  assert b==r.b,('roundtrip mismatch',len(b),len(r.b),next((i for i,(x,y)in enumerate(zip(b,r.b)) if x!=y),None))
  report={'byte_exact_roundtrip':True,'bytes':len(b),'sha256':hashlib.sha256(b).hexdigest(),'functions':len(r.functions),'instructions':sum(len(x['instructions']) for x in r.functions),'atoms':r.a['count'],'trailing_bytes':len(r.b)-r.pos}
  p.with_suffix('.verification.json').write_text(json.dumps(report,indent=2));print(json.dumps(report))
