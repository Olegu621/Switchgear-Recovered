            package kotlin.text;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.collections.CollectionsKt___CollectionsKt;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.C2085pw;
            import p000.C2122qw;
            import p000.di2;
            import p000.yh2;
            
            /* JADX INFO: renamed from: kotlin.text.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C1850c extends yh2 {
                /* JADX INFO: renamed from: b */
                public static String m6253b(String str) {
                    int length;
                    Comparable comparable;
/* 1 */             List listM6246r = StringsKt__StringsKt.m6246r(str);
/* 7 */             ArrayList arrayList = new ArrayList();
/* 18 */            for (Object obj : listM6246r) {
/* 31 */                if (!StringsKt.m6228D((String) obj)) {
/* 33 */                    arrayList.add(obj);
                        }
                    }
/* 45 */            ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(arrayList, 10));
/* 48 */            Iterator it = arrayList.iterator();
                    while (true) {
/* 56 */                length = 0;
/* 57 */                if (!it.hasNext()) {
                            break;
                        }
/* 63 */                String str2 = (String) it.next();
/* 65 */                int length2 = str2.length();
                        while (true) {
/* 70 */                    if (length >= length2) {
/* 86 */                        length = -1;
                                break;
                            }
/* 80 */                    if (!CharsKt__CharJVMKt.m6221a(str2.charAt(length))) {
                                break;
                            }
/* 83 */                    length++;
                        }
/* 87 */                if (length == -1) {
/* 89 */                    length = str2.length();
                        }
/* 97 */                arrayList2.add(Integer.valueOf(length));
                    }
/* 101 */           Iterator it2 = arrayList2.iterator();
/* 110 */           if (it2.hasNext()) {
/* 118 */               comparable = (Comparable) it2.next();
/* 124 */               while (it2.hasNext()) {
/* 130 */                   Comparable comparable2 = (Comparable) it2.next();
/* 136 */                   if (comparable.compareTo(comparable2) > 0) {
/* 138 */                       comparable = comparable2;
                            }
                        }
                    } else {
/* 112 */               comparable = null;
                    }
/* 140 */           Integer num = (Integer) comparable;
/* 149 */           int iIntValue = num != null ? num.intValue() : 0;
/* 150 */           int length3 = str.length();
/* 154 */           listM6246r.size();
/* 161 */           int size = listM6246r.size() - 1;
/* 165 */           ArrayList arrayList3 = new ArrayList();
/* 176 */           for (Object obj2 : listM6246r) {
/* 182 */               int i = length + 1;
/* 184 */               if (length < 0) {
/* 211 */                   C2085pw.m7568g();
/* 214 */                   throw null;
                        }
/* 186 */               String str3 = (String) obj2;
/* 200 */               String strM3087w = ((length == 0 || length == size) && StringsKt.m6228D(str3)) ? null : di2.m3087w(iIntValue, str3);
/* 204 */               if (strM3087w != null) {
/* 206 */                   arrayList3.add(strM3087w);
                        }
/* 209 */               length = i;
                    }
/* 217 */           StringBuilder sb = new StringBuilder(length3);
/* 10 */            CollectionsKt___CollectionsKt.m6206o(arrayList3, sb, "\n", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "...", null);
/* 225 */           return sb.toString();
                }

                /* JADX INFO: renamed from: c */
                public static String m6254c(String str) {
/* 8 */             if (StringsKt.m6228D("|")) {
/* 139 */               C1951n4.m6859j("marginPrefix must be non-blank string.");
/* 7 */                 return null;
                    }
/* 10 */            List listM6246r = StringsKt__StringsKt.m6246r(str);
/* 14 */            int length = str.length();
/* 18 */            listM6246r.size();
/* 25 */            int size = listM6246r.size() - 1;
/* 29 */            ArrayList arrayList = new ArrayList();
/* 37 */            int i = 0;
/* 42 */            for (Object obj : listM6246r) {
/* 48 */                int i2 = i + 1;
/* 50 */                if (i < 0) {
/* 118 */                   C2085pw.m7568g();
/* 121 */                   throw null;
                        }
/* 52 */                String str2 = (String) obj;
/* 54 */                if ((i == 0 || i == size) && StringsKt.m6228D(str2)) {
/* 64 */                    str2 = null;
                        } else {
/* 66 */                    int length2 = str2.length();
/* 70 */                    int i3 = 0;
                            while (true) {
/* 72 */                        if (i3 >= length2) {
/* 88 */                            i3 = -1;
                                    break;
                                }
/* 82 */                        if (!CharsKt__CharJVMKt.m6221a(str2.charAt(i3))) {
                                    break;
                                }
/* 85 */                        i3++;
                            }
/* 104 */                   String strSubstring = (i3 != -1 && C1852e.m6262l(i3, str2, "|", false)) ? str2.substring("|".length() + i3) : null;
/* 108 */                   if (strSubstring != null) {
/* 110 */                       str2 = strSubstring;
                            }
                        }
/* 111 */               if (str2 != null) {
/* 113 */                   arrayList.add(str2);
                        }
/* 116 */               i = i2;
                    }
/* 124 */           StringBuilder sb = new StringBuilder(length);
/* 10 */            CollectionsKt___CollectionsKt.m6206o(arrayList, sb, "\n", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "...", null);
/* 132 */           return sb.toString();
                }
            }
