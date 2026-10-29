            package com.google.android.gms.internal.measurement;

            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzja extends zzme implements zznm {
                private static final zzja zzf;
                private int zzb;
                private zzmn zzd = zzme.zzcv();
                private zziw zze;

                static {
/* 3 */             zzja zzjaVar = new zzja();
/* 6 */             zzf = zzjaVar;
/* 10 */            zzme.zzcp(zzja.class, zzjaVar);
                }

                private zzja() {
                }

                public final List zza() {
/* 1 */             return this.zzd;
                }

                public final zziw zzb() {
/* 1 */             zziw zziwVar = this.zze;
                    return zziwVar == null ? zziw.zzc() : zziwVar;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 56 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 50 */                return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", zzje.class, "zze"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzja();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zziz(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzf;
                    }
/* 21 */            throw null;
                }
            }
