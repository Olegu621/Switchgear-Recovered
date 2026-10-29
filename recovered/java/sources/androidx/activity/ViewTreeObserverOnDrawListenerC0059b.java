            package androidx.activity;

            import android.os.Looper;
            import android.os.SystemClock;
            import android.view.View;
            import android.view.ViewTreeObserver;
            import p000.InterfaceExecutorC0160ay;
            import p000.RunnableC2166s2;
            import p000.wn0;
            
            /* JADX INFO: renamed from: androidx.activity.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewTreeObserverOnDrawListenerC0059b implements InterfaceExecutorC0160ay, ViewTreeObserver.OnDrawListener, Runnable {

                /* JADX INFO: renamed from: b */
                public Runnable f348b;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ComponentActivity f350d;

                /* JADX INFO: renamed from: a */
                public final long f347a = SystemClock.uptimeMillis() + 10000;

                /* JADX INFO: renamed from: c */
                public boolean f349c = false;

                public ViewTreeObserverOnDrawListenerC0059b(ComponentActivity componentActivity) {
/* 4 */             this.f350d = componentActivity;
                }

                /* JADX INFO: renamed from: a */
                public final void m323a(View view) {
/* 3 */             if (this.f349c) {
/* 15 */                return;
                    }
/* 6 */             this.f349c = true;
/* 12 */            view.getViewTreeObserver().addOnDrawListener(this);
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
/* 1 */             this.f348b = runnable;
/* 9 */             View decorView = this.f350d.getWindow().getDecorView();
/* 15 */            if (!this.f349c) {
/* 42 */                decorView.postOnAnimation(new RunnableC2166s2(this, 11));
                    } else if (Looper.myLooper() == Looper.getMainLooper()) {
/* 27 */                decorView.invalidate();
                    } else {
/* 31 */                decorView.postInvalidate();
                    }
                }

                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    boolean z;
/* 1 */             Runnable runnable = this.f348b;
/* 4 */             if (runnable == null) {
/* 51 */                if (SystemClock.uptimeMillis() > this.f347a) {
/* 53 */                    this.f349c = false;
/* 65 */                    this.f350d.getWindow().getDecorView().post(this);
/* 68 */                    return;
                        }
/* 68 */                return;
                    }
/* 6 */             runnable.run();
/* 10 */            this.f348b = null;
/* 14 */            wn0 wn0Var = this.f350d.mFullyDrawnReporter;
                    synchronized (wn0Var.f18697a) {
/* 19 */                z = wn0Var.f18698b;
                    }
/* 22 */            if (z) {
/* 24 */                this.f349c = false;
/* 36 */                this.f350d.getWindow().getDecorView().post(this);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 15 */            this.f350d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
                }
            }
