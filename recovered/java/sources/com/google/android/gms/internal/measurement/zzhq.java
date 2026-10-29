            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhq extends zzme implements zznm {
                private static final zzhq zzf;
                private int zzb;
                private int zzd;
                private long zze;

                static {
/* 3 */             zzhq zzhqVar = new zzhq();
/* 6 */             zzf = zzhqVar;
/* 10 */            zzme.zzcp(zzhq.class, zzhqVar);
                }

                private zzhq() {
                }

                public static zzhp zze() {
/* 7 */             return (zzhp) zzf.zzck();
                }

                public final boolean zza() {
                    return (this.zzb & 1) != 0;
                }

                public final int zzb() {
/* 1 */             return this.zzd;
                }

                public final boolean zzc() {
                    return (this.zzb & 2) != 0;
                }

                public final long zzd() {
/* 1 */             return this.zze;
                }

                public final /* synthetic */ void zzf(int i) {
/* 5 */             this.zzb |= 1;
/* 7 */             this.zzd = i;
                }

                public final /* synthetic */ void zzg(long j) {
/* 5 */             this.zzb |= 2;
/* 7 */             this.zze = j;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 54 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 48 */                return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzhq();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzhp(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzf;
                    }
/* 21 */            throw null;
                }
            }
