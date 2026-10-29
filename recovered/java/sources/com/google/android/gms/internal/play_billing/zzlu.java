            package com.google.android.gms.internal.play_billing;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzlu extends zzhk implements zzin {
                private static final zzlu zzb;
                private int zzd;
                private int zze;

                static {
/* 3 */             zzlu zzluVar = new zzlu();
/* 6 */             zzb = zzluVar;
/* 10 */            zzhk.zzx(zzlu.class, zzluVar);
                }

                private zzlu() {
                }

                public static zzlu zzB() {
/* 1 */             return zzb;
                }

                @Override // com.google.android.gms.internal.play_billing.zzhk
                public final Object zzd(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 54 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 48 */                return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzls.zza});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzlu();
                    }
/* 12 */            zzlt zzltVar = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzlr(zzltVar);
                    }
/* 16 */            if (i2 != 5) {
/* 12 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
