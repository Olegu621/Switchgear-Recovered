            package p000;

            import java.util.Collections;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class eg0 {

                /* JADX INFO: renamed from: a */
                public static volatile eg0 f7677a;

                /* JADX INFO: renamed from: b */
                public static final eg0 f7678b;

                static {
/* 3 */             eg0 eg0Var = new eg0();
/* 6 */             Map map = Collections.EMPTY_MAP;
/* 8 */             f7678b = eg0Var;
                }

                /* JADX INFO: renamed from: a */
                public static eg0 m3427a() {
                    eg0 eg0Var;
/* 1 */             cz1 cz1Var = cz1.f6940c;
/* 3 */             eg0 eg0Var2 = f7677a;
/* 5 */             if (eg0Var2 != null) {
/* 48 */                return eg0Var2;
                    }
                    synchronized (eg0.class) {
                        try {
/* 10 */                    eg0Var = f7677a;
/* 12 */                    if (eg0Var == null) {
/* 16 */                        Class cls = cg0.f2888a;
/* 18 */                        eg0 eg0Var3 = null;
/* 19 */                        if (cls != null) {
                                    try {
/* 30 */                                eg0Var3 = (eg0) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                                    } catch (Exception unused) {
                                    }
                                }
/* 37 */                        eg0Var = eg0Var3 != null ? eg0Var3 : f7678b;
/* 39 */                        f7677a = eg0Var;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return eg0Var;
                }
            }
