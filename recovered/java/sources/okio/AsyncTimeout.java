            package okio;

            import android.support.v4.media.session.PlaybackStateCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.locks.Condition;
            import java.util.concurrent.locks.ReentrantLock;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0004J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\fH\u0014J%\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, m6176d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "()V", "inQueue", HttpUrl.FRAGMENT_ENCODE_SET, "next", "timeoutAt", HttpUrl.FRAGMENT_ENCODE_SET, "access$newTimeoutException", "Ljava/io/IOException;", "cause", "enter", HttpUrl.FRAGMENT_ENCODE_SET, "exit", "newTimeoutException", "remainingNanos", "now", "sink", "Lokio/Sink;", FirebaseAnalytics.Param.SOURCE, "Lokio/Source;", "timedOut", "withTimeout", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Companion", "Watchdog", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 2 */     public class AsyncTimeout extends Timeout {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final long IDLE_TIMEOUT_MILLIS;
                private static final long IDLE_TIMEOUT_NANOS;
                private static final int TIMEOUT_WRITE_SIZE = 65536;
                private static final Condition condition;
                private static AsyncTimeout head;
                private static final ReentrantLock lock;
                private boolean inQueue;
                private AsyncTimeout next;
                private long timeoutAt;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m6176d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "()V", "run", HttpUrl.FRAGMENT_ENCODE_SET, "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class Watchdog extends Thread {
                    public Watchdog() {
/* 3 */                 super("Okio Watchdog");
/* 7 */                 setDaemon(true);
                    }

                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        while (true) {
                            try {
/* 1 */                         Companion companion = AsyncTimeout.INSTANCE;
/* 3 */                         ReentrantLock lock = companion.getLock();
/* 7 */                         lock.lock();
                                try {
/* 10 */                            AsyncTimeout asyncTimeoutAwaitTimeout$okio = companion.awaitTimeout$okio();
/* 18 */                            if (asyncTimeoutAwaitTimeout$okio == AsyncTimeout.head) {
/* 1 */                                 AsyncTimeout.head = null;
/* 24 */                                lock.unlock();
/* 27 */                                return;
                                    } else {
/* 30 */                                lock.unlock();
/* 33 */                                if (asyncTimeoutAwaitTimeout$okio != null) {
/* 35 */                                    asyncTimeoutAwaitTimeout$okio.timedOut();
                                        }
                                    }
                                } catch (Throwable th) {
/* 39 */                            lock.unlock();
/* 42 */                            throw th;
                                }
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }

                static {
/* 11 */            ReentrantLock reentrantLock = new ReentrantLock();
/* 14 */            lock = reentrantLock;
/* 16 */            Condition conditionNewCondition = reentrantLock.newCondition();
/* 20 */            conditionNewCondition.getClass();
/* 23 */            condition = conditionNewCondition;
/* 28 */            IDLE_TIMEOUT_MILLIS = 60000L;
/* 36 */            IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(60000L);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final long remainingNanos(long now) {
/* 3 */             return this.timeoutAt - now;
                }

                public final IOException access$newTimeoutException(IOException cause) {
/* 1 */             return newTimeoutException(cause);
                }

                public final void enter() {
/* 1 */             long timeoutNanos = getTimeoutNanos();
/* 5 */             boolean hasDeadline = getHasDeadline();
/* 13 */            if (timeoutNanos != 0 || hasDeadline) {
/* 1 */                 INSTANCE.scheduleTimeout(this, timeoutNanos, hasDeadline);
                    }
                }

                public final boolean exit() {
/* 1 */             return INSTANCE.cancelScheduledTimeout(this);
                }

                public IOException newTimeoutException(IOException cause) {
/* 5 */             InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
/* 8 */             if (cause != null) {
/* 10 */                interruptedIOException.initCause(cause);
                    }
/* 13 */            return interruptedIOException;
                }

                public final Sink sink(final Sink sink) {
/* 1 */             sink.getClass();
/* 6 */             return new Sink() { // from class: okio.AsyncTimeout.sink.1
                        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                        public void close() throws IOException {
/* 1 */                     AsyncTimeout asyncTimeout = AsyncTimeout.this;
/* 3 */                     Sink sink2 = sink;
/* 5 */                     asyncTimeout.enter();
                            try {
                                try {
/* 8 */                             sink2.close();
/* 15 */                            if (asyncTimeout.exit()) {
/* 23 */                                throw asyncTimeout.access$newTimeoutException(null);
                                    }
                                } catch (IOException e) {
/* 31 */                            if (!asyncTimeout.exit()) {
/* 38 */                                throw e;
                                    }
/* 38 */                            throw asyncTimeout.access$newTimeoutException(e);
                                }
                            } catch (Throwable th) {
/* 39 */                        asyncTimeout.exit();
/* 42 */                        throw th;
                            }
                        }

                        @Override // okio.Sink, java.io.Flushable
                        public void flush() throws IOException {
/* 1 */                     AsyncTimeout asyncTimeout = AsyncTimeout.this;
/* 3 */                     Sink sink2 = sink;
/* 5 */                     asyncTimeout.enter();
                            try {
                                try {
/* 8 */                             sink2.flush();
/* 15 */                            if (asyncTimeout.exit()) {
/* 23 */                                throw asyncTimeout.access$newTimeoutException(null);
                                    }
                                } catch (IOException e) {
/* 31 */                            if (!asyncTimeout.exit()) {
/* 38 */                                throw e;
                                    }
/* 38 */                            throw asyncTimeout.access$newTimeoutException(e);
                                }
                            } catch (Throwable th) {
/* 39 */                        asyncTimeout.exit();
/* 42 */                        throw th;
                            }
                        }

                        public String toString() {
/* 18 */                    return "AsyncTimeout.sink(" + sink + ')';
                        }

                        @Override // okio.Sink
                        public void write(Buffer source, long byteCount) throws IOException {
/* 1 */                     source.getClass();
/* 11 */                    SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
                            while (true) {
/* 14 */                        long j = 0;
/* 18 */                        if (byteCount <= 0) {
/* 96 */                            return;
                                }
/* 20 */                        Segment segment = source.head;
/* 22 */                        segment.getClass();
/* 30 */                        while (j < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
/* 38 */                            j += (long) (segment.limit - segment.pos);
/* 41 */                            if (j >= byteCount) {
/* 43 */                                j = byteCount;
                                        break;
                                    } else {
/* 45 */                                segment = segment.next;
/* 47 */                                segment.getClass();
                                    }
                                }
/* 51 */                        AsyncTimeout asyncTimeout = AsyncTimeout.this;
/* 53 */                        Sink sink2 = sink;
/* 55 */                        asyncTimeout.enter();
                                try {
                                    try {
/* 58 */                                sink2.write(source, j);
/* 65 */                                if (asyncTimeout.exit()) {
/* 74 */                                    throw asyncTimeout.access$newTimeoutException(null);
                                        }
/* 67 */                                byteCount -= j;
                                    } catch (IOException e) {
/* 84 */                                if (!asyncTimeout.exit()) {
/* 91 */                                    throw e;
                                        }
/* 91 */                                throw asyncTimeout.access$newTimeoutException(e);
                                    }
                                } catch (Throwable th) {
/* 92 */                            asyncTimeout.exit();
/* 95 */                            throw th;
                                }
                            }
                        }

                        @Override // okio.Sink
                        /* JADX INFO: renamed from: timeout, reason: from getter */
/* 5 */                 public AsyncTimeout getThis$0() {
/* 6 */                     return AsyncTimeout.this;
                        }
                    };
                }

                public final Source source(final Source source) {
/* 1 */             source.getClass();
/* 6 */             return new Source() { // from class: okio.AsyncTimeout.source.1
                        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                        public void close() throws IOException {
/* 1 */                     AsyncTimeout asyncTimeout = AsyncTimeout.this;
/* 3 */                     Source source2 = source;
/* 5 */                     asyncTimeout.enter();
                            try {
                                try {
/* 8 */                             source2.close();
/* 15 */                            if (asyncTimeout.exit()) {
/* 23 */                                throw asyncTimeout.access$newTimeoutException(null);
                                    }
                                } catch (IOException e) {
/* 31 */                            if (!asyncTimeout.exit()) {
/* 38 */                                throw e;
                                    }
/* 38 */                            throw asyncTimeout.access$newTimeoutException(e);
                                }
                            } catch (Throwable th) {
/* 39 */                        asyncTimeout.exit();
/* 42 */                        throw th;
                            }
                        }

                        @Override // okio.Source
                        public long read(Buffer sink, long byteCount) throws IOException {
/* 1 */                     sink.getClass();
/* 4 */                     AsyncTimeout asyncTimeout = AsyncTimeout.this;
/* 6 */                     Source source2 = source;
/* 8 */                     asyncTimeout.enter();
                            try {
                                try {
/* 11 */                            long j = source2.read(sink, byteCount);
/* 19 */                            if (asyncTimeout.exit()) {
/* 27 */                                throw asyncTimeout.access$newTimeoutException(null);
                                    }
/* 21 */                            return j;
                                } catch (IOException e) {
/* 35 */                            if (asyncTimeout.exit()) {
/* 42 */                                throw asyncTimeout.access$newTimeoutException(e);
                                    }
/* 42 */                            throw e;
                                }
                            } catch (Throwable th) {
/* 43 */                        asyncTimeout.exit();
/* 46 */                        throw th;
                            }
                        }

                        public String toString() {
/* 18 */                    return "AsyncTimeout.source(" + source + ')';
                        }

                        @Override // okio.Source
                        /* JADX INFO: renamed from: timeout, reason: from getter */
/* 5 */                 public AsyncTimeout getThis$0() {
/* 6 */                     return AsyncTimeout.this;
                        }
                    };
                }

                public void timedOut() {
                }

                public final <T> T withTimeout(Function0<? extends T> block) throws IOException {
/* 1 */             block.getClass();
/* 4 */             enter();
                    try {
                        try {
/* 7 */                     T t = (T) block.invoke();
/* 15 */                    if (exit()) {
/* 23 */                        throw access$newTimeoutException(null);
                            }
/* 17 */                    return t;
                        } catch (IOException e) {
/* 31 */                    if (exit()) {
/* 38 */                        throw access$newTimeoutException(e);
                            }
/* 38 */                    throw e;
                        }
                    } catch (Throwable th) {
/* 39 */                exit();
/* 42 */                throw th;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0002J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m6176d2 = {"Lokio/AsyncTimeout$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "IDLE_TIMEOUT_MILLIS", HttpUrl.FRAGMENT_ENCODE_SET, "IDLE_TIMEOUT_NANOS", "TIMEOUT_WRITE_SIZE", HttpUrl.FRAGMENT_ENCODE_SET, "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "head", "Lokio/AsyncTimeout;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "awaitTimeout", "awaitTimeout$okio", "cancelScheduledTimeout", HttpUrl.FRAGMENT_ENCODE_SET, "node", "scheduleTimeout", HttpUrl.FRAGMENT_ENCODE_SET, "timeoutNanos", "hasDeadline", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public final boolean cancelScheduledTimeout(AsyncTimeout node) {
/* 3 */                 ReentrantLock lock = AsyncTimeout.INSTANCE.getLock();
/* 7 */                 lock.lock();
                        try {
/* 15 */                    if (!node.inQueue) {
/* 14 */                        return false;
                            }
/* 1 */                     node.inQueue = false;
/* 28 */                    for (AsyncTimeout asyncTimeout = AsyncTimeout.head; asyncTimeout != null; asyncTimeout = asyncTimeout.next) {
/* 34 */                        if (asyncTimeout.next == node) {
/* 1 */                             asyncTimeout.next = node.next;
/* 1 */                             node.next = null;
/* 14 */                            return false;
                                }
                            }
/* 61 */                    return true;
                        } finally {
/* 63 */                    lock.unlock();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public final void scheduleTimeout(AsyncTimeout node, long timeoutNanos, boolean hasDeadline) {
/* 3 */                 ReentrantLock lock = AsyncTimeout.INSTANCE.getLock();
/* 7 */                 lock.lock();
                        try {
/* 14 */                    if (node.inQueue) {
/* 171 */                       throw new IllegalStateException("Unbalanced enter/exit");
                            }
/* 1 */                     node.inQueue = true;
/* 24 */                    if (AsyncTimeout.head == null) {
/* 1 */                         AsyncTimeout.head = new AsyncTimeout();
/* 39 */                        new Watchdog().start();
                            }
/* 46 */                    long jNanoTime = System.nanoTime();
/* 54 */                    if (timeoutNanos != 0 && hasDeadline) {
/* 1 */                         node.timeoutAt = Math.min(timeoutNanos, node.deadlineNanoTime() - jNanoTime) + jNanoTime;
                            } else if (timeoutNanos != 0) {
/* 1 */                         node.timeoutAt = timeoutNanos + jNanoTime;
                            } else {
/* 79 */                        if (!hasDeadline) {
/* 163 */                           throw new AssertionError();
                                }
/* 1 */                         node.timeoutAt = node.deadlineNanoTime();
                            }
/* 1 */                     long jRemainingNanos = node.remainingNanos(jNanoTime);
/* 1 */                     AsyncTimeout asyncTimeout = AsyncTimeout.head;
/* 96 */                    asyncTimeout.getClass();
/* 103 */                   while (asyncTimeout.next != null) {
/* 1 */                         AsyncTimeout asyncTimeout2 = asyncTimeout.next;
/* 109 */                       asyncTimeout2.getClass();
/* 118 */                       if (jRemainingNanos < asyncTimeout2.remainingNanos(jNanoTime)) {
                                    break;
                                }
/* 1 */                         asyncTimeout = asyncTimeout.next;
/* 125 */                       asyncTimeout.getClass();
                            }
/* 1 */                     node.next = asyncTimeout.next;
/* 1 */                     asyncTimeout.next = node;
/* 143 */                   if (asyncTimeout == AsyncTimeout.head) {
/* 151 */                       AsyncTimeout.INSTANCE.getCondition().signal();
                            }
/* 154 */                   lock.unlock();
                        } catch (Throwable th) {
/* 172 */                   lock.unlock();
/* 175 */                   throw th;
                        }
                    }

                    public final AsyncTimeout awaitTimeout$okio() throws InterruptedException {
/* 1 */                 AsyncTimeout asyncTimeout = AsyncTimeout.head;
/* 5 */                 asyncTimeout.getClass();
/* 1 */                 AsyncTimeout asyncTimeout2 = asyncTimeout.next;
/* 13 */                if (asyncTimeout2 == null) {
/* 15 */                    long jNanoTime = System.nanoTime();
/* 29 */                    getCondition().await(AsyncTimeout.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
/* 1 */                     AsyncTimeout asyncTimeout3 = AsyncTimeout.head;
/* 36 */                    asyncTimeout3.getClass();
/* 43 */                    if (asyncTimeout3.next != null || System.nanoTime() - jNanoTime < AsyncTimeout.IDLE_TIMEOUT_NANOS) {
/* 12 */                        return null;
                            }
/* 1 */                     return AsyncTimeout.head;
                        }
/* 1 */                 long jRemainingNanos = asyncTimeout2.remainingNanos(System.nanoTime());
/* 76 */                if (jRemainingNanos > 0) {
/* 84 */                    getCondition().await(jRemainingNanos, TimeUnit.NANOSECONDS);
/* 12 */                    return null;
                        }
/* 1 */                 AsyncTimeout asyncTimeout4 = AsyncTimeout.head;
/* 92 */                asyncTimeout4.getClass();
/* 1 */                 asyncTimeout4.next = asyncTimeout2.next;
/* 1 */                 asyncTimeout2.next = null;
/* 105 */               return asyncTimeout2;
                    }

                    public final Condition getCondition() {
/* 1 */                 return AsyncTimeout.condition;
                    }

                    public final ReentrantLock getLock() {
/* 1 */                 return AsyncTimeout.lock;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
