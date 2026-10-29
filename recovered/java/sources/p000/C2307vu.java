            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            
            /* JADX INFO: renamed from: vu */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2307vu extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18354a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC0157av f18355b;

                public /* synthetic */ C2307vu(InterfaceC0157av interfaceC0157av, int i) {
/* 1 */             this.f18354a = i;
/* 3 */             this.f18355b = interfaceC0157av;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
/* 1 */             int i = this.f18354a;
/* 3 */             InterfaceC0157av interfaceC0157av = this.f18355b;
                    switch (i) {
                        case 0:
/* 21 */                    interfaceC0157av.mo1171b();
                            break;
                        default:
/* 8 */                     C2564zu revealInfo = interfaceC0157av.getRevealInfo();
/* 15 */                    revealInfo.f20329c = Float.MAX_VALUE;
/* 17 */                    interfaceC0157av.setRevealInfo(revealInfo);
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    switch (this.f18354a) {
                        case 0:
/* 12 */                    this.f18355b.mo1170a();
                            break;
                        default:
/* 6 */                     super.onAnimationStart(animator);
                            break;
                    }
                }
            }
