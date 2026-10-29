            package com.google.android.gms.internal.measurement;

            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzii extends zzme implements zznm {
                private static final zzii zzg;
                private zzmm zzb = zzme.zzct();
                private zzmm zzd = zzme.zzct();
                private zzmn zze = zzme.zzcv();
                private zzmn zzf = zzme.zzcv();

                static {
/* 3 */             zzii zziiVar = new zzii();
/* 6 */             zzg = zziiVar;
/* 10 */            zzme.zzcp(zzii.class, zziiVar);
                }

                private zzii() {
                }

                public static zzih zzi() {
/* 7 */             return (zzih) zzg.zzck();
                }

                public static zzii zzj() {
/* 1 */             return zzg;
                }

                public final List zza() {
/* 1 */             return this.zzb;
                }

                public final int zzb() {
/* 3 */             return this.zzb.size();
                }

                public final List zzc() {
/* 1 */             return this.zzd;
                }

                public final int zzd() {
/* 3 */             return this.zzd.size();
                }

                public final List zze() {
/* 1 */             return this.zze;
                }

                public final int zzf() {
/* 3 */             return this.zze.size();
                }

                public final List zzg() {
/* 1 */             return this.zzf;
                }

                public final int zzh() {
/* 3 */             return this.zzf.size();
                }

                public final /* synthetic */ void zzk(Iterable iterable) {
/* 1 */             zzmm zzmmVar = this.zzb;
/* 7 */             if (!zzmmVar.zza()) {
/* 13 */                this.zzb = zzme.zzcu(zzmmVar);
                    }
/* 17 */            zzkr.zzce(iterable, this.zzb);
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 60 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 54 */                return zzme.zzcq(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", zzhq.class, "zzf", zzik.class});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzii();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzih(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzg;
                    }
/* 21 */            throw null;
                }

                public final /* synthetic */ void zzm() {
/* 5 */             this.zzb = zzme.zzct();
                }

                public final /* synthetic */ void zzn(Iterable iterable) {
/* 1 */             zzmm zzmmVar = this.zzd;
/* 7 */             if (!zzmmVar.zza()) {
/* 13 */                this.zzd = zzme.zzcu(zzmmVar);
                    }
/* 17 */            zzkr.zzce(iterable, this.zzd);
                }

                public final /* synthetic */ void zzo() {
/* 5 */             this.zzd = zzme.zzct();
                }

                public final /* synthetic */ void zzp(Iterable iterable) {
/* 1 */             zzmn zzmnVar = this.zze;
/* 7 */             if (!zzmnVar.zza()) {
/* 13 */                this.zze = zzme.zzcw(zzmnVar);
                    }
/* 17 */            zzkr.zzce(iterable, this.zze);
                }

                public final /* synthetic */ void zzq() {
/* 5 */             this.zze = zzme.zzcv();
                }

                public final /* synthetic */ void zzr(Iterable iterable) {
/* 1 */             zzmn zzmnVar = this.zzf;
/* 7 */             if (!zzmnVar.zza()) {
/* 13 */                this.zzf = zzme.zzcw(zzmnVar);
                    }
/* 17 */            zzkr.zzce(iterable, this.zzf);
                }

                public final /* synthetic */ void zzs() {
/* 5 */             this.zzf = zzme.zzcv();
                }
            }
