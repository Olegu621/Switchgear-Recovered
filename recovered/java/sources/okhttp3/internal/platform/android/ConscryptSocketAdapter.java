            package okhttp3.internal.platform.android;

            import java.util.List;
            import javax.net.ssl.SSLSocket;
            import javax.net.ssl.SSLSocketFactory;
            import javax.net.ssl.X509TrustManager;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import okhttp3.Protocol;
            import okhttp3.internal.platform.ConscryptPlatform;
            import okhttp3.internal.platform.Platform;
            import org.conscrypt.Conscrypt;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, m6176d2 = {"Lokhttp3/internal/platform/android/ConscryptSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "()V", "configureTlsExtensions", HttpUrl.FRAGMENT_ENCODE_SET, "sslSocket", "Ljavax/net/ssl/SSLSocket;", "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "protocols", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Protocol;", "getSelectedProtocol", "isSupported", HttpUrl.FRAGMENT_ENCODE_SET, "matchesSocket", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class ConscryptSocketAdapter implements SocketAdapter {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final DeferredSocketAdapter.Factory factory = new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion$factory$1
                    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                    public SocketAdapter create(SSLSocket sslSocket) {
/* 1 */                 sslSocket.getClass();
/* 6 */                 return new ConscryptSocketAdapter();
                    }

                    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                    public boolean matchesSocket(SSLSocket sslSocket) {
/* 1 */                 sslSocket.getClass();
                        return ConscryptPlatform.INSTANCE.isSupported() && Conscrypt.isConscrypt(sslSocket);
                    }
                };

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public void configureTlsExtensions(SSLSocket sslSocket, String hostname, List<? extends Protocol> protocols) {
/* 1 */             sslSocket.getClass();
/* 4 */             protocols.getClass();
/* 11 */            if (matchesSocket(sslSocket)) {
/* 14 */                Conscrypt.setUseSessionTickets(sslSocket, true);
/* 26 */                Object[] array = Platform.INSTANCE.alpnProtocolNames(protocols).toArray(new String[0]);
/* 30 */                if (array != null) {
/* 34 */                    Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
                        } else {
/* 40 */                    C1951n4.m6868s("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                    }
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public String getSelectedProtocol(SSLSocket sslSocket) {
/* 1 */             sslSocket.getClass();
/* 8 */             if (matchesSocket(sslSocket)) {
/* 10 */                return Conscrypt.getApplicationProtocol(sslSocket);
                    }
/* 15 */            return null;
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public boolean isSupported() {
/* 3 */             return ConscryptPlatform.INSTANCE.isSupported();
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public boolean matchesSocket(SSLSocket sslSocket) {
/* 1 */             sslSocket.getClass();
/* 4 */             return Conscrypt.isConscrypt(sslSocket);
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
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m6176d2 = {"Lokhttp3/internal/platform/android/ConscryptSocketAdapter$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "factory", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "getFactory", "()Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final DeferredSocketAdapter.Factory getFactory() {
/* 1 */                 return ConscryptSocketAdapter.factory;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
