            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ot0 {

                /* JADX INFO: renamed from: a */
                public final C2334wk f14891a;

                /* JADX INFO: renamed from: b */
                public final C0204c5 f14892b;

                /* JADX INFO: renamed from: c */
                public final C2131r4 f14893c;

                public ot0(C2334wk c2334wk, C0204c5 c0204c5, C2131r4 c2131r4) {
/* 1 */             int i = c2334wk.f18666b;
/* 6 */             this.f14891a = c2334wk;
/* 8 */             this.f14892b = c0204c5;
/* 10 */            this.f14893c = c2131r4;
/* 12 */            int i2 = c2334wk.f18667c;
/* 14 */            int i3 = c2334wk.f18665a;
/* 18 */            if (i2 - i3 == 0 && c2334wk.f18668d - i == 0) {
/* 28 */                C1951n4.m6859j("Bounds must be non zero");
/* 31 */                throw null;
                    }
/* 32 */            if (i3 == 0 || i == 0) {
/* 43 */                return;
                    }
/* 39 */            C1951n4.m6859j("Bounding rectangle must start at the top or left window edge for folding features");
/* 42 */            throw null;
                }

                /* JADX INFO: renamed from: a */
                public final boolean m7239a() {
/* 1 */             C0204c5 c0204c5 = C0204c5.f2715q;
/* 4 */             C0204c5 c0204c6 = this.f14892b;
                    return c0204c6 == c0204c5 || (c0204c6 == C0204c5.f2714p && this.f14893c == C2131r4.f15858m);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 20 */            if (ot0.class.equals(obj != null ? obj.getClass() : null)) {
/* 23 */                obj.getClass();
/* 26 */                ot0 ot0Var = (ot0) obj;
                        return this.f14891a.equals(ot0Var.f14891a) && this.f14892b == ot0Var.f14892b && this.f14893c == ot0Var.f14893c;
                    }
/* 19 */            return false;
                }

                public final int hashCode() {
/* 24 */            return this.f14893c.hashCode() + ((this.f14892b.hashCode() + (this.f14891a.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 50 */            return ot0.class.getSimpleName() + " { " + this.f14891a + ", type=" + this.f14892b + ", state=" + this.f14893c + " }";
                }
            }
