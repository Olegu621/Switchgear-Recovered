            package com.google.android.gms.internal.measurement;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfh extends zzme implements zznm {
                private static final zzfh zzh;
                private int zzb;
                private zzfr zzd;
                private zzfl zze;
                private boolean zzf;
                private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             zzfh zzfhVar = new zzfh();
/* 6 */             zzh = zzfhVar;
/* 10 */            zzme.zzcp(zzfh.class, zzfhVar);
                }

                private zzfh() {
                }

                public static zzfh zzi() {
/* 1 */             return zzh;
                }

                public final boolean zza() {
                    return (this.zzb & 1) != 0;
                }

                public final zzfr zzb() {
/* 1 */             zzfr zzfrVar = this.zzd;
                    return zzfrVar == null ? zzfr.zzh() : zzfrVar;
                }

                public final boolean zzc() {
                    return (this.zzb & 2) != 0;
                }

                public final zzfl zzd() {
/* 1 */             zzfl zzflVar = this.zze;
                    return zzflVar == null ? zzfl.zzj() : zzflVar;
                }

                public final boolean zze() {
                    return (this.zzb & 4) != 0;
                }

                public final boolean zzf() {
/* 1 */             return this.zzf;
                }

                public final boolean zzg() {
                    return (this.zzb & 8) != 0;
                }

                public final String zzh() {
/* 1 */             return this.zzg;
                }

                public final /* synthetic */ void zzj(String str) {
/* 5 */             this.zzb |= 8;
/* 7 */             this.zzg = str;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 58 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 52 */                return zzme.zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzfh();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzfg(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzh;
                    }
/* 21 */            throw null;
                }
            }
