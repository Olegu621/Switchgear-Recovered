            package p000;

            import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class uz1 {

                /* JADX INFO: renamed from: a */
                public final boolean f17814a;

                /* JADX INFO: renamed from: b */
                public final boolean f17815b;

                /* JADX INFO: renamed from: c */
                public final TCFPurpose f17816c;

                public uz1(boolean z, boolean z2, TCFPurpose tCFPurpose) {
/* 4 */             this.f17814a = z;
/* 6 */             this.f17815b = z2;
/* 8 */             this.f17816c = tCFPurpose;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 37 */                return true;
                    }
/* 6 */             if (!(obj instanceof uz1)) {
/* 35 */                return false;
                    }
/* 9 */             uz1 uz1Var = (uz1) obj;
                    return this.f17814a == uz1Var.f17814a && this.f17815b == uz1Var.f17815b && this.f17816c.equals(uz1Var.f17816c);
                }

                public final int hashCode() {
/* 22 */            return this.f17816c.hashCode() + AbstractC0886en.m3504h(Boolean.hashCode(this.f17814a) * 31, 31, this.f17815b);
                }

                public final String toString() {
/* 38 */            return "PurposeProps(checked=" + this.f17814a + ", legitimateInterestChecked=" + this.f17815b + ", purpose=" + this.f17816c + ")";
                }
            }
