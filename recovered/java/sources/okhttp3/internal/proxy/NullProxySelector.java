            package okhttp3.internal.proxy;

            import java.io.IOException;
            import java.net.Proxy;
            import java.net.ProxySelector;
            import java.net.SocketAddress;
            import java.net.URI;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.collections.C1839a;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000e"}, m6176d2 = {"Lokhttp3/internal/proxy/NullProxySelector;", "Ljava/net/ProxySelector;", "()V", "connectFailed", HttpUrl.FRAGMENT_ENCODE_SET, "uri", "Ljava/net/URI;", "sa", "Ljava/net/SocketAddress;", "ioe", "Ljava/io/IOException;", "select", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/net/Proxy;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class NullProxySelector extends ProxySelector {
                public static final NullProxySelector INSTANCE = new NullProxySelector();

                private NullProxySelector() {
                }

                @Override // java.net.ProxySelector
                public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
                }

                @Override // java.net.ProxySelector
                public List<Proxy> select(URI uri) {
/* 1 */             if (uri != null) {
/* 5 */                 return C1839a.m6210b(Proxy.NO_PROXY);
                    }
/* 12 */            C1951n4.m6859j("uri must not be null");
/* 15 */            return null;
                }
            }
