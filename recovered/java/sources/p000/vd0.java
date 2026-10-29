            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vd0 {

                /* JADX INFO: renamed from: a */
                public final String f18011a;

                public vd0(String str) {
/* 4 */             if (str != null) {
/* 6 */                 this.f18011a = str;
                    } else {
/* 11 */                C1951n4.m6868s("name is null");
/* 15 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (!(obj instanceof vd0)) {
/* 9 */                 return false;
                    }
/* 17 */            return this.f18011a.equals(((vd0) obj).f18011a);
                }

                public final int hashCode() {
/* 10 */            return this.f18011a.hashCode() ^ 1000003;
                }

                public final String toString() {
/* 12 */            return fm0.m3789o(new StringBuilder("Encoding{name=\""), this.f18011a, "\"}");
                }
            }
