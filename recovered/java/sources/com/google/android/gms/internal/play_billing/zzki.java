            package com.google.android.gms.internal.play_billing;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzki extends zzhk implements zzin {
                private static final zzki zzb;
                private int zzd;
                private int zze;
                private int zzg;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             zzki zzkiVar = new zzki();
/* 6 */             zzb = zzkiVar;
/* 10 */            zzhk.zzx(zzki.class, zzkiVar);
                }

                private zzki() {
                }

                public static /* synthetic */ void zzC(zzki zzkiVar, String str) {
/* 5 */             zzkiVar.zzd |= 8;
/* 7 */             zzkiVar.zzh = str;
                }

                public static /* synthetic */ void zzD(zzki zzkiVar, String str) {
/* 1 */             str.getClass();
/* 8 */             zzkiVar.zzd |= 2;
/* 10 */            zzkiVar.zzf = str;
                }

                public static /* synthetic */ void zzE(zzki zzkiVar, int i) {
/* 5 */             zzkiVar.zzd |= 1;
/* 7 */             zzkiVar.zze = i;
                }

                public static /* synthetic */ void zzF(zzki zzkiVar, int i) {
/* 3 */             zzkiVar.zzg = i - 1;
/* 9 */             zzkiVar.zzd |= 4;
                }

                public static zzke zzc() {
/* 7 */             return (zzke) zzb.zzm();
                }

                @Override // com.google.android.gms.internal.play_billing.zzhk
                public final Object zzd(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 60 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 54 */                return zzhk.zzu(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", zzkf.zza, "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzki();
                    }
/* 12 */            zzkh zzkhVar = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzke(zzkhVar);
                    }
/* 16 */            if (i2 != 5) {
/* 12 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
