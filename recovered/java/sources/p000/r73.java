            package p000;

            import android.view.View;
            import androidx.appcompat.widget.ActionBarOverlayLayout;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class r73 extends jb1 {

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ int f15909f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ t73 f15910g;

                public /* synthetic */ r73(t73 t73Var, int i) {
/* 1 */             this.f15909f = i;
/* 3 */             this.f15910g = t73Var;
                }

                @Override // p000.r43
                /* JADX INFO: renamed from: c */
                public final void mo1186c() {
                    View view;
/* 1 */             int i = this.f15909f;
/* 4 */             t73 t73Var = this.f15910g;
                    switch (i) {
                        case 0:
/* 19 */                    if (t73Var.f16970o && (view = t73Var.f16962g) != null) {
/* 26 */                        view.setTranslationY(0.0f);
/* 31 */                        t73Var.f16959d.setTranslationY(0.0f);
                            }
/* 38 */                    t73Var.f16959d.setVisibility(8);
/* 44 */                    t73Var.f16959d.setTransitioning(false);
/* 47 */                    t73Var.f16975t = null;
/* 49 */                    C0210cb c0210cb = t73Var.f16966k;
/* 51 */                    if (c0210cb != null) {
/* 55 */                        c0210cb.mo1583d(t73Var.f16965j);
/* 58 */                        t73Var.f16965j = null;
/* 60 */                        t73Var.f16966k = null;
                            }
/* 62 */                    ActionBarOverlayLayout actionBarOverlayLayout = t73Var.f16958c;
/* 64 */                    if (actionBarOverlayLayout != null) {
/* 66 */                        WeakHashMap weakHashMap = e33.f7494a;
/* 68 */                        q23.m7679c(actionBarOverlayLayout);
                            }
                            break;
                        default:
/* 9 */                     t73Var.f16975t = null;
/* 13 */                    t73Var.f16959d.requestLayout();
                            break;
                    }
                }
            }
