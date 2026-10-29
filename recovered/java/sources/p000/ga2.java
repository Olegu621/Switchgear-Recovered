            package p000;

            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ga2 {

                /* JADX INFO: renamed from: a */
                public final Class f8526a;

                /* JADX INFO: renamed from: b */
                public final Class f8527b;

                public ga2(Class cls, Class cls2) {
/* 4 */             this.f8526a = cls;
/* 6 */             this.f8527b = cls2;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof ga2)) {
/* 3 */                 return false;
                    }
/* 7 */             ga2 ga2Var = (ga2) obj;
                    return ga2Var.f8526a.equals(this.f8526a) && ga2Var.f8527b.equals(this.f8527b);
                }

                public final int hashCode() {
/* 9 */             return Objects.hash(this.f8526a, this.f8527b);
                }

                public final String toString() {
/* 29 */            return this.f8526a.getSimpleName() + " with serialization type: " + this.f8527b.getSimpleName();
                }
            }
