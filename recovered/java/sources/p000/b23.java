            package p000;

            import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class b23 {

                /* JADX INFO: renamed from: a */
                public final boolean f2182a;

                /* JADX INFO: renamed from: b */
                public final boolean f2183b;

                /* JADX INFO: renamed from: c */
                public final TCFVendor f2184c;

                public b23(boolean z, boolean z2, TCFVendor tCFVendor) {
/* 4 */             this.f2182a = z;
/* 6 */             this.f2183b = z2;
/* 8 */             this.f2184c = tCFVendor;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 37 */                return true;
                    }
/* 6 */             if (!(obj instanceof b23)) {
/* 35 */                return false;
                    }
/* 9 */             b23 b23Var = (b23) obj;
                    return this.f2182a == b23Var.f2182a && this.f2183b == b23Var.f2183b && this.f2184c.equals(b23Var.f2184c);
                }

                public final int hashCode() {
/* 22 */            return this.f2184c.hashCode() + AbstractC0886en.m3504h(Boolean.hashCode(this.f2182a) * 31, 31, this.f2183b);
                }

                public final String toString() {
/* 38 */            return "VendorProps(checked=" + this.f2182a + ", legitimateInterestChecked=" + this.f2183b + ", vendor=" + this.f2184c + ")";
                }
            }
