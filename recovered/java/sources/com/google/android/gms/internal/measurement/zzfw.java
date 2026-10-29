            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfw extends zzme implements zznm {
                private static final zzfw zzf;
                private int zzb;
                private int zzd;
                private int zze;

                static {
/* 3 */             zzfw zzfwVar = new zzfw();
/* 6 */             zzf = zzfwVar;
/* 10 */            zzme.zzcp(zzfw.class, zzfwVar);
                }

                private zzfw() {
                }

                public final int zzb() {
/* 3 */             int iZza = zzga.zza(this.zzd);
/* 7 */             if (iZza == 0) {
/* 9 */                 return 1;
                    }
/* 10 */            return iZza;
                }

                public final int zzc() {
/* 3 */             int iZza = zzga.zza(this.zze);
/* 7 */             if (iZza == 0) {
/* 9 */                 return 1;
                    }
/* 10 */            return iZza;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 56 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 34 */                zzmj zzmjVar = zzfz.zza;
/* 50 */                return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", zzmjVar, "zze", zzmjVar});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzfw();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzfv(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzf;
                    }
/* 21 */            throw null;
                }
            }
