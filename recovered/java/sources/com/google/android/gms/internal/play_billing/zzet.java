            package com.google.android.gms.internal.play_billing;

            import java.util.logging.Logger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzet {
                private final zzbg zza = new zzbg();
                private final String zzb;
                private volatile Logger zzc;

                public zzet(Class cls) {
/* 15 */            this.zzb = cls.getName();
                }

                public final Logger zza() {
/* 1 */             Logger logger = this.zzc;
/* 3 */             if (logger != null) {
/* 5 */                 return logger;
                    }
                    synchronized (this.zza) {
                        try {
/* 9 */                     Logger logger2 = this.zzc;
/* 11 */                    if (logger2 != null) {
/* 14 */                        return logger2;
                            }
/* 19 */                    Logger logger3 = Logger.getLogger(this.zzb);
/* 23 */                    this.zzc = logger3;
/* 26 */                    return logger3;
                        } catch (Throwable th) {
/* 28 */                    throw th;
                        }
                    }
                }
            }
