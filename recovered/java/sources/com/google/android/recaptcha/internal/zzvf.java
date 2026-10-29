            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import p000.pk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzvf {
                static {
/* 5 */             if (zzvc.zzx() && zzvc.zzy()) {
/* 13 */                int i = zzqa.zza;
                    }
                }

                public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i2) {
/* 1 */             int i3 = i2 - i;
/* 4 */             byte b = bArr[i - 1];
/* 8 */             if (i3 == 0) {
/* 54 */                if (b <= -12) {
/* 56 */                    return b;
                        }
/* 57 */                return -1;
                    }
/* 13 */            if (i3 == 1) {
/* 43 */                byte b2 = bArr[i];
/* 45 */                if (b > -12 || b2 > -65) {
/* 57 */                    return -1;
                        }
/* 52 */                return (b2 << 8) ^ b;
                    }
/* 16 */            if (i3 != 2) {
/* 42 */                throw new AssertionError();
                    }
/* 18 */            byte b3 = bArr[i];
/* 21 */            byte b4 = bArr[i + 1];
/* 23 */            if (b > -12 || b3 > -65 || b4 > -65) {
/* 57 */                return -1;
                    }
/* 35 */            return (b4 << 16) ^ ((b3 << 8) ^ b);
                }

                public static int zzb(String str, byte[] bArr, int i, int i2) {
                    int i3;
                    int i4;
                    int i5;
                    char cCharAt;
/* 1 */             int length = str.length();
/* 6 */             int i6 = 0;
                    while (true) {
/* 7 */                 i3 = i + i2;
/* 11 */                if (i6 >= length || (i5 = i6 + i) >= i3 || (cCharAt = str.charAt(i6)) >= 128) {
                            break;
                        }
/* 24 */                bArr[i5] = (byte) cCharAt;
/* 26 */                i6++;
                    }
/* 29 */            if (i6 == length) {
/* 31 */                return i + length;
                    }
/* 33 */            int i7 = i + i6;
/* 34 */            while (i6 < length) {
/* 36 */                char cCharAt2 = str.charAt(i6);
/* 40 */                if (cCharAt2 < 128 && i7 < i3) {
/* 47 */                    bArr[i7] = (byte) cCharAt2;
/* 44 */                    i7++;
                        } else if (cCharAt2 < 2048 && i7 <= i3 - 2) {
/* 69 */                    bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
/* 75 */                    bArr[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
/* 62 */                    i7 += 2;
                        } else {
/* 85 */                    if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i7 > i3 - 3) {
/* 124 */                       if (i7 > i3 - 4) {
/* 199 */                           if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i4 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
/* 227 */                               throw new zzve(i6, length);
                                    }
/* 228 */                           pk3.m7473i(cCharAt2, i7);
/* 5 */                             return 0;
                                }
/* 126 */                       int i8 = i6 + 1;
/* 132 */                       if (i8 != str.length()) {
/* 134 */                           char cCharAt3 = str.charAt(i8);
/* 142 */                           if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
/* 148 */                               int i9 = i7 + 3;
/* 150 */                               int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
/* 159 */                               bArr[i7] = (byte) ((codePoint >>> 18) | 240);
/* 167 */                               bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
/* 175 */                               bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
/* 177 */                               i7 += 4;
/* 183 */                               bArr[i9] = (byte) ((codePoint & 63) | 128);
/* 185 */                               i6 = i8;
                                    } else {
/* 190 */                               i6 = i8;
                                    }
                                }
/* 198 */                       throw new zzve(i6 - 1, length);
                            }
/* 104 */                   bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
/* 112 */                   bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
/* 118 */                   bArr[i7 + 2] = (byte) ((cCharAt2 & '?') | 128);
/* 97 */                    i7 += 3;
                        }
/* 186 */               i6++;
                    }
/* 232 */           return i7;
                }

                public static int zzc(String str) {
/* 1 */             int length = str.length();
/* 6 */             int i = 0;
/* 7 */             while (i < length && str.charAt(i) < 128) {
/* 17 */                i++;
                    }
/* 20 */            int i2 = length;
/* 21 */            while (i < length) {
/* 23 */                char cCharAt = str.charAt(i);
/* 29 */                if (cCharAt >= 2048) {
/* 39 */                    int length2 = str.length();
/* 43 */                    int i3 = 0;
/* 44 */                    while (i < length2) {
/* 46 */                        char cCharAt2 = str.charAt(i);
/* 50 */                        if (cCharAt2 < 2048) {
/* 56 */                            i3 += (127 - cCharAt2) >>> 31;
                                } else {
/* 58 */                            i3 += 2;
/* 63 */                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
/* 76 */                                if (Character.codePointAt(str, i) < 65536) {
/* 86 */                                    throw new zzve(i, length2);
                                        }
/* 78 */                                i++;
                                    }
                                }
/* 87 */                        i++;
                            }
/* 90 */                    i2 += i3;
                            break;
                        }
/* 35 */                i2 += (127 - cCharAt) >>> 31;
/* 36 */                i++;
                    }
/* 91 */            if (i2 >= length) {
/* 93 */                return i2;
                    }
/* 101 */           pk3.m7471g(((long) i2) + 4294967296L);
/* 5 */             return 0;
                }

                public static String zzd(byte[] bArr, int i, int i2) throws zzsx {
                    int i3;
/* 1 */             int length = bArr.length;
/* 9 */             if ((((length - i) - i2) | i | i2) < 0) {
/* 176 */               C1697u2.m5440p("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)});
/* 8 */                 return null;
                    }
/* 11 */            int i4 = i + i2;
/* 13 */            char[] cArr = new char[i2];
/* 16 */            int i5 = 0;
/* 17 */            while (i < i4) {
/* 19 */                byte b = bArr[i];
/* 25 */                if (!zzvd.zzd(b)) {
                            break;
                        }
/* 27 */                i++;
/* 32 */                cArr[i5] = (char) b;
/* 29 */                i5++;
                    }
/* 36 */            int i6 = i5;
/* 37 */            while (i < i4) {
/* 39 */                int i7 = i + 1;
/* 41 */                byte b2 = bArr[i];
/* 47 */                if (zzvd.zzd(b2)) {
/* 52 */                    cArr[i6] = (char) b2;
/* 49 */                    i6++;
/* 55 */                    i = i7;
/* 56 */                    while (i < i4) {
/* 58 */                        byte b3 = bArr[i];
/* 64 */                        if (!zzvd.zzd(b3)) {
                                    break;
                                }
/* 66 */                        i++;
/* 71 */                        cArr[i6] = (char) b3;
/* 68 */                        i6++;
                            }
                        } else {
/* 79 */                    if (b2 < -32) {
/* 81 */                        if (i7 >= i4) {
/* 94 */                            pk3.m7475k("Protocol message had invalid UTF-8.");
/* 8 */                             return null;
                                }
/* 83 */                        i3 = i6 + 1;
/* 85 */                        i += 2;
/* 89 */                        zzvd.zzc(b2, bArr[i7], cArr, i6);
                            } else if (b2 < -16) {
/* 104 */                       if (i7 >= i4 - 1) {
/* 120 */                           pk3.m7475k("Protocol message had invalid UTF-8.");
/* 8 */                             return null;
                                }
/* 106 */                       i3 = i6 + 1;
/* 108 */                       int i8 = i + 2;
/* 112 */                       i += 3;
/* 116 */                       zzvd.zzb(b2, bArr[i7], bArr[i8], cArr, i6);
                            } else {
/* 126 */                       if (i7 >= i4 - 2) {
/* 148 */                           pk3.m7475k("Protocol message had invalid UTF-8.");
/* 8 */                             return null;
                                }
/* 130 */                       byte b4 = bArr[i7];
/* 132 */                       int i9 = i + 3;
/* 134 */                       byte b5 = bArr[i + 2];
/* 136 */                       i += 4;
/* 142 */                       zzvd.zza(b2, b4, b5, bArr[i9], cArr, i6);
/* 145 */                       i6 += 2;
                            }
/* 92 */                    i6 = i3;
                        }
                    }
/* 154 */           return new String(cArr, 0, i6);
                }

                /* JADX WARN: Code duplicated, block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
                /* JADX WARN: Code duplicated, block: B:53:0x007a A[ORIG_RETURN, RETURN] */
                /* JADX WARN: Multi-variable type inference failed */
                public static boolean zze(byte[] bArr, int i, int i2) {
/* 1 */             while (i < i2 && bArr[i] >= 0) {
/* 7 */                 i++;
                    }
/* 10 */            if (i >= i2) {
/* 123 */               return true;
                    }
/* 14 */            while (i < i2) {
/* 16 */                int i3 = i + 1;
/* 18 */                int iZza = bArr[i];
/* 20 */                if (iZza >= 0) {
/* 121 */                   i = i3;
                        } else if (iZza < -32) {
/* 28 */                    if (i3 >= i2) {
/* 88 */                        if (iZza != 0) {
/* 119 */                           return false;
                                }
/* 123 */                       return true;
                            }
/* 33 */                    if (iZza < -62) {
/* 119 */                       return false;
                            }
/* 35 */                    i += 2;
/* 39 */                    if (bArr[i3] > -65) {
/* 119 */                       return false;
                            }
                        } else if (iZza < -16) {
/* 48 */                    if (i3 >= i2 - 1) {
/* 50 */                        iZza = zza(bArr, i3, i2);
/* 88 */                        if (iZza != 0) {
/* 119 */                           return false;
                                }
/* 123 */                       return true;
                            }
/* 55 */                    int i4 = i + 2;
/* 57 */                    char c = bArr[i3];
/* 59 */                    if (c > -65) {
/* 119 */                       return false;
                            }
/* 63 */                    if (iZza == -32 && c < -96) {
/* 119 */                       return false;
                            }
/* 69 */                    if (iZza == -19 && c >= -96) {
/* 119 */                       return false;
                            }
/* 73 */                    i += 3;
/* 77 */                    if (bArr[i4] > -65) {
/* 119 */                       return false;
                            }
                        } else {
/* 82 */                    if (i3 >= i2 - 2) {
/* 84 */                        iZza = zza(bArr, i3, i2);
/* 88 */                        if (iZza != 0) {
/* 119 */                           return false;
                                }
/* 123 */                       return true;
                            }
/* 91 */                    int i5 = i + 2;
/* 93 */                    int i6 = bArr[i3];
/* 95 */                    if (i6 > -65) {
/* 119 */                       return false;
                            }
/* 104 */                   if ((((i6 + 112) + (iZza << 28)) >> 30) != 0) {
/* 119 */                       return false;
                            }
/* 106 */                   int i7 = i + 3;
/* 110 */                   if (bArr[i5] > -65) {
/* 119 */                       return false;
                            }
/* 112 */                   i += 4;
/* 116 */                   if (bArr[i7] > -65) {
/* 119 */                       return false;
                            }
                        }
                    }
/* 123 */           return true;
                }
            }
