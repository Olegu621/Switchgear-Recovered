            package p000;

            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            /* JADX INFO: renamed from: q */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C2089q {
                public C2089q(DefaultConstructorMarker defaultConstructorMarker) {
                }

                /* JADX INFO: renamed from: a */
                public static void m7638a(int i, int i2) {
/* 1 */             if (i < 0 || i >= i2) {
/* 14 */                s80.m8425f(AbstractC0886en.m3506j("index: ", i, i2, ", size: "));
                    }
                }

                /* JADX INFO: renamed from: b */
                public static void m7639b(int i, int i2) {
/* 1 */             if (i < 0 || i > i2) {
/* 14 */                s80.m8425f(AbstractC0886en.m3506j("index: ", i, i2, ", size: "));
                    }
                }

                /* JADX INFO: renamed from: c */
                public static void m7640c(int i, int i2, int i3) {
/* 3 */             if (i >= 0 && i2 <= i3) {
/* 7 */                 if (i <= i2) {
/* 9 */                     return;
                        }
/* 16 */                C1951n4.m6859j(AbstractC0886en.m3506j("fromIndex: ", i, i2, " > toIndex: "));
                    } else {
/* 53 */                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
                    }
                }

                /* JADX INFO: renamed from: d */
                public static int m7641d(int i, int i2) {
/* 3 */             int i3 = i + (i >> 1);
/* 6 */             if (i3 - i2 < 0) {
/* 8 */                 i3 = i2;
                    }
/* 14 */            if (i3 - 2147483639 <= 0) {
/* 23 */                return i3;
                    }
/* 16 */            if (i2 > 2147483639) {
/* 18 */                return AbstractC0208c9.API_PRIORITY_OTHER;
                    }
/* 9 */             return 2147483639;
                }
            }
