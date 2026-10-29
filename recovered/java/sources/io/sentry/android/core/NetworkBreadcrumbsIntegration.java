            package io.sentry.android.core;

            import android.content.Context;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.android.core.internal.util.C1216c;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import java.io.Closeable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class NetworkBreadcrumbsIntegration implements InterfaceC1661s1, Closeable {

                /* JADX INFO: renamed from: a */
                public final Context f9868a;

                /* JADX INFO: renamed from: b */
                public final C1248o0 f9869b;

                /* JADX INFO: renamed from: c */
                public final C1702a f9870c = new C1702a();

                /* JADX INFO: renamed from: d */
                public volatile C1186e1 f9871d;

                public NetworkBreadcrumbsIntegration(Context context, C1248o0 c1248o0) {
/* 11 */            Context applicationContext = context.getApplicationContext();
/* 18 */            this.f9868a = applicationContext != null ? applicationContext : context;
/* 20 */            this.f9869b = c1248o0;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             C1702a c1702a = this.f9870c;
/* 3 */             c1702a.m5443c();
                    try {
/* 6 */                 C1186e1 c1186e1 = this.f9871d;
/* 9 */                 this.f9871d = null;
/* 11 */                c1702a.close();
/* 14 */                if (c1186e1 != null) {
/* 16 */                    C1702a c1702a2 = C1216c.f10141Y;
/* 18 */                    c1702a2.m5443c();
                            try {
/* 23 */                        C1216c.f10142Z.remove(c1186e1);
/* 26 */                        c1702a2.close();
                            } catch (Throwable th) {
                                try {
/* 31 */                            c1702a2.close();
                                } catch (Throwable th2) {
/* 36 */                            th.addSuppressed(th2);
                                }
/* 39 */                        throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
/* 42 */                    c1702a.close();
                        } catch (Throwable th4) {
/* 47 */                    th3.addSuppressed(th4);
                        }
/* 50 */                throw th3;
                    }
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             ILogger logger = sentryAndroidOptions.getLogger();
/* 5 */             EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 21 */            logger.mo4672k(enumC1553m5, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
/* 28 */            if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
/* 32 */                this.f9869b.getClass();
/* 35 */                C1702a c1702a = this.f9870c;
/* 37 */                c1702a.m5443c();
                        try {
/* 51 */                    this.f9871d = new C1186e1(this.f9869b, sentryAndroidOptions.getDateProvider());
/* 68 */                    if (C1216c.m4825g(this.f9868a, sentryAndroidOptions.getLogger(), this.f9869b, this.f9871d)) {
/* 78 */                        sentryAndroidOptions.getLogger().mo4672k(enumC1553m5, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
/* 83 */                        AbstractC1704c.m5446a("NetworkBreadcrumbs");
                            } else {
/* 97 */                        sentryAndroidOptions.getLogger().mo4672k(enumC1553m5, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                            }
/* 100 */                   c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 104 */                       c1702a.close();
                            } catch (Throwable th2) {
/* 109 */                       th.addSuppressed(th2);
                            }
/* 112 */                   throw th;
                        }
                    }
                }
            }
