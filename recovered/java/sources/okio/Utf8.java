            package okio;

            import io.flutter.plugin.editing.SpellCheckPlugin;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.ds0;
            import p000.f42;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0080\b\u001a4\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0018\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001a\u001a\u00020\u0016*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001c\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a%\u0010\u001d\u001a\u00020\u001e*\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, m6176d2 = {"HIGH_SURROGATE_HEADER", HttpUrl.FRAGMENT_ENCODE_SET, "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "REPLACEMENT_BYTE", HttpUrl.FRAGMENT_ENCODE_SET, "REPLACEMENT_CHARACTER", HttpUrl.FRAGMENT_ENCODE_SET, "REPLACEMENT_CODE_POINT", "isIsoControl", HttpUrl.FRAGMENT_ENCODE_SET, "codePoint", "isUtf8Continuation", "byte", "process2Utf8Bytes", HttpUrl.FRAGMENT_ENCODE_SET, "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "yield", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "process3Utf8Bytes", "process4Utf8Bytes", "processUtf16Chars", "processUtf8Bytes", HttpUrl.FRAGMENT_ENCODE_SET, "processUtf8CodePoints", "utf8Size", HttpUrl.FRAGMENT_ENCODE_SET, "size", "okio"}, m6177k = 2, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 123 */   public final class Utf8 {
                public static final int HIGH_SURROGATE_HEADER = 55232;
                public static final int LOG_SURROGATE_HEADER = 56320;
                public static final int MASK_2BYTES = 3968;
                public static final int MASK_3BYTES = -123008;
                public static final int MASK_4BYTES = 3678080;
                public static final byte REPLACEMENT_BYTE = 63;
                public static final char REPLACEMENT_CHARACTER = 65533;
                public static final int REPLACEMENT_CODE_POINT = 65533;

                public static final boolean isIsoControl(int i) {
/* 1 */             if (i < 0 || i >= 32) {
                        return 127 <= i && i < 160;
                    }
/* 16 */            return true;
                }

                public static final boolean isUtf8Continuation(byte b) {
                    return (b & 192) == 128;
                }

                public static final int process2Utf8Bytes(byte[] bArr, int i, int i2, Function1<? super Integer, Unit> function1) {
/* 4 */             Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
/* 8 */             bArr.getClass();
/* 11 */            function1.getClass();
/* 14 */            int i3 = i + 1;
/* 17 */            if (i2 <= i3) {
/* 19 */                function1.invoke(numValueOf);
/* 16 */                return 1;
                    }
/* 23 */            byte b = bArr[i];
/* 25 */            byte b2 = bArr[i3];
/* 31 */            if ((b2 & 192) != 128) {
/* 53 */                function1.invoke(numValueOf);
/* 16 */                return 1;
                    }
/* 37 */            int i4 = (b2 ^ 3968) ^ (b << 6);
/* 38 */            if (i4 < 128) {
/* 40 */                function1.invoke(numValueOf);
/* 51 */                return 2;
                    }
/* 48 */            function1.invoke(Integer.valueOf(i4));
/* 51 */            return 2;
                }

                public static final int process3Utf8Bytes(byte[] bArr, int i, int i2, Function1<? super Integer, Unit> function1) {
/* 4 */             Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
/* 8 */             bArr.getClass();
/* 11 */            function1.getClass();
/* 14 */            int i3 = i + 2;
/* 20 */            if (i2 <= i3) {
/* 22 */                function1.invoke(numValueOf);
/* 25 */                int i4 = i + 1;
                        return (i2 <= i4 || (bArr[i4] & 192) != 128) ? 1 : 2;
                    }
/* 36 */            byte b = bArr[i];
/* 39 */            byte b2 = bArr[i + 1];
/* 43 */            if ((b2 & 192) != 128) {
/* 96 */                function1.invoke(numValueOf);
/* 18 */                return 1;
                    }
/* 45 */            byte b3 = bArr[i3];
/* 49 */            if ((b3 & 192) != 128) {
/* 92 */                function1.invoke(numValueOf);
/* 19 */                return 2;
                    }
/* 60 */            int i5 = ((b3 ^ (-123008)) ^ (b2 << 6)) ^ (b << 12);
/* 63 */            if (i5 < 2048) {
/* 65 */                function1.invoke(numValueOf);
/* 90 */                return 3;
                    }
/* 72 */            if (55296 > i5 || i5 >= 57344) {
/* 87 */                function1.invoke(Integer.valueOf(i5));
/* 90 */                return 3;
                    }
/* 79 */            function1.invoke(numValueOf);
/* 90 */            return 3;
                }

                public static final int process4Utf8Bytes(byte[] bArr, int i, int i2, Function1<? super Integer, Unit> function1) {
/* 4 */             Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
/* 8 */             bArr.getClass();
/* 11 */            function1.getClass();
/* 14 */            int i3 = i + 3;
/* 21 */            if (i2 <= i3) {
/* 23 */                function1.invoke(numValueOf);
/* 26 */                int i4 = i + 1;
/* 28 */                if (i2 <= i4 || (bArr[i4] & 192) != 128) {
/* 17 */                    return 1;
                        }
/* 36 */                int i5 = i + 2;
                        return (i2 <= i5 || (bArr[i5] & 192) != 128) ? 2 : 3;
                    }
/* 48 */            byte b = bArr[i];
/* 52 */            byte b2 = bArr[i + 1];
/* 56 */            if ((b2 & 192) != 128) {
/* 132 */               function1.invoke(numValueOf);
/* 17 */                return 1;
                    }
/* 59 */            byte b3 = bArr[i + 2];
/* 63 */            if ((b3 & 192) != 128) {
/* 128 */               function1.invoke(numValueOf);
/* 16 */                return 2;
                    }
/* 65 */            byte b4 = bArr[i3];
/* 69 */            if ((b4 & 192) != 128) {
/* 124 */               function1.invoke(numValueOf);
/* 20 */                return 3;
                    }
/* 83 */            int i6 = (((b4 ^ 3678080) ^ (b3 << 6)) ^ (b2 << 12)) ^ (b << 18);
/* 87 */            if (i6 > 1114111) {
/* 89 */                function1.invoke(numValueOf);
/* 122 */               return 4;
                    }
/* 96 */            if (55296 <= i6 && i6 < 57344) {
/* 103 */               function1.invoke(numValueOf);
/* 122 */               return 4;
                    }
/* 109 */           if (i6 < 65536) {
/* 111 */               function1.invoke(numValueOf);
/* 122 */               return 4;
                    }
/* 119 */           function1.invoke(Integer.valueOf(i6));
/* 122 */           return 4;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x003e  */
                public static final void processUtf16Chars(byte[] bArr, int i, int i2, Function1<? super Character, Unit> function1) {
/* 4 */             Character chValueOf = Character.valueOf(REPLACEMENT_CHARACTER);
/* 8 */             bArr.getClass();
/* 11 */            function1.getClass();
/* 14 */            while (i < i2) {
/* 16 */                byte b = bArr[i];
/* 18 */                if (b >= 0) {
/* 25 */                    function1.invoke(Character.valueOf((char) b));
/* 28 */                    i++;
/* 30 */                    while (i < i2) {
/* 32 */                        byte b2 = bArr[i];
/* 34 */                        if (b2 < 0) {
                                    break;
                                }
/* 36 */                        i++;
/* 43 */                        function1.invoke(Character.valueOf((char) b2));
                            }
                        } else {
/* 50 */                    int i3 = 2;
/* 54 */                    if ((b >> 5) == -2) {
/* 56 */                        int i4 = i + 1;
/* 58 */                        if (i2 > i4) {
/* 65 */                            byte b3 = bArr[i4];
/* 69 */                            if ((b3 & 192) == 128) {
/* 75 */                                int i5 = (b << 6) ^ (b3 ^ 3968);
/* 76 */                                if (i5 < 128) {
/* 78 */                                    function1.invoke(chValueOf);
                                        } else {
/* 87 */                                    function1.invoke(Character.valueOf((char) i5));
                                        }
                                    }
/* 90 */                            i += i3;
                                }
/* 60 */                        function1.invoke(chValueOf);
/* 63 */                        i3 = 1;
/* 90 */                        i += i3;
                            } else if ((b >> 4) == -2) {
/* 103 */                       int i6 = i + 2;
/* 105 */                       if (i2 <= i6) {
/* 107 */                           function1.invoke(chValueOf);
/* 110 */                           int i7 = i + 1;
/* 112 */                           if (i2 <= i7 || (bArr[i7] & 192) != 128) {
/* 63 */                                i3 = 1;
                                    }
                                } else {
/* 123 */                           byte b4 = bArr[i + 1];
/* 127 */                           if ((b4 & 192) == 128) {
/* 129 */                               byte b5 = bArr[i6];
/* 133 */                               if ((b5 & 192) == 128) {
/* 144 */                                   int i8 = (b << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
/* 147 */                                   if (i8 >= 2048 && (55296 > i8 || i8 >= 57344)) {
/* 163 */                                       function1.invoke(Character.valueOf((char) i8));
                                            } else {
/* 149 */                                       function1.invoke(chValueOf);
                                            }
/* 166 */                                   i3 = 3;
                                        } else {
/* 168 */                                   function1.invoke(chValueOf);
                                        }
                                    } else {
/* 172 */                               function1.invoke(chValueOf);
/* 63 */                                i3 = 1;
                                    }
                                }
/* 90 */                        i += i3;
                            } else if ((b >> 3) == -2) {
/* 180 */                       int i9 = i + 3;
/* 182 */                       if (i2 <= i9) {
/* 184 */                           function1.invoke(chValueOf);
/* 187 */                           int i10 = i + 1;
/* 189 */                           if (i2 <= i10 || (bArr[i10] & 192) != 128) {
/* 63 */                                i3 = 1;
                                    } else {
/* 197 */                               int i11 = i + 2;
/* 199 */                               if (i2 > i11 && (bArr[i11] & 192) == 128) {
/* 166 */                                   i3 = 3;
                                        }
                                    }
                                } else {
/* 210 */                           byte b6 = bArr[i + 1];
/* 214 */                           if ((b6 & 192) == 128) {
/* 218 */                               byte b7 = bArr[i + 2];
/* 222 */                               if ((b7 & 192) == 128) {
/* 224 */                                   byte b8 = bArr[i9];
/* 228 */                                   if ((b8 & 192) == 128) {
/* 242 */                                       int i12 = (b << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12));
/* 246 */                                       if (i12 <= 1114111 && ((55296 > i12 || i12 >= 57344) && i12 >= 65536 && i12 != 65533)) {
/* 275 */                                           function1.invoke(Character.valueOf((char) ((i12 >>> 10) + HIGH_SURROGATE_HEADER)));
/* 289 */                                           function1.invoke(Character.valueOf((char) ((i12 & 1023) + LOG_SURROGATE_HEADER)));
                                                } else {
/* 248 */                                           function1.invoke(chValueOf);
                                                }
/* 292 */                                       i3 = 4;
                                            } else {
/* 295 */                                       function1.invoke(chValueOf);
/* 166 */                                       i3 = 3;
                                            }
                                        } else {
/* 299 */                                   function1.invoke(chValueOf);
                                        }
                                    } else {
/* 304 */                               function1.invoke(chValueOf);
/* 63 */                                i3 = 1;
                                    }
                                }
/* 90 */                        i += i3;
                            } else {
/* 309 */                       function1.invoke(chValueOf);
/* 312 */                       i++;
                            }
                        }
                    }
                }

                public static final void processUtf8Bytes(String str, int i, int i2, Function1<? super Byte, Unit> function1) {
                    int i3;
                    char cCharAt;
/* 1 */             str.getClass();
/* 4 */             function1.getClass();
/* 7 */             while (i < i2) {
/* 9 */                 char cCharAt2 = str.charAt(i);
/* 19 */                if (Intrinsics.m6217b(cCharAt2, 128) < 0) {
/* 26 */                    function1.invoke(Byte.valueOf((byte) cCharAt2));
/* 29 */                    i++;
/* 31 */                    while (i < i2 && Intrinsics.m6217b(str.charAt(i), 128) < 0) {
/* 54 */                        function1.invoke(Byte.valueOf((byte) str.charAt(i)));
/* 43 */                        i++;
                            }
                        } else {
/* 65 */                    if (Intrinsics.m6217b(cCharAt2, 2048) < 0) {
/* 76 */                        function1.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | 192)));
/* 87 */                        function1.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                            } else if (55296 > cCharAt2 || cCharAt2 >= 57344) {
/* 208 */                       function1.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
/* 220 */                       function1.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
/* 231 */                       function1.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                            } else if (Intrinsics.m6217b(cCharAt2, 56319) > 0 || i2 <= (i3 = i + 1) || 56320 > (cCharAt = str.charAt(i3)) || cCharAt >= 57344) {
/* 195 */                       function1.invoke(Byte.valueOf(REPLACEMENT_BYTE));
                            } else {
/* 139 */                       int iCharAt = (str.charAt(i3) + (cCharAt2 << '\n')) - 56613888;
/* 149 */                       function1.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
/* 161 */                       function1.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
/* 173 */                       function1.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
/* 184 */                       function1.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
/* 187 */                       i += 2;
                            }
/* 90 */                    i++;
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:16:0x003c  */
                public static final void processUtf8CodePoints(byte[] bArr, int i, int i2, Function1<? super Integer, Unit> function1) {
/* 4 */             Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
/* 8 */             bArr.getClass();
/* 11 */            function1.getClass();
/* 14 */            while (i < i2) {
/* 16 */                byte b = bArr[i];
/* 18 */                if (b >= 0) {
/* 24 */                    function1.invoke(Integer.valueOf(b));
/* 27 */                    i++;
/* 29 */                    while (i < i2) {
/* 31 */                        byte b2 = bArr[i];
/* 33 */                        if (b2 < 0) {
                                    break;
                                }
/* 35 */                        i++;
/* 41 */                        function1.invoke(Integer.valueOf(b2));
                            }
                        } else {
/* 48 */                    int i3 = 2;
/* 52 */                    if ((b >> 5) == -2) {
/* 54 */                        int i4 = i + 1;
/* 56 */                        if (i2 > i4) {
/* 63 */                            byte b3 = bArr[i4];
/* 67 */                            if ((b3 & 192) == 128) {
/* 73 */                                int i5 = (b << 6) ^ (b3 ^ 3968);
/* 74 */                                if (i5 < 128) {
/* 76 */                                    function1.invoke(numValueOf);
                                        } else {
/* 84 */                                    function1.invoke(Integer.valueOf(i5));
                                        }
                                    }
/* 87 */                            i += i3;
                                }
/* 58 */                        function1.invoke(numValueOf);
/* 61 */                        i3 = 1;
/* 87 */                        i += i3;
                            } else if ((b >> 4) == -2) {
/* 100 */                       int i6 = i + 2;
/* 102 */                       if (i2 <= i6) {
/* 104 */                           function1.invoke(numValueOf);
/* 107 */                           int i7 = i + 1;
/* 109 */                           if (i2 <= i7 || (bArr[i7] & 192) != 128) {
/* 61 */                                i3 = 1;
                                    }
                                } else {
/* 120 */                           byte b4 = bArr[i + 1];
/* 124 */                           if ((b4 & 192) == 128) {
/* 126 */                               byte b5 = bArr[i6];
/* 130 */                               if ((b5 & 192) == 128) {
/* 141 */                                   int i8 = (b << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
/* 144 */                                   if (i8 >= 2048 && (55296 > i8 || i8 >= 57344)) {
/* 159 */                                       function1.invoke(Integer.valueOf(i8));
                                            } else {
/* 146 */                                       function1.invoke(numValueOf);
                                            }
/* 162 */                                   i3 = 3;
                                        } else {
/* 164 */                                   function1.invoke(numValueOf);
                                        }
                                    } else {
/* 168 */                               function1.invoke(numValueOf);
/* 61 */                                i3 = 1;
                                    }
                                }
/* 87 */                        i += i3;
                            } else if ((b >> 3) == -2) {
/* 176 */                       int i9 = i + 3;
/* 178 */                       if (i2 <= i9) {
/* 180 */                           function1.invoke(numValueOf);
/* 183 */                           int i10 = i + 1;
/* 185 */                           if (i2 <= i10 || (bArr[i10] & 192) != 128) {
/* 61 */                                i3 = 1;
                                    } else {
/* 193 */                               int i11 = i + 2;
/* 195 */                               if (i2 > i11 && (bArr[i11] & 192) == 128) {
/* 162 */                                   i3 = 3;
                                        }
                                    }
                                } else {
/* 206 */                           byte b6 = bArr[i + 1];
/* 210 */                           if ((b6 & 192) == 128) {
/* 214 */                               byte b7 = bArr[i + 2];
/* 218 */                               if ((b7 & 192) == 128) {
/* 220 */                                   byte b8 = bArr[i9];
/* 224 */                                   if ((b8 & 192) == 128) {
/* 238 */                                       int i12 = (b << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12));
/* 242 */                                       if (i12 <= 1114111 && ((55296 > i12 || i12 >= 57344) && i12 >= 65536)) {
/* 262 */                                           function1.invoke(Integer.valueOf(i12));
                                                } else {
/* 244 */                                           function1.invoke(numValueOf);
                                                }
/* 265 */                                       i3 = 4;
                                            } else {
/* 268 */                                       function1.invoke(numValueOf);
/* 162 */                                       i3 = 3;
                                            }
                                        } else {
/* 272 */                                   function1.invoke(numValueOf);
                                        }
                                    } else {
/* 277 */                               function1.invoke(numValueOf);
/* 61 */                                i3 = 1;
                                    }
                                }
/* 87 */                        i += i3;
                            } else {
/* 282 */                       function1.invoke(numValueOf);
/* 285 */                       i++;
                            }
                        }
                    }
                }

                public static final long size(String str, int i, int i2) {
                    long j;
/* 1 */             str.getClass();
/* 4 */             long j2 = 0;
/* 6 */             if (i < 0) {
/* 121 */               ds0.m3200q(fm0.m3781g(i, "beginIndex < 0: "));
/* 4 */                 return 0L;
                    }
/* 8 */             if (i2 < i) {
/* 111 */               ds0.m3200q(AbstractC0886en.m3506j("endIndex < beginIndex: ", i2, i, " < "));
/* 4 */                 return 0L;
                    }
/* 14 */            if (i2 > str.length()) {
/* 99 */                f42.m3652h(str.length(), fm0.m3793s(i2, "endIndex > string.length: ", " > "));
/* 4 */                 return 0L;
                    }
/* 16 */            while (i < i2) {
/* 18 */                char cCharAt = str.charAt(i);
/* 26 */                if (cCharAt < 128) {
/* 28 */                    j2++;
                        } else {
/* 34 */                    if (cCharAt < 2048) {
/* 36 */                        j = 2;
                            } else if (cCharAt < 55296 || cCharAt > 57343) {
/* 83 */                        j = 3;
                            } else {
/* 51 */                        int i3 = i + 1;
/* 60 */                        char cCharAt2 = i3 < i2 ? str.charAt(i3) : (char) 0;
/* 64 */                        if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
/* 80 */                            j2++;
/* 81 */                            i = i3;
                                } else {
/* 76 */                            j2 += 4;
/* 77 */                            i += 2;
                                }
                            }
/* 38 */                    j2 += j;
                        }
/* 29 */                i++;
                    }
/* 86 */            return j2;
                }

                public static /* synthetic */ long size$default(String str, int i, int i2, int i3, Object obj) {
/* 3 */             if ((i3 & 1) != 0) {
/* 5 */                 i = 0;
                    }
/* 8 */             if ((i3 & 2) != 0) {
/* 10 */                i2 = str.length();
                    }
/* 14 */            return size(str, i, i2);
                }

/* 124 */       public static final long size(String str, int i) {
/* 125 */           str.getClass();
                    return size$default(str, i, 0, 2, null);
                }

/* 125 */       public static final long size(String str) {
/* 126 */           str.getClass();
                    return size$default(str, 0, 0, 3, null);
                }
            }
