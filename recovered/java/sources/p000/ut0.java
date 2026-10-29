            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ut0 extends vt0 {

                /* JADX INFO: renamed from: a */
                public final yz2 f17717a;

                /* JADX INFO: renamed from: b */
                public final q82 f17718b;

                public ut0(yz2 yz2Var, q82 q82Var) {
/* 1 */             yz2Var.getClass();
/* 7 */             this.f17717a = yz2Var;
/* 9 */             this.f17718b = q82Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof ut0)) {
/* 28 */                return false;
                    }
/* 9 */             ut0 ut0Var = (ut0) obj;
                    return Intrinsics.m6216a(this.f17717a, ut0Var.f17717a) && this.f17718b == ut0Var.f17718b;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.f17717a.hashCode() * 31;
/* 9 */             q82 q82Var = this.f17718b;
/* 20 */            return (iHashCode + (q82Var == null ? 0 : q82Var.hashCode())) * 31;
                }

                public final String toString() {
/* 28 */            return "LogoSettings(image=" + this.f17717a + ", alignment=" + this.f17718b + ", heightInDp=null)";
                }
            }
