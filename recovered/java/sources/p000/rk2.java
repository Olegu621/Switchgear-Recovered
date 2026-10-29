            package p000;

            import com.appsflyer.internal.AbstractC0298j;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rk2 implements vk2 {

                /* JADX INFO: renamed from: a */
                public Boolean f16139a;

                /* JADX INFO: renamed from: b */
                public int f16140b;

                /* JADX INFO: renamed from: c */
                public Boolean f16141c;

                @Override // p000.vk2
                /* JADX INFO: renamed from: a */
                public final Boolean mo5844a() {
/* 1 */             return this.f16141c;
                }

                @Override // p000.InterfaceC2108qi
                /* JADX INFO: renamed from: b */
                public final Boolean mo5845b() {
/* 1 */             return this.f16139a;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof rk2)) {
/* 7 */                 return false;
                    }
/* 11 */            rk2 rk2Var = (rk2) obj;
                    return Intrinsics.m6216a(this.f16139a, rk2Var.f16139a) && this.f16140b == rk2Var.f16140b && Intrinsics.m6216a(this.f16141c, rk2Var.f16141c);
                }

                @Override // p000.InterfaceC2108qi
                public final int getId() {
/* 1 */             return this.f16140b;
                }

                public final int hashCode() {
/* 1 */             Boolean bool = this.f16139a;
/* 17 */            int iM1860a = AbstractC0298j.m1860a(this.f16140b, (bool == null ? 0 : bool.hashCode()) * 31, 31);
/* 21 */            Boolean bool2 = this.f16141c;
/* 30 */            return iM1860a + (bool2 != null ? bool2.hashCode() : 0);
                }

                public final String toString() {
/* 38 */            return "TCFConsentDecision(consent=" + this.f16139a + ", id=" + this.f16140b + ", legitimateInterestConsent=" + this.f16141c + ")";
                }
            }
