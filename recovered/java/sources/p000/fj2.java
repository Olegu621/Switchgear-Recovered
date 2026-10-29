            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class fj2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8244a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ lj2 f8245b;

                public /* synthetic */ fj2(lj2 lj2Var, int i) {
/* 1 */             this.f8244a = i;
/* 3 */             this.f8245b = lj2Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f8244a;
/* 3 */             lj2 lj2Var = this.f8245b;
                    switch (i) {
                        case 0:
/* 26 */                    pg3.m7436o().execute(new fj2(lj2Var, 1));
                            break;
                        default:
/* 10 */                    if (!lj2Var.f13331n) {
/* 12 */                        lj2Var.m6464d();
                            }
                            break;
                    }
                }
            }
