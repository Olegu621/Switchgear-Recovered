param([string]$Java, [string]$Output)
$ErrorActionPreference = 'Stop'
. (Join-Path $PSScriptRoot 'runtime.ps1')
$javaBin = Get-RecoveryJava -Java $Java
$root = Split-Path -Parent $PSScriptRoot
if (-not $Output) { $Output = Join-Path $root 'artifacts\Switchgear-69.252-v3.2-rebuilt-unsigned.apk' }
$outputDirectory = Split-Path -Parent ([IO.Path]::GetFullPath($Output))
New-Item -ItemType Directory -Path $outputDirectory -Force | Out-Null
& $javaBin '-Xmx3G' '-jar' (Join-Path $PSScriptRoot 'apktool.jar') 'b' (Join-Path $root 'apktool') '-p' (Join-Path $PSScriptRoot '.framework') '-o' $Output 2>&1 | Tee-Object -FilePath (Join-Path $root 'evidence\rebuild-last.log')
if ($LASTEXITCODE -ne 0) { throw "APK build failed, exit code $LASTEXITCODE" }
Write-Output "Built unsigned APK: $Output"
