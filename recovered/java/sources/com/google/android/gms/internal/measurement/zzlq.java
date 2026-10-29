            package com.google.android.gms.internal.measurement;

            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class zzlq {
                static final zzlq zza = new zzlq(true);
                public static final /* synthetic */ int zzb = 0;
                private static volatile boolean zzc;
                private static volatile zzlq zzd;
                private final Map zze;

                public zzlq() {
/* 9 */             this.zze = new HashMap();
                }

                public static zzlq zza() {
/* 1 */             zzlq zzlqVar = zzd;
/* 3 */             if (zzlqVar != null) {
/* 5 */                 return zzlqVar;
                    }
                    synchronized (zzlq.class) {
                        try {
/* 9 */                     zzlq zzlqVar2 = zzd;
/* 11 */                    if (zzlqVar2 != null) {
/* 14 */                        return zzlqVar2;
                            }
/* 17 */                    int i = zznt.zza;
/* 21 */                    zzlq zzlqVarZzb = zzly.zzb(zzlq.class);
/* 25 */                    zzd = zzlqVarZzb;
/* 28 */                    return zzlqVarZzb;
                        } catch (Throwable th) {
/* 30 */                    throw th;
                        }
                    }
                }

                public final zzmd zzb(zznl zznlVar, int i) {
/* 12 */            return (zzmd) this.zze.get(new zzlp(zznlVar, i));
                }

/* 11 */        public zzlq(boolean z) {
                    this.zze = Collections.EMPTY_MAP;
                }
            }
