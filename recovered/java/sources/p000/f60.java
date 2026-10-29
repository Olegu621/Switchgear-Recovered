            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.view.View;
            import android.view.ViewPropertyAnimator;
            import androidx.recyclerview.widget.AbstractC0137o;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class f60 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AbstractC0137o f8009a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f8010b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ View f8011c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f8012d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ViewPropertyAnimator f8013e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ j60 f8014f;

                public f60(j60 j60Var, AbstractC0137o abstractC0137o, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
/* 1 */             this.f8014f = j60Var;
/* 3 */             this.f8009a = abstractC0137o;
/* 5 */             this.f8010b = i;
/* 7 */             this.f8011c = view;
/* 9 */             this.f8012d = i2;
/* 11 */            this.f8013e = viewPropertyAnimator;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
/* 1 */             int i = this.f8010b;
/* 4 */             View view = this.f8011c;
/* 6 */             if (i != 0) {
/* 8 */                 view.setTranslationX(0.0f);
                    }
/* 13 */            if (this.f8012d != 0) {
/* 15 */                view.setTranslationY(0.0f);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
/* 4 */             this.f8013e.setListener(null);
/* 7 */             j60 j60Var = this.f8014f;
/* 9 */             AbstractC0137o abstractC0137o = this.f8009a;
/* 11 */            j60Var.m6851c(abstractC0137o);
/* 16 */            j60Var.f12092p.remove(abstractC0137o);
/* 19 */            j60Var.m5718i();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
/* 3 */             this.f8014f.getClass();
                }
            }
