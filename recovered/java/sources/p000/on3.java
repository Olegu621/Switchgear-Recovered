            package p000;

            import io.sentry.C1697u2;
            import java.util.Collections;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class on3 {

                /* JADX INFO: renamed from: b */
                public static volatile on3 f14848b;

                /* JADX INFO: renamed from: c */
                public static final on3 f14849c = new on3();

                /* JADX INFO: renamed from: a */
                public final Map f14850a = Collections.EMPTY_MAP;

                /* JADX INFO: renamed from: a */
                public static on3 m7216a() {
/* 1 */             on3 on3Var = f14848b;
/* 3 */             if (on3Var != null) {
/* 5 */                 return on3Var;
                    }
                    synchronized (on3.class) {
                        try {
/* 9 */                     on3 on3Var2 = f14848b;
/* 11 */                    if (on3Var2 != null) {
/* 14 */                        return on3Var2;
                            }
/* 17 */                    on3 on3VarM10008a = xn3.m10008a();
/* 21 */                    f14848b = on3VarM10008a;
/* 24 */                    return on3VarM10008a;
                        } catch (Throwable th) {
/* 26 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m7217b(tm3 tm3Var, int i) {
/* 12 */            if (this.f14850a.get(new nn3(tm3Var, i)) == null) {
/* 14 */                return;
                    }
/* 15 */            C1697u2.m5431g();
                }
            }
