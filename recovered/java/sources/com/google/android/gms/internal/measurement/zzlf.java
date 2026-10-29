            package com.google.android.gms.internal.measurement;

            import java.io.IOException;
            import p000.pk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class zzlf extends zzle {
                protected final byte[] zza;

                public zzlf(byte[] bArr) {
/* 2 */             super(null);
/* 5 */             bArr.getClass();
/* 8 */             this.zza = bArr;
                }

                @Override // com.google.android.gms.internal.measurement.zzlg
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzlg) || zzc() != ((zzlg) obj).zzc()) {
/* 7 */                 return false;
                    }
/* 29 */            if (zzc() == 0) {
/* 1 */                 return true;
                    }
/* 34 */            if (!(obj instanceof zzlf)) {
/* 148 */               return obj.equals(this);
                    }
/* 36 */            zzlf zzlfVar = (zzlf) obj;
/* 38 */            int iZzi = zzi();
/* 42 */            int iZzi2 = zzlfVar.zzi();
/* 46 */            if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
/* 7 */                 return false;
                    }
/* 54 */            int iZzc = zzc();
/* 62 */            if (iZzc > zzlfVar.zzc()) {
/* 121 */               int iZzc2 = zzc();
/* 144 */               pk3.m7474j(String.valueOf(iZzc).length() + 18 + String.valueOf(iZzc2).length(), iZzc, iZzc2);
/* 7 */                 return false;
                    }
/* 68 */            if (iZzc > zzlfVar.zzc()) {
/* 94 */                int iZzc3 = zzlfVar.zzc();
/* 117 */               pk3.m7467c(String.valueOf(iZzc).length() + 27 + String.valueOf(iZzc3).length(), iZzc, iZzc3);
/* 7 */                 return false;
                    }
/* 70 */            byte[] bArr = this.zza;
/* 72 */            byte[] bArr2 = zzlfVar.zza;
/* 74 */            zzlfVar.zzd();
/* 77 */            int i = 0;
/* 78 */            int i2 = 0;
/* 79 */            while (i < iZzc) {
/* 85 */                if (bArr[i] != bArr2[i2]) {
/* 7 */                     return false;
                        }
/* 88 */                i++;
/* 90 */                i2++;
                    }
/* 1 */             return true;
                }

                @Override // com.google.android.gms.internal.measurement.zzlg
                public byte zza(int i) {
/* 3 */             return this.zza[i];
                }

                @Override // com.google.android.gms.internal.measurement.zzlg
                public byte zzb(int i) {
/* 3 */             return this.zza[i];
                }

                @Override // com.google.android.gms.internal.measurement.zzlg
                public int zzc() {
/* 3 */             return this.zza.length;
                }

                public int zzd() {
/* 1 */             return 0;
                }

                @Override // com.google.android.gms.internal.measurement.zzlg
                public final zzlg zze(int i, int i2) {
/* 6 */             int iZzj = zzlg.zzj(0, i2, zzc());
                    return iZzj == 0 ? zzlg.zzb : new zzlb(this.zza, 0, iZzj);
                }

                @Override // com.google.android.gms.internal.measurement.zzlg
                public final void zzf(zzky zzkyVar) throws IOException {
/* 10 */            ((zzlj) zzkyVar).zzv(this.zza, 0, zzc());
                }

                @Override // com.google.android.gms.internal.measurement.zzlg
                public final int zzg(int i, int i2, int i3) {
/* 4 */             return zzmo.zzc(i, this.zza, 0, i3);
                }
            }
