            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgp extends zzme implements zznm {
                private static final zzgp zzg;
                private int zzb;
                private int zzd = 14;
                private int zze = 11;
                private int zzf = 60;

                static {
/* 3 */             zzgp zzgpVar = new zzgp();
/* 6 */             zzg = zzgpVar;
/* 10 */            zzme.zzcp(zzgp.class, zzgpVar);
                }

                private zzgp() {
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 56 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 50 */                return zzme.zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzgp();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzgo(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzg;
                    }
/* 21 */            throw null;
                }
            }
