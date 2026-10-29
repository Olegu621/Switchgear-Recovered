            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.view.View;
            import androidx.transition.R$id;
            import androidx.transition.Transition;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pr2 extends AnimatorListenerAdapter implements ir2 {

                /* JADX INFO: renamed from: a */
                public final View f15260a;

                /* JADX INFO: renamed from: b */
                public final View f15261b;

                /* JADX INFO: renamed from: c */
                public final int f15262c;

                /* JADX INFO: renamed from: d */
                public final int f15263d;

                /* JADX INFO: renamed from: e */
                public int[] f15264e;

                /* JADX INFO: renamed from: f */
                public float f15265f;

                /* JADX INFO: renamed from: g */
                public float f15266g;

                /* JADX INFO: renamed from: h */
                public final float f15267h;

                /* JADX INFO: renamed from: i */
                public final float f15268i;

                public pr2(View view, View view2, int i, int i2, float f, float f2) {
/* 4 */             this.f15261b = view;
/* 6 */             this.f15260a = view2;
/* 17 */            this.f15262c = i - Math.round(view.getTranslationX());
/* 28 */            this.f15263d = i2 - Math.round(view.getTranslationY());
/* 30 */            this.f15267h = f;
/* 32 */            this.f15268i = f2;
/* 40 */            int[] iArr = (int[]) view2.getTag(R$id.transition_position);
/* 42 */            this.f15264e = iArr;
/* 44 */            if (iArr != null) {
/* 49 */                view2.setTag(R$id.transition_position, null);
                    }
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: a */
                public final void mo86a(Transition transition) {
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: b */
                public final void mo87b(Transition transition) {
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: c */
                public final void mo88c(Transition transition) {
/* 1 */             float f = this.f15267h;
/* 3 */             View view = this.f15261b;
/* 5 */             view.setTranslationX(f);
/* 10 */            view.setTranslationY(this.f15268i);
/* 13 */            transition.m1104v(this);
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: d */
                public final void mo89d(Transition transition) {
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: e */
                public final void mo90e(Transition transition) {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
/* 3 */             if (this.f15264e == null) {
/* 8 */                 this.f15264e = new int[2];
                    }
/* 10 */            int[] iArr = this.f15264e;
/* 12 */            float f = this.f15262c;
/* 15 */            View view = this.f15261b;
/* 27 */            iArr[0] = Math.round(view.getTranslationX() + f);
/* 44 */            this.f15264e[1] = Math.round(view.getTranslationY() + this.f15263d);
/* 52 */            this.f15260a.setTag(R$id.transition_position, this.f15264e);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
                public final void onAnimationPause(Animator animator) {
/* 1 */             View view = this.f15261b;
/* 7 */             this.f15265f = view.getTranslationX();
/* 13 */            this.f15266g = view.getTranslationY();
/* 17 */            view.setTranslationX(this.f15267h);
/* 22 */            view.setTranslationY(this.f15268i);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
                public final void onAnimationResume(Animator animator) {
/* 1 */             float f = this.f15265f;
/* 3 */             View view = this.f15261b;
/* 5 */             view.setTranslationX(f);
/* 10 */            view.setTranslationY(this.f15266g);
                }
            }
