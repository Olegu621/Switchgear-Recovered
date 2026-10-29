            package p000;

            import android.animation.Animator;
            
            /* JADX INFO: renamed from: ru */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2157ru implements Animator.AnimatorListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C2194su f16295a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2231tu f16296b;

                public C2157ru(C2231tu c2231tu, C2194su c2194su) {
/* 4 */             this.f16296b = c2231tu;
/* 6 */             this.f16295a = c2194su;
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
/* 1 */             C2231tu c2231tu = this.f16296b;
/* 5 */             C2194su c2194su = this.f16295a;
/* 8 */             c2231tu.m8914a(1.0f, c2194su, true);
/* 13 */            c2194su.f16790k = c2194su.f16784e;
/* 17 */            c2194su.f16791l = c2194su.f16785f;
/* 21 */            c2194su.f16792m = c2194su.f16786g;
/* 30 */            c2194su.m8633a((c2194su.f16789j + 1) % c2194su.f16788i.length);
/* 35 */            if (!c2231tu.f17269f) {
/* 61 */                c2231tu.f17268e += 1.0f;
/* 63 */                return;
                    }
/* 38 */            c2231tu.f17269f = false;
/* 40 */            animator.cancel();
/* 45 */            animator.setDuration(1332L);
/* 48 */            animator.start();
/* 53 */            if (c2194su.f16793n) {
/* 55 */                c2194su.f16793n = false;
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
/* 4 */             this.f16296b.f17268e = 0.0f;
                }
            }
