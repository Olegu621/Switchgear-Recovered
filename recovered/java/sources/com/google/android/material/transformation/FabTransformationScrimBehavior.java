            package com.google.android.material.transformation;

            import android.animation.AnimatorSet;
            import android.animation.ObjectAnimator;
            import android.content.Context;
            import android.util.AttributeSet;
            import android.util.Property;
            import android.view.MotionEvent;
            import android.view.View;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import com.google.android.material.floatingactionbutton.FloatingActionButton;
            import java.util.ArrayList;
            import p000.nk1;
            import p000.rg0;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
/* 21 */    public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

                /* JADX INFO: renamed from: c */
                public final nk1 f5138c;

                /* JADX INFO: renamed from: d */
                public final nk1 f5139d;

                public FabTransformationScrimBehavior() {
/* 11 */            this.f5138c = new nk1(75L);
/* 20 */            this.f5139d = new nk1(0L);
                }

                @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: b */
                public final boolean mo564b(View view, View view2) {
/* 1 */             return view2 instanceof FloatingActionButton;
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: r */
                public final boolean mo580r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
/* 1 */             return false;
                }

                @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
                /* JADX INFO: renamed from: t */
                public final AnimatorSet mo2432t(View view, View view2, boolean z, boolean z2) {
                    ObjectAnimator objectAnimatorOfFloat;
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             new ArrayList();
/* 16 */            nk1 nk1Var = z ? this.f5138c : this.f5139d;
/* 21 */            if (z) {
/* 23 */                if (!z2) {
/* 25 */                    view2.setAlpha(0.0f);
                        }
/* 36 */                objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
                    } else {
/* 47 */                objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
                    }
/* 51 */            nk1Var.m6995a(objectAnimatorOfFloat);
/* 54 */            arrayList.add(objectAnimatorOfFloat);
/* 59 */            AnimatorSet animatorSet = new AnimatorSet();
/* 62 */            w11.m9455y(animatorSet, arrayList);
/* 70 */            animatorSet.addListener(new rg0(view2, z));
/* 73 */            return animatorSet;
                }

/* 22 */        public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
/* 23 */            super(context, attributeSet);
/* 24 */            this.f5138c = new nk1(75L);
/* 25 */            this.f5139d = new nk1(0L);
                }
            }
