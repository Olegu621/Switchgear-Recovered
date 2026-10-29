            package com.google.android.gms.internal.play_billing;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfq extends zzhk implements zzin {
                private static final zzfq zzb;
                private int zzd;
                private String zze = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             zzfq zzfqVar = new zzfq();
/* 6 */             zzb = zzfqVar;
/* 10 */            zzhk.zzx(zzfq.class, zzfqVar);
                }

                private zzfq() {
                }

                public static zzfp zza() {
/* 7 */             return (zzfp) zzb.zzm();
                }

                public static /* synthetic */ void zzc(zzfq zzfqVar, String str) {
/* 5 */             zzfqVar.zzd |= 1;
/* 7 */             zzfqVar.zze = str;
                }

                @Override // com.google.android.gms.internal.play_billing.zzhk
                public final Object zzd(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 52 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 46 */                return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzfq();
                    }
/* 12 */            zzfr zzfrVar = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzfp(zzfrVar);
                    }
/* 16 */            if (i2 != 5) {
/* 12 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
