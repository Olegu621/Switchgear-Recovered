            package com.google.android.gms.internal.play_billing;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfl extends zzhk implements zzin {
                private static final zzfl zzb;
                private int zzd;
                private zzfq zze;
                private zzfq zzf;
                private int zzg;

                static {
/* 3 */             zzfl zzflVar = new zzfl();
/* 6 */             zzb = zzflVar;
/* 10 */            zzhk.zzx(zzfl.class, zzflVar);
                }

                private zzfl() {
                }

                public static zzfk zza() {
/* 7 */             return (zzfk) zzb.zzm();
                }

                public static /* synthetic */ void zzc(zzfl zzflVar, zzfq zzfqVar) {
/* 1 */             zzfqVar.getClass();
/* 4 */             zzflVar.zze = zzfqVar;
/* 10 */            zzflVar.zzd |= 1;
                }

                @Override // com.google.android.gms.internal.play_billing.zzhk
                public final Object zzd(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 60 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 54 */                return zzhk.zzu(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzft.zza()});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzfl();
                    }
/* 12 */            zzfo zzfoVar = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzfk(zzfoVar);
                    }
/* 16 */            if (i2 != 5) {
/* 12 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
