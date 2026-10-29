import json,sys,time,hashlib
from pathlib import Path
sys.path.insert(0,r'D:\CodexScratch\xlamMOD\frida\python')
import frida
out=Path(r'D:\CodexScratch\xlamMOD\script-capture')/time.strftime('%Y%m%d-%H%M%S');out.mkdir(parents=True,exist_ok=True)
d=frida.get_device_manager().add_remote_device('127.0.0.1:27043')
pid=d.spawn(['bsd.suitcase.release']);print('PID',pid,flush=True)
s=d.attach(pid);s.on('detached',lambda reason,crash:print('DETACHED',reason,str(crash)[:150],flush=True))
a=s.create_script("let chunks=[];rpc.exports={chunk(s){chunks.push(s)},run(){(0,eval)(chunks.join(''));chunks=[]}};",runtime='qjs')
a.on('message',lambda m,data:print(json.dumps(m),flush=True));a.load()
text=Path('work/capture_eval_bundled.js').read_text()
for i in range(0,len(text),12000):a.exports_sync.chunk(text[i:i+12000])
a.exports_sync.run();d.resume(pid)
records=[];deadline=time.time()+110
try:
 while time.time()<deadline:
  status=a.exports_sync.status()
  if '--builtins' in sys.argv and any(x['kind']=='bytecode' for x in status['rows']):
   row=next(x for x in status['rows'] if x['kind']=='bytecode');values=a.exports_sync.builtins(row['context']);(out.parent/'builtin-atoms.json').write_text(json.dumps(values,ensure_ascii=True,indent=2));print('BUILTINS_SAVED',len(values),flush=True);break
  for row in status['rows']:
   try:
    size=row['size'];start=int(row['data'],16)
    if 0<size<=32*1024*1024:
     data=b''.join(a.exports_sync.read(hex(start+i),min(8192,size-i)) for i in range(0,size,8192))
     digest=hashlib.sha256(data).hexdigest();name=f"{len(records):03d}-{row['kind']}-{digest[:12]}.bin"
     (out/name).write_bytes(data);
     if row.get('mask','0x0')!='0x0':
      mask=int(row['mask'],16);key=b''.join(a.exports_sync.read(hex(mask+i),min(8192,size-i)) for i in range(0,size,8192));(out/(name+'.decoded')).write_bytes(bytes(x^y for x,y in zip(data,key)))
     row.update(file=name,sha256=digest);records.append(row)
     (out/'manifest.json').write_text(json.dumps(records,indent=2));print('CAPTURED',json.dumps(row),flush=True)
    else:print('INVALID_SIZE',row,flush=True)
   finally:a.exports_sync.release(row['kind'])
  time.sleep(.05)
finally:
 try:a.exports_sync.restore()
 except Exception:pass
 s.detach()
