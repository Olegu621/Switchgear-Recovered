            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xm3 extends be3 {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f19251e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ pn3 f19252f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ xm3(pn3 pn3Var, ij3 ij3Var, int i) {
/* 5 */             super(ij3Var);
/* 1 */             this.f19251e = i;
/* 3 */             this.f19252f = pn3Var;
                }

                @Override // p000.be3
                /* JADX INFO: renamed from: a */
                public final void mo1347a() {
/* 1 */             int i = this.f19251e;
/* 3 */             pn3 pn3Var = this.f19252f;
                    switch (i) {
                        case 0:
/* 25 */                    pn3Var.mo1375y();
/* 32 */                    if (pn3Var.m7521Q()) {
/* 39 */                        uh3 uh3Var = ((ij3) pn3Var.f16749a).f9655f;
/* 41 */                        ij3.m4555l(uh3Var);
/* 48 */                        uh3Var.f17534Y.m8510a("Inactivity, disconnecting from the service");
/* 51 */                        pn3Var.m7512H();
                                break;
                            }
                            break;
                        default:
/* 12 */                    uh3 uh3Var2 = ((ij3) pn3Var.f16749a).f9655f;
/* 14 */                    ij3.m4555l(uh3Var2);
/* 21 */                    uh3Var2.f17541w.m8510a("Tasks have been queued for a long time");
                            break;
                    }
                }
            }
