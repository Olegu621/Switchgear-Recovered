            package com.google.android.gms.internal.measurement;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhu extends zzme implements zznm {
                private static final zzhu zzf;
                private int zzb;
                private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
                private long zze;

                static {
/* 3 */             zzhu zzhuVar = new zzhu();
/* 6 */             zzf = zzhuVar;
/* 10 */            zzme.zzcp(zzhu.class, zzhuVar);
                }

                private zzhu() {
                }

                public static zzht zza() {
/* 7 */             return (zzht) zzf.zzck();
                }

                public final /* synthetic */ void zzb(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzb |= 1;
/* 10 */            this.zzd = str;
                }

                public final /* synthetic */ void zzc(long j) {
/* 5 */             this.zzb |= 2;
/* 7 */             this.zze = j;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 54 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 48 */                return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzhu();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzht(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzf;
                    }
/* 21 */            throw null;
                }
            }
