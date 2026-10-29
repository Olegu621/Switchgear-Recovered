            package androidx.constraintlayout.helper.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.util.SparseArray;
            import android.view.View;
            import androidx.constraintlayout.widget.C0076c;
            import androidx.constraintlayout.widget.Constraints;
            import androidx.constraintlayout.widget.R$styleable;
            import androidx.constraintlayout.widget.VirtualLayout;
            import p000.C2569zz;
            import p000.cu0;
            import p000.gk0;
            import p000.y53;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public class Flow extends VirtualLayout {

                /* JADX INFO: renamed from: V */
                public gk0 f844V;

                public Flow(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
                }

                @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: k */
                public final void mo454k(AttributeSet attributeSet) {
/* 1 */             super.mo454k(attributeSet);
/* 9 */             this.f844V = new gk0();
/* 11 */            if (attributeSet != null) {
/* 19 */                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
/* 23 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 29 */                for (int i = 0; i < indexCount; i++) {
/* 31 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 37 */                    if (index == R$styleable.ConstraintLayout_Layout_android_orientation) {
/* 45 */                        this.f844V.f8657Z0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            } else if (index == R$styleable.ConstraintLayout_Layout_android_padding) {
/* 53 */                        gk0 gk0Var = this.f844V;
/* 55 */                        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
/* 59 */                        gk0Var.f19497w0 = dimensionPixelSize;
/* 61 */                        gk0Var.f19498x0 = dimensionPixelSize;
/* 63 */                        gk0Var.f19499y0 = dimensionPixelSize;
/* 65 */                        gk0Var.f19500z0 = dimensionPixelSize;
                            } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingStart) {
/* 73 */                        gk0 gk0Var2 = this.f844V;
/* 75 */                        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
/* 79 */                        gk0Var2.f19499y0 = dimensionPixelSize2;
/* 81 */                        gk0Var2.f19490A0 = dimensionPixelSize2;
/* 83 */                        gk0Var2.f19491B0 = dimensionPixelSize2;
                            } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingEnd) {
/* 97 */                        this.f844V.f19500z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                            } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingLeft) {
/* 111 */                       this.f844V.f19490A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                            } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingTop) {
/* 125 */                       this.f844V.f19497w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                            } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingRight) {
/* 139 */                       this.f844V.f19491B0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                            } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingBottom) {
/* 153 */                       this.f844V.f19498x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_wrapMode) {
/* 167 */                       this.f844V.f8655X0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
/* 181 */                       this.f844V.f8639H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalStyle) {
/* 195 */                       this.f844V.f8640I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
/* 209 */                       this.f844V.f8641J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
/* 223 */                       this.f844V.f8643L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
/* 237 */                       this.f844V.f8642K0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
/* 251 */                       this.f844V.f8644M0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalBias) {
/* 267 */                       this.f844V.f8645N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
/* 281 */                       this.f844V.f8647P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
/* 295 */                       this.f844V.f8649R0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
/* 309 */                       this.f844V.f8648Q0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
/* 322 */                       this.f844V.f8650S0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalBias) {
/* 335 */                       this.f844V.f8646O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
/* 349 */                       this.f844V.f8653V0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalAlign) {
/* 362 */                       this.f844V.f8654W0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalGap) {
/* 375 */                       this.f844V.f8651T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalGap) {
/* 388 */                       this.f844V.f8652U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                            } else if (index == R$styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
/* 402 */                       this.f844V.f8656Y0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                        }
/* 408 */               typedArrayObtainStyledAttributes.recycle();
                    }
/* 413 */           this.f1047d = this.f844V;
/* 415 */           m511q();
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: l */
                public final void mo457l(C0076c c0076c, cu0 cu0Var, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
/* 1 */             super.mo457l(c0076c, cu0Var, layoutParams, sparseArray);
/* 6 */             if (cu0Var instanceof gk0) {
/* 8 */                 gk0 gk0Var = (gk0) cu0Var;
/* 10 */                int i = layoutParams.f1091V;
/* 13 */                if (i != -1) {
/* 15 */                    gk0Var.f8657Z0 = i;
                        }
                    }
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: m */
                public final void mo458m(C2569zz c2569zz, boolean z) {
/* 1 */             gk0 gk0Var = this.f844V;
/* 3 */             int i = gk0Var.f19499y0;
/* 5 */             if (i > 0 || gk0Var.f19500z0 > 0) {
/* 13 */                if (z) {
/* 17 */                    gk0Var.f19490A0 = gk0Var.f19500z0;
/* 19 */                    gk0Var.f19491B0 = i;
                        } else {
/* 22 */                    gk0Var.f19490A0 = i;
/* 26 */                    gk0Var.f19491B0 = gk0Var.f19500z0;
                        }
                    }
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
                public final void onMeasure(int i, int i2) {
/* 3 */             mo459r(this.f844V, i, i2);
                }

                @Override // androidx.constraintlayout.widget.VirtualLayout
                /* JADX INFO: renamed from: r */
                public final void mo459r(y53 y53Var, int i, int i2) {
/* 1 */             int mode = View.MeasureSpec.getMode(i);
/* 5 */             int size = View.MeasureSpec.getSize(i);
/* 9 */             int mode2 = View.MeasureSpec.getMode(i2);
/* 13 */            int size2 = View.MeasureSpec.getSize(i2);
/* 17 */            if (y53Var == null) {
/* 31 */                setMeasuredDimension(0, 0);
                    } else {
/* 19 */                y53Var.mo1431V(mode, size, mode2, size2);
/* 26 */                setMeasuredDimension(y53Var.f19493D0, y53Var.f19494E0);
                    }
                }

                public void setFirstHorizontalBias(float f) {
/* 3 */             this.f844V.f8647P0 = f;
/* 5 */             requestLayout();
                }

                public void setFirstHorizontalStyle(int i) {
/* 3 */             this.f844V.f8641J0 = i;
/* 5 */             requestLayout();
                }

                public void setFirstVerticalBias(float f) {
/* 3 */             this.f844V.f8648Q0 = f;
/* 5 */             requestLayout();
                }

                public void setFirstVerticalStyle(int i) {
/* 3 */             this.f844V.f8642K0 = i;
/* 5 */             requestLayout();
                }

                public void setHorizontalAlign(int i) {
/* 3 */             this.f844V.f8653V0 = i;
/* 5 */             requestLayout();
                }

                public void setHorizontalBias(float f) {
/* 3 */             this.f844V.f8645N0 = f;
/* 5 */             requestLayout();
                }

                public void setHorizontalGap(int i) {
/* 3 */             this.f844V.f8651T0 = i;
/* 5 */             requestLayout();
                }

                public void setHorizontalStyle(int i) {
/* 3 */             this.f844V.f8639H0 = i;
/* 5 */             requestLayout();
                }

                public void setLastHorizontalBias(float f) {
/* 3 */             this.f844V.f8649R0 = f;
/* 5 */             requestLayout();
                }

                public void setLastHorizontalStyle(int i) {
/* 3 */             this.f844V.f8643L0 = i;
/* 5 */             requestLayout();
                }

                public void setLastVerticalBias(float f) {
/* 3 */             this.f844V.f8650S0 = f;
/* 5 */             requestLayout();
                }

                public void setLastVerticalStyle(int i) {
/* 3 */             this.f844V.f8644M0 = i;
/* 5 */             requestLayout();
                }

                public void setMaxElementsWrap(int i) {
/* 3 */             this.f844V.f8656Y0 = i;
/* 5 */             requestLayout();
                }

                public void setOrientation(int i) {
/* 3 */             this.f844V.f8657Z0 = i;
/* 5 */             requestLayout();
                }

                public void setPadding(int i) {
/* 1 */             gk0 gk0Var = this.f844V;
/* 3 */             gk0Var.f19497w0 = i;
/* 5 */             gk0Var.f19498x0 = i;
/* 7 */             gk0Var.f19499y0 = i;
/* 9 */             gk0Var.f19500z0 = i;
/* 11 */            requestLayout();
                }

                public void setPaddingBottom(int i) {
/* 3 */             this.f844V.f19498x0 = i;
/* 5 */             requestLayout();
                }

                public void setPaddingLeft(int i) {
/* 3 */             this.f844V.f19490A0 = i;
/* 5 */             requestLayout();
                }

                public void setPaddingRight(int i) {
/* 3 */             this.f844V.f19491B0 = i;
/* 5 */             requestLayout();
                }

                public void setPaddingTop(int i) {
/* 3 */             this.f844V.f19497w0 = i;
/* 5 */             requestLayout();
                }

                public void setVerticalAlign(int i) {
/* 3 */             this.f844V.f8654W0 = i;
/* 5 */             requestLayout();
                }

                public void setVerticalBias(float f) {
/* 3 */             this.f844V.f8646O0 = f;
/* 5 */             requestLayout();
                }

                public void setVerticalGap(int i) {
/* 3 */             this.f844V.f8652U0 = i;
/* 5 */             requestLayout();
                }

                public void setVerticalStyle(int i) {
/* 3 */             this.f844V.f8640I0 = i;
/* 5 */             requestLayout();
                }

                public void setWrapMode(int i) {
/* 3 */             this.f844V.f8655X0 = i;
/* 5 */             requestLayout();
                }

/* 4 */         public Flow(Context context, AttributeSet attributeSet, int i) {
/* 5 */             super(context, attributeSet, i);
                }
            }
