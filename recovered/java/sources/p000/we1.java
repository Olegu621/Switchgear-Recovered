            package p000;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class we1 extends AbstractC1910m0 implements kf1 {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f18593b;

                public /* synthetic */ we1(int i) {
/* 1 */             this.f18593b = i;
                }

                @Override // p000.kf1
                /* JADX INFO: renamed from: a */
                public final void mo3758a(if1 if1Var) {
                    switch (this.f18593b) {
                        case 0:
/* 11 */                    Boolean bool = Boolean.TRUE;
/* 13 */                    if1Var.f9567c = bool;
/* 15 */                    if1Var.f9574j = bool;
                            break;
                        default:
/* 8 */                     if1Var.f9574j = Boolean.TRUE;
                            break;
                    }
                }

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
                    switch (this.f18593b) {
                        case 0:
/* 12 */                    od0 od0Var = od0.f14715a;
/* 14 */                    od0Var.getClass();
/* 17 */                    return od0Var;
                        default:
/* 6 */                     od0 od0Var2 = od0.f14715a;
/* 8 */                     od0Var2.getClass();
/* 11 */                    return od0Var2;
                    }
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
                    switch (this.f18593b) {
                        case 0:
/* 15 */                    return mn0.m6697m("end");
                        default:
/* 8 */                     return mn0.m6697m("pause");
                    }
                }
            }
