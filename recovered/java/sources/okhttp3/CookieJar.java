            package okhttp3;

            import java.util.List;
            import kotlin.Metadata;
            import p000.nd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u000b"}, m6176d2 = {"Lokhttp3/CookieJar;", HttpUrl.FRAGMENT_ENCODE_SET, "loadForRequest", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Cookie;", "url", "Lokhttp3/HttpUrl;", "saveFromResponse", HttpUrl.FRAGMENT_ENCODE_SET, "cookies", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public interface CookieJar {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = Companion.$$INSTANCE;
                public static final CookieJar NO_COOKIES = new Companion.NoCookies();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, m6176d2 = {"Lokhttp3/CookieJar$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "NO_COOKIES", "Lokhttp3/CookieJar;", "NoCookies", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class Companion {
                    static final /* synthetic */ Companion $$INSTANCE = new Companion();

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    @Metadata(m6175d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\u000b"}, m6176d2 = {"Lokhttp3/CookieJar$Companion$NoCookies;", "Lokhttp3/CookieJar;", "()V", "loadForRequest", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Cookie;", "url", "Lokhttp3/HttpUrl;", "saveFromResponse", HttpUrl.FRAGMENT_ENCODE_SET, "cookies", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                    public static final class NoCookies implements CookieJar {
                        @Override // okhttp3.CookieJar
                        public List<Cookie> loadForRequest(HttpUrl url) {
/* 1 */                     url.getClass();
/* 4 */                     return nd0.f14189a;
                        }

                        @Override // okhttp3.CookieJar
                        public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
/* 1 */                     url.getClass();
/* 4 */                     cookies.getClass();
                        }
                    }

                    private Companion() {
                    }
                }

                List<Cookie> loadForRequest(HttpUrl url);

                void saveFromResponse(HttpUrl url, List<Cookie> cookies);
            }
