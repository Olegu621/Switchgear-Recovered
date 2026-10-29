            package p000;

            import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialFeature;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yf2 {

                /* JADX INFO: renamed from: a */
                public final boolean f19597a;

                /* JADX INFO: renamed from: b */
                public final TCFSpecialFeature f19598b;

                public yf2(boolean z, TCFSpecialFeature tCFSpecialFeature) {
/* 4 */             this.f19597a = z;
/* 6 */             this.f19598b = tCFSpecialFeature;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof yf2)) {
/* 28 */                return false;
                    }
/* 9 */             yf2 yf2Var = (yf2) obj;
                    return this.f19597a == yf2Var.f19597a && this.f19598b.equals(yf2Var.f19598b);
                }

                public final int hashCode() {
/* 15 */            return this.f19598b.hashCode() + (Boolean.hashCode(this.f19597a) * 31);
                }

                public final String toString() {
/* 28 */            return "SpecialFeatureProps(checked=" + this.f19597a + ", specialFeature=" + this.f19598b + ")";
                }
            }
