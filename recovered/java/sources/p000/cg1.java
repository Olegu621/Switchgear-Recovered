            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cg1 {

                /* JADX INFO: renamed from: a */
                public final boolean f2889a;

                /* JADX INFO: renamed from: b */
                public final boolean f2890b;

                /* JADX INFO: renamed from: c */
                public final boolean f2891c;

                /* JADX INFO: renamed from: d */
                public final boolean f2892d;

                /* JADX INFO: renamed from: e */
                public final boolean f2893e;

                public cg1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
/* 4 */             this.f2889a = z;
/* 6 */             this.f2890b = z2;
/* 8 */             this.f2891c = z3;
/* 10 */            this.f2892d = z4;
/* 12 */            this.f2893e = z5;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof cg1)) {
/* 7 */                 return false;
                    }
/* 11 */            cg1 cg1Var = (cg1) obj;
                    return this.f2889a == cg1Var.f2889a && this.f2890b == cg1Var.f2890b && this.f2891c == cg1Var.f2891c && this.f2892d == cg1Var.f2892d && this.f2893e == cg1Var.f2893e;
                }

                public final int hashCode() {
/* 34 */            return Boolean.hashCode(this.f2893e) + AbstractC0886en.m3504h(AbstractC0886en.m3504h(AbstractC0886en.m3504h(Boolean.hashCode(this.f2889a) * 31, 31, this.f2890b), 31, this.f2891c), 31, this.f2892d);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("MediationGranularConsent(eea=");
/* 10 */            sb.append(this.f2889a);
/* 15 */            sb.append(", analyticsStorage=");
/* 20 */            sb.append(this.f2890b);
/* 25 */            sb.append(", adStorage=");
/* 30 */            sb.append(this.f2891c);
/* 35 */            sb.append(", adUserData=");
/* 40 */            sb.append(this.f2892d);
/* 45 */            sb.append(", adPersonalization=");
/* 52 */            return AbstractC0886en.m3511o(sb, this.f2893e, ")");
                }
            }
