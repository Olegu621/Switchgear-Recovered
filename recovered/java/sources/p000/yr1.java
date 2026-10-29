            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yr1 {

                /* JADX INFO: renamed from: a */
                public final float f19771a;

                /* JADX INFO: renamed from: b */
                public final float f19772b;

                /* JADX INFO: renamed from: c */
                public final float f19773c;

                /* JADX INFO: renamed from: d */
                public final float f19774d;

                /* JADX INFO: renamed from: e */
                public final float f19775e;

                /* JADX INFO: renamed from: f */
                public final float f19776f;

                /* JADX INFO: renamed from: g */
                public final float f19777g;

                /* JADX INFO: renamed from: h */
                public final float f19778h;

                /* JADX INFO: renamed from: i */
                public final float f19779i;

                public yr1(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
/* 4 */             this.f19771a = f;
/* 6 */             this.f19772b = f4;
/* 8 */             this.f19773c = f7;
/* 10 */            this.f19774d = f2;
/* 12 */            this.f19775e = f5;
/* 14 */            this.f19776f = f8;
/* 16 */            this.f19777g = f3;
/* 18 */            this.f19778h = f6;
/* 20 */            this.f19779i = f9;
                }

                /* JADX INFO: renamed from: a */
                public static yr1 m10172a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
/* 5 */             float f9 = ((f - f3) + f5) - f7;
/* 11 */            float f10 = ((f2 - f4) + f6) - f8;
/* 16 */            if (f9 == 0.0f && f10 == 0.0f) {
/* 38 */                return new yr1(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
                    }
/* 42 */            float f11 = f3 - f5;
/* 44 */            float f12 = f7 - f5;
/* 46 */            float f13 = f4 - f6;
/* 48 */            float f14 = f8 - f6;
/* 54 */            float f15 = (f11 * f14) - (f12 * f13);
/* 58 */            float f16 = ((f14 * f9) - (f12 * f10)) / f15;
/* 63 */            float f17 = ((f11 * f10) - (f9 * f13)) / f15;
/* 95 */            return new yr1((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f16 * f4) + (f4 - f2), (f17 * f8) + (f8 - f2), f2, f16, f17, 1.0f);
                }
            }
