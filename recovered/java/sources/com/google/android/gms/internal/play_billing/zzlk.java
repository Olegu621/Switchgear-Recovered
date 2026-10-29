            package com.google.android.gms.internal.play_billing;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzlk extends zzhk implements zzin {
                private static final zzlk zzb;
                private int zzd;
                private int zze = 0;
                private Object zzf;
                private zzku zzg;
                private zzkx zzh;

                static {
/* 3 */             zzlk zzlkVar = new zzlk();
/* 6 */             zzb = zzlkVar;
/* 10 */            zzhk.zzx(zzlk.class, zzlkVar);
                }

                private zzlk() {
                }

                public static /* synthetic */ void zzC(zzlk zzlkVar, zzjz zzjzVar) {
/* 1 */             zzlkVar.zzf = zzjzVar;
/* 4 */             zzlkVar.zze = 2;
                }

                public static /* synthetic */ void zzD(zzlk zzlkVar, zzkd zzkdVar) {
/* 1 */             zzlkVar.zzf = zzkdVar;
/* 4 */             zzlkVar.zze = 3;
                }

                public static /* synthetic */ void zzE(zzlk zzlkVar, zzkl zzklVar) {
/* 1 */             zzklVar.getClass();
/* 4 */             zzlkVar.zzf = zzklVar;
/* 7 */             zzlkVar.zze = 7;
                }

                public static /* synthetic */ void zzF(zzlk zzlkVar, zzku zzkuVar) {
/* 1 */             zzkuVar.getClass();
/* 4 */             zzlkVar.zzg = zzkuVar;
/* 10 */            zzlkVar.zzd |= 1;
                }

                public static /* synthetic */ void zzG(zzlk zzlkVar, zzlq zzlqVar) {
/* 1 */             zzlqVar.getClass();
/* 4 */             zzlkVar.zzf = zzlqVar;
/* 8 */             zzlkVar.zze = 8;
                }

                public static /* synthetic */ void zzH(zzlk zzlkVar, zzlu zzluVar) {
/* 1 */             zzlkVar.zzf = zzluVar;
/* 4 */             zzlkVar.zze = 4;
                }

                public static zzli zzc() {
/* 7 */             return (zzli) zzb.zzm();
                }

                @Override // com.google.android.gms.internal.play_billing.zzhk
                public final Object zzd(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 70 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 64 */                return zzhk.zzu(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzjz.class, zzkd.class, zzlu.class, zzkr.class, "zzh", zzkl.class, zzlq.class});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzlk();
                    }
/* 12 */            zzlj zzljVar = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzli(zzljVar);
                    }
/* 16 */            if (i2 != 5) {
/* 12 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
