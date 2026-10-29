            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class v60 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17873a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ rj2 f17874b;

                public /* synthetic */ v60(rj2 rj2Var, int i) {
/* 1 */             this.f17873a = i;
/* 3 */             this.f17874b = rj2Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f17873a;
/* 3 */             rj2 rj2Var = this.f17874b;
                    switch (i) {
                        case 0:
/* 15 */                    rj2Var.m8191b();
                            break;
                        default:
/* 11 */                    rj2Var.f16125e.cancel(true);
                            break;
                    }
                }
            }
