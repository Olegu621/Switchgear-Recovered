            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.view.View;
            import com.google.android.material.bottomappbar.BottomAppBar;
            import com.google.android.material.floatingactionbutton.FloatingActionButton;
            
            /* JADX INFO: renamed from: ik */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1030ik extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9669a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ BottomAppBar f9670b;

                public /* synthetic */ C1030ik(BottomAppBar bottomAppBar, int i) {
/* 1 */             this.f9669a = i;
/* 3 */             this.f9670b = bottomAppBar;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
/* 1 */             int i = this.f9669a;
/* 4 */             BottomAppBar bottomAppBar = this.f9670b;
                    switch (i) {
                        case 1:
/* 21 */                    int i2 = BottomAppBar.f4449b1;
/* 23 */                    bottomAppBar.f4453L0 = null;
                            break;
                        case 2:
/* 13 */                    int i3 = BottomAppBar.f4449b1;
/* 16 */                    bottomAppBar.f4461T0 = false;
/* 18 */                    bottomAppBar.f4454M0 = null;
                            break;
                        default:
/* 9 */                     super.onAnimationEnd(animator);
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
/* 1 */             int i = this.f9669a;
/* 3 */             BottomAppBar bottomAppBar = this.f9670b;
                    switch (i) {
                        case 0:
/* 43 */                    if (!bottomAppBar.f4461T0) {
/* 49 */                        bottomAppBar.m2246E(bottomAppBar.f4455N0, bottomAppBar.f4462U0);
                            }
                            break;
                        case 1:
/* 38 */                    int i2 = BottomAppBar.f4449b1;
                            break;
                        case 2:
/* 35 */                    int i3 = BottomAppBar.f4449b1;
                            break;
                        default:
/* 10 */                    bottomAppBar.f4467Z0.onAnimationStart(animator);
/* 13 */                    View viewM2243B = bottomAppBar.m2243B();
/* 24 */                    FloatingActionButton floatingActionButton = viewM2243B instanceof FloatingActionButton ? (FloatingActionButton) viewM2243B : null;
/* 25 */                    if (floatingActionButton != null) {
/* 31 */                        floatingActionButton.setTranslationX(bottomAppBar.getFabTranslationX());
                            }
                            break;
                    }
                }
            }
