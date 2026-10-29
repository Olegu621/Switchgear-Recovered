            package p000;
            
            /* JADX INFO: renamed from: ef */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0878ef {

                /* JADX INFO: renamed from: a */
                public final int f7659a;

                /* JADX INFO: renamed from: b */
                public final C0915ff f7660b;

                public C0878ef(int i, C0915ff c0915ff) {
/* 4 */             if (i == 0) {
/* 13 */                C1951n4.m6868s("Null type");
/* 17 */                throw null;
                    }
/* 6 */             this.f7659a = i;
/* 8 */             this.f7660b = c0915ff;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 35 */                return true;
                    }
/* 6 */             if (!(obj instanceof C0878ef)) {
/* 37 */                return false;
                    }
/* 8 */             C0878ef c0878ef = (C0878ef) obj;
/* 18 */            if (!AbstractC0886en.m3499c(this.f7659a, c0878ef.f7659a)) {
/* 37 */                return false;
                    }
/* 20 */            C0915ff c0915ff = c0878ef.f7660b;
/* 22 */            C0915ff c0915ff2 = this.f7660b;
/* 24 */            if (c0915ff2 == null) {
                        return c0915ff == null;
                    }
                    return c0915ff2.equals(c0915ff);
                }

                public final int hashCode() {
/* 11 */            int iM3520y = (AbstractC0886en.m3520y(this.f7659a) ^ 1000003) * 1000003;
/* 12 */            C0915ff c0915ff = this.f7660b;
/* 22 */            return (c0915ff == null ? 0 : c0915ff.hashCode()) ^ iM3520y;
                }

                public final String toString() {
/* 32 */            return "CameraState{type=" + AbstractC0886en.m3493B(this.f7659a) + ", error=" + this.f7660b + "}";
                }
            }
