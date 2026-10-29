            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mu1 {

                /* JADX INFO: renamed from: a */
                public final String f14027a;

                /* JADX INFO: renamed from: b */
                public final String f14028b;

                public mu1(String str, String str2) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
/* 10 */            this.f14027a = str;
/* 12 */            this.f14028b = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof mu1)) {
/* 7 */                 return false;
                    }
/* 11 */            mu1 mu1Var = (mu1) obj;
                    return Intrinsics.m6216a(this.f14027a, mu1Var.f14027a) && Intrinsics.m6216a(this.f14028b, mu1Var.f14028b);
                }

                public final int hashCode() {
/* 15 */            return this.f14028b.hashCode() + (this.f14027a.hashCode() * 31);
                }

                public final String toString() {
/* 11 */            return fm0.m3785k("PredefinedUIDataDistribution(processingLocation=", this.f14027a, ", thirdPartyCountries=", this.f14028b, ")");
                }
            }
