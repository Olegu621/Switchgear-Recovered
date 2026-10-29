            package p000;

            import java.util.ArrayList;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: renamed from: pj */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2072pj implements Function0 {

                /* JADX INFO: renamed from: a */
                public final C2003oj f15138a;

                /* JADX INFO: renamed from: b */
                public final jc2 f15139b;

                public C2072pj(C2003oj c2003oj, jc2 jc2Var) {
/* 1 */             c2003oj.getClass();
/* 4 */             jc2Var.getClass();
/* 10 */            this.f15138a = c2003oj;
/* 12 */            this.f15139b = jc2Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 3 */             as0 as0Var = this.f15139b.f12213c;
/* 8 */             C1983o c1983o = new C1983o(this, 3);
/* 11 */            Object obj = as0Var.f2074b;
/* 13 */            if (obj != null) {
/* 15 */                c1983o.invoke(obj);
                    } else {
/* 23 */                ((ArrayList) as0Var.f2073a).add(c1983o);
                    }
/* 26 */            return Unit.f12910a;
                }
            }
