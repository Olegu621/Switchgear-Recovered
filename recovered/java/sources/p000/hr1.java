            package p000;

            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hr1 {

                /* JADX INFO: renamed from: a */
                public final Object f9210a;

                /* JADX INFO: renamed from: b */
                public final Object f9211b;

                public hr1(Object obj, Object obj2) {
/* 4 */             this.f9210a = obj;
/* 6 */             this.f9211b = obj2;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof hr1)) {
/* 3 */                 return false;
                    }
/* 7 */             hr1 hr1Var = (hr1) obj;
                    return Objects.equals(hr1Var.f9210a, this.f9210a) && Objects.equals(hr1Var.f9211b, this.f9211b);
                }

                public final int hashCode() {
/* 1 */             Object obj = this.f9210a;
/* 8 */             int iHashCode = obj == null ? 0 : obj.hashCode();
/* 12 */            Object obj2 = this.f9211b;
/* 21 */            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
                }

                public final String toString() {
/* 28 */            return "Pair{" + this.f9210a + " " + this.f9211b + "}";
                }
            }
