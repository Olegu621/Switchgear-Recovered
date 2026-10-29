            package androidx.constraintlayout.helper.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.View;
            import androidx.constraintlayout.widget.ConstraintHelper;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import androidx.constraintlayout.widget.R$styleable;
            import p000.C2569zz;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 40 */    public class Layer extends ConstraintHelper {

                /* JADX INFO: renamed from: U */
                public float f845U;

                /* JADX INFO: renamed from: V */
                public float f846V;

                /* JADX INFO: renamed from: W */
                public ConstraintLayout f847W;

                /* JADX INFO: renamed from: a0 */
                public float f848a0;

                /* JADX INFO: renamed from: b0 */
                public float f849b0;

                /* JADX INFO: renamed from: c0 */
                public float f850c0;

                /* JADX INFO: renamed from: d0 */
                public float f851d0;

                /* JADX INFO: renamed from: e0 */
                public float f852e0;

                /* JADX INFO: renamed from: f0 */
                public float f853f0;

                /* JADX INFO: renamed from: g0 */
                public float f854g0;

                /* JADX INFO: renamed from: h0 */
                public float f855h0;

                /* JADX INFO: renamed from: i0 */
                public final boolean f856i0;

                /* JADX INFO: renamed from: j0 */
                public View[] f857j0;

                /* JADX INFO: renamed from: k0 */
                public float f858k0;

                /* JADX INFO: renamed from: l0 */
                public float f859l0;

                /* JADX INFO: renamed from: m0 */
                public boolean f860m0;

                /* JADX INFO: renamed from: n0 */
                public boolean f861n0;

                /* JADX INFO: renamed from: w */
                public float f862w;

                public Layer(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 6 */             this.f862w = Float.NaN;
/* 8 */             this.f845U = Float.NaN;
/* 10 */            this.f846V = Float.NaN;
/* 14 */            this.f848a0 = 1.0f;
/* 16 */            this.f849b0 = 1.0f;
/* 18 */            this.f850c0 = Float.NaN;
/* 20 */            this.f851d0 = Float.NaN;
/* 22 */            this.f852e0 = Float.NaN;
/* 24 */            this.f853f0 = Float.NaN;
/* 26 */            this.f854g0 = Float.NaN;
/* 28 */            this.f855h0 = Float.NaN;
/* 31 */            this.f856i0 = true;
/* 34 */            this.f857j0 = null;
/* 37 */            this.f858k0 = 0.0f;
/* 39 */            this.f859l0 = 0.0f;
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: g */
                public final void mo460g(ConstraintLayout constraintLayout) {
/* 1 */             m507f(constraintLayout);
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: k */
                public final void mo454k(AttributeSet attributeSet) {
/* 1 */             super.mo454k(attributeSet);
/* 4 */             if (attributeSet != null) {
/* 12 */                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
/* 16 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 21 */                for (int i = 0; i < indexCount; i++) {
/* 23 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 30 */                    if (index == R$styleable.ConstraintLayout_Layout_android_visibility) {
/* 32 */                        this.f860m0 = true;
                            } else if (index == R$styleable.ConstraintLayout_Layout_android_elevation) {
/* 39 */                        this.f861n0 = true;
                            }
                        }
/* 44 */                typedArrayObtainStyledAttributes.recycle();
                    }
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: n */
                public final void mo461n() {
/* 1 */             m464s();
/* 6 */             this.f850c0 = Float.NaN;
/* 8 */             this.f851d0 = Float.NaN;
/* 16 */            C2569zz c2569zz = ((ConstraintLayout.LayoutParams) getLayoutParams()).f1129q0;
/* 19 */            c2569zz.m10464P(0);
/* 22 */            c2569zz.m10461M(0);
/* 25 */            m463r();
/* 60 */            layout(((int) this.f854g0) - getPaddingLeft(), ((int) this.f855h0) - getPaddingTop(), getPaddingRight() + ((int) this.f852e0), getPaddingBottom() + ((int) this.f853f0));
/* 63 */            m465t();
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: o */
                public final void mo462o(ConstraintLayout constraintLayout) {
/* 1 */             this.f847W = constraintLayout;
/* 3 */             float rotation = getRotation();
/* 10 */            if (rotation != 0.0f) {
/* 23 */                this.f846V = rotation;
                    } else {
/* 18 */                if (Float.isNaN(this.f846V)) {
/* 22 */                    return;
                        }
/* 20 */                this.f846V = rotation;
                    }
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 10 */            this.f847W = (ConstraintLayout) getParent();
/* 14 */            if (this.f860m0 || this.f861n0) {
/* 20 */                int visibility = getVisibility();
/* 24 */                float elevation = getElevation();
/* 31 */                for (int i = 0; i < this.f1045b; i++) {
/* 39 */                    View viewM513b = this.f847W.m513b(this.f1044a[i]);
/* 43 */                    if (viewM513b != null) {
/* 47 */                        if (this.f860m0) {
/* 49 */                            viewM513b.setVisibility(visibility);
                                }
/* 54 */                        if (this.f861n0 && elevation > 0.0f) {
/* 66 */                            viewM513b.setTranslationZ(viewM513b.getTranslationZ() + elevation);
                                }
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: r */
                public final void m463r() {
/* 3 */             if (this.f847W == null) {
/* 26 */                return;
                    }
/* 8 */             if (this.f856i0 || Float.isNaN(this.f850c0) || Float.isNaN(this.f851d0)) {
/* 33 */                if (!Float.isNaN(this.f862w) && !Float.isNaN(this.f845U)) {
/* 46 */                    this.f851d0 = this.f845U;
/* 50 */                    this.f850c0 = this.f862w;
/* 52 */                    return;
                        }
/* 55 */                View[] viewArrM510j = m510j(this.f847W);
/* 62 */                int left = viewArrM510j[0].getLeft();
/* 68 */                int top = viewArrM510j[0].getTop();
/* 74 */                int right = viewArrM510j[0].getRight();
/* 80 */                int bottom = viewArrM510j[0].getBottom();
/* 86 */                for (int i = 0; i < this.f1045b; i++) {
/* 88 */                    View view = viewArrM510j[i];
/* 94 */                    left = Math.min(left, view.getLeft());
/* 102 */                   top = Math.min(top, view.getTop());
/* 110 */                   right = Math.max(right, view.getRight());
/* 118 */                   bottom = Math.max(bottom, view.getBottom());
                        }
/* 126 */               this.f852e0 = right;
/* 129 */               this.f853f0 = bottom;
/* 132 */               this.f854g0 = left;
/* 135 */               this.f855h0 = top;
/* 143 */               if (Float.isNaN(this.f862w)) {
/* 149 */                   this.f850c0 = (left + right) / 2;
                        } else {
/* 154 */                   this.f850c0 = this.f862w;
                        }
/* 162 */               if (Float.isNaN(this.f845U)) {
/* 168 */                   this.f851d0 = (top + bottom) / 2;
                        } else {
/* 173 */                   this.f851d0 = this.f845U;
                        }
                    }
                }

                /* JADX INFO: renamed from: s */
                public final void m464s() {
                    int i;
/* 3 */             if (this.f847W == null || (i = this.f1045b) == 0) {
/* 44 */                return;
                    }
/* 11 */            View[] viewArr = this.f857j0;
/* 13 */            if (viewArr == null || viewArr.length != i) {
/* 20 */                this.f857j0 = new View[i];
                    }
/* 25 */            for (int i2 = 0; i2 < this.f1045b; i2++) {
/* 39 */                this.f857j0[i2] = this.f847W.m513b(this.f1044a[i2]);
                    }
                }

                @Override // android.view.View
                public void setElevation(float f) {
/* 1 */             super.setElevation(f);
/* 4 */             m506e();
                }

                @Override // android.view.View
                public void setPivotX(float f) {
/* 1 */             this.f862w = f;
/* 3 */             m465t();
                }

                @Override // android.view.View
                public void setPivotY(float f) {
/* 1 */             this.f845U = f;
/* 3 */             m465t();
                }

                @Override // android.view.View
                public void setRotation(float f) {
/* 1 */             this.f846V = f;
/* 3 */             m465t();
                }

                @Override // android.view.View
                public void setScaleX(float f) {
/* 1 */             this.f848a0 = f;
/* 3 */             m465t();
                }

                @Override // android.view.View
                public void setScaleY(float f) {
/* 1 */             this.f849b0 = f;
/* 3 */             m465t();
                }

                @Override // android.view.View
                public void setTranslationX(float f) {
/* 1 */             this.f858k0 = f;
/* 3 */             m465t();
                }

                @Override // android.view.View
                public void setTranslationY(float f) {
/* 1 */             this.f859l0 = f;
/* 3 */             m465t();
                }

                @Override // android.view.View
                public void setVisibility(int i) {
/* 1 */             super.setVisibility(i);
/* 4 */             m506e();
                }

                /* JADX INFO: renamed from: t */
                public final void m465t() {
/* 3 */             if (this.f847W == null) {
/* 143 */               return;
                    }
/* 9 */             if (this.f857j0 == null) {
/* 11 */                m464s();
                    }
/* 14 */            m463r();
/* 31 */            double radians = Float.isNaN(this.f846V) ? 0.0d : Math.toRadians(this.f846V);
/* 39 */            float fSin = (float) Math.sin(radians);
/* 44 */            float fCos = (float) Math.cos(radians);
/* 45 */            float f = this.f848a0;
/* 47 */            float f2 = f * fCos;
/* 49 */            float f3 = this.f849b0;
/* 52 */            float f4 = (-f3) * fSin;
/* 53 */            float f5 = f * fSin;
/* 54 */            float f6 = f3 * fCos;
/* 58 */            for (int i = 0; i < this.f1045b; i++) {
/* 62 */                View view = this.f857j0[i];
/* 73 */                int right = (view.getRight() + view.getLeft()) / 2;
/* 84 */                int bottom = (view.getBottom() + view.getTop()) / 2;
/* 89 */                float f7 = right - this.f850c0;
/* 93 */                float f8 = bottom - this.f851d0;
/* 102 */               float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.f858k0;
/* 110 */               float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.f859l0;
/* 111 */               view.setTranslationX(f9);
/* 114 */               view.setTranslationY(f10);
/* 119 */               view.setScaleY(this.f849b0);
/* 124 */               view.setScaleX(this.f848a0);
/* 133 */               if (!Float.isNaN(this.f846V)) {
/* 137 */                   view.setRotation(this.f846V);
                        }
                    }
                }

/* 41 */        public Layer(Context context, AttributeSet attributeSet, int i) {
/* 42 */            super(context, attributeSet, i);
/* 43 */            this.f862w = Float.NaN;
/* 44 */            this.f845U = Float.NaN;
/* 45 */            this.f846V = Float.NaN;
/* 46 */            this.f848a0 = 1.0f;
/* 47 */            this.f849b0 = 1.0f;
/* 48 */            this.f850c0 = Float.NaN;
/* 49 */            this.f851d0 = Float.NaN;
/* 50 */            this.f852e0 = Float.NaN;
/* 51 */            this.f853f0 = Float.NaN;
/* 52 */            this.f854g0 = Float.NaN;
/* 53 */            this.f855h0 = Float.NaN;
/* 54 */            this.f856i0 = true;
/* 55 */            this.f857j0 = null;
/* 56 */            this.f858k0 = 0.0f;
/* 57 */            this.f859l0 = 0.0f;
                }
            }
