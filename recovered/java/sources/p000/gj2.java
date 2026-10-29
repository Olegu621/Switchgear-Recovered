            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class gj2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8635a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ kj2 f8636b;

                public /* synthetic */ gj2(kj2 kj2Var, int i) {
/* 1 */             this.f8635a = i;
/* 3 */             this.f8636b = kj2Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f8635a;
/* 3 */             kj2 kj2Var = this.f8636b;
                    switch (i) {
                        case 0:
/* 48 */                    kj2Var.mo2951a();
                            break;
                        case 1:
/* 44 */                    kj2Var.m2952b();
                            break;
                        default:
/* 8 */                     mj2 mj2Var = kj2Var.f12828r;
/* 10 */                    if (mj2Var != null) {
/* 12 */                        mj2Var.m6666g();
                            }
/* 17 */                    if (kj2Var.f12827q == null) {
/* 19 */                        C2260um c2260um = kj2Var.f12826p;
/* 22 */                        c2260um.f17593d = true;
/* 24 */                        C2466xm c2466xm = c2260um.f17591b;
/* 26 */                        if (c2466xm != null && c2466xm.f19248b.cancel(true)) {
/* 37 */                            c2260um.f17590a = null;
/* 39 */                            c2260um.f17591b = null;
/* 41 */                            c2260um.f17592c = null;
                                    break;
                                }
                            }
                            break;
                    }
                }
            }
