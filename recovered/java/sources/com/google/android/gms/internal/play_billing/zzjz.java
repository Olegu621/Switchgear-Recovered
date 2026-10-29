            package com.google.android.gms.internal.play_billing;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjz extends zzhk implements zzin {
                private static final zzjz zzb;
                private int zzd;
                private int zze = 0;
                private Object zzf;
                private int zzg;
                private zzki zzh;

                static {
/* 3 */             zzjz zzjzVar = new zzjz();
/* 6 */             zzb = zzjzVar;
/* 10 */            zzhk.zzx(zzjz.class, zzjzVar);
                }

                private zzjz() {
                }

                public static zzjz zzC(byte[] bArr, zzgw zzgwVar) throws zzhr {
/* 7 */             return (zzjz) zzhk.zzq(zzb, bArr, zzgwVar);
                }

                public static /* synthetic */ void zzD(zzjz zzjzVar, zzki zzkiVar) {
/* 1 */             zzkiVar.getClass();
/* 4 */             zzjzVar.zzh = zzkiVar;
/* 10 */            zzjzVar.zzd |= 2;
                }

                public static /* synthetic */ void zzE(zzjz zzjzVar, zzlb zzlbVar) {
/* 1 */             zzlbVar.getClass();
/* 4 */             zzjzVar.zzf = zzlbVar;
/* 7 */             zzjzVar.zze = 4;
                }

                public static /* synthetic */ void zzF(zzjz zzjzVar, int i) {
/* 3 */             zzjzVar.zzg = i - 1;
/* 9 */             zzjzVar.zzd |= 1;
                }

                public static zzjx zzc() {
/* 7 */             return (zzjx) zzb.zzm();
                }

                @Override // com.google.android.gms.internal.play_billing.zzhk
                public final Object zzd(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 62 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 56 */                return zzhk.zzu(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzka.zza, "zzh", zzlb.class});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzjz();
                    }
/* 12 */            zzjy zzjyVar = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzjx(zzjyVar);
                    }
/* 16 */            if (i2 != 5) {
/* 12 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
