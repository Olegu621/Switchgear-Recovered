            package p000;
            
            /* JADX INFO: renamed from: tg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2217tg {

                /* JADX INFO: renamed from: a */
                public final mj2 f17084a;

                public C2217tg(mj2 mj2Var) {
/* 4 */             this.f17084a = mj2Var;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
                    return (obj instanceof C2217tg) && this.f17084a == ((C2217tg) obj).f17084a;
                }

                public final int hashCode() {
/* 10 */            return this.f17084a.hashCode() ^ (-721379959);
                }

                public final String toString() {
/* 18 */            return "Event{eventCode=0, surfaceOutput=" + this.f17084a + "}";
                }
            }
