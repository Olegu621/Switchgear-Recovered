            package okhttp3.internal.platform;

            import android.os.Build;
            import android.security.NetworkSecurityPolicy;
            import java.io.IOException;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.net.InetSocketAddress;
            import java.net.Socket;
            import java.security.cert.TrustAnchor;
            import java.security.cert.X509Certificate;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import javax.net.ssl.SSLSocket;
            import javax.net.ssl.SSLSocketFactory;
            import javax.net.ssl.X509TrustManager;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import okhttp3.Protocol;
            import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
            import okhttp3.internal.platform.android.AndroidSocketAdapter;
            import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
            import okhttp3.internal.platform.android.CloseGuard;
            import okhttp3.internal.platform.android.ConscryptSocketAdapter;
            import okhttp3.internal.platform.android.DeferredSocketAdapter;
            import okhttp3.internal.platform.android.SocketAdapter;
            import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
            import okhttp3.internal.tls.CertificateChainCleaner;
            import okhttp3.internal.tls.TrustRootIndex;
            import p000.C2103qd;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 42\u00020\u0001:\u000245B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, m6176d2 = {"Lokhttp3/internal/platform/AndroidPlatform;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", HttpUrl.FRAGMENT_ENCODE_SET, "connectTimeout", HttpUrl.FRAGMENT_ENCODE_SET, "connectSocket", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", HttpUrl.FRAGMENT_ENCODE_SET, "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Protocol;", "protocols", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "closer", HttpUrl.FRAGMENT_ENCODE_SET, "getStackTraceForCloseable", "(Ljava/lang/String;)Ljava/lang/Object;", "message", "stackTrace", "logCloseableLeak", "(Ljava/lang/String;Ljava/lang/Object;)V", HttpUrl.FRAGMENT_ENCODE_SET, "isCleartextTrafficPermitted", "(Ljava/lang/String;)Z", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/TrustRootIndex;", "Lokhttp3/internal/platform/android/SocketAdapter;", "socketAdapters", "Ljava/util/List;", "Lokhttp3/internal/platform/android/CloseGuard;", "closeGuard", "Lokhttp3/internal/platform/android/CloseGuard;", "Companion", "CustomTrustRootIndex", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class AndroidPlatform extends Platform {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final boolean isSupported;
                private final CloseGuard closeGuard;
                private final List<SocketAdapter> socketAdapters;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\t\u0010\b\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m6176d2 = {"Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "findByIssuerAndSignatureMethod", "Ljava/lang/reflect/Method;", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "findByIssuerAndSignature", "Ljava/security/cert/X509Certificate;", "cert", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final /* data */ class CustomTrustRootIndex implements TrustRootIndex {
                    private final Method findByIssuerAndSignatureMethod;
                    private final X509TrustManager trustManager;

                    public CustomTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
/* 1 */                 x509TrustManager.getClass();
/* 4 */                 method.getClass();
/* 10 */                this.trustManager = x509TrustManager;
/* 12 */                this.findByIssuerAndSignatureMethod = method;
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    private final X509TrustManager getTrustManager() {
/* 1 */                 return this.trustManager;
                    }

                    /* JADX INFO: renamed from: component2, reason: from getter */
                    private final Method getFindByIssuerAndSignatureMethod() {
/* 1 */                 return this.findByIssuerAndSignatureMethod;
                    }

                    public static /* synthetic */ CustomTrustRootIndex copy$default(CustomTrustRootIndex customTrustRootIndex, X509TrustManager x509TrustManager, Method method, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     x509TrustManager = customTrustRootIndex.trustManager;
                        }
/* 9 */                 if ((i & 2) != 0) {
/* 11 */                    method = customTrustRootIndex.findByIssuerAndSignatureMethod;
                        }
/* 13 */                return customTrustRootIndex.copy(x509TrustManager, method);
                    }

                    public final CustomTrustRootIndex copy(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
/* 1 */                 trustManager.getClass();
/* 4 */                 findByIssuerAndSignatureMethod.getClass();
/* 9 */                 return new CustomTrustRootIndex(trustManager, findByIssuerAndSignatureMethod);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
/* 8 */                 if (!(other instanceof CustomTrustRootIndex)) {
/* 7 */                     return false;
                        }
/* 11 */                CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) other;
                        return Intrinsics.m6216a(this.trustManager, customTrustRootIndex.trustManager) && Intrinsics.m6216a(this.findByIssuerAndSignatureMethod, customTrustRootIndex.findByIssuerAndSignatureMethod);
                    }

                    @Override // okhttp3.internal.tls.TrustRootIndex
                    public X509Certificate findByIssuerAndSignature(X509Certificate cert) {
/* 1 */                 cert.getClass();
                        try {
/* 12 */                    Object objInvoke = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, cert);
/* 16 */                    if (objInvoke != null) {
/* 20 */                        return ((TrustAnchor) objInvoke).getTrustedCert();
                            }
/* 32 */                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
                        } catch (IllegalAccessException e) {
/* 43 */                    throw new AssertionError("unable to get issues and signature", e);
                        } catch (InvocationTargetException unused) {
/* 33 */                    return null;
                        }
                    }

                    public int hashCode() {
/* 15 */                return this.findByIssuerAndSignatureMethod.hashCode() + (this.trustManager.hashCode() * 31);
                    }

                    public String toString() {
/* 28 */                return "CustomTrustRootIndex(trustManager=" + this.trustManager + ", findByIssuerAndSignatureMethod=" + this.findByIssuerAndSignatureMethod + ')';
                    }
                }

                static {
/* 15 */            boolean z = false;
/* 16 */            if (Platform.INSTANCE.isAndroid() && Build.VERSION.SDK_INT < 30) {
/* 26 */                z = true;
                    }
/* 27 */            isSupported = z;
                }

                public AndroidPlatform() {
/* 59 */            ArrayList arrayListM7773h = C2103qd.m7773h(new SocketAdapter[]{StandardAndroidSocketAdapter.Companion.buildIfSupported$default(StandardAndroidSocketAdapter.INSTANCE, null, 1, null), new DeferredSocketAdapter(AndroidSocketAdapter.INSTANCE.getPlayProviderFactory()), new DeferredSocketAdapter(ConscryptSocketAdapter.INSTANCE.getFactory()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.INSTANCE.getFactory())});
/* 65 */            ArrayList arrayList = new ArrayList();
/* 76 */            for (Object obj : arrayListM7773h) {
/* 89 */                if (((SocketAdapter) obj).isSupported()) {
/* 91 */                    arrayList.add(obj);
                        }
                    }
/* 95 */            this.socketAdapters = arrayList;
/* 103 */           this.closeGuard = CloseGuard.INSTANCE.get();
                }

                @Override // okhttp3.internal.platform.Platform
                public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager trustManager) {
/* 1 */             trustManager.getClass();
/* 6 */             AndroidCertificateChainCleaner androidCertificateChainCleanerBuildIfSupported = AndroidCertificateChainCleaner.INSTANCE.buildIfSupported(trustManager);
                    return androidCertificateChainCleanerBuildIfSupported == null ? super.buildCertificateChainCleaner(trustManager) : androidCertificateChainCleanerBuildIfSupported;
                }

                @Override // okhttp3.internal.platform.Platform
                public TrustRootIndex buildTrustRootIndex(X509TrustManager trustManager) {
/* 1 */             trustManager.getClass();
                    try {
/* 16 */                Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
/* 21 */                declaredMethod.setAccessible(true);
/* 26 */                return new CustomTrustRootIndex(trustManager, declaredMethod);
                    } catch (NoSuchMethodException unused) {
/* 30 */                return super.buildTrustRootIndex(trustManager);
                    }
                }

                @Override // okhttp3.internal.platform.Platform
                public void configureTlsExtensions(SSLSocket sslSocket, String hostname, List<Protocol> protocols) {
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
                public void connectSocket(Socket socket, InetSocketAddress address, int connectTimeout) throws IOException {
/* 1 */             socket.getClass();
/* 4 */             address.getClass();
                    try {
/* 7 */                 socket.connect(address, connectTimeout);
                    } catch (ClassCastException e) {
/* 16 */                if (Build.VERSION.SDK_INT != 26) {
/* 26 */                    throw e;
                        }
/* 25 */                throw new IOException("Exception in connect", e);
                    }
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
                public Object getStackTraceForCloseable(String closer) {
/* 1 */             closer.getClass();
/* 6 */             return this.closeGuard.createAndOpen(closer);
                }

                @Override // okhttp3.internal.platform.Platform
                public boolean isCleartextTrafficPermitted(String hostname) {
/* 1 */             hostname.getClass();
/* 8 */             return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
                }

                @Override // okhttp3.internal.platform.Platform
                public void logCloseableLeak(String message, Object stackTrace) {
/* 1 */             message.getClass();
/* 10 */            if (this.closeGuard.warnIfOpen(stackTrace)) {
/* 21 */                return;
                    }
/* 18 */            Platform.log$default(this, message, 5, null, 4, null);
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
                @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, m6176d2 = {"Lokhttp3/internal/platform/AndroidPlatform$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "isSupported", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final Platform buildIfSupported() {
/* 5 */                 if (isSupported()) {
/* 9 */                     return new AndroidPlatform();
                        }
/* 13 */                return null;
                    }

                    public final boolean isSupported() {
/* 1 */                 return AndroidPlatform.isSupported;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
