            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nl3 {

                /* JADX INFO: renamed from: d */
                public static final nl3 f14369d = new nl3(new wl0());

                /* JADX INFO: renamed from: a */
                public final boolean f14370a;

                /* JADX INFO: renamed from: b */
                public final boolean f14371b;

                /* JADX INFO: renamed from: c */
                public final boolean f14372c;

                public nl3(wl0 wl0Var) {
/* 6 */             this.f14370a = wl0Var.f18680b;
/* 10 */            this.f14371b = wl0Var.f18681c;
/* 14 */            this.f14372c = wl0Var.f18682d;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 35 */                return true;
                    }
/* 4 */             if (obj == null || nl3.class != obj.getClass()) {
/* 37 */                return false;
                    }
/* 15 */            nl3 nl3Var = (nl3) obj;
                    return this.f14370a == nl3Var.f14370a && this.f14371b == nl3Var.f14371b && this.f14372c == nl3Var.f14372c;
                }

                public final int hashCode() {
/* 12 */            return ((((this.f14370a ? 1 : 0) * 31) + (this.f14371b ? 1 : 0)) * 31) + (this.f14372c ? 1 : 0);
                }
            }
