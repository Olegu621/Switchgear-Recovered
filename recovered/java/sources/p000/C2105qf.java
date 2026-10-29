            package p000;
            
            /* JADX INFO: renamed from: qf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2105qf {

                /* JADX INFO: renamed from: a */
                public final Object f15509a;

                /* JADX INFO: renamed from: b */
                public final C1026ig f15510b;

                public C2105qf(Object obj, C1026ig c1026ig) {
/* 4 */             if (obj == null) {
/* 13 */                C1951n4.m6868s("Null payload");
/* 17 */                throw null;
                    }
/* 6 */             this.f15509a = obj;
/* 8 */             this.f15510b = c1026ig;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C2105qf) {
/* 10 */                C2105qf c2105qf = (C2105qf) obj;
/* 20 */                if (this.f15509a.equals(c2105qf.f15509a)) {
/* 22 */                    Object obj2 = px1.f15322a;
/* 28 */                    if (obj2.equals(obj2)) {
/* 30 */                        C1026ig c1026ig = c2105qf.f15510b;
/* 32 */                        C1026ig c1026ig2 = this.f15510b;
/* 34 */                        if (c1026ig2 != null ? c1026ig2.equals(c1026ig) : c1026ig == null) {
/* 1 */                             return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 21 */            int iHashCode = ((((1000003 * 1000003) ^ this.f15509a.hashCode()) * 1000003) ^ px1.f15322a.hashCode()) * 1000003;
/* 22 */            C1026ig c1026ig = this.f15510b;
/* 32 */            return (c1026ig == null ? 0 : c1026ig.hashCode()) ^ iHashCode;
                }

                public final String toString() {
/* 38 */            return "Event{code=null, payload=" + this.f15509a + ", priority=" + px1.f15322a + ", productData=" + this.f15510b + "}";
                }
            }
