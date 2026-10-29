            package io.sentry;

            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.util.AbstractC1704c;
            import java.io.Closeable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ShutdownHookIntegration implements InterfaceC1661s1, Closeable {

                /* JADX INFO: renamed from: a */
                public final Runtime f9780a;

                /* JADX INFO: renamed from: b */
                public Thread f9781b;

                public ShutdownHookIntegration() {
/* 1 */             Runtime runtime = Runtime.getRuntime();
/* 10 */            AbstractC1704c.m5462q(runtime, "Runtime is required");
/* 13 */            this.f9780a = runtime;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 3 */             if (this.f9781b != null) {
                        try {
/* 9 */                     this.f9780a.removeShutdownHook(this.f9781b);
                        } catch (IllegalStateException e) {
/* 14 */                    String message = e.getMessage();
/* 18 */                    if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
/* 37 */                        throw e;
                            }
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
/* 6 */             if (!sentryAndroidOptions.isEnableShutdownHook()) {
/* 84 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "enableShutdownHook is disabled.", new Object[0]);
/* 87 */                return;
                    }
/* 21 */            this.f9781b = new Thread(new RunnableC1528k4(sentryAndroidOptions, 3), "sentry-shutdownhook");
                    try {
/* 27 */                this.f9780a.addShutdownHook(this.f9781b);
/* 40 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
/* 45 */                AbstractC1704c.m5446a("ShutdownHook");
                    } catch (IllegalStateException e) {
/* 50 */                String message = e.getMessage();
/* 54 */                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
/* 73 */                    throw e;
                        }
                    }
                }
            }
