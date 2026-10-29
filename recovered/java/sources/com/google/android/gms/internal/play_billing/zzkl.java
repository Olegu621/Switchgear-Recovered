            package com.google.android.gms.internal.play_billing;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzkl extends zzhk implements zzin {
                private static final zzkl zzb;

                static {
/* 3 */             zzkl zzklVar = new zzkl();
/* 6 */             zzb = zzklVar;
/* 10 */            zzhk.zzx(zzkl.class, zzklVar);
                }

                private zzkl() {
                }

                public static zzkl zzB() {
/* 1 */             return zzb;
                }

                @Override // com.google.android.gms.internal.play_billing.zzhk
                public final Object zzd(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 44 */                return (byte) 1;
                    }
/* 6 */             zzkk zzkkVar = null;
/* 7 */             if (i2 == 2) {
/* 38 */                return zzhk.zzu(zzb, "\u0004\u0000", null);
                    }
/* 10 */            if (i2 == 3) {
/* 30 */                return new zzkl();
                    }
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzkj(zzkkVar);
                    }
/* 16 */            if (i2 != 5) {
/* 6 */                 return null;
                    }
/* 19 */            return zzb;
                }
            }
