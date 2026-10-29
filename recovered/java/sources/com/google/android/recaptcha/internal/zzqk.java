            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.io.IOException;
            import java.nio.charset.Charset;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class zzqk extends zzqj {
                protected final byte[] zza;

                public zzqk(byte[] bArr) {
/* 2 */             super(null);
/* 5 */             bArr.getClass();
/* 8 */             this.zza = bArr;
                }

                @Override // com.google.android.recaptcha.internal.zzqm
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzqm) || zzd() != ((zzqm) obj).zzd()) {
/* 7 */                 return false;
                    }
/* 29 */            if (zzd() == 0) {
/* 1 */                 return true;
                    }
/* 34 */            if (!(obj instanceof zzqk)) {
/* 118 */               return obj.equals(this);
                    }
/* 36 */            zzqk zzqkVar = (zzqk) obj;
/* 38 */            int iZzk = zzk();
/* 42 */            int iZzk2 = zzqkVar.zzk();
/* 46 */            if (iZzk != 0 && iZzk2 != 0 && iZzk != iZzk2) {
/* 7 */                 return false;
                    }
/* 54 */            int iZzd = zzd();
/* 62 */            if (iZzd > zzqkVar.zzd()) {
/* 114 */               C1697u2.m5432h(iZzd, zzd());
/* 7 */                 return false;
                    }
/* 68 */            if (iZzd > zzqkVar.zzd()) {
/* 106 */               C1951n4.m6859j(AbstractC0886en.m3506j("Ran off end of other: 0, ", iZzd, zzqkVar.zzd(), ", "));
/* 7 */                 return false;
                    }
/* 70 */            byte[] bArr = this.zza;
/* 72 */            byte[] bArr2 = zzqkVar.zza;
/* 74 */            zzqkVar.zzc();
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

                @Override // com.google.android.recaptcha.internal.zzqm
                public byte zza(int i) {
/* 3 */             return this.zza[i];
                }

                @Override // com.google.android.recaptcha.internal.zzqm
                public byte zzb(int i) {
/* 3 */             return this.zza[i];
                }

                public int zzc() {
/* 1 */             return 0;
                }

                @Override // com.google.android.recaptcha.internal.zzqm
                public int zzd() {
/* 3 */             return this.zza.length;
                }

                @Override // com.google.android.recaptcha.internal.zzqm
                public void zze(byte[] bArr, int i, int i2, int i3) {
/* 4 */             System.arraycopy(this.zza, 0, bArr, 0, i3);
                }

                @Override // com.google.android.recaptcha.internal.zzqm
                public final int zzf(int i, int i2, int i3) {
/* 4 */             return zzsv.zzb(i, this.zza, 0, i3);
                }

                @Override // com.google.android.recaptcha.internal.zzqm
                public final zzqm zzg(int i, int i2) {
/* 6 */             int iZzj = zzqm.zzj(0, i2, zzd());
                    return iZzj == 0 ? zzqm.zzb : new zzqh(this.zza, 0, iZzj);
                }

                @Override // com.google.android.recaptcha.internal.zzqm
                public final String zzh(Charset charset) {
/* 10 */            return new String(this.zza, 0, zzd(), charset);
                }

                @Override // com.google.android.recaptcha.internal.zzqm
                public final void zzi(zzqe zzqeVar) throws IOException {
/* 10 */            ((zzqs) zzqeVar).zzc(this.zza, 0, zzd());
                }
            }
