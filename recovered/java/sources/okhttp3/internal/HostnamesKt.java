            package okhttp3.internal;

            import java.net.IDN;
            import java.net.InetAddress;
            import java.util.Arrays;
            import java.util.Locale;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import okio.Buffer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, m6176d2 = {"decodeIpv4Suffix", HttpUrl.FRAGMENT_ENCODE_SET, "input", HttpUrl.FRAGMENT_ENCODE_SET, "pos", HttpUrl.FRAGMENT_ENCODE_SET, "limit", "address", HttpUrl.FRAGMENT_ENCODE_SET, "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", "okhttp"}, m6177k = 2, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class HostnamesKt {
                private static final boolean containsInvalidHostnameAsciiCodes(String str) {
/* 1 */             int length = str.length();
/* 6 */             int i = 0;
/* 7 */             while (i < length) {
/* 9 */                 int i2 = i + 1;
/* 11 */                char cCharAt = str.charAt(i);
/* 21 */                if (Intrinsics.m6217b(cCharAt, 31) <= 0 || Intrinsics.m6217b(cCharAt, 127) >= 0 || StringsKt.m6226B(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
/* 45 */                    return true;
                        }
/* 43 */                i = i2;
                    }
/* 5 */             return false;
                }

                private static final boolean decodeIpv4Suffix(String str, int i, int i2, byte[] bArr, int i3) {
/* 1 */             int i4 = i3;
/* 3 */             while (i < i2) {
/* 6 */                 if (i4 == bArr.length) {
/* 2 */                     return false;
                        }
/* 9 */                 if (i4 != i3) {
/* 17 */                    if (str.charAt(i) != '.') {
/* 2 */                         return false;
                            }
/* 20 */                    i++;
                        }
/* 22 */                int i5 = i;
/* 23 */                int i6 = 0;
/* 24 */                while (i5 < i2) {
/* 26 */                    char cCharAt = str.charAt(i5);
/* 36 */                    if (Intrinsics.m6217b(cCharAt, 48) < 0 || Intrinsics.m6217b(cCharAt, 57) > 0) {
                                break;
                            }
/* 47 */                    if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + cCharAt) - 48) > 255) {
/* 2 */                         return false;
                            }
/* 61 */                    i5++;
                        }
/* 66 */                if (i5 - i == 0) {
/* 2 */                     return false;
                        }
/* 72 */                bArr[i4] = (byte) i6;
/* 69 */                i4++;
/* 75 */                i = i5;
                    }
                    return i4 == i3 + 4;
                }

                /* JADX WARN: Code duplicated, block: B:29:0x004d  */
                /* JADX WARN: Code duplicated, block: B:32:0x0058 A[LOOP:1: B:28:0x004b->B:32:0x0058, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:54:0x005e A[EDGE_INSN: B:54:0x005e->B:33:0x005e BREAK  A[LOOP:1: B:28:0x004b->B:32:0x0058], SYNTHETIC] */
                private static final InetAddress decodeIpv6(String str, int i, int i2) {
                    int i3;
                    int i4;
                    int hexDigit;
/* 3 */             byte[] bArr = new byte[16];
/* 7 */             int i5 = 0;
/* 8 */             int i6 = -1;
/* 9 */             int i7 = -1;
/* 10 */            while (i < i2) {
/* 12 */                if (i5 == 16) {
/* 124 */                   return null;
                        }
/* 16 */                int i8 = i + 2;
/* 18 */                if (i8 <= i2 && C1852e.m6262l(i, str, "::", false)) {
/* 28 */                    if (i6 != -1) {
/* 124 */                       return null;
                            }
/* 32 */                    i5 += 2;
/* 34 */                    i6 = i5;
/* 35 */                    if (i8 == i2) {
                                break;
                            }
/* 38 */                    i7 = i8;
/* 74 */                    i3 = 0;
/* 75 */                    i = i7;
/* 76 */                    while (i < i2) {
/* 82 */                        hexDigit = Util.parseHexDigit(str.charAt(i));
/* 86 */                        if (hexDigit == -1) {
                                    break;
                                    break;
                                }
/* 91 */                        i3 = (i3 << 4) + hexDigit;
/* 92 */                        i++;
                            }
/* 95 */                    i4 = i - i7;
                            return i4 == 0 ? null : null;
                        }
/* 40 */                if (i5 != 0) {
/* 48 */                    if (!C1852e.m6262l(i, str, ":", false)) {
/* 60 */                        if (!C1852e.m6262l(i, str, ".", false) || !decodeIpv4Suffix(str, i7, i2, bArr, i5 - 2)) {
/* 124 */                           return null;
                                }
/* 71 */                        i5 += 2;
                                break;
                            }
/* 50 */                    i++;
                        }
/* 52 */                i7 = i;
/* 74 */                i3 = 0;
/* 75 */                i = i7;
/* 76 */                while (i < i2) {
/* 82 */                    hexDigit = Util.parseHexDigit(str.charAt(i));
/* 86 */                    if (hexDigit == -1) {
                                break;
                            }
/* 91 */                    i3 = (i3 << 4) + hexDigit;
/* 92 */                    i++;
                        }
/* 95 */                i4 = i - i7;
/* 100 */               if (i4 == 0 && i4 <= 4) {
/* 103 */                   int i9 = i5 + 1;
/* 110 */                   bArr[i5] = (byte) ((i3 >>> 8) & 255);
/* 112 */                   i5 += 2;
/* 117 */                   bArr[i9] = (byte) (i3 & 255);
                        }
                    }
/* 120 */           if (i5 != 16) {
/* 122 */               if (i6 == -1) {
/* 124 */                   return null;
                        }
/* 126 */               int i10 = i5 - i6;
/* 130 */               System.arraycopy(bArr, i6, bArr, 16 - i10, i10);
/* 135 */               Arrays.fill(bArr, i6, (16 - i5) + i6, (byte) 0);
                    }
/* 138 */           return InetAddress.getByAddress(bArr);
                }

                private static final String inet6AddressToAscii(byte[] bArr) {
/* 1 */             int i = -1;
/* 2 */             int i2 = 0;
/* 3 */             int i3 = 0;
/* 4 */             int i4 = 0;
/* 8 */             while (i3 < bArr.length) {
/* 10 */                int i5 = i3;
/* 11 */                while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
/* 23 */                    i5 += 2;
                        }
/* 26 */                int i6 = i5 - i3;
/* 28 */                if (i6 > i4 && i6 >= 4) {
/* 33 */                    i = i3;
/* 34 */                    i4 = i6;
                        }
/* 35 */                i3 = i5 + 2;
                    }
/* 40 */            Buffer buffer = new Buffer();
/* 44 */            while (i2 < bArr.length) {
/* 48 */                if (i2 == i) {
/* 50 */                    buffer.writeByte(58);
/* 53 */                    i2 += i4;
/* 54 */                    if (i2 == 16) {
/* 56 */                        buffer.writeByte(58);
                            }
                        } else {
/* 60 */                    if (i2 > 0) {
/* 62 */                        buffer.writeByte(58);
                            }
/* 85 */                    buffer.writeHexadecimalUnsignedLong((Util.and(bArr[i2], 255) << 8) | Util.and(bArr[i2 + 1], 255));
/* 88 */                    i2 += 2;
                        }
                    }
/* 91 */            return buffer.readUtf8();
                }

                public static final String toCanonicalHost(String str) {
/* 1 */             str.getClass();
/* 11 */            if (!StringsKt.m6240z(str, ":", false)) {
                        try {
/* 99 */                    String ascii = IDN.toASCII(str);
/* 103 */                   ascii.getClass();
/* 106 */                   Locale locale = Locale.US;
/* 108 */                   locale.getClass();
/* 111 */                   String lowerCase = ascii.toLowerCase(locale);
/* 115 */                   lowerCase.getClass();
/* 122 */                   if (lowerCase.length() == 0 || containsInvalidHostnameAsciiCodes(lowerCase)) {
/* 133 */                       return null;
                            }
/* 132 */                   return lowerCase;
                        } catch (IllegalArgumentException unused) {
/* 133 */                   return null;
                        }
                    }
/* 44 */            InetAddress inetAddressDecodeIpv6 = (C1852e.m6263m(str, "[", false) && C1852e.m6257g(str, "]", false)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
/* 48 */            if (inetAddressDecodeIpv6 == null) {
/* 133 */               return null;
                    }
/* 51 */            byte[] address = inetAddressDecodeIpv6.getAddress();
/* 58 */            if (address.length == 16) {
/* 60 */                return inet6AddressToAscii(address);
                    }
/* 67 */            if (address.length == 4) {
/* 69 */                return inetAddressDecodeIpv6.getHostAddress();
                    }
/* 98 */            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
                }
            }
