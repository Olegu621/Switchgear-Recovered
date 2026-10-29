            package com.google.android.gms.internal.play_billing;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzln extends zzhk implements zzin {
                private static final zzln zzb;
                private int zzd;
                private int zzf;
                private zzho zze = zzhk.zzs();
                private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             zzln zzlnVar = new zzln();
/* 6 */             zzb = zzlnVar;
/* 10 */            zzhk.zzx(zzln.class, zzlnVar);
                }

                private zzln() {
                }

                @Override // com.google.android.gms.internal.play_billing.zzhk
                public final Object zzd(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 56 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 50 */                return zzhk.zzu(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzln();
                    }
/* 12 */            zzlm zzlmVar = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzll(zzlmVar);
                    }
/* 16 */            if (i2 != 5) {
/* 12 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
