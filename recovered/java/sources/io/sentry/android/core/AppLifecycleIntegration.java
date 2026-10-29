            package io.sentry.android.core;

            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import java.io.Closeable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AppLifecycleIntegration implements InterfaceC1661s1, Closeable {

                /* JADX INFO: renamed from: a */
                public final C1702a f9852a = new C1702a();

                /* JADX INFO: renamed from: b */
                public volatile C1289z0 f9853b;

                /* JADX INFO: renamed from: c */
                public SentryAndroidOptions f9854c;

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             C1702a c1702a = this.f9852a;
/* 3 */             c1702a.m5443c();
                    try {
/* 6 */                 C1289z0 c1289z0 = this.f9853b;
/* 9 */                 this.f9853b = null;
/* 11 */                c1702a.close();
/* 14 */                if (c1289z0 != null) {
/* 18 */                    C1191g0.f10017e.m4791h(c1289z0);
/* 21 */                    SentryAndroidOptions sentryAndroidOptions = this.f9854c;
/* 23 */                    if (sentryAndroidOptions != null) {
/* 36 */                        sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                            }
                        }
/* 41 */                C1191g0.f10017e.m4792i();
                    } catch (Throwable th) {
                        try {
/* 46 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 51 */                    th.addSuppressed(th2);
                        }
/* 54 */                throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             this.f9854c = sentryAndroidOptions;
/* 3 */             ILogger logger = sentryAndroidOptions.getLogger();
/* 7 */             EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 25 */            logger.mo4672k(enumC1553m5, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f9854c.isEnableAutoSessionTracking()));
/* 50 */            this.f9854c.getLogger().mo4672k(enumC1553m5, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f9854c.isEnableAppLifecycleBreadcrumbs()));
/* 59 */            if (this.f9854c.isEnableAutoSessionTracking() || this.f9854c.isEnableAppLifecycleBreadcrumbs()) {
/* 71 */                C1702a c1702a = this.f9852a;
/* 73 */                c1702a.m5443c();
                        try {
/* 78 */                    if (this.f9853b != null) {
/* 80 */                        c1702a.close();
/* 83 */                        return;
                            }
/* 107 */                   this.f9853b = new C1289z0(this.f9854c.getSessionTrackingIntervalMillis(), this.f9854c.isEnableAutoSessionTracking(), this.f9854c.isEnableAppLifecycleBreadcrumbs());
/* 113 */                   C1191g0.f10017e.m4788c(this.f9853b);
/* 116 */                   c1702a.close();
/* 128 */                   sentryAndroidOptions.getLogger().mo4672k(enumC1553m5, "AppLifecycleIntegration installed.", new Object[0]);
/* 133 */                   AbstractC1704c.m5446a("AppLifecycle");
                        } catch (Throwable th) {
                            try {
/* 138 */                       c1702a.close();
                            } catch (Throwable th2) {
/* 143 */                       th.addSuppressed(th2);
                            }
/* 146 */                   throw th;
                        }
                    }
                }
            }
