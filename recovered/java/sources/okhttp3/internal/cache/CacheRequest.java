            package okhttp3.internal.cache;

            import java.io.IOException;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import okio.Sink;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m6176d2 = {"Lokhttp3/internal/cache/CacheRequest;", HttpUrl.FRAGMENT_ENCODE_SET, "abort", HttpUrl.FRAGMENT_ENCODE_SET, "body", "Lokio/Sink;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public interface CacheRequest {
                void abort();

                Sink body() throws IOException;
            }
