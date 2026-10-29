            package p000;

            import android.graphics.drawable.ShapeDrawable;
            import android.view.animation.Animation;
            import android.widget.ImageView;
            
            /* JADX INFO: renamed from: nu */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1977nu extends ImageView {

                /* JADX INFO: renamed from: a */
                public Animation.AnimationListener f14454a;

                /* JADX INFO: renamed from: b */
                public int f14455b;

                @Override // android.view.View
                public final void onAnimationEnd() {
/* 1 */             super.onAnimationEnd();
/* 4 */             Animation.AnimationListener animationListener = this.f14454a;
/* 6 */             if (animationListener != null) {
/* 12 */                animationListener.onAnimationEnd(getAnimation());
                    }
                }

                @Override // android.view.View
                public final void onAnimationStart() {
/* 1 */             super.onAnimationStart();
/* 4 */             Animation.AnimationListener animationListener = this.f14454a;
/* 6 */             if (animationListener != null) {
/* 12 */                animationListener.onAnimationStart(getAnimation());
                    }
                }

                @Override // android.widget.ImageView, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
                }

                @Override // android.view.View
                public final void setBackgroundColor(int i) {
/* 7 */             if (getBackground() instanceof ShapeDrawable) {
/* 19 */                ((ShapeDrawable) getBackground()).getPaint().setColor(i);
/* 22 */                this.f14455b = i;
                    }
                }
            }
