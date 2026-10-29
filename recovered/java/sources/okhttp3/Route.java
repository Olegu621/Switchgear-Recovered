            package okhttp3;

            import java.net.InetSocketAddress;
            import java.net.Proxy;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\u000eJ\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0017"}, m6176d2 = {"Lokhttp3/Route;", HttpUrl.FRAGMENT_ENCODE_SET, "address", "Lokhttp3/Address;", "proxy", "Ljava/net/Proxy;", "socketAddress", "Ljava/net/InetSocketAddress;", "(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "()Lokhttp3/Address;", "()Ljava/net/Proxy;", "()Ljava/net/InetSocketAddress;", "-deprecated_address", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_proxy", "requiresTunnel", "-deprecated_socketAddress", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class Route {
                private final Address address;
                private final Proxy proxy;
                private final InetSocketAddress socketAddress;

                public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
/* 1 */             address.getClass();
/* 4 */             proxy.getClass();
/* 7 */             inetSocketAddress.getClass();
/* 13 */            this.address = address;
/* 15 */            this.proxy = proxy;
/* 17 */            this.socketAddress = inetSocketAddress;
                }

                /* JADX INFO: renamed from: -deprecated_address, reason: not valid java name and from getter */
                public final Address getAddress() {
/* 1 */             return this.address;
                }

                /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name and from getter */
                public final Proxy getProxy() {
/* 1 */             return this.proxy;
                }

                /* JADX INFO: renamed from: -deprecated_socketAddress, reason: not valid java name and from getter */
                public final InetSocketAddress getSocketAddress() {
/* 1 */             return this.socketAddress;
                }

                public final Address address() {
/* 1 */             return this.address;
                }

                public boolean equals(Object other) {
/* 3 */             if (!(other instanceof Route)) {
/* 39 */                return false;
                    }
/* 5 */             Route route = (Route) other;
                    return Intrinsics.m6216a(route.address, this.address) && Intrinsics.m6216a(route.proxy, this.proxy) && Intrinsics.m6216a(route.socketAddress, this.socketAddress);
                }

                public int hashCode() {
/* 26 */            return this.socketAddress.hashCode() + ((this.proxy.hashCode() + ((this.address.hashCode() + 527) * 31)) * 31);
                }

                public final Proxy proxy() {
/* 1 */             return this.proxy;
                }

                public final boolean requiresTunnel() {
                    return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
                }

                public final InetSocketAddress socketAddress() {
/* 1 */             return this.socketAddress;
                }

                public String toString() {
/* 18 */            return "Route{" + this.socketAddress + '}';
                }
            }
