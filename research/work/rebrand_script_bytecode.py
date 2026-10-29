import json,hashlib,sys
from pathlib import Path
import verify_quickjs_roundtrip as writer
from parse_protected_quickjs import Reader,ROOT
from decode_quickjs_atoms import leb
p=sorted(ROOT.glob('*/003-reader*.bin'))[-1];r=Reader(p);root=r.obj();writer.r=r
changes=[]
for a in r.a['atoms']:
 if a['text']=='Switchgear':changes.append({'atom':a['index'],'old':a['text'],'new':'xlamMOD'});a['text']='xlamMOD'
a=r.a['atoms'][4712];pool=''.join(chr(ord(c)^0x3a63) for c in a['text']);new=pool.replace('Switchgear','xlamMOD').replace('Switch2','xlamMOD')
changes.append({'atom':4712,'Switchgear_occurrences':pool.count('Switchgear'),'Switch2_occurrences':pool.count('Switch2')});a['text']=''.join(chr(ord(c)^0x3a63) for c in new)
prefix=bytes([r.a['version']])+leb(r.a['count'])
for a in r.a['atoms']:
 a['offset']=len(prefix);raw=a['text'].encode('utf-16-le' if a['wide'] else 'latin1',errors='surrogatepass');a['size']=len(raw);prefix+=writer.string(a['text'],a['wide'])
r.a['body_offset']=len(prefix)
b=prefix+writer.obj(root);out=ROOT/'variants';out.mkdir(exist_ok=True);target=out/'xlamMOD-brand-only.bin';target.write_bytes(b);r.a['input']=target.name;target.with_suffix('.atoms.json').write_text(json.dumps(r.a,ensure_ascii=True,indent=2));check=Reader(target);check.obj();assert check.pos==len(b);assert len(check.functions)==1953
report={'scope':'branding only; activation unchanged; not runtime tested','sha256':hashlib.sha256(b).hexdigest(),'bytes':len(b),'functions':len(check.functions),'parsed_all_bytes':check.pos==len(b),'changes':changes};target.with_suffix('.changes.json').write_text(json.dumps(report,ensure_ascii=True,indent=2));print(json.dumps(report))
