            package p000;

            import java.util.Collection;
            import java.util.List;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public final class m70 implements ScheduledExecutorService {

                /* JADX INFO: renamed from: a */
                public final ExecutorService f13639a;

                /* JADX INFO: renamed from: b */
                public final ScheduledExecutorService f13640b;

                public m70(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
/* 4 */             this.f13639a = executorService;
/* 6 */             this.f13640b = scheduledExecutorService;
                }

                @Override // java.util.concurrent.ExecutorService
                public final boolean awaitTermination(long j, TimeUnit timeUnit) {
/* 3 */             return this.f13639a.awaitTermination(j, timeUnit);
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
/* 3 */             this.f13639a.execute(runnable);
                }

                @Override // java.util.concurrent.ExecutorService
                public final List invokeAll(Collection collection) {
/* 3 */             return this.f13639a.invokeAll(collection);
                }

                @Override // java.util.concurrent.ExecutorService
                public final Object invokeAny(Collection collection) {
/* 3 */             return this.f13639a.invokeAny(collection);
                }

                @Override // java.util.concurrent.ExecutorService
                public final boolean isShutdown() {
/* 3 */             return this.f13639a.isShutdown();
                }

                @Override // java.util.concurrent.ExecutorService
                public final boolean isTerminated() {
/* 3 */             return this.f13639a.isTerminated();
                }

                @Override // java.util.concurrent.ScheduledExecutorService
                public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
/* 13 */            return new o70(new h70(this, runnable, j, timeUnit, 0));
                }

                @Override // java.util.concurrent.ScheduledExecutorService
                public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 15 */            return new o70(new j70(this, runnable, j, j2, timeUnit, 0));
                }

                @Override // java.util.concurrent.ScheduledExecutorService
                public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 15 */            return new o70(new j70(this, runnable, j, j2, timeUnit, 1));
                }

                @Override // java.util.concurrent.ExecutorService
                public final void shutdown() {
/* 8 */             throw new UnsupportedOperationException("Shutting down is not allowed.");
                }

                @Override // java.util.concurrent.ExecutorService
                public final List shutdownNow() {
/* 8 */             throw new UnsupportedOperationException("Shutting down is not allowed.");
                }

                @Override // java.util.concurrent.ExecutorService
                public final Future submit(Callable callable) {
/* 3 */             return this.f13639a.submit(callable);
                }

                @Override // java.util.concurrent.ExecutorService
/* 7 */         public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
/* 8 */             return this.f13639a.invokeAll(collection, j, timeUnit);
                }

                @Override // java.util.concurrent.ExecutorService
/* 7 */         public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
/* 8 */             return this.f13639a.invokeAny(collection, j, timeUnit);
                }

                @Override // java.util.concurrent.ExecutorService
/* 7 */         public final Future submit(Runnable runnable, Object obj) {
/* 8 */             return this.f13639a.submit(runnable, obj);
                }

                @Override // java.util.concurrent.ExecutorService
/* 8 */         public final Future submit(Runnable runnable) {
/* 9 */             return this.f13639a.submit(runnable);
                }

                @Override // java.util.concurrent.ScheduledExecutorService
/* 16 */        public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
/* 17 */            return new o70(new h70(this, callable, j, timeUnit, 1));
                }
            }
