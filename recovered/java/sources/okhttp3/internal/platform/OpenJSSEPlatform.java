            package okhttp3.internal.platform;

            import java.security.KeyStore;
            import java.security.KeyStoreException;
            import java.security.NoSuchAlgorithmException;
            import java.security.Provider;
            import java.util.Arrays;
            import java.util.List;
            import javax.net.ssl.SSLContext;
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
            import org.openjsse.net.ssl.OpenJSSE;
            import p000.C1951n4;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m6176d2 = {"Lokhttp3/internal/platform/OpenJSSEPlatform;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "platformTrustManager", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", HttpUrl.FRAGMENT_ENCODE_SET, "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Protocol;", "protocols", HttpUrl.FRAGMENT_ENCODE_SET, "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/security/Provider;", "provider", "Ljava/security/Provider;", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class OpenJSSEPlatform extends Platform {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final boolean isSupported;
                private final Provider provider;

                static {
/* 4 */             Companion companion = new Companion(null);
/* 7 */             INSTANCE = companion;
/* 9 */             boolean z = false;
                    try {
/* 20 */                Class.forName("org.openjsse.net.ssl.OpenJSSE", false, companion.getClass().getClassLoader());
/* 23 */                z = true;
                    } catch (ClassNotFoundException unused) {
                    }
/* 24 */            isSupported = z;
                }

                private OpenJSSEPlatform() {
/* 11 */            this.provider = new OpenJSSE();
                }

                @Override // okhttp3.internal.platform.Platform
                public void configureTlsExtensions(SSLSocket sslSocket, String hostname, List<Protocol> protocols) {
/* 1 */             sslSocket.getClass();
/* 4 */             protocols.getClass();
/* 7 */             super.configureTlsExtensions(sslSocket, hostname, protocols);
                }

                @Override // okhttp3.internal.platform.Platform
                public String getSelectedProtocol(SSLSocket sslSocket) {
/* 1 */             sslSocket.getClass();
/* 4 */             return super.getSelectedProtocol(sslSocket);
                }

                @Override // okhttp3.internal.platform.Platform
                public SSLContext newSSLContext() throws NoSuchAlgorithmException {
/* 5 */             SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.provider);
/* 9 */             sSLContext.getClass();
/* 12 */            return sSLContext;
                }

                @Override // okhttp3.internal.platform.Platform
                public X509TrustManager platformTrustManager() throws NoSuchAlgorithmException, KeyStoreException {
/* 7 */             TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.provider);
/* 12 */            trustManagerFactory.init((KeyStore) null);
/* 15 */            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
/* 19 */            trustManagers.getClass();
/* 24 */            if (trustManagers.length == 1) {
/* 27 */                TrustManager trustManager = trustManagers[0];
/* 31 */                if (trustManager instanceof X509TrustManager) {
/* 33 */                    if (trustManager != null) {
/* 35 */                        return (X509TrustManager) trustManager;
                            }
/* 40 */                    C1951n4.m6868s("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
/* 11 */                    return null;
                        }
                    }
/* 44 */            String string = Arrays.toString(trustManagers);
/* 48 */            string.getClass();
/* 57 */            ds0.m3190g(Intrinsics.m6219d(string, "Unexpected default trust managers: "));
/* 11 */            return null;
                }

                @Override // okhttp3.internal.platform.Platform
                public X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) {
/* 1 */             sslSocketFactory.getClass();
/* 11 */            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE");
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, m6176d2 = {"Lokhttp3/internal/platform/OpenJSSEPlatform$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "isSupported", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "buildIfSupported", "Lokhttp3/internal/platform/OpenJSSEPlatform;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final OpenJSSEPlatform buildIfSupported() {
/* 5 */                 DefaultConstructorMarker defaultConstructorMarker = null;
/* 6 */                 if (isSupported()) {
/* 10 */                    return new OpenJSSEPlatform(defaultConstructorMarker);
                        }
/* 5 */                 return null;
                    }

                    public final boolean isSupported() {
/* 1 */                 return OpenJSSEPlatform.isSupported;
                    }

/* 4 */             private Companion() {
                    }
                }

/* 13 */        public /* synthetic */ OpenJSSEPlatform(DefaultConstructorMarker defaultConstructorMarker) {
/* 14 */            this();
                }
            }
