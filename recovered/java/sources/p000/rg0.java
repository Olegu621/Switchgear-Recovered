            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.view.View;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class rg0 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16044a;

                /* JADX INFO: renamed from: b */
                public final Object f16045b;

                /* JADX INFO: renamed from: c */
                public boolean f16046c;

                public rg0(View view) {
/* 2 */             this.f16044a = 1;
/* 8 */             this.f16046c = false;
/* 10 */            this.f16045b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    switch (this.f16044a) {
                        case 2:
/* 11 */                    this.f16046c = true;
                            break;
                        default:
/* 6 */                     super.onAnimationCancel(animator);
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
/* 1 */             int i = this.f16044a;
/* 4 */             Object obj = this.f16045b;
                    switch (i) {
                        case 0:
/* 68 */                    if (!this.f16046c) {
/* 73 */                        ((View) obj).setVisibility(4);
                            }
                            break;
                        case 1:
/* 50 */                    View view = (View) obj;
/* 54 */                    l53.m6343b(view, 1.0f);
/* 59 */                    if (this.f16046c) {
/* 62 */                        view.setLayerType(0, null);
                            }
                            break;
                        default:
/* 9 */                     ah0 ah0Var = (ah0) obj;
/* 13 */                    if (this.f16046c) {
/* 15 */                        this.f16046c = false;
                            } else if (((Float) ah0Var.f285z.getAnimatedValue()).floatValue() != 0.0f) {
/* 42 */                        ah0Var.f258A = 2;
/* 46 */                        ah0Var.f278s.invalidate();
                            } else {
/* 35 */                        ah0Var.f258A = 0;
/* 37 */                        ah0Var.m284g(0);
                            }
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
/* 1 */             int i = this.f16044a;
/* 3 */             Object obj = this.f16045b;
                    switch (i) {
                        case 0:
/* 39 */                    if (this.f16046c) {
/* 44 */                        ((View) obj).setVisibility(0);
                            }
                            break;
                        case 1:
/* 12 */                    View view = (View) obj;
/* 14 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 20 */                    if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
/* 29 */                        this.f16046c = true;
/* 33 */                        view.setLayerType(2, null);
                                break;
                            }
                            break;
                        default:
/* 8 */                     super.onAnimationStart(animator);
                            break;
                    }
                }

/* 12 */        public rg0(View view, boolean z) {
                    this.f16044a = 0;
/* 13 */            this.f16046c = z;
                    this.f16045b = view;
                }

/* 13 */        public rg0(ah0 ah0Var) {
                    this.f16044a = 2;
/* 14 */            this.f16045b = ah0Var;
/* 15 */            this.f16046c = false;
                }
            }
