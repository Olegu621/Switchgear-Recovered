            package io.sentry.android.core.anr;

            import android.os.Handler;
            import android.os.Looper;
            import android.os.SystemClock;
            import io.sentry.C1641r2;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.android.core.C1191g0;
            import io.sentry.android.core.InterfaceC1182d0;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.AbstractC1714m;
            import io.sentry.util.C1702a;
            import java.io.Closeable;
            import java.io.File;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import p000.f72;
            import p000.ji1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AnrProfilingIntegration implements InterfaceC1661s1, Closeable, InterfaceC1182d0, Runnable {

                /* JADX INFO: renamed from: U */
                public volatile SentryAndroidOptions f9930U;

                /* JADX INFO: renamed from: Y */
                public volatile Handler f9934Y;

                /* JADX INFO: renamed from: Z */
                public volatile Thread f9935Z;

                /* JADX INFO: renamed from: v */
                public volatile C1170d f9943v;

                /* JADX INFO: renamed from: a */
                public final AtomicBoolean f9936a = new AtomicBoolean(true);

                /* JADX INFO: renamed from: b */
                public final f72 f9937b = new f72(this, 23);

                /* JADX INFO: renamed from: c */
                public final C1702a f9938c = new C1702a();

                /* JADX INFO: renamed from: d */
                public final C1702a f9939d = new C1702a();

                /* JADX INFO: renamed from: e */
                public volatile long f9940e = SystemClock.uptimeMillis();

                /* JADX INFO: renamed from: f */
                public final AtomicInteger f9941f = new AtomicInteger();

                /* JADX INFO: renamed from: i */
                public volatile EnumC1166a f9942i = EnumC1166a.IDLE;

                /* JADX INFO: renamed from: w */
                public volatile ILogger f9944w = C1641r2.f11545a;

                /* JADX INFO: renamed from: V */
                public volatile Thread f9931V = null;

                /* JADX INFO: renamed from: W */
                public volatile boolean f9932W = false;

                /* JADX INFO: renamed from: X */
                public volatile boolean f9933X = false;

                /* JADX INFO: renamed from: io.sentry.android.core.anr.AnrProfilingIntegration$a */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum EnumC1166a {
                    IDLE,
                    SUSPICIOUS,
                    ANR_DETECTED
                }

                @Override // io.sentry.android.core.InterfaceC1182d0
                /* JADX INFO: renamed from: c */
                public final void mo4761c() {
/* 7 */             if (this.f9936a.get()) {
/* 10 */                C1702a c1702a = this.f9938c;
/* 12 */                c1702a.m5443c();
                        try {
/* 17 */                    if (this.f9933X) {
/* 19 */                        c1702a.close();
/* 22 */                        return;
                            }
/* 24 */                    this.f9933X = true;
/* 28 */                    this.f9937b.run();
/* 31 */                    Thread thread = this.f9931V;
/* 33 */                    if (thread != null && thread.isAlive()) {
                                synchronized (this) {
/* 42 */                            notifyAll();
                                }
                            }
/* 52 */                    if (thread == null || !thread.isAlive()) {
/* 64 */                        Thread thread2 = new Thread(this, "AnrProfilingIntegration");
/* 67 */                        thread2.setDaemon(true);
/* 70 */                        thread2.start();
/* 73 */                        this.f9931V = thread2;
                            }
/* 75 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 79 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 84 */                        th.addSuppressed(th2);
                            }
/* 87 */                    throw th;
                        }
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 4 */             this.f9936a.set(false);
/* 9 */             C1191g0.f10017e.m4791h(this);
/* 12 */            Handler handler = this.f9934Y;
/* 14 */            if (handler != null) {
/* 18 */                handler.removeCallbacks(this.f9937b);
                    }
/* 21 */            Thread thread = this.f9931V;
/* 23 */            if (thread != null) {
                        synchronized (this) {
/* 26 */                    notifyAll();
                        }
/* 30 */                thread.interrupt();
                    }
/* 37 */            SentryAndroidOptions sentryAndroidOptions = this.f9930U;
/* 39 */            C1702a c1702a = this.f9939d;
/* 41 */            c1702a.m5443c();
                    try {
/* 44 */                C1170d c1170d = this.f9943v;
/* 47 */                this.f9943v = null;
/* 49 */                c1702a.close();
/* 52 */                if (sentryAndroidOptions != null) {
                            try {
/* 65 */                        sentryAndroidOptions.getExecutorService().submit(new ji1(25, this, c1170d));
                            } catch (Throwable unused) {
/* 77 */                        this.f9944w.mo4672k(EnumC1553m5.WARNING, "Failed to submit AnrProfileManager close", new Object[0]);
                            }
                        }
                    } catch (Throwable th) {
                        try {
/* 82 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 87 */                    th.addSuppressed(th2);
                        }
/* 90 */                throw th;
                    }
                }

                @Override // io.sentry.android.core.InterfaceC1182d0
                /* JADX INFO: renamed from: f */
                public final void mo4762f() {
/* 7 */             if (this.f9936a.get()) {
/* 10 */                C1702a c1702a = this.f9938c;
/* 12 */                c1702a.m5443c();
                        try {
/* 16 */                    this.f9933X = false;
/* 18 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 23 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 28 */                        th.addSuppressed(th2);
                            }
/* 31 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m4769g(Thread thread) {
/* 7 */             long jUptimeMillis = SystemClock.uptimeMillis() - this.f9940e;
/* 13 */            if (jUptimeMillis < 1000) {
/* 17 */                this.f9942i = EnumC1166a.IDLE;
/* 19 */                this.f9932W = false;
                    }
/* 25 */            if (this.f9942i == EnumC1166a.IDLE && jUptimeMillis > 1000) {
/* 29 */                ILogger iLogger = this.f9944w;
/* 31 */                EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 37 */                if (iLogger.mo4673m(enumC1553m5)) {
/* 45 */                    this.f9944w.mo4672k(enumC1553m5, "ANR: main thread is suspicious", new Object[0]);
                        }
/* 50 */                this.f9942i = EnumC1166a.SUSPICIOUS;
/* 52 */                SentryAndroidOptions sentryAndroidOptions = this.f9930U;
/* 61 */                Double anrProfilingSampleRate = sentryAndroidOptions != null ? sentryAndroidOptions.getAnrProfilingSampleRate() : null;
/* 62 */                if (anrProfilingSampleRate != null && AbstractC1714m.m5481a().m5480c() < anrProfilingSampleRate.doubleValue()) {
/* 81 */                    this.f9932W = true;
                        }
/* 85 */                if (this.f9932W) {
/* 89 */                    this.f9941f.set(0);
/* 98 */                    m4770h().f9958a.clear();
                        }
                    }
/* 103 */           if (this.f9932W && (this.f9942i == EnumC1166a.SUSPICIOUS || this.f9942i == EnumC1166a.ANR_DETECTED)) {
/* 125 */               if (this.f9941f.get() < 151) {
/* 127 */                   long jUptimeMillis2 = SystemClock.uptimeMillis();
/* 141 */                   C1172f c1172f = new C1172f(System.currentTimeMillis(), thread.getStackTrace());
/* 148 */                   long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis2;
/* 149 */                   ILogger iLogger2 = this.f9944w;
/* 151 */                   EnumC1553m5 enumC1553m6 = EnumC1553m5.DEBUG;
/* 157 */                   if (iLogger2.mo4673m(enumC1553m6)) {
/* 182 */                       this.f9944w.mo4672k(enumC1553m6, "AnrWatchdog: capturing main thread stacktrace took " + jUptimeMillis3 + "ms", new Object[0]);
                            }
/* 191 */                   if (this.f9936a.get()) {
/* 196 */                       this.f9941f.incrementAndGet();
/* 205 */                       m4770h().f9958a.mo5130c(c1172f);
                            }
                        } else {
/* 209 */                   ILogger iLogger3 = this.f9944w;
/* 211 */                   EnumC1553m5 enumC1553m7 = EnumC1553m5.DEBUG;
/* 217 */                   if (iLogger3.mo4673m(enumC1553m7)) {
/* 225 */                       this.f9944w.mo4672k(enumC1553m7, "ANR: reached maximum number of collected stack traces, skipping further collection", new Object[0]);
                            }
                        }
                    }
/* 232 */           if (this.f9942i != EnumC1166a.SUSPICIOUS || jUptimeMillis <= 4000) {
/* 263 */               return;
                    }
/* 240 */           ILogger iLogger4 = this.f9944w;
/* 242 */           EnumC1553m5 enumC1553m8 = EnumC1553m5.DEBUG;
/* 248 */           if (iLogger4.mo4673m(enumC1553m8)) {
/* 256 */               this.f9944w.mo4672k(enumC1553m8, "ANR: main thread ANR threshold reached", new Object[0]);
                    }
/* 261 */           this.f9942i = EnumC1166a.ANR_DETECTED;
                }

                /* JADX INFO: renamed from: h */
                public final C1170d m4770h() {
/* 1 */             C1702a c1702a = this.f9939d;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 if (this.f9943v == null) {
/* 10 */                    SentryAndroidOptions sentryAndroidOptions = this.f9930U;
/* 14 */                    AbstractC1704c.m5462q(sentryAndroidOptions, "Options can't be null");
/* 17 */                    String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
/* 21 */                    if (cacheDirPath == null) {
/* 55 */                        throw new IllegalStateException("cacheDirPath is required for ANR profiling");
                            }
/* 25 */                    File file = new File(cacheDirPath);
/* 28 */                    AbstractC1171e.m4772b(file);
/* 43 */                    this.f9943v = new C1170d(sentryAndroidOptions, new File(file, "anr_profile"));
                        }
/* 56 */                C1170d c1170d = this.f9943v;
/* 58 */                c1702a.close();
/* 61 */                return c1170d;
                    } catch (Throwable th) {
                        try {
/* 62 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 67 */                    th.addSuppressed(th2);
                        }
/* 70 */                throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             this.f9930U = sentryAndroidOptions;
/* 7 */             this.f9944w = sentryAndroidOptions.getLogger();
/* 15 */            if (this.f9930U.isAnrProfilingEnabled()) {
/* 23 */                if (this.f9930U.getCacheDirPath() == null) {
/* 34 */                    this.f9944w.mo4672k(EnumC1553m5.WARNING, "ANR Profiling is enabled but cacheDirPath is not set", new Object[0]);
/* 37 */                    return;
                        }
/* 38 */                Looper mainLooper = Looper.getMainLooper();
/* 46 */                this.f9935Z = mainLooper.getThread();
/* 53 */                this.f9934Y = new Handler(mainLooper);
/* 57 */                AbstractC1704c.m5446a("AnrProfiling");
/* 62 */                C1191g0.f10017e.m4788c(this);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             Handler handler = this.f9934Y;
/* 3 */             Thread thread = this.f9935Z;
/* 5 */             if (handler == null || thread == null) {
/* 98 */                return;
                    }
/* 16 */            while (this.f9936a.get() && !Thread.currentThread().isInterrupted()) {
                        try {
                            try {
/* 30 */                        if (this.f9933X) {
/* 62 */                            m4769g(thread);
/* 67 */                            handler.removeCallbacks(this.f9937b);
/* 72 */                            handler.post(this.f9937b);
/* 77 */                            Thread.sleep(66L);
                                } else {
                                    synchronized (this) {
/* 35 */                                while (!this.f9933X && this.f9936a.get()) {
                                            try {
/* 45 */                                        wait();
                                            } catch (Throwable th) {
/* 61 */                                        throw th;
                                            }
                                        }
                                    }
/* 54 */                            this.f9937b.run();
                                }
                            } catch (InterruptedException unused) {
/* 85 */                        Thread.currentThread().interrupt();
/* 98 */                        return;
                            }
                        } catch (Throwable th2) {
/* 95 */                    this.f9944w.mo4671d(EnumC1553m5.WARNING, "Failed to execute AnrStacktraceIntegration", th2);
/* 98 */                    return;
                        }
                    }
                }
            }
