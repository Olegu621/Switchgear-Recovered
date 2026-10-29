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
            import androidx.appcompat.widget.AppCompatImageButton;
            import androidx.constraintlayout.widget.R$styleable;
            import p000.dw0;
            import p000.fw0;
            import p000.mn0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 43 */    public class ImageFilterButton extends AppCompatImageButton {

                /* JADX INFO: renamed from: U */
                public RectF f940U;

                /* JADX INFO: renamed from: V */
                public final Drawable[] f941V;

                /* JADX INFO: renamed from: W */
                public LayerDrawable f942W;

                /* JADX INFO: renamed from: a0 */
                public boolean f943a0;

                /* JADX INFO: renamed from: b0 */
                public Drawable f944b0;

                /* JADX INFO: renamed from: c0 */
                public Drawable f945c0;

                /* JADX INFO: renamed from: d */
                public final fw0 f946d;

                /* JADX INFO: renamed from: d0 */
                public float f947d0;

                /* JADX INFO: renamed from: e */
                public float f948e;

                /* JADX INFO: renamed from: e0 */
                public float f949e0;

                /* JADX INFO: renamed from: f */
                public float f950f;

                /* JADX INFO: renamed from: f0 */
                public float f951f0;

                /* JADX INFO: renamed from: g0 */
                public float f952g0;

                /* JADX INFO: renamed from: i */
                public float f953i;

                /* JADX INFO: renamed from: v */
                public Path f954v;

                /* JADX INFO: renamed from: w */
                public ViewOutlineProvider f955w;

                public ImageFilterButton(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 9 */             this.f946d = new fw0();
/* 12 */            this.f948e = 0.0f;
/* 14 */            this.f950f = 0.0f;
/* 18 */            this.f953i = Float.NaN;
/* 23 */            this.f941V = new Drawable[2];
/* 26 */            this.f943a0 = true;
/* 29 */            this.f944b0 = null;
/* 31 */            this.f945c0 = null;
/* 33 */            this.f947d0 = Float.NaN;
/* 35 */            this.f949e0 = Float.NaN;
/* 37 */            this.f951f0 = Float.NaN;
/* 39 */            this.f952g0 = Float.NaN;
/* 41 */            m489a(attributeSet);
                }

                private void setOverlay(boolean z) {
/* 1 */             this.f943a0 = z;
                }

                /* JADX INFO: renamed from: a */
                public final void m489a(AttributeSet attributeSet) {
/* 2 */             setPadding(0, 0, 0, 0);
/* 5 */             if (attributeSet != null) {
/* 13 */                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ImageFilterView);
/* 17 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 27 */                this.f944b0 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.ImageFilterView_altSrc);
/* 30 */                for (int i = 0; i < indexCount; i++) {
/* 32 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 39 */                    if (index == R$styleable.ImageFilterView_crossfade) {
/* 45 */                        this.f948e = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                            } else if (index == R$styleable.ImageFilterView_warmth) {
/* 57 */                        setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                            } else if (index == R$styleable.ImageFilterView_saturation) {
/* 70 */                        setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                            } else if (index == R$styleable.ImageFilterView_contrast) {
/* 83 */                        setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                            } else if (index == R$styleable.ImageFilterView_round) {
/* 95 */                        setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                            } else if (index == R$styleable.ImageFilterView_roundPercent) {
/* 107 */                       setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                            } else if (index == R$styleable.ImageFilterView_overlay) {
/* 121 */                       setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f943a0));
                            } else if (index == R$styleable.ImageFilterView_imagePanX) {
/* 135 */                       setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f947d0));
                            } else if (index == R$styleable.ImageFilterView_imagePanY) {
/* 149 */                       setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f949e0));
                            } else if (index == R$styleable.ImageFilterView_imageRotate) {
/* 163 */                       setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f952g0));
                            } else if (index == R$styleable.ImageFilterView_imageZoom) {
/* 177 */                       setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f951f0));
                            }
                        }
/* 184 */               typedArrayObtainStyledAttributes.recycle();
/* 187 */               Drawable drawable = getDrawable();
/* 191 */               this.f945c0 = drawable;
/* 193 */               Drawable drawable2 = this.f944b0;
/* 195 */               Drawable[] drawableArr = this.f941V;
/* 197 */               if (drawable2 == null || drawable == null) {
/* 268 */                   Drawable drawable3 = getDrawable();
/* 272 */                   this.f945c0 = drawable3;
/* 274 */                   if (drawable3 != null) {
/* 276 */                       Drawable drawableMutate = drawable3.mutate();
/* 280 */                       this.f945c0 = drawableMutate;
/* 282 */                       drawableArr[0] = drawableMutate;
/* 284 */                       return;
                            }
/* 284 */                   return;
                        }
/* 205 */               Drawable drawableMutate2 = getDrawable().mutate();
/* 209 */               this.f945c0 = drawableMutate2;
/* 211 */               drawableArr[0] = drawableMutate2;
/* 220 */               drawableArr[1] = this.f944b0.mutate();
/* 224 */               LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
/* 227 */               this.f942W = layerDrawable;
/* 239 */               layerDrawable.getDrawable(1).setAlpha((int) (this.f948e * 255.0f));
/* 244 */               if (!this.f943a0) {
/* 259 */                   this.f942W.getDrawable(0).setAlpha((int) ((1.0f - this.f948e) * 255.0f));
                        }
/* 264 */               super.setImageDrawable(this.f942W);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m490b() {
/* 7 */             if (Float.isNaN(this.f947d0) && Float.isNaN(this.f949e0) && Float.isNaN(this.f951f0) && Float.isNaN(this.f952g0)) {
/* 33 */                return;
                    }
/* 45 */            float f = Float.isNaN(this.f947d0) ? 0.0f : this.f947d0;
/* 57 */            float f2 = Float.isNaN(this.f949e0) ? 0.0f : this.f949e0;
/* 70 */            float f3 = Float.isNaN(this.f951f0) ? 1.0f : this.f951f0;
/* 81 */            float f4 = Float.isNaN(this.f952g0) ? 0.0f : this.f952g0;
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

                /* JADX INFO: renamed from: c */
                public final void m491c() {
/* 7 */             if (Float.isNaN(this.f947d0) && Float.isNaN(this.f949e0) && Float.isNaN(this.f951f0) && Float.isNaN(this.f952g0)) {
/* 35 */                setScaleType(ImageView.ScaleType.FIT_CENTER);
                    } else {
/* 39 */                m490b();
                    }
                }

                public float getContrast() {
/* 3 */             return this.f946d.f8379f;
                }

                public float getCrossfade() {
/* 1 */             return this.f948e;
                }

                public float getImagePanX() {
/* 1 */             return this.f947d0;
                }

                public float getImagePanY() {
/* 1 */             return this.f949e0;
                }

                public float getImageRotate() {
/* 1 */             return this.f952g0;
                }

                public float getImageZoom() {
/* 1 */             return this.f951f0;
                }

                public float getRound() {
/* 1 */             return this.f953i;
                }

                public float getRoundPercent() {
/* 1 */             return this.f950f;
                }

                public float getSaturation() {
/* 3 */             return this.f946d.f8378e;
                }

                public float getWarmth() {
/* 3 */             return this.f946d.f8380g;
                }

                @Override // android.view.View
                public final void layout(int i, int i2, int i3, int i4) {
/* 1 */             super.layout(i, i2, i3, i4);
/* 4 */             m490b();
                }

                public void setAltImageResource(int i) {
/* 9 */             Drawable drawableMutate = mn0.m6700p(getContext(), i).mutate();
/* 13 */            this.f944b0 = drawableMutate;
/* 16 */            Drawable drawable = this.f945c0;
/* 18 */            Drawable[] drawableArr = this.f941V;
/* 20 */            drawableArr[0] = drawable;
/* 23 */            drawableArr[1] = drawableMutate;
/* 27 */            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
/* 30 */            this.f942W = layerDrawable;
/* 32 */            super.setImageDrawable(layerDrawable);
/* 37 */            setCrossfade(this.f948e);
                }

                public void setBrightness(float f) {
/* 1 */             fw0 fw0Var = this.f946d;
/* 3 */             fw0Var.f8377d = f;
/* 5 */             fw0Var.m3849a(this);
                }

                public void setContrast(float f) {
/* 1 */             fw0 fw0Var = this.f946d;
/* 3 */             fw0Var.f8379f = f;
/* 5 */             fw0Var.m3849a(this);
                }

                public void setCrossfade(float f) {
/* 1 */             this.f948e = f;
/* 5 */             if (this.f941V != null) {
/* 11 */                if (!this.f943a0) {
/* 27 */                    this.f942W.getDrawable(0).setAlpha((int) ((1.0f - this.f948e) * 255.0f));
                        }
/* 41 */                this.f942W.getDrawable(1).setAlpha((int) (this.f948e * 255.0f));
/* 46 */                super.setImageDrawable(this.f942W);
                    }
                }

                @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
                public void setImageDrawable(Drawable drawable) {
/* 3 */             if (this.f944b0 == null || drawable == null) {
/* 39 */                super.setImageDrawable(drawable);
/* 42 */                return;
                    }
/* 7 */             Drawable drawableMutate = drawable.mutate();
/* 11 */            this.f945c0 = drawableMutate;
/* 14 */            Drawable[] drawableArr = this.f941V;
/* 16 */            drawableArr[0] = drawableMutate;
/* 21 */            drawableArr[1] = this.f944b0;
/* 25 */            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
/* 28 */            this.f942W = layerDrawable;
/* 30 */            super.setImageDrawable(layerDrawable);
/* 35 */            setCrossfade(this.f948e);
                }

                public void setImagePanX(float f) {
/* 1 */             this.f947d0 = f;
/* 3 */             m491c();
                }

                public void setImagePanY(float f) {
/* 1 */             this.f949e0 = f;
/* 3 */             m491c();
                }

                @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
                public void setImageResource(int i) {
/* 3 */             if (this.f944b0 == null) {
/* 45 */                super.setImageResource(i);
/* 48 */                return;
                    }
/* 13 */            Drawable drawableMutate = mn0.m6700p(getContext(), i).mutate();
/* 17 */            this.f945c0 = drawableMutate;
/* 20 */            Drawable[] drawableArr = this.f941V;
/* 22 */            drawableArr[0] = drawableMutate;
/* 27 */            drawableArr[1] = this.f944b0;
/* 31 */            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
/* 34 */            this.f942W = layerDrawable;
/* 36 */            super.setImageDrawable(layerDrawable);
/* 41 */            setCrossfade(this.f948e);
                }

                public void setImageRotate(float f) {
/* 1 */             this.f952g0 = f;
/* 3 */             m491c();
                }

                public void setImageZoom(float f) {
/* 1 */             this.f951f0 = f;
/* 3 */             m491c();
                }

                public void setRound(float f) {
/* 5 */             if (Float.isNaN(f)) {
/* 7 */                 this.f953i = f;
/* 9 */                 float f2 = this.f950f;
/* 13 */                this.f950f = -1.0f;
/* 15 */                setRoundPercent(f2);
/* 18 */                return;
                    }
/* 29 */            boolean z = this.f953i != f;
/* 30 */            this.f953i = f;
/* 35 */            if (f != 0.0f) {
/* 39 */                if (this.f954v == null) {
/* 46 */                    this.f954v = new Path();
                        }
/* 50 */                if (this.f940U == null) {
/* 57 */                    this.f940U = new RectF();
                        }
/* 61 */                if (this.f955w == null) {
/* 66 */                    dw0 dw0Var = new dw0(this, 1);
/* 69 */                    this.f955w = dw0Var;
/* 71 */                    setOutlineProvider(dw0Var);
                        }
/* 74 */                setClipToOutline(true);
/* 89 */                this.f940U.set(0.0f, 0.0f, getWidth(), getHeight());
/* 94 */                this.f954v.reset();
/* 97 */                Path path = this.f954v;
/* 99 */                RectF rectF = this.f940U;
/* 101 */               float f3 = this.f953i;
/* 105 */               path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
                    } else {
/* 109 */               setClipToOutline(false);
                    }
/* 112 */           if (z) {
/* 114 */               invalidateOutline();
                    }
                }

                public void setRoundPercent(float f) {
/* 11 */            boolean z = this.f950f != f;
/* 12 */            this.f950f = f;
/* 17 */            if (f != 0.0f) {
/* 21 */                if (this.f954v == null) {
/* 28 */                    this.f954v = new Path();
                        }
/* 32 */                if (this.f940U == null) {
/* 39 */                    this.f940U = new RectF();
                        }
/* 43 */                if (this.f955w == null) {
/* 48 */                    dw0 dw0Var = new dw0(this, 0);
/* 51 */                    this.f955w = dw0Var;
/* 53 */                    setOutlineProvider(dw0Var);
                        }
/* 56 */                setClipToOutline(true);
/* 59 */                int width = getWidth();
/* 63 */                int height = getHeight();
/* 77 */                float fMin = (Math.min(width, height) * this.f950f) / 2.0f;
/* 82 */                this.f940U.set(0.0f, 0.0f, width, height);
/* 87 */                this.f954v.reset();
/* 96 */                this.f954v.addRoundRect(this.f940U, fMin, fMin, Path.Direction.CW);
                    } else {
/* 100 */               setClipToOutline(false);
                    }
/* 103 */           if (z) {
/* 105 */               invalidateOutline();
                    }
                }

                public void setSaturation(float f) {
/* 1 */             fw0 fw0Var = this.f946d;
/* 3 */             fw0Var.f8378e = f;
/* 5 */             fw0Var.m3849a(this);
                }

                public void setWarmth(float f) {
/* 1 */             fw0 fw0Var = this.f946d;
/* 3 */             fw0Var.f8380g = f;
/* 5 */             fw0Var.m3849a(this);
                }

/* 44 */        public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
/* 45 */            super(context, attributeSet, i);
/* 46 */            this.f946d = new fw0();
/* 47 */            this.f948e = 0.0f;
/* 48 */            this.f950f = 0.0f;
/* 49 */            this.f953i = Float.NaN;
/* 50 */            this.f941V = new Drawable[2];
/* 51 */            this.f943a0 = true;
/* 52 */            this.f944b0 = null;
/* 53 */            this.f945c0 = null;
/* 54 */            this.f947d0 = Float.NaN;
/* 55 */            this.f949e0 = Float.NaN;
/* 56 */            this.f951f0 = Float.NaN;
/* 57 */            this.f952g0 = Float.NaN;
/* 58 */            m489a(attributeSet);
                }
            }
