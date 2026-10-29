            package kotlin.text;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.NoSuchElementException;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.collections.C1839a;
            import kotlin.jvm.functions.Function2;
            import kotlin.ranges.C1847a;
            import kotlin.ranges.IntRange;
            import p000.C1951n4;
            import p000.C2122qw;
            import p000.ds0;
            import p000.fm0;
            import p000.mx0;
            import p000.nd0;
            import p000.q70;
            import p000.u71;
            
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m6176d2 = {"kotlin-stdlib"}, m6177k = 5, m6178mv = {2, 2, 0}, m6180xi = 49, m6181xs = "kotlin/text/StringsKt")
            public class StringsKt__StringsKt extends C1852e {
                /* JADX INFO: renamed from: n */
                public static final int m6242n(CharSequence charSequence) {
/* 1 */             charSequence.getClass();
/* 8 */             return charSequence.length() - 1;
                }

                /* JADX INFO: renamed from: o */
                public static final int m6243o(int i, CharSequence charSequence, String str, boolean z) {
/* 1 */             charSequence.getClass();
/* 4 */             str.getClass();
                    return (z || !(charSequence instanceof String)) ? m6244p(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
                }

                /* JADX INFO: renamed from: p */
                public static final int m6244p(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
                    C1847a c1847a;
/* 3 */             if (z2) {
/* 22 */                int iM6242n = m6242n(charSequence);
/* 26 */                if (i > iM6242n) {
/* 28 */                    i = iM6242n;
                        }
/* 29 */                if (i2 < 0) {
/* 31 */                    i2 = 0;
                        }
/* 34 */                C1847a.f12925d.getClass();
/* 39 */                c1847a = new C1847a(i, i2, -1);
                    } else {
/* 7 */                 if (i < 0) {
/* 9 */                     i = 0;
                        }
/* 10 */                int length = charSequence.length();
/* 14 */                if (i2 > length) {
/* 16 */                    i2 = length;
                        }
/* 18 */                c1847a = new IntRange(i, i2, 1);
                    }
/* 42 */            boolean z3 = charSequence instanceof String;
/* 44 */            int i3 = c1847a.f12928c;
/* 46 */            int i4 = c1847a.f12927b;
/* 48 */            int i5 = c1847a.f12926a;
/* 50 */            if (!z3 || !(charSequence2 instanceof String)) {
/* 89 */                boolean z4 = z;
/* 90 */                if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                            while (true) {
/* 103 */                       CharSequence charSequence3 = charSequence;
/* 104 */                       CharSequence charSequence4 = charSequence2;
/* 105 */                       boolean z5 = z4;
/* 111 */                       z4 = z5;
/* 112 */                       if (m6247s(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
/* 114 */                           return i5;
                                }
/* 115 */                       if (i5 != i4) {
/* 117 */                           i5 += i3;
/* 118 */                           charSequence2 = charSequence4;
/* 119 */                           charSequence = charSequence3;
                                }
                            }
                        }
                    } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
/* 64 */                int i6 = i5;
                        while (true) {
/* 66 */                    String str = (String) charSequence2;
/* 76 */                    boolean z6 = z;
/* 81 */                    if (C1852e.m6259i(0, i6, str.length(), str, (String) charSequence, z6)) {
/* 83 */                        return i6;
                            }
/* 84 */                    if (i6 != i4) {
/* 86 */                        i6 += i3;
/* 87 */                        z = z6;
                            }
                        }
                    }
/* 1 */             return -1;
                }

                /* JADX INFO: renamed from: q */
                public static final int m6245q(CharSequence charSequence, char[] cArr, int i, boolean z) {
/* 1 */             charSequence.getClass();
/* 4 */             char c = 0;
/* 6 */             if (!z && cArr.length == 1 && (charSequence instanceof String)) {
/* 15 */                int length = cArr.length;
/* 16 */                if (length == 0) {
/* 42 */                    throw new NoSuchElementException("Array is empty.");
                        }
/* 18 */                if (length == 1) {
/* 20 */                    c = cArr[0];
                        } else {
/* 25 */                    C1951n4.m6859j("Array has more than one element.");
                        }
/* 30 */                return ((String) charSequence).indexOf(c, i);
                    }
/* 43 */            if (i < 0) {
/* 45 */                i = 0;
                    }
/* 50 */            int length2 = charSequence.length() - 1;
/* 51 */            if (i > length2) {
/* 78 */                return -1;
                    }
                    while (true) {
/* 53 */                char cCharAt = charSequence.charAt(i);
/* 59 */                for (char c2 : cArr) {
/* 67 */                    if (C1848a.m6251b(c2, cCharAt, z)) {
/* 69 */                        return i;
                            }
                        }
/* 73 */                if (i == length2) {
/* 78 */                    return -1;
                        }
/* 75 */                i++;
                    }
                }

                /* JADX INFO: renamed from: r */
                public static final List m6246r(String str) {
/* 3 */             u71 u71Var = new u71(str);
/* 10 */            if (!u71Var.hasNext()) {
/* 12 */                return nd0.f14189a;
                    }
/* 15 */            Object next = u71Var.next();
/* 23 */            if (!u71Var.hasNext()) {
/* 25 */                return C1839a.m6210b(next);
                    }
/* 32 */            ArrayList arrayList = new ArrayList();
/* 35 */            arrayList.add(next);
/* 42 */            while (u71Var.hasNext()) {
/* 48 */                arrayList.add(u71Var.next());
                    }
/* 52 */            return arrayList;
                }

                /* JADX INFO: renamed from: s */
                public static final boolean m6247s(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
/* 1 */             charSequence.getClass();
/* 4 */             charSequence2.getClass();
/* 8 */             if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
/* 7 */                 return false;
                    }
/* 28 */            for (int i4 = 0; i4 < i3; i4++) {
/* 46 */                if (!C1848a.m6251b(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
/* 7 */                     return false;
                        }
                    }
/* 52 */            return true;
                }

                public static List split$default(CharSequence charSequence, String[] strArr, final boolean z, int i, int i2, Object obj) {
/* 4 */             if ((i2 & 2) != 0) {
/* 6 */                 z = false;
                    }
/* 9 */             if ((i2 & 4) != 0) {
/* 11 */                i = 0;
                    }
/* 12 */            charSequence.getClass();
/* 15 */            strArr.getClass();
/* 19 */            int i3 = 1;
/* 20 */            if (strArr.length == 1) {
/* 22 */                String str = strArr[0];
/* 28 */                if (str.length() != 0) {
/* 31 */                    return m6249u(i, charSequence, str, z);
                        }
                    }
/* 36 */            m6248t(i);
/* 39 */            final List listAsList = Arrays.asList(strArr);
/* 43 */            listAsList.getClass();
/* 58 */            mx0 mx0Var = new mx0(new q70(charSequence, i, new Function2() { // from class: kotlin.text.g
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Object next;
                            Pair pair;
                            String str2;
                            Pair pair2;
                            boolean z2;
                            Object next2;
/* 2 */                     CharSequence charSequence2 = (CharSequence) obj2;
/* 6 */                     int iIntValue = ((Integer) obj3).intValue();
/* 10 */                    charSequence2.getClass();
/* 13 */                    List list = listAsList;
/* 15 */                    boolean z3 = z;
/* 20 */                    if (z3 || list.size() != 1) {
/* 79 */                        if (iIntValue < 0) {
/* 81 */                            iIntValue = 0;
                                }
/* 86 */                        IntRange intRange = new IntRange(iIntValue, charSequence2.length(), 1);
/* 89 */                        boolean z4 = charSequence2 instanceof String;
/* 91 */                        int i4 = intRange.f12928c;
/* 93 */                        int i5 = intRange.f12927b;
/* 95 */                        if (z4) {
/* 97 */                            if ((i4 > 0 && iIntValue <= i5) || (i4 < 0 && i5 <= iIntValue)) {
/* 105 */                               int i6 = iIntValue;
                                        while (true) {
/* 106 */                                   Iterator it = list.iterator();
                                            while (true) {
/* 114 */                                       if (!it.hasNext()) {
/* 141 */                                           z2 = z3;
/* 142 */                                           next2 = null;
                                                    break;
                                                }
/* 116 */                                       next2 = it.next();
/* 121 */                                       String str3 = (String) next2;
/* 126 */                                       z2 = z3;
/* 136 */                                       if (C1852e.m6259i(0, i6, str3.length(), str3, (String) charSequence2, z2)) {
                                                    break;
                                                }
/* 139 */                                       z3 = z2;
                                            }
/* 143 */                                   String str4 = (String) next2;
/* 145 */                                   if (str4 != null) {
/* 153 */                                       pair = new Pair(Integer.valueOf(i6), str4);
/* 156 */                                       pair2 = pair;
                                            } else if (i6 != i5) {
/* 160 */                                       i6 += i4;
/* 161 */                                       z3 = z2;
                                            }
                                        }
                                    }
                                } else {
/* 164 */                           if ((i4 > 0 && iIntValue <= i5) || (i4 < 0 && i5 <= iIntValue)) {
/* 172 */                               int i7 = iIntValue;
                                        while (true) {
/* 173 */                                   Iterator it2 = list.iterator();
/* 200 */                                   do {
/* 181 */                                       if (!it2.hasNext()) {
/* 203 */                                           next = null;
                                                    break;
                                                }
/* 183 */                                       next = it2.next();
/* 188 */                                       str2 = (String) next;
/* 200 */                                   } while (!StringsKt__StringsKt.m6247s(str2, 0, charSequence2, i7, str2.length(), z3));
/* 204 */                                   String str5 = (String) next;
/* 206 */                                   if (str5 != null) {
/* 214 */                                       pair = new Pair(Integer.valueOf(i7), str5);
/* 156 */                                       pair2 = pair;
                                            } else if (i7 != i5) {
/* 220 */                                       i7 += i4;
                                            }
                                        }
                                    }
                                }
                            } else {
/* 28 */                        int size = list.size();
/* 32 */                        if (size == 0) {
/* 76 */                            throw new NoSuchElementException("List is empty.");
                                }
/* 34 */                        if (size != 1) {
/* 65 */                            C1951n4.m6859j("List has more than one element.");
/* 19 */                            return null;
                                }
/* 40 */                        String str6 = (String) list.get(0);
/* 43 */                        int iM6227C = StringsKt.m6227C(charSequence2, str6, iIntValue, false, 4);
/* 58 */                        pair2 = iM6227C < 0 ? null : new Pair(Integer.valueOf(iM6227C), str6);
                            }
/* 222 */                   if (pair2 != null) {
/* 240 */                       return new Pair(pair2.f12908a, Integer.valueOf(((String) pair2.f12909b).length()));
                            }
/* 19 */                    return null;
                        }
                    }), i3);
/* 69 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(mx0Var, 10));
/* 72 */            Iterator it = mx0Var.iterator();
                    while (true) {
/* 77 */                C1849b c1849b = (C1849b) it;
/* 83 */                if (!c1849b.hasNext()) {
/* 111 */                   return arrayList;
                        }
/* 89 */                IntRange intRange = (IntRange) c1849b.next();
/* 91 */                intRange.getClass();
/* 107 */               arrayList.add(charSequence.subSequence(intRange.f12926a, intRange.f12927b + 1).toString());
                    }
                }

                /* JADX INFO: renamed from: t */
                public static final void m6248t(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 return;
                    }
/* 10 */            ds0.m3200q(fm0.m3781g(i, "Limit must be non-negative, but was "));
                }

                /* JADX INFO: renamed from: u */
                public static final List m6249u(int i, CharSequence charSequence, String str, boolean z) {
/* 1 */             m6248t(i);
/* 4 */             int length = 0;
/* 5 */             int iM6243o = m6243o(0, charSequence, str, z);
/* 10 */            if (iM6243o == -1 || i == 1) {
/* 86 */                return C1839a.m6210b(charSequence.toString());
                    }
/* 20 */            boolean z2 = i > 0;
/* 23 */            int i2 = 10;
/* 25 */            if (z2 && i <= 10) {
/* 30 */                i2 = i;
                    }
/* 31 */            ArrayList arrayList = new ArrayList(i2);
/* 64 */            do {
/* 42 */                arrayList.add(charSequence.subSequence(length, iM6243o).toString());
/* 49 */                length = str.length() + iM6243o;
/* 50 */                if (z2 && arrayList.size() == i - 1) {
                            break;
                        }
/* 60 */                iM6243o = m6243o(length, charSequence, str, z);
/* 64 */            } while (iM6243o != -1);
/* 78 */            arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
/* 81 */            return arrayList;
                }

                /* JADX INFO: renamed from: v */
                public static boolean m6250v(String str, CharSequence charSequence) {
/* 1 */             str.getClass();
/* 4 */             charSequence.getClass();
                    return charSequence instanceof String ? C1852e.m6263m(str, (String) charSequence, false) : m6247s(str, 0, charSequence, 0, charSequence.length(), false);
                }
            }
