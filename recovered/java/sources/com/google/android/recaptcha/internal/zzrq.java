            package com.google.android.recaptcha.internal;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzrq extends zzsn implements zztt {
                private static final zzrq zzb;
                private static volatile zzua zzd;
                private int zze;
                private long zzh;
                private long zzi;
                private double zzj;
                private byte zzm = 2;
                private zzsu zzf = zzud.zze();
                private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzqm zzk = zzqm.zzb;
                private String zzl = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             zzrq zzrqVar = new zzrq();
/* 6 */             zzb = zzrqVar;
/* 10 */            zzsn.zzI(zzrq.class, zzrqVar);
                }

                private zzrq() {
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 107 */               return Byte.valueOf(this.zzm);
                    }
/* 6 */             if (i2 == 2) {
/* 101 */               return new zzue(zzb, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zze", "zzf", zzrp.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                    }
/* 9 */             if (i2 == 3) {
/* 69 */                return new zzrq();
                    }
/* 12 */            zzrr zzrrVar = null;
/* 13 */            if (i2 == 4) {
/* 63 */                return new zzrn(zzrrVar);
                    }
/* 16 */            if (i2 == 5) {
/* 58 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzm = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzua zzuaVar = zzd;
/* 31 */            if (zzuaVar != null) {
/* 57 */                return zzuaVar;
                    }
                    synchronized (zzrq.class) {
                        try {
/* 36 */                    zzsiVar = zzd;
/* 38 */                    if (zzsiVar == null) {
/* 44 */                        zzsiVar = new zzsi(zzb);
/* 47 */                        zzd = zzsiVar;
                            }
                        } catch (Throwable th) {
/* 56 */                    throw th;
                        }
                    }
/* 54 */            return zzsiVar;
                }
            }
