            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzig extends zzme implements zznm {
                private static final zzig zzf;
                private int zzb;
                private int zzd = 1;
                private zzmn zze = zzme.zzcv();

                static {
/* 3 */             zzig zzigVar = new zzig();
/* 6 */             zzf = zzigVar;
/* 10 */            zzme.zzcp(zzig.class, zzigVar);
                }

                private zzig() {
                }

                public static zzie zza() {
/* 7 */             return (zzie) zzf.zzck();
                }

                public final /* synthetic */ void zzb(zzhu zzhuVar) {
/* 1 */             zzhuVar.getClass();
/* 4 */             zzmn zzmnVar = this.zze;
/* 10 */            if (!zzmnVar.zza()) {
/* 16 */                this.zze = zzme.zzcw(zzmnVar);
                    }
/* 20 */            this.zze.add(zzhuVar);
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 58 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 52 */                return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", zzif.zza, "zze", zzhu.class});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzig();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzie(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzf;
                    }
/* 21 */            throw null;
                }
            }
