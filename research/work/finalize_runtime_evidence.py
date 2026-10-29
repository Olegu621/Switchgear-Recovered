import csv
import hashlib
import json
import re
import shutil
import struct
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
OUT = ROOT / 'outputs/switchgear-recovered'


def save(relative, value):
    (OUT / relative).write_text(json.dumps(value, indent=2, ensure_ascii=False) + '\n', encoding='utf-8')


def digest(path):
    h = hashlib.sha256()
    with path.open('rb') as f:
        for block in iter(lambda: f.read(1024 * 1024), b''):
            h.update(block)
    return h.hexdigest()


def main():
    runtime = json.loads((OUT / 'evidence/bluestacks-runtime-validation.json').read_text())
    runtime.update(activation_completed_verified=True, lobby_observed=True,
                   gameplay_tested=False, rebuilt_apk_runtime_tested=False,
                   snapshot='evidence/bluestacks-lobby-after-activation.png',
                   final_observed_screen='Game lobby after user activation and onboarding',
                   executable_capture_repeated_at_lobby=True,
                   repeated_executable_capture_identical=True)
    save('evidence/bluestacks-runtime-validation.json', runtime)
    setup = json.loads((OUT / 'evidence/bluestacks-setup.json').read_text())
    setup.update(switchgear_activated=True, required_user_action=None)
    setup['requested_target'] = 'BlueStacks with data on D:'
    setup['virtualization_firmware_enabled_wmi_report'] = setup.pop('virtualization_firmware_enabled', False)
    setup['runtime_evidence']['path'] = r'D:\BlueStacks_nxt\Engine\Rvc64\Logs\BstkCore.log'
    save('evidence/bluestacks-setup.json', setup)
    shutil.copyfile(ROOT / 'work/switchgear-final-screen.png', OUT / runtime['snapshot'])

    hits = (ROOT / 'work/runtime-capture/memory-pattern-hits.txt').read_text().splitlines()
    counts = {}
    names = ['DEX', 'ELF', 'JS_INTERCEPTOR', 'JS_MODULE', 'JS_NATIVEFUNCTION', 'JS_JAVA', 'JS_FUNCTION', 'LUA', 'JS_RPC']
    scanned = regions = None
    for line in hits:
        if line.startswith('COUNT '):
            _, kind, count = line.split()
            counts[names[int(kind, 16)]] = int(count, 16)
        if line.startswith('SCANNED '):
            _, count, _, region = line.split()
            scanned, regions = int(count, 16), int(region, 16)
    original = (OUT / 'apktool/lib/arm64-v8a/libg.so').read_bytes()[:64]
    found = (ROOT / 'work/runtime-capture/anonymous-elf-header.bin').read_bytes()[:64]
    save('evidence/runtime-search-summary.json', {
        'package': 'bsd.suitcase.release', 'pid': 5325, 'activation_confirmed': True,
        'selected_regions': regions, 'bytes_read_including_chunk_overlap': scanned,
        'scope': 'Bounded signature scan of selected readable anonymous, allocator and Dalvik memory regions. Not an exhaustive proof about hidden code.',
        'counts': counts,
        'generic_function_text_matches': '11 matches inspected; library/game error or bridge strings, no additional script source identified.',
        'additional_elf_header': {'address': '0x79c94dff8000',
            'matches_original_libg_elf_header': found == original,
            'machine': struct.unpack_from('<H', found, 18)[0],
            'entry': hex(struct.unpack_from('<Q', found, 24)[0]),
            'classification': 'Duplicate libg ELF buffer, not an identified new module.'},
        'private_app_file_inventory': '269 file metadata entries inspected; no extra .dex/.js/.lua/.so found. Private file contents and inventory not exported.',
        'encrypted_asset': 'assets/kogcpfofggee.dat remains opaque and is preserved unchanged.',
        'retained_data': 'No process heap dump, authentication data, activation QR, or private preference contents included.'})

    log = (OUT / 'evidence/ghidra-libg-original-completion.log').read_text(encoding='utf-8', errors='replace')
    match = re.search(r'GAME_RECOVERY_COMPLETE total_functions=(\d+) exported=(\d+) reused=(\d+) failed=(\d+) skipped=(\d+) external_excluded=(\d+)', log)
    if not match:
        raise RuntimeError('Ghidra completion marker is missing; do not package incomplete output')
    keys = ['recognized_functions_including_externals', 'exported_pseudocode_functions', 'cached_unchanged_functions', 'failed_functions', 'skipped_functions', 'externals_and_external_blocks_excluded']
    completed = dict(zip(keys, map(int, match.groups())))
    for name in ['libg.runtime.so', 'libg.original']:
        path = OUT / ('game-pseudocode/' + name + '.pseudo.c')
        item = {'program': name, 'pseudocode_size': path.stat().st_size, 'sha256': digest(path),
                'warnings_in_pseudocode': path.read_text(encoding='utf-8').count('WARNING:')}
        if name == 'libg.runtime.so':
            item.update(recognized_functions_including_externals=24693, exported_pseudocode_functions=23808,
                        failed_functions=34, skipped_functions=380, initial_autoanalysis_timeout_seconds=300,
                        export_time_limit_seconds=900, external_block_stubs_may_be_present=True,
                        scope='First export with active runtime hooks; retained for comparison.')
            first = item
        else:
            item.update(completed)
            item.update(scope='Observed runtime patches restored from original APK; unchanged successful functions reused. Follow-up analysis completed, initial discovery had a 300-second limit.',
                        per_retried_function_timeout_seconds=15, export_time_limit_seconds=900)
            second = item
    save('evidence/game-pseudocode-summary.json', {
        'tool': 'Ghidra 12.2 PUBLIC, JDK 25', 'ghidra_image_base': '0x100000',
        'scope': 'Inferred functions, types and control flow. Not original or verified-compilable C/C++. Failed or undiscovered functions remain represented by original binary instructions.',
        'passes': [first, second]})
    retry_log = (OUT / 'evidence/ghidra-libg-retry.log').read_text(encoding='utf-8', errors='replace')
    retry = re.search(r'RETRY_COMPLETE recovered=(\d+) failed=(\d+)', retry_log)
    if not retry:
        raise RuntimeError('Final retry is not complete')
    summary = json.loads((OUT / 'evidence/game-pseudocode-summary.json').read_text(encoding='utf-8'))
    supplementary = OUT / 'game-pseudocode/libg.retried.pseudo.c'
    recovered, failed = map(int, retry.groups())
    summary['supplementary_retry'] = {'recovered_functions': recovered, 'remaining_failed_functions': failed,
        'pseudocode_file': 'game-pseudocode/libg.retried.pseudo.c', 'sha256': digest(supplementary),
        'modes': 'Normal C decompilation with 60-second limit; lower-level normalized form with 15-second limit on failure.',
        'assembly_fallback': 'game-pseudocode/libg.failed-functions.asm'}
    summary['successful_game_function_bodies_including_supplement'] = completed['exported_pseudocode_functions'] + recovered
    save('evidence/game-pseudocode-summary.json', summary)
    print(json.dumps(completed))


if __name__ == '__main__':
    main()
