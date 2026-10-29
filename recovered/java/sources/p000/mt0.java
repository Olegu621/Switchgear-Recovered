            package p000;

            import android.os.Handler;
            import java.util.concurrent.Callable;
            import java.util.concurrent.Delayed;
            import java.util.concurrent.RunnableScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public final class mt0 implements RunnableScheduledFuture {

                /* JADX INFO: renamed from: a */
                public final AtomicReference f14017a = new AtomicReference(null);

                /* JADX INFO: renamed from: b */
                public final long f14018b;

                /* JADX INFO: renamed from: c */
                public final Callable f14019c;

                /* JADX INFO: renamed from: d */
                public final C2466xm f14020d;

                public mt0(Handler handler, long j, Callable callable) {
/* 12 */            this.f14018b = j;
/* 14 */            this.f14019c = callable;
/* 31 */            this.f14020d = py0.m7599Y(new C0875ec(this, handler, callable, 25, false));
                }

                @Override // java.util.concurrent.Future
                public final boolean cancel(boolean z) {
/* 3 */             return this.f14020d.cancel(z);
                }

                @Override // java.lang.Comparable
                public final int compareTo(Delayed delayed) {
/* 3 */             TimeUnit timeUnit = TimeUnit.MILLISECONDS;
/* 13 */            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
                }

                @Override // java.util.concurrent.Future
                public final Object get() {
/* 5 */             return this.f14020d.f19248b.get();
                }

                @Override // java.util.concurrent.Delayed
                public final long getDelay(TimeUnit timeUnit) {
/* 10 */            return timeUnit.convert(this.f14018b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                }

                @Override // java.util.concurrent.Future
                public final boolean isCancelled() {
/* 3 */             return this.f14020d.isCancelled();
                }

                @Override // java.util.concurrent.Future
                public final boolean isDone() {
/* 5 */             return this.f14020d.f19248b.isDone();
                }

                @Override // java.util.concurrent.RunnableScheduledFuture
                public final boolean isPeriodic() {
/* 1 */             return false;
                }

                @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
                public final void run() {
/* 8 */             C2260um c2260um = (C2260um) this.f14017a.getAndSet(null);
/* 10 */            if (c2260um != null) {
                        try {
/* 18 */                    c2260um.m9040a(this.f14019c.call());
                        } catch (Exception e) {
/* 23 */                    c2260um.m9041b(e);
                        }
                    }
                }

                @Override // java.util.concurrent.Future
/* 9 */         public final Object get(long j, TimeUnit timeUnit) {
/* 12 */            return this.f14020d.f19248b.get(j, timeUnit);
                }
            }
