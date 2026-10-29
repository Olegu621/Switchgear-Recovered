            package okhttp3;

            import java.net.Proxy;
            import java.net.ProxySelector;
            import java.time.Duration;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Random;
            import java.util.concurrent.TimeUnit;
            import javax.net.SocketFactory;
            import javax.net.ssl.HostnameVerifier;
            import javax.net.ssl.SSLSocketFactory;
            import javax.net.ssl.X509TrustManager;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.internal.Util;
            import okhttp3.internal.concurrent.TaskRunner;
            import okhttp3.internal.connection.RealCall;
            import okhttp3.internal.connection.RouteDatabase;
            import okhttp3.internal.p013ws.RealWebSocket;
            import okhttp3.internal.platform.Platform;
            import okhttp3.internal.proxy.NullProxySelector;
            import okhttp3.internal.tls.CertificateChainCleaner;
            import okhttp3.internal.tls.OkHostnameVerifier;
            import p000.C1951n4;
            import p000.C2270uw;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002xyB\u0007\b\u0016¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\bSJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\bTJ\r\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\bUJ\r\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\bVJ\r\u0010\u0017\u001a\u00020\u000fH\u0007¢\u0006\u0002\bWJ\r\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\bXJ\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007¢\u0006\u0002\bYJ\r\u0010\u001f\u001a\u00020 H\u0007¢\u0006\u0002\bZJ\r\u0010\"\u001a\u00020#H\u0007¢\u0006\u0002\b[J\r\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\b\\J\r\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\b]J\r\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\b^J\r\u0010.\u001a\u00020,H\u0007¢\u0006\u0002\b_J\r\u0010/\u001a\u000200H\u0007¢\u0006\u0002\b`J\u0013\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001cH\u0007¢\u0006\u0002\baJ\u0013\u00107\u001a\b\u0012\u0004\u0012\u0002030\u001cH\u0007¢\u0006\u0002\bbJ\b\u0010c\u001a\u00020\u0006H\u0016J\u0010\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020gH\u0016J\u0018\u0010h\u001a\u00020i2\u0006\u0010f\u001a\u00020g2\u0006\u0010j\u001a\u00020kH\u0016J\r\u00108\u001a\u00020\u000fH\u0007¢\u0006\u0002\blJ\u0013\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u001cH\u0007¢\u0006\u0002\bmJ\u000f\u0010;\u001a\u0004\u0018\u00010<H\u0007¢\u0006\u0002\bnJ\r\u0010>\u001a\u00020\tH\u0007¢\u0006\u0002\boJ\r\u0010?\u001a\u00020@H\u0007¢\u0006\u0002\bpJ\r\u0010B\u001a\u00020\u000fH\u0007¢\u0006\u0002\bqJ\r\u0010C\u001a\u00020,H\u0007¢\u0006\u0002\brJ\r\u0010H\u001a\u00020IH\u0007¢\u0006\u0002\bsJ\r\u0010K\u001a\u00020LH\u0007¢\u0006\u0002\btJ\b\u0010u\u001a\u00020vH\u0002J\r\u0010O\u001a\u00020\u000fH\u0007¢\u0006\u0002\bwR\u0013\u0010\b\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f8G¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0013\u0010\u000e\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00128G¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u0013\u0010\u0014\u001a\u00020\u00158G¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0016R\u0013\u0010\u0017\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u0018\u001a\u00020\u00198G¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001eR\u0013\u0010\u001f\u001a\u00020 8G¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010!R\u0013\u0010\"\u001a\u00020#8G¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010$R\u0013\u0010%\u001a\u00020&8G¢\u0006\b\n\u0000\u001a\u0004\b%\u0010'R\u0013\u0010(\u001a\u00020)8G¢\u0006\b\n\u0000\u001a\u0004\b(\u0010*R\u0013\u0010+\u001a\u00020,8G¢\u0006\b\n\u0000\u001a\u0004\b+\u0010-R\u0013\u0010.\u001a\u00020,8G¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010/\u001a\u0002008G¢\u0006\b\n\u0000\u001a\u0004\b/\u00101R\u0019\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0013\u00104\u001a\u0002058G¢\u0006\b\n\u0000\u001a\u0004\b4\u00106R\u0019\u00107\u001a\b\u0012\u0004\u0012\u0002030\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001eR\u0013\u00108\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0010R\u0019\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001eR\u0015\u0010;\u001a\u0004\u0018\u00010<8G¢\u0006\b\n\u0000\u001a\u0004\b;\u0010=R\u0013\u0010>\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\nR\u0013\u0010?\u001a\u00020@8G¢\u0006\b\n\u0000\u001a\u0004\b?\u0010AR\u0013\u0010B\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0010R\u0013\u0010C\u001a\u00020,8G¢\u0006\b\n\u0000\u001a\u0004\bC\u0010-R\u0011\u0010D\u001a\u00020E¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010H\u001a\u00020I8G¢\u0006\b\n\u0000\u001a\u0004\bH\u0010JR\u0011\u0010K\u001a\u00020L8G¢\u0006\u0006\u001a\u0004\bK\u0010MR\u0010\u0010N\u001a\u0004\u0018\u00010LX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010O\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0010R\u0015\u0010P\u001a\u0004\u0018\u00010Q8G¢\u0006\b\n\u0000\u001a\u0004\bP\u0010R¨\u0006z"}, m6176d2 = {"Lokhttp3/OkHttpClient;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "()V", "builder", "Lokhttp3/OkHttpClient$Builder;", "(Lokhttp3/OkHttpClient$Builder;)V", "authenticator", "Lokhttp3/Authenticator;", "()Lokhttp3/Authenticator;", "cache", "Lokhttp3/Cache;", "()Lokhttp3/Cache;", "callTimeoutMillis", HttpUrl.FRAGMENT_ENCODE_SET, "()I", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "certificatePinner", "Lokhttp3/CertificatePinner;", "()Lokhttp3/CertificatePinner;", "connectTimeoutMillis", "connectionPool", "Lokhttp3/ConnectionPool;", "()Lokhttp3/ConnectionPool;", "connectionSpecs", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/ConnectionSpec;", "()Ljava/util/List;", "cookieJar", "Lokhttp3/CookieJar;", "()Lokhttp3/CookieJar;", "dispatcher", "Lokhttp3/Dispatcher;", "()Lokhttp3/Dispatcher;", "dns", "Lokhttp3/Dns;", "()Lokhttp3/Dns;", "eventListenerFactory", "Lokhttp3/EventListener$Factory;", "()Lokhttp3/EventListener$Factory;", "followRedirects", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "followSslRedirects", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "interceptors", "Lokhttp3/Interceptor;", "minWebSocketMessageToCompress", HttpUrl.FRAGMENT_ENCODE_SET, "()J", "networkInterceptors", "pingIntervalMillis", "protocols", "Lokhttp3/Protocol;", "proxy", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxyAuthenticator", "proxySelector", "Ljava/net/ProxySelector;", "()Ljava/net/ProxySelector;", "readTimeoutMillis", "retryOnConnectionFailure", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase", "()Lokhttp3/internal/connection/RouteDatabase;", "socketFactory", "Ljavax/net/SocketFactory;", "()Ljavax/net/SocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "writeTimeoutMillis", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "-deprecated_authenticator", "-deprecated_cache", "-deprecated_callTimeoutMillis", "-deprecated_certificatePinner", "-deprecated_connectTimeoutMillis", "-deprecated_connectionPool", "-deprecated_connectionSpecs", "-deprecated_cookieJar", "-deprecated_dispatcher", "-deprecated_dns", "-deprecated_eventListenerFactory", "-deprecated_followRedirects", "-deprecated_followSslRedirects", "-deprecated_hostnameVerifier", "-deprecated_interceptors", "-deprecated_networkInterceptors", "newBuilder", "newCall", "Lokhttp3/Call;", "request", "Lokhttp3/Request;", "newWebSocket", "Lokhttp3/WebSocket;", "listener", "Lokhttp3/WebSocketListener;", "-deprecated_pingIntervalMillis", "-deprecated_protocols", "-deprecated_proxy", "-deprecated_proxyAuthenticator", "-deprecated_proxySelector", "-deprecated_readTimeoutMillis", "-deprecated_retryOnConnectionFailure", "-deprecated_socketFactory", "-deprecated_sslSocketFactory", "verifyClientState", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_writeTimeoutMillis", "Builder", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
                private final Authenticator authenticator;
                private final Cache cache;
                private final int callTimeoutMillis;
                private final CertificateChainCleaner certificateChainCleaner;
                private final CertificatePinner certificatePinner;
                private final int connectTimeoutMillis;
                private final ConnectionPool connectionPool;
                private final List<ConnectionSpec> connectionSpecs;
                private final CookieJar cookieJar;
                private final Dispatcher dispatcher;
                private final Dns dns;
                private final EventListener.Factory eventListenerFactory;
                private final boolean followRedirects;
                private final boolean followSslRedirects;
                private final HostnameVerifier hostnameVerifier;
                private final List<Interceptor> interceptors;
                private final long minWebSocketMessageToCompress;
                private final List<Interceptor> networkInterceptors;
                private final int pingIntervalMillis;
                private final List<Protocol> protocols;
                private final Proxy proxy;
                private final Authenticator proxyAuthenticator;
                private final ProxySelector proxySelector;
                private final int readTimeoutMillis;
                private final boolean retryOnConnectionFailure;
                private final RouteDatabase routeDatabase;
                private final SocketFactory socketFactory;
                private final SSLSocketFactory sslSocketFactoryOrNull;
                private final int writeTimeoutMillis;
                private final X509TrustManager x509TrustManager;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
                private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);

                public OkHttpClient(Builder builder) {
                    ProxySelector proxySelector;
/* 1 */             builder.getClass();
/* 11 */            this.dispatcher = builder.getDispatcher();
/* 17 */            this.connectionPool = builder.getConnectionPool();
/* 27 */            this.interceptors = Util.toImmutableList(builder.getInterceptors$okhttp());
/* 37 */            this.networkInterceptors = Util.toImmutableList(builder.getNetworkInterceptors$okhttp());
/* 43 */            this.eventListenerFactory = builder.getEventListenerFactory();
/* 49 */            this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure();
/* 55 */            this.authenticator = builder.getAuthenticator();
/* 61 */            this.followRedirects = builder.getFollowRedirects();
/* 67 */            this.followSslRedirects = builder.getFollowSslRedirects();
/* 73 */            this.cookieJar = builder.getCookieJar();
/* 79 */            this.cache = builder.getCache();
/* 85 */            this.dns = builder.getDns();
/* 91 */            this.proxy = builder.getProxy();
/* 97 */            if (builder.getProxy() != null) {
/* 99 */                proxySelector = NullProxySelector.INSTANCE;
                    } else {
/* 102 */               proxySelector = builder.getProxySelector();
/* 108 */               proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
/* 112 */               if (proxySelector == null) {
/* 114 */                   proxySelector = NullProxySelector.INSTANCE;
                        }
                    }
/* 116 */           this.proxySelector = proxySelector;
/* 122 */           this.proxyAuthenticator = builder.getProxyAuthenticator();
/* 128 */           this.socketFactory = builder.getSocketFactory();
/* 130 */           List<ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
/* 134 */           this.connectionSpecs = connectionSpecs$okhttp;
/* 140 */           this.protocols = builder.getProtocols$okhttp();
/* 146 */           this.hostnameVerifier = builder.getHostnameVerifier();
/* 152 */           this.callTimeoutMillis = builder.getCallTimeout();
/* 158 */           this.connectTimeoutMillis = builder.getConnectTimeout();
/* 164 */           this.readTimeoutMillis = builder.getReadTimeout();
/* 170 */           this.writeTimeoutMillis = builder.getWriteTimeout();
/* 176 */           this.pingIntervalMillis = builder.getPingInterval();
/* 182 */           this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress();
/* 184 */           RouteDatabase routeDatabase = builder.getRouteDatabase();
/* 195 */           this.routeDatabase = routeDatabase == null ? new RouteDatabase() : routeDatabase;
/* 197 */           if (connectionSpecs$okhttp == null || !connectionSpecs$okhttp.isEmpty()) {
/* 206 */               Iterator<T> it = connectionSpecs$okhttp.iterator();
/* 214 */               while (it.hasNext()) {
/* 226 */                   if (((ConnectionSpec) it.next()).getIsTls()) {
/* 232 */                       if (builder.getSslSocketFactoryOrNull() != null) {
/* 238 */                           this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull();
/* 240 */                           CertificateChainCleaner certificateChainCleaner = builder.getCertificateChainCleaner();
/* 244 */                           certificateChainCleaner.getClass();
/* 247 */                           this.certificateChainCleaner = certificateChainCleaner;
/* 249 */                           X509TrustManager x509TrustManagerOrNull = builder.getX509TrustManagerOrNull();
/* 253 */                           x509TrustManagerOrNull.getClass();
/* 256 */                           this.x509TrustManager = x509TrustManagerOrNull;
/* 266 */                           this.certificatePinner = builder.getCertificatePinner().withCertificateChainCleaner$okhttp(certificateChainCleaner);
                                } else {
/* 269 */                           Platform.Companion companion = Platform.INSTANCE;
/* 275 */                           X509TrustManager x509TrustManagerPlatformTrustManager = companion.get().platformTrustManager();
/* 279 */                           this.x509TrustManager = x509TrustManagerPlatformTrustManager;
/* 281 */                           Platform platform = companion.get();
/* 285 */                           x509TrustManagerPlatformTrustManager.getClass();
/* 292 */                           this.sslSocketFactoryOrNull = platform.newSslSocketFactory(x509TrustManagerPlatformTrustManager);
/* 294 */                           CertificateChainCleaner.Companion companion2 = CertificateChainCleaner.INSTANCE;
/* 296 */                           x509TrustManagerPlatformTrustManager.getClass();
/* 299 */                           CertificateChainCleaner certificateChainCleaner2 = companion2.get(x509TrustManagerPlatformTrustManager);
/* 303 */                           this.certificateChainCleaner = certificateChainCleaner2;
/* 305 */                           CertificatePinner certificatePinner = builder.getCertificatePinner();
/* 309 */                           certificateChainCleaner2.getClass();
/* 316 */                           this.certificatePinner = certificatePinner.withCertificateChainCleaner$okhttp(certificateChainCleaner2);
                                }
                            }
                        }
/* 320 */               this.sslSocketFactoryOrNull = null;
/* 322 */               this.certificateChainCleaner = null;
/* 324 */               this.x509TrustManager = null;
/* 328 */               this.certificatePinner = CertificatePinner.DEFAULT;
                    } else {
/* 320 */               this.sslSocketFactoryOrNull = null;
/* 322 */               this.certificateChainCleaner = null;
/* 324 */               this.x509TrustManager = null;
/* 328 */               this.certificatePinner = CertificatePinner.DEFAULT;
                    }
/* 330 */           verifyClientState();
                }

                private final void verifyClientState() {
/* 8 */             if (this.interceptors.contains(null)) {
/* 147 */               ds0.m3190g(Intrinsics.m6219d(interceptors(), "Null interceptor: "));
/* 150 */               return;
                    }
/* 16 */            if (this.networkInterceptors.contains(null)) {
/* 133 */               ds0.m3190g(Intrinsics.m6219d(networkInterceptors(), "Null network interceptor: "));
/* 136 */               return;
                    }
/* 18 */            List<ConnectionSpec> list = this.connectionSpecs;
/* 20 */            if (list == null || !list.isEmpty()) {
/* 29 */                Iterator<T> it = list.iterator();
/* 37 */                while (it.hasNext()) {
/* 49 */                    if (((ConnectionSpec) it.next()).getIsTls()) {
/* 53 */                        if (this.sslSocketFactoryOrNull == null) {
/* 78 */                            f42.m3656l("sslSocketFactory == null");
/* 81 */                            return;
                                } else if (this.certificateChainCleaner == null) {
/* 72 */                            f42.m3656l("certificateChainCleaner == null");
/* 75 */                            return;
                                } else {
/* 61 */                            if (this.x509TrustManager != null) {
/* 106 */                               return;
                                    }
/* 66 */                            f42.m3656l("x509TrustManager == null");
/* 69 */                            return;
                                }
                            }
                        }
                    }
/* 86 */            if (this.sslSocketFactoryOrNull != null) {
/* 119 */               f42.m3656l("Check failed.");
/* 122 */               return;
                    }
/* 90 */            if (this.certificateChainCleaner != null) {
/* 115 */               f42.m3656l("Check failed.");
                    } else if (this.x509TrustManager != null) {
/* 111 */               f42.m3656l("Check failed.");
                    } else {
/* 104 */               if (Intrinsics.m6216a(this.certificatePinner, CertificatePinner.DEFAULT)) {
/* 106 */                   return;
                        }
/* 107 */               f42.m3656l("Check failed.");
                    }
                }

                /* JADX INFO: renamed from: -deprecated_authenticator, reason: not valid java name and from getter */
                public final Authenticator getAuthenticator() {
/* 1 */             return this.authenticator;
                }

                /* JADX INFO: renamed from: -deprecated_cache, reason: not valid java name and from getter */
                public final Cache getCache() {
/* 1 */             return this.cache;
                }

                /* JADX INFO: renamed from: -deprecated_callTimeoutMillis, reason: not valid java name and from getter */
                public final int getCallTimeoutMillis() {
/* 1 */             return this.callTimeoutMillis;
                }

                /* JADX INFO: renamed from: -deprecated_certificatePinner, reason: not valid java name and from getter */
                public final CertificatePinner getCertificatePinner() {
/* 1 */             return this.certificatePinner;
                }

                /* JADX INFO: renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name and from getter */
                public final int getConnectTimeoutMillis() {
/* 1 */             return this.connectTimeoutMillis;
                }

                /* JADX INFO: renamed from: -deprecated_connectionPool, reason: not valid java name and from getter */
                public final ConnectionPool getConnectionPool() {
/* 1 */             return this.connectionPool;
                }

                /* JADX INFO: renamed from: -deprecated_connectionSpecs, reason: not valid java name */
                public final List<ConnectionSpec> m10590deprecated_connectionSpecs() {
/* 1 */             return this.connectionSpecs;
                }

                /* JADX INFO: renamed from: -deprecated_cookieJar, reason: not valid java name and from getter */
                public final CookieJar getCookieJar() {
/* 1 */             return this.cookieJar;
                }

                /* JADX INFO: renamed from: -deprecated_dispatcher, reason: not valid java name and from getter */
                public final Dispatcher getDispatcher() {
/* 1 */             return this.dispatcher;
                }

                /* JADX INFO: renamed from: -deprecated_dns, reason: not valid java name and from getter */
                public final Dns getDns() {
/* 1 */             return this.dns;
                }

                /* JADX INFO: renamed from: -deprecated_eventListenerFactory, reason: not valid java name and from getter */
                public final EventListener.Factory getEventListenerFactory() {
/* 1 */             return this.eventListenerFactory;
                }

                /* JADX INFO: renamed from: -deprecated_followRedirects, reason: not valid java name and from getter */
                public final boolean getFollowRedirects() {
/* 1 */             return this.followRedirects;
                }

                /* JADX INFO: renamed from: -deprecated_followSslRedirects, reason: not valid java name and from getter */
                public final boolean getFollowSslRedirects() {
/* 1 */             return this.followSslRedirects;
                }

                /* JADX INFO: renamed from: -deprecated_hostnameVerifier, reason: not valid java name and from getter */
                public final HostnameVerifier getHostnameVerifier() {
/* 1 */             return this.hostnameVerifier;
                }

                /* JADX INFO: renamed from: -deprecated_interceptors, reason: not valid java name */
                public final List<Interceptor> m10598deprecated_interceptors() {
/* 1 */             return this.interceptors;
                }

                /* JADX INFO: renamed from: -deprecated_networkInterceptors, reason: not valid java name */
                public final List<Interceptor> m10599deprecated_networkInterceptors() {
/* 1 */             return this.networkInterceptors;
                }

                /* JADX INFO: renamed from: -deprecated_pingIntervalMillis, reason: not valid java name and from getter */
                public final int getPingIntervalMillis() {
/* 1 */             return this.pingIntervalMillis;
                }

                /* JADX INFO: renamed from: -deprecated_protocols, reason: not valid java name */
                public final List<Protocol> m10601deprecated_protocols() {
/* 1 */             return this.protocols;
                }

                /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name and from getter */
                public final Proxy getProxy() {
/* 1 */             return this.proxy;
                }

                /* JADX INFO: renamed from: -deprecated_proxyAuthenticator, reason: not valid java name and from getter */
                public final Authenticator getProxyAuthenticator() {
/* 1 */             return this.proxyAuthenticator;
                }

                /* JADX INFO: renamed from: -deprecated_proxySelector, reason: not valid java name and from getter */
                public final ProxySelector getProxySelector() {
/* 1 */             return this.proxySelector;
                }

                /* JADX INFO: renamed from: -deprecated_readTimeoutMillis, reason: not valid java name and from getter */
                public final int getReadTimeoutMillis() {
/* 1 */             return this.readTimeoutMillis;
                }

                /* JADX INFO: renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name and from getter */
                public final boolean getRetryOnConnectionFailure() {
/* 1 */             return this.retryOnConnectionFailure;
                }

                /* JADX INFO: renamed from: -deprecated_socketFactory, reason: not valid java name and from getter */
                public final SocketFactory getSocketFactory() {
/* 1 */             return this.socketFactory;
                }

                /* JADX INFO: renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
                public final SSLSocketFactory m10608deprecated_sslSocketFactory() {
/* 1 */             return sslSocketFactory();
                }

                /* JADX INFO: renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name and from getter */
                public final int getWriteTimeoutMillis() {
/* 1 */             return this.writeTimeoutMillis;
                }

                public final Authenticator authenticator() {
/* 1 */             return this.authenticator;
                }

                public final Cache cache() {
/* 1 */             return this.cache;
                }

                public final int callTimeoutMillis() {
/* 1 */             return this.callTimeoutMillis;
                }

                /* JADX INFO: renamed from: certificateChainCleaner, reason: from getter */
                public final CertificateChainCleaner getCertificateChainCleaner() {
/* 1 */             return this.certificateChainCleaner;
                }

                public final CertificatePinner certificatePinner() {
/* 1 */             return this.certificatePinner;
                }

                public Object clone() {
/* 1 */             return super.clone();
                }

                public final int connectTimeoutMillis() {
/* 1 */             return this.connectTimeoutMillis;
                }

                public final ConnectionPool connectionPool() {
/* 1 */             return this.connectionPool;
                }

                public final List<ConnectionSpec> connectionSpecs() {
/* 1 */             return this.connectionSpecs;
                }

                public final CookieJar cookieJar() {
/* 1 */             return this.cookieJar;
                }

                public final Dispatcher dispatcher() {
/* 1 */             return this.dispatcher;
                }

                public final Dns dns() {
/* 1 */             return this.dns;
                }

                public final EventListener.Factory eventListenerFactory() {
/* 1 */             return this.eventListenerFactory;
                }

                public final boolean followRedirects() {
/* 1 */             return this.followRedirects;
                }

                public final boolean followSslRedirects() {
/* 1 */             return this.followSslRedirects;
                }

                public final RouteDatabase getRouteDatabase() {
/* 1 */             return this.routeDatabase;
                }

                public final HostnameVerifier hostnameVerifier() {
/* 1 */             return this.hostnameVerifier;
                }

                public final List<Interceptor> interceptors() {
/* 1 */             return this.interceptors;
                }

                /* JADX INFO: renamed from: minWebSocketMessageToCompress, reason: from getter */
                public final long getMinWebSocketMessageToCompress() {
/* 1 */             return this.minWebSocketMessageToCompress;
                }

                public final List<Interceptor> networkInterceptors() {
/* 1 */             return this.networkInterceptors;
                }

                public Builder newBuilder() {
/* 3 */             return new Builder(this);
                }

                @Override // okhttp3.Call.Factory
                public Call newCall(Request request) {
/* 1 */             request.getClass();
/* 7 */             return new RealCall(this, request, false);
                }

                @Override // okhttp3.WebSocket.Factory
                public WebSocket newWebSocket(Request request, WebSocketListener listener) {
/* 1 */             request.getClass();
/* 4 */             listener.getClass();
/* 24 */            RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.INSTANCE, request, listener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
/* 27 */            realWebSocket.connect(this);
/* 30 */            return realWebSocket;
                }

                public final int pingIntervalMillis() {
/* 1 */             return this.pingIntervalMillis;
                }

                public final List<Protocol> protocols() {
/* 1 */             return this.protocols;
                }

                public final Proxy proxy() {
/* 1 */             return this.proxy;
                }

                public final Authenticator proxyAuthenticator() {
/* 1 */             return this.proxyAuthenticator;
                }

                public final ProxySelector proxySelector() {
/* 1 */             return this.proxySelector;
                }

                public final int readTimeoutMillis() {
/* 1 */             return this.readTimeoutMillis;
                }

                public final boolean retryOnConnectionFailure() {
/* 1 */             return this.retryOnConnectionFailure;
                }

                public final SocketFactory socketFactory() {
/* 1 */             return this.socketFactory;
                }

                public final SSLSocketFactory sslSocketFactory() {
/* 1 */             SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
/* 3 */             if (sSLSocketFactory != null) {
/* 5 */                 return sSLSocketFactory;
                    }
/* 8 */             f42.m3656l("CLEARTEXT-only client");
/* 11 */            return null;
                }

                public final int writeTimeoutMillis() {
/* 1 */             return this.writeTimeoutMillis;
                }

                /* JADX INFO: renamed from: x509TrustManager, reason: from getter */
                public final X509TrustManager getX509TrustManager() {
/* 1 */             return this.x509TrustManager;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, m6176d2 = {"Lokhttp3/OkHttpClient$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "DEFAULT_CONNECTION_SPECS", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/ConnectionSpec;", "getDEFAULT_CONNECTION_SPECS$okhttp", "()Ljava/util/List;", "DEFAULT_PROTOCOLS", "Lokhttp3/Protocol;", "getDEFAULT_PROTOCOLS$okhttp", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
/* 1 */                 return OkHttpClient.DEFAULT_CONNECTION_SPECS;
                    }

                    public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
/* 1 */                 return OkHttpClient.DEFAULT_PROTOCOLS;
                    }

/* 4 */             private Companion() {
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bg\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0012\u001a\u00020\u00002\u0014\b\u0004\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001a\u0010\u0010J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0013J)\u0010\u001b\u001a\u00020\u00002\u0014\b\u0004\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0019J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020#¢\u0006\u0004\b)\u0010%J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020#¢\u0006\u0004\b+\u0010%J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020&¢\u0006\u0004\b;\u0010(J\u0015\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?H\u0007¢\u0006\u0004\b@\u0010AJ\u001d\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\b@\u0010DJ\u001b\u0010G\u001a\u00020\u00002\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E¢\u0006\u0004\bG\u0010HJ\u001b\u0010J\u001a\u00020\u00002\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0E¢\u0006\u0004\bJ\u0010HJ\u0015\u0010L\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\u00002\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bO\u0010PJ\u001d\u0010U\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bU\u0010VJ\u0017\u0010U\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\bU\u0010YJ\u001d\u0010Z\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bZ\u0010VJ\u0017\u0010Z\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\bZ\u0010YJ\u001d\u0010[\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\b[\u0010VJ\u0017\u0010[\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\b[\u0010YJ\u001d\u0010\\\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\b\\\u0010VJ\u0017\u0010\\\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\b\\\u0010YJ\u001d\u0010^\u001a\u00020\u00002\u0006\u0010]\u001a\u00020Q2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\b^\u0010VJ\u0017\u0010^\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\b^\u0010YJ\u0015\u0010`\u001a\u00020\u00002\u0006\u0010_\u001a\u00020Q¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\u0004¢\u0006\u0004\bb\u0010cR\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010n\u001a\u0004\bo\u0010\u0010R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010n\u001a\u0004\bp\u0010\u0010R\"\u0010!\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010$\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR$\u0010)\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b)\u0010v\u001a\u0005\b\u0080\u0001\u0010x\"\u0005\b\u0081\u0001\u0010zR$\u0010+\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b+\u0010v\u001a\u0005\b\u0082\u0001\u0010x\"\u0005\b\u0083\u0001\u0010zR'\u0010-\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b-\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R)\u00100\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b0\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R'\u00103\u001a\u0002028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b3\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R)\u00106\u001a\u0004\u0018\u0001058\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b6\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R)\u00109\u001a\u0004\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b9\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R$\u0010;\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b;\u0010{\u001a\u0005\b\u009d\u0001\u0010}\"\u0005\b\u009e\u0001\u0010\u007fR'\u0010=\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b=\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R+\u0010¤\u0001\u001a\u0004\u0018\u00010?8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R+\u0010ª\u0001\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R+\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bG\u0010n\u001a\u0005\b°\u0001\u0010\u0010\"\u0006\b±\u0001\u0010²\u0001R+\u0010J\u001a\b\u0012\u0004\u0012\u00020I0E8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bJ\u0010n\u001a\u0005\b³\u0001\u0010\u0010\"\u0006\b´\u0001\u0010²\u0001R'\u0010L\u001a\u00020K8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bL\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R'\u0010O\u001a\u00020N8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bO\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R,\u0010À\u0001\u001a\u0005\u0018\u00010¿\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R(\u0010U\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bU\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R(\u0010Z\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bZ\u0010Ç\u0001\u001a\u0006\bÌ\u0001\u0010É\u0001\"\u0006\bÍ\u0001\u0010Ë\u0001R(\u0010[\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b[\u0010Ç\u0001\u001a\u0006\bÎ\u0001\u0010É\u0001\"\u0006\bÏ\u0001\u0010Ë\u0001R(\u0010\\\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\\\u0010Ç\u0001\u001a\u0006\bÐ\u0001\u0010É\u0001\"\u0006\bÑ\u0001\u0010Ë\u0001R(\u0010^\u001a\u00030Æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b^\u0010Ç\u0001\u001a\u0006\bÒ\u0001\u0010É\u0001\"\u0006\bÓ\u0001\u0010Ë\u0001R'\u0010`\u001a\u00020Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b`\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R,\u0010Ú\u0001\u001a\u0005\u0018\u00010Ù\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006à\u0001"}, m6176d2 = {"Lokhttp3/OkHttpClient$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Dispatcher;", "dispatcher", "(Lokhttp3/Dispatcher;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/ConnectionPool;", "connectionPool", "(Lokhttp3/ConnectionPool;)Lokhttp3/OkHttpClient$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Interceptor;", "interceptors", "()Ljava/util/List;", "interceptor", "addInterceptor", "(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lokhttp3/Response;", "block", "-addInterceptor", "(Lkotlin/jvm/functions/Function1;)Lokhttp3/OkHttpClient$Builder;", "networkInterceptors", "addNetworkInterceptor", "-addNetworkInterceptor", "Lokhttp3/EventListener;", "eventListener", "(Lokhttp3/EventListener;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/EventListener$Factory;", "eventListenerFactory", "(Lokhttp3/EventListener$Factory;)Lokhttp3/OkHttpClient$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "retryOnConnectionFailure", "(Z)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Authenticator;", "authenticator", "(Lokhttp3/Authenticator;)Lokhttp3/OkHttpClient$Builder;", "followRedirects", "followProtocolRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "cookieJar", "(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Cache;", "cache", "(Lokhttp3/Cache;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Dns;", "dns", "(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;", "Ljava/net/Proxy;", "proxy", "(Ljava/net/Proxy;)Lokhttp3/OkHttpClient$Builder;", "Ljava/net/ProxySelector;", "proxySelector", "(Ljava/net/ProxySelector;)Lokhttp3/OkHttpClient$Builder;", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "socketFactory", "(Ljavax/net/SocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/ConnectionSpec;", "connectionSpecs", "(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Protocol;", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/CertificatePinner;", "certificatePinner", "(Lokhttp3/CertificatePinner;)Lokhttp3/OkHttpClient$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "callTimeout", "(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;", "Ljava/time/Duration;", "duration", "(Ljava/time/Duration;)Lokhttp3/OkHttpClient$Builder;", "connectTimeout", "readTimeout", "writeTimeout", "interval", "pingInterval", "bytes", "minWebSocketMessageToCompress", "(J)Lokhttp3/OkHttpClient$Builder;", "build", "()Lokhttp3/OkHttpClient;", "Lokhttp3/Dispatcher;", "getDispatcher$okhttp", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "Lokhttp3/ConnectionPool;", "getConnectionPool$okhttp", "()Lokhttp3/ConnectionPool;", "setConnectionPool$okhttp", "(Lokhttp3/ConnectionPool;)V", "Ljava/util/List;", "getInterceptors$okhttp", "getNetworkInterceptors$okhttp", "Lokhttp3/EventListener$Factory;", "getEventListenerFactory$okhttp", "()Lokhttp3/EventListener$Factory;", "setEventListenerFactory$okhttp", "(Lokhttp3/EventListener$Factory;)V", "Z", "getRetryOnConnectionFailure$okhttp", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "Lokhttp3/Authenticator;", "getAuthenticator$okhttp", "()Lokhttp3/Authenticator;", "setAuthenticator$okhttp", "(Lokhttp3/Authenticator;)V", "getFollowRedirects$okhttp", "setFollowRedirects$okhttp", "getFollowSslRedirects$okhttp", "setFollowSslRedirects$okhttp", "Lokhttp3/CookieJar;", "getCookieJar$okhttp", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "setCache$okhttp", "(Lokhttp3/Cache;)V", "Lokhttp3/Dns;", "getDns$okhttp", "()Lokhttp3/Dns;", "setDns$okhttp", "(Lokhttp3/Dns;)V", "Ljava/net/Proxy;", "getProxy$okhttp", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "getProxySelector$okhttp", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "getProxyAuthenticator$okhttp", "setProxyAuthenticator$okhttp", "Ljavax/net/SocketFactory;", "getSocketFactory$okhttp", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "x509TrustManagerOrNull", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManagerOrNull$okhttp", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "getConnectionSpecs$okhttp", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "getProtocols$okhttp", "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier$okhttp", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lokhttp3/CertificatePinner;", "getCertificatePinner$okhttp", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "setCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)V", HttpUrl.FRAGMENT_ENCODE_SET, "I", "getCallTimeout$okhttp", "()I", "setCallTimeout$okhttp", "(I)V", "getConnectTimeout$okhttp", "setConnectTimeout$okhttp", "getReadTimeout$okhttp", "setReadTimeout$okhttp", "getWriteTimeout$okhttp", "setWriteTimeout$okhttp", "getPingInterval$okhttp", "setPingInterval$okhttp", "J", "getMinWebSocketMessageToCompress$okhttp", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lokhttp3/internal/connection/RouteDatabase;", "setRouteDatabase$okhttp", "(Lokhttp3/internal/connection/RouteDatabase;)V", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 12 */        public static final class Builder {
                    private Authenticator authenticator;
                    private Cache cache;
                    private int callTimeout;
                    private CertificateChainCleaner certificateChainCleaner;
                    private CertificatePinner certificatePinner;
                    private int connectTimeout;
                    private ConnectionPool connectionPool;
                    private List<ConnectionSpec> connectionSpecs;
                    private CookieJar cookieJar;
                    private Dispatcher dispatcher;
                    private Dns dns;
                    private EventListener.Factory eventListenerFactory;
                    private boolean followRedirects;
                    private boolean followSslRedirects;
                    private HostnameVerifier hostnameVerifier;
                    private final List<Interceptor> interceptors;
                    private long minWebSocketMessageToCompress;
                    private final List<Interceptor> networkInterceptors;
                    private int pingInterval;
                    private List<? extends Protocol> protocols;
                    private Proxy proxy;
                    private Authenticator proxyAuthenticator;
                    private ProxySelector proxySelector;
                    private int readTimeout;
                    private boolean retryOnConnectionFailure;
                    private RouteDatabase routeDatabase;
                    private SocketFactory socketFactory;
                    private SSLSocketFactory sslSocketFactoryOrNull;
                    private int writeTimeout;
                    private X509TrustManager x509TrustManagerOrNull;

                    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                    public Builder(OkHttpClient okHttpClient) {
/* 4 */                 this();
/* 1 */                 okHttpClient.getClass();
/* 11 */                this.dispatcher = okHttpClient.dispatcher();
/* 17 */                this.connectionPool = okHttpClient.connectionPool();
/* 25 */                C2270uw.m9140k(this.interceptors, okHttpClient.interceptors());
/* 34 */                C2270uw.m9140k(this.networkInterceptors, okHttpClient.networkInterceptors());
/* 41 */                this.eventListenerFactory = okHttpClient.eventListenerFactory();
/* 47 */                this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
/* 53 */                this.authenticator = okHttpClient.authenticator();
/* 59 */                this.followRedirects = okHttpClient.followRedirects();
/* 65 */                this.followSslRedirects = okHttpClient.followSslRedirects();
/* 71 */                this.cookieJar = okHttpClient.cookieJar();
/* 77 */                this.cache = okHttpClient.cache();
/* 83 */                this.dns = okHttpClient.dns();
/* 89 */                this.proxy = okHttpClient.proxy();
/* 95 */                this.proxySelector = okHttpClient.proxySelector();
/* 101 */               this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
/* 107 */               this.socketFactory = okHttpClient.socketFactory();
/* 113 */               this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
/* 119 */               this.x509TrustManagerOrNull = okHttpClient.getX509TrustManager();
/* 125 */               this.connectionSpecs = okHttpClient.connectionSpecs();
/* 131 */               this.protocols = okHttpClient.protocols();
/* 137 */               this.hostnameVerifier = okHttpClient.hostnameVerifier();
/* 143 */               this.certificatePinner = okHttpClient.certificatePinner();
/* 149 */               this.certificateChainCleaner = okHttpClient.getCertificateChainCleaner();
/* 155 */               this.callTimeout = okHttpClient.callTimeoutMillis();
/* 161 */               this.connectTimeout = okHttpClient.connectTimeoutMillis();
/* 167 */               this.readTimeout = okHttpClient.readTimeoutMillis();
/* 173 */               this.writeTimeout = okHttpClient.writeTimeoutMillis();
/* 179 */               this.pingInterval = okHttpClient.pingIntervalMillis();
/* 185 */               this.minWebSocketMessageToCompress = okHttpClient.getMinWebSocketMessageToCompress();
/* 191 */               this.routeDatabase = okHttpClient.getRouteDatabase();
                    }

                    /* JADX INFO: renamed from: -addInterceptor, reason: not valid java name */
                    public final Builder m10610addInterceptor(final Function1<? super Interceptor.Chain, Response> block) {
/* 1 */                 block.getClass();
/* 9 */                 return addInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addInterceptor$2
                            @Override // okhttp3.Interceptor
                            public final Response intercept(Interceptor.Chain chain) {
/* 1 */                         chain.getClass();
/* 10 */                        return (Response) block.invoke(chain);
                            }
                        });
                    }

                    /* JADX INFO: renamed from: -addNetworkInterceptor, reason: not valid java name */
                    public final Builder m10611addNetworkInterceptor(final Function1<? super Interceptor.Chain, Response> block) {
/* 1 */                 block.getClass();
/* 9 */                 return addNetworkInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                            @Override // okhttp3.Interceptor
                            public final Response intercept(Interceptor.Chain chain) {
/* 1 */                         chain.getClass();
/* 10 */                        return (Response) block.invoke(chain);
                            }
                        });
                    }

                    public final Builder addInterceptor(Interceptor interceptor) {
/* 1 */                 interceptor.getClass();
/* 8 */                 getInterceptors$okhttp().add(interceptor);
/* 11 */                return this;
                    }

                    public final Builder addNetworkInterceptor(Interceptor interceptor) {
/* 1 */                 interceptor.getClass();
/* 8 */                 getNetworkInterceptors$okhttp().add(interceptor);
/* 11 */                return this;
                    }

                    public final Builder authenticator(Authenticator authenticator) {
/* 1 */                 authenticator.getClass();
/* 4 */                 setAuthenticator$okhttp(authenticator);
/* 7 */                 return this;
                    }

                    public final OkHttpClient build() {
/* 3 */                 return new OkHttpClient(this);
                    }

                    public final Builder cache(Cache cache) {
/* 1 */                 setCache$okhttp(cache);
/* 4 */                 return this;
                    }

                    public final Builder callTimeout(long timeout, TimeUnit unit) {
/* 1 */                 unit.getClass();
/* 10 */                setCallTimeout$okhttp(Util.checkDuration("timeout", timeout, unit));
/* 13 */                return this;
                    }

                    public final Builder certificatePinner(CertificatePinner certificatePinner) {
/* 1 */                 certificatePinner.getClass();
/* 12 */                if (!Intrinsics.m6216a(certificatePinner, getCertificatePinner())) {
/* 15 */                    setRouteDatabase$okhttp(null);
                        }
/* 18 */                setCertificatePinner$okhttp(certificatePinner);
/* 21 */                return this;
                    }

                    public final Builder connectTimeout(long timeout, TimeUnit unit) {
/* 1 */                 unit.getClass();
/* 10 */                setConnectTimeout$okhttp(Util.checkDuration("timeout", timeout, unit));
/* 13 */                return this;
                    }

                    public final Builder connectionPool(ConnectionPool connectionPool) {
/* 1 */                 connectionPool.getClass();
/* 4 */                 setConnectionPool$okhttp(connectionPool);
/* 7 */                 return this;
                    }

                    public final Builder connectionSpecs(List<ConnectionSpec> connectionSpecs) {
/* 1 */                 connectionSpecs.getClass();
/* 12 */                if (!Intrinsics.m6216a(connectionSpecs, getConnectionSpecs$okhttp())) {
/* 15 */                    setRouteDatabase$okhttp(null);
                        }
/* 22 */                setConnectionSpecs$okhttp(Util.toImmutableList(connectionSpecs));
/* 25 */                return this;
                    }

                    public final Builder cookieJar(CookieJar cookieJar) {
/* 1 */                 cookieJar.getClass();
/* 4 */                 setCookieJar$okhttp(cookieJar);
/* 7 */                 return this;
                    }

                    public final Builder dispatcher(Dispatcher dispatcher) {
/* 1 */                 dispatcher.getClass();
/* 4 */                 setDispatcher$okhttp(dispatcher);
/* 7 */                 return this;
                    }

                    public final Builder dns(Dns dns) {
/* 1 */                 dns.getClass();
/* 12 */                if (!Intrinsics.m6216a(dns, getDns())) {
/* 15 */                    setRouteDatabase$okhttp(null);
                        }
/* 18 */                setDns$okhttp(dns);
/* 21 */                return this;
                    }

                    public final Builder eventListener(EventListener eventListener) {
/* 1 */                 eventListener.getClass();
/* 8 */                 setEventListenerFactory$okhttp(Util.asFactory(eventListener));
/* 11 */                return this;
                    }

                    public final Builder eventListenerFactory(EventListener.Factory eventListenerFactory) {
/* 1 */                 eventListenerFactory.getClass();
/* 4 */                 setEventListenerFactory$okhttp(eventListenerFactory);
/* 7 */                 return this;
                    }

                    public final Builder followRedirects(boolean followRedirects) {
/* 1 */                 setFollowRedirects$okhttp(followRedirects);
/* 4 */                 return this;
                    }

                    public final Builder followSslRedirects(boolean followProtocolRedirects) {
/* 1 */                 setFollowSslRedirects$okhttp(followProtocolRedirects);
/* 4 */                 return this;
                    }

                    /* JADX INFO: renamed from: getAuthenticator$okhttp, reason: from getter */
                    public final Authenticator getAuthenticator() {
/* 1 */                 return this.authenticator;
                    }

                    /* JADX INFO: renamed from: getCache$okhttp, reason: from getter */
                    public final Cache getCache() {
/* 1 */                 return this.cache;
                    }

                    /* JADX INFO: renamed from: getCallTimeout$okhttp, reason: from getter */
                    public final int getCallTimeout() {
/* 1 */                 return this.callTimeout;
                    }

                    /* JADX INFO: renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
                    public final CertificateChainCleaner getCertificateChainCleaner() {
/* 1 */                 return this.certificateChainCleaner;
                    }

                    /* JADX INFO: renamed from: getCertificatePinner$okhttp, reason: from getter */
                    public final CertificatePinner getCertificatePinner() {
/* 1 */                 return this.certificatePinner;
                    }

                    /* JADX INFO: renamed from: getConnectTimeout$okhttp, reason: from getter */
                    public final int getConnectTimeout() {
/* 1 */                 return this.connectTimeout;
                    }

                    /* JADX INFO: renamed from: getConnectionPool$okhttp, reason: from getter */
                    public final ConnectionPool getConnectionPool() {
/* 1 */                 return this.connectionPool;
                    }

                    public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
/* 1 */                 return this.connectionSpecs;
                    }

                    /* JADX INFO: renamed from: getCookieJar$okhttp, reason: from getter */
                    public final CookieJar getCookieJar() {
/* 1 */                 return this.cookieJar;
                    }

                    /* JADX INFO: renamed from: getDispatcher$okhttp, reason: from getter */
                    public final Dispatcher getDispatcher() {
/* 1 */                 return this.dispatcher;
                    }

                    /* JADX INFO: renamed from: getDns$okhttp, reason: from getter */
                    public final Dns getDns() {
/* 1 */                 return this.dns;
                    }

                    /* JADX INFO: renamed from: getEventListenerFactory$okhttp, reason: from getter */
                    public final EventListener.Factory getEventListenerFactory() {
/* 1 */                 return this.eventListenerFactory;
                    }

                    /* JADX INFO: renamed from: getFollowRedirects$okhttp, reason: from getter */
                    public final boolean getFollowRedirects() {
/* 1 */                 return this.followRedirects;
                    }

                    /* JADX INFO: renamed from: getFollowSslRedirects$okhttp, reason: from getter */
                    public final boolean getFollowSslRedirects() {
/* 1 */                 return this.followSslRedirects;
                    }

                    /* JADX INFO: renamed from: getHostnameVerifier$okhttp, reason: from getter */
                    public final HostnameVerifier getHostnameVerifier() {
/* 1 */                 return this.hostnameVerifier;
                    }

                    public final List<Interceptor> getInterceptors$okhttp() {
/* 1 */                 return this.interceptors;
                    }

                    /* JADX INFO: renamed from: getMinWebSocketMessageToCompress$okhttp, reason: from getter */
                    public final long getMinWebSocketMessageToCompress() {
/* 1 */                 return this.minWebSocketMessageToCompress;
                    }

                    public final List<Interceptor> getNetworkInterceptors$okhttp() {
/* 1 */                 return this.networkInterceptors;
                    }

                    /* JADX INFO: renamed from: getPingInterval$okhttp, reason: from getter */
                    public final int getPingInterval() {
/* 1 */                 return this.pingInterval;
                    }

                    public final List<Protocol> getProtocols$okhttp() {
/* 1 */                 return this.protocols;
                    }

                    /* JADX INFO: renamed from: getProxy$okhttp, reason: from getter */
                    public final Proxy getProxy() {
/* 1 */                 return this.proxy;
                    }

                    /* JADX INFO: renamed from: getProxyAuthenticator$okhttp, reason: from getter */
                    public final Authenticator getProxyAuthenticator() {
/* 1 */                 return this.proxyAuthenticator;
                    }

                    /* JADX INFO: renamed from: getProxySelector$okhttp, reason: from getter */
                    public final ProxySelector getProxySelector() {
/* 1 */                 return this.proxySelector;
                    }

                    /* JADX INFO: renamed from: getReadTimeout$okhttp, reason: from getter */
                    public final int getReadTimeout() {
/* 1 */                 return this.readTimeout;
                    }

                    /* JADX INFO: renamed from: getRetryOnConnectionFailure$okhttp, reason: from getter */
                    public final boolean getRetryOnConnectionFailure() {
/* 1 */                 return this.retryOnConnectionFailure;
                    }

                    /* JADX INFO: renamed from: getRouteDatabase$okhttp, reason: from getter */
                    public final RouteDatabase getRouteDatabase() {
/* 1 */                 return this.routeDatabase;
                    }

                    /* JADX INFO: renamed from: getSocketFactory$okhttp, reason: from getter */
                    public final SocketFactory getSocketFactory() {
/* 1 */                 return this.socketFactory;
                    }

                    /* JADX INFO: renamed from: getSslSocketFactoryOrNull$okhttp, reason: from getter */
                    public final SSLSocketFactory getSslSocketFactoryOrNull() {
/* 1 */                 return this.sslSocketFactoryOrNull;
                    }

                    /* JADX INFO: renamed from: getWriteTimeout$okhttp, reason: from getter */
                    public final int getWriteTimeout() {
/* 1 */                 return this.writeTimeout;
                    }

                    /* JADX INFO: renamed from: getX509TrustManagerOrNull$okhttp, reason: from getter */
                    public final X509TrustManager getX509TrustManagerOrNull() {
/* 1 */                 return this.x509TrustManagerOrNull;
                    }

                    public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
/* 1 */                 hostnameVerifier.getClass();
/* 12 */                if (!Intrinsics.m6216a(hostnameVerifier, getHostnameVerifier())) {
/* 15 */                    setRouteDatabase$okhttp(null);
                        }
/* 18 */                setHostnameVerifier$okhttp(hostnameVerifier);
/* 21 */                return this;
                    }

                    public final List<Interceptor> interceptors() {
/* 1 */                 return this.interceptors;
                    }

                    public final Builder minWebSocketMessageToCompress(long bytes) {
/* 5 */                 if (bytes >= 0) {
/* 7 */                     setMinWebSocketMessageToCompress$okhttp(bytes);
/* 10 */                    return this;
                        }
/* 21 */                ds0.m3200q(Intrinsics.m6219d(Long.valueOf(bytes), "minWebSocketMessageToCompress must be positive: "));
/* 24 */                return null;
                    }

                    public final List<Interceptor> networkInterceptors() {
/* 1 */                 return this.networkInterceptors;
                    }

                    public final Builder pingInterval(long interval, TimeUnit unit) {
/* 1 */                 unit.getClass();
/* 10 */                setPingInterval$okhttp(Util.checkDuration("interval", interval, unit));
/* 13 */                return this;
                    }

                    public final Builder protocols(List<? extends Protocol> protocols) {
/* 1 */                 protocols.getClass();
/* 6 */                 ArrayList arrayList = new ArrayList(protocols);
/* 9 */                 Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
/* 16 */                if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
/* 33 */                    ds0.m3200q(Intrinsics.m6219d(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: "));
/* 15 */                    return null;
                        }
/* 41 */                if (arrayList.contains(protocol) && arrayList.size() > 1) {
/* 57 */                    ds0.m3200q(Intrinsics.m6219d(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: "));
/* 15 */                    return null;
                        }
/* 67 */                if (arrayList.contains(Protocol.HTTP_1_0)) {
/* 116 */                   ds0.m3200q(Intrinsics.m6219d(arrayList, "protocols must not contain http/1.0: "));
/* 15 */                    return null;
                        }
/* 73 */                if (arrayList.contains(null)) {
/* 106 */                   C1951n4.m6859j("protocols must not contain null");
/* 15 */                    return null;
                        }
/* 77 */                arrayList.remove(Protocol.SPDY_3);
/* 88 */                if (!arrayList.equals(getProtocols$okhttp())) {
/* 90 */                    setRouteDatabase$okhttp(null);
                        }
/* 93 */                List<? extends Protocol> listUnmodifiableList = Collections.unmodifiableList(arrayList);
/* 97 */                listUnmodifiableList.getClass();
/* 100 */               setProtocols$okhttp(listUnmodifiableList);
/* 103 */               return this;
                    }

                    public final Builder proxy(Proxy proxy) {
/* 9 */                 if (!Intrinsics.m6216a(proxy, getProxy())) {
/* 12 */                    setRouteDatabase$okhttp(null);
                        }
/* 15 */                setProxy$okhttp(proxy);
/* 18 */                return this;
                    }

                    public final Builder proxyAuthenticator(Authenticator proxyAuthenticator) {
/* 1 */                 proxyAuthenticator.getClass();
/* 12 */                if (!Intrinsics.m6216a(proxyAuthenticator, getProxyAuthenticator())) {
/* 15 */                    setRouteDatabase$okhttp(null);
                        }
/* 18 */                setProxyAuthenticator$okhttp(proxyAuthenticator);
/* 21 */                return this;
                    }

                    public final Builder proxySelector(ProxySelector proxySelector) {
/* 1 */                 proxySelector.getClass();
/* 12 */                if (!Intrinsics.m6216a(proxySelector, getProxySelector())) {
/* 15 */                    setRouteDatabase$okhttp(null);
                        }
/* 18 */                setProxySelector$okhttp(proxySelector);
/* 21 */                return this;
                    }

                    public final Builder readTimeout(long timeout, TimeUnit unit) {
/* 1 */                 unit.getClass();
/* 10 */                setReadTimeout$okhttp(Util.checkDuration("timeout", timeout, unit));
/* 13 */                return this;
                    }

                    public final Builder retryOnConnectionFailure(boolean retryOnConnectionFailure) {
/* 1 */                 setRetryOnConnectionFailure$okhttp(retryOnConnectionFailure);
/* 4 */                 return this;
                    }

                    public final void setAuthenticator$okhttp(Authenticator authenticator) {
/* 1 */                 authenticator.getClass();
/* 4 */                 this.authenticator = authenticator;
                    }

                    public final void setCache$okhttp(Cache cache) {
/* 1 */                 this.cache = cache;
                    }

                    public final void setCallTimeout$okhttp(int i) {
/* 1 */                 this.callTimeout = i;
                    }

                    public final void setCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
/* 1 */                 this.certificateChainCleaner = certificateChainCleaner;
                    }

                    public final void setCertificatePinner$okhttp(CertificatePinner certificatePinner) {
/* 1 */                 certificatePinner.getClass();
/* 4 */                 this.certificatePinner = certificatePinner;
                    }

                    public final void setConnectTimeout$okhttp(int i) {
/* 1 */                 this.connectTimeout = i;
                    }

                    public final void setConnectionPool$okhttp(ConnectionPool connectionPool) {
/* 1 */                 connectionPool.getClass();
/* 4 */                 this.connectionPool = connectionPool;
                    }

                    public final void setConnectionSpecs$okhttp(List<ConnectionSpec> list) {
/* 1 */                 list.getClass();
/* 4 */                 this.connectionSpecs = list;
                    }

                    public final void setCookieJar$okhttp(CookieJar cookieJar) {
/* 1 */                 cookieJar.getClass();
/* 4 */                 this.cookieJar = cookieJar;
                    }

                    public final void setDispatcher$okhttp(Dispatcher dispatcher) {
/* 1 */                 dispatcher.getClass();
/* 4 */                 this.dispatcher = dispatcher;
                    }

                    public final void setDns$okhttp(Dns dns) {
/* 1 */                 dns.getClass();
/* 4 */                 this.dns = dns;
                    }

                    public final void setEventListenerFactory$okhttp(EventListener.Factory factory) {
/* 1 */                 factory.getClass();
/* 4 */                 this.eventListenerFactory = factory;
                    }

                    public final void setFollowRedirects$okhttp(boolean z) {
/* 1 */                 this.followRedirects = z;
                    }

                    public final void setFollowSslRedirects$okhttp(boolean z) {
/* 1 */                 this.followSslRedirects = z;
                    }

                    public final void setHostnameVerifier$okhttp(HostnameVerifier hostnameVerifier) {
/* 1 */                 hostnameVerifier.getClass();
/* 4 */                 this.hostnameVerifier = hostnameVerifier;
                    }

                    public final void setMinWebSocketMessageToCompress$okhttp(long j) {
/* 1 */                 this.minWebSocketMessageToCompress = j;
                    }

                    public final void setPingInterval$okhttp(int i) {
/* 1 */                 this.pingInterval = i;
                    }

                    public final void setProtocols$okhttp(List<? extends Protocol> list) {
/* 1 */                 list.getClass();
/* 4 */                 this.protocols = list;
                    }

                    public final void setProxy$okhttp(Proxy proxy) {
/* 1 */                 this.proxy = proxy;
                    }

                    public final void setProxyAuthenticator$okhttp(Authenticator authenticator) {
/* 1 */                 authenticator.getClass();
/* 4 */                 this.proxyAuthenticator = authenticator;
                    }

                    public final void setProxySelector$okhttp(ProxySelector proxySelector) {
/* 1 */                 this.proxySelector = proxySelector;
                    }

                    public final void setReadTimeout$okhttp(int i) {
/* 1 */                 this.readTimeout = i;
                    }

                    public final void setRetryOnConnectionFailure$okhttp(boolean z) {
/* 1 */                 this.retryOnConnectionFailure = z;
                    }

                    public final void setRouteDatabase$okhttp(RouteDatabase routeDatabase) {
/* 1 */                 this.routeDatabase = routeDatabase;
                    }

                    public final void setSocketFactory$okhttp(SocketFactory socketFactory) {
/* 1 */                 socketFactory.getClass();
/* 4 */                 this.socketFactory = socketFactory;
                    }

                    public final void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory sSLSocketFactory) {
/* 1 */                 this.sslSocketFactoryOrNull = sSLSocketFactory;
                    }

                    public final void setWriteTimeout$okhttp(int i) {
/* 1 */                 this.writeTimeout = i;
                    }

                    public final void setX509TrustManagerOrNull$okhttp(X509TrustManager x509TrustManager) {
/* 1 */                 this.x509TrustManagerOrNull = x509TrustManager;
                    }

                    public final Builder socketFactory(SocketFactory socketFactory) {
/* 1 */                 socketFactory.getClass();
/* 6 */                 if (socketFactory instanceof SSLSocketFactory) {
/* 28 */                    C1951n4.m6859j("socketFactory instanceof SSLSocketFactory");
/* 31 */                    return null;
                        }
/* 16 */                if (!Intrinsics.m6216a(socketFactory, getSocketFactory())) {
/* 19 */                    setRouteDatabase$okhttp(null);
                        }
/* 22 */                setSocketFactory$okhttp(socketFactory);
/* 25 */                return this;
                    }

                    public final Builder sslSocketFactory(SSLSocketFactory sslSocketFactory) {
/* 1 */                 sslSocketFactory.getClass();
/* 12 */                if (!Intrinsics.m6216a(sslSocketFactory, getSslSocketFactoryOrNull())) {
/* 15 */                    setRouteDatabase$okhttp(null);
                        }
/* 18 */                setSslSocketFactoryOrNull$okhttp(sslSocketFactory);
/* 21 */                Platform.Companion companion = Platform.INSTANCE;
/* 27 */                X509TrustManager x509TrustManagerTrustManager = companion.get().trustManager(sslSocketFactory);
/* 31 */                if (x509TrustManagerTrustManager != null) {
/* 33 */                    setX509TrustManagerOrNull$okhttp(x509TrustManagerTrustManager);
/* 36 */                    Platform platform = companion.get();
/* 40 */                    X509TrustManager x509TrustManagerOrNull = getX509TrustManagerOrNull();
/* 44 */                    x509TrustManagerOrNull.getClass();
/* 51 */                    setCertificateChainCleaner$okhttp(platform.buildCertificateChainCleaner(x509TrustManagerOrNull));
/* 54 */                    return this;
                        }
/* 61 */                StringBuilder sb = new StringBuilder("Unable to extract the trust manager on ");
/* 68 */                sb.append(companion.get());
/* 71 */                Class<?> cls = sslSocketFactory.getClass();
/* 77 */                sb.append(", sslSocketFactory is ");
/* 80 */                sb.append(cls);
/* 90 */                throw new IllegalStateException(sb.toString());
                    }

                    public final Builder writeTimeout(long timeout, TimeUnit unit) {
/* 1 */                 unit.getClass();
/* 10 */                setWriteTimeout$okhttp(Util.checkDuration("timeout", timeout, unit));
/* 13 */                return this;
                    }

/* 13 */            public final Builder callTimeout(Duration duration) {
                        duration.getClass();
/* 1 */                 callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
                        return this;
                    }

/* 13 */            public final Builder connectTimeout(Duration duration) {
                        duration.getClass();
/* 1 */                 connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
                        return this;
                    }

/* 13 */            public final Builder pingInterval(Duration duration) {
                        duration.getClass();
/* 1 */                 pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
                        return this;
                    }

/* 13 */            public final Builder readTimeout(Duration duration) {
                        duration.getClass();
/* 1 */                 readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
                        return this;
                    }

/* 13 */            public final Builder writeTimeout(Duration duration) {
                        duration.getClass();
/* 1 */                 writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
                        return this;
                    }

/* 90 */            public final Builder sslSocketFactory(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
                        sslSocketFactory.getClass();
                        trustManager.getClass();
/* 91 */                if (!Intrinsics.m6216a(sslSocketFactory, getSslSocketFactoryOrNull()) || !Intrinsics.m6216a(trustManager, getX509TrustManagerOrNull())) {
/* 92 */                    setRouteDatabase$okhttp(null);
                        }
/* 93 */                setSslSocketFactoryOrNull$okhttp(sslSocketFactory);
/* 94 */                setCertificateChainCleaner$okhttp(CertificateChainCleaner.INSTANCE.get(trustManager));
/* 95 */                setX509TrustManagerOrNull$okhttp(trustManager);
                        return this;
                    }

/* 193 */           public Builder() {
/* 195 */               this.dispatcher = new Dispatcher();
/* 196 */               this.connectionPool = new ConnectionPool();
/* 197 */               this.interceptors = new ArrayList();
/* 198 */               this.networkInterceptors = new ArrayList();
/* 199 */               this.eventListenerFactory = Util.asFactory(EventListener.NONE);
/* 200 */               this.retryOnConnectionFailure = true;
/* 201 */               Authenticator authenticator = Authenticator.NONE;
                        this.authenticator = authenticator;
/* 202 */               this.followRedirects = true;
/* 203 */               this.followSslRedirects = true;
/* 204 */               this.cookieJar = CookieJar.NO_COOKIES;
/* 205 */               this.dns = Dns.SYSTEM;
/* 206 */               this.proxyAuthenticator = authenticator;
/* 207 */               SocketFactory socketFactory = SocketFactory.getDefault();
                        socketFactory.getClass();
                        this.socketFactory = socketFactory;
/* 208 */               Companion companion = OkHttpClient.INSTANCE;
                        this.connectionSpecs = companion.getDEFAULT_CONNECTION_SPECS$okhttp();
/* 209 */               this.protocols = companion.getDEFAULT_PROTOCOLS$okhttp();
/* 210 */               this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
/* 211 */               this.certificatePinner = CertificatePinner.DEFAULT;
/* 212 */               this.connectTimeout = 10000;
/* 213 */               this.readTimeout = 10000;
/* 214 */               this.writeTimeout = 10000;
/* 215 */               this.minWebSocketMessageToCompress = 1024L;
                    }
                }

/* 333 */       public OkHttpClient() {
/* 334 */           this(new Builder());
                }
            }
