            package io.sentry.android.core;

            import android.app.Activity;
            import android.app.Application;
            import android.os.Bundle;
            import androidx.core.app.NotificationCompat;
            import io.sentry.C1443f;
            import io.sentry.C1469h4;
            import io.sentry.C1486i0;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import java.io.Closeable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ActivityBreadcrumbsIntegration implements InterfaceC1661s1, Closeable, Application.ActivityLifecycleCallbacks {

                /* JADX INFO: renamed from: a */
                public final Application f9814a;

                /* JADX INFO: renamed from: b */
                public C1469h4 f9815b;

                /* JADX INFO: renamed from: c */
                public boolean f9816c;

                /* JADX INFO: renamed from: d */
                public final C1702a f9817d = new C1702a();

                public ActivityBreadcrumbsIntegration(Application application) {
/* 11 */            this.f9814a = application;
                }

                /* JADX INFO: renamed from: c */
                public final void m4742c(Activity activity, String str) {
/* 3 */             if (this.f9815b == null) {
/* 5 */                 return;
                    }
/* 8 */             C1443f c1443f = new C1443f();
/* 13 */            c1443f.f10930e = NotificationCompat.CATEGORY_NAVIGATION;
/* 17 */            c1443f.m5209d(str, "state");
/* 30 */            c1443f.m5209d(activity.getClass().getSimpleName(), "screen");
/* 35 */            c1443f.f10932i = "ui.lifecycle";
/* 39 */            c1443f.f10934w = EnumC1553m5.INFO;
/* 43 */            C1486i0 c1486i0 = new C1486i0();
/* 48 */            c1486i0.m5275d(activity, "android:activity");
/* 53 */            this.f9815b.mo5086f(c1443f, c1486i0);
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 3 */             if (this.f9816c) {
/* 7 */                 this.f9814a.unregisterActivityLifecycleCallbacks(this);
/* 10 */                C1469h4 c1469h4 = this.f9815b;
/* 12 */                if (c1469h4 != null) {
/* 29 */                    c1469h4.mo5092l().getLogger().mo4672k(EnumC1553m5.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
/* 3 */             this.f9815b = C1469h4.f10976a;
/* 9 */             this.f9816c = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
/* 11 */            ILogger logger = sentryAndroidOptions.getLogger();
/* 15 */            EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 29 */            logger.mo4672k(enumC1553m5, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f9816c));
/* 34 */            if (this.f9816c) {
/* 38 */                this.f9814a.registerActivityLifecycleCallbacks(this);
/* 50 */                sentryAndroidOptions.getLogger().mo4672k(enumC1553m5, "ActivityBreadcrumbIntegration installed.", new Object[0]);
/* 55 */                AbstractC1704c.m5446a("ActivityBreadcrumbs");
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
/* 1 */             C1702a c1702a = this.f9817d;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 m4742c(activity, "created");
/* 11 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 16 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 21 */                    th.addSuppressed(th2);
                        }
/* 24 */                throw th;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
/* 1 */             C1702a c1702a = this.f9817d;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 m4742c(activity, "destroyed");
/* 11 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 16 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 21 */                    th.addSuppressed(th2);
                        }
/* 24 */                throw th;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
/* 1 */             C1702a c1702a = this.f9817d;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 m4742c(activity, "paused");
/* 11 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 16 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 21 */                    th.addSuppressed(th2);
                        }
/* 24 */                throw th;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
/* 1 */             C1702a c1702a = this.f9817d;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 m4742c(activity, "resumed");
/* 11 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 16 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 21 */                    th.addSuppressed(th2);
                        }
/* 24 */                throw th;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
/* 1 */             C1702a c1702a = this.f9817d;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 m4742c(activity, "saveInstanceState");
/* 11 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 16 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 21 */                    th.addSuppressed(th2);
                        }
/* 24 */                throw th;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
/* 1 */             C1702a c1702a = this.f9817d;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 m4742c(activity, "started");
/* 11 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 16 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 21 */                    th.addSuppressed(th2);
                        }
/* 24 */                throw th;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
/* 1 */             C1702a c1702a = this.f9817d;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 m4742c(activity, "stopped");
/* 11 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 16 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 21 */                    th.addSuppressed(th2);
                        }
/* 24 */                throw th;
                    }
                }
            }
