# -*- coding: utf-8 -*-
from pathlib import Path
import json,struct,shutil
root=Path('outputs/switchgear-script-reversed');j=json.loads((root/'data/modules/003-reader-ef69062c1059.ir.json').read_text());f=j['functions'][5];mods={}
for i,x in enumerate(f['instructions'][:-1]):
 y=f['instructions'][i+1]
 if x['op']==68 and y['op']==115 and isinstance(y['args'][1],dict) and 'integer'in y['args'][1]:mods[y['args'][1]['integer']]=f['constants'][x['args'][1]]['function']
(root/'data/module-map.json').write_text(json.dumps(mods,indent=2))
b=(root/'native/fusion-emulated-image.bin').read_bytes();rows=[]
for i in range(26):
 vals=struct.unpack_from('<4Q',b,0x851a98+i*32);a=vals[0]-0x10000000;name=b[a:b.find(b'\0',a)].decode('ascii');rows.append({'index':i,'name':name,'callback_rva':hex(vals[3]-0x10000000),'table_rva':hex(0x851a98+i*32)})
(root/'data/native-callbacks.json').write_text(json.dumps(rows,indent=2));shutil.copy2(Path(r'D:\CodexScratch\xlamMOD\loader-callbacks.c'),root/'native/loader-callbacks.c')
with (root/'README.md').open('a',encoding='utf8')as h:h.write('\n## Последняя проверка локальной загрузки\n\nПробный загрузчик в отдельном тестовом приложении прочитал основной модуль из локального файла при блокировке всей его сети. Чтение байткода движком прошло; исполнение остановилось на ошибке инициализации внутри скрипта. Диагностические имена функций позволили локализовать остановки в f_1940 и затем в проверке объекта f_1919. Работоспособность интерфейса и функций мода в этом режиме пока не подтверждена. Тестовые блокировки сети сняты после проверки.\n\nДополнительно раскрыта карта внутренних модулей (`data/module-map.json`) и 26 нативных методов интерфейса загрузчика (`data/native-callbacks.json`); их декомпиляция находится в `native/loader-callbacks.c`.\n')
print('module count',len(mods),'native callbacks',len(rows))
