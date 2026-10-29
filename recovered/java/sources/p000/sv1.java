            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sv1 extends pg3 {

                /* JADX INFO: renamed from: i */
                public final mv1 f16826i;

                public sv1(mv1 mv1Var) {
/* 4 */             this.f16826i = mv1Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
                    return (obj instanceof sv1) && this.f16826i.equals(((sv1) obj).f16826i);
                }

                public final int hashCode() {
/* 3 */             return this.f16826i.hashCode();
                }

                public final String toString() {
/* 18 */            return "PredefinedUISingleServiceCardContent(service=" + this.f16826i + ")";
                }
            }
