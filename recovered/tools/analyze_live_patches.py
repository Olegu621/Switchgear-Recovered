"""Compare preserved game instructions with the activated runtime capture."""
import hashlib
import json
import struct
from pathlib import Path
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM

ROOT = Path(__file__).resolve().parent.parent


def main():
    before = (ROOT / "apktool/lib/arm64-v8a/libg.so").read_bytes()
    after = (ROOT / "runtime-code/libg.runtime.so").read_bytes()
    if len(before) != len(after):
        raise RuntimeError("Library sizes differ")
    changed = [i for i, (a, b) in enumerate(zip(before, after)) if a != b]
    groups = []
    for offset in changed:
        if not groups or offset - groups[-1][-1] > 32:
            groups.append([offset])
        else:
            groups[-1].append(offset)
    declarations = json.loads((ROOT / "native-analysis/libg.so.json").read_text(encoding="utf-8"))["jni_exports"]
    report = json.loads((ROOT / "evidence/runtime-code-capture.json").read_text())
    base = int(next(r for r in report["libraries"] if r["library"] == "libg.so")["runtime_base"], 16)
    disassembler = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
    patches, restore = [], []
    for group in groups:
        start, end = group[0] & ~3, (group[-1] + 4) & ~3
        # All observed modifications are in the first PT_LOAD, where offset == RVA.
        if end > 18498576:
            raise RuntimeError("Unexpected changed segment; map file offsets to RVAs before continuing")
        old, new = before[start:end], after[start:end]
        jni = [s["name"] for s in declarations if int(s["address"], 16) <= start < int(s["address"], 16) + s["size"]]
        hook = len(new) >= 16 and new[:8] == bytes.fromhex("5000005800021fd6")
        target = struct.unpack_from("<Q", new, 8)[0] if hook else None
        patch = {"rva": hex(start), "file_offset": start, "size": end - start,
                 "changed_bytes": len(group), "original_hex": old.hex(), "runtime_hex": new.hex(),
                 "containing_jni_export": jni,
                 "kind": "absolute_branch_trampoline" if hook else "instruction_or_data_patch",
                 "runtime_target": hex(target) if target is not None else None}
        size = 8 if hook else min(len(new), 32)
        patch["runtime_instructions"] = [{"address": hex(i.address), "mnemonic": i.mnemonic, "operands": i.op_str}
                                         for i in disassembler.disasm(new[:size], base + start)]
        patches.append(patch)
        restore.append(f"{start:x} {old.hex()}")
    result = {"source_sha256": hashlib.sha256(before).hexdigest(),
              "runtime_sha256": hashlib.sha256(after).hexdigest(), "runtime_base": hex(base),
              "changed_bytes": len(changed), "changed_pages": len({i // 4096 for i in changed}),
              "patch_groups": len(patches),
              "absolute_branch_trampolines": sum(p["kind"] == "absolute_branch_trampoline" for p in patches),
              "scope": "Observed changes in this activated process. Does not assign feature names or infer that all changes are hooks.",
              "patches": patches}
    (ROOT / "evidence/live-patches.json").write_text(json.dumps(result, indent=2), encoding="utf-8")
    (ROOT / "evidence/restore-original-libg.txt").write_text("\n".join(restore) + "\n", encoding="ascii")
    with (ROOT / "runtime-code/live-patches.tsv").open("w", encoding="utf-8") as f:
        f.write("rva\tsize\tchanged_bytes\tkind\truntime_target\tcontaining_jni_export\n")
        for p in patches:
            f.write(f"{p['rva']}\t{p['size']}\t{p['changed_bytes']}\t{p['kind']}\t{p['runtime_target'] or ''}\t{','.join(p['containing_jni_export'])}\n")
    print(json.dumps({k: v for k, v in result.items() if k != "patches"}, indent=2))


if __name__ == "__main__":
    main()
