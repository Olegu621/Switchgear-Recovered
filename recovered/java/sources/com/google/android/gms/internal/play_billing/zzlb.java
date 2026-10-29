            package com.google.android.gms.internal.play_billing;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzlb extends zzhk implements zzin {
                private static final zzlb zzb;
                private int zzd;
                private int zze;

                static {
/* 3 */             zzlb zzlbVar = new zzlb();
/* 6 */             zzb = zzlbVar;
/* 10 */            zzhk.zzx(zzlb.class, zzlbVar);
                }

                private zzlb() {
                }

                public static /* synthetic */ void zzC(zzlb zzlbVar, int i) {
/* 3 */             zzlbVar.zze = i - 1;
/* 9 */             zzlbVar.zzd |= 1;
                }

                public static zzky zzc() {
/* 7 */             return (zzky) zzb.zzm();
                }

                @Override // com.google.android.gms.internal.play_billing.zzhk
                public final Object zzd(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 54 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 48 */                return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzkz.zza});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzlb();
                    }
/* 12 */            zzla zzlaVar = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzky(zzlaVar);
                    }
/* 16 */            if (i2 != 5) {
/* 12 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
