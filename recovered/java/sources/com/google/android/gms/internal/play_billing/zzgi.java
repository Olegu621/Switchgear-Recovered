            package com.google.android.gms.internal.play_billing;

            import io.sentry.C1697u2;
            import java.io.IOException;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class zzgi extends zzgh {
                protected final byte[] zza;

                public zzgi(byte[] bArr) {
/* 2 */             super(null);
/* 5 */             bArr.getClass();
/* 8 */             this.zza = bArr;
                }

                @Override // com.google.android.gms.internal.play_billing.zzgk
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzgk) || zzd() != ((zzgk) obj).zzd()) {
/* 7 */                 return false;
                    }
/* 29 */            if (zzd() == 0) {
/* 1 */                 return true;
                    }
/* 34 */            if (!(obj instanceof zzgi)) {
/* 118 */               return obj.equals(this);
                    }
/* 36 */            zzgi zzgiVar = (zzgi) obj;
/* 38 */            int iZzi = zzi();
/* 42 */            int iZzi2 = zzgiVar.zzi();
/* 46 */            if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
/* 7 */                 return false;
                    }
/* 54 */            int iZzd = zzd();
/* 62 */            if (iZzd > zzgiVar.zzd()) {
/* 114 */               C1697u2.m5432h(iZzd, zzd());
/* 7 */                 return false;
                    }
/* 68 */            if (iZzd > zzgiVar.zzd()) {
/* 106 */               C1951n4.m6859j(AbstractC0886en.m3506j("Ran off end of other: 0, ", iZzd, zzgiVar.zzd(), ", "));
/* 7 */                 return false;
                    }
/* 70 */            byte[] bArr = this.zza;
/* 72 */            byte[] bArr2 = zzgiVar.zza;
/* 74 */            zzgiVar.zzc();
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

                @Override // com.google.android.gms.internal.play_billing.zzgk
                public byte zza(int i) {
/* 3 */             return this.zza[i];
                }

                @Override // com.google.android.gms.internal.play_billing.zzgk
                public byte zzb(int i) {
/* 3 */             return this.zza[i];
                }

                public int zzc() {
/* 1 */             return 0;
                }

                @Override // com.google.android.gms.internal.play_billing.zzgk
                public int zzd() {
/* 3 */             return this.zza.length;
                }

                @Override // com.google.android.gms.internal.play_billing.zzgk
                public final int zze(int i, int i2, int i3) {
/* 4 */             return zzhp.zzb(i, this.zza, 0, i3);
                }

                @Override // com.google.android.gms.internal.play_billing.zzgk
                public final zzgk zzf(int i, int i2) {
/* 6 */             int iZzh = zzgk.zzh(0, i2, zzd());
                    return iZzh == 0 ? zzgk.zzb : new zzgf(this.zza, 0, iZzh);
                }

                @Override // com.google.android.gms.internal.play_billing.zzgk
                public final void zzg(zzgc zzgcVar) throws IOException {
/* 10 */            ((zzgo) zzgcVar).zzc(this.zza, 0, zzd());
                }
            }
