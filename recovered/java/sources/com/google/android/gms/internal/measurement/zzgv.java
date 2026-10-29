            package com.google.android.gms.internal.measurement;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgv extends zzme implements zznm {
                private static final zzgv zzi;
                private int zzb;
                private int zzg;
                private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             zzgv zzgvVar = new zzgv();
/* 6 */             zzi = zzgvVar;
/* 10 */            zzme.zzcp(zzgv.class, zzgvVar);
                }

                private zzgv() {
                }

                public static zzgv zze() {
/* 1 */             return zzi;
                }

                public final String zza() {
/* 1 */             return this.zzd;
                }

                public final String zzb() {
/* 1 */             return this.zze;
                }

                public final int zzc() {
/* 1 */             return this.zzg;
                }

                public final String zzd() {
/* 1 */             return this.zzh;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 60 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 54 */                return zzme.zzcq(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzgv();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzgu(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzi;
                    }
/* 21 */            throw null;
                }
            }
