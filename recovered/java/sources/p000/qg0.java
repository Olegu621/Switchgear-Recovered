            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.graphics.drawable.Drawable;
            import androidx.transition.Transition;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class qg0 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15528a = 1;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f15529b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f15530c;

                public qg0(InterfaceC0157av interfaceC0157av, Drawable drawable) {
/* 4 */             this.f15529b = interfaceC0157av;
/* 6 */             this.f15530c = drawable;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
/* 1 */             int i = this.f15528a;
/* 3 */             Object obj = this.f15529b;
                    switch (i) {
                        case 0:
/* 26 */                    ((InterfaceC0157av) obj).setCircularRevealOverlayDrawable(null);
                            break;
                        default:
/* 10 */                    ((C1024id) obj).remove(animator);
/* 19 */                    ((Transition) this.f15530c).f1890X.remove(animator);
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
/* 1 */             int i = this.f15528a;
/* 3 */             Object obj = this.f15530c;
                    switch (i) {
                        case 0:
/* 22 */                    ((InterfaceC0157av) this.f15529b).setCircularRevealOverlayDrawable((Drawable) obj);
                            break;
                        default:
/* 12 */                    ((Transition) obj).f1890X.add(animator);
                            break;
                    }
                }

/* 11 */        public qg0(Transition transition, C1024id c1024id) {
/* 12 */            this.f15530c = transition;
                    this.f15529b = c1024id;
                }
            }
