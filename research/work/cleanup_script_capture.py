import subprocess,json
from pathlib import Path
adb=['work/android-tools/platform-tools/adb.exe','-P','5038','-s','127.0.0.1:5555']
def shell(command):return subprocess.run(adb+['shell',command],capture_output=True,text=True,timeout=20)
def root(command):return shell("/system/xbin/bstk/su -c '"+command+"'")
records=[]
for pkg in ['com.xlammod.lab','com.xlammod.client','bsd.suitcase.release']:
 r=shell('am force-stop '+pkg);records.append({'action':'force_stop','package':pkg,'returncode':r.returncode})
for table in ['iptables','ip6tables']:
 for uid in [10135,10136]:
  command=f'{table} -C OUTPUT -m owner --uid-owner {uid} -j REJECT'
  if root(command).returncode==0:
   r=root(command.replace(' -C ',' -D '));records.append({'action':'remove_temporary_network_block','table':table,'uid':uid,'returncode':r.returncode})
server=root('pidof xlammod-frida-server').stdout.strip()
for pid in server.split():
 if pid.isdecimal() and 'xlammod-frida-server' in root('cat /proc/'+pid+'/cmdline').stdout:
  r=root('kill '+pid);records.append({'action':'stop_own_capture_server','pid':int(pid),'returncode':r.returncode})
r=subprocess.run(adb+['forward','--remove','tcp:27043'],capture_output=True,text=True);records.append({'action':'remove_forward','returncode':r.returncode})
for name in ['xlammod-frida-server','xlammod-memhosts','xlammod-ranges.txt','xlammod-membytes','xlammod-gbytes-ranges.txt','xlammod-native.trace']:
 root('rm -f /data/local/tmp/'+name)
r=shell('am start -n bsd.suitcase.release/com.supercell.titan.KkGateActivity');records.append({'action':'restart_original_normally','returncode':r.returncode})
Path('outputs/switchgear-script-reversed/evidence/cleanup.json').write_text(json.dumps(records,indent=2));print(json.dumps(records))
