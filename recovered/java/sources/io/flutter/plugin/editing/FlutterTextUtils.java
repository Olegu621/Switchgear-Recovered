            package io.flutter.plugin.editing;

            import io.flutter.embedding.engine.FlutterJNI;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class FlutterTextUtils {
                public static final int CANCEL_TAG = 917631;
                public static final int CARRIAGE_RETURN = 13;
                public static final int COMBINING_ENCLOSING_KEYCAP = 8419;
                public static final int LINE_FEED = 10;
                public static final int ZERO_WIDTH_JOINER = 8205;
                private final FlutterJNI flutterJNI;

                public FlutterTextUtils(FlutterJNI flutterJNI) {
/* 4 */             this.flutterJNI = flutterJNI;
                }

                public int getOffsetAfter(CharSequence charSequence, int i) {
                    int iCharCount;
/* 1 */             int length = charSequence.length();
/* 5 */             int i2 = length - 1;
/* 7 */             if (i >= i2) {
/* 9 */                 return length;
                    }
/* 10 */            int iCodePointAt = Character.codePointAt(charSequence, i);
/* 14 */            int iCharCount2 = Character.charCount(iCodePointAt);
/* 18 */            int iCharCount3 = i + iCharCount2;
/* 20 */            int i3 = 0;
/* 21 */            if (iCharCount3 == 0) {
/* 20 */                return 0;
                    }
/* 26 */            if (iCodePointAt == 10) {
/* 34 */                if (Character.codePointAt(charSequence, iCharCount3) == 13) {
/* 36 */                    iCharCount2++;
                        }
/* 38 */                return i + iCharCount2;
                    }
/* 44 */            if (isRegionalIndicatorSymbol(iCodePointAt)) {
/* 46 */                if (iCharCount3 >= i2 || !isRegionalIndicatorSymbol(Character.codePointAt(charSequence, iCharCount3))) {
/* 92 */                    return iCharCount3;
                        }
/* 59 */                int iCharCount4 = i;
/* 60 */                while (iCharCount4 > 0 && isRegionalIndicatorSymbol(Character.codePointBefore(charSequence, i))) {
/* 80 */                    iCharCount4 -= Character.charCount(Character.codePointBefore(charSequence, i));
/* 81 */                    i3++;
                        }
/* 86 */                if (i3 % 2 == 0) {
/* 88 */                    iCharCount2 += 2;
                        }
/* 90 */                return i + iCharCount2;
                    }
/* 97 */            if (isKeycapBase(iCodePointAt)) {
/* 103 */               iCharCount2 += Character.charCount(iCodePointAt);
                    }
/* 106 */           if (iCodePointAt == 8419) {
/* 108 */               int iCodePointBefore = Character.codePointBefore(charSequence, iCharCount3);
/* 116 */               int iCharCount5 = Character.charCount(iCodePointBefore) + iCharCount3;
/* 117 */               if (iCharCount5 < length && isVariationSelector(iCodePointBefore)) {
/* 125 */                   int iCodePointAt2 = Character.codePointAt(charSequence, iCharCount5);
/* 133 */                   if (isKeycapBase(iCodePointAt2)) {
/* 144 */                       iCharCount2 += Character.charCount(iCodePointAt2) + Character.charCount(iCodePointBefore);
                            }
                        } else if (isKeycapBase(iCodePointBefore)) {
/* 156 */                   iCharCount2 += Character.charCount(iCodePointBefore);
                        }
/* 157 */               return i + iCharCount2;
                    }
/* 163 */           if (isEmoji(iCodePointAt)) {
/* 165 */               boolean z = false;
/* 166 */               int i4 = 0;
/* 325 */               do {
/* 168 */                   if (z) {
/* 176 */                       iCharCount2 = Character.charCount(iCodePointAt) + i4 + 1 + iCharCount2;
/* 178 */                       z = false;
                            }
/* 183 */                   if (isEmojiModifier(iCodePointAt)) {
                                break;
                            }
/* 187 */                   if (iCharCount3 < length) {
/* 189 */                       iCodePointAt = Character.codePointAt(charSequence, iCharCount3);
/* 197 */                       int iCharCount6 = Character.charCount(iCodePointAt) + iCharCount3;
/* 198 */                       if (iCodePointAt != 8419) {
/* 255 */                           if (!isEmojiModifier(iCodePointAt)) {
/* 267 */                               if (!isVariationSelector(iCodePointAt)) {
/* 276 */                                   if (iCodePointAt == 8205) {
/* 278 */                                       iCodePointAt = Character.codePointAt(charSequence, iCharCount6);
/* 286 */                                       iCharCount3 = Character.charCount(iCodePointAt) + iCharCount6;
/* 287 */                                       if (iCharCount3 >= length || !isVariationSelector(iCodePointAt)) {
/* 312 */                                           i4 = 0;
                                                } else {
/* 295 */                                           iCodePointAt = Character.codePointAt(charSequence, iCharCount3);
/* 299 */                                           int iCharCount7 = Character.charCount(iCodePointAt);
/* 307 */                                           iCharCount3 = Character.charCount(iCodePointAt) + iCharCount3;
/* 309 */                                           i4 = iCharCount7;
                                                }
/* 310 */                                       z = true;
                                            } else {
/* 314 */                                       iCharCount3 = iCharCount6;
/* 315 */                                       i4 = 0;
                                            }
/* 316 */                                   if (iCharCount3 < length || !z) {
                                                break;
                                            }
                                        } else {
/* 269 */                                   iCharCount = Character.charCount(iCodePointAt);
                                        }
                                    } else {
/* 257 */                               iCharCount = Character.charCount(iCodePointAt);
                                    }
/* 261 */                           iCharCount2 += iCharCount;
                                    break;
                                }
/* 200 */                       int iCodePointBefore2 = Character.codePointBefore(charSequence, iCharCount6);
/* 208 */                       int iCharCount8 = Character.charCount(iCodePointBefore2) + iCharCount6;
/* 209 */                       if (iCharCount8 < length && isVariationSelector(iCodePointBefore2)) {
/* 217 */                           int iCodePointAt3 = Character.codePointAt(charSequence, iCharCount8);
/* 225 */                           if (isKeycapBase(iCodePointAt3)) {
/* 236 */                               iCharCount2 += Character.charCount(iCodePointAt3) + Character.charCount(iCodePointBefore2);
                                    }
                                } else if (isKeycapBase(iCodePointBefore2)) {
/* 248 */                           iCharCount2 += Character.charCount(iCodePointBefore2);
                                }
/* 249 */                       return i + iCharCount2;
                            }
/* 315 */                   i4 = 0;
/* 316 */                   if (iCharCount3 < length) {
                                break;
                            }
/* 325 */               } while (isEmoji(iCodePointAt));
                    }
/* 327 */           return i + iCharCount2;
                }

                /* JADX WARN: Code duplicated, block: B:90:0x014a A[PHI: r2 r4
  0x014a: PHI (r2v6 int) = (r2v3 int), (r2v8 int) binds: [B:80:0x0118, B:82:0x0125] A[DONT_GENERATE, DONT_INLINE]
  0x014a: PHI (r4v5 int) = (r4v3 int), (r4v7 int) binds: [B:80:0x0118, B:82:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
                public int getOffsetBefore(CharSequence charSequence, int i) {
                    int iCodePointBefore;
                    int iCharCount;
                    int iCharCount2;
/* 1 */             int iCharCount3 = 0;
/* 2 */             int i2 = 1;
/* 3 */             if (i <= 1 || (iCharCount2 = i - (iCharCount = Character.charCount((iCodePointBefore = Character.codePointBefore(charSequence, i))))) == 0) {
/* 1 */                 return 0;
                    }
/* 21 */            if (iCodePointBefore == 10) {
/* 29 */                if (Character.codePointBefore(charSequence, iCharCount2) == 13) {
/* 31 */                    iCharCount++;
                        }
/* 33 */                return i - iCharCount;
                    }
/* 39 */            if (isRegionalIndicatorSymbol(iCodePointBefore)) {
/* 41 */                int iCodePointBefore2 = Character.codePointBefore(charSequence, iCharCount2);
/* 49 */                int iCharCount4 = iCharCount2 - Character.charCount(iCodePointBefore2);
/* 50 */                while (iCharCount4 > 0 && isRegionalIndicatorSymbol(iCodePointBefore2)) {
/* 58 */                    iCodePointBefore2 = Character.codePointBefore(charSequence, iCharCount4);
/* 66 */                    iCharCount4 -= Character.charCount(iCodePointBefore2);
/* 67 */                    i2++;
                        }
/* 72 */                if (i2 % 2 == 0) {
/* 74 */                    iCharCount += 2;
                        }
/* 76 */                return i - iCharCount;
                    }
/* 80 */            if (iCodePointBefore == 8419) {
/* 82 */                int iCodePointBefore3 = Character.codePointBefore(charSequence, iCharCount2);
/* 90 */                int iCharCount5 = iCharCount2 - Character.charCount(iCodePointBefore3);
/* 91 */                if (iCharCount5 > 0 && isVariationSelector(iCodePointBefore3)) {
/* 99 */                    int iCodePointBefore4 = Character.codePointBefore(charSequence, iCharCount5);
/* 107 */                   if (isKeycapBase(iCodePointBefore4)) {
/* 118 */                       iCharCount += Character.charCount(iCodePointBefore4) + Character.charCount(iCodePointBefore3);
                            }
                        } else if (isKeycapBase(iCodePointBefore3)) {
/* 130 */                   iCharCount += Character.charCount(iCodePointBefore3);
                        }
/* 131 */               return i - iCharCount;
                    }
/* 136 */           if (iCodePointBefore == 917631) {
/* 138 */               iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
/* 142 */               int iCharCount6 = Character.charCount(iCodePointBefore);
                        while (true) {
/* 146 */                   iCharCount2 -= iCharCount6;
/* 147 */                   if (iCharCount2 <= 0 || !isTagSpecChar(iCodePointBefore)) {
                                break;
                            }
/* 159 */                   iCharCount += Character.charCount(iCodePointBefore);
/* 160 */                   iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
/* 164 */                   iCharCount6 = Character.charCount(iCodePointBefore);
                        }
/* 173 */               if (!isEmoji(iCodePointBefore)) {
/* 175 */                   return i - 2;
                        }
/* 182 */               iCharCount += Character.charCount(iCodePointBefore);
                    }
/* 187 */           if (isVariationSelector(iCodePointBefore)) {
/* 189 */               iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
/* 197 */               if (!isEmoji(iCodePointBefore)) {
/* 199 */                   return i - iCharCount;
                        }
/* 205 */               iCharCount += Character.charCount(iCodePointBefore);
/* 206 */               iCharCount2 -= iCharCount;
                    }
/* 211 */           if (isEmoji(iCodePointBefore)) {
/* 213 */               boolean z = false;
/* 214 */               int i3 = 0;
/* 341 */               do {
/* 215 */                   if (z) {
/* 223 */                       iCharCount = Character.charCount(iCodePointBefore) + i3 + 1 + iCharCount;
/* 225 */                       z = false;
                            }
/* 230 */                   if (!isEmojiModifier(iCodePointBefore)) {
/* 281 */                       if (iCharCount2 > 0) {
/* 283 */                           iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
/* 291 */                           iCharCount2 -= Character.charCount(iCodePointBefore);
/* 294 */                           if (iCodePointBefore == 8205) {
/* 296 */                               iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
/* 304 */                               iCharCount2 -= Character.charCount(iCodePointBefore);
/* 305 */                               if (iCharCount2 <= 0 || !isVariationSelector(iCodePointBefore)) {
/* 329 */                                   i3 = 0;
                                        } else {
/* 313 */                                   iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
/* 317 */                                   int iCharCount7 = Character.charCount(iCodePointBefore);
/* 325 */                                   iCharCount2 -= Character.charCount(iCodePointBefore);
/* 326 */                                   i3 = iCharCount7;
                                        }
/* 327 */                               z = true;
                                    } else {
/* 331 */                               i3 = 0;
                                    }
                                } else {
/* 331 */                           i3 = 0;
                                }
/* 332 */                       if (iCharCount2 == 0 || !z) {
                                    break;
                                }
                            } else {
/* 232 */                       int iCodePointBefore5 = Character.codePointBefore(charSequence, iCharCount2);
/* 240 */                       int iCharCount8 = iCharCount2 - Character.charCount(iCodePointBefore5);
/* 241 */                       if (iCharCount8 > 0 && isVariationSelector(iCodePointBefore5)) {
/* 249 */                           iCodePointBefore5 = Character.codePointBefore(charSequence, iCharCount8);
/* 257 */                           if (!isEmoji(iCodePointBefore5)) {
/* 259 */                               return i - iCharCount;
                                    }
/* 261 */                           iCharCount3 = Character.charCount(iCodePointBefore5);
/* 265 */                           Character.charCount(iCodePointBefore5);
                                }
/* 272 */                       if (!isEmojiModifierBase(iCodePointBefore5)) {
                                    break;
                                }
/* 279 */                       iCharCount += Character.charCount(iCodePointBefore5) + iCharCount3;
                                break;
                            }
/* 341 */               } while (isEmoji(iCodePointBefore));
                    }
/* 343 */           return i - iCharCount;
                }

                public boolean isEmoji(int i) {
/* 3 */             return this.flutterJNI.isCodePointEmoji(i);
                }

                public boolean isEmojiModifier(int i) {
/* 3 */             return this.flutterJNI.isCodePointEmojiModifier(i);
                }

                public boolean isEmojiModifierBase(int i) {
/* 3 */             return this.flutterJNI.isCodePointEmojiModifierBase(i);
                }

                public boolean isKeycapBase(int i) {
                    return (48 <= i && i <= 57) || i == 35 || i == 42;
                }

                public boolean isRegionalIndicatorSymbol(int i) {
/* 3 */             return this.flutterJNI.isCodePointRegionalIndicator(i);
                }

                public boolean isTagSpecChar(int i) {
                    return 917536 <= i && i <= 917630;
                }

                public boolean isVariationSelector(int i) {
/* 3 */             return this.flutterJNI.isCodePointVariantSelector(i);
                }
            }
