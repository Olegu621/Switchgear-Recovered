            package p000;
            
            /* JADX INFO: renamed from: ag */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0018ag {

                /* JADX INFO: renamed from: a */
                public final g71 f227a;

                /* JADX INFO: renamed from: b */
                public final C0989hf f228b;

                public C0018ag(g71 g71Var, C0989hf c0989hf) {
/* 5 */             if (g71Var == null) {
/* 22 */                C1951n4.m6868s("Null lifecycleOwner");
/* 25 */                throw null;
                    }
/* 7 */             this.f227a = g71Var;
/* 9 */             if (c0989hf != null) {
/* 11 */                this.f228b = c0989hf;
                    } else {
/* 16 */                C1951n4.m6868s("Null cameraId");
/* 19 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C0018ag) {
/* 10 */                C0018ag c0018ag = (C0018ag) obj;
/* 20 */                if (this.f227a.equals(c0018ag.f227a) && this.f228b.equals(c0018ag.f228b)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 18 */            return this.f228b.hashCode() ^ ((this.f227a.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 28 */            return "Key{lifecycleOwner=" + this.f227a + ", cameraId=" + this.f228b + "}";
                }
            }
