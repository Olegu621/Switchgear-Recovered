            package p000;

            import com.appsflyer.internal.AFc1bSDK;
            import java.util.concurrent.RejectedExecutionHandler;
            import java.util.concurrent.ThreadPoolExecutor;
            
            /* JADX INFO: renamed from: up */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RejectedExecutionHandlerC2263up implements RejectedExecutionHandler {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17615a;

                public /* synthetic */ RejectedExecutionHandlerC2263up(int i) {
/* 1 */             this.f17615a = i;
                }

                @Override // java.util.concurrent.RejectedExecutionHandler
                public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                    switch (this.f17615a) {
                        case 0:
/* 14 */                    hu0.m4325T("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
                            break;
                        default:
/* 1 */                     AFc1bSDK.getCurrencyIso4217Code(runnable, threadPoolExecutor);
                            break;
                    }
                }
            }
