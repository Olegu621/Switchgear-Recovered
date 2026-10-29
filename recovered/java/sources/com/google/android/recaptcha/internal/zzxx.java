            package com.google.android.recaptcha.internal;

            import androidx.core.app.NotificationCompat;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzxx extends zzsn implements zztt {
                private static final zzxx zzb;
                private static volatile zzua zzd;
                private int zze;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzi = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzj = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzyb zzk;
                private zzxr zzl;
                private zzxz zzm;
                private zzxj zzn;
                private zzxv zzo;

                static {
/* 3 */             zzxx zzxxVar = new zzxx();
/* 6 */             zzb = zzxxVar;
/* 10 */            zzsn.zzI(zzxx.class, zzxxVar);
                }

                private zzxx() {
                }

                public static /* synthetic */ void zzN(zzxx zzxxVar, String str) {
/* 1 */             str.getClass();
/* 8 */             zzxxVar.zze |= 1;
/* 10 */            zzxxVar.zzf = str;
                }

                public static /* synthetic */ void zzO(zzxx zzxxVar, zzxj zzxjVar) {
/* 1 */             zzxjVar.getClass();
/* 4 */             zzxxVar.zzn = zzxjVar;
/* 10 */            zzxxVar.zze |= NotificationCompat.FLAG_LOCAL_ONLY;
                }

                public static /* synthetic */ void zzP(zzxx zzxxVar, zzxr zzxrVar) {
/* 1 */             zzxrVar.getClass();
/* 4 */             zzxxVar.zzl = zzxrVar;
/* 10 */            zzxxVar.zze |= 64;
                }

                public static /* synthetic */ void zzQ(zzxx zzxxVar, zzyb zzybVar) {
/* 1 */             zzybVar.getClass();
/* 4 */             zzxxVar.zzk = zzybVar;
/* 10 */            zzxxVar.zze |= 32;
                }

                public static /* synthetic */ void zzR(zzxx zzxxVar, zzxz zzxzVar) {
/* 1 */             zzxzVar.getClass();
/* 4 */             zzxxVar.zzm = zzxzVar;
/* 10 */            zzxxVar.zze |= 128;
                }

                public static zzxw zzf() {
/* 7 */             return (zzxw) zzb.zzq();
                }

                public static zzxx zzi(byte[] bArr) throws zzsx {
/* 7 */             return (zzxx) zzsn.zzx(zzb, bArr);
                }

                @Deprecated
                public final String zzM() {
/* 1 */             return this.zzh;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 102 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 96 */                return zzsn.zzF(zzb, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzxx();
                    }
/* 12 */            zzyc zzycVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzxw(zzycVar);
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
                    synchronized (zzxx.class) {
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

                @Deprecated
                public final String zzj() {
/* 1 */             return this.zzi;
                }

                public final String zzk() {
/* 1 */             return this.zzf;
                }

                @Deprecated
                public final String zzl() {
/* 1 */             return this.zzg;
                }
            }
