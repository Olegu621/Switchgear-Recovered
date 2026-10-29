            package p000;

            import java.util.Collections;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class j22 {

                /* JADX INFO: renamed from: a */
                public static final k22 f12033a;

                static {
/* 1 */             k22 k22Var = null;
                    try {
/* 12 */                k22Var = (k22) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
                    }
/* 15 */            if (k22Var == null) {
/* 20 */                k22Var = new k22();
                    }
/* 23 */            f12033a = k22Var;
                }

                /* JADX INFO: renamed from: a */
                public static C0857dv m5667a(Class cls) {
/* 3 */             f12033a.getClass();
/* 8 */             return new C0857dv(cls);
                }

                /* JADX INFO: renamed from: b */
                public static js2 m5668b(Class cls) {
/* 1 */             C0857dv c0857dvM5667a = m5667a(cls);
/* 5 */             List list = Collections.EMPTY_LIST;
/* 9 */             f12033a.getClass();
/* 14 */            return new js2(c0857dvM5667a, list);
                }
            }
