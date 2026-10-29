            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class uk2 {

                /* JADX INFO: renamed from: a */
                public final Boolean f17577a;

                /* JADX INFO: renamed from: b */
                public final Boolean f17578b;

                public uk2(Boolean bool, Boolean bool2) {
/* 4 */             this.f17577a = bool;
/* 6 */             this.f17578b = bool2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof uk2)) {
/* 7 */                 return false;
                    }
/* 11 */            uk2 uk2Var = (uk2) obj;
                    return Intrinsics.m6216a(this.f17577a, uk2Var.f17577a) && Intrinsics.m6216a(this.f17578b, uk2Var.f17578b);
                }

                public final int hashCode() {
/* 2 */             Boolean bool = this.f17577a;
/* 12 */            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
/* 14 */            Boolean bool2 = this.f17578b;
/* 23 */            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
                }

                public final String toString() {
/* 28 */            return "TCFConsentValue(consent=" + this.f17577a + ", legitimateInterest=" + this.f17578b + ")";
                }
            }
