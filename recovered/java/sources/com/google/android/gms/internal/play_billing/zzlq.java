            package com.google.android.gms.internal.play_billing;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzlq extends zzhk implements zzin {
                private static final zzlq zzb;
                private int zzd;
                private zzki zze;

                static {
/* 3 */             zzlq zzlqVar = new zzlq();
/* 6 */             zzb = zzlqVar;
/* 10 */            zzhk.zzx(zzlq.class, zzlqVar);
                }

                private zzlq() {
                }

                public static /* synthetic */ void zzC(zzlq zzlqVar, zzki zzkiVar) {
/* 1 */             zzkiVar.getClass();
/* 4 */             zzlqVar.zze = zzkiVar;
/* 10 */            zzlqVar.zzd |= 1;
                }

                public static zzlo zzc() {
/* 7 */             return (zzlo) zzb.zzm();
                }

                @Override // com.google.android.gms.internal.play_billing.zzhk
                public final Object zzd(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 52 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 46 */                return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzlq();
                    }
/* 12 */            zzlp zzlpVar = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzlo(zzlpVar);
                    }
/* 16 */            if (i2 != 5) {
/* 12 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
