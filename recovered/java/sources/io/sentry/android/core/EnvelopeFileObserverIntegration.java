            package io.sentry.android.core;

            import io.sentry.C1469h4;
            import io.sentry.C1527k3;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import java.io.Closeable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class EnvelopeFileObserverIntegration implements InterfaceC1661s1, Closeable {

                /* JADX INFO: renamed from: a */
                public FileObserverC1281w0 f9856a;

                /* JADX INFO: renamed from: b */
                public ILogger f9857b;

                /* JADX INFO: renamed from: c */
                public boolean f9858c = false;

                /* JADX INFO: renamed from: d */
                public final C1702a f9859d = new C1702a();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
                }

                /* JADX INFO: renamed from: c */
                public final void m4751c(SentryAndroidOptions sentryAndroidOptions, String str) {
/* 41 */            FileObserverC1281w0 fileObserverC1281w0 = new FileObserverC1281w0(str, new C1527k3(C1469h4.f10976a, sentryAndroidOptions.getEnvelopeReader(), sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getMaxQueueSize()), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getFlushTimeoutMillis());
/* 44 */            this.f9856a = fileObserverC1281w0;
                    try {
/* 46 */                fileObserverC1281w0.startWatching();
/* 60 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
/* 65 */                AbstractC1704c.m5446a("EnvelopeFileObserver");
                    } catch (Throwable th) {
/* 79 */                sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             C1702a c1702a = this.f9859d;
/* 3 */             c1702a.m5443c();
                    try {
/* 7 */                 this.f9858c = true;
/* 9 */                 c1702a.close();
/* 12 */                FileObserverC1281w0 fileObserverC1281w0 = this.f9856a;
/* 14 */                if (fileObserverC1281w0 != null) {
/* 16 */                    fileObserverC1281w0.stopWatching();
/* 19 */                    ILogger iLogger = this.f9857b;
/* 21 */                    if (iLogger != null) {
/* 30 */                        iLogger.mo4672k(EnumC1553m5.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                            }
                        }
                    } catch (Throwable th) {
                        try {
/* 35 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 40 */                    th.addSuppressed(th2);
                        }
/* 43 */                throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
/* 5 */             this.f9857b = sentryAndroidOptions.getLogger();
/* 7 */             String outboxPath = sentryAndroidOptions.getOutboxPath();
/* 11 */            ILogger iLogger = this.f9857b;
/* 13 */            if (outboxPath == null) {
/* 22 */                iLogger.mo4672k(EnumC1553m5.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
/* 25 */                return;
                    }
/* 34 */            iLogger.mo4672k(EnumC1553m5.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
                    try {
/* 47 */                sentryAndroidOptions.getExecutorService().submit(new RunnableC1192g1(3, this, sentryAndroidOptions, outboxPath));
                    } catch (Throwable th) {
/* 58 */                this.f9857b.mo4671d(EnumC1553m5.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th);
                    }
                }
            }
