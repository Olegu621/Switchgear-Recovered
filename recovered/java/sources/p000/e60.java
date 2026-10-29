            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.view.View;
            import android.view.ViewPropertyAnimator;
            import androidx.recyclerview.widget.AbstractC0137o;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final class e60 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7551a = 1;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AbstractC0137o f7552b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ View f7553c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ViewPropertyAnimator f7554d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ j60 f7555e;

                public e60(j60 j60Var, AbstractC0137o abstractC0137o, ViewPropertyAnimator viewPropertyAnimator, View view) {
/* 4 */             this.f7555e = j60Var;
/* 6 */             this.f7552b = abstractC0137o;
/* 8 */             this.f7554d = viewPropertyAnimator;
/* 10 */            this.f7553c = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    switch (this.f7551a) {
                        case 1:
/* 14 */                    this.f7553c.setAlpha(1.0f);
                            break;
                        default:
/* 6 */                     super.onAnimationCancel(animator);
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
/* 1 */             int i = this.f7551a;
/* 3 */             AbstractC0137o abstractC0137o = this.f7552b;
/* 5 */             j60 j60Var = this.f7555e;
/* 8 */             ViewPropertyAnimator viewPropertyAnimator = this.f7554d;
                    switch (i) {
                        case 0:
/* 28 */                    viewPropertyAnimator.setListener(null);
/* 35 */                    this.f7553c.setAlpha(1.0f);
/* 38 */                    j60Var.m6851c(abstractC0137o);
/* 43 */                    j60Var.f12093q.remove(abstractC0137o);
/* 46 */                    j60Var.m5718i();
                            break;
                        default:
/* 13 */                    viewPropertyAnimator.setListener(null);
/* 16 */                    j60Var.m6851c(abstractC0137o);
/* 21 */                    j60Var.f12091o.remove(abstractC0137o);
/* 24 */                    j60Var.m5718i();
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    switch (this.f7551a) {
                        case 0:
/* 14 */                    this.f7555e.getClass();
                            break;
                        default:
/* 8 */                     this.f7555e.getClass();
                            break;
                    }
                }

/* 15 */        public e60(j60 j60Var, AbstractC0137o abstractC0137o, View view, ViewPropertyAnimator viewPropertyAnimator) {
/* 16 */            this.f7555e = j60Var;
                    this.f7552b = abstractC0137o;
                    this.f7553c = view;
                    this.f7554d = viewPropertyAnimator;
                }
            }
