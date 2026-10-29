            package p000;

            import android.animation.ValueAnimator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pl1 implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ float f15171a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ rl1 f15172b;

                public pl1(rl1 rl1Var, float f) {
/* 4 */             this.f15172b = rl1Var;
/* 6 */             this.f15171a = f;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
/* 15 */            this.f15172b.m8203b(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f15171a);
                }
            }
