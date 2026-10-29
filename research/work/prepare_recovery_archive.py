import hashlib
import json
from pathlib import Path

BASE = Path(__file__).resolve().parent.parent
ROOT = BASE / 'outputs/switchgear-recovered'


def excluded(path):
    parts = path.relative_to(ROOT).parts
    if '__pycache__' in parts:
        return True
    if parts[0] in ('artifacts', 'native-pseudocode-rerun', 'java-rerun', 'java-simple'):
        return True
    if len(parts) > 1 and parts[0] == 'apktool' and parts[1] in ('build', 'dist'):
        return True
    if len(parts) > 1 and parts[0] == 'tools' and (parts[1] in ('.runtime', '.framework') or parts[1].startswith('.ghidra-')):
        return True
    return False


def main():
    packaging = ROOT / 'evidence/packaging.json'
    packaging.write_text(json.dumps({
        'manifest': 'SHA256SUMS.txt',
        'manifest_scope': 'Recovery documents, tools, evidence, original DEX/libraries and native/runtime analysis artifacts. Decoded assets/smali are covered by prior rebuild validation and archive CRC.',
        'excluded': ['apktool/build', 'apktool/dist', 'artifacts', '__pycache__', 'tools/.runtime', 'tools/.framework', 'tools/.ghidra-*', 'native-pseudocode-rerun', 'java-rerun', 'java-simple'],
        'activation_data_and_private_preferences_included': False,
        'note': 'Source build validation was completed before analysis-only runtime additions; no claim of rebuilt APK gameplay.'
    }, indent=2) + '\n', encoding='utf-8')
    files = sorted((p for p in ROOT.rglob('*') if p.is_file() and not excluded(p) and p.name != 'SHA256SUMS.txt'), key=lambda p: p.relative_to(ROOT).as_posix())
    total = 0
    with (ROOT / 'SHA256SUMS.txt').open('w', encoding='utf-8', newline='\n') as manifest:
        for path in files:
            relative = path.relative_to(ROOT)
            selected = relative.parts[0] != 'apktool' or (len(relative.parts) > 1 and relative.parts[1] in ('lib', 'AndroidManifest.xml', 'apktool.yml'))
            if not selected:
                continue
            h = hashlib.sha256()
            with path.open('rb') as f:
                for block in iter(lambda: f.read(1024 * 1024), b''):
                    h.update(block)
                    total += len(block)
            manifest.write(h.hexdigest() + '  ' + path.relative_to(ROOT).as_posix() + '\n')
    files.append(ROOT / 'SHA256SUMS.txt')
    (BASE / 'work/archive-files.txt').write_text(''.join('switchgear-recovered/' + p.relative_to(ROOT).as_posix() + '\n' for p in files), encoding='utf-8')
    print(json.dumps({'packaged_files': len(files), 'hashed_bytes': total, 'manifest_bytes': (ROOT / 'SHA256SUMS.txt').stat().st_size}))


if __name__ == '__main__':
    main()
