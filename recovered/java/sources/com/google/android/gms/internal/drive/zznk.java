            package com.google.android.gms.internal.drive;

            import io.sentry.C1697u2;
            import p000.pk3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 307 */   final class zznk extends zznh {
                private static int zza(byte[] bArr, int i, long j, int i2) {
/* 1 */             if (i2 == 0) {
/* 1 */                 return zznf.zzay(i);
                    }
/* 4 */             if (i2 == 1) {
/* 1 */                 return zznf.zzr(i, zznd.zza(bArr, j));
                    }
/* 7 */             if (i2 == 2) {
/* 10 */                return zznf.zzc(i, zznd.zza(bArr, j), zznd.zza(bArr, j + 1));
                    }
/* 30 */            throw new AssertionError();
                }

                @Override // com.google.android.gms.internal.drive.zznh
                public final int zzb(CharSequence charSequence, byte[] bArr, int i, int i2) {
                    long j;
                    long j2;
                    int i3;
                    char cCharAt;
                    long j3 = i;
/* 11 */            long j4 = ((long) i2) + j3;
/* 12 */            int length = charSequence.length();
/* 16 */            int i4 = 0;
/* 17 */            if (length > i2 || bArr.length - i2 < i) {
/* 305 */               pk3.m7476l(37, charSequence.charAt(length - 1), i + i2);
/* 16 */                return 0;
                    }
                    while (true) {
/* 23 */                j = 1;
/* 27 */                if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                            break;
                        }
/* 37 */                zznd.zza(bArr, j3, (byte) cCharAt);
/* 40 */                i4++;
/* 35 */                j3 = 1 + j3;
                    }
/* 44 */            if (i4 == length) {
/* 46 */                return (int) j3;
                    }
/* 48 */            while (i4 < length) {
/* 50 */                char cCharAt2 = charSequence.charAt(i4);
/* 54 */                if (cCharAt2 < 128 && j3 < j4) {
/* 63 */                    zznd.zza(bArr, j3, (byte) cCharAt2);
/* 66 */                    j2 = j;
/* 60 */                    j3 += j;
                        } else if (cCharAt2 >= 2048 || j3 > j4 - 2) {
/* 105 */                   j2 = j;
/* 115 */                   if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j3 > j4 - 3) {
/* 160 */                       if (j3 > j4 - 4) {
/* 236 */                           if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
/* 259 */                               throw new zznj(i4, length);
                                    }
/* 266 */                           StringBuilder sb = new StringBuilder(46);
/* 271 */                           sb.append("Failed writing ");
/* 274 */                           sb.append(cCharAt2);
/* 279 */                           sb.append(" at index ");
/* 282 */                           sb.append(j3);
/* 292 */                           throw new ArrayIndexOutOfBoundsException(sb.toString());
                                }
/* 162 */                       int i5 = i4 + 1;
/* 164 */                       if (i5 != length) {
/* 166 */                           char cCharAt3 = charSequence.charAt(i5);
/* 174 */                           if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
/* 176 */                               int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
/* 187 */                               zznd.zza(bArr, j3, (byte) ((codePoint >>> 18) | 240));
/* 197 */                               zznd.zza(bArr, j3 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
/* 200 */                               long j5 = j3 + 3;
/* 208 */                               zznd.zza(bArr, 2 + j3, (byte) (((codePoint >>> 6) & 63) | 128));
/* 211 */                               j3 += 4;
/* 217 */                               zznd.zza(bArr, j5, (byte) ((codePoint & 63) | 128));
/* 220 */                               i4 = i5;
                                    } else {
/* 227 */                               i4 = i5;
                                    }
                                }
/* 235 */                       throw new zznj(i4 - 1, length);
                            }
/* 132 */                   zznd.zza(bArr, j3, (byte) ((cCharAt2 >>> '\f') | 480));
/* 135 */                   long j6 = 2 + j3;
/* 142 */                   zznd.zza(bArr, j3 + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
/* 145 */                   j3 += 3;
/* 150 */                   zznd.zza(bArr, j6, (byte) ((cCharAt2 & '?') | 128));
                        } else {
/* 83 */                    j2 = j;
/* 85 */                    long j7 = j3 + j2;
/* 92 */                    zznd.zza(bArr, j3, (byte) ((cCharAt2 >>> 6) | 960));
/* 95 */                    j3 += 2;
/* 100 */                   zznd.zza(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                        }
/* 221 */               i4++;
/* 223 */               j = j2;
                    }
/* 293 */           return (int) j3;
                }

                @Override // com.google.android.gms.internal.drive.zznh
                public final String zzg(byte[] bArr, int i, int i2) throws zzkq {
/* 7 */             if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
/* 211 */               C1697u2.m5440p("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
/* 214 */               return null;
                    }
/* 9 */             int i3 = i + i2;
/* 11 */            char[] cArr = new char[i2];
/* 14 */            int i4 = 0;
/* 15 */            while (i < i3) {
/* 18 */                byte bZza = zznd.zza(bArr, i);
/* 26 */                if (!zzng.zzd(bZza)) {
                            break;
                        }
/* 28 */                i++;
/* 1 */                 zzng.zza(bZza, cArr, i4);
/* 30 */                i4++;
                    }
/* 37 */            int i5 = i4;
/* 38 */            while (i < i3) {
/* 40 */                int i6 = i + 1;
/* 43 */                byte bZza2 = zznd.zza(bArr, i);
/* 51 */                if (zzng.zzd(bZza2)) {
/* 53 */                    int i7 = i5 + 1;
/* 1 */                     zzng.zza(bZza2, cArr, i5);
/* 58 */                    while (i6 < i3) {
/* 61 */                        byte bZza3 = zznd.zza(bArr, i6);
/* 69 */                        if (!zzng.zzd(bZza3)) {
                                    break;
                                }
/* 71 */                        i6++;
/* 1 */                         zzng.zza(bZza3, cArr, i7);
/* 73 */                        i7++;
                            }
/* 80 */                    i5 = i7;
/* 81 */                    i = i6;
                        } else if (zzng.zze(bZza2)) {
/* 89 */                    if (i6 >= i3) {
/* 109 */                       throw zzkq.zzdn();
                            }
/* 91 */                    i += 2;
/* 5 */                     zzng.zza(bZza2, zznd.zza(bArr, i6), cArr, i5);
/* 98 */                    i5++;
                        } else if (zzng.zzf(bZza2)) {
/* 118 */                   if (i6 >= i3 - 1) {
/* 145 */                       throw zzkq.zzdn();
                            }
/* 120 */                   int i8 = i + 2;
/* 127 */                   i += 3;
/* 6 */                     zzng.zza(bZza2, zznd.zza(bArr, i6), zznd.zza(bArr, i8), cArr, i5);
/* 134 */                   i5++;
                        } else {
/* 148 */                   if (i6 >= i3 - 2) {
/* 185 */                       throw zzkq.zzdn();
                            }
/* 153 */                   byte bZza4 = zznd.zza(bArr, i6);
/* 157 */                   int i9 = i + 3;
/* 160 */                   byte bZza5 = zznd.zza(bArr, i + 2);
/* 164 */                   i += 4;
/* 7 */                     zzng.zza(bZza2, bZza4, bZza5, zznd.zza(bArr, i9), cArr, i5);
/* 177 */                   i5 += 2;
                        }
                    }
/* 188 */           return new String(cArr, 0, i5);
                }

                @Override // com.google.android.gms.internal.drive.zznh
/* 308 */       public final int zzb(int i, byte[] bArr, int i2, int i3) {
                    int i4;
                    long j;
/* 309 */           if ((i2 | i3 | (bArr.length - i3)) < 0) {
/* 321 */               C1697u2.m5440p("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)});
                        return 0;
                    }
                    long j2 = i2;
                    int i5 = (int) (((long) i3) - j2);
                    long j3 = 1;
                    if (i5 >= 16) {
                        i4 = 0;
                        long j4 = j2;
                        while (true) {
                            if (i4 >= i5) {
                                i4 = i5;
                                break;
                            }
                            long j5 = j4 + 1;
/* 310 */                   if (zznd.zza(bArr, j4) < 0) {
                                break;
                            }
                            i4++;
                            j4 = j5;
                        }
                    } else {
                        i4 = 0;
                    }
                    int i6 = i5 - i4;
                    long j6 = j2 + ((long) i4);
                    while (true) {
                        byte b = 0;
                        while (i6 > 0) {
                            long j7 = j6 + j3;
/* 311 */                   byte bZza = zznd.zza(bArr, j6);
                            if (bZza < 0) {
                                b = bZza;
                                j6 = j7;
                                break;
                            }
                            i6--;
                            b = bZza;
                            j6 = j7;
                        }
                        if (i6 == 0) {
                            return 0;
                        }
                        int i7 = i6 - 1;
                        if (b >= -32) {
                            if (b >= -16) {
                                j = j3;
                                if (i7 < 3) {
/* 316 */                           return zza(bArr, b, j6, i7);
                                }
                                i6 -= 4;
                                long j8 = j6 + j;
/* 317 */                       byte bZza2 = zznd.zza(bArr, j6);
                                if (bZza2 > -65) {
                                    break;
                                }
                                if ((((bZza2 + 112) + (b << 28)) >> 30) != 0) {
                                    break;
                                }
                                long j9 = 2 + j6;
/* 318 */                       if (zznd.zza(bArr, j8) > -65) {
                                    break;
                                }
                                j6 += 3;
/* 319 */                       if (zznd.zza(bArr, j9) > -65) {
                                    break;
                                }
                            } else {
                                if (i7 < 2) {
/* 313 */                           return zza(bArr, b, j6, i7);
                                }
                                i6 -= 3;
                                j = j3;
                                long j10 = j6 + j;
/* 314 */                       byte bZza3 = zznd.zza(bArr, j6);
                                if (bZza3 <= -65 && ((b != -32 || bZza3 >= -96) && (b != -19 || bZza3 < -96))) {
                                    j6 += 2;
/* 315 */                           if (zznd.zza(bArr, j10) > -65) {
                                    }
                                }
                                return -1;
                            }
                        } else {
                            if (i7 == 0) {
                                return b;
                            }
                            i6 -= 2;
                            if (b >= -62) {
                                long j11 = j6 + j3;
/* 312 */                       if (zznd.zza(bArr, j6) <= -65) {
                                    j6 = j11;
                                    j = j3;
                                }
                            }
                            return -1;
                        }
                        j3 = j;
                    }
                    return -1;
                }
            }
