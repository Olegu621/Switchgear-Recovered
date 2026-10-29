            package p000;

            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mv2 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14051a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ nv2 f14052b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ mv2(nv2 nv2Var, int i) {
/* 6 */             super(0);
/* 1 */             this.f14051a = i;
/* 3 */             this.f14052b = nv2Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f14051a;
/* 3 */             nv2 nv2Var = this.f14052b;
                    switch (i) {
                        case 0:
/* 24 */                    ft2 ft2Var = gt2.Companion;
/* 30 */                    C2131r4 c2131r4 = (C2131r4) nv2Var.f14476a.f9631d;
/* 42 */                    boolean z = (c2131r4 != null ? c2131r4.f15867b : null) != null;
/* 43 */                    AbstractC1835kl abstractC1835kl = nv2Var.f14478c;
/* 51 */                    List list = (List) nv2Var.f14483h.getValue();
/* 53 */                    ew2 ew2Var = nv2Var.f14480e;
/* 55 */                    ec0 ec0Var = nv2Var.f14479d;
/* 57 */                    ft2Var.getClass();
/* 60 */                    return ft2.m3836b(z, abstractC1835kl, list, ew2Var, ec0Var);
                        default:
/* 8 */                     boolean z2 = nv2Var.f14477b;
/* 10 */                    C1029ij c1029ij = nv2Var.f14476a;
                            return z2 ? (List) c1029ij.f9632e : (ArrayList) c1029ij.f9629b;
                    }
                }
            }
