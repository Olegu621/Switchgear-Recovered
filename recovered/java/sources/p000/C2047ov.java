            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            
            /* JADX INFO: renamed from: ov */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2047ov extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14903a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2121qv f14904b;

                public /* synthetic */ C2047ov(C2121qv c2121qv, int i) {
/* 1 */             this.f14903a = i;
/* 3 */             this.f14904b = c2121qv;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    switch (this.f14903a) {
                        case 1:
/* 15 */                    this.f14904b.f7137a.setEndIconVisible(false);
                            break;
                        default:
/* 6 */                     super.onAnimationEnd(animator);
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    switch (this.f14903a) {
                        case 0:
/* 15 */                    this.f14904b.f7137a.setEndIconVisible(true);
                            break;
                        default:
/* 6 */                     super.onAnimationStart(animator);
                            break;
                    }
                }
            }
