            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhl extends zzme implements zznm {
                private static final zzhl zzf;
                private int zzb;
                private int zzd;
                private int zze;

                static {
/* 3 */             zzhl zzhlVar = new zzhl();
/* 6 */             zzf = zzhlVar;
/* 10 */            zzme.zzcp(zzhl.class, zzhlVar);
                }

                private zzhl() {
                }

                public static zzhk zza() {
/* 7 */             return (zzhk) zzf.zzck();
                }

                public final int zzc() {
/* 3 */             int iZza = zzhj.zza(this.zzd);
/* 7 */             if (iZza == 0) {
/* 9 */                 return 1;
                    }
/* 10 */            return iZza;
                }

                public final int zzd() {
/* 3 */             int iZza = zzhn.zza(this.zze);
/* 7 */             if (iZza == 0) {
/* 9 */                 return 1;
                    }
/* 10 */            return iZza;
                }

                public final /* synthetic */ void zze(int i) {
/* 3 */             this.zzd = i - 1;
/* 9 */             this.zzb |= 1;
                }

                public final /* synthetic */ void zzf(int i) {
/* 3 */             this.zze = i - 1;
/* 9 */             this.zzb |= 2;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 58 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 52 */                return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", zzhi.zza, "zze", zzhm.zza});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzhl();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzhk(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzf;
                    }
/* 21 */            throw null;
                }
            }
