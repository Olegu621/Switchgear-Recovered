            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gp0 {

                /* JADX INFO: renamed from: a */
                public final boolean f8760a;

                /* JADX INFO: renamed from: b */
                public final Integer f8761b;

                public gp0(boolean z, Integer num) {
/* 4 */             this.f8760a = z;
/* 6 */             this.f8761b = num;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof gp0)) {
/* 7 */                 return false;
                    }
/* 11 */            gp0 gp0Var = (gp0) obj;
                    return this.f8760a == gp0Var.f8760a && Intrinsics.m6216a(this.f8761b, gp0Var.f8761b);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = Boolean.hashCode(this.f8760a) * 31;
/* 9 */             Integer num = this.f8761b;
/* 19 */            return iHashCode + (num == null ? 0 : num.hashCode());
                }

                public final String toString() {
/* 28 */            return "GDPROptions(displayCmpOnlyToEUUsers=" + this.f8760a + ", reshowCmpInMonths=" + this.f8761b + ")";
                }
            }
