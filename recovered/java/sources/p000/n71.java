            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class n71 extends py0 {

                /* JADX INFO: renamed from: k */
                public double[] f14153k;

                /* JADX INFO: renamed from: l */
                public double[][] f14154l;

                /* JADX INFO: renamed from: m */
                public double[] f14155m;

                @Override // p000.py0
                /* JADX INFO: renamed from: f0 */
                public final double mo6911f0(double d) {
/* 1 */             double[][] dArr = this.f14154l;
/* 3 */             double[] dArr2 = this.f14153k;
/* 5 */             int length = dArr2.length;
/* 7 */             double d2 = dArr2[0];
/* 11 */            if (d <= d2) {
/* 23 */                return (mo6914j0(d2) * (d - d2)) + dArr[0][0];
                    }
/* 25 */            int i = length - 1;
/* 27 */            double d3 = dArr2[i];
/* 31 */            if (d >= d3) {
/* 43 */                return (mo6914j0(d3) * (d - d3)) + dArr[i][0];
                    }
/* 45 */            int i2 = 0;
/* 46 */            while (i2 < i) {
/* 48 */                double d4 = dArr2[i2];
/* 52 */                if (d == d4) {
/* 56 */                    return dArr[i2][0];
                        }
/* 59 */                int i3 = i2 + 1;
/* 61 */                double d5 = dArr2[i3];
/* 65 */                if (d < d5) {
/* 69 */                    double d6 = (d - d4) / (d5 - d4);
/* 83 */                    return (dArr[i3][0] * d6) + ((1.0d - d6) * dArr[i2][0]);
                        }
/* 85 */                i2 = i3;
                    }
/* 87 */            return 0.0d;
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: g0 */
                public final void mo6912g0(double d, double[] dArr) {
/* 1 */             double[] dArr2 = this.f14155m;
/* 3 */             double[] dArr3 = this.f14153k;
/* 5 */             int length = dArr3.length;
/* 6 */             double[][] dArr4 = this.f14154l;
/* 8 */             int i = 0;
/* 11 */            int length2 = dArr4[0].length;
/* 12 */            double d2 = dArr3[0];
/* 16 */            if (d <= d2) {
/* 18 */                mo6915k0(d2, dArr2);
/* 22 */                for (int i2 = 0; i2 < length2; i2++) {
/* 36 */                    dArr[i2] = ((d - dArr3[0]) * dArr2[i2]) + dArr4[0][i2];
                        }
/* 131 */               return;
                    }
/* 41 */            int i3 = length - 1;
/* 43 */            double d3 = dArr3[i3];
/* 47 */            if (d >= d3) {
/* 49 */                mo6915k0(d3, dArr2);
/* 52 */                while (i < length2) {
/* 66 */                    dArr[i] = ((d - dArr3[i3]) * dArr2[i]) + dArr4[i3][i];
/* 68 */                    i++;
                        }
/* 131 */               return;
                    }
/* 71 */            int i4 = 0;
/* 74 */            while (i4 < length - 1) {
/* 80 */                if (d == dArr3[i4]) {
/* 83 */                    for (int i5 = 0; i5 < length2; i5++) {
/* 89 */                        dArr[i5] = dArr4[i4][i5];
                            }
                        }
/* 94 */                int i6 = i4 + 1;
/* 96 */                double d4 = dArr3[i6];
/* 100 */               if (d < d4) {
/* 102 */                   double d5 = dArr3[i4];
/* 107 */                   double d6 = (d - d5) / (d4 - d5);
/* 108 */                   while (i < length2) {
/* 124 */                       dArr[i] = (dArr4[i6][i] * d6) + ((1.0d - d6) * dArr4[i4][i]);
/* 126 */                       i++;
                            }
/* 131 */                   return;
                        }
/* 129 */               i4 = i6;
                    }
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: h0 */
                public final void mo6913h0(double d, float[] fArr) {
/* 1 */             double[] dArr = this.f14155m;
/* 3 */             double[] dArr2 = this.f14153k;
/* 5 */             int length = dArr2.length;
/* 6 */             double[][] dArr3 = this.f14154l;
/* 8 */             int i = 0;
/* 11 */            int length2 = dArr3[0].length;
/* 12 */            double d2 = dArr2[0];
/* 16 */            if (d <= d2) {
/* 18 */                mo6915k0(d2, dArr);
/* 22 */                for (int i2 = 0; i2 < length2; i2++) {
/* 37 */                    fArr[i2] = (float) (((d - dArr2[0]) * dArr[i2]) + dArr3[0][i2]);
                        }
/* 135 */               return;
                    }
/* 42 */            int i3 = length - 1;
/* 44 */            double d3 = dArr2[i3];
/* 48 */            if (d >= d3) {
/* 50 */                mo6915k0(d3, dArr);
/* 53 */                while (i < length2) {
/* 68 */                    fArr[i] = (float) (((d - dArr2[i3]) * dArr[i]) + dArr3[i3][i]);
/* 70 */                    i++;
                        }
/* 135 */               return;
                    }
/* 73 */            int i4 = 0;
/* 76 */            while (i4 < length - 1) {
/* 82 */                if (d == dArr2[i4]) {
/* 85 */                    for (int i5 = 0; i5 < length2; i5++) {
/* 92 */                        fArr[i5] = (float) dArr3[i4][i5];
                            }
                        }
/* 97 */                int i6 = i4 + 1;
/* 99 */                double d4 = dArr2[i6];
/* 103 */               if (d < d4) {
/* 105 */                   double d5 = dArr2[i4];
/* 110 */                   double d6 = (d - d5) / (d4 - d5);
/* 111 */                   while (i < length2) {
/* 128 */                       fArr[i] = (float) ((dArr3[i6][i] * d6) + ((1.0d - d6) * dArr3[i4][i]));
/* 130 */                       i++;
                            }
/* 135 */                   return;
                        }
/* 133 */               i4 = i6;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r3
  0x000a: PHI (r3v6 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // p000.py0
                /* JADX INFO: renamed from: j0 */
                public final double mo6914j0(double d) {
/* 1 */             double[] dArr = this.f14153k;
/* 3 */             int length = dArr.length;
/* 5 */             double d2 = dArr[0];
/* 9 */             if (d < d2) {
/* 11 */                d = d2;
                    } else {
/* 15 */                d2 = dArr[length - 1];
/* 19 */                if (d >= d2) {
/* 11 */                    d = d2;
                        }
                    }
/* 22 */            int i = 0;
/* 25 */            while (i < length - 1) {
/* 27 */                int i2 = i + 1;
/* 29 */                double d3 = dArr[i2];
/* 33 */                if (d <= d3) {
/* 37 */                    double d4 = d3 - dArr[i];
/* 38 */                    double[][] dArr2 = this.f14154l;
/* 49 */                    return (dArr2[i2][0] - dArr2[i][0]) / d4;
                        }
/* 51 */                i = i2;
                    }
/* 53 */            return 0.0d;
                }

                /* JADX WARN: Code duplicated, block: B:4:0x000f A[PHI: r4
  0x000f: PHI (r4v6 double) = (r4v0 double), (r4v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // p000.py0
                /* JADX INFO: renamed from: k0 */
                public final void mo6915k0(double d, double[] dArr) {
/* 1 */             double[] dArr2 = this.f14153k;
/* 3 */             int length = dArr2.length;
/* 4 */             double[][] dArr3 = this.f14154l;
/* 9 */             int length2 = dArr3[0].length;
/* 10 */            double d2 = dArr2[0];
/* 14 */            if (d <= d2) {
/* 16 */                d = d2;
                    } else {
/* 20 */                d2 = dArr2[length - 1];
/* 24 */                if (d >= d2) {
/* 16 */                    d = d2;
                        }
                    }
/* 27 */            int i = 0;
/* 30 */            while (i < length - 1) {
/* 32 */                int i2 = i + 1;
/* 34 */                double d3 = dArr2[i2];
/* 38 */                if (d <= d3) {
/* 42 */                    double d4 = d3 - dArr2[i];
/* 43 */                    for (int i3 = 0; i3 < length2; i3++) {
/* 55 */                        dArr[i3] = (dArr3[i2][i3] - dArr3[i][i3]) / d4;
                            }
/* 62 */                    return;
                        }
/* 60 */                i = i2;
                    }
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: n0 */
                public final double[] mo6916n0() {
/* 1 */             return this.f14153k;
                }
            }
