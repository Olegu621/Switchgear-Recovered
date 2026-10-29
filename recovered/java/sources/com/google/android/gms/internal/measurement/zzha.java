            package com.google.android.gms.internal.measurement;

            import java.util.Map;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzha extends zzme implements zznm {
                private static final zzha zzn;
                private int zzb;
                private long zzg;
                private long zzk;
                private zznf zzl = zznf.zza();
                private zznf zzm = zznf.zza();
                private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzi = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzj = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             zzha zzhaVar = new zzha();
/* 6 */             zzn = zzhaVar;
/* 10 */            zzme.zzcp(zzha.class, zzhaVar);
                }

                private zzha() {
                }

                public static zzgx zzr() {
/* 7 */             return (zzgx) zzn.zzck();
                }

                public static zzha zzs() {
/* 1 */             return zzn;
                }

                public final /* synthetic */ void zzA(String str) {
/* 5 */             this.zzb |= 16;
/* 7 */             this.zzh = str;
                }

                public final /* synthetic */ void zzB() {
/* 5 */             this.zzb &= -17;
/* 11 */            this.zzh = zzn.zzh;
                }

                public final /* synthetic */ void zzC(String str) {
/* 5 */             this.zzb |= 32;
/* 7 */             this.zzi = str;
                }

                public final /* synthetic */ void zzD() {
/* 5 */             this.zzb &= -33;
/* 11 */            this.zzi = zzn.zzi;
                }

                public final /* synthetic */ void zzE(String str) {
/* 5 */             this.zzb |= 64;
/* 7 */             this.zzj = str;
                }

                public final /* synthetic */ void zzF() {
/* 5 */             this.zzb &= -65;
/* 11 */            this.zzj = zzn.zzj;
                }

                public final /* synthetic */ void zzG(long j) {
/* 5 */             this.zzb |= 128;
/* 7 */             this.zzk = j;
                }

                public final /* synthetic */ Map zzH() {
/* 7 */             if (!this.zzl.zze()) {
/* 15 */                this.zzl = this.zzl.zzc();
                    }
/* 17 */            return this.zzl;
                }

                public final /* synthetic */ Map zzI() {
/* 7 */             if (!this.zzm.zze()) {
/* 15 */                this.zzm = this.zzm.zzc();
                    }
/* 17 */            return this.zzm;
                }

                public final boolean zza() {
                    return (this.zzb & 1) != 0;
                }

                public final String zzb() {
/* 1 */             return this.zzd;
                }

                public final boolean zzc() {
                    return (this.zzb & 2) != 0;
                }

                public final String zzd() {
/* 1 */             return this.zze;
                }

                public final boolean zze() {
                    return (this.zzb & 4) != 0;
                }

                public final String zzf() {
/* 1 */             return this.zzf;
                }

                public final boolean zzg() {
                    return (this.zzb & 8) != 0;
                }

                public final long zzh() {
/* 1 */             return this.zzg;
                }

                public final boolean zzi() {
                    return (this.zzb & 16) != 0;
                }

                public final String zzj() {
/* 1 */             return this.zzh;
                }

                public final boolean zzk() {
                    return (this.zzb & 32) != 0;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 74 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 68 */                return zzme.zzcq(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgy.zza, "zzm", zzgz.zza});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzha();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzgx(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzn;
                    }
/* 21 */            throw null;
                }

                public final String zzm() {
/* 1 */             return this.zzi;
                }

                public final boolean zzn() {
                    return (this.zzb & 64) != 0;
                }

                public final String zzo() {
/* 1 */             return this.zzj;
                }

                public final boolean zzp() {
                    return (this.zzb & 128) != 0;
                }

                public final long zzq() {
/* 1 */             return this.zzk;
                }

                public final /* synthetic */ void zzt(String str) {
/* 5 */             this.zzb |= 1;
/* 7 */             this.zzd = str;
                }

                public final /* synthetic */ void zzu() {
/* 5 */             this.zzb &= -2;
/* 11 */            this.zzd = zzn.zzd;
                }

                public final /* synthetic */ void zzv(String str) {
/* 5 */             this.zzb |= 2;
/* 7 */             this.zze = str;
                }

                public final /* synthetic */ void zzw() {
/* 5 */             this.zzb &= -3;
/* 11 */            this.zze = zzn.zze;
                }

                public final /* synthetic */ void zzx(String str) {
/* 5 */             this.zzb |= 4;
/* 7 */             this.zzf = str;
                }

                public final /* synthetic */ void zzy() {
/* 5 */             this.zzb &= -5;
/* 11 */            this.zzf = zzn.zzf;
                }

                public final /* synthetic */ void zzz(long j) {
/* 5 */             this.zzb |= 8;
/* 7 */             this.zzg = j;
                }
            }
