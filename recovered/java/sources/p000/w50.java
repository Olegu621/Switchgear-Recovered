            package p000;

            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.locks.LockSupport;
            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class w50 extends ef0 implements Runnable {

                /* JADX INFO: renamed from: W */
                public static final w50 f18442W;

                /* JADX INFO: renamed from: X */
                public static final long f18443X;
                private static volatile Thread _thread;
                private static volatile int debugStatus;

                static {
                    Long l;
/* 3 */             w50 w50Var = new w50();
/* 6 */             f18442W = w50Var;
/* 9 */             w50Var.m10347n(false);
                    try {
/* 16 */                l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
                    } catch (SecurityException unused) {
/* 21 */                l = 1000L;
                    }
/* 35 */            f18443X = TimeUnit.MILLISECONDS.toNanos(l.longValue());
                }

                @Override // p000.ef0
                /* JADX INFO: renamed from: A */
                public final void mo3411A(long j, cf0 cf0Var) {
/* 8 */             throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
                }

                /* JADX INFO: renamed from: H */
                public final synchronized void m9471H() {
/* 2 */             int i = debugStatus;
/* 14 */            if (i == 2 || i == 3) {
/* 18 */                debugStatus = 3;
/* 20 */                m3413D();
/* 23 */                notifyAll();
                    }
                }

                @Override // p000.ef0, p000.g70
                /* JADX INFO: renamed from: c */
                public final e90 mo3417c(long j, mo2 mo2Var, CoroutineContext coroutineContext) {
/* 1 */             long j2 = 0;
/* 5 */             if (j > 0) {
/* 26 */                j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
                    }
/* 34 */            if (j2 >= 4611686018427387903L) {
/* 50 */                return rn1.f16198a;
                    }
/* 36 */            long jNanoTime = System.nanoTime();
/* 43 */            bf0 bf0Var = new bf0(j2 + jNanoTime, mo2Var);
/* 46 */            m3414E(jNanoTime, bf0Var);
/* 49 */            return bf0Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 5 */             do2.f7352a.set(this);
                    try {
                        synchronized (this) {
/* 10 */                    int i = debugStatus;
/* 24 */                    if (i == 2 || i == 3) {
/* 27 */                        _thread = null;
/* 29 */                        m9471H();
/* 36 */                        if (m3426z()) {
/* 139 */                           return;
                                }
/* 38 */                        mo3425y();
/* 41 */                        return;
                            }
/* 42 */                    debugStatus = 1;
/* 44 */                    notifyAll();
/* 53 */                    long j = Long.MAX_VALUE;
                            while (true) {
/* 54 */                        Thread.interrupted();
/* 57 */                        long jMo3419o = mo3419o();
/* 65 */                        if (jMo3419o == Long.MAX_VALUE) {
/* 67 */                            long jNanoTime = System.nanoTime();
/* 73 */                            if (j == Long.MAX_VALUE) {
/* 77 */                                j = f18443X + jNanoTime;
                                    }
/* 81 */                            long j2 = j - jNanoTime;
/* 85 */                            if (j2 <= 0) {
/* 87 */                                _thread = null;
/* 89 */                                m9471H();
/* 96 */                                if (m3426z()) {
/* 139 */                                   return;
                                        }
/* 98 */                                mo3425y();
/* 101 */                               return;
                                    }
/* 104 */                           if (jMo3419o > j2) {
/* 106 */                               jMo3419o = j2;
                                    }
                                } else {
/* 108 */                           j = Long.MAX_VALUE;
                                }
/* 111 */                       if (jMo3419o > 0) {
/* 113 */                           int i2 = debugStatus;
/* 123 */                           if (i2 == 2 || i2 == 3) {
/* 125 */                               _thread = null;
/* 127 */                               m9471H();
/* 134 */                               if (m3426z()) {
/* 139 */                                   return;
                                        }
/* 136 */                               mo3425y();
/* 139 */                               return;
                                    }
/* 140 */                           LockSupport.parkNanos(this, jMo3419o);
                                }
                            }
                        }
                    } catch (Throwable th) {
/* 147 */               _thread = null;
/* 149 */               m9471H();
/* 156 */               if (!m3426z()) {
/* 158 */                   mo3425y();
                        }
/* 161 */               throw th;
                    }
                }

                @Override // p000.ef0, p000.ze0
                public final void shutdown() {
/* 2 */             debugStatus = 4;
/* 4 */             super.shutdown();
                }

                @Override // p000.ef0
                /* JADX INFO: renamed from: t */
                public final void mo3422t(Runnable runnable) {
/* 4 */             if (debugStatus == 4) {
/* 17 */                throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
                    }
/* 6 */             super.mo3422t(runnable);
                }

                @Override // p000.ef0
                /* JADX INFO: renamed from: y */
                public final Thread mo3425y() {
                    Thread thread;
/* 1 */             Thread thread2 = _thread;
/* 3 */             if (thread2 != null) {
/* 42 */                return thread2;
                    }
                    synchronized (this) {
/* 6 */                 thread = _thread;
/* 8 */                 if (thread == null) {
/* 14 */                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
/* 17 */                    _thread = thread;
/* 25 */                    thread.setContextClassLoader(w50.class.getClassLoader());
/* 29 */                    thread.setDaemon(true);
/* 32 */                    thread.start();
                        }
                    }
/* 39 */            return thread;
                }
            }
