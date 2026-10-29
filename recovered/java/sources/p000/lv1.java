            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lv1 {

                /* JADX INFO: renamed from: a */
                public final String f13500a;

                /* JADX INFO: renamed from: b */
                public final w11 f13501b;

                public lv1(String str, w11 w11Var) {
/* 1 */             str.getClass();
/* 7 */             this.f13500a = str;
/* 9 */             this.f13501b = w11Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof lv1)) {
/* 32 */                return false;
                    }
/* 9 */             lv1 lv1Var = (lv1) obj;
                    return Intrinsics.m6216a(this.f13500a, lv1Var.f13500a) && this.f13501b.equals(lv1Var.f13501b);
                }

                public final int hashCode() {
/* 15 */            return this.f13501b.hashCode() + (this.f13500a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "PredefinedUIServiceContentSection(title=" + this.f13500a + ", content=" + this.f13501b + ")";
                }
            }
