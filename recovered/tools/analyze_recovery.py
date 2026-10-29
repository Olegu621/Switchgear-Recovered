"""Inspect recovered APK material without executing the application.

Requires Python 3.9+, pyelftools and capstone. Does not modify apktool/.
"""
import argparse
import collections
import gzip
import hashlib
import io
import json
import math
import re
import struct
from pathlib import Path

from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM
from elftools.elf.dynamic import DynamicSegment
from elftools.elf.elffile import ELFFile


ROOT = Path(__file__).resolve().parent.parent
EVIDENCE = ROOT / "evidence"
NATIVE = ROOT / "native-analysis"


def save_json(path, data):
    path.write_text(json.dumps(data, ensure_ascii=False, indent=2), encoding="utf-8")


def entropy(data):
    return round(-sum((n / len(data)) * math.log2(n / len(data))
                      for n in collections.Counter(data).values()), 6) if data else 0


def analyze_elf(path):
    data = path.read_bytes()
    report = {"path": path.relative_to(ROOT).as_posix(), "size": len(data),
              "sha256": hashlib.sha256(data).hexdigest(), "entropy": entropy(data)}
    elf = ELFFile(io.BytesIO(data))
    report["machine"] = elf["e_machine"]
    report["entry"] = hex(elf["e_entry"])
    report["segments"] = [{k: hex(s[k]) if k in ("p_vaddr", "p_offset") else s[k]
                           for k in ("p_type", "p_offset", "p_vaddr", "p_filesz", "p_memsz", "p_flags")}
                          for s in elf.iter_segments()]
    report["sections"] = [{"name": s.name, "address": hex(s["sh_addr"]),
                            "offset": s["sh_offset"], "size": s["sh_size"]}
                           for s in elf.iter_sections()]
    syms = []
    report["dynamic"] = []
    for seg in elf.iter_segments():
        if not isinstance(seg, DynamicSegment):
            continue
        for tag in seg.iter_tags():
            t = {"tag": tag.entry.d_tag, "value": hex(tag.entry.d_val)}
            if tag.entry.d_tag == "DT_NEEDED":
                t["name"] = tag.needed
            if tag.entry.d_tag == "DT_SONAME":
                t["name"] = tag.soname
            report["dynamic"].append(t)
        try:
            for sym in seg.iter_symbols():
                if sym.name:
                    syms.append({"name": sym.name, "address": hex(sym["st_value"]),
                                 "size": sym["st_size"], "section": sym["st_shndx"],
                                 "type": sym["st_info"]["type"], "binding": sym["st_info"]["bind"]})
        except Exception as exc:
            report["symbol_error"] = str(exc)
    report["symbols"] = syms
    report["jni_exports"] = [s for s in syms if s["section"] != "SHN_UNDEF"
                              and (s["name"].startswith("Java_") or s["name"] == "JNI_OnLoad")]
    stem = path.name
    # These are strings and static instructions, not reconstructed C/C++.
    with (NATIVE / (stem + ".strings.tsv")).open("w", encoding="utf-8") as f:
        f.write("file_offset\ttext\n")
        for match in re.finditer(rb"[\x20-\x7e]{5,}", data):
            f.write(f"0x{match.start():x}\t{match.group().decode('ascii')}\n")
    save_json(NATIVE / (stem + ".json"), report)
    return elf, data, report


def disassemble(elf, data, output, ranges=None):
    md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
    md.skipdata = True
    with gzip.open(output, "wt", encoding="utf-8", newline="\n", compresslevel=6) as f:
        f.write("; Static AArch64 disassembly. Packed bytes/data may decode as instructions.\n")
        f.write("; This file is analysis material, not original source and not a build input.\n")
        if ranges is None:
            ranges = [(s["p_vaddr"], s["p_filesz"], "executable PT_LOAD")
                      for s in elf.iter_segments() if s["p_type"] == "PT_LOAD" and s["p_flags"] & 1]
        for address, size, label in ranges:
            for seg in elf.iter_segments():
                if seg["p_type"] != "PT_LOAD" or not seg["p_vaddr"] <= address < seg["p_vaddr"] + seg["p_filesz"]:
                    continue
                offset = seg["p_offset"] + address - seg["p_vaddr"]
                size = min(size, seg["p_filesz"] - address + seg["p_vaddr"])
                f.write(f"\n; {label}, address=0x{address:x}, file_offset=0x{offset:x}, bytes={size}\n")
                for ins in md.disasm_lite(data[offset:offset + size], address):
                    f.write(f"{ins[0]:016x}:  {ins[2]:9} {ins[3]}\n")
                break


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--disassemble", action="store_true")
    args = parser.parse_args()
    NATIVE.mkdir(exist_ok=True)
    binary = (ROOT / "apktool/lib/arm64-v8a/libFUSION.a.do").read_bytes()
    candidates = []
    start = 0
    while True:
        offset = binary.find(b"\x7fELF", start)
        if offset < 0:
            break
        start = offset + 4
        try:
            elf = ELFFile(io.BytesIO(binary[offset:]))
            sections = list(elf.iter_sections())
            segments = list(elf.iter_segments())
            valid = (elf["e_machine"] == "EM_AARCH64" and any(s.name == ".text" for s in sections)
                     and all(s["p_offset"] + s["p_filesz"] <= len(binary) - offset for s in segments))
            candidates.append({"offset": offset, "valid": valid})
            if valid:
                carved = NATIVE / "libFUSION.embedded.so"
                carved.write_bytes(binary[offset:])
        except Exception as exc:
            candidates.append({"offset": offset, "valid": False, "error": str(exc)})
    save_json(NATIVE / "embedded-elf.json", {"container": "apktool/lib/arm64-v8a/libFUSION.a.do",
                                             "candidates": candidates})
    libraries = []
    for path in sorted((ROOT / "apktool/lib").rglob("*.so")) + list(NATIVE.glob("libFUSION.embedded.so")):
        try:
            elf, data, report = analyze_elf(path)
            libraries.append({k: report[k] for k in ("path", "size", "sha256", "entropy", "machine", "jni_exports")})
            if args.disassemble:
                if path.name in ("libFUSION.so", "libFUSION.embedded.so"):
                    disassemble(elf, data, NATIVE / (path.name + ".asm.gz"))
                elif path.name == "libg.so":
                    ranges = [(int(s["address"], 16), s["size"] or 32, s["name"])
                              for s in report["jni_exports"]]
                    disassemble(elf, data, NATIVE / "libg-jni.asm.gz", ranges)
        except Exception as exc:
            libraries.append({"path": path.relative_to(ROOT).as_posix(), "error": str(exc)})
    save_json(NATIVE / "libraries.json", libraries)
    classes, native_methods = [], []
    for folder in sorted((ROOT / "apktool").glob("smali*")):
        count = 0
        for path in sorted(folder.rglob("*.smali")):
            text = path.read_text(encoding="utf-8")
            cls = re.search(r"^\.class .*?(L[^;]+;)", text, re.M)
            if not cls:
                continue
            count += 1
            for line in re.findall(r"^\.method .*", text, re.M):
                if " native " in line:
                    native_methods.append({"class": cls.group(1), "declaration": line,
                                           "smali": path.relative_to(ROOT).as_posix()})
        classes.append({"folder": folder.name, "classes": count})
    dex = []
    for path in sorted((ROOT / "bytecode").glob("*.dex")):
        data = path.read_bytes()
        import zlib
        dex.append({"name": path.name, "size": len(data), "sha256": hashlib.sha256(data).hexdigest(),
                    "class_defs": struct.unpack_from("<I", data, 96)[0],
                    "sha1_valid": hashlib.sha1(data[32:]).digest() == data[12:32],
                    "adler32_valid": (zlib.adler32(data[12:]) & 0xffffffff) == struct.unpack_from("<I", data, 8)[0]})
    save_json(EVIDENCE / "dex-and-smali.json", {"dex": dex, "smali": classes})
    save_json(NATIVE / "native-methods.json", native_methods)
    failures = []
    for path in sorted((ROOT / "java/sources").rglob("*.java")):
        text = path.read_text(encoding="utf-8")
        markers = [s for s in ("Method not decompiled", "JADX ERROR", "JADX WARN", "??") if s in text]
        if markers:
            failures.append({"path": path.relative_to(ROOT).as_posix(), "markers": markers})
    save_json(EVIDENCE / "java-review-required.json", failures)
    print(json.dumps({"libraries": len(libraries), "native_methods": len(native_methods),
                      "smali_classes": sum(c["classes"] for c in classes),
                      "java_files_with_review_markers": len(failures), "embedded_elf": candidates}))


if __name__ == "__main__":
    main()
