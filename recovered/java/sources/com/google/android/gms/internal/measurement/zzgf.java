            package com.google.android.gms.internal.measurement;

            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgf extends zzme implements zznm {
                private static final zzgf zzi;
                private int zzb;
                private boolean zzg;
                private zzmn zzd = zzme.zzcv();
                private zzmn zze = zzme.zzcv();
                private zzmn zzf = zzme.zzcv();
                private zzmn zzh = zzme.zzcv();

                static {
/* 3 */             zzgf zzgfVar = new zzgf();
/* 6 */             zzi = zzgfVar;
/* 10 */            zzme.zzcp(zzgf.class, zzgfVar);
                }

                private zzgf() {
                }

                public static zzgf zzg() {
/* 1 */             return zzi;
                }

                public final List zza() {
/* 1 */             return this.zzd;
                }

                public final List zzb() {
/* 1 */             return this.zze;
                }

                public final List zzc() {
/* 1 */             return this.zzf;
                }

                public final boolean zzd() {
                    return (this.zzb & 1) != 0;
                }

                public final boolean zze() {
/* 1 */             return this.zzg;
                }

                public final List zzf() {
/* 1 */             return this.zzh;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 68 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 62 */                return zzme.zzcq(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", zzfu.class, "zze", zzfw.class, "zzf", zzgc.class, "zzg", "zzh", zzfu.class});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzgf();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzfs(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzi;
                    }
/* 21 */            throw null;
                }
            }
