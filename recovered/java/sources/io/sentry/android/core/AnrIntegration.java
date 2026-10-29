            package io.sentry.android.core;

            import android.content.Context;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import java.io.Closeable;
            import p000.C2076pn;
            import p000.ji1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AnrIntegration implements InterfaceC1661s1, Closeable {

                /* JADX INFO: renamed from: e */
                public static C1163a f9838e;

                /* JADX INFO: renamed from: f */
                public static final C1702a f9839f = new C1702a();

                /* JADX INFO: renamed from: a */
                public final Context f9840a;

                /* JADX INFO: renamed from: b */
                public boolean f9841b = false;

                /* JADX INFO: renamed from: c */
                public final C1702a f9842c = new C1702a();

                /* JADX INFO: renamed from: d */
                public SentryAndroidOptions f9843d;

                public AnrIntegration(Context context) {
/* 14 */            Context applicationContext = context.getApplicationContext();
/* 21 */            this.f9840a = applicationContext != null ? applicationContext : context;
                }

                /* JADX INFO: renamed from: c */
                public final void m4749c(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             C1702a c1702a = f9839f;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 if (f9838e == null) {
/* 10 */                    ILogger logger = sentryAndroidOptions.getLogger();
/* 14 */                    EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 30 */                    logger.mo4672k(enumC1553m5, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
/* 56 */                    C1163a c1163a = new C1163a(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new C2076pn(22, this, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.f9840a);
/* 59 */                    f9838e = c1163a;
/* 61 */                    c1163a.start();
/* 73 */                    sentryAndroidOptions.getLogger().mo4672k(enumC1553m5, "AnrIntegration installed.", new Object[0]);
                        }
/* 80 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 84 */                    c1702a.close();
/* 93 */                    throw th;
                        } catch (Throwable th2) {
/* 90 */                    th.addSuppressed(th2);
/* 93 */                    throw th;
                        }
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             C1702a c1702a = this.f9842c;
/* 3 */             c1702a.m5443c();
                    try {
/* 7 */                 this.f9841b = true;
/* 9 */                 c1702a.close();
/* 12 */                C1702a c1702a2 = f9839f;
/* 14 */                c1702a2.m5443c();
                        try {
/* 17 */                    C1163a c1163a = f9838e;
/* 19 */                    if (c1163a != null) {
/* 21 */                        c1163a.interrupt();
/* 25 */                        f9838e = null;
/* 27 */                        SentryAndroidOptions sentryAndroidOptions = this.f9843d;
/* 29 */                        if (sentryAndroidOptions != null) {
/* 42 */                            sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "AnrIntegration removed.", new Object[0]);
                                }
                            }
/* 48 */                    c1702a2.close();
                        } catch (Throwable th) {
                            try {
/* 52 */                        c1702a2.close();
                            } catch (Throwable th2) {
/* 57 */                        th.addSuppressed(th2);
                            }
/* 60 */                    throw th;
                        }
                    } catch (Throwable th3) {
                        try {
/* 62 */                    c1702a.close();
                        } catch (Throwable th4) {
/* 67 */                    th3.addSuppressed(th4);
                        }
/* 70 */                throw th3;
                    }
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             this.f9843d = sentryAndroidOptions;
/* 23 */            sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
/* 30 */            if (sentryAndroidOptions.isAnrEnabled()) {
/* 34 */                AbstractC1704c.m5446a("Anr");
                        try {
/* 48 */                    sentryAndroidOptions.getExecutorService().submit(new ji1(20, this, sentryAndroidOptions));
                        } catch (Throwable th) {
/* 61 */                    sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
                        }
                    }
                }
            }
