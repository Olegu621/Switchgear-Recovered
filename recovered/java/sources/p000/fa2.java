            package p000;

            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fa2 {

                /* JADX INFO: renamed from: a */
                public final Class f8054a;

                /* JADX INFO: renamed from: b */
                public final C2335wl f8055b;

                public fa2(Class cls, C2335wl c2335wl) {
/* 4 */             this.f8054a = cls;
/* 6 */             this.f8055b = c2335wl;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof fa2)) {
/* 3 */                 return false;
                    }
/* 7 */             fa2 fa2Var = (fa2) obj;
                    return fa2Var.f8054a.equals(this.f8054a) && fa2Var.f8055b.equals(this.f8055b);
                }

                public final int hashCode() {
/* 9 */             return Objects.hash(this.f8054a, this.f8055b);
                }

                public final String toString() {
/* 25 */            return this.f8054a.getSimpleName() + ", object identifier: " + this.f8055b;
                }
            }
