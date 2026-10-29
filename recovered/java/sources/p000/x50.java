            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class x50 {

                /* JADX INFO: renamed from: a */
                public static final g70 f18955a;

                static {
                    String property;
                    kt0 kt0Var;
                    g70 g70Var;
/* 3 */             int i = ik2.f9695a;
                    try {
/* 5 */                 property = System.getProperty("kotlinx.coroutines.main.delay");
                    } catch (SecurityException unused) {
/* 10 */                property = null;
                    }
/* 19 */            if (property != null ? Boolean.parseBoolean(property) : false) {
/* 24 */                m60 m60Var = z80.f19975a;
/* 26 */                kt0Var = gb1.f8531a;
/* 28 */                kt0 kt0Var2 = kt0Var.f13002e;
/* 30 */                if (kt0Var == null) {
                            g70Var = kt0Var;
/* 32 */                    g70Var = w50.f18442W;
                        }
                    } else {
/* 21 */                g70Var = w50.f18442W;
                    }
                    g70Var = kt0Var;
/* 34 */            f18955a = g70Var;
                }
            }
