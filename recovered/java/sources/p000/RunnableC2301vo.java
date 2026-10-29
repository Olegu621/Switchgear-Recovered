            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.graphics.Canvas;
            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CaptureFailure;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.CaptureResult;
            import android.hardware.camera2.TotalCaptureResult;
            import android.view.View;
            import android.view.Window;
            import com.appsflyer.internal.AFd1zSDK;
            import com.appsflyer.internal.AFj1sSDK;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.android.core.C1248o0;
            import io.sentry.android.core.ScreenshotEventProcessor;
            import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC1223j;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: renamed from: vo */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC2301vo implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18256a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f18257b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f18258c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f18259d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f18260e;

                public /* synthetic */ RunnableC2301vo(Object obj, Object obj2, Object obj3, Object obj4, int i) {
/* 1 */             this.f18256a = i;
/* 3 */             this.f18257b = obj;
/* 5 */             this.f18258c = obj2;
/* 7 */             this.f18259d = obj3;
/* 9 */             this.f18260e = obj4;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f18256a;
/* 3 */             Object obj = this.f18260e;
/* 5 */             Object obj2 = this.f18259d;
/* 7 */             Object obj3 = this.f18258c;
/* 9 */             Object obj4 = this.f18257b;
                    switch (i) {
                        case 0:
/* 145 */                   ((CameraCaptureSession.CaptureCallback) ((C0997hn) obj4).f9152b).onCaptureCompleted((CameraCaptureSession) obj3, (CaptureRequest) obj2, (TotalCaptureResult) obj);
/* 148 */                   return;
                        case 1:
/* 129 */                   ((CameraCaptureSession.CaptureCallback) ((C0997hn) obj4).f9152b).onCaptureProgressed((CameraCaptureSession) obj3, (CaptureRequest) obj2, (CaptureResult) obj);
/* 132 */                   return;
                        case 2:
/* 113 */                   ((CameraCaptureSession.CaptureCallback) ((C0997hn) obj4).f9152b).onCaptureFailed((CameraCaptureSession) obj3, (CaptureRequest) obj2, (CaptureFailure) obj);
/* 116 */                   return;
                        case 3:
/* 1 */                     ((AFj1sSDK) obj4).getMonetizationNetwork((Context) obj3, (Runnable) obj2, (AFd1zSDK) obj);
/* 100 */                   return;
                        case 4:
/* 71 */                    CountDownLatch countDownLatch = (CountDownLatch) obj;
                            try {
/* 77 */                        ((AtomicReference) obj3).set(((ScreenshotEventProcessor) obj4).m4753a((Activity) obj2));
/* 83 */                        return;
                            } finally {
/* 85 */                        countDownLatch.countDown();
                            }
                        case 5:
/* 44 */                    Window window = (Window) obj4;
/* 46 */                    Window.Callback callback = (Window.Callback) obj3;
/* 48 */                    Runnable runnable = (Runnable) obj2;
/* 50 */                    C1248o0 c1248o0 = (C1248o0) obj;
/* 52 */                    View viewPeekDecorView = window.peekDecorView();
/* 56 */                    if (viewPeekDecorView != null) {
/* 58 */                        window.setCallback(callback);
/* 61 */                        ViewTreeObserverOnDrawListenerC1223j.m4846b(viewPeekDecorView, runnable, c1248o0);
/* 64 */                        return;
                            }
/* 64 */                    return;
                        default:
/* 18 */                    ILogger iLogger = (ILogger) obj2;
/* 20 */                    CountDownLatch countDownLatch2 = (CountDownLatch) obj;
                            try {
/* 22 */                        ((View) obj4).draw((Canvas) obj3);
                                break;
                            } catch (Throwable th) {
                                try {
/* 34 */                            iLogger.mo4671d(EnumC1553m5.ERROR, "Taking screenshot failed (view.draw).", th);
                                } finally {
/* 40 */                            countDownLatch2.countDown();
                                }
                                break;
                            }
/* 38 */                    return;
                    }
                }
            }
