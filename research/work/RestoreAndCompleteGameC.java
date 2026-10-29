// @category Recovery
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileResults;
import ghidra.program.model.listing.Function;
import ghidra.program.model.address.Address;
import ghidra.program.model.mem.MemoryBlock;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.util.regex.*;

public class RestoreAndCompleteGameC extends GhidraScript {
    public void run() throws Exception {
        File dir=new File(getScriptArgs()[0]);dir.mkdirs();
        File previous=new File(dir,"libg.runtime.so.pseudo.c");
        String source=Files.readString(previous.toPath(),StandardCharsets.UTF_8);
        Map<Long,String> cached=new HashMap<>();
        Map<Long,String> status=new HashMap<>();
        for(String row:Files.readAllLines(new File(dir,"libg.runtime.so.functions.tsv").toPath(),StandardCharsets.UTF_8)) {
            String[] f=row.split("\t");
            if(f.length>=3&&!f[0].equals("address"))status.put(Long.parseUnsignedLong(f[0],16),f[2]);
        }
        Matcher matcher=Pattern.compile("(?m)^/\\* ([0-9a-fA-F]{8,16}) ([^\\r\\n]*) \\*/\\r?$").matcher(source);
        List<Long> addresses=new ArrayList<>();List<Integer> starts=new ArrayList<>();
        while(matcher.find()){addresses.add(Long.parseUnsignedLong(matcher.group(1),16));starts.add(matcher.start());}
        for(int i=0;i<starts.size();i++)cached.put(addresses.get(i),source.substring(starts.get(i),i+1<starts.size()?starts.get(i+1):source.length()));
        source=null;
        Set<Long> dirty=new HashSet<>();int restored=0;
        for(String line:Files.readAllLines(new File(dir.getParentFile(),"evidence/restore-original-libg.txt").toPath(),StandardCharsets.US_ASCII)) {
            if(line.trim().isEmpty())continue;
            String[] fields=line.trim().split(" ");
            Address address=currentProgram.getImageBase().add(Long.parseUnsignedLong(fields[0],16));
            byte[] bytes=HexFormat.of().parseHex(fields[1]);
            Function containing=getFunctionContaining(address);
            if(containing!=null)dirty.add(containing.getEntryPoint().getOffset());
            Function function=getFunctionAt(address);
            String oldName=function==null?null:function.getName();
            boolean instructions=currentProgram.getListing().getInstructionContaining(address)!=null;
            if(function!=null)removeFunctionAt(address);
            if(instructions)clearListing(address,address.add(bytes.length-1));
            currentProgram.getMemory().setBytes(address,bytes);
            if(instructions){disassemble(address);if(function!=null)createFunction(address,oldName);}
            containing=getFunctionContaining(address);
            if(containing!=null)dirty.add(containing.getEntryPoint().getOffset());
            restored+=bytes.length;
        }
        println("ORIGINAL_INSTRUCTIONS_RESTORED bytes="+restored+" dirty_functions="+dirty.size());
        analyzeChanges(currentProgram);
        DecompInterface decompiler=new DecompInterface();decompiler.openProgram(currentProgram);
        int exported=0,failed=0,reused=0,skipped=0,external=0;
        long start=System.currentTimeMillis();
        try(PrintWriter output=new PrintWriter(Files.newBufferedWriter(new File(dir,"libg.original.pseudo.c").toPath(),StandardCharsets.UTF_8));
            PrintWriter index=new PrintWriter(Files.newBufferedWriter(new File(dir,"libg.original.functions.tsv").toPath(),StandardCharsets.UTF_8))) {
            output.println("/* Machine-derived Ghidra pseudocode; not original or verified-compilable C/C++. */");
            output.println("/* Observed runtime patches restored from original APK. Unchanged successful functions reuse the first export. */");
            output.println("/* Image base 0x"+currentProgram.getImageBase()+"; subtract it to obtain original ELF RVAs. */");
            index.println("address\tname\tstatus\tbody_bytes\tmethod");
            for(Function function:currentProgram.getFunctionManager().getFunctions(true)) {
                MemoryBlock block=currentProgram.getMemory().getBlock(function.getEntryPoint());
                if(function.isExternal()||block==null||block.getName().equals("EXTERNAL")){external++;continue;}
                long key=function.getEntryPoint().getOffset();
                if(cached.containsKey(key)&&"ok".equals(status.get(key))&&!dirty.contains(key)) {
                    output.print(cached.get(key));exported++;reused++;
                    index.println(function.getEntryPoint()+"\t"+function.getName()+"\tok\t"+function.getBody().getNumAddresses()+"\tcached_unchanged");
                    continue;
                }
                if(monitor.isCancelled()||System.currentTimeMillis()-start>900000){
                    skipped++;index.println(function.getEntryPoint()+"\t"+function.getName()+"\tskipped\t"+function.getBody().getNumAddresses()+"\ttime_budget");continue;
                }
                output.println("\n/* "+function.getEntryPoint()+" "+function.getName()+" */");
                DecompileResults result=decompiler.decompileFunction(function,15,monitor);
                if(result.decompileCompleted()&&result.getDecompiledFunction()!=null) {
                    output.println(result.getDecompiledFunction().getC());exported++;
                    index.println(function.getEntryPoint()+"\t"+function.getName()+"\tok\t"+function.getBody().getNumAddresses()+"\tdecompiled");
                }else {
                    output.println("/* DECOMPILATION FAILED: "+result.getErrorMessage().replace("*/","* /")+" */");failed++;
                    index.println(function.getEntryPoint()+"\t"+function.getName()+"\tfailed\t"+function.getBody().getNumAddresses()+"\tdecompiled");
                }
                output.flush();index.flush();
                println("GAME_RECOVERY_PROGRESS exported="+exported+" reused="+reused+" failed="+failed+" current="+function.getEntryPoint());
            }
        }
        println("GAME_RECOVERY_COMPLETE total_functions="+currentProgram.getFunctionManager().getFunctionCount()+" exported="+exported+" reused="+reused+" failed="+failed+" skipped="+skipped+" external_excluded="+external);
        decompiler.dispose();
    }
}
