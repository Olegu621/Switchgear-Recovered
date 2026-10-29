// @category Recovery
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.program.model.listing.Function;
import java.io.*;

public class InspectFusionFunctions extends GhidraScript {
    public void run() throws Exception {
        long[] targets={0x8bae4,0x49a08,0xbee2c,0x85834,0x88604,0x7ed20};
        for(long target:targets){var address=currentProgram.getImageBase().add(target);if(getFunctionAt(address)==null){disassemble(address);createFunction(address,"Inspect_"+Long.toHexString(target));}}
        DecompInterface decompiler=new DecompInterface();decompiler.openProgram(currentProgram);
        try(PrintWriter out=new PrintWriter(getScriptArgs()[0],"UTF-8")) {
            for(long target:targets){Function f=getFunctionAt(currentProgram.getImageBase().add(target));if(f==null)continue;out.println("\n/* RVA "+Long.toHexString(target)+" */");var r=decompiler.decompileFunction(f,15,monitor);if(r.decompileCompleted()&&r.getDecompiledFunction()!=null)out.println(r.getDecompiledFunction().getC());else out.println("/* FAILED: "+r.getErrorMessage()+" */");}
        }
        decompiler.dispose();println("TARGETED_EXPORT_COMPLETE");
    }
}
