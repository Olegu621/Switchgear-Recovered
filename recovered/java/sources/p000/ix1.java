            package p000;

            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ix1 {

                /* JADX INFO: renamed from: a */
                public final Class f11951a;

                /* JADX INFO: renamed from: b */
                public final Class f11952b;

                public ix1(Class cls, Class cls2) {
/* 4 */             this.f11951a = cls;
/* 6 */             this.f11952b = cls2;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof ix1)) {
/* 3 */                 return false;
                    }
/* 7 */             ix1 ix1Var = (ix1) obj;
                    return ix1Var.f11951a.equals(this.f11951a) && ix1Var.f11952b.equals(this.f11952b);
                }

                public final int hashCode() {
/* 9 */             return Objects.hash(this.f11951a, this.f11952b);
                }

                public final String toString() {
/* 29 */            return this.f11951a.getSimpleName() + " with primitive type: " + this.f11952b.getSimpleName();
                }
            }
