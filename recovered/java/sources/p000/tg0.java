            package p000;

            import android.view.View;
            import androidx.transition.Transition;
            import androidx.transition.TransitionSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public final class tg0 extends jr2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17085a;

                /* JADX INFO: renamed from: b */
                public Object f17086b;

                public /* synthetic */ tg0(Object obj, int i) {
/* 1 */             this.f17085a = i;
/* 3 */             this.f17086b = obj;
                }

                @Override // p000.jr2, p000.ir2
                /* JADX INFO: renamed from: a */
                public void mo86a(Transition transition) {
                    switch (this.f17085a) {
                        case 2:
/* 9 */                     TransitionSet transitionSet = (TransitionSet) this.f17086b;
/* 13 */                    if (!transitionSet.f1911m0) {
/* 15 */                        transitionSet.m1088F();
/* 19 */                        transitionSet.f1911m0 = true;
                            }
                            break;
                    }
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: c */
                public final void mo88c(Transition transition) {
                    switch (this.f17085a) {
                        case 0:
/* 45 */                    l53.m6343b((View) this.f17086b, 1.0f);
/* 50 */                    l53.f13119a.getClass();
/* 53 */                    transition.m1104v(this);
                            break;
                        case 1:
/* 32 */                    ((Transition) this.f17086b).mo1107y();
/* 35 */                    transition.m1104v(this);
                            break;
                        default:
/* 8 */                     TransitionSet transitionSet = (TransitionSet) this.f17086b;
/* 12 */                    int i = transitionSet.f1910l0 - 1;
/* 14 */                    transitionSet.f1910l0 = i;
/* 16 */                    if (i == 0) {
/* 19 */                        transitionSet.f1911m0 = false;
/* 21 */                        transitionSet.m1098m();
                            }
/* 24 */                    transition.m1104v(this);
                            break;
                    }
                }

/* 8 */         public /* synthetic */ tg0() {
/* 9 */             this.f17085a = 2;
                }
            }
