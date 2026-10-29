            package okhttp3.internal.platform;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.lang.reflect.InvocationHandler;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.lang.reflect.Proxy;
            import java.util.Arrays;
            import java.util.List;
            import javax.net.ssl.SSLSocket;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import okhttp3.Protocol;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J(\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\rH\u0016R\u0012\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m6176d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform;", "Lokhttp3/internal/platform/Platform;", "putMethod", "Ljava/lang/reflect/Method;", "getMethod", "removeMethod", "clientProviderClass", "Ljava/lang/Class;", "serverProviderClass", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "afterHandshake", HttpUrl.FRAGMENT_ENCODE_SET, "sslSocket", "Ljavax/net/ssl/SSLSocket;", "configureTlsExtensions", "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "protocols", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Protocol;", "getSelectedProtocol", "AlpnProvider", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class Jdk8WithJettyBootPlatform extends Platform {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final Class<?> clientProviderClass;
                private final Method getMethod;
                private final Method putMethod;
                private final Method removeMethod;
                private final Class<?> serverProviderClass;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J0\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, m6176d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$AlpnProvider;", "Ljava/lang/reflect/InvocationHandler;", "protocols", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;)V", "selected", "getSelected", "()Ljava/lang/String;", "setSelected", "(Ljava/lang/String;)V", "unsupported", HttpUrl.FRAGMENT_ENCODE_SET, "getUnsupported", "()Z", "setUnsupported", "(Z)V", "invoke", HttpUrl.FRAGMENT_ENCODE_SET, "proxy", FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "args", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class AlpnProvider implements InvocationHandler {
                    private final List<String> protocols;
                    private String selected;
                    private boolean unsupported;

                    public AlpnProvider(List<String> list) {
/* 1 */                 list.getClass();
/* 7 */                 this.protocols = list;
                    }

                    public final String getSelected() {
/* 1 */                 return this.selected;
                    }

                    public final boolean getUnsupported() {
/* 1 */                 return this.unsupported;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
/* 1 */                 proxy.getClass();
/* 4 */                 method.getClass();
/* 8 */                 if (args == null) {
/* 10 */                    args = new Object[0];
                        }
/* 12 */                String name = method.getName();
/* 16 */                Class<?> returnType = method.getReturnType();
/* 26 */                if (Intrinsics.m6216a(name, "supports") && Intrinsics.m6216a(Boolean.TYPE, returnType)) {
/* 36 */                    return Boolean.TRUE;
                        }
/* 47 */                if (Intrinsics.m6216a(name, "unsupported") && Intrinsics.m6216a(Void.TYPE, returnType)) {
/* 57 */                    this.unsupported = true;
/* 45 */                    return null;
                        }
/* 66 */                if (Intrinsics.m6216a(name, "protocols") && args.length == 0) {
/* 71 */                    return this.protocols;
                        }
/* 82 */                if ((Intrinsics.m6216a(name, "selectProtocol") || Intrinsics.m6216a(name, "select")) && String.class.equals(returnType) && args.length == 1) {
/* 103 */                   Object obj = args[0];
/* 107 */                   if (obj instanceof List) {
/* 109 */                       if (obj == null) {
/* 163 */                           C1951n4.m6868s("null cannot be cast to non-null type kotlin.collections.List<*>");
/* 45 */                            return null;
                                }
/* 111 */                       List list = (List) obj;
/* 113 */                       int size = list.size();
/* 117 */                       if (size >= 0) {
/* 119 */                           int i = 0;
                                    while (true) {
/* 120 */                               int i2 = i + 1;
/* 122 */                               Object obj2 = list.get(i);
/* 126 */                               if (obj2 == null) {
/* 146 */                                   C1951n4.m6868s("null cannot be cast to non-null type kotlin.String");
/* 45 */                                    return null;
                                        }
/* 128 */                               String str = (String) obj2;
/* 136 */                               if (this.protocols.contains(str)) {
/* 138 */                                   this.selected = str;
/* 140 */                                   return str;
                                        }
/* 141 */                               if (i != size) {
/* 144 */                                   i = i2;
                                        }
                                    }
                                }
/* 152 */                       String str2 = this.protocols.get(0);
/* 158 */                       this.selected = str2;
/* 160 */                       return str2;
                            }
                        }
/* 173 */               if ((!Intrinsics.m6216a(name, "protocolSelected") && !Intrinsics.m6216a(name, "selected")) || args.length != 1) {
/* 204 */                   return method.invoke(this, Arrays.copyOf(args, args.length));
                        }
/* 186 */               Object obj3 = args[0];
/* 188 */               if (obj3 != null) {
/* 192 */                   this.selected = (String) obj3;
/* 45 */                    return null;
                        }
/* 195 */               C1951n4.m6868s("null cannot be cast to non-null type kotlin.String");
/* 45 */                return null;
                    }

                    public final void setSelected(String str) {
/* 1 */                 this.selected = str;
                    }

                    public final void setUnsupported(boolean z) {
/* 1 */                 this.unsupported = z;
                    }
                }

                public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
/* 1 */             method.getClass();
/* 4 */             method2.getClass();
/* 7 */             method3.getClass();
/* 10 */            cls.getClass();
/* 13 */            cls2.getClass();
/* 19 */            this.putMethod = method;
/* 21 */            this.getMethod = method2;
/* 23 */            this.removeMethod = method3;
/* 25 */            this.clientProviderClass = cls;
/* 27 */            this.serverProviderClass = cls2;
                }

                @Override // okhttp3.internal.platform.Platform
                public void afterHandshake(SSLSocket sslSocket) {
/* 3 */             sslSocket.getClass();
                    try {
/* 13 */                this.removeMethod.invoke(null, sslSocket);
                    } catch (IllegalAccessException e) {
/* 32 */                throw new AssertionError("failed to remove ALPN", e);
                    } catch (InvocationTargetException e2) {
/* 26 */                throw new AssertionError("failed to remove ALPN", e2);
                    }
                }

                @Override // okhttp3.internal.platform.Platform
                public void configureTlsExtensions(SSLSocket sslSocket, String hostname, List<? extends Protocol> protocols) {
/* 3 */             sslSocket.getClass();
/* 6 */             protocols.getClass();
                    try {
/* 45 */                this.putMethod.invoke(null, sslSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new AlpnProvider(Platform.INSTANCE.alpnProtocolNames(protocols))));
                    } catch (IllegalAccessException e) {
/* 58 */                throw new AssertionError("failed to set ALPN", e);
                    } catch (InvocationTargetException e2) {
/* 64 */                throw new AssertionError("failed to set ALPN", e2);
                    }
                }

                @Override // okhttp3.internal.platform.Platform
                public String getSelectedProtocol(SSLSocket sslSocket) {
/* 3 */             sslSocket.getClass();
                    try {
/* 17 */                InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke(null, sslSocket));
/* 21 */                if (invocationHandler == null) {
/* 73 */                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
                        }
/* 23 */                AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
/* 29 */                if (!alpnProvider.getUnsupported() && alpnProvider.getSelected() == null) {
/* 44 */                    Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
/* 12 */                    return null;
                        }
/* 58 */                if (alpnProvider.getUnsupported()) {
/* 12 */                    return null;
                        }
/* 61 */                return alpnProvider.getSelected();
                    } catch (IllegalAccessException e) {
/* 79 */                throw new AssertionError("failed to get ALPN selected protocol", e);
                    } catch (InvocationTargetException e2) {
/* 85 */                throw new AssertionError("failed to get ALPN selected protocol", e2);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, m6176d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final Platform buildIfSupported() {
/* 9 */                 String property = System.getProperty("java.specification.version", "unknown");
                        try {
/* 14 */                    property.getClass();
/* 23 */                    if (Integer.parseInt(property) < 9) {
                                try {
/* 27 */                            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
/* 37 */                            Class<?> cls2 = Class.forName(Intrinsics.m6219d("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
/* 47 */                            Class<?> cls3 = Class.forName(Intrinsics.m6219d("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
/* 57 */                            Class<?> cls4 = Class.forName(Intrinsics.m6219d("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
/* 67 */                            Method method = cls.getMethod("put", SSLSocket.class, cls2);
/* 77 */                            Method method2 = cls.getMethod("get", SSLSocket.class);
/* 87 */                            Method method3 = cls.getMethod("remove", SSLSocket.class);
/* 93 */                            method.getClass();
/* 96 */                            method2.getClass();
/* 99 */                            method3.getClass();
/* 102 */                           cls3.getClass();
/* 105 */                           cls4.getClass();
/* 108 */                           return new Jdk8WithJettyBootPlatform(method, method2, method3, cls3, cls4);
                                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                                }
                            }
/* 13 */                    return null;
                        } catch (NumberFormatException unused2) {
                        }
                    }

/* 4 */             private Companion() {
                    }
                }
            }
