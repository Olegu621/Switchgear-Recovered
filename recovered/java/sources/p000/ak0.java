            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.animation.ValueAnimator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ak0 extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public boolean f319a;

                /* JADX INFO: renamed from: b */
                public float f320b;

                /* JADX INFO: renamed from: c */
                public float f321c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ dk0 f322d;

                public ak0(dk0 dk0Var) {
/* 1 */             this.f322d = dk0Var;
                }

                /* JADX INFO: renamed from: a */
                public abstract float mo298a();

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
/* 3 */             float f = (int) this.f321c;
/* 7 */             ck0 ck0Var = this.f322d.f2468b;
/* 9 */             if (ck0Var != null) {
/* 11 */                ck0Var.m3741m(f);
                    }
/* 15 */            this.f319a = false;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
/* 1 */             boolean z = this.f319a;
/* 3 */             dk0 dk0Var = this.f322d;
/* 5 */             if (!z) {
/* 7 */                 ck0 ck0Var = dk0Var.f2468b;
/* 17 */                this.f320b = ck0Var == null ? 0.0f : ck0Var.f8151a.f7647m;
/* 23 */                this.f321c = mo298a();
/* 26 */                this.f319a = true;
                    }
/* 28 */            float f = this.f320b;
/* 39 */            float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f321c - f)) + f);
/* 41 */            ck0 ck0Var2 = dk0Var.f2468b;
/* 43 */            if (ck0Var2 != null) {
/* 45 */                ck0Var2.m3741m(animatedFraction);
                    }
                }
            }
