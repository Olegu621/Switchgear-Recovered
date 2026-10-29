            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgn extends zzme implements zznm {
                private static final zzgn zzd;
                private zzmn zzb = zzme.zzcv();

                static {
/* 3 */             zzgn zzgnVar = new zzgn();
/* 6 */             zzd = zzgnVar;
/* 10 */            zzme.zzcp(zzgn.class, zzgnVar);
                }

                private zzgn() {
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 50 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 44 */                return zzme.zzcq(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzgn();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzgm(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzd;
                    }
/* 21 */            throw null;
                }
            }
