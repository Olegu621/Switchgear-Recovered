            package okhttp3.internal;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import javax.net.ssl.SSLSocket;
            import kotlin.Metadata;
            import okhttp3.Cache;
            import okhttp3.ConnectionSpec;
            import okhttp3.Cookie;
            import okhttp3.Headers;
            import okhttp3.HttpUrl;
            import okhttp3.Request;
            import okhttp3.Response;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014\u001a\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e\u001a \u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004¨\u0006\u001f"}, m6176d2 = {"addHeaderLenient", "Lokhttp3/Headers$Builder;", "builder", "line", HttpUrl.FRAGMENT_ENCODE_SET, "name", FirebaseAnalytics.Param.VALUE, "applyConnectionSpec", HttpUrl.FRAGMENT_ENCODE_SET, "connectionSpec", "Lokhttp3/ConnectionSpec;", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "isFallback", HttpUrl.FRAGMENT_ENCODE_SET, "cacheGet", "Lokhttp3/Response;", "cache", "Lokhttp3/Cache;", "request", "Lokhttp3/Request;", "cookieToString", "cookie", "Lokhttp3/Cookie;", "forObsoleteRfc2965", "parseCookie", "currentTimeMillis", HttpUrl.FRAGMENT_ENCODE_SET, "url", "Lokhttp3/HttpUrl;", "setCookie", "okhttp"}, m6177k = 2, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 13 */    public final class Internal {
                public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str, String str2) {
/* 1 */             builder.getClass();
/* 4 */             str.getClass();
/* 7 */             str2.getClass();
/* 10 */            return builder.addLenient$okhttp(str, str2);
                }

                public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z) {
/* 1 */             connectionSpec.getClass();
/* 4 */             sSLSocket.getClass();
/* 7 */             connectionSpec.apply$okhttp(sSLSocket, z);
                }

                public static final Response cacheGet(Cache cache, Request request) {
/* 1 */             cache.getClass();
/* 4 */             request.getClass();
/* 7 */             return cache.get$okhttp(request);
                }

                public static final String cookieToString(Cookie cookie, boolean z) {
/* 1 */             cookie.getClass();
/* 4 */             return cookie.toString$okhttp(z);
                }

                public static final Cookie parseCookie(long j, HttpUrl httpUrl, String str) {
/* 1 */             httpUrl.getClass();
/* 4 */             str.getClass();
/* 9 */             return Cookie.INSTANCE.parse$okhttp(j, httpUrl, str);
                }

/* 14 */        public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str) {
                    builder.getClass();
                    str.getClass();
/* 15 */            return builder.addLenient$okhttp(str);
                }
            }
