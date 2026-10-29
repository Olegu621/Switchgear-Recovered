            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzww extends zzsn implements zztt {
                private static final zzww zzb;
                private static volatile zzua zzd;
                private int zze;
                private zzrv zzf;
                private zzut zzg;
                private zzrv zzh;
                private zzut zzi;

                static {
/* 3 */             zzww zzwwVar = new zzww();
/* 6 */             zzb = zzwwVar;
/* 10 */            zzsn.zzI(zzww.class, zzwwVar);
                }

                private zzww() {
                }

                public static zzwu zzf() {
/* 7 */             return (zzwu) zzb.zzq();
                }

                public static /* synthetic */ void zzi(zzww zzwwVar, zzut zzutVar) {
/* 1 */             zzutVar.getClass();
/* 4 */             zzwwVar.zzi = zzutVar;
/* 10 */            zzwwVar.zze |= 8;
                }

                public static /* synthetic */ void zzj(zzww zzwwVar, zzrv zzrvVar) {
/* 1 */             zzrvVar.getClass();
/* 4 */             zzwwVar.zzh = zzrvVar;
/* 10 */            zzwwVar.zze |= 4;
                }

                public static /* synthetic */ void zzk(zzww zzwwVar, zzut zzutVar) {
/* 1 */             zzutVar.getClass();
/* 4 */             zzwwVar.zzg = zzutVar;
/* 10 */            zzwwVar.zze |= 2;
                }

                public static /* synthetic */ void zzl(zzww zzwwVar, zzrv zzrvVar) {
/* 1 */             zzrvVar.getClass();
/* 4 */             zzwwVar.zzf = zzrvVar;
/* 10 */            zzwwVar.zze |= 1;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 89 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 83 */                return zzsn.zzF(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzww();
                    }
/* 12 */            zzwv zzwvVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzwu(zzwvVar);
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
                    synchronized (zzww.class) {
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
