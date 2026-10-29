            package com.google.android.gms.internal.measurement;

            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zziy extends zzme implements zznm {
                private static final zziy zzf;
                private int zzb;
                private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzmn zze = zzme.zzcv();

                static {
/* 3 */             zziy zziyVar = new zziy();
/* 6 */             zzf = zziyVar;
/* 10 */            zzme.zzcp(zziy.class, zziyVar);
                }

                private zziy() {
                }

                public final String zza() {
/* 1 */             return this.zzd;
                }

                public final List zzb() {
/* 1 */             return this.zze;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 56 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 50 */                return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", zzje.class});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zziy();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzix(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzf;
                    }
/* 21 */            throw null;
                }
            }
