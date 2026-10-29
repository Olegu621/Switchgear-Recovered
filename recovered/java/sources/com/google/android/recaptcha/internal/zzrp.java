            package com.google.android.recaptcha.internal;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzrp extends zzsn implements zztt {
                private static final zzrp zzb;
                private static volatile zzua zzd;
                private int zze;
                private boolean zzg;
                private byte zzh = 2;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             zzrp zzrpVar = new zzrp();
/* 6 */             zzb = zzrpVar;
/* 10 */            zzsn.zzI(zzrp.class, zzrpVar);
                }

                private zzrp() {
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 94 */                return Byte.valueOf(this.zzh);
                    }
/* 6 */             if (i2 == 2) {
/* 88 */                return new zzue(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 68 */                return new zzrp();
                    }
/* 12 */            zzrr zzrrVar = null;
/* 13 */            if (i2 == 4) {
/* 62 */                return new zzro(zzrrVar);
                    }
/* 16 */            if (i2 == 5) {
/* 57 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzh = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzua zzuaVar = zzd;
/* 31 */            if (zzuaVar != null) {
/* 56 */                return zzuaVar;
                    }
                    synchronized (zzrp.class) {
                        try {
/* 36 */                    zzsiVar = zzd;
/* 38 */                    if (zzsiVar == null) {
/* 44 */                        zzsiVar = new zzsi(zzb);
/* 47 */                        zzd = zzsiVar;
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 53 */            return zzsiVar;
                }
            }
