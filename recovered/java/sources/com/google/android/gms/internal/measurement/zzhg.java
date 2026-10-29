            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhg extends zzme implements zznm {
                private static final zzhg zzh;
                private int zzb;
                private int zzd;
                private zzii zze;
                private zzii zzf;
                private boolean zzg;

                static {
/* 3 */             zzhg zzhgVar = new zzhg();
/* 6 */             zzh = zzhgVar;
/* 10 */            zzme.zzcp(zzhg.class, zzhgVar);
                }

                private zzhg() {
                }

                public static zzhf zzh() {
/* 7 */             return (zzhf) zzh.zzck();
                }

                public final boolean zza() {
                    return (this.zzb & 1) != 0;
                }

                public final int zzb() {
/* 1 */             return this.zzd;
                }

                public final zzii zzc() {
/* 1 */             zzii zziiVar = this.zze;
                    return zziiVar == null ? zzii.zzj() : zziiVar;
                }

                public final boolean zzd() {
                    return (this.zzb & 4) != 0;
                }

                public final zzii zze() {
/* 1 */             zzii zziiVar = this.zzf;
                    return zziiVar == null ? zzii.zzj() : zziiVar;
                }

                public final boolean zzf() {
                    return (this.zzb & 8) != 0;
                }

                public final boolean zzg() {
/* 1 */             return this.zzg;
                }

                public final /* synthetic */ void zzi(int i) {
/* 5 */             this.zzb |= 1;
/* 7 */             this.zzd = i;
                }

                public final /* synthetic */ void zzj(zzii zziiVar) {
/* 1 */             zziiVar.getClass();
/* 4 */             this.zze = zziiVar;
/* 10 */            this.zzb |= 2;
                }

                public final /* synthetic */ void zzk(zzii zziiVar) {
/* 1 */             this.zzf = zziiVar;
/* 7 */             this.zzb |= 4;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 58 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 52 */                return zzme.zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzhg();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzhf(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzh;
                    }
/* 21 */            throw null;
                }

                public final /* synthetic */ void zzm(boolean z) {
/* 5 */             this.zzb |= 8;
/* 7 */             this.zzg = z;
                }
            }
