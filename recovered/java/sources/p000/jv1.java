            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jv1 {

                /* JADX INFO: renamed from: a */
                public final String f12505a;

                /* JADX INFO: renamed from: b */
                public final String f12506b;

                public jv1(String str, String str2) {
/* 1 */             str.getClass();
/* 7 */             this.f12505a = str;
/* 9 */             this.f12506b = str2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof jv1)) {
/* 32 */                return false;
                    }
/* 9 */             jv1 jv1Var = (jv1) obj;
                    return Intrinsics.m6216a(this.f12505a, jv1Var.f12505a) && this.f12506b.equals(jv1Var.f12506b);
                }

                public final int hashCode() {
/* 15 */            return this.f12506b.hashCode() + (this.f12505a.hashCode() * 31);
                }

                public final String toString() {
/* 11 */            return fm0.m3785k("PredefinedUIPurposeVendorDetails(title=", this.f12505a, ", value=", this.f12506b, ")");
                }
            }
