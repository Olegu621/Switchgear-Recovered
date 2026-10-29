from pathlib import Path
import json,hashlib,zipfile
root=Path('outputs/switchgear-script-reversed');files=[p for p in sorted(root.rglob('*')) if p.is_file() and '__pycache__' not in p.parts and p.name!='SHA256SUMS.json']
manifest={p.relative_to(root).as_posix():hashlib.sha256(p.read_bytes()).hexdigest() for p in files};(root/'SHA256SUMS.json').write_text(json.dumps(manifest,indent=2));files.append(root/'SHA256SUMS.json')
zip_path=root.parent/'Switchgear-script-reversed.zip'
with zipfile.ZipFile(zip_path,'w',zipfile.ZIP_DEFLATED,compresslevel=6) as z:
 for p in files:z.write(p,Path(root.name)/p.relative_to(root))
with zipfile.ZipFile(zip_path) as z:assert z.testzip() is None
h=hashlib.sha256(zip_path.read_bytes()).hexdigest();zip_path.with_suffix('.zip.sha256.txt').write_text(h+'  '+zip_path.name+'\n');print(json.dumps({'zip':str(zip_path.resolve()),'bytes':zip_path.stat().st_size,'files':len(files),'sha256':h,'crc_ok':True}))
