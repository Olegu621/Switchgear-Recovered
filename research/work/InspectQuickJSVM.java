// @category Recovery
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.program.model.listing.Function;
import java.io.*;

public class InspectQuickJSVM extends GhidraScript {
    public void run() throws Exception {
        long[] targets={0x58de80,0x5fa860};
        for(long target:targets){var address=currentProgram.getImageBase().add(target);if(getFunctionAt(address)==null){disassemble(address);createFunction(address,"Inspect_"+Long.toHexString(target));}}
        DecompInterface decompiler=new DecompInterface();decompiler.openProgram(currentProgram);
        try(PrintWriter out=new PrintWriter(getScriptArgs()[0],"UTF-8")) {
            for(long target:targets){Function f=getFunctionAt(currentProgram.getImageBase().add(target));if(f==null)continue;out.println("\n/* RVA "+Long.toHexString(target)+" */");var r=decompiler.decompileFunction(f,120,monitor);if(r.decompileCompleted()&&r.getDecompiledFunction()!=null)out.println(r.getDecompiledFunction().getC());else out.println("/* FAILED: "+r.getErrorMessage()+" */");}
        }
        decompiler.dispose();println("TARGETED_EXPORT_COMPLETE");
    }
}

