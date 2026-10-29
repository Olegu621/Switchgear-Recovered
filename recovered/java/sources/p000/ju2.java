            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ju2 {

                /* JADX INFO: renamed from: a */
                public final String f12500a;

                /* JADX INFO: renamed from: b */
                public final boolean f12501b;

                public ju2(String str, boolean z) {
/* 1 */             str.getClass();
/* 7 */             this.f12500a = str;
/* 9 */             this.f12501b = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ju2)) {
/* 7 */                 return false;
                    }
/* 11 */            ju2 ju2Var = (ju2) obj;
                    return Intrinsics.m6216a(this.f12500a, ju2Var.f12500a) && this.f12501b == ju2Var.f12501b;
                }

                public final int hashCode() {
/* 15 */            return Boolean.hashCode(this.f12501b) + (this.f12500a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "UCFirstLayerCCPAToggle(label=" + this.f12500a + ", initialValue=" + this.f12501b + ")";
                }
            }
