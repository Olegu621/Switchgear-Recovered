            package com.google.android.gms.internal.drive;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzjh extends zzjm {
                private final int zznv;
                private final int zznw;

                public zzjh(byte[] bArr, int i, int i2) {
/* 1 */             super(bArr);
/* 7 */             zzjc.zzb(i, i + i2, bArr.length);
/* 10 */            this.zznv = i;
/* 12 */            this.zznw = i2;
                }

                @Override // com.google.android.gms.internal.drive.zzjm, com.google.android.gms.internal.drive.zzjc
                public final int size() {
/* 1 */             return this.zznw;
                }

                @Override // com.google.android.gms.internal.drive.zzjm
                public final int zzbw() {
/* 1 */             return this.zznv;
                }

                @Override // com.google.android.gms.internal.drive.zzjm, com.google.android.gms.internal.drive.zzjc
                public final byte zzs(int i) {
/* 1 */             int size = size();
/* 10 */            if (((size - (i + 1)) | i) >= 0) {
/* 77 */                return this.zzny[this.zznv + i];
                    }
/* 12 */            if (i < 0) {
/* 20 */                StringBuilder sb = new StringBuilder(22);
/* 25 */                sb.append("Index < 0: ");
/* 28 */                sb.append(i);
/* 38 */                throw new ArrayIndexOutOfBoundsException(sb.toString());
                    }
/* 45 */            StringBuilder sb2 = new StringBuilder(40);
/* 50 */            sb2.append("Index > length: ");
/* 53 */            sb2.append(i);
/* 58 */            sb2.append(", ");
/* 61 */            sb2.append(size);
/* 71 */            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }

                @Override // com.google.android.gms.internal.drive.zzjm, com.google.android.gms.internal.drive.zzjc
                public final byte zzt(int i) {
/* 6 */             return this.zzny[this.zznv + i];
                }
            }
