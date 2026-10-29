import subprocess,json
from pathlib import Path
adb=['work/android-tools/platform-tools/adb.exe','-P','5038','-s','127.0.0.1:5555']
for pkg in ['com.xlammod.client','com.xlammod.lab']:subprocess.run(adb+['shell','am force-stop '+pkg],check=True)
for table in ['iptables','ip6tables']:
 c=f'{table} -C OUTPUT -m owner --uid-owner 10136 -j REJECT';r=subprocess.run(adb+['shell',"/system/xbin/bstk/su -c '"+c+"'"],capture_output=True)
 if r.returncode==0:subprocess.run(adb+['shell',"/system/xbin/bstk/su -c '"+c.replace(' -C ',' -D ')+"'"],check=True)
subprocess.run(adb+['shell',"/system/xbin/bstk/su -c 'rm -f /data/local/tmp/xlammod-main.bin'"],check=True)
print('Candidate stopped; temporary network rules removed')
