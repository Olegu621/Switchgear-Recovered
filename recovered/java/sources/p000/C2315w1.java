            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.view.View;
            import androidx.appcompat.widget.ActionBarOverlayLayout;
            import androidx.transition.Transition;
            import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
            import com.google.android.material.transformation.ExpandableTransformationBehavior;
            import com.supercell.titan.RunnableC0804k;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: w1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class C2315w1 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18408a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f18409b;

                public C2315w1(r43 r43Var, View view) {
/* 3 */             this.f18408a = 9;
/* 5 */             this.f18409b = r43Var;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
/* 1 */             int i = this.f18408a;
/* 3 */             Object obj = this.f18409b;
                    switch (i) {
                        case 0:
/* 28 */                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
/* 31 */                    actionBarOverlayLayout.f448k0 = null;
/* 34 */                    actionBarOverlayLayout.f428U = false;
                            break;
                        case 4:
/* 24 */                    ((AbstractC1832ki) obj).mo6107d();
                            break;
                        case 7:
/* 18 */                    animator.removeAllListeners();
                            break;
                        case 9:
/* 14 */                    ((r43) obj).mo1184a();
                            break;
                        default:
/* 8 */                     super.onAnimationCancel(animator);
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
/* 1 */             int i = this.f18408a;
/* 4 */             Object obj = this.f18409b;
                    switch (i) {
                        case 0:
/* 78 */                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
/* 80 */                    actionBarOverlayLayout.f448k0 = null;
/* 83 */                    actionBarOverlayLayout.f428U = false;
                            break;
                        case 1:
/* 72 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 74 */                    ((View) obj).setClipBounds(null);
                            break;
                        case 2:
/* 55 */                    za0 za0Var = (za0) obj;
/* 61 */                    za0Var.f7139c.setChecked(za0Var.f20027m);
/* 66 */                    za0Var.f20033s.start();
                            break;
                        case 3:
/* 52 */                    ((ExpandableTransformationBehavior) obj).f5131b = null;
                            break;
                        case 4:
/* 46 */                    ((AbstractC1832ki) obj).mo6108e();
                            break;
                        case 5:
/* 41 */                    ((HideBottomViewOnScrollBehavior) obj).f4440d = null;
                            break;
                        case 6:
                        default:
/* 9 */                     super.onAnimationEnd(animator);
                            break;
                        case 7:
/* 28 */                    super.onAnimationEnd(animator);
/* 35 */                    ((RunnableC0804k) obj).f6011b.dismiss();
                            break;
                        case 8:
/* 21 */                    ((Transition) obj).m1098m();
/* 24 */                    animator.removeListener(this);
                            break;
                        case 9:
/* 15 */                    ((r43) obj).mo1186c();
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    switch (this.f18408a) {
                        case 6:
/* 10 */                    super.onAnimationRepeat(animator);
/* 15 */                    p71 p71Var = (p71) this.f18409b;
/* 27 */                    p71Var.f15007g = (p71Var.f15007g + 1) % p71Var.f15006f.f14764c.length;
/* 29 */                    p71Var.f15008h = true;
                            break;
                        default:
/* 6 */                     super.onAnimationRepeat(animator);
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    switch (this.f18408a) {
                        case 4:
/* 22 */                    ((AbstractC1832ki) this.f18409b).mo6109f(animator);
                            break;
                        case 9:
/* 14 */                    ((r43) this.f18409b).mo1185b();
                            break;
                        default:
/* 6 */                     super.onAnimationStart(animator);
                            break;
                    }
                }

/* 10 */        public /* synthetic */ C2315w1(Object obj, int i) {
/* 11 */            this.f18408a = i;
                    this.f18409b = obj;
                }
            }
