            package okhttp3.internal.http2;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.net.SocketTimeoutException;
            import java.util.ArrayDeque;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.Headers;
            import okhttp3.HttpUrl;
            import okhttp3.internal.Util;
            import okio.AsyncTimeout;
            import okio.Buffer;
            import okio.BufferedSource;
            import okio.Sink;
            import okio.Source;
            import okio.Timeout;
            import p000.C1951n4;
            import p000.ds0;
            import p000.f42;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 _2\u00020\u0001:\u0004_`abB1\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020#J\r\u0010C\u001a\u00020AH\u0000¢\u0006\u0002\bDJ\r\u0010E\u001a\u00020AH\u0000¢\u0006\u0002\bFJ\u0018\u0010G\u001a\u00020A2\u0006\u0010H\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u001a\u0010I\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u000e\u0010J\u001a\u00020A2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010K\u001a\u00020A2\u0006\u0010L\u001a\u00020\nJ\u0006\u0010M\u001a\u00020NJ\u0006\u0010O\u001a\u00020PJ\u0006\u0010,\u001a\u00020QJ\u0016\u0010R\u001a\u00020A2\u0006\u00104\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0003J\u0016\u0010U\u001a\u00020A2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010V\u001a\u00020A2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010W\u001a\u00020\nJ\u0006\u0010L\u001a\u00020\nJ\r\u0010X\u001a\u00020AH\u0000¢\u0006\u0002\bYJ$\u0010Z\u001a\u00020A2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u0007J\u0006\u0010>\u001a\u00020QR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010 R$\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u0018\u0010,\u001a\u00060-R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u00100\u001a\u000601R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u00104\u001a\u000605R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R$\u00108\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R$\u0010;\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010&\"\u0004\b=\u0010(R\u0018\u0010>\u001a\u00060-R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010/¨\u0006c"}, m6176d2 = {"Lokhttp3/internal/http2/Http2Stream;", HttpUrl.FRAGMENT_ENCODE_SET, "id", HttpUrl.FRAGMENT_ENCODE_SET, "connection", "Lokhttp3/internal/http2/Http2Connection;", "outFinished", HttpUrl.FRAGMENT_ENCODE_SET, "inFinished", "headers", "Lokhttp3/Headers;", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "(Lokhttp3/internal/http2/ErrorCode;)V", "errorException", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "hasResponseHeaders", "headersQueue", "Ljava/util/ArrayDeque;", "getId", "()I", "isLocallyInitiated", "()Z", "isOpen", "<set-?>", HttpUrl.FRAGMENT_ENCODE_SET, "readBytesAcknowledged", "getReadBytesAcknowledged", "()J", "setReadBytesAcknowledged$okhttp", "(J)V", "readBytesTotal", "getReadBytesTotal", "setReadBytesTotal$okhttp", "readTimeout", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", FirebaseAnalytics.Param.SOURCE, "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "writeBytesTotal", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "writeTimeout", "getWriteTimeout$okhttp", "addBytesToWriteWindow", HttpUrl.FRAGMENT_ENCODE_SET, "delta", "cancelStreamIfNecessary", "cancelStreamIfNecessary$okhttp", "checkOutNotClosed", "checkOutNotClosed$okhttp", "close", "rstStatusCode", "closeInternal", "closeLater", "enqueueTrailers", "trailers", "getSink", "Lokio/Sink;", "getSource", "Lokio/Source;", "Lokio/Timeout;", "receiveData", "Lokio/BufferedSource;", "length", "receiveHeaders", "receiveRstStream", "takeHeaders", "waitForIo", "waitForIo$okhttp", "writeHeaders", "responseHeaders", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "flushHeaders", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 16 */    public final class Http2Stream {
                public static final long EMIT_BUFFER_SIZE = 16384;
                private final Http2Connection connection;
                private ErrorCode errorCode;
                private IOException errorException;
                private boolean hasResponseHeaders;
                private final ArrayDeque<Headers> headersQueue;
                private final int id;
                private long readBytesAcknowledged;
                private long readBytesTotal;
                private final StreamTimeout readTimeout;
                private final FramingSink sink;
                private final FramingSource source;
                private long writeBytesMaximum;
                private long writeBytesTotal;
                private final StreamTimeout writeTimeout;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u001d\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\"J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002R\u001a\u0010\u0007\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006&"}, m6176d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokio/Source;", "maxByteCount", HttpUrl.FRAGMENT_ENCODE_SET, "finished", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "getFinished$okhttp", "setFinished$okhttp", "readBuffer", "Lokio/Buffer;", "getReadBuffer", "()Lokio/Buffer;", "receiveBuffer", "getReceiveBuffer", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "close", HttpUrl.FRAGMENT_ENCODE_SET, "read", "sink", "byteCount", "receive", FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "receive$okhttp", "timeout", "Lokio/Timeout;", "updateConnectionFlowControl", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class FramingSource implements Source {
                    private boolean closed;
                    private boolean finished;
                    private final long maxByteCount;
                    private final Buffer readBuffer;
                    private final Buffer receiveBuffer;
                    final /* synthetic */ Http2Stream this$0;
                    private Headers trailers;

                    public FramingSource(Http2Stream http2Stream, long j, boolean z) {
/* 1 */                 http2Stream.getClass();
/* 4 */                 this.this$0 = http2Stream;
/* 9 */                 this.maxByteCount = j;
/* 11 */                this.finished = z;
/* 18 */                this.receiveBuffer = new Buffer();
/* 25 */                this.readBuffer = new Buffer();
                    }

                    private final void updateConnectionFlowControl(long read) {
/* 1 */                 Http2Stream http2Stream = this.this$0;
/* 5 */                 if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
/* 24 */                    s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                        } else {
/* 34 */                    this.this$0.getConnection().updateConnectionFlowControl$okhttp(read);
                        }
                    }

                    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
                        long size;
/* 1 */                 Http2Stream http2Stream = this.this$0;
                        synchronized (http2Stream) {
/* 5 */                     setClosed$okhttp(true);
/* 12 */                    size = getReadBuffer().size();
/* 20 */                    getReadBuffer().clear();
/* 23 */                    http2Stream.notifyAll();
                        }
/* 31 */                if (size > 0) {
/* 33 */                    updateConnectionFlowControl(size);
                        }
/* 38 */                this.this$0.cancelStreamIfNecessary$okhttp();
                    }

                    /* JADX INFO: renamed from: getClosed$okhttp, reason: from getter */
                    public final boolean getClosed() {
/* 1 */                 return this.closed;
                    }

                    /* JADX INFO: renamed from: getFinished$okhttp, reason: from getter */
                    public final boolean getFinished() {
/* 1 */                 return this.finished;
                    }

                    public final Buffer getReadBuffer() {
/* 1 */                 return this.readBuffer;
                    }

                    public final Buffer getReceiveBuffer() {
/* 1 */                 return this.receiveBuffer;
                    }

                    public final Headers getTrailers() {
/* 1 */                 return this.trailers;
                    }

                    @Override // okio.Source
                    public long read(Buffer sink, long byteCount) throws IOException {
                        IOException errorException;
                        boolean z;
                        long j;
                        long j2;
/* 5 */                 sink.getClass();
/* 8 */                 long j3 = 0;
/* 12 */                if (byteCount < 0) {
/* 234 */                   ds0.m3200q(Intrinsics.m6219d(Long.valueOf(byteCount), "byteCount < 0: "));
/* 8 */                     return 0L;
                        }
                        while (true) {
/* 14 */                    Http2Stream http2Stream = this.this$0;
                            synchronized (http2Stream) {
/* 21 */                        http2Stream.getReadTimeout().enter();
                                try {
/* 28 */                            if (http2Stream.getErrorCode$okhttp() != null) {
/* 30 */                                errorException = http2Stream.getErrorException();
/* 34 */                                if (errorException == null) {
/* 38 */                                    ErrorCode errorCode$okhttp = http2Stream.getErrorCode$okhttp();
/* 42 */                                    errorCode$okhttp.getClass();
/* 45 */                                    errorException = new StreamResetException(errorCode$okhttp);
                                        }
                                    } else {
/* 52 */                                errorException = null;
                                    }
/* 57 */                            if (getClosed()) {
/* 211 */                               throw new IOException("stream closed");
                                    }
/* 71 */                            z = false;
/* 72 */                            if (getReadBuffer().size() > j3) {
/* 92 */                                j2 = getReadBuffer().read(sink, Math.min(byteCount, getReadBuffer().size()));
/* 101 */                               http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + j2);
/* 112 */                               long readBytesTotal = http2Stream.getReadBytesTotal() - http2Stream.getReadBytesAcknowledged();
/* 114 */                               if (errorException == null) {
/* 130 */                                   j = j3;
/* 135 */                                   if (readBytesTotal >= http2Stream.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
/* 145 */                                       http2Stream.getConnection().writeWindowUpdateLater$okhttp(http2Stream.getId(), readBytesTotal);
/* 152 */                                       http2Stream.setReadBytesAcknowledged$okhttp(http2Stream.getReadBytesTotal());
                                            }
                                        } else {
/* 156 */                                   j = j3;
                                        }
                                    } else {
/* 161 */                               j = j3;
/* 167 */                               if (!getFinished() && errorException == null) {
/* 171 */                                   http2Stream.waitForIo$okhttp();
/* 174 */                                   z = true;
                                        }
/* 175 */                               j2 = -1;
                                    }
/* 180 */                           http2Stream.getReadTimeout().exitAndThrowIfTimedOut();
                                } catch (Throwable th) {
/* 216 */                           http2Stream.getReadTimeout().exitAndThrowIfTimedOut();
/* 219 */                           throw th;
                                }
/* 221 */                       throw th;
                            }
/* 184 */                   if (!z) {
/* 192 */                       if (j2 != -1) {
/* 194 */                           updateConnectionFlowControl(j2);
/* 197 */                           return j2;
                                }
/* 198 */                       if (errorException == null) {
/* 69 */                            return -1L;
                                }
/* 201 */                       throw errorException;
                            }
/* 186 */                   j3 = j;
                        }
                    }

                    public final void receive$okhttp(BufferedSource source, long byteCount) throws IOException {
                        boolean finished;
                        boolean z;
                        long size;
/* 1 */                 source.getClass();
/* 4 */                 Http2Stream http2Stream = this.this$0;
/* 8 */                 if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
/* 27 */                    s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
/* 30 */                    return;
                        }
/* 35 */                while (byteCount > 0) {
                            synchronized (this.this$0) {
/* 40 */                        finished = getFinished();
/* 63 */                        z = getReadBuffer().size() + byteCount > this.maxByteCount;
                            }
/* 65 */                    if (z) {
/* 67 */                        source.skip(byteCount);
/* 74 */                        this.this$0.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
/* 77 */                        return;
                            }
/* 78 */                    if (finished) {
/* 80 */                        source.skip(byteCount);
/* 83 */                        return;
                            }
/* 86 */                    long j = source.read(this.receiveBuffer, byteCount);
/* 94 */                    if (j == -1) {
/* 166 */                       C1951n4.m6854b();
/* 169 */                       return;
                            }
/* 96 */                    byteCount -= j;
/* 97 */                    Http2Stream http2Stream2 = this.this$0;
                            synchronized (http2Stream2) {
                                try {
/* 104 */                           if (getClosed()) {
/* 110 */                               size = getReceiveBuffer().size();
/* 118 */                               getReceiveBuffer().clear();
                                    } else {
/* 134 */                               boolean z2 = getReadBuffer().size() == 0;
/* 145 */                               getReadBuffer().writeAll(getReceiveBuffer());
/* 148 */                               if (z2) {
/* 150 */                                   http2Stream2.notifyAll();
                                        }
/* 153 */                               size = 0;
                                    }
                                } catch (Throwable th) {
/* 165 */                           throw th;
                                }
                            }
/* 157 */                   if (size > 0) {
/* 159 */                       updateConnectionFlowControl(size);
                            }
                        }
                    }

                    public final void setClosed$okhttp(boolean z) {
/* 1 */                 this.closed = z;
                    }

                    public final void setFinished$okhttp(boolean z) {
/* 1 */                 this.finished = z;
                    }

                    public final void setTrailers(Headers headers) {
/* 1 */                 this.trailers = headers;
                    }

                    @Override // okio.Source
                    /* JADX INFO: renamed from: timeout */
                    public Timeout getTimeout() {
/* 3 */                 return this.this$0.getReadTimeout();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\t"}, m6176d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokio/AsyncTimeout;", "(Lokhttp3/internal/http2/Http2Stream;)V", "exitAndThrowIfTimedOut", HttpUrl.FRAGMENT_ENCODE_SET, "newTimeoutException", "Ljava/io/IOException;", "cause", "timedOut", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class StreamTimeout extends AsyncTimeout {
                    final /* synthetic */ Http2Stream this$0;

                    public StreamTimeout(Http2Stream http2Stream) {
/* 1 */                 http2Stream.getClass();
/* 4 */                 this.this$0 = http2Stream;
                    }

                    public final void exitAndThrowIfTimedOut() throws IOException {
/* 5 */                 if (exit()) {
/* 13 */                    throw newTimeoutException(null);
                        }
                    }

                    @Override // okio.AsyncTimeout
                    public IOException newTimeoutException(IOException cause) {
/* 5 */                 SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
/* 8 */                 if (cause != null) {
/* 10 */                    socketTimeoutException.initCause(cause);
                        }
/* 13 */                return socketTimeoutException;
                    }

                    @Override // okio.AsyncTimeout
                    public void timedOut() {
/* 5 */                 this.this$0.closeLater(ErrorCode.CANCEL);
/* 14 */                this.this$0.getConnection().sendDegradedPingLater$okhttp();
                    }
                }

                public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
/* 1 */             http2Connection.getClass();
/* 7 */             this.id = i;
/* 9 */             this.connection = http2Connection;
/* 20 */            this.writeBytesMaximum = http2Connection.getPeerSettings().getInitialWindowSize();
/* 24 */            ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
/* 27 */            this.headersQueue = arrayDeque;
/* 43 */            this.source = new FramingSource(this, http2Connection.getOkHttpSettings().getInitialWindowSize(), z2);
/* 50 */            this.sink = new FramingSink(this, z);
/* 57 */            this.readTimeout = new StreamTimeout(this);
/* 64 */            this.writeTimeout = new StreamTimeout(this);
/* 67 */            if (headers == null) {
/* 89 */                if (isLocallyInitiated()) {
/* 91 */                    return;
                        }
/* 94 */                f42.m3656l("remotely-initiated streams should have headers");
/* 97 */                throw null;
                    }
/* 73 */            if (isLocallyInitiated()) {
/* 81 */                f42.m3656l("locally-initiated streams shouldn't have headers yet");
/* 84 */                throw null;
                    }
/* 75 */            arrayDeque.add(headers);
                }

                private final boolean closeInternal(ErrorCode errorCode, IOException errorException) {
/* 3 */             if (Util.assertionsEnabled && Thread.holdsLock(this)) {
/* 22 */                s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
/* 25 */                return false;
                    }
                    synchronized (this) {
/* 33 */                if (getErrorCode$okhttp() != null) {
/* 32 */                    return false;
                        }
/* 45 */                if (getSource().getFinished() && getSink().getFinished()) {
/* 32 */                    return false;
                        }
/* 61 */                setErrorCode$okhttp(errorCode);
/* 64 */                setErrorException$okhttp(errorException);
/* 67 */                notifyAll();
/* 75 */                this.connection.removeStream$okhttp(this.id);
/* 78 */                return true;
                    }
                }

                public final void addBytesToWriteWindow(long delta) {
/* 4 */             this.writeBytesMaximum += delta;
/* 10 */            if (delta > 0) {
/* 12 */                notifyAll();
                    }
                }

                public final void cancelStreamIfNecessary$okhttp() throws IOException {
                    boolean z;
                    boolean zIsOpen;
/* 3 */             if (Util.assertionsEnabled && Thread.holdsLock(this)) {
/* 22 */                s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
/* 25 */                return;
                    }
                    synchronized (this) {
                        try {
/* 72 */                    z = !getSource().getFinished() && getSource().getClosed() && (getSink().getFinished() || getSink().getClosed());
/* 73 */                    zIsOpen = isOpen();
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
/* 78 */            if (z) {
/* 83 */                close(ErrorCode.CANCEL, null);
                    } else {
/* 87 */                if (zIsOpen) {
/* 96 */                    return;
                        }
/* 93 */                this.connection.removeStream$okhttp(this.id);
                    }
                }

                public final void checkOutNotClosed$okhttp() throws IOException {
/* 7 */             if (this.sink.getClosed()) {
/* 43 */                ds0.m3195l("stream closed");
/* 46 */                return;
                    }
/* 15 */            if (this.sink.getFinished()) {
/* 37 */                ds0.m3195l("stream finished");
/* 40 */                return;
                    }
/* 17 */            ErrorCode errorCode = this.errorCode;
/* 19 */            if (errorCode != null) {
/* 21 */                IOException iOException = this.errorException;
/* 23 */                if (iOException != null) {
/* 33 */                    throw iOException;
                        }
/* 27 */                errorCode.getClass();
/* 33 */                throw new StreamResetException(errorCode);
                    }
                }

                public final void close(ErrorCode rstStatusCode, IOException errorException) throws IOException {
/* 1 */             rstStatusCode.getClass();
/* 8 */             if (closeInternal(rstStatusCode, errorException)) {
/* 15 */                this.connection.writeSynReset$okhttp(this.id, rstStatusCode);
                    }
                }

                public final void closeLater(ErrorCode errorCode) {
/* 1 */             errorCode.getClass();
/* 9 */             if (closeInternal(errorCode, null)) {
/* 16 */                this.connection.writeSynResetLater$okhttp(this.id, errorCode);
                    }
                }

                public final void enqueueTrailers(Headers trailers) {
/* 1 */             trailers.getClass();
                    synchronized (this) {
/* 13 */                if (getSink().getFinished()) {
/* 47 */                    throw new IllegalStateException("already finished");
                        }
/* 19 */                if (trailers.size() == 0) {
/* 39 */                    throw new IllegalArgumentException("trailers.size() == 0");
                        }
/* 25 */                getSink().setTrailers(trailers);
                    }
                }

                public final Http2Connection getConnection() {
/* 1 */             return this.connection;
                }

                public final synchronized ErrorCode getErrorCode$okhttp() {
/* 2 */             return this.errorCode;
                }

                /* JADX INFO: renamed from: getErrorException$okhttp, reason: from getter */
                public final IOException getErrorException() {
/* 1 */             return this.errorException;
                }

                public final int getId() {
/* 1 */             return this.id;
                }

                public final long getReadBytesAcknowledged() {
/* 1 */             return this.readBytesAcknowledged;
                }

                public final long getReadBytesTotal() {
/* 1 */             return this.readBytesTotal;
                }

                /* JADX INFO: renamed from: getReadTimeout$okhttp, reason: from getter */
                public final StreamTimeout getReadTimeout() {
/* 1 */             return this.readTimeout;
                }

                public final Sink getSink() {
                    synchronized (this) {
/* 4 */                 if (!this.hasResponseHeaders && !isLocallyInitiated()) {
/* 20 */                    throw new IllegalStateException("reply before requesting the sink");
                        }
                    }
/* 24 */            return this.sink;
                }

                /* JADX INFO: renamed from: getSink$okhttp, reason: from getter */
                public final FramingSink getSink() {
/* 1 */             return this.sink;
                }

                public final Source getSource() {
/* 1 */             return this.source;
                }

                /* JADX INFO: renamed from: getSource$okhttp, reason: from getter */
                public final FramingSource getSource() {
/* 1 */             return this.source;
                }

                public final long getWriteBytesMaximum() {
/* 1 */             return this.writeBytesMaximum;
                }

                public final long getWriteBytesTotal() {
/* 1 */             return this.writeBytesTotal;
                }

                /* JADX INFO: renamed from: getWriteTimeout$okhttp, reason: from getter */
                public final StreamTimeout getWriteTimeout() {
/* 1 */             return this.writeTimeout;
                }

                public final boolean isLocallyInitiated() {
                    return this.connection.getClient() == ((this.id & 1) == 1);
                }

                public final synchronized boolean isOpen() {
                    try {
/* 5 */                 if (this.errorCode != null) {
/* 4 */                     return false;
                        }
/* 15 */                if (this.source.getFinished() || this.source.getClosed()) {
/* 34 */                    if ((this.sink.getFinished() || this.sink.getClosed()) && this.hasResponseHeaders) {
/* 4 */                         return false;
                            }
                        }
/* 51 */                return true;
                    } catch (Throwable th) {
/* 54 */                throw th;
                    }
                }

                public final Timeout readTimeout() {
/* 1 */             return this.readTimeout;
                }

                public final void receiveData(BufferedSource source, int length) throws IOException {
/* 1 */             source.getClass();
/* 6 */             if (Util.assertionsEnabled && Thread.holdsLock(this)) {
/* 25 */                s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
                    } else {
/* 32 */                this.source.receive$okhttp(source, length);
                    }
                }

                public final void receiveHeaders(Headers headers, boolean inFinished) {
                    boolean zIsOpen;
/* 1 */             headers.getClass();
/* 6 */             if (Util.assertionsEnabled && Thread.holdsLock(this)) {
/* 25 */                s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
/* 28 */                return;
                    }
                    synchronized (this) {
                        try {
/* 33 */                    if (this.hasResponseHeaders && inFinished) {
/* 42 */                        getSource().setTrailers(headers);
                            } else {
/* 48 */                        this.hasResponseHeaders = true;
/* 52 */                        this.headersQueue.add(headers);
                            }
/* 55 */                    if (inFinished) {
/* 61 */                        getSource().setFinished$okhttp(true);
                            }
/* 64 */                    zIsOpen = isOpen();
/* 68 */                    notifyAll();
                        } catch (Throwable th) {
/* 83 */                    throw th;
                        }
                    }
/* 72 */            if (zIsOpen) {
/* 81 */                return;
                    }
/* 78 */            this.connection.removeStream$okhttp(this.id);
                }

                public final synchronized void receiveRstStream(ErrorCode errorCode) {
/* 2 */             errorCode.getClass();
/* 7 */             if (this.errorCode == null) {
/* 9 */                 this.errorCode = errorCode;
/* 11 */                notifyAll();
                    }
                }

                public final void setErrorCode$okhttp(ErrorCode errorCode) {
/* 1 */             this.errorCode = errorCode;
                }

                public final void setErrorException$okhttp(IOException iOException) {
/* 1 */             this.errorException = iOException;
                }

                public final void setReadBytesAcknowledged$okhttp(long j) {
/* 1 */             this.readBytesAcknowledged = j;
                }

                public final void setReadBytesTotal$okhttp(long j) {
/* 1 */             this.readBytesTotal = j;
                }

                public final void setWriteBytesMaximum$okhttp(long j) {
/* 1 */             this.writeBytesMaximum = j;
                }

                public final void setWriteBytesTotal$okhttp(long j) {
/* 1 */             this.writeBytesTotal = j;
                }

                public final synchronized Headers takeHeaders() throws IOException {
                    Headers headersRemoveFirst;
/* 4 */             this.readTimeout.enter();
/* 13 */            while (this.headersQueue.isEmpty() && this.errorCode == null) {
                        try {
/* 19 */                    waitForIo$okhttp();
                        } catch (Throwable th) {
/* 70 */                    this.readTimeout.exitAndThrowIfTimedOut();
/* 73 */                    throw th;
                        }
                    }
/* 27 */            this.readTimeout.exitAndThrowIfTimedOut();
/* 36 */            if (this.headersQueue.isEmpty()) {
/* 53 */                IOException iOException = this.errorException;
/* 55 */                if (iOException != null) {
/* 67 */                    throw iOException;
                        }
/* 59 */                ErrorCode errorCode = this.errorCode;
/* 61 */                errorCode.getClass();
/* 67 */                throw new StreamResetException(errorCode);
                    }
/* 40 */            headersRemoveFirst = this.headersQueue.removeFirst();
/* 44 */            headersRemoveFirst.getClass();
/* 47 */            return headersRemoveFirst;
                }

                public final synchronized Headers trailers() throws IOException {
                    Headers trailers;
/* 8 */             if (!this.source.getFinished() || !this.source.getReceiveBuffer().exhausted() || !this.source.getReadBuffer().exhausted()) {
/* 49 */                ErrorCode errorCode = this.errorCode;
/* 51 */                if (errorCode == null) {
/* 73 */                    throw new IllegalStateException("too early; can't read the trailers yet");
                        }
/* 53 */                IOException iOException = this.errorException;
/* 55 */                if (iOException != null) {
/* 65 */                    throw iOException;
                        }
/* 59 */                errorCode.getClass();
/* 65 */                throw new StreamResetException(errorCode);
                    }
/* 36 */            trailers = this.source.getTrailers();
/* 40 */            if (trailers == null) {
/* 42 */                trailers = Util.EMPTY_HEADERS;
                    }
/* 48 */            return trailers;
                }

                public final void waitForIo$okhttp() throws InterruptedIOException {
                    try {
/* 1 */                 wait();
                    } catch (InterruptedException unused) {
/* 9 */                 Thread.currentThread().interrupt();
/* 17 */                throw new InterruptedIOException();
                    }
                }

                public final void writeHeaders(List<Header> responseHeaders, boolean outFinished, boolean flushHeaders) throws IOException {
                    boolean z;
/* 1 */             responseHeaders.getClass();
/* 6 */             if (Util.assertionsEnabled && Thread.holdsLock(this)) {
/* 25 */                s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
/* 28 */                return;
                    }
                    synchronized (this) {
/* 31 */                this.hasResponseHeaders = true;
/* 33 */                if (outFinished) {
/* 39 */                    getSink().setFinished(true);
                        }
                    }
/* 46 */            if (!flushHeaders) {
                        synchronized (this.connection) {
/* 69 */                    z = getConnection().getWriteBytesTotal() >= getConnection().getWriteBytesMaximum();
                        }
/* 74 */                flushHeaders = z;
                    }
/* 83 */            this.connection.writeHeaders$okhttp(this.id, outFinished, responseHeaders);
/* 86 */            if (flushHeaders) {
/* 90 */                this.connection.flush();
                    }
                }

                public final Timeout writeTimeout() {
/* 1 */             return this.writeTimeout;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m6176d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokio/Sink;", "finished", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokhttp3/internal/http2/Http2Stream;Z)V", "closed", "getClosed", "()Z", "setClosed", "(Z)V", "getFinished", "setFinished", "sendBuffer", "Lokio/Buffer;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "close", HttpUrl.FRAGMENT_ENCODE_SET, "emitFrame", "outFinishedOnLastFrame", "flush", "timeout", "Lokio/Timeout;", "write", FirebaseAnalytics.Param.SOURCE, "byteCount", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 17 */        public final class FramingSink implements Sink {
                    private boolean closed;
                    private boolean finished;
                    private final Buffer sendBuffer;
                    private Headers trailers;

                    public FramingSink(Http2Stream http2Stream, boolean z) {
/* 1 */                 http2Stream.getClass();
/* 4 */                 Http2Stream.this = http2Stream;
/* 9 */                 this.finished = z;
/* 16 */                this.sendBuffer = new Buffer();
                    }

                    private final void emitFrame(boolean outFinishedOnLastFrame) throws IOException {
                        long jMin;
                        boolean z;
/* 1 */                 Http2Stream http2Stream = Http2Stream.this;
                        synchronized (http2Stream) {
/* 8 */                     http2Stream.getWriteTimeout().enter();
/* 21 */                    while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !getFinished() && !getClosed() && http2Stream.getErrorCode$okhttp() == null) {
                                try {
/* 41 */                            http2Stream.waitForIo$okhttp();
                                } catch (Throwable th) {
/* 158 */                           http2Stream.getWriteTimeout().exitAndThrowIfTimedOut();
/* 161 */                           throw th;
                                }
                            }
/* 52 */                    http2Stream.getWriteTimeout().exitAndThrowIfTimedOut();
/* 55 */                    http2Stream.checkOutNotClosed$okhttp();
/* 73 */                    jMin = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.size());
/* 82 */                    http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + jMin);
/* 103 */                   z = outFinishedOnLastFrame && jMin == this.sendBuffer.size();
                        }
/* 112 */               Http2Stream.this.getWriteTimeout().enter();
                        try {
/* 129 */                   Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z, this.sendBuffer, jMin);
                        } finally {
/* 150 */                   Http2Stream.this.getWriteTimeout().exitAndThrowIfTimedOut();
                        }
                    }

                    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
/* 1 */                 Http2Stream http2Stream = Http2Stream.this;
/* 5 */                 if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
/* 24 */                    s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
/* 27 */                    return;
                        }
/* 28 */                Http2Stream http2Stream2 = Http2Stream.this;
                        synchronized (http2Stream2) {
/* 35 */                    if (getClosed()) {
/* 38 */                        return;
                            }
/* 49 */                    boolean z = http2Stream2.getErrorCode$okhttp() == null;
/* 59 */                    if (!Http2Stream.this.getSink().finished) {
/* 75 */                        boolean z2 = this.sendBuffer.size() > 0;
/* 78 */                        if (this.trailers != null) {
/* 88 */                            while (this.sendBuffer.size() > 0) {
/* 90 */                                emitFrame(false);
                                    }
/* 96 */                            Http2Connection connection = Http2Stream.this.getConnection();
/* 102 */                           int id = Http2Stream.this.getId();
/* 106 */                           Headers headers = this.trailers;
/* 108 */                           headers.getClass();
/* 115 */                           connection.writeHeaders$okhttp(id, z, Util.toHeaderList(headers));
                                } else if (z2) {
/* 129 */                           while (this.sendBuffer.size() > 0) {
/* 131 */                               emitFrame(true);
                                    }
                                } else if (z) {
/* 153 */                           Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                                }
                            }
                            synchronized (Http2Stream.this) {
/* 159 */                       setClosed(true);
                            }
/* 169 */                   Http2Stream.this.getConnection().flush();
/* 174 */                   Http2Stream.this.cancelStreamIfNecessary$okhttp();
                        }
                    }

                    @Override // okio.Sink, java.io.Flushable
                    public void flush() throws IOException {
/* 1 */                 Http2Stream http2Stream = Http2Stream.this;
/* 5 */                 if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
/* 24 */                    s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
/* 27 */                    return;
                        }
/* 28 */                Http2Stream http2Stream2 = Http2Stream.this;
                        synchronized (http2Stream2) {
/* 31 */                    http2Stream2.checkOutNotClosed$okhttp();
                        }
/* 45 */                while (this.sendBuffer.size() > 0) {
/* 48 */                    emitFrame(false);
/* 57 */                    Http2Stream.this.getConnection().flush();
                        }
                    }

                    public final boolean getClosed() {
/* 1 */                 return this.closed;
                    }

                    public final boolean getFinished() {
/* 1 */                 return this.finished;
                    }

                    public final Headers getTrailers() {
/* 1 */                 return this.trailers;
                    }

                    public final void setClosed(boolean z) {
/* 1 */                 this.closed = z;
                    }

                    public final void setFinished(boolean z) {
/* 1 */                 this.finished = z;
                    }

                    public final void setTrailers(Headers headers) {
/* 1 */                 this.trailers = headers;
                    }

                    @Override // okio.Sink
                    /* JADX INFO: renamed from: timeout */
                    public Timeout getTimeout() {
/* 3 */                 return Http2Stream.this.getWriteTimeout();
                    }

                    @Override // okio.Sink
                    public void write(Buffer source, long byteCount) throws IOException {
/* 1 */                 source.getClass();
/* 4 */                 Http2Stream http2Stream = Http2Stream.this;
/* 8 */                 if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
/* 27 */                    s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
/* 30 */                    return;
                        }
/* 33 */                this.sendBuffer.write(source, byteCount);
/* 46 */                while (this.sendBuffer.size() >= 16384) {
/* 49 */                    emitFrame(false);
                        }
                    }

/* 18 */            public /* synthetic */ FramingSink(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(Http2Stream.this, (i & 1) != 0 ? false : z);
                    }
                }
            }
