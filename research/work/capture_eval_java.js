import Java from 'frida-java-bridge';
const state={base:null,installed:false,hooks:[]};
function log(v){send({kind:'status',...v});}
function findFusion() {
  const maps = File.readAllText('/proc/self/maps');
  for (const line of maps.split('\n')) {
    const fields = line.trim().split(/\s+/);
    if (fields.length >= 6 && fields[2] === '00000000' && fields[fields.length - 1].endsWith('/libFUSION.so'))
      return ptr('0x' + fields[0].split('-')[0]);
  }
  return null;
}


function branch(a,b){return (0x14000000|((b.sub(a).toInt32()/4)&0x3ffffff))>>>0;}
function patch(address,fn){const p=Process.findRangeByAddress(address).protection;const page=address.and(ptr('0xfffffffffffff000'));Memory.protect(page,4096,'rw-');fn();Memory.protect(page,4096,p);}
function installCapture(reason){
 if(state.installed)return;
 const base=findFusion();if(base===null)return;
 const specs=[['source',0x56b5f0,0xf81f0ffe],['bytecode',0x56d5e0,0xd10703ff],['reader',0x56d940,0xf81b0ffe]];
 for(let i=0;i<specs.length;i++){
   const [kind,rva,expected]=specs[i];const target=base.add(rva);const original=target.readU32();
   if(original!==expected)throw new Error('Unexpected prologue '+kind+' '+original.toString(16));
   const stub=base.add(0x843b00+i*0x80),slot=base.add(0x898300+i*0x80);
   slot.writeByteArray(new Uint8Array(64));
   patch(stub,()=>{
     const words=[0x58000150,0xa9000600,0xa9010e02,0xa9027a04,0x52800031,0xb9003211,0xb9403211,0x35fffff1,original,branch(stub.add(36),target.add(4))];
     words.forEach((w,j)=>stub.add(j*4).writeU32(w));stub.add(40).writePointer(slot);
   });
   patch(target,()=>target.writeU32(branch(target,stub)));
   state.hooks.push({kind,target,original,slot});
 }
 state.base=base;state.installed=true;log({event:'eval_hooks_installed',reason,base:base.toString()});
}
let poll = null;
Java.perform(() => {
  const Runtime = Java.use('java.lang.Runtime');
  for (const method of Runtime.loadLibrary0.overloads) {
    log({event:'java_loader_overload', args: method.argumentTypes.map(t => t.className)});
    method.implementation = function (...args) {
      const result = method.call(this, ...args);
      if (String(args[args.length-1]) === 'FUSION') {
        log({event:'fusion_load_completed'});
        const Gate = Java.use('zap.m');
        const b = Gate.b.overload();
        b.implementation = function () {
          log({event:'native_start_enter'});
          const result = b.call(this);
          log({event:'native_start_return', result});
          installCapture('native start returned');
          return result;
        };
      }
      return result;
    };
  }
  log({event:'java_hooks_ready'});
});

rpc.exports={
 builtins(address){const ctx=ptr(address),rt=ctx.add(24).readPointer(),table=rt.add(0xa8).readPointer(),rows=[];for(let i=0;i<228;i++){const p=table.add(i*8).readPointer();if(p.isNull()||p.and(ptr(1)).toInt32()){rows.push(null);continue;}const bits=p.add(4).readU32(),len=bits&0x3fffffff;if(len>1024)throw new Error('atom bounds');rows.push(bits>>>31?p.add(16).readUtf16String(len):Array.from(new Uint8Array(p.add(16).readByteArray(len))).map(x=>String.fromCharCode(x)).join(''));}return rows;},
 status(){const rows=[];for(const h of state.hooks){if(h.slot.add(48).readU32()!==1)continue;const s=h.slot;const row={kind:h.kind,context:s.readPointer().toString(),data:s.add(8).readPointer().toString(),size:s.add(16).readU64().toNumber(),caller:s.add(40).readPointer().sub(state.base).toString()};if(h.kind==='source'){try{row.filename=s.add(24).readPointer().readUtf8String(256).split('\0')[0];}catch(_){}}if(h.kind==='reader'){const r=s.readPointer();row.data=r.add(8).readPointer().toString();row.size=r.add(24).readPointer().sub(ptr(row.data)).toInt32();row.mask=r.add(72).readPointer().toString();}rows.push(row);}return {installed:state.installed,rows};},
 read(address,size){if(size<1||size>16384)throw new Error('read bounds');return ptr(address).readByteArray(size);},
 release(kind){for(const h of state.hooks)if(h.kind===kind)h.slot.add(48).writeU32(0);},
 restore(){for(const h of state.hooks){patch(h.target,()=>h.target.writeU32(h.original));h.slot.add(48).writeU32(0);}state.installed=false;}
};
log({event:'agent_ready'});
