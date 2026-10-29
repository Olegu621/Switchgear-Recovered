import sys,json
from pathlib import Path
sys.path.insert(0,'work')
import verify_quickjs_roundtrip as writer
from parse_protected_quickjs import Reader,ROOT
from decode_quickjs_atoms import leb
p=ROOT/'variants/xlamMOD-brand-only.bin';r=Reader(p);root=r.obj();writer.r=r
for f in r.functions:
 idx=len(r.a['atoms']);r.a['atoms'].append({'index':idx,'wide':0,'text':f'f_{f["id"]:04d}'});f['name']={'atom':idx}
r.a['count']=len(r.a['atoms']);prefix=bytes([r.a['version']])+leb(r.a['count'])
for a in r.a['atoms']:
 a['offset']=len(prefix);raw=a['text'].encode('utf-16-le' if a['wide'] else 'latin1',errors='surrogatepass');a['size']=len(raw);prefix+=writer.string(a['text'],a['wide'])
r.a['body_offset']=len(prefix);target=ROOT/'variants/xlamMOD-debug.bin';target.write_bytes(prefix+writer.obj(root));target.with_suffix('.atoms.json').write_text(json.dumps(r.a,ensure_ascii=True));check=Reader(target);check.obj();assert check.pos==len(check.b);print('Named debug module',len(check.b),len(check.functions))
