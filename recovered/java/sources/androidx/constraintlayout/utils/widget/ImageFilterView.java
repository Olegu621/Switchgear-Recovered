            package androidx.constraintlayout.utils.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Matrix;
            import android.graphics.Path;
            import android.graphics.RectF;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.LayerDrawable;
            import android.util.AttributeSet;
            import android.view.ViewOutlineProvider;
            import android.widget.ImageView;
            import androidx.appcompat.widget.AppCompatImageView;
            import androidx.constraintlayout.widget.R$styleable;
            import p000.ew0;
            import p000.fw0;
            import p000.mn0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 43 */    public class ImageFilterView extends AppCompatImageView {

                /* JADX INFO: renamed from: U */
                public RectF f956U;

                /* JADX INFO: renamed from: V */
                public final Drawable[] f957V;

                /* JADX INFO: renamed from: W */
                public LayerDrawable f958W;

                /* JADX INFO: renamed from: a */
                public final fw0 f959a;

                /* JADX INFO: renamed from: a0 */
                public float f960a0;

                /* JADX INFO: renamed from: b */
                public boolean f961b;

                /* JADX INFO: renamed from: b0 */
                public float f962b0;

                /* JADX INFO: renamed from: c */
                public Drawable f963c;

                /* JADX INFO: renamed from: c0 */
                public float f964c0;

                /* JADX INFO: renamed from: d */
                public Drawable f965d;

                /* JADX INFO: renamed from: d0 */
                public float f966d0;

                /* JADX INFO: renamed from: e */
                public float f967e;

                /* JADX INFO: renamed from: f */
                public float f968f;

                /* JADX INFO: renamed from: i */
                public float f969i;

                /* JADX INFO: renamed from: v */
                public Path f970v;

                /* JADX INFO: renamed from: w */
                public ViewOutlineProvider f971w;

                public ImageFilterView(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 9 */             this.f959a = new fw0();
/* 12 */            this.f961b = true;
/* 15 */            this.f963c = null;
/* 17 */            this.f965d = null;
/* 20 */            this.f967e = 0.0f;
/* 22 */            this.f968f = 0.0f;
/* 26 */            this.f969i = Float.NaN;
/* 31 */            this.f957V = new Drawable[2];
/* 33 */            this.f960a0 = Float.NaN;
/* 35 */            this.f962b0 = Float.NaN;
/* 37 */            this.f964c0 = Float.NaN;
/* 39 */            this.f966d0 = Float.NaN;
/* 41 */            m492c(attributeSet);
                }

                private void setOverlay(boolean z) {
/* 1 */             this.f961b = z;
                }

                /* JADX INFO: renamed from: c */
                public final void m492c(AttributeSet attributeSet) {
/* 1 */             if (attributeSet != null) {
/* 9 */                 TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ImageFilterView);
/* 13 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 23 */                this.f963c = typedArrayObtainStyledAttributes.getDrawable(R$styleable.ImageFilterView_altSrc);
/* 27 */                for (int i = 0; i < indexCount; i++) {
/* 29 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 36 */                    if (index == R$styleable.ImageFilterView_crossfade) {
/* 42 */                        this.f967e = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                            } else if (index == R$styleable.ImageFilterView_warmth) {
/* 54 */                        setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                            } else if (index == R$styleable.ImageFilterView_saturation) {
/* 67 */                        setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                            } else if (index == R$styleable.ImageFilterView_contrast) {
/* 80 */                        setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                            } else if (index == R$styleable.ImageFilterView_brightness) {
/* 93 */                        setBrightness(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                            } else if (index == R$styleable.ImageFilterView_round) {
/* 105 */                       setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                            } else if (index == R$styleable.ImageFilterView_roundPercent) {
/* 117 */                       setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                            } else if (index == R$styleable.ImageFilterView_overlay) {
/* 131 */                       setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f961b));
                            } else if (index == R$styleable.ImageFilterView_imagePanX) {
/* 145 */                       setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f960a0));
                            } else if (index == R$styleable.ImageFilterView_imagePanY) {
/* 159 */                       setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f962b0));
                            } else if (index == R$styleable.ImageFilterView_imageRotate) {
/* 173 */                       setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f966d0));
                            } else if (index == R$styleable.ImageFilterView_imageZoom) {
/* 187 */                       setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f964c0));
                            }
                        }
/* 194 */               typedArrayObtainStyledAttributes.recycle();
/* 197 */               Drawable drawable = getDrawable();
/* 201 */               this.f965d = drawable;
/* 203 */               Drawable drawable2 = this.f963c;
/* 205 */               Drawable[] drawableArr = this.f957V;
/* 207 */               if (drawable2 == null || drawable == null) {
/* 278 */                   Drawable drawable3 = getDrawable();
/* 282 */                   this.f965d = drawable3;
/* 284 */                   if (drawable3 != null) {
/* 286 */                       Drawable drawableMutate = drawable3.mutate();
/* 290 */                       this.f965d = drawableMutate;
/* 292 */                       drawableArr[0] = drawableMutate;
/* 294 */                       return;
                            }
/* 294 */                   return;
                        }
/* 215 */               Drawable drawableMutate2 = getDrawable().mutate();
/* 219 */               this.f965d = drawableMutate2;
/* 221 */               drawableArr[0] = drawableMutate2;
/* 230 */               drawableArr[1] = this.f963c.mutate();
/* 234 */               LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
/* 237 */               this.f958W = layerDrawable;
/* 249 */               layerDrawable.getDrawable(1).setAlpha((int) (this.f967e * 255.0f));
/* 254 */               if (!this.f961b) {
/* 269 */                   this.f958W.getDrawable(0).setAlpha((int) ((1.0f - this.f967e) * 255.0f));
                        }
/* 274 */               super.setImageDrawable(this.f958W);
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m493d() {
/* 7 */             if (Float.isNaN(this.f960a0) && Float.isNaN(this.f962b0) && Float.isNaN(this.f964c0) && Float.isNaN(this.f966d0)) {
/* 33 */                return;
                    }
/* 45 */            float f = Float.isNaN(this.f960a0) ? 0.0f : this.f960a0;
/* 57 */            float f2 = Float.isNaN(this.f962b0) ? 0.0f : this.f962b0;
/* 70 */            float f3 = Float.isNaN(this.f964c0) ? 1.0f : this.f964c0;
/* 81 */            float f4 = Float.isNaN(this.f966d0) ? 0.0f : this.f966d0;
/* 85 */            Matrix matrix = new Matrix();
/* 88 */            matrix.reset();
/* 95 */            float intrinsicWidth = getDrawable().getIntrinsicWidth();
/* 104 */           float intrinsicHeight = getDrawable().getIntrinsicHeight();
/* 109 */           float width = getWidth();
/* 114 */           float height = getHeight();
/* 132 */           float f5 = f3 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
/* 133 */           matrix.postScale(f5, f5);
/* 136 */           float f6 = intrinsicWidth * f5;
/* 145 */           float f7 = f5 * intrinsicHeight;
/* 152 */           matrix.postTranslate(((((width - f6) * f) + width) - f6) * 0.5f, ((((height - f7) * f2) + height) - f7) * 0.5f);
/* 159 */           matrix.postRotate(f4, width / 2.0f, height / 2.0f);
/* 162 */           setImageMatrix(matrix);
/* 167 */           setScaleType(ImageView.ScaleType.MATRIX);
                }

                /* JADX INFO: renamed from: e */
                public final void m494e() {
/* 7 */             if (Float.isNaN(this.f960a0) && Float.isNaN(this.f962b0) && Float.isNaN(this.f964c0) && Float.isNaN(this.f966d0)) {
/* 35 */                setScaleType(ImageView.ScaleType.FIT_CENTER);
                    } else {
/* 39 */                m493d();
                    }
                }

                public float getBrightness() {
/* 3 */             return this.f959a.f8377d;
                }

                public float getContrast() {
/* 3 */             return this.f959a.f8379f;
                }

                public float getCrossfade() {
/* 1 */             return this.f967e;
                }

                public float getImagePanX() {
/* 1 */             return this.f960a0;
                }

                public float getImagePanY() {
/* 1 */             return this.f962b0;
                }

                public float getImageRotate() {
/* 1 */             return this.f966d0;
                }

                public float getImageZoom() {
/* 1 */             return this.f964c0;
                }

                public float getRound() {
/* 1 */             return this.f969i;
                }

                public float getRoundPercent() {
/* 1 */             return this.f968f;
                }

                public float getSaturation() {
/* 3 */             return this.f959a.f8378e;
                }

                public float getWarmth() {
/* 3 */             return this.f959a.f8380g;
                }

                @Override // android.view.View
                public final void layout(int i, int i2, int i3, int i4) {
/* 1 */             super.layout(i, i2, i3, i4);
/* 4 */             m493d();
                }

                public void setAltImageResource(int i) {
/* 9 */             Drawable drawableMutate = mn0.m6700p(getContext(), i).mutate();
/* 13 */            this.f963c = drawableMutate;
/* 16 */            Drawable drawable = this.f965d;
/* 18 */            Drawable[] drawableArr = this.f957V;
/* 20 */            drawableArr[0] = drawable;
/* 23 */            drawableArr[1] = drawableMutate;
/* 27 */            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
/* 30 */            this.f958W = layerDrawable;
/* 32 */            super.setImageDrawable(layerDrawable);
/* 37 */            setCrossfade(this.f967e);
                }

                public void setBrightness(float f) {
/* 1 */             fw0 fw0Var = this.f959a;
/* 3 */             fw0Var.f8377d = f;
/* 5 */             fw0Var.m3849a(this);
                }

                public void setContrast(float f) {
/* 1 */             fw0 fw0Var = this.f959a;
/* 3 */             fw0Var.f8379f = f;
/* 5 */             fw0Var.m3849a(this);
                }

                public void setCrossfade(float f) {
/* 1 */             this.f967e = f;
/* 5 */             if (this.f957V != null) {
/* 11 */                if (!this.f961b) {
/* 27 */                    this.f958W.getDrawable(0).setAlpha((int) ((1.0f - this.f967e) * 255.0f));
                        }
/* 41 */                this.f958W.getDrawable(1).setAlpha((int) (this.f967e * 255.0f));
/* 46 */                super.setImageDrawable(this.f958W);
                    }
                }

                @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
                public void setImageDrawable(Drawable drawable) {
/* 3 */             if (this.f963c == null || drawable == null) {
/* 39 */                super.setImageDrawable(drawable);
/* 42 */                return;
                    }
/* 7 */             Drawable drawableMutate = drawable.mutate();
/* 11 */            this.f965d = drawableMutate;
/* 14 */            Drawable[] drawableArr = this.f957V;
/* 16 */            drawableArr[0] = drawableMutate;
/* 21 */            drawableArr[1] = this.f963c;
/* 25 */            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
/* 28 */            this.f958W = layerDrawable;
/* 30 */            super.setImageDrawable(layerDrawable);
/* 35 */            setCrossfade(this.f967e);
                }

                public void setImagePanX(float f) {
/* 1 */             this.f960a0 = f;
/* 3 */             m494e();
                }

                public void setImagePanY(float f) {
/* 1 */             this.f962b0 = f;
/* 3 */             m494e();
                }

                @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
                public void setImageResource(int i) {
/* 3 */             if (this.f963c == null) {
/* 45 */                super.setImageResource(i);
/* 48 */                return;
                    }
/* 13 */            Drawable drawableMutate = mn0.m6700p(getContext(), i).mutate();
/* 17 */            this.f965d = drawableMutate;
/* 20 */            Drawable[] drawableArr = this.f957V;
/* 22 */            drawableArr[0] = drawableMutate;
/* 27 */            drawableArr[1] = this.f963c;
/* 31 */            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
/* 34 */            this.f958W = layerDrawable;
/* 36 */            super.setImageDrawable(layerDrawable);
/* 41 */            setCrossfade(this.f967e);
                }

                public void setImageRotate(float f) {
/* 1 */             this.f966d0 = f;
/* 3 */             m494e();
                }

                public void setImageZoom(float f) {
/* 1 */             this.f964c0 = f;
/* 3 */             m494e();
                }

                public void setRound(float f) {
/* 5 */             if (Float.isNaN(f)) {
/* 7 */                 this.f969i = f;
/* 9 */                 float f2 = this.f968f;
/* 13 */                this.f968f = -1.0f;
/* 15 */                setRoundPercent(f2);
/* 18 */                return;
                    }
/* 29 */            boolean z = this.f969i != f;
/* 30 */            this.f969i = f;
/* 35 */            if (f != 0.0f) {
/* 39 */                if (this.f970v == null) {
/* 46 */                    this.f970v = new Path();
                        }
/* 50 */                if (this.f956U == null) {
/* 57 */                    this.f956U = new RectF();
                        }
/* 61 */                if (this.f971w == null) {
/* 66 */                    ew0 ew0Var = new ew0(this, 1);
/* 69 */                    this.f971w = ew0Var;
/* 71 */                    setOutlineProvider(ew0Var);
                        }
/* 74 */                setClipToOutline(true);
/* 89 */                this.f956U.set(0.0f, 0.0f, getWidth(), getHeight());
/* 94 */                this.f970v.reset();
/* 97 */                Path path = this.f970v;
/* 99 */                RectF rectF = this.f956U;
/* 101 */               float f3 = this.f969i;
/* 105 */               path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
                    } else {
/* 109 */               setClipToOutline(false);
                    }
/* 112 */           if (z) {
/* 114 */               invalidateOutline();
                    }
                }

                public void setRoundPercent(float f) {
/* 11 */            boolean z = this.f968f != f;
/* 12 */            this.f968f = f;
/* 17 */            if (f != 0.0f) {
/* 21 */                if (this.f970v == null) {
/* 28 */                    this.f970v = new Path();
                        }
/* 32 */                if (this.f956U == null) {
/* 39 */                    this.f956U = new RectF();
                        }
/* 43 */                if (this.f971w == null) {
/* 48 */                    ew0 ew0Var = new ew0(this, 0);
/* 51 */                    this.f971w = ew0Var;
/* 53 */                    setOutlineProvider(ew0Var);
                        }
/* 56 */                setClipToOutline(true);
/* 59 */                int width = getWidth();
/* 63 */                int height = getHeight();
/* 77 */                float fMin = (Math.min(width, height) * this.f968f) / 2.0f;
/* 82 */                this.f956U.set(0.0f, 0.0f, width, height);
/* 87 */                this.f970v.reset();
/* 96 */                this.f970v.addRoundRect(this.f956U, fMin, fMin, Path.Direction.CW);
                    } else {
/* 100 */               setClipToOutline(false);
                    }
/* 103 */           if (z) {
/* 105 */               invalidateOutline();
                    }
                }

                public void setSaturation(float f) {
/* 1 */             fw0 fw0Var = this.f959a;
/* 3 */             fw0Var.f8378e = f;
/* 5 */             fw0Var.m3849a(this);
                }

                public void setWarmth(float f) {
/* 1 */             fw0 fw0Var = this.f959a;
/* 3 */             fw0Var.f8380g = f;
/* 5 */             fw0Var.m3849a(this);
                }

/* 44 */        public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
/* 45 */            super(context, attributeSet, i);
/* 46 */            this.f959a = new fw0();
/* 47 */            this.f961b = true;
/* 48 */            this.f963c = null;
/* 49 */            this.f965d = null;
/* 50 */            this.f967e = 0.0f;
/* 51 */            this.f968f = 0.0f;
/* 52 */            this.f969i = Float.NaN;
/* 53 */            this.f957V = new Drawable[2];
/* 54 */            this.f960a0 = Float.NaN;
/* 55 */            this.f962b0 = Float.NaN;
/* 56 */            this.f964c0 = Float.NaN;
/* 57 */            this.f966d0 = Float.NaN;
/* 58 */            m492c(attributeSet);
                }
            }
