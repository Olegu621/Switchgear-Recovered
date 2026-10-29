            package io.sentry.android.core.internal.util;

            import android.app.Activity;
            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import android.view.View;
            import android.view.ViewTreeObserver;
            import android.view.Window;
            import io.sentry.android.core.C1248o0;
            import io.sentry.android.core.internal.gestures.WindowCallbackC1200b;
            import io.sentry.android.core.performance.C1261i;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.RunnableC2301vo;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.util.j */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewTreeObserverOnDrawListenerC1223j implements ViewTreeObserver.OnDrawListener {

                /* JADX INFO: renamed from: a */
                public final Handler f10170a = new Handler(Looper.getMainLooper());

                /* JADX INFO: renamed from: b */
                public final AtomicReference f10171b;

                /* JADX INFO: renamed from: c */
                public final Runnable f10172c;

                public ViewTreeObserverOnDrawListenerC1223j(View view, Runnable runnable) {
/* 20 */            this.f10171b = new AtomicReference(view);
/* 22 */            this.f10172c = runnable;
                }

                /* JADX INFO: renamed from: a */
                public static void m4845a(Activity activity, Runnable runnable, C1248o0 c1248o0) {
/* 1 */             Window window = activity.getWindow();
/* 5 */             if (window != null) {
/* 7 */                 View viewPeekDecorView = window.peekDecorView();
/* 11 */                if (viewPeekDecorView != null) {
/* 13 */                    m4846b(viewPeekDecorView, runnable, c1248o0);
                        } else {
/* 17 */                    Window.Callback callback = window.getCallback();
/* 44 */                    window.setCallback(new C1261i(callback != null ? callback : new WindowCallbackC1200b(), new RunnableC2301vo(window, callback, runnable, c1248o0, 5)));
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public static void m4846b(View view, Runnable runnable, C1248o0 c1248o0) {
/* 3 */             ViewTreeObserverOnDrawListenerC1223j viewTreeObserverOnDrawListenerC1223j = new ViewTreeObserverOnDrawListenerC1223j(view, runnable);
/* 6 */             c1248o0.getClass();
/* 13 */            if (Build.VERSION.SDK_INT >= 26 || (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow())) {
/* 45 */                view.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC1223j);
                    } else {
/* 37 */                view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1221h(viewTreeObserverOnDrawListenerC1223j));
                    }
                }

                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
/* 8 */             View view = (View) this.f10171b.getAndSet(null);
/* 10 */            if (view == null) {
/* 12 */                return;
                    }
/* 22 */            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1222i(this, view));
/* 29 */            this.f10170a.postAtFrontOfQueue(this.f10172c);
                }
            }
