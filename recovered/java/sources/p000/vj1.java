            package p000;

            import java.lang.reflect.Array;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vj1 extends py0 {

                /* JADX INFO: renamed from: k */
                public final double[] f18221k;

                /* JADX INFO: renamed from: l */
                public final double[][] f18222l;

                /* JADX INFO: renamed from: m */
                public final double[][] f18223m;

                /* JADX INFO: renamed from: n */
                public final double[] f18224n;

                public vj1(double[] dArr, double[][] dArr2) {
/* 9 */             super(8);
/* 12 */            int length = dArr.length;
/* 16 */            int length2 = dArr2[0].length;
/* 19 */            this.f18224n = new double[length2];
/* 21 */            int i = length - 1;
/* 31 */            Class cls = Double.TYPE;
/* 37 */            double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i, length2);
/* 49 */            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
/* 52 */            for (int i2 = 0; i2 < length2; i2++) {
/* 54 */                int i3 = 0;
/* 55 */                while (i3 < i) {
/* 57 */                    int i4 = i3 + 1;
/* 63 */                    double d = dArr[i4] - dArr[i3];
/* 64 */                    double[] dArr5 = dArr3[i3];
/* 76 */                    double d2 = (dArr2[i4][i2] - dArr2[i3][i2]) / d;
/* 78 */                    dArr5[i2] = d2;
/* 80 */                    if (i3 == 0) {
/* 84 */                        dArr4[i3][i2] = d2;
                            } else {
/* 101 */                       dArr4[i3][i2] = (dArr3[i3 - 1][i2] + d2) * 0.5d;
                            }
/* 103 */                   i3 = i4;
                        }
/* 113 */               dArr4[i][i2] = dArr3[length - 2][i2];
                    }
/* 119 */           for (int i5 = 0; i5 < i; i5++) {
/* 122 */               for (int i6 = 0; i6 < length2; i6++) {
/* 126 */                   double d3 = dArr3[i5][i6];
/* 132 */                   if (d3 == 0.0d) {
/* 136 */                       dArr4[i5][i6] = 0.0d;
/* 142 */                       dArr4[i5 + 1][i6] = 0.0d;
                            } else {
/* 149 */                       double d4 = dArr4[i5][i6] / d3;
/* 150 */                       int i7 = i5 + 1;
/* 156 */                       double d5 = dArr4[i7][i6] / d3;
/* 158 */                       double dHypot = Math.hypot(d4, d5);
/* 166 */                       if (dHypot > 9.0d) {
/* 170 */                           double d6 = 3.0d / dHypot;
/* 172 */                           double[] dArr6 = dArr4[i5];
/* 176 */                           double[] dArr7 = dArr3[i5];
/* 182 */                           dArr6[i6] = d4 * d6 * dArr7[i6];
/* 192 */                           dArr4[i7][i6] = d6 * d5 * dArr7[i6];
                                }
                            }
                        }
                    }
/* 200 */           this.f18221k = dArr;
/* 202 */           this.f18222l = dArr2;
/* 204 */           this.f18223m = dArr4;
                }

                /* JADX INFO: renamed from: y0 */
                public static double m9296y0(double d, double d2, double d3, double d4, double d5, double d6) {
/* 1 */             double d7 = d2 * d2;
/* 10 */            double d8 = d2 * 6.0d;
/* 16 */            double d9 = 6.0d * d7 * d3;
/* 19 */            double d10 = (d9 + ((d8 * d4) + (((-6.0d) * d7) * d4))) - (d8 * d3);
/* 22 */            double d11 = 3.0d * d;
/* 47 */            return (d * d5) + (((((d11 * d5) * d7) + (((d11 * d6) * d7) + d10)) - (((2.0d * d) * d6) * d2)) - (((4.0d * d) * d5) * d2));
                }

                /* JADX INFO: renamed from: z0 */
                public static double m9297z0(double d, double d2, double d3, double d4, double d5, double d6) {
/* 1 */             double d7 = d2 * d2;
/* 3 */             double d8 = d7 * d2;
/* 12 */            double d9 = 3.0d * d7;
/* 20 */            double d10 = d8 * 2.0d * d3;
/* 26 */            double d11 = ((d10 + ((d9 * d4) + (((-2.0d) * d8) * d4))) - (d9 * d3)) + d3;
/* 28 */            double d12 = d * d6;
/* 32 */            double d13 = (d12 * d8) + d11;
/* 33 */            double d14 = d * d5;
/* 45 */            return (d14 * d2) + ((((d8 * d14) + d13) - (d12 * d7)) - (((d * 2.0d) * d5) * d7));
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: f0 */
                public final double mo6911f0(double d) {
/* 3 */             double[] dArr = this.f18221k;
/* 5 */             int length = dArr.length;
/* 7 */             double d2 = dArr[0];
/* 11 */            double[][] dArr2 = this.f18222l;
/* 13 */            if (d <= d2) {
/* 26 */                return (mo6914j0(d2) * (d - d2)) + dArr2[0][0];
                    }
/* 28 */            int i = length - 1;
/* 30 */            double d3 = dArr[i];
/* 34 */            if (d >= d3) {
/* 47 */                return (mo6914j0(d3) * (d - d3)) + dArr2[i][0];
                    }
/* 49 */            int i2 = 0;
/* 50 */            while (i2 < i) {
/* 52 */                double d4 = dArr[i2];
/* 56 */                if (d == d4) {
/* 60 */                    return dArr2[i2][0];
                        }
/* 63 */                int i3 = i2 + 1;
/* 65 */                double d5 = dArr[i3];
/* 69 */                if (d < d5) {
/* 71 */                    double d6 = d5 - d4;
/* 75 */                    double d7 = (d - d4) / d6;
/* 79 */                    double d8 = dArr2[i2][0];
/* 83 */                    double d9 = dArr2[i3][0];
/* 85 */                    double[][] dArr3 = this.f18223m;
/* 95 */                    return m9297z0(d6, d7, d8, d9, dArr3[i2][0], dArr3[i3][0]);
                        }
/* 100 */               i2 = i3;
                    }
/* 102 */           return 0.0d;
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: g0 */
                public final void mo6912g0(double d, double[] dArr) {
/* 3 */             double[] dArr2 = this.f18221k;
/* 5 */             int length = dArr2.length;
/* 6 */             double[][] dArr3 = this.f18222l;
/* 8 */             int i = 0;
/* 11 */            int length2 = dArr3[0].length;
/* 12 */            double d2 = dArr2[0];
/* 16 */            double[] dArr4 = this.f18224n;
/* 18 */            if (d <= d2) {
/* 20 */                mo6915k0(d2, dArr4);
/* 24 */                for (int i2 = 0; i2 < length2; i2++) {
/* 38 */                    dArr[i2] = ((d - dArr2[0]) * dArr4[i2]) + dArr3[0][i2];
                        }
/* 141 */               return;
                    }
/* 43 */            int i3 = length - 1;
/* 45 */            double d3 = dArr2[i3];
/* 49 */            if (d >= d3) {
/* 51 */                mo6915k0(d3, dArr4);
/* 54 */                while (i < length2) {
/* 68 */                    dArr[i] = ((d - dArr2[i3]) * dArr4[i]) + dArr3[i3][i];
/* 70 */                    i++;
                        }
/* 141 */               return;
                    }
/* 73 */            int i4 = 0;
/* 74 */            while (i4 < i3) {
/* 80 */                if (d == dArr2[i4]) {
/* 83 */                    for (int i5 = 0; i5 < length2; i5++) {
/* 89 */                        dArr[i5] = dArr3[i4][i5];
                            }
                        }
/* 94 */                int i6 = i4 + 1;
/* 96 */                double d4 = dArr2[i6];
/* 100 */               if (d < d4) {
/* 102 */                   double d5 = dArr2[i4];
/* 104 */                   double d6 = d4 - d5;
/* 108 */                   double d7 = (d - d5) / d6;
/* 110 */                   while (i < length2) {
/* 114 */                       double d8 = dArr3[i4][i];
/* 118 */                       double d9 = dArr3[i6][i];
/* 120 */                       double[][] dArr5 = this.f18223m;
/* 134 */                       dArr[i] = m9297z0(d6, d7, d8, d9, dArr5[i4][i], dArr5[i6][i]);
/* 136 */                       i++;
                            }
/* 141 */                   return;
                        }
/* 139 */               i4 = i6;
                    }
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: h0 */
                public final void mo6913h0(double d, float[] fArr) {
/* 3 */             double[] dArr = this.f18221k;
/* 5 */             int length = dArr.length;
/* 6 */             double[][] dArr2 = this.f18222l;
/* 8 */             int i = 0;
/* 11 */            int length2 = dArr2[0].length;
/* 12 */            double d2 = dArr[0];
/* 16 */            double[] dArr3 = this.f18224n;
/* 18 */            if (d <= d2) {
/* 20 */                mo6915k0(d2, dArr3);
/* 24 */                for (int i2 = 0; i2 < length2; i2++) {
/* 39 */                    fArr[i2] = (float) (((d - dArr[0]) * dArr3[i2]) + dArr2[0][i2]);
                        }
/* 145 */               return;
                    }
/* 44 */            int i3 = length - 1;
/* 46 */            double d3 = dArr[i3];
/* 50 */            if (d >= d3) {
/* 52 */                mo6915k0(d3, dArr3);
/* 55 */                while (i < length2) {
/* 70 */                    fArr[i] = (float) (((d - dArr[i3]) * dArr3[i]) + dArr2[i3][i]);
/* 72 */                    i++;
                        }
/* 145 */               return;
                    }
/* 75 */            int i4 = 0;
/* 76 */            while (i4 < i3) {
/* 82 */                if (d == dArr[i4]) {
/* 85 */                    for (int i5 = 0; i5 < length2; i5++) {
/* 92 */                        fArr[i5] = (float) dArr2[i4][i5];
                            }
                        }
/* 97 */                int i6 = i4 + 1;
/* 99 */                double d4 = dArr[i6];
/* 103 */               if (d < d4) {
/* 105 */                   double d5 = dArr[i4];
/* 107 */                   double d6 = d4 - d5;
/* 111 */                   double d7 = (d - d5) / d6;
/* 113 */                   while (i < length2) {
/* 117 */                       double d8 = dArr2[i4][i];
/* 121 */                       double d9 = dArr2[i6][i];
/* 123 */                       double[][] dArr4 = this.f18223m;
/* 138 */                       fArr[i] = (float) m9297z0(d6, d7, d8, d9, dArr4[i4][i], dArr4[i6][i]);
/* 140 */                       i++;
                            }
/* 145 */                   return;
                        }
/* 143 */               i4 = i6;
                    }
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: j0 */
                public final double mo6914j0(double d) {
/* 3 */             double[] dArr = this.f18221k;
/* 5 */             int length = dArr.length;
/* 7 */             double d2 = dArr[0];
/* 11 */            if (d >= d2) {
/* 16 */                d2 = dArr[length - 1];
/* 20 */                if (d < d2) {
/* 23 */                    d2 = d;
                        }
                    }
/* 25 */            int i = 0;
/* 28 */            while (i < length - 1) {
/* 30 */                int i2 = i + 1;
/* 32 */                double d3 = dArr[i2];
/* 36 */                if (d2 <= d3) {
/* 38 */                    double d4 = dArr[i];
/* 40 */                    double d5 = d3 - d4;
/* 45 */                    double[][] dArr2 = this.f18222l;
/* 49 */                    double d6 = dArr2[i][0];
/* 53 */                    double d7 = dArr2[i2][0];
/* 55 */                    double[][] dArr3 = this.f18223m;
/* 69 */                    return m9296y0(d5, (d2 - d4) / d5, d6, d7, dArr3[i][0], dArr3[i2][0]) / d5;
                        }
/* 71 */                i = i2;
                    }
/* 73 */            return 0.0d;
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: k0 */
                public final void mo6915k0(double d, double[] dArr) {
/* 3 */             double[] dArr2 = this.f18221k;
/* 5 */             int length = dArr2.length;
/* 6 */             double[][] dArr3 = this.f18222l;
/* 11 */            int length2 = dArr3[0].length;
/* 12 */            double d2 = dArr2[0];
/* 16 */            if (d > d2) {
/* 21 */                d2 = dArr2[length - 1];
/* 25 */                if (d < d2) {
/* 28 */                    d2 = d;
                        }
                    }
/* 30 */            int i = 0;
/* 33 */            while (i < length - 1) {
/* 35 */                int i2 = i + 1;
/* 37 */                double d3 = dArr2[i2];
/* 41 */                if (d2 <= d3) {
/* 43 */                    double d4 = dArr2[i];
/* 45 */                    double d5 = d3 - d4;
/* 48 */                    double d6 = (d2 - d4) / d5;
/* 50 */                    for (int i3 = 0; i3 < length2; i3++) {
/* 54 */                        double d7 = dArr3[i][i3];
/* 58 */                        double d8 = dArr3[i2][i3];
/* 60 */                        double[][] dArr4 = this.f18223m;
/* 75 */                        dArr[i3] = m9296y0(d5, d6, d7, d8, dArr4[i][i3], dArr4[i2][i3]) / d5;
                            }
/* 82 */                    return;
                        }
/* 80 */                i = i2;
                    }
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: n0 */
                public final double[] mo6916n0() {
/* 1 */             return this.f18221k;
                }
            }
