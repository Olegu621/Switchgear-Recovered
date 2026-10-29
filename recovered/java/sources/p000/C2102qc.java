            package p000;

            import android.os.Process;
            import com.supercell.titan.ApplicationUtil;
            
            /* JADX INFO: renamed from: qc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public final class C2102qc extends Thread {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15484a = 0;

                public /* synthetic */ C2102qc() {
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    switch (this.f15484a) {
                        case 0:
/* 24 */                    Process.setThreadPriority(10);
/* 27 */                    ApplicationUtil.getAdvertiserIDBlocking();
/* 34 */                    ApplicationUtil.m_adInfoRetrieved.compareAndSet(false, true);
/* 37 */                    return;
                        default:
/* 8 */                     Process.setThreadPriority(19);
                            synchronized (this) {
                                while (true) {
                                    try {
/* 12 */                                wait();
                                    } catch (InterruptedException unused) {
/* 19 */                                return;
                                    }
                                }
                            }
                            break;
                    }
                }

/* 7 */         public /* synthetic */ C2102qc(ThreadGroup threadGroup, String str) {
                    super(threadGroup, str);
                }
            }
