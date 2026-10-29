            package okhttp3.internal.connection;

            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.net.ProtocolException;
            import java.net.SocketException;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.EventListener;
            import okhttp3.Headers;
            import okhttp3.HttpUrl;
            import okhttp3.Request;
            import okhttp3.RequestBody;
            import okhttp3.Response;
            import okhttp3.ResponseBody;
            import okhttp3.internal.http.ExchangeCodec;
            import okhttp3.internal.http.RealResponseBody;
            import okhttp3.internal.p013ws.RealWebSocket;
            import okio.Buffer;
            import okio.ForwardingSink;
            import okio.ForwardingSource;
            import okio.Okio;
            import okio.Sink;
            import okio.Source;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002ABB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ7\u0010\u001c\u001a\u0002H\u001d\"\n\b\u0000\u0010\u001d*\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u0002H\u001d¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020&J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0016J\u0006\u0010,\u001a\u00020&J\u0006\u0010-\u001a\u00020&J\u0006\u0010.\u001a\u00020&J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u00020&J\u0006\u00102\u001a\u00020&J\u000e\u00103\u001a\u0002042\u0006\u00105\u001a\u000206J\u0010\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020\u0016J\u000e\u0010:\u001a\u00020&2\u0006\u00105\u001a\u000206J\u0006\u0010;\u001a\u00020&J\u0010\u0010<\u001a\u00020&2\u0006\u0010#\u001a\u00020\u001eH\u0002J\u0006\u0010=\u001a\u00020>J\u0006\u0010?\u001a\u00020&J\u000e\u0010@\u001a\u00020&2\u0006\u0010)\u001a\u00020*R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018¨\u0006C"}, m6176d2 = {"Lokhttp3/internal/connection/Exchange;", HttpUrl.FRAGMENT_ENCODE_SET, NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "eventListener", "Lokhttp3/EventListener;", "finder", "Lokhttp3/internal/connection/ExchangeFinder;", "codec", "Lokhttp3/internal/http/ExchangeCodec;", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "connection", "Lokhttp3/internal/connection/RealConnection;", "getConnection$okhttp", "()Lokhttp3/internal/connection/RealConnection;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "getFinder$okhttp", "()Lokhttp3/internal/connection/ExchangeFinder;", "isCoalescedConnection", HttpUrl.FRAGMENT_ENCODE_SET, "isCoalescedConnection$okhttp", "()Z", "<set-?>", "isDuplex", "isDuplex$okhttp", "bodyComplete", "E", "Ljava/io/IOException;", "bytesRead", HttpUrl.FRAGMENT_ENCODE_SET, "responseDone", "requestDone", "e", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "cancel", HttpUrl.FRAGMENT_ENCODE_SET, "createRequestBody", "Lokio/Sink;", "request", "Lokhttp3/Request;", "duplex", "detachWithViolence", "finishRequest", "flushRequest", "newWebSocketStreams", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "noNewExchangesOnConnection", "noRequestBody", "openResponseBody", "Lokhttp3/ResponseBody;", "response", "Lokhttp3/Response;", "readResponseHeaders", "Lokhttp3/Response$Builder;", "expectContinue", "responseHeadersEnd", "responseHeadersStart", "trackFailure", "trailers", "Lokhttp3/Headers;", "webSocketUpgradeFailed", "writeRequestHeaders", "RequestBodySink", "ResponseBodySource", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class Exchange {
                private final RealCall call;
                private final ExchangeCodec codec;
                private final RealConnection connection;
                private final EventListener eventListener;
                private final ExchangeFinder finder;
                private boolean isDuplex;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J!\u0010\r\u001a\u0002H\u000e\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u0002H\u000eH\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m6176d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "Lokio/ForwardingSink;", "delegate", "Lokio/Sink;", "contentLength", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokhttp3/internal/connection/Exchange;Lokio/Sink;J)V", "bytesReceived", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "completed", "close", HttpUrl.FRAGMENT_ENCODE_SET, "complete", "E", "Ljava/io/IOException;", "e", "(Ljava/io/IOException;)Ljava/io/IOException;", "flush", "write", FirebaseAnalytics.Param.SOURCE, "Lokio/Buffer;", "byteCount", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class RequestBodySink extends ForwardingSink {
                    private long bytesReceived;
                    private boolean closed;
                    private boolean completed;
                    private final long contentLength;
                    final /* synthetic */ Exchange this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public RequestBodySink(Exchange exchange, Sink sink, long j) {
/* 9 */                 super(sink);
/* 1 */                 exchange.getClass();
/* 4 */                 sink.getClass();
/* 7 */                 this.this$0 = exchange;
/* 12 */                this.contentLength = j;
                    }

                    private final <E extends IOException> E complete(E e) {
/* 3 */                 if (this.completed) {
/* 5 */                     return e;
                        }
/* 7 */                 this.completed = true;
/* 16 */                return (E) this.this$0.bodyComplete(this.bytesReceived, false, true, e);
                    }

                    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
/* 3 */                 if (this.closed) {
/* 5 */                     return;
                        }
/* 7 */                 this.closed = true;
/* 9 */                 long j = this.contentLength;
/* 15 */                if (j != -1 && this.bytesReceived != j) {
/* 31 */                    throw new ProtocolException("unexpected end of stream");
                        }
                        try {
/* 32 */                    super.close();
/* 36 */                    complete(null);
                        } catch (IOException e) {
/* 45 */                    throw complete(e);
                        }
                    }

                    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
                    public void flush() throws IOException {
                        try {
/* 1 */                     super.flush();
                        } catch (IOException e) {
/* 10 */                    throw complete(e);
                        }
                    }

                    @Override // okio.ForwardingSink, okio.Sink
                    public void write(Buffer source, long byteCount) throws IOException {
/* 1 */                 source.getClass();
/* 6 */                 if (this.closed) {
/* 74 */                    f42.m3656l("closed");
/* 77 */                    return;
                        }
/* 8 */                 long j = this.contentLength;
/* 14 */                if (j == -1 || this.bytesReceived + byteCount <= j) {
                            try {
/* 57 */                        super.write(source, byteCount);
/* 63 */                        this.bytesReceived += byteCount;
/* 65 */                        return;
                            } catch (IOException e) {
/* 71 */                        throw complete(e);
                            }
                        }
/* 56 */                throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + byteCount));
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\u001f\u0010\u000e\u001a\u0002H\u000f\"\n\b\u0000\u0010\u000f*\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u0002H\u000f¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m6176d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lokio/ForwardingSource;", "delegate", "Lokio/Source;", "contentLength", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokhttp3/internal/connection/Exchange;Lokio/Source;J)V", "bytesReceived", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "completed", "invokeStartEvent", "close", HttpUrl.FRAGMENT_ENCODE_SET, "complete", "E", "Ljava/io/IOException;", "e", "(Ljava/io/IOException;)Ljava/io/IOException;", "read", "sink", "Lokio/Buffer;", "byteCount", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class ResponseBodySource extends ForwardingSource {
                    private long bytesReceived;
                    private boolean closed;
                    private boolean completed;
                    private final long contentLength;
                    private boolean invokeStartEvent;
                    final /* synthetic */ Exchange this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public ResponseBodySource(Exchange exchange, Source source, long j) {
/* 9 */                 super(source);
/* 1 */                 exchange.getClass();
/* 4 */                 source.getClass();
/* 7 */                 this.this$0 = exchange;
/* 12 */                this.contentLength = j;
/* 15 */                this.invokeStartEvent = true;
/* 21 */                if (j == 0) {
/* 24 */                    complete(null);
                        }
                    }

                    @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
/* 3 */                 if (this.closed) {
/* 5 */                     return;
                        }
/* 7 */                 this.closed = true;
                        try {
/* 9 */                     super.close();
/* 13 */                    complete(null);
                        } catch (IOException e) {
/* 22 */                    throw complete(e);
                        }
                    }

                    public final <E extends IOException> E complete(E e) {
/* 3 */                 if (this.completed) {
/* 5 */                     return e;
                        }
/* 7 */                 this.completed = true;
/* 9 */                 if (e == null && this.invokeStartEvent) {
/* 16 */                    this.invokeStartEvent = false;
/* 30 */                    this.this$0.getEventListener().responseBodyStart(this.this$0.getCall());
                        }
/* 40 */                return (E) this.this$0.bodyComplete(this.bytesReceived, true, false, e);
                    }

                    @Override // okio.ForwardingSource, okio.Source
                    public long read(Buffer sink, long byteCount) throws IOException {
/* 3 */                 sink.getClass();
/* 8 */                 if (this.closed) {
/* 113 */                   f42.m3656l("closed");
/* 116 */                   return 0L;
                        }
                        try {
/* 14 */                    long j = delegate().read(sink, byteCount);
/* 20 */                    if (this.invokeStartEvent) {
/* 23 */                        this.invokeStartEvent = false;
/* 37 */                        this.this$0.getEventListener().responseBodyStart(this.this$0.getCall());
                            }
/* 48 */                    if (j == -1) {
/* 50 */                        complete(null);
/* 43 */                        return -1L;
                            }
/* 56 */                    long j2 = this.bytesReceived + j;
/* 57 */                    long j3 = this.contentLength;
/* 61 */                    if (j3 != -1 && j2 > j3) {
/* 95 */                        throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j2);
                            }
/* 96 */                    this.bytesReceived = j2;
/* 100 */                   if (j2 == j3) {
/* 102 */                       complete(null);
                            }
/* 105 */                   return j;
                        } catch (IOException e) {
/* 110 */                   throw complete(e);
                        }
                    }
                }

                public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
/* 1 */             realCall.getClass();
/* 4 */             eventListener.getClass();
/* 7 */             exchangeFinder.getClass();
/* 10 */            exchangeCodec.getClass();
/* 16 */            this.call = realCall;
/* 18 */            this.eventListener = eventListener;
/* 20 */            this.finder = exchangeFinder;
/* 22 */            this.codec = exchangeCodec;
/* 28 */            this.connection = exchangeCodec.getConnection();
                }

                private final void trackFailure(IOException e) {
/* 3 */             this.finder.trackFailure(e);
/* 14 */            this.codec.getConnection().trackFailure$okhttp(this.call, e);
                }

                public final <E extends IOException> E bodyComplete(long bytesRead, boolean responseDone, boolean requestDone, E e) {
/* 1 */             if (e != null) {
/* 3 */                 trackFailure(e);
                    }
/* 6 */             if (requestDone) {
/* 8 */                 EventListener eventListener = this.eventListener;
/* 10 */                if (e != null) {
/* 14 */                    eventListener.requestFailed(this.call, e);
                        } else {
/* 20 */                    eventListener.requestBodyEnd(this.call, bytesRead);
                        }
                    }
/* 23 */            if (responseDone) {
/* 25 */                EventListener eventListener2 = this.eventListener;
/* 27 */                if (e != null) {
/* 31 */                    eventListener2.responseFailed(this.call, e);
                        } else {
/* 37 */                    eventListener2.responseBodyEnd(this.call, bytesRead);
                        }
                    }
/* 42 */            return (E) this.call.messageDone$okhttp(this, requestDone, responseDone, e);
                }

                public final void cancel() {
/* 3 */             this.codec.cancel();
                }

                public final Sink createRequestBody(Request request, boolean duplex) throws IOException {
/* 1 */             request.getClass();
/* 4 */             this.isDuplex = duplex;
/* 6 */             RequestBody requestBodyBody = request.body();
/* 10 */            requestBodyBody.getClass();
/* 13 */            long jContentLength = requestBodyBody.contentLength();
/* 21 */            this.eventListener.requestBodyStart(this.call);
/* 32 */            return new RequestBodySink(this, this.codec.createRequestBody(request, jContentLength), jContentLength);
                }

                public final void detachWithViolence() {
/* 3 */             this.codec.cancel();
/* 10 */            this.call.messageDone$okhttp(this, true, true, null);
                }

                public final void finishRequest() throws IOException {
                    try {
/* 3 */                 this.codec.finishRequest();
                    } catch (IOException e) {
/* 12 */                this.eventListener.requestFailed(this.call, e);
/* 15 */                trackFailure(e);
/* 18 */                throw e;
                    }
                }

                public final void flushRequest() throws IOException {
                    try {
/* 3 */                 this.codec.flushRequest();
                    } catch (IOException e) {
/* 12 */                this.eventListener.requestFailed(this.call, e);
/* 15 */                trackFailure(e);
/* 18 */                throw e;
                    }
                }

                /* JADX INFO: renamed from: getCall$okhttp, reason: from getter */
                public final RealCall getCall() {
/* 1 */             return this.call;
                }

                /* JADX INFO: renamed from: getConnection$okhttp, reason: from getter */
                public final RealConnection getConnection() {
/* 1 */             return this.connection;
                }

                /* JADX INFO: renamed from: getEventListener$okhttp, reason: from getter */
                public final EventListener getEventListener() {
/* 1 */             return this.eventListener;
                }

                /* JADX INFO: renamed from: getFinder$okhttp, reason: from getter */
                public final ExchangeFinder getFinder() {
/* 1 */             return this.finder;
                }

                public final boolean isCoalescedConnection$okhttp() {
/* 37 */            return !Intrinsics.m6216a(this.finder.getAddress().url().host(), this.connection.getRoute().address().url().host());
                }

                /* JADX INFO: renamed from: isDuplex$okhttp, reason: from getter */
                public final boolean getIsDuplex() {
/* 1 */             return this.isDuplex;
                }

                public final RealWebSocket.Streams newWebSocketStreams() throws SocketException {
/* 3 */             this.call.timeoutEarlyExit();
/* 12 */            return this.codec.getConnection().newWebSocketStreams$okhttp(this);
                }

                public final void noNewExchangesOnConnection() {
/* 7 */             this.codec.getConnection().noNewExchanges$okhttp();
                }

                public final void noRequestBody() {
/* 6 */             this.call.messageDone$okhttp(this, true, false, null);
                }

                public final ResponseBody openResponseBody(Response response) throws IOException {
/* 1 */             response.getClass();
                    try {
/* 8 */                 String strHeader$default = Response.header$default(response, "Content-Type", null, 2, null);
/* 14 */                long jReportedContentLength = this.codec.reportedContentLength(response);
/* 35 */                return new RealResponseBody(strHeader$default, jReportedContentLength, Okio.buffer(new ResponseBodySource(this, this.codec.openResponseBodySource(response), jReportedContentLength)));
                    } catch (IOException e) {
/* 44 */                this.eventListener.responseFailed(this.call, e);
/* 47 */                trackFailure(e);
/* 50 */                throw e;
                    }
                }

                public final Response.Builder readResponseHeaders(boolean expectContinue) throws IOException {
                    try {
/* 3 */                 Response.Builder responseHeaders = this.codec.readResponseHeaders(expectContinue);
/* 7 */                 if (responseHeaders == null) {
/* 9 */                     return responseHeaders;
                        }
/* 10 */                responseHeaders.initExchange$okhttp(this);
/* 13 */                return responseHeaders;
                    } catch (IOException e) {
/* 19 */                this.eventListener.responseFailed(this.call, e);
/* 22 */                trackFailure(e);
/* 25 */                throw e;
                    }
                }

                public final void responseHeadersEnd(Response response) {
/* 1 */             response.getClass();
/* 8 */             this.eventListener.responseHeadersEnd(this.call, response);
                }

                public final void responseHeadersStart() {
/* 5 */             this.eventListener.responseHeadersStart(this.call);
                }

                public final Headers trailers() throws IOException {
/* 3 */             return this.codec.trailers();
                }

                public final void webSocketUpgradeFailed() {
/* 7 */             bodyComplete(-1L, true, true, null);
                }

                public final void writeRequestHeaders(Request request) throws IOException {
/* 1 */             request.getClass();
                    try {
/* 8 */                 this.eventListener.requestHeadersStart(this.call);
/* 13 */                this.codec.writeRequestHeaders(request);
/* 20 */                this.eventListener.requestHeadersEnd(this.call, request);
                    } catch (IOException e) {
/* 29 */                this.eventListener.requestFailed(this.call, e);
/* 32 */                trackFailure(e);
/* 35 */                throw e;
                    }
                }
            }
