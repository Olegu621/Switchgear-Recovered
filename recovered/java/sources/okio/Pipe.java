            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.locks.Condition;
            import java.util.concurrent.locks.ReentrantLock;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import okhttp3.HttpUrl;
            import p000.ds0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\b*\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0007H\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\"\u0010)\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R$\u0010,\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0010\"\u0004\b/\u0010\u000eR\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\f\u001a\u00020\u00068G¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b\f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00118G¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b\u0014\u0010\u0013¨\u0006;"}, m6176d2 = {"Lokio/Pipe;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "maxBufferSize", "<init>", "(J)V", "Lokio/Sink;", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "block", "forward", "(Lokio/Sink;Lkotlin/jvm/functions/Function1;)V", "sink", "fold", "(Lokio/Sink;)V", "-deprecated_sink", "()Lokio/Sink;", "Lokio/Source;", "-deprecated_source", "()Lokio/Source;", FirebaseAnalytics.Param.SOURCE, "cancel", "()V", "J", "getMaxBufferSize$okio", "()J", "Lokio/Buffer;", "buffer", "Lokio/Buffer;", "getBuffer$okio", "()Lokio/Buffer;", HttpUrl.FRAGMENT_ENCODE_SET, "canceled", "Z", "getCanceled$okio", "()Z", "setCanceled$okio", "(Z)V", "sinkClosed", "getSinkClosed$okio", "setSinkClosed$okio", "sourceClosed", "getSourceClosed$okio", "setSourceClosed$okio", "foldedSink", "Lokio/Sink;", "getFoldedSink$okio", "setFoldedSink$okio", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "Lokio/Source;", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class Pipe {
                private final Buffer buffer = new Buffer();
                private boolean canceled;
                private final Condition condition;
                private Sink foldedSink;
                private final ReentrantLock lock;
                private final long maxBufferSize;
                private final Sink sink;
                private boolean sinkClosed;
                private final Source source;
                private boolean sourceClosed;

                public Pipe(long j) {
/* 4 */             this.maxBufferSize = j;
/* 15 */            ReentrantLock reentrantLock = new ReentrantLock();
/* 18 */            this.lock = reentrantLock;
/* 20 */            Condition conditionNewCondition = reentrantLock.newCondition();
/* 24 */            conditionNewCondition.getClass();
/* 27 */            this.condition = conditionNewCondition;
/* 33 */            if (j < 1) {
/* 56 */                ds0.m3200q(pm2.m7488k("maxBufferSize < 1: ", j));
/* 60 */                throw null;
                    }
/* 40 */            this.sink = new Sink() { // from class: okio.Pipe.sink.1
                        private final Timeout timeout = new Timeout();

                        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                        public void close() {
                            boolean hasDeadline;
/* 3 */                     ReentrantLock lock = Pipe.this.getLock();
/* 7 */                     Pipe pipe = Pipe.this;
/* 9 */                     lock.lock();
                            try {
/* 16 */                        if (pipe.getSinkClosed()) {
/* 18 */                            lock.unlock();
/* 21 */                            return;
                                }
/* 22 */                        Sink foldedSink = pipe.getFoldedSink();
/* 26 */                        if (foldedSink == null) {
/* 33 */                            if (pipe.getSourceClosed() && pipe.getBuffer().size() > 0) {
/* 57 */                                throw new IOException("source is closed");
                                    }
/* 62 */                            pipe.setSinkClosed$okio(true);
/* 69 */                            pipe.getCondition().signalAll();
/* 72 */                            foldedSink = null;
                                }
/* 73 */                        lock.unlock();
/* 76 */                        if (foldedSink != null) {
/* 78 */                            Pipe pipe2 = Pipe.this;
/* 80 */                            Timeout timeout = foldedSink.getTimeout();
/* 88 */                            Timeout timeout2 = pipe2.sink().getTimeout();
/* 92 */                            long timeoutNanos = timeout.getTimeoutNanos();
/* 106 */                           long jMinTimeout = Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
/* 110 */                           TimeUnit timeUnit = TimeUnit.NANOSECONDS;
/* 112 */                           timeout.timeout(jMinTimeout, timeUnit);
/* 119 */                           if (!timeout.getHasDeadline()) {
/* 180 */                               if (timeout2.getHasDeadline()) {
/* 186 */                                   timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                                        }
                                        try {
/* 189 */                                   foldedSink.close();
/* 199 */                                   if (hasDeadline) {
/* 204 */                                       return;
                                            } else {
/* 219 */                                       return;
                                            }
                                        } finally {
/* 206 */                                   timeout.timeout(timeoutNanos, timeUnit);
/* 213 */                                   if (timeout2.getHasDeadline()) {
/* 215 */                                       timeout.clearDeadline();
                                            }
                                        }
                                    }
/* 121 */                           long jDeadlineNanoTime = timeout.deadlineNanoTime();
/* 129 */                           if (timeout2.getHasDeadline()) {
/* 143 */                               timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                                    }
                                    try {
/* 146 */                               foldedSink.close();
                                    } finally {
/* 163 */                               timeout.timeout(timeoutNanos, timeUnit);
/* 170 */                               if (timeout2.getHasDeadline()) {
/* 172 */                                   timeout.deadlineNanoTime(jDeadlineNanoTime);
                                        }
                                    }
                                }
                            } catch (Throwable th) {
/* 220 */                       lock.unlock();
/* 223 */                       throw th;
                            }
                        }

                        @Override // okio.Sink, java.io.Flushable
                        public void flush() {
                            boolean hasDeadline;
/* 3 */                     ReentrantLock lock = Pipe.this.getLock();
/* 7 */                     Pipe pipe = Pipe.this;
/* 9 */                     lock.lock();
                            try {
/* 16 */                        if (pipe.getSinkClosed()) {
/* 226 */                           throw new IllegalStateException("closed");
                                }
/* 22 */                        if (pipe.getCanceled()) {
/* 218 */                           throw new IOException("canceled");
                                }
/* 24 */                        Sink foldedSink = pipe.getFoldedSink();
/* 28 */                        if (foldedSink == null) {
/* 35 */                            if (pipe.getSourceClosed() && pipe.getBuffer().size() > 0) {
/* 59 */                                throw new IOException("source is closed");
                                    }
/* 63 */                            foldedSink = null;
                                }
/* 64 */                        lock.unlock();
/* 67 */                        if (foldedSink != null) {
/* 69 */                            Pipe pipe2 = Pipe.this;
/* 71 */                            Timeout timeout = foldedSink.getTimeout();
/* 79 */                            Timeout timeout2 = pipe2.sink().getTimeout();
/* 83 */                            long timeoutNanos = timeout.getTimeoutNanos();
/* 97 */                            long jMinTimeout = Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
/* 101 */                           TimeUnit timeUnit = TimeUnit.NANOSECONDS;
/* 103 */                           timeout.timeout(jMinTimeout, timeUnit);
/* 110 */                           if (!timeout.getHasDeadline()) {
/* 171 */                               if (timeout2.getHasDeadline()) {
/* 177 */                                   timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                                        }
                                        try {
/* 180 */                                   foldedSink.flush();
/* 190 */                                   if (hasDeadline) {
/* 195 */                                       return;
                                            } else {
/* 210 */                                       return;
                                            }
                                        } finally {
/* 197 */                                   timeout.timeout(timeoutNanos, timeUnit);
/* 204 */                                   if (timeout2.getHasDeadline()) {
/* 206 */                                       timeout.clearDeadline();
                                            }
                                        }
                                    }
/* 112 */                           long jDeadlineNanoTime = timeout.deadlineNanoTime();
/* 120 */                           if (timeout2.getHasDeadline()) {
/* 134 */                               timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                                    }
                                    try {
/* 137 */                               foldedSink.flush();
                                    } finally {
/* 154 */                               timeout.timeout(timeoutNanos, timeUnit);
/* 161 */                               if (timeout2.getHasDeadline()) {
/* 163 */                                   timeout.deadlineNanoTime(jDeadlineNanoTime);
                                        }
                                    }
                                }
                            } catch (Throwable th) {
/* 227 */                       lock.unlock();
/* 230 */                       throw th;
                            }
                        }

                        @Override // okio.Sink
                        /* JADX INFO: renamed from: timeout, reason: from getter */
                        public Timeout getTimeout() {
/* 1 */                     return this.timeout;
                        }

                        @Override // okio.Sink
                        public void write(Buffer source, long byteCount) {
                            Sink foldedSink;
                            boolean hasDeadline;
/* 1 */                     source.getClass();
/* 6 */                     ReentrantLock lock = Pipe.this.getLock();
/* 10 */                    Pipe pipe = Pipe.this;
/* 12 */                    lock.lock();
                            try {
/* 19 */                        if (pipe.getSinkClosed()) {
/* 279 */                           throw new IllegalStateException("closed");
                                }
/* 27 */                        if (pipe.getCanceled()) {
/* 271 */                           throw new IOException("canceled");
                                }
                                while (true) {
/* 33 */                            if (byteCount <= 0) {
/* 118 */                               foldedSink = null;
                                        break;
                                    }
/* 35 */                            foldedSink = pipe.getFoldedSink();
/* 39 */                            if (foldedSink != null) {
                                        break;
                                    }
/* 46 */                            if (pipe.getSourceClosed()) {
/* 117 */                               throw new IOException("source is closed");
                                    }
/* 60 */                            long maxBufferSize = pipe.getMaxBufferSize() - pipe.getBuffer().size();
/* 63 */                            if (maxBufferSize == 0) {
/* 71 */                                this.timeout.awaitSignal(pipe.getCondition());
/* 78 */                                if (pipe.getCanceled()) {
/* 86 */                                    throw new IOException("canceled");
                                        }
                                    } else {
/* 90 */                                long jMin = Math.min(maxBufferSize, byteCount);
/* 98 */                                pipe.getBuffer().write(source, jMin);
/* 101 */                               byteCount -= jMin;
/* 106 */                               pipe.getCondition().signalAll();
                                    }
                                }
/* 119 */                       lock.unlock();
/* 122 */                       if (foldedSink != null) {
/* 124 */                           Pipe pipe2 = Pipe.this;
/* 126 */                           Timeout timeout = foldedSink.getTimeout();
/* 134 */                           Timeout timeout2 = pipe2.sink().getTimeout();
/* 138 */                           long timeoutNanos = timeout.getTimeoutNanos();
/* 152 */                           long jMinTimeout = Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
/* 156 */                           TimeUnit timeUnit = TimeUnit.NANOSECONDS;
/* 158 */                           timeout.timeout(jMinTimeout, timeUnit);
/* 165 */                           if (!timeout.getHasDeadline()) {
/* 226 */                               if (timeout2.getHasDeadline()) {
/* 232 */                                   timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                                        }
                                        try {
/* 235 */                                   foldedSink.write(source, byteCount);
/* 245 */                                   if (hasDeadline) {
/* 250 */                                       return;
                                            } else {
/* 265 */                                       return;
                                            }
                                        } finally {
/* 252 */                                   timeout.timeout(timeoutNanos, timeUnit);
/* 259 */                                   if (timeout2.getHasDeadline()) {
/* 261 */                                       timeout.clearDeadline();
                                            }
                                        }
                                    }
/* 167 */                           long jDeadlineNanoTime = timeout.deadlineNanoTime();
/* 175 */                           if (timeout2.getHasDeadline()) {
/* 189 */                               timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                                    }
                                    try {
/* 192 */                               foldedSink.write(source, byteCount);
                                    } finally {
/* 209 */                               timeout.timeout(timeoutNanos, timeUnit);
/* 216 */                               if (timeout2.getHasDeadline()) {
/* 218 */                                   timeout.deadlineNanoTime(jDeadlineNanoTime);
                                        }
                                    }
                                }
                            } catch (Throwable th) {
/* 280 */                       lock.unlock();
/* 283 */                       throw th;
                            }
                        }
                    };
/* 47 */            this.source = new Source() { // from class: okio.Pipe.source.1
                        private final Timeout timeout = new Timeout();

                        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                        public void close() {
/* 3 */                     ReentrantLock lock = Pipe.this.getLock();
/* 7 */                     Pipe pipe = Pipe.this;
/* 9 */                     lock.lock();
                            try {
/* 13 */                        pipe.setSourceClosed$okio(true);
/* 20 */                        pipe.getCondition().signalAll();
                            } finally {
/* 28 */                        lock.unlock();
                            }
                        }

                        @Override // okio.Source
                        public long read(Buffer sink, long byteCount) {
/* 1 */                     sink.getClass();
/* 6 */                     ReentrantLock lock = Pipe.this.getLock();
/* 10 */                    Pipe pipe = Pipe.this;
/* 12 */                    lock.lock();
                            try {
/* 19 */                        if (pipe.getSourceClosed()) {
/* 111 */                           throw new IllegalStateException("closed");
                                }
/* 27 */                        if (pipe.getCanceled()) {
/* 103 */                           throw new IOException("canceled");
                                }
/* 41 */                        while (pipe.getBuffer().size() == 0) {
/* 47 */                            if (pipe.getSinkClosed()) {
/* 49 */                                lock.unlock();
/* 52 */                                return -1L;
                                    }
/* 61 */                            this.timeout.awaitSignal(pipe.getCondition());
/* 68 */                            if (pipe.getCanceled()) {
/* 76 */                                throw new IOException("canceled");
                                    }
                                }
/* 83 */                        long j2 = pipe.getBuffer().read(sink, byteCount);
/* 91 */                        pipe.getCondition().signalAll();
/* 94 */                        lock.unlock();
/* 97 */                        return j2;
                            } catch (Throwable th) {
/* 112 */                       lock.unlock();
/* 115 */                       throw th;
                            }
                        }

                        @Override // okio.Source
                        /* JADX INFO: renamed from: timeout, reason: from getter */
                        public Timeout getTimeout() {
/* 1 */                     return this.timeout;
                        }
                    };
                }

                private final void forward(Sink sink, Function1<? super Sink, Unit> function1) {
                    boolean hasDeadline;
/* 1 */             Timeout timeout = sink.getTimeout();
/* 9 */             Timeout timeout2 = sink().getTimeout();
/* 13 */            long timeoutNanos = timeout.getTimeoutNanos();
/* 27 */            long jMinTimeout = Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
/* 31 */            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
/* 33 */            timeout.timeout(jMinTimeout, timeUnit);
/* 40 */            if (!timeout.getHasDeadline()) {
/* 101 */               if (timeout2.getHasDeadline()) {
/* 107 */                   timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
/* 110 */                   function1.invoke(sink);
/* 120 */                   if (hasDeadline) {
/* 125 */                       return;
                            } else {
/* 125 */                       return;
                            }
                        } finally {
/* 127 */                   timeout.timeout(timeoutNanos, timeUnit);
/* 134 */                   if (timeout2.getHasDeadline()) {
/* 136 */                       timeout.clearDeadline();
                            }
                        }
                    }
/* 42 */            long jDeadlineNanoTime = timeout.deadlineNanoTime();
/* 50 */            if (timeout2.getHasDeadline()) {
/* 64 */                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                    }
                    try {
/* 67 */                function1.invoke(sink);
                    } finally {
/* 84 */                timeout.timeout(timeoutNanos, timeUnit);
/* 91 */                if (timeout2.getHasDeadline()) {
/* 93 */                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                        }
                    }
                }

                /* JADX INFO: renamed from: -deprecated_sink, reason: not valid java name and from getter */
                public final Sink getSink() {
/* 1 */             return this.sink;
                }

                /* JADX INFO: renamed from: -deprecated_source, reason: not valid java name and from getter */
                public final Source getSource() {
/* 1 */             return this.source;
                }

                public final void cancel() {
/* 1 */             ReentrantLock reentrantLock = this.lock;
/* 3 */             reentrantLock.lock();
                    try {
/* 7 */                 this.canceled = true;
/* 11 */                this.buffer.clear();
/* 16 */                this.condition.signalAll();
                    } finally {
/* 24 */                reentrantLock.unlock();
                    }
                }

                public final void fold(Sink sink) throws IOException {
/* 1 */             sink.getClass();
                    while (true) {
/* 4 */                 ReentrantLock reentrantLock = this.lock;
/* 6 */                 reentrantLock.lock();
                        try {
/* 11 */                    if (this.foldedSink != null) {
/* 117 */                       throw new IllegalStateException("sink already folded");
                            }
/* 15 */                    if (this.canceled) {
/* 100 */                       this.foldedSink = sink;
/* 109 */                       throw new IOException("canceled");
                            }
/* 24 */                    if (this.buffer.exhausted()) {
/* 26 */                        this.sourceClosed = true;
/* 28 */                        this.foldedSink = sink;
/* 30 */                        reentrantLock.unlock();
/* 33 */                        return;
                            }
/* 36 */                    boolean z = this.sinkClosed;
/* 40 */                    Buffer buffer = new Buffer();
/* 43 */                    Buffer buffer2 = this.buffer;
/* 49 */                    buffer.write(buffer2, buffer2.size());
/* 54 */                    this.condition.signalAll();
/* 57 */                    reentrantLock.unlock();
                            try {
/* 64 */                        sink.write(buffer, buffer.size());
/* 67 */                        if (z) {
/* 69 */                            sink.close();
                                } else {
/* 75 */                            sink.flush();
                                }
                            } catch (Throwable th) {
/* 79 */                        ReentrantLock reentrantLock2 = this.lock;
/* 81 */                        reentrantLock2.lock();
                                try {
/* 84 */                            this.sourceClosed = true;
/* 88 */                            this.condition.signalAll();
/* 94 */                            throw th;
                                } finally {
/* 96 */                            reentrantLock2.unlock();
                                }
                            }
                        } catch (Throwable th2) {
/* 118 */                   reentrantLock.unlock();
/* 121 */                   throw th2;
                        }
                    }
                }

                /* JADX INFO: renamed from: getBuffer$okio, reason: from getter */
                public final Buffer getBuffer() {
/* 1 */             return this.buffer;
                }

                /* JADX INFO: renamed from: getCanceled$okio, reason: from getter */
                public final boolean getCanceled() {
/* 1 */             return this.canceled;
                }

                public final Condition getCondition() {
/* 1 */             return this.condition;
                }

                /* JADX INFO: renamed from: getFoldedSink$okio, reason: from getter */
                public final Sink getFoldedSink() {
/* 1 */             return this.foldedSink;
                }

                public final ReentrantLock getLock() {
/* 1 */             return this.lock;
                }

                /* JADX INFO: renamed from: getMaxBufferSize$okio, reason: from getter */
                public final long getMaxBufferSize() {
/* 1 */             return this.maxBufferSize;
                }

                /* JADX INFO: renamed from: getSinkClosed$okio, reason: from getter */
                public final boolean getSinkClosed() {
/* 1 */             return this.sinkClosed;
                }

                /* JADX INFO: renamed from: getSourceClosed$okio, reason: from getter */
                public final boolean getSourceClosed() {
/* 1 */             return this.sourceClosed;
                }

                public final void setCanceled$okio(boolean z) {
/* 1 */             this.canceled = z;
                }

                public final void setFoldedSink$okio(Sink sink) {
/* 1 */             this.foldedSink = sink;
                }

                public final void setSinkClosed$okio(boolean z) {
/* 1 */             this.sinkClosed = z;
                }

                public final void setSourceClosed$okio(boolean z) {
/* 1 */             this.sourceClosed = z;
                }

                public final Sink sink() {
/* 1 */             return this.sink;
                }

                public final Source source() {
/* 1 */             return this.source;
                }
            }
