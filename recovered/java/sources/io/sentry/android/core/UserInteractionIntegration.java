            package io.sentry.android.core;

            import android.app.Activity;
            import android.app.Application;
            import android.os.Bundle;
            import android.view.Window;
            import io.sentry.C1469h4;
            import io.sentry.EnumC1451f7;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.android.core.internal.gestures.C1206h;
            import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC1205g;
            import io.sentry.android.core.internal.gestures.WindowCallbackC1200b;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1709h;
            import java.io.Closeable;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            import p000.g71;
            import p000.i71;
            import p000.u61;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class UserInteractionIntegration implements InterfaceC1661s1, Closeable, Application.ActivityLifecycleCallbacks {

                /* JADX INFO: renamed from: a */
                public final Application f9909a;

                /* JADX INFO: renamed from: b */
                public C1469h4 f9910b;

                /* JADX INFO: renamed from: e */
                public final WeakHashMap f9913e = new WeakHashMap();

                /* JADX INFO: renamed from: f */
                public final Object f9914f = new Object();

                /* JADX INFO: renamed from: c */
                public SentryAndroidOptions f9911c;

                /* JADX INFO: renamed from: d */
                public final boolean f9912d = C1709h.m5473b(this.f9911c, "androidx.lifecycle.Lifecycle");

                public UserInteractionIntegration(Application application) {
/* 18 */            this.f9909a = application;
                }

                /* JADX INFO: renamed from: c */
                public final void m4765c(Activity activity) {
/* 1 */             Window window = activity.getWindow();
/* 5 */             if (window == null) {
/* 7 */                 SentryAndroidOptions sentryAndroidOptions = this.f9911c;
/* 9 */                 if (sentryAndroidOptions != null) {
/* 22 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Window was null in startTracking", new Object[0]);
/* 25 */                    return;
                        }
/* 108 */               return;
                    }
/* 28 */            if (this.f9910b == null || this.f9911c == null) {
/* 108 */               return;
                    }
                    synchronized (this.f9914f) {
                        try {
/* 43 */                    WeakReference weakReference = (WeakReference) this.f9913e.get(window);
/* 45 */                    if (weakReference == null || weakReference.get() == null) {
/* 58 */                        Window.Callback callback = window.getCallback();
/* 62 */                        if (callback == null) {
/* 66 */                            callback = new WindowCallbackC1200b();
                                }
/* 82 */                        C1206h c1206h = new C1206h(callback, activity, new GestureDetectorOnGestureListenerC1205g(activity, this.f9910b, this.f9911c), this.f9911c);
/* 85 */                        window.setCallback(c1206h);
                                synchronized (this.f9914f) {
/* 98 */                            this.f9913e.put(window, new WeakReference(c1206h));
                                }
                            }
                        } catch (Throwable th) {
/* 107 */                   throw th;
                        }
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    ArrayList<Window> arrayList;
/* 3 */             this.f9909a.unregisterActivityLifecycleCallbacks(this);
                    synchronized (this.f9914f) {
/* 17 */                arrayList = new ArrayList(this.f9913e.keySet());
                    }
/* 29 */            for (Window window : arrayList) {
/* 37 */                if (window != null) {
/* 39 */                    m4766f(window);
                        }
                    }
                    synchronized (this.f9914f) {
/* 48 */                this.f9913e.clear();
                    }
/* 52 */            SentryAndroidOptions sentryAndroidOptions = this.f9911c;
/* 54 */            if (sentryAndroidOptions != null) {
/* 67 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m4766f(Window window) {
                    C1206h c1206h;
/* 1 */             Window.Callback callback = window.getCallback();
/* 9 */             if (callback instanceof C1206h) {
/* 11 */                C1206h c1206h2 = (C1206h) callback;
/* 13 */                c1206h2.f10100i = true;
/* 19 */                c1206h2.f10096c.m4815d(EnumC1451f7.CANCELLED);
/* 24 */                c1206h2.f10097d.m4811a();
/* 27 */                Window.Callback callback2 = c1206h2.f10095b;
/* 31 */                if (callback2 instanceof WindowCallbackC1200b) {
/* 33 */                    window.setCallback(null);
                        } else {
/* 37 */                    window.setCallback(callback2);
                        }
                        synchronized (this.f9914f) {
/* 45 */                    this.f9913e.remove(window);
                        }
/* 49 */                return;
                    }
                    synchronized (this.f9914f) {
                        try {
/* 62 */                    WeakReference weakReference = (WeakReference) this.f9913e.remove(window);
/* 71 */                    c1206h = weakReference != null ? (C1206h) weakReference.get() : null;
                        } catch (Throwable th) {
/* 95 */                    throw th;
                        }
                    }
/* 77 */            if (c1206h != null) {
/* 79 */                c1206h.f10100i = true;
/* 85 */                c1206h.f10096c.m4815d(EnumC1451f7.CANCELLED);
/* 90 */                c1206h.f10097d.m4811a();
                    }
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             this.f9911c = sentryAndroidOptions;
/* 5 */             this.f9910b = C1469h4.f10976a;
/* 25 */            boolean z = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.f9911c.isEnableUserInteractionTracing();
/* 28 */            ILogger logger = this.f9911c.getLogger();
/* 32 */            EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 44 */            logger.mo4672k(enumC1553m5, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z));
/* 47 */            if (z) {
/* 51 */                this.f9909a.registerActivityLifecycleCallbacks(this);
/* 64 */                this.f9911c.getLogger().mo4672k(enumC1553m5, "UserInteractionIntegration installed.", new Object[0]);
/* 69 */                AbstractC1704c.m5446a("UserInteraction");
/* 74 */                if (this.f9912d) {
/* 80 */                    WeakReference weakReference = (WeakReference) C1248o0.f10225b.f10226a;
/* 91 */                    Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
/* 94 */                    if ((activity instanceof g71) && ((i71) ((g71) activity).getLifecycle()).f9483c == u61.f17378e) {
/* 111 */                       m4765c(activity);
                            }
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
/* 1 */             Window window = activity.getWindow();
/* 5 */             if (window != null) {
/* 26 */                m4766f(window);
/* 29 */                return;
                    }
/* 7 */             SentryAndroidOptions sentryAndroidOptions = this.f9911c;
/* 9 */             if (sentryAndroidOptions != null) {
/* 22 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Window was null in stopTracking", new Object[0]);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
/* 1 */             m4765c(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                }
            }
