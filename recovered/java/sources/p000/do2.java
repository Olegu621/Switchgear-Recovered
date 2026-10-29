            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class do2 {

                /* JADX INFO: renamed from: a */
                public static final ThreadLocal f7352a = new ThreadLocal();

                /* JADX INFO: renamed from: a */
                public static ze0 m3167a() {
/* 1 */             ThreadLocal threadLocal = f7352a;
/* 7 */             ze0 ze0Var = (ze0) threadLocal.get();
/* 9 */             if (ze0Var != null) {
/* 23 */                return ze0Var;
                    }
/* 17 */            C2463xj c2463xj = new C2463xj(Thread.currentThread());
/* 20 */            threadLocal.set(c2463xj);
/* 23 */            return c2463xj;
                }
            }
