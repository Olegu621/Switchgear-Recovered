            package com.google.android.gms.internal.measurement;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgj extends zzme implements zznm {
                private static final zzgj zzh;
                private int zzb;
                private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
                private boolean zze;
                private boolean zzf;
                private int zzg;

                static {
/* 3 */             zzgj zzgjVar = new zzgj();
/* 6 */             zzh = zzgjVar;
/* 10 */            zzme.zzcp(zzgj.class, zzgjVar);
                }

                private zzgj() {
                }

                public final String zza() {
/* 1 */             return this.zzd;
                }

                public final boolean zzb() {
                    return (this.zzb & 2) != 0;
                }

                public final boolean zzc() {
/* 1 */             return this.zze;
                }

                public final boolean zzd() {
                    return (this.zzb & 4) != 0;
                }

                public final boolean zze() {
/* 1 */             return this.zzf;
                }

                public final boolean zzf() {
                    return (this.zzb & 8) != 0;
                }

                public final int zzg() {
/* 1 */             return this.zzg;
                }

                public final /* synthetic */ void zzh(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzb |= 1;
/* 10 */            this.zzd = str;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 58 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 52 */                return zzme.zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzgj();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzgi(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzh;
                    }
/* 21 */            throw null;
                }
            }
