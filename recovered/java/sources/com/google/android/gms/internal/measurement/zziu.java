            package com.google.android.gms.internal.measurement;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zziu extends zzme implements zznm {
                private static final zziu zzj;
                private int zzb;
                private long zzd;
                private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private long zzg;
                private float zzh;
                private double zzi;

                static {
/* 3 */             zziu zziuVar = new zziu();
/* 6 */             zzj = zziuVar;
/* 10 */            zzme.zzcp(zziu.class, zziuVar);
                }

                private zziu() {
                }

                public static zzit zzm() {
/* 7 */             return (zzit) zzj.zzck();
                }

                public final boolean zza() {
                    return (this.zzb & 1) != 0;
                }

                public final long zzb() {
/* 1 */             return this.zzd;
                }

                public final String zzc() {
/* 1 */             return this.zze;
                }

                public final boolean zzd() {
                    return (this.zzb & 4) != 0;
                }

                public final String zze() {
/* 1 */             return this.zzf;
                }

                public final boolean zzf() {
                    return (this.zzb & 8) != 0;
                }

                public final long zzg() {
/* 1 */             return this.zzg;
                }

                public final boolean zzh() {
                    return (this.zzb & 16) != 0;
                }

                public final float zzi() {
/* 1 */             return this.zzh;
                }

                public final boolean zzj() {
                    return (this.zzb & 32) != 0;
                }

                public final double zzk() {
/* 1 */             return this.zzi;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 62 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 56 */                return zzme.zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zziu();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzit(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzj;
                    }
/* 21 */            throw null;
                }

                public final /* synthetic */ void zzn(long j) {
/* 5 */             this.zzb |= 1;
/* 7 */             this.zzd = j;
                }

                public final /* synthetic */ void zzo(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzb |= 2;
/* 10 */            this.zze = str;
                }

                public final /* synthetic */ void zzp(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzb |= 4;
/* 10 */            this.zzf = str;
                }

                public final /* synthetic */ void zzq() {
/* 5 */             this.zzb &= -5;
/* 11 */            this.zzf = zzj.zzf;
                }

                public final /* synthetic */ void zzr(long j) {
/* 5 */             this.zzb |= 8;
/* 7 */             this.zzg = j;
                }

                public final /* synthetic */ void zzs() {
/* 5 */             this.zzb &= -9;
/* 9 */             this.zzg = 0L;
                }

                public final /* synthetic */ void zzt(double d) {
/* 5 */             this.zzb |= 32;
/* 7 */             this.zzi = d;
                }

                public final /* synthetic */ void zzu() {
/* 5 */             this.zzb &= -33;
/* 9 */             this.zzi = 0.0d;
                }
            }
