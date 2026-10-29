            package okhttp3.internal.platform.android;

            import java.util.List;
            import javax.net.ssl.SSLSocket;
            import javax.net.ssl.SSLSocketFactory;
            import javax.net.ssl.X509TrustManager;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import okhttp3.Protocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m6176d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "socketAdapterFactory", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "(Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;)V", "delegate", "configureTlsExtensions", HttpUrl.FRAGMENT_ENCODE_SET, "sslSocket", "Ljavax/net/ssl/SSLSocket;", "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "protocols", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Protocol;", "getDelegate", "getSelectedProtocol", "isSupported", HttpUrl.FRAGMENT_ENCODE_SET, "matchesSocket", "Factory", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class DeferredSocketAdapter implements SocketAdapter {
                private SocketAdapter delegate;
                private final Factory socketAdapterFactory;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, m6176d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", HttpUrl.FRAGMENT_ENCODE_SET, "create", "Lokhttp3/internal/platform/android/SocketAdapter;", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "matchesSocket", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public interface Factory {
                    SocketAdapter create(SSLSocket sslSocket);

                    boolean matchesSocket(SSLSocket sslSocket);
                }

                public DeferredSocketAdapter(Factory factory) {
/* 1 */             factory.getClass();
/* 7 */             this.socketAdapterFactory = factory;
                }

                private final synchronized SocketAdapter getDelegate(SSLSocket sslSocket) {
                    try {
/* 4 */                 if (this.delegate == null && this.socketAdapterFactory.matchesSocket(sslSocket)) {
/* 20 */                    this.delegate = this.socketAdapterFactory.create(sslSocket);
                        }
                    } catch (Throwable th) {
/* 30 */                throw th;
                    }
/* 25 */            return this.delegate;
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public void configureTlsExtensions(SSLSocket sslSocket, String hostname, List<? extends Protocol> protocols) {
/* 1 */             sslSocket.getClass();
/* 4 */             protocols.getClass();
/* 7 */             SocketAdapter delegate = getDelegate(sslSocket);
/* 11 */            if (delegate == null) {
/* 13 */                return;
                    }
/* 14 */            delegate.configureTlsExtensions(sslSocket, hostname, protocols);
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public String getSelectedProtocol(SSLSocket sslSocket) {
/* 1 */             sslSocket.getClass();
/* 4 */             SocketAdapter delegate = getDelegate(sslSocket);
/* 8 */             if (delegate == null) {
/* 10 */                return null;
                    }
/* 12 */            return delegate.getSelectedProtocol(sslSocket);
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public boolean isSupported() {
/* 1 */             return true;
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public boolean matchesSocket(SSLSocket sslSocket) {
/* 1 */             sslSocket.getClass();
/* 6 */             return this.socketAdapterFactory.matchesSocket(sslSocket);
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
/* 1 */             return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
/* 1 */             return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
                }
            }
