            package okio;

            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.locks.Condition;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import p000.ds0;
            import p000.f42;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u0000H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J-\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0016H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\tH\u0016J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, m6176d2 = {"Lokio/Timeout;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "deadlineNanoTime", HttpUrl.FRAGMENT_ENCODE_SET, "hasDeadline", HttpUrl.FRAGMENT_ENCODE_SET, "timeoutNanos", "awaitSignal", HttpUrl.FRAGMENT_ENCODE_SET, "condition", "Ljava/util/concurrent/locks/Condition;", "clearDeadline", "clearTimeout", "deadline", "duration", "unit", "Ljava/util/concurrent/TimeUnit;", "intersectWith", "T", "other", "block", "Lkotlin/Function0;", "(Lokio/Timeout;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "throwIfReached", "timeout", "waitUntilNotified", "monitor", "Companion", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 2 */     public class Timeout {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final Timeout NONE = new Timeout() { // from class: okio.Timeout$Companion$NONE$1
                    @Override // okio.Timeout
                    public Timeout deadlineNanoTime(long deadlineNanoTime) {
/* 1 */                 return this;
                    }

                    @Override // okio.Timeout
                    public void throwIfReached() {
                    }

                    @Override // okio.Timeout
                    public Timeout timeout(long timeout, TimeUnit unit) {
/* 1 */                 unit.getClass();
/* 4 */                 return this;
                    }
                };
                private long deadlineNanoTime;
                private boolean hasDeadline;
                private long timeoutNanos;

                public final void awaitSignal(Condition condition) throws InterruptedIOException {
/* 1 */             condition.getClass();
                    try {
/* 4 */                 boolean hasDeadline = getHasDeadline();
/* 8 */                 long timeoutNanos = getTimeoutNanos();
/* 12 */                long jNanoTime = 0;
/* 14 */                if (!hasDeadline && timeoutNanos == 0) {
/* 20 */                    condition.await();
/* 23 */                    return;
                        }
/* 24 */                long jNanoTime2 = System.nanoTime();
/* 28 */                if (hasDeadline && timeoutNanos != 0) {
/* 39 */                    timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - jNanoTime2);
                        } else if (hasDeadline) {
/* 50 */                    timeoutNanos = deadlineNanoTime() - jNanoTime2;
                        }
/* 54 */                if (timeoutNanos > 0) {
/* 58 */                    condition.await(timeoutNanos, TimeUnit.NANOSECONDS);
/* 65 */                    jNanoTime = System.nanoTime() - jNanoTime2;
                        }
/* 69 */                if (jNanoTime >= timeoutNanos) {
/* 79 */                    throw new InterruptedIOException("timeout");
                        }
                    } catch (InterruptedException unused) {
/* 84 */                Thread.currentThread().interrupt();
/* 94 */                throw new InterruptedIOException("interrupted");
                    }
                }

                public Timeout clearDeadline() {
/* 2 */             this.hasDeadline = false;
/* 4 */             return this;
                }

                public Timeout clearTimeout() {
/* 3 */             this.timeoutNanos = 0L;
/* 5 */             return this;
                }

                public final Timeout deadline(long duration, TimeUnit unit) {
/* 1 */             unit.getClass();
/* 8 */             if (duration > 0) {
/* 19 */                return deadlineNanoTime(unit.toNanos(duration) + System.nanoTime());
                    }
/* 30 */            ds0.m3200q(pm2.m7488k("duration <= 0: ", duration));
/* 33 */            return null;
                }

                public long deadlineNanoTime() {
/* 3 */             if (this.hasDeadline) {
/* 5 */                 return this.deadlineNanoTime;
                    }
/* 10 */            f42.m3656l("No deadline");
/* 13 */            return 0L;
                }

                /* JADX INFO: renamed from: hasDeadline, reason: from getter */
                public boolean getHasDeadline() {
/* 1 */             return this.hasDeadline;
                }

                public final <T> T intersectWith(Timeout other, Function0<? extends T> block) {
/* 1 */             other.getClass();
/* 4 */             block.getClass();
/* 7 */             long timeoutNanos = getTimeoutNanos();
/* 21 */            long jMinTimeout = INSTANCE.minTimeout(other.getTimeoutNanos(), getTimeoutNanos());
/* 25 */            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
/* 27 */            timeout(jMinTimeout, timeUnit);
/* 34 */            if (!getHasDeadline()) {
/* 96 */                if (other.getHasDeadline()) {
/* 102 */                   deadlineNanoTime(other.deadlineNanoTime());
                        }
                        try {
/* 105 */                   return (T) block.invoke();
                        } finally {
/* 123 */                   timeout(timeoutNanos, timeUnit);
/* 130 */                   if (other.getHasDeadline()) {
/* 132 */                       clearDeadline();
                            }
                        }
                    }
/* 36 */            long jDeadlineNanoTime = deadlineNanoTime();
/* 44 */            if (other.getHasDeadline()) {
/* 58 */                deadlineNanoTime(Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
                    }
                    try {
/* 61 */                return (T) block.invoke();
                    } finally {
/* 79 */                timeout(timeoutNanos, timeUnit);
/* 86 */                if (other.getHasDeadline()) {
/* 88 */                    deadlineNanoTime(jDeadlineNanoTime);
                        }
                    }
                }

                public void throwIfReached() throws IOException {
/* 9 */             if (Thread.currentThread().isInterrupted()) {
/* 45 */                throw new InterruptedIOException("interrupted");
                    }
/* 13 */            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
/* 36 */                throw new InterruptedIOException("deadline reached");
                    }
                }

                public Timeout timeout(long timeout, TimeUnit unit) {
/* 1 */             unit.getClass();
/* 8 */             if (timeout >= 0) {
/* 14 */                this.timeoutNanos = unit.toNanos(timeout);
/* 16 */                return this;
                    }
/* 23 */            ds0.m3200q(pm2.m7488k("timeout < 0: ", timeout));
/* 26 */            return null;
                }

                /* JADX INFO: renamed from: timeoutNanos, reason: from getter */
                public long getTimeoutNanos() {
/* 1 */             return this.timeoutNanos;
                }

                public final void waitUntilNotified(Object monitor) throws InterruptedIOException {
/* 1 */             monitor.getClass();
                    try {
/* 4 */                 boolean hasDeadline = getHasDeadline();
/* 8 */                 long timeoutNanos = getTimeoutNanos();
/* 12 */                long jNanoTime = 0;
/* 14 */                if (!hasDeadline && timeoutNanos == 0) {
/* 20 */                    monitor.wait();
/* 23 */                    return;
                        }
/* 24 */                long jNanoTime2 = System.nanoTime();
/* 28 */                if (hasDeadline && timeoutNanos != 0) {
/* 39 */                    timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - jNanoTime2);
                        } else if (hasDeadline) {
/* 50 */                    timeoutNanos = deadlineNanoTime() - jNanoTime2;
                        }
/* 54 */                if (timeoutNanos > 0) {
/* 59 */                    long j = timeoutNanos / 1000000;
/* 65 */                    monitor.wait(j, (int) (timeoutNanos - (1000000 * j)));
/* 72 */                    jNanoTime = System.nanoTime() - jNanoTime2;
                        }
/* 76 */                if (jNanoTime >= timeoutNanos) {
/* 86 */                    throw new InterruptedIOException("timeout");
                        }
                    } catch (InterruptedException unused) {
/* 91 */                Thread.currentThread().interrupt();
/* 101 */               throw new InterruptedIOException("interrupted");
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m6176d2 = {"Lokio/Timeout$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "NONE", "Lokio/Timeout;", "minTimeout", HttpUrl.FRAGMENT_ENCODE_SET, "aNanos", "bNanos", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final long minTimeout(long aNanos, long bNanos) {
                        return (aNanos != 0 && (bNanos == 0 || aNanos < bNanos)) ? aNanos : bNanos;
                    }

/* 4 */             private Companion() {
                    }
                }

/* 15 */        public Timeout deadlineNanoTime(long deadlineNanoTime) {
/* 16 */            this.hasDeadline = true;
/* 17 */            this.deadlineNanoTime = deadlineNanoTime;
                    return this;
                }
            }
