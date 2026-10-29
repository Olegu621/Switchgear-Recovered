            package com.google.android.material.appbar;

            import android.animation.ValueAnimator;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            
            /* JADX INFO: renamed from: com.google.android.material.appbar.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0333a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ CoordinatorLayout f4404a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AppBarLayout f4405b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ AppBarLayout.BaseBehavior f4406c;

                public C0333a(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
/* 4 */             this.f4406c = baseBehavior;
/* 6 */             this.f4404a = coordinatorLayout;
/* 8 */             this.f4405b = appBarLayout;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
/* 17 */            this.f4406c.m2231B(this.f4404a, this.f4405b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            }
