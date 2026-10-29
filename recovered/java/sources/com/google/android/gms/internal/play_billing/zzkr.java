            package com.google.android.gms.internal.play_billing;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzkr extends zzhk implements zzin {
                private static final zzkr zzb;
                private int zzd;
                private int zzf;
                private zzki zzi;
                private boolean zzj;
                private boolean zzk;
                private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzhn zzg = zzhk.zzr();
                private zzho zzh = zzhk.zzs();

                static {
/* 3 */             zzkr zzkrVar = new zzkr();
/* 6 */             zzb = zzkrVar;
/* 10 */            zzhk.zzx(zzkr.class, zzkrVar);
                }

                private zzkr() {
                }

                @Override // com.google.android.gms.internal.play_billing.zzhk
                public final Object zzd(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 70 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 64 */                return zzhk.zzu(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", zzkp.zza, "zzg", zzkm.zza, "zzh", zzln.class, "zzi", "zzj", "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzkr();
                    }
/* 12 */            zzkq zzkqVar = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzko(zzkqVar);
                    }
/* 16 */            if (i2 != 5) {
/* 12 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
