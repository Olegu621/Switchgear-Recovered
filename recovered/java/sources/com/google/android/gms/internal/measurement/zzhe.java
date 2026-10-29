            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhe extends zzme implements zznm {
                private static final zzhe zzk;
                private int zzb;
                private boolean zzd;
                private boolean zze;
                private boolean zzf;
                private boolean zzg;
                private boolean zzh;
                private boolean zzi;
                private boolean zzj;

                static {
/* 3 */             zzhe zzheVar = new zzhe();
/* 6 */             zzk = zzheVar;
/* 10 */            zzme.zzcp(zzhe.class, zzheVar);
                }

                private zzhe() {
                }

                public static zzhd zzh() {
/* 7 */             return (zzhd) zzk.zzck();
                }

                public static zzhe zzi() {
/* 1 */             return zzk;
                }

                public final boolean zza() {
/* 1 */             return this.zzd;
                }

                public final boolean zzb() {
/* 1 */             return this.zze;
                }

                public final boolean zzc() {
/* 1 */             return this.zzf;
                }

                public final boolean zzd() {
/* 1 */             return this.zzg;
                }

                public final boolean zze() {
/* 1 */             return this.zzh;
                }

                public final boolean zzf() {
/* 1 */             return this.zzi;
                }

                public final boolean zzg() {
/* 1 */             return this.zzj;
                }

                public final /* synthetic */ void zzj(boolean z) {
/* 5 */             this.zzb |= 1;
/* 7 */             this.zzd = z;
                }

                public final /* synthetic */ void zzk(boolean z) {
/* 5 */             this.zzb |= 2;
/* 7 */             this.zze = z;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 64 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 58 */                return zzme.zzcq(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzhe();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzhd(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzk;
                    }
/* 21 */            throw null;
                }

                public final /* synthetic */ void zzm(boolean z) {
/* 5 */             this.zzb |= 4;
/* 7 */             this.zzf = z;
                }

                public final /* synthetic */ void zzn(boolean z) {
/* 5 */             this.zzb |= 8;
/* 7 */             this.zzg = z;
                }

                public final /* synthetic */ void zzo(boolean z) {
/* 5 */             this.zzb |= 16;
/* 7 */             this.zzh = z;
                }

                public final /* synthetic */ void zzp(boolean z) {
/* 5 */             this.zzb |= 32;
/* 7 */             this.zzi = z;
                }

                public final /* synthetic */ void zzq(boolean z) {
/* 5 */             this.zzb |= 64;
/* 7 */             this.zzj = z;
                }
            }
