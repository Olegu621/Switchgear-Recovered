            package com.google.android.gms.internal.measurement;

            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ConcurrentMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zznt {
                public static final /* synthetic */ int zza = 0;
                private static final zznt zzb = new zznt();
                private final ConcurrentMap zzd = new ConcurrentHashMap();
                private final zznx zzc = new zznc();

                private zznt() {
                }

                public static zznt zza() {
/* 1 */             return zzb;
                }

                public final zznw zzb(Class cls) {
/* 3 */             zzmo.zza(cls, "messageType");
/* 6 */             ConcurrentMap concurrentMap = this.zzd;
/* 12 */            zznw zznwVar = (zznw) concurrentMap.get(cls);
/* 14 */            if (zznwVar != null) {
/* 35 */                return zznwVar;
                    }
/* 18 */            zznw zznwVarZza = this.zzc.zza(cls);
/* 22 */            zzmo.zza(cls, "messageType");
/* 29 */            zznw zznwVar2 = (zznw) concurrentMap.putIfAbsent(cls, zznwVarZza);
                    return zznwVar2 != null ? zznwVar2 : zznwVarZza;
                }
            }
