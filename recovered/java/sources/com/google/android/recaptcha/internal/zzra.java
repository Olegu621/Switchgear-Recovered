            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzra extends zzsk implements zztt {
                private static final zzra zzd;
                private static volatile zzua zze;
                private int zzf;
                private boolean zzg;
                private zzrk zzh;
                private boolean zzi;
                private zzrm zzj;
                private byte zzl = 2;
                private zzsu zzk = zzud.zze();

                static {
/* 3 */             zzra zzraVar = new zzra();
/* 6 */             zzd = zzraVar;
/* 10 */            zzsn.zzI(zzra.class, zzraVar);
                }

                private zzra() {
                }

                public static zzra zzg() {
/* 1 */             return zzd;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 103 */               return Byte.valueOf(this.zzl);
                    }
/* 6 */             if (i2 == 2) {
/* 97 */                return new zzue(zzd, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003ϧЛ", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzrq.class});
                    }
/* 9 */             if (i2 == 3) {
/* 69 */                return new zzra();
                    }
/* 12 */            zzrr zzrrVar = null;
/* 13 */            if (i2 == 4) {
/* 63 */                return new zzqz(zzrrVar);
                    }
/* 16 */            if (i2 == 5) {
/* 58 */                return zzd;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzl = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzua zzuaVar = zze;
/* 31 */            if (zzuaVar != null) {
/* 57 */                return zzuaVar;
                    }
                    synchronized (zzra.class) {
                        try {
/* 36 */                    zzsiVar = zze;
/* 38 */                    if (zzsiVar == null) {
/* 44 */                        zzsiVar = new zzsi(zzd);
/* 47 */                        zze = zzsiVar;
                            }
                        } catch (Throwable th) {
/* 56 */                    throw th;
                        }
                    }
/* 54 */            return zzsiVar;
                }
            }
