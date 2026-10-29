// @category Recovery
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.program.model.listing.Function;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import ghidra.program.model.address.Address;
import ghidra.program.model.listing.Instruction;

public class ExportAllRecoveredC extends GhidraScript {
    public void run() throws Exception {
        File dir = new File(getScriptArgs()[0]); dir.mkdirs();
        if(currentProgram.getName().equals("libg.runtime.so")) {
            File restore = new File(dir.getParentFile(), "evidence/restore-original-libg.txt");
            int restored=0;
            for(String line:Files.readAllLines(restore.toPath(),StandardCharsets.US_ASCII)) {
                if(line.trim().isEmpty())continue;
                String[] fields=line.trim().split(" ");
                Address address=currentProgram.getImageBase().add(Long.parseUnsignedLong(fields[0],16));
                byte[] bytes=java.util.HexFormat.of().parseHex(fields[1]);
                Function function=currentProgram.getFunctionManager().getFunctionAt(address);
                String oldName=function==null?null:function.getName();
                boolean instructions=currentProgram.getListing().getInstructionContaining(address)!=null;
                if(function!=null)removeFunctionAt(address);
                if(instructions)clearListing(address,address.add(bytes.length-1));
                currentProgram.getMemory().setBytes(address,bytes);
                if(instructions){disassemble(address);if(function!=null)createFunction(address,oldName);}
                restored+=bytes.length;
            }
            println("ORIGINAL_INSTRUCTIONS_RESTORED bytes="+restored);
            analyzeChanges(currentProgram);
        }
        DecompInterface decompiler = new DecompInterface(); decompiler.openProgram(currentProgram);
        int exported=0, failed=0, skipped=0;
        long start=System.currentTimeMillis();
        try(PrintWriter output=new PrintWriter(new OutputStreamWriter(new FileOutputStream(new File(dir,currentProgram.getName()+".pseudo.c")),StandardCharsets.UTF_8));
            PrintWriter index=new PrintWriter(new OutputStreamWriter(new FileOutputStream(new File(dir,currentProgram.getName()+".functions.tsv")),StandardCharsets.UTF_8))) {
            output.println("/* Machine-derived Ghidra pseudocode, not original or verified-compilable C/C++. */");
            output.println("/* Runtime hook patches were restored from the original APK before decompilation. */");
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
