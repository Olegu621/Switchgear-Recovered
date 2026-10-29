            package androidx.constraintlayout.utils.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Bitmap;
            import android.graphics.BitmapShader;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.Path;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.Shader;
            import android.graphics.Typeface;
            import android.graphics.drawable.Drawable;
            import android.text.TextPaint;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.view.View;
            import android.view.ViewOutlineProvider;
            import androidx.appcompat.R$attr;
            import androidx.constraintlayout.widget.R$styleable;
            import okhttp3.internal.http2.Settings;
            import p000.bk1;
            import p000.de3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 101 */   public class MotionLabel extends View {

                /* JADX INFO: renamed from: A0 */
                public int f988A0;

                /* JADX INFO: renamed from: B0 */
                public Rect f989B0;

                /* JADX INFO: renamed from: C0 */
                public Paint f990C0;

                /* JADX INFO: renamed from: D0 */
                public float f991D0;

                /* JADX INFO: renamed from: E0 */
                public float f992E0;

                /* JADX INFO: renamed from: F0 */
                public float f993F0;

                /* JADX INFO: renamed from: G0 */
                public float f994G0;

                /* JADX INFO: renamed from: H0 */
                public float f995H0;

                /* JADX INFO: renamed from: U */
                public float f996U;

                /* JADX INFO: renamed from: V */
                public float f997V;

                /* JADX INFO: renamed from: W */
                public int f998W;

                /* JADX INFO: renamed from: a */
                public final TextPaint f999a;

                /* JADX INFO: renamed from: a0 */
                public int f1000a0;

                /* JADX INFO: renamed from: b */
                public Path f1001b;

                /* JADX INFO: renamed from: b0 */
                public float f1002b0;

                /* JADX INFO: renamed from: c */
                public int f1003c;

                /* JADX INFO: renamed from: c0 */
                public String f1004c0;

                /* JADX INFO: renamed from: d */
                public int f1005d;

                /* JADX INFO: renamed from: d0 */
                public boolean f1006d0;

                /* JADX INFO: renamed from: e */
                public boolean f1007e;

                /* JADX INFO: renamed from: e0 */
                public final Rect f1008e0;

                /* JADX INFO: renamed from: f */
                public float f1009f;

                /* JADX INFO: renamed from: f0 */
                public int f1010f0;

                /* JADX INFO: renamed from: g0 */
                public int f1011g0;

                /* JADX INFO: renamed from: h0 */
                public int f1012h0;

                /* JADX INFO: renamed from: i */
                public float f1013i;

                /* JADX INFO: renamed from: i0 */
                public int f1014i0;

                /* JADX INFO: renamed from: j0 */
                public String f1015j0;

                /* JADX INFO: renamed from: k0 */
                public int f1016k0;

                /* JADX INFO: renamed from: l0 */
                public int f1017l0;

                /* JADX INFO: renamed from: m0 */
                public boolean f1018m0;

                /* JADX INFO: renamed from: n0 */
                public float f1019n0;

                /* JADX INFO: renamed from: o0 */
                public float f1020o0;

                /* JADX INFO: renamed from: p0 */
                public float f1021p0;

                /* JADX INFO: renamed from: q0 */
                public Drawable f1022q0;

                /* JADX INFO: renamed from: r0 */
                public Matrix f1023r0;

                /* JADX INFO: renamed from: s0 */
                public Bitmap f1024s0;

                /* JADX INFO: renamed from: t0 */
                public BitmapShader f1025t0;

                /* JADX INFO: renamed from: u0 */
                public Matrix f1026u0;

                /* JADX INFO: renamed from: v */
                public ViewOutlineProvider f1027v;

                /* JADX INFO: renamed from: v0 */
                public float f1028v0;

                /* JADX INFO: renamed from: w */
                public RectF f1029w;

                /* JADX INFO: renamed from: w0 */
                public float f1030w0;

                /* JADX INFO: renamed from: x0 */
                public float f1031x0;

                /* JADX INFO: renamed from: y0 */
                public float f1032y0;

                /* JADX INFO: renamed from: z0 */
                public final Paint f1033z0;

                public MotionLabel(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 9 */             this.f999a = new TextPaint();
/* 16 */            this.f1001b = new Path();
/* 21 */            this.f1003c = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
/* 23 */            this.f1005d = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
/* 26 */            this.f1007e = false;
/* 29 */            this.f1009f = 0.0f;
/* 33 */            this.f1013i = Float.NaN;
/* 37 */            this.f996U = 48.0f;
/* 39 */            this.f997V = Float.NaN;
/* 41 */            this.f1002b0 = 0.0f;
/* 45 */            this.f1004c0 = "Hello World";
/* 48 */            this.f1006d0 = true;
/* 55 */            this.f1008e0 = new Rect();
/* 57 */            this.f1010f0 = 1;
/* 59 */            this.f1011g0 = 1;
/* 61 */            this.f1012h0 = 1;
/* 63 */            this.f1014i0 = 1;
/* 68 */            this.f1016k0 = 8388659;
/* 70 */            this.f1017l0 = 0;
/* 72 */            this.f1018m0 = false;
/* 74 */            this.f1028v0 = Float.NaN;
/* 76 */            this.f1030w0 = Float.NaN;
/* 78 */            this.f1031x0 = 0.0f;
/* 80 */            this.f1032y0 = 0.0f;
/* 87 */            this.f1033z0 = new Paint();
/* 89 */            this.f988A0 = 0;
/* 91 */            this.f992E0 = Float.NaN;
/* 93 */            this.f993F0 = Float.NaN;
/* 95 */            this.f994G0 = Float.NaN;
/* 97 */            this.f995H0 = Float.NaN;
/* 99 */            m498b(context, attributeSet);
                }

                private float getHorizontalOffset() {
/* 17 */            float f = Float.isNaN(this.f997V) ? 1.0f : this.f996U / this.f997V;
/* 18 */            String str = this.f1004c0;
/* 67 */            return ((this.f1031x0 + 1.0f) * ((((Float.isNaN(this.f1020o0) ? getMeasuredWidth() : this.f1020o0) - getPaddingLeft()) - getPaddingRight()) - (this.f999a.measureText(str, 0, str.length()) * f))) / 2.0f;
                }

                private float getVerticalOffset() {
/* 17 */            float f = Float.isNaN(this.f997V) ? 1.0f : this.f996U / this.f997V;
/* 20 */            Paint.FontMetrics fontMetrics = this.f999a.getFontMetrics();
/* 51 */            float measuredHeight = ((Float.isNaN(this.f1021p0) ? getMeasuredHeight() : this.f1021p0) - getPaddingTop()) - getPaddingBottom();
/* 52 */            float f2 = fontMetrics.descent;
/* 54 */            float f3 = fontMetrics.ascent;
/* 67 */            return (((1.0f - this.f1032y0) * (measuredHeight - ((f2 - f3) * f))) / 2.0f) - (f * f3);
                }

                /* JADX INFO: renamed from: a */
                public final void m497a(float f) {
/* 5 */             if (this.f1007e || f != 1.0f) {
/* 14 */                this.f1001b.reset();
/* 17 */                String str = this.f1004c0;
/* 19 */                int length = str.length();
/* 23 */                TextPaint textPaint = this.f999a;
/* 26 */                Rect rect = this.f1008e0;
/* 28 */                textPaint.getTextBounds(str, 0, length, rect);
/* 36 */                textPaint.getTextPath(str, 0, length, 0.0f, 0.0f, this.f1001b);
/* 41 */                if (f != 1.0f) {
/* 43 */                    de3.m3037s();
/* 48 */                    Matrix matrix = new Matrix();
/* 51 */                    matrix.postScale(f, f);
/* 56 */                    this.f1001b.transform(matrix);
                        }
/* 63 */                rect.right--;
/* 69 */                rect.left++;
/* 75 */                rect.bottom++;
/* 81 */                rect.top--;
/* 85 */                RectF rectF = new RectF();
/* 93 */                rectF.bottom = getHeight();
/* 100 */               rectF.right = getWidth();
/* 102 */               this.f1006d0 = false;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m498b(Context context, AttributeSet attributeSet) {
                    Typeface typefaceCreate;
/* 3 */             TypedValue typedValue = new TypedValue();
/* 13 */            context.getTheme().resolveAttribute(R$attr.colorPrimary, typedValue, true);
/* 16 */            int i = typedValue.data;
/* 18 */            this.f1003c = i;
/* 20 */            TextPaint textPaint = this.f999a;
/* 22 */            textPaint.setColor(i);
/* 26 */            if (attributeSet != null) {
/* 34 */                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MotionLabel);
/* 38 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 43 */                for (int i2 = 0; i2 < indexCount; i2++) {
/* 45 */                    int index = typedArrayObtainStyledAttributes.getIndex(i2);
/* 51 */                    if (index == R$styleable.MotionLabel_android_text) {
/* 57 */                        setText(typedArrayObtainStyledAttributes.getText(index));
                            } else if (index == R$styleable.MotionLabel_android_fontFamily) {
/* 70 */                        this.f1015j0 = typedArrayObtainStyledAttributes.getString(index);
                            } else if (index == R$styleable.MotionLabel_scaleFromTextSize) {
/* 86 */                        this.f997V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f997V);
                            } else if (index == R$styleable.MotionLabel_android_textSize) {
/* 102 */                       this.f996U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f996U);
                            } else if (index == R$styleable.MotionLabel_android_textStyle) {
/* 116 */                       this.f998W = typedArrayObtainStyledAttributes.getInt(index, this.f998W);
                            } else if (index == R$styleable.MotionLabel_android_typeface) {
/* 130 */                       this.f1000a0 = typedArrayObtainStyledAttributes.getInt(index, this.f1000a0);
                            } else if (index == R$styleable.MotionLabel_android_textColor) {
/* 144 */                       this.f1003c = typedArrayObtainStyledAttributes.getColor(index, this.f1003c);
                            } else if (index == R$styleable.MotionLabel_borderRound) {
/* 154 */                       float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.f1013i);
/* 158 */                       this.f1013i = dimension;
/* 160 */                       setRound(dimension);
                            } else if (index == R$styleable.MotionLabel_borderRoundPercent) {
/* 171 */                       float f = typedArrayObtainStyledAttributes.getFloat(index, this.f1009f);
/* 175 */                       this.f1009f = f;
/* 177 */                       setRoundPercent(f);
                            } else if (index == R$styleable.MotionLabel_android_gravity) {
/* 191 */                       setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                            } else if (index == R$styleable.MotionLabel_android_autoSizeTextType) {
/* 204 */                       this.f1017l0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            } else if (index == R$styleable.MotionLabel_textOutlineColor) {
/* 218 */                       this.f1005d = typedArrayObtainStyledAttributes.getInt(index, this.f1005d);
/* 220 */                       this.f1007e = true;
                            } else if (index == R$styleable.MotionLabel_textOutlineThickness) {
/* 234 */                       this.f1002b0 = typedArrayObtainStyledAttributes.getDimension(index, this.f1002b0);
/* 236 */                       this.f1007e = true;
                            } else if (index == R$styleable.MotionLabel_textBackground) {
/* 248 */                       this.f1022q0 = typedArrayObtainStyledAttributes.getDrawable(index);
/* 250 */                       this.f1007e = true;
                            } else if (index == R$styleable.MotionLabel_textBackgroundPanX) {
/* 264 */                       this.f992E0 = typedArrayObtainStyledAttributes.getFloat(index, this.f992E0);
                            } else if (index == R$styleable.MotionLabel_textBackgroundPanY) {
/* 278 */                       this.f993F0 = typedArrayObtainStyledAttributes.getFloat(index, this.f993F0);
                            } else if (index == R$styleable.MotionLabel_textPanX) {
/* 291 */                       this.f1031x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1031x0);
                            } else if (index == R$styleable.MotionLabel_textPanY) {
/* 304 */                       this.f1032y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1032y0);
                            } else if (index == R$styleable.MotionLabel_textBackgroundRotate) {
/* 317 */                       this.f995H0 = typedArrayObtainStyledAttributes.getFloat(index, this.f995H0);
                            } else if (index == R$styleable.MotionLabel_textBackgroundZoom) {
/* 330 */                       this.f994G0 = typedArrayObtainStyledAttributes.getFloat(index, this.f994G0);
                            } else if (index == R$styleable.MotionLabel_textureHeight) {
/* 343 */                       this.f1028v0 = typedArrayObtainStyledAttributes.getDimension(index, this.f1028v0);
                            } else if (index == R$styleable.MotionLabel_textureWidth) {
/* 356 */                       this.f1030w0 = typedArrayObtainStyledAttributes.getDimension(index, this.f1030w0);
                            } else if (index == R$styleable.MotionLabel_textureEffect) {
/* 369 */                       this.f988A0 = typedArrayObtainStyledAttributes.getInt(index, this.f988A0);
                            }
                        }
/* 375 */               typedArrayObtainStyledAttributes.recycle();
                    }
/* 383 */           if (this.f1022q0 != null) {
/* 390 */               this.f1026u0 = new Matrix();
/* 394 */               int intrinsicWidth = this.f1022q0.getIntrinsicWidth();
/* 400 */               int intrinsicHeight = this.f1022q0.getIntrinsicHeight();
/* 404 */               if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
/* 424 */                   intrinsicWidth = Float.isNaN(this.f1030w0) ? 128 : (int) this.f1030w0;
                        }
/* 425 */               if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
/* 445 */                   intrinsicHeight = Float.isNaN(this.f1028v0) ? 128 : (int) this.f1028v0;
                        }
/* 448 */               if (this.f988A0 != 0) {
/* 450 */                   intrinsicWidth /= 2;
/* 452 */                   intrinsicHeight /= 2;
                        }
/* 460 */               this.f1024s0 = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
/* 466 */               Canvas canvas = new Canvas(this.f1024s0);
/* 479 */               this.f1022q0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
/* 484 */               this.f1022q0.setFilterBitmap(true);
/* 489 */               this.f1022q0.draw(canvas);
/* 494 */               if (this.f988A0 != 0) {
/* 496 */                   Bitmap bitmap = this.f1024s0;
/* 498 */                   System.nanoTime();
/* 509 */                   int width = bitmap.getWidth() / 2;
/* 510 */                   int height = bitmap.getHeight() / 2;
/* 511 */                   Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
/* 517 */                   for (int i3 = 0; i3 < 4 && width >= 32 && height >= 32; i3++) {
/* 526 */                       width /= 2;
/* 528 */                       height /= 2;
/* 530 */                       bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
                            }
/* 537 */                   this.f1024s0 = bitmapCreateScaledBitmap;
                        }
/* 541 */               Bitmap bitmap2 = this.f1024s0;
/* 543 */               Shader.TileMode tileMode = Shader.TileMode.REPEAT;
/* 548 */               this.f1025t0 = new BitmapShader(bitmap2, tileMode, tileMode);
                    }
/* 554 */           this.f1010f0 = getPaddingLeft();
/* 560 */           this.f1011g0 = getPaddingRight();
/* 566 */           this.f1012h0 = getPaddingTop();
/* 572 */           this.f1014i0 = getPaddingBottom();
/* 574 */           String str = this.f1015j0;
/* 576 */           int i4 = this.f1000a0;
/* 578 */           int i5 = this.f998W;
/* 580 */           if (str != null) {
/* 582 */               typefaceCreate = Typeface.create(str, i5);
/* 586 */               if (typefaceCreate != null) {
/* 588 */                   setTypeface(typefaceCreate);
                        }
/* 665 */               textPaint.setColor(this.f1003c);
/* 670 */               textPaint.setStrokeWidth(this.f1002b0);
/* 675 */               textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
/* 678 */               textPaint.setFlags(128);
/* 683 */               setTextSize(this.f996U);
/* 686 */               textPaint.setAntiAlias(true);
                    }
/* 592 */           typefaceCreate = null;
/* 593 */           if (i4 == 1) {
/* 607 */               typefaceCreate = Typeface.SANS_SERIF;
                    } else if (i4 == 2) {
/* 604 */               typefaceCreate = Typeface.SERIF;
                    } else if (i4 == 3) {
/* 601 */               typefaceCreate = Typeface.MONOSPACE;
                    }
/* 610 */           if (i5 > 0) {
/* 619 */               Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i5) : Typeface.create(typefaceCreate, i5);
/* 623 */               setTypeface(typefaceDefaultFromStyle);
/* 635 */               int i6 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i5;
/* 641 */               textPaint.setFakeBoldText((i6 & 1) != 0);
/* 650 */               textPaint.setTextSkewX((i6 & 2) != 0 ? -0.25f : 0.0f);
                    } else {
/* 654 */               textPaint.setFakeBoldText(false);
/* 657 */               textPaint.setTextSkewX(0.0f);
/* 660 */               setTypeface(typefaceCreate);
                    }
/* 665 */           textPaint.setColor(this.f1003c);
/* 670 */           textPaint.setStrokeWidth(this.f1002b0);
/* 675 */           textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
/* 678 */           textPaint.setFlags(128);
/* 683 */           setTextSize(this.f996U);
/* 686 */           textPaint.setAntiAlias(true);
                }

                /* JADX INFO: renamed from: c */
                public final void m499c(float f, float f2, float f3, float f4) {
/* 5 */             int i = (int) (f + 0.5f);
/* 9 */             this.f1019n0 = f - i;
/* 13 */            int i2 = (int) (f3 + 0.5f);
/* 14 */            int i3 = i2 - i;
/* 18 */            int i4 = (int) (f4 + 0.5f);
/* 20 */            int i5 = (int) (0.5f + f2);
/* 21 */            int i6 = i4 - i5;
/* 23 */            float f5 = f3 - f;
/* 24 */            this.f1020o0 = f5;
/* 26 */            float f6 = f4 - f2;
/* 27 */            this.f1021p0 = f6;
/* 31 */            if (this.f1026u0 != null) {
/* 34 */                this.f1020o0 = f5;
/* 36 */                this.f1021p0 = f6;
/* 38 */                m500d();
                    }
/* 45 */            if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
/* 54 */                super.layout(i, i5, i2, i4);
                    } else {
/* 68 */                measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
/* 71 */                super.layout(i, i5, i2, i4);
                    }
/* 76 */            if (this.f1018m0) {
/* 78 */                Rect rect = this.f989B0;
/* 80 */                TextPaint textPaint = this.f999a;
/* 82 */                if (rect == null) {
/* 89 */                    this.f990C0 = new Paint();
/* 96 */                    this.f989B0 = new Rect();
/* 100 */                   this.f990C0.set(textPaint);
/* 109 */                   this.f991D0 = this.f990C0.getTextSize();
                        }
/* 111 */               this.f1020o0 = f5;
/* 113 */               this.f1021p0 = f6;
/* 115 */               Paint paint = this.f990C0;
/* 117 */               String str = this.f1004c0;
/* 126 */               paint.getTextBounds(str, 0, str.length(), this.f989B0);
/* 131 */               int iWidth = this.f989B0.width();
/* 145 */               float fHeight = this.f989B0.height() * 1.3f;
/* 153 */               float f7 = (f5 - this.f1011g0) - this.f1010f0;
/* 161 */               float f8 = (f6 - this.f1014i0) - this.f1012h0;
                        float f9 = iWidth;
/* 163 */               float f10 = f9 * f8;
/* 165 */               float f11 = fHeight * f7;
/* 169 */               float f12 = this.f991D0;
/* 171 */               if (f10 > f11) {
/* 175 */                   textPaint.setTextSize((f12 * f7) / f9);
                        } else {
/* 181 */                   textPaint.setTextSize((f12 * f8) / fHeight);
                        }
/* 186 */               if (this.f1007e || !Float.isNaN(this.f997V)) {
/* 212 */                   m497a(Float.isNaN(this.f997V) ? 1.0f : this.f996U / this.f997V);
                        }
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m500d() {
/* 12 */            float f = Float.isNaN(this.f992E0) ? 0.0f : this.f992E0;
/* 24 */            float f2 = Float.isNaN(this.f993F0) ? 0.0f : this.f993F0;
/* 37 */            float f3 = Float.isNaN(this.f994G0) ? 1.0f : this.f994G0;
/* 48 */            float f4 = Float.isNaN(this.f995H0) ? 0.0f : this.f995H0;
/* 52 */            this.f1026u0.reset();
/* 57 */            float width = this.f1024s0.getWidth();
/* 64 */            float height = this.f1024s0.getHeight();
/* 80 */            float f5 = Float.isNaN(this.f1030w0) ? this.f1020o0 : this.f1030w0;
/* 93 */            float f6 = Float.isNaN(this.f1028v0) ? this.f1021p0 : this.f1028v0;
/* 108 */           float f7 = f3 * (width * f6 < height * f5 ? f5 / width : f6 / height);
/* 111 */           this.f1026u0.postScale(f7, f7);
/* 114 */           float f8 = width * f7;
/* 115 */           float f9 = f5 - f8;
/* 117 */           float f10 = f7 * height;
/* 118 */           float f11 = f6 - f10;
/* 128 */           if (!Float.isNaN(this.f1028v0)) {
/* 132 */               f11 = this.f1028v0 / 2.0f;
                    }
/* 139 */           if (!Float.isNaN(this.f1030w0)) {
/* 143 */               f9 = this.f1030w0 / 2.0f;
                    }
/* 156 */           this.f1026u0.postTranslate((((f * f9) + f5) - f8) * 0.5f, (((f2 * f11) + f6) - f10) * 0.5f);
/* 163 */           this.f1026u0.postRotate(f4, f5 / 2.0f, f6 / 2.0f);
/* 170 */           this.f1025t0.setLocalMatrix(this.f1026u0);
                }

                public float getRound() {
/* 1 */             return this.f1013i;
                }

                public float getRoundPercent() {
/* 1 */             return this.f1009f;
                }

                public float getScaleFromTextSize() {
/* 1 */             return this.f997V;
                }

                public float getTextBackgroundPanX() {
/* 1 */             return this.f992E0;
                }

                public float getTextBackgroundPanY() {
/* 1 */             return this.f993F0;
                }

                public float getTextBackgroundRotate() {
/* 1 */             return this.f995H0;
                }

                public float getTextBackgroundZoom() {
/* 1 */             return this.f994G0;
                }

                public int getTextOutlineColor() {
/* 1 */             return this.f1005d;
                }

                public float getTextPanX() {
/* 1 */             return this.f1031x0;
                }

                public float getTextPanY() {
/* 1 */             return this.f1032y0;
                }

                public float getTextureHeight() {
/* 1 */             return this.f1028v0;
                }

                public float getTextureWidth() {
/* 1 */             return this.f1030w0;
                }

                public Typeface getTypeface() {
/* 3 */             return this.f999a.getTypeface();
                }

                @Override // android.view.View
                public final void layout(int i, int i2, int i3, int i4) {
/* 1 */             super.layout(i, i2, i3, i4);
/* 6 */             boolean zIsNaN = Float.isNaN(this.f997V);
/* 19 */            float f = zIsNaN ? 1.0f : this.f996U / this.f997V;
/* 23 */            this.f1020o0 = i3 - i;
/* 28 */            this.f1021p0 = i4 - i2;
/* 32 */            if (this.f1018m0) {
/* 34 */                Rect rect = this.f989B0;
/* 36 */                TextPaint textPaint = this.f999a;
/* 38 */                if (rect == null) {
/* 45 */                    this.f990C0 = new Paint();
/* 52 */                    this.f989B0 = new Rect();
/* 56 */                    this.f990C0.set(textPaint);
/* 65 */                    this.f991D0 = this.f990C0.getTextSize();
                        }
/* 67 */                Paint paint = this.f990C0;
/* 69 */                String str = this.f1004c0;
/* 78 */                paint.getTextBounds(str, 0, str.length(), this.f989B0);
/* 83 */                int iWidth = this.f989B0.width();
/* 98 */                int iHeight = (int) (this.f989B0.height() * 1.3f);
/* 108 */               float f2 = (this.f1020o0 - this.f1011g0) - this.f1010f0;
/* 118 */               float f3 = (this.f1021p0 - this.f1014i0) - this.f1012h0;
/* 119 */               if (zIsNaN) {
                            float f4 = iWidth;
/* 122 */                   float f5 = f4 * f3;
                            float f6 = iHeight;
/* 125 */                   float f7 = f6 * f2;
/* 129 */                   float f8 = this.f991D0;
/* 131 */                   if (f5 > f7) {
/* 135 */                       textPaint.setTextSize((f8 * f2) / f4);
                            } else {
/* 141 */                       textPaint.setTextSize((f8 * f3) / f6);
                            }
                        } else {
                            float f9 = iWidth;
                            float f10 = iHeight;
/* 158 */                   f = f9 * f3 > f10 * f2 ? f2 / f9 : f3 / f10;
                        }
                    }
/* 162 */           if (this.f1007e || !zIsNaN) {
                        float f11 = i;
                        float f12 = i2;
                        float f13 = i3;
                        float f14 = i4;
/* 174 */               if (this.f1026u0 != null) {
/* 178 */                   this.f1020o0 = f13 - f11;
/* 181 */                   this.f1021p0 = f14 - f12;
/* 183 */                   m500d();
                        }
/* 186 */               m497a(f);
                    }
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
/* 17 */            float f = Float.isNaN(this.f997V) ? 1.0f : this.f996U / this.f997V;
/* 18 */            super.onDraw(canvas);
/* 21 */            boolean z = this.f1007e;
/* 23 */            TextPaint textPaint = this.f999a;
/* 25 */            if (!z && f == 1.0f) {
/* 52 */                canvas.drawText(this.f1004c0, this.f1019n0 + this.f1010f0 + getHorizontalOffset(), this.f1012h0 + getVerticalOffset(), textPaint);
/* 55 */                return;
                    }
/* 58 */            if (this.f1006d0) {
/* 60 */                m497a(f);
                    }
/* 65 */            if (this.f1023r0 == null) {
/* 72 */                this.f1023r0 = new Matrix();
                    }
/* 76 */            if (!this.f1007e) {
/* 213 */               float horizontalOffset = this.f1010f0 + getHorizontalOffset();
/* 221 */               float verticalOffset = this.f1012h0 + getVerticalOffset();
/* 224 */               this.f1023r0.reset();
/* 229 */               this.f1023r0.preTranslate(horizontalOffset, verticalOffset);
/* 236 */               this.f1001b.transform(this.f1023r0);
/* 241 */               textPaint.setColor(this.f1003c);
/* 246 */               textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
/* 251 */               textPaint.setStrokeWidth(this.f1002b0);
/* 256 */               canvas.drawPath(this.f1001b, textPaint);
/* 261 */               this.f1023r0.reset();
/* 268 */               this.f1023r0.preTranslate(-horizontalOffset, -verticalOffset);
/* 275 */               this.f1001b.transform(this.f1023r0);
/* 278 */               return;
                    }
/* 78 */            Paint paint = this.f1033z0;
/* 80 */            paint.set(textPaint);
/* 85 */            this.f1023r0.reset();
/* 95 */            float horizontalOffset2 = this.f1010f0 + getHorizontalOffset();
/* 103 */           float verticalOffset2 = this.f1012h0 + getVerticalOffset();
/* 106 */           this.f1023r0.postTranslate(horizontalOffset2, verticalOffset2);
/* 111 */           this.f1023r0.preScale(f, f);
/* 118 */           this.f1001b.transform(this.f1023r0);
/* 123 */           if (this.f1025t0 != null) {
/* 126 */               textPaint.setFilterBitmap(true);
/* 131 */               textPaint.setShader(this.f1025t0);
                    } else {
/* 137 */               textPaint.setColor(this.f1003c);
                    }
/* 142 */           textPaint.setStyle(Paint.Style.FILL);
/* 147 */           textPaint.setStrokeWidth(this.f1002b0);
/* 152 */           canvas.drawPath(this.f1001b, textPaint);
/* 157 */           if (this.f1025t0 != null) {
/* 160 */               textPaint.setShader(null);
                    }
/* 165 */           textPaint.setColor(this.f1005d);
/* 170 */           textPaint.setStyle(Paint.Style.STROKE);
/* 175 */           textPaint.setStrokeWidth(this.f1002b0);
/* 180 */           canvas.drawPath(this.f1001b, textPaint);
/* 185 */           this.f1023r0.reset();
/* 192 */           this.f1023r0.postTranslate(-horizontalOffset2, -verticalOffset2);
/* 199 */           this.f1001b.transform(this.f1023r0);
/* 202 */           textPaint.set(paint);
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             int mode = View.MeasureSpec.getMode(i);
/* 5 */             int mode2 = View.MeasureSpec.getMode(i2);
/* 9 */             int size = View.MeasureSpec.getSize(i);
/* 13 */            int size2 = View.MeasureSpec.getSize(i2);
/* 18 */            this.f1018m0 = false;
/* 24 */            this.f1010f0 = getPaddingLeft();
/* 30 */            this.f1011g0 = getPaddingRight();
/* 36 */            this.f1012h0 = getPaddingTop();
/* 42 */            this.f1014i0 = getPaddingBottom();
/* 46 */            if (mode != 1073741824 || mode2 != 1073741824) {
/* 59 */                String str = this.f1004c0;
/* 61 */                int length = str.length();
/* 65 */                TextPaint textPaint = this.f999a;
/* 67 */                Rect rect = this.f1008e0;
/* 69 */                textPaint.getTextBounds(str, 0, length, rect);
/* 75 */                if (mode != 1073741824) {
/* 83 */                    size = (int) (rect.width() + 0.99999f);
                        }
/* 89 */                size += this.f1010f0 + this.f1011g0;
/* 90 */                if (mode2 != 1073741824) {
/* 99 */                    int fontMetricsInt = (int) (textPaint.getFontMetricsInt(null) + 0.99999f);
/* 102 */                   if (mode2 == Integer.MIN_VALUE) {
/* 104 */                       fontMetricsInt = Math.min(size2, fontMetricsInt);
                            }
/* 113 */                   size2 = this.f1012h0 + this.f1014i0 + fontMetricsInt;
                        }
                    } else if (this.f1017l0 != 0) {
/* 56 */                this.f1018m0 = true;
                    }
/* 114 */           setMeasuredDimension(size, size2);
                }

                public void setGravity(int i) {
/* 9 */             if ((i & 8388615) == 0) {
/* 11 */                i |= 8388611;
                    }
/* 14 */            if ((i & 112) == 0) {
/* 16 */                i |= 48;
                    }
/* 20 */            if (i != this.f1016k0) {
/* 22 */                invalidate();
                    }
/* 25 */            this.f1016k0 = i;
/* 27 */            int i2 = i & 112;
/* 36 */            if (i2 == 48) {
/* 48 */                this.f1032y0 = -1.0f;
                    } else if (i2 != 80) {
/* 42 */                this.f1032y0 = 0.0f;
                    } else {
/* 45 */                this.f1032y0 = 1.0f;
                    }
/* 50 */            int i3 = i & 8388615;
/* 52 */            if (i3 != 3) {
/* 55 */                if (i3 != 5) {
/* 57 */                    if (i3 != 8388611) {
/* 62 */                        if (i3 != 8388613) {
/* 64 */                            this.f1031x0 = 0.0f;
/* 66 */                            return;
                                }
                            }
                        }
/* 67 */                this.f1031x0 = 1.0f;
/* 69 */                return;
                    }
/* 70 */            this.f1031x0 = -1.0f;
                }

                public void setRound(float f) {
/* 5 */             if (Float.isNaN(f)) {
/* 7 */                 this.f1013i = f;
/* 9 */                 float f2 = this.f1009f;
/* 13 */                this.f1009f = -1.0f;
/* 15 */                setRoundPercent(f2);
/* 18 */                return;
                    }
/* 29 */            boolean z = this.f1013i != f;
/* 30 */            this.f1013i = f;
/* 35 */            if (f != 0.0f) {
/* 39 */                if (this.f1001b == null) {
/* 46 */                    this.f1001b = new Path();
                        }
/* 50 */                if (this.f1029w == null) {
/* 57 */                    this.f1029w = new RectF();
                        }
/* 61 */                if (this.f1027v == null) {
/* 66 */                    bk1 bk1Var = new bk1(this, 1);
/* 69 */                    this.f1027v = bk1Var;
/* 71 */                    setOutlineProvider(bk1Var);
                        }
/* 74 */                setClipToOutline(true);
/* 89 */                this.f1029w.set(0.0f, 0.0f, getWidth(), getHeight());
/* 94 */                this.f1001b.reset();
/* 97 */                Path path = this.f1001b;
/* 99 */                RectF rectF = this.f1029w;
/* 101 */               float f3 = this.f1013i;
/* 105 */               path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
                    } else {
/* 109 */               setClipToOutline(false);
                    }
/* 112 */           if (z) {
/* 114 */               invalidateOutline();
                    }
                }

                public void setRoundPercent(float f) {
/* 11 */            boolean z = this.f1009f != f;
/* 12 */            this.f1009f = f;
/* 17 */            if (f != 0.0f) {
/* 21 */                if (this.f1001b == null) {
/* 28 */                    this.f1001b = new Path();
                        }
/* 32 */                if (this.f1029w == null) {
/* 39 */                    this.f1029w = new RectF();
                        }
/* 43 */                if (this.f1027v == null) {
/* 48 */                    bk1 bk1Var = new bk1(this, 0);
/* 51 */                    this.f1027v = bk1Var;
/* 53 */                    setOutlineProvider(bk1Var);
                        }
/* 56 */                setClipToOutline(true);
/* 59 */                int width = getWidth();
/* 63 */                int height = getHeight();
/* 77 */                float fMin = (Math.min(width, height) * this.f1009f) / 2.0f;
/* 82 */                this.f1029w.set(0.0f, 0.0f, width, height);
/* 87 */                this.f1001b.reset();
/* 96 */                this.f1001b.addRoundRect(this.f1029w, fMin, fMin, Path.Direction.CW);
                    } else {
/* 100 */               setClipToOutline(false);
                    }
/* 103 */           if (z) {
/* 105 */               invalidateOutline();
                    }
                }

                public void setScaleFromTextSize(float f) {
/* 1 */             this.f997V = f;
                }

                public void setText(CharSequence charSequence) {
/* 5 */             this.f1004c0 = charSequence.toString();
/* 7 */             invalidate();
                }

                public void setTextBackgroundPanX(float f) {
/* 1 */             this.f992E0 = f;
/* 3 */             m500d();
/* 6 */             invalidate();
                }

                public void setTextBackgroundPanY(float f) {
/* 1 */             this.f993F0 = f;
/* 3 */             m500d();
/* 6 */             invalidate();
                }

                public void setTextBackgroundRotate(float f) {
/* 1 */             this.f995H0 = f;
/* 3 */             m500d();
/* 6 */             invalidate();
                }

                public void setTextBackgroundZoom(float f) {
/* 1 */             this.f994G0 = f;
/* 3 */             m500d();
/* 6 */             invalidate();
                }

                public void setTextFillColor(int i) {
/* 1 */             this.f1003c = i;
/* 3 */             invalidate();
                }

                public void setTextOutlineColor(int i) {
/* 1 */             this.f1005d = i;
/* 4 */             this.f1007e = true;
/* 6 */             invalidate();
                }

                public void setTextOutlineThickness(float f) {
/* 1 */             this.f1002b0 = f;
/* 4 */             this.f1007e = true;
/* 10 */            if (Float.isNaN(f)) {
/* 14 */                this.f1002b0 = 1.0f;
/* 17 */                this.f1007e = false;
                    }
/* 19 */            invalidate();
                }

                public void setTextPanX(float f) {
/* 1 */             this.f1031x0 = f;
/* 3 */             invalidate();
                }

                public void setTextPanY(float f) {
/* 1 */             this.f1032y0 = f;
/* 3 */             invalidate();
                }

                public void setTextSize(float f) {
/* 1 */             this.f996U = f;
/* 3 */             de3.m3037s();
/* 12 */            if (!Float.isNaN(this.f997V)) {
/* 15 */                f = this.f997V;
                    }
/* 19 */            this.f999a.setTextSize(f);
/* 38 */            m497a(Float.isNaN(this.f997V) ? 1.0f : this.f996U / this.f997V);
/* 41 */            requestLayout();
/* 44 */            invalidate();
                }

                public void setTextureHeight(float f) {
/* 1 */             this.f1028v0 = f;
/* 3 */             m500d();
/* 6 */             invalidate();
                }

                public void setTextureWidth(float f) {
/* 1 */             this.f1030w0 = f;
/* 3 */             m500d();
/* 6 */             invalidate();
                }

                public void setTypeface(Typeface typeface) {
/* 1 */             TextPaint textPaint = this.f999a;
/* 7 */             if (textPaint.getTypeface() != typeface) {
/* 9 */                 textPaint.setTypeface(typeface);
                    }
                }

/* 102 */       public MotionLabel(Context context, AttributeSet attributeSet, int i) {
/* 103 */           super(context, attributeSet, i);
/* 104 */           this.f999a = new TextPaint();
/* 105 */           this.f1001b = new Path();
/* 106 */           this.f1003c = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
/* 107 */           this.f1005d = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
/* 108 */           this.f1007e = false;
/* 109 */           this.f1009f = 0.0f;
/* 110 */           this.f1013i = Float.NaN;
/* 111 */           this.f996U = 48.0f;
/* 112 */           this.f997V = Float.NaN;
/* 113 */           this.f1002b0 = 0.0f;
/* 114 */           this.f1004c0 = "Hello World";
/* 115 */           this.f1006d0 = true;
/* 116 */           this.f1008e0 = new Rect();
/* 117 */           this.f1010f0 = 1;
/* 118 */           this.f1011g0 = 1;
/* 119 */           this.f1012h0 = 1;
/* 120 */           this.f1014i0 = 1;
/* 121 */           this.f1016k0 = 8388659;
/* 122 */           this.f1017l0 = 0;
/* 123 */           this.f1018m0 = false;
/* 124 */           this.f1028v0 = Float.NaN;
/* 125 */           this.f1030w0 = Float.NaN;
/* 126 */           this.f1031x0 = 0.0f;
/* 127 */           this.f1032y0 = 0.0f;
/* 128 */           this.f1033z0 = new Paint();
/* 129 */           this.f988A0 = 0;
/* 130 */           this.f992E0 = Float.NaN;
/* 131 */           this.f993F0 = Float.NaN;
/* 132 */           this.f994G0 = Float.NaN;
/* 133 */           this.f995H0 = Float.NaN;
/* 134 */           m498b(context, attributeSet);
                }
            }
