            package com.google.android.gms.internal.fido;

            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbj extends zzbk {
                public zzbj(String str, String str2, Character ch) {
/* 7 */             zzbh zzbhVar = new zzbh(str, str2.toCharArray());
/* 10 */            super(zzbhVar, ch);
/* 25 */            zzas.zzc(zzbhVar.zzf.length == 64);
                }

                @Override // com.google.android.gms.internal.fido.zzbk, com.google.android.gms.internal.fido.zzbl
                public final void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
/* 2 */             int i3 = 0;
/* 3 */             zzas.zze(0, i2, bArr.length);
/* 8 */             for (int i4 = i2; i4 >= 3; i4 -= 3) {
/* 14 */                int i5 = bArr[i3] & 255;
/* 33 */                int i6 = ((bArr[i3 + 1] & 255) << 8) | (i5 << 16) | (bArr[i3 + 2] & 255);
/* 40 */                appendable.append(this.zzb.zza(i6 >>> 18));
/* 53 */                appendable.append(this.zzb.zza((i6 >>> 12) & 63));
/* 66 */                appendable.append(this.zzb.zza((i6 >>> 6) & 63));
/* 77 */                appendable.append(this.zzb.zza(i6 & 63));
/* 80 */                i3 += 3;
                    }
/* 85 */            if (i3 < i2) {
/* 88 */                zzc(appendable, bArr, i3, i2 - i3);
                    }
                }
            }
