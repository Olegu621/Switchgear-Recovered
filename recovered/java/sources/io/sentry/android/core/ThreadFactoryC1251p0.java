            package io.sentry.android.core;

            import java.util.concurrent.ThreadFactory;
            
            /* JADX INFO: renamed from: io.sentry.android.core.p0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ThreadFactoryC1251p0 implements ThreadFactory {
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
/* 5 */             Thread thread = new Thread(runnable, "SentryDeviceInfoCache");
/* 9 */             thread.setDaemon(true);
/* 12 */            return thread;
                }
            }
