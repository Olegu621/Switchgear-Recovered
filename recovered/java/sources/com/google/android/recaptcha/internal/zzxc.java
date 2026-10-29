            package com.google.android.recaptcha.internal;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzxc extends zzsn implements zztt {
                private static final zzxc zzb;
                private static volatile zzua zzd;
                private int zze;
                private int zzf;
                private int zzg;
                private zzrv zzj;
                private zzut zzk;
                private int zzl;
                private zzwj zzm;
                private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzi = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzsu zzn = zzsn.zzB();

                static {
/* 3 */             zzxc zzxcVar = new zzxc();
/* 6 */             zzb = zzxcVar;
/* 10 */            zzsn.zzI(zzxc.class, zzxcVar);
                }

                private zzxc() {
                }

                public static zzxc zzg() {
/* 1 */             return zzb;
                }

                public static zzxc zzi(byte[] bArr) throws zzsx {
/* 7 */             return (zzxc) zzsn.zzx(zzb, bArr);
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 102 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 96 */                return zzsn.zzF(zzb, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005\f\u0007\u001b\b\f\tȈ\nȈ\u000bဉ\u0002", new Object[]{"zze", "zzf", "zzj", "zzk", "zzl", "zzn", zzwt.class, "zzg", "zzh", "zzi", "zzm"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzxc();
                    }
/* 12 */            zzxb zzxbVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzxa(zzxbVar);
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
                    synchronized (zzxc.class) {
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
