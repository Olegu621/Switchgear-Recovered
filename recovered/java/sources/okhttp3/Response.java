            package okhttp3;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.io.Closeable;
            import java.io.IOException;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.internal.connection.Exchange;
            import okhttp3.internal.http.HttpHeaders;
            import okio.Buffer;
            import okio.BufferedSource;
            import okio.Source;
            import p000.C1951n4;
            import p000.ds0;
            import p000.f42;
            import p000.nd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001FB{\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\b+J\r\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\b,J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0002\b-J\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/J\b\u00101\u001a\u000202H\u0016J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b3J\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\b4J\u001e\u00105\u001a\u0004\u0018\u00010\u00072\u0006\u00106\u001a\u00020\u00072\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0007H\u0007J\r\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\b8J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070/2\u0006\u00106\u001a\u00020\u0007J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b9J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0002\b:J\u0006\u0010;\u001a\u00020<J\u000e\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u0014J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0002\b?J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b@J\r\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0002\bAJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\bBJ\r\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\bCJ\b\u0010D\u001a\u00020\u0007H\u0016J\u0006\u0010E\u001a\u00020\rR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001dR\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001eR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u001fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010 R\u0013\u0010\f\u001a\u00020\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010!R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b\"\u0010$R\u0011\u0010%\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0010\u0010&\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010'R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001dR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010(R\u0013\u0010\u0015\u001a\u00020\u00148\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010)R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010*R\u0013\u0010\u0013\u001a\u00020\u00148\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010)¨\u0006G"}, m6176d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "request", "Lokhttp3/Request;", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, "Lokhttp3/Protocol;", "message", HttpUrl.FRAGMENT_ENCODE_SET, "code", HttpUrl.FRAGMENT_ENCODE_SET, "handshake", "Lokhttp3/Handshake;", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/ResponseBody;", "networkResponse", "cacheResponse", "priorResponse", "sentRequestAtMillis", HttpUrl.FRAGMENT_ENCODE_SET, "receivedResponseAtMillis", "exchange", "Lokhttp3/internal/connection/Exchange;", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLokhttp3/internal/connection/Exchange;)V", "()Lokhttp3/ResponseBody;", "cacheControl", "Lokhttp3/CacheControl;", "()Lokhttp3/CacheControl;", "()Lokhttp3/Response;", "()I", "()Lokhttp3/internal/connection/Exchange;", "()Lokhttp3/Handshake;", "()Lokhttp3/Headers;", "isRedirect", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isSuccessful", "lazyCacheControl", "()Ljava/lang/String;", "()Lokhttp3/Protocol;", "()J", "()Lokhttp3/Request;", "-deprecated_body", "-deprecated_cacheControl", "-deprecated_cacheResponse", "challenges", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Challenge;", "close", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_code", "-deprecated_handshake", "header", "name", "defaultValue", "-deprecated_headers", "-deprecated_message", "-deprecated_networkResponse", "newBuilder", "Lokhttp3/Response$Builder;", "peekBody", "byteCount", "-deprecated_priorResponse", "-deprecated_protocol", "-deprecated_receivedResponseAtMillis", "-deprecated_request", "-deprecated_sentRequestAtMillis", "toString", "trailers", "Builder", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 9 */     public final class Response implements Closeable {
                private final ResponseBody body;
                private final Response cacheResponse;
                private final int code;
                private final Exchange exchange;
                private final Handshake handshake;
                private final Headers headers;
                private CacheControl lazyCacheControl;
                private final String message;
                private final Response networkResponse;
                private final Response priorResponse;
                private final Protocol protocol;
                private final long receivedResponseAtMillis;
                private final Request request;
                private final long sentRequestAtMillis;

                public Response(Request request, Protocol protocol, String str, int i, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j, long j2, Exchange exchange) {
/* 1 */             request.getClass();
/* 4 */             protocol.getClass();
/* 7 */             str.getClass();
/* 10 */            headers.getClass();
/* 16 */            this.request = request;
/* 18 */            this.protocol = protocol;
/* 20 */            this.message = str;
/* 22 */            this.code = i;
/* 24 */            this.handshake = handshake;
/* 26 */            this.headers = headers;
/* 28 */            this.body = responseBody;
/* 30 */            this.networkResponse = response;
/* 32 */            this.cacheResponse = response2;
/* 34 */            this.priorResponse = response3;
/* 36 */            this.sentRequestAtMillis = j;
/* 38 */            this.receivedResponseAtMillis = j2;
/* 40 */            this.exchange = exchange;
                }

                public static /* synthetic */ String header$default(Response response, String str, String str2, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 str2 = null;
                    }
/* 6 */             return response.header(str, str2);
                }

                /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
                public final ResponseBody getBody() {
/* 1 */             return this.body;
                }

                /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
                public final CacheControl m10618deprecated_cacheControl() {
/* 1 */             return cacheControl();
                }

                /* JADX INFO: renamed from: -deprecated_cacheResponse, reason: not valid java name and from getter */
                public final Response getCacheResponse() {
/* 1 */             return this.cacheResponse;
                }

                /* JADX INFO: renamed from: -deprecated_code, reason: not valid java name and from getter */
                public final int getCode() {
/* 1 */             return this.code;
                }

                /* JADX INFO: renamed from: -deprecated_handshake, reason: not valid java name and from getter */
                public final Handshake getHandshake() {
/* 1 */             return this.handshake;
                }

                /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
                public final Headers getHeaders() {
/* 1 */             return this.headers;
                }

                /* JADX INFO: renamed from: -deprecated_message, reason: not valid java name and from getter */
                public final String getMessage() {
/* 1 */             return this.message;
                }

                /* JADX INFO: renamed from: -deprecated_networkResponse, reason: not valid java name and from getter */
                public final Response getNetworkResponse() {
/* 1 */             return this.networkResponse;
                }

                /* JADX INFO: renamed from: -deprecated_priorResponse, reason: not valid java name and from getter */
                public final Response getPriorResponse() {
/* 1 */             return this.priorResponse;
                }

                /* JADX INFO: renamed from: -deprecated_protocol, reason: not valid java name and from getter */
                public final Protocol getProtocol() {
/* 1 */             return this.protocol;
                }

                /* JADX INFO: renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name and from getter */
                public final long getReceivedResponseAtMillis() {
/* 1 */             return this.receivedResponseAtMillis;
                }

                /* JADX INFO: renamed from: -deprecated_request, reason: not valid java name and from getter */
                public final Request getRequest() {
/* 1 */             return this.request;
                }

                /* JADX INFO: renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name and from getter */
                public final long getSentRequestAtMillis() {
/* 1 */             return this.sentRequestAtMillis;
                }

                public final ResponseBody body() {
/* 1 */             return this.body;
                }

                public final CacheControl cacheControl() {
/* 1 */             CacheControl cacheControl = this.lazyCacheControl;
/* 3 */             if (cacheControl != null) {
/* 15 */                return cacheControl;
                    }
/* 9 */             CacheControl cacheControl2 = CacheControl.INSTANCE.parse(this.headers);
/* 13 */            this.lazyCacheControl = cacheControl2;
/* 15 */            return cacheControl2;
                }

                public final Response cacheResponse() {
/* 1 */             return this.cacheResponse;
                }

                public final List<Challenge> challenges() {
                    String str;
/* 1 */             Headers headers = this.headers;
/* 3 */             int i = this.code;
/* 7 */             if (i == 401) {
/* 19 */                str = "WWW-Authenticate";
                    } else {
/* 11 */                if (i != 407) {
/* 13 */                    return nd0.f14189a;
                        }
/* 16 */                str = "Proxy-Authenticate";
                    }
/* 21 */            return HttpHeaders.parseChallenges(headers, str);
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
/* 1 */             ResponseBody responseBody = this.body;
/* 3 */             if (responseBody != null) {
/* 5 */                 responseBody.close();
                    } else {
/* 11 */                f42.m3656l("response is not eligible for a body and must not be closed");
                    }
                }

                public final int code() {
/* 1 */             return this.code;
                }

                /* JADX INFO: renamed from: exchange, reason: from getter */
                public final Exchange getExchange() {
/* 1 */             return this.exchange;
                }

                public final Handshake handshake() {
/* 1 */             return this.handshake;
                }

                public final String header(String name, String defaultValue) {
/* 1 */             name.getClass();
/* 6 */             String str = this.headers.get(name);
                    return str == null ? defaultValue : str;
                }

                public final List<String> headers(String name) {
/* 1 */             name.getClass();
/* 6 */             return this.headers.values(name);
                }

                public final boolean isRedirect() {
/* 1 */             int i = this.code;
/* 5 */             if (i == 307 || i == 308) {
/* 16 */                return true;
                    }
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
/* 16 */                    return true;
                        default:
/* 14 */                    return false;
                    }
                }

                public final boolean isSuccessful() {
/* 1 */             int i = this.code;
                    return 200 <= i && i < 300;
                }

                public final String message() {
/* 1 */             return this.message;
                }

                public final Response networkResponse() {
/* 1 */             return this.networkResponse;
                }

                public final Builder newBuilder() {
/* 3 */             return new Builder(this);
                }

                public final ResponseBody peekBody(long byteCount) throws IOException {
/* 1 */             ResponseBody responseBody = this.body;
/* 3 */             responseBody.getClass();
/* 10 */            BufferedSource bufferedSourcePeek = responseBody.source().peek();
/* 16 */            Buffer buffer = new Buffer();
/* 19 */            bufferedSourcePeek.request(byteCount);
/* 34 */            buffer.write((Source) bufferedSourcePeek, Math.min(byteCount, bufferedSourcePeek.getBuffer().size()));
/* 49 */            return ResponseBody.INSTANCE.create(buffer, this.body.contentType(), buffer.size());
                }

                public final Response priorResponse() {
/* 1 */             return this.priorResponse;
                }

                public final Protocol protocol() {
/* 1 */             return this.protocol;
                }

                public final long receivedResponseAtMillis() {
/* 1 */             return this.receivedResponseAtMillis;
                }

                public final Request request() {
/* 1 */             return this.request;
                }

                public final long sentRequestAtMillis() {
/* 1 */             return this.sentRequestAtMillis;
                }

                public String toString() {
/* 52 */            return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
                }

                public final Headers trailers() throws IOException {
/* 1 */             Exchange exchange = this.exchange;
/* 3 */             if (exchange != null) {
/* 5 */                 return exchange.trailers();
                    }
/* 12 */            f42.m3656l("trailers not available");
/* 15 */            return null;
                }

/* 10 */        public final Headers headers() {
/* 11 */            return this.headers;
                }

/* 13 */        public final String header(String str) {
/* 14 */            str.getClass();
                    return header$default(this, str, null, 2, null);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020)2\u0006\u0010K\u001a\u00020)H\u0016J\u0012\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010L\u001a\u00020\u0004H\u0016J\u0012\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010M\u001a\u00020N2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u001a\u0010O\u001a\u00020N2\u0006\u0010J\u001a\u00020)2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010P\u001a\u00020\u00002\u0006\u0010J\u001a\u00020)2\u0006\u0010K\u001a\u00020)H\u0016J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020QH\u0016J\u0015\u0010R\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0017H\u0000¢\u0006\u0002\bTJ\u0010\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010.\u001a\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u00101\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u000205H\u0016J\u0010\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010U\u001a\u00020\u00002\u0006\u0010J\u001a\u00020)H\u0016J\u0010\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010F\u001a\u00020\u00002\u0006\u0010F\u001a\u00020;H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u0010\u0005R\u001c\u00101\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u0010\u0005R\u001c\u00104\u001a\u0004\u0018\u000105X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020;X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010@\u001a\u0004\u0018\u00010AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020;X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?¨\u0006V"}, m6176d2 = {"Lokhttp3/Response$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "response", "Lokhttp3/Response;", "(Lokhttp3/Response;)V", "body", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "cacheResponse", "getCacheResponse$okhttp", "()Lokhttp3/Response;", "setCacheResponse$okhttp", "code", HttpUrl.FRAGMENT_ENCODE_SET, "getCode$okhttp", "()I", "setCode$okhttp", "(I)V", "exchange", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "setExchange$okhttp", "(Lokhttp3/internal/connection/Exchange;)V", "handshake", "Lokhttp3/Handshake;", "getHandshake$okhttp", "()Lokhttp3/Handshake;", "setHandshake$okhttp", "(Lokhttp3/Handshake;)V", "headers", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "message", HttpUrl.FRAGMENT_ENCODE_SET, "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "networkResponse", "getNetworkResponse$okhttp", "setNetworkResponse$okhttp", "priorResponse", "getPriorResponse$okhttp", "setPriorResponse$okhttp", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, "Lokhttp3/Protocol;", "getProtocol$okhttp", "()Lokhttp3/Protocol;", "setProtocol$okhttp", "(Lokhttp3/Protocol;)V", "receivedResponseAtMillis", HttpUrl.FRAGMENT_ENCODE_SET, "getReceivedResponseAtMillis$okhttp", "()J", "setReceivedResponseAtMillis$okhttp", "(J)V", "request", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "sentRequestAtMillis", "getSentRequestAtMillis$okhttp", "setSentRequestAtMillis$okhttp", "addHeader", "name", FirebaseAnalytics.Param.VALUE, "build", "checkPriorResponse", HttpUrl.FRAGMENT_ENCODE_SET, "checkSupportResponse", "header", "Lokhttp3/Headers;", "initExchange", "deferredTrailers", "initExchange$okhttp", "removeHeader", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 91 */        public static class Builder {
                    private ResponseBody body;
                    private Response cacheResponse;
                    private int code;
                    private Exchange exchange;
                    private Handshake handshake;
                    private Headers.Builder headers;
                    private String message;
                    private Response networkResponse;
                    private Response priorResponse;
                    private Protocol protocol;
                    private long receivedResponseAtMillis;
                    private Request request;
                    private long sentRequestAtMillis;

                    public Builder(Response response) {
/* 1 */                 response.getClass();
/* 8 */                 this.code = -1;
/* 14 */                this.request = response.request();
/* 20 */                this.protocol = response.protocol();
/* 26 */                this.code = response.code();
/* 32 */                this.message = response.message();
/* 38 */                this.handshake = response.handshake();
/* 48 */                this.headers = response.headers().newBuilder();
/* 54 */                this.body = response.body();
/* 60 */                this.networkResponse = response.networkResponse();
/* 66 */                this.cacheResponse = response.cacheResponse();
/* 72 */                this.priorResponse = response.priorResponse();
/* 78 */                this.sentRequestAtMillis = response.sentRequestAtMillis();
/* 84 */                this.receivedResponseAtMillis = response.receivedResponseAtMillis();
/* 90 */                this.exchange = response.getExchange();
                    }

                    private final void checkPriorResponse(Response response) {
/* 1 */                 if (response == null || response.body() == null) {
/* 10 */                    return;
                        }
/* 13 */                C1951n4.m6859j("priorResponse.body != null");
                    }

                    private final void checkSupportResponse(String name, Response response) {
/* 1 */                 if (response == null) {
/* 3 */                     return;
                        }
/* 8 */                 if (response.body() != null) {
/* 65 */                    ds0.m3200q(Intrinsics.m6219d(".body != null", name));
/* 68 */                    return;
                        }
/* 14 */                if (response.networkResponse() != null) {
/* 55 */                    ds0.m3200q(Intrinsics.m6219d(".networkResponse != null", name));
                        } else if (response.cacheResponse() != null) {
/* 45 */                    ds0.m3200q(Intrinsics.m6219d(".cacheResponse != null", name));
                        } else {
/* 26 */                    if (response.priorResponse() == null) {
/* 28 */                        return;
                            }
/* 35 */                    ds0.m3200q(Intrinsics.m6219d(".priorResponse != null", name));
                        }
                    }

                    public Builder addHeader(String name, String value) {
/* 1 */                 name.getClass();
/* 4 */                 value.getClass();
/* 11 */                getHeaders().add(name, value);
/* 14 */                return this;
                    }

                    public Builder body(ResponseBody body) {
/* 1 */                 setBody$okhttp(body);
/* 4 */                 return this;
                    }

                    public Response build() {
/* 3 */                 int i = this.code;
/* 6 */                 if (i < 0) {
/* 85 */                    ds0.m3190g(Intrinsics.m6219d(Integer.valueOf(getCode()), "code < 0: "));
/* 5 */                     return null;
                        }
/* 9 */                 Request request = this.request;
/* 11 */                if (request == null) {
/* 66 */                    f42.m3656l("request == null");
/* 5 */                     return null;
                        }
/* 14 */                Protocol protocol = this.protocol;
/* 17 */                if (protocol == null) {
/* 59 */                    f42.m3656l("protocol == null");
/* 5 */                     return null;
                        }
/* 19 */                String str = this.message;
/* 21 */                if (str != null) {
/* 47 */                    return new Response(request, protocol, str, i, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
                        }
/* 53 */                f42.m3656l("message == null");
/* 5 */                 return null;
                    }

                    public Builder cacheResponse(Response cacheResponse) {
/* 3 */                 checkSupportResponse("cacheResponse", cacheResponse);
/* 6 */                 setCacheResponse$okhttp(cacheResponse);
/* 9 */                 return this;
                    }

                    public Builder code(int code) {
/* 1 */                 setCode$okhttp(code);
/* 4 */                 return this;
                    }

                    /* JADX INFO: renamed from: getBody$okhttp, reason: from getter */
                    public final ResponseBody getBody() {
/* 1 */                 return this.body;
                    }

                    /* JADX INFO: renamed from: getCacheResponse$okhttp, reason: from getter */
                    public final Response getCacheResponse() {
/* 1 */                 return this.cacheResponse;
                    }

                    /* JADX INFO: renamed from: getCode$okhttp, reason: from getter */
                    public final int getCode() {
/* 1 */                 return this.code;
                    }

                    /* JADX INFO: renamed from: getExchange$okhttp, reason: from getter */
                    public final Exchange getExchange() {
/* 1 */                 return this.exchange;
                    }

                    /* JADX INFO: renamed from: getHandshake$okhttp, reason: from getter */
                    public final Handshake getHandshake() {
/* 1 */                 return this.handshake;
                    }

                    /* JADX INFO: renamed from: getHeaders$okhttp, reason: from getter */
                    public final Headers.Builder getHeaders() {
/* 1 */                 return this.headers;
                    }

                    /* JADX INFO: renamed from: getMessage$okhttp, reason: from getter */
                    public final String getMessage() {
/* 1 */                 return this.message;
                    }

                    /* JADX INFO: renamed from: getNetworkResponse$okhttp, reason: from getter */
                    public final Response getNetworkResponse() {
/* 1 */                 return this.networkResponse;
                    }

                    /* JADX INFO: renamed from: getPriorResponse$okhttp, reason: from getter */
                    public final Response getPriorResponse() {
/* 1 */                 return this.priorResponse;
                    }

                    /* JADX INFO: renamed from: getProtocol$okhttp, reason: from getter */
                    public final Protocol getProtocol() {
/* 1 */                 return this.protocol;
                    }

                    /* JADX INFO: renamed from: getReceivedResponseAtMillis$okhttp, reason: from getter */
                    public final long getReceivedResponseAtMillis() {
/* 1 */                 return this.receivedResponseAtMillis;
                    }

                    /* JADX INFO: renamed from: getRequest$okhttp, reason: from getter */
                    public final Request getRequest() {
/* 1 */                 return this.request;
                    }

                    /* JADX INFO: renamed from: getSentRequestAtMillis$okhttp, reason: from getter */
                    public final long getSentRequestAtMillis() {
/* 1 */                 return this.sentRequestAtMillis;
                    }

                    public Builder handshake(Handshake handshake) {
/* 1 */                 setHandshake$okhttp(handshake);
/* 4 */                 return this;
                    }

                    public Builder header(String name, String value) {
/* 1 */                 name.getClass();
/* 4 */                 value.getClass();
/* 11 */                getHeaders().set(name, value);
/* 14 */                return this;
                    }

                    public Builder headers(Headers headers) {
/* 1 */                 headers.getClass();
/* 8 */                 setHeaders$okhttp(headers.newBuilder());
/* 11 */                return this;
                    }

                    public final void initExchange$okhttp(Exchange deferredTrailers) {
/* 1 */                 deferredTrailers.getClass();
/* 4 */                 this.exchange = deferredTrailers;
                    }

                    public Builder message(String message) {
/* 1 */                 message.getClass();
/* 4 */                 setMessage$okhttp(message);
/* 7 */                 return this;
                    }

                    public Builder networkResponse(Response networkResponse) {
/* 3 */                 checkSupportResponse("networkResponse", networkResponse);
/* 6 */                 setNetworkResponse$okhttp(networkResponse);
/* 9 */                 return this;
                    }

                    public Builder priorResponse(Response priorResponse) {
/* 1 */                 checkPriorResponse(priorResponse);
/* 4 */                 setPriorResponse$okhttp(priorResponse);
/* 7 */                 return this;
                    }

                    public Builder protocol(Protocol protocol) {
/* 1 */                 protocol.getClass();
/* 4 */                 setProtocol$okhttp(protocol);
/* 7 */                 return this;
                    }

                    public Builder receivedResponseAtMillis(long receivedResponseAtMillis) {
/* 1 */                 setReceivedResponseAtMillis$okhttp(receivedResponseAtMillis);
/* 4 */                 return this;
                    }

                    public Builder removeHeader(String name) {
/* 1 */                 name.getClass();
/* 8 */                 getHeaders().removeAll(name);
/* 11 */                return this;
                    }

                    public Builder request(Request request) {
/* 1 */                 request.getClass();
/* 4 */                 setRequest$okhttp(request);
/* 7 */                 return this;
                    }

                    public Builder sentRequestAtMillis(long sentRequestAtMillis) {
/* 1 */                 setSentRequestAtMillis$okhttp(sentRequestAtMillis);
/* 4 */                 return this;
                    }

                    public final void setBody$okhttp(ResponseBody responseBody) {
/* 1 */                 this.body = responseBody;
                    }

                    public final void setCacheResponse$okhttp(Response response) {
/* 1 */                 this.cacheResponse = response;
                    }

                    public final void setCode$okhttp(int i) {
/* 1 */                 this.code = i;
                    }

                    public final void setExchange$okhttp(Exchange exchange) {
/* 1 */                 this.exchange = exchange;
                    }

                    public final void setHandshake$okhttp(Handshake handshake) {
/* 1 */                 this.handshake = handshake;
                    }

                    public final void setHeaders$okhttp(Headers.Builder builder) {
/* 1 */                 builder.getClass();
/* 4 */                 this.headers = builder;
                    }

                    public final void setMessage$okhttp(String str) {
/* 1 */                 this.message = str;
                    }

                    public final void setNetworkResponse$okhttp(Response response) {
/* 1 */                 this.networkResponse = response;
                    }

                    public final void setPriorResponse$okhttp(Response response) {
/* 1 */                 this.priorResponse = response;
                    }

                    public final void setProtocol$okhttp(Protocol protocol) {
/* 1 */                 this.protocol = protocol;
                    }

                    public final void setReceivedResponseAtMillis$okhttp(long j) {
/* 1 */                 this.receivedResponseAtMillis = j;
                    }

                    public final void setRequest$okhttp(Request request) {
/* 1 */                 this.request = request;
                    }

                    public final void setSentRequestAtMillis$okhttp(long j) {
/* 1 */                 this.sentRequestAtMillis = j;
                    }

/* 92 */            public Builder() {
/* 94 */                this.code = -1;
/* 95 */                this.headers = new Headers.Builder();
                    }
                }
            }
