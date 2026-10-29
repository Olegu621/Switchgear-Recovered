            package okhttp3.internal.connection;

            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.io.IOException;
            import java.lang.ref.Reference;
            import java.net.ConnectException;
            import java.net.ProtocolException;
            import java.net.Proxy;
            import java.net.Socket;
            import java.net.SocketException;
            import java.net.UnknownServiceException;
            import java.security.cert.Certificate;
            import java.security.cert.X509Certificate;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.TimeUnit;
            import javax.net.ssl.HostnameVerifier;
            import javax.net.ssl.SSLPeerUnverifiedException;
            import javax.net.ssl.SSLSession;
            import javax.net.ssl.SSLSocket;
            import javax.net.ssl.SSLSocketFactory;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1850c;
            import okhttp3.Address;
            import okhttp3.Call;
            import okhttp3.CertificatePinner;
            import okhttp3.CipherSuite;
            import okhttp3.Connection;
            import okhttp3.ConnectionSpec;
            import okhttp3.EventListener;
            import okhttp3.Handshake;
            import okhttp3.HttpUrl;
            import okhttp3.OkHttpClient;
            import okhttp3.Protocol;
            import okhttp3.Request;
            import okhttp3.Response;
            import okhttp3.Route;
            import okhttp3.internal.Util;
            import okhttp3.internal.concurrent.TaskRunner;
            import okhttp3.internal.http.ExchangeCodec;
            import okhttp3.internal.http.RealInterceptorChain;
            import okhttp3.internal.http1.Http1ExchangeCodec;
            import okhttp3.internal.http2.ConnectionShutdownException;
            import okhttp3.internal.http2.ErrorCode;
            import okhttp3.internal.http2.Http2Connection;
            import okhttp3.internal.http2.Http2ExchangeCodec;
            import okhttp3.internal.http2.Http2Stream;
            import okhttp3.internal.http2.Settings;
            import okhttp3.internal.http2.StreamResetException;
            import okhttp3.internal.p013ws.RealWebSocket;
            import okhttp3.internal.platform.Platform;
            import okhttp3.internal.tls.CertificateChainCleaner;
            import okhttp3.internal.tls.OkHostnameVerifier;
            import okio.BufferedSink;
            import okio.BufferedSource;
            import okio.Okio;
            import okio.Timeout;
            import p000.C2122qw;
            import p000.b51;
            import p000.ds0;
            import p000.f42;
            import p000.fm0;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 {2\u00020\u00012\u00020\u0002:\u0001{B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u00105\u001a\u000206J\u0018\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u0002092\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J>\u0010:\u001a\u0002062\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CJ%\u0010D\u001a\u0002062\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00062\u0006\u0010H\u001a\u00020IH\u0000¢\u0006\u0002\bJJ(\u0010K\u001a\u0002062\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010L\u001a\u0002062\u0006\u0010M\u001a\u00020NH\u0002J0\u0010O\u001a\u0002062\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J*\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010R\u001a\u00020Q2\u0006\u00108\u001a\u000209H\u0002J\b\u0010S\u001a\u00020QH\u0002J(\u0010T\u001a\u0002062\u0006\u0010M\u001a\u00020N2\u0006\u0010>\u001a\u00020\t2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\r\u0010U\u001a\u000206H\u0000¢\u0006\u0002\bVJ%\u0010W\u001a\u00020\u001d2\u0006\u0010X\u001a\u00020Y2\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010[H\u0000¢\u0006\u0002\b\\J\u000e\u0010]\u001a\u00020\u001d2\u0006\u0010^\u001a\u00020\u001dJ\u001d\u0010_\u001a\u00020`2\u0006\u0010E\u001a\u00020F2\u0006\u0010a\u001a\u00020bH\u0000¢\u0006\u0002\bcJ\u0015\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020gH\u0000¢\u0006\u0002\bhJ\r\u0010 \u001a\u000206H\u0000¢\u0006\u0002\biJ\r\u0010!\u001a\u000206H\u0000¢\u0006\u0002\bjJ\u0018\u0010k\u001a\u0002062\u0006\u0010l\u001a\u00020\u00152\u0006\u0010m\u001a\u00020nH\u0016J\u0010\u0010o\u001a\u0002062\u0006\u0010p\u001a\u00020qH\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010r\u001a\u00020\u001d2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00060[H\u0002J\b\u00101\u001a\u00020(H\u0016J\u0010\u0010t\u001a\u0002062\u0006\u0010>\u001a\u00020\tH\u0002J\u0010\u0010u\u001a\u00020\u001d2\u0006\u00108\u001a\u000209H\u0002J\b\u0010v\u001a\u00020wH\u0016J\u001f\u0010x\u001a\u0002062\u0006\u0010@\u001a\u00020\r2\b\u0010y\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0002\bzR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006|"}, m6176d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "route", "Lokhttp3/Route;", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;)V", "allocationLimit", HttpUrl.FRAGMENT_ENCODE_SET, "calls", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/ref/Reference;", "Lokhttp3/internal/connection/RealCall;", "getCalls", "()Ljava/util/List;", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "handshake", "Lokhttp3/Handshake;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "idleAtNs", HttpUrl.FRAGMENT_ENCODE_SET, "getIdleAtNs$okhttp", "()J", "setIdleAtNs$okhttp", "(J)V", "isMultiplexed", HttpUrl.FRAGMENT_ENCODE_SET, "isMultiplexed$okhttp", "()Z", "noCoalescedConnections", "noNewExchanges", "getNoNewExchanges", "setNoNewExchanges", "(Z)V", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, "Lokhttp3/Protocol;", "rawSocket", "Ljava/net/Socket;", "refusedStreamCount", "routeFailureCount", "getRouteFailureCount$okhttp", "()I", "setRouteFailureCount$okhttp", "(I)V", "sink", "Lokio/BufferedSink;", "socket", FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "successCount", "cancel", HttpUrl.FRAGMENT_ENCODE_SET, "certificateSupportHost", "url", "Lokhttp3/HttpUrl;", "connect", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "connectionRetryEnabled", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "eventListener", "Lokhttp3/EventListener;", "connectFailed", "client", "Lokhttp3/OkHttpClient;", "failedRoute", "failure", "Ljava/io/IOException;", "connectFailed$okhttp", "connectSocket", "connectTls", "connectionSpecSelector", "Lokhttp3/internal/connection/ConnectionSpecSelector;", "connectTunnel", "createTunnel", "Lokhttp3/Request;", "tunnelRequest", "createTunnelRequest", "establishProtocol", "incrementSuccessCount", "incrementSuccessCount$okhttp", "isEligible", "address", "Lokhttp3/Address;", "routes", HttpUrl.FRAGMENT_ENCODE_SET, "isEligible$okhttp", "isHealthy", "doExtensiveChecks", "newCodec", "Lokhttp3/internal/http/ExchangeCodec;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "newCodec$okhttp", "newWebSocketStreams", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "exchange", "Lokhttp3/internal/connection/Exchange;", "newWebSocketStreams$okhttp", "noCoalescedConnections$okhttp", "noNewExchanges$okhttp", "onSettings", "connection", "settings", "Lokhttp3/internal/http2/Settings;", "onStream", "stream", "Lokhttp3/internal/http2/Http2Stream;", "routeMatchesAny", "candidates", "startHttp2", "supportsUrl", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "trackFailure", "e", "trackFailure$okhttp", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class RealConnection extends Http2Connection.Listener implements Connection {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
                private static final int MAX_TUNNEL_ATTEMPTS = 21;
                private static final String NPE_THROW_WITH_NULL = "throw with null exception";
                private int allocationLimit;
                private final List<Reference<RealCall>> calls;
                private final RealConnectionPool connectionPool;
                private Handshake handshake;
                private Http2Connection http2Connection;
                private long idleAtNs;
                private boolean noCoalescedConnections;
                private boolean noNewExchanges;
                private Protocol protocol;
                private Socket rawSocket;
                private int refusedStreamCount;
                private final Route route;
                private int routeFailureCount;
                private BufferedSink sink;
                private Socket socket;
                private BufferedSource source;
                private int successCount;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6177k = 3, m6178mv = {1, 6, 0}, m6180xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
/* 6 */                 int[] iArr = new int[Proxy.Type.values().length];
/* 15 */                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
/* 24 */                iArr[Proxy.Type.HTTP.ordinal()] = 2;
/* 26 */                $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX INFO: renamed from: okhttp3.internal.connection.RealConnection$connectTls$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m6176d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/security/cert/Certificate;", "invoke"}, m6177k = 3, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class C20141 extends b51 implements Function0<List<? extends Certificate>> {
                    final /* synthetic */ Address $address;
                    final /* synthetic */ CertificatePinner $certificatePinner;
                    final /* synthetic */ Handshake $unverifiedHandshake;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C20141(CertificatePinner certificatePinner, Handshake handshake, Address address) {
/* 8 */                 super(0);
/* 1 */                 this.$certificatePinner = certificatePinner;
/* 3 */                 this.$unverifiedHandshake = handshake;
/* 5 */                 this.$address = address;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final List<Certificate> invoke() {
/* 3 */                 CertificateChainCleaner certificateChainCleaner$okhttp = this.$certificatePinner.getCertificateChainCleaner();
/* 7 */                 certificateChainCleaner$okhttp.getClass();
/* 26 */                return certificateChainCleaner$okhttp.clean(this.$unverifiedHandshake.peerCertificates(), this.$address.url().host());
                    }
                }

                /* JADX INFO: renamed from: okhttp3.internal.connection.RealConnection$connectTls$2 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m6176d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/security/cert/X509Certificate;", "invoke"}, m6177k = 3, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class C20152 extends b51 implements Function0<List<? extends X509Certificate>> {
                    public C20152() {
/* 4 */                 super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final List<X509Certificate> invoke() {
/* 1 */                 Handshake handshake = RealConnection.this.handshake;
/* 7 */                 handshake.getClass();
/* 10 */                List<Certificate> listPeerCertificates = handshake.peerCertificates();
/* 22 */                ArrayList arrayList = new ArrayList(C2122qw.m8020h(listPeerCertificates, 10));
/* 25 */                Iterator<T> it = listPeerCertificates.iterator();
/* 33 */                while (it.hasNext()) {
/* 43 */                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                        }
/* 47 */                return arrayList;
                    }
                }

                public RealConnection(RealConnectionPool realConnectionPool, Route route) {
/* 1 */             realConnectionPool.getClass();
/* 4 */             route.getClass();
/* 10 */            this.connectionPool = realConnectionPool;
/* 12 */            this.route = route;
/* 15 */            this.allocationLimit = 1;
/* 22 */            this.calls = new ArrayList();
/* 29 */            this.idleAtNs = Long.MAX_VALUE;
                }

                private final boolean certificateSupportHost(HttpUrl url, Handshake handshake) {
/* 1 */             List<Certificate> listPeerCertificates = handshake.peerCertificates();
                    return !listPeerCertificates.isEmpty() && OkHostnameVerifier.INSTANCE.verify(url.host(), (X509Certificate) listPeerCertificates.get(0));
                }

                private final void connectSocket(int connectTimeout, int readTimeout, Call call, EventListener eventListener) throws IOException {
                    Socket socketCreateSocket;
/* 3 */             Proxy proxy = this.route.proxy();
/* 9 */             Address address = this.route.address();
/* 13 */            Proxy.Type type = proxy.type();
/* 27 */            int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
/* 30 */            if (i == 1 || i == 2) {
/* 45 */                socketCreateSocket = address.socketFactory().createSocket();
/* 49 */                socketCreateSocket.getClass();
                    } else {
/* 37 */                socketCreateSocket = new Socket(proxy);
                    }
/* 52 */            this.rawSocket = socketCreateSocket;
/* 60 */            eventListener.connectStart(call, this.route.socketAddress(), proxy);
/* 63 */            socketCreateSocket.setSoTimeout(readTimeout);
                    try {
/* 78 */                Platform.INSTANCE.get().connectSocket(socketCreateSocket, this.route.socketAddress(), connectTimeout);
                        try {
/* 89 */                    this.source = Okio.buffer(Okio.source(socketCreateSocket));
/* 99 */                    this.sink = Okio.buffer(Okio.sink(socketCreateSocket));
                        } catch (NullPointerException e) {
/* 113 */                   if (Intrinsics.m6216a(e.getMessage(), NPE_THROW_WITH_NULL)) {
/* 121 */                       throw new IOException(e);
                            }
                        }
                    } catch (ConnectException e2) {
/* 137 */               ConnectException connectException = new ConnectException(Intrinsics.m6219d(this.route.socketAddress(), "Failed to connect to "));
/* 140 */               connectException.initCause(e2);
/* 143 */               throw connectException;
                    }
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                private final void connectTls(ConnectionSpecSelector connectionSpecSelector) throws Throwable {
/* 7 */             Address address = this.route.address();
/* 11 */            SSLSocketFactory sslSocketFactory = address.sslSocketFactory();
/* 15 */            SSLSocket sSLSocket = null;
                    try {
/* 16 */                sslSocketFactory.getClass();
/* 38 */                Socket socketCreateSocket = sslSocketFactory.createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
/* 42 */                if (socketCreateSocket == null) {
/* 363 */                   throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                        }
/* 44 */                SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
                        try {
/* 46 */                    ConnectionSpec connectionSpecConfigureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket2);
/* 54 */                    if (connectionSpecConfigureSecureSocket.supportsTlsExtensions()) {
/* 74 */                        Platform.INSTANCE.get().configureTlsExtensions(sSLSocket2, address.url().host(), address.protocols());
                            }
/* 82 */                    sSLSocket2.startHandshake();
/* 85 */                    SSLSession session = sSLSocket2.getSession();
/* 89 */                    Handshake.Companion companion = Handshake.INSTANCE;
/* 91 */                    session.getClass();
/* 94 */                    Handshake handshake = companion.get(session);
/* 98 */                    HostnameVerifier hostnameVerifier = address.hostnameVerifier();
/* 102 */                   hostnameVerifier.getClass();
/* 117 */                   if (hostnameVerifier.verify(address.url().host(), session)) {
/* 246 */                       CertificatePinner certificatePinner = address.certificatePinner();
/* 250 */                       certificatePinner.getClass();
/* 275 */                       this.handshake = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new C20141(certificatePinner, handshake, address));
/* 290 */                       certificatePinner.check$okhttp(address.url().host(), new C20152());
/* 305 */                       String selectedProtocol = connectionSpecConfigureSecureSocket.supportsTlsExtensions() ? Platform.INSTANCE.get().getSelectedProtocol(sSLSocket2) : null;
/* 309 */                       this.socket = sSLSocket2;
/* 319 */                       this.source = Okio.buffer(Okio.source(sSLSocket2));
/* 329 */                       this.sink = Okio.buffer(Okio.sink(sSLSocket2));
/* 342 */                       this.protocol = selectedProtocol != null ? Protocol.INSTANCE.get(selectedProtocol) : Protocol.HTTP_1_1;
/* 350 */                       Platform.INSTANCE.get().afterHandshake(sSLSocket2);
/* 353 */                       return;
                            }
/* 119 */                   List<Certificate> listPeerCertificates = handshake.peerCertificates();
/* 127 */                   if (listPeerCertificates.isEmpty()) {
/* 245 */                       throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
                            }
/* 134 */                   X509Certificate x509Certificate = (X509Certificate) listPeerCertificates.get(0);
/* 214 */                   throw new SSLPeerUnverifiedException(C1850c.m6254c("\n              |Hostname " + address.url().host() + " not verified:\n              |    certificate: " + CertificatePinner.INSTANCE.pin(x509Certificate) + "\n              |    DN: " + ((Object) x509Certificate.getSubjectDN().getName()) + "\n              |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n              "));
                        } catch (Throwable th) {
/* 78 */                    th = th;
/* 79 */                    sSLSocket = sSLSocket2;
/* 364 */                   if (sSLSocket != null) {
/* 372 */                       Platform.INSTANCE.get().afterHandshake(sSLSocket);
                            }
/* 375 */                   if (sSLSocket != null) {
/* 378 */                       Util.closeQuietly((Socket) sSLSocket);
                            }
/* 381 */                   throw th;
                        }
                    } catch (Throwable th2) {
/* 354 */               th = th2;
                    }
                }

                private final void connectTunnel(int connectTimeout, int readTimeout, int writeTimeout, Call call, EventListener eventListener) throws IOException {
/* 1 */             Request requestCreateTunnelRequest = createTunnelRequest();
/* 5 */             HttpUrl httpUrlUrl = requestCreateTunnelRequest.url();
/* 9 */             int i = 0;
/* 12 */            while (i < 21) {
/* 14 */                i++;
/* 16 */                connectSocket(connectTimeout, readTimeout, call, eventListener);
/* 19 */                requestCreateTunnelRequest = createTunnel(readTimeout, writeTimeout, requestCreateTunnelRequest, httpUrlUrl);
/* 23 */                if (requestCreateTunnelRequest == null) {
/* 57 */                    return;
                        }
/* 26 */                Socket socket = this.rawSocket;
/* 28 */                if (socket != null) {
/* 31 */                    Util.closeQuietly(socket);
                        }
/* 35 */                this.rawSocket = null;
/* 37 */                this.sink = null;
/* 39 */                this.source = null;
/* 53 */                eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
                    }
                }

                private final Request createTunnel(int readTimeout, int writeTimeout, Request tunnelRequest, HttpUrl url) throws IOException {
/* 21 */            String str = "CONNECT " + Util.toHostHeader(url, true) + " HTTP/1.1";
                    while (true) {
/* 25 */                BufferedSource bufferedSource = this.source;
/* 27 */                bufferedSource.getClass();
/* 30 */                BufferedSink bufferedSink = this.sink;
/* 32 */                bufferedSink.getClass();
/* 38 */                Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, bufferedSource, bufferedSink);
/* 46 */                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
/* 48 */                bufferedSource.getTimeout().timeout(readTimeout, timeUnit);
/* 56 */                bufferedSink.getTimeout().timeout(writeTimeout, timeUnit);
/* 63 */                http1ExchangeCodec.writeRequest(tunnelRequest.headers(), str);
/* 66 */                http1ExchangeCodec.finishRequest();
/* 70 */                Response.Builder responseHeaders = http1ExchangeCodec.readResponseHeaders(false);
/* 74 */                responseHeaders.getClass();
/* 81 */                Response responseBuild = responseHeaders.request(tunnelRequest).build();
/* 85 */                http1ExchangeCodec.skipConnectBody(responseBuild);
/* 88 */                int iCode = responseBuild.code();
/* 94 */                if (iCode == 200) {
/* 168 */                   if (bufferedSource.getBuffer().exhausted() && bufferedSink.getBuffer().exhausted()) {
/* 37 */                        return null;
                            }
/* 183 */                   ds0.m3195l("TLS tunnel buffered too many bytes!");
/* 37 */                    return null;
                        }
/* 98 */                if (iCode != 407) {
/* 156 */                   ds0.m3195l(Intrinsics.m6219d(Integer.valueOf(responseBuild.code()), "Unexpected response code for CONNECT: "));
/* 37 */                    return null;
                        }
/* 112 */               Request requestAuthenticate = this.route.address().proxyAuthenticator().authenticate(this.route, responseBuild);
/* 116 */               if (requestAuthenticate == null) {
/* 138 */                   ds0.m3195l("Failed to authenticate with proxy");
/* 37 */                    return null;
                        }
/* 131 */               if ("close".equalsIgnoreCase(Response.header$default(responseBuild, "Connection", null, 2, null))) {
/* 133 */                   return requestAuthenticate;
                        }
/* 134 */               tunnelRequest = requestAuthenticate;
                    }
                }

                private final Request createTunnelRequest() throws IOException {
/* 64 */            Request requestBuild = new Request.Builder().url(this.route.address().url()).method("CONNECT", null).header("Host", Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Util.userAgent).build();
/* 135 */           Request requestAuthenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(requestBuild).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
                    return requestAuthenticate == null ? requestBuild : requestAuthenticate;
                }

                private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int pingIntervalMillis, Call call, EventListener eventListener) throws Throwable {
/* 11 */            if (this.route.address().sslSocketFactory() != null) {
/* 48 */                eventListener.secureConnectStart(call);
/* 51 */                connectTls(connectionSpecSelector);
/* 56 */                eventListener.secureConnectEnd(call, this.handshake);
/* 63 */                if (this.protocol == Protocol.HTTP_2) {
/* 65 */                    startHttp2(pingIntervalMillis);
/* 68 */                    return;
                        }
/* 68 */                return;
                    }
/* 19 */            List<Protocol> listProtocols = this.route.address().protocols();
/* 23 */            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
/* 25 */            boolean zContains = listProtocols.contains(protocol);
/* 29 */            Socket socket = this.rawSocket;
/* 31 */            if (!zContains) {
/* 41 */                this.socket = socket;
/* 45 */                this.protocol = Protocol.HTTP_1_1;
                    } else {
/* 33 */                this.socket = socket;
/* 35 */                this.protocol = protocol;
/* 37 */                startHttp2(pingIntervalMillis);
                    }
                }

                private final boolean routeMatchesAny(List<Route> candidates) {
/* 2 */             if (candidates != null && candidates.isEmpty()) {
/* 1 */                 return false;
                    }
/* 19 */            for (Route route : candidates) {
/* 31 */                Proxy.Type type = route.proxy().type();
/* 35 */                Proxy.Type type2 = Proxy.Type.DIRECT;
/* 37 */                if (type == type2 && this.route.proxy().type() == type2 && Intrinsics.m6216a(this.route.socketAddress(), route.socketAddress())) {
/* 67 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                private final void startHttp2(int pingIntervalMillis) throws IOException {
/* 1 */             Socket socket = this.socket;
/* 3 */             socket.getClass();
/* 6 */             BufferedSource bufferedSource = this.source;
/* 8 */             bufferedSource.getClass();
/* 11 */            BufferedSink bufferedSink = this.sink;
/* 13 */            bufferedSink.getClass();
/* 17 */            socket.setSoTimeout(0);
/* 54 */            Http2Connection http2ConnectionBuild = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket, this.route.address().url().host(), bufferedSource, bufferedSink).listener(this).pingIntervalMillis(pingIntervalMillis).build();
/* 58 */            this.http2Connection = http2ConnectionBuild;
/* 70 */            this.allocationLimit = Http2Connection.INSTANCE.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
/* 74 */            Http2Connection.start$default(http2ConnectionBuild, false, null, 3, null);
                }

                private final boolean supportsUrl(HttpUrl url) {
                    Handshake handshake;
/* 4 */             if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
/* 23 */                s80.m8422c(Thread.currentThread().getName(), " MUST hold lock on ", this);
/* 3 */                 return false;
                    }
/* 33 */            HttpUrl httpUrlUrl = this.route.address().url();
/* 45 */            if (url.port() != httpUrlUrl.port()) {
/* 3 */                 return false;
                    }
/* 61 */            if (Intrinsics.m6216a(url.host(), httpUrlUrl.host())) {
/* 60 */                return true;
                    }
/* 66 */            if (!this.noCoalescedConnections && (handshake = this.handshake) != null) {
/* 72 */                handshake.getClass();
/* 79 */                if (certificateSupportHost(url, handshake)) {
/* 60 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final void cancel() {
/* 1 */             Socket socket = this.rawSocket;
/* 3 */             if (socket == null) {
/* 5 */                 return;
                    }
/* 6 */             Util.closeQuietly(socket);
                }

                /* JADX WARN: Code duplicated, block: B:51:0x00f2  */
                /* JADX WARN: Code duplicated, block: B:55:0x00fa  */
                /* JADX WARN: Code duplicated, block: B:58:0x0120  */
                /* JADX WARN: Code duplicated, block: B:59:0x0126  */
                /* JADX WARN: Code duplicated, block: B:61:0x012b  */
                /* JADX WARN: Code duplicated, block: B:79:0x0133 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:80:0x0133 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:81:? A[LOOP:0: B:71:0x007c->B:81:?, LOOP_END, SYNTHETIC] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v0, types: [okhttp3.internal.connection.RealConnection] */
                /* JADX WARN: Type inference failed for: r1v11, types: [okhttp3.EventListener] */
                /* JADX WARN: Type inference failed for: r1v13 */
                /* JADX WARN: Type inference failed for: r1v14 */
                /* JADX WARN: Type inference failed for: r1v19 */
                /* JADX WARN: Type inference failed for: r1v20 */
                /* JADX WARN: Type inference failed for: r1v21 */
                /* JADX WARN: Type inference failed for: r1v4 */
                /* JADX WARN: Type inference failed for: r1v5 */
                /* JADX WARN: Type inference failed for: r1v6 */
                /* JADX WARN: Type inference failed for: r1v7, types: [okhttp3.EventListener] */
                /* JADX WARN: Type inference failed for: r1v8 */
                /* JADX WARN: Type inference failed for: r1v9 */
                public final void connect(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled, Call call, EventListener eventListener) throws Throwable {
                    Protocol protocol;
                    ?? r1;
                    Call call2;
                    IOException iOException;
                    Socket socket;
                    Socket socket2;
                    boolean zIsCleartextTrafficPermitted;
                    call.getClass();
                    eventListener.getClass();
/* 1 */             if (this.protocol != null) {
/* 45 */                f42.m3656l("already connected");
                        return;
                    }
/* 2 */             List<ConnectionSpec> listConnectionSpecs = this.route.address().connectionSpecs();
/* 3 */             ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(listConnectionSpecs);
/* 4 */             if (this.route.address().sslSocketFactory() != null) {
/* 15 */                List<Protocol> listProtocols = this.route.address().protocols();
                        protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                        if (listProtocols.contains(protocol)) {
                            r1 = protocol;
/* 42 */                    throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
                        }
                    } else {
/* 5 */                 if (!listConnectionSpecs.contains(ConnectionSpec.CLEARTEXT)) {
/* 12 */                    throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                        }
/* 6 */                 String strHost = this.route.address().url().host();
/* 7 */                 zIsCleartextTrafficPermitted = Platform.INSTANCE.get().isCleartextTrafficPermitted(strHost);
                        if (!zIsCleartextTrafficPermitted) {
                            r1 = zIsCleartextTrafficPermitted;
/* 8 */                     throw new RouteException(new UnknownServiceException(fm0.m3784j("CLEARTEXT communication to ", strHost, " not permitted by network security policy")));
                        }
                    }
                    r1 = protocol;
                    r1 = zIsCleartextTrafficPermitted;
                    RouteException routeException = null;
                    while (true) {
                        try {
                            try {
/* 16 */                        if (this.route.requiresTunnel()) {
                                    try {
/* 17 */                                connectTunnel(connectTimeout, readTimeout, writeTimeout, call, eventListener);
                                        call2 = call;
                                        r1 = eventListener;
/* 18 */                                if (this.rawSocket != null) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    } catch (IOException e) {
                                        e = e;
                                        call2 = call;
                                        r1 = eventListener;
                                        iOException = e;
/* 27 */                                socket = this.socket;
                                        if (socket != null) {
                                            Util.closeQuietly(socket);
                                        }
/* 28 */                                socket2 = this.rawSocket;
                                        if (socket2 != null) {
                                            Util.closeQuietly(socket2);
                                        }
/* 29 */                                this.socket = null;
/* 30 */                                this.rawSocket = null;
/* 31 */                                this.source = null;
/* 32 */                                this.sink = null;
/* 33 */                                this.handshake = null;
/* 34 */                                this.protocol = null;
/* 35 */                                this.http2Connection = null;
/* 36 */                                this.allocationLimit = 1;
/* 37 */                                r1.connectFailed(call2, this.route.socketAddress(), this.route.proxy(), null, iOException);
                                        if (routeException == null) {
/* 38 */                                    routeException = new RouteException(iOException);
                                        } else {
/* 39 */                                    routeException.addConnectException(iOException);
                                        }
                                        if (connectionRetryEnabled) {
/* 41 */                                    throw routeException;
                                        }
/* 40 */                                if (connectionSpecSelector.connectionFailed(iOException)) {
/* 41 */                                    throw routeException;
                                        }
                                    }
                                } else {
                                    call2 = call;
                                    EventListener eventListener2 = eventListener;
/* 19 */                            connectSocket(connectTimeout, readTimeout, call2, eventListener2);
                                    r1 = eventListener2;
                                }
                                try {
/* 20 */                            establishProtocol(connectionSpecSelector, pingIntervalMillis, call2, r1);
/* 21 */                            r1.connectEnd(call2, this.route.socketAddress(), this.route.proxy(), this.protocol);
                                    break;
                                } catch (IOException e2) {
                                    e = e2;
                                    iOException = e;
/* 27 */                            socket = this.socket;
                                    if (socket != null) {
                                        Util.closeQuietly(socket);
                                    }
/* 28 */                            socket2 = this.rawSocket;
                                    if (socket2 != null) {
                                        Util.closeQuietly(socket2);
                                    }
/* 29 */                            this.socket = null;
/* 30 */                            this.rawSocket = null;
/* 31 */                            this.source = null;
/* 32 */                            this.sink = null;
/* 33 */                            this.handshake = null;
/* 34 */                            this.protocol = null;
/* 35 */                            this.http2Connection = null;
/* 36 */                            this.allocationLimit = 1;
/* 37 */                            r1.connectFailed(call2, this.route.socketAddress(), this.route.proxy(), null, iOException);
                                    if (routeException == null) {
/* 38 */                                routeException = new RouteException(iOException);
                                    } else {
/* 39 */                                routeException.addConnectException(iOException);
                                    }
                                    if (connectionRetryEnabled) {
/* 41 */                                throw routeException;
                                    }
/* 40 */                            if (connectionSpecSelector.connectionFailed(iOException)) {
/* 41 */                                throw routeException;
                                    }
                                }
                            } catch (IOException e3) {
                                e = e3;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            call2 = call;
                            r1 = eventListener;
                        }
                    }
/* 22 */            if (this.route.requiresTunnel() && this.rawSocket == null) {
/* 23 */                throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
/* 26 */            this.idleAtNs = System.nanoTime();
                }

                public final void connectFailed$okhttp(OkHttpClient client, Route failedRoute, IOException failure) {
/* 1 */             client.getClass();
/* 4 */             failedRoute.getClass();
/* 7 */             failure.getClass();
/* 20 */            if (failedRoute.proxy().type() != Proxy.Type.DIRECT) {
/* 22 */                Address address = failedRoute.address();
/* 46 */                address.proxySelector().connectFailed(address.url().uri(), failedRoute.proxy().address(), failure);
                    }
/* 53 */            client.getRouteDatabase().failed(failedRoute);
                }

                public final List<Reference<RealCall>> getCalls() {
/* 1 */             return this.calls;
                }

                public final RealConnectionPool getConnectionPool() {
/* 1 */             return this.connectionPool;
                }

                /* JADX INFO: renamed from: getIdleAtNs$okhttp, reason: from getter */
                public final long getIdleAtNs() {
/* 1 */             return this.idleAtNs;
                }

                public final boolean getNoNewExchanges() {
/* 1 */             return this.noNewExchanges;
                }

                /* JADX INFO: renamed from: getRouteFailureCount$okhttp, reason: from getter */
                public final int getRouteFailureCount() {
/* 1 */             return this.routeFailureCount;
                }

                @Override // okhttp3.Connection
                /* JADX INFO: renamed from: handshake, reason: from getter */
                public Handshake getHandshake() {
/* 1 */             return this.handshake;
                }

                public final synchronized void incrementSuccessCount$okhttp() {
/* 6 */             this.successCount++;
                }

                public final boolean isEligible$okhttp(Address address, List<Route> routes) {
/* 1 */             address.getClass();
/* 7 */             if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
/* 26 */                s80.m8422c(Thread.currentThread().getName(), " MUST hold lock on ", this);
/* 6 */                 return false;
                    }
/* 38 */            if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address)) {
/* 6 */                 return false;
                    }
/* 87 */            if (Intrinsics.m6216a(address.url().host(), getRoute().address().url().host())) {
/* 86 */                return true;
                    }
/* 92 */            if (this.http2Connection == null || routes == null || !routeMatchesAny(routes) || address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
/* 6 */                 return false;
                    }
                    try {
/* 124 */               CertificatePinner certificatePinner = address.certificatePinner();
/* 128 */               certificatePinner.getClass();
/* 135 */               String strHost = address.url().host();
/* 139 */               Handshake handshake = getHandshake();
/* 143 */               handshake.getClass();
/* 150 */               certificatePinner.check(strHost, handshake.peerCertificates());
/* 86 */                return true;
                    } catch (SSLPeerUnverifiedException unused) {
/* 6 */                 return false;
                    }
                }

                public final boolean isHealthy(boolean doExtensiveChecks) {
                    long idleAtNs;
/* 4 */             if (Util.assertionsEnabled && Thread.holdsLock(this)) {
/* 23 */                s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
/* 3 */                 return false;
                    }
/* 27 */            long jNanoTime = System.nanoTime();
/* 31 */            Socket socket = this.rawSocket;
/* 33 */            socket.getClass();
/* 36 */            Socket socket2 = this.socket;
/* 38 */            socket2.getClass();
/* 41 */            BufferedSource bufferedSource = this.source;
/* 43 */            bufferedSource.getClass();
/* 50 */            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
/* 3 */                 return false;
                    }
/* 71 */            Http2Connection http2Connection = this.http2Connection;
/* 73 */            if (http2Connection != null) {
/* 75 */                return http2Connection.isHealthy(jNanoTime);
                    }
                    synchronized (this) {
/* 85 */                idleAtNs = jNanoTime - getIdleAtNs();
                    }
/* 94 */            if (idleAtNs < IDLE_CONNECTION_HEALTHY_NS || !doExtensiveChecks) {
/* 103 */               return true;
                    }
/* 98 */            return Util.isHealthy(socket2, bufferedSource);
                }

                public final boolean isMultiplexed$okhttp() {
                    return this.http2Connection != null;
                }

                public final ExchangeCodec newCodec$okhttp(OkHttpClient client, RealInterceptorChain chain) throws SocketException {
/* 1 */             client.getClass();
/* 4 */             chain.getClass();
/* 7 */             Socket socket = this.socket;
/* 9 */             socket.getClass();
/* 12 */            BufferedSource bufferedSource = this.source;
/* 14 */            bufferedSource.getClass();
/* 17 */            BufferedSink bufferedSink = this.sink;
/* 19 */            bufferedSink.getClass();
/* 22 */            Http2Connection http2Connection = this.http2Connection;
/* 24 */            if (http2Connection != null) {
/* 28 */                return new Http2ExchangeCodec(client, this, chain, http2Connection);
                    }
/* 36 */            socket.setSoTimeout(chain.readTimeoutMillis());
/* 39 */            Timeout timeout = bufferedSource.getTimeout();
/* 43 */            long readTimeoutMillis$okhttp = chain.getReadTimeoutMillis();
/* 48 */            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
/* 50 */            timeout.timeout(readTimeoutMillis$okhttp, timeUnit);
/* 62 */            bufferedSink.getTimeout().timeout(chain.getWriteTimeoutMillis(), timeUnit);
/* 67 */            return new Http1ExchangeCodec(client, this, bufferedSource, bufferedSink);
                }

                public final RealWebSocket.Streams newWebSocketStreams$okhttp(final Exchange exchange) throws SocketException {
/* 1 */             exchange.getClass();
/* 4 */             Socket socket = this.socket;
/* 6 */             socket.getClass();
/* 9 */             final BufferedSource bufferedSource = this.source;
/* 11 */            bufferedSource.getClass();
/* 14 */            final BufferedSink bufferedSink = this.sink;
/* 16 */            bufferedSink.getClass();
/* 20 */            socket.setSoTimeout(0);
/* 23 */            noNewExchanges$okhttp();
/* 28 */            return new RealWebSocket.Streams(bufferedSink, exchange) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
                        final /* synthetic */ Exchange $exchange;
                        final /* synthetic */ BufferedSink $sink;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
/* 8 */                     super(true, this.$source, bufferedSink);
/* 3 */                     this.$sink = bufferedSink;
/* 5 */                     this.$exchange = exchange;
                        }

                        @Override // java.io.Closeable, java.lang.AutoCloseable
                        public void close() {
/* 8 */                     this.$exchange.bodyComplete(-1L, true, true, null);
                        }
                    };
                }

                public final synchronized void noCoalescedConnections$okhttp() {
/* 3 */             this.noCoalescedConnections = true;
                }

                public final synchronized void noNewExchanges$okhttp() {
/* 3 */             this.noNewExchanges = true;
                }

                @Override // okhttp3.internal.http2.Http2Connection.Listener
                public synchronized void onSettings(Http2Connection connection, Settings settings) {
/* 2 */             connection.getClass();
/* 5 */             settings.getClass();
/* 12 */            this.allocationLimit = settings.getMaxConcurrentStreams();
                }

                @Override // okhttp3.internal.http2.Http2Connection.Listener
                public void onStream(Http2Stream stream) throws IOException {
/* 1 */             stream.getClass();
/* 7 */             stream.close(ErrorCode.REFUSED_STREAM, null);
                }

                @Override // okhttp3.Connection
                public Protocol protocol() {
/* 1 */             Protocol protocol = this.protocol;
/* 3 */             protocol.getClass();
/* 6 */             return protocol;
                }

                @Override // okhttp3.Connection
                /* JADX INFO: renamed from: route, reason: from getter */
                public Route getRoute() {
/* 1 */             return this.route;
                }

                public final void setIdleAtNs$okhttp(long j) {
/* 1 */             this.idleAtNs = j;
                }

                public final void setNoNewExchanges(boolean z) {
/* 1 */             this.noNewExchanges = z;
                }

                public final void setRouteFailureCount$okhttp(int i) {
/* 1 */             this.routeFailureCount = i;
                }

                @Override // okhttp3.Connection
                public Socket socket() {
/* 1 */             Socket socket = this.socket;
/* 3 */             socket.getClass();
/* 6 */             return socket;
                }

                public String toString() {
                    CipherSuite cipherSuite;
/* 5 */             StringBuilder sb = new StringBuilder("Connection{");
/* 22 */            sb.append(this.route.address().url().host());
/* 27 */            sb.append(':');
/* 44 */            sb.append(this.route.address().url().port());
/* 49 */            sb.append(", proxy=");
/* 58 */            sb.append(this.route.proxy());
/* 63 */            sb.append(" hostAddress=");
/* 72 */            sb.append(this.route.socketAddress());
/* 77 */            sb.append(" cipherSuite=");
/* 80 */            Handshake handshake = this.handshake;
/* 82 */            Object obj = "none";
/* 84 */            if (handshake != null && (cipherSuite = handshake.cipherSuite()) != null) {
/* 94 */                obj = cipherSuite;
                    }
/* 95 */            sb.append(obj);
/* 100 */           sb.append(" protocol=");
/* 105 */           sb.append(this.protocol);
/* 110 */           sb.append('}');
/* 113 */           return sb.toString();
                }

                public final synchronized void trackFailure$okhttp(RealCall call, IOException e) {
                    try {
/* 2 */                 call.getClass();
/* 8 */                 if (e instanceof StreamResetException) {
/* 17 */                    if (((StreamResetException) e).errorCode == ErrorCode.REFUSED_STREAM) {
/* 21 */                        int i = this.refusedStreamCount + 1;
/* 22 */                        this.refusedStreamCount = i;
/* 24 */                        if (i > 1) {
/* 26 */                            this.noNewExchanges = true;
/* 31 */                            this.routeFailureCount++;
                                }
                            } else if (((StreamResetException) e).errorCode != ErrorCode.CANCEL || !call.getCanceled()) {
/* 51 */                        this.noNewExchanges = true;
/* 56 */                        this.routeFailureCount++;
                            }
                        } else if (!isMultiplexed$okhttp() || (e instanceof ConnectionShutdownException)) {
/* 69 */                    this.noNewExchanges = true;
/* 73 */                    if (this.successCount == 0) {
/* 75 */                        if (e != null) {
/* 83 */                            connectFailed$okhttp(call.getClient(), this.route, e);
                                }
/* 89 */                        this.routeFailureCount++;
                            }
                        }
                    } catch (Throwable th) {
/* 94 */                throw th;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m6176d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "IDLE_CONNECTION_HEALTHY_NS", HttpUrl.FRAGMENT_ENCODE_SET, "MAX_TUNNEL_ATTEMPTS", HttpUrl.FRAGMENT_ENCODE_SET, "NPE_THROW_WITH_NULL", HttpUrl.FRAGMENT_ENCODE_SET, "newTestConnection", "Lokhttp3/internal/connection/RealConnection;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "route", "Lokhttp3/Route;", "socket", "Ljava/net/Socket;", "idleAtNs", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final RealConnection newTestConnection(RealConnectionPool connectionPool, Route route, Socket socket, long idleAtNs) {
/* 1 */                 connectionPool.getClass();
/* 4 */                 route.getClass();
/* 7 */                 socket.getClass();
/* 12 */                RealConnection realConnection = new RealConnection(connectionPool, route);
/* 1 */                 realConnection.socket = socket;
/* 18 */                realConnection.setIdleAtNs$okhttp(idleAtNs);
/* 21 */                return realConnection;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
