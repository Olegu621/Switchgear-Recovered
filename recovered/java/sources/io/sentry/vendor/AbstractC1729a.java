            package io.sentry.vendor;

            import java.util.GregorianCalendar;
            import java.util.SimpleTimeZone;
            import p000.C1951n4;
            
            /* JADX INFO: renamed from: io.sentry.vendor.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC1729a {

                /* JADX INFO: renamed from: a */
                public static final byte[] f11767a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

                /* JADX INFO: renamed from: a */
                public static boolean m5489a(String str, int i, char c) {
                    return i < str.length() && str.charAt(i) == c;
                }

                /* JADX INFO: renamed from: b */
                public static byte[] m5490b(byte[] bArr) {
                    byte[] bArr2;
/* 1 */             int length = bArr.length;
/* 4 */             int i = (length / 3) * 4;
/* 6 */             int i2 = length % 3;
/* 10 */            if (i2 == 1) {
/* 18 */                i += 2;
                    } else if (i2 == 2) {
/* 15 */                i += 3;
                    }
/* 20 */            byte[] bArr3 = new byte[i];
/* 22 */            int i3 = 0;
/* 24 */            int i4 = 0;
/* 25 */            int i5 = -1;
                    while (true) {
/* 26 */                int i6 = i3 + 3;
/* 28 */                bArr2 = f11767a;
/* 32 */                if (i6 > length) {
                            break;
                        }
/* 55 */                int i7 = (bArr[i3 + 2] & 255) | ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 8);
/* 62 */                bArr3[i4] = bArr2[(i7 >> 18) & 63];
/* 72 */                bArr3[i4 + 1] = bArr2[(i7 >> 12) & 63];
/* 82 */                bArr3[i4 + 2] = bArr2[(i7 >> 6) & 63];
/* 90 */                bArr3[i4 + 3] = bArr2[i7 & 63];
/* 92 */                int i8 = i4 + 4;
/* 94 */                i5--;
/* 95 */                if (i5 == 0) {
/* 97 */                    i4 += 5;
/* 99 */                    bArr3[i8] = 10;
/* 101 */                   i5 = 19;
                        } else {
/* 105 */                   i4 = i8;
                        }
/* 103 */               i3 = i6;
                    }
/* 109 */           if (i3 == length - 1) {
/* 115 */               int i9 = (bArr[i3] & 255) << 4;
/* 125 */               bArr3[i4] = bArr2[(i9 >> 6) & 63];
/* 131 */               bArr3[i4 + 1] = bArr2[i9 & 63];
/* 133 */               return bArr3;
                    }
/* 135 */           if (i3 == length - 2) {
/* 149 */               int i10 = ((bArr[i3 + 1] & 255) << 2) | ((bArr[i3] & 255) << 10);
/* 158 */               bArr3[i4] = bArr2[(i10 >> 12) & 63];
/* 167 */               bArr3[i4 + 1] = bArr2[(i10 >> 6) & 63];
/* 173 */               bArr3[i4 + 2] = bArr2[i10 & 63];
                    }
/* 175 */           return bArr3;
                }

                /* JADX INFO: renamed from: c */
                public static long m5491c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
/* 8 */             long j = i - (i2 <= 2 ? 1 : 0);
/* 12 */            long jM5493e = m5493e(j, 400L);
/* 18 */            int i9 = (int) (j - (400 * jM5493e));
/* 76 */            return (((((long) i6) * 1000) + ((((long) i5) * 60000) + ((((long) i4) * 3600000) + ((((jM5493e * 146097) + ((long) ((((i9 / 4) + (i9 * 365)) - (i9 / 100)) + ((((((i2 + (i2 > 2 ? -3 : 9)) * 153) + 2) / 5) + i3) - 1)))) - 719468) * 86400000)))) + ((long) i7)) - ((long) i8);
                }

                /* JADX INFO: renamed from: d */
                public static long m5492d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
/* 10 */            GregorianCalendar gregorianCalendar = new GregorianCalendar(new SimpleTimeZone(i8, "GMT"));
/* 14 */            gregorianCalendar.setLenient(false);
/* 18 */            gregorianCalendar.set(1, i);
/* 23 */            gregorianCalendar.set(2, i2 - 1);
/* 27 */            gregorianCalendar.set(5, i3);
/* 32 */            gregorianCalendar.set(11, i4);
/* 37 */            gregorianCalendar.set(12, i5);
/* 42 */            gregorianCalendar.set(13, i6);
/* 47 */            gregorianCalendar.set(14, i7);
/* 50 */            return gregorianCalendar.getTimeInMillis();
                }

                /* JADX INFO: renamed from: e */
                public static long m5493e(long j, long j2) {
                    int i;
/* 1 */             long j3 = j / j2;
                    return (j - (j2 * j3) != 0 && (i = ((int) ((j ^ j2) >> 63)) | 1) < 0) ? j3 + ((long) i) : j3;
                }

                /* JADX INFO: renamed from: f */
                public static void m5494f(StringBuilder sb, int i, int i2) {
/* 1 */             if (i < 0) {
/* 5 */                 sb.append('-');
/* 9 */                 m5494f(sb, -i, i2);
/* 12 */                return;
                    }
/* 13 */            String string = Integer.toString(i);
/* 22 */            for (int length = i2 - string.length(); length > 0; length--) {
/* 26 */                sb.append('0');
                    }
/* 32 */            sb.append(string);
                }

                /* JADX INFO: renamed from: g */
                public static int m5495g(String str, int i, int i2) {
/* 1 */             if (i < 0 || i2 > str.length() || i >= i2) {
/* 56 */                throw new NumberFormatException(str);
                    }
/* 11 */            int i3 = 0;
/* 13 */            for (int i4 = i; i4 < i2; i4++) {
/* 15 */                char cCharAt = str.charAt(i4);
/* 21 */                if (cCharAt < '0' || cCharAt > '9') {
/* 49 */                    throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
                        }
/* 30 */                i3 = ((i3 * 10) + cCharAt) - 48;
                    }
/* 50 */            return i3;
                }

                /* JADX INFO: renamed from: h */
                public static long m5496h(String str) {
                    int i;
                    int iM5495g;
                    int i2;
                    int i3;
                    int iM5495g2;
                    int i4;
                    boolean z;
                    char cCharAt;
                    int i5;
                    int iM5495g3;
                    int i6;
                    boolean z2;
/* 3 */             int length = str.length();
/* 9 */             int iM5495g4 = m5495g(str, 0, 4);
/* 23 */            int i7 = m5489a(str, 4, '-') ? 5 : 4;
/* 24 */            int i8 = i7 + 2;
/* 26 */            int iM5495g5 = m5495g(str, i7, i8);
/* 34 */            if (m5489a(str, i8, '-')) {
/* 36 */                i8 = i7 + 3;
                    }
/* 38 */            int i9 = i8 + 2;
/* 40 */            int iM5495g6 = m5495g(str, i8, i9);
/* 79 */            if (!m5489a(str, i9, 'T')) {
/* 81 */                if (i9 == length) {
/* 89 */                    return new GregorianCalendar(iM5495g4, iM5495g5 - 1, iM5495g6).getTimeInMillis();
                        }
/* 94 */                char cCharAt2 = str.charAt(i9);
/* 98 */                if (cCharAt2 != 'Z' && cCharAt2 != '+' && cCharAt2 != '-') {
/* 107 */                   C1951n4.m6859j("Invalid date separator");
/* 68 */                    return 0L;
                        }
/* 111 */               char cCharAt3 = str.charAt(i9);
/* 115 */               if (cCharAt3 == 'Z') {
/* 117 */                   i5 = i8 + 3;
/* 119 */                   z2 = true;
/* 120 */                   i6 = 0;
                        } else {
/* 122 */                   if (cCharAt3 != '+' && cCharAt3 != '-') {
/* 127 */                       C1951n4.m6859j("Invalid time zone indicator");
/* 68 */                        return 0L;
                            }
/* 131 */                   i2 = cCharAt3 == '+' ? 1 : -1;
/* 137 */                   int i10 = i8 + 5;
/* 139 */                   int iM5495g7 = m5495g(str, i8 + 3, i10);
/* 147 */                   if (m5489a(str, i10, ':')) {
/* 149 */                       i10 = i8 + 6;
                            }
/* 151 */                   int i11 = i10 + 2;
/* 153 */                   if (length >= i11) {
/* 155 */                       iM5495g3 = m5495g(str, i10, i11);
/* 159 */                       i5 = i11;
                            } else {
/* 161 */                       i5 = i10;
/* 162 */                       iM5495g3 = 0;
                            }
/* 163 */                   if (iM5495g7 < 0 || iM5495g7 > 23 || iM5495g3 < 0 || iM5495g3 > 59) {
/* 235 */                       C1951n4.m6859j("Invalid time zone");
/* 68 */                        return 0L;
                            }
/* 179 */                   i6 = i2 * ((int) ((((long) iM5495g3) * 60000) + (((long) iM5495g7) * 3600000)));
/* 183 */                   z2 = false;
                        }
/* 184 */               if (!z2 && i5 != length) {
/* 191 */                   C1951n4.m6859j("Invalid trailing characters");
/* 68 */                    return 0L;
                        }
/* 195 */               if (iM5495g4 < 1582 || (iM5495g4 == 1582 && (iM5495g5 < 10 || (iM5495g5 == 10 && iM5495g6 < 15)))) {
/* 230 */                   return m5492d(iM5495g4, iM5495g5, iM5495g6, 0, 0, 0, 0, i6);
                        }
/* 212 */               m5497i(iM5495g4, iM5495g5, iM5495g6);
/* 221 */               return m5491c(iM5495g4, iM5495g5, iM5495g6, 0, 0, 0, 0, i6);
                    }
/* 241 */           m5497i(iM5495g4, iM5495g5, iM5495g6);
/* 246 */           int i12 = i8 + 5;
/* 248 */           int iM5495g8 = m5495g(str, i8 + 3, i12);
/* 256 */           if (m5489a(str, i12, ':')) {
/* 258 */               i12 = i8 + 6;
                    }
/* 260 */           int i13 = i12 + 2;
/* 262 */           int iM5495g9 = m5495g(str, i12, i13);
/* 270 */           if (m5489a(str, i13, ':')) {
/* 272 */               i13 = i12 + 3;
                    }
/* 274 */           if (length <= i13 || (cCharAt = str.charAt(i13)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
/* 377 */               i = 0;
/* 378 */               iM5495g = 0;
                    } else {
/* 286 */               int i14 = i13 + 2;
/* 288 */               iM5495g = m5495g(str, i13, i14);
/* 292 */               if (iM5495g > 59 && iM5495g < 63) {
/* 298 */                   iM5495g = 59;
                        }
/* 305 */               if (m5489a(str, i14, '.')) {
/* 307 */                   int i15 = i13 + 3;
/* 309 */                   int length2 = i15;
                            while (true) {
/* 314 */                       if (length2 >= str.length()) {
/* 334 */                           length2 = str.length();
                                    break;
                                }
/* 316 */                       char cCharAt4 = str.charAt(length2);
/* 322 */                       if (cCharAt4 < '0' || cCharAt4 > '9') {
                                    break;
                                }
/* 329 */                       length2++;
                            }
/* 338 */                   if (length2 == i15) {
/* 370 */                       C1951n4.m6859j("Missing millisecond digits");
/* 68 */                        return 0L;
                            }
/* 342 */                   int iMin = Math.min(length2, i13 + 6);
/* 346 */                   int iM5495g10 = m5495g(str, i15, iMin);
/* 350 */                   int i16 = iMin - i15;
/* 351 */                   if (i16 == 1) {
/* 360 */                       iM5495g10 *= 100;
                            } else if (i16 == 2) {
/* 357 */                       iM5495g10 *= 10;
                            }
/* 362 */                   int i17 = length2;
/* 364 */                   i = iM5495g10;
/* 365 */                   i13 = i17;
                        } else {
/* 374 */                   i13 = i14;
/* 375 */                   i = 0;
                        }
                    }
/* 379 */           if (iM5495g8 < 0 || iM5495g8 > 23 || iM5495g9 < 0 || iM5495g9 > 59 || iM5495g < 0 || iM5495g > 59 || i < 0 || i > 999) {
/* 544 */               C1951n4.m6859j("Invalid time");
/* 68 */                return 0L;
                    }
/* 399 */           if (length <= i13) {
/* 538 */               C1951n4.m6859j("No time zone indicator");
/* 68 */                return 0L;
                    }
/* 401 */           char cCharAt5 = str.charAt(i13);
/* 407 */           if (cCharAt5 == 'Z') {
/* 409 */               i3 = i13 + 1;
/* 411 */               z = true;
/* 412 */               i4 = 0;
                    } else {
/* 416 */               if (cCharAt5 != '+' && cCharAt5 != '-') {
/* 423 */                   C1951n4.m6859j("Invalid time zone indicator");
/* 68 */                    return 0L;
                        }
/* 427 */               i2 = cCharAt5 == '+' ? 1 : -1;
/* 433 */               int i18 = i13 + 3;
/* 435 */               int iM5495g11 = m5495g(str, i13 + 1, i18);
/* 445 */               if (m5489a(str, i18, ':')) {
/* 447 */                   i18 = i13 + 4;
                        }
/* 449 */               i3 = i18 + 2;
/* 451 */               if (length >= i3) {
/* 453 */                   iM5495g2 = m5495g(str, i18, i3);
                        } else {
/* 458 */                   i3 = i18;
/* 459 */                   iM5495g2 = 0;
                        }
/* 460 */               if (iM5495g11 < 0 || iM5495g11 > 23 || iM5495g2 < 0 || iM5495g2 > 59) {
/* 532 */                   C1951n4.m6859j("Invalid time zone");
/* 68 */                    return 0L;
                        }
/* 479 */               i4 = i2 * ((int) ((((long) iM5495g2) * 60000) + (((long) iM5495g11) * 3600000)));
/* 483 */               z = false;
                    }
/* 484 */           if (z || i3 == length) {
                        return (iM5495g4 < 1582 || (iM5495g4 == 1582 && (iM5495g5 < 10 || (iM5495g5 == 10 && iM5495g6 < 15)))) ? m5492d(iM5495g4, iM5495g5, iM5495g6, iM5495g8, iM5495g9, iM5495g, i, i4) : m5491c(iM5495g4, iM5495g5, iM5495g6, iM5495g8, iM5495g9, iM5495g, i, i4);
                    }
/* 491 */           C1951n4.m6859j("Invalid trailing characters");
/* 68 */            return 0L;
                }

                /* JADX INFO: renamed from: i */
                public static void m5497i(int i, int i2, int i3) {
                    int i4;
/* 2 */             if (i >= 1 && i2 >= 1 && i2 <= 12 && i3 >= 1) {
/* 13 */                if (i2 != 2) {
/* 32 */                    i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
                        } else {
/* 50 */                    i4 = (i % 4 != 0 || (i % 100 == 0 && i % 400 != 0)) ? 28 : 29;
                        }
/* 52 */                if (i3 <= i4) {
/* 54 */                    return;
                        }
                    }
/* 57 */            C1951n4.m6859j("Invalid date");
                }
            }
