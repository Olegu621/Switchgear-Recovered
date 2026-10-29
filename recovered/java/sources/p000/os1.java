            package p000;

            import java.lang.reflect.Method;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class os1 {

                /* JADX INFO: renamed from: a */
                public static final os1 f14885a = new os1();

                /* JADX INFO: renamed from: b */
                public static final Method f14886b;

                static {
                    Method method;
/* 10 */            Method[] methods = Throwable.class.getMethods();
/* 14 */            methods.getClass();
/* 17 */            int length = methods.length;
/* 19 */            int i = 0;
                    while (true) {
/* 20 */                method = null;
/* 21 */                if (i >= length) {
                            break;
                        }
/* 23 */                Method method2 = methods[i];
/* 35 */                if (Intrinsics.m6216a(method2.getName(), "addSuppressed")) {
/* 37 */                    Class<?>[] parameterTypes = method2.getParameterTypes();
/* 41 */                    parameterTypes.getClass();
/* 44 */                    parameterTypes.getClass();
/* 57 */                    if (Intrinsics.m6216a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
/* 59 */                        method = method2;
                                break;
                            }
                        }
/* 61 */                i++;
                    }
/* 64 */            f14886b = method;
/* 66 */            int length2 = methods.length;
/* 67 */            for (int i2 = 0; i2 < length2 && !Intrinsics.m6216a(methods[i2].getName(), "getSuppressed"); i2++) {
                    }
                }
            }
