"""Check ZIP CRCs, preserved assets/libraries and DEX declarations after rebuild."""
import argparse
import hashlib
import json
import struct
import zipfile
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent


def hash_stream(stream):
    h = hashlib.sha256()
    for block in iter(lambda: stream.read(1024 * 1024), b""):
        h.update(block)
    return h.hexdigest()


def dex_schema(d):
    def u32(p): return struct.unpack_from("<I", d, p)[0]
    def u16(p): return struct.unpack_from("<H", d, p)[0]
    def uleb(p):
        value, shift = 0, 0
        while True:
            b = d[p]
            p += 1
            value |= (b & 127) << shift
            if b < 128:
                return value, p
            shift += 7
    strings = []
    for i in range(u32(56)):
        p = u32(u32(60) + i * 4)
        _, p = uleb(p)
        strings.append(d[p:d.index(b"\x00", p)].decode("utf-8", "replace"))
    types = [strings[u32(u32(68) + i * 4)] for i in range(u32(64))]
    protos = []
    for i in range(u32(72)):
        p = u32(76) + i * 12
        parameter_offset = u32(p + 8)
        params = [types[u16(parameter_offset + 4 + j * 2)] for j in range(u32(parameter_offset))] if parameter_offset else []
        protos.append("(" + "".join(params) + ")" + types[u32(p + 4)])
    fields = []
    for i in range(u32(80)):
        p = u32(84) + i * 8
        fields.append(types[u16(p)] + "->" + strings[u32(p + 4)] + ":" + types[u16(p + 2)])
    methods = []
    for i in range(u32(88)):
        p = u32(92) + i * 8
        methods.append(types[u16(p)] + "->" + strings[u32(p + 4)] + protos[u16(p + 2)])
    classes, definitions = [], []
    for i in range(u32(96)):
        p = u32(100) + i * 32
        super_index = u32(p + 8)
        interface_offset = u32(p + 12)
        interfaces = [types[u16(interface_offset + 4 + j * 2)] for j in range(u32(interface_offset))] if interface_offset else []
        classes.append((types[u32(p)], u32(p + 4), types[super_index] if super_index != 0xffffffff else None, tuple(interfaces)))
        q = u32(p + 24)
        if not q:
            continue
        counts = []
        for _ in range(4):
            n, q = uleb(q)
            counts.append(n)
        for group, n in enumerate(counts):
            index = 0
            for _ in range(n):
                delta, q = uleb(q)
                index += delta
                access, q = uleb(q)
                if group < 2:
                    definitions.append(("field", fields[index], access))
                else:
                    code_offset, q = uleb(q)
                    definitions.append(("method", methods[index], access, bool(code_offset)))
    schema = {"classes": sorted(classes), "fields": sorted(fields), "methods": sorted(methods), "definitions": sorted(definitions)}
    canonical = json.dumps(schema, ensure_ascii=True, separators=(",", ":")).encode()
    return {"class_count": len(classes), "field_ids": len(fields), "method_ids": len(methods),
            "definitions": len(definitions), "schema_sha256": hashlib.sha256(canonical).hexdigest()}


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("original_apk", type=Path)
    parser.add_argument("rebuilt_apk", type=Path)
    args = parser.parse_args()
    report = {"scope": "Packaging and DEX declarations; no Android runtime or gameplay test"}
    with args.original_apk.open("rb") as f:
        report["original_sha256"] = hash_stream(f)
    with args.rebuilt_apk.open("rb") as f:
        report["rebuilt_sha256"] = hash_stream(f)
    with zipfile.ZipFile(args.original_apk) as original, zipfile.ZipFile(args.rebuilt_apk) as rebuilt:
        # ZIP.read/open validates each entry's CRC at EOF.
        preserved = [i for i in original.infolist() if not i.is_dir() and i.filename.startswith(("assets/", "lib/"))]
        failures = []
        total_bytes = 0
        for i in preserved:
            with original.open(i) as f:
                before = hash_stream(f)
            try:
                with rebuilt.open(i.filename) as f:
                    after = hash_stream(f)
            except KeyError:
                after = None
            if before != after:
                failures.append(i.filename)
            total_bytes += i.file_size
        report["preserved_files_checked"] = len(preserved)
        report["preserved_bytes_checked"] = total_bytes
        report["preserved_file_failures"] = failures
        report["dex"] = []
        for name in sorted(n for n in original.namelist() if n.endswith(".dex") and "/" not in n):
            before = dex_schema(original.read(name))
            after = dex_schema(rebuilt.read(name))
            report["dex"].append({"name": name, "original": before, "rebuilt": after, "declarations_match": before == after})
        report["rebuilt_zip_crc_error"] = rebuilt.testzip()
    report["passed"] = not report["preserved_file_failures"] and not report["rebuilt_zip_crc_error"] and all(x["declarations_match"] for x in report["dex"])
    (ROOT / "evidence/validation.json").write_text(json.dumps(report, indent=2), encoding="utf-8")
    print(json.dumps(report, indent=2))
    raise SystemExit(0 if report["passed"] else 1)


if __name__ == "__main__":
    main()
