from pathlib import Path
import textwrap

root = Path(r'D:\CodexScratch\xlamMOD\lab')
(root / 'smali/com/xlammod/lab').mkdir(parents=True, exist_ok=True)
(root / 'AndroidManifest.xml').write_text('''<manifest xmlns:android="http://schemas.android.com/apk/res/android" package="com.xlammod.lab" android:versionCode="1" android:versionName="1"><uses-sdk android:minSdkVersion="28" android:targetSdkVersion="28"/><application android:label="xlamMOD Lab" android:hasCode="true"/><instrumentation android:name="com.xlammod.lab.NativeBootstrap" android:targetPackage="com.xlammod.client" android:functionalTest="true"/></manifest>''', encoding='utf-8')
(root / 'apktool.yml').write_text('''version: 2.9.3
apkFileName: lab.apk
isFrameworkApk: false
usesFramework:
  ids:
  - 1
sdkInfo:
  minSdkVersion: 28
  targetSdkVersion: 28
packageInfo:
  forcedPackageId: 127
  renameManifestPackage: null
versionInfo:
  versionCode: 1
  versionName: '1'
doNotCompress: []
''')
(root / 'smali/com/xlammod/lab/NativeBootstrap.smali').write_text('''.class public Lcom/xlammod/lab/NativeBootstrap;
.super Landroid/app/Instrumentation;

.method public constructor <init>()V
    .locals 0
    invoke-direct {p0}, Landroid/app/Instrumentation;-><init>()V
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0
    invoke-super {p0, p1}, Landroid/app/Instrumentation;->onCreate(Landroid/os/Bundle;)V
    invoke-virtual {p0}, Landroid/app/Instrumentation;->start()V
    return-void
.end method

.method public onStart()V
    .locals 6
    :try_start
    invoke-virtual {p0}, Landroid/app/Instrumentation;->getTargetContext()Landroid/content/Context;
    move-result-object v0
    invoke-static {v0}, Lzap/m;->start(Landroid/content/Context;)Z
    const-string v1, "xlamMODLab"
    const-string v2, "Context ready; starting native core with test network block active"
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    invoke-static {}, Lzap/m;->b()Z
    move-result v2
    invoke-static {v2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;
    move-result-object v2
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    new-instance v2, Landroid/content/Intent;
    const-class v3, Lcom/supercell/titan/KkGateActivity;
    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    const/high16 v3, 0x10000000
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    const-wide/32 v2, 0x493e0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end
    goto :done
    .catch Ljava/lang/Throwable; {:try_start .. :try_end} :failed
    :failed
    move-exception v0
    const-string v1, "xlamMODLab"
    const-string v2, "Native bootstrap failed"
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :done
    new-instance v0, Landroid/os/Bundle;
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    const/4 v1, 0x0
    invoke-virtual {p0, v1, v0}, Landroid/app/Instrumentation;->finish(ILandroid/os/Bundle;)V
    return-void
.end method
''', encoding='utf-8')
print(root)
