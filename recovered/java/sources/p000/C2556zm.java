            package p000;

            import android.graphics.Color;
            
            /* JADX INFO: renamed from: zm */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2556zm {

                /* JADX INFO: renamed from: a */
                public float f20244a;

                /* JADX INFO: renamed from: b */
                public float f20245b;

                /* JADX INFO: renamed from: c */
                public float f20246c;

                /* JADX INFO: renamed from: d */
                public float f20247d;

                /* JADX INFO: renamed from: e */
                public float f20248e;

                /* JADX INFO: renamed from: f */
                public float f20249f;

                public C2556zm(float f, float f2, float f3, float f4, float f5, float f6) {
/* 4 */             this.f20244a = f;
/* 6 */             this.f20245b = f2;
/* 8 */             this.f20246c = f3;
/* 10 */            this.f20247d = f4;
/* 12 */            this.f20248e = f5;
/* 14 */            this.f20249f = f6;
                }

                /* JADX INFO: renamed from: b */
                public static C2556zm m10402b(int i) {
/* 1 */             p53 p53Var = p53.f14967k;
/* 7 */             float fM5652n = j13.m5652n(Color.red(i));
/* 15 */            float fM5652n2 = j13.m5652n(Color.green(i));
/* 23 */            float fM5652n3 = j13.m5652n(Color.blue(i));
/* 27 */            float[][] fArr = j13.f11995e;
/* 30 */            float[] fArr2 = fArr[0];
/* 44 */            float f = (fArr2[2] * fM5652n3) + (fArr2[1] * fM5652n2) + (fArr2[0] * fM5652n);
/* 45 */            float[] fArr3 = fArr[1];
/* 57 */            float f2 = (fArr3[2] * fM5652n3) + (fArr3[1] * fM5652n2) + (fArr3[0] * fM5652n);
/* 58 */            float[] fArr4 = fArr[2];
/* 70 */            float f3 = (fM5652n3 * fArr4[2]) + (fM5652n2 * fArr4[1]) + (fM5652n * fArr4[0]);
/* 71 */            float[][] fArr5 = j13.f11992b;
/* 73 */            float[] fArr6 = fArr5[0];
/* 85 */            float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
/* 86 */            float[] fArr7 = fArr5[1];
/* 98 */            float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
/* 99 */            float[] fArr8 = fArr5[2];
/* 111 */           float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
/* 112 */           float[] fArr9 = p53Var.f14974g;
/* 114 */           float f7 = p53Var.f14976i;
/* 116 */           float f8 = p53Var.f14971d;
/* 118 */           float f9 = p53Var.f14968a;
/* 122 */           float f10 = fArr9[0] * f4;
/* 125 */           float f11 = fArr9[1] * f5;
/* 128 */           float f12 = fArr9[2] * f6;
/* 129 */           float f13 = p53Var.f14975h;
/* 149 */           float fPow = (float) Math.pow(((double) (Math.abs(f10) * f13)) / 100.0d, 0.42d);
/* 161 */           float fPow2 = (float) Math.pow(((double) (Math.abs(f11) * f13)) / 100.0d, 0.42d);
/* 174 */           float fPow3 = (float) Math.pow(((double) (Math.abs(f12) * f13)) / 100.0d, 0.42d);
/* 187 */           float fSignum = ((Math.signum(f10) * 400.0f) * fPow) / (fPow + 27.13f);
/* 195 */           float fSignum2 = ((Math.signum(f11) * 400.0f) * fPow2) / (fPow2 + 27.13f);
/* 203 */           float fSignum3 = ((Math.signum(f12) * 400.0f) * fPow3) / (fPow3 + 27.13f);
                    double d = fSignum3;
/* 218 */           float f14 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
/* 229 */           float f15 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
/* 234 */           float f16 = fSignum2 * 20.0f;
/* 240 */           float f17 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f16)) / 20.0f;
/* 246 */           float f18 = (((fSignum * 40.0f) + f16) + fSignum3) / 20.0f;
/* 262 */           float fAtan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
/* 268 */           if (fAtan2 < 0.0f) {
/* 270 */               fAtan2 += 360.0f;
                    } else if (fAtan2 >= 360.0f) {
/* 276 */               fAtan2 -= 360.0f;
                    }
/* 278 */           float f19 = (3.1415927f * fAtan2) / 180.0f;
/* 297 */           float fPow4 = ((float) Math.pow((f18 * p53Var.f14969b) / f9, p53Var.f14977j * f8)) * 100.0f;
/* 301 */           Math.sqrt(fPow4 / 100.0f);
/* 306 */           float f20 = f9 + 4.0f;
/* 417 */           float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, p53Var.f14973f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * p53Var.f14972e) * p53Var.f14970c) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d));
/* 425 */           float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
/* 432 */           Math.sqrt((fPow5 * f8) / f20);
/* 446 */           float f21 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
/* 462 */           float fLog = ((float) Math.log((f7 * fSqrt * 0.0228f) + 1.0f)) * 43.85965f;
                    double d2 = f19;
/* 484 */           return new C2556zm(fAtan2, fSqrt, fPow4, f21, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
                }

                /* JADX INFO: renamed from: c */
                public static C2556zm m10403c(float f, float f2, float f3) {
/* 1 */             p53 p53Var = p53.f14967k;
/* 3 */             float f4 = p53Var.f14971d;
/* 8 */             double d = ((double) f) / 100.0d;
/* 9 */             Math.sqrt(d);
/* 16 */            float f5 = p53Var.f14968a + 4.0f;
/* 19 */            float f6 = p53Var.f14976i * f2;
/* 32 */            Math.sqrt(((f2 / ((float) Math.sqrt(d))) * p53Var.f14971d) / f5);
/* 53 */            float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
/* 73 */            float fLog = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
/* 41 */            double d2 = (3.1415927f * f3) / 180.0f;
/* 94 */            return new C2556zm(f3, f2, f, f7, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
                }

                /* JADX INFO: renamed from: a */
                public void m10404a(float f, float f2, int i, int i2, float[] fArr) {
/* 4 */             float f3 = fArr[0];
/* 7 */             float f4 = fArr[1];
/* 15 */            float f5 = (f - 0.5f) * 2.0f;
/* 18 */            float f6 = (f2 - 0.5f) * 2.0f;
/* 21 */            float f7 = f3 + this.f20246c;
/* 24 */            float f8 = f4 + this.f20247d;
/* 28 */            float f9 = (this.f20244a * f5) + f7;
/* 32 */            float f10 = (this.f20245b * f6) + f8;
/* 40 */            float radians = (float) Math.toRadians(this.f20249f);
/* 48 */            float radians2 = (float) Math.toRadians(this.f20248e);
                    double d = radians;
/* 62 */            double d2 = i2 * f6;
/* 72 */            float fSin = (((float) ((Math.sin(d) * ((double) ((-i) * f5))) - (Math.cos(d) * d2))) * radians2) + f9;
/* 89 */            float fCos = (radians2 * ((float) ((Math.cos(d) * ((double) (i * f5))) - (Math.sin(d) * d2)))) + f10;
/* 90 */            fArr[0] = fSin;
/* 92 */            fArr[1] = fCos;
                }

                /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                /* JADX INFO: renamed from: d */
                public int m10405d(p53 p53Var) {
                    float fSqrt;
/* 5 */             float f = this.f20246c;
/* 7 */             float f2 = this.f20245b;
/* 16 */            if (f2 != 0.0d) {
                        double d = f;
/* 21 */                if (d == 0.0d) {
/* 32 */                    fSqrt = 0.0f;
                        } else {
/* 30 */                    fSqrt = f2 / ((float) Math.sqrt(d / 100.0d));
                        }
                    } else {
/* 32 */                fSqrt = 0.0f;
                    }
/* 34 */            float f3 = p53Var.f14973f;
/* 36 */            float f4 = p53Var.f14975h;
/* 73 */            float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f3), 0.73d), 1.1111111111111112d);
/* 82 */            double d2 = (this.f20244a * 3.1415927f) / 180.0f;
/* 100 */           float fCos = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f;
/* 120 */           float fPow2 = p53Var.f14968a * ((float) Math.pow(((double) f) / 100.0d, (1.0d / ((double) p53Var.f14971d)) / ((double) p53Var.f14977j)));
/* 130 */           float f5 = fCos * 3846.1538f * p53Var.f14972e * p53Var.f14970c;
/* 133 */           float f6 = fPow2 / p53Var.f14969b;
/* 138 */           float fSin = (float) Math.sin(d2);
/* 143 */           float fCos2 = (float) Math.cos(d2);
/* 163 */           float f7 = (((0.305f + f6) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f5 * 23.0f)));
/* 164 */           float f8 = fCos2 * f7;
/* 165 */           float f9 = f7 * fSin;
/* 168 */           float f10 = f6 * 460.0f;
/* 181 */           float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
/* 193 */           float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
/* 203 */           float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
/* 236 */           float f14 = 100.0f / f4;
/* 251 */           float fSignum = Math.signum(f11) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11)))), 2.380952380952381d));
/* 285 */           float fSignum2 = Math.signum(f12) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12)))), 2.380952380952381d));
/* 317 */           float fSignum3 = Math.signum(f13) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13)))), 2.380952380952381d));
/* 318 */           float[] fArr = p53Var.f14974g;
/* 323 */           float f15 = fSignum / fArr[0];
/* 327 */           float f16 = fSignum2 / fArr[1];
/* 331 */           float f17 = fSignum3 / fArr[2];
/* 332 */           float[][] fArr2 = j13.f11993c;
/* 334 */           float[] fArr3 = fArr2[0];
/* 346 */           float f18 = (fArr3[2] * f17) + (fArr3[1] * f16) + (fArr3[0] * f15);
/* 347 */           float[] fArr4 = fArr2[1];
/* 359 */           float f19 = (fArr4[2] * f17) + (fArr4[1] * f16) + (fArr4[0] * f15);
/* 360 */           float[] fArr5 = fArr2[2];
/* 376 */           return AbstractC0196bx.m1449a(f18, f19, (f17 * fArr5[2]) + (f16 * fArr5[1]) + (f15 * fArr5[0]));
                }
            }
