import json
import re
import shutil
import subprocess
from pathlib import Path

BASE = Path(__file__).resolve().parent.parent
SOURCE = BASE / 'outputs/switchgear-recovered/apktool'
TARGET = Path(r'D:\CodexScratch\xlamMOD\project')


def main():
    if TARGET.exists():
        raise RuntimeError('Variant project already exists')
    TARGET.mkdir(parents=True)
    linked = {'assets', 'smali', 'smali_classes2', 'smali_classes4'}
    for item in SOURCE.iterdir():
        if item.name in {'build', 'dist'}:
            continue
        target = TARGET / item.name
        if item.name in linked:
            subprocess.check_call(['cmd', '/c', 'mklink', '/J', str(target), str(item)])
        elif item.is_dir():
            shutil.copytree(item, target)
        else:
            shutil.copy2(item, target)
    manifest = TARGET / 'AndroidManifest.xml'
    original = manifest.read_text(encoding='utf-8')
    manifest.write_text(original.replace('bsd.suitcase.release', 'com.xlammod.client'), encoding='utf-8')
    strings = TARGET / 'res/values/strings.xml'
    content = strings.read_text(encoding='utf-8')
    content, count = re.subn(r'(<string name="app_name">).*?(</string>)', r'\1xlamMOD\2', content)
    assert count == 1
    strings.write_text(content, encoding='utf-8')
    yml = TARGET / 'apktool.yml'
    content = yml.read_text(encoding='utf-8').replace('versionCode: 69252', 'versionCode: 69253').replace('versionName: 69.252', 'versionName: 69.252-xlamMOD')
    yml.write_text(content, encoding='utf-8')

    path = TARGET / 'smali_classes3/zap/m.1.smali'
    content = path.read_text(encoding='utf-8')
    start = '''.method public static start(Landroid/content/Context;)Z
    .locals 1
    const/4 v0, 0x0
    invoke-static {p0, v0}, Lzap/s;->b(Landroid/content/Context;Lzap/ar;)V
    const/4 v0, 0x1
    return v0
.end method'''
    content, count = re.subn(r'\.method public static start\(Landroid/content/Context;\)Z.*?\.end method', start, content, flags=re.S)
    assert count == 1
    path.write_text(content, encoding='utf-8')
    path = TARGET / 'smali_classes3/com/supercell/titan/KkGateActivity.smali'
    content = path.read_text(encoding='utf-8')
    start = '''.method private runGate()V
    .locals 3
    :try_start
    invoke-static {p0}, Lzap/m;->start(Landroid/content/Context;)Z
    new-instance v0, Lcom/supercell/titan/KkGateActivity$3;
    const-string v1, "0"
    invoke-direct {v0, p0, v1}, Lcom/supercell/titan/KkGateActivity$3;-><init>(Lcom/supercell/titan/KkGateActivity;Ljava/lang/String;)V
    invoke-virtual {p0, v0}, Lcom/supercell/titan/KkGateActivity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end
    return-void
    .catch Ljava/lang/Throwable; {:try_start .. :try_end} :failed
    :failed
    move-exception v0
    const-string v1, "xlamMOD"
    const-string v2, "Native initialization failed"
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    const-string v0, "-14"
    invoke-direct {p0, v0}, Lcom/supercell/titan/KkGateActivity;->publishFailure(Ljava/lang/String;)V
    return-void
.end method'''
    content, count = re.subn(r'\.method private runGate\(\)V.*?\.end method', start, content, flags=re.S)
    assert count == 1
    path.write_text(content, encoding='utf-8')
    print(json.dumps({'project': str(TARGET), 'package': 'com.xlammod.client', 'scope': 'Candidate only; module functionality and network behavior require validation.'}))


if __name__ == '__main__':
    main()
