            package okhttp3.internal.authenticator;

            import java.io.IOException;
            import java.net.InetAddress;
            import java.net.InetSocketAddress;
            import java.net.PasswordAuthentication;
            import java.net.Proxy;
            import java.net.SocketAddress;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.Address;
            import okhttp3.Authenticator;
            import okhttp3.Challenge;
            import okhttp3.Credentials;
            import okhttp3.Dns;
            import okhttp3.HttpUrl;
            import okhttp3.Request;
            import okhttp3.Response;
            import okhttp3.Route;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m6176d2 = {"Lokhttp3/internal/authenticator/JavaNetAuthenticator;", "Lokhttp3/Authenticator;", "defaultDns", "Lokhttp3/Dns;", "(Lokhttp3/Dns;)V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "connectToInetAddress", "Ljava/net/InetAddress;", "Ljava/net/Proxy;", "url", "Lokhttp3/HttpUrl;", "dns", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 9 */     public final class JavaNetAuthenticator implements Authenticator {
                private final Dns defaultDns;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6177k = 3, m6178mv = {1, 6, 0}, m6180xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
/* 6 */                 int[] iArr = new int[Proxy.Type.values().length];
/* 15 */                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
/* 17 */                $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ JavaNetAuthenticator(Dns dns, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 7 */             this((i & 1) != 0 ? Dns.SYSTEM : dns);
                }

                private final InetAddress connectToInetAddress(Proxy proxy, HttpUrl httpUrl, Dns dns) throws IOException {
/* 1 */             Proxy.Type type = proxy.type();
/* 18 */            if ((type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) == 1) {
/* 32 */                return (InetAddress) CollectionsKt.m6200u(dns.lookup(httpUrl.host()));
                    }
/* 35 */            SocketAddress socketAddressAddress = proxy.address();
/* 39 */            if (socketAddressAddress == null) {
/* 53 */                C1951n4.m6868s("null cannot be cast to non-null type java.net.InetSocketAddress");
/* 56 */                return null;
                    }
/* 43 */            InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
/* 47 */            address.getClass();
/* 50 */            return address;
                }

                @Override // okhttp3.Authenticator
                public Request authenticate(Route route, Response response) throws IOException {
                    Address address;
                    PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
/* 3 */             response.getClass();
/* 6 */             List<Challenge> listChallenges = response.challenges();
/* 10 */            Request request = response.request();
/* 14 */            HttpUrl httpUrlUrl = request.url();
/* 28 */            boolean z = response.code() == 407;
/* 34 */            Proxy proxy = route == null ? null : route.proxy();
/* 38 */            if (proxy == null) {
/* 40 */                proxy = Proxy.NO_PROXY;
                    }
/* 50 */            for (Challenge challenge : listChallenges) {
/* 68 */                if ("Basic".equalsIgnoreCase(challenge.scheme())) {
/* 82 */                    Dns dns = (route == null || (address = route.address()) == null) ? null : address.dns();
/* 86 */                    if (dns == null) {
/* 88 */                        dns = this.defaultDns;
                            }
/* 90 */                    if (z) {
/* 92 */                        SocketAddress socketAddressAddress = proxy.address();
/* 96 */                        if (socketAddressAddress == null) {
/* 137 */                           C1951n4.m6868s("null cannot be cast to non-null type java.net.InetSocketAddress");
/* 29 */                            return null;
                                }
/* 98 */                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
/* 130 */                       passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), connectToInetAddress(proxy, httpUrlUrl, dns), inetSocketAddress.getPort(), httpUrlUrl.scheme(), challenge.realm(), challenge.scheme(), httpUrlUrl.url(), java.net.Authenticator.RequestorType.PROXY);
                            } else {
/* 141 */                       String strHost = httpUrlUrl.host();
/* 145 */                       proxy.getClass();
/* 179 */                       passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(strHost, connectToInetAddress(proxy, httpUrlUrl, dns), httpUrlUrl.port(), httpUrlUrl.scheme(), challenge.realm(), challenge.scheme(), httpUrlUrl.url(), java.net.Authenticator.RequestorType.SERVER);
                            }
/* 183 */                   if (passwordAuthenticationRequestPasswordAuthentication != null) {
/* 190 */                       String str = z ? "Proxy-Authorization" : "Authorization";
/* 192 */                       String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
/* 196 */                       userName.getClass();
/* 201 */                       char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
/* 205 */                       password.getClass();
/* 227 */                       return request.newBuilder().header(str, Credentials.basic(userName, new String(password), challenge.charset())).build();
                            }
                        }
                    }
/* 29 */            return null;
                }

/* 10 */        public JavaNetAuthenticator(Dns dns) {
                    dns.getClass();
                    this.defaultDns = dns;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 11 */        public JavaNetAuthenticator() {
/* 12 */            this(null, 1, 0 == true ? 1 : 0);
                }
            }
