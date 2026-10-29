            package okhttp3.internal.http2;

            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.io.IOException;
            import java.net.ProtocolException;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Locale;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.Headers;
            import okhttp3.HttpUrl;
            import okhttp3.OkHttpClient;
            import okhttp3.Protocol;
            import okhttp3.Request;
            import okhttp3.Response;
            import okhttp3.internal.Util;
            import okhttp3.internal.connection.RealConnection;
            import okhttp3.internal.http.ExchangeCodec;
            import okhttp3.internal.http.HttpHeaders;
            import okhttp3.internal.http.RealInterceptorChain;
            import okhttp3.internal.http.RequestLine;
            import okhttp3.internal.http.StatusLine;
            import okio.Sink;
            import okio.Source;
            import okio.Timeout;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 (2\u00020\u0001:\u0001(B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\fH\u0016J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m6176d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "client", "Lokhttp3/OkHttpClient;", Http2ExchangeCodec.CONNECTION, "Lokhttp3/internal/connection/RealConnection;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lokhttp3/internal/http/RealInterceptorChain;Lokhttp3/internal/http2/Http2Connection;)V", "canceled", HttpUrl.FRAGMENT_ENCODE_SET, "getConnection", "()Lokhttp3/internal/connection/RealConnection;", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, "Lokhttp3/Protocol;", "stream", "Lokhttp3/internal/http2/Http2Stream;", "cancel", HttpUrl.FRAGMENT_ENCODE_SET, "createRequestBody", "Lokio/Sink;", "request", "Lokhttp3/Request;", "contentLength", HttpUrl.FRAGMENT_ENCODE_SET, "finishRequest", "flushRequest", "openResponseBodySource", "Lokio/Source;", "response", "Lokhttp3/Response;", "readResponseHeaders", "Lokhttp3/Response$Builder;", "expectContinue", "reportedContentLength", "trailers", "Lokhttp3/Headers;", "writeRequestHeaders", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class Http2ExchangeCodec implements ExchangeCodec {
                private static final String HOST = "host";
                private volatile boolean canceled;
                private final RealInterceptorChain chain;
                private final RealConnection connection;
                private final Http2Connection http2Connection;
                private final Protocol protocol;
                private volatile Http2Stream stream;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final String CONNECTION = "connection";
                private static final String KEEP_ALIVE = "keep-alive";
                private static final String PROXY_CONNECTION = "proxy-connection";

                /* JADX INFO: renamed from: TE */
                private static final String f14794TE = "te";
                private static final String TRANSFER_ENCODING = "transfer-encoding";
                private static final String ENCODING = "encoding";
                private static final String UPGRADE = "upgrade";
                private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableListOf(CONNECTION, "host", KEEP_ALIVE, PROXY_CONNECTION, f14794TE, TRANSFER_ENCODING, ENCODING, UPGRADE, Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);
                private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableListOf(CONNECTION, "host", KEEP_ALIVE, PROXY_CONNECTION, f14794TE, TRANSFER_ENCODING, ENCODING, UPGRADE);

                public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
/* 1 */             okHttpClient.getClass();
/* 4 */             realConnection.getClass();
/* 7 */             realInterceptorChain.getClass();
/* 10 */            http2Connection.getClass();
/* 16 */            this.connection = realConnection;
/* 18 */            this.chain = realInterceptorChain;
/* 20 */            this.http2Connection = http2Connection;
/* 22 */            List<Protocol> listProtocols = okHttpClient.protocols();
/* 26 */            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
/* 37 */            this.protocol = listProtocols.contains(protocol) ? protocol : Protocol.HTTP_2;
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public void cancel() {
/* 2 */             this.canceled = true;
/* 4 */             Http2Stream http2Stream = this.stream;
/* 6 */             if (http2Stream == null) {
/* 8 */                 return;
                    }
/* 11 */            http2Stream.closeLater(ErrorCode.CANCEL);
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public Sink createRequestBody(Request request, long contentLength) {
/* 1 */             request.getClass();
/* 4 */             Http2Stream http2Stream = this.stream;
/* 6 */             http2Stream.getClass();
/* 9 */             return http2Stream.getSink();
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public void finishRequest() throws IOException {
/* 1 */             Http2Stream http2Stream = this.stream;
/* 3 */             http2Stream.getClass();
/* 10 */            http2Stream.getSink().close();
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public void flushRequest() throws IOException {
/* 3 */             this.http2Connection.flush();
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public RealConnection getConnection() {
/* 1 */             return this.connection;
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public Source openResponseBodySource(Response response) {
/* 1 */             response.getClass();
/* 4 */             Http2Stream http2Stream = this.stream;
/* 6 */             http2Stream.getClass();
/* 9 */             return http2Stream.getSource();
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public Response.Builder readResponseHeaders(boolean expectContinue) throws IOException {
/* 1 */             Http2Stream http2Stream = this.stream;
/* 3 */             http2Stream.getClass();
/* 14 */            Response.Builder http2HeadersList = INSTANCE.readHttp2HeadersList(http2Stream.takeHeaders(), this.protocol);
/* 18 */            if (expectContinue && http2HeadersList.getCode() == 100) {
/* 28 */                return null;
                    }
/* 29 */            return http2HeadersList;
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public long reportedContentLength(Response response) {
/* 1 */             response.getClass();
/* 8 */             if (HttpHeaders.promisesBody(response)) {
/* 13 */                return Util.headersContentLength(response);
                    }
/* 10 */            return 0L;
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public Headers trailers() {
/* 1 */             Http2Stream http2Stream = this.stream;
/* 3 */             http2Stream.getClass();
/* 6 */             return http2Stream.trailers();
                }

                @Override // okhttp3.internal.http.ExchangeCodec
                public void writeRequestHeaders(Request request) throws IOException {
/* 1 */             request.getClass();
/* 6 */             if (this.stream != null) {
/* 8 */                 return;
                    }
/* 30 */            this.stream = this.http2Connection.newStream(INSTANCE.http2HeadersList(request), request.body() != null);
/* 32 */            boolean z = this.canceled;
/* 34 */            Http2Stream http2Stream = this.stream;
/* 36 */            if (z) {
/* 77 */                http2Stream.getClass();
/* 82 */                http2Stream.closeLater(ErrorCode.CANCEL);
/* 87 */                ds0.m3195l("Canceled");
/* 90 */                return;
                    }
/* 38 */            http2Stream.getClass();
/* 41 */            Timeout timeout = http2Stream.readTimeout();
/* 47 */            long readTimeoutMillis = this.chain.getReadTimeoutMillis();
/* 52 */            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
/* 54 */            timeout.timeout(readTimeoutMillis, timeUnit);
/* 57 */            Http2Stream http2Stream2 = this.stream;
/* 59 */            http2Stream2.getClass();
/* 73 */            http2Stream2.writeTimeout().timeout(this.chain.getWriteTimeoutMillis(), timeUnit);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m6176d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "CONNECTION", HttpUrl.FRAGMENT_ENCODE_SET, "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", HttpUrl.FRAGMENT_ENCODE_SET, "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "http2HeadersList", "Lokhttp3/internal/http2/Header;", "request", "Lokhttp3/Request;", "readHttp2HeadersList", "Lokhttp3/Response$Builder;", "headerBlock", "Lokhttp3/Headers;", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, "Lokhttp3/Protocol;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final List<Header> http2HeadersList(Request request) {
/* 1 */                 request.getClass();
/* 4 */                 Headers headers = request.headers();
/* 16 */                ArrayList arrayList = new ArrayList(headers.size() + 4);
/* 30 */                arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
/* 50 */                arrayList.add(new Header(Header.TARGET_PATH, RequestLine.INSTANCE.requestPath(request.url())));
/* 55 */                String strHeader = request.header("Host");
/* 59 */                if (strHeader != null) {
/* 68 */                    arrayList.add(new Header(Header.TARGET_AUTHORITY, strHeader));
                        }
/* 86 */                arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
/* 89 */                int size = headers.size();
/* 93 */                int i = 0;
/* 94 */                while (i < size) {
/* 96 */                    int i2 = i + 1;
/* 98 */                    String strName = headers.name(i);
/* 102 */                   Locale locale = Locale.US;
/* 104 */                   locale.getClass();
/* 107 */                   String lowerCase = strName.toLowerCase(locale);
/* 111 */                   lowerCase.getClass();
/* 122 */                   if (!Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS.contains(lowerCase) || (Intrinsics.m6216a(lowerCase, Http2ExchangeCodec.f14794TE) && Intrinsics.m6216a(headers.value(i), "trailers"))) {
/* 153 */                       arrayList.add(new Header(lowerCase, headers.value(i)));
                            }
/* 156 */                   i = i2;
                        }
/* 158 */               return arrayList;
                    }

                    public final Response.Builder readHttp2HeadersList(Headers headerBlock, Protocol protocol) throws IOException {
/* 1 */                 headerBlock.getClass();
/* 4 */                 protocol.getClass();
/* 9 */                 Headers.Builder builder = new Headers.Builder();
/* 12 */                int size = headerBlock.size();
/* 16 */                StatusLine statusLine = null;
/* 17 */                int i = 0;
/* 18 */                while (i < size) {
/* 20 */                    int i2 = i + 1;
/* 22 */                    String strName = headerBlock.name(i);
/* 26 */                    String strValue = headerBlock.value(i);
/* 36 */                    if (Intrinsics.m6216a(strName, Header.RESPONSE_STATUS_UTF8)) {
/* 46 */                        statusLine = StatusLine.INSTANCE.parse(Intrinsics.m6219d(strValue, "HTTP/1.1 "));
                            } else if (!Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(strName)) {
/* 62 */                        builder.addLenient$okhttp(strName, strValue);
                            }
/* 50 */                    i = i2;
                        }
/* 66 */                if (statusLine != null) {
/* 93 */                    return new Response.Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
                        }
/* 105 */               throw new ProtocolException("Expected ':status' header not present");
                    }

/* 4 */             private Companion() {
                    }
                }
            }
