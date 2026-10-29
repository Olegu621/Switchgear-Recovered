            package io.sentry.android.core;

            import android.app.Activity;
            import android.app.Application;
            import android.os.Bundle;
            import android.os.HandlerThread;
            import io.sentry.C1641r2;
            import io.sentry.EnumC1553m5;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.util.AbstractC1704c;
            import java.io.Closeable;
            import java.lang.ref.WeakReference;
            import p000.C2357x6;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class FeedbackShakeIntegration implements InterfaceC1661s1, Closeable, Application.ActivityLifecycleCallbacks {

                /* JADX INFO: renamed from: a */
                public final Application f9860a;

                /* JADX INFO: renamed from: c */
                public SentryAndroidOptions f9862c;

                /* JADX INFO: renamed from: d */
                public volatile WeakReference f9863d;

                /* JADX INFO: renamed from: f */
                public volatile Runnable f9865f;

                /* JADX INFO: renamed from: e */
                public volatile boolean f9864e = false;

                /* JADX INFO: renamed from: b */
                public final C1249o1 f9861b = new C1249o1(C1641r2.f11545a);

                public FeedbackShakeIntegration(Application application) {
/* 7 */             this.f9860a = application;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 3 */             this.f9860a.unregisterActivityLifecycleCallbacks(this);
/* 6 */             C1249o1 c1249o1 = this.f9861b;
/* 8 */             c1249o1.m4899c();
/* 11 */            HandlerThread handlerThread = c1249o1.f10229c;
/* 14 */            if (handlerThread != null) {
/* 16 */                handlerThread.quitSafely();
/* 19 */                c1249o1.f10229c = null;
/* 21 */                c1249o1.f10230d = null;
                    }
/* 25 */            if (this.f9864e) {
/* 28 */                this.f9864e = false;
/* 30 */                SentryAndroidOptions sentryAndroidOptions = this.f9862c;
/* 32 */                if (sentryAndroidOptions != null) {
/* 40 */                    sentryAndroidOptions.getFeedbackOptions().f10984h = this.f9865f;
                        }
/* 42 */                this.f9865f = null;
                    }
/* 44 */            this.f9863d = null;
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             this.f9862c = sentryAndroidOptions;
/* 9 */             if (sentryAndroidOptions.getFeedbackOptions().f10983g) {
/* 12 */                C1249o1 c1249o1 = this.f9861b;
/* 14 */                Application application = this.f9860a;
/* 22 */                c1249o1.f10232f = this.f9862c.getLogger();
/* 24 */                c1249o1.m4897a(application);
/* 29 */                AbstractC1704c.m5446a("FeedbackShake");
/* 34 */                this.f9860a.registerActivityLifecycleCallbacks(this);
/* 50 */                this.f9862c.getLogger().mo4672k(EnumC1553m5.DEBUG, "FeedbackShakeIntegration installed.", new Object[0]);
/* 57 */                WeakReference weakReference = (WeakReference) C1248o0.f10225b.f10226a;
/* 68 */                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
/* 69 */                if (activity != null) {
/* 76 */                    this.f9863d = new WeakReference(activity);
/* 78 */                    C1249o1 c1249o2 = this.f9861b;
/* 82 */                    if (this.f9862c == null) {
/* 98 */                        return;
                            }
/* 85 */                    c1249o2.m4899c();
/* 95 */                    c1249o2.m4898b(activity, new C2357x6(this, 28));
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
/* 15 */            Activity activity2 = this.f9863d != null ? (Activity) this.f9863d.get() : null;
/* 18 */            if (this.f9864e && activity == activity2) {
/* 23 */                this.f9864e = false;
/* 25 */                this.f9863d = null;
/* 27 */                SentryAndroidOptions sentryAndroidOptions = this.f9862c;
/* 29 */                if (sentryAndroidOptions != null) {
/* 37 */                    sentryAndroidOptions.getFeedbackOptions().f10984h = this.f9865f;
                        }
/* 39 */                this.f9865f = null;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
/* 16 */            if (activity == (this.f9863d != null ? (Activity) this.f9863d.get() : null)) {
/* 20 */                this.f9861b.m4899c();
/* 25 */                if (this.f9864e) {
/* 29 */                    return;
                        }
/* 27 */                this.f9863d = null;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
/* 15 */            Activity activity2 = this.f9863d != null ? (Activity) this.f9863d.get() : null;
/* 18 */            if (this.f9864e && activity2 != null && activity2 != activity) {
/* 25 */                this.f9864e = false;
/* 27 */                SentryAndroidOptions sentryAndroidOptions = this.f9862c;
/* 29 */                if (sentryAndroidOptions != null) {
/* 37 */                    sentryAndroidOptions.getFeedbackOptions().f10984h = this.f9865f;
                        }
/* 39 */                this.f9865f = null;
                    }
/* 46 */            this.f9863d = new WeakReference(activity);
/* 48 */            C1249o1 c1249o1 = this.f9861b;
/* 52 */            if (this.f9862c == null) {
/* 54 */                return;
                    }
/* 55 */            c1249o1.m4899c();
/* 65 */            c1249o1.m4898b(activity, new C2357x6(this, 28));
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
