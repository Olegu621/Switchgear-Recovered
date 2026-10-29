            package com.google.android.recaptcha.internal;

            import androidx.core.app.NotificationCompat;
            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzxn extends zzsn implements zztt {
                private static final zzxn zzb;
                private static volatile zzua zzd;
                private int zze;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzi = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzj = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzk = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzst zzl = zzsn.zzA();
                private zzqm zzm = zzqm.zzb;
                private zzxp zzn;
                private zzxl zzo;
                private zzxt zzp;

                static {
/* 3 */             zzxn zzxnVar = new zzxn();
/* 6 */             zzb = zzxnVar;
/* 10 */            zzsn.zzI(zzxn.class, zzxnVar);
                }

                private zzxn() {
                }

                public static zzxn zzj() {
/* 1 */             return zzb;
                }

                public final String zzM() {
/* 1 */             return this.zzi;
                }

                public final String zzN() {
/* 1 */             return this.zzh;
                }

                public final String zzO() {
/* 1 */             return this.zzj;
                }

                public final String zzP() {
/* 1 */             return this.zzk;
                }

                public final List zzQ() {
/* 1 */             return this.zzl;
                }

                public final boolean zzR() {
                    return (this.zze & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
                }

                public final boolean zzS() {
                    return (this.zze & 2) != 0;
                }

                public final boolean zzT() {
                    return (this.zze & 8) != 0;
                }

                public final boolean zzU() {
                    return (this.zze & 128) != 0;
                }

                public final boolean zzV() {
                    return (this.zze & 64) != 0;
                }

                public final zzqm zzf() {
/* 1 */             return this.zzm;
                }

                public final zzxl zzg() {
/* 1 */             zzxl zzxlVar = this.zzo;
                    return zzxlVar == null ? zzxl.zzi() : zzxlVar;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 104 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 98 */                return zzsn.zzF(zzb, "\u0000\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007%\bည\u0006\u000bဉ\u0007\fဉ\b\rဉ\t", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzxn();
                    }
/* 12 */            zzyc zzycVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzxm(zzycVar);
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
                    synchronized (zzxn.class) {
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

                public final zzxp zzk() {
/* 1 */             zzxp zzxpVar = this.zzn;
                    return zzxpVar == null ? zzxp.zzk() : zzxpVar;
                }

                public final String zzl() {
/* 1 */             return this.zzg;
                }
            }
