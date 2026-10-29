            package p000;
            
            /* JADX INFO: renamed from: z3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2521z3 {

                /* JADX INFO: renamed from: a */
                public final String f19919a;

                /* JADX INFO: renamed from: b */
                public final boolean f19920b;

                public C2521z3(String str, boolean z) {
/* 4 */             this.f19919a = str;
/* 6 */             this.f19920b = z;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof C2521z3)) {
/* 28 */                return false;
                    }
/* 9 */             C2521z3 c2521z3 = (C2521z3) obj;
                    return this.f19919a.equals(c2521z3.f19919a) && this.f19920b == c2521z3.f19920b;
                }

                public final int hashCode() {
/* 15 */            return Boolean.hashCode(this.f19920b) + (this.f19919a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "AdjustMediationResult(name=" + this.f19919a + ", mediated=" + this.f19920b + ")";
                }
            }
