            package okhttp3.internal.platform.android;

            import android.net.ssl.SSLSockets;
            import android.os.Build;
            import java.io.IOException;
            import java.util.List;
            import javax.net.ssl.SSLParameters;
            import javax.net.ssl.SSLSocket;
            import javax.net.ssl.SSLSocketFactory;
            import javax.net.ssl.X509TrustManager;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import okhttp3.Protocol;
            import okhttp3.internal.platform.Platform;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0017J\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, m6176d2 = {"Lokhttp3/internal/platform/android/Android10SocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "()V", "configureTlsExtensions", HttpUrl.FRAGMENT_ENCODE_SET, "sslSocket", "Ljavax/net/ssl/SSLSocket;", "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "protocols", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Protocol;", "getSelectedProtocol", "isSupported", HttpUrl.FRAGMENT_ENCODE_SET, "matchesSocket", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class Android10SocketAdapter implements SocketAdapter {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public void configureTlsExtensions(SSLSocket sslSocket, String hostname, List<? extends Protocol> protocols) throws IOException {
/* 1 */             sslSocket.getClass();
/* 4 */             protocols.getClass();
                    try {
/* 2 */                 SSLSockets.setUseSessionTickets(sslSocket, true);
/* 10 */                SSLParameters sSLParameters = sslSocket.getSSLParameters();
/* 23 */                Object[] array = Platform.INSTANCE.alpnProtocolNames(protocols).toArray(new String[0]);
/* 27 */                if (array == null) {
/* 45 */                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
/* 1 */                 sSLParameters.setApplicationProtocols((String[]) array);
/* 34 */                sslSocket.setSSLParameters(sSLParameters);
                    } catch (IllegalArgumentException e) {
/* 54 */                throw new IOException("Android internal error", e);
                    }
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public String getSelectedProtocol(SSLSocket sslSocket) {
/* 1 */             sslSocket.getClass();
/* 1 */             String applicationProtocol = sslSocket.getApplicationProtocol();
/* 18 */            if (applicationProtocol == null ? true : applicationProtocol.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
/* 20 */                return null;
                    }
/* 21 */            return applicationProtocol;
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public boolean isSupported() {
/* 3 */             return INSTANCE.isSupported();
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public boolean matchesSocket(SSLSocket sslSocket) {
/* 1 */             sslSocket.getClass();
/* 1 */             return SSLSockets.isSupportedSocket(sslSocket);
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
/* 1 */             return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
/* 1 */             return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m6176d2 = {"Lokhttp3/internal/platform/android/Android10SocketAdapter$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "buildIfSupported", "Lokhttp3/internal/platform/android/SocketAdapter;", "isSupported", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final SocketAdapter buildIfSupported() {
/* 5 */                 if (isSupported()) {
/* 9 */                     return new Android10SocketAdapter();
                        }
/* 13 */                return null;
                    }

                    public final boolean isSupported() {
                        return Platform.INSTANCE.isAndroid() && Build.VERSION.SDK_INT >= 29;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
