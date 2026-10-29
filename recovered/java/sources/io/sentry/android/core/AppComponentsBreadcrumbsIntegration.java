            package io.sentry.android.core;

            import android.content.ComponentCallbacks2;
            import android.content.Context;
            import android.content.res.Configuration;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.C1443f;
            import io.sentry.C1469h4;
            import io.sentry.C1486i0;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.android.core.internal.util.C1220g;
            import io.sentry.util.AbstractC1704c;
            import java.io.Closeable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AppComponentsBreadcrumbsIntegration implements InterfaceC1661s1, Closeable, ComponentCallbacks2 {

                /* JADX INFO: renamed from: e */
                public static final C1486i0 f9847e = new C1486i0();

                /* JADX INFO: renamed from: a */
                public final Context f9848a;

                /* JADX INFO: renamed from: b */
                public C1469h4 f9849b;

                /* JADX INFO: renamed from: c */
                public SentryAndroidOptions f9850c;

                /* JADX INFO: renamed from: d */
                public final C1220g f9851d = new C1220g(0, 60000);

                public AppComponentsBreadcrumbsIntegration(Context context) {
/* 15 */            Context applicationContext = context.getApplicationContext();
/* 22 */            this.f9848a = applicationContext != null ? applicationContext : context;
                }

                /* JADX INFO: renamed from: c */
                public final void m4750c(Runnable runnable) {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f9850c;
/* 3 */             if (sentryAndroidOptions != null) {
                        try {
/* 9 */                     sentryAndroidOptions.getExecutorService().submit(runnable);
                        } catch (Throwable th) {
/* 27 */                    this.f9850c.getLogger().mo4670b(EnumC1553m5.ERROR, th, "Failed to submit app components breadcrumb task", new Object[0]);
                        }
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    try {
/* 4 */                 this.f9848a.unregisterComponentCallbacks(this);
                    } catch (Throwable th) {
/* 9 */                 SentryAndroidOptions sentryAndroidOptions = this.f9850c;
/* 11 */                if (sentryAndroidOptions != null) {
/* 23 */                    sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
                        }
                    }
/* 26 */            SentryAndroidOptions sentryAndroidOptions2 = this.f9850c;
/* 28 */            if (sentryAndroidOptions2 != null) {
/* 40 */                sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
                    }
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
/* 3 */             this.f9849b = C1469h4.f10976a;
/* 5 */             this.f9850c = sentryAndroidOptions;
/* 7 */             ILogger logger = sentryAndroidOptions.getLogger();
/* 11 */            EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 29 */            logger.mo4672k(enumC1553m5, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f9850c.isEnableAppComponentBreadcrumbs()));
/* 38 */            if (this.f9850c.isEnableAppComponentBreadcrumbs()) {
                        try {
/* 43 */                    this.f9848a.registerComponentCallbacks(this);
/* 54 */                    sentryAndroidOptions.getLogger().mo4672k(enumC1553m5, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
/* 59 */                    AbstractC1704c.m5446a("AppComponentsBreadcrumbs");
                        } catch (Throwable th) {
/* 66 */                    this.f9850c.setEnableAppComponentBreadcrumbs(false);
/* 79 */                    sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
                        }
                    }
                }

                @Override // android.content.ComponentCallbacks
                public final void onConfigurationChanged(Configuration configuration) {
/* 10 */            m4750c(new RunnableC1174b0(this, System.currentTimeMillis(), configuration));
                }

                @Override // android.content.ComponentCallbacks
                public final void onLowMemory() {
                }

                @Override // android.content.ComponentCallbacks2
                public final void onTrimMemory(final int i) {
/* 3 */             if (i >= 40 && !this.f9851d.m4844a()) {
/* 15 */                final long jCurrentTimeMillis = System.currentTimeMillis();
/* 24 */                m4750c(new Runnable() { // from class: io.sentry.android.core.c0
                            @Override // java.lang.Runnable
                            public final void run() {
/* 1 */                         AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = this.f9975a;
/* 5 */                         if (appComponentsBreadcrumbsIntegration.f9849b != null) {
/* 11 */                            C1443f c1443f = new C1443f(jCurrentTimeMillis);
/* 16 */                            c1443f.f10930e = "system";
/* 20 */                            c1443f.f10932i = "device.event";
/* 24 */                            c1443f.f10929d = "Low memory";
/* 30 */                            c1443f.m5209d("LOW_MEMORY", "action");
/* 41 */                            c1443f.m5209d(Integer.valueOf(i), FirebaseAnalytics.Param.LEVEL);
/* 46 */                            c1443f.f10934w = EnumC1553m5.WARNING;
/* 52 */                            appComponentsBreadcrumbsIntegration.f9849b.mo5086f(c1443f, AppComponentsBreadcrumbsIntegration.f9847e);
                                }
                            }
                        });
                    }
                }
            }
