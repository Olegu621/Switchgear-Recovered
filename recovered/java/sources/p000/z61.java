            package p000;

            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z61 implements f71 {

                /* JADX INFO: renamed from: a */
                public final C0168b5 f19954a;

                /* JADX INFO: renamed from: b */
                public final g71 f19955b;

                public z61(g71 g71Var, C0168b5 c0168b5) {
/* 4 */             this.f19955b = g71Var;
/* 6 */             this.f19954a = c0168b5;
                }

                @zp1(t61.ON_DESTROY)
                public void onDestroy(g71 g71Var) {
/* 1 */             C0168b5 c0168b5 = this.f19954a;
                    synchronized (c0168b5.f2211b) {
                        try {
/* 6 */                     z61 z61VarM1271q = c0168b5.m1271q(g71Var);
/* 10 */                    if (z61VarM1271q == null) {
/* 13 */                        return;
                            }
/* 16 */                    c0168b5.m1250E(g71Var);
/* 29 */                    Iterator it = ((Set) ((HashMap) c0168b5.f2213d).get(z61VarM1271q)).iterator();
/* 37 */                    while (it.hasNext()) {
/* 49 */                        ((HashMap) c0168b5.f2212c).remove((C0018ag) it.next());
                            }
/* 57 */                    ((HashMap) c0168b5.f2213d).remove(z61VarM1271q);
/* 66 */                    z61VarM1271q.f19955b.getLifecycle().mo4484b(z61VarM1271q);
                        } catch (Throwable th) {
/* 72 */                    throw th;
                        }
                    }
                }

                @zp1(t61.ON_START)
                public void onStart(g71 g71Var) {
/* 3 */             this.f19954a.m1247B(g71Var);
                }

                @zp1(t61.ON_STOP)
                public void onStop(g71 g71Var) {
/* 3 */             this.f19954a.m1250E(g71Var);
                }
            }
