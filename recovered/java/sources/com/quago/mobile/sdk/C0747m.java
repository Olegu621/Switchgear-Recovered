            package com.quago.mobile.sdk;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.m */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 21 */    public final class C0747m {

                /* JADX INFO: renamed from: b */
                public float f5555b;

                /* JADX INFO: renamed from: c */
                public float f5556c;

                /* JADX INFO: renamed from: d */
                public float f5557d;

                /* JADX INFO: renamed from: e */
                public float f5558e;

                /* JADX INFO: renamed from: f */
                public float f5559f;

                /* JADX INFO: renamed from: j */
                public final C0741j1 f5563j;

                /* JADX INFO: renamed from: a */
                public int f5554a = -1;

                /* JADX INFO: renamed from: h */
                public final float[] f5561h = new float[16];

                /* JADX INFO: renamed from: i */
                public final float[] f5562i = new float[16];

                /* JADX INFO: renamed from: g */
                public boolean f5560g = false;

                public C0747m(C0741j1 c0741j1) {
/* 4 */             this.f5563j = c0741j1;
                }

                /* JADX INFO: renamed from: a */
                public final C0747m m2624a(float f) {
/* 5 */             while (f >= 360.0f) {
/* 7 */                 f -= 360.0f;
                    }
/* 13 */            while (f <= -360.0f) {
/* 15 */                f += 360.0f;
                    }
/* 17 */            this.f5555b = f;
/* 20 */            this.f5560g = false;
/* 22 */            return this;
                }

                /* JADX INFO: renamed from: b */
                public final C0747m m2627b(float f, float f2) {
/* 1 */             this.f5556c = f;
/* 3 */             this.f5557d = f2;
/* 6 */             this.f5560g = false;
/* 8 */             return this;
                }

                /* JADX INFO: renamed from: a */
/* 22 */        public final C0747m m2625a(float f, float f2) {
/* 23 */            this.f5558e = f;
/* 24 */            this.f5559f = f2;
/* 25 */            this.f5560g = false;
                    return this;
                }

                /* JADX INFO: renamed from: a */
/* 25 */        public final C0747m m2626a(int i) {
/* 26 */            this.f5554a = i;
                    return this;
                }
            }
