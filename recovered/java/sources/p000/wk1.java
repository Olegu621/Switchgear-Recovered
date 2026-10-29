            package p000;

            import java.util.HashMap;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wk1 {

                /* JADX INFO: renamed from: b */
                public static final wk1 f18670b = new wk1();

                /* JADX INFO: renamed from: a */
                public final AtomicReference f18671a = new AtomicReference(new jx1(new wc0(24)));

                /* JADX INFO: renamed from: a */
                public final synchronized void m9583a(ex1 ex1Var) {
/* 12 */            wc0 wc0Var = new wc0((jx1) this.f18671a.get());
/* 17 */            HashMap map = (HashMap) wc0Var.f18577b;
/* 25 */            ix1 ix1Var = new ix1(ex1Var.f7913a, C1903lu.class);
/* 32 */            if (map.containsKey(ix1Var)) {
/* 38 */                ex1 ex1Var2 = (ex1) map.get(ix1Var);
/* 44 */                if (!ex1Var2.equals(ex1Var) || ex1Var != ex1Var2) {
/* 51 */                    ds0.m3207x(ix1Var, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
                        }
                    } else {
/* 55 */                map.put(ix1Var, ex1Var);
                    }
/* 65 */            this.f18671a.set(new jx1(wc0Var));
                }
            }
