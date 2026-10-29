            package com.google.android.gms.internal.measurement;

            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzlb extends zzlf {
                private final int zzc;

                public zzlb(byte[] bArr, int i, int i2) {
/* 1 */             super(bArr);
/* 6 */             zzlg.zzj(0, i2, bArr.length);
/* 9 */             this.zzc = i2;
                }

                @Override // com.google.android.gms.internal.measurement.zzlf, com.google.android.gms.internal.measurement.zzlg
                public final byte zza(int i) {
/* 1 */             int i2 = this.zzc;
/* 8 */             if (((i2 - (i + 1)) | i) >= 0) {
/* 89 */                return ((zzlf) this).zza[i];
                    }
/* 12 */            if (i < 0) {
/* 38 */                throw new ArrayIndexOutOfBoundsException(fm0.m3788n(new StringBuilder(String.valueOf(i).length() + 11), "Index < 0: ", i));
                    }
/* 60 */            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
/* 65 */            sb.append("Index > length: ");
/* 68 */            sb.append(i);
/* 73 */            sb.append(", ");
/* 76 */            sb.append(i2);
/* 86 */            throw new ArrayIndexOutOfBoundsException(sb.toString());
                }

                @Override // com.google.android.gms.internal.measurement.zzlf, com.google.android.gms.internal.measurement.zzlg
                public final byte zzb(int i) {
/* 3 */             return ((zzlf) this).zza[i];
                }

                @Override // com.google.android.gms.internal.measurement.zzlf, com.google.android.gms.internal.measurement.zzlg
                public final int zzc() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.measurement.zzlf
                public final int zzd() {
/* 1 */             return 0;
                }
            }
