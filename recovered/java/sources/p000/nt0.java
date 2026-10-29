            package p000;

            import android.os.Handler;
            import android.os.SystemClock;
            import java.util.List;
            import java.util.concurrent.AbstractExecutorService;
            import java.util.concurrent.Callable;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 53 */    public final class nt0 extends AbstractExecutorService implements ScheduledExecutorService {

                /* JADX INFO: renamed from: a */
                public final Handler f14447a;

                static {
/* 4 */             new C0942g5(4);
                }

                public nt0(Handler handler) {
/* 4 */             this.f14447a = handler;
                }

                @Override // java.util.concurrent.ExecutorService
                public final boolean awaitTermination(long j, TimeUnit timeUnit) {
/* 18 */            throw new UnsupportedOperationException(nt0.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
/* 1 */             Handler handler = this.f14447a;
/* 7 */             if (handler.post(runnable)) {
/* 9 */                 return;
                    }
/* 32 */            throw new RejectedExecutionException(handler + " is shutting down");
                }

                @Override // java.util.concurrent.ExecutorService
                public final boolean isShutdown() {
/* 1 */             return false;
                }

                @Override // java.util.concurrent.ExecutorService
                public final boolean isTerminated() {
/* 1 */             return false;
                }

                @Override // java.util.concurrent.ScheduledExecutorService
                public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
/* 11 */            long jConvert = TimeUnit.MILLISECONDS.convert(j, timeUnit) + SystemClock.uptimeMillis();
/* 14 */            Handler handler = this.f14447a;
/* 16 */            mt0 mt0Var = new mt0(handler, jConvert, callable);
/* 23 */            if (handler.postAtTime(mt0Var, jConvert)) {
/* 25 */                return mt0Var;
                    }
/* 51 */            return new sw0(new RejectedExecutionException(handler + " is shutting down"), 1);
                }

                @Override // java.util.concurrent.ScheduledExecutorService
                public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 18 */            throw new UnsupportedOperationException(nt0.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
                }

                @Override // java.util.concurrent.ScheduledExecutorService
                public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
/* 18 */            throw new UnsupportedOperationException(nt0.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
                }

                @Override // java.util.concurrent.ExecutorService
                public final void shutdown() {
/* 18 */            throw new UnsupportedOperationException(nt0.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
                }

                @Override // java.util.concurrent.ExecutorService
                public final List shutdownNow() {
/* 18 */            throw new UnsupportedOperationException(nt0.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
                }

                @Override // java.util.concurrent.ScheduledExecutorService
/* 54 */        public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
/* 56 */            return schedule(new CallableC2139rc(runnable, 1), j, timeUnit);
                }
            }
