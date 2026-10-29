            package androidx.constraintlayout.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewParent;
            import p000.y53;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public abstract class VirtualLayout extends ConstraintHelper {

                /* JADX INFO: renamed from: U */
                public boolean f1165U;

                /* JADX INFO: renamed from: w */
                public boolean f1166w;

                public VirtualLayout(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: g */
                public final void mo460g(ConstraintLayout constraintLayout) {
/* 1 */             m507f(constraintLayout);
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: k */
                public void mo454k(AttributeSet attributeSet) {
/* 1 */             super.mo454k(attributeSet);
/* 4 */             if (attributeSet != null) {
/* 12 */                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
/* 16 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 21 */                for (int i = 0; i < indexCount; i++) {
/* 23 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 30 */                    if (index == R$styleable.ConstraintLayout_Layout_android_visibility) {
/* 32 */                        this.f1166w = true;
                            } else if (index == R$styleable.ConstraintLayout_Layout_android_elevation) {
/* 39 */                        this.f1165U = true;
                            }
                        }
/* 44 */                typedArrayObtainStyledAttributes.recycle();
                    }
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
                public void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 6 */             if (this.f1166w || this.f1165U) {
/* 12 */                ViewParent parent = getParent();
/* 18 */                if (parent instanceof ConstraintLayout) {
/* 20 */                    ConstraintLayout constraintLayout = (ConstraintLayout) parent;
/* 22 */                    int visibility = getVisibility();
/* 26 */                    float elevation = getElevation();
/* 33 */                    for (int i = 0; i < this.f1045b; i++) {
/* 39 */                        View viewM513b = constraintLayout.m513b(this.f1044a[i]);
/* 43 */                        if (viewM513b != null) {
/* 47 */                            if (this.f1166w) {
/* 49 */                                viewM513b.setVisibility(visibility);
                                    }
/* 54 */                            if (this.f1165U && elevation > 0.0f) {
/* 66 */                                viewM513b.setTranslationZ(viewM513b.getTranslationZ() + elevation);
                                    }
                                }
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: r */
                public void mo459r(y53 y53Var, int i, int i2) {
                }

                @Override // android.view.View
                public void setElevation(float f) {
/* 1 */             super.setElevation(f);
/* 4 */             m506e();
                }

                @Override // android.view.View
                public void setVisibility(int i) {
/* 1 */             super.setVisibility(i);
/* 4 */             m506e();
                }

/* 4 */         public VirtualLayout(Context context, AttributeSet attributeSet, int i) {
/* 5 */             super(context, attributeSet, i);
                }
            }
