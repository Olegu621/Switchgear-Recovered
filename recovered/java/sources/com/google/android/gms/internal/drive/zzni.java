            package com.google.android.gms.internal.drive;

            import io.sentry.C1697u2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 255 */   final class zzni extends zznh {
                @Override // com.google.android.gms.internal.drive.zznh
                public final int zzb(CharSequence charSequence, byte[] bArr, int i, int i2) {
                    int i3;
                    int i4;
                    char cCharAt;
/* 1 */             int length = charSequence.length();
/* 5 */             int i5 = i2 + i;
/* 6 */             int i6 = 0;
/* 9 */             while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = charSequence.charAt(i6)) < 128) {
/* 22 */                bArr[i4] = (byte) cCharAt;
/* 24 */                i6++;
                    }
/* 27 */            if (i6 == length) {
/* 29 */                return i + length;
                    }
/* 31 */            int i7 = i + i6;
/* 32 */            while (i6 < length) {
/* 34 */                char cCharAt2 = charSequence.charAt(i6);
/* 38 */                if (cCharAt2 < 128 && i7 < i5) {
/* 45 */                    bArr[i7] = (byte) cCharAt2;
/* 42 */                    i7++;
                        } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
/* 58 */                    int i8 = i7 + 1;
/* 65 */                    bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
/* 67 */                    i7 += 2;
/* 73 */                    bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
                        } else {
/* 82 */                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
/* 120 */                       if (i7 > i5 - 4) {
/* 195 */                           if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
/* 222 */                               throw new zznj(i6, length);
                                    }
/* 229 */                           StringBuilder sb = new StringBuilder(37);
/* 234 */                           sb.append("Failed writing ");
/* 237 */                           sb.append(cCharAt2);
/* 242 */                           sb.append(" at index ");
/* 245 */                           sb.append(i7);
/* 255 */                           throw new ArrayIndexOutOfBoundsException(sb.toString());
                                }
/* 122 */                       int i9 = i6 + 1;
/* 128 */                       if (i9 != charSequence.length()) {
/* 130 */                           char cCharAt3 = charSequence.charAt(i9);
/* 138 */                           if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
/* 140 */                               int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
/* 151 */                               bArr[i7] = (byte) ((codePoint >>> 18) | 240);
/* 161 */                               bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
/* 163 */                               int i10 = i7 + 3;
/* 171 */                               bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
/* 173 */                               i7 += 4;
/* 179 */                               bArr[i10] = (byte) ((codePoint & 63) | 128);
/* 181 */                               i6 = i9;
                                    } else {
/* 186 */                               i6 = i9;
                                    }
                                }
/* 194 */                       throw new zznj(i6 - 1, length);
                            }
/* 97 */                    bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
/* 99 */                    int i11 = i7 + 2;
/* 107 */                   bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
/* 109 */                   i7 += 3;
/* 115 */                   bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
                        }
/* 182 */               i6++;
                    }
/* 256 */           return i7;
                }

                @Override // com.google.android.gms.internal.drive.zznh
                public final String zzg(byte[] bArr, int i, int i2) throws zzkq {
/* 7 */             if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
/* 182 */               C1697u2.m5440p("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
/* 185 */               return null;
                    }
/* 9 */             int i3 = i + i2;
/* 11 */            char[] cArr = new char[i2];
/* 14 */            int i4 = 0;
/* 15 */            while (i < i3) {
/* 17 */                byte b = bArr[i];
/* 23 */                if (!zzng.zzd(b)) {
                            break;
                        }
/* 25 */                i++;
/* 1 */                 zzng.zza(b, cArr, i4);
/* 27 */                i4++;
                    }
/* 34 */            int i5 = i4;
/* 35 */            while (i < i3) {
/* 37 */                int i6 = i + 1;
/* 40 */                byte b2 = bArr[i];
/* 46 */                if (zzng.zzd(b2)) {
/* 48 */                    int i7 = i5 + 1;
/* 1 */                     zzng.zza(b2, cArr, i5);
/* 53 */                    int i8 = i6;
/* 54 */                    while (i8 < i3) {
/* 56 */                        byte b3 = bArr[i8];
/* 62 */                        if (!zzng.zzd(b3)) {
                                    break;
                                }
/* 64 */                        i8++;
/* 1 */                         zzng.zza(b3, cArr, i7);
/* 66 */                        i7++;
                            }
/* 73 */                    i5 = i7;
/* 74 */                    i = i8;
                        } else if (zzng.zze(b2)) {
/* 82 */                    if (i6 >= i3) {
/* 99 */                        throw zzkq.zzdn();
                            }
/* 84 */                    i += 2;
/* 5 */                     zzng.zza(b2, bArr[i6], cArr, i5);
/* 88 */                    i5++;
                        } else if (zzng.zzf(b2)) {
/* 108 */                   if (i6 >= i3 - 1) {
/* 129 */                       throw zzkq.zzdn();
                            }
/* 110 */                   int i9 = i + 2;
/* 114 */                   i += 3;
/* 6 */                     zzng.zza(b2, bArr[i6], bArr[i9], cArr, i5);
/* 118 */                   i5++;
                        } else {
/* 132 */                   if (i6 >= i3 - 2) {
/* 156 */                       throw zzkq.zzdn();
                            }
/* 136 */                   byte b4 = bArr[i6];
/* 138 */                   int i10 = i + 3;
/* 140 */                   byte b5 = bArr[i + 2];
/* 142 */                   i += 4;
/* 7 */                     zzng.zza(b2, b4, b5, bArr[i10], cArr, i5);
/* 149 */                   i5 += 2;
                        }
                    }
/* 159 */           return new String(cArr, 0, i5);
                }

                @Override // com.google.android.gms.internal.drive.zznh
/* 256 */       public final int zzb(int i, byte[] bArr, int i2, int i3) {
/* 257 */           while (i2 < i3 && bArr[i2] >= 0) {
                        i2++;
                    }
                    if (i2 >= i3) {
                        return 0;
                    }
                    while (i2 < i3) {
                        int i4 = i2 + 1;
/* 258 */               byte b = bArr[i2];
                        if (b < 0) {
                            if (b < -32) {
                                if (i4 >= i3) {
                                    return b;
                                }
                                if (b >= -62) {
                                    i2 += 2;
/* 259 */                           if (bArr[i4] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b < -16) {
                                if (i4 >= i3 - 1) {
/* 1 */                             return zznf.zzf(bArr, i4, i3);
                                }
                                int i5 = i2 + 2;
/* 261 */                       byte b2 = bArr[i4];
                                if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                                    i2 += 3;
                                    if (bArr[i5] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (i4 >= i3 - 2) {
/* 1 */                         return zznf.zzf(bArr, i4, i3);
                            }
                            int i6 = i2 + 2;
/* 263 */                   byte b3 = bArr[i4];
                            if (b3 <= -65) {
                                if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                                    int i7 = i2 + 3;
                                    if (bArr[i6] <= -65) {
                                        i2 += 4;
                                        if (bArr[i7] > -65) {
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        i2 = i4;
                    }
                    return 0;
                }
            }
