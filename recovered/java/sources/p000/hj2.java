            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class hj2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9100a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ d70 f9101b;

                public /* synthetic */ hj2(d70 d70Var, int i) {
/* 1 */             this.f9100a = i;
/* 3 */             this.f9101b = d70Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f9100a;
/* 3 */             d70 d70Var = this.f9101b;
                    switch (i) {
                        case 0:
/* 12 */                    d70Var.mo2951a();
                            break;
                        default:
/* 8 */                     d70Var.m2952b();
                            break;
                    }
                }
            }
