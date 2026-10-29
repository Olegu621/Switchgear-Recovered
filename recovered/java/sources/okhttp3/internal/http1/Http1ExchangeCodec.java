            package okhttp3.internal.http1;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.EOFException;
            import java.io.IOException;
            import java.net.ProtocolException;
            import java.net.Proxy;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            import okhttp3.CookieJar;
            import okhttp3.Headers;
            import okhttp3.HttpUrl;
            import okhttp3.OkHttpClient;
            import okhttp3.Request;
            import okhttp3.Response;
            import okhttp3.internal.Util;
            import okhttp3.internal.connection.RealConnection;
            import okhttp3.internal.http.ExchangeCodec;
            import okhttp3.internal.http.HttpHeaders;
            import okhttp3.internal.http.RequestLine;
            import okhttp3.internal.http.StatusLine;
            import okio.Buffer;
            import okio.BufferedSink;
            import okio.BufferedSource;
            import okio.ForwardingTimeout;
            import okio.Sink;
            import okio.Source;
            import okio.Timeout;
            import p000.AbstractC0208c9;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 ?2\u00020\u0001:\u0007<=>?@ABB'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u001cH\u0016J\b\u0010&\u001a\u00020\u001cH\u0016J\b\u0010'\u001a\u00020\u001eH\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020!H\u0002J\b\u0010.\u001a\u00020\u001eH\u0002J\b\u0010/\u001a\u00020)H\u0002J\u0010\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020\u0019H\u0016J\u0012\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u0010H\u0016J\u0010\u00105\u001a\u00020!2\u0006\u00101\u001a\u00020\u0019H\u0016J\u000e\u00106\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u0019J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\u00152\u0006\u00109\u001a\u00020:J\u0010\u0010;\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0017H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\u00020\u0010*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0018\u0010\u0016\u001a\u00020\u0010*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001a¨\u0006C"}, m6176d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "client", "Lokhttp3/OkHttpClient;", "connection", "Lokhttp3/internal/connection/RealConnection;", FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "sink", "Lokio/BufferedSink;", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lokio/BufferedSource;Lokio/BufferedSink;)V", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "headersReader", "Lokhttp3/internal/http1/HeadersReader;", "isClosed", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "state", HttpUrl.FRAGMENT_ENCODE_SET, "trailers", "Lokhttp3/Headers;", "isChunked", "Lokhttp3/Request;", "(Lokhttp3/Request;)Z", "Lokhttp3/Response;", "(Lokhttp3/Response;)Z", "cancel", HttpUrl.FRAGMENT_ENCODE_SET, "createRequestBody", "Lokio/Sink;", "request", "contentLength", HttpUrl.FRAGMENT_ENCODE_SET, "detachTimeout", "timeout", "Lokio/ForwardingTimeout;", "finishRequest", "flushRequest", "newChunkedSink", "newChunkedSource", "Lokio/Source;", "url", "Lokhttp3/HttpUrl;", "newFixedLengthSource", "length", "newKnownLengthSink", "newUnknownLengthSource", "openResponseBodySource", "response", "readResponseHeaders", "Lokhttp3/Response$Builder;", "expectContinue", "reportedContentLength", "skipConnectBody", "writeRequest", "headers", "requestLine", HttpUrl.FRAGMENT_ENCODE_SET, "writeRequestHeaders", "AbstractSource", "ChunkedSink", "ChunkedSource", "Companion", "FixedLengthSource", "KnownLengthSink", "UnknownLengthSource", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 14 */    public final class Http1ExchangeCodec implements ExchangeCodec {
                private static final long NO_CHUNK_YET = -1;
                private static final int STATE_CLOSED = 6;
                private static final int STATE_IDLE = 0;
                private static final int STATE_OPEN_REQUEST_BODY = 1;
                private static final int STATE_OPEN_RESPONSE_BODY = 4;
                private static final int STATE_READING_RESPONSE_BODY = 5;
                private static final int STATE_READ_RESPONSE_HEADERS = 3;
                private static final int STATE_WRITING_REQUEST_BODY = 2;
                private final OkHttpClient client;
                private final RealConnection connection;
                private final HeadersReader headersReader;
                private final BufferedSink sink;
                private final BufferedSource source;
                private int state;
                private Headers trailers;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b¢\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\t\u001a\u00020\u0014H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m6176d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokio/Source;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "getClosed", "()Z", "setClosed", "(Z)V", "timeout", "Lokio/ForwardingTimeout;", "getTimeout", "()Lokio/ForwardingTimeout;", "read", HttpUrl.FRAGMENT_ENCODE_SET, "sink", "Lokio/Buffer;", "byteCount", "responseBodyComplete", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/Timeout;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public abstract class AbstractSource implements Source {
                    private boolean closed;
                    final /* synthetic */ Http1ExchangeCodec this$0;
                    private final ForwardingTimeout timeout;

                    public AbstractSource(Http1ExchangeCodec http1ExchangeCodec) {
/* 1 */                 http1ExchangeCodec.getClass();
/* 4 */                 this.this$0 = http1ExchangeCodec;
/* 22 */                this.timeout = new ForwardingTimeout(http1ExchangeCodec.source.getTimeout());
                    }

                    public final boolean getClosed() {
/* 1 */                 return this.closed;
                    }

                    public final ForwardingTimeout getTimeout() {
/* 1 */                 return this.timeout;
                    }

                    @Override // okio.Source
                    public long read(Buffer sink, long byteCount) throws IOException {
/* 1 */                 sink.getClass();
                        try {
/* 10 */                    return this.this$0.source.read(sink, byteCount);
                        } catch (IOException e) {
/* 22 */                    this.this$0.getConnection().noNewExchanges$okhttp();
/* 25 */                    responseBodyComplete();
/* 28 */                    throw e;
                        }
                    }

                    public final void responseBodyComplete() {
/* 8 */                 if (this.this$0.state == 6) {
/* 10 */                    return;
                        }
/* 1 */                 int i = this.this$0.state;
/* 17 */                Http1ExchangeCodec http1ExchangeCodec = this.this$0;
/* 20 */                if (i != 5) {
/* 47 */                    f42.m3656l(Intrinsics.m6219d(Integer.valueOf(http1ExchangeCodec.state), "state: "));
                        } else {
/* 1 */                     http1ExchangeCodec.detachTimeout(this.timeout);
/* 1 */                     this.this$0.state = 6;
                        }
                    }

                    public final void setClosed(boolean z) {
/* 1 */                 this.closed = z;
                    }

                    @Override // okio.Source
                    /* JADX INFO: renamed from: timeout */
                    public Timeout getTimeout() {
/* 1 */                 return this.timeout;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0005\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m6176d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Lokio/Sink;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "timeout", "Lokio/ForwardingTimeout;", "close", HttpUrl.FRAGMENT_ENCODE_SET, "flush", "Lokio/Timeout;", "write", FirebaseAnalytics.Param.SOURCE, "Lokio/Buffer;", "byteCount", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class ChunkedSink implements Sink {
                    private boolean closed;
                    final /* synthetic */ Http1ExchangeCodec this$0;
                    private final ForwardingTimeout timeout;

                    public ChunkedSink(Http1ExchangeCodec http1ExchangeCodec) {
/* 1 */                 http1ExchangeCodec.getClass();
/* 4 */                 this.this$0 = http1ExchangeCodec;
/* 22 */                this.timeout = new ForwardingTimeout(http1ExchangeCodec.sink.getTimeout());
                    }

                    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                    public synchronized void close() {
/* 4 */                 if (this.closed) {
/* 7 */                     return;
                        }
/* 9 */                 this.closed = true;
/* 19 */                this.this$0.sink.writeUtf8("0\r\n\r\n");
/* 1 */                 this.this$0.detachTimeout(this.timeout);
/* 1 */                 this.this$0.state = 3;
                    }

                    @Override // okio.Sink, java.io.Flushable
                    public synchronized void flush() {
/* 4 */                 if (this.closed) {
/* 7 */                     return;
                        }
/* 14 */                this.this$0.sink.flush();
                    }

                    @Override // okio.Sink
                    /* JADX INFO: renamed from: timeout */
                    public Timeout getTimeout() {
/* 1 */                 return this.timeout;
                    }

                    @Override // okio.Sink
                    public void write(Buffer source, long byteCount) throws IOException {
/* 1 */                 source.getClass();
/* 6 */                 if (this.closed) {
/* 56 */                    f42.m3656l("closed");
                        } else {
/* 12 */                    if (byteCount == 0) {
/* 14 */                        return;
                            }
/* 21 */                    this.this$0.sink.writeHexadecimalUnsignedLong(byteCount);
/* 32 */                    this.this$0.sink.writeUtf8("\r\n");
/* 41 */                    this.this$0.sink.write(source, byteCount);
/* 50 */                    this.this$0.sink.writeUtf8("\r\n");
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m6176d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "url", "Lokhttp3/HttpUrl;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "bytesRemainingInChunk", HttpUrl.FRAGMENT_ENCODE_SET, "hasMoreChunks", HttpUrl.FRAGMENT_ENCODE_SET, "close", HttpUrl.FRAGMENT_ENCODE_SET, "read", "sink", "Lokio/Buffer;", "byteCount", "readChunkSize", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class ChunkedSource extends AbstractSource {
                    private long bytesRemainingInChunk;
                    private boolean hasMoreChunks;
                    final /* synthetic */ Http1ExchangeCodec this$0;
                    private final HttpUrl url;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
/* 9 */                 super(http1ExchangeCodec);
/* 1 */                 http1ExchangeCodec.getClass();
/* 4 */                 httpUrl.getClass();
/* 7 */                 this.this$0 = http1ExchangeCodec;
/* 12 */                this.url = httpUrl;
/* 16 */                this.bytesRemainingInChunk = -1L;
/* 19 */                this.hasMoreChunks = true;
                    }

                    private final void readChunkSize() throws IOException {
/* 9 */                 if (this.bytesRemainingInChunk != -1) {
/* 17 */                    this.this$0.source.readUtf8LineStrict();
                        }
                        try {
/* 30 */                    this.bytesRemainingInChunk = this.this$0.source.readHexadecimalUnsignedLong();
/* 46 */                    String string = StringsKt.m6239O(this.this$0.source.readUtf8LineStrict()).toString();
/* 56 */                    if (this.bytesRemainingInChunk < 0 || (string.length() > 0 && !C1852e.m6263m(string, ";", false))) {
/* 152 */                       throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + '\"');
                            }
/* 77 */                    if (this.bytesRemainingInChunk == 0) {
/* 79 */                        this.hasMoreChunks = false;
/* 81 */                        Http1ExchangeCodec http1ExchangeCodec = this.this$0;
/* 1 */                         http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
/* 1 */                         OkHttpClient okHttpClient = this.this$0.client;
/* 100 */                       okHttpClient.getClass();
/* 103 */                       CookieJar cookieJar = okHttpClient.cookieJar();
/* 107 */                       HttpUrl httpUrl = this.url;
/* 1 */                         Headers headers = this.this$0.trailers;
/* 115 */                       headers.getClass();
/* 118 */                       HttpHeaders.receiveHeaders(cookieJar, httpUrl, headers);
/* 121 */                       responseBodyComplete();
                            }
                        } catch (NumberFormatException e) {
/* 163 */                   throw new ProtocolException(e.getMessage());
                        }
                    }

                    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
/* 5 */                 if (getClosed()) {
/* 7 */                     return;
                        }
/* 10 */                if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
/* 28 */                    this.this$0.getConnection().noNewExchanges$okhttp();
/* 31 */                    responseBodyComplete();
                        }
/* 35 */                setClosed(true);
                    }

                    @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
                    public long read(Buffer sink, long byteCount) throws IOException {
/* 1 */                 sink.getClass();
/* 8 */                 if (byteCount < 0) {
/* 97 */                    ds0.m3200q(Intrinsics.m6219d(Long.valueOf(byteCount), "byteCount < 0: "));
/* 4 */                     return 0L;
                        }
/* 14 */                if (getClosed()) {
/* 83 */                    f42.m3656l("closed");
/* 4 */                     return 0L;
                        }
/* 20 */                if (!this.hasMoreChunks) {
/* 18 */                    return -1L;
                        }
/* 23 */                long j = this.bytesRemainingInChunk;
/* 27 */                if (j == 0 || j == -1) {
/* 33 */                    readChunkSize();
/* 38 */                    if (!this.hasMoreChunks) {
/* 18 */                        return -1L;
                            }
                        }
/* 47 */                long j2 = super.read(sink, Math.min(byteCount, this.bytesRemainingInChunk));
/* 53 */                if (j2 != -1) {
/* 58 */                    this.bytesRemainingInChunk -= j2;
/* 60 */                    return j2;
                        }
/* 67 */                this.this$0.getConnection().noNewExchanges$okhttp();
/* 74 */                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
/* 77 */                responseBodyComplete();
/* 80 */                throw protocolException;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m6176d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "bytesRemaining", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokhttp3/internal/http1/Http1ExchangeCodec;J)V", "close", HttpUrl.FRAGMENT_ENCODE_SET, "read", "sink", "Lokio/Buffer;", "byteCount", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class FixedLengthSource extends AbstractSource {
                    private long bytesRemaining;
                    final /* synthetic */ Http1ExchangeCodec this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, long j) {
/* 6 */                 super(http1ExchangeCodec);
/* 1 */                 http1ExchangeCodec.getClass();
/* 4 */                 this.this$0 = http1ExchangeCodec;
/* 9 */                 this.bytesRemaining = j;
/* 15 */                if (j == 0) {
/* 17 */                    responseBodyComplete();
                        }
                    }

                    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
/* 5 */                 if (getClosed()) {
/* 7 */                     return;
                        }
/* 14 */                if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
/* 32 */                    this.this$0.getConnection().noNewExchanges$okhttp();
/* 35 */                    responseBodyComplete();
                        }
/* 39 */                setClosed(true);
                    }

                    @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
                    public long read(Buffer sink, long byteCount) throws IOException {
/* 1 */                 sink.getClass();
/* 8 */                 if (byteCount < 0) {
/* 86 */                    ds0.m3200q(Intrinsics.m6219d(Long.valueOf(byteCount), "byteCount < 0: "));
/* 4 */                     return 0L;
                        }
/* 14 */                if (getClosed()) {
/* 72 */                    f42.m3656l("closed");
/* 4 */                     return 0L;
                        }
/* 16 */                long j = this.bytesRemaining;
/* 22 */                if (j == 0) {
/* 20 */                    return -1L;
                        }
/* 29 */                long j2 = super.read(sink, Math.min(j, byteCount));
/* 35 */                if (j2 == -1) {
/* 56 */                    this.this$0.getConnection().noNewExchanges$okhttp();
/* 63 */                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
/* 66 */                    responseBodyComplete();
/* 69 */                    throw protocolException;
                        }
/* 39 */                long j3 = this.bytesRemaining - j2;
/* 40 */                this.bytesRemaining = j3;
/* 44 */                if (j3 == 0) {
/* 46 */                    responseBodyComplete();
                        }
/* 49 */                return j2;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0005\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m6176d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Lokio/Sink;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "timeout", "Lokio/ForwardingTimeout;", "close", HttpUrl.FRAGMENT_ENCODE_SET, "flush", "Lokio/Timeout;", "write", FirebaseAnalytics.Param.SOURCE, "Lokio/Buffer;", "byteCount", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class KnownLengthSink implements Sink {
                    private boolean closed;
                    final /* synthetic */ Http1ExchangeCodec this$0;
                    private final ForwardingTimeout timeout;

                    public KnownLengthSink(Http1ExchangeCodec http1ExchangeCodec) {
/* 1 */                 http1ExchangeCodec.getClass();
/* 4 */                 this.this$0 = http1ExchangeCodec;
/* 22 */                this.timeout = new ForwardingTimeout(http1ExchangeCodec.sink.getTimeout());
                    }

                    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
/* 3 */                 if (this.closed) {
/* 5 */                     return;
                        }
/* 7 */                 this.closed = true;
/* 1 */                 this.this$0.detachTimeout(this.timeout);
/* 1 */                 this.this$0.state = 3;
                    }

                    @Override // okio.Sink, java.io.Flushable
                    public void flush() throws IOException {
/* 3 */                 if (this.closed) {
/* 5 */                     return;
                        }
/* 12 */                this.this$0.sink.flush();
                    }

                    @Override // okio.Sink
                    /* JADX INFO: renamed from: timeout */
                    public Timeout getTimeout() {
/* 1 */                 return this.timeout;
                    }

                    @Override // okio.Sink
                    public void write(Buffer source, long byteCount) throws IOException {
/* 1 */                 source.getClass();
/* 6 */                 if (this.closed) {
/* 30 */                    f42.m3656l("closed");
                        } else {
/* 15 */                    Util.checkOffsetAndCount(source.size(), 0L, byteCount);
/* 24 */                    this.this$0.sink.write(source, byteCount);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m6176d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "inputExhausted", HttpUrl.FRAGMENT_ENCODE_SET, "close", HttpUrl.FRAGMENT_ENCODE_SET, "read", HttpUrl.FRAGMENT_ENCODE_SET, "sink", "Lokio/Buffer;", "byteCount", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class UnknownLengthSource extends AbstractSource {
                    private boolean inputExhausted;
                    final /* synthetic */ Http1ExchangeCodec this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public UnknownLengthSource(Http1ExchangeCodec http1ExchangeCodec) {
/* 6 */                 super(http1ExchangeCodec);
/* 1 */                 http1ExchangeCodec.getClass();
/* 4 */                 this.this$0 = http1ExchangeCodec;
                    }

                    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
/* 5 */                 if (getClosed()) {
/* 7 */                     return;
                        }
/* 10 */                if (!this.inputExhausted) {
/* 12 */                    responseBodyComplete();
                        }
/* 16 */                setClosed(true);
                    }

                    @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
                    public long read(Buffer sink, long byteCount) throws IOException {
/* 1 */                 sink.getClass();
/* 8 */                 if (byteCount < 0) {
/* 55 */                    ds0.m3200q(Intrinsics.m6219d(Long.valueOf(byteCount), "byteCount < 0: "));
/* 4 */                     return 0L;
                        }
/* 14 */                if (getClosed()) {
/* 41 */                    f42.m3656l("closed");
/* 4 */                     return 0L;
                        }
/* 20 */                if (this.inputExhausted) {
/* 18 */                    return -1L;
                        }
/* 23 */                long j = super.read(sink, byteCount);
/* 29 */                if (j != -1) {
/* 38 */                    return j;
                        }
/* 32 */                this.inputExhausted = true;
/* 34 */                responseBodyComplete();
/* 18 */                return -1L;
                    }
                }

                public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, BufferedSource bufferedSource, BufferedSink bufferedSink) {
/* 1 */             realConnection.getClass();
/* 4 */             bufferedSource.getClass();
/* 7 */             bufferedSink.getClass();
/* 13 */            this.client = okHttpClient;
/* 15 */            this.connection = realConnection;
/* 17 */            this.source = bufferedSource;
/* 19 */            this.sink = bufferedSink;
/* 26 */            this.headersReader = new HeadersReader(bufferedSource);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void detachTimeout(ForwardingTimeout timeout) {
/* 1 */             Timeout delegate = timeout.getDelegate();
/* 7 */             timeout.setDelegate(Timeout.NONE);
/* 10 */            delegate.clearDeadline();
/* 13 */            delegate.clearTimeout();
                }

                private final boolean isChunked(Response response) {
/* 11 */            return "chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null));
                }

                private final Sink newChunkedSink() {
/* 1 */             int i = this.state;
/* 4 */             if (i == 1) {
/* 7 */                 this.state = 2;
/* 11 */                return new ChunkedSink(this);
                    }
/* 25 */            ds0.m3190g(Intrinsics.m6219d(Integer.valueOf(i), "state: "));
/* 28 */            return null;
                }

                private final Source newChunkedSource(HttpUrl url) {
/* 1 */             int i = this.state;
/* 4 */             if (i == 4) {
/* 7 */                 this.state = 5;
/* 11 */                return new ChunkedSource(this, url);
                    }
/* 25 */            ds0.m3190g(Intrinsics.m6219d(Integer.valueOf(i), "state: "));
/* 28 */            return null;
                }

                private final Source newFixedLengthSource(long length) {
/* 1 */             int i = this.state;
/* 4 */             if (i == 4) {
/* 7 */                 this.state = 5;
/* 11 */                return new FixedLengthSource(this, length);
                    }
/* 25 */            ds0.m3190g(Intrinsics.m6219d(Integer.valueOf(i), "state: "));
/* 28 */            return null;
                }

                private final Sink newKnownLengthSink() {
/* 1 */             int i = this.state;
/* 4 */             if (i == 1) {
/* 7 */                 this.state = 2;
/* 11 */                return new KnownLengthSink(this);
                    }
/* 25 */            ds0.m3190g(Intrinsics.m6219d(Integer.valueOf(i), "state: "));
/* 28 */            return null;
                }

                private final Source newUnknownLengthSource() {
/* 1 */             int i = this.state;
/* 4 */             if (i != 4) {
/* 32 */                ds0.m3190g(Intrinsics.m6219d(Integer.valueOf(i), "state: "));
/* 35 */                return null;
                    }
/* 7 */             this.state = 5;
/* 13 */            getConnection().noNewExchanges$okhttp();
/* 18 */            return new UnknownLengthSource(this);
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public void cancel() {
/* 5 */             getConnection().cancel();
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public Sink createRequestBody(Request request, long contentLength) throws ProtocolException {
/* 1 */             request.getClass();
/* 8 */             if (request.body() != null && request.body().isDuplex()) {
/* 28 */                throw new ProtocolException("Duplex connections are not supported for HTTP/1");
                    }
/* 33 */            if (isChunked(request)) {
/* 35 */                return newChunkedSink();
                    }
/* 44 */            if (contentLength != -1) {
/* 46 */                return newKnownLengthSink();
                    }
/* 53 */            f42.m3656l("Cannot stream a request body without chunked encoding or a known content length!");
/* 56 */            return null;
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public void finishRequest() {
/* 3 */             this.sink.flush();
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public void flushRequest() throws IOException {
/* 3 */             this.sink.flush();
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public RealConnection getConnection() {
/* 1 */             return this.connection;
                }

                public final boolean isClosed() {
                    return this.state == 6;
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public Source openResponseBodySource(Response response) {
/* 1 */             response.getClass();
/* 8 */             if (!HttpHeaders.promisesBody(response)) {
/* 12 */                return newFixedLengthSource(0L);
                    }
/* 21 */            if (isChunked(response)) {
/* 31 */                return newChunkedSource(response.request().url());
                    }
/* 36 */            long jHeadersContentLength = Util.headersContentLength(response);
                    return jHeadersContentLength != -1 ? newFixedLengthSource(jHeadersContentLength) : newUnknownLengthSource();
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public Response.Builder readResponseHeaders(boolean expectContinue) {
/* 1 */             int i = this.state;
/* 6 */             if (i != 1 && i != 3) {
/* 21 */                ds0.m3190g(Intrinsics.m6219d(Integer.valueOf(i), "state: "));
/* 4 */                 return null;
                    }
                    try {
/* 33 */                StatusLine statusLine = StatusLine.INSTANCE.parse(this.headersReader.readLine());
/* 66 */                Response.Builder builderHeaders = new Response.Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(this.headersReader.readHeaders());
/* 72 */                if (expectContinue && statusLine.code == 100) {
/* 4 */                     return null;
                        }
/* 83 */                if (statusLine.code == 100) {
/* 85 */                    this.state = 3;
/* 87 */                    return builderHeaders;
                        }
/* 89 */                this.state = 4;
/* 91 */                return builderHeaders;
                    } catch (EOFException e) {
/* 123 */               throw new IOException(Intrinsics.m6219d(getConnection().getRoute().address().url().redact(), "unexpected end of stream on "), e);
                    }
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public long reportedContentLength(Response response) {
/* 1 */             response.getClass();
/* 8 */             if (!HttpHeaders.promisesBody(response)) {
/* 10 */                return 0L;
                    }
/* 17 */            if (isChunked(response)) {
/* 19 */                return -1L;
                    }
/* 22 */            return Util.headersContentLength(response);
                }

                public final void skipConnectBody(Response response) {
/* 1 */             response.getClass();
/* 4 */             long jHeadersContentLength = Util.headersContentLength(response);
/* 12 */            if (jHeadersContentLength == -1) {
/* 14 */                return;
                    }
/* 15 */            Source sourceNewFixedLengthSource = newFixedLengthSource(jHeadersContentLength);
/* 24 */            Util.skipAll(sourceNewFixedLengthSource, AbstractC0208c9.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
/* 27 */            sourceNewFixedLengthSource.close();
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public Headers trailers() {
/* 4 */             if (this.state == 6) {
/* 6 */                 Headers headers = this.trailers;
                        return headers == null ? Util.EMPTY_HEADERS : headers;
                    }
/* 15 */            f42.m3656l("too early; can't read the trailers yet");
/* 18 */            return null;
                }

                public final void writeRequest(Headers headers, String requestLine) {
/* 1 */             headers.getClass();
/* 4 */             requestLine.getClass();
/* 7 */             int i = this.state;
/* 9 */             if (i != 0) {
/* 77 */                ds0.m3190g(Intrinsics.m6219d(Integer.valueOf(i), "state: "));
/* 80 */                return;
                    }
/* 19 */            this.sink.writeUtf8(requestLine).writeUtf8("\r\n");
/* 22 */            int size = headers.size();
/* 26 */            int i2 = 0;
                    while (true) {
/* 27 */                BufferedSink bufferedSink = this.sink;
/* 29 */                if (i2 >= size) {
/* 60 */                    bufferedSink.writeUtf8("\r\n");
/* 64 */                    this.state = 1;
/* 66 */                    return;
                        } else {
/* 55 */                    bufferedSink.writeUtf8(headers.name(i2)).writeUtf8(": ").writeUtf8(headers.value(i2)).writeUtf8("\r\n");
/* 31 */                    i2++;
                        }
                    }
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public void writeRequestHeaders(Request request) {
/* 1 */             request.getClass();
/* 4 */             RequestLine requestLine = RequestLine.INSTANCE;
/* 18 */            Proxy.Type type = getConnection().getRoute().proxy().type();
/* 22 */            type.getClass();
/* 33 */            writeRequest(request.headers(), requestLine.get(request, type));
                }

/* 15 */        private final boolean isChunked(Request request) {
/* 17 */            return "chunked".equalsIgnoreCase(request.header("Transfer-Encoding"));
                }
            }
