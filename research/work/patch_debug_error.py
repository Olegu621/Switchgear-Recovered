import sys,json
from pathlib import Path
sys.path.insert(0,'work')
import verify_quickjs_roundtrip as w
from parse_protected_quickjs import Reader,ROOT
from decode_quickjs_atoms import leb
p=ROOT/'variants/xlamMOD-debug.bin';r=Reader(p);root=r.obj();w.r=r
r.functions[1940]['instructions'][113].update(op=34,args=[133])
r.functions[1940]['instructions'][156].update(op=8,args=[14,10]);r.functions[1940]['instructions'][157].update(op=103,args=[14])
r.functions[1940]['instructions'][174].update(op=8,args=[14,12]);r.functions[1940]['instructions'][175].update(op=103,args=[14])
r.functions[1940]['instructions'][127].update(op=8,args=[14,9]);r.functions[1940]['instructions'][128].update(op=103,args=[14])
r.functions[1952]['instructions'][9].update(op=8,args=[3,1]);r.functions[1952]['instructions'][10].update(op=103,args=[3])
prefix=bytes([r.a['version']])+leb(r.a['count'])+b''.join(w.string(a['text'],a['wide'])for a in r.a['atoms']);r.a['body_offset']=len(prefix);out=ROOT/'variants/xlamMOD-debug-trace.bin';out.write_bytes(prefix+w.obj(root));out.with_suffix('.atoms.json').write_text(json.dumps(r.a,ensure_ascii=True));check=Reader(out);check.obj();assert check.pos==len(check.b);print('Original error propagation patched',len(check.b))
