            package p000;
            
            /* JADX INFO: renamed from: ig */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1026ig {

                /* JADX INFO: renamed from: a */
                public final Integer f9581a;

                public C1026ig(Integer num) {
/* 4 */             this.f9581a = num;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof C1026ig) {
/* 15 */                return this.f9581a.equals(((C1026ig) obj).f9581a);
                    }
/* 20 */            return false;
                }

                public final int hashCode() {
/* 10 */            return this.f9581a.hashCode() ^ 1000003;
                }

                public final String toString() {
/* 18 */            return "ProductData{productId=" + this.f9581a + "}";
                }
            }
