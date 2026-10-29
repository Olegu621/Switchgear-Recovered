            package p000;

            import java.util.concurrent.ThreadFactory;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qs0 implements ThreadFactory {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15726a;

                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    switch (this.f15726a) {
                        case 0:
/* 32 */                    return new Thread(runnable, "hs_notif_poller");
                        case 1:
/* 14 */                    Thread thread = new Thread(runnable);
/* 19 */                    thread.setPriority(10);
/* 24 */                    thread.setName("CameraX-camerax_high_priority");
/* 27 */                    return thread;
                        default:
/* 8 */                     return new m32(runnable);
                    }
                }
            }
