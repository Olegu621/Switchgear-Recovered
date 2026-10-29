            package com.google.android.gms.internal.measurement;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgh extends zzme implements zznm {
                private static final zzgh zzg;
                private int zzb;
                private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzmn zze = zzme.zzcv();
                private boolean zzf;

                static {
/* 3 */             zzgh zzghVar = new zzgh();
/* 6 */             zzg = zzghVar;
/* 10 */            zzme.zzcp(zzgh.class, zzghVar);
                }

                private zzgh() {
                }

                public final String zza() {
/* 1 */             return this.zzd;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 58 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 52 */                return zzme.zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", zzgr.class, "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzgh();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzgg(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzg;
                    }
/* 21 */            throw null;
                }
            }
