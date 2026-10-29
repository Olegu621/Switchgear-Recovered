            package p000;

            import java.util.List;
            
            /* JADX INFO: renamed from: il */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1031il extends AbstractC1835kl {

                /* JADX INFO: renamed from: a */
                public final List f9702a;

                public C1031il() {
/* 1 */             nd0 nd0Var = nd0.f14189a;
/* 3 */             nd0Var.getClass();
/* 9 */             this.f9702a = nd0Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
                    return (obj instanceof C1031il) && this.f9702a.equals(((C1031il) obj).f9702a);
                }

                public final int hashCode() {
/* 3 */             return this.f9702a.hashCode();
                }

                public final String toString() {
/* 18 */            return "Grid(buttons=" + this.f9702a + ")";
                }
            }
