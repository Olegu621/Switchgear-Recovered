            package p000;

            import android.os.Process;
            import androidx.lifecycle.ProcessLifecycleOwner;
            import com.appsflyer.internal.AFj1sSDK;
            import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
            import io.sentry.android.core.internal.util.C1218e;
            import io.sentry.android.ndk.SentryNdk;
            
            /* JADX INFO: renamed from: h7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public final /* synthetic */ class RunnableC0981h7 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8940a;

                /* JADX INFO: renamed from: a */
                private final void m4119a() {
                }

                /* JADX INFO: renamed from: b */
                private final void m4120b() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f8940a) {
                        case 0:
/* 52 */                    int i = AlarmManagerSchedulerBroadcastReceiver.f3124a;
                            break;
                        case 1:
                        case 2:
                            break;
                        case 3:
                            try {
/* 31 */                        ProcessLifecycleOwner.f1535w.f1541f.mo4483a(new vx1());
/* 35 */                        vx1.f18385b = 3;
                            } catch (NoClassDefFoundError unused) {
/* 39 */                        vx1.f18385b = 1;
/* 48 */                        k50.m5980q("vx1", "Class 'ProcessLifecycleOwner' not found. The tracker can't track lifecycle events.", new Object[0]);
/* 51 */                        return;
                            }
                            break;
                        case 4:
/* 1 */                     AFj1sSDK.getRevenue();
                            break;
                        case 5:
/* 15 */                    C1218e.f10158b = Process.myTid();
                            break;
                        default:
/* 1 */                     SentryNdk.lambda$static$0();
                            break;
                    }
                }

/* 7 */         public /* synthetic */ RunnableC0981h7(int i) {
/* 8 */             this.f8940a = i;
                }
            }
