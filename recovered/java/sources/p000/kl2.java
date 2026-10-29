            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kl2 implements InterfaceC2108qi {

                /* JADX INFO: renamed from: a */
                public int f12874a;

                /* JADX INFO: renamed from: b */
                public Boolean f12875b;

                @Override // p000.InterfaceC2108qi
                /* JADX INFO: renamed from: b */
                public final Boolean mo5845b() {
                    throw null;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof kl2)) {
/* 7 */                 return false;
                    }
/* 11 */            kl2 kl2Var = (kl2) obj;
                    return this.f12874a == kl2Var.f12874a && Intrinsics.m6216a(this.f12875b, kl2Var.f12875b);
                }

                @Override // p000.InterfaceC2108qi
                public final int getId() {
                    throw null;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = Integer.hashCode(this.f12874a) * 31;
/* 9 */             Boolean bool = this.f12875b;
/* 19 */            return iHashCode + (bool == null ? 0 : bool.hashCode());
                }

                public final String toString() {
/* 28 */            return "TCFUserDecisionOnSpecialFeature(id=" + this.f12874a + ", consent=" + this.f12875b + ")";
                }
            }
