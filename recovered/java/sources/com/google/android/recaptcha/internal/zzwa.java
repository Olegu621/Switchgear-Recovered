            package com.google.android.recaptcha.internal;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzwa extends zzsn implements zztt {
                private static final zzwa zzb;
                private static volatile zzua zzd;
                private int zzg;
                private int zzj;
                private int zzk;
                private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzi = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             zzwa zzwaVar = new zzwa();
/* 6 */             zzb = zzwaVar;
/* 10 */            zzsn.zzI(zzwa.class, zzwaVar);
                }

                private zzwa() {
                }

                public static /* synthetic */ void zzO(zzwa zzwaVar, String str) {
/* 1 */             str.getClass();
/* 4 */             zzwaVar.zze = str;
                }

                public static zzvy zzg() {
/* 7 */             return (zzvy) zzb.zzq();
                }

                public static zzwa zzj() {
/* 1 */             return zzb;
                }

                public final int zzf() {
/* 1 */             return this.zzg;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 94 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 88 */                return zzsn.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0004", new Object[]{"zze", "zzg", "zzi", "zzj", "zzf", "zzh", "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzwa();
                    }
/* 12 */            zzvz zzvzVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzvy(zzvzVar);
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
                    synchronized (zzwa.class) {
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

                public final String zzk() {
/* 1 */             return this.zze;
                }
            }
