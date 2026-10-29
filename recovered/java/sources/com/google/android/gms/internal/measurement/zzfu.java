            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfu extends zzme implements zznm {
                private static final zzfu zzg;
                private int zzb;
                private int zzd;
                private int zze;
                private int zzf;

                static {
/* 3 */             zzfu zzfuVar = new zzfu();
/* 6 */             zzg = zzfuVar;
/* 10 */            zzme.zzcp(zzfu.class, zzfuVar);
                }

                private zzfu() {
                }

                public final int zzb() {
/* 3 */             int iZza = zzga.zza(this.zzd);
/* 7 */             if (iZza == 0) {
/* 9 */                 return 1;
                    }
/* 10 */            return iZza;
                }

                public final int zzc() {
/* 3 */             int iZza = zzfy.zza(this.zze);
/* 7 */             if (iZza == 0) {
/* 9 */                 return 1;
                    }
/* 10 */            return iZza;
                }

                public final int zzd() {
/* 3 */             int iZza = zzge.zza(this.zzf);
/* 7 */             if (iZza == 0) {
/* 9 */                 return 1;
                    }
/* 10 */            return iZza;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 62 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 56 */                return zzme.zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", zzfz.zza, "zze", zzfx.zza, "zzf", zzgd.zza});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzfu();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzft(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzg;
                    }
/* 21 */            throw null;
                }
            }
