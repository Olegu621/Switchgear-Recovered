            package p000;

            import java.io.Serializable;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ThreadFactory;
            import java.util.concurrent.atomic.AtomicInteger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 20 */    public final class hl1 implements ThreadFactory {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9132a;

                /* JADX INFO: renamed from: b */
                public final ThreadFactory f9133b;

                /* JADX INFO: renamed from: c */
                public final Serializable f9134c;

                public hl1() {
/* 2 */             this.f9132a = 1;
/* 11 */            this.f9133b = Executors.defaultThreadFactory();
/* 19 */            this.f9134c = new AtomicInteger(1);
                }

                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
/* 1 */             int i = this.f9132a;
/* 3 */             ThreadFactory threadFactory = this.f9133b;
/* 5 */             Serializable serializable = this.f9134c;
                    switch (i) {
                        case 0:
/* 44 */                    Thread threadNewThread = threadFactory.newThread(new f62(runnable, 4));
/* 50 */                    threadNewThread.setName((String) serializable);
/* 53 */                    return threadNewThread;
                        default:
/* 12 */                    Thread threadNewThread2 = threadFactory.newThread(runnable);
/* 34 */                    threadNewThread2.setName("PlayBillingLibrary-" + ((AtomicInteger) serializable).getAndIncrement());
/* 37 */                    return threadNewThread2;
                    }
                }

/* 21 */        public hl1(String str) {
                    this.f9132a = 0;
                    this.f9133b = Executors.defaultThreadFactory();
/* 23 */            this.f9134c = str;
                }
            }
