            package com.google.android.gms.internal.auth;

            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ConcurrentMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzge {
                private static final zzge zza = new zzge();
                private final ConcurrentMap zzc = new ConcurrentHashMap();
                private final zzgi zzb = new zzfo();

                private zzge() {
                }

                public static zzge zza() {
/* 1 */             return zza;
                }

                public final zzgh zzb(Class cls) {
/* 3 */             zzez.zzf(cls, "messageType");
/* 12 */            zzgh zzghVar = (zzgh) this.zzc.get(cls);
/* 14 */            if (zzghVar != null) {
/* 42 */                return zzghVar;
                    }
/* 18 */            zzgh zzghVarZza = this.zzb.zza(cls);
/* 22 */            zzez.zzf(cls, "messageType");
/* 27 */            zzez.zzf(zzghVarZza, "schema");
/* 36 */            zzgh zzghVar2 = (zzgh) this.zzc.putIfAbsent(cls, zzghVarZza);
                    return zzghVar2 == null ? zzghVarZza : zzghVar2;
                }
            }
