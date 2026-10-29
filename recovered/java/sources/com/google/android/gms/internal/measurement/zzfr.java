            package com.google.android.gms.internal.measurement;

            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfr extends zzme implements zznm {
                private static final zzfr zzh;
                private int zzb;
                private int zzd;
                private boolean zzf;
                private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzmn zzg = zzme.zzcv();

                static {
/* 3 */             zzfr zzfrVar = new zzfr();
/* 6 */             zzh = zzfrVar;
/* 10 */            zzme.zzcp(zzfr.class, zzfrVar);
                }

                private zzfr() {
                }

                public static zzfr zzh() {
/* 1 */             return zzh;
                }

                public final boolean zza() {
                    return (this.zzb & 1) != 0;
                }

                public final boolean zzb() {
                    return (this.zzb & 2) != 0;
                }

                public final String zzc() {
/* 1 */             return this.zze;
                }

                public final boolean zzd() {
                    return (this.zzb & 4) != 0;
                }

                public final boolean zze() {
/* 1 */             return this.zzf;
                }

                public final List zzf() {
/* 1 */             return this.zzg;
                }

                public final int zzg() {
/* 3 */             return this.zzg.size();
                }

                public final int zzj() {
/* 3 */             int iZza = zzfq.zza(this.zzd);
/* 7 */             if (iZza == 0) {
/* 9 */                 return 1;
                    }
/* 10 */            return iZza;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 60 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 54 */                return zzme.zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", zzfp.zza, "zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzfr();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzfo(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzh;
                    }
/* 21 */            throw null;
                }
            }
