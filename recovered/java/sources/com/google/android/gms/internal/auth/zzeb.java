            package com.google.android.gms.internal.auth;

            import io.sentry.C1697u2;
            import java.nio.charset.Charset;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class zzeb extends zzea {
                protected final byte[] zza;

                public zzeb(byte[] bArr) {
/* 4 */             bArr.getClass();
/* 7 */             this.zza = bArr;
                }

                @Override // com.google.android.gms.internal.auth.zzee
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzee) || zzd() != ((zzee) obj).zzd()) {
/* 7 */                 return false;
                    }
/* 29 */            if (zzd() == 0) {
/* 1 */                 return true;
                    }
/* 34 */            if (!(obj instanceof zzeb)) {
/* 118 */               return obj.equals(this);
                    }
/* 36 */            zzeb zzebVar = (zzeb) obj;
/* 38 */            int iZzj = zzj();
/* 42 */            int iZzj2 = zzebVar.zzj();
/* 46 */            if (iZzj != 0 && iZzj2 != 0 && iZzj != iZzj2) {
/* 7 */                 return false;
                    }
/* 54 */            int iZzd = zzd();
/* 62 */            if (iZzd > zzebVar.zzd()) {
/* 114 */               C1697u2.m5432h(iZzd, zzd());
/* 7 */                 return false;
                    }
/* 68 */            if (iZzd > zzebVar.zzd()) {
/* 106 */               C1951n4.m6859j(AbstractC0886en.m3506j("Ran off end of other: 0, ", iZzd, zzebVar.zzd(), ", "));
/* 7 */                 return false;
                    }
/* 70 */            byte[] bArr = this.zza;
/* 72 */            byte[] bArr2 = zzebVar.zza;
/* 74 */            zzebVar.zzc();
/* 77 */            int i = 0;
/* 78 */            int i2 = 0;
/* 79 */            while (i < iZzd) {
/* 85 */                if (bArr[i] != bArr2[i2]) {
/* 7 */                     return false;
                        }
/* 88 */                i++;
/* 90 */                i2++;
                    }
/* 1 */             return true;
                }

                @Override // com.google.android.gms.internal.auth.zzee
                public byte zza(int i) {
/* 3 */             return this.zza[i];
                }

                @Override // com.google.android.gms.internal.auth.zzee
                public byte zzb(int i) {
/* 3 */             return this.zza[i];
                }

                public int zzc() {
/* 1 */             return 0;
                }

                @Override // com.google.android.gms.internal.auth.zzee
                public int zzd() {
/* 3 */             return this.zza.length;
                }

                @Override // com.google.android.gms.internal.auth.zzee
                public final int zze(int i, int i2, int i3) {
/* 4 */             return zzez.zzd(i, this.zza, 0, i3);
                }

                @Override // com.google.android.gms.internal.auth.zzee
                public final zzee zzf(int i, int i2) {
/* 6 */             int iZzi = zzee.zzi(0, i2, zzd());
                    return iZzi == 0 ? zzee.zzb : new zzdy(this.zza, 0, iZzi);
                }

                @Override // com.google.android.gms.internal.auth.zzee
                public final String zzg(Charset charset) {
/* 10 */            return new String(this.zza, 0, zzd(), charset);
                }

                @Override // com.google.android.gms.internal.auth.zzee
                public final boolean zzh() {
/* 8 */             return zzhm.zzd(this.zza, 0, zzd());
                }
            }
