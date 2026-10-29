            package androidx.constraintlayout.utils.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.util.AttributeSet;
            import android.view.ViewParent;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import androidx.constraintlayout.widget.R$styleable;
            import java.util.HashMap;
            import p000.C2326wc;
            import p000.C2556zm;
            import p000.a43;
            import p000.ak1;
            import p000.ik1;
            import p000.w43;
            import p000.zj1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 37 */    public class MotionTelltales extends MockView {

                /* JADX INFO: renamed from: W */
                public final Paint f1034W;

                /* JADX INFO: renamed from: a0 */
                public MotionLayout f1035a0;

                /* JADX INFO: renamed from: b0 */
                public final float[] f1036b0;

                /* JADX INFO: renamed from: c0 */
                public final Matrix f1037c0;

                /* JADX INFO: renamed from: d0 */
                public int f1038d0;

                /* JADX INFO: renamed from: e0 */
                public int f1039e0;

                /* JADX INFO: renamed from: f0 */
                public float f1040f0;

                public MotionTelltales(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 9 */             this.f1034W = new Paint();
/* 14 */            this.f1036b0 = new float[2];
/* 21 */            this.f1037c0 = new Matrix();
/* 24 */            this.f1038d0 = 0;
/* 29 */            this.f1039e0 = -65281;
/* 33 */            this.f1040f0 = 0.25f;
/* 35 */            m501b(context, attributeSet);
                }

                /* JADX INFO: renamed from: b */
                public final void m501b(Context context, AttributeSet attributeSet) {
/* 1 */             if (attributeSet != null) {
/* 5 */                 TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MotionTelltales);
/* 9 */                 int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 14 */                for (int i = 0; i < indexCount; i++) {
/* 16 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 22 */                    if (index == R$styleable.MotionTelltales_telltales_tailColor) {
/* 30 */                        this.f1039e0 = typedArrayObtainStyledAttributes.getColor(index, this.f1039e0);
                            } else if (index == R$styleable.MotionTelltales_telltales_velocityMode) {
/* 43 */                        this.f1038d0 = typedArrayObtainStyledAttributes.getInt(index, this.f1038d0);
                            } else if (index == R$styleable.MotionTelltales_telltales_tailScale) {
/* 56 */                        this.f1040f0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1040f0);
                            }
                        }
/* 61 */                typedArrayObtainStyledAttributes.recycle();
                    }
/* 64 */            int i2 = this.f1039e0;
/* 66 */            Paint paint = this.f1034W;
/* 68 */            paint.setColor(i2);
/* 73 */            paint.setStrokeWidth(5.0f);
                }

                @Override // android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
                }

                @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
                public final void onDraw(Canvas canvas) {
                    int i;
                    Matrix matrix;
                    int i2;
                    float f;
                    float[] fArr;
                    int i3;
                    int i4;
                    int i5;
                    char c;
                    a43 a43Var;
                    double[] dArr;
                    C2556zm c2556zm;
/* 1 */             MotionTelltales motionTelltales = this;
/* 3 */             super.onDraw(canvas);
/* 6 */             Matrix matrix2 = motionTelltales.getMatrix();
/* 10 */            Matrix matrix3 = motionTelltales.f1037c0;
/* 12 */            matrix2.invert(matrix3);
/* 17 */            if (motionTelltales.f1035a0 == null) {
/* 19 */                ViewParent parent = motionTelltales.getParent();
/* 25 */                if (parent instanceof MotionLayout) {
/* 29 */                    motionTelltales.f1035a0 = (MotionLayout) parent;
/* 31 */                    return;
                        }
/* 918 */               return;
                    }
/* 32 */            int width = motionTelltales.getWidth();
/* 36 */            int height = motionTelltales.getHeight();
/* 40 */            int i6 = 5;
/* 41 */            float[] fArr2 = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
/* 46 */            int i7 = 0;
/* 47 */            while (i7 < i6) {
/* 49 */                float f2 = fArr2[i7];
/* 51 */                int i8 = 0;
/* 52 */                while (i8 < i6) {
/* 54 */                    float f3 = fArr2[i8];
/* 56 */                    MotionLayout motionLayout = motionTelltales.f1035a0;
/* 58 */                    int i9 = motionTelltales.f1038d0;
/* 60 */                    float fMo299a = motionLayout.f914j0;
/* 62 */                    float f4 = motionLayout.f934u0;
/* 66 */                    if (motionLayout.f910h0 != null) {
/* 71 */                        float fSignum = Math.signum(motionLayout.f936w0 - f4);
/* 84 */                        float interpolation = motionLayout.f910h0.getInterpolation(motionLayout.f934u0 + 1.0E-5f);
/* 92 */                        float interpolation2 = motionLayout.f910h0.getInterpolation(motionLayout.f934u0);
/* 102 */                       fMo299a = (((interpolation - interpolation2) / 1.0E-5f) * fSignum) / motionLayout.f932s0;
/* 104 */                       f4 = interpolation2;
                            }
/* 105 */                   ak1 ak1Var = motionLayout.f910h0;
/* 107 */                   if (ak1Var != null) {
/* 109 */                       fMo299a = ak1Var.mo299a();
                            }
/* 113 */                   float f5 = fMo299a;
/* 120 */                   zj1 zj1Var = (zj1) motionLayout.f928q0.get(motionTelltales);
/* 122 */                   int i10 = i9 & 1;
/* 126 */                   float[] fArr3 = motionTelltales.f1036b0;
/* 128 */                   if (i10 == 0) {
/* 130 */                       int width2 = motionTelltales.getWidth();
/* 134 */                       int height2 = motionTelltales.getHeight();
/* 138 */                       float[] fArr4 = zj1Var.f20197v;
/* 140 */                       c = 0;
/* 142 */                       ik1 ik1Var = zj1Var.f20181f;
/* 144 */                       float fM10359b = zj1Var.m10359b(f4, fArr4);
/* 148 */                       f = f5;
/* 150 */                       HashMap map = zj1Var.f20200y;
/* 152 */                       fArr = fArr2;
/* 169 */                       w43 w43Var = map == null ? null : (w43) map.get("translationX");
/* 162 */                       i3 = i7;
/* 172 */                       HashMap map2 = zj1Var.f20200y;
/* 189 */                       w43 w43Var2 = map2 == null ? null : (w43) map2.get("translationY");
/* 182 */                       float f6 = f2;
/* 192 */                       HashMap map3 = zj1Var.f20200y;
/* 209 */                       w43 w43Var3 = map3 == null ? null : (w43) map3.get("rotation");
/* 202 */                       i4 = i8;
/* 212 */                       HashMap map4 = zj1Var.f20200y;
/* 214 */                       i2 = height;
/* 229 */                       w43 w43Var4 = map4 == null ? null : (w43) map4.get("scaleX");
/* 222 */                       i = width;
/* 232 */                       HashMap map5 = zj1Var.f20200y;
/* 234 */                       matrix = matrix3;
/* 247 */                       w43 w43Var5 = map5 == null ? null : (w43) map5.get("scaleY");
/* 249 */                       HashMap map6 = zj1Var.f20201z;
/* 260 */                       a43 a43Var2 = map6 == null ? null : (a43) map6.get("translationX");
/* 262 */                       HashMap map7 = zj1Var.f20201z;
/* 273 */                       a43 a43Var3 = map7 == null ? null : (a43) map7.get("translationY");
/* 275 */                       HashMap map8 = zj1Var.f20201z;
/* 286 */                       a43 a43Var4 = map8 == null ? null : (a43) map8.get("rotation");
/* 288 */                       HashMap map9 = zj1Var.f20201z;
/* 299 */                       a43 a43Var5 = map9 == null ? null : (a43) map9.get("scaleX");
/* 301 */                       HashMap map10 = zj1Var.f20201z;
/* 314 */                       a43 a43Var6 = map10 != null ? (a43) map10.get("scaleY") : null;
/* 319 */                       C2556zm c2556zm2 = new C2556zm();
/* 322 */                       i5 = i9;
/* 325 */                       c2556zm2.f20248e = 0.0f;
/* 327 */                       c2556zm2.f20247d = 0.0f;
/* 329 */                       c2556zm2.f20246c = 0.0f;
/* 331 */                       c2556zm2.f20245b = 0.0f;
/* 333 */                       c2556zm2.f20244a = 0.0f;
/* 335 */                       if (w43Var3 != null) {
/* 349 */                           c2556zm2.f20248e = (float) w43Var3.f18437a.mo6914j0(fM10359b);
/* 355 */                           c2556zm2.f20249f = w43Var3.m9466a(fM10359b);
                                }
/* 362 */                       if (w43Var != null) {
/* 373 */                           c2556zm2.f20246c = (float) w43Var.f18437a.mo6914j0(fM10359b);
                                }
/* 377 */                       if (w43Var2 != null) {
/* 387 */                           c2556zm2.f20247d = (float) w43Var2.f18437a.mo6914j0(fM10359b);
                                }
/* 389 */                       if (w43Var4 != null) {
/* 399 */                           c2556zm2.f20244a = (float) w43Var4.f18437a.mo6914j0(fM10359b);
                                }
/* 401 */                       if (w43Var5 != null) {
/* 411 */                           c2556zm2.f20245b = (float) w43Var5.f18437a.mo6914j0(fM10359b);
                                }
/* 413 */                       if (a43Var4 != null) {
/* 419 */                           c2556zm2.f20248e = a43Var4.m57b(fM10359b);
                                }
/* 421 */                       if (a43Var2 != null) {
/* 427 */                           c2556zm2.f20246c = a43Var2.m57b(fM10359b);
                                }
/* 429 */                       if (a43Var3 != null) {
/* 435 */                           c2556zm2.f20247d = a43Var3.m57b(fM10359b);
                                }
/* 437 */                       a43 a43Var7 = a43Var5;
/* 439 */                       if (a43Var5 != null) {
/* 445 */                           c2556zm2.f20244a = a43Var7.m57b(fM10359b);
                                }
/* 447 */                       if (a43Var6 != 0) {
/* 449 */                           a43Var = a43Var6;
/* 455 */                           c2556zm2.f20245b = a43Var.m57b(fM10359b);
                                } else {
/* 458 */                           a43Var = a43Var6;
                                }
/* 460 */                       C2326wc c2326wc = zj1Var.f20186k;
/* 462 */                       if (c2326wc != null) {
/* 464 */                           double[] dArr2 = zj1Var.f20191p;
/* 467 */                           if (dArr2.length > 0) {
                                        double d = fM10359b;
/* 470 */                               c2326wc.mo6912g0(d, dArr2);
/* 477 */                               zj1Var.f20186k.mo6915k0(d, zj1Var.f20192q);
/* 480 */                               int[] iArr = zj1Var.f20190o;
/* 482 */                               double[] dArr3 = zj1Var.f20192q;
/* 485 */                               double[] dArr4 = zj1Var.f20191p;
/* 487 */                               ik1Var.getClass();
/* 496 */                               ik1.m4571e(f3, f6, fArr3, iArr, dArr3, dArr4);
/* 499 */                               fArr3 = fArr3;
/* 500 */                               f2 = f6;
/* 501 */                               f3 = f3;
/* 502 */                               c2556zm = c2556zm2;
                                    } else {
/* 508 */                               c2556zm = c2556zm2;
/* 509 */                               f3 = f3;
/* 511 */                               f2 = f6;
/* 513 */                               fArr3 = fArr3;
                                    }
/* 516 */                           c2556zm.m10404a(f3, f2, width2, height2, fArr3);
                                } else if (zj1Var.f20185j != null) {
/* 525 */                           fArr3 = fArr3;
/* 535 */                           double dM10359b = zj1Var.m10359b(fM10359b, fArr4);
/* 546 */                           zj1Var.f20185j[0].mo6915k0(dM10359b, zj1Var.f20192q);
/* 555 */                           zj1Var.f20185j[0].mo6912g0(dM10359b, zj1Var.f20191p);
/* 558 */                           float f7 = fArr4[0];
/* 560 */                           int i11 = 0;
                                    while (true) {
/* 562 */                               dArr = zj1Var.f20192q;
/* 565 */                               if (i11 >= dArr.length) {
                                            break;
                                        }
/* 571 */                               dArr[i11] = dArr[i11] * ((double) f7);
/* 573 */                               i11++;
                                    }
/* 576 */                           int[] iArr2 = zj1Var.f20190o;
/* 579 */                           double[] dArr5 = zj1Var.f20191p;
/* 581 */                           ik1Var.getClass();
/* 588 */                           ik1.m4571e(f3, f6, fArr3, iArr2, dArr, dArr5);
/* 591 */                           fArr3 = fArr3;
/* 596 */                           f2 = f6;
/* 597 */                           f3 = f3;
/* 600 */                           c2556zm2.m10404a(f3, f2, width2, height2, fArr3);
                                } else {
/* 609 */                           ik1 ik1Var2 = zj1Var.f20182g;
/* 617 */                           float f8 = ik1Var2.f9690e - ik1Var.f9690e;
/* 627 */                           float f9 = ik1Var2.f9691f - ik1Var.f9691f;
/* 637 */                           float f10 = ik1Var2.f9692i - ik1Var.f9692i;
/* 646 */                           float f11 = f9 + (ik1Var2.f9693v - ik1Var.f9693v);
/* 658 */                           fArr3[0] = ((f8 + f10) * f3) + ((1.0f - f3) * f8);
/* 667 */                           fArr3[1] = (f11 * f6) + ((1.0f - f6) * f9);
/* 670 */                           c2556zm2.f20248e = 0.0f;
/* 672 */                           c2556zm2.f20247d = 0.0f;
/* 674 */                           c2556zm2.f20246c = 0.0f;
/* 676 */                           c2556zm2.f20245b = 0.0f;
/* 678 */                           c2556zm2.f20244a = 0.0f;
/* 680 */                           if (w43Var3 != null) {
/* 694 */                               c2556zm2.f20248e = (float) w43Var3.f18437a.mo6914j0(fM10359b);
/* 700 */                               c2556zm2.f20249f = w43Var3.m9466a(fM10359b);
                                    }
/* 707 */                           if (w43Var != 0) {
/* 525 */                               fArr3 = fArr3;
/* 525 */                               fArr3 = fArr3;
/* 717 */                               c2556zm2.f20246c = (float) w43Var.f18437a.mo6914j0(fM10359b);
                                    }
/* 719 */                           if (w43Var2 != null) {
/* 729 */                               c2556zm2.f20247d = (float) w43Var2.f18437a.mo6914j0(fM10359b);
                                    }
/* 731 */                           if (w43Var4 != null) {
/* 741 */                               c2556zm2.f20244a = (float) w43Var4.f18437a.mo6914j0(fM10359b);
                                    }
/* 743 */                           if (w43Var5 != null) {
/* 753 */                               c2556zm2.f20245b = (float) w43Var5.f18437a.mo6914j0(fM10359b);
                                    }
/* 755 */                           if (a43Var4 != null) {
/* 761 */                               c2556zm2.f20248e = a43Var4.m57b(fM10359b);
                                    }
/* 763 */                           if (a43Var2 != null) {
/* 769 */                               c2556zm2.f20246c = a43Var2.m57b(fM10359b);
                                    }
/* 771 */                           if (a43Var3 != null) {
/* 777 */                               c2556zm2.f20247d = a43Var3.m57b(fM10359b);
                                    }
/* 779 */                           if (a43Var7 != 0) {
/* 787 */                               c2556zm2.f20244a = a43Var7.m57b(fM10359b);
                                    }
/* 789 */                           if (a43Var != 0) {
/* 797 */                               c2556zm2.f20245b = a43Var.m57b(fM10359b);
                                    }
/* 802 */                           f3 = f3;
/* 804 */                           f2 = f6;
/* 808 */                           c2556zm2.m10404a(f3, f2, width2, height2, fArr3);
                                }
                            } else {
/* 812 */                       i = width;
/* 814 */                       matrix = matrix3;
/* 816 */                       i2 = height;
/* 818 */                       f = f5;
/* 820 */                       fArr = fArr2;
/* 822 */                       i3 = i7;
/* 824 */                       i4 = i8;
/* 826 */                       i5 = i9;
/* 828 */                       c = 0;
/* 830 */                       zj1Var.m10361d(f4, f3, f2, fArr3);
                            }
/* 836 */                   if (i5 < 2) {
/* 842 */                       fArr3[c] = fArr3[c] * f;
/* 848 */                       fArr3[1] = fArr3[1] * f;
                            }
/* 850 */                   motionTelltales = this;
/* 852 */                   float[] fArr5 = motionTelltales.f1036b0;
/* 854 */                   matrix3 = matrix;
/* 856 */                   matrix3.mapVectors(fArr5);
/* 859 */                   int i12 = i;
/* 862 */                   float f12 = i12 * f3;
/* 864 */                   int i13 = i2;
/* 867 */                   float f13 = i13 * f2;
/* 869 */                   float f14 = fArr5[c];
/* 871 */                   float f15 = motionTelltales.f1040f0;
/* 879 */                   float f16 = f13 - (fArr5[1] * f15);
/* 881 */                   matrix3.mapVectors(fArr5);
/* 890 */                   canvas.drawLine(f12, f13, f12 - (f14 * f15), f16, motionTelltales.f1034W);
/* 893 */                   i8 = i4 + 1;
/* 895 */                   width = i12;
/* 896 */                   height = i13;
/* 897 */                   fArr2 = fArr;
/* 899 */                   i7 = i3;
/* 901 */                   i6 = 5;
                        }
/* 912 */               i7++;
/* 914 */               height = height;
/* 915 */               i6 = 5;
                    }
                }

                @Override // android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 4 */             postInvalidate();
                }

                public void setText(CharSequence charSequence) {
/* 5 */             this.f979f = charSequence.toString();
/* 7 */             requestLayout();
                }

/* 38 */        public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
/* 39 */            super(context, attributeSet, i);
/* 40 */            this.f1034W = new Paint();
/* 41 */            this.f1036b0 = new float[2];
/* 42 */            this.f1037c0 = new Matrix();
/* 43 */            this.f1038d0 = 0;
/* 44 */            this.f1039e0 = -65281;
/* 45 */            this.f1040f0 = 0.25f;
/* 46 */            m501b(context, attributeSet);
                }
            }
