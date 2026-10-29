            package p000;

            import java.util.List;
            
            /* JADX INFO: renamed from: jl */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1797jl extends AbstractC1835kl {

                /* JADX INFO: renamed from: a */
                public final List f12344a;

                public C1797jl() {
/* 1 */             nd0 nd0Var = nd0.f14189a;
/* 3 */             nd0Var.getClass();
/* 9 */             this.f12344a = nd0Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
                    return (obj instanceof C1797jl) && this.f12344a.equals(((C1797jl) obj).f12344a);
                }

                public final int hashCode() {
/* 3 */             return this.f12344a.hashCode();
                }

                public final String toString() {
/* 18 */            return "Row(buttons=" + this.f12344a + ")";
                }
            }
