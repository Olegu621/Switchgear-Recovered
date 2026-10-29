            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class pg0 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15107a = 1;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f15108b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f15109c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f15110d;

                public pg0(boolean z, View view, View view2) {
/* 4 */             this.f15108b = z;
/* 6 */             this.f15109c = view;
/* 8 */             this.f15110d = view2;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
/* 1 */             int i = this.f15107a;
/* 3 */             Object obj = this.f15109c;
/* 6 */             Object obj2 = this.f15110d;
                    switch (i) {
                        case 0:
/* 30 */                    View view = (View) obj2;
/* 34 */                    if (!this.f15108b) {
/* 39 */                        ((View) obj).setVisibility(4);
/* 44 */                        view.setAlpha(1.0f);
/* 47 */                        view.setVisibility(0);
                            }
                            break;
                        default:
/* 11 */                    bk0 bk0Var = (bk0) obj2;
/* 13 */                    bk0Var.f2483q = 0;
/* 16 */                    bk0Var.f2478l = null;
/* 18 */                    wc0 wc0Var = (wc0) obj;
/* 20 */                    if (wc0Var != null) {
/* 26 */                        ((he3) wc0Var.f18577b).mo4205l();
                            }
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
/* 1 */             int i = this.f15107a;
/* 3 */             boolean z = this.f15108b;
/* 6 */             Object obj = this.f15110d;
                    switch (i) {
                        case 0:
/* 24 */                    View view = (View) obj;
/* 26 */                    if (z) {
/* 32 */                        ((View) this.f15109c).setVisibility(0);
/* 36 */                        view.setAlpha(0.0f);
/* 40 */                        view.setVisibility(4);
                            }
                            break;
                        default:
/* 11 */                    bk0 bk0Var = (bk0) obj;
/* 15 */                    bk0Var.f2487u.m2344a(0, z);
/* 19 */                    bk0Var.f2483q = 2;
/* 21 */                    bk0Var.f2478l = animator;
                            break;
                    }
                }

/* 13 */        public pg0(bk0 bk0Var, boolean z, wc0 wc0Var) {
/* 14 */            this.f15110d = bk0Var;
                    this.f15108b = z;
                    this.f15109c = wc0Var;
                }
            }
