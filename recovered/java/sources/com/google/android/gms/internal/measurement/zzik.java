            package com.google.android.gms.internal.measurement;

            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzik extends zzme implements zznm {
                private static final zzik zzf;
                private int zzb;
                private int zzd;
                private zzmm zze = zzme.zzct();

                static {
/* 3 */             zzik zzikVar = new zzik();
/* 6 */             zzf = zzikVar;
/* 10 */            zzme.zzcp(zzik.class, zzikVar);
                }

                private zzik() {
                }

                public static zzij zzf() {
/* 7 */             return (zzij) zzf.zzck();
                }

                public final boolean zza() {
                    return (this.zzb & 1) != 0;
                }

                public final int zzb() {
/* 1 */             return this.zzd;
                }

                public final List zzc() {
/* 1 */             return this.zze;
                }

                public final int zzd() {
/* 3 */             return this.zze.size();
                }

                public final long zze(int i) {
/* 3 */             return this.zze.zzc(i);
                }

                public final /* synthetic */ void zzg(int i) {
/* 5 */             this.zzb |= 1;
/* 7 */             this.zzd = i;
                }

                public final /* synthetic */ void zzh(Iterable iterable) {
/* 1 */             zzmm zzmmVar = this.zze;
/* 7 */             if (!zzmmVar.zza()) {
/* 13 */                this.zze = zzme.zzcu(zzmmVar);
                    }
/* 17 */            zzkr.zzce(iterable, this.zze);
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 54 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 48 */                return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzik();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzij(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzf;
                    }
/* 21 */            throw null;
                }
            }
