            package androidx.swiperefreshlayout.widget;

            import android.view.animation.Animation;
            import android.view.animation.Transformation;
            import p000.C2194su;
            import p000.C2231tu;
            
            /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0146c extends Animation {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f1843a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ SwipeRefreshLayout f1844b;

                public /* synthetic */ C0146c(SwipeRefreshLayout swipeRefreshLayout, int i) {
/* 1 */             this.f1843a = i;
/* 3 */             this.f1844b = swipeRefreshLayout;
                }

                @Override // android.view.animation.Animation
                public final void applyTransformation(float f, Transformation transformation) {
/* 1 */             int i = this.f1843a;
/* 3 */             SwipeRefreshLayout swipeRefreshLayout = this.f1844b;
                    switch (i) {
                        case 0:
/* 20 */                    boolean z = swipeRefreshLayout.mUsingCustomStart;
/* 22 */                    int iAbs = swipeRefreshLayout.mSpinnerOffsetEnd;
/* 24 */                    if (!z) {
/* 32 */                        iAbs -= Math.abs(swipeRefreshLayout.mOriginalOffsetTop);
                            }
/* 33 */                    int i2 = swipeRefreshLayout.mFrom;
/* 47 */                    swipeRefreshLayout.setTargetOffsetTopAndBottom((i2 + ((int) ((iAbs - i2) * f))) - swipeRefreshLayout.mCircleView.getTop());
/* 50 */                    C2231tu c2231tu = swipeRefreshLayout.mProgress;
/* 54 */                    float f2 = 1.0f - f;
/* 55 */                    C2194su c2194su = c2231tu.f17264a;
/* 61 */                    if (f2 != c2194su.f16795p) {
/* 63 */                        c2194su.f16795p = f2;
                            }
/* 65 */                    c2231tu.invalidateSelf();
                            break;
                        default:
/* 8 */                     float f3 = swipeRefreshLayout.mStartingScale;
/* 13 */                    swipeRefreshLayout.setAnimationProgress(((-f3) * f) + f3);
/* 16 */                    swipeRefreshLayout.moveToStart(f);
                            break;
                    }
                }
            }
