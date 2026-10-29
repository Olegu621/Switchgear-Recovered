            package com.google.android.recaptcha.internal;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzxz extends zzsn implements zztt {
                private static final zzxz zzb;
                private static volatile zzua zzd;
                private int zze;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             zzxz zzxzVar = new zzxz();
/* 6 */             zzb = zzxzVar;
/* 10 */            zzsn.zzI(zzxz.class, zzxzVar);
                }

                private zzxz() {
                }

                public static zzxy zzf() {
/* 7 */             return (zzxy) zzb.zzq();
                }

                public static /* synthetic */ void zzi(zzxz zzxzVar, String str) {
/* 1 */             str.getClass();
/* 8 */             zzxzVar.zze |= 2;
/* 10 */            zzxzVar.zzg = str;
                }

                public static /* synthetic */ void zzj(zzxz zzxzVar, String str) {
/* 1 */             str.getClass();
/* 8 */             zzxzVar.zze |= 1;
/* 10 */            zzxzVar.zzf = str;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 85 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 79 */                return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzxz();
                    }
/* 12 */            zzyc zzycVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzxy(zzycVar);
                    }
/* 16 */            if (i2 == 5) {
/* 50 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 21 */            zzua zzuaVar = zzd;
/* 23 */            if (zzuaVar != null) {
/* 48 */                return zzuaVar;
                    }
                    synchronized (zzxz.class) {
                        try {
/* 28 */                    zzsiVar = zzd;
/* 30 */                    if (zzsiVar == null) {
/* 36 */                        zzsiVar = new zzsi(zzb);
/* 39 */                        zzd = zzsiVar;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return zzsiVar;
                }
            }
