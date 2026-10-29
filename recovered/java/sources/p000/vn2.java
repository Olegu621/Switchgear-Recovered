            package p000;

            import java.util.concurrent.ThreadFactory;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class vn2 implements ThreadFactory {
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
/* 9 */             Thread thread = new Thread(new f72(runnable, 4));
/* 14 */            thread.setName("ThermalMonitorThread");
/* 17 */            return thread;
                }
            }
