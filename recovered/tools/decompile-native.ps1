param(
    [Parameter(Mandatory = $true)][string]$GhidraHome,
    [Parameter(Mandatory = $true)][string]$JavaHome
)
$ErrorActionPreference = 'Stop'
$root = Split-Path -Parent $PSScriptRoot
$launcher = Join-Path $GhidraHome 'support\analyzeHeadless.bat'
if (-not (Test-Path -LiteralPath $launcher)) { throw "Ghidra launcher not found: $launcher" }
if (-not (Test-Path -LiteralPath (Join-Path $JavaHome 'bin\java.exe'))) { throw 'JavaHome must point to a compatible JDK; Ghidra 12.2 was run with JDK 25.' }
$oldJavaHome = $env:JAVA_HOME
$oldJavaOptions = $env:JAVA_TOOL_OPTIONS
try {
    $env:JAVA_HOME = $JavaHome
    $projectRoot = Join-Path $PSScriptRoot '.ghidra-projects'
    $outputRoot = Join-Path $root 'native-pseudocode-rerun'
    New-Item -ItemType Directory -Path $projectRoot, $outputRoot -Force | Out-Null
    foreach ($library in @('libFUSION.unpacked.so', 'libFUSION.embedded.so')) {
        $name = $library.Replace('.', '-')
        $settings = Join-Path $PSScriptRoot ".ghidra-settings-$name"
        $cache = Join-Path $PSScriptRoot ".ghidra-cache-$name"
        $temporary = Join-Path $PSScriptRoot ".ghidra-temp-$name"
        New-Item -ItemType Directory -Path $settings, $cache, $temporary -Force | Out-Null
        $env:JAVA_TOOL_OPTIONS = "-Dapplication.settingsdir=`"$settings`" -Dapplication.cachedir=`"$cache`" -Dapplication.tempdir=`"$temporary`" -Djava.io.tmpdir=`"$temporary`""
        & $launcher $projectRoot $name '-import' (Join-Path $root "native-analysis\$library") '-overwrite' '-analysisTimeoutPerFile' '150' '-max-cpu' '2' '-scriptPath' $PSScriptRoot '-postScript' 'ExportRecoveredC.java' $outputRoot 2>&1 | Tee-Object -FilePath (Join-Path $root "evidence\ghidra-rerun-$name.log")
        if ($LASTEXITCODE -ne 0) { throw "Ghidra failed on $library; see its log." }
    }
} finally {
    $env:JAVA_HOME = $oldJavaHome
    $env:JAVA_TOOL_OPTIONS = $oldJavaOptions
}
