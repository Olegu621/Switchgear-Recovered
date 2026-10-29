            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import com.google.android.material.floatingactionbutton.FloatingActionButton;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vj0 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public boolean f18217a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f18218b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ wc0 f18219c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ bk0 f18220d;

                public vj0(bk0 bk0Var, boolean z, wc0 wc0Var) {
/* 1 */             this.f18220d = bk0Var;
/* 3 */             this.f18218b = z;
/* 5 */             this.f18219c = wc0Var;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
/* 2 */             this.f18217a = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
/* 2 */             bk0 bk0Var = this.f18220d;
/* 4 */             bk0Var.f2483q = 0;
/* 7 */             bk0Var.f2478l = null;
/* 11 */            if (this.f18217a) {
/* 41 */                return;
                    }
/* 13 */            FloatingActionButton floatingActionButton = bk0Var.f2487u;
/* 15 */            boolean z = this.f18218b;
/* 23 */            floatingActionButton.m2344a(z ? 8 : 4, z);
/* 26 */            wc0 wc0Var = this.f18219c;
/* 28 */            if (wc0Var != null) {
/* 38 */                ((he3) wc0Var.f18577b).mo4204k((FloatingActionButton) wc0Var.f18578c);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
/* 1 */             bk0 bk0Var = this.f18220d;
/* 8 */             bk0Var.f2487u.m2344a(0, this.f18218b);
/* 12 */            bk0Var.f2483q = 1;
/* 14 */            bk0Var.f2478l = animator;
/* 16 */            this.f18217a = false;
                }
            }
