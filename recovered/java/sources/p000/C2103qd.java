            package p000;

            import java.util.AbstractSet;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            import kotlin.collections.C1839a;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: qd */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C2103qd extends C1960nd {
                /* JADX INFO: renamed from: g */
                public static boolean m7772g(Object[] objArr, Object obj) {
/* 1 */             objArr.getClass();
                    return m7774i(objArr, obj) >= 0;
                }

                /* JADX INFO: renamed from: h */
                public static ArrayList m7773h(Object[] objArr) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             for (Object obj : objArr) {
/* 12 */                if (obj != null) {
/* 14 */                    arrayList.add(obj);
                        }
                    }
/* 20 */            return arrayList;
                }

                /* JADX INFO: renamed from: i */
                public static int m7774i(Object[] objArr, Object obj) {
/* 1 */             objArr.getClass();
/* 4 */             int i = 0;
/* 5 */             if (obj == null) {
/* 7 */                 int length = objArr.length;
/* 8 */                 while (i < length) {
/* 12 */                    if (objArr[i] == null) {
/* 14 */                        return i;
                            }
/* 15 */                    i++;
                        }
/* 33 */                return -1;
                    }
/* 18 */            int length2 = objArr.length;
/* 19 */            while (i < length2) {
/* 27 */                if (obj.equals(objArr[i])) {
/* 29 */                    return i;
                        }
/* 30 */                i++;
                    }
/* 33 */            return -1;
                }

                /* JADX INFO: renamed from: j */
                public static String m7775j(String str, int i, Object[] objArr) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = ", ";
                    }
/* 7 */             int i2 = i & 2;
/* 9 */             String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 15 */            String str3 = i2 != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : "[";
/* 19 */            if ((i & 4) == 0) {
/* 22 */                str2 = "]";
                    }
/* 24 */            objArr.getClass();
/* 29 */            StringBuilder sb = new StringBuilder();
/* 32 */            sb.append((CharSequence) str3);
/* 37 */            int i3 = 0;
/* 38 */            for (Object obj : objArr) {
/* 43 */                i3++;
/* 44 */                if (i3 > 1) {
/* 46 */                    sb.append((CharSequence) str);
                        }
/* 50 */                yh2.m10149a(sb, obj, null);
                    }
/* 56 */            sb.append((CharSequence) str2);
/* 59 */            return sb.toString();
                }

                /* JADX INFO: renamed from: k */
                public static Integer m7776k(int[] iArr) {
/* 1 */             iArr.getClass();
/* 5 */             if (iArr.length == 0) {
/* 7 */                 return null;
                    }
/* 10 */            int i = iArr[0];
/* 13 */            int i2 = 1;
/* 14 */            int length = iArr.length - 1;
/* 15 */            if (1 <= length) {
                        while (true) {
/* 17 */                    int i3 = iArr[i2];
/* 19 */                    if (i < i3) {
/* 21 */                        i = i3;
                            }
/* 22 */                    if (i2 == length) {
                                break;
                            }
/* 24 */                    i2++;
                        }
                    }
/* 27 */            return Integer.valueOf(i);
                }

                /* JADX INFO: renamed from: l */
                public static final void m7777l(Object[] objArr, AbstractSet abstractSet) {
/* 1 */             objArr.getClass();
/* 6 */             for (Object obj : objArr) {
/* 10 */                abstractSet.add(obj);
                    }
                }

                /* JADX INFO: renamed from: m */
                public static List m7778m(long[] jArr) {
/* 1 */             jArr.getClass();
/* 4 */             int length = jArr.length;
/* 5 */             if (length == 0) {
/* 44 */                return nd0.f14189a;
                    }
/* 9 */             if (length == 1) {
/* 39 */                return C1839a.m6210b(Long.valueOf(jArr[0]));
                    }
/* 14 */            ArrayList arrayList = new ArrayList(jArr.length);
/* 18 */            for (long j : jArr) {
/* 26 */                arrayList.add(Long.valueOf(j));
                    }
/* 32 */            return arrayList;
                }

                /* JADX INFO: renamed from: n */
                public static List m7779n(Object[] objArr) {
/* 1 */             objArr.getClass();
/* 4 */             int length = objArr.length;
/* 5 */             if (length != 0) {
                        return length != 1 ? new ArrayList(new C2546zc(objArr, false)) : C1839a.m6210b(objArr[0]);
                    }
/* 29 */            return nd0.f14189a;
                }

                /* JADX INFO: renamed from: o */
                public static Set m7780o(Object[] objArr) {
/* 1 */             objArr.getClass();
/* 4 */             int length = objArr.length;
/* 5 */             if (length == 0) {
/* 35 */                return qd0.f15493a;
                    }
/* 8 */             if (length != 1) {
/* 17 */                LinkedHashSet linkedHashSet = new LinkedHashSet(nc1.m6962c(objArr.length));
/* 20 */                m7777l(objArr, linkedHashSet);
/* 23 */                return linkedHashSet;
                    }
/* 27 */            Set setSingleton = Collections.singleton(objArr[0]);
/* 31 */            setSingleton.getClass();
/* 34 */            return setSingleton;
                }
            }
