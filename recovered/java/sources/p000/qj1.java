            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import android.os.Message;
            import android.os.SystemClock;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.NativeHTTPClientManager;
            import com.supercell.titan.NativeHTTPConnection;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.concurrent.CountDownLatch;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public final class qj1 extends Handler {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15579a = 1;

                public /* synthetic */ qj1() {
                }

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    switch (this.f15579a) {
                        case 0:
/* 30 */                    pj1 pj1Var = (pj1) message.obj;
/* 32 */                    int i = message.what;
/* 35 */                    if (i != 1) {
/* 38 */                        if (i != 2) {
/* 143 */                           return;
                                }
/* 41 */                        RunnableC2289vd runnableC2289vd = pj1Var.f15142a;
/* 143 */                       return;
                            }
/* 44 */                    RunnableC2289vd runnableC2289vd2 = pj1Var.f15142a;
/* 49 */                    Object obj = pj1Var.f15143b[0];
/* 58 */                    if (runnableC2289vd2.f18007d.get()) {
/* 60 */                        CountDownLatch countDownLatch = runnableC2289vd2.f18009f;
                                try {
/* 62 */                            lc3 lc3Var = runnableC2289vd2.f18010i;
/* 66 */                            if (lc3Var.f13193h == runnableC2289vd2) {
/* 68 */                                SystemClock.uptimeMillis();
/* 71 */                                lc3Var.f13193h = null;
/* 73 */                                lc3Var.m6418b();
                                    }
/* 76 */                            countDownLatch.countDown();
                                } catch (Throwable th) {
/* 81 */                            countDownLatch.countDown();
/* 84 */                            throw th;
                                }
                                break;
                            } else {
                                try {
/* 85 */                            lc3 lc3Var2 = runnableC2289vd2.f18010i;
/* 89 */                            if (lc3Var2.f13192g != runnableC2289vd2) {
/* 93 */                                if (lc3Var2.f13193h == runnableC2289vd2) {
/* 95 */                                    SystemClock.uptimeMillis();
/* 98 */                                    lc3Var2.f13193h = null;
/* 100 */                                   lc3Var2.m6418b();
                                        }
                                    } else if (!lc3Var2.f13188c) {
/* 109 */                               SystemClock.uptimeMillis();
/* 112 */                               lc3Var2.f13192g = null;
/* 114 */                               c91 c91Var = lc3Var2.f13186a;
/* 116 */                               if (c91Var != null) {
/* 126 */                                   if (Looper.myLooper() == Looper.getMainLooper()) {
/* 128 */                                       c91Var.mo124j(obj);
                                            } else {
/* 132 */                                       c91Var.m8193k(obj);
                                            }
                                        }
                                    }
/* 137 */                           runnableC2289vd2.f18009f.countDown();
                                } catch (Throwable th2) {
/* 147 */                           runnableC2289vd2.f18009f.countDown();
/* 150 */                           throw th2;
                                }
                            }
/* 141 */                   runnableC2289vd2.f18006c = 3;
/* 143 */                   return;
                        default:
                            try {
/* 12 */                        NativeHTTPClientManager.f5832c.add((NativeHTTPConnection) message.obj);
/* 27 */                        return;
                            } catch (Exception e) {
/* 21 */                        AbstractC1245n0.m4877e("NativeHTTPClientManager", "NativeHTTPClientManager.HTTPClientHandler", e);
/* 24 */                        GameApp.debuggerException(e);
/* 27 */                        return;
                            }
                    }
                }

/* 7 */         public /* synthetic */ qj1(Looper looper) {
                    super(looper);
                }
            }
