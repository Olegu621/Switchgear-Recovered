import json
import sys
import time
from pathlib import Path

sys.path.insert(0, r'D:\CodexScratch\xlamMOD\frida\python')
import frida

BASE = Path(__file__).resolve().parent.parent
OUT = Path(r'D:\CodexScratch\xlamMOD\frida')
events = []


def message(value, data):
    events.append(value)
    if value.get('type') == 'send':
        print(json.dumps(value.get('payload')), flush=True)
    else:
        print(json.dumps(value), flush=True)


device = frida.get_device_manager().add_remote_device('127.0.0.1:27043')
pid = device.spawn(['bsd.suitcase.release'])
print('ORIGINAL_PID', pid, flush=True)
session = device.attach(pid)
def detached(reason, crash):
    print('DETACHED', reason, str(crash)[:300], flush=True)
    if crash is not None:
        (OUT / 'original-capture-crash.txt').write_text(crash.report, encoding='utf-8')
session.on('detached', detached)
plain = '--plain' in sys.argv
agent_path = 'work/capture_original_script_bundled.js' if '--java' in sys.argv else 'work/capture_original_script.js'
agent = "rpc.exports={status(){return {installed:false,count:0,objects:[]}},restore(){}};send({kind:'control_agent_ready'});" if plain else (BASE / agent_path).read_text()
bootstrap = "let chunks=[];rpc.exports={chunk(s){chunks.push(s)},run(){(0,eval)(chunks.join(''));chunks=[]}};"
script = session.create_script(bootstrap if '--java' in sys.argv else agent, runtime='v8' if '--v8' in sys.argv else 'qjs')
script.on('message', message)
script.load()
if '--java' in sys.argv:
    for offset in range(0, len(agent), 12000):
        script.exports_sync.chunk(agent[offset:offset+12000])
    script.exports_sync.run()
device.resume(pid)
last = None
for _ in range(10 if plain else 90):
    time.sleep(1)
    try:
        status = script.exports_sync.status()
    except Exception as exc:
        print(type(exc).__name__, str(exc), flush=True)
        break
    text = json.dumps(status)
    if text != last:
        print('CAPTURE_STATUS', text, flush=True)
        last = text
    (OUT / 'capture-status.json').write_text(json.dumps(status, indent=2))
    (OUT / 'capture-events.json').write_text(json.dumps(events, indent=2))
    if status.get('count', 0) > 0:
        time.sleep(5)
        status = script.exports_sync.status()
        (OUT / 'capture-status.json').write_text(json.dumps(status, indent=2))
        print('CAPTURE_READY', json.dumps(status), flush=True)
        break
try:
    script.exports_sync.restore()
except Exception:
    pass
session.detach()
