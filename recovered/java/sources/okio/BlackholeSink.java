            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.EOFException;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, m6176d2 = {"Lokio/BlackholeSink;", "Lokio/Sink;", "()V", "close", HttpUrl.FRAGMENT_ENCODE_SET, "flush", "timeout", "Lokio/Timeout;", "write", FirebaseAnalytics.Param.SOURCE, "Lokio/Buffer;", "byteCount", HttpUrl.FRAGMENT_ENCODE_SET, "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            final class BlackholeSink implements Sink {
                @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }

                @Override // okio.Sink, java.io.Flushable
                public void flush() {
                }

                @Override // okio.Sink
                public Timeout timeout() {
/* 1 */             return Timeout.NONE;
                }

                @Override // okio.Sink
                public void write(Buffer source, long byteCount) throws EOFException {
/* 1 */             source.getClass();
/* 4 */             source.skip(byteCount);
                }
            }
