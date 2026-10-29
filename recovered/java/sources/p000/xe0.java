            package p000;

            import java.util.ArrayDeque;
            import java.util.HashMap;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xe0 implements li2, pz1 {

                /* JADX INFO: renamed from: a */
                public final HashMap f19053a;

                /* JADX INFO: renamed from: b */
                public ArrayDeque f19054b;

                /* JADX INFO: renamed from: c */
                public final fx2 f19055c;

                public xe0() {
/* 1 */             fx2 fx2Var = fx2.f8393a;
/* 11 */            this.f19053a = new HashMap();
/* 18 */            this.f19054b = new ArrayDeque();
/* 20 */            this.f19055c = fx2Var;
                }

                /* JADX INFO: renamed from: a */
                public final synchronized void m9756a(Executor executor, ye0 ye0Var) {
                    try {
/* 4 */                 ye0Var.getClass();
/* 7 */                 executor.getClass();
/* 16 */                if (!this.f19053a.containsKey(b40.class)) {
/* 25 */                    this.f19053a.put(b40.class, new ConcurrentHashMap());
                        }
/* 39 */                ((ConcurrentHashMap) this.f19053a.get(b40.class)).put(ye0Var, executor);
                    } catch (Throwable th) {
/* 45 */                throw th;
                    }
                }
            }
