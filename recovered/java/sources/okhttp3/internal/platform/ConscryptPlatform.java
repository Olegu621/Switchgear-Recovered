            package okhttp3.internal.platform;

            import java.security.KeyManagementException;
            import java.security.KeyStore;
            import java.security.KeyStoreException;
            import java.security.NoSuchAlgorithmException;
            import java.security.Provider;
            import java.security.cert.X509Certificate;
            import java.util.Arrays;
            import java.util.List;
            import javax.net.ssl.SSLContext;
            import javax.net.ssl.SSLSession;
            import javax.net.ssl.SSLSocket;
            import javax.net.ssl.SSLSocketFactory;
            import javax.net.ssl.TrustManager;
            import javax.net.ssl.TrustManagerFactory;
            import javax.net.ssl.X509TrustManager;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import okhttp3.Protocol;
            import org.conscrypt.Conscrypt;
            import org.conscrypt.ConscryptHostnameVerifier;
            import p000.C1951n4;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, m6176d2 = {"Lokhttp3/internal/platform/ConscryptPlatform;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "platformTrustManager", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", HttpUrl.FRAGMENT_ENCODE_SET, "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Protocol;", "protocols", HttpUrl.FRAGMENT_ENCODE_SET, "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "newSslSocketFactory", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "Ljava/security/Provider;", "provider", "Ljava/security/Provider;", "Companion", "DisabledHostnameVerifier", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class ConscryptPlatform extends Platform {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final boolean isSupported;
                private final Provider provider;

                static {
/* 4 */             Companion companion = new Companion(null);
/* 7 */             INSTANCE = companion;
/* 9 */             boolean z = false;
                    try {
/* 20 */                Class.forName("org.conscrypt.Conscrypt$Version", false, companion.getClass().getClassLoader());
/* 27 */                if (Conscrypt.isAvailable() && companion.atLeastVersion(2, 1, 0)) {
/* 37 */                    z = true;
                        }
                    } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                    }
/* 38 */            isSupported = z;
                }

                private ConscryptPlatform() {
/* 4 */             Provider providerNewProvider = Conscrypt.newProvider();
/* 8 */             providerNewProvider.getClass();
/* 11 */            this.provider = providerNewProvider;
                }

                @Override // okhttp3.internal.platform.Platform
                public void configureTlsExtensions(SSLSocket sslSocket, String hostname, List<Protocol> protocols) {
/* 1 */             sslSocket.getClass();
/* 4 */             protocols.getClass();
/* 11 */            if (!Conscrypt.isConscrypt(sslSocket)) {
/* 44 */                super.configureTlsExtensions(sslSocket, hostname, protocols);
/* 47 */                return;
                    }
/* 14 */            Conscrypt.setUseSessionTickets(sslSocket, true);
/* 26 */            Object[] array = Platform.INSTANCE.alpnProtocolNames(protocols).toArray(new String[0]);
/* 30 */            if (array != null) {
/* 34 */                Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
                    } else {
/* 40 */                C1951n4.m6868s("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                }

                @Override // okhttp3.internal.platform.Platform
                public String getSelectedProtocol(SSLSocket sslSocket) {
/* 1 */             sslSocket.getClass();
                    return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.getSelectedProtocol(sslSocket);
                }

                @Override // okhttp3.internal.platform.Platform
                public SSLContext newSSLContext() throws NoSuchAlgorithmException {
/* 5 */             SSLContext sSLContext = SSLContext.getInstance("TLS", this.provider);
/* 9 */             sSLContext.getClass();
/* 12 */            return sSLContext;
                }

                @Override // okhttp3.internal.platform.Platform
                public SSLSocketFactory newSslSocketFactory(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
/* 1 */             trustManager.getClass();
/* 4 */             SSLContext sSLContextNewSSLContext = newSSLContext();
/* 15 */            sSLContextNewSSLContext.init(null, new TrustManager[]{trustManager}, null);
/* 18 */            SSLSocketFactory socketFactory = sSLContextNewSSLContext.getSocketFactory();
/* 22 */            socketFactory.getClass();
/* 25 */            return socketFactory;
                }

                @Override // okhttp3.internal.platform.Platform
                public X509TrustManager platformTrustManager() throws NoSuchAlgorithmException, KeyStoreException {
/* 5 */             TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
/* 10 */            trustManagerFactory.init((KeyStore) null);
/* 13 */            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
/* 17 */            trustManagers.getClass();
/* 22 */            if (trustManagers.length == 1) {
/* 25 */                TrustManager trustManager = trustManagers[0];
/* 29 */                if (trustManager instanceof X509TrustManager) {
/* 31 */                    if (trustManager == null) {
/* 45 */                        C1951n4.m6868s("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
/* 9 */                         return null;
                            }
/* 33 */                    X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
/* 39 */                    Conscrypt.setHostnameVerifier(x509TrustManager, DisabledHostnameVerifier.INSTANCE);
/* 42 */                    return x509TrustManager;
                        }
                    }
/* 49 */            String string = Arrays.toString(trustManagers);
/* 53 */            string.getClass();
/* 62 */            ds0.m3190g(Intrinsics.m6219d(string, "Unexpected default trust managers: "));
/* 9 */             return null;
                }

                @Override // okhttp3.internal.platform.Platform
                public X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) {
/* 1 */             sslSocketFactory.getClass();
/* 4 */             return null;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\fJ\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\r"}, m6176d2 = {"Lokhttp3/internal/platform/ConscryptPlatform$DisabledHostnameVerifier;", "Lorg/conscrypt/ConscryptHostnameVerifier;", "()V", "verify", HttpUrl.FRAGMENT_ENCODE_SET, "certs", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/security/cert/X509Certificate;", "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "session", "Ljavax/net/ssl/SSLSession;", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 1 */         public static final class DisabledHostnameVerifier implements ConscryptHostnameVerifier {
                    public static final DisabledHostnameVerifier INSTANCE = new DisabledHostnameVerifier();

                    private DisabledHostnameVerifier() {
                    }

                    public final boolean verify(String hostname, SSLSession session) {
/* 1 */                 return true;
                    }

/* 2 */             public boolean verify(X509Certificate[] certs, String hostname, SSLSession session) {
/* 3 */                 return true;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\r"}, m6176d2 = {"Lokhttp3/internal/platform/ConscryptPlatform$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "isSupported", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "atLeastVersion", "major", HttpUrl.FRAGMENT_ENCODE_SET, "minor", "patch", "buildIfSupported", "Lokhttp3/internal/platform/ConscryptPlatform;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public static /* synthetic */ boolean atLeastVersion$default(Companion companion, int i, int i2, int i3, int i4, Object obj) {
/* 4 */                 if ((i4 & 2) != 0) {
/* 6 */                     i2 = 0;
                        }
/* 9 */                 if ((i4 & 4) != 0) {
/* 11 */                    i3 = 0;
                        }
/* 12 */                return companion.atLeastVersion(i, i2, i3);
                    }

                    public final boolean atLeastVersion(int major, int minor, int patch) {
/* 1 */                 Conscrypt.Version version = Conscrypt.version();
/* 11 */                if (version.major() != major) {
                            return version.major() > major;
                        }
/* 25 */                if (version.minor() != minor) {
                            return version.minor() > minor;
                        }
                        return version.patch() >= patch;
                    }

                    public final ConscryptPlatform buildIfSupported() {
/* 5 */                 DefaultConstructorMarker defaultConstructorMarker = null;
/* 6 */                 if (isSupported()) {
/* 10 */                    return new ConscryptPlatform(defaultConstructorMarker);
                        }
/* 5 */                 return null;
                    }

                    public final boolean isSupported() {
/* 1 */                 return ConscryptPlatform.isSupported;
                    }

/* 4 */             private Companion() {
                    }
                }

/* 13 */        public /* synthetic */ ConscryptPlatform(DefaultConstructorMarker defaultConstructorMarker) {
/* 14 */            this();
                }
            }
