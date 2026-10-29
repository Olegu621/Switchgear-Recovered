            package p000;

            import java.util.concurrent.ThreadFactory;
            
            /* JADX INFO: renamed from: oy */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class ThreadFactoryC2050oy implements ThreadFactory {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f14913a;

                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
/* 5 */             Thread thread = new Thread(runnable, this.f14913a);
/* 10 */            thread.setPriority(10);
/* 13 */            return thread;
                }
            }
