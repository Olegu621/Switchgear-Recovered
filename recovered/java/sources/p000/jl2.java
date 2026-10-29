            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jl2 implements InterfaceC2108qi, vk2 {

                /* JADX INFO: renamed from: a */
                public final int f12353a;

                /* JADX INFO: renamed from: b */
                public final Boolean f12354b;

                /* JADX INFO: renamed from: c */
                public final Boolean f12355c;

                public jl2(int i, Boolean bool, Boolean bool2) {
/* 4 */             this.f12353a = i;
/* 6 */             this.f12354b = bool;
/* 8 */             this.f12355c = bool2;
                }

                @Override // p000.vk2
                /* JADX INFO: renamed from: a */
                public final Boolean mo5844a() {
/* 1 */             return this.f12355c;
                }

                @Override // p000.InterfaceC2108qi
                /* JADX INFO: renamed from: b */
                public final Boolean mo5845b() {
/* 1 */             return this.f12354b;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof jl2)) {
/* 7 */                 return false;
                    }
/* 11 */            jl2 jl2Var = (jl2) obj;
                    return this.f12353a == jl2Var.f12353a && Intrinsics.m6216a(this.f12354b, jl2Var.f12354b) && Intrinsics.m6216a(this.f12355c, jl2Var.f12355c);
                }

                @Override // p000.InterfaceC2108qi
                public final int getId() {
/* 1 */             return this.f12353a;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = Integer.hashCode(this.f12353a) * 31;
/* 10 */            Boolean bool = this.f12354b;
/* 21 */            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
/* 23 */            Boolean bool2 = this.f12355c;
/* 32 */            return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
                }

                public final String toString() {
/* 38 */            return "TCFUserDecisionOnPurpose(id=" + this.f12353a + ", consent=" + this.f12354b + ", legitimateInterestConsent=" + this.f12355c + ")";
                }
            }
