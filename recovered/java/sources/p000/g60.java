            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.view.View;
            import android.view.ViewPropertyAnimator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class g60 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8483a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ h60 f8484b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ViewPropertyAnimator f8485c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ View f8486d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ j60 f8487e;

                public /* synthetic */ g60(j60 j60Var, h60 h60Var, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
/* 1 */             this.f8483a = i;
/* 3 */             this.f8487e = j60Var;
/* 5 */             this.f8484b = h60Var;
/* 7 */             this.f8485c = viewPropertyAnimator;
/* 9 */             this.f8486d = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
/* 1 */             int i = this.f8483a;
/* 3 */             h60 h60Var = this.f8484b;
/* 5 */             j60 j60Var = this.f8487e;
/* 10 */            View view = this.f8486d;
/* 13 */            ViewPropertyAnimator viewPropertyAnimator = this.f8485c;
                    switch (i) {
                        case 0:
/* 46 */                    viewPropertyAnimator.setListener(null);
/* 49 */                    view.setAlpha(1.0f);
/* 52 */                    view.setTranslationX(0.0f);
/* 55 */                    view.setTranslationY(0.0f);
/* 60 */                    j60Var.m6851c(h60Var.f8912a);
/* 67 */                    j60Var.f12094r.remove(h60Var.f8912a);
/* 70 */                    j60Var.m5718i();
                            break;
                        default:
/* 18 */                    viewPropertyAnimator.setListener(null);
/* 21 */                    view.setAlpha(1.0f);
/* 24 */                    view.setTranslationX(0.0f);
/* 27 */                    view.setTranslationY(0.0f);
/* 32 */                    j60Var.m6851c(h60Var.f8913b);
/* 39 */                    j60Var.f12094r.remove(h60Var.f8913b);
/* 42 */                    j60Var.m5718i();
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    switch (this.f8483a) {
                        case 0:
/* 14 */                    this.f8487e.getClass();
                            break;
                        default:
/* 8 */                     this.f8487e.getClass();
                            break;
                    }
                }
            }
