            package com.google.android.recaptcha.internal;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzrm extends zzsn implements zztt {
                private static final zzrm zzb;
                private static volatile zzua zzd;
                private int zze;
                private int zzf;
                private int zzg;
                private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
                private int zzi;

                static {
/* 3 */             zzrm zzrmVar = new zzrm();
/* 6 */             zzb = zzrmVar;
/* 10 */            zzsn.zzI(zzrm.class, zzrmVar);
                }

                private zzrm() {
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 97 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 70 */                zzqy zzqyVar = zzqy.EDITION_UNKNOWN;
/* 72 */                zzsr zzsrVar = zzqx.zza;
/* 92 */                return new zzue(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"zze", "zzf", zzsrVar, "zzg", zzsrVar, "zzh", "zzi", zzsrVar});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzrm();
                    }
/* 12 */            zzrr zzrrVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzrl(zzrrVar);
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
                    synchronized (zzrm.class) {
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
