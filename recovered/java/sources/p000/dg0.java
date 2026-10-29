            package p000;

            import java.util.Collections;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dg0 {

                /* JADX INFO: renamed from: a */
                public static volatile dg0 f7172a;

                /* JADX INFO: renamed from: b */
                public static final dg0 f7173b;

                static {
/* 3 */             dg0 dg0Var = new dg0();
/* 6 */             Map map = Collections.EMPTY_MAP;
/* 8 */             f7173b = dg0Var;
                }

                /* JADX INFO: renamed from: a */
                public static dg0 m3057a() {
                    dg0 dg0Var;
/* 1 */             dg0 dg0Var2 = f7172a;
/* 3 */             if (dg0Var2 != null) {
/* 46 */                return dg0Var2;
                    }
                    synchronized (dg0.class) {
                        try {
/* 8 */                     dg0Var = f7172a;
/* 10 */                    if (dg0Var == null) {
/* 14 */                        Class cls = bg0.f2408a;
/* 16 */                        dg0 dg0Var3 = null;
/* 17 */                        if (cls != null) {
                                    try {
/* 28 */                                dg0Var3 = (dg0) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                                    } catch (Exception unused) {
                                    }
                                }
/* 35 */                        dg0Var = dg0Var3 != null ? dg0Var3 : f7173b;
/* 37 */                        f7172a = dg0Var;
                            }
                        } catch (Throwable th) {
/* 45 */                    throw th;
                        }
                    }
/* 43 */            return dg0Var;
                }
            }
