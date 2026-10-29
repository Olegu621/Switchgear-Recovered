            package p000;

            import android.graphics.Matrix;
            import android.graphics.Path;
            import android.graphics.PointF;
            import android.graphics.RectF;
            import java.util.ArrayList;
            import java.util.BitSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vc2 {

                /* JADX INFO: renamed from: a */
                public final dd2[] f17985a = new dd2[4];

                /* JADX INFO: renamed from: b */
                public final Matrix[] f17986b = new Matrix[4];

                /* JADX INFO: renamed from: c */
                public final Matrix[] f17987c = new Matrix[4];

                /* JADX INFO: renamed from: d */
                public final PointF f17988d = new PointF();

                /* JADX INFO: renamed from: e */
                public final Path f17989e = new Path();

                /* JADX INFO: renamed from: f */
                public final Path f17990f = new Path();

                /* JADX INFO: renamed from: g */
                public final dd2 f17991g = new dd2();

                /* JADX INFO: renamed from: h */
                public final float[] f17992h = new float[2];

                /* JADX INFO: renamed from: i */
                public final float[] f17993i = new float[2];

                /* JADX INFO: renamed from: j */
                public final Path f17994j = new Path();

                /* JADX INFO: renamed from: k */
                public final Path f17995k = new Path();

                /* JADX INFO: renamed from: l */
                public final boolean f17996l = true;

                public vc2() {
/* 72 */            for (int i = 0; i < 4; i++) {
/* 81 */                this.f17985a[i] = new dd2();
/* 90 */                this.f17986b[i] = new Matrix();
/* 99 */                this.f17987c[i] = new Matrix();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a */
                public final void m9251a(tc2 tc2Var, float f, RectF rectF, ts0 ts0Var, Path path) {
                    Matrix[] matrixArr;
                    float[] fArr;
                    int i;
                    dd2[] dd2VarArr;
                    char c;
                    Matrix[] matrixArr2;
                    dc0 dc0Var;
                    char c2;
                    m10 m10Var;
                    w11 w11Var;
/* 13 */            path.rewind();
/* 16 */            Path path2 = this.f17989e;
/* 18 */            path2.rewind();
/* 21 */            Path path3 = this.f17990f;
/* 23 */            path3.rewind();
/* 28 */            path3.addRect(rectF, Path.Direction.CW);
/* 31 */            int i2 = 0;
                    while (true) {
/* 32 */                matrixArr = this.f17987c;
/* 35 */                fArr = this.f17992h;
/* 38 */                dd2VarArr = this.f17985a;
/* 40 */                c = 0;
/* 42 */                matrixArr2 = this.f17986b;
/* 45 */                if (i2 >= 4) {
                            break;
                        }
/* 47 */                if (i2 == 1) {
/* 63 */                    m10Var = tc2Var.f17038g;
                        } else if (i2 != 2) {
/* 57 */                    m10Var = i2 != 3 ? tc2Var.f17037f : tc2Var.f17036e;
                        } else {
/* 60 */                    m10Var = tc2Var.f17039h;
                        }
/* 65 */                if (i2 == 1) {
/* 81 */                    w11Var = tc2Var.f17034c;
                        } else if (i2 != 2) {
/* 75 */                    w11Var = i2 != 3 ? tc2Var.f17033b : tc2Var.f17032a;
                        } else {
/* 78 */                    w11Var = tc2Var.f17035d;
                        }
/* 83 */                dd2 dd2Var = dd2VarArr[i2];
/* 85 */                w11Var.getClass();
/* 92 */                w11Var.mo3875l(dd2Var, f, m10Var.mo47a(rectF));
/* 95 */                int i3 = i2 + 1;
/* 97 */                float f2 = i3 * 90;
/* 102 */               matrixArr2[i2].reset();
/* 105 */               PointF pointF = this.f17988d;
/* 110 */               if (i2 == 1) {
/* 154 */                   pointF.set(rectF.right, rectF.bottom);
                        } else if (i2 == 2) {
/* 144 */                   pointF.set(rectF.left, rectF.bottom);
                        } else if (i2 != 3) {
/* 124 */                   pointF.set(rectF.right, rectF.top);
                        } else {
/* 134 */                   pointF.set(rectF.left, rectF.top);
                        }
/* 163 */               matrixArr2[i2].setTranslate(pointF.x, pointF.y);
/* 168 */               matrixArr2[i2].preRotate(f2);
/* 171 */               dd2 dd2Var2 = dd2VarArr[i2];
/* 175 */               fArr[0] = dd2Var2.f7128c;
/* 181 */               fArr[1] = dd2Var2.f7129d;
/* 185 */               matrixArr2[i2].mapPoints(fArr);
/* 190 */               matrixArr[i2].reset();
/* 199 */               matrixArr[i2].setTranslate(fArr[0], fArr[1]);
/* 204 */               matrixArr[i2].preRotate(f2);
/* 207 */               i2 = i3;
                    }
/* 212 */           char c3 = 1;
/* 214 */           int i4 = 0;
/* 216 */           for (i = 4; i4 < i; i = 4) {
/* 218 */               dd2 dd2Var3 = dd2VarArr[i4];
/* 222 */               fArr[c] = dd2Var3.f7126a;
/* 226 */               fArr[c3] = dd2Var3.f7127b;
/* 230 */               matrixArr2[i4].mapPoints(fArr);
/* 233 */               if (i4 == 0) {
/* 239 */                   path.moveTo(fArr[c], fArr[c3]);
                        } else {
/* 247 */                   path.lineTo(fArr[c], fArr[c3]);
                        }
/* 254 */               dd2VarArr[i4].m3007c(matrixArr2[i4], path);
/* 257 */               if (ts0Var != null) {
/* 259 */                   dd2 dd2Var4 = dd2VarArr[i4];
/* 261 */                   Matrix matrix = matrixArr2[i4];
/* 265 */                   fd1 fd1Var = (fd1) ts0Var.f17248a;
/* 267 */                   BitSet bitSet = fd1Var.f8157d;
/* 269 */                   dd2Var4.getClass();
/* 274 */                   bitSet.set(i4, (boolean) c);
/* 277 */                   cd2[] cd2VarArr = fd1Var.f8153b;
/* 281 */                   dd2Var4.m3006b(dd2Var4.f7131f);
/* 301 */                   cd2VarArr[i4] = new wc2(new ArrayList(dd2Var4.f7133h), new Matrix(matrix));
                        }
/* 303 */               int i5 = i4 + 1;
/* 305 */               int i6 = i5 % 4;
/* 307 */               dd2 dd2Var5 = dd2VarArr[i4];
/* 313 */               fArr[0] = dd2Var5.f7128c;
/* 319 */               fArr[1] = dd2Var5.f7129d;
/* 323 */               matrixArr2[i4].mapPoints(fArr);
/* 326 */               dd2 dd2Var6 = dd2VarArr[i6];
/* 328 */               float f3 = dd2Var6.f7126a;
/* 330 */               float[] fArr2 = this.f17993i;
/* 332 */               fArr2[0] = f3;
/* 336 */               fArr2[1] = dd2Var6.f7127b;
/* 340 */               matrixArr2[i6].mapPoints(fArr2);
/* 355 */               dd2[] dd2VarArr2 = dd2VarArr;
/* 368 */               float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
/* 372 */               dd2 dd2Var7 = dd2VarArr2[i4];
/* 378 */               fArr[0] = dd2Var7.f7128c;
/* 383 */               fArr[1] = dd2Var7.f7129d;
/* 387 */               matrixArr2[i4].mapPoints(fArr);
/* 417 */               float fAbs = (i4 == 1 || i4 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
/* 425 */               dd2 dd2Var8 = this.f17991g;
/* 427 */               dd2Var8.m3009e(0.0f, 0.0f, 270.0f, 0.0f);
/* 431 */               if (i4 == 1) {
/* 450 */                   dc0Var = tc2Var.f17042k;
                        } else if (i4 != 2) {
/* 442 */                   dc0Var = i4 != 3 ? tc2Var.f17041j : tc2Var.f17040i;
                        } else {
/* 446 */                   dc0Var = tc2Var.f17043l;
                        }
/* 452 */               dc0Var.mo2993h(fMax, fAbs, f, dd2Var8);
/* 455 */               Path path4 = this.f17994j;
/* 457 */               path4.reset();
/* 462 */               dd2Var8.m3007c(matrixArr[i4], path4);
/* 467 */               if (this.f17996l && (dc0Var.mo2991f() || m9252b(path4, i4) || m9252b(path4, i6))) {
/* 493 */                   path4.op(path4, path3, Path.Op.DIFFERENCE);
/* 500 */                   fArr[0] = dd2Var8.f7126a;
/* 504 */                   c3 = 1;
/* 506 */                   fArr[1] = dd2Var8.f7127b;
/* 510 */                   matrixArr[i4].mapPoints(fArr);
/* 517 */                   path2.moveTo(fArr[0], fArr[1]);
/* 522 */                   dd2Var8.m3007c(matrixArr[i4], path2);
                        } else {
/* 488 */                   c3 = 1;
/* 528 */                   dd2Var8.m3007c(matrixArr[i4], path);
                        }
/* 531 */               if (ts0Var != null) {
/* 533 */                   Matrix matrix2 = matrixArr[i4];
/* 537 */                   fd1 fd1Var2 = (fd1) ts0Var.f17248a;
/* 543 */                   c2 = 0;
/* 544 */                   fd1Var2.f8157d.set(i4 + 4, false);
/* 547 */                   cd2[] cd2VarArr2 = fd1Var2.f8155c;
/* 551 */                   dd2Var8.m3006b(dd2Var8.f7131f);
/* 571 */                   cd2VarArr2[i4] = new wc2(new ArrayList(dd2Var8.f7133h), new Matrix(matrix2));
                        } else {
/* 574 */                   c2 = 0;
                        }
/* 577 */               c = c2;
/* 579 */               dd2VarArr = dd2VarArr2;
/* 581 */               i4 = i5;
                    }
/* 586 */           path.close();
/* 589 */           path2.close();
/* 596 */           if (path2.isEmpty()) {
/* 603 */               return;
                    }
/* 600 */           path.op(path2, Path.Op.UNION);
                }

                /* JADX INFO: renamed from: b */
                public final boolean m9252b(Path path, int i) {
/* 1 */             Path path2 = this.f17995k;
/* 3 */             path2.reset();
/* 14 */            this.f17985a[i].m3007c(this.f17986b[i], path2);
/* 19 */            RectF rectF = new RectF();
/* 23 */            path.computeBounds(rectF, true);
/* 26 */            path2.computeBounds(rectF, true);
/* 31 */            path.op(path2, Path.Op.INTERSECT);
/* 34 */            path.computeBounds(rectF, true);
                    return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
                }
            }
