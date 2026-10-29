            package io.sentry.android.core;

            import io.sentry.C1469h4;
            import io.sentry.C1519j4;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1570o0;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1578p0;
            import io.sentry.InterfaceC1631q0;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import io.sentry.util.C1708g;
            import java.io.Closeable;
            import java.util.concurrent.Future;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.fk2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class SendCachedEnvelopeIntegration implements InterfaceC1661s1, InterfaceC1578p0, Closeable {

                /* JADX INFO: renamed from: a */
                public final C1519j4 f9878a;

                /* JADX INFO: renamed from: b */
                public final C1708g f9879b;

                /* JADX INFO: renamed from: d */
                public InterfaceC1631q0 f9881d;

                /* JADX INFO: renamed from: e */
                public C1469h4 f9882e;

                /* JADX INFO: renamed from: f */
                public SentryAndroidOptions f9883f;

                /* JADX INFO: renamed from: i */
                public fk2 f9884i;

                /* JADX INFO: renamed from: c */
                public final AtomicBoolean f9880c = new AtomicBoolean(false);

                /* JADX INFO: renamed from: v */
                public final AtomicBoolean f9885v = new AtomicBoolean(false);

                /* JADX INFO: renamed from: w */
                public final AtomicBoolean f9886w = new AtomicBoolean(false);

                /* JADX INFO: renamed from: U */
                public final C1702a f9877U = new C1702a();

                public SendCachedEnvelopeIntegration(C1519j4 c1519j4, C1708g c1708g) {
/* 33 */            this.f9878a = c1519j4;
/* 35 */            this.f9879b = c1708g;
                }

                /* JADX INFO: renamed from: c */
                public final void m4756c(C1469h4 c1469h4, SentryAndroidOptions sentryAndroidOptions) {
                    try {
/* 1 */                 C1702a c1702a = this.f9877U;
/* 3 */                 c1702a.m5443c();
                        try {
/* 16 */                    Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new RunnableC1192g1(0, this, sentryAndroidOptions, c1469h4));
/* 32 */                    if (((Boolean) this.f9879b.m5471a()).booleanValue() && this.f9880c.compareAndSet(false, true)) {
/* 53 */                        sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                                try {
/* 62 */                            futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                                } catch (TimeoutException unused) {
/* 78 */                            sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                                }
                            }
/* 91 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
/* 94 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 102 */                       c1702a.close();
                            } catch (Throwable th2) {
/* 107 */                       th.addSuppressed(th2);
                            }
/* 110 */                   throw th;
                        }
                    } catch (RejectedExecutionException e) {
/* 131 */               sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e);
                    } catch (Throwable th3) {
/* 119 */               sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to call the executor. Cached events will not be sent", th3);
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 4 */             this.f9886w.set(true);
/* 7 */             InterfaceC1631q0 interfaceC1631q0 = this.f9881d;
/* 9 */             if (interfaceC1631q0 != null) {
/* 11 */                interfaceC1631q0.mo4828Z0(this);
                    }
                }

                @Override // io.sentry.InterfaceC1578p0
                /* JADX INFO: renamed from: f */
                public final void mo4757f(EnumC1570o0 enumC1570o0) {
                    SentryAndroidOptions sentryAndroidOptions;
/* 1 */             C1469h4 c1469h4 = this.f9882e;
/* 3 */             if (c1469h4 == null || (sentryAndroidOptions = this.f9883f) == null || enumC1570o0 == EnumC1570o0.DISCONNECTED) {
/* 16 */                return;
                    }
/* 13 */            m4756c(c1469h4, sentryAndroidOptions);
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             C1469h4 c1469h4 = C1469h4.f10976a;
/* 3 */             this.f9882e = c1469h4;
/* 5 */             this.f9883f = sentryAndroidOptions;
/* 7 */             String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
/* 11 */            ILogger logger = sentryAndroidOptions.getLogger();
/* 17 */            this.f9878a.getClass();
/* 24 */            if (!C1519j4.m5329b(cacheDirPath, logger)) {
/* 37 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "No cache dir path is defined in options.", new Object[0]);
                    } else {
/* 43 */                AbstractC1704c.m5446a("SendCachedEnvelope");
/* 48 */                m4756c(c1469h4, this.f9883f);
                    }
                }
            }
