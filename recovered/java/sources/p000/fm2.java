            package p000;

            import android.animation.ValueAnimator;
            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fm2 implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f8281a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f8282b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ hm2 f8283c;

                public fm2(hm2 hm2Var, View view, View view2) {
/* 4 */             this.f8283c = hm2Var;
/* 6 */             this.f8281a = view;
/* 8 */             this.f8282b = view2;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
/* 11 */            this.f8283c.m4244c(this.f8281a, this.f8282b, valueAnimator.getAnimatedFraction());
                }
            }
