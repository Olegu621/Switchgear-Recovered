param([string]$Java, [string]$Output, [switch]$Simple)
$ErrorActionPreference = 'Stop'
. (Join-Path $PSScriptRoot 'runtime.ps1')
$javaBin = Get-RecoveryJava -Java $Java
$root = Split-Path -Parent $PSScriptRoot
if (-not $Output) { $Output = Join-Path $root $(if ($Simple) { 'java-simple' } else { 'java-rerun' }) }
$dexFiles = @(Get-ChildItem -LiteralPath (Join-Path $root 'bytecode') -Filter '*.dex' | Sort-Object Name | Select-Object -ExpandProperty FullName)
$jadxArguments = @('-Xmx4G', '-cp', (Join-Path $PSScriptRoot 'jadx-1.5.6-all.jar'), 'jadx.cli.JadxCLI', '--no-res', '--show-bad-code', '--add-debug-lines', '--deobf', '-j', '4', '-d', $Output)
if ($Simple) { $jadxArguments += @('--decompilation-mode', 'simple') }
& $javaBin @jadxArguments @dexFiles 2>&1 | Tee-Object -FilePath (Join-Path $root 'evidence\decompile-last.log')
$jadxExitCode = $LASTEXITCODE
if ($jadxExitCode -ne 0) { Write-Warning "JADX finished with exit code $jadxExitCode. Inspect the log and use smali for incomplete methods." }
Write-Output "Decompilation output: $Output"
