            package io.sentry.android.ndk;

            import io.sentry.C1529k5;
            import io.sentry.android.core.EnumC1178c1;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.ndk.EnumC1568a;
            import io.sentry.ndk.NdkOptions;
            import io.sentry.protocol.C1624u;
            import io.sentry.util.AbstractC1704c;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            import p000.RunnableC0981h7;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class SentryNdk {
                private static final CountDownLatch loadLibraryLatch = new CountDownLatch(1);

                static {
/* 22 */            new Thread(new RunnableC0981h7(6), "SentryNdkLoadLibs").start();
                }

                private SentryNdk() {
                }

                public static void close() {
                    try {
/* 11 */                if (!loadLibraryLatch.await(2000L, TimeUnit.MILLISECONDS)) {
/* 24 */                    throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");
                        }
/* 13 */                io.sentry.ndk.SentryNdk.close();
                    } catch (InterruptedException e) {
/* 33 */                throw new IllegalStateException("Thread interrupted while waiting for NDK libs to be loaded", e);
                    }
                }

                public static void init(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             C1624u sdkVersion = sentryAndroidOptions.getSdkVersion();
/* 5 */             int i = AbstractC1292c.f10407a;
/* 7 */             if (sdkVersion != null) {
/* 18 */                C1529k5.m5336d().m5338b("maven:io.sentry:sentry-android-ndk", "8.48.0");
                    }
                    try {
/* 31 */                if (!loadLibraryLatch.await(2000L, TimeUnit.MILLISECONDS)) {
/* 162 */                   throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");
                        }
/* 35 */                String dsn = sentryAndroidOptions.getDsn();
/* 41 */                AbstractC1704c.m5462q(dsn, "DSN is required for sentry-ndk");
/* 44 */                boolean zIsDebug = sentryAndroidOptions.isDebug();
/* 48 */                String outboxPath = sentryAndroidOptions.getOutboxPath();
/* 54 */                AbstractC1704c.m5462q(outboxPath, "outbox path is required for sentry-ndk");
/* 77 */                NdkOptions ndkOptions = new NdkOptions(dsn, zIsDebug, outboxPath, sentryAndroidOptions.getRelease(), sentryAndroidOptions.getEnvironment(), sentryAndroidOptions.getDist(), sentryAndroidOptions.getMaxBreadcrumbs(), sentryAndroidOptions.getNativeSdkName());
/* 80 */                int ndkHandlerStrategy = sentryAndroidOptions.getNdkHandlerStrategy();
/* 90 */                if (ndkHandlerStrategy == EnumC1178c1.SENTRY_HANDLER_STRATEGY_DEFAULT.getValue()) {
/* 94 */                    ndkOptions.setNdkHandlerStrategy(EnumC1568a.SENTRY_HANDLER_STRATEGY_DEFAULT);
                        } else if (ndkHandlerStrategy == EnumC1178c1.SENTRY_HANDLER_STRATEGY_CHAIN_AT_START.getValue()) {
/* 108 */                   ndkOptions.setNdkHandlerStrategy(EnumC1568a.SENTRY_HANDLER_STRATEGY_CHAIN_AT_START);
                        }
/* 111 */               Double tracesSampleRate = sentryAndroidOptions.getTracesSampleRate();
/* 115 */               if (tracesSampleRate == null) {
/* 118 */                   ndkOptions.setTracesSampleRate(0.0f);
                        } else {
/* 126 */                   ndkOptions.setTracesSampleRate(tracesSampleRate.floatValue());
                        }
/* 129 */               io.sentry.ndk.SentryNdk.init(ndkOptions);
/* 136 */               if (sentryAndroidOptions.isEnableScopeSync()) {
/* 143 */                   sentryAndroidOptions.addScopeObserver(new C1291b(sentryAndroidOptions));
                        }
/* 151 */               sentryAndroidOptions.setDebugImagesLoader(new C1290a());
                    } catch (InterruptedException e) {
/* 172 */               throw new IllegalStateException("Thread interrupted while waiting for NDK libs to be loaded", e);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ void lambda$static$0() {
                    try {
/* 1 */                 io.sentry.ndk.SentryNdk.loadNativeLibraries();
                    } catch (Throwable unused) {
                    }
/* 6 */             loadLibraryLatch.countDown();
                }
            }
