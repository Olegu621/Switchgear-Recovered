            package com.google.android.gms.internal.play_billing;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzlx extends zzhk implements zzin {
                private static final zzlx zzb;
                private int zzd;
                private int zze;
                private boolean zzf;

                static {
/* 3 */             zzlx zzlxVar = new zzlx();
/* 6 */             zzb = zzlxVar;
/* 10 */            zzhk.zzx(zzlx.class, zzlxVar);
                }

                private zzlx() {
                }

                public static /* synthetic */ void zzC(zzlx zzlxVar, boolean z) {
/* 5 */             zzlxVar.zzd |= 2;
/* 8 */             zzlxVar.zzf = true;
                }

                public static zzlv zzc() {
/* 7 */             return (zzlv) zzb.zzm();
                }

                @Override // com.google.android.gms.internal.play_billing.zzhk
                public final Object zzd(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 54 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 48 */                return zzhk.zzu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzlx();
                    }
/* 12 */            zzlw zzlwVar = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzlv(zzlwVar);
                    }
/* 16 */            if (i2 != 5) {
/* 12 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
