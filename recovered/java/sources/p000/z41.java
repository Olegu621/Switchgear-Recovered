            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z41 implements Comparable {

                /* JADX INFO: renamed from: b */
                public static final y41 f19929b = new y41(null);

                /* JADX INFO: renamed from: c */
                public static final z41 f19930c = new z41();

                /* JADX INFO: renamed from: a */
                public final int f19931a = 131594;

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 1 */             z41 z41Var = (z41) obj;
/* 3 */             z41Var.getClass();
/* 10 */            return this.f19931a - z41Var.f19931a;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 12 */            z41 z41Var = obj instanceof z41 ? (z41) obj : null;
                    return z41Var != null && this.f19931a == z41Var.f19931a;
                }

                public final int hashCode() {
/* 1 */             return this.f19931a;
                }

                public final String toString() {
/* 1 */             return "2.2.10";
                }
            }
