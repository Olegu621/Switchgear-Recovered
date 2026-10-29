            package com.google.android.gms.internal.play_billing;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzkd extends zzhk implements zzin {
                private static final zzkd zzb;
                private int zzd;
                private int zze = 0;
                private Object zzf;
                private int zzg;

                static {
/* 3 */             zzkd zzkdVar = new zzkd();
/* 6 */             zzb = zzkdVar;
/* 10 */            zzhk.zzx(zzkd.class, zzkdVar);
                }

                private zzkd() {
                }

                public static /* synthetic */ void zzC(zzkd zzkdVar, zzlb zzlbVar) {
/* 1 */             zzlbVar.getClass();
/* 4 */             zzkdVar.zzf = zzlbVar;
/* 7 */             zzkdVar.zze = 2;
                }

                public static /* synthetic */ void zzD(zzkd zzkdVar, zzlx zzlxVar) {
/* 1 */             zzlxVar.getClass();
/* 4 */             zzkdVar.zzf = zzlxVar;
/* 7 */             zzkdVar.zze = 3;
                }

                public static /* synthetic */ void zzE(zzkd zzkdVar, int i) {
/* 3 */             zzkdVar.zzg = i - 1;
/* 9 */             zzkdVar.zzd |= 1;
                }

                public static zzkb zzc() {
/* 7 */             return (zzkb) zzb.zzm();
                }

                @Override // com.google.android.gms.internal.play_billing.zzhk
                public final Object zzd(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 64 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 58 */                return zzhk.zzu(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzka.zza, zzlb.class, zzlx.class, zzlh.class});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzkd();
                    }
/* 12 */            zzkc zzkcVar = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzkb(zzkcVar);
                    }
/* 16 */            if (i2 != 5) {
/* 12 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
