            package com.google.android.gms.internal.measurement;

            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhs extends zzme implements zznm {
                private static final zzhs zzi;
                private int zzb;
                private zzmn zzd = zzme.zzcv();
                private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
                private long zzf;
                private long zzg;
                private int zzh;

                static {
/* 3 */             zzhs zzhsVar = new zzhs();
/* 6 */             zzi = zzhsVar;
/* 10 */            zzme.zzcp(zzhs.class, zzhsVar);
                }

                private zzhs() {
                }

                public static zzhr zzk() {
/* 7 */             return (zzhr) zzi.zzck();
                }

                private final void zzv() {
/* 1 */             zzmn zzmnVar = this.zzd;
/* 7 */             if (zzmnVar.zza()) {
/* 15 */                return;
                    }
/* 13 */            this.zzd = zzme.zzcw(zzmnVar);
                }

                public final List zza() {
/* 1 */             return this.zzd;
                }

                public final int zzb() {
/* 3 */             return this.zzd.size();
                }

                public final zzhw zzc(int i) {
/* 7 */             return (zzhw) this.zzd.get(i);
                }

                public final String zzd() {
/* 1 */             return this.zze;
                }

                public final boolean zze() {
                    return (this.zzb & 2) != 0;
                }

                public final long zzf() {
/* 1 */             return this.zzf;
                }

                public final boolean zzg() {
                    return (this.zzb & 4) != 0;
                }

                public final long zzh() {
/* 1 */             return this.zzg;
                }

                public final boolean zzi() {
                    return (this.zzb & 8) != 0;
                }

                public final int zzj() {
/* 1 */             return this.zzh;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 62 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 56 */                return zzme.zzcq(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzb", "zzd", zzhw.class, "zze", "zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzhs();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzhr(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzi;
                    }
/* 21 */            throw null;
                }

                public final /* synthetic */ void zzm(int i, zzhw zzhwVar) {
/* 1 */             zzhwVar.getClass();
/* 4 */             zzv();
/* 9 */             this.zzd.set(i, zzhwVar);
                }

                public final /* synthetic */ void zzn(zzhw zzhwVar) {
/* 1 */             zzhwVar.getClass();
/* 4 */             zzv();
/* 9 */             this.zzd.add(zzhwVar);
                }

                public final /* synthetic */ void zzo(Iterable iterable) {
/* 1 */             zzv();
/* 6 */             zzkr.zzce(iterable, this.zzd);
                }

                public final /* synthetic */ void zzp() {
/* 5 */             this.zzd = zzme.zzcv();
                }

                public final /* synthetic */ void zzq(int i) {
/* 1 */             zzv();
/* 6 */             this.zzd.remove(i);
                }

                public final /* synthetic */ void zzr(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzb |= 1;
/* 10 */            this.zze = str;
                }

                public final /* synthetic */ void zzs(long j) {
/* 5 */             this.zzb |= 2;
/* 7 */             this.zzf = j;
                }

                public final /* synthetic */ void zzt(long j) {
/* 5 */             this.zzb |= 4;
/* 7 */             this.zzg = j;
                }
            }
