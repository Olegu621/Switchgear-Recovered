            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class t81 {

                /* JADX INFO: renamed from: a */
                public final Object f16989a;

                /* JADX INFO: renamed from: b */
                public final String f16990b;

                public t81(Object obj, String str) {
/* 4 */             this.f16989a = obj;
/* 6 */             this.f16990b = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof t81)) {
/* 7 */                 return false;
                    }
/* 11 */            t81 t81Var = (t81) obj;
                    return this.f16989a == t81Var.f16989a && this.f16990b.equals(t81Var.f16990b);
                }

                public final int hashCode() {
/* 15 */            return this.f16990b.hashCode() + (System.identityHashCode(this.f16989a) * 31);
                }
            }
