            package p000;
            
            /* JADX INFO: renamed from: eg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0879eg extends xm1 {

                /* JADX INFO: renamed from: a */
                public final wm1 f7675a;

                /* JADX INFO: renamed from: b */
                public final vm1 f7676b;

                public C0879eg(wm1 wm1Var, vm1 vm1Var) {
/* 4 */             this.f7675a = wm1Var;
/* 6 */             this.f7676b = vm1Var;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof xm1) {
/* 10 */                xm1 xm1Var = (xm1) obj;
/* 12 */                wm1 wm1Var = this.f7675a;
/* 14 */                if (wm1Var != null ? wm1Var.equals(((C0879eg) xm1Var).f7675a) : ((C0879eg) xm1Var).f7675a == null) {
/* 35 */                    vm1 vm1Var = this.f7676b;
/* 37 */                    if (vm1Var != null ? vm1Var.equals(((C0879eg) xm1Var).f7676b) : ((C0879eg) xm1Var).f7676b == null) {
/* 1 */                         return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 2 */             wm1 wm1Var = this.f7675a;
/* 16 */            int iHashCode = ((wm1Var == null ? 0 : wm1Var.hashCode()) ^ 1000003) * 1000003;
/* 17 */            vm1 vm1Var = this.f7676b;
/* 26 */            return iHashCode ^ (vm1Var != null ? vm1Var.hashCode() : 0);
                }

                public final String toString() {
/* 28 */            return "NetworkConnectionInfo{networkType=" + this.f7675a + ", mobileSubtype=" + this.f7676b + "}";
                }
            }
