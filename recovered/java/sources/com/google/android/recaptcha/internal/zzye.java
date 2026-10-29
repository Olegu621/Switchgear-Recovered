            package com.google.android.recaptcha.internal;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzye extends zzsn implements zztt {
                private static final zzye zzb;
                private static volatile zzua zzd;
                private int zze;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzi = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzj = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzk = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzl = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzxx zzm;

                static {
/* 3 */             zzye zzyeVar = new zzye();
/* 6 */             zzb = zzyeVar;
/* 10 */            zzsn.zzI(zzye.class, zzyeVar);
                }

                private zzye() {
                }

                public static /* synthetic */ void zzM(zzye zzyeVar, String str) {
/* 1 */             str.getClass();
/* 8 */             zzyeVar.zze |= 4;
/* 10 */            zzyeVar.zzh = str;
                }

                public static zzyd zzf() {
/* 7 */             return (zzyd) zzb.zzq();
                }

                public static /* synthetic */ void zzi(zzye zzyeVar, String str) {
/* 1 */             str.getClass();
/* 8 */             zzyeVar.zze |= 8;
/* 10 */            zzyeVar.zzi = str;
                }

                public static /* synthetic */ void zzj(zzye zzyeVar, String str) {
/* 1 */             str.getClass();
/* 8 */             zzyeVar.zze |= 2;
/* 10 */            zzyeVar.zzg = str;
                }

                public static /* synthetic */ void zzk(zzye zzyeVar, String str) {
/* 1 */             str.getClass();
/* 8 */             zzyeVar.zze |= 1;
/* 10 */            zzyeVar.zzf = str;
                }

                public static /* synthetic */ void zzl(zzye zzyeVar, zzxx zzxxVar) {
/* 1 */             zzxxVar.getClass();
/* 4 */             zzyeVar.zzm = zzxxVar;
/* 10 */            zzyeVar.zze |= 128;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 98 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 92 */                return zzsn.zzF(zzb, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bဉ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzye();
                    }
/* 12 */            zzyj zzyjVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzyd(zzyjVar);
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
                    synchronized (zzye.class) {
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
