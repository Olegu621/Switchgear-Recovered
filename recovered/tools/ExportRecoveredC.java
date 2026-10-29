// Export machine-derived pseudocode, not original or compilable C sources.
// @category Recovery
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.program.model.listing.Function;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class ExportRecoveredC extends GhidraScript {
    public void run() throws Exception {
        String[] args = getScriptArgs();
        File dir = new File(args[0]);
        dir.mkdirs();
        DecompInterface decompiler = new DecompInterface();
        decompiler.openProgram(currentProgram);
        int exported = 0, failed = 0;
        long start = System.currentTimeMillis();
        try (PrintWriter output = new PrintWriter(new OutputStreamWriter(new FileOutputStream(new File(dir, currentProgram.getName() + ".pseudo.c")), StandardCharsets.UTF_8));
             PrintWriter index = new PrintWriter(new OutputStreamWriter(new FileOutputStream(new File(dir, currentProgram.getName() + ".functions.tsv")), StandardCharsets.UTF_8))) {
            output.println("/* Ghidra pseudocode reconstructed from machine code. */");
            output.println("/* Not original source. Types, function boundaries and control flow can be wrong. */");
            index.println("address\tname\tstatus");
            for (Function function : currentProgram.getFunctionManager().getFunctions(true)) {
                if (monitor.isCancelled() || System.currentTimeMillis() - start > 180000) break;
                if (function.isExternal()) continue;
                DecompileResults result = decompiler.decompileFunction(function, 3, monitor);
                output.println("\n/* " + function.getEntryPoint() + " " + function.getName() + " */");
                if (result.decompileCompleted() && result.getDecompiledFunction() != null) {
                    output.println(result.getDecompiledFunction().getC());
                    exported++;
                    index.println(function.getEntryPoint() + "\t" + function.getName() + "\tok");
                } else {
                    output.println("/* DECOMPILATION FAILED: " + result.getErrorMessage().replace("*/", "* /") + " */");
                    failed++;
                    index.println(function.getEntryPoint() + "\t" + function.getName() + "\tfailed");
                }
            }
        }
        println("RECOVERY_C_EXPORT program=" + currentProgram.getName() + " total_functions=" + currentProgram.getFunctionManager().getFunctionCount() + " exported=" + exported + " failed=" + failed);
        decompiler.dispose();
    }
}
