            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.widget.TextView;
            import androidx.appcompat.widget.AppCompatTextView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nx0 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14556a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ TextView f14557b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f14558c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ TextView f14559d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ px0 f14560e;

                public nx0(px0 px0Var, int i, TextView textView, int i2, TextView textView2) {
/* 1 */             this.f14560e = px0Var;
/* 3 */             this.f14556a = i;
/* 5 */             this.f14557b = textView;
/* 7 */             this.f14558c = i2;
/* 9 */             this.f14559d = textView2;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    AppCompatTextView appCompatTextView;
/* 1 */             int i = this.f14556a;
/* 3 */             px0 px0Var = this.f14560e;
/* 5 */             px0Var.f15308h = i;
/* 8 */             px0Var.f15306f = null;
/* 10 */            TextView textView = this.f14557b;
/* 12 */            if (textView != null) {
/* 15 */                textView.setVisibility(4);
/* 21 */                if (this.f14558c == 1 && (appCompatTextView = px0Var.f15312l) != null) {
/* 27 */                    appCompatTextView.setText((CharSequence) null);
                        }
                    }
/* 30 */            TextView textView2 = this.f14559d;
/* 32 */            if (textView2 != null) {
/* 35 */                textView2.setTranslationY(0.0f);
/* 40 */                textView2.setAlpha(1.0f);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
/* 1 */             TextView textView = this.f14559d;
/* 3 */             if (textView != null) {
/* 6 */                 textView.setVisibility(0);
                    }
                }
            }
