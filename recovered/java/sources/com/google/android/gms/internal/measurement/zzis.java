            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzis extends zzme implements zznm {
                private static final zzis zzg;
                private int zzb;
                private int zzd;
                private int zze;
                private int zzf;

                static {
/* 3 */             zzis zzisVar = new zzis();
/* 6 */             zzg = zzisVar;
/* 10 */            zzme.zzcp(zzis.class, zzisVar);
                }

                private zzis() {
                }

                public static zzil zzb() {
/* 7 */             return (zzil) zzg.zzck();
                }

                public static zzis zzc() {
/* 1 */             return zzg;
                }

                public final zzin zza() {
/* 3 */             zzin zzinVarZzb = zzin.zzb(this.zze);
                    return zzinVarZzb == null ? zzin.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : zzinVarZzb;
                }

                public final /* synthetic */ void zzd(zzin zzinVar) {
/* 5 */             this.zze = zzinVar.zza();
/* 11 */            this.zzb |= 2;
                }

                public final int zzf() {
/* 3 */             int iZza = zzir.zza(this.zzd);
/* 7 */             if (iZza == 0) {
/* 9 */                 return 1;
                    }
/* 10 */            return iZza;
                }

                public final int zzg() {
/* 3 */             int iZza = zzip.zza(this.zzf);
/* 7 */             if (iZza == 0) {
/* 9 */                 return 1;
                    }
/* 10 */            return iZza;
                }

                public final /* synthetic */ void zzh(int i) {
/* 3 */             this.zzd = i - 1;
/* 9 */             this.zzb |= 1;
                }

                public final /* synthetic */ void zzi(int i) {
/* 3 */             this.zzf = i - 1;
/* 9 */             this.zzb |= 4;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 62 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 56 */                return zzme.zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", zziq.zza, "zze", zzim.zza, "zzf", zzio.zza});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzis();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzil(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzg;
                    }
/* 21 */            throw null;
                }
            }
