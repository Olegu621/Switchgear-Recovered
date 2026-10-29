            package okhttp3.internal.connection;

            import androidx.core.app.NotificationCompat;
            import java.io.IOException;
            import java.net.InetAddress;
            import java.net.InetSocketAddress;
            import java.net.Proxy;
            import java.net.SocketAddress;
            import java.net.SocketException;
            import java.net.URI;
            import java.net.UnknownHostException;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.collections.C1839a;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.Address;
            import okhttp3.Call;
            import okhttp3.EventListener;
            import okhttp3.HttpUrl;
            import okhttp3.Route;
            import okhttp3.internal.Util;
            import p000.C1951n4;
            import p000.C2270uw;
            import p000.ds0;
            import p000.nd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0002!\"B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0016H\u0086\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\t\u0010\u0018\u001a\u00020\u0019H\u0086\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\u001a\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m6176d2 = {"Lokhttp3/internal/connection/RouteSelector;", HttpUrl.FRAGMENT_ENCODE_SET, "address", "Lokhttp3/Address;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "eventListener", "Lokhttp3/EventListener;", "(Lokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/Call;Lokhttp3/EventListener;)V", "inetSocketAddresses", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/net/InetSocketAddress;", "nextProxyIndex", HttpUrl.FRAGMENT_ENCODE_SET, "postponedRoutes", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Route;", "proxies", "Ljava/net/Proxy;", "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "hasNextProxy", "next", "Lokhttp3/internal/connection/RouteSelector$Selection;", "nextProxy", "resetNextInetSocketAddress", HttpUrl.FRAGMENT_ENCODE_SET, "proxy", "resetNextProxy", "url", "Lokhttp3/HttpUrl;", "Companion", "Selection", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class RouteSelector {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final Address address;
                private final Call call;
                private final EventListener eventListener;
                private List<? extends InetSocketAddress> inetSocketAddresses;
                private int nextProxyIndex;
                private final List<Route> postponedRoutes;
                private List<? extends Proxy> proxies;
                private final RouteDatabase routeDatabase;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u000bH\u0086\u0002J\t\u0010\f\u001a\u00020\u0004H\u0086\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m6176d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", HttpUrl.FRAGMENT_ENCODE_SET, "routes", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Route;", "(Ljava/util/List;)V", "nextRouteIndex", HttpUrl.FRAGMENT_ENCODE_SET, "getRoutes", "()Ljava/util/List;", "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "next", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class Selection {
                    private int nextRouteIndex;
                    private final List<Route> routes;

                    public Selection(List<Route> list) {
/* 1 */                 list.getClass();
/* 7 */                 this.routes = list;
                    }

                    public final List<Route> getRoutes() {
/* 1 */                 return this.routes;
                    }

                    public final boolean hasNext() {
                        return this.nextRouteIndex < this.routes.size();
                    }

                    public final Route next() {
/* 5 */                 if (!hasNext()) {
/* 22 */                    C1951n4.m6864o();
/* 25 */                    return null;
                        }
/* 7 */                 List<Route> list = this.routes;
/* 9 */                 int i = this.nextRouteIndex;
/* 13 */                this.nextRouteIndex = i + 1;
/* 15 */                return list.get(i);
                    }
                }

                public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
/* 1 */             address.getClass();
/* 4 */             routeDatabase.getClass();
/* 7 */             call.getClass();
/* 10 */            eventListener.getClass();
/* 16 */            this.address = address;
/* 18 */            this.routeDatabase = routeDatabase;
/* 20 */            this.call = call;
/* 22 */            this.eventListener = eventListener;
/* 24 */            nd0 nd0Var = nd0.f14189a;
/* 26 */            this.proxies = nd0Var;
/* 28 */            this.inetSocketAddresses = nd0Var;
/* 35 */            this.postponedRoutes = new ArrayList();
/* 45 */            resetNextProxy(address.url(), address.proxy());
                }

                private final boolean hasNextProxy() {
                    return this.nextProxyIndex < this.proxies.size();
                }

                private final Proxy nextProxy() throws IOException {
/* 5 */             if (hasNextProxy()) {
/* 7 */                 List<? extends Proxy> list = this.proxies;
/* 9 */                 int i = this.nextProxyIndex;
/* 13 */                this.nextProxyIndex = i + 1;
/* 15 */                Proxy proxy = list.get(i);
/* 21 */                resetNextInetSocketAddress(proxy);
/* 24 */                return proxy;
                    }
/* 64 */            throw new SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
                }

                private final void resetNextInetSocketAddress(Proxy proxy) throws IOException {
                    String strHost;
                    int iPort;
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             this.inetSocketAddresses = arrayList;
/* 14 */            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
/* 66 */                strHost = this.address.url().host();
/* 76 */                iPort = this.address.url().port();
                    } else {
/* 25 */                SocketAddress socketAddressAddress = proxy.address();
/* 31 */                if (!(socketAddressAddress instanceof InetSocketAddress)) {
/* 56 */                    ds0.m3200q(Intrinsics.m6219d(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: "));
/* 59 */                    return;
                        } else {
/* 35 */                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
/* 37 */                    strHost = INSTANCE.getSocketHost(inetSocketAddress);
/* 41 */                    iPort = inetSocketAddress.getPort();
                        }
                    }
/* 81 */            if (1 > iPort || iPort >= 65536) {
/* 223 */               throw new SocketException("No route to " + strHost + ':' + iPort + "; port is out of range");
                    }
/* 93 */            if (proxy.type() == Proxy.Type.SOCKS) {
/* 99 */                arrayList.add(InetSocketAddress.createUnresolved(strHost, iPort));
/* 102 */               return;
                    }
/* 107 */           this.eventListener.dnsStart(this.call, strHost);
/* 116 */           List<InetAddress> listLookup = this.address.dns().lookup(strHost);
/* 124 */           if (!listLookup.isEmpty()) {
/* 130 */               this.eventListener.dnsEnd(this.call, strHost, listLookup);
/* 133 */               Iterator<InetAddress> it = listLookup.iterator();
/* 141 */               while (it.hasNext()) {
/* 154 */                   arrayList.add(new InetSocketAddress(it.next(), iPort));
                        }
/* 158 */               return;
                    }
/* 190 */           throw new UnknownHostException(this.address.dns() + " returned no addresses for " + strHost);
                }

                private final void resetNextProxy(HttpUrl url, Proxy proxy) {
/* 5 */             this.eventListener.proxySelectStart(this.call, url);
/* 8 */             List<Proxy> listResetNextProxy$selectProxies = resetNextProxy$selectProxies(proxy, url, this);
/* 12 */            this.proxies = listResetNextProxy$selectProxies;
/* 15 */            this.nextProxyIndex = 0;
/* 21 */            this.eventListener.proxySelectEnd(this.call, url, listResetNextProxy$selectProxies);
                }

                private static final List<Proxy> resetNextProxy$selectProxies(Proxy proxy, HttpUrl httpUrl, RouteSelector routeSelector) {
/* 1 */             if (proxy != null) {
/* 3 */                 return C1839a.m6210b(proxy);
                    }
/* 8 */             URI uri = httpUrl.uri();
/* 16 */            if (uri.getHost() == null) {
/* 24 */                return Util.immutableListOf(Proxy.NO_PROXY);
                    }
/* 35 */            List<Proxy> listSelect = routeSelector.address.proxySelector().select(uri);
/* 39 */            if (listSelect == null || listSelect.isEmpty()) {
/* 62 */                return Util.immutableListOf(Proxy.NO_PROXY);
                    }
/* 48 */            listSelect.getClass();
/* 51 */            return Util.toImmutableList(listSelect);
                }

                public final boolean hasNext() {
                    return hasNextProxy() || !this.postponedRoutes.isEmpty();
                }

                public final Selection next() throws IOException {
/* 5 */             if (!hasNext()) {
/* 93 */                C1951n4.m6864o();
/* 96 */                return null;
                    }
/* 9 */             ArrayList arrayList = new ArrayList();
/* 16 */            while (hasNextProxy()) {
/* 18 */                Proxy proxyNextProxy = nextProxy();
/* 24 */                Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
/* 32 */                while (it.hasNext()) {
/* 44 */                    Route route = new Route(this.address, proxyNextProxy, it.next());
/* 53 */                    if (this.routeDatabase.shouldPostpone(route)) {
/* 57 */                        this.postponedRoutes.add(route);
                            } else {
/* 61 */                        arrayList.add(route);
                            }
                        }
/* 69 */                if (!arrayList.isEmpty()) {
                            break;
                        }
                    }
/* 75 */            if (arrayList.isEmpty()) {
/* 79 */                C2270uw.m9140k(arrayList, this.postponedRoutes);
/* 84 */                this.postponedRoutes.clear();
                    }
/* 89 */            return new Selection(arrayList);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m6176d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "socketHost", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/net/InetSocketAddress;", "getSocketHost", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final String getSocketHost(InetSocketAddress inetSocketAddress) {
/* 1 */                 inetSocketAddress.getClass();
/* 4 */                 InetAddress address = inetSocketAddress.getAddress();
/* 8 */                 if (address == null) {
/* 10 */                    String hostName = inetSocketAddress.getHostName();
/* 14 */                    hostName.getClass();
/* 17 */                    return hostName;
                        }
/* 18 */                String hostAddress = address.getHostAddress();
/* 22 */                hostAddress.getClass();
/* 25 */                return hostAddress;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
