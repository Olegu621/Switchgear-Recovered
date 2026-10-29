            package com.google.android.recaptcha.internal;

            import java.io.IOException;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzpm extends zzpo {
                public zzpm(String str, String str2, Character ch) {
/* 7 */             zzpk zzpkVar = new zzpk(str, str2.toCharArray());
/* 10 */            super(zzpkVar, ch);
/* 25 */            zzmd.zza(zzpkVar.zzf.length == 64);
                }

                @Override // com.google.android.recaptcha.internal.zzpo, com.google.android.recaptcha.internal.zzpp
                public final int zza(byte[] bArr, CharSequence charSequence) throws zzpn {
/* 1 */             CharSequence charSequenceZze = zze(charSequence);
/* 5 */             int length = charSequenceZze.length();
/* 9 */             zzpk zzpkVar = this.zza;
/* 15 */            if (!zzpkVar.zzc(length)) {
/* 132 */               throw new zzpn(fm0.m3781g(charSequenceZze.length(), "Invalid input length "));
                    }
/* 17 */            int i = 0;
/* 18 */            int i2 = 0;
/* 23 */            while (i < charSequenceZze.length()) {
/* 47 */                int i3 = i2 + 1;
/* 49 */                int iZzb = (zzpkVar.zzb(charSequenceZze.charAt(i + 1)) << 12) | (zzpkVar.zzb(charSequenceZze.charAt(i)) << 18);
/* 53 */                bArr[i2] = (byte) (iZzb >>> 16);
/* 55 */                int i4 = i + 2;
/* 61 */                if (i4 < charSequenceZze.length()) {
/* 63 */                    int i5 = i + 3;
/* 75 */                    int iZzb2 = iZzb | (zzpkVar.zzb(charSequenceZze.charAt(i4)) << 6);
/* 76 */                    int i6 = i2 + 2;
/* 83 */                    bArr[i3] = (byte) ((iZzb2 >>> 8) & 255);
/* 89 */                    if (i5 < charSequenceZze.length()) {
/* 91 */                        i += 4;
/* 102 */                       i2 += 3;
/* 107 */                       bArr[i6] = (byte) ((iZzb2 | zzpkVar.zzb(charSequenceZze.charAt(i5))) & 255);
                            } else {
/* 110 */                       i2 = i6;
/* 111 */                       i = i5;
                            }
                        } else {
/* 113 */                   i = i4;
/* 114 */                   i2 = i3;
                        }
                    }
/* 116 */           return i2;
                }

                @Override // com.google.android.recaptcha.internal.zzpo, com.google.android.recaptcha.internal.zzpp
                public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
/* 2 */             int i3 = 0;
/* 3 */             zzmd.zzd(0, i2, bArr.length);
/* 8 */             for (int i4 = i2; i4 >= 3; i4 -= 3) {
/* 14 */                int i5 = bArr[i3] & 255;
/* 18 */                int i6 = bArr[i3 + 1] & 255;
/* 24 */                int i7 = bArr[i3 + 2] & 255;
/* 26 */                zzpk zzpkVar = this.zza;
/* 33 */                int i8 = (i6 << 8) | (i5 << 16) | i7;
/* 40 */                appendable.append(zzpkVar.zza(i8 >>> 18));
/* 51 */                appendable.append(zzpkVar.zza((i8 >>> 12) & 63));
/* 62 */                appendable.append(zzpkVar.zza((i8 >>> 6) & 63));
/* 71 */                appendable.append(zzpkVar.zza(i8 & 63));
/* 74 */                i3 += 3;
                    }
/* 79 */            if (i3 < i2) {
/* 82 */                zzf(appendable, bArr, i3, i2 - i3);
                    }
                }
            }
