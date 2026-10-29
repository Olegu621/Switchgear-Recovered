            package okhttp3.internal.platform;

            import android.os.Build;
            import android.security.NetworkSecurityPolicy;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import javax.net.ssl.SSLSocket;
            import javax.net.ssl.SSLSocketFactory;
            import javax.net.ssl.X509TrustManager;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import okhttp3.Protocol;
            import okhttp3.internal.platform.android.Android10SocketAdapter;
            import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
            import okhttp3.internal.platform.android.AndroidSocketAdapter;
            import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
            import okhttp3.internal.platform.android.ConscryptSocketAdapter;
            import okhttp3.internal.platform.android.DeferredSocketAdapter;
            import okhttp3.internal.platform.android.SocketAdapter;
            import okhttp3.internal.tls.CertificateChainCleaner;
            import p000.C2103qd;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m6176d2 = {"Lokhttp3/internal/platform/Android10Platform;", "Lokhttp3/internal/platform/Platform;", "()V", "socketAdapters", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/platform/android/SocketAdapter;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "configureTlsExtensions", HttpUrl.FRAGMENT_ENCODE_SET, "sslSocket", "Ljavax/net/ssl/SSLSocket;", "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "protocols", "Lokhttp3/Protocol;", "getSelectedProtocol", "isCleartextTrafficPermitted", HttpUrl.FRAGMENT_ENCODE_SET, "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class Android10Platform extends Platform {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final boolean isSupported;
                private final List<SocketAdapter> socketAdapters;

                static {
/* 26 */            isSupported = Platform.INSTANCE.isAndroid() && Build.VERSION.SDK_INT >= 29;
                }

                public Android10Platform() {
/* 58 */            ArrayList arrayListM7773h = C2103qd.m7773h(new SocketAdapter[]{Android10SocketAdapter.INSTANCE.buildIfSupported(), new DeferredSocketAdapter(AndroidSocketAdapter.INSTANCE.getPlayProviderFactory()), new DeferredSocketAdapter(ConscryptSocketAdapter.INSTANCE.getFactory()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.INSTANCE.getFactory())});
/* 64 */            ArrayList arrayList = new ArrayList();
/* 75 */            for (Object obj : arrayListM7773h) {
/* 88 */                if (((SocketAdapter) obj).isSupported()) {
/* 90 */                    arrayList.add(obj);
                        }
                    }
/* 94 */            this.socketAdapters = arrayList;
                }

                @Override // okhttp3.internal.platform.Platform
                public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager trustManager) {
/* 1 */             trustManager.getClass();
/* 6 */             AndroidCertificateChainCleaner androidCertificateChainCleanerBuildIfSupported = AndroidCertificateChainCleaner.INSTANCE.buildIfSupported(trustManager);
                    return androidCertificateChainCleanerBuildIfSupported == null ? super.buildCertificateChainCleaner(trustManager) : androidCertificateChainCleanerBuildIfSupported;
                }

                @Override // okhttp3.internal.platform.Platform
                public void configureTlsExtensions(SSLSocket sslSocket, String hostname, List<? extends Protocol> protocols) {
                    Object next;
/* 1 */             sslSocket.getClass();
/* 4 */             protocols.getClass();
/* 9 */             Iterator<T> it = this.socketAdapters.iterator();
/* 30 */            do {
/* 17 */                if (!it.hasNext()) {
/* 33 */                    next = null;
                            break;
                        }
/* 19 */                next = it.next();
/* 30 */            } while (!((SocketAdapter) next).matchesSocket(sslSocket));
/* 34 */            SocketAdapter socketAdapter = (SocketAdapter) next;
/* 36 */            if (socketAdapter == null) {
/* 38 */                return;
                    }
/* 39 */            socketAdapter.configureTlsExtensions(sslSocket, hostname, protocols);
                }

                @Override // okhttp3.internal.platform.Platform
                public String getSelectedProtocol(SSLSocket sslSocket) {
                    Object next;
/* 1 */             sslSocket.getClass();
/* 6 */             Iterator<T> it = this.socketAdapters.iterator();
/* 28 */            do {
/* 15 */                if (!it.hasNext()) {
/* 31 */                    next = null;
                            break;
                        }
/* 17 */                next = it.next();
/* 28 */            } while (!((SocketAdapter) next).matchesSocket(sslSocket));
/* 32 */            SocketAdapter socketAdapter = (SocketAdapter) next;
/* 34 */            if (socketAdapter == null) {
/* 14 */                return null;
                    }
/* 37 */            return socketAdapter.getSelectedProtocol(sslSocket);
                }

                @Override // okhttp3.internal.platform.Platform
                public boolean isCleartextTrafficPermitted(String hostname) {
/* 1 */             hostname.getClass();
/* 8 */             return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
                }

                @Override // okhttp3.internal.platform.Platform
                public X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) {
                    Object next;
/* 1 */             sslSocketFactory.getClass();
/* 6 */             Iterator<T> it = this.socketAdapters.iterator();
/* 28 */            do {
/* 15 */                if (!it.hasNext()) {
/* 31 */                    next = null;
                            break;
                        }
/* 17 */                next = it.next();
/* 28 */            } while (!((SocketAdapter) next).matchesSocketFactory(sslSocketFactory));
/* 32 */            SocketAdapter socketAdapter = (SocketAdapter) next;
/* 34 */            if (socketAdapter == null) {
/* 14 */                return null;
                    }
/* 37 */            return socketAdapter.trustManager(sslSocketFactory);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, m6176d2 = {"Lokhttp3/internal/platform/Android10Platform$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "isSupported", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final Platform buildIfSupported() {
/* 5 */                 if (isSupported()) {
/* 9 */                     return new Android10Platform();
                        }
/* 13 */                return null;
                    }

                    public final boolean isSupported() {
/* 1 */                 return Android10Platform.isSupported;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
