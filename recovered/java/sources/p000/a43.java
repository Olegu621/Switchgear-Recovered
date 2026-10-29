            package p000;

            import android.view.View;
            import java.lang.reflect.Array;
            import java.text.DecimalFormat;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class a43 {

                /* JADX INFO: renamed from: a */
                public f31 f82a;

                /* JADX INFO: renamed from: b */
                public String f83b;

                /* JADX INFO: renamed from: c */
                public final ArrayList f84c = new ArrayList();

                /* JADX INFO: renamed from: c */
                public static a43 m55c(String str) {
/* 8 */             if (str.startsWith("CUSTOM")) {
/* 12 */                x33 x33Var = new x33();
/* 17 */                x33Var.f18935d = new float[1];
/* 19 */                return x33Var;
                    }
                    switch (str) {
                        case "rotationX":
/* 298 */                   return new w33(3);
                        case "rotationY":
/* 292 */                   return new w33(4);
                        case "translationX":
/* 286 */                   return new w33(7);
                        case "translationY":
/* 280 */                   return new w33(8);
                        case "translationZ":
/* 274 */                   return new w33(9);
                        case "progress":
/* 266 */                   z33 z33Var = new z33();
/* 269 */                   z33Var.f19924d = false;
/* 271 */                   return z33Var;
                        case "scaleX":
/* 260 */                   return new w33(5);
                        case "scaleY":
/* 254 */                   return new w33(6);
                        case "waveVariesBy":
/* 248 */                   return new w33(0);
                        case "rotation":
/* 242 */                   return new w33(2);
                        case "elevation":
/* 236 */                   return new w33(1);
                        case "transitionPathRotate":
/* 230 */                   return new y33();
                        case "alpha":
/* 224 */                   return new w33(0);
                        case "waveOffset":
/* 218 */                   return new w33(0);
                        default:
/* 214 */                   return null;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final float m56a(float f) {
/* 1 */             f31 f31Var = this.f82a;
/* 5 */             py0 py0Var = (py0) f31Var.f7991i;
/* 9 */             double[] dArr = (double[]) f31Var.f7989g;
/* 14 */            if (py0Var != null) {
/* 17 */                py0Var.mo6912g0(f, dArr);
                    } else {
/* 28 */                dArr[0] = ((float[]) f31Var.f7986d)[0];
/* 37 */                dArr[1] = ((float[]) f31Var.f7987e)[0];
/* 46 */                dArr[2] = ((float[]) f31Var.f7984b)[0];
                    }
/* 50 */            double[] dArr2 = (double[]) f31Var.f7989g;
/* 73 */            return (float) ((((ac1) f31Var.f7983a).m193z(f, dArr2[1]) * ((double[]) f31Var.f7989g)[2]) + dArr2[0]);
                }

                /* JADX INFO: renamed from: b */
                public final float m57b(float f) {
/* 5 */             f31 f31Var = this.f82a;
/* 9 */             ac1 ac1Var = (ac1) f31Var.f7983a;
/* 13 */            py0 py0Var = (py0) f31Var.f7991i;
/* 17 */            double[] dArr = (double[]) f31Var.f7990h;
/* 21 */            double d = 0.0d;
/* 24 */            if (py0Var != null) {
                        double d2 = f;
/* 27 */                py0Var.mo6915k0(d2, dArr);
/* 38 */                ((py0) f31Var.f7991i).mo6912g0(d2, (double[]) f31Var.f7989g);
                    } else {
/* 42 */                dArr[0] = 0.0d;
/* 44 */                dArr[1] = 0.0d;
/* 46 */                dArr[2] = 0.0d;
                    }
                    double d3 = f;
/* 55 */            double dM193z = ac1Var.m193z(d3, ((double[]) f31Var.f7989g)[1]);
/* 63 */            double d4 = ((double[]) f31Var.f7989g)[1];
/* 69 */            double d5 = ((double[]) f31Var.f7990h)[1];
/* 75 */            double dM189s = ac1Var.m189s(d3) + d4;
/* 79 */            if (d3 <= 0.0d) {
/* 81 */                d3 = 1.0E-5d;
                    } else if (d3 >= 1.0d) {
/* 93 */                d3 = 0.999999d;
                    }
/* 102 */           int iBinarySearch = Arrays.binarySearch((double[]) ac1Var.f178c, d3);
/* 106 */           if (iBinarySearch <= 0 && iBinarySearch != 0) {
/* 111 */               int i = -iBinarySearch;
/* 112 */               int i2 = i - 1;
/* 116 */               float[] fArr = (float[]) ac1Var.f177b;
/* 118 */               float f2 = fArr[i2];
/* 120 */               int i3 = i - 2;
/* 121 */               float f3 = fArr[i3];
/* 127 */               double[] dArr2 = (double[]) ac1Var.f178c;
/* 129 */               double d6 = dArr2[i2];
/* 131 */               double d7 = dArr2[i3];
/* 135 */               double d8 = ((double) (f2 - f3)) / (d6 - d7);
/* 141 */               d = (((double) f3) - (d8 * d7)) + (d3 * d8);
                    }
/* 155 */           double dCos = Math.cos(6.283185307179586d * dM189s) * (d + d5) * 6.283185307179586d;
/* 158 */           double[] dArr3 = (double[]) f31Var.f7990h;
/* 174 */           return (float) ((dCos * ((double[]) f31Var.f7989g)[2]) + (dM193z * dArr3[2]) + dArr3[0]);
                }

                /* JADX INFO: renamed from: d */
                public abstract void mo58d(View view, float f);

                /* JADX INFO: renamed from: e */
                public final void m59e() {
                    int i;
/* 3 */             ArrayList arrayList = this.f84c;
/* 5 */             int size = arrayList.size();
/* 9 */             if (size == 0) {
/* 11 */                return;
                    }
/* 18 */            Collections.sort(arrayList, new wa3(7));
/* 21 */            double[] dArr = new double[size];
/* 30 */            int i2 = 0;
/* 33 */            Class cls = Double.TYPE;
/* 39 */            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
/* 43 */            f31 f31Var = new f31();
/* 49 */            ac1 ac1Var = new ac1(4);
/* 54 */            ac1Var.f177b = new float[0];
/* 58 */            ac1Var.f178c = new double[0];
/* 60 */            f31Var.f7983a = ac1Var;
/* 64 */            f31Var.f7984b = new float[size];
/* 68 */            f31Var.f7988f = new double[size];
/* 72 */            f31Var.f7985c = new float[size];
/* 76 */            f31Var.f7986d = new float[size];
/* 80 */            f31Var.f7987e = new float[size];
/* 82 */            float[] fArr = new float[size];
/* 84 */            this.f82a = f31Var;
/* 86 */            Iterator it = arrayList.iterator();
/* 94 */            if (it.hasNext()) {
/* 363 */               throw fm0.m3780f(it);
                    }
/* 96 */            f31 f31Var2 = this.f82a;
/* 100 */           float[] fArr2 = (float[]) f31Var2.f7985c;
/* 104 */           ac1 ac1Var2 = (ac1) f31Var2.f7983a;
/* 108 */           double[] dArr3 = (double[]) f31Var2.f7988f;
/* 121 */           double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, dArr3.length, 3);
/* 125 */           float[] fArr3 = (float[]) f31Var2.f7984b;
/* 131 */           f31Var2.f7989g = new double[fArr3.length + 2];
/* 137 */           f31Var2.f7990h = new double[fArr3.length + 2];
/* 145 */           if (dArr3[0] > 0.0d) {
/* 149 */               ac1Var2.m175d(0.0d, fArr2[0]);
                    }
/* 153 */           int length = dArr3.length - 1;
/* 162 */           if (dArr3[length] < 1.0d) {
/* 166 */               ac1Var2.m175d(1.0d, fArr2[length]);
                    }
/* 171 */           for (int i3 = 0; i3 < dArr4.length; i3++) {
/* 173 */               double[] dArr5 = dArr4[i3];
/* 182 */               dArr5[0] = ((float[]) f31Var2.f7986d)[i3];
/* 191 */               dArr5[1] = ((float[]) f31Var2.f7987e)[i3];
/* 196 */               dArr5[2] = fArr3[i3];
/* 202 */               ac1Var2.m175d(dArr3[i3], fArr2[i3]);
                    }
/* 208 */           int i4 = 0;
/* 209 */           double d = 0.0d;
                    while (true) {
/* 213 */               float[] fArr4 = (float[]) ac1Var2.f177b;
/* 216 */               if (i4 >= fArr4.length) {
                            break;
                        }
/* 221 */               d += (double) fArr4[i4];
/* 222 */               i4++;
                    }
/* 225 */           int i5 = 1;
/* 226 */           double d2 = 0.0d;
                    while (true) {
/* 230 */               float[] fArr5 = (float[]) ac1Var2.f177b;
/* 235 */               if (i5 >= fArr5.length) {
                            break;
                        }
/* 237 */               int i6 = i5 - 1;
/* 245 */               float f = (fArr5[i6] + fArr5[i5]) / 2.0f;
/* 249 */               double[] dArr6 = (double[]) ac1Var2.f178c;
/* 262 */               d2 = ((dArr6[i5] - dArr6[i6]) * ((double) f)) + d2;
/* 264 */               i5++;
/* 266 */               i2 = i2;
                    }
/* 269 */           int i7 = i2;
/* 271 */           int i8 = i7;
                    while (true) {
/* 275 */               float[] fArr6 = (float[]) ac1Var2.f177b;
/* 278 */               if (i8 >= fArr6.length) {
                            break;
                        }
/* 288 */               fArr6[i8] = (float) (((double) fArr6[i8]) * (d / d2));
/* 290 */               i8++;
                    }
/* 297 */           ((double[]) ac1Var2.f179d)[i7] = 0.0d;
/* 299 */           int i9 = 1;
                    while (true) {
/* 302 */               float[] fArr7 = (float[]) ac1Var2.f177b;
/* 305 */               if (i9 >= fArr7.length) {
                            break;
                        }
/* 307 */               int i10 = i9 - 1;
/* 314 */               float f2 = (fArr7[i10] + fArr7[i9]) / 2.0f;
/* 317 */               double[] dArr7 = (double[]) ac1Var2.f178c;
/* 323 */               double d3 = dArr7[i9] - dArr7[i10];
/* 326 */               double[] dArr8 = (double[]) ac1Var2.f179d;
/* 333 */               dArr8[i9] = (d3 * ((double) f2)) + dArr8[i10];
/* 335 */               i9++;
                    }
/* 339 */           if (dArr3.length > 1) {
/* 341 */               i = i7;
/* 347 */               f31Var2.f7991i = py0.m7597V(i, dArr3, dArr4);
                    } else {
/* 350 */               i = i7;
/* 353 */               f31Var2.f7991i = null;
                    }
/* 355 */           py0.m7597V(i, dArr, dArr2);
                }

                public final String toString() {
/* 1 */             String str = this.f83b;
/* 7 */             new DecimalFormat("##.##");
/* 12 */            Iterator it = this.f84c.iterator();
/* 20 */            if (it.hasNext()) {
/* 27 */                throw fm0.m3780f(it);
                    }
/* 22 */            return str;
                }
            }
