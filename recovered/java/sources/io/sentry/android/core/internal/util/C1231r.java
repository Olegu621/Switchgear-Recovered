            package io.sentry.android.core.internal.util;

            import android.app.Activity;
            import android.app.Application;
            import android.content.Context;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.os.Looper;
            import android.view.Choreographer;
            import android.view.FrameMetrics;
            import android.view.Window;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.android.core.C1248o0;
            import io.sentry.android.core.C1274u;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import java.lang.ref.WeakReference;
            import java.lang.reflect.Field;
            import java.util.Iterator;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ConcurrentSkipListSet;
            import java.util.concurrent.CopyOnWriteArraySet;
            import p000.ji1;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.util.r */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1231r implements Application.ActivityLifecycleCallbacks {

                /* JADX INFO: renamed from: U */
                public final WindowOnFrameMetricsAvailableListenerC1227n f10191U;

                /* JADX INFO: renamed from: V */
                public Choreographer f10192V;

                /* JADX INFO: renamed from: W */
                public final Field f10193W;

                /* JADX INFO: renamed from: X */
                public long f10194X;

                /* JADX INFO: renamed from: Y */
                public long f10195Y;

                /* JADX INFO: renamed from: Z */
                public final ConcurrentSkipListSet f10196Z;

                /* JADX INFO: renamed from: a */
                public final C1248o0 f10197a;

                /* JADX INFO: renamed from: b */
                public final CopyOnWriteArraySet f10198b;

                /* JADX INFO: renamed from: c */
                public final ILogger f10199c;

                /* JADX INFO: renamed from: d */
                public volatile Handler f10200d;

                /* JADX INFO: renamed from: e */
                public final C1702a f10201e;

                /* JADX INFO: renamed from: f */
                public WeakReference f10202f;

                /* JADX INFO: renamed from: i */
                public final ConcurrentHashMap f10203i;

                /* JADX INFO: renamed from: v */
                public final boolean f10204v;

                /* JADX INFO: renamed from: w */
                public final C1217d f10205w;

                /* JADX WARN: Type inference failed for: r4v5, types: [io.sentry.android.core.internal.util.n] */
                public C1231r(Context context, C1274u c1274u, final C1248o0 c1248o0) {
/* 3 */             C1217d c1217d = new C1217d();
/* 14 */            this.f10198b = new CopyOnWriteArraySet();
/* 21 */            this.f10201e = new C1702a();
/* 28 */            this.f10203i = new ConcurrentHashMap();
/* 31 */            this.f10204v = false;
/* 35 */            this.f10194X = 0L;
/* 37 */            this.f10195Y = 0L;
/* 44 */            this.f10196Z = new ConcurrentSkipListSet();
/* 46 */            Context applicationContext = context.getApplicationContext();
/* 50 */            context = applicationContext != null ? applicationContext : context;
/* 55 */            AbstractC1704c.m5462q(c1274u, "Logger is required");
/* 58 */            this.f10199c = c1274u;
/* 62 */            AbstractC1704c.m5462q(c1248o0, "BuildInfoProvider is required");
/* 65 */            this.f10197a = c1248o0;
/* 67 */            this.f10205w = c1217d;
/* 71 */            if (context instanceof Application) {
/* 75 */                this.f10204v = true;
/* 79 */                ((Application) context).registerActivityLifecycleCallbacks(this);
/* 98 */                new Handler(Looper.getMainLooper()).post(new ji1(26, this, c1274u));
                        try {
/* 105 */                   Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
/* 109 */                   this.f10193W = declaredField;
/* 111 */                   declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e) {
/* 120 */                   c1274u.mo4671d(EnumC1553m5.ERROR, "Unable to get the frame timestamp from the choreographer: ", e);
                        }
/* 128 */               this.f10191U = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.n
                            /* JADX WARN: Code duplicated, block: B:18:0x0089  */
                            @Override // android.view.Window.OnFrameMetricsAvailableListener
                            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                                long jLongValue;
                                Field field;
/* 5 */                         C1231r c1231r = this.f10186a;
/* 7 */                         ConcurrentSkipListSet concurrentSkipListSet = c1231r.f10196Z;
/* 9 */                         long jNanoTime = System.nanoTime();
/* 15 */                        c1248o0.getClass();
/* 18 */                        int i2 = Build.VERSION.SDK_INT;
/* 47 */                        float refreshRate = i2 >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
/* 92 */                        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
/* 97 */                        long jMax = Math.max(0L, metric - ((long) (1.0E9f / refreshRate)));
/* 103 */                       c1231r.f10197a.getClass();
/* 108 */                       if (i2 >= 26) {
/* 112 */                           jLongValue = frameMetrics.getMetric(10);
                                } else {
/* 117 */                           Choreographer choreographer = c1231r.f10192V;
/* 119 */                           if (choreographer == null || (field = c1231r.f10193W) == null) {
/* 138 */                               jLongValue = -1;
                                    } else {
                                        try {
/* 129 */                                   Long l = (Long) field.get(choreographer);
/* 131 */                                   if (l != null) {
/* 133 */                                       jLongValue = l.longValue();
                                            } else {
/* 138 */                                       jLongValue = -1;
                                            }
                                        } catch (IllegalAccessException unused) {
                                        }
                                    }
                                }
/* 142 */                       if (jLongValue < 0) {
/* 144 */                           jLongValue = jNanoTime - metric;
                                }
/* 148 */                       long jMax2 = Math.max(jLongValue, c1231r.f10195Y);
/* 156 */                       if (jMax2 == c1231r.f10194X) {
/* 271 */                           return;
                                }
/* 160 */                       c1231r.f10194X = jMax2;
/* 162 */                       long j = jMax2 + metric;
/* 164 */                       c1231r.f10195Y = j;
/* 181 */                       boolean z = metric > ((long) (1.0E9f / (refreshRate - 1.0f)));
/* 195 */                       boolean z2 = z && metric > 700000000;
/* 199 */                       if (jMax > 0) {
/* 206 */                           long j2 = j - 300000000000L;
/* 216 */                           concurrentSkipListSet.headSet(new C1229p(j2, j2)).clear();
/* 225 */                           if (concurrentSkipListSet.size() < 3600) {
/* 234 */                               concurrentSkipListSet.add(new C1229p(jMax2, c1231r.f10195Y));
                                    }
                                }
/* 243 */                       Iterator it = c1231r.f10203i.values().iterator();
/* 251 */                       while (it.hasNext()) {
/* 261 */                           long j3 = metric;
/* 262 */                           long j4 = jMax;
/* 265 */                           ((InterfaceC1230q) it.next()).mo4847b(jMax2, c1231r.f10195Y, j3, j4, z, z2, refreshRate);
/* 268 */                           jMax = j4;
/* 269 */                           metric = j3;
                                }
                            }
                        };
                    }
                }

                /* JADX INFO: renamed from: a */
                public final String m4848a(InterfaceC1230q interfaceC1230q) {
/* 3 */             if (!this.f10204v) {
/* 5 */                 return null;
                    }
/* 9 */             if (this.f10200d == null) {
/* 12 */                C1702a c1702a = this.f10201e;
/* 14 */                c1702a.m5443c();
                        try {
/* 19 */                    if (this.f10200d == null) {
/* 25 */                        HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
/* 33 */                        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.o
                                    @Override // java.lang.Thread.UncaughtExceptionHandler
                                    public final void uncaughtException(Thread thread, Throwable th) {
/* 9 */                                 this.f10188a.f10199c.mo4671d(EnumC1553m5.ERROR, "Error during frames measurements.", th);
                                    }
                                });
/* 36 */                        handlerThread.start();
/* 48 */                        this.f10200d = new Handler(handlerThread.getLooper());
                            }
/* 53 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 69 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 74 */                        th.addSuppressed(th2);
                            }
/* 77 */                    throw th;
                        }
                    }
/* 56 */            String strM5172j = AbstractC1417a.m5172j();
/* 62 */            this.f10203i.put(strM5172j, interfaceC1230q);
/* 65 */            m4850c();
/* 68 */            return strM5172j;
                }

                /* JADX INFO: renamed from: b */
                public final void m4849b(String str) {
/* 3 */             if (this.f10204v) {
/* 6 */                 ConcurrentHashMap concurrentHashMap = this.f10203i;
/* 8 */                 if (str != null) {
/* 10 */                    concurrentHashMap.remove(str);
                        }
/* 13 */                WeakReference weakReference = this.f10202f;
/* 24 */                Window window = weakReference != null ? (Window) weakReference.get() : null;
/* 25 */                if (window == null || !concurrentHashMap.isEmpty()) {
/* 51 */                    return;
                        }
/* 48 */                new Handler(Looper.getMainLooper()).post(new RunnableC1226m(this, window, 1));
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m4850c() {
/* 1 */             WeakReference weakReference = this.f10202f;
/* 12 */            Window window = weakReference != null ? (Window) weakReference.get() : null;
/* 13 */            if (window == null || !this.f10204v || this.f10203i.isEmpty() || this.f10200d == null) {
/* 51 */                return;
                    }
/* 48 */            new Handler(Looper.getMainLooper()).post(new RunnableC1226m(this, window, 0));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
/* 1 */             Window window = activity.getWindow();
/* 5 */             WeakReference weakReference = this.f10202f;
/* 7 */             if (weakReference == null || weakReference.get() != window) {
/* 21 */                this.f10202f = new WeakReference(window);
/* 23 */                m4850c();
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
/* 20 */            new Handler(Looper.getMainLooper()).post(new RunnableC1226m(this, activity.getWindow(), 1));
/* 23 */            WeakReference weakReference = this.f10202f;
/* 25 */            if (weakReference == null || weakReference.get() != activity.getWindow()) {
/* 40 */                return;
                    }
/* 38 */            this.f10202f = null;
                }
            }
