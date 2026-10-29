            package okhttp3;

            import java.net.InetAddress;
            import java.net.UnknownHostException;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C2103qd;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, m6176d2 = {"Lokhttp3/Dns;", HttpUrl.FRAGMENT_ENCODE_SET, "lookup", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/net/InetAddress;", "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public interface Dns {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = Companion.$$INSTANCE;
                public static final Dns SYSTEM = new Companion.DnsSystem();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, m6176d2 = {"Lokhttp3/Dns$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "SYSTEM", "Lokhttp3/Dns;", "DnsSystem", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class Companion {
                    static final /* synthetic */ Companion $$INSTANCE = new Companion();

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    @Metadata(m6175d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m6176d2 = {"Lokhttp3/Dns$Companion$DnsSystem;", "Lokhttp3/Dns;", "()V", "lookup", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/net/InetAddress;", "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                    public static final class DnsSystem implements Dns {
                        @Override // okhttp3.Dns
                        public List<InetAddress> lookup(String hostname) throws UnknownHostException {
/* 1 */                     hostname.getClass();
                            try {
/* 4 */                         InetAddress[] allByName = InetAddress.getAllByName(hostname);
/* 8 */                         allByName.getClass();
/* 11 */                        return C2103qd.m7779n(allByName);
                            } catch (NullPointerException e) {
/* 25 */                        UnknownHostException unknownHostException = new UnknownHostException(Intrinsics.m6219d(hostname, "Broken system behaviour for dns lookup of "));
/* 28 */                        unknownHostException.initCause(e);
/* 31 */                        throw unknownHostException;
                            }
                        }
                    }

                    private Companion() {
                    }
                }

                List<InetAddress> lookup(String hostname) throws UnknownHostException;
            }
