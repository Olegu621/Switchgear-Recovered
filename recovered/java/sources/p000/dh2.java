            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dh2 implements bh2 {

                /* JADX INFO: renamed from: a */
                public float f7197a;

                /* JADX INFO: renamed from: b */
                public float f7198b;

                /* JADX INFO: renamed from: c */
                public float f7199c;

                /* JADX INFO: renamed from: d */
                public float f7200d;

                /* JADX INFO: renamed from: e */
                public float f7201e;

                /* JADX INFO: renamed from: f */
                public float f7202f;

                /* JADX INFO: renamed from: g */
                public float f7203g;

                /* JADX INFO: renamed from: h */
                public float f7204h;

                /* JADX INFO: renamed from: i */
                public float f7205i;

                /* JADX INFO: renamed from: j */
                public int f7206j;

                /* JADX INFO: renamed from: k */
                public boolean f7207k;

                /* JADX INFO: renamed from: l */
                public float f7208l;

                /* JADX INFO: renamed from: m */
                public float f7209m;

                @Override // p000.bh2
                /* JADX INFO: renamed from: a */
                public final boolean mo1357a() {
                    return mo1358b() < 1.0E-5f && Math.abs(this.f7205i - this.f7209m) < 1.0E-5f;
                }

                @Override // p000.bh2
                /* JADX INFO: renamed from: b */
                public final float mo1358b() {
/* 1 */             boolean z = this.f7207k;
/* 5 */             float fM3084c = m3084c(this.f7209m);
                    return z ? -fM3084c : fM3084c;
                }

                /* JADX INFO: renamed from: c */
                public final float m3084c(float f) {
/* 1 */             float f2 = this.f7200d;
/* 5 */             if (f <= f2) {
/* 7 */                 float f3 = this.f7197a;
/* 14 */                return (((this.f7198b - f3) * f) / f2) + f3;
                    }
/* 16 */            int i = this.f7206j;
/* 19 */            if (i == 1) {
/* 21 */                return 0.0f;
                    }
/* 23 */            float f4 = f - f2;
/* 24 */            float f5 = this.f7201e;
/* 28 */            if (f4 < f5) {
/* 30 */                float f6 = this.f7198b;
/* 37 */                return (((this.f7199c - f6) * f4) / f5) + f6;
                    }
/* 40 */            if (i == 2) {
/* 42 */                return this.f7204h;
                    }
/* 45 */            float f7 = f4 - f5;
/* 46 */            float f8 = this.f7202f;
/* 50 */            if (f7 >= f8) {
/* 58 */                return this.f7205i;
                    }
/* 52 */            float f9 = this.f7199c;
/* 56 */            return f9 - ((f7 * f9) / f8);
                }

                /* JADX INFO: renamed from: d */
                public final void m3085d(float f, float f2, float f3, float f4, float f5) {
/* 4 */             if (f == 0.0f) {
/* 6 */                 f = 1.0E-4f;
                    }
/* 9 */             this.f7197a = f;
/* 11 */            float f6 = f / f3;
/* 17 */            float f7 = (f6 * f) / 2.0f;
/* 22 */            if (f < 0.0f) {
/* 36 */                float fSqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
/* 39 */                if (fSqrt < f4) {
/* 41 */                    this.f7206j = 2;
/* 43 */                    this.f7197a = f;
/* 45 */                    this.f7198b = fSqrt;
/* 47 */                    this.f7199c = 0.0f;
/* 51 */                    float f8 = (fSqrt - f) / f3;
/* 52 */                    this.f7200d = f8;
/* 56 */                    this.f7201e = fSqrt / f3;
/* 61 */                    this.f7203g = ((f + fSqrt) * f8) / 2.0f;
/* 63 */                    this.f7204h = f2;
/* 65 */                    this.f7205i = f2;
/* 67 */                    return;
                        }
/* 68 */                this.f7206j = 3;
/* 70 */                this.f7197a = f;
/* 72 */                this.f7198b = f4;
/* 74 */                this.f7199c = f4;
/* 78 */                float f9 = (f4 - f) / f3;
/* 79 */                this.f7200d = f9;
/* 81 */                float f10 = f4 / f3;
/* 83 */                this.f7202f = f10;
/* 87 */                float f11 = ((f + f4) * f9) / 2.0f;
/* 89 */                float f12 = (f10 * f4) / 2.0f;
/* 94 */                this.f7201e = ((f2 - f11) - f12) / f4;
/* 96 */                this.f7203g = f11;
/* 100 */               this.f7204h = f2 - f12;
/* 102 */               this.f7205i = f2;
/* 104 */               return;
                    }
/* 107 */           if (f7 >= f2) {
/* 112 */               this.f7206j = 1;
/* 114 */               this.f7197a = f;
/* 116 */               this.f7198b = 0.0f;
/* 118 */               this.f7203g = f2;
/* 120 */               this.f7200d = (2.0f * f2) / f;
/* 122 */               return;
                    }
/* 123 */           float f13 = f2 - f7;
/* 125 */           float f14 = f13 / f;
/* 131 */           if (f14 + f6 < f5) {
/* 133 */               this.f7206j = 2;
/* 135 */               this.f7197a = f;
/* 137 */               this.f7198b = f;
/* 139 */               this.f7199c = 0.0f;
/* 141 */               this.f7203g = f13;
/* 143 */               this.f7204h = f2;
/* 145 */               this.f7200d = f14;
/* 147 */               this.f7201e = f6;
/* 149 */               return;
                    }
/* 161 */           float fSqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f3 * f2));
/* 164 */           float f15 = (fSqrt2 - f) / f3;
/* 165 */           this.f7200d = f15;
/* 167 */           float f16 = fSqrt2 / f3;
/* 169 */           this.f7201e = f16;
/* 173 */           if (fSqrt2 < f4) {
/* 175 */               this.f7206j = 2;
/* 177 */               this.f7197a = f;
/* 179 */               this.f7198b = fSqrt2;
/* 181 */               this.f7199c = 0.0f;
/* 183 */               this.f7200d = f15;
/* 185 */               this.f7201e = f16;
/* 190 */               this.f7203g = ((f + fSqrt2) * f15) / 2.0f;
/* 192 */               this.f7204h = f2;
/* 194 */               return;
                    }
/* 195 */           this.f7206j = 3;
/* 197 */           this.f7197a = f;
/* 199 */           this.f7198b = f4;
/* 201 */           this.f7199c = f4;
/* 205 */           float f17 = (f4 - f) / f3;
/* 206 */           this.f7200d = f17;
/* 208 */           float f18 = f4 / f3;
/* 210 */           this.f7202f = f18;
/* 214 */           float f19 = ((f + f4) * f17) / 2.0f;
/* 216 */           float f20 = (f18 * f4) / 2.0f;
/* 221 */           this.f7201e = ((f2 - f19) - f20) / f4;
/* 223 */           this.f7203g = f19;
/* 227 */           this.f7204h = f2 - f20;
/* 229 */           this.f7205i = f2;
                }

                @Override // p000.bh2
                public final float getInterpolation(float f) {
                    float f2;
/* 1 */             float f3 = this.f7200d;
/* 7 */             if (f <= f3) {
/* 9 */                 float f4 = this.f7197a;
/* 20 */                f2 = ((((this.f7198b - f4) * f) * f) / (f3 * 2.0f)) + (f4 * f);
                    } else {
/* 22 */                int i = this.f7206j;
/* 25 */                if (i == 1) {
/* 27 */                    f2 = this.f7203g;
                        } else {
/* 30 */                    float f5 = f - f3;
/* 32 */                    float f6 = this.f7201e;
/* 36 */                    if (f5 < f6) {
/* 38 */                        float f7 = this.f7203g;
/* 40 */                        float f8 = this.f7198b;
/* 52 */                        f2 = ((((this.f7199c - f8) * f5) * f5) / (f6 * 2.0f)) + (f8 * f5) + f7;
                            } else if (i == 2) {
/* 58 */                        f2 = this.f7204h;
                            } else {
/* 61 */                        float f9 = f5 - f6;
/* 62 */                        float f10 = this.f7202f;
/* 66 */                        if (f9 <= f10) {
/* 68 */                            float f11 = this.f7204h;
/* 72 */                            float f12 = this.f7199c * f9;
/* 77 */                            f2 = (f11 + f12) - ((f12 * f9) / (f10 * 2.0f));
                                } else {
/* 80 */                            f2 = this.f7205i;
                                }
                            }
                        }
                    }
/* 82 */            this.f7209m = f;
/* 84 */            boolean z = this.f7207k;
/* 86 */            float f13 = this.f7208l;
                    return z ? f13 - f2 : f13 + f2;
                }
            }
