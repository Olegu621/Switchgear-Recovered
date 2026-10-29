            package io.sentry.android.replay.util;

            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.replay.capture.RunnableC1303e;
            import java.util.Collection;
            import java.util.List;
            import java.util.concurrent.Callable;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import kotlin.text.C1852e;
            import okhttp3.HttpUrl;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.util.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public final class ScheduledExecutorServiceC1353g implements ScheduledExecutorService {

                /* JADX INFO: renamed from: a */
                public final ScheduledExecutorService f10661a;

                /* JADX INFO: renamed from: b */
                public final C1554m6 f10662b;

                public ScheduledExecutorServiceC1353g(ScheduledExecutorService scheduledExecutorService, SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             sentryAndroidOptions.getClass();
/* 7 */             this.f10661a = scheduledExecutorService;
/* 9 */             this.f10662b = sentryAndroidOptions;
                }

                @Override // java.util.concurrent.ExecutorService
                public final boolean awaitTermination(long j, TimeUnit timeUnit) {
/* 3 */             return this.f10661a.awaitTermination(j, timeUnit);
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
/* 3 */             this.f10661a.execute(runnable);
                }

                @Override // java.util.concurrent.ExecutorService
                public final List invokeAll(Collection collection) {
/* 3 */             return this.f10661a.invokeAll(collection);
                }

                @Override // java.util.concurrent.ExecutorService
                public final Object invokeAny(Collection collection) {
/* 3 */             return this.f10661a.invokeAny(collection);
                }

                @Override // java.util.concurrent.ExecutorService
                public final boolean isShutdown() {
/* 3 */             return this.f10661a.isShutdown();
                }

                @Override // java.util.concurrent.ExecutorService
                public final boolean isTerminated() {
/* 3 */             return this.f10661a.isTerminated();
                }

                @Override // java.util.concurrent.ScheduledExecutorService
                public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
/* 3 */             return this.f10661a.schedule(runnable, j, timeUnit);
                }

                @Override // java.util.concurrent.ScheduledExecutorService
                public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 3 */             return this.f10661a.scheduleAtFixedRate(runnable, j, j2, timeUnit);
                }

                @Override // java.util.concurrent.ScheduledExecutorService
                public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 3 */             return this.f10661a.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
                }

                @Override // java.util.concurrent.ExecutorService
                public final void shutdown() {
                    synchronized (this) {
/* 8 */                 if (!this.f10661a.isShutdown()) {
/* 12 */                    this.f10661a.shutdown();
                        }
                        try {
/* 32 */                    if (!this.f10661a.awaitTermination(this.f10662b.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
/* 34 */                        shutdownNow();
                            }
                        } catch (InterruptedException unused) {
/* 38 */                    shutdownNow();
/* 45 */                    Thread.currentThread().interrupt();
                        }
                    }
                }

                @Override // java.util.concurrent.ExecutorService
                public final List shutdownNow() {
/* 3 */             return this.f10661a.shutdownNow();
                }

                @Override // java.util.concurrent.ExecutorService
                public final Future submit(Runnable runnable) {
/* 1 */             runnable.getClass();
/* 8 */             String name = Thread.currentThread().getName();
/* 12 */            name.getClass();
/* 23 */            if (C1852e.m6263m(name, "SentryReplayIntegration", false)) {
/* 25 */                runnable.run();
/* 22 */                return null;
                    }
                    try {
/* 37 */                return this.f10661a.submit(new RunnableC1303e(2, runnable, this));
                    } catch (Throwable th) {
/* 75 */                this.f10662b.getLogger().mo4671d(EnumC1553m5.ERROR, fm0.m3789o(new StringBuilder("Failed to submit task "), runnable instanceof RunnableC1354h ? ((RunnableC1354h) runnable).f10663a : HttpUrl.FRAGMENT_ENCODE_SET, " to executor"), th);
/* 22 */                return null;
                    }
                }

                @Override // java.util.concurrent.ExecutorService
/* 7 */         public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
/* 8 */             return this.f10661a.invokeAll(collection, j, timeUnit);
                }

                @Override // java.util.concurrent.ExecutorService
/* 7 */         public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
/* 8 */             return this.f10661a.invokeAny(collection, j, timeUnit);
                }

                @Override // java.util.concurrent.ScheduledExecutorService
/* 7 */         public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
/* 8 */             return this.f10661a.schedule(callable, j, timeUnit);
                }

                @Override // java.util.concurrent.ExecutorService
/* 78 */        public final Future submit(Callable callable) {
/* 79 */            return this.f10661a.submit(callable);
                }

                @Override // java.util.concurrent.ExecutorService
/* 79 */        public final Future submit(Runnable runnable, Object obj) {
/* 80 */            return this.f10661a.submit(runnable, obj);
                }
            }
