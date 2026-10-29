            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class p53 {

                /* JADX INFO: renamed from: k */
                public static final p53 f14967k;

                /* JADX INFO: renamed from: a */
                public final float f14968a;

                /* JADX INFO: renamed from: b */
                public final float f14969b;

                /* JADX INFO: renamed from: c */
                public final float f14970c;

                /* JADX INFO: renamed from: d */
                public final float f14971d;

                /* JADX INFO: renamed from: e */
                public final float f14972e;

                /* JADX INFO: renamed from: f */
                public final float f14973f;

                /* JADX INFO: renamed from: g */
                public final float[] f14974g;

                /* JADX INFO: renamed from: h */
                public final float f14975h;

                /* JADX INFO: renamed from: i */
                public final float f14976i;

                /* JADX INFO: renamed from: j */
                public final float f14977j;

                static {
/* 1 */             float[] fArr = j13.f11994d;
/* 17 */            float fM5639D = (float) ((((double) j13.m5639D()) * 63.66197723675813d) / 100.0d);
/* 18 */            float[][] fArr2 = j13.f11992b;
/* 21 */            float f = fArr[0];
/* 23 */            float[] fArr3 = fArr2[0];
/* 27 */            float f2 = fArr3[0] * f;
/* 29 */            float f3 = fArr[1];
/* 34 */            float f4 = (fArr3[1] * f3) + f2;
/* 36 */            float f5 = fArr[2];
/* 41 */            float f6 = (fArr3[2] * f5) + f4;
/* 42 */            float[] fArr4 = fArr2[1];
/* 54 */            float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
/* 55 */            float[] fArr5 = fArr2[2];
/* 67 */            float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
/* 91 */            float fExp = (1.0f - (((float) Math.exp(((-fM5639D) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
                    double d = fExp;
/* 98 */            if (d > 1.0d) {
/* 100 */               fExp = 1.0f;
                    } else if (d < 0.0d) {
/* 108 */               fExp = 0.0f;
                    }
/* 126 */           float[] fArr6 = {(((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp};
/* 138 */           float f9 = 1.0f / ((5.0f * fM5639D) + 1.0f);
/* 143 */           float f10 = f9 * f9 * f9 * f9;
/* 144 */           float f11 = 1.0f - f10;
/* 164 */           float fCbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(((double) fM5639D) * 5.0d))) + (f10 * fM5639D);
/* 171 */           float fM5639D2 = j13.m5639D() / fArr[1];
                    double d2 = fM5639D2;
/* 182 */           float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
/* 197 */           float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
/* 240 */           float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f8)) / 100.0d, 0.42d)};
/* 248 */           float f12 = fArr7[0];
/* 258 */           float f13 = (f12 * 400.0f) / (f12 + 27.13f);
/* 259 */           float f14 = fArr7[1];
/* 264 */           float f15 = (f14 * 400.0f) / (f14 + 27.13f);
/* 265 */           float f16 = fArr7[2];
/* 270 */           float[] fArr8 = {f13, f15, (400.0f * f16) / (f16 + 27.13f)};
/* 320 */           f14967k = new p53(fM5639D2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, 0.69f, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
                }

                public p53(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
/* 4 */             this.f14973f = f;
/* 6 */             this.f14968a = f2;
/* 8 */             this.f14969b = f3;
/* 10 */            this.f14970c = f4;
/* 12 */            this.f14971d = f5;
/* 14 */            this.f14972e = f6;
/* 16 */            this.f14974g = fArr;
/* 18 */            this.f14975h = f7;
/* 20 */            this.f14976i = f8;
/* 22 */            this.f14977j = f9;
                }
            }
