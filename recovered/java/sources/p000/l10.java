            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewTreeObserver;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class l10 implements ViewTreeObserver.OnPreDrawListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13074a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ViewGroup f13075b;

                public /* synthetic */ l10(ViewGroup viewGroup, int i) {
/* 1 */             this.f13074a = i;
/* 3 */             this.f13075b = viewGroup;
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    View view;
/* 1 */             int i = this.f13074a;
/* 4 */             ViewGroup viewGroup = this.f13075b;
                    switch (i) {
                        case 0:
/* 41 */                    ((CoordinatorLayout) viewGroup).m556o(0);
                            break;
                        default:
/* 9 */                     fr0 fr0Var = (fr0) viewGroup;
/* 11 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 13 */                    fr0Var.postInvalidateOnAnimation();
/* 16 */                    ViewGroup viewGroup2 = fr0Var.f8329a;
/* 18 */                    if (viewGroup2 != null && (view = fr0Var.f8330b) != null) {
/* 24 */                        viewGroup2.endViewTransition(view);
/* 29 */                        fr0Var.f8329a.postInvalidateOnAnimation();
/* 33 */                        fr0Var.f8329a = null;
/* 35 */                        fr0Var.f8330b = null;
                            }
                            break;
                    }
/* 3 */             return true;
                }
            }
