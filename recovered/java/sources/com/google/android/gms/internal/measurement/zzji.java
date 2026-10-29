            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzji {
                private static zzjh zza;

                public static synchronized void zza(zzjh zzjhVar) {
/* 6 */             if (zza != null) {
/* 21 */                throw new IllegalStateException("init() already called");
                    }
/* 8 */             zza = zzjhVar;
                }

                public static synchronized zzjh zzb() {
                    try {
/* 6 */                 if (zza == null) {
/* 13 */                    zza(new zzjl());
                        }
                    } catch (Throwable th) {
/* 24 */                throw th;
                    }
/* 19 */            return zza;
                }
            }
