            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class u30 {

                /* JADX INFO: renamed from: a */
                public final f02 f17339a;

                /* JADX INFO: renamed from: b */
                public final boolean f17340b;

                public u30(f02 f02Var, boolean z) {
/* 4 */             this.f17339a = f02Var;
/* 6 */             this.f17340b = z;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof u30) {
/* 6 */                 u30 u30Var = (u30) obj;
/* 16 */                if (u30Var.f17339a.equals(this.f17339a) && u30Var.f17340b == this.f17340b) {
/* 24 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 22 */            return Boolean.valueOf(this.f17340b).hashCode() ^ ((this.f17339a.hashCode() ^ 1000003) * 1000003);
                }
            }
