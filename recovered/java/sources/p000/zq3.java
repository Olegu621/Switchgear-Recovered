            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zq3 {

                /* JADX INFO: renamed from: a */
                public static final cg3 f20295a;

                static {
/* 3 */             if (tq3.f17234e && tq3.f17233d) {
/* 9 */                 int i = wm3.f18690a;
                    }
/* 18 */            f20295a = new cg3(14);
                }

                /* JADX INFO: renamed from: a */
                public static int m10424a(String str) {
/* 1 */             int length = str.length();
/* 5 */             int i = 0;
/* 6 */             int i2 = 0;
/* 7 */             while (i2 < length && str.charAt(i2) < 128) {
/* 17 */                i2++;
                    }
/* 20 */            int i3 = length;
/* 21 */            while (i2 < length) {
/* 23 */                char cCharAt = str.charAt(i2);
/* 29 */                if (cCharAt >= 2048) {
/* 39 */                    int length2 = str.length();
/* 43 */                    while (i2 < length2) {
/* 45 */                        char cCharAt2 = str.charAt(i2);
/* 49 */                        if (cCharAt2 < 2048) {
/* 55 */                            i += (127 - cCharAt2) >>> 31;
                                } else {
/* 57 */                            i += 2;
/* 62 */                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
/* 75 */                                if (Character.codePointAt(str, i2) < 65536) {
/* 85 */                                    throw new uq3(i2, length2);
                                        }
/* 77 */                                i2++;
                                    }
                                }
/* 86 */                        i2++;
                            }
/* 89 */                    i3 += i;
                            break;
                        }
/* 35 */                i3 += (127 - cCharAt) >>> 31;
/* 36 */                i2++;
                    }
/* 90 */            if (i3 >= length) {
/* 92 */                return i3;
                    }
/* 101 */           long j = ((long) i3) + 4294967296L;
/* 114 */           StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 34);
/* 119 */           sb.append("UTF-8 length does not fit in int: ");
/* 122 */           sb.append(j);
/* 132 */           throw new IllegalArgumentException(sb.toString());
                }

                /* JADX INFO: renamed from: b */
                public static int m10425b(String str, byte[] bArr, int i, int i2) {
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
/* 60 */                    int i8 = i7 + 1;
/* 67 */                    bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
/* 69 */                    i7 += 2;
/* 75 */                    bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
                        } else {
/* 84 */                    if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i7 > i3 - 3) {
/* 122 */                       if (i7 > i3 - 4) {
/* 197 */                           if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i4 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
/* 225 */                               throw new uq3(i6, length);
                                    }
/* 245 */                           pk3.m7476l(String.valueOf(cCharAt2).length() + 25 + String.valueOf(i7).length(), cCharAt2, i7);
/* 5 */                             return 0;
                                }
/* 124 */                       int i9 = i6 + 1;
/* 130 */                       if (i9 != str.length()) {
/* 132 */                           char cCharAt3 = str.charAt(i9);
/* 140 */                           if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
/* 142 */                               int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
/* 153 */                               bArr[i7] = (byte) ((codePoint >>> 18) | 240);
/* 163 */                               bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
/* 165 */                               int i10 = i7 + 3;
/* 173 */                               bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
/* 175 */                               i7 += 4;
/* 181 */                               bArr[i10] = (byte) ((codePoint & 63) | 128);
/* 183 */                               i6 = i9;
                                    } else {
/* 188 */                               i6 = i9;
                                    }
                                }
/* 196 */                       throw new uq3(i6 - 1, length);
                            }
/* 99 */                    bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
/* 101 */                   int i11 = i7 + 2;
/* 109 */                   bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
/* 111 */                   i7 += 3;
/* 117 */                   bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
                        }
/* 184 */               i6++;
                    }
/* 249 */           return i7;
                }

                /* JADX INFO: renamed from: c */
                public static /* synthetic */ int m10426c(byte[] bArr, int i, int i2) {
/* 1 */             int i3 = i2 - i;
/* 4 */             byte b = bArr[i - 1];
/* 9 */             if (i3 == 0) {
/* 57 */                if (b > -12) {
/* 8 */                     return -1;
                        }
/* 60 */                return b;
                    }
/* 14 */            if (i3 == 1) {
/* 45 */                byte b2 = bArr[i];
/* 47 */                if (b > -12 || b2 > -65) {
/* 8 */                     return -1;
                        }
/* 54 */                return (b2 << 8) ^ b;
                    }
/* 17 */            if (i3 != 2) {
/* 44 */                throw new AssertionError();
                    }
/* 19 */            byte b3 = bArr[i];
/* 22 */            byte b4 = bArr[i + 1];
/* 24 */            if (b > -12 || b3 > -65 || b4 > -65) {
/* 8 */                 return -1;
                    }
/* 36 */            return (b4 << 16) ^ ((b3 << 8) ^ b);
                }
            }
