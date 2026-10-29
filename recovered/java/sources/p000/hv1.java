            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hv1 {

                /* JADX INFO: renamed from: a */
                public final String f9333a;

                /* JADX INFO: renamed from: b */
                public final String f9334b;

                /* JADX INFO: renamed from: c */
                public final String f9335c;

                public hv1(String str, String str2, String str3) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
/* 7 */             str3.getClass();
/* 13 */            this.f9333a = str;
/* 15 */            this.f9334b = str2;
/* 17 */            this.f9335c = str3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof hv1)) {
/* 7 */                 return false;
                    }
/* 11 */            hv1 hv1Var = (hv1) obj;
                    return Intrinsics.m6216a(this.f9333a, hv1Var.f9333a) && Intrinsics.m6216a(this.f9334b, hv1Var.f9334b) && Intrinsics.m6216a(this.f9335c, hv1Var.f9335c);
                }

                public final int hashCode() {
/* 22 */            return this.f9335c.hashCode() + pm2.m7485h(this.f9333a.hashCode() * 31, 31, this.f9334b);
                }

                public final String toString() {
/* 19 */            return fm0.m3789o(AbstractC0886en.m3514r("PredefinedUIProcessingCompany(address=", this.f9333a, ", dataProtectionOfficer=", this.f9334b, ", name="), this.f9335c, ")");
                }
            }
