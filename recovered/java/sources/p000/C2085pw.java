            package p000;

            import java.util.Arrays;
            import java.util.List;
            import kotlin.collections.C1839a;
            
            /* JADX INFO: renamed from: pw */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C2085pw extends C1839a {
                /* JADX INFO: renamed from: d */
                public static int m7565d(List list) {
/* 1 */             list.getClass();
/* 8 */             return list.size() - 1;
                }

                /* JADX INFO: renamed from: e */
                public static List m7566e(Object... objArr) {
/* 2 */             if (objArr.length <= 0) {
/* 12 */                return nd0.f14189a;
                    }
/* 4 */             List listAsList = Arrays.asList(objArr);
/* 8 */             listAsList.getClass();
/* 11 */            return listAsList;
                }

                /* JADX INFO: renamed from: f */
                public static final List m7567f(List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size != 0) {
                        return size != 1 ? list : C1839a.m6210b(list.get(0));
                    }
/* 21 */            return nd0.f14189a;
                }

                /* JADX INFO: renamed from: g */
                public static void m7568g() {
/* 8 */             throw new ArithmeticException("Index overflow has happened.");
                }
            }
