            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pu1 {

                /* JADX INFO: renamed from: a */
                public final String f15285a;

                /* JADX INFO: renamed from: b */
                public final vv1 f15286b;

                public pu1(String str, vv1 vv1Var) {
/* 1 */             str.getClass();
/* 7 */             this.f15285a = str;
/* 9 */             this.f15286b = vv1Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof pu1)) {
/* 32 */                return false;
                    }
/* 9 */             pu1 pu1Var = (pu1) obj;
                    return Intrinsics.m6216a(this.f15285a, pu1Var.f15285a) && this.f15286b.equals(pu1Var.f15286b);
                }

                public final int hashCode() {
/* 15 */            return this.f15286b.hashCode() + (this.f15285a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "PredefinedUIDependantSwitchSettings(id=" + this.f15285a + ", switchSettings=" + this.f15286b + ")";
                }
            }
