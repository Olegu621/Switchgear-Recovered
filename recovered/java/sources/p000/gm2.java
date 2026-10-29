            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gm2 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8740a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ hm2 f8741b;

                public gm2(hm2 hm2Var, int i) {
/* 1 */             this.f8741b = hm2Var;
/* 3 */             this.f8740a = i;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
/* 5 */             this.f8741b.f9144b = this.f8740a;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
/* 5 */             this.f8741b.f9144b = this.f8740a;
                }
            }
