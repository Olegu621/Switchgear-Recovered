            package p000;

            import android.graphics.Canvas;
            import android.graphics.DashPathEffect;
            import android.graphics.Paint;
            import android.graphics.Path;
            import android.graphics.Rect;
            import android.view.View;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dk1 {

                /* JADX INFO: renamed from: a */
                public float[] f7275a;

                /* JADX INFO: renamed from: b */
                public final int[] f7276b;

                /* JADX INFO: renamed from: c */
                public final float[] f7277c;

                /* JADX INFO: renamed from: d */
                public Path f7278d;

                /* JADX INFO: renamed from: e */
                public final Paint f7279e;

                /* JADX INFO: renamed from: f */
                public final Paint f7280f;

                /* JADX INFO: renamed from: g */
                public final Paint f7281g;

                /* JADX INFO: renamed from: h */
                public final Paint f7282h;

                /* JADX INFO: renamed from: i */
                public final Paint f7283i;

                /* JADX INFO: renamed from: j */
                public final float[] f7284j;

                /* JADX INFO: renamed from: k */
                public int f7285k;

                /* JADX INFO: renamed from: l */
                public final Rect f7286l = new Rect();

                /* JADX INFO: renamed from: m */
                public final int f7287m = 1;

                /* JADX INFO: renamed from: n */
                public final /* synthetic */ MotionLayout f7288n;

                public dk1(MotionLayout motionLayout) {
/* 4 */             this.f7288n = motionLayout;
/* 18 */            Paint paint = new Paint();
/* 21 */            this.f7279e = paint;
/* 23 */            paint.setAntiAlias(true);
/* 28 */            paint.setColor(-21965);
/* 33 */            paint.setStrokeWidth(2.0f);
/* 36 */            Paint.Style style = Paint.Style.STROKE;
/* 38 */            paint.setStyle(style);
/* 43 */            Paint paint2 = new Paint();
/* 46 */            this.f7280f = paint2;
/* 48 */            paint2.setAntiAlias(true);
/* 54 */            paint2.setColor(-2067046);
/* 57 */            paint2.setStrokeWidth(2.0f);
/* 60 */            paint2.setStyle(style);
/* 65 */            Paint paint3 = new Paint();
/* 68 */            this.f7281g = paint3;
/* 70 */            paint3.setAntiAlias(true);
/* 76 */            paint3.setColor(-13391360);
/* 79 */            paint3.setStrokeWidth(2.0f);
/* 82 */            paint3.setStyle(style);
/* 87 */            Paint paint4 = new Paint();
/* 90 */            this.f7282h = paint4;
/* 92 */            paint4.setAntiAlias(true);
/* 95 */            paint4.setColor(-13391360);
/* 115 */           paint4.setTextSize(motionLayout.getContext().getResources().getDisplayMetrics().density * 12.0f);
/* 122 */           this.f7284j = new float[8];
/* 126 */           Paint paint5 = new Paint();
/* 129 */           this.f7283i = paint5;
/* 131 */           paint5.setAntiAlias(true);
/* 146 */           paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
/* 153 */           this.f7277c = new float[100];
/* 159 */           this.f7276b = new int[50];
                }

                /* JADX INFO: renamed from: a */
                public final void m3144a(Canvas canvas, int i, int i2, zj1 zj1Var) {
                    Canvas canvas2;
                    int width;
                    int height;
                    float f;
                    boolean z;
/* 7 */             Paint paint = this.f7281g;
/* 10 */            int[] iArr = this.f7276b;
/* 12 */            boolean z2 = false;
/* 14 */            int i3 = 4;
/* 15 */            if (i == 4) {
/* 17 */                int i4 = 0;
/* 18 */                boolean z3 = false;
/* 19 */                boolean z4 = false;
/* 22 */                while (i4 < this.f7285k) {
/* 24 */                    int i5 = iArr[i4];
/* 26 */                    if (i5 == 1) {
                                z = z3;
/* 28 */                        z = true;
                            }
/* 29 */                    if (i5 == 0) {
/* 31 */                        z4 = true;
                            }
/* 32 */                    i4++;
                            z3 = z;
                            z4 = z4;
                        }
/* 35 */                if (z3) {
/* 37 */                    float[] fArr = this.f7275a;
/* 53 */                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
                        }
/* 56 */                if (z4) {
/* 58 */                    m3145b(canvas);
                        }
                    }
/* 61 */            if (i == 2) {
/* 63 */                float[] fArr2 = this.f7275a;
/* 65 */                float f2 = fArr2[0];
/* 67 */                float f3 = fArr2[1];
/* 71 */                float f4 = fArr2[fArr2.length - 2];
/* 75 */                float f5 = fArr2[fArr2.length - 1];
/* 77 */                canvas2 = canvas;
/* 79 */                canvas2.drawLine(f2, f3, f4, f5, paint);
                    } else {
/* 83 */                canvas2 = canvas;
                    }
/* 86 */            if (i == 3) {
/* 88 */                m3145b(canvas);
                    }
/* 95 */            canvas2.drawLines(this.f7275a, this.f7279e);
/* 98 */            View view = zj1Var.f20177b;
/* 100 */           if (view != null) {
/* 102 */               width = view.getWidth();
/* 108 */               height = zj1Var.f20177b.getHeight();
                    } else {
/* 115 */               width = 0;
/* 116 */               height = 0;
                    }
/* 117 */           int i6 = 1;
/* 120 */           while (i6 < i2 - 1) {
/* 122 */               if (i != i3 || iArr[i6 - 1] != 0) {
/* 134 */                   int i7 = i6 * 2;
/* 136 */                   float[] fArr3 = this.f7277c;
/* 138 */                   float f6 = fArr3[i7];
/* 141 */                   float f7 = fArr3[i7 + 1];
/* 145 */                   this.f7278d.reset();
/* 156 */                   this.f7278d.moveTo(f6, f7 + 10.0f);
/* 163 */                   this.f7278d.lineTo(f6 + 10.0f, f7);
/* 170 */                   this.f7278d.lineTo(f6, f7 - 10.0f);
/* 177 */                   this.f7278d.lineTo(f6 - 10.0f, f7);
/* 182 */                   this.f7278d.close();
/* 185 */                   int i8 = i6 - 1;
/* 195 */                   Paint paint2 = this.f7283i;
/* 199 */                   if (i == i3) {
/* 201 */                       int i9 = iArr[i8];
/* 203 */                       if (i9 == 1) {
/* 209 */                           m3147d(canvas2, f6 - 0.0f, f7 - 0.0f);
                                } else if (i9 == 0) {
/* 220 */                           m3146c(canvas2, f6 - 0.0f, f7 - 0.0f);
                                } else {
/* 224 */                           if (i9 == 2) {
/* 229 */                               f = f7;
/* 232 */                               m3148e(canvas2, f6 - 0.0f, f - 0.0f, width, height);
                                    }
/* 237 */                           canvas2.drawPath(this.f7278d, paint2);
                                }
/* 212 */                       f = f7;
/* 237 */                       canvas2.drawPath(this.f7278d, paint2);
                            } else {
/* 241 */                       f = f7;
                            }
/* 242 */                   if (i == 2) {
/* 248 */                       m3147d(canvas2, f6 - 0.0f, f - 0.0f);
                            }
/* 251 */                   if (i == 3) {
/* 257 */                       m3146c(canvas2, f6 - 0.0f, f - 0.0f);
                            }
/* 261 */                   if (i == 6) {
/* 267 */                       m3148e(canvas2, f6 - 0.0f, f - 0.0f, width, height);
                            }
/* 272 */                   canvas2.drawPath(this.f7278d, paint2);
                        }
/* 275 */               i6++;
/* 277 */               z2 = z2;
/* 279 */               i3 = 4;
                    }
/* 282 */           boolean z5 = z2;
/* 284 */           float[] fArr4 = this.f7275a;
/* 287 */           if (fArr4.length > 1) {
/* 289 */               float f8 = fArr4[z5 ? 1 : 0];
/* 291 */               float f9 = fArr4[1];
/* 295 */               Paint paint3 = this.f7280f;
/* 297 */               canvas2.drawCircle(f8, f9, 8.0f, paint3);
/* 300 */               float[] fArr5 = this.f7275a;
/* 310 */               canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m3145b(Canvas canvas) {
/* 3 */             float[] fArr = this.f7275a;
/* 6 */             float f = fArr[0];
/* 9 */             float f2 = fArr[1];
/* 14 */            float f3 = fArr[fArr.length - 2];
/* 18 */            float f4 = fArr[fArr.length - 1];
/* 20 */            float fMin = Math.min(f, f3);
/* 24 */            float fMax = Math.max(f2, f4);
/* 28 */            float fMax2 = Math.max(f, f3);
/* 32 */            float fMax3 = Math.max(f2, f4);
/* 36 */            Paint paint = this.f7281g;
/* 40 */            canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
/* 63 */            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), paint);
                }

                /* JADX INFO: renamed from: c */
                public final void m3146c(Canvas canvas, float f, float f2) {
/* 5 */             float[] fArr = this.f7275a;
/* 8 */             float f3 = fArr[0];
/* 11 */            float f4 = fArr[1];
/* 16 */            float f5 = fArr[fArr.length - 2];
/* 20 */            float f6 = fArr[fArr.length - 1];
/* 22 */            float fMin = Math.min(f3, f5);
/* 26 */            float fMax = Math.max(f4, f6);
/* 34 */            float fMin2 = f - Math.min(f3, f5);
/* 40 */            float fMax2 = Math.max(f4, f6) - f2;
/* 71 */            String str = HttpUrl.FRAGMENT_ENCODE_SET + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
/* 75 */            int length = str.length();
/* 79 */            Paint paint = this.f7282h;
/* 83 */            Rect rect = this.f7286l;
/* 85 */            paint.getTextBounds(str, 0, length, rect);
/* 106 */           canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f2 - 20.0f, paint);
/* 109 */           float fMin3 = Math.min(f3, f5);
/* 113 */           Paint paint2 = this.f7281g;
/* 122 */           canvas.drawLine(f, f2, fMin3, f2, paint2);
/* 149 */           String str2 = HttpUrl.FRAGMENT_ENCODE_SET + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
/* 157 */           paint.getTextBounds(str2, 0, str2.length(), rect);
/* 175 */           canvas.drawText(str2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
/* 188 */           canvas.drawLine(f, f2, f, Math.max(f4, f6), paint2);
                }

                /* JADX INFO: renamed from: d */
                public final void m3147d(Canvas canvas, float f, float f2) {
/* 7 */             float[] fArr = this.f7275a;
/* 10 */            float f3 = fArr[0];
/* 13 */            float f4 = fArr[1];
/* 18 */            float f5 = fArr[fArr.length - 2];
/* 22 */            float f6 = fArr[fArr.length - 1];
/* 34 */            float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
/* 37 */            float f7 = f5 - f3;
/* 41 */            float f8 = f6 - f4;
/* 46 */            float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (fHypot * fHypot);
/* 48 */            float f10 = (f7 * f9) + f3;
/* 50 */            float f11 = (f9 * f8) + f4;
/* 53 */            Path path = new Path();
/* 56 */            path.moveTo(f, f2);
/* 59 */            path.lineTo(f10, f11);
/* 72 */            float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
/* 91 */            String str = HttpUrl.FRAGMENT_ENCODE_SET + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
/* 95 */            int length = str.length();
/* 99 */            Paint paint = this.f7282h;
/* 101 */           Rect rect = this.f7286l;
/* 103 */           paint.getTextBounds(str, 0, length, rect);
/* 124 */           canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (rect.width() / 2), -20.0f, paint);
/* 133 */           canvas.drawLine(f, f2, f10, f11, this.f7281g);
                }

                /* JADX INFO: renamed from: e */
                public final void m3148e(Canvas canvas, float f, float f2, int i, int i2) {
/* 9 */             StringBuilder sb = new StringBuilder(HttpUrl.FRAGMENT_ENCODE_SET);
/* 20 */            MotionLayout motionLayout = this.f7288n;
/* 37 */            sb.append(((int) (((double) (((f - (i / 2)) * 100.0f) / (motionLayout.getWidth() - i))) + 0.5d)) / 100.0f);
/* 40 */            String string = sb.toString();
/* 44 */            int length = string.length();
/* 48 */            Paint paint = this.f7282h;
/* 51 */            Rect rect = this.f7286l;
/* 53 */            paint.getTextBounds(string, 0, length, rect);
/* 74 */            canvas.drawText(string, ((f / 2.0f) - (rect.width() / 2)) + 0.0f, f2 - 20.0f, paint);
/* 79 */            float fMin = Math.min(0.0f, 1.0f);
/* 83 */            Paint paint2 = this.f7281g;
/* 95 */            canvas.drawLine(f, f2, fMin, f2, paint2);
/* 127 */           String str = HttpUrl.FRAGMENT_ENCODE_SET + (((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (motionLayout.getHeight() - i2))) + 0.5d)) / 100.0f);
/* 135 */           paint.getTextBounds(str, 0, str.length(), rect);
/* 154 */           canvas.drawText(str, f + 5.0f, 0.0f - ((f2 / 2.0f) - (rect.height() / 2)), paint);
/* 167 */           canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), paint2);
                }
            }
