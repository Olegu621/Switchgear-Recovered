            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class iv1 extends pg3 {

                /* JADX INFO: renamed from: i */
                public final qv1 f11942i;

                /* JADX INFO: renamed from: v */
                public final jv1 f11943v;

                public iv1(qv1 qv1Var, jv1 jv1Var) {
/* 4 */             this.f11942i = qv1Var;
/* 6 */             this.f11943v = jv1Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 7 */             if (obj instanceof iv1) {
/* 10 */                iv1 iv1Var = (iv1) obj;
/* 16 */                if (this.f11942i == iv1Var.f11942i && this.f11943v.equals(iv1Var.f11943v)) {
/* 30 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 15 */            return this.f11943v.hashCode() + (this.f11942i.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "PredefinedUIPurposeCardContent(examples=" + this.f11942i + ", vendors=" + this.f11943v + ")";
                }
            }
