            package com.google.android.recaptcha.internal;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzwz extends zzsn implements zztt {
                private static final zzwz zzb;
                private static volatile zzua zzd;
                private int zze;
                private zzwd zzg;
                private zzvu zzh;
                private zzwg zzi;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzj = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzk = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             zzwz zzwzVar = new zzwz();
/* 6 */             zzb = zzwzVar;
/* 10 */            zzsn.zzI(zzwz.class, zzwzVar);
                }

                private zzwz() {
                }

                public static zzwx zzf() {
/* 7 */             return (zzwx) zzb.zzq();
                }

                public static /* synthetic */ void zzi(zzwz zzwzVar, zzvu zzvuVar) {
/* 1 */             zzvuVar.getClass();
/* 4 */             zzwzVar.zzh = zzvuVar;
/* 10 */            zzwzVar.zze |= 2;
                }

                public static /* synthetic */ void zzj(zzwz zzwzVar, String str) {
/* 1 */             str.getClass();
/* 4 */             zzwzVar.zzk = str;
                }

                public static /* synthetic */ void zzk(zzwz zzwzVar, String str) {
/* 1 */             str.getClass();
/* 4 */             zzwzVar.zzj = str;
                }

                public static /* synthetic */ void zzl(zzwz zzwzVar, String str) {
/* 1 */             str.getClass();
/* 4 */             zzwzVar.zzf = str;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 94 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 88 */                return zzsn.zzF(zzb, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzwz();
                    }
/* 12 */            zzwy zzwyVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzwx(zzwyVar);
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
                    synchronized (zzwz.class) {
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
