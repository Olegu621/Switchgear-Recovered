            package p000;
            
            /* JADX INFO: renamed from: nk */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1967nk extends dc0 implements Cloneable {

                /* JADX INFO: renamed from: a0 */
                public float f14321a0;

                /* JADX INFO: renamed from: b0 */
                public float f14322b0;

                /* JADX INFO: renamed from: c0 */
                public float f14323c0;

                /* JADX INFO: renamed from: d0 */
                public float f14324d0;

                /* JADX INFO: renamed from: e0 */
                public float f14325e0;

                /* JADX INFO: renamed from: f0 */
                public float f14326f0;

                @Override // p000.dc0
                /* JADX INFO: renamed from: h */
                public final void mo2993h(float f, float f2, float f3, dd2 dd2Var) {
                    float f4;
                    float f5;
/* 9 */             float f6 = this.f14323c0;
/* 14 */            if (f6 == 0.0f) {
/* 16 */                dd2Var.m3008d(f, 0.0f);
/* 19 */                return;
                    }
/* 26 */            float f7 = ((this.f14322b0 * 2.0f) + f6) / 2.0f;
/* 30 */            float f8 = f3 * this.f14321a0;
/* 34 */            float f9 = f2 + this.f14325e0;
/* 41 */            float fM3503g = AbstractC0886en.m3503g(1.0f, f3, f7, this.f14324d0 * f3);
/* 49 */            if (fM3503g / f7 >= 1.0f) {
/* 51 */                dd2Var.m3008d(f, 0.0f);
/* 54 */                return;
                    }
/* 55 */            float f10 = this.f14326f0;
/* 57 */            float f11 = f10 * f3;
/* 82 */            boolean z = f10 == -1.0f || Math.abs((f10 * 2.0f) - f6) < 0.1f;
/* 84 */            if (z) {
/* 91 */                f4 = fM3503g;
/* 93 */                f5 = 0.0f;
                    } else {
/* 86 */                f5 = 1.75f;
/* 88 */                f4 = 0.0f;
                    }
/* 94 */            float f12 = f7 + f8;
/* 97 */            float f13 = f4 + f8;
/* 107 */           float fSqrt = (float) Math.sqrt((f12 * f12) - (f13 * f13));
/* 108 */           float f14 = f9 - fSqrt;
/* 110 */           float f15 = f9 + fSqrt;
/* 122 */           float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f13));
/* 126 */           float f16 = (90.0f - degrees) + f5;
/* 128 */           dd2Var.m3008d(f14, 0.0f);
/* 131 */           float f17 = f14 - f8;
/* 133 */           float f18 = f14 + f8;
/* 135 */           float f19 = f8 * 2.0f;
/* 142 */           dd2Var.m3005a(f17, 0.0f, f18, f19, 270.0f, degrees);
/* 151 */           if (z) {
/* 170 */               dd2Var.m3005a(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f16, (f16 * 2.0f) - 180.0f);
                    } else {
/* 174 */               float f20 = this.f14322b0;
/* 176 */               float f21 = f11 * 2.0f;
/* 178 */               float f22 = f20 + f21;
/* 181 */               float f23 = f9 - f7;
/* 200 */               dd2Var.m3005a(f23, -(f11 + f20), f22 + f23, f20 + f11, 180.0f - f16, ((f16 * 2.0f) - 180.0f) / 2.0f);
/* 203 */               float f24 = f9 + f7;
/* 205 */               float f25 = this.f14322b0;
/* 213 */               dd2Var.m3008d(f24 - ((f25 / 2.0f) + f11), f25 + f11);
/* 216 */               float f26 = this.f14322b0;
/* 232 */               dd2Var.m3005a(f24 - (f21 + f26), -(f11 + f26), f24, f26 + f11, 90.0f, f16 - 90.0f);
                    }
/* 250 */           dd2Var.m3005a(f15 - f8, 0.0f, f15 + f8, f19, 270.0f - degrees, degrees);
/* 253 */           dd2Var.m3008d(f, 0.0f);
                }

                /* JADX INFO: renamed from: m */
                public final void m6994m(float f) {
/* 4 */             if (f >= 0.0f) {
/* 6 */                 this.f14324d0 = f;
                    } else {
/* 11 */                C1951n4.m6859j("cradleVerticalOffset must be positive.");
                    }
                }
            }
