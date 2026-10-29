            package androidx.constraintlayout.widget;

            import android.content.Context;
            import android.util.AttributeSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public class Group extends ConstraintHelper {
                public Group(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: g */
                public final void mo460g(ConstraintLayout constraintLayout) {
/* 1 */             m507f(constraintLayout);
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: n */
                public final void mo461n() {
/* 5 */             ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
/* 10 */            layoutParams.f1129q0.m10464P(0);
/* 15 */            layoutParams.f1129q0.m10461M(0);
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             m506e();
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

/* 4 */         public Group(Context context, AttributeSet attributeSet, int i) {
/* 5 */             super(context, attributeSet, i);
                }
            }
