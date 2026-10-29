            package p000;

            import com.supercell.titan.GameApp;
            import com.supercell.titan.VirtualKeyboardHandler;
            import java.util.concurrent.locks.ReentrantLock;
            
            /* JADX INFO: renamed from: tc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC2213tc implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17028a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ GameApp f17029b;

                public /* synthetic */ RunnableC2213tc(GameApp gameApp, int i) {
/* 1 */             this.f17028a = i;
/* 3 */             this.f17029b = gameApp;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f17028a;
/* 4 */             GameApp gameApp = this.f17029b;
                    switch (i) {
                        case 0:
/* 41 */                    int allowedScreenRotations = GameApp.getAllowedScreenRotations();
/* 57 */                    boolean z = ((allowedScreenRotations & 1) == 0 && (allowedScreenRotations & 2) == 0) ? false : true;
/* 60 */                    boolean z2 = ((allowedScreenRotations & 4) == 0 && (allowedScreenRotations & 8) == 0) ? false : true;
/* 67 */                    if (z && !z2) {
/* 72 */                        gameApp.setRequestedOrientation(7);
                            }
/* 75 */                    if (z2 && !z) {
/* 80 */                        gameApp.setRequestedOrientation(6);
                                break;
                            }
                            break;
                        case 1:
/* 17 */                    ReentrantLock reentrantLock = gameApp.f5780t0;
/* 23 */                    if (reentrantLock.tryLock()) {
/* 35 */                        gameApp.f5778r0 = VirtualKeyboardHandler.getKeyboardSize(gameApp.f5750W.getHeight());
/* 37 */                        reentrantLock.unlock();
                            }
                            break;
                        case 2:
/* 13 */                    gameApp.setSystemUiVisibility();
                            break;
                        default:
/* 9 */                     gameApp.handleResume(false);
                            break;
                    }
                }
            }
