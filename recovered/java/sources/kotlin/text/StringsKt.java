            package kotlin.text;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.ranges.IntRange;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.C2122qw;
            import p000.di2;
            import p000.mx0;
            import p000.q70;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"yh2", "kotlin/text/c", "zh2", "ai2", "bi2", "ci2", "kotlin/text/d", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/e", "kotlin/text/StringsKt__StringsKt", "kotlin/text/h", "di2"}, m6176d2 = {}, m6177k = 4, m6178mv = {2, 2, 0}, m6180xi = 49)
            public final class StringsKt extends di2 {
                /* JADX INFO: renamed from: A */
                public static boolean m6225A(String str, char c) {
/* 1 */             str.getClass();
                    return m6226B(str, c, 0, 2) >= 0;
                }

                /* JADX INFO: renamed from: B */
                public static int m6226B(CharSequence charSequence, char c, int i, int i2) {
/* 4 */             if ((i2 & 2) != 0) {
/* 6 */                 i = 0;
                    }
/* 7 */             charSequence.getClass();
                    return !(charSequence instanceof String) ? StringsKt__StringsKt.m6245q(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
                }

                /* JADX INFO: renamed from: C */
                public static /* synthetic */ int m6227C(CharSequence charSequence, String str, int i, boolean z, int i2) {
/* 4 */             if ((i2 & 2) != 0) {
/* 6 */                 i = 0;
                    }
/* 9 */             if ((i2 & 4) != 0) {
/* 11 */                z = false;
                    }
/* 12 */            return StringsKt__StringsKt.m6243o(i, charSequence, str, z);
                }

                /* JADX INFO: renamed from: D */
                public static boolean m6228D(CharSequence charSequence) {
/* 1 */             charSequence.getClass();
/* 10 */            for (int i = 0; i < charSequence.length(); i++) {
/* 20 */                if (!CharsKt__CharJVMKt.m6221a(charSequence.charAt(i))) {
/* 4 */                     return false;
                        }
                    }
/* 26 */            return true;
                }

                /* JADX INFO: renamed from: E */
                public static int m6229E(int i, String str, String str2) {
/* 10 */            int iM6242n = (i & 2) != 0 ? StringsKt__StringsKt.m6242n(str) : 0;
/* 11 */            str.getClass();
/* 14 */            str2.getClass();
/* 17 */            return str.lastIndexOf(str2, iM6242n);
                }

                /* JADX INFO: renamed from: F */
                public static int m6230F(String str, char c, int i, int i2) {
/* 3 */             if ((i2 & 2) != 0) {
/* 5 */                 i = StringsKt__StringsKt.m6242n(str);
                    }
/* 9 */             str.getClass();
/* 12 */            return str.lastIndexOf(c, i);
                }

                /* JADX INFO: renamed from: G */
                public static String m6231G(int i, String str) {
                    CharSequence charSequenceSubSequence;
/* 1 */             str.getClass();
/* 4 */             if (i < 0) {
/* 62 */                C1951n4.m6859j(AbstractC0886en.m3505i(i, "Desired length ", " is less than zero."));
/* 65 */                return null;
                    }
/* 10 */            if (i <= str.length()) {
/* 17 */                charSequenceSubSequence = str.subSequence(0, str.length());
                    } else {
/* 24 */                StringBuilder sb = new StringBuilder(i);
/* 27 */                sb.append((CharSequence) str);
/* 34 */                int length = i - str.length();
/* 35 */                int i2 = 1;
/* 36 */                if (1 <= length) {
                            while (true) {
/* 40 */                        sb.append(' ');
/* 43 */                        if (i2 == length) {
                                    break;
                                }
/* 45 */                        i2++;
                            }
                        }
/* 48 */                charSequenceSubSequence = sb;
                    }
/* 49 */            return charSequenceSubSequence.toString();
                }

                /* JADX INFO: renamed from: H */
                public static String m6232H(int i, String str) {
                    CharSequence charSequenceSubSequence;
/* 1 */             str.getClass();
/* 4 */             if (i < 0) {
/* 62 */                C1951n4.m6859j(AbstractC0886en.m3505i(i, "Desired length ", " is less than zero."));
/* 65 */                return null;
                    }
/* 10 */            if (i <= str.length()) {
/* 17 */                charSequenceSubSequence = str.subSequence(0, str.length());
                    } else {
/* 24 */                StringBuilder sb = new StringBuilder(i);
/* 31 */                int length = i - str.length();
/* 32 */                int i2 = 1;
/* 33 */                if (1 <= length) {
                            while (true) {
/* 37 */                        sb.append('0');
/* 40 */                        if (i2 == length) {
                                    break;
                                }
/* 42 */                        i2++;
                            }
                        }
/* 45 */                sb.append((CharSequence) str);
/* 48 */                charSequenceSubSequence = sb;
                    }
/* 49 */            return charSequenceSubSequence.toString();
                }

                /* JADX INFO: renamed from: I */
                public static String m6233I(String str, String str2) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
                    return StringsKt__StringsKt.m6250v(str, str2) ? str.substring(str2.length()) : str;
                }

                /* JADX INFO: renamed from: J */
                public static String m6234J(String str) {
/* 1 */             str.getClass();
                    return (str.length() >= 2 && StringsKt__StringsKt.m6250v(str, "\"") && C1852e.m6257g(str, "\"", false)) ? str.substring(1, str.length() - 1) : str;
                }

                /* JADX INFO: renamed from: K */
                public static List m6235K(CharSequence charSequence, final char[] cArr) {
/* 1 */             charSequence.getClass();
/* 6 */             int i = 1;
/* 7 */             if (cArr.length == 1) {
/* 15 */                return StringsKt__StringsKt.m6249u(0, charSequence, String.valueOf(cArr[0]), false);
                    }
/* 20 */            StringsKt__StringsKt.m6248t(0);
/* 35 */            mx0 mx0Var = new mx0(new q70(charSequence, 0, new Function2() { // from class: kotlin.text.f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
/* 1 */                     CharSequence charSequence2 = (CharSequence) obj;
/* 5 */                     int iIntValue = ((Integer) obj2).intValue();
/* 9 */                     charSequence2.getClass();
/* 15 */                    int iM6245q = StringsKt__StringsKt.m6245q(charSequence2, cArr, iIntValue, false);
/* 19 */                    if (iM6245q < 0) {
/* 21 */                        return null;
                            }
/* 34 */                    return new Pair(Integer.valueOf(iM6245q), 1);
                        }
                    }), i);
/* 46 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(mx0Var, 10));
/* 49 */            Iterator it = mx0Var.iterator();
                    while (true) {
/* 54 */                C1849b c1849b = (C1849b) it;
/* 60 */                if (!c1849b.hasNext()) {
/* 88 */                    return arrayList;
                        }
/* 66 */                IntRange intRange = (IntRange) c1849b.next();
/* 68 */                intRange.getClass();
/* 84 */                arrayList.add(charSequence.subSequence(intRange.f12926a, intRange.f12927b + 1).toString());
                    }
                }

                /* JADX INFO: renamed from: M */
                public static String m6237M(String str, String str2, String str3) {
/* 3 */             int iM6227C = m6227C(str, str2, 0, false, 6);
                    return iM6227C == -1 ? str3 : str.substring(str2.length() + iM6227C, str.length());
                }

                /* JADX INFO: renamed from: N */
                public static Long m6238N(String str) {
                    boolean z;
/* 3 */             str.getClass();
/* 8 */             CharsKt__CharJVMKt.checkRadix(10);
/* 11 */            int length = str.length();
/* 15 */            if (length == 0) {
/* 106 */               return null;
                    }
/* 18 */            int i = 0;
/* 19 */            char cCharAt = str.charAt(0);
/* 29 */            long j = -9223372036854775807L;
/* 34 */            if (Intrinsics.m6217b(cCharAt, 48) < 0) {
/* 36 */                z = true;
/* 37 */                if (length == 1) {
/* 106 */                   return null;
                        }
/* 42 */                if (cCharAt == '+') {
/* 55 */                    z = false;
/* 56 */                    i = 1;
                        } else {
/* 46 */                    if (cCharAt != '-') {
/* 106 */                       return null;
                            }
/* 49 */                    j = Long.MIN_VALUE;
/* 51 */                    i = 1;
                        }
                    } else {
/* 59 */                z = false;
                    }
/* 65 */            long j2 = 0;
/* 67 */            long j3 = -256204778801521550L;
/* 68 */            while (i < length) {
/* 74 */                int iDigit = Character.digit((int) str.charAt(i), 10);
/* 78 */                if (iDigit < 0) {
/* 106 */                   return null;
                        }
/* 85 */                if (j2 < j3) {
/* 89 */                    if (j3 != -256204778801521550L) {
/* 106 */                       return null;
                            }
/* 91 */                    j3 = j / 10;
/* 95 */                    if (j2 < j3) {
/* 106 */                       return null;
                            }
                        }
/* 98 */                long j4 = j2 * 10;
                        long j5 = iDigit;
/* 104 */               if (j4 < j + j5) {
/* 106 */                   return null;
                        }
/* 108 */               j2 = j4 - j5;
/* 109 */               i++;
                    }
                    return z ? Long.valueOf(j2) : Long.valueOf(-j2);
                }

                /* JADX INFO: renamed from: O */
                public static CharSequence m6239O(CharSequence charSequence) {
/* 1 */             charSequence.getClass();
/* 9 */             int length = charSequence.length() - 1;
/* 10 */            int i = 0;
/* 11 */            boolean z = false;
/* 12 */            while (i <= length) {
/* 23 */                boolean zM6221a = CharsKt__CharJVMKt.m6221a(charSequence.charAt(!z ? i : length));
/* 27 */                if (z) {
/* 36 */                    if (!zM6221a) {
                                break;
                            }
/* 39 */                    length--;
                        } else if (zM6221a) {
/* 33 */                    i++;
                        } else {
/* 31 */                    z = true;
                        }
                    }
/* 43 */            return charSequence.subSequence(i, length + 1);
                }

                /* JADX INFO: renamed from: z */
                public static boolean m6240z(CharSequence charSequence, CharSequence charSequence2, boolean z) {
/* 1 */             charSequence.getClass();
/* 4 */             charSequence2.getClass();
/* 10 */            if (charSequence2 instanceof String) {
/* 19 */                if (m6227C(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
/* 37 */                    return true;
                        }
                    } else if (StringsKt__StringsKt.m6244p(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
/* 37 */                return true;
                    }
/* 9 */             return false;
                }
            }
