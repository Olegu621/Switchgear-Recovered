            package com.google.android.recaptcha.internal;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzzd extends zzsn implements zztt {
                private static final zzzd zzb;
                private static volatile zzua zzd;
                private int zze;
                private int zzi;
                private boolean zzm;
                private boolean zzn;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzj = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzk = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzl = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzo = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzp = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             zzzd zzzdVar = new zzzd();
/* 6 */             zzb = zzzdVar;
/* 10 */            zzsn.zzI(zzzd.class, zzzdVar);
                }

                private zzzd() {
                }

                public static /* synthetic */ void zzN(zzzd zzzdVar, String str) {
/* 1 */             str.getClass();
/* 4 */             zzzdVar.zzk = str;
                }

                public static /* synthetic */ void zzO(zzzd zzzdVar, String str) {
/* 1 */             str.getClass();
/* 4 */             zzzdVar.zzg = str;
                }

                public static /* synthetic */ void zzQ(zzzd zzzdVar, String str) {
/* 1 */             str.getClass();
/* 4 */             zzzdVar.zzj = str;
                }

                public static /* synthetic */ void zzR(zzzd zzzdVar, String str) {
/* 1 */             str.getClass();
/* 4 */             zzzdVar.zzf = str;
                }

                public static zzzc zzf() {
/* 7 */             return (zzzc) zzb.zzq();
                }

                public static zzzd zzi() {
/* 1 */             return zzb;
                }

                public static /* synthetic */ void zzj(zzzd zzzdVar, String str) {
/* 1 */             str.getClass();
/* 4 */             zzzdVar.zzo = str;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 104 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 98 */                return zzsn.zzF(zzb, "\u0000\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\u0007\u000bȈ\fለ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzzd();
                    }
/* 12 */            zzzv zzzvVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzzc(zzzvVar);
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
                    synchronized (zzzd.class) {
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
