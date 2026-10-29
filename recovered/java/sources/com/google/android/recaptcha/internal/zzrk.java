            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzrk extends zzsk implements zztt {
                private static final zzrk zzd;
                private static volatile zzua zze;
                private int zzf;
                private int zzg;
                private int zzh;
                private int zzi;
                private int zzj;
                private int zzk;
                private int zzl;
                private int zzm;
                private int zzn;
                private byte zzo = 2;

                static {
/* 3 */             zzrk zzrkVar = new zzrk();
/* 6 */             zzd = zzrkVar;
/* 10 */            zzsn.zzI(zzrk.class, zzrkVar);
                }

                private zzrk() {
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 3 */             int i2 = i - 1;
/* 5 */             if (i2 == 0) {
/* 124 */               return Byte.valueOf(this.zzo);
                    }
/* 8 */             if (i2 == 2) {
/* 118 */               return new zzue(zzd, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzf", "zzg", zzre.zza, "zzh", zzrd.zza, "zzi", zzrh.zza, "zzj", zzri.zza, "zzk", zzrg.zza, "zzl", zzrf.zza, "zzm", zzrc.zza, "zzn", zzrj.zza});
                    }
/* 11 */            if (i2 == 3) {
/* 70 */                return new zzrk();
                    }
/* 14 */            zzrr zzrrVar = null;
/* 15 */            if (i2 == 4) {
/* 64 */                return new zzrb(zzrrVar);
                    }
/* 18 */            if (i2 == 5) {
/* 59 */                return zzd;
                    }
/* 21 */            if (i2 != 6) {
/* 28 */                this.zzo = obj == null ? (byte) 0 : (byte) 1;
/* 14 */                return null;
                    }
/* 31 */            zzua zzuaVar = zze;
/* 33 */            if (zzuaVar != null) {
/* 58 */                return zzuaVar;
                    }
                    synchronized (zzrk.class) {
                        try {
/* 38 */                    zzsiVar = zze;
/* 40 */                    if (zzsiVar == null) {
/* 46 */                        zzsiVar = new zzsi(zzd);
/* 49 */                        zze = zzsiVar;
                            }
                        } catch (Throwable th) {
/* 57 */                    throw th;
                        }
                    }
/* 55 */            return zzsiVar;
                }
            }
