            package p000;

            import java.util.Locale;
            import java.util.concurrent.ThreadFactory;
            import java.util.concurrent.atomic.AtomicInteger;
            
            /* JADX INFO: renamed from: vp */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ThreadFactoryC2302vp implements ThreadFactory {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18276a;

                /* JADX INFO: renamed from: b */
                public final AtomicInteger f18277b;

                public ThreadFactoryC2302vp(int i) {
/* 1 */             this.f18276a = i;
                    switch (i) {
                        case 1:
/* 51 */                    this.f18277b = new AtomicInteger(0);
                            break;
                        case 2:
/* 39 */                    this.f18277b = new AtomicInteger(0);
                            break;
                        case 3:
/* 27 */                    this.f18277b = new AtomicInteger(1);
                            break;
                        default:
/* 15 */                    this.f18277b = new AtomicInteger(0);
                            break;
                    }
                }

                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
/* 1 */             int i = this.f18276a;
/* 3 */             AtomicInteger atomicInteger = this.f18277b;
                    switch (i) {
                        case 0:
/* 90 */                    Thread thread = new Thread(runnable);
/* 93 */                    Locale locale = Locale.US;
/* 113 */                   thread.setName("CameraX-core_camera_" + atomicInteger.getAndIncrement());
/* 116 */                   return thread;
                        case 1:
/* 63 */                    Thread thread2 = new Thread(runnable);
/* 84 */                    thread2.setName("arch_disk_io_" + atomicInteger.getAndIncrement());
/* 87 */                    return thread2;
                        case 2:
/* 34 */                    Thread thread3 = new Thread(runnable);
/* 37 */                    Locale locale2 = Locale.US;
/* 57 */                    thread3.setName("CameraX-camerax_io_" + atomicInteger.getAndIncrement());
/* 60 */                    return thread3;
                        default:
/* 28 */                    return new Thread(runnable, "ModernAsyncTask #" + atomicInteger.getAndIncrement());
                    }
                }
            }
