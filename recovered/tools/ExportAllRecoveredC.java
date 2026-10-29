// @category Recovery
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.program.model.listing.Function;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class ExportAllRecoveredC extends GhidraScript {
    public void run() throws Exception {
        File dir = new File(getScriptArgs()[0]); dir.mkdirs();
        DecompInterface decompiler = new DecompInterface(); decompiler.openProgram(currentProgram);
        int exported=0, failed=0, skipped=0;
        long start=System.currentTimeMillis();
        try(PrintWriter output=new PrintWriter(new OutputStreamWriter(new FileOutputStream(new File(dir,currentProgram.getName()+".pseudo.c")),StandardCharsets.UTF_8));
            PrintWriter index=new PrintWriter(new OutputStreamWriter(new FileOutputStream(new File(dir,currentProgram.getName()+".functions.tsv")),StandardCharsets.UTF_8))) {
            output.println("/* Machine-derived Ghidra pseudocode, not original or verified-compilable C/C++. */");
            index.println("address\tname\tstatus\tbody_bytes");
            for(Function function:currentProgram.getFunctionManager().getFunctions(true)) {
                if(function.isExternal())continue;
                if(monitor.isCancelled()||System.currentTimeMillis()-start>900000){skipped++;continue;}
                output.println("\n/* "+function.getEntryPoint()+" "+function.getName()+" */");
                DecompileResults result=decompiler.decompileFunction(function,3,monitor);
                if(result.decompileCompleted()&&result.getDecompiledFunction()!=null){
                    output.println(result.getDecompiledFunction().getC());exported++;
                    index.println(function.getEntryPoint()+"\t"+function.getName()+"\tok\t"+function.getBody().getNumAddresses());
                }else{
                    output.println("/* DECOMPILATION FAILED: "+result.getErrorMessage().replace("*/","* /")+" */");failed++;
                    index.println(function.getEntryPoint()+"\t"+function.getName()+"\tfailed\t"+function.getBody().getNumAddresses());
                }
                if((exported+failed)%500==0){output.flush();index.flush();println("RECOVERY_PROGRESS exported="+exported+" failed="+failed);}
            }
        }
        println("RECOVERY_C_EXPORT program="+currentProgram.getName()+" total_functions="+currentProgram.getFunctionManager().getFunctionCount()+" exported="+exported+" failed="+failed+" skipped="+skipped);
        decompiler.dispose();
    }
}
