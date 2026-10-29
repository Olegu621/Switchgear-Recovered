            package io.sentry.android.core.performance;

            import android.app.Activity;
            import android.app.ActivityManager;
            import android.app.Application;
            import android.app.ApplicationStartInfo;
            import android.content.ContentProvider;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.SystemClock;
            import androidx.core.app.NotificationCompat;
            import io.sentry.AbstractC1672t4;
            import io.sentry.C1641r2;
            import io.sentry.C1671t3;
            import io.sentry.android.core.C1193h;
            import io.sentry.android.core.C1248o0;
            import io.sentry.android.core.C1277v;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC1223j;
            import io.sentry.hints.C1482j;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.C1702a;
            import io.sentry.util.C1708g;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import p000.C2357x6;
            
            /* JADX INFO: renamed from: io.sentry.android.core.performance.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1259g implements Application.ActivityLifecycleCallbacks {

                /* JADX INFO: renamed from: k0 */
                public static volatile C1259g f10255k0;

                /* JADX INFO: renamed from: c0 */
                public volatile C2357x6 f10268c0;

                /* JADX INFO: renamed from: d0 */
                public C1626w f10270d0;

                /* JADX INFO: renamed from: e0 */
                public String f10272e0;

                /* JADX INFO: renamed from: f0 */
                public String f10274f0;

                /* JADX INFO: renamed from: g0 */
                public AbstractC1672t4 f10275g0;

                /* JADX INFO: renamed from: h0 */
                public ApplicationStartInfo f10276h0;

                /* JADX INFO: renamed from: j0 */
                public static long f10254j0 = SystemClock.uptimeMillis();

                /* JADX INFO: renamed from: l0 */
                public static final C1702a f10256l0 = new C1702a();

                /* JADX INFO: renamed from: a */
                public EnumC1258f f10263a = EnumC1258f.UNKNOWN;

                /* JADX INFO: renamed from: b */
                public final C1708g f10265b = new C1708g(new C1482j());

                /* JADX INFO: renamed from: c */
                public volatile long f10267c = -1;

                /* JADX INFO: renamed from: w */
                public C1277v f10280w = null;

                /* JADX INFO: renamed from: U */
                public C1193h f10257U = null;

                /* JADX INFO: renamed from: V */
                public C1671t3 f10258V = null;

                /* JADX INFO: renamed from: W */
                public boolean f10259W = false;

                /* JADX INFO: renamed from: X */
                public volatile boolean f10260X = true;

                /* JADX INFO: renamed from: Y */
                public final AtomicInteger f10261Y = new AtomicInteger();

                /* JADX INFO: renamed from: Z */
                public final AtomicBoolean f10262Z = new AtomicBoolean(false);

                /* JADX INFO: renamed from: a0 */
                public final AtomicBoolean f10264a0 = new AtomicBoolean(false);

                /* JADX INFO: renamed from: b0 */
                public final AtomicBoolean f10266b0 = new AtomicBoolean(false);

                /* JADX INFO: renamed from: i0 */
                public final C1248o0 f10278i0 = new C1248o0(1);

                /* JADX INFO: renamed from: d */
                public final C1260h f10269d = new C1260h();

                /* JADX INFO: renamed from: e */
                public final C1260h f10271e = new C1260h();

                /* JADX INFO: renamed from: f */
                public final C1260h f10273f = new C1260h();

                /* JADX INFO: renamed from: i */
                public final HashMap f10277i = new HashMap();

                /* JADX INFO: renamed from: v */
                public final ArrayList f10279v = new ArrayList();

                /* JADX INFO: renamed from: c */
                public static C1259g m4907c() {
/* 3 */             if (f10255k0 == null) {
/* 5 */                 C1702a c1702a = f10256l0;
/* 7 */                 c1702a.m5443c();
                        try {
/* 12 */                    if (f10255k0 == null) {
/* 19 */                        f10255k0 = new C1259g();
                            }
/* 24 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 28 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 33 */                        th.addSuppressed(th2);
                            }
/* 36 */                    throw th;
                        }
                    }
/* 37 */            return f10255k0;
                }

                /* JADX INFO: renamed from: d */
                public static void m4908d(ContentProvider contentProvider) {
/* 1 */             long jUptimeMillis = SystemClock.uptimeMillis();
/* 7 */             C1260h c1260h = new C1260h();
/* 10 */            c1260h.m4920f(jUptimeMillis);
/* 19 */            m4907c().f10277i.put(contentProvider, c1260h);
                }

                /* JADX INFO: renamed from: e */
                public static void m4909e(ContentProvider contentProvider) {
/* 1 */             long jUptimeMillis = SystemClock.uptimeMillis();
/* 15 */            C1260h c1260h = (C1260h) m4907c().f10277i.get(contentProvider);
/* 17 */            if (c1260h == null || !c1260h.m4917c()) {
/* 43 */                return;
                    }
/* 39 */            c1260h.f10281a = contentProvider.getClass().getName().concat(".onCreate");
/* 41 */            c1260h.f10284d = jUptimeMillis;
                }

                /* JADX INFO: renamed from: a */
                public final String m4910a() {
/* 1 */             ApplicationStartInfo applicationStartInfo = this.f10276h0;
/* 3 */             if (applicationStartInfo == null || Build.VERSION.SDK_INT < 35) {
/* 56 */                return null;
                    }
                    switch (applicationStartInfo.getReason()) {
                        case 0:
/* 53 */                    return NotificationCompat.CATEGORY_ALARM;
                        case 1:
/* 50 */                    return "backup";
                        case 2:
/* 47 */                    return "boot_complete";
                        case 3:
/* 44 */                    return "broadcast";
                        case 4:
/* 41 */                    return "content_provider";
                        case 5:
/* 38 */                    return "job";
                        case 6:
/* 35 */                    return "launcher";
                        case 7:
/* 32 */                    return "launcher_recents";
                        case 8:
/* 29 */                    return "other";
                        case 9:
/* 26 */                    return "push";
                        case 10:
/* 23 */                    return NotificationCompat.CATEGORY_SERVICE;
                        case 11:
/* 20 */                    return "start_activity";
                        default:
/* 56 */                    return null;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final C1260h m4911b(SentryAndroidOptions sentryAndroidOptions) {
/* 5 */             if (this.f10263a != EnumC1258f.UNKNOWN && ((Boolean) this.f10265b.m5471a()).booleanValue()) {
/* 28 */                if (sentryAndroidOptions.isEnablePerformanceV2()) {
/* 30 */                    C1260h c1260h = this.f10269d;
/* 36 */                    if (c1260h.m4918d() && c1260h.m4915a() <= 60000) {
/* 46 */                        return c1260h;
                            }
                        }
/* 47 */                C1260h c1260h2 = this.f10271e;
/* 53 */                if (c1260h2.m4918d() && c1260h2.m4915a() <= 60000) {
/* 63 */                    return c1260h2;
                        }
                    }
/* 66 */            return new C1260h();
                }

                /* JADX INFO: renamed from: f */
                public final synchronized void m4912f() {
/* 9 */             if (!this.f10262Z.getAndSet(true)) {
/* 11 */                C1259g c1259gM4907c = m4907c();
/* 15 */                C1260h c1260h = c1259gM4907c.f10271e;
/* 17 */                c1260h.getClass();
/* 24 */                c1260h.f10284d = SystemClock.uptimeMillis();
/* 26 */                C1260h c1260h2 = c1259gM4907c.f10269d;
/* 28 */                c1260h2.getClass();
/* 35 */                c1260h2.f10284d = SystemClock.uptimeMillis();
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m4913g(Application application) {
                    ActivityManager activityManager;
/* 3 */             if (this.f10259W) {
/* 121 */               return;
                    }
/* 8 */             this.f10259W = true;
/* 10 */            C1708g c1708g = this.f10265b;
/* 12 */            C1702a c1702a = c1708g.f11732c;
/* 14 */            c1702a.m5443c();
                    try {
/* 18 */                c1708g.f11730a = null;
/* 20 */                c1702a.close();
/* 25 */                application.registerActivityLifecycleCallbacks(f10255k0);
/* 33 */                if (Build.VERSION.SDK_INT >= 35 && (activityManager = (ActivityManager) application.getSystemService("activity")) != null) {
                            try {
/* 2 */                         List historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1);
/* 53 */                        if (!historicalProcessStartReasons.isEmpty()) {
/* 59 */                            ApplicationStartInfo applicationStartInfoM4902b = AbstractC1255c.m4902b(historicalProcessStartReasons.get(0));
/* 63 */                            this.f10276h0 = applicationStartInfoM4902b;
/* 69 */                            if (applicationStartInfoM4902b.getStartupState() == 0) {
/* 75 */                                if (applicationStartInfoM4902b.getStartType() == 1) {
/* 79 */                                    this.f10263a = EnumC1258f.COLD;
                                        } else {
/* 84 */                                    this.f10263a = EnumC1258f.WARM;
                                        }
                                    }
                                }
                            } catch (RuntimeException unused) {
                            }
                        }
/* 90 */                if ((this.f10263a == EnumC1258f.UNKNOWN || this.f10268c0 != null) && this.f10264a0.compareAndSet(false, true)) {
/* 118 */                   Looper.getMainLooper().getQueue().addIdleHandler(new C1257e(this));
                        }
                    } catch (Throwable th) {
                        try {
/* 123 */                   c1702a.close();
                        } catch (Throwable th2) {
/* 128 */                   th.addSuppressed(th2);
                        }
/* 131 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: h */
                public final void m4914h(long j) {
/* 1 */             C1260h c1260h = this.f10269d;
/* 7 */             if (c1260h.m4918d()) {
/* 13 */                if (c1260h.m4917c()) {
/* 15 */                    c1260h.f10284d = j;
                        }
                    } else {
/* 18 */                C1260h c1260h2 = this.f10271e;
/* 24 */                if (c1260h2.m4918d() && c1260h2.m4917c()) {
/* 32 */                    c1260h2.f10284d = j;
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
/* 1 */             long jUptimeMillis = SystemClock.uptimeMillis();
/* 7 */             C1248o0.f10225b.m4896b(activity);
/* 17 */            if (this.f10261Y.incrementAndGet() == 1 && !this.f10262Z.get()) {
/* 35 */                long jUptimeMillis2 = SystemClock.uptimeMillis() - this.f10269d.f10283c;
/* 48 */                if (!((Boolean) this.f10265b.m5471a()).booleanValue() || jUptimeMillis2 > 60000) {
/* 99 */                    C1702a c1702a = (C1702a) this.f10278i0.f10226a;
/* 101 */                   c1702a.m5443c();
/* 104 */                   c1702a.close();
/* 109 */                   this.f10263a = EnumC1258f.WARM;
/* 111 */                   this.f10260X = true;
/* 113 */                   C1260h c1260h = this.f10269d;
/* 116 */                   c1260h.f10281a = null;
/* 120 */                   c1260h.f10283c = 0L;
/* 122 */                   c1260h.f10284d = 0L;
/* 124 */                   c1260h.f10282b = 0L;
/* 126 */                   c1260h.m4920f(jUptimeMillis);
/* 129 */                   f10254j0 = jUptimeMillis;
/* 133 */                   this.f10277i.clear();
/* 136 */                   C1260h c1260h2 = this.f10273f;
/* 138 */                   c1260h2.f10281a = null;
/* 140 */                   c1260h2.f10283c = 0L;
/* 142 */                   c1260h2.f10284d = 0L;
/* 144 */                   c1260h2.f10282b = 0L;
                        } else if (this.f10263a == EnumC1258f.UNKNOWN) {
/* 64 */                    if (bundle != null) {
/* 68 */                        this.f10263a = EnumC1258f.WARM;
                            } else if (this.f10267c == -1 || jUptimeMillis <= this.f10267c) {
/* 92 */                        this.f10263a = EnumC1258f.COLD;
                            } else {
/* 87 */                        this.f10263a = EnumC1258f.WARM;
                            }
                        }
                    }
/* 150 */           this.f10265b.m5472b(Boolean.TRUE);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
/* 1 */             C1248o0 c1248o0 = C1248o0.f10225b;
/* 5 */             WeakReference weakReference = (WeakReference) c1248o0.f10226a;
/* 7 */             if (weakReference == null || weakReference.get() == activity) {
/* 17 */                c1248o0.f10226a = null;
                    }
/* 21 */            int iDecrementAndGet = this.f10261Y.decrementAndGet();
/* 26 */            if (iDecrementAndGet < 0) {
/* 30 */                this.f10261Y.set(0);
/* 33 */                iDecrementAndGet = 0;
                    }
/* 34 */            if (iDecrementAndGet != 0 || activity.isChangingConfigurations()) {
/* 61 */                return;
                    }
/* 44 */            this.f10263a = EnumC1258f.WARM;
/* 50 */            this.f10265b.m5472b(Boolean.TRUE);
/* 54 */            this.f10260X = true;
/* 58 */            this.f10262Z.set(false);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
/* 1 */             C1248o0 c1248o0 = C1248o0.f10225b;
/* 5 */             WeakReference weakReference = (WeakReference) c1248o0.f10226a;
/* 7 */             if (weakReference == null || weakReference.get() == activity) {
/* 17 */                c1248o0.f10226a = null;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
/* 3 */             C1248o0.f10225b.m4896b(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
/* 3 */             C1248o0.f10225b.m4896b(activity);
/* 12 */            if (this.f10262Z.get()) {
/* 14 */                return;
                    }
/* 19 */            if (activity.getWindow() != null) {
/* 23 */                final int i = 0;
/* 34 */                ViewTreeObserverOnDrawListenerC1223j.m4845a(activity, new Runnable(this) { // from class: io.sentry.android.core.performance.d

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ C1259g f10252b;

                            {
/* 3 */                         this.f10252b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
/* 1 */                         int i2 = i;
/* 3 */                         C1259g c1259g = this.f10252b;
                                switch (i2) {
                                    case 0:
/* 12 */                                c1259g.m4912f();
                                        break;
                                    default:
/* 8 */                                 c1259g.m4912f();
                                        break;
                                }
                            }
                        }, new C1248o0(C1641r2.f11545a));
                    } else {
/* 49 */                final int i2 = 1;
/* 53 */                new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.performance.d

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ C1259g f10252b;

                            {
/* 3 */                         this.f10252b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
/* 1 */                         int i3 = i2;
/* 3 */                         C1259g c1259g = this.f10252b;
                                switch (i3) {
                                    case 0:
/* 12 */                                c1259g.m4912f();
                                        break;
                                    default:
/* 8 */                                 c1259g.m4912f();
                                        break;
                                }
                            }
                        });
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
/* 1 */             C1248o0 c1248o0 = C1248o0.f10225b;
/* 5 */             WeakReference weakReference = (WeakReference) c1248o0.f10226a;
/* 7 */             if (weakReference == null || weakReference.get() == activity) {
/* 17 */                c1248o0.f10226a = null;
                    }
                }
            }
