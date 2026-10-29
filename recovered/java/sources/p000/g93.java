            package p000;

            import android.content.Context;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class g93 {

                /* JADX INFO: renamed from: b */
                public static final g93 f8521b;

                /* JADX INFO: renamed from: a */
                public v30 f8522a;

                static {
/* 3 */             g93 g93Var = new g93();
/* 7 */             g93Var.f8522a = null;
/* 9 */             f8521b = g93Var;
                }

                /* JADX INFO: renamed from: a */
                public static v30 m3898a(Context context) {
                    v30 v30Var;
/* 1 */             g93 g93Var = f8521b;
                    synchronized (g93Var) {
                        try {
/* 6 */                     if (g93Var.f8522a == null) {
/* 12 */                        if (context.getApplicationContext() != null) {
/* 14 */                            context = context.getApplicationContext();
                                }
/* 27 */                        g93Var.f8522a = new v30(context, 1);
                            }
/* 29 */                    v30Var = g93Var.f8522a;
                        } catch (Throwable th) {
/* 34 */                    throw th;
                        }
                    }
/* 32 */            return v30Var;
                }
            }
