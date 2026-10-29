            package com.google.android.material.internal;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.Gravity;
            import androidx.appcompat.widget.LinearLayoutCompat;
            import com.google.android.material.R$styleable;
            import p000.rn2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 71 */    public class ForegroundLinearLayout extends LinearLayoutCompat {

                /* JADX INFO: renamed from: d0 */
                public Drawable f4789d0;

                /* JADX INFO: renamed from: e0 */
                public final Rect f4790e0;

                /* JADX INFO: renamed from: f0 */
                public final Rect f4791f0;

                /* JADX INFO: renamed from: g0 */
                public int f4792g0;

                /* JADX INFO: renamed from: h0 */
                public final boolean f4793h0;

                /* JADX INFO: renamed from: i0 */
                public boolean f4794i0;

                public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 9 */             this.f4790e0 = new Rect();
/* 16 */            this.f4791f0 = new Rect();
/* 20 */            this.f4792g0 = 119;
/* 23 */            this.f4793h0 = true;
/* 26 */            this.f4794i0 = false;
/* 36 */            TypedArray typedArrayM8213d = rn2.m8213d(context, attributeSet, R$styleable.ForegroundLinearLayout, i, 0, new int[0]);
/* 48 */            this.f4792g0 = typedArrayM8213d.getInt(R$styleable.ForegroundLinearLayout_android_foregroundGravity, this.f4792g0);
/* 52 */            Drawable drawable = typedArrayM8213d.getDrawable(R$styleable.ForegroundLinearLayout_android_foreground);
/* 56 */            if (drawable != null) {
/* 58 */                setForeground(drawable);
                    }
/* 67 */            this.f4793h0 = typedArrayM8213d.getBoolean(R$styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
/* 69 */            typedArrayM8213d.recycle();
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
/* 1 */             super.draw(canvas);
/* 4 */             Drawable drawable = this.f4789d0;
/* 6 */             if (drawable != null) {
/* 10 */                if (this.f4794i0) {
/* 13 */                    this.f4794i0 = false;
/* 23 */                    int right = getRight() - getLeft();
/* 32 */                    int bottom = getBottom() - getTop();
/* 33 */                    boolean z = this.f4793h0;
/* 35 */                    Rect rect = this.f4790e0;
/* 37 */                    if (z) {
/* 39 */                        rect.set(0, 0, right, bottom);
                            } else {
/* 61 */                        rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                            }
/* 64 */                    int i = this.f4792g0;
/* 66 */                    int intrinsicWidth = drawable.getIntrinsicWidth();
/* 70 */                    int intrinsicHeight = drawable.getIntrinsicHeight();
/* 74 */                    Rect rect2 = this.f4791f0;
/* 76 */                    Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
/* 79 */                    drawable.setBounds(rect2);
                        }
/* 82 */                drawable.draw(canvas);
                    }
                }

                @Override // android.view.View
                public final void drawableHotspotChanged(float f, float f2) {
/* 1 */             super.drawableHotspotChanged(f, f2);
/* 4 */             Drawable drawable = this.f4789d0;
/* 6 */             if (drawable != null) {
/* 8 */                 drawable.setHotspot(f, f2);
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             Drawable drawable = this.f4789d0;
/* 6 */             if (drawable == null || !drawable.isStateful()) {
/* 23 */                return;
                    }
/* 20 */            this.f4789d0.setState(getDrawableState());
                }

                @Override // android.view.View
                public Drawable getForeground() {
/* 1 */             return this.f4789d0;
                }

                @Override // android.view.View
                public int getForegroundGravity() {
/* 1 */             return this.f4792g0;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void jumpDrawablesToCurrentState() {
/* 1 */             super.jumpDrawablesToCurrentState();
/* 4 */             Drawable drawable = this.f4789d0;
/* 6 */             if (drawable != null) {
/* 8 */                 drawable.jumpToCurrentState();
                    }
                }

                @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 7 */             this.f4794i0 = z | this.f4794i0;
                }

                @Override // android.view.View
                public final void onSizeChanged(int i, int i2, int i3, int i4) {
/* 1 */             super.onSizeChanged(i, i2, i3, i4);
/* 5 */             this.f4794i0 = true;
                }

                @Override // android.view.View
                public void setForeground(Drawable drawable) {
/* 1 */             Drawable drawable2 = this.f4789d0;
/* 3 */             if (drawable2 != drawable) {
/* 5 */                 if (drawable2 != null) {
/* 8 */                     drawable2.setCallback(null);
/* 13 */                    unscheduleDrawable(this.f4789d0);
                        }
/* 16 */                this.f4789d0 = drawable;
/* 18 */                if (drawable != null) {
/* 21 */                    setWillNotDraw(false);
/* 24 */                    drawable.setCallback(this);
/* 31 */                    if (drawable.isStateful()) {
/* 37 */                        drawable.setState(getDrawableState());
                            }
/* 44 */                    if (this.f4792g0 == 119) {
/* 51 */                        drawable.getPadding(new Rect());
                            }
                        } else {
/* 56 */                    setWillNotDraw(true);
                        }
/* 59 */                requestLayout();
/* 62 */                invalidate();
                    }
                }

                @Override // android.view.View
                public void setForegroundGravity(int i) {
/* 3 */             if (this.f4792g0 != i) {
/* 9 */                 if ((8388615 & i) == 0) {
/* 14 */                    i |= 8388611;
                        }
/* 17 */                if ((i & 112) == 0) {
/* 19 */                    i |= 48;
                        }
/* 21 */                this.f4792g0 = i;
/* 25 */                if (i == 119 && this.f4789d0 != null) {
/* 38 */                    this.f4789d0.getPadding(new Rect());
                        }
/* 41 */                requestLayout();
                    }
                }

                @Override // android.view.View
                public final boolean verifyDrawable(Drawable drawable) {
                    return super.verifyDrawable(drawable) || drawable == this.f4789d0;
                }

/* 72 */        public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
/* 73 */            this(context, attributeSet, 0);
                }
            }
