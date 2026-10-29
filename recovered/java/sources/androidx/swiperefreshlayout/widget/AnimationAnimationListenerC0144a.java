            package androidx.swiperefreshlayout.widget;

            import android.view.animation.Animation;
            import p000.xj2;
            
            /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AnimationAnimationListenerC0144a implements Animation.AnimationListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f1838a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ SwipeRefreshLayout f1839b;

                public /* synthetic */ AnimationAnimationListenerC0144a(SwipeRefreshLayout swipeRefreshLayout, int i) {
/* 1 */             this.f1838a = i;
/* 3 */             this.f1839b = swipeRefreshLayout;
                }

                /* JADX INFO: renamed from: a */
                private final void m1057a(Animation animation) {
                }

                /* JADX INFO: renamed from: b */
                private final void m1058b(Animation animation) {
                }

                /* JADX INFO: renamed from: c */
                private final void m1059c(Animation animation) {
                }

                /* JADX INFO: renamed from: d */
                private final void m1060d(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    xj2 xj2Var;
/* 1 */             int i = this.f1838a;
/* 3 */             SwipeRefreshLayout swipeRefreshLayout = this.f1839b;
                    switch (i) {
                        case 0:
/* 19 */                    if (!swipeRefreshLayout.mRefreshing) {
/* 53 */                        swipeRefreshLayout.reset();
                            } else {
/* 25 */                        swipeRefreshLayout.mProgress.setAlpha(255);
/* 30 */                        swipeRefreshLayout.mProgress.start();
/* 35 */                        if (swipeRefreshLayout.mNotify && (xj2Var = swipeRefreshLayout.mListener) != null) {
/* 41 */                            xj2Var.onRefresh();
                                }
/* 50 */                        swipeRefreshLayout.mCurrentTargetOffsetTop = swipeRefreshLayout.mCircleView.getTop();
                            }
                            break;
                        default:
/* 10 */                    if (!swipeRefreshLayout.mScale) {
/* 13 */                        swipeRefreshLayout.startScaleDownAnimation(null);
                            }
                            break;
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
/* 1 */             int i = this.f1838a;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
/* 1 */             int i = this.f1838a;
                }
            }
