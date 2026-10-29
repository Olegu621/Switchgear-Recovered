            package okio;

            import java.util.Arrays;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: okio.-Base64, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\nH\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n*\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005¨\u0006\r"}, m6176d2 = {"BASE64", HttpUrl.FRAGMENT_ENCODE_SET, "getBASE64$annotations", "()V", "getBASE64", "()[B", "BASE64_URL_SAFE", "getBASE64_URL_SAFE$annotations", "getBASE64_URL_SAFE", "decodeBase64ToArray", HttpUrl.FRAGMENT_ENCODE_SET, "encodeBase64", "map", "okio"}, m6177k = 2, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class Base64 {
                private static final byte[] BASE64;
                private static final byte[] BASE64_URL_SAFE;

                static {
/* 1 */             ByteString.Companion companion = ByteString.Companion;
/* 13 */            BASE64 = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
/* 25 */            BASE64_URL_SAFE = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
                }

                public static final byte[] decodeBase64ToArray(String str) {
                    int i;
                    char cCharAt;
/* 1 */             str.getClass();
/* 4 */             int length = str.length();
/* 16 */            while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
/* 37 */                length--;
                    }
/* 47 */            int i2 = (int) ((((long) length) * 6) / 8);
/* 48 */            byte[] bArr = new byte[i2];
/* 51 */            int i3 = 0;
/* 52 */            int i4 = 0;
/* 53 */            int i5 = 0;
/* 55 */            for (int i6 = 0; i6 < length; i6++) {
/* 57 */                char cCharAt2 = str.charAt(i6);
/* 63 */                if ('A' <= cCharAt2 && cCharAt2 < '[') {
/* 69 */                    i = cCharAt2 - 'A';
                        } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
/* 80 */                    i = cCharAt2 - 'G';
                        } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
/* 91 */                    i = cCharAt2 + 4;
                        } else if (cCharAt2 == '+' || cCharAt2 == '-') {
/* 125 */                   i = 62;
                        } else {
/* 105 */                   if (cCharAt2 == '/' || cCharAt2 == '_') {
/* 122 */                       i = 63;
                            } else if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
/* 54 */                        return null;
                            }
                        }
/* 129 */               i4 = (i4 << 6) | i;
/* 130 */               i3++;
/* 134 */               if (i3 % 4 == 0) {
/* 141 */                   bArr[i5] = (byte) (i4 >> 16);
/* 143 */                   int i7 = i5 + 2;
/* 148 */                   bArr[i5 + 1] = (byte) (i4 >> 8);
/* 150 */                   i5 += 3;
/* 153 */                   bArr[i7] = (byte) i4;
                        }
                    }
/* 158 */           int i8 = i3 % 4;
/* 161 */           if (i8 == 1) {
/* 54 */                return null;
                    }
/* 164 */           if (i8 == 2) {
/* 194 */               bArr[i5] = (byte) ((i4 << 12) >> 16);
/* 189 */               i5++;
                    } else if (i8 == 3) {
/* 170 */               int i9 = i4 << 6;
/* 172 */               int i10 = i5 + 1;
/* 177 */               bArr[i5] = (byte) (i9 >> 16);
/* 179 */               i5 += 2;
/* 184 */               bArr[i10] = (byte) (i9 >> 8);
                    }
                    return i5 == i2 ? bArr : Arrays.copyOf(bArr, i5);
                }

                public static final String encodeBase64(byte[] bArr, byte[] bArr2) {
/* 1 */             bArr.getClass();
/* 4 */             bArr2.getClass();
/* 14 */            byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
/* 20 */            int length = bArr.length - (bArr.length % 3);
/* 21 */            int i = 0;
/* 22 */            int i2 = 0;
/* 23 */            while (i < length) {
/* 27 */                byte b = bArr[i];
/* 29 */                int i3 = i + 2;
/* 31 */                byte b2 = bArr[i + 1];
/* 33 */                i += 3;
/* 35 */                byte b3 = bArr[i3];
/* 44 */                bArr3[i2] = bArr2[(b & 255) >> 2];
/* 59 */                bArr3[i2 + 1] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
/* 61 */                int i4 = i2 + 3;
/* 73 */                bArr3[i2 + 2] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
/* 75 */                i2 += 4;
/* 81 */                bArr3[i4] = bArr2[b3 & Utf8.REPLACEMENT_BYTE];
                    }
/* 85 */            int length2 = bArr.length - length;
/* 89 */            if (length2 == 1) {
/* 136 */               byte b4 = bArr[i];
/* 146 */               bArr3[i2] = bArr2[(b4 & 255) >> 2];
/* 156 */               bArr3[i2 + 1] = bArr2[(b4 & 3) << 4];
/* 160 */               bArr3[i2 + 2] = 61;
/* 162 */               bArr3[i2 + 3] = 61;
                    } else if (length2 == 2) {
/* 94 */                int i5 = i + 1;
/* 96 */                byte b5 = bArr[i];
/* 98 */                byte b6 = bArr[i5];
/* 107 */               bArr3[i2] = bArr2[(b5 & 255) >> 2];
/* 122 */               bArr3[i2 + 1] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
/* 131 */               bArr3[i2 + 2] = bArr2[(b6 & 15) << 2];
/* 133 */               bArr3[i2 + 3] = 61;
                    }
/* 164 */           return _JvmPlatformKt.toUtf8String(bArr3);
                }

                public static /* synthetic */ String encodeBase64$default(byte[] bArr, byte[] bArr2, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 bArr2 = BASE64;
                    }
/* 7 */             return encodeBase64(bArr, bArr2);
                }

                public static final byte[] getBASE64() {
/* 1 */             return BASE64;
                }

                public static /* synthetic */ void getBASE64$annotations() {
                }

                public static final byte[] getBASE64_URL_SAFE() {
/* 1 */             return BASE64_URL_SAFE;
                }

                public static /* synthetic */ void getBASE64_URL_SAFE$annotations() {
                }
            }
