            package p000;

            import io.sentry.C1697u2;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xr2 implements wr2 {

                /* JADX INFO: renamed from: a */
                public final Set f19339a;

                /* JADX INFO: renamed from: b */
                public final C2497yg f19340b;

                /* JADX INFO: renamed from: c */
                public final yr2 f19341c;

                public xr2(Set set, C2497yg c2497yg, yr2 yr2Var) {
/* 4 */             this.f19339a = set;
/* 6 */             this.f19340b = c2497yg;
/* 8 */             this.f19341c = yr2Var;
                }

                /* JADX INFO: renamed from: a */
                public final C0168b5 m10019a(String str, vd0 vd0Var, er2 er2Var) {
/* 1 */             Set set = this.f19339a;
/* 7 */             if (set.contains(vd0Var)) {
/* 20 */                return new C0168b5(this.f19340b, str, vd0Var, er2Var, this.f19341c, 17);
                    }
/* 31 */            C1697u2.m5437m("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{vd0Var, set});
/* 34 */            return null;
                }
            }
