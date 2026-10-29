            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class p01 extends C0890er {

                /* JADX INFO: renamed from: V */
                public final z01 f14937V;

                public p01(c10 c10Var, z01 z01Var) {
/* 2 */             super(1, c10Var);
/* 5 */             this.f14937V = z01Var;
                }

                @Override // p000.C0890er
                /* JADX INFO: renamed from: A */
                public final String mo3549A() {
/* 1 */             return "AwaitContinuation";
                }

                @Override // p000.C0890er
                /* JADX INFO: renamed from: q */
                public final Throwable mo3567q(z01 z01Var) {
                    Throwable thM8039d;
/* 3 */             Object objM10260x = this.f14937V.m10260x();
/* 9 */             if (!(objM10260x instanceof r01) || (thM8039d = ((r01) objM10260x).m8039d()) == null) {
                        return objM10260x instanceof C1980nx ? ((C1980nx) objM10260x).f14555a : z01Var.getCancellationException();
                    }
/* 20 */            return thM8039d;
                }
            }
