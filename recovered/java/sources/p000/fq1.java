            package p000;

            import android.view.View;
            import android.view.ViewTreeObserver;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fq1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

                /* JADX INFO: renamed from: a */
                private final View f8316a;

                /* JADX INFO: renamed from: b */
                public ViewTreeObserver f8317b;

                /* JADX INFO: renamed from: c */
                private final Runnable f8318c;

                public fq1(View view, Runnable runnable) {
/* 4 */             this.f8316a = view;
/* 10 */            this.f8317b = view.getViewTreeObserver();
/* 12 */            this.f8318c = runnable;
                }

                /* JADX INFO: renamed from: a */
                public static void m3803a(View view, Runnable runnable) {
/* 1 */             if (view == null) {
/* 21 */                C1951n4.m6868s("view == null");
/* 24 */                return;
                    }
/* 5 */             fq1 fq1Var = new fq1(view, runnable);
/* 12 */            view.getViewTreeObserver().addOnPreDrawListener(fq1Var);
/* 15 */            view.addOnAttachStateChangeListener(fq1Var);
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
/* 7 */             if (this.f8317b.isAlive()) {
/* 11 */                this.f8317b.removeOnPreDrawListener(this);
                    } else {
/* 21 */                this.f8316a.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
/* 26 */            this.f8316a.removeOnAttachStateChangeListener(this);
/* 31 */            this.f8318c.run();
/* 34 */            return true;
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
/* 5 */             this.f8317b = view.getViewTreeObserver();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
/* 7 */             if (this.f8317b.isAlive()) {
/* 11 */                this.f8317b.removeOnPreDrawListener(this);
                    } else {
/* 21 */                this.f8316a.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
/* 26 */            this.f8316a.removeOnAttachStateChangeListener(this);
                }
            }
