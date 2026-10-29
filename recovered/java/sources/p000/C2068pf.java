            package p000;

            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: pf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2068pf {

                /* JADX INFO: renamed from: a */
                public final lj2 f15091a;

                /* JADX INFO: renamed from: b */
                public final lj2 f15092b;

                /* JADX INFO: renamed from: c */
                public final ArrayList f15093c;

                public C2068pf(lj2 lj2Var, lj2 lj2Var2, ArrayList arrayList) {
/* 5 */             if (lj2Var == null) {
/* 24 */                C1951n4.m6868s("Null primarySurfaceEdge");
/* 27 */                throw null;
                    }
/* 7 */             this.f15091a = lj2Var;
/* 9 */             if (lj2Var2 == null) {
/* 18 */                C1951n4.m6868s("Null secondarySurfaceEdge");
/* 21 */                throw null;
                    }
/* 11 */            this.f15092b = lj2Var2;
/* 13 */            this.f15093c = arrayList;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 40 */                return true;
                    }
/* 6 */             if (!(obj instanceof C2068pf)) {
/* 42 */                return false;
                    }
/* 8 */             C2068pf c2068pf = (C2068pf) obj;
                    return this.f15091a.equals(c2068pf.f15091a) && this.f15092b.equals(c2068pf.f15092b) && this.f15093c.equals(c2068pf.f15093c);
                }

                public final int hashCode() {
/* 26 */            return this.f15093c.hashCode() ^ ((((this.f15091a.hashCode() ^ 1000003) * 1000003) ^ this.f15092b.hashCode()) * 1000003);
                }

                public final String toString() {
/* 38 */            return "In{primarySurfaceEdge=" + this.f15091a + ", secondarySurfaceEdge=" + this.f15092b + ", outConfigs=" + this.f15093c + "}";
                }
            }
