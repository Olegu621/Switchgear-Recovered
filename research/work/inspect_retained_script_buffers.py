import bisect
import json
import shlex
import struct
import subprocess
from pathlib import Path
from elftools.elf.elffile import ELFFile

BASE = Path(__file__).resolve().parent.parent
PREFIX = [str(BASE / 'work/android-tools/platform-tools/adb.exe'), '-P', '5038', '-s', '127.0.0.1:5555']
OUT = Path(r'D:\CodexScratch\xlamMOD')


def root(command):
    return subprocess.check_output(PREFIX + ['exec-out', '/system/xbin/bstk/su -c ' + shlex.quote(command)])


pid = subprocess.check_output(PREFIX + ['shell', 'pidof', 'com.xlammod.client'], text=True).strip()
assert pid.isdigit()
maps = root('cat /proc/' + pid + '/maps').decode()
regions = []
for line in maps.splitlines():
    fields = line.split(None, 5)
    lo, hi = map(lambda x: int(x, 16), fields[0].split('-'))
    regions.append((lo, hi, fields[1], fields[5] if len(fields) > 5 else ''))
starts = [r[0] for r in regions]
lab_base = next(r[0] for r in regions if r[3].endswith('/libxlamlab.so'))


def read(address, size):
    page = address & ~4095
    count = (address - page + size + 4095) // 4096
    raw = root(f'dd if=/proc/{pid}/mem bs=4096 skip={page // 4096} count={count} 2>/dev/null')
    return raw[address - page:address - page + size]


with (OUT / 'lab/lib/arm64-v8a/libxlamlab.so').open('rb') as f:
    symbols = {s.name: s['st_value'] for s in ELFFile(f).get_section_by_name('.symtab').iter_symbols()}
count = struct.unpack('<Q', read(lab_base + symbols['kept_count'], 8))[0]
count = min(count, 131072)
pointers = set(struct.unpack('<' + 'Q' * count, read(lab_base + symbols['kept'], count * 8)))
print('RETAINED_POINTERS', count, 'UNIQUE', len(pointers))
records = []
for pointer in sorted(pointers):
    idx = bisect.bisect_right(starts, pointer) - 1
    if idx < 0:
        continue
    lo, hi, flags, name = regions[idx]
    if not (lo <= pointer < hi and 'r' in flags and pointer - lo < 4096 and 65536 <= hi - pointer <= 32 * 1024 * 1024):
        continue
    data = read(pointer, hi - pointer)
    record = {'address': hex(pointer), 'mapped_available_bytes': len(data), 'header': data[:32].hex(),
              'switchgear': data.find(b'Switchgear'), 'interceptor': data.find(b'Interceptor'),
              'function': data.find(b'function'), 'source_prefix': data[:32].startswith((b'function', b'var ', b'const ', b'let ', b'(()=>', b'(function', b'/*', b'"use strict"', b"'use strict'"))}
    if record['switchgear'] >= 0 or record['source_prefix']:
        filename = f'retained-code-candidate-{pointer:x}.bin'
        (OUT / filename).write_bytes(data)
        record['file'] = filename
    records.append(record)
    print(json.dumps(record))
(OUT / 'retained-buffers.json').write_text(json.dumps({'pid': int(pid), 'captured_frees': count, 'candidates': records}, indent=2))
