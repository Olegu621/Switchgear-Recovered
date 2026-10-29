            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.transition.Transition;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a63 extends AnimatorListenerAdapter implements ir2 {

                /* JADX INFO: renamed from: a */
                public final View f100a;

                /* JADX INFO: renamed from: b */
                public final int f101b;

                /* JADX INFO: renamed from: c */
                public final ViewGroup f102c;

                /* JADX INFO: renamed from: e */
                public boolean f104e;

                /* JADX INFO: renamed from: f */
                public boolean f105f = false;

                /* JADX INFO: renamed from: d */
                public final boolean f103d = true;

                public a63(View view, int i) {
/* 7 */             this.f100a = view;
/* 9 */             this.f101b = i;
/* 17 */            this.f102c = (ViewGroup) view.getParent();
/* 22 */            m91f(true);
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: a */
                public final void mo86a(Transition transition) {
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: b */
                public final void mo87b(Transition transition) {
/* 2 */             m91f(false);
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: c */
                public final void mo88c(Transition transition) {
/* 3 */             if (!this.f105f) {
/* 9 */                 l53.m6344c(this.f101b, this.f100a);
/* 12 */                ViewGroup viewGroup = this.f102c;
/* 14 */                if (viewGroup != null) {
/* 16 */                    viewGroup.invalidate();
                        }
                    }
/* 20 */            m91f(false);
/* 23 */            transition.m1104v(this);
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: d */
                public final void mo89d(Transition transition) {
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: e */
                public final void mo90e(Transition transition) {
/* 2 */             m91f(true);
                }

                /* JADX INFO: renamed from: f */
                public final void m91f(boolean z) {
                    ViewGroup viewGroup;
/* 3 */             if (!this.f103d || this.f104e == z || (viewGroup = this.f102c) == null) {
/* 18 */                return;
                    }
/* 13 */            this.f104e = z;
/* 15 */            py0.m7612u0(viewGroup, z);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
/* 2 */             this.f105f = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
/* 3 */             if (!this.f105f) {
/* 9 */                 l53.m6344c(this.f101b, this.f100a);
/* 12 */                ViewGroup viewGroup = this.f102c;
/* 14 */                if (viewGroup != null) {
/* 16 */                    viewGroup.invalidate();
                        }
                    }
/* 20 */            m91f(false);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
                public final void onAnimationPause(Animator animator) {
/* 3 */             if (this.f105f) {
/* 12 */                return;
                    }
/* 9 */             l53.m6344c(this.f101b, this.f100a);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
                public final void onAnimationResume(Animator animator) {
/* 3 */             if (this.f105f) {
/* 11 */                return;
                    }
/* 8 */             l53.m6344c(0, this.f100a);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }
