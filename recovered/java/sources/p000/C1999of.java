            package p000;
            
            /* JADX INFO: renamed from: of */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1999of {

                /* JADX INFO: renamed from: a */
                public final C0916fg f14733a;

                /* JADX INFO: renamed from: b */
                public final C0916fg f14734b;

                public C1999of(C0916fg c0916fg, C0916fg c0916fg2) {
/* 4 */             this.f14733a = c0916fg;
/* 6 */             this.f14734b = c0916fg2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof C1999of)) {
/* 32 */                return false;
                    }
/* 8 */             C1999of c1999of = (C1999of) obj;
                    return this.f14733a.equals(c1999of.f14733a) && this.f14734b.equals(c1999of.f14734b);
                }

                public final int hashCode() {
/* 18 */            return this.f14734b.hashCode() ^ ((this.f14733a.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 28 */            return "DualOutConfig{primaryOutConfig=" + this.f14733a + ", secondaryOutConfig=" + this.f14734b + "}";
                }
            }
