            package io.sentry.android.core.performance;

            import android.view.Window;
            import io.sentry.android.core.internal.gestures.AbstractWindowCallbackC1208j;
            import p000.RunnableC2301vo;
            
            /* JADX INFO: renamed from: io.sentry.android.core.performance.i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1261i extends AbstractWindowCallbackC1208j {

                /* JADX INFO: renamed from: b */
                public final RunnableC2301vo f10285b;

                public C1261i(Window.Callback callback, RunnableC2301vo runnableC2301vo) {
/* 1 */             super(callback);
/* 4 */             this.f10285b = runnableC2301vo;
                }

                @Override // io.sentry.android.core.internal.gestures.AbstractWindowCallbackC1208j, android.view.Window.Callback
                public final void onContentChanged() {
/* 1 */             super.onContentChanged();
/* 6 */             this.f10285b.run();
                }
            }
