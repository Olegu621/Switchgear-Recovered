            package com.google.android.gms.internal.measurement;

            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzib extends zzme implements zznm {
                private static final zzib zzh;
                private int zzb;
                private zzmn zzd = zzme.zzcv();
                private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private int zzg;

                static {
/* 3 */             zzib zzibVar = new zzib();
/* 6 */             zzh = zzibVar;
/* 10 */            zzme.zzcp(zzib.class, zzibVar);
                }

                private zzib() {
                }

                public static zzhz zzh() {
/* 7 */             return (zzhz) zzh.zzck();
                }

                public static zzhz zzi(zzib zzibVar) {
/* 3 */             zzma zzmaVarZzck = zzh.zzck();
/* 7 */             zzmaVarZzck.zzbd(zzibVar);
/* 10 */            return (zzhz) zzmaVarZzck;
                }

                private final void zzr() {
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

                public final zzid zzc(int i) {
/* 7 */             return (zzid) this.zzd.get(i);
                }

                public final boolean zzd() {
                    return (this.zzb & 1) != 0;
                }

                public final String zze() {
/* 1 */             return this.zze;
                }

                public final boolean zzf() {
                    return (this.zzb & 2) != 0;
                }

                public final String zzg() {
/* 1 */             return this.zzf;
                }

                public final /* synthetic */ void zzj(int i, zzid zzidVar) {
/* 1 */             zzidVar.getClass();
/* 4 */             zzr();
/* 9 */             this.zzd.set(i, zzidVar);
                }

                public final /* synthetic */ void zzk(zzid zzidVar) {
/* 1 */             zzidVar.getClass();
/* 4 */             zzr();
/* 9 */             this.zzd.add(zzidVar);
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 62 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 56 */                return zzme.zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", zzid.class, "zze", "zzf", "zzg", zzia.zza});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzib();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzhz(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzh;
                    }
/* 21 */            throw null;
                }

                public final /* synthetic */ void zzm(Iterable iterable) {
/* 1 */             zzr();
/* 6 */             zzkr.zzce(iterable, this.zzd);
                }

                public final /* synthetic */ void zzn() {
/* 5 */             this.zzd = zzme.zzcv();
                }

                public final /* synthetic */ void zzo(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzb |= 1;
/* 10 */            this.zze = str;
                }

                public final /* synthetic */ void zzp(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzb |= 2;
/* 10 */            this.zzf = str;
                }
            }
