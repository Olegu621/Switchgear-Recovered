            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            
            /* JADX INFO: renamed from: pu */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2083pu extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15283a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2120qu f15284b;

                public /* synthetic */ C2083pu(C2120qu c2120qu, int i) {
/* 1 */             this.f15283a = i;
/* 3 */             this.f15284b = c2120qu;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    switch (this.f15283a) {
                        case 1:
/* 10 */                    super.onAnimationEnd(animator);
/* 13 */                    C2120qu c2120qu = this.f15284b;
/* 15 */                    c2120qu.mo6292a();
/* 18 */                    C1965ni c1965ni = c2120qu.f15750k;
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
                    switch (this.f15283a) {
                        case 0:
/* 10 */                    super.onAnimationRepeat(animator);
/* 13 */                    C2120qu c2120qu = this.f15284b;
/* 25 */                    c2120qu.f15747h = (c2120qu.f15747h + 4) % c2120qu.f15746g.f14764c.length;
                            break;
                        default:
/* 6 */                     super.onAnimationRepeat(animator);
                            break;
                    }
                }
            }
