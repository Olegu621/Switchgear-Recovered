            package okhttp3.internal.http1;

            import android.support.v4.media.session.PlaybackStateCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import kotlin.Metadata;
            import okhttp3.Headers;
            import okhttp3.HttpUrl;
            import okio.BufferedSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m6176d2 = {"Lokhttp3/internal/http1/HeadersReader;", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "(Lokio/BufferedSource;)V", "headerLimit", HttpUrl.FRAGMENT_ENCODE_SET, "getSource", "()Lokio/BufferedSource;", "readHeaders", "Lokhttp3/Headers;", "readLine", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class HeadersReader {
                private static final int HEADER_LIMIT = 262144;
                private long headerLimit;
                private final BufferedSource source;

                public HeadersReader(BufferedSource bufferedSource) {
/* 1 */             bufferedSource.getClass();
/* 7 */             this.source = bufferedSource;
/* 12 */            this.headerLimit = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                }

                public final BufferedSource getSource() {
/* 1 */             return this.source;
                }

                public final Headers readHeaders() throws IOException {
/* 3 */             Headers.Builder builder = new Headers.Builder();
                    while (true) {
/* 6 */                 String line = readLine();
/* 14 */                if (line.length() == 0) {
/* 16 */                    return builder.build();
                        }
/* 21 */                builder.addLenient$okhttp(line);
                    }
                }

                public final String readLine() throws IOException {
/* 5 */             String utf8LineStrict = this.source.readUtf8LineStrict(this.headerLimit);
/* 17 */            this.headerLimit -= (long) utf8LineStrict.length();
/* 19 */            return utf8LineStrict;
                }
            }
