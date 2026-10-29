$ErrorActionPreference='Stop'
& 'C:\Program Files\LLVM\bin\clang.exe' --target=aarch64-linux-android28 -mno-outline-atomics -fuse-ld=lld -nostdlib -shared -fPIC -fno-builtin -fno-stack-protector -O2 '-Wl,-soname,libxlamlab.so' work\xlammod_offline_bridge.c -o D:\CodexScratch\xlamMOD\lab\lib\arm64-v8a\libxlamlab.so
if ($LASTEXITCODE) { exit $LASTEXITCODE }
& '.\work\runtime\temurin17\jdk-17.0.20.1+1-jre\bin\java.exe' -jar outputs\switchgear-recovered\tools\apktool.jar b D:\CodexScratch\xlamMOD\lab -o D:\CodexScratch\xlamMOD\lab-unsigned.apk
if ($LASTEXITCODE) { exit $LASTEXITCODE }
& '.\work\runtime\temurin17\jdk-17.0.20.1+1-jre\bin\java.exe' -jar D:\CodexScratch\xlamMOD\build-tools\android-15\lib\apksigner.jar sign --ks D:\CodexScratch\xlamMOD\signing\xlammod.jks --ks-key-alias xlammod --ks-pass file:D:\CodexScratch\xlamMOD\signing\store.pass --out D:\CodexScratch\xlamMOD\lab.apk D:\CodexScratch\xlamMOD\lab-unsigned.apk
if ($LASTEXITCODE) { exit $LASTEXITCODE }
& .\work\android-tools\platform-tools\adb.exe -P 5038 -s 127.0.0.1:5555 install -r D:\CodexScratch\xlamMOD\lab.apk
if ($LASTEXITCODE) { exit $LASTEXITCODE }
& .\work\android-tools\platform-tools\adb.exe -P 5038 -s 127.0.0.1:5555 shell am force-stop com.xlammod.client
& .\work\android-tools\platform-tools\adb.exe -P 5038 -s 127.0.0.1:5555 shell am instrument -w -r com.xlammod.lab/com.xlammod.lab.NativeBootstrap
