            package okio.internal;

            import io.flutter.plugin.editing.SpellCheckPlugin;
            import java.util.Arrays;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import okhttp3.HttpUrl;
            import okio.Utf8;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, m6176d2 = {"commonAsUtf8ToByteArray", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "commonToUtf8String", "beginIndex", HttpUrl.FRAGMENT_ENCODE_SET, SpellCheckPlugin.END_INDEX_KEY, "okio"}, m6177k = 2, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class _Utf8Kt {
                public static final byte[] commonAsUtf8ToByteArray(String str) {
                    int i;
                    char cCharAt;
/* 1 */             str.getClass();
/* 10 */            byte[] bArr = new byte[str.length() * 4];
/* 12 */            int length = str.length();
/* 16 */            int i2 = 0;
/* 17 */            while (i2 < length) {
/* 19 */                char cCharAt2 = str.charAt(i2);
/* 29 */                if (Intrinsics.m6217b(cCharAt2, 128) >= 0) {
/* 31 */                    int length2 = str.length();
/* 35 */                    int i3 = i2;
/* 36 */                    while (i2 < length2) {
/* 38 */                        char cCharAt3 = str.charAt(i2);
/* 46 */                        if (Intrinsics.m6217b(cCharAt3, 128) < 0) {
/* 49 */                            int i4 = i3 + 1;
/* 51 */                            bArr[i3] = (byte) cCharAt3;
/* 53 */                            i2++;
                                    while (true) {
/* 55 */                                i3 = i4;
/* 56 */                                if (i2 >= length2 || Intrinsics.m6217b(str.charAt(i2), 128) >= 0) {
                                            break;
                                        }
/* 75 */                                i4 = i3 + 1;
/* 77 */                                bArr[i3] = (byte) str.charAt(i2);
/* 68 */                                i2++;
                                    }
                                } else {
/* 87 */                            if (Intrinsics.m6217b(cCharAt3, 2048) < 0) {
/* 96 */                                bArr[i3] = (byte) ((cCharAt3 >> 6) | 192);
/* 102 */                               i3 += 2;
/* 104 */                               bArr[i3 + 1] = (byte) ((cCharAt3 & '?') | 128);
                                    } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
/* 211 */                               bArr[i3] = (byte) ((cCharAt3 >> '\f') | 224);
/* 220 */                               bArr[i3 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
/* 226 */                               i3 += 3;
/* 228 */                               bArr[i3 + 2] = (byte) ((cCharAt3 & '?') | 128);
                                    } else if (Intrinsics.m6217b(cCharAt3, 56319) > 0 || length2 <= (i = i2 + 1) || 56320 > (cCharAt = str.charAt(i)) || cCharAt >= 57344) {
/* 197 */                               bArr[i3] = Utf8.REPLACEMENT_BYTE;
/* 199 */                               i2++;
/* 195 */                               i3++;
                                    } else {
/* 155 */                               int iCharAt = (str.charAt(i) + (cCharAt3 << '\n')) - 56613888;
/* 163 */                               bArr[i3] = (byte) ((iCharAt >> 18) | 240);
/* 172 */                               bArr[i3 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
/* 181 */                               bArr[i3 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
/* 187 */                               i3 += 4;
/* 189 */                               bArr[i3 + 3] = (byte) ((iCharAt & 63) | 128);
/* 191 */                               i2 += 2;
                                    }
/* 106 */                           i2++;
                                }
                            }
/* 231 */                   return Arrays.copyOf(bArr, i3);
                        }
/* 237 */               bArr[i2] = (byte) cCharAt2;
/* 239 */               i2++;
                    }
/* 247 */           return Arrays.copyOf(bArr, str.length());
                }

                /* JADX WARN: Code duplicated, block: B:22:0x0045 A[PHI: r6
  0x0045: PHI (r6v12 int) = (r6v4 int), (r6v10 int), (r6v13 int), (r6v21 int), (r6v21 int), (r6v23 int), (r6v37 int), (r6v37 int) binds: [B:30:0x0063, B:21:0x0041, B:54:0x00c0, B:37:0x007f, B:39:0x0085, B:89:0x0152, B:60:0x00d3, B:62:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:29:0x0060 A[PHI: r6
  0x0060: PHI (r6v11 int) = (r6v8 int), (r6v9 int), (r6v14 int), (r6v21 int), (r6v24 int), (r6v37 int), (r6v37 int) binds: [B:28:0x005a, B:27:0x0055, B:53:0x00bb, B:39:0x0085, B:88:0x014c, B:64:0x00dd, B:66:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
                public static final String commonToUtf8String(byte[] bArr, int i, int i2) {
                    byte b;
                    int i3;
                    int i4;
                    int i5;
/* 3 */             int i6 = i;
/* 7 */             bArr.getClass();
/* 10 */            if (i6 < 0 || i2 > bArr.length || i6 > i2) {
/* 395 */               throw new ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i6 + " endIndex=" + i2);
                    }
/* 19 */            char[] cArr = new char[i2 - i6];
/* 22 */            int i7 = 0;
/* 23 */            while (i6 < i2) {
/* 25 */                byte b2 = bArr[i6];
/* 27 */                if (b2 >= 0) {
/* 30 */                    int i8 = i7 + 1;
/* 32 */                    cArr[i7] = (char) b2;
/* 34 */                    i6++;
                            while (true) {
/* 36 */                        i7 = i8;
/* 37 */                        if (i6 >= i2 || (b = bArr[i6]) < 0) {
                                    break;
                                }
/* 43 */                        i6++;
/* 46 */                        i8 = i7 + 1;
/* 48 */                        cArr[i7] = (char) b;
                            }
                        } else if ((b2 >> 5) == -2) {
/* 62 */                    int i9 = i6 + 1;
/* 64 */                    if (i2 <= i9) {
/* 66 */                        i3 = i7 + 1;
/* 68 */                        cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                            } else {
/* 73 */                        byte b3 = bArr[i9];
/* 77 */                        if ((b3 & 192) == 128) {
/* 83 */                            int i10 = (b2 << 6) ^ (b3 ^ 3968);
/* 84 */                            if (i10 < 128) {
/* 86 */                                i3 = i7 + 1;
/* 88 */                                cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                    } else {
/* 94 */                                cArr[i7] = (char) i10;
/* 92 */                                i3 = i7 + 1;
                                    }
/* 97 */                            i7 = i3;
/* 98 */                            i4 = 2;
/* 105 */                           i6 += i4;
                                } else {
/* 100 */                           i3 = i7 + 1;
/* 102 */                           cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                }
                            }
/* 70 */                    i7 = i3;
/* 71 */                    i4 = 1;
/* 105 */                   i6 += i4;
                        } else if ((b2 >> 4) == -2) {
/* 118 */                   int i11 = i6 + 2;
/* 120 */                   if (i2 <= i11) {
/* 122 */                       i3 = i7 + 1;
/* 124 */                       cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
/* 126 */                       int i12 = i6 + 1;
/* 128 */                       if (i2 <= i12 || (bArr[i12] & 192) != 128) {
/* 70 */                            i7 = i3;
/* 71 */                            i4 = 1;
                                } else {
/* 97 */                            i7 = i3;
/* 98 */                            i4 = 2;
                                }
                            } else {
/* 139 */                       byte b4 = bArr[i6 + 1];
/* 143 */                       if ((b4 & 192) == 128) {
/* 145 */                           byte b5 = bArr[i11];
/* 149 */                           if ((b5 & 192) == 128) {
/* 160 */                               int i13 = (b2 << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
/* 163 */                               if (i13 < 2048) {
/* 165 */                                   i3 = i7 + 1;
/* 167 */                                   cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if (55296 > i13 || i13 >= 57344) {
/* 182 */                                   cArr[i7] = (char) i13;
/* 180 */                                   i3 = i7 + 1;
                                        } else {
/* 174 */                                   i3 = i7 + 1;
/* 176 */                                   cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                        }
/* 185 */                               i7 = i3;
/* 186 */                               i4 = 3;
                                    } else {
/* 188 */                               i3 = i7 + 1;
/* 190 */                               cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
/* 97 */                                i7 = i3;
/* 98 */                                i4 = 2;
                                    }
                                } else {
/* 193 */                           i3 = i7 + 1;
/* 195 */                           cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
/* 70 */                            i7 = i3;
/* 71 */                            i4 = 1;
                                }
                            }
/* 105 */                   i6 += i4;
                        } else if ((b2 >> 3) == -2) {
/* 202 */                   int i14 = i6 + 3;
/* 204 */                   if (i2 <= i14) {
/* 206 */                       i3 = i7 + 1;
/* 208 */                       cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
/* 210 */                       int i15 = i6 + 1;
/* 212 */                       if (i2 <= i15 || (bArr[i15] & 192) != 128) {
/* 70 */                            i7 = i3;
/* 71 */                            i4 = 1;
                                } else {
/* 220 */                           int i16 = i6 + 2;
/* 222 */                           if (i2 <= i16 || (bArr[i16] & 192) != 128) {
/* 97 */                                i7 = i3;
/* 98 */                                i4 = 2;
                                    } else {
/* 185 */                               i7 = i3;
/* 186 */                               i4 = 3;
                                    }
                                }
                            } else {
/* 233 */                       byte b6 = bArr[i6 + 1];
/* 237 */                       if ((b6 & 192) == 128) {
/* 241 */                           byte b7 = bArr[i6 + 2];
/* 245 */                           if ((b7 & 192) == 128) {
/* 247 */                               byte b8 = bArr[i14];
/* 251 */                               if ((b8 & 192) == 128) {
/* 265 */                                   int i17 = (b2 << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12));
/* 269 */                                   if (i17 > 1114111) {
/* 271 */                                       i5 = i7 + 1;
/* 273 */                                       cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                            } else if ((55296 > i17 || i17 >= 57344) && i17 >= 65536 && i17 != 65533) {
/* 305 */                                       cArr[i7] = (char) ((i17 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
/* 316 */                                       cArr[i7 + 1] = (char) ((i17 & 1023) + Utf8.LOG_SURROGATE_HEADER);
/* 314 */                                       i5 = i7 + 2;
                                            } else {
/* 320 */                                       i5 = i7 + 1;
/* 322 */                                       cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                            }
/* 324 */                                   i4 = 4;
/* 325 */                                   i7 = i5;
                                        } else {
/* 328 */                                   i3 = i7 + 1;
/* 330 */                                   cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
/* 185 */                                   i7 = i3;
/* 186 */                                   i4 = 3;
                                        }
                                    } else {
/* 333 */                               i3 = i7 + 1;
/* 335 */                               cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
/* 97 */                                i7 = i3;
/* 98 */                                i4 = 2;
                                    }
                                } else {
/* 339 */                           i3 = i7 + 1;
/* 341 */                           cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
/* 70 */                            i7 = i3;
/* 71 */                            i4 = 1;
                                }
                            }
/* 105 */                   i6 += i4;
                        } else {
/* 347 */                   cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
/* 349 */                   i6++;
/* 345 */                   i7++;
                        }
                    }
/* 354 */           return C1852e.m6256f(cArr, 0, i7);
                }

                public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i, int i2, int i3, Object obj) {
/* 3 */             if ((i3 & 1) != 0) {
/* 5 */                 i = 0;
                    }
/* 8 */             if ((i3 & 2) != 0) {
/* 10 */                i2 = bArr.length;
                    }
/* 11 */            return commonToUtf8String(bArr, i, i2);
                }
            }
