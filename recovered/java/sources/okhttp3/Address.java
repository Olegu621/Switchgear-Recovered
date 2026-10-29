            package okhttp3;

            import com.appsflyer.internal.AbstractC0298j;
            import java.net.Proxy;
            import java.net.ProxySelector;
            import java.util.List;
            import java.util.Objects;
            import javax.net.SocketFactory;
            import javax.net.ssl.HostnameVerifier;
            import javax.net.ssl.SSLSocketFactory;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.internal.Util;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\b(J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u0007¢\u0006\u0002\b)J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0015\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020\u0000H\u0000¢\u0006\u0002\b0J\b\u00101\u001a\u00020\u0005H\u0016J\u000f\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\b2J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0002\b3J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\b4J\r\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\b5J\r\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\b6J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b7J\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\b8J\b\u00109\u001a\u00020\u0003H\u0016J\r\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\b:R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001cR\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00158G¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001dR\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001fR\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158G¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010 R\u0013\u0010\u0010\u001a\u00020\u00118\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010!R\u0013\u0010\u0019\u001a\u00020\u001a8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\"R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010#R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010$R\u0013\u0010%\u001a\u00020&8G¢\u0006\b\n\u0000\u001a\u0004\b%\u0010'¨\u0006;"}, m6176d2 = {"Lokhttp3/Address;", HttpUrl.FRAGMENT_ENCODE_SET, "uriHost", HttpUrl.FRAGMENT_ENCODE_SET, "uriPort", HttpUrl.FRAGMENT_ENCODE_SET, "dns", "Lokhttp3/Dns;", "socketFactory", "Ljavax/net/SocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "certificatePinner", "Lokhttp3/CertificatePinner;", "proxyAuthenticator", "Lokhttp3/Authenticator;", "proxy", "Ljava/net/Proxy;", "protocols", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Protocol;", "connectionSpecs", "Lokhttp3/ConnectionSpec;", "proxySelector", "Ljava/net/ProxySelector;", "(Ljava/lang/String;ILokhttp3/Dns;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lokhttp3/Authenticator;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "()Lokhttp3/CertificatePinner;", "()Ljava/util/List;", "()Lokhttp3/Dns;", "()Ljavax/net/ssl/HostnameVerifier;", "()Ljava/net/Proxy;", "()Lokhttp3/Authenticator;", "()Ljava/net/ProxySelector;", "()Ljavax/net/SocketFactory;", "()Ljavax/net/ssl/SSLSocketFactory;", "url", "Lokhttp3/HttpUrl;", "()Lokhttp3/HttpUrl;", "-deprecated_certificatePinner", "-deprecated_connectionSpecs", "-deprecated_dns", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "equalsNonHost", "that", "equalsNonHost$okhttp", "hashCode", "-deprecated_hostnameVerifier", "-deprecated_protocols", "-deprecated_proxy", "-deprecated_proxyAuthenticator", "-deprecated_proxySelector", "-deprecated_socketFactory", "-deprecated_sslSocketFactory", "toString", "-deprecated_url", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class Address {
                private final CertificatePinner certificatePinner;
                private final List<ConnectionSpec> connectionSpecs;
                private final Dns dns;
                private final HostnameVerifier hostnameVerifier;
                private final List<Protocol> protocols;
                private final Proxy proxy;
                private final Authenticator proxyAuthenticator;
                private final ProxySelector proxySelector;
                private final SocketFactory socketFactory;
                private final SSLSocketFactory sslSocketFactory;
                private final HttpUrl url;

                public Address(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List<? extends Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
                    str.getClass();
                    dns.getClass();
                    socketFactory.getClass();
                    authenticator.getClass();
                    list.getClass();
                    list2.getClass();
                    proxySelector.getClass();
/* 2 */             this.dns = dns;
/* 3 */             this.socketFactory = socketFactory;
/* 4 */             this.sslSocketFactory = sSLSocketFactory;
/* 5 */             this.hostnameVerifier = hostnameVerifier;
/* 6 */             this.certificatePinner = certificatePinner;
/* 7 */             this.proxyAuthenticator = authenticator;
/* 8 */             this.proxy = proxy;
/* 9 */             this.proxySelector = proxySelector;
/* 14 */            this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(str).port(i).build();
/* 15 */            this.protocols = Util.toImmutableList(list);
/* 16 */            this.connectionSpecs = Util.toImmutableList(list2);
                }

                /* JADX INFO: renamed from: -deprecated_certificatePinner, reason: not valid java name and from getter */
                public final CertificatePinner getCertificatePinner() {
/* 1 */             return this.certificatePinner;
                }

                /* JADX INFO: renamed from: -deprecated_connectionSpecs, reason: not valid java name */
                public final List<ConnectionSpec> m10501deprecated_connectionSpecs() {
/* 1 */             return this.connectionSpecs;
                }

                /* JADX INFO: renamed from: -deprecated_dns, reason: not valid java name and from getter */
                public final Dns getDns() {
/* 1 */             return this.dns;
                }

                /* JADX INFO: renamed from: -deprecated_hostnameVerifier, reason: not valid java name and from getter */
                public final HostnameVerifier getHostnameVerifier() {
/* 1 */             return this.hostnameVerifier;
                }

                /* JADX INFO: renamed from: -deprecated_protocols, reason: not valid java name */
                public final List<Protocol> m10504deprecated_protocols() {
/* 1 */             return this.protocols;
                }

                /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name and from getter */
                public final Proxy getProxy() {
/* 1 */             return this.proxy;
                }

                /* JADX INFO: renamed from: -deprecated_proxyAuthenticator, reason: not valid java name and from getter */
                public final Authenticator getProxyAuthenticator() {
/* 1 */             return this.proxyAuthenticator;
                }

                /* JADX INFO: renamed from: -deprecated_proxySelector, reason: not valid java name and from getter */
                public final ProxySelector getProxySelector() {
/* 1 */             return this.proxySelector;
                }

                /* JADX INFO: renamed from: -deprecated_socketFactory, reason: not valid java name and from getter */
                public final SocketFactory getSocketFactory() {
/* 1 */             return this.socketFactory;
                }

                /* JADX INFO: renamed from: -deprecated_sslSocketFactory, reason: not valid java name and from getter */
                public final SSLSocketFactory getSslSocketFactory() {
/* 1 */             return this.sslSocketFactory;
                }

                /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name and from getter */
                public final HttpUrl getUrl() {
/* 1 */             return this.url;
                }

                public final CertificatePinner certificatePinner() {
/* 1 */             return this.certificatePinner;
                }

                public final List<ConnectionSpec> connectionSpecs() {
/* 1 */             return this.connectionSpecs;
                }

                public final Dns dns() {
/* 1 */             return this.dns;
                }

                public boolean equals(Object other) {
/* 3 */             if (!(other instanceof Address)) {
/* 25 */                return false;
                    }
/* 7 */             Address address = (Address) other;
                    return Intrinsics.m6216a(this.url, address.url) && equalsNonHost$okhttp(address);
                }

                public final boolean equalsNonHost$okhttp(Address that) {
/* 1 */             that.getClass();
                    return Intrinsics.m6216a(this.dns, that.dns) && Intrinsics.m6216a(this.proxyAuthenticator, that.proxyAuthenticator) && Intrinsics.m6216a(this.protocols, that.protocols) && Intrinsics.m6216a(this.connectionSpecs, that.connectionSpecs) && Intrinsics.m6216a(this.proxySelector, that.proxySelector) && Intrinsics.m6216a(this.proxy, that.proxy) && Intrinsics.m6216a(this.sslSocketFactory, that.sslSocketFactory) && Intrinsics.m6216a(this.hostnameVerifier, that.hostnameVerifier) && Intrinsics.m6216a(this.certificatePinner, that.certificatePinner) && this.url.port() == that.url.port();
                }

                public int hashCode() {
/* 78 */            return Objects.hashCode(this.certificatePinner) + ((Objects.hashCode(this.hostnameVerifier) + ((Objects.hashCode(this.sslSocketFactory) + ((Objects.hashCode(this.proxy) + ((this.proxySelector.hashCode() + AbstractC0298j.m1861b(AbstractC0298j.m1861b((this.proxyAuthenticator.hashCode() + ((this.dns.hashCode() + ((this.url.hashCode() + 527) * 31)) * 31)) * 31, 31, this.protocols), 31, this.connectionSpecs)) * 31)) * 31)) * 31)) * 31);
                }

                public final HostnameVerifier hostnameVerifier() {
/* 1 */             return this.hostnameVerifier;
                }

                public final List<Protocol> protocols() {
/* 1 */             return this.protocols;
                }

                public final Proxy proxy() {
/* 1 */             return this.proxy;
                }

                public final Authenticator proxyAuthenticator() {
/* 1 */             return this.proxyAuthenticator;
                }

                public final ProxySelector proxySelector() {
/* 1 */             return this.proxySelector;
                }

                public final SocketFactory socketFactory() {
/* 1 */             return this.socketFactory;
                }

                public final SSLSocketFactory sslSocketFactory() {
/* 1 */             return this.sslSocketFactory;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Address{");
/* 14 */            sb.append(this.url.host());
/* 19 */            sb.append(':');
/* 28 */            sb.append(this.url.port());
/* 33 */            sb.append(", ");
/* 36 */            Proxy proxy = this.proxy;
/* 55 */            sb.append(proxy != null ? Intrinsics.m6219d(proxy, "proxy=") : Intrinsics.m6219d(this.proxySelector, "proxySelector="));
/* 60 */            sb.append('}');
/* 63 */            return sb.toString();
                }

                public final HttpUrl url() {
/* 1 */             return this.url;
                }
            }
