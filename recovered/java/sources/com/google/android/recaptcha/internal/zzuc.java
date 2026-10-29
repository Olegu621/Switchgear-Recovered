            package com.google.android.recaptcha.internal;

            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ConcurrentMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzuc {
                public static final /* synthetic */ int zza = 0;
                private static final zzuc zzb = new zzuc();
                private final ConcurrentMap zzd = new ConcurrentHashMap();
                private final zzuh zzc = new zztk();

                private zzuc() {
                }

                public static zzuc zza() {
/* 1 */             return zzb;
                }

                public final zzug zzb(Class cls) {
/* 3 */             zzsv.zzc(cls, "messageType");
/* 6 */             ConcurrentMap concurrentMap = this.zzd;
/* 12 */            zzug zzugVar = (zzug) concurrentMap.get(cls);
/* 14 */            if (zzugVar != null) {
/* 35 */                return zzugVar;
                    }
/* 18 */            zzug zzugVarZza = this.zzc.zza(cls);
/* 22 */            zzsv.zzc(cls, "messageType");
/* 29 */            zzug zzugVar2 = (zzug) concurrentMap.putIfAbsent(cls, zzugVarZza);
                    return zzugVar2 != null ? zzugVar2 : zzugVarZza;
                }
            }
