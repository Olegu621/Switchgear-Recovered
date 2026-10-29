            package p000;

            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
            import java.util.Arrays;
            
            /* JADX INFO: renamed from: wc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2326wc extends py0 {

                /* JADX INFO: renamed from: k */
                public final double[] f18574k;

                /* JADX INFO: renamed from: l */
                public final C2288vc[] f18575l;

                /* JADX WARN: Code duplicated, block: B:16:0x002f  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0, types: [py0, wc] */
                public C2326wc(int[] iArr, double[] dArr, double[][] dArr2) {
                    int i;
                    double[] dArr3;
/* 3 */             double[] dArr4 = dArr;
/* 7 */             ?? py0Var = new py0(8);
/* 10 */            py0Var.f18574k = dArr4;
/* 13 */            int i2 = 1;
/* 17 */            py0Var.f18575l = new C2288vc[dArr4.length - 1];
/* 19 */            boolean z = false;
/* 20 */            int i3 = 0;
/* 21 */            int i4 = 1;
/* 22 */            int i5 = 1;
                    C2326wc c2326wc = py0Var;
                    while (true) {
/* 23 */                C2288vc[] c2288vcArr = c2326wc.f18575l;
/* 26 */                if (i3 >= c2288vcArr.length) {
/* 372 */                   return;
                        }
/* 28 */                int i6 = iArr[i3];
/* 31 */                if (i6 == 0) {
/* 50 */                    i5 = 3;
                        } else if (i6 == i2) {
/* 48 */                    i4 = i2;
/* 44 */                    i5 = i4;
                        } else {
/* 36 */                    if (i6 != 2) {
/* 38 */                        if (i6 == 3) {
/* 41 */                            if (i4 != i2) {
/* 48 */                                i4 = i2;
                                    }
/* 44 */                            i5 = i4;
                                }
                            }
/* 46 */                    i4 = 2;
/* 44 */                    i5 = i4;
                        }
/* 53 */                double d = dArr4[i3];
/* 55 */                int i7 = i3 + 1;
/* 57 */                double d2 = dArr4[i7];
/* 59 */                double[] dArr5 = dArr2[i3];
/* 63 */                double d3 = dArr5[z ? 1 : 0];
/* 65 */                boolean z2 = i2;
/* 66 */                int i8 = i3;
/* 68 */                double d4 = dArr5[z2 ? 1 : 0];
/* 70 */                double[] dArr6 = dArr2[i7];
/* 76 */                double d5 = dArr6[z ? 1 : 0];
/* 78 */                double d6 = dArr6[z2 ? 1 : 0];
/* 80 */                C2288vc c2288vc = new C2288vc();
/* 83 */                c2288vc.f17977r = z;
/* 89 */                z = i5 == z2 ? z2 ? 1 : 0 : z;
/* 90 */                c2288vc.f17976q = z;
/* 96 */                c2288vc.f17962c = d;
/* 98 */                c2288vc.f17963d = d2;
/* 100 */               double d7 = d2 - d;
/* 103 */               double d8 = 1.0d / d7;
/* 104 */               c2288vc.f17968i = d8;
/* 109 */               if (3 == i5) {
/* 111 */                   c2288vc.f17977r = z2;
                        }
/* 113 */               double d9 = d5 - d3;
/* 115 */               int i9 = i4;
/* 117 */               int i10 = i5;
/* 119 */               double d10 = d6 - d4;
/* 123 */               if (c2288vc.f17977r || Math.abs(d9) < 0.001d || Math.abs(d10) < 0.001d) {
/* 146 */                   i = 1;
/* 328 */                   c2288vc.f17977r = true;
/* 330 */                   c2288vc.f17964e = d3;
/* 332 */                   c2288vc.f17965f = d5;
/* 334 */                   c2288vc.f17966g = d4;
/* 338 */                   c2288vc.f17967h = d6;
/* 340 */                   double dHypot = Math.hypot(d10, d9);
/* 344 */                   c2288vc.f17961b = dHypot;
/* 348 */                   c2288vc.f17973n = dHypot * d8;
/* 351 */                   c2288vc.f17971l = d9 / d7;
/* 354 */                   c2288vc.f17972m = d10 / d7;
                        } else {
/* 151 */                   double[] dArr7 = new double[ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE];
/* 153 */                   c2288vc.f17960a = dArr7;
/* 165 */                   c2288vc.f17969j = ((double) (z ? -1 : 1)) * d9;
/* 174 */                   c2288vc.f17970k = d10 * ((double) (z ? 1 : -1));
/* 179 */                   c2288vc.f17971l = z ? d5 : d3;
/* 187 */                   c2288vc.f17972m = z ? d4 : d6;
/* 189 */                   double d11 = d4 - d6;
/* 191 */                   int i11 = 0;
/* 192 */                   double dHypot2 = 0.0d;
/* 194 */                   double d12 = 0.0d;
/* 196 */                   double d13 = 0.0d;
                            while (true) {
/* 202 */                       dArr3 = C2288vc.f17959s;
/* 209 */                       if (i11 >= 91) {
                                    break;
                                }
/* 211 */                       double d14 = d11;
/* 218 */                       double radians = Math.toRadians((((double) i11) * 90.0d) / 90.0d);
/* 230 */                       double dSin = Math.sin(radians) * d9;
/* 232 */                       double dCos = Math.cos(radians) * d14;
/* 234 */                       if (i11 > 0) {
/* 244 */                           dHypot2 += Math.hypot(dSin - d12, dCos - d13);
/* 245 */                           dArr3[i11] = dHypot2;
                                }
/* 247 */                       i11++;
/* 249 */                       d13 = dCos;
/* 250 */                       d12 = dSin;
/* 252 */                       d11 = d14;
                            }
/* 255 */                   c2288vc.f17961b = dHypot2;
/* 258 */                   for (int i12 = 0; i12 < 91; i12++) {
/* 263 */                       dArr3[i12] = dArr3[i12] / dHypot2;
                            }
/* 271 */                   for (int i13 = 0; i13 < 101; i13++) {
/* 276 */                       double d15 = ((double) i13) / 100.0d;
/* 277 */                       int iBinarySearch = Arrays.binarySearch(dArr3, d15);
/* 281 */                       if (iBinarySearch >= 0) {
/* 286 */                           dArr7[i13] = ((double) iBinarySearch) / 90.0d;
                                } else if (iBinarySearch == -1) {
/* 293 */                           dArr7[i13] = 0.0d;
                                } else {
/* 296 */                           int i14 = -iBinarySearch;
/* 297 */                           int i15 = i14 - 2;
/* 302 */                           double d16 = dArr3[i15];
/* 314 */                           dArr7[i13] = (((d15 - d16) / (dArr3[i14 - 1] - d16)) + ((double) i15)) / 90.0d;
                                }
                            }
/* 324 */                   c2288vc.f17973n = c2288vc.f17961b * c2288vc.f17968i;
/* 326 */                   i = 1;
                        }
/* 356 */               c2288vcArr[i8] = c2288vc;
/* 358 */               c2326wc = this;
/* 360 */               dArr4 = dArr;
/* 362 */               i2 = i;
/* 363 */               i4 = i9;
/* 365 */               i3 = i7;
/* 367 */               i5 = i10;
/* 369 */               z = false;
                    }
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: f0 */
                public final double mo6911f0(double d) {
/* 1 */             C2288vc[] c2288vcArr = this.f18575l;
/* 4 */             C2288vc c2288vc = c2288vcArr[0];
/* 6 */             double d2 = c2288vc.f17962c;
/* 10 */            if (d < d2) {
/* 12 */                double d3 = d - d2;
/* 15 */                if (c2288vc.f17977r) {
/* 26 */                    return (d3 * c2288vcArr[0].f17971l) + c2288vc.m9246c(d2);
                        }
/* 28 */                c2288vc.m9250g(d2);
/* 44 */                return (c2288vcArr[0].m9244a() * d3) + c2288vcArr[0].m9248e();
                    }
/* 55 */            if (d > c2288vcArr[c2288vcArr.length - 1].f17963d) {
/* 62 */                double d4 = c2288vcArr[c2288vcArr.length - 1].f17963d;
/* 64 */                double d5 = d - d4;
/* 66 */                int length = c2288vcArr.length - 1;
/* 79 */                return (d5 * c2288vcArr[length].f17971l) + c2288vcArr[length].m9246c(d4);
                    }
/* 82 */            for (int i = 0; i < c2288vcArr.length; i++) {
/* 84 */                C2288vc c2288vc2 = c2288vcArr[i];
/* 90 */                if (d <= c2288vc2.f17963d) {
/* 94 */                    if (c2288vc2.f17977r) {
/* 96 */                        return c2288vc2.m9246c(d);
                            }
/* 101 */                   c2288vc2.m9250g(d);
/* 106 */                   return c2288vcArr[i].m9248e();
                        }
                    }
/* 114 */           return Double.NaN;
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: g0 */
                public final void mo6912g0(double d, double[] dArr) {
/* 1 */             C2288vc[] c2288vcArr = this.f18575l;
/* 4 */             C2288vc c2288vc = c2288vcArr[0];
/* 6 */             double d2 = c2288vc.f17962c;
/* 11 */            if (d < d2) {
/* 13 */                double d3 = d - d2;
/* 16 */                if (c2288vc.f17977r) {
/* 18 */                    double dM9246c = c2288vc.m9246c(d2);
/* 22 */                    C2288vc c2288vc2 = c2288vcArr[0];
/* 28 */                    dArr[0] = (c2288vc2.f17971l * d3) + dM9246c;
/* 40 */                    dArr[1] = (d3 * c2288vcArr[0].f17972m) + c2288vc2.m9247d(d2);
/* 42 */                    return;
                        }
/* 43 */                c2288vc.m9250g(d2);
/* 60 */                dArr[0] = (c2288vcArr[0].m9244a() * d3) + c2288vcArr[0].m9248e();
/* 76 */                dArr[1] = (c2288vcArr[0].m9245b() * d3) + c2288vcArr[0].m9249f();
/* 78 */                return;
                    }
/* 87 */            if (d <= c2288vcArr[c2288vcArr.length - 1].f17963d) {
/* 168 */               for (int i = 0; i < c2288vcArr.length; i++) {
/* 170 */                   C2288vc c2288vc3 = c2288vcArr[i];
/* 176 */                   if (d <= c2288vc3.f17963d) {
/* 180 */                       if (c2288vc3.f17977r) {
/* 186 */                           dArr[0] = c2288vc3.m9246c(d);
/* 194 */                           dArr[1] = c2288vcArr[i].m9247d(d);
/* 196 */                           return;
                                } else {
/* 197 */                           c2288vc3.m9250g(d);
/* 206 */                           dArr[0] = c2288vcArr[i].m9248e();
/* 214 */                           dArr[1] = c2288vcArr[i].m9249f();
/* 216 */                           return;
                                }
                            }
                        }
/* 220 */               return;
                    }
/* 93 */            double d4 = c2288vcArr[c2288vcArr.length - 1].f17963d;
/* 95 */            double d5 = d - d4;
/* 98 */            int length = c2288vcArr.length - 1;
/* 99 */            C2288vc c2288vc4 = c2288vcArr[length];
/* 103 */           if (c2288vc4.f17977r) {
/* 105 */               double dM9246c2 = c2288vc4.m9246c(d4);
/* 109 */               C2288vc c2288vc5 = c2288vcArr[length];
/* 115 */               dArr[0] = (c2288vc5.f17971l * d5) + dM9246c2;
/* 127 */               dArr[1] = (d5 * c2288vcArr[length].f17972m) + c2288vc5.m9247d(d4);
/* 129 */               return;
                    }
/* 130 */           c2288vc4.m9250g(d);
/* 147 */           dArr[0] = (c2288vcArr[length].m9244a() * d5) + c2288vcArr[length].m9248e();
/* 163 */           dArr[1] = (c2288vcArr[length].m9245b() * d5) + c2288vcArr[length].m9249f();
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: h0 */
                public final void mo6913h0(double d, float[] fArr) {
/* 1 */             C2288vc[] c2288vcArr = this.f18575l;
/* 4 */             C2288vc c2288vc = c2288vcArr[0];
/* 6 */             double d2 = c2288vc.f17962c;
/* 11 */            if (d < d2) {
/* 13 */                double d3 = d - d2;
/* 16 */                if (c2288vc.f17977r) {
/* 18 */                    double dM9246c = c2288vc.m9246c(d2);
/* 22 */                    C2288vc c2288vc2 = c2288vcArr[0];
/* 29 */                    fArr[0] = (float) ((c2288vc2.f17971l * d3) + dM9246c);
/* 42 */                    fArr[1] = (float) ((d3 * c2288vcArr[0].f17972m) + c2288vc2.m9247d(d2));
/* 44 */                    return;
                        }
/* 45 */                c2288vc.m9250g(d2);
/* 63 */                fArr[0] = (float) ((c2288vcArr[0].m9244a() * d3) + c2288vcArr[0].m9248e());
/* 80 */                fArr[1] = (float) ((c2288vcArr[0].m9245b() * d3) + c2288vcArr[0].m9249f());
/* 82 */                return;
                    }
/* 91 */            if (d <= c2288vcArr[c2288vcArr.length - 1].f17963d) {
/* 160 */               for (int i = 0; i < c2288vcArr.length; i++) {
/* 162 */                   C2288vc c2288vc3 = c2288vcArr[i];
/* 168 */                   if (d <= c2288vc3.f17963d) {
/* 172 */                       if (c2288vc3.f17977r) {
/* 179 */                           fArr[0] = (float) c2288vc3.m9246c(d);
/* 188 */                           fArr[1] = (float) c2288vcArr[i].m9247d(d);
/* 190 */                           return;
                                } else {
/* 191 */                           c2288vc3.m9250g(d);
/* 201 */                           fArr[0] = (float) c2288vcArr[i].m9248e();
/* 210 */                           fArr[1] = (float) c2288vcArr[i].m9249f();
/* 212 */                           return;
                                }
                            }
                        }
/* 216 */               return;
                    }
/* 97 */            double d4 = c2288vcArr[c2288vcArr.length - 1].f17963d;
/* 99 */            double d5 = d - d4;
/* 102 */           int length = c2288vcArr.length - 1;
/* 103 */           C2288vc c2288vc4 = c2288vcArr[length];
/* 107 */           if (!c2288vc4.f17977r) {
/* 136 */               c2288vc4.m9250g(d);
/* 146 */               fArr[0] = (float) c2288vcArr[length].m9248e();
/* 155 */               fArr[1] = (float) c2288vcArr[length].m9249f();
                    } else {
/* 109 */               double dM9246c2 = c2288vc4.m9246c(d4);
/* 113 */               C2288vc c2288vc5 = c2288vcArr[length];
/* 120 */               fArr[0] = (float) ((c2288vc5.f17971l * d5) + dM9246c2);
/* 133 */               fArr[1] = (float) ((d5 * c2288vcArr[length].f17972m) + c2288vc5.m9247d(d4));
                    }
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: j0 */
                public final double mo6914j0(double d) {
/* 1 */             C2288vc[] c2288vcArr = this.f18575l;
/* 6 */             double d2 = c2288vcArr[0].f17962c;
/* 10 */            if (d < d2) {
/* 12 */                d = d2;
                    }
/* 22 */            if (d > c2288vcArr[c2288vcArr.length - 1].f17963d) {
/* 29 */                d = c2288vcArr[c2288vcArr.length - 1].f17963d;
                    }
/* 32 */            for (int i = 0; i < c2288vcArr.length; i++) {
/* 34 */                C2288vc c2288vc = c2288vcArr[i];
/* 40 */                if (d <= c2288vc.f17963d) {
/* 44 */                    if (c2288vc.f17977r) {
/* 46 */                        return c2288vc.f17971l;
                            }
/* 49 */                    c2288vc.m9250g(d);
/* 54 */                    return c2288vcArr[i].m9244a();
                        }
                    }
/* 62 */            return Double.NaN;
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: k0 */
                public final void mo6915k0(double d, double[] dArr) {
/* 1 */             C2288vc[] c2288vcArr = this.f18575l;
/* 6 */             double d2 = c2288vcArr[0].f17962c;
/* 11 */            if (d < d2) {
/* 13 */                d = d2;
                    } else if (d > c2288vcArr[c2288vcArr.length - 1].f17963d) {
/* 29 */                d = c2288vcArr[c2288vcArr.length - 1].f17963d;
                    }
/* 33 */            for (int i = 0; i < c2288vcArr.length; i++) {
/* 35 */                C2288vc c2288vc = c2288vcArr[i];
/* 41 */                if (d <= c2288vc.f17963d) {
/* 45 */                    if (c2288vc.f17977r) {
/* 49 */                        dArr[0] = c2288vc.f17971l;
/* 53 */                        dArr[1] = c2288vc.f17972m;
/* 55 */                        return;
                            } else {
/* 56 */                        c2288vc.m9250g(d);
/* 65 */                        dArr[0] = c2288vcArr[i].m9244a();
/* 73 */                        dArr[1] = c2288vcArr[i].m9245b();
/* 75 */                        return;
                            }
                        }
                    }
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: n0 */
                public final double[] mo6916n0() {
/* 1 */             return this.f18574k;
                }
            }
