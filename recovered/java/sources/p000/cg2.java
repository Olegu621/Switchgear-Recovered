            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cg2 implements bh2 {

                /* JADX INFO: renamed from: a */
                public double f2894a;

                /* JADX INFO: renamed from: b */
                public double f2895b;

                /* JADX INFO: renamed from: c */
                public double f2896c;

                /* JADX INFO: renamed from: d */
                public float f2897d;

                /* JADX INFO: renamed from: e */
                public float f2898e;

                /* JADX INFO: renamed from: f */
                public float f2899f;

                /* JADX INFO: renamed from: g */
                public float f2900g;

                /* JADX INFO: renamed from: h */
                public float f2901h;

                /* JADX INFO: renamed from: i */
                public int f2902i;

                @Override // p000.bh2
                /* JADX INFO: renamed from: a */
                public final boolean mo1357a() {
/* 6 */             double d = ((double) this.f2898e) - this.f2896c;
/* 7 */             double d2 = this.f2895b;
/* 9 */             double d3 = this.f2899f;
                    return Math.sqrt((((d2 * d) * d) + ((d3 * d3) * ((double) this.f2900g))) / d2) <= ((double) this.f2901h);
                }

                @Override // p000.bh2
                /* JADX INFO: renamed from: b */
                public final float mo1358b() {
/* 1 */             return 0.0f;
                }

                @Override // p000.bh2
                public final float getInterpolation(float f) {
/* 7 */             double d = f - this.f2897d;
/* 10 */            double d2 = this.f2895b;
/* 12 */            double d3 = this.f2894a;
/* 33 */            int iSqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) this.f2900g)) * d) * 4.0d)) + 1.0d);
/* 35 */            double d4 = d / ((double) iSqrt);
/* 36 */            int i = 0;
/* 37 */            while (i < iSqrt) {
/* 39 */                double d5 = this.f2898e;
/* 42 */                double d6 = this.f2896c;
/* 46 */                double d7 = d4;
/* 50 */                double d8 = this.f2899f;
/* 59 */                double d9 = this.f2900g;
/* 70 */                double d10 = ((((((-d2) * (d5 - d6)) - (d3 * d8)) / d9) * d7) / 2.0d) + d8;
/* 87 */                double d11 = ((((-((((d7 * d10) / 2.0d) + d5) - d6)) * d2) - (d10 * d3)) / d9) * d7;
/* 91 */                double d12 = (d11 / 2.0d) + d8;
/* 93 */                float f2 = (float) (d8 + d11);
/* 94 */                this.f2899f = f2;
/* 99 */                float f3 = (float) ((d12 * d7) + d5);
/* 100 */               this.f2898e = f3;
/* 102 */               int i2 = this.f2902i;
/* 104 */               if (i2 > 0) {
/* 109 */                   if (f3 < 0.0f && (i2 & 1) == 1) {
/* 117 */                       this.f2898e = -f3;
/* 120 */                       this.f2899f = -f2;
                            }
/* 122 */                   float f4 = this.f2898e;
/* 128 */                   if (f4 > 1.0f && (i2 & 2) == 2) {
/* 138 */                       this.f2898e = 2.0f - f4;
/* 143 */                       this.f2899f = -this.f2899f;
                            }
                        }
/* 145 */               i++;
/* 147 */               d4 = d7;
                    }
/* 150 */           this.f2897d = f;
/* 152 */           return this.f2898e;
                }
            }
