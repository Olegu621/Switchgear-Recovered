            package p000;

            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kv1 {

                /* JADX INFO: renamed from: a */
                public final ArrayList f13020a;

                /* JADX INFO: renamed from: b */
                public final boolean f13021b;

                public kv1(ArrayList arrayList, boolean z) {
/* 4 */             this.f13020a = arrayList;
/* 6 */             this.f13021b = z;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof kv1)) {
/* 28 */                return false;
                    }
/* 9 */             kv1 kv1Var = (kv1) obj;
                    return this.f13020a.equals(kv1Var.f13020a) && this.f13021b == kv1Var.f13021b;
                }

                public final int hashCode() {
/* 15 */            return Boolean.hashCode(this.f13021b) + (this.f13020a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "PredefinedUIServiceConsent(history=" + this.f13020a + ", status=" + this.f13021b + ")";
                }
            }
