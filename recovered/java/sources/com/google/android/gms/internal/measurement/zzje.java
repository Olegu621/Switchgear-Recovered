            package com.google.android.gms.internal.measurement;

            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzje extends zzme implements zznm {
                private static final zzje zzj;
                private int zzb;
                private int zzd;
                private zzmn zze = zzme.zzcv();
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
                private boolean zzh;
                private double zzi;

                static {
/* 3 */             zzje zzjeVar = new zzje();
/* 6 */             zzj = zzjeVar;
/* 10 */            zzme.zzcp(zzje.class, zzjeVar);
                }

                private zzje() {
                }

                public final List zza() {
/* 1 */             return this.zze;
                }

                public final String zzb() {
/* 1 */             return this.zzf;
                }

                public final boolean zzc() {
                    return (this.zzb & 4) != 0;
                }

                public final String zzd() {
/* 1 */             return this.zzg;
                }

                public final boolean zze() {
                    return (this.zzb & 8) != 0;
                }

                public final boolean zzf() {
/* 1 */             return this.zzh;
                }

                public final boolean zzg() {
                    return (this.zzb & 16) != 0;
                }

                public final double zzh() {
/* 1 */             return this.zzi;
                }

                public final int zzj() {
/* 3 */             int iZza = zzjd.zza(this.zzd);
/* 7 */             if (iZza == 0) {
/* 9 */                 return 1;
                    }
/* 10 */            return iZza;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 66 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 60 */                return zzme.zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", zzjc.zza, "zze", zzje.class, "zzf", "zzg", "zzh", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzje();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzjb(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzj;
                    }
/* 21 */            throw null;
                }
            }
