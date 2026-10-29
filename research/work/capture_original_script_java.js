import Java from 'frida-java-bridge';
// Capture only script source/bytecode at the observed FUSION context cleanup.
const state = { base: null, slots: null, stub: null, pageProtection: null, originals: [], installed: false };
const hooked = new Set();

function log(value) { send({ kind: 'status', ...value }); }

function findFusion() {
  const maps = File.readAllText('/proc/self/maps');
  for (const line of maps.split('\n')) {
    const fields = line.trim().split(/\s+/);
    if (fields.length >= 6 && fields[2] === '00000000' && fields[fields.length - 1].endsWith('/libFUSION.so'))
      return ptr('0x' + fields[0].split('-')[0]);
  }
  return null;
}

function installCapture(reason) {
  if (state.installed) return;
  const base = findFusion();
  if (base === null) return;
  const call = base.add(0x46c59c);
  const expected = (0x94000000 | (((0x69a554 - 0x46c59c) / 4) & 0x03ffffff)) >>> 0;
  if (call.readU32() !== expected) {
    return;
  }
  const slots = base.add(0x898300); // Verified padding after the final PT_LOAD p_memsz.
  slots.writeByteArray(new Uint8Array(136));
  // Use verified zero padding inside the ARM64 ELF. Host-executable allocations
  // are interpreted as x86 code by this version of Houdini.
  const stub = base.add(0x843f00);
  const difference = stub.sub(call).toInt32();
  if (difference % 4 !== 0 || difference < -0x08000000 || difference >= 0x08000000)
    throw new Error('No reachable ARM64 capture trampoline');
  // ARM64: preserve x19 (script object) in a 16-entry ring; return as g_free would.
  // Instruction words were assembled locally using LLVM.
  const words = [0x58000150, 0xf9400211, 0x92400e31, 0x8b110e11,
                 0xf9000633, 0xf9400211, 0x91000631, 0xf9000211,
                 0xd65f03c0, 0xd503201f];
  const stubPage = stub.and(ptr('0xfffffffffffff000'));
  const stubProtection = Process.findRangeByAddress(stub).protection;
  Memory.protect(stubPage, Process.pageSize, 'rw-');
  for (let i = 0; i < words.length; i++) stub.add(i * 4).writeU32(words[i]);
  stub.add(40).writePointer(slots);
  Memory.protect(stubPage, Process.pageSize, stubProtection);
  for (const offset of [0x46c59c, 0x46c5a4, 0x46c5b8, 0x46c5c0])
    state.originals.push([offset, base.add(offset).readU32()]);
  state.pageProtection = Process.findRangeByAddress(call).protection;
  Memory.protect(call.and(ptr('0xfffffffffffff000')), 4096, 'rw-');
  call.writeU32((0x94000000 | ((difference / 4) & 0x03ffffff)) >>> 0);
  for (const offset of [0x46c5a4, 0x46c5b8, 0x46c5c0]) base.add(offset).writeU32(0xd503201f);
  Memory.protect(call.and(ptr('0xfffffffffffff000')), 4096, state.pageProtection);
  state.base = base;
  state.slots = slots;
  state.stub = stub;
  state.installed = true;
  log({ event: 'capture_installed', reason, base: base.toString(), slots: slots.toString(), stub: stub.toString() });
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

rpc.exports = {
  status() {

    const result = { installed: state.installed, base: state.base?.toString(), slots: state.slots?.toString(), count: 0, objects: [] };
    if (state.slots === null) return result;
    result.count = state.slots.readU64().toNumber();
    for (let i = 0; i < Math.min(result.count, 16); i++) {
      const object = state.slots.add(8 + i * 8).readPointer();
      if (object.isNull()) continue;
      const row = { object: object.toString() };
      try { row.name = object.add(24).readPointer().readUtf8String(128).split('\0')[0]; } catch (_) {}
      for (const [field, offset] of [['source', 32], ['bytecode', 40]]) {
        try { row[field] = object.add(offset).readPointer().toString(); } catch (_) {}
      }
      result.objects.push(row);
    }
    return result;
  },
  read(address, size) {
    if (size < 1 || size > 32 * 1024 * 1024) throw new Error('Invalid bounded script read');
    return ptr(address).readByteArray(size);
  },
  restore() {
    if (poll !== null) clearInterval(poll);
    if (!state.installed) return;
    const page = state.base.add(0x46c59c).and(ptr('0xfffffffffffff000'));
    Memory.protect(page, 4096, 'rw-');
    for (const [offset, word] of state.originals) state.base.add(offset).writeU32(word);
    Memory.protect(page, 4096, state.pageProtection);
    state.installed = false;
  }
};
log({ event: 'agent_ready', architecture: Process.arch });
