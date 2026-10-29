            package com.google.android.recaptcha.internal;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzym extends zzsn implements zztt {
                private static final zzym zzb;
                private static volatile zzua zzd;
                private int zze;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzss zzh = zzsn.zzy();
                private int zzi;
                private int zzj;

                static {
/* 3 */             zzym zzymVar = new zzym();
/* 6 */             zzb = zzymVar;
/* 10 */            zzsn.zzI(zzym.class, zzymVar);
                }

                private zzym() {
                }

                public static zzyk zzf() {
/* 7 */             return (zzyk) zzb.zzq();
                }

                public static /* synthetic */ void zzi(zzym zzymVar, String str) {
/* 1 */             str.getClass();
/* 8 */             zzymVar.zze |= 2;
/* 10 */            zzymVar.zzg = str;
                }

                public static /* synthetic */ void zzj(zzym zzymVar, String str) {
/* 1 */             str.getClass();
/* 8 */             zzymVar.zze |= 1;
/* 10 */            zzymVar.zzf = str;
                }

                public static /* synthetic */ void zzk(zzym zzymVar, int i) {
/* 2 */             zzymVar.zzi = 2;
/* 8 */             zzymVar.zze |= 4;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 94 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 88 */                return zzsn.zzF(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003'\u0004᠌\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzyl.zza, "zzj"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzym();
                    }
/* 12 */            zzyp zzypVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzyk(zzypVar);
                    }
/* 16 */            if (i2 == 5) {
/* 51 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 21 */            zzua zzuaVar = zzd;
/* 23 */            if (zzuaVar != null) {
/* 49 */                return zzuaVar;
                    }
                    synchronized (zzym.class) {
                        try {
/* 28 */                    zzsiVar = zzd;
/* 30 */                    if (zzsiVar == null) {
/* 36 */                        zzsiVar = new zzsi(zzb);
/* 39 */                        zzd = zzsiVar;
                            }
                        } catch (Throwable th) {
/* 48 */                    throw th;
                        }
                    }
/* 46 */            return zzsiVar;
                }
            }
