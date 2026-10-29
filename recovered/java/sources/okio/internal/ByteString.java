            package okio.internal;

            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.flutter.plugin.editing.SpellCheckPlugin;
            import java.util.Arrays;
            import kotlin.Metadata;
            import kotlin.text.C1852e;
            import okhttp3.HttpUrl;
            import okio.Base64;
            import okio.Buffer;
            import okio.SegmentedByteString;
            import okio._JvmPlatformKt;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.C1960nd;
            import p000.ds0;
            
            /* JADX INFO: renamed from: okio.internal.-ByteString, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0080\b\u001a\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\r\u0010\u0011\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\r\u0010\u0013\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\u0015\u0010\u0014\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0080\b\u001a-\u0010\u0016\u001a\u00020\u0017*\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\u000f\u0010\u001c\u001a\u0004\u0018\u00010\f*\u00020\u0012H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\f*\u00020\u0012H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\f2\u0006\u0010!\u001a\u00020\tH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0080\b\u001a\u0017\u0010\"\u001a\u00020 *\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010#H\u0080\b\u001a\u0015\u0010$\u001a\u00020%*\u00020\f2\u0006\u0010&\u001a\u00020\u0007H\u0080\b\u001a\r\u0010'\u001a\u00020\u0007*\u00020\fH\u0080\b\u001a\r\u0010(\u001a\u00020\u0007*\u00020\fH\u0080\b\u001a\r\u0010)\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\u001d\u0010*\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\r\u0010,\u001a\u00020\t*\u00020\fH\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a-\u0010.\u001a\u00020 *\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a-\u0010.\u001a\u00020 *\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\u0015\u00100\u001a\u00020 *\u00020\f2\u0006\u00101\u001a\u00020\tH\u0080\b\u001a\u0015\u00100\u001a\u00020 *\u00020\f2\u0006\u00101\u001a\u00020\fH\u0080\b\u001a\u001d\u00102\u001a\u00020\f*\u00020\f2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0080\b\u001a\r\u00105\u001a\u00020\f*\u00020\fH\u0080\b\u001a\r\u00106\u001a\u00020\f*\u00020\fH\u0080\b\u001a\r\u00107\u001a\u00020\t*\u00020\fH\u0080\b\u001a\u001d\u00108\u001a\u00020\f*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\r\u00109\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\r\u0010:\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a$\u0010;\u001a\u00020\u0017*\u00020\f2\u0006\u0010<\u001a\u00020=2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006>"}, m6176d2 = {"HEX_DIGIT_CHARS", HttpUrl.FRAGMENT_ENCODE_SET, "getHEX_DIGIT_CHARS$annotations", "()V", "getHEX_DIGIT_CHARS", "()[C", "codePointIndexToCharIndex", HttpUrl.FRAGMENT_ENCODE_SET, "s", HttpUrl.FRAGMENT_ENCODE_SET, "codePointCount", "commonOf", "Lokio/ByteString;", SharedDataContentProvider.BASE_PATH, "decodeHexDigit", "c", HttpUrl.FRAGMENT_ENCODE_SET, "commonBase64", HttpUrl.FRAGMENT_ENCODE_SET, "commonBase64Url", "commonCompareTo", "other", "commonCopyInto", HttpUrl.FRAGMENT_ENCODE_SET, "offset", "target", "targetOffset", "byteCount", "commonDecodeBase64", "commonDecodeHex", "commonEncodeUtf8", "commonEndsWith", HttpUrl.FRAGMENT_ENCODE_SET, "suffix", "commonEquals", HttpUrl.FRAGMENT_ENCODE_SET, "commonGetByte", HttpUrl.FRAGMENT_ENCODE_SET, "pos", "commonGetSize", "commonHashCode", "commonHex", "commonIndexOf", "fromIndex", "commonInternalArray", "commonLastIndexOf", "commonRangeEquals", "otherOffset", "commonStartsWith", "prefix", "commonSubstring", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "commonToAsciiLowercase", "commonToAsciiUppercase", "commonToByteArray", "commonToByteString", "commonToString", "commonUtf8", "commonWrite", "buffer", "Lokio/Buffer;", "okio"}, m6177k = 2, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 15 */    public final class ByteString {
                private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

                /* JADX INFO: Access modifiers changed from: private */
                public static final int codePointIndexToCharIndex(byte[] bArr, int i) {
                    byte b;
                    int i2;
/* 5 */             int length = bArr.length;
/* 6 */             int i3 = 0;
/* 7 */             int i4 = 0;
/* 8 */             int i5 = 0;
/* 9 */             while (i3 < length) {
/* 11 */                byte b2 = bArr[i3];
/* 30 */                if (b2 >= 0) {
/* 32 */                    int i6 = i5 + 1;
/* 34 */                    if (i5 == i) {
                                break;
                            }
/* 38 */                    if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
/* 28 */                        return -1;
                            }
/* 60 */                    i4 += b2 < 65536 ? 1 : 2;
/* 61 */                    i3++;
                            while (true) {
/* 63 */                        i5 = i6;
/* 65 */                        if (i3 >= length || (b = bArr[i3]) < 0) {
                                    break;
                                }
/* 71 */                        i3++;
/* 73 */                        i6 = i5 + 1;
/* 75 */                        if (i5 == i) {
/* 77 */                            return i4;
                                }
/* 78 */                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (127 <= b && b < 160))) || b == 65533) {
/* 28 */                            return -1;
                                }
/* 100 */                       i4 += b < 65536 ? 1 : 2;
                            }
                        } else if ((b2 >> 5) == -2) {
/* 109 */                   int i7 = i3 + 1;
/* 111 */                   if (length <= i7) {
/* 113 */                       if (i5 == i) {
                                    break;
                                }
/* 28 */                        return -1;
                            }
/* 118 */                   byte b3 = bArr[i7];
/* 122 */                   if ((b3 & 192) != 128) {
/* 172 */                       if (i5 == i) {
                                    break;
                                }
/* 28 */                        return -1;
                            }
/* 128 */                   int i8 = (b2 << 6) ^ (b3 ^ 3968);
/* 129 */                   if (i8 < 128) {
/* 131 */                       if (i5 == i) {
                                    break;
                                }
/* 28 */                        return -1;
                            }
/* 136 */                   int i9 = i5 + 1;
/* 138 */                   if (i5 == i) {
                                break;
                            }
/* 142 */                   if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
/* 28 */                        return -1;
                            }
/* 166 */                   i4 += i8 < 65536 ? 1 : 2;
/* 167 */                   i3 += 2;
/* 169 */                   i5 = i9;
                        } else if ((b2 >> 4) == -2) {
/* 187 */                   int i10 = i3 + 2;
/* 189 */                   if (length <= i10) {
/* 191 */                       if (i5 == i) {
                                    break;
                                }
/* 28 */                        return -1;
                            }
/* 198 */                   byte b4 = bArr[i3 + 1];
/* 202 */                   if ((b4 & 192) != 128) {
/* 286 */                       if (i5 == i) {
                                    break;
                                }
/* 28 */                        return -1;
                            }
/* 204 */                   byte b5 = bArr[i10];
/* 208 */                   if ((b5 & 192) != 128) {
/* 281 */                       if (i5 == i) {
                                    break;
                                }
/* 28 */                        return -1;
                            }
/* 219 */                   int i11 = (b2 << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
/* 222 */                   if (i11 < 2048) {
/* 224 */                       if (i5 == i) {
                                    break;
                                }
/* 28 */                        return -1;
                            }
/* 229 */                   if (55296 <= i11 && i11 < 57344) {
/* 233 */                       if (i5 == i) {
                                    break;
                                }
/* 28 */                        return -1;
                            }
/* 238 */                   i2 = i5 + 1;
/* 240 */                   if (i5 == i) {
                                break;
                            }
/* 244 */                   if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
/* 28 */                        return -1;
                            }
/* 275 */                   i4 += i11 < 65536 ? 1 : 2;
/* 276 */                   i3 += 3;
/* 278 */                   i5 = i2;
                        } else {
/* 293 */                   if ((b2 >> 3) != -2) {
/* 418 */                       if (i5 == i) {
                                    break;
                                }
/* 28 */                        return -1;
                            }
/* 295 */                   int i12 = i3 + 3;
/* 297 */                   if (length <= i12) {
/* 299 */                       if (i5 == i) {
                                    break;
                                }
/* 28 */                        return -1;
                            }
/* 306 */                   byte b6 = bArr[i3 + 1];
/* 310 */                   if ((b6 & 192) != 128) {
/* 414 */                       if (i5 == i) {
                                    break;
                                }
/* 28 */                        return -1;
                            }
/* 314 */                   byte b7 = bArr[i3 + 2];
/* 318 */                   if ((b7 & 192) != 128) {
/* 410 */                       if (i5 == i) {
                                    break;
                                }
/* 28 */                        return -1;
                            }
/* 320 */                   byte b8 = bArr[i12];
/* 324 */                   if ((b8 & 192) != 128) {
/* 406 */                       if (i5 == i) {
                                    break;
                                }
/* 28 */                        return -1;
                            }
/* 338 */                   int i13 = (b2 << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12));
/* 342 */                   if (i13 > 1114111) {
/* 344 */                       if (i5 == i) {
                                    break;
                                }
/* 28 */                        return -1;
                            }
/* 348 */                   if (55296 <= i13 && i13 < 57344) {
/* 352 */                       if (i5 == i) {
                                    break;
                                }
/* 28 */                        return -1;
                            }
/* 358 */                   if (i13 < 65536) {
/* 360 */                       if (i5 == i) {
                                    break;
                                }
/* 28 */                        return -1;
                            }
/* 364 */                   i2 = i5 + 1;
/* 366 */                   if (i5 == i) {
                                break;
                            }
/* 369 */                   if ((i13 != 10 && i13 != 13 && ((i13 >= 0 && i13 < 32) || (127 <= i13 && i13 < 160))) || i13 == 65533) {
/* 28 */                        return -1;
                            }
/* 402 */                   i4 += i13 < 65536 ? 1 : 2;
/* 403 */                   i3 += 4;
/* 278 */                   i5 = i2;
                        }
                    }
/* 422 */           return i4;
                }

                public static final String commonBase64(okio.ByteString byteString) {
/* 1 */             byteString.getClass();
/* 10 */            return Base64.encodeBase64$default(byteString.getData(), null, 1, null);
                }

                public static final String commonBase64Url(okio.ByteString byteString) {
/* 1 */             byteString.getClass();
/* 12 */            return Base64.encodeBase64(byteString.getData(), Base64.getBASE64_URL_SAFE());
                }

                public static final int commonCompareTo(okio.ByteString byteString, okio.ByteString byteString2) {
/* 1 */             byteString.getClass();
/* 4 */             byteString2.getClass();
/* 7 */             int size = byteString.size();
/* 11 */            int size2 = byteString2.size();
/* 15 */            int iMin = Math.min(size, size2);
/* 23 */            for (int i = 0; i < iMin; i++) {
/* 29 */                int i2 = byteString.getByte(i) & 255;
/* 35 */                int i3 = byteString2.getByte(i) & 255;
/* 37 */                if (i2 != i3) {
                            return i2 < i3 ? -1 : 1;
                        }
                    }
/* 46 */            if (size == size2) {
/* 19 */                return 0;
                    }
                    return size < size2 ? -1 : 1;
                }

                public static final void commonCopyInto(okio.ByteString byteString, int i, byte[] bArr, int i2, int i3) {
/* 1 */             byteString.getClass();
/* 4 */             bArr.getClass();
/* 12 */            C1960nd.m6964b(byteString.getData(), i2, bArr, i, i3 + i);
                }

                public static final okio.ByteString commonDecodeBase64(String str) {
/* 1 */             str.getClass();
/* 4 */             byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
/* 8 */             if (bArrDecodeBase64ToArray != null) {
/* 12 */                return new okio.ByteString(bArrDecodeBase64ToArray);
                    }
/* 16 */            return null;
                }

                public static final okio.ByteString commonDecodeHex(String str) {
/* 1 */             str.getClass();
/* 10 */            if (str.length() % 2 != 0) {
/* 64 */                ds0.m3200q("Unexpected hex string: ".concat(str));
/* 67 */                return null;
                    }
/* 16 */            int length = str.length() / 2;
/* 18 */            byte[] bArr = new byte[length];
/* 21 */            for (int i = 0; i < length; i++) {
/* 23 */                int i2 = i * 2;
/* 47 */                bArr[i] = (byte) (decodeHexDigit(str.charAt(i2 + 1)) + (decodeHexDigit(str.charAt(i2)) << 4));
                    }
/* 54 */            return new okio.ByteString(bArr);
                }

                public static final okio.ByteString commonEncodeUtf8(String str) {
/* 1 */             str.getClass();
/* 10 */            okio.ByteString byteString = new okio.ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
/* 13 */            byteString.setUtf8$okio(str);
/* 16 */            return byteString;
                }

                public static final boolean commonEndsWith(okio.ByteString byteString, okio.ByteString byteString2) {
/* 1 */             byteString.getClass();
/* 4 */             byteString2.getClass();
/* 21 */            return byteString.rangeEquals(byteString.size() - byteString2.size(), byteString2, 0, byteString2.size());
                }

                public static final boolean commonEquals(okio.ByteString byteString, Object obj) {
/* 1 */             byteString.getClass();
/* 5 */             if (obj == byteString) {
/* 4 */                 return true;
                    }
/* 11 */            if (obj instanceof okio.ByteString) {
/* 13 */                okio.ByteString byteString2 = (okio.ByteString) obj;
/* 24 */                if (byteString2.size() == byteString.getData().length && byteString2.rangeEquals(0, byteString.getData(), 0, byteString.getData().length)) {
/* 4 */                     return true;
                        }
                    }
/* 10 */            return false;
                }

                public static final byte commonGetByte(okio.ByteString byteString, int i) {
/* 1 */             byteString.getClass();
/* 8 */             return byteString.getData()[i];
                }

                public static final int commonGetSize(okio.ByteString byteString) {
/* 1 */             byteString.getClass();
/* 8 */             return byteString.getData().length;
                }

                public static final int commonHashCode(okio.ByteString byteString) {
/* 1 */             byteString.getClass();
/* 4 */             int hashCode = byteString.getHashCode();
/* 8 */             if (hashCode != 0) {
/* 10 */                return hashCode;
                    }
/* 15 */            int iHashCode = Arrays.hashCode(byteString.getData());
/* 19 */            byteString.setHashCode$okio(iHashCode);
/* 22 */            return iHashCode;
                }

                public static final String commonHex(okio.ByteString byteString) {
/* 1 */             byteString.getClass();
/* 11 */            char[] cArr = new char[byteString.getData().length * 2];
/* 19 */            int i = 0;
/* 20 */            for (byte b : byteString.getData()) {
/* 24 */                int i2 = i + 1;
/* 36 */                cArr[i] = getHEX_DIGIT_CHARS()[(b >> 4) & 15];
/* 38 */                i += 2;
/* 48 */                cArr[i2] = getHEX_DIGIT_CHARS()[b & 15];
                    }
/* 55 */            return new String(cArr);
                }

                public static final int commonIndexOf(okio.ByteString byteString, byte[] bArr, int i) {
/* 1 */             byteString.getClass();
/* 4 */             bArr.getClass();
/* 13 */            int length = byteString.getData().length - bArr.length;
/* 15 */            int iMax = Math.max(i, 0);
/* 19 */            if (iMax > length) {
/* 38 */                return -1;
                    }
/* 30 */            while (!SegmentedByteString.arrayRangeEquals(byteString.getData(), iMax, bArr, 0, bArr.length)) {
/* 33 */                if (iMax == length) {
/* 38 */                    return -1;
                        }
/* 35 */                iMax++;
                    }
/* 32 */            return iMax;
                }

                public static final byte[] commonInternalArray(okio.ByteString byteString) {
/* 1 */             byteString.getClass();
/* 4 */             return byteString.getData();
                }

                public static final int commonLastIndexOf(okio.ByteString byteString, byte[] bArr, int i) {
/* 1 */             byteString.getClass();
/* 4 */             bArr.getClass();
/* 23 */            for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(byteString, i), byteString.getData().length - bArr.length); -1 < iMin; iMin--) {
/* 35 */                if (SegmentedByteString.arrayRangeEquals(byteString.getData(), iMin, bArr, 0, bArr.length)) {
/* 37 */                    return iMin;
                        }
                    }
/* 22 */            return -1;
                }

                public static final okio.ByteString commonOf(byte[] bArr) {
/* 1 */             bArr.getClass();
/* 11 */            return new okio.ByteString(Arrays.copyOf(bArr, bArr.length));
                }

                public static final boolean commonRangeEquals(okio.ByteString byteString, int i, byte[] bArr, int i2, int i3) {
/* 1 */             byteString.getClass();
/* 4 */             bArr.getClass();
                    return i >= 0 && i <= byteString.getData().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && SegmentedByteString.arrayRangeEquals(byteString.getData(), i, bArr, i2, i3);
                }

                public static final boolean commonStartsWith(okio.ByteString byteString, okio.ByteString byteString2) {
/* 1 */             byteString.getClass();
/* 4 */             byteString2.getClass();
/* 12 */            return byteString.rangeEquals(0, byteString2, 0, byteString2.size());
                }

                public static final okio.ByteString commonSubstring(okio.ByteString byteString, int i, int i2) {
/* 1 */             byteString.getClass();
/* 4 */             int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, i2);
/* 9 */             if (i < 0) {
/* 76 */                C1951n4.m6859j("beginIndex < 0");
/* 8 */                 return null;
                    }
/* 16 */            if (iResolveDefaultParameter > byteString.getData().length) {
/* 70 */                ds0.m3200q(AbstractC0886en.m3510n(new StringBuilder("endIndex > length("), byteString.getData().length, ')'));
/* 8 */                 return null;
                    }
/* 20 */            if (iResolveDefaultParameter - i >= 0) {
                        return (i == 0 && iResolveDefaultParameter == byteString.getData().length) ? byteString : new okio.ByteString(C1960nd.m6966d(byteString.getData(), i, iResolveDefaultParameter));
                    }
/* 48 */            C1951n4.m6859j("endIndex < beginIndex");
/* 8 */             return null;
                }

                public static final okio.ByteString commonToAsciiLowercase(okio.ByteString byteString) {
/* 1 */             byteString.getClass();
/* 10 */            for (int i = 0; i < byteString.getData().length; i++) {
/* 16 */                byte b = byteString.getData()[i];
/* 20 */                if (b >= 65 && b <= 90) {
/* 27 */                    byte[] data = byteString.getData();
/* 32 */                    byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
/* 41 */                    bArrCopyOf[i] = (byte) (b + 32);
/* 44 */                    for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
/* 46 */                        byte b2 = bArrCopyOf[i2];
/* 48 */                        if (b2 >= 65 && b2 <= 90) {
/* 56 */                            bArrCopyOf[i2] = (byte) (b2 + 32);
                                }
                            }
/* 63 */                    return new okio.ByteString(bArrCopyOf);
                        }
                    }
/* 70 */            return byteString;
                }

                public static final okio.ByteString commonToAsciiUppercase(okio.ByteString byteString) {
/* 1 */             byteString.getClass();
/* 10 */            for (int i = 0; i < byteString.getData().length; i++) {
/* 16 */                byte b = byteString.getData()[i];
/* 20 */                if (b >= 97 && b <= 122) {
/* 27 */                    byte[] data = byteString.getData();
/* 32 */                    byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
/* 41 */                    bArrCopyOf[i] = (byte) (b - 32);
/* 44 */                    for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
/* 46 */                        byte b2 = bArrCopyOf[i2];
/* 48 */                        if (b2 >= 97 && b2 <= 122) {
/* 56 */                            bArrCopyOf[i2] = (byte) (b2 - 32);
                                }
                            }
/* 63 */                    return new okio.ByteString(bArrCopyOf);
                        }
                    }
/* 70 */            return byteString;
                }

                public static final byte[] commonToByteArray(okio.ByteString byteString) {
/* 1 */             byteString.getClass();
/* 4 */             byte[] data = byteString.getData();
/* 9 */             return Arrays.copyOf(data, data.length);
                }

                public static final okio.ByteString commonToByteString(byte[] bArr, int i, int i2) {
/* 1 */             bArr.getClass();
/* 4 */             int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i2);
/* 12 */            SegmentedByteString.checkOffsetAndCount(bArr.length, i, iResolveDefaultParameter);
/* 22 */            return new okio.ByteString(C1960nd.m6966d(bArr, i, iResolveDefaultParameter + i));
                }

                public static final String commonToString(okio.ByteString byteString) {
/* 1 */             byteString.getClass();
/* 9 */             if (byteString.getData().length == 0) {
/* 11 */                return "[size=0]";
                    }
/* 1 */             int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData(), 64);
/* 32 */            if (iCodePointIndexToCharIndex != -1) {
/* 160 */               String strUtf8 = byteString.utf8();
/* 188 */               String strM6261k = C1852e.m6261k(C1852e.m6261k(C1852e.m6261k(strUtf8.substring(0, iCodePointIndexToCharIndex), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
/* 196 */               if (iCodePointIndexToCharIndex >= strUtf8.length()) {
/* 240 */                   return "[text=" + strM6261k + ']';
                        }
/* 222 */               return "[size=" + byteString.getData().length + " text=" + strM6261k + "…]";
                    }
/* 39 */            if (byteString.getData().length <= 64) {
/* 58 */                return "[hex=" + byteString.hex() + ']';
                    }
/* 65 */            StringBuilder sb = new StringBuilder("[size=");
/* 73 */            sb.append(byteString.getData().length);
/* 78 */            sb.append(" hex=");
/* 81 */            int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, 64);
/* 91 */            if (iResolveDefaultParameter > byteString.getData().length) {
/* 156 */               ds0.m3200q(AbstractC0886en.m3510n(new StringBuilder("endIndex > length("), byteString.getData().length, ')'));
/* 90 */                return null;
                    }
/* 93 */            if (iResolveDefaultParameter < 0) {
/* 134 */               C1951n4.m6859j("endIndex < beginIndex");
/* 90 */                return null;
                    }
/* 100 */           if (iResolveDefaultParameter != byteString.getData().length) {
/* 113 */               byteString = new okio.ByteString(C1960nd.m6966d(byteString.getData(), 0, iResolveDefaultParameter));
                    }
/* 121 */           sb.append(byteString.hex());
/* 124 */           sb.append("…]");
/* 127 */           return sb.toString();
                }

                public static final String commonUtf8(okio.ByteString byteString) {
/* 1 */             byteString.getClass();
/* 4 */             String utf8 = byteString.getUtf8();
/* 8 */             if (utf8 != null) {
/* 21 */                return utf8;
                    }
/* 14 */            String utf8String = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
/* 18 */            byteString.setUtf8$okio(utf8String);
/* 21 */            return utf8String;
                }

                public static final void commonWrite(okio.ByteString byteString, Buffer buffer, int i, int i2) {
/* 1 */             byteString.getClass();
/* 4 */             buffer.getClass();
/* 11 */            buffer.write(byteString.getData(), i, i2);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final int decodeHexDigit(char c) {
/* 3 */             if ('0' <= c && c < ':') {
/* 9 */                 return c - '0';
                    }
/* 13 */            if ('a' <= c && c < 'g') {
/* 19 */                return c - 'W';
                    }
/* 24 */            if ('A' <= c && c < 'G') {
/* 30 */                return c - '7';
                    }
/* 52 */            throw new IllegalArgumentException("Unexpected hex digit: " + c);
                }

                public static final char[] getHEX_DIGIT_CHARS() {
/* 1 */             return HEX_DIGIT_CHARS;
                }

                public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
                }

/* 16 */        public static final boolean commonStartsWith(okio.ByteString byteString, byte[] bArr) {
                    byteString.getClass();
                    bArr.getClass();
/* 17 */            return byteString.rangeEquals(0, bArr, 0, bArr.length);
                }

/* 25 */        public static final boolean commonEndsWith(okio.ByteString byteString, byte[] bArr) {
                    byteString.getClass();
                    bArr.getClass();
/* 26 */            return byteString.rangeEquals(byteString.size() - bArr.length, bArr, 0, bArr.length);
                }

/* 36 */        public static final boolean commonRangeEquals(okio.ByteString byteString, int i, okio.ByteString byteString2, int i2, int i3) {
                    byteString.getClass();
                    byteString2.getClass();
/* 37 */            return byteString2.rangeEquals(i2, byteString.getData(), i, i3);
                }

/* 41 */        public static final int commonLastIndexOf(okio.ByteString byteString, okio.ByteString byteString2, int i) {
                    byteString.getClass();
                    byteString2.getClass();
/* 42 */            return byteString.lastIndexOf(byteString2.internalArray$okio(), i);
                }
            }
