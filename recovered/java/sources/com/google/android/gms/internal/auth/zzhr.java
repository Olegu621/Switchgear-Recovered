            package com.google.android.gms.internal.auth;

            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhr extends zzeu implements zzfx {
                private static final zzhr zzb;
                private zzey zzd = zzeu.zzc();

                static {
/* 3 */             zzhr zzhrVar = new zzhr();
/* 6 */             zzb = zzhrVar;
/* 10 */            zzeu.zzg(zzhr.class, zzhrVar);
                }

                private zzhr() {
                }

                public static zzhr zzk(byte[] bArr) throws zzfa {
/* 7 */             return (zzhr) zzeu.zzb(zzb, bArr);
                }

                @Override // com.google.android.gms.internal.auth.zzeu
                public final Object zzi(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 50 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 44 */                return zzeu.zzf(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzhr();
                    }
/* 12 */            zzhp zzhpVar = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzhq(zzhpVar);
                    }
/* 16 */            if (i2 != 5) {
/* 12 */                return null;
                    }
/* 19 */            return zzb;
                }

                public final List zzl() {
/* 1 */             return this.zzd;
                }
            }
