"""Capture only observed ARM64 trampoline instructions and their pointer literals.

Uses addresses from a matching live-patches report. Does not export hook contexts,
listener objects, process heaps, preferences, or authentication data.
"""
import argparse
import json
import shlex
import struct
import subprocess
from pathlib import Path
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM

ROOT = Path(__file__).resolve().parent.parent


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--adb", required=True)
    parser.add_argument("--serial", required=True)
    parser.add_argument("--port", default="5037")
    args = parser.parse_args()
    prefix = [args.adb, "-P", args.port, "-s", args.serial]
    report = json.loads((ROOT / "evidence/runtime-code-capture.json").read_text())
    patches = json.loads((ROOT / "evidence/live-patches.json").read_text())
    pid = subprocess.check_output(prefix + ["shell", "pidof", report["package"]], text=True).strip()
    if not pid.isdigit() or int(pid) != report["libraries"][0]["pid_at_capture"]:
        raise RuntimeError("Process changed; recapture executable segments and patches first")

    def root(command):
        return subprocess.check_output(prefix + ["exec-out", "/system/xbin/bstk/su -c " + shlex.quote(command)])

    maps = root("cat /proc/" + pid + "/maps").decode()
    game_base = int(patches["runtime_base"], 16)
    if not any(int(line.split("-", 1)[0], 16) == game_base and line.rstrip().endswith("/libg.so") for line in maps.splitlines()):
        raise RuntimeError("Library mapping changed")

    def read(address, size):
        page = address & ~4095
        count = (address - page + size + 4095) // 4096
        data = root(f"dd if=/proc/{pid}/mem bs=4096 skip={page // 4096} count={count} 2>/dev/null")
        if len(data) != count * 4096:
            raise RuntimeError("Short process memory read")
        return data[address - page:address - page + size]

    md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)

    def instruction_block(address):
        data = read(address, 0x300)
        instructions = []
        literals = []
        end = None
        for ins in md.disasm(data, address):
            instructions.append({"address": hex(ins.address), "mnemonic": ins.mnemonic, "operands": ins.op_str})
            word = struct.unpack("<I", ins.bytes)[0]
            if word & 0xff000000 in (0x18000000, 0x58000000):
                imm = (word >> 5) & 0x7ffff
                if imm & 0x40000:
                    imm -= 0x80000
                pointer = ins.address + imm * 4
                size = 8 if word & 0x40000000 else 4
                if address <= pointer <= address + len(data) - size:
                    value = int.from_bytes(data[pointer-address:pointer-address+size], "little")
                    literal = {"address": hex(pointer), "size": size, "value": hex(value)}
                    for library in report["libraries"]:
                        base = int(library["runtime_base"], 16)
                        if base <= value < base + library["size"]:
                            literal["known_library"] = library["library"]
                            literal["library_rva"] = hex(value - base)
                    literals.append(literal)
            if ins.mnemonic in ("br", "ret", "b"):
                end = ins.address + ins.size - address
                break
        if end is None:
            raise RuntimeError(f"No terminating branch in bounded code at {address:x}")
        return {"address": hex(address), "code_hex": data[:end].hex(), "instructions": instructions, "literal_pointers": literals}

    entries, dispatchers = [], {}
    expected = bytes.fromhex("d1000058f000005800021fd671000058d000005800021fd6")
    for patch in patches["patches"]:
        if patch["kind"] != "absolute_branch_trampoline":
            continue
        address = int(patch["runtime_target"], 16)
        entry = read(address, 48)
        if entry[:24] != expected:
            raise RuntimeError(f"Unexpected trampoline layout at {address:x}")
        context, enter, leave = struct.unpack_from("<QQQ", entry, 24)
        entries.append({"game_rva": patch["rva"], "entry_address": hex(address),
                        "entry_instructions_hex": entry[:24].hex(),
                        "context_pointer_address_only": hex(context),
                        "enter_dispatcher": hex(enter), "leave_dispatcher": hex(leave),
                        "relocated_original_instructions": instruction_block(address + 48)})
        for target in (enter, leave):
            if hex(target) not in dispatchers:
                dispatchers[hex(target)] = instruction_block(target)
    result = {"scope": "Observed generated ARM64 hook code and literal addresses only. No context or heap contents; address layout is specific to this process.",
              "pid": int(pid), "hook_entries": len(entries), "entries": entries,
              "shared_dispatchers": list(dispatchers.values())}
    (ROOT / "runtime-code/hook-code.json").write_text(json.dumps(result, indent=2), encoding="utf-8")
    with (ROOT / "runtime-code/hook-code.asm").open("w", encoding="utf-8") as f:
        f.write("; Observed generated ARM64 instructions. Addresses apply to this process only.\n")
        blocks = [("shared dispatcher", block) for block in dispatchers.values()]
        blocks += [("relocated game instructions at RVA " + entry["game_rva"], entry["relocated_original_instructions"]) for entry in entries]
        for title, block in blocks:
            f.write("\n; " + title + "\n")
            for ins in block["instructions"]:
                f.write(f"{ins['address']}: {ins['mnemonic']} {ins['operands']}\n")
            for literal in block["literal_pointers"]:
                target = (literal.get("known_library", "") + "+" + literal.get("library_rva", "")) if "known_library" in literal else "address literal"
                f.write(f"; {literal['address']}: pointer {literal['value']} ({target})\n")
    print(json.dumps({"hook_entries": len(entries), "shared_dispatchers": len(dispatchers)}))


if __name__ == "__main__":
    main()
