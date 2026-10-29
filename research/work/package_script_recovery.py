from pathlib import Path
import shutil,json,hashlib
base=Path.cwd();src=Path(r'D:\CodexScratch\xlamMOD\script-capture');out=base/'outputs/switchgear-script-reversed';out.mkdir(exist_ok=True)
for d in ['data/modules','data/variants','native','tools','reconstructed','evidence']: (out/d).mkdir(parents=True,exist_ok=True)
run=src/'20261027-095632'
for p in run.iterdir():
 if p.name.startswith(('001-reader','002-reader','003-reader')) or p.name in ['numeric-pool-decoded.json','game-data-recovered.json']:
  shutil.copy2(p,out/'data/modules'/p.name)
text=(run/'string-pool-decoded.txt').read_text(encoding='utf8',errors='surrogatepass');(out/'data/modules/string-pool-decoded.json').write_text(json.dumps(text.split('\0'),ensure_ascii=True,indent=2),encoding='utf8')
for name in ['string-decoder-tables.bin','opcode-metadata.json','opcode-semantics.json','builtin-atoms.json']:shutil.copy2(src/name,out/'data'/name)
for p in (src/'variants').iterdir():shutil.copy2(p,out/'data/variants'/p.name)
shutil.copy2(base/'outputs/switchgear-recovered/native-analysis/fusion-emulated-image.bin',out/'native/fusion-emulated-image.bin')
shutil.copy2(Path(r'D:\CodexScratch\xlamMOD\quickjs-vm-retry.c'),out/'native/quickjs-vm.c')
for name in ['decode_quickjs_atoms.py','parse_protected_quickjs.py','verify_quickjs_roundtrip.py','export_quickjs_listing.py','rebrand_script_bytecode.py']:
 s=(base/'work'/name).read_text(encoding='utf-8-sig')
 s=s.replace("OUT=Path(r'D:\\CodexScratch\\xlamMOD\\script-capture')","OUT=ROOT/'data'")
 s=s.replace("ROOT=Path(r'D:\\CodexScratch\\xlamMOD\\script-capture')","ROOT=Path(__file__).resolve().parent.parent/'data'")
 s=s.replace("ROOT/'outputs/switchgear-recovered/native-analysis/fusion-emulated-image.bin'","ROOT/'native/fusion-emulated-image.bin'")
 s=s.replace("Path(r'D:\\CodexScratch\\xlamMOD\\quickjs-vm-retry.c')","ROOT.parent/'native/quickjs-vm.c'")
 (out/'tools'/name).write_text(s,encoding='utf8')
import unicorn
(out/'requirements.txt').write_text('unicorn=='+unicorn.__version__+'\n')
reports=[json.loads(p.read_text()) for p in (out/'data/modules').glob('*.verification.json')]
summary={'modules':reports,'total_functions':sum(x['functions'] for x in reports),'total_instructions':sum(x['instructions'] for x in reports),'all_bytes_parsed_and_roundtripped':all(x['byte_exact_roundtrip'] for x in reports),'original_js_source_recovered':False,'activation_removed':False,'modified_apk_validated':False}
(out/'evidence/verification-summary.json').write_text(json.dumps(summary,indent=2))
print(json.dumps(summary))

