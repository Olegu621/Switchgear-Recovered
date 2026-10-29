// @category Recovery
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.Instruction;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class RecoverFailedGameFunctions extends GhidraScript {
    public void run() throws Exception {
        File dir=new File(getScriptArgs()[0]);
        DecompInterface decompiler=new DecompInterface();decompiler.openProgram(currentProgram);
        int recovered=0,failed=0;
        try(PrintWriter output=new PrintWriter(Files.newBufferedWriter(new File(dir,"libg.retried.pseudo.c").toPath(),StandardCharsets.UTF_8));
            PrintWriter asm=new PrintWriter(Files.newBufferedWriter(new File(dir,"libg.failed-functions.asm").toPath(),StandardCharsets.UTF_8));
            PrintWriter index=new PrintWriter(Files.newBufferedWriter(new File(dir,"libg.retried.functions.tsv").toPath(),StandardCharsets.UTF_8))) {
            output.println("/* Additional machine-derived pseudocode for functions that failed in the main export. */");
            index.println("address\tname\tstatus\tmethod");
            for(String row:Files.readAllLines(new File(dir,"libg.original.functions.tsv").toPath(),StandardCharsets.UTF_8)) {
                String[] fields=row.split("\t");
                if(fields.length<3||!fields[2].equals("failed"))continue;
                Function f=getFunctionAt(toAddr(fields[0]));if(f==null)continue;
                asm.println("\n; "+f.getEntryPoint()+" "+f.getName());
                for(Instruction ins:currentProgram.getListing().getInstructions(f.getBody(),true))asm.println(ins.getAddress()+": "+ins.toString());
                String method="decompile_60_seconds";
                decompiler.setSimplificationStyle("decompile");
                DecompileResults result=decompiler.decompileFunction(f,60,monitor);
                if(!result.decompileCompleted()||result.getDecompiledFunction()==null) {
                    method="normalize_15_seconds_lower_level";
                    decompiler.setSimplificationStyle("normalize");
                    result=decompiler.decompileFunction(f,15,monitor);
                }
                output.println("\n/* "+f.getEntryPoint()+" "+f.getName()+"; mode="+method+" */");
                if(result.decompileCompleted()&&result.getDecompiledFunction()!=null){output.println(result.getDecompiledFunction().getC());recovered++;index.println(f.getEntryPoint()+"\t"+f.getName()+"\tok\t"+method);}
                else{output.println("/* DECOMPILATION FAILED: "+result.getErrorMessage().replace("*/","* /")+" */");failed++;index.println(f.getEntryPoint()+"\t"+f.getName()+"\tfailed\t"+method);}
                output.flush();asm.flush();index.flush();println("RETRY_PROGRESS recovered="+recovered+" failed="+failed+" address="+f.getEntryPoint());
            }
        }
        decompiler.dispose();println("RETRY_COMPLETE recovered="+recovered+" failed="+failed);
    }
}
