            package p000;

            import android.os.Build;
            import android.os.StrictMode;
            import com.google.firebase.concurrent.ExecutorsRegistrar;
            import java.util.Collections;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            
            /* JADX INFO: renamed from: gy */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C0971gy implements iz1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8845a;

                @Override // p000.iz1
                public final Object get() {
                    switch (this.f8845a) {
                        case 0:
/* 168 */                   return Collections.EMPTY_SET;
                        case 1:
/* 109 */                   q51 q51Var = ExecutorsRegistrar.f5284a;
/* 116 */                   StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
/* 120 */                   builderDetectNetwork.detectResourceMismatches();
/* 127 */                   if (Build.VERSION.SDK_INT >= 26) {
/* 1 */                         builderDetectNetwork.detectUnbufferedIo();
                            }
/* 164 */                   return new m70(Executors.newFixedThreadPool(4, new q30("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f5287d.get());
                        case 2:
/* 52 */                    q51 q51Var2 = ExecutorsRegistrar.f5284a;
/* 105 */                   return new m70(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new q30("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f5287d.get());
                        case 3:
/* 23 */                    q51 q51Var3 = ExecutorsRegistrar.f5284a;
/* 48 */                    return new m70(Executors.newCachedThreadPool(new q30("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f5287d.get());
                        case 4:
/* 9 */                     q51 q51Var4 = ExecutorsRegistrar.f5284a;
/* 18 */                    return Executors.newSingleThreadScheduledExecutor(new q30("Firebase Scheduler", 0, null));
                        default:
/* 4 */                     return null;
                    }
                }
            }
