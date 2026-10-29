function Get-RecoveryJava {
    param([string]$Java)
    if ($Java) {
        if (-not (Test-Path -LiteralPath $Java)) { throw "Java executable not found: $Java" }
        return (Resolve-Path -LiteralPath $Java).Path
    }
    $runtimeRoot = Join-Path $PSScriptRoot '.runtime'
    $runtimeJava = Get-ChildItem -LiteralPath $runtimeRoot -Filter java.exe -Recurse -ErrorAction SilentlyContinue | Select-Object -First 1
    if (-not $runtimeJava) {
        $runtimeZip = Join-Path $PSScriptRoot 'temurin17-jre.zip'
        if (-not (Test-Path -LiteralPath $runtimeZip)) { throw 'Bundled Java runtime is missing. Supply -Java with the path to Java 17.' }
        Expand-Archive -LiteralPath $runtimeZip -DestinationPath $runtimeRoot
        $runtimeJava = Get-ChildItem -LiteralPath $runtimeRoot -Filter java.exe -Recurse | Select-Object -First 1
    }
    if (-not $runtimeJava) { throw 'Could not extract the bundled Java runtime.' }
    return $runtimeJava.FullName
}
