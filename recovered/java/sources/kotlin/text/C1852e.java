            package kotlin.text;

            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.AbstractC2237u;
            import p000.C1951n4;
            import p000.C2089q;
            
            /* JADX INFO: renamed from: kotlin.text.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C1852e extends StringsKt__StringNumberConversionsKt {
                /* JADX INFO: renamed from: f */
                public static String m6256f(char[] cArr, int i, int i2) {
/* 1 */             C2089q c2089q = AbstractC2237u.Companion;
/* 3 */             int length = cArr.length;
/* 4 */             c2089q.getClass();
/* 9 */             if (i >= 0 && i2 <= length) {
/* 13 */                if (i <= i2) {
/* 18 */                    return new String(cArr, i, i2 - i);
                        }
/* 28 */                C1951n4.m6859j(AbstractC0886en.m3506j("startIndex: ", i, i2, " > endIndex: "));
/* 31 */                return null;
                    }
/* 66 */            throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + length);
                }

                /* JADX INFO: renamed from: g */
                public static boolean m6257g(String str, String str2, boolean z) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
                    return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
                }

                /* JADX INFO: renamed from: h */
                public static boolean m6258h(String str, String str2) {
/* 1 */             if (str == null) {
                        return str2 == null;
                    }
/* 9 */             return str.equalsIgnoreCase(str2);
                }

                /* JADX INFO: renamed from: i */
                public static boolean m6259i(int i, int i2, int i3, String str, String str2, boolean z) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
                    return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
                }

                /* JADX INFO: renamed from: j */
                public static String m6260j(int i, String str) {
/* 1 */             if (i < 0) {
/* 97 */                throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
                    }
/* 3 */             if (i == 0) {
/* 66 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 5 */             int i2 = 1;
/* 6 */             if (i == 1) {
/* 61 */                return str.toString();
                    }
/* 8 */             int length = str.length();
/* 12 */            if (length == 0) {
/* 66 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 14 */            if (length != 1) {
/* 23 */                StringBuilder sb = new StringBuilder(str.length() * i);
/* 26 */                if (1 <= i) {
                            while (true) {
/* 28 */                        sb.append((CharSequence) str);
/* 31 */                        if (i2 == i) {
                                    break;
                                }
/* 33 */                        i2++;
                            }
                        }
/* 36 */                return sb.toString();
                    }
/* 42 */            char cCharAt = str.charAt(0);
/* 46 */            char[] cArr = new char[i];
/* 48 */            for (int i3 = 0; i3 < i; i3++) {
/* 50 */                cArr[i3] = cCharAt;
                    }
/* 57 */            return new String(cArr);
                }

                /* JADX INFO: renamed from: k */
                public static String m6261k(String str, String str2, String str3) {
/* 1 */             str.getClass();
/* 4 */             str3.getClass();
/* 8 */             int iM6243o = StringsKt__StringsKt.m6243o(0, str, str2, false);
/* 12 */            if (iM6243o < 0) {
/* 14 */                return str;
                    }
/* 15 */            int length = str2.length();
/* 20 */            int i = length >= 1 ? length : 1;
/* 33 */            int length2 = str3.length() + (str.length() - length);
/* 34 */            if (length2 < 0) {
/* 80 */                throw new OutOfMemoryError();
                    }
/* 38 */            StringBuilder sb = new StringBuilder(length2);
/* 41 */            int i2 = 0;
/* 61 */            do {
/* 42 */                sb.append((CharSequence) str, i2, iM6243o);
/* 45 */                sb.append(str3);
/* 48 */                i2 = iM6243o + length;
/* 54 */                if (iM6243o >= str.length()) {
                            break;
                        }
/* 57 */                iM6243o = StringsKt__StringsKt.m6243o(iM6243o + i, str, str2, false);
/* 61 */            } while (iM6243o > 0);
/* 67 */            sb.append((CharSequence) str, i2, str.length());
/* 70 */            return sb.toString();
                }

                /* JADX INFO: renamed from: l */
                public static boolean m6262l(int i, String str, String str2, boolean z) {
/* 1 */             str.getClass();
                    return !z ? str.startsWith(str2, i) : m6259i(i, 0, str2.length(), str, str2, z);
                }

                /* JADX INFO: renamed from: m */
                public static boolean m6263m(String str, String str2, boolean z) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
                    return !z ? str.startsWith(str2) : m6259i(0, 0, str2.length(), str, str2, z);
                }
            }
