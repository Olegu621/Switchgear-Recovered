            package p000;

            import android.os.Looper;
            import java.util.Iterator;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: renamed from: vd */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC2289vd implements Runnable {

                /* JADX INFO: renamed from: U */
                public static volatile ThreadPoolExecutor f18001U;

                /* JADX INFO: renamed from: v */
                public static final ThreadPoolExecutor f18002v;

                /* JADX INFO: renamed from: w */
                public static qj1 f18003w;

                /* JADX INFO: renamed from: a */
                public final CallableC2139rc f18004a;

                /* JADX INFO: renamed from: b */
                public final oj1 f18005b;

                /* JADX INFO: renamed from: c */
                public volatile int f18006c = 1;

                /* JADX INFO: renamed from: d */
                public final AtomicBoolean f18007d = new AtomicBoolean();

                /* JADX INFO: renamed from: e */
                public final AtomicBoolean f18008e = new AtomicBoolean();

                /* JADX INFO: renamed from: f */
                public final CountDownLatch f18009f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ lc3 f18010i;

                static {
/* 4 */             ThreadFactoryC2302vp threadFactoryC2302vp = new ThreadFactoryC2302vp(3);
/* 23 */            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), threadFactoryC2302vp);
/* 26 */            f18002v = threadPoolExecutor;
/* 28 */            f18001U = threadPoolExecutor;
                }

                public RunnableC2289vd(lc3 lc3Var) {
/* 4 */             this.f18010i = lc3Var;
/* 26 */            CallableC2139rc callableC2139rc = new CallableC2139rc(this, 4);
/* 29 */            this.f18004a = callableC2139rc;
/* 36 */            this.f18005b = new oj1(this, callableC2139rc);
/* 43 */            this.f18009f = new CountDownLatch(1);
                }

                /* JADX INFO: renamed from: a */
                public final void m9253a() {
                    try {
/* 1 */                 lc3 lc3Var = this.f18010i;
/* 5 */                 Iterator it = lc3Var.f13195j.iterator();
/* 13 */                if (it.hasNext()) {
/* 40 */                    ((tr0) it.next()).getClass();
/* 48 */                    throw new UnsupportedOperationException();
                        }
                        try {
/* 22 */                    lc3Var.f13194i.tryAcquire(0, 5L, TimeUnit.SECONDS);
                        } catch (InterruptedException unused) {
/* 30 */                    Thread.currentThread().interrupt();
                        }
                    } catch (kq1 e) {
/* 56 */                if (!this.f18007d.get()) {
/* 59 */                    throw e;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m9254b(Object obj) {
                    qj1 qj1Var;
                    synchronized (RunnableC2289vd.class) {
                        try {
/* 6 */                     if (f18003w == null) {
/* 17 */                        f18003w = new qj1(Looper.getMainLooper());
                            }
/* 22 */                    qj1Var = f18003w;
                        } catch (Throwable th) {
/* 44 */                    throw th;
                        }
                    }
/* 39 */            qj1Var.obtainMessage(1, new pj1(this, obj)).sendToTarget();
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 3 */             this.f18010i.m6418b();
                }
            }
