            package com.google.android.gms.internal.measurement;

            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhw extends zzme implements zznm {
                private static final zzhw zzj;
                private int zzb;
                private long zzf;
                private float zzg;
                private double zzh;
                private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzmn zzi = zzme.zzcv();

                static {
/* 3 */             zzhw zzhwVar = new zzhw();
/* 6 */             zzj = zzhwVar;
/* 10 */            zzme.zzcp(zzhw.class, zzhwVar);
                }

                private zzhw() {
                }

                public static zzhv zzn() {
/* 7 */             return (zzhv) zzj.zzck();
                }

                private final void zzz() {
/* 1 */             zzmn zzmnVar = this.zzi;
/* 7 */             if (zzmnVar.zza()) {
/* 15 */                return;
                    }
/* 13 */            this.zzi = zzme.zzcw(zzmnVar);
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

                public final long zzf() {
/* 1 */             return this.zzf;
                }

                public final boolean zzg() {
                    return (this.zzb & 8) != 0;
                }

                public final float zzh() {
/* 1 */             return this.zzg;
                }

                public final boolean zzi() {
                    return (this.zzb & 16) != 0;
                }

                public final double zzj() {
/* 1 */             return this.zzh;
                }

                public final List zzk() {
/* 1 */             return this.zzi;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 64 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 58 */                return zzme.zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzhw.class});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzhw();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzhv(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzj;
                    }
/* 21 */            throw null;
                }

                public final int zzm() {
/* 3 */             return this.zzi.size();
                }

                public final /* synthetic */ void zzo(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzb |= 1;
/* 10 */            this.zzd = str;
                }

                public final /* synthetic */ void zzp(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzb |= 2;
/* 10 */            this.zze = str;
                }

                public final /* synthetic */ void zzq() {
/* 5 */             this.zzb &= -3;
/* 11 */            this.zze = zzj.zze;
                }

                public final /* synthetic */ void zzr(long j) {
/* 5 */             this.zzb |= 4;
/* 7 */             this.zzf = j;
                }

                public final /* synthetic */ void zzs() {
/* 5 */             this.zzb &= -5;
/* 9 */             this.zzf = 0L;
                }

                public final /* synthetic */ void zzt(double d) {
/* 5 */             this.zzb |= 16;
/* 7 */             this.zzh = d;
                }

                public final /* synthetic */ void zzu() {
/* 5 */             this.zzb &= -17;
/* 9 */             this.zzh = 0.0d;
                }

                public final /* synthetic */ void zzv(zzhw zzhwVar) {
/* 1 */             zzhwVar.getClass();
/* 4 */             zzz();
/* 9 */             this.zzi.add(zzhwVar);
                }

                public final /* synthetic */ void zzw(Iterable iterable) {
/* 1 */             zzz();
/* 6 */             zzkr.zzce(iterable, this.zzi);
                }

                public final /* synthetic */ void zzx() {
/* 5 */             this.zzi = zzme.zzcv();
                }
            }
