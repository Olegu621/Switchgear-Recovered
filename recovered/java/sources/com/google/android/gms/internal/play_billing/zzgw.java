            package com.google.android.gms.internal.play_billing;

            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class zzgw {
                static final zzgw zza = new zzgw(true);
                public static final /* synthetic */ int zzb = 0;
                private static volatile boolean zzc;
                private static volatile zzgw zzd;
                private final Map zze;

                public zzgw() {
/* 9 */             this.zze = new HashMap();
                }

                public static zzgw zza() {
/* 1 */             zzgw zzgwVar = zzd;
/* 3 */             if (zzgwVar != null) {
/* 5 */                 return zzgwVar;
                    }
                    synchronized (zzgw.class) {
                        try {
/* 9 */                     zzgw zzgwVar2 = zzd;
/* 11 */                    if (zzgwVar2 != null) {
/* 14 */                        return zzgwVar2;
                            }
/* 17 */                    int i = zziu.zza;
/* 21 */                    zzgw zzgwVarZzb = zzhe.zzb(zzgw.class);
/* 25 */                    zzd = zzgwVarZzb;
/* 28 */                    return zzgwVarZzb;
                        } catch (Throwable th) {
/* 30 */                    throw th;
                        }
                    }
                }

                public final zzhj zzb(zzim zzimVar, int i) {
/* 12 */            return (zzhj) this.zze.get(new zzgv(zzimVar, i));
                }

/* 11 */        public zzgw(boolean z) {
                    this.zze = Collections.EMPTY_MAP;
                }
            }
