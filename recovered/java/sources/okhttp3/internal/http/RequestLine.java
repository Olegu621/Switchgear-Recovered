            package okhttp3.internal.http;

            import java.net.Proxy;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import okhttp3.Request;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, m6176d2 = {"Lokhttp3/internal/http/RequestLine;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "get", HttpUrl.FRAGMENT_ENCODE_SET, "request", "Lokhttp3/Request;", "proxyType", "Ljava/net/Proxy$Type;", "includeAuthorityInRequestLine", HttpUrl.FRAGMENT_ENCODE_SET, "requestPath", "url", "Lokhttp3/HttpUrl;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class RequestLine {
                public static final RequestLine INSTANCE = new RequestLine();

                private RequestLine() {
                }

                private final boolean includeAuthorityInRequestLine(Request request, Proxy.Type proxyType) {
                    return !request.isHttps() && proxyType == Proxy.Type.HTTP;
                }

                public final String get(Request request, Proxy.Type proxyType) {
/* 1 */             request.getClass();
/* 4 */             proxyType.getClass();
/* 9 */             StringBuilder sb = new StringBuilder();
/* 16 */            sb.append(request.method());
/* 21 */            sb.append(' ');
/* 24 */            RequestLine requestLine = INSTANCE;
/* 30 */            if (requestLine.includeAuthorityInRequestLine(request, proxyType)) {
/* 36 */                sb.append(request.url());
                    } else {
/* 48 */                sb.append(requestLine.requestPath(request.url()));
                    }
/* 53 */            sb.append(" HTTP/1.1");
/* 56 */            return sb.toString();
                }

                public final String requestPath(HttpUrl url) {
/* 1 */             url.getClass();
/* 4 */             String strEncodedPath = url.encodedPath();
/* 8 */             String strEncodedQuery = url.encodedQuery();
/* 12 */            if (strEncodedQuery == null) {
/* 34 */                return strEncodedPath;
                    }
/* 30 */            return strEncodedPath + '?' + ((Object) strEncodedQuery);
                }
            }
