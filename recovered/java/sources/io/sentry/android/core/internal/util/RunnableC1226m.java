            package io.sentry.android.core.internal.util;

            import android.os.Handler;
            import android.view.Window;
            import io.sentry.EnumC1553m5;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.util.m */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC1226m implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10183a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1231r f10184b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Window f10185c;

                public /* synthetic */ RunnableC1226m(C1231r c1231r, Window window, int i) {
/* 1 */             this.f10183a = i;
/* 3 */             this.f10184b = c1231r;
/* 5 */             this.f10185c = window;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f10183a) {
                        case 0:
/* 43 */                    C1231r c1231r = this.f10184b;
/* 45 */                    Window window = this.f10185c;
/* 53 */                    if (c1231r.f10198b.add(window)) {
                                try {
/* 55 */                            C1217d c1217d = c1231r.f10205w;
/* 57 */                            WindowOnFrameMetricsAvailableListenerC1227n windowOnFrameMetricsAvailableListenerC1227n = c1231r.f10191U;
/* 59 */                            Handler handler = c1231r.f10200d;
/* 61 */                            c1217d.getClass();
/* 64 */                            if (windowOnFrameMetricsAvailableListenerC1227n != null) {
/* 67 */                                window.addOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC1227n, handler);
                                    }
                                } catch (Throwable th) {
/* 78 */                            c1231r.f10199c.mo4671d(EnumC1553m5.ERROR, "Failed to add frameMetricsAvailableListener", th);
/* 81 */                            return;
                                }
                            }
                            break;
                        default:
/* 6 */                     C1231r c1231r2 = this.f10184b;
/* 8 */                     Window window2 = this.f10185c;
                            try {
/* 16 */                        if (c1231r2.f10198b.remove(window2)) {
/* 18 */                            C1217d c1217d2 = c1231r2.f10205w;
/* 20 */                            WindowOnFrameMetricsAvailableListenerC1227n windowOnFrameMetricsAvailableListenerC1227n2 = c1231r2.f10191U;
/* 22 */                            c1217d2.getClass();
/* 25 */                            if (windowOnFrameMetricsAvailableListenerC1227n2 != null) {
/* 28 */                                window2.removeOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC1227n2);
                                    }
                                }
                            } catch (Throwable th2) {
/* 39 */                        c1231r2.f10199c.mo4671d(EnumC1553m5.ERROR, "Failed to remove frameMetricsAvailableListener", th2);
                            }
                            break;
                    }
                }
            }
