            package p000;

            import android.os.Process;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class f62 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8026a;

                /* JADX INFO: renamed from: b */
                public final Runnable f8027b;

                public /* synthetic */ f62(Runnable runnable, int i) {
/* 1 */             this.f8026a = i;
/* 3 */             this.f8027b = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f8026a;
/* 3 */             Runnable runnable = this.f8027b;
                    switch (i) {
                        case 0:
                            try {
/* 37 */                        runnable.run();
                            } catch (Exception e) {
/* 46 */                        py0.m7595R("Executor", "Background execution failure.", e);
/* 49 */                        return;
                            }
                            break;
                        case 1:
                            try {
/* 24 */                        runnable.run();
                            } catch (Exception e2) {
/* 33 */                        xe2.m9777o("SfeWrpRnnble", "Error running operation", e2);
/* 36 */                        return;
                            }
                            break;
                        case 2:
/* 20 */                    runnable.run();
                            break;
                        case 3:
/* 16 */                    runnable.run();
                            break;
                        default:
/* 9 */                     Process.setThreadPriority(0);
/* 12 */                    runnable.run();
                            break;
                    }
                }

                public String toString() {
                    switch (this.f8026a) {
                        case 2:
/* 13 */                    return this.f8027b.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
