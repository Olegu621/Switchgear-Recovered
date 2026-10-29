"""Read only the known executable ELF segments of this application's libraries.

Requires a user-authorized running instance and an already available su command.
Does not export process heaps, app preferences, activation tokens or app files.
Original libraries are preserved. The results are static-analysis inputs.
"""
import argparse
import hashlib
import io
import json
import shlex
import subprocess
from pathlib import Path
from elftools.elf.elffile import ELFFile

ROOT = Path(__file__).resolve().parent.parent


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--adb", required=True)
    parser.add_argument("--serial", required=True)
    parser.add_argument("--port", default="5037")
    parser.add_argument("--activation-confirmed", action="store_true", help="Record activation only after separately observing it")
    args = parser.parse_args()
    prefix = [str(Path(args.adb).resolve()), "-P", args.port, "-s", args.serial]
    def root(command, binary=False):
        out = subprocess.check_output(prefix + ["exec-out", "/system/xbin/bstk/su -c " + shlex.quote(command)])
        return out if binary else out.decode("utf-8", "replace")
    package = "bsd.suitcase.release"
    pid = subprocess.check_output(prefix + ["shell", "pidof", package], text=True).strip()
    if not pid.isdigit():
        raise RuntimeError("Expected exactly one application process")
    maps = root("cat /proc/" + pid + "/maps")
    parsed = []
    for line in maps.splitlines():
        a = line.split(None, 5)
        start, end = [int(x, 16) for x in a[0].split("-")]
        parsed.append({"start": start, "end": end, "permissions": a[1],
                       "offset": int(a[2], 16), "path": a[5] if len(a) > 5 else ""})
    def read(address, size):
        page = address & ~4095
        length = (address - page + size + 4095) & ~4095
        command = f"dd if=/proc/{pid}/mem bs=4096 skip={page // 4096} count={length // 4096} 2>/dev/null"
        data = root(command, True)
        if len(data) != length:
            raise RuntimeError(f"Short read at {address:x}: {len(data)} != {length}")
        return data[address - page:address - page + size]
    output = ROOT / "runtime-code"
    output.mkdir(exist_ok=True)
    records = []
    for name in ("libFUSION.so", "libg.so"):
        candidates = [m for m in parsed if m["path"].endswith("/" + name) and m["offset"] == 0]
        if len(candidates) != 1:
            raise RuntimeError("Ambiguous mapping for " + name)
        base = candidates[0]["start"]
        original = (ROOT / "apktool/lib/arm64-v8a" / name).read_bytes()
        elf = ELFFile(io.BytesIO(original))
        runtime = bytearray(original)
        reference_path = ROOT / "native-analysis/libFUSION.unpacked.so" if name == "libFUSION.so" else ROOT / "apktool/lib/arm64-v8a" / name
        reference = reference_path.read_bytes()
        segments = []
        for segment in elf.iter_segments():
            if segment["p_type"] != "PT_LOAD" or not segment["p_flags"] & 1:
                continue
            offset, size, rva = segment["p_offset"], segment["p_filesz"], segment["p_vaddr"]
            data = read(base + rva, size)
            runtime[offset:offset + size] = data
            before = reference[offset:offset + size]
            segments.append({"rva": hex(rva), "file_offset": offset, "size": size,
                             "sha256": hashlib.sha256(data).hexdigest(),
                             "changed_bytes_vs_reference": sum(x != y for x, y in zip(data, before)),
                             "changed_pages_vs_reference": sum(data[i:i + 4096] != before[i:i + 4096] for i in range(0, size, 4096))})
        target = output / name.replace(".so", ".runtime.so")
        target.write_bytes(runtime)
        records.append({"library": name, "runtime_base": hex(base), "pid_at_capture": int(pid),
                        "output": target.relative_to(ROOT).as_posix(), "size": len(runtime),
                        "sha256": hashlib.sha256(runtime).hexdigest(),
                        "reference": reference_path.relative_to(ROOT).as_posix(), "segments": segments})
    report = {"package": package, "activation_confirmed": args.activation_confirmed,
              "scope": "Original ELF headers/data with live executable segments. No heap, preferences or activation data captured. Not a validated loadable replacement library.",
              "libraries": records}
    (ROOT / "evidence/runtime-code-capture.json").write_text(json.dumps(report, indent=2), encoding="utf-8")
    print(json.dumps(report, indent=2))


if __name__ == "__main__":
    main()
