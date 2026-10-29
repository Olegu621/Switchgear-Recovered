            package okhttp3.internal.platform.android;

            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.List;
            import javax.net.ssl.SSLSocket;
            import javax.net.ssl.SSLSocketFactory;
            import javax.net.ssl.X509TrustManager;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.Charsets;
            import okhttp3.HttpUrl;
            import okhttp3.Protocol;
            import okhttp3.internal.platform.AndroidPlatform;
            import okhttp3.internal.platform.Platform;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0004H\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m6176d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "sslSocketClass", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "(Ljava/lang/Class;)V", "getAlpnSelectedProtocol", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "setAlpnProtocols", "setHostname", "setUseSessionTickets", "configureTlsExtensions", HttpUrl.FRAGMENT_ENCODE_SET, "sslSocket", "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "protocols", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Protocol;", "getSelectedProtocol", "isSupported", HttpUrl.FRAGMENT_ENCODE_SET, "matchesSocket", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public class AndroidSocketAdapter implements SocketAdapter {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final DeferredSocketAdapter.Factory playProviderFactory;
                private final Method getAlpnSelectedProtocol;
                private final Method setAlpnProtocols;
                private final Method setHostname;
                private final Method setUseSessionTickets;
                private final Class<? super SSLSocket> sslSocketClass;

                static {
/* 4 */             Companion companion = new Companion(null);
/* 7 */             INSTANCE = companion;
/* 15 */            playProviderFactory = companion.factory("com.google.android.gms.org.conscrypt");
                }

                public AndroidSocketAdapter(Class<? super SSLSocket> cls) throws NoSuchMethodException {
/* 1 */             cls.getClass();
/* 7 */             this.sslSocketClass = cls;
/* 17 */            Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
/* 21 */            declaredMethod.getClass();
/* 24 */            this.setUseSessionTickets = declaredMethod;
/* 38 */            this.setHostname = cls.getMethod("setHostname", String.class);
/* 47 */            this.getAlpnSelectedProtocol = cls.getMethod("getAlpnSelectedProtocol", null);
/* 61 */            this.setAlpnProtocols = cls.getMethod("setAlpnProtocols", byte[].class);
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public void configureTlsExtensions(SSLSocket sslSocket, String hostname, List<? extends Protocol> protocols) {
/* 1 */             sslSocket.getClass();
/* 4 */             protocols.getClass();
/* 11 */            if (matchesSocket(sslSocket)) {
                        try {
/* 21 */                    this.setUseSessionTickets.invoke(sslSocket, Boolean.TRUE);
/* 24 */                    if (hostname != null) {
/* 32 */                        this.setHostname.invoke(sslSocket, hostname);
                            }
/* 47 */                    this.setAlpnProtocols.invoke(sslSocket, Platform.INSTANCE.concatLengthPrefixed(protocols));
                        } catch (IllegalAccessException e) {
/* 57 */                    C1951n4.m6856g(e);
                        } catch (InvocationTargetException e2) {
/* 52 */                    C1951n4.m6856g(e2);
                        }
                    }
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public String getSelectedProtocol(SSLSocket sslSocket) {
/* 1 */             sslSocket.getClass();
/* 9 */             if (!matchesSocket(sslSocket)) {
/* 8 */                 return null;
                    }
                    try {
/* 18 */                byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sslSocket, null);
/* 20 */                if (bArr == null) {
/* 8 */                     return null;
                        }
/* 27 */                return new String(bArr, Charsets.UTF_8);
                    } catch (IllegalAccessException e) {
/* 62 */                C1951n4.m6856g(e);
/* 8 */                 return null;
                    } catch (InvocationTargetException e2) {
/* 35 */                Throwable cause = e2.getCause();
/* 41 */                if ((cause instanceof NullPointerException) && Intrinsics.m6216a(((NullPointerException) cause).getMessage(), "ssl == null")) {
/* 8 */                     return null;
                        }
/* 58 */                C1951n4.m6856g(e2);
/* 8 */                 return null;
                    }
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public boolean isSupported() {
/* 3 */             return AndroidPlatform.INSTANCE.isSupported();
                }

                @Override // okhttp3.internal.platform.android.SocketAdapter
                public boolean matchesSocket(SSLSocket sslSocket) {
/* 1 */             sslSocket.getClass();
/* 6 */             return this.sslSocketClass.isInstance(sslSocket);
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
                @Metadata(m6175d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u000b0\nH\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m6176d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "playProviderFactory", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "getPlayProviderFactory", "()Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "build", "Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "actualSSLSocketClass", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "factory", "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public final AndroidSocketAdapter build(Class<? super SSLSocket> actualSSLSocketClass) {
/* 1 */                 Class<? super SSLSocket> superclass = actualSSLSocketClass;
/* 2 */                 while (superclass != null && !superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
/* 16 */                    superclass = superclass.getSuperclass();
/* 20 */                    if (superclass == null) {
/* 29 */                        C1951n4.m6856g(Intrinsics.m6219d(actualSSLSocketClass, "No OpenSSLSocketImpl superclass of socket of type "));
/* 32 */                        return null;
                            }
                        }
/* 36 */                superclass.getClass();
/* 39 */                return new AndroidSocketAdapter(superclass);
                    }

                    public final DeferredSocketAdapter.Factory factory(final String packageName) {
/* 1 */                 packageName.getClass();
/* 6 */                 return new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1
                            @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                            public SocketAdapter create(SSLSocket sslSocket) {
/* 1 */                         sslSocket.getClass();
/* 1 */                         return AndroidSocketAdapter.INSTANCE.build(sslSocket.getClass());
                            }

                            @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                            public boolean matchesSocket(SSLSocket sslSocket) {
/* 1 */                         sslSocket.getClass();
/* 21 */                        return C1852e.m6263m(sslSocket.getClass().getName(), Intrinsics.m6219d(".", packageName), false);
                            }
                        };
                    }

                    public final DeferredSocketAdapter.Factory getPlayProviderFactory() {
/* 1 */                 return AndroidSocketAdapter.playProviderFactory;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
