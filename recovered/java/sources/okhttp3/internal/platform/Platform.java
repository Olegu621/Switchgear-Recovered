            package okhttp3.internal.platform;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.net.InetSocketAddress;
            import java.net.Socket;
            import java.security.GeneralSecurityException;
            import java.security.KeyStore;
            import java.security.NoSuchAlgorithmException;
            import java.security.Security;
            import java.security.cert.X509Certificate;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.logging.Level;
            import java.util.logging.Logger;
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
            import okhttp3.OkHttpClient;
            import okhttp3.Protocol;
            import okhttp3.internal.Util;
            import okhttp3.internal.platform.android.AndroidLog;
            import okhttp3.internal.tls.BasicCertificateChainCleaner;
            import okhttp3.internal.tls.BasicTrustRootIndex;
            import okhttp3.internal.tls.CertificateChainCleaner;
            import okhttp3.internal.tls.TrustRootIndex;
            import okio.Buffer;
            import p000.C1951n4;
            import p000.C2122qw;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 >2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010$\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J-\u0010*\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\"2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u0004\u0018\u00010\u00012\u0006\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u00101J!\u00103\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00042\b\u00102\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010\u0006¨\u0006?"}, m6176d2 = {"Lokhttp3/internal/platform/Platform;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "getPrefix", "()Ljava/lang/String;", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "platformTrustManager", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Protocol;", "protocols", HttpUrl.FRAGMENT_ENCODE_SET, "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "afterHandshake", "(Ljavax/net/ssl/SSLSocket;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", HttpUrl.FRAGMENT_ENCODE_SET, "connectTimeout", "connectSocket", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "message", FirebaseAnalytics.Param.LEVEL, HttpUrl.FRAGMENT_ENCODE_SET, "t", "log", "(Ljava/lang/String;ILjava/lang/Throwable;)V", HttpUrl.FRAGMENT_ENCODE_SET, "isCleartextTrafficPermitted", "(Ljava/lang/String;)Z", "closer", "getStackTraceForCloseable", "(Ljava/lang/String;)Ljava/lang/Object;", "stackTrace", "logCloseableLeak", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/TrustRootIndex;", "newSslSocketFactory", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "toString", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public class Platform {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                public static final int INFO = 4;
                public static final int WARN = 5;
                private static final Logger logger;
                private static volatile Platform platform;

                static {
/* 4 */             Companion companion = new Companion(null);
/* 7 */             INSTANCE = companion;
/* 13 */            platform = companion.findPlatform();
/* 25 */            logger = Logger.getLogger(OkHttpClient.class.getName());
                }

                public static final Platform get() {
/* 3 */             return INSTANCE.get();
                }

                public static /* synthetic */ void log$default(Platform platform2, String str, int i, Throwable th, int i2, Object obj) {
/* 1 */             if (obj != null) {
/* 19 */                C1951n4.m6866q("Super calls with default arguments not supported in this target, function: log");
/* 22 */                return;
                    }
/* 6 */             if ((i2 & 2) != 0) {
/* 8 */                 i = 4;
                    }
/* 10 */            if ((i2 & 4) != 0) {
/* 12 */                th = null;
                    }
/* 13 */            platform2.log(str, i, th);
                }

                public void afterHandshake(SSLSocket sslSocket) {
/* 1 */             sslSocket.getClass();
                }

                public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager trustManager) {
/* 1 */             trustManager.getClass();
/* 10 */            return new BasicCertificateChainCleaner(buildTrustRootIndex(trustManager));
                }

                public TrustRootIndex buildTrustRootIndex(X509TrustManager trustManager) {
/* 1 */             trustManager.getClass();
/* 6 */             X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
/* 10 */            acceptedIssuers.getClass();
/* 20 */            return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
                }

                public void configureTlsExtensions(SSLSocket sslSocket, String hostname, List<Protocol> protocols) {
/* 1 */             sslSocket.getClass();
/* 4 */             protocols.getClass();
                }

                public void connectSocket(Socket socket, InetSocketAddress address, int connectTimeout) throws IOException {
/* 1 */             socket.getClass();
/* 4 */             address.getClass();
/* 7 */             socket.connect(address, connectTimeout);
                }

                public final String getPrefix() {
/* 1 */             return "OkHttp";
                }

                public String getSelectedProtocol(SSLSocket sslSocket) {
/* 1 */             sslSocket.getClass();
/* 4 */             return null;
                }

                public Object getStackTraceForCloseable(String closer) {
/* 1 */             closer.getClass();
/* 12 */            if (logger.isLoggable(Level.FINE)) {
/* 16 */                return new Throwable(closer);
                    }
/* 20 */            return null;
                }

                public boolean isCleartextTrafficPermitted(String hostname) {
/* 1 */             hostname.getClass();
/* 4 */             return true;
                }

                public void log(String message, int level, Throwable t) {
/* 1 */             message.getClass();
/* 14 */            logger.log(level == 5 ? Level.WARNING : Level.INFO, message, t);
                }

                public void logCloseableLeak(String message, Object stackTrace) {
/* 1 */             message.getClass();
/* 4 */             if (stackTrace == null) {
/* 8 */                 message = Intrinsics.m6219d(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);", message);
                    }
/* 15 */            log(message, 5, (Throwable) stackTrace);
                }

                public SSLContext newSSLContext() throws NoSuchAlgorithmException {
/* 3 */             SSLContext sSLContext = SSLContext.getInstance("TLS");
/* 7 */             sSLContext.getClass();
/* 10 */            return sSLContext;
                }

                public SSLSocketFactory newSslSocketFactory(X509TrustManager trustManager) {
/* 1 */             trustManager.getClass();
                    try {
/* 4 */                 SSLContext sSLContextNewSSLContext = newSSLContext();
/* 15 */                sSLContextNewSSLContext.init(null, new TrustManager[]{trustManager}, null);
/* 18 */                SSLSocketFactory socketFactory = sSLContextNewSSLContext.getSocketFactory();
/* 22 */                socketFactory.getClass();
/* 25 */                return socketFactory;
                    } catch (GeneralSecurityException e) {
/* 38 */                throw new AssertionError(Intrinsics.m6219d(e, "No System TLS: "), e);
                    }
                }

                public X509TrustManager platformTrustManager() {
/* 5 */             TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
/* 10 */            trustManagerFactory.init((KeyStore) null);
/* 13 */            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
/* 17 */            trustManagers.getClass();
/* 22 */            if (trustManagers.length == 1) {
/* 25 */                TrustManager trustManager = trustManagers[0];
/* 29 */                if (trustManager instanceof X509TrustManager) {
/* 31 */                    if (trustManager != null) {
/* 33 */                        return (X509TrustManager) trustManager;
                            }
/* 38 */                    C1951n4.m6868s("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
/* 9 */                     return null;
                        }
                    }
/* 42 */            String string = Arrays.toString(trustManagers);
/* 46 */            string.getClass();
/* 55 */            ds0.m3190g(Intrinsics.m6219d(string, "Unexpected default trust managers: "));
/* 9 */             return null;
                }

                public String toString() {
/* 5 */             return getClass().getSimpleName();
                }

                public X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) {
/* 1 */             sslSocketFactory.getClass();
                    try {
/* 13 */                Object fieldOrNull = Util.readFieldOrNull(sslSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
/* 17 */                if (fieldOrNull == null) {
/* 4 */                     return null;
                        }
/* 28 */                return (X509TrustManager) Util.readFieldOrNull(fieldOrNull, X509TrustManager.class, "trustManager");
                    } catch (ClassNotFoundException unused) {
/* 4 */                 return null;
                    } catch (RuntimeException e) {
/* 46 */                if (!e.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
/* 49 */                    throw e;
                        }
/* 4 */                 return null;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012J\u0014\u0010\u0016\u001a\u00020\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m6176d2 = {"Lokhttp3/internal/platform/Platform$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "INFO", HttpUrl.FRAGMENT_ENCODE_SET, "WARN", "isAndroid", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isBouncyCastlePreferred", "isConscryptPreferred", "isOpenJSSEPreferred", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "platform", "Lokhttp3/internal/platform/Platform;", "alpnProtocolNames", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "protocols", "Lokhttp3/Protocol;", "concatLengthPrefixed", HttpUrl.FRAGMENT_ENCODE_SET, "findAndroidPlatform", "findJvmPlatform", "findPlatform", "get", "resetForTests", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    private final Platform findAndroidPlatform() {
/* 3 */                 AndroidLog.INSTANCE.enable();
/* 8 */                 Platform platformBuildIfSupported = Android10Platform.INSTANCE.buildIfSupported();
/* 12 */                if (platformBuildIfSupported != null) {
/* 23 */                    return platformBuildIfSupported;
                        }
/* 16 */                Platform platformBuildIfSupported2 = AndroidPlatform.Companion.buildIfSupported();
/* 20 */                platformBuildIfSupported2.getClass();
/* 23 */                return platformBuildIfSupported2;
                    }

                    private final Platform findJvmPlatform() {
                        OpenJSSEPlatform openJSSEPlatformBuildIfSupported;
                        BouncyCastlePlatform bouncyCastlePlatformBuildIfSupported;
                        ConscryptPlatform conscryptPlatformBuildIfSupported;
/* 5 */                 if (isConscryptPreferred() && (conscryptPlatformBuildIfSupported = ConscryptPlatform.INSTANCE.buildIfSupported()) != null) {
/* 15 */                    return conscryptPlatformBuildIfSupported;
                        }
/* 20 */                if (isBouncyCastlePreferred() && (bouncyCastlePlatformBuildIfSupported = BouncyCastlePlatform.INSTANCE.buildIfSupported()) != null) {
/* 30 */                    return bouncyCastlePlatformBuildIfSupported;
                        }
/* 35 */                if (isOpenJSSEPreferred() && (openJSSEPlatformBuildIfSupported = OpenJSSEPlatform.INSTANCE.buildIfSupported()) != null) {
/* 45 */                    return openJSSEPlatformBuildIfSupported;
                        }
/* 48 */                Jdk9Platform jdk9PlatformBuildIfSupported = Jdk9Platform.INSTANCE.buildIfSupported();
/* 52 */                if (jdk9PlatformBuildIfSupported != null) {
/* 54 */                    return jdk9PlatformBuildIfSupported;
                        }
/* 57 */                Platform platformBuildIfSupported = Jdk8WithJettyBootPlatform.Companion.buildIfSupported();
                        return platformBuildIfSupported != null ? platformBuildIfSupported : new Platform();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public final Platform findPlatform() {
                        return isAndroid() ? findAndroidPlatform() : findJvmPlatform();
                    }

                    private final boolean isBouncyCastlePreferred() {
/* 14 */                return "BC".equals(Security.getProviders()[0].getName());
                    }

                    private final boolean isConscryptPreferred() {
/* 14 */                return "Conscrypt".equals(Security.getProviders()[0].getName());
                    }

                    private final boolean isOpenJSSEPreferred() {
/* 14 */                return "OpenJSSE".equals(Security.getProviders()[0].getName());
                    }

                    public static /* synthetic */ void resetForTests$default(Companion companion, Platform platform, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     platform = companion.findPlatform();
                        }
/* 9 */                 companion.resetForTests(platform);
                    }

                    public final List<String> alpnProtocolNames(List<? extends Protocol> protocols) {
/* 1 */                 protocols.getClass();
/* 6 */                 ArrayList arrayList = new ArrayList();
/* 17 */                for (Object obj : protocols) {
/* 28 */                    if (((Protocol) obj) != Protocol.HTTP_1_0) {
/* 30 */                        arrayList.add(obj);
                            }
                        }
/* 42 */                ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(arrayList, 10));
/* 45 */                Iterator it = arrayList.iterator();
/* 53 */                while (it.hasNext()) {
/* 65 */                    arrayList2.add(((Protocol) it.next()).getProtocol());
                        }
/* 69 */                return arrayList2;
                    }

                    public final byte[] concatLengthPrefixed(List<? extends Protocol> protocols) {
/* 1 */                 protocols.getClass();
/* 6 */                 Buffer buffer = new Buffer();
/* 21 */                for (String str : alpnProtocolNames(protocols)) {
/* 33 */                    buffer.writeByte(str.length());
/* 36 */                    buffer.writeUtf8(str);
                        }
/* 40 */                return buffer.readByteArray();
                    }

                    public final Platform get() {
/* 1 */                 return Platform.platform;
                    }

                    public final boolean isAndroid() {
/* 9 */                 return "Dalvik".equals(System.getProperty("java.vm.name"));
                    }

                    public final void resetForTests(Platform platform) {
/* 1 */                 platform.getClass();
/* 1 */                 Platform.platform = platform;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
