import subprocess,struct,json
from pathlib import Path
adb=['work/android-tools/platform-tools/adb.exe','-P','5038','-s','127.0.0.1:5555','exec-out'];pid=24489;cache={}
def mem(a,n):
 out=b''
 while n:
  page=a&~4095;off=a-page;k=min(n,4096-off)
  if page not in cache:cache[page]=subprocess.check_output(adb+[f"/system/xbin/bstk/su -c 'dd if=/proc/{pid}/mem bs=4096 skip={page//4096} count=1 2>/dev/null'"])
  out+=cache[page][off:off+k];a+=k;n-=k
 return out
def q(a):return struct.unpack('<Q',mem(a,8))[0]
ctx=0x79c94b05f970;rt=q(ctx+24);tab=q(rt+0xa8);rows=[]
for i in range(228):
 a=q(tab+i*8)
 if not a or a&1:rows.append(None);continue
 flags=struct.unpack('<I',mem(a+4,4))[0];length=flags&0x3fffffff;wide=(flags>>31)&1
 if length>1000:raise ValueError((i,hex(a),flags))
 rows.append(mem(a+16,length<<wide).decode('utf-16-le' if wide else 'latin1',errors='surrogatepass'))
Path(r'D:\CodexScratch\xlamMOD\script-capture\builtin-atoms.json').write_text(json.dumps(rows,ensure_ascii=True,indent=2));print(json.dumps([(i,rows[i]) for i in [0,47,60,70,71,126,158]],ensure_ascii=True));print('count',len(rows),'pages',len(cache))
