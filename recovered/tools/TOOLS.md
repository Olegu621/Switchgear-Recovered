# Инструменты восстановления

- Apktool 2.9.3 — `apktool.jar`, использован для smali, ресурсов и проверенной пересборки. Проект: https://github.com/iBotPeaches/Apktool
- JADX 1.5.6 — `jadx-1.5.6-all.jar`, читаемая Java-декомпиляция. Проект: https://github.com/skylot/jadx
- Eclipse Temurin JRE 17.0.20.1+1, Windows x64 — `temurin17-jre.zip`, переносимая среда Java с исходными уведомлениями о лицензиях в дистрибутиве. Источник: https://api.adoptium.net/v3/binary/latest/17/ga/windows/x64/jre/hotspot/normal/eclipse?project=jdk
- Python 3.9, pyelftools, Capstone, LIEF, Unicorn — анализ ELF/DEX, инструкции и статическая распаковка. Версии пакетов зафиксированы в `requirements.txt`.
- Ghidra 12.2 PUBLIC — нативная декомпиляция FUSION и игры. `ExportRecoveredC.java` / `decompile-native.ps1` относятся к двум вариантам FUSION. `ExportAllRecoveredC.java` выполняет первый экспорт `libg.runtime.so`; `RestoreAndCompleteGameC.java` использует его индекс и текст, восстанавливает байты из `evidence/restore-original-libg.txt`, повторно анализирует изменения и дополняет экспорт. Во втором проходе следует открыть тот же сохранённый проект Ghidra с `-process libg.runtime.so -noanalysis`. Сценарий сам запускает анализ изменений. Дистрибутив Ghidra и JDK 25 в архив не включены. Источник использованной версии: https://github.com/NationalSecurityAgency/ghidra/releases/tag/Ghidra_12.2_build

`RecoverFailedGameFunctions.java` применяется к тому же проекту после второго прохода: читает ошибки из `libg.original.functions.tsv`, увеличивает время до 60 секунд на функцию и при необходимости пробует низкоуровневый режим `normalize` с лимитом 15 секунд. Этот режим может давать менее привычный текст с явными регистрами и операциями. Инструкции всех повторно проверенных функций экспортируются отдельно.

## Снимок кода в BlueStacks

`capture_runtime_code.py --adb ПУТЬ --serial АДРЕС --port ПОРТ --activation-confirmed` извлекает только исполняемые ELF-сегменты FUSION и `libg` из уже запущенного приложения через имеющийся в BlueStacks `su`. Последний флаг означает, что активация отдельно подтверждена наблюдением; сценарий не активирует приложение. Затем `analyze_live_patches.py` составляет сравнение с оригиналом, а `capture_hook_code.py` с теми же параметрами подключения сохраняет только известные инструкции переходников. После перезапуска процесса снимок и перечень правок нужно получать заново.

`memscan.c` — вспомогательный поиск сигнатур в явно заданных диапазонах памяти, без вывода содержимого. Он предназначен для Linux x86_64 в использованном эмуляторе, а не для ARM-телефона. При наличии LLVM собирается так:

```powershell
clang --target=x86_64-linux-android30 -fuse-ld=lld -nostdlib -static -fno-stack-protector -fno-builtin -fno-pic -O2 -Wl,-e,_start memscan.c -o memscan
```

В Android запуск: `memscan PID ranges.txt` с правом чтения `/proc/PID/mem`. В `ranges.txt` каждая строка содержит начало и конец диапазона в шестнадцатеричном виде. Во время восстановления выбраны доступные для чтения анонимные области, области аллокатора и Dalvik; полный список карт памяти и приватные файлы приложения в архив не включены. Это ограниченный поиск сигнатур, не универсальный распаковщик.

Вспомогательные программы не извлекают исходный ключ подписи APK и не заменяют утраченный исходный репозиторий. Оригинальные библиотеки в `apktool/lib/` сохраняются без изменений.
