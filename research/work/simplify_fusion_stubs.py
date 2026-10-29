import json
import struct
from pathlib import Path
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM
from unicorn import Uc, UC_ARCH_ARM64, UC_MODE_ARM, UC_HOOK_CODE, UcError
from unicorn.arm64_const import UC_ARM64_REG_SP, UC_ARM64_REG_PC, UC_ARM64_REG_X0

SOURCE = Path(__file__).resolve().parent.parent / 'outputs/switchgear-recovered/native-analysis'
OUT = Path(r'D:\CodexScratch\xlamMOD')
data = (SOURCE / 'libFUSION.unpacked.so').read_bytes()
base = 0x10000000
u = Uc(UC_ARCH_ARM64, UC_MODE_ARM)
u.mem_map(base, 0x900000)
u.mem_write(base, (SOURCE / 'fusion-emulated-image.bin').read_bytes())
u.mem_map(0x70000000, 0x10000)
md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
allowed = {'adrp', 'add', 'mvn', 'orr', 'and', 'mov', 'lsl', 'sub', 'ubfiz', 'eor', 'str', 'ldr', 'neg', 'mul', 'bic', 'eon', 'orn', 'lsr', 'ubfx', 'br'}
result = []
for number, (word,) in enumerate(struct.iter_unpack('<I', data[:0x844000])):
    start = number * 4
    if start < 0x30000 or word & 0x9f00001f != 0x90000008:
        continue
    insns = []
    for ins in md.disasm(data[start:start + 192], base + start):
        if ins.mnemonic not in allowed:
            break
        if ins.mnemonic in ('str', 'ldr') and '[sp' not in ins.op_str:
            break
        insns.append(ins)
        if ins.mnemonic == 'br':
            break
    if len(insns) < 7 or insns[-1].mnemonic != 'br':
        continue
    branch = insns[-1]
    register = int(branch.op_str[1:])
    for i in range(29):
        u.reg_write(UC_ARM64_REG_X0 + i, 0)
    u.reg_write(UC_ARM64_REG_SP, 0x70008000)
    try:
        u.emu_start(base + start, branch.address, count=100)
        target = u.reg_read(UC_ARM64_REG_X0 + register) - base
    except UcError:
        continue
    if not (0x30000 <= target < 0x844000 and target % 4 == 0):
        continue
    if start <= target < branch.address + 4 - base:
        continue
    result.append({'rva': start, 'target_rva': target, 'length': branch.address + 4 - base - start})
patched = bytearray(data)
for item in result:
    start, target, size = item['rva'], item['target_rva'], item['length']
    code = struct.pack('<I', 0x14000000 | (((target - start) // 4) & 0x3ffffff))
    patched[start:start + size] = code + bytes.fromhex('1f2003d5') * (size // 4 - 1)
(OUT / 'fusion-simplified-stubs.json').write_text(json.dumps(result, indent=2))
(OUT / 'libFUSION.analysis-simplified.so').write_bytes(patched)
print(json.dumps({'constant_branch_stubs': len(result), 'scope': 'Analysis only; not a loadable replacement or activation patch.'}))
