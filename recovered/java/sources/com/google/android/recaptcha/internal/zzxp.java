            package com.google.android.recaptcha.internal;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzxp extends zzsn implements zztt {
                private static final zzxp zzb;
                private static volatile zzua zzd;
                private zzqm zze;
                private String zzf;
                private long zzg;
                private zzqm zzh;
                private String zzi;
                private String zzj;

                static {
/* 3 */             zzxp zzxpVar = new zzxp();
/* 6 */             zzb = zzxpVar;
/* 10 */            zzsn.zzI(zzxp.class, zzxpVar);
                }

                private zzxp() {
/* 4 */             zzqm zzqmVar = zzqm.zzb;
/* 6 */             this.zze = zzqmVar;
/* 10 */            this.zzf = HttpUrl.FRAGMENT_ENCODE_SET;
/* 12 */            this.zzh = zzqmVar;
/* 14 */            this.zzi = HttpUrl.FRAGMENT_ENCODE_SET;
/* 16 */            this.zzj = HttpUrl.FRAGMENT_ENCODE_SET;
                }

                public static zzxp zzk() {
/* 1 */             return zzb;
                }

                public final long zzf() {
/* 1 */             return this.zzg;
                }

                public final zzqm zzg() {
/* 1 */             return this.zzh;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 92 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 86 */                return zzsn.zzF(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002\u0004\n\u0005Ȉ\u0006Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzxp();
                    }
/* 12 */            zzyc zzycVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzxo(zzycVar);
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
                    synchronized (zzxp.class) {
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

                public final zzqm zzi() {
/* 1 */             return this.zze;
                }

                public final String zzl() {
/* 1 */             return this.zzf;
                }
            }
