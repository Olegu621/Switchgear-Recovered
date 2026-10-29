            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class q71 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15433a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ r71 f15434b;

                public /* synthetic */ q71(r71 r71Var, int i) {
/* 1 */             this.f15433a = i;
/* 3 */             this.f15434b = r71Var;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    switch (this.f15433a) {
                        case 1:
/* 10 */                    super.onAnimationEnd(animator);
/* 13 */                    r71 r71Var = this.f15434b;
/* 15 */                    r71Var.mo6292a();
/* 18 */                    C1965ni c1965ni = r71Var.f15908k;
/* 20 */                    if (c1965ni != null) {
/* 22 */                        c1965ni.m6984a();
                            }
                            break;
                        default:
/* 6 */                     super.onAnimationEnd(animator);
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    switch (this.f15433a) {
                        case 0:
/* 10 */                    super.onAnimationRepeat(animator);
/* 13 */                    r71 r71Var = this.f15434b;
/* 25 */                    r71Var.f15905h = (r71Var.f15905h + 1) % r71Var.f15904g.f14764c.length;
/* 27 */                    r71Var.f15906i = true;
                            break;
                        default:
/* 6 */                     super.onAnimationRepeat(animator);
                            break;
                    }
                }
            }
