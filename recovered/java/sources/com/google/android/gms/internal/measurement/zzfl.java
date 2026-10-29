            package com.google.android.gms.internal.measurement;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfl extends zzme implements zznm {
                private static final zzfl zzi;
                private int zzb;
                private int zzd;
                private boolean zze;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             zzfl zzflVar = new zzfl();
/* 6 */             zzi = zzflVar;
/* 10 */            zzme.zzcp(zzfl.class, zzflVar);
                }

                private zzfl() {
                }

                public static zzfl zzj() {
/* 1 */             return zzi;
                }

                public final boolean zza() {
                    return (this.zzb & 1) != 0;
                }

                public final boolean zzb() {
                    return (this.zzb & 2) != 0;
                }

                public final boolean zzc() {
/* 1 */             return this.zze;
                }

                public final boolean zzd() {
                    return (this.zzb & 4) != 0;
                }

                public final String zze() {
/* 1 */             return this.zzf;
                }

                public final boolean zzf() {
                    return (this.zzb & 8) != 0;
                }

                public final String zzg() {
/* 1 */             return this.zzg;
                }

                public final boolean zzh() {
                    return (this.zzb & 16) != 0;
                }

                public final String zzi() {
/* 1 */             return this.zzh;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 62 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 56 */                return zzme.zzcq(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", zzfj.zza, "zze", "zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzfl();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzfi(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzi;
                    }
/* 21 */            throw null;
                }

                public final int zzm() {
/* 3 */             int iZza = zzfk.zza(this.zzd);
/* 7 */             if (iZza == 0) {
/* 9 */                 return 1;
                    }
/* 10 */            return iZza;
                }
            }
