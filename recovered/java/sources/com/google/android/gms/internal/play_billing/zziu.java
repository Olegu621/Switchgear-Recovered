            package com.google.android.gms.internal.play_billing;

            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ConcurrentMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zziu {
                public static final /* synthetic */ int zza = 0;
                private static final zziu zzb = new zziu();
                private final ConcurrentMap zzd = new ConcurrentHashMap();
                private final zziy zzc = new zzie();

                private zziu() {
                }

                public static zziu zza() {
/* 1 */             return zzb;
                }

                public final zzix zzb(Class cls) {
/* 3 */             zzhp.zzc(cls, "messageType");
/* 12 */            zzix zzixVar = (zzix) this.zzd.get(cls);
/* 14 */            if (zzixVar != null) {
/* 37 */                return zzixVar;
                    }
/* 18 */            zzix zzixVarZza = this.zzc.zza(cls);
/* 22 */            zzhp.zzc(cls, "messageType");
/* 31 */            zzix zzixVar2 = (zzix) this.zzd.putIfAbsent(cls, zzixVarZza);
                    return zzixVar2 == null ? zzixVarZza : zzixVar2;
                }
            }
