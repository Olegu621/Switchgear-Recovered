            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class ap0 implements InterfaceC2299vm {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2050a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ s81 f2051b;

                public /* synthetic */ ap0(s81 s81Var, int i) {
/* 1 */             this.f2050a = i;
/* 3 */             this.f2051b = s81Var;
                }

                @Override // p000.InterfaceC2299vm
                /* JADX INFO: renamed from: w */
                public final Object mo1148w(C2260um c2260um) {
/* 1 */             int i = this.f2050a;
/* 5 */             s81 s81Var = this.f2051b;
                    switch (i) {
                        case 0:
/* 47 */                    s81Var.mo3676a(new RunnableC2166s2(c2260um, 24), pg3.m7428g());
/* 63 */                    return "transformVoidFuture [" + s81Var + "]";
                        default:
/* 15 */                    w11.m9392B(false, s81Var, c2260um, pg3.m7428g());
/* 31 */                    return "nonCancellationPropagating[" + s81Var + "]";
                    }
                }
            }
