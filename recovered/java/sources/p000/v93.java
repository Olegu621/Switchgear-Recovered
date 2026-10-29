            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class v93 {

                /* JADX INFO: renamed from: a */
                public float f17926a;

                /* JADX INFO: renamed from: b */
                public final float f17927b;

                /* JADX INFO: renamed from: c */
                public final float f17928c;

                /* JADX INFO: renamed from: d */
                public float f17929d;

                public v93(float f, float f2) {
/* 4 */             this.f17927b = f;
/* 6 */             this.f17928c = f2;
                }

                /* JADX INFO: renamed from: a */
                public final float m9238a() {
/* 1 */             return this.f17929d;
                }

                /* JADX INFO: renamed from: b */
                public final float m9239b() {
/* 1 */             return this.f17927b;
                }

                /* JADX INFO: renamed from: c */
                public final float m9240c() {
/* 1 */             return this.f17928c;
                }

                /* JADX INFO: renamed from: d */
                public final float m9241d() {
/* 1 */             return this.f17926a;
                }

                /* JADX WARN: Code duplicated, block: B:8:0x0015  */
                /* JADX INFO: renamed from: e */
                public final void m9242e() {
/* 1 */             float f = 1.0f;
/* 3 */             float f2 = this.f17927b;
/* 7 */             float f3 = this.f17928c;
/* 9 */             if (1.0f > f2 || 1.0f < f3) {
/* 74 */                throw new IllegalArgumentException("Requested zoomRatio 1.0 is not within valid range [" + f3 + " , " + f2 + "]");
                    }
/* 15 */            this.f17926a = 1.0f;
/* 20 */            if (f2 == f3) {
/* 22 */                f = 0.0f;
                    } else if (1.0f != f2) {
/* 29 */                if (1.0f == f3) {
/* 22 */                    f = 0.0f;
                        } else {
/* 34 */                    float f4 = 1.0f / f3;
/* 38 */                    f = (1.0f - f4) / ((1.0f / f2) - f4);
                        }
                    }
/* 39 */            this.f17929d = f;
                }
            }
