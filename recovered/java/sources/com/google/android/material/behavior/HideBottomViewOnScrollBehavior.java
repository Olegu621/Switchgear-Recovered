            package com.google.android.material.behavior;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewPropertyAnimator;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import p000.AbstractC2246u8;
            import p000.C2315w1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

                /* JADX INFO: renamed from: a */
                public int f4437a;

                /* JADX INFO: renamed from: b */
                public int f4438b;

                /* JADX INFO: renamed from: c */
                public int f4439c;

                /* JADX INFO: renamed from: d */
                public ViewPropertyAnimator f4440d;

                public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f4437a = 0;
/* 8 */             this.f4438b = 2;
/* 10 */            this.f4439c = 0;
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: h */
                public boolean mo570h(CoordinatorLayout coordinatorLayout, View view, int i) {
/* 14 */            this.f4437a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
/* 16 */            return false;
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: l */
                public final void mo574l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
/* 2 */             if (i > 0) {
/* 7 */                 if (this.f4438b == 1) {
/* 112 */                   return;
                        }
/* 10 */                ViewPropertyAnimator viewPropertyAnimator = this.f4440d;
/* 12 */                if (viewPropertyAnimator != null) {
/* 14 */                    viewPropertyAnimator.cancel();
/* 17 */                    view.clearAnimation();
                        }
/* 20 */                this.f4438b = 1;
/* 57 */                this.f4440d = view.animate().translationY(this.f4437a + this.f4439c).setInterpolator(AbstractC2246u8.f17412c).setDuration(175L).setListener(new C2315w1(this, 5));
/* 59 */                return;
                    }
/* 60 */            if (i >= 0 || this.f4438b == 2) {
/* 112 */               return;
                    }
/* 68 */            ViewPropertyAnimator viewPropertyAnimator2 = this.f4440d;
/* 70 */            if (viewPropertyAnimator2 != null) {
/* 72 */                viewPropertyAnimator2.cancel();
/* 75 */                view.clearAnimation();
                    }
/* 78 */            this.f4438b = 2;
/* 110 */           this.f4440d = view.animate().translationY(0.0f).setInterpolator(AbstractC2246u8.f17413d).setDuration(225L).setListener(new C2315w1(this, 5));
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: p */
                public boolean mo578p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
                    return i == 2;
                }

/* 12 */        public HideBottomViewOnScrollBehavior() {
/* 14 */            this.f4437a = 0;
/* 15 */            this.f4438b = 2;
/* 16 */            this.f4439c = 0;
                }
            }
