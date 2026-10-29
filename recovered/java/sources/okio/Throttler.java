            package okio;

            import android.support.v4.media.session.PlaybackStateCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.util.concurrent.locks.Condition;
            import java.util.concurrent.locks.ReentrantLock;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0014J$\u0010\u0006\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u001bJ\f\u0010\u001c\u001a\u00020\u0004*\u00020\u0004H\u0002J\f\u0010\u001d\u001a\u00020\u0004*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m6176d2 = {"Lokio/Throttler;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "allocatedUntil", HttpUrl.FRAGMENT_ENCODE_SET, "(J)V", "bytesPerSecond", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "maxByteCount", "waitByteCount", "byteCountOrWaitNanos", "now", "byteCount", "byteCountOrWaitNanos$okio", HttpUrl.FRAGMENT_ENCODE_SET, "sink", "Lokio/Sink;", FirebaseAnalytics.Param.SOURCE, "Lokio/Source;", "take", "take$okio", "bytesToNanos", "nanosToBytes", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 30 */    public final class Throttler {
                private long allocatedUntil;
                private long bytesPerSecond;
                private final Condition condition;
                private final ReentrantLock lock;
                private long maxByteCount;
                private long waitByteCount;

                public Throttler(long j) {
/* 4 */             this.allocatedUntil = j;
/* 8 */             this.waitByteCount = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
/* 13 */            this.maxByteCount = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
/* 17 */            ReentrantLock reentrantLock = new ReentrantLock();
/* 20 */            this.lock = reentrantLock;
/* 22 */            Condition conditionNewCondition = reentrantLock.newCondition();
/* 26 */            conditionNewCondition.getClass();
/* 29 */            this.condition = conditionNewCondition;
                }

                public static /* synthetic */ void bytesPerSecond$default(Throttler throttler, long j, long j2, long j3, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 j2 = throttler.waitByteCount;
                    }
/* 7 */             long j4 = j2;
/* 10 */            if ((i & 4) != 0) {
/* 12 */                j3 = throttler.maxByteCount;
                    }
/* 17 */            throttler.bytesPerSecond(j, j4, j3);
                }

                private final long bytesToNanos(long j) {
/* 7 */             return (j * 1000000000) / this.bytesPerSecond;
                }

                private final long nanosToBytes(long j) {
/* 7 */             return (j * this.bytesPerSecond) / 1000000000;
                }

                public final long byteCountOrWaitNanos$okio(long now, long byteCount) {
/* 7 */             if (this.bytesPerSecond == 0) {
/* 9 */                 return byteCount;
                    }
/* 13 */            long jMax = Math.max(this.allocatedUntil - now, 0L);
/* 23 */            long jNanosToBytes = this.maxByteCount - nanosToBytes(jMax);
/* 26 */            if (jNanosToBytes >= byteCount) {
/* 34 */                this.allocatedUntil = now + jMax + bytesToNanos(byteCount);
/* 36 */                return byteCount;
                    }
/* 37 */            long j = this.waitByteCount;
/* 41 */            if (jNanosToBytes >= j) {
/* 50 */                this.allocatedUntil = now + bytesToNanos(this.maxByteCount);
/* 52 */                return jNanosToBytes;
                    }
/* 53 */            long jMin = Math.min(j, byteCount);
/* 65 */            long jBytesToNanos = jMax + bytesToNanos(jMin - this.maxByteCount);
/* 68 */            if (jBytesToNanos != 0) {
/* 80 */                return -jBytesToNanos;
                    }
/* 77 */            this.allocatedUntil = now + bytesToNanos(this.maxByteCount);
/* 79 */            return jMin;
                }

                public final void bytesPerSecond(long bytesPerSecond, long waitByteCount, long maxByteCount) {
/* 1 */             ReentrantLock reentrantLock = this.lock;
/* 3 */             reentrantLock.lock();
                    try {
/* 12 */                if (bytesPerSecond < 0) {
/* 56 */                    throw new IllegalArgumentException("Failed requirement.");
                        }
/* 16 */                if (waitByteCount <= 0) {
/* 50 */                    throw new IllegalArgumentException("Failed requirement.");
                        }
/* 20 */                if (maxByteCount < waitByteCount) {
/* 44 */                    throw new IllegalArgumentException("Failed requirement.");
                        }
/* 22 */                this.bytesPerSecond = bytesPerSecond;
/* 24 */                this.waitByteCount = waitByteCount;
/* 26 */                this.maxByteCount = maxByteCount;
/* 30 */                this.condition.signalAll();
/* 33 */                reentrantLock.unlock();
                    } catch (Throwable th) {
/* 57 */                reentrantLock.unlock();
/* 60 */                throw th;
                    }
                }

                public final Condition getCondition() {
/* 1 */             return this.condition;
                }

                public final ReentrantLock getLock() {
/* 1 */             return this.lock;
                }

                public final Sink sink(Sink sink) {
/* 1 */             sink.getClass();
/* 6 */             return new ForwardingSink(sink) { // from class: okio.Throttler.sink.1
                        @Override // okio.ForwardingSink, okio.Sink
                        public void write(Buffer source, long byteCount) throws IOException {
/* 1 */                     source.getClass();
/* 8 */                     while (byteCount > 0) {
                                try {
/* 12 */                            long jTake$okio = this.take$okio(byteCount);
/* 16 */                            super.write(source, jTake$okio);
/* 19 */                            byteCount -= jTake$okio;
                                } catch (InterruptedException unused) {
/* 25 */                            Thread.currentThread().interrupt();
/* 35 */                            throw new InterruptedIOException("interrupted");
                                }
                            }
                        }
                    };
                }

                public final Source source(Source source) {
/* 1 */             source.getClass();
/* 6 */             return new ForwardingSource(source) { // from class: okio.Throttler.source.1
                        @Override // okio.ForwardingSource, okio.Source
                        public long read(Buffer sink, long byteCount) throws InterruptedIOException {
/* 1 */                     sink.getClass();
                            try {
/* 10 */                        return super.read(sink, this.take$okio(byteCount));
                            } catch (InterruptedException unused) {
/* 19 */                        Thread.currentThread().interrupt();
/* 29 */                        throw new InterruptedIOException("interrupted");
                            }
                        }
                    };
                }

                public final long take$okio(long byteCount) {
/* 5 */             if (byteCount <= 0) {
/* 42 */                C1951n4.m6859j("Failed requirement.");
/* 1 */                 return 0L;
                    }
/* 7 */             ReentrantLock reentrantLock = this.lock;
/* 9 */             reentrantLock.lock();
                    while (true) {
                        try {
/* 16 */                    long jByteCountOrWaitNanos$okio = byteCountOrWaitNanos$okio(System.nanoTime(), byteCount);
/* 22 */                    if (jByteCountOrWaitNanos$okio >= 0) {
/* 24 */                        reentrantLock.unlock();
/* 27 */                        return jByteCountOrWaitNanos$okio;
                            }
/* 31 */                    this.condition.awaitNanos(-jByteCountOrWaitNanos$okio);
                        } catch (Throwable th) {
/* 36 */                    reentrantLock.unlock();
/* 39 */                    throw th;
                        }
                    }
                }

/* 31 */        public Throttler() {
/* 32 */            this(System.nanoTime());
                }

/* 60 */        public final void bytesPerSecond(long j, long j2) {
/* 61 */            bytesPerSecond$default(this, j, j2, 0L, 4, null);
                }

/* 61 */        public final void bytesPerSecond(long j) {
/* 62 */            bytesPerSecond$default(this, j, 0L, 0L, 6, null);
                }
            }
