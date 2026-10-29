            package com.google.android.gms.internal.drive;

            import java.io.IOException;
            import java.nio.charset.Charset;
            import p000.pk3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 84 */    class zzjm extends zzjl {
                protected final byte[] zzny;

                public zzjm(byte[] bArr) {
/* 4 */             bArr.getClass();
/* 7 */             this.zzny = bArr;
                }

                @Override // com.google.android.gms.internal.drive.zzjc
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzjc) || size() != ((zzjc) obj).size()) {
/* 7 */                 return false;
                    }
/* 29 */            if (size() == 0) {
/* 1 */                 return true;
                    }
/* 34 */            if (!(obj instanceof zzjm)) {
/* 62 */                return obj.equals(this);
                    }
/* 36 */            zzjm zzjmVar = (zzjm) obj;
/* 38 */            int iZzbv = zzbv();
/* 42 */            int iZzbv2 = zzjmVar.zzbv();
/* 46 */            if (iZzbv == 0 || iZzbv2 == 0 || iZzbv == iZzbv2) {
/* 57 */                return zza(zzjmVar, 0, size());
                    }
/* 7 */             return false;
                }

                @Override // com.google.android.gms.internal.drive.zzjc
                public int size() {
/* 3 */             return this.zzny.length;
                }

                @Override // com.google.android.gms.internal.drive.zzjl
                public final boolean zza(zzjc zzjcVar, int i, int i2) {
/* 6 */             if (i2 > zzjcVar.size()) {
/* 82 */                pk3.m7474j(40, i2, size());
/* 5 */                 return false;
                    }
/* 12 */            if (i2 > zzjcVar.size()) {
/* 72 */                pk3.m7467c(59, i2, zzjcVar.size());
/* 5 */                 return false;
                    }
/* 16 */            if (!(zzjcVar instanceof zzjm)) {
/* 61 */                return zzjcVar.zza(0, i2).equals(zza(0, i2));
                    }
/* 18 */            zzjm zzjmVar = (zzjm) zzjcVar;
/* 20 */            byte[] bArr = this.zzny;
/* 22 */            byte[] bArr2 = zzjmVar.zzny;
/* 28 */            int iZzbw = zzbw() + i2;
/* 29 */            int iZzbw2 = zzbw();
/* 33 */            int iZzbw3 = zzjmVar.zzbw();
/* 37 */            while (iZzbw2 < iZzbw) {
/* 43 */                if (bArr[iZzbw2] != bArr2[iZzbw3]) {
/* 5 */                     return false;
                        }
/* 46 */                iZzbw2++;
/* 48 */                iZzbw3++;
                    }
/* 51 */            return true;
                }

                @Override // com.google.android.gms.internal.drive.zzjc
                public final boolean zzbu() {
/* 1 */             int iZzbw = zzbw();
/* 12 */            return zznf.zze(this.zzny, iZzbw, size() + iZzbw);
                }

                public int zzbw() {
/* 1 */             return 0;
                }

                @Override // com.google.android.gms.internal.drive.zzjc
                public byte zzs(int i) {
/* 3 */             return this.zzny[i];
                }

                @Override // com.google.android.gms.internal.drive.zzjc
                public byte zzt(int i) {
/* 3 */             return this.zzny[i];
                }

                @Override // com.google.android.gms.internal.drive.zzjc
/* 85 */        public final void zza(zzjb zzjbVar) throws IOException {
/* 86 */            zzjbVar.zza(this.zzny, zzbw(), size());
                }

                @Override // com.google.android.gms.internal.drive.zzjc
/* 86 */        public final String zza(Charset charset) {
/* 87 */            return new String(this.zzny, zzbw(), size(), charset);
                }

                @Override // com.google.android.gms.internal.drive.zzjc
/* 87 */        public final zzjc zza(int i, int i2) {
/* 88 */            int iZzb = zzjc.zzb(0, i2, size());
                    if (iZzb == 0) {
/* 89 */                return zzjc.zznq;
                    }
/* 90 */            return new zzjh(this.zzny, zzbw(), iZzb);
                }

                @Override // com.google.android.gms.internal.drive.zzjc
/* 90 */        public final int zza(int i, int i2, int i3) {
/* 91 */            return zzkm.zza(i, this.zzny, zzbw(), i3);
                }
            }
