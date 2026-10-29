            package kotlin.jvm.internal;

            import java.util.Arrays;
            import p000.AbstractC0886en;
            import p000.fm0;
            import p000.ox2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class Intrinsics {
                /* JADX INFO: renamed from: a */
                public static boolean m6216a(Object obj, Object obj2) {
/* 1 */             if (obj == null) {
                        return obj2 == null;
                    }
/* 9 */             return obj.equals(obj2);
                }

                /* JADX INFO: renamed from: b */
                public static int m6217b(int i, int i2) {
/* 1 */             if (i < i2) {
/* 3 */                 return -1;
                    }
                    return i == i2 ? 0 : 1;
                }

                /* JADX INFO: renamed from: c */
                public static void m6218c(RuntimeException runtimeException, String str) {
/* 1 */             StackTraceElement[] stackTrace = runtimeException.getStackTrace();
/* 5 */             int length = stackTrace.length;
/* 6 */             int i = -1;
/* 8 */             for (int i2 = 0; i2 < length; i2++) {
/* 20 */                if (str.equals(stackTrace[i2].getClassName())) {
/* 22 */                    i = i2;
                        }
                    }
/* 34 */            runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
                }

                public static void checkNotNullExpressionValue(Object obj, String str) {
/* 1 */             if (obj != null) {
/* 3 */                 return;
                    }
/* 12 */            NullPointerException nullPointerException = new NullPointerException(fm0.m3783i(str, " must not be null"));
/* 21 */            m6218c(nullPointerException, Intrinsics.class.getName());
/* 24 */            throw nullPointerException;
                }

                public static void checkNotNullParameter(Object obj, String str) {
/* 1 */             if (obj == null) {
/* 9 */                 StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
/* 15 */                String name = Intrinsics.class.getName();
/* 19 */                int i = 0;
/* 30 */                while (!stackTrace[i].getClassName().equals(name)) {
/* 32 */                    i++;
                        }
/* 45 */                while (stackTrace[i].getClassName().equals(name)) {
/* 47 */                    i++;
                        }
/* 50 */                StackTraceElement stackTraceElement = stackTrace[i];
/* 66 */                StringBuilder sbM3514r = AbstractC0886en.m3514r("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
/* 70 */                sbM3514r.append(str);
/* 77 */                NullPointerException nullPointerException = new NullPointerException(sbM3514r.toString());
/* 84 */                m6218c(nullPointerException, Intrinsics.class.getName());
/* 87 */                throw nullPointerException;
                    }
                }

                /* JADX INFO: renamed from: d */
                public static String m6219d(Object obj, String str) {
/* 12 */            return str + obj;
                }

                /* JADX INFO: renamed from: e */
                public static void m6220e(String str) {
/* 11 */            ox2 ox2Var = new ox2(fm0.m3784j("lateinit property ", str, " has not been initialized"));
/* 20 */            m6218c(ox2Var, Intrinsics.class.getName());
/* 23 */            throw ox2Var;
                }
            }
