            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzrv extends zzsn implements zztt {
                private static final zzrv zzb;
                private static volatile zzua zzd;
                private long zze;
                private int zzf;

                static {
/* 3 */             zzrv zzrvVar = new zzrv();
/* 6 */             zzb = zzrvVar;
/* 10 */            zzsn.zzI(zzrv.class, zzrvVar);
                }

                private zzrv() {
                }

                public static zzrt zzi() {
/* 7 */             return (zzrt) zzb.zzq();
                }

                public final int zzf() {
/* 1 */             return this.zzf;
                }

                public final long zzg() {
/* 1 */             return this.zze;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 84 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 79 */                return new zzue(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzrv();
                    }
/* 12 */            zzru zzruVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzrt(zzruVar);
                    }
/* 16 */            if (i2 == 5) {
/* 50 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 21 */            zzua zzuaVar = zzd;
/* 23 */            if (zzuaVar != null) {
/* 48 */                return zzuaVar;
                    }
                    synchronized (zzrv.class) {
                        try {
/* 28 */                    zzsiVar = zzd;
/* 30 */                    if (zzsiVar == null) {
/* 36 */                        zzsiVar = new zzsi(zzb);
/* 39 */                        zzd = zzsiVar;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return zzsiVar;
                }
            }
