            package p000;
            
            /* JADX INFO: renamed from: yf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2496yf {

                /* JADX INFO: renamed from: a */
                public final float f19590a;

                /* JADX INFO: renamed from: b */
                public final float f19591b;

                /* JADX INFO: renamed from: c */
                public final float f19592c;

                /* JADX INFO: renamed from: d */
                public final float f19593d;

                public C2496yf(float f, float f2, float f3, float f4) {
/* 4 */             this.f19590a = f;
/* 6 */             this.f19591b = f2;
/* 8 */             this.f19592c = f3;
/* 10 */            this.f19593d = f4;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C2496yf) {
/* 10 */                C2496yf c2496yf = (C2496yf) obj;
/* 24 */                if (Float.floatToIntBits(this.f19590a) == Float.floatToIntBits(c2496yf.f19590a) && Float.floatToIntBits(this.f19591b) == Float.floatToIntBits(c2496yf.f19591b) && Float.floatToIntBits(this.f19592c) == Float.floatToIntBits(c2496yf.f19592c) && Float.floatToIntBits(this.f19593d) == Float.floatToIntBits(c2496yf.f19593d)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 34 */            return Float.floatToIntBits(this.f19593d) ^ ((((((Float.floatToIntBits(this.f19590a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f19591b)) * 1000003) ^ Float.floatToIntBits(this.f19592c)) * 1000003);
                }

                public final String toString() {
/* 48 */            return "ImmutableZoomState{zoomRatio=" + this.f19590a + ", maxZoomRatio=" + this.f19591b + ", minZoomRatio=" + this.f19592c + ", linearZoom=" + this.f19593d + "}";
                }
            }
