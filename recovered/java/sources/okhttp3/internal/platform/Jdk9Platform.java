            package okhttp3.internal.platform;

            import java.util.List;
            import javax.net.ssl.SSLParameters;
            import javax.net.ssl.SSLSocket;
            import javax.net.ssl.SSLSocketFactory;
            import javax.net.ssl.X509TrustManager;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import okhttp3.Protocol;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m6176d2 = {"Lokhttp3/internal/platform/Jdk9Platform;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", HttpUrl.FRAGMENT_ENCODE_SET, "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Protocol;", "protocols", HttpUrl.FRAGMENT_ENCODE_SET, "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public class Jdk9Platform extends Platform {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final boolean isAvailable;

                static {
/* 11 */            String property = System.getProperty("java.specification.version");
/* 19 */            Integer intOrNull = property == null ? null : StringsKt.toIntOrNull(property);
/* 23 */            boolean z = false;
/* 25 */            if (intOrNull == null) {
                        try {
/* 41 */                    SSLSocket.class.getMethod("getApplicationProtocol", null);
/* 35 */                    z = true;
                        } catch (NoSuchMethodException unused) {
                        }
                    } else if (intOrNull.intValue() >= 9) {
/* 35 */                z = true;
                    }
/* 45 */            isAvailable = z;
                }

                @Override // okhttp3.internal.platform.Platform
                public void configureTlsExtensions(SSLSocket sslSocket, String hostname, List<Protocol> protocols) {
/* 1 */             sslSocket.getClass();
/* 4 */             protocols.getClass();
/* 7 */             SSLParameters sSLParameters = sslSocket.getSSLParameters();
/* 20 */            Object[] array = Platform.INSTANCE.alpnProtocolNames(protocols).toArray(new String[0]);
/* 24 */            if (array == null) {
/* 37 */                C1951n4.m6868s("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    } else {
/* 1 */                 sSLParameters.setApplicationProtocols((String[]) array);
/* 31 */                sslSocket.setSSLParameters(sSLParameters);
                    }
                }

                @Override // okhttp3.internal.platform.Platform
                public String getSelectedProtocol(SSLSocket sslSocket) {
/* 1 */             sslSocket.getClass();
                    try {
/* 1 */                 String applicationProtocol = sslSocket.getApplicationProtocol();
/* 18 */                if (applicationProtocol == null ? true : applicationProtocol.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
/* 22 */                    return null;
                        }
/* 21 */                return applicationProtocol;
                    } catch (UnsupportedOperationException unused) {
/* 22 */                return null;
                    }
                }

                @Override // okhttp3.internal.platform.Platform
                public X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) {
/* 1 */             sslSocketFactory.getClass();
/* 11 */            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, m6176d2 = {"Lokhttp3/internal/platform/Jdk9Platform$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "isAvailable", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Jdk9Platform;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final Jdk9Platform buildIfSupported() {
/* 5 */                 if (isAvailable()) {
/* 9 */                     return new Jdk9Platform();
                        }
/* 13 */                return null;
                    }

                    public final boolean isAvailable() {
/* 1 */                 return Jdk9Platform.isAvailable;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
