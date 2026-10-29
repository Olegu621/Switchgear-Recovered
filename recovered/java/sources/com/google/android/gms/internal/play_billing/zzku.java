            package com.google.android.gms.internal.play_billing;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzku extends zzhk implements zzin {
                private static final zzku zzb;
                private int zzd;
                private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private int zzg;
                private long zzh;

                static {
/* 3 */             zzku zzkuVar = new zzku();
/* 6 */             zzb = zzkuVar;
/* 10 */            zzhk.zzx(zzku.class, zzkuVar);
                }

                private zzku() {
                }

                public static /* synthetic */ void zzC(zzku zzkuVar, int i) {
/* 5 */             zzkuVar.zzd |= 4;
/* 7 */             zzkuVar.zzg = i;
                }

                public static /* synthetic */ void zzD(zzku zzkuVar, long j) {
/* 5 */             zzkuVar.zzd |= 8;
/* 7 */             zzkuVar.zzh = j;
                }

                public static /* synthetic */ void zzE(zzku zzkuVar, String str) {
/* 1 */             str.getClass();
/* 8 */             zzkuVar.zzd |= 2;
/* 10 */            zzkuVar.zzf = str;
                }

                public static /* synthetic */ void zzF(zzku zzkuVar, String str) {
/* 1 */             str.getClass();
/* 8 */             zzkuVar.zzd |= 1;
/* 10 */            zzkuVar.zze = str;
                }

                public static zzks zzc() {
/* 7 */             return (zzks) zzb.zzm();
                }

                @Override // com.google.android.gms.internal.play_billing.zzhk
                public final Object zzd(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 58 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 52 */                return zzhk.zzu(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzku();
                    }
/* 12 */            zzkt zzktVar = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzks(zzktVar);
                    }
/* 16 */            if (i2 != 5) {
/* 12 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
