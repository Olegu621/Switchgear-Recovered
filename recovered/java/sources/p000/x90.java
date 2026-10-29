            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class x90 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18995a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ y90 f18996b;

                public /* synthetic */ x90(y90 y90Var, int i) {
/* 1 */             this.f18995a = i;
/* 3 */             this.f18996b = y90Var;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    switch (this.f18995a) {
                        case 1:
/* 10 */                    super.onAnimationEnd(animator);
/* 13 */                    y90 y90Var = this.f18996b;
/* 2 */                     super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
/* 18 */                    ArrayList arrayList = y90Var.f19534f;
/* 20 */                    if (arrayList != null && !y90Var.f19535i) {
/* 26 */                        Iterator it = arrayList.iterator();
/* 34 */                        while (it.hasNext()) {
/* 42 */                            ((C1965ni) it.next()).m6984a();
                                }
                                break;
                            }
                            break;
                        default:
/* 6 */                     super.onAnimationEnd(animator);
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    switch (this.f18995a) {
                        case 0:
/* 10 */                    super.onAnimationStart(animator);
/* 13 */                    y90 y90Var = this.f18996b;
/* 15 */                    ArrayList arrayList = y90Var.f19534f;
/* 17 */                    if (arrayList != null && !y90Var.f19535i) {
/* 23 */                        Iterator it = arrayList.iterator();
/* 31 */                        while (it.hasNext()) {
/* 39 */                            ((C1965ni) it.next()).getClass();
                                }
                                break;
                            }
                            break;
                        default:
/* 6 */                     super.onAnimationStart(animator);
                            break;
                    }
                }
            }
