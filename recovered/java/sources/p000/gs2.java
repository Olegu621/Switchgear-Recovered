            package p000;

            import java.util.List;
            import kotlin.Function;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class gs2 {
                /* JADX INFO: renamed from: a */
                public static List m4010a(Object obj) {
/* 3 */             if ((obj instanceof r21) && !(obj instanceof AbstractC0002a0)) {
/* 12 */                m4013d(obj, "kotlin.collections.MutableList");
/* 16 */                throw null;
                    }
                    try {
/* 17 */                return (List) obj;
                    } catch (ClassCastException e) {
/* 27 */                Intrinsics.m6218c(e, gs2.class.getName());
/* 30 */                throw e;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static void m4011b(int i, Object obj) {
/* 1 */             if (obj == null || m4012c(i, obj)) {
/* 29 */                return;
                    }
/* 24 */            m4013d(obj, "kotlin.jvm.functions.Function" + i);
/* 28 */            throw null;
                }

                /* JADX INFO: renamed from: c */
                public static boolean m4012c(int i, Object obj) {
                    int arity;
/* 4 */             if (obj instanceof Function) {
/* 9 */                 if (obj instanceof to0) {
/* 13 */                    arity = ((to0) obj).getArity();
                        } else if (obj instanceof Function0) {
/* 22 */                    arity = 0;
                        } else if (obj instanceof Function1) {
/* 28 */                    arity = 1;
                        } else if (obj instanceof Function2) {
/* 34 */                    arity = 2;
                        } else {
/* 42 */                    arity = obj instanceof lo0 ? 3 : -1;
                        }
/* 43 */                if (arity == i) {
/* 8 */                     return true;
                        }
                    }
/* 3 */             return false;
                }

                /* JADX INFO: renamed from: d */
                public static void m4013d(Object obj, String str) {
/* 22 */            ClassCastException classCastException = new ClassCastException(AbstractC0886en.m3508l(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
/* 31 */            Intrinsics.m6218c(classCastException, gs2.class.getName());
/* 34 */            throw classCastException;
                }
            }
