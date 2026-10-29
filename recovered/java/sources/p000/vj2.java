            package p000;

            import android.view.animation.Animation;
            import android.view.animation.Transformation;
            import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vj2 extends Animation {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18225a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ SwipeRefreshLayout f18226b;

                public /* synthetic */ vj2(SwipeRefreshLayout swipeRefreshLayout, int i) {
/* 1 */             this.f18225a = i;
/* 3 */             this.f18226b = swipeRefreshLayout;
                }

                @Override // android.view.animation.Animation
                public final void applyTransformation(float f, Transformation transformation) {
/* 1 */             int i = this.f18225a;
/* 3 */             SwipeRefreshLayout swipeRefreshLayout = this.f18226b;
                    switch (i) {
                        case 0:
/* 19 */                    swipeRefreshLayout.setAnimationProgress(f);
                            break;
                        case 1:
/* 15 */                    swipeRefreshLayout.setAnimationProgress(1.0f - f);
                            break;
                        default:
/* 8 */                     swipeRefreshLayout.moveToStart(f);
                            break;
                    }
                }
            }
