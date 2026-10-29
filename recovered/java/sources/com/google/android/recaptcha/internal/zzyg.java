            package com.google.android.recaptcha.internal;

            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzyg extends zzsn implements zztt {
                private static final zzyg zzb;
                private static volatile zzua zzd;
                private int zze;
                private long zzg;
                private int zzh;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzsu zzi = zzsn.zzB();
                private zzqm zzj = zzqm.zzb;
                private String zzk = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzl = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             zzyg zzygVar = new zzyg();
/* 6 */             zzb = zzygVar;
/* 10 */            zzsn.zzI(zzyg.class, zzygVar);
                }

                private zzyg() {
                }

                public static zzyg zzi() {
/* 1 */             return zzb;
                }

                public final zzqm zzf() {
/* 1 */             return this.zzj;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 98 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 92 */                return zzsn.zzF(zzb, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0004ဌ\u0002\u0005\u001b\u0006ည\u0003\u0007ለ\u0004\bለ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzyi.class, "zzj", "zzk", "zzl"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzyg();
                    }
/* 12 */            zzyj zzyjVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzyf(zzyjVar);
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
                    synchronized (zzyg.class) {
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

                public final String zzj() {
/* 1 */             return this.zzf;
                }

                public final List zzk() {
/* 1 */             return this.zzi;
                }
            }
