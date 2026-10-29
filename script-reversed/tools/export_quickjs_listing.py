import json,re,collections
from pathlib import Path
ROOT=Path(__file__).resolve().parent.parent/'data'
NAMES={1:'load_undefined',2:'load_null',3:'load_boolean',4:'load_int',5:'load_constant',6:'load_string',7:'load_this',8:'move',9:'clear',10:'get_global',11:'set_global',12:'add',13:'subtract',14:'multiply',15:'divide',16:'remainder',17:'negate',18:'increment',19:'decrement',20:'equal',21:'not_equal',22:'strict_equal',23:'less_than',24:'less_or_equal',25:'greater_than',26:'greater_or_equal',27:'bit_and',28:'bit_or',29:'bit_xor',30:'shift_left',31:'shift_right',32:'logical_not',33:'bit_not',34:'jump',35:'jump_if_true',36:'jump_if_false',37:'call',38:'return',39:'return_undefined',40:'suspend',67:'call_method',68:'make_closure',73:'get_closure',74:'set_closure',75:'close_variables',76:'get_local_checked',78:'set_local_checked',80:'mark_uninitialized',90:'catch_target',94:'get_property',95:'set_property',96:'get_element',97:'set_element',98:'new_object',99:'new_array',100:'typeof',103:'throw',104:'construct',105:'get_closure_checked',108:'prepare_property_key',111:'is_undefined',112:'is_null',132:'define_property',137:'unsigned_shift_right'}
meta={x['op']:x for x in json.loads((ROOT/'opcode-metadata.json').read_text())};builtins=json.loads((ROOT/'builtin-atoms.json').read_text())
source=(ROOT.parent/'native/quickjs-vm.c').read_text();line_by_op={int(m.group(1),0):source[:m.start()].count('\n')+1 for m in re.finditer(r'^  case (0x[0-9a-f]+|[0-9]+):',source,re.M)}
for op,x in meta.items():x['name']=NAMES.get(op,f'vm_{op:03d}');x['native_rva']='0x58de80';x['native_line']=line_by_op.get(op,line_by_op.get(19,0)+1)
(ROOT/'opcode-semantics.json').write_text(json.dumps(list(meta.values()),indent=2))
for p in sorted(ROOT.glob('*/*reader*.ir.json')):
 j=json.loads(p.read_text());a=json.loads(p.with_name(p.name.replace('.ir.json','.atoms.json')).read_text())['atoms']
 def atom(v):
  if 'atom'in v:
   idx=v['atom'];t=a[idx]['text'];return f'atom[{idx}]='+json.dumps(t if len(t)<200 else t[:160]+'… [full text in atoms.json]',ensure_ascii=True)
  if 'builtin'in v:return f'builtin[{v["builtin"]}]='+json.dumps(builtins[v['builtin']],ensure_ascii=True)
  return f'integer_atom[{v["integer"]}]'
 lines=['; Recovered register IR. Complete instruction stream; not original JavaScript.', '; vm_NNN operands are decoded; their semantics are specified by native/quickjs-vm.c.', '; Large strings are abbreviated here and stored in full in *.atoms.json.', '']
 count=collections.Counter()
 for f in j['functions']:
  lines.append(f'function f_{f["id"]:04d}  args={f["arg_count"]} vars={f["var_count"]} registers={f["register_count"]} file_offset=0x{f["offset"]:x}')
  lines.append('  name '+atom(f['name']))
  for i,c in enumerate(f['closures']):lines.append(f'  closure[{i}]: index={c["index"]} flags=0x{c["flags"]:02x} '+atom(c['name']))
  for i,c in enumerate(f['constants']):lines.append(f'  constant[{i}]: '+json.dumps(c,ensure_ascii=True))
  for i,ins in enumerate(f['instructions']):
   op=ins['op'];count[op]+=1;parts=[]
   for k,v in zip(meta[op]['types'],ins['args']):parts.append(atom(v) if k==1 else (f'r{v}' if k==0 else f'L{v:05d}' if k==7 else str(v)))
   lines.append(f'  L{i:05d}  {meta[op]["name"]:<23} '+', '.join(parts)+f'   ; op={op} @0x{ins["offset"]:x}')
  lines.append('end\n')
 p.with_suffix('.txt').write_text('\n'.join(lines),encoding='utf8')
 print(p.name,'instructions',sum(count.values()),'named',sum(n for op,n in count.items() if op in NAMES),'remaining_opcodes',len(set(count)-NAMES.keys()))
