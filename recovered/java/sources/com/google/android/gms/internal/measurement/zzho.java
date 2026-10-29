            package com.google.android.gms.internal.measurement;

            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzho extends zzme implements zznm {
                private static final zzho zzd;
                private zzmn zzb = zzme.zzcv();

                static {
/* 3 */             zzho zzhoVar = new zzho();
/* 6 */             zzd = zzhoVar;
/* 10 */            zzme.zzcp(zzho.class, zzhoVar);
                }

                private zzho() {
                }

                public static zzhh zzb() {
/* 7 */             return (zzhh) zzd.zzck();
                }

                public static zzho zzc() {
/* 1 */             return zzd;
                }

                public final List zza() {
/* 1 */             return this.zzb;
                }

                public final /* synthetic */ void zzd(Iterable iterable) {
/* 1 */             zzmn zzmnVar = this.zzb;
/* 7 */             if (!zzmnVar.zza()) {
/* 13 */                this.zzb = zzme.zzcw(zzmnVar);
                    }
/* 17 */            zzkr.zzce(iterable, this.zzb);
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 52 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 46 */                return zzme.zzcq(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzhl.class});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzho();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzhh(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzd;
                    }
/* 21 */            throw null;
                }
            }
