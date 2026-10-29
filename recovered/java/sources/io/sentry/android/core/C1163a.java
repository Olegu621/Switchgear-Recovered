            package io.sentry.android.core;

            import android.app.ActivityManager;
            import android.content.Context;
            import android.os.Debug;
            import android.os.Handler;
            import android.os.SystemClock;
            import io.sentry.AbstractC1552m4;
            import io.sentry.C1393c5;
            import io.sentry.C1697u2;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.exception.C1440a;
            import io.sentry.protocol.C1615o;
            import io.sentry.util.AbstractC1704c;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.C2076pn;
            import p000.f72;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.android.core.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1163a extends Thread {

                /* JADX INFO: renamed from: U */
                public final Context f9917U;

                /* JADX INFO: renamed from: V */
                public final f72 f9918V;

                /* JADX INFO: renamed from: a */
                public final boolean f9919a;

                /* JADX INFO: renamed from: b */
                public final C2076pn f9920b;

                /* JADX INFO: renamed from: c */
                public final C1248o0 f9921c;

                /* JADX INFO: renamed from: d */
                public final C1697u2 f9922d;

                /* JADX INFO: renamed from: e */
                public final long f9923e;

                /* JADX INFO: renamed from: f */
                public final long f9924f;

                /* JADX INFO: renamed from: i */
                public final ILogger f9925i;

                /* JADX INFO: renamed from: v */
                public volatile long f9926v;

                /* JADX INFO: renamed from: w */
                public final AtomicBoolean f9927w;

                public C1163a(long j, boolean z, C2076pn c2076pn, ILogger iLogger, Context context) {
/* 4 */             C1697u2 c1697u2 = new C1697u2(7);
/* 10 */            C1248o0 c1248o0 = new C1248o0(3);
/* 15 */            super("|ANR-WatchDog|");
/* 20 */            this.f9926v = 0L;
/* 28 */            this.f9927w = new AtomicBoolean(false);
/* 30 */            this.f9922d = c1697u2;
/* 32 */            this.f9924f = j;
/* 36 */            this.f9923e = 500L;
/* 38 */            this.f9919a = z;
/* 40 */            this.f9920b = c2076pn;
/* 42 */            this.f9925i = iLogger;
/* 44 */            this.f9921c = c1248o0;
/* 46 */            this.f9917U = context;
/* 53 */            this.f9918V = new f72(this, c1697u2);
/* 59 */            if (j >= 1000) {
/* 61 */                return;
                    }
/* 72 */            C1697u2.m5437m("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", new Object[]{1000L});
/* 76 */            throw null;
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() throws Throwable {
                    List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
/* 3 */             this.f9918V.run();
/* 10 */            while (!isInterrupted()) {
/* 20 */                ((Handler) this.f9921c.f10226a).post(this.f9918V);
                        try {
/* 25 */                    Thread.sleep(this.f9923e);
/* 30 */                    this.f9922d.getClass();
/* 44 */                    if (SystemClock.uptimeMillis() - this.f9926v > this.f9924f) {
/* 50 */                        if (this.f9919a || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
/* 89 */                            ActivityManager activityManager = (ActivityManager) this.f9917U.getSystemService("activity");
/* 91 */                            if (activityManager != null) {
                                        try {
/* 93 */                                    processesInErrorState = activityManager.getProcessesInErrorState();
                                        } catch (Throwable th) {
/* 105 */                                   this.f9925i.mo4671d(EnumC1553m5.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
/* 108 */                                   processesInErrorState = null;
                                        }
/* 109 */                               if (processesInErrorState != null) {
/* 111 */                                   Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                                            while (true) {
/* 119 */                                       if (it.hasNext()) {
/* 130 */                                           if (it.next().condition == 2) {
                                                    }
                                                }
                                            }
                                        }
                                    }
/* 138 */                           if (this.f9927w.compareAndSet(false, true)) {
/* 171 */                               ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(fm0.m3787m(new StringBuilder("Application Not Responding for at least "), this.f9924f, " ms."), ((Handler) this.f9921c.f10226a).getLooper().getThread());
/* 174 */                               C2076pn c2076pn = this.f9920b;
/* 176 */                               Object obj = c2076pn.f15182b;
/* 180 */                               SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c2076pn.f15183c;
/* 182 */                               C1163a c1163a = AnrIntegration.f9838e;
/* 200 */                               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
/* 209 */                               boolean zEquals = Boolean.TRUE.equals(C1191g0.f10017e.f10021d);
/* 230 */                               String strConcat = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
/* 234 */                               if (zEquals) {
/* 238 */                                   strConcat = "Background ".concat(strConcat);
                                        }
/* 242 */                               Thread thread = applicationNotResponding.f9855a;
/* 254 */                               ApplicationNotResponding applicationNotResponding2 = thread == null ? new ApplicationNotResponding(strConcat) : new ApplicationNotResponding(strConcat, thread);
/* 259 */                               C1615o c1615o = new C1615o();
/* 264 */                               c1615o.f11411a = "ANR";
/* 273 */                               C1393c5 c1393c5 = new C1393c5(new C1440a(c1615o, applicationNotResponding2, thread, true));
/* 278 */                               c1393c5.f10787f0 = EnumC1553m5.ERROR;
/* 293 */                               AbstractC1552m4.m5357b().mo5080B(c1393c5, AbstractC1704c.m5450e(new C1286y(zEquals)));
                                    }
                                } else {
/* 72 */                            this.f9925i.mo4672k(EnumC1553m5.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
/* 77 */                            this.f9927w.set(true);
                                }
                            }
                        } catch (InterruptedException e) {
                            try {
/* 303 */                       Thread.currentThread().interrupt();
/* 320 */                       this.f9925i.mo4672k(EnumC1553m5.WARNING, "Interrupted: %s", e.getMessage());
/* 323 */                       return;
                            } catch (SecurityException unused) {
/* 338 */                       this.f9925i.mo4672k(EnumC1553m5.WARNING, "Failed to interrupt due to SecurityException: %s", e.getMessage());
/* 341 */                       return;
                            }
                        }
                    }
                }
            }
