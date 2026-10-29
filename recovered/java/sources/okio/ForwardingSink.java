            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\r\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0013\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0012"}, m6176d2 = {"Lokio/ForwardingSink;", "Lokio/Sink;", "delegate", "(Lokio/Sink;)V", "()Lokio/Sink;", "close", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_delegate", "flush", "timeout", "Lokio/Timeout;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "write", FirebaseAnalytics.Param.SOURCE, "Lokio/Buffer;", "byteCount", HttpUrl.FRAGMENT_ENCODE_SET, "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public abstract class ForwardingSink implements Sink {
                private final Sink delegate;

                public ForwardingSink(Sink sink) {
/* 1 */             sink.getClass();
/* 7 */             this.delegate = sink;
                }

                /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name and from getter */
                public final Sink getDelegate() {
/* 1 */             return this.delegate;
                }

                @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
/* 3 */             this.delegate.close();
                }

                public final Sink delegate() {
/* 1 */             return this.delegate;
                }

                @Override // okio.Sink, java.io.Flushable
                public void flush() throws IOException {
/* 3 */             this.delegate.flush();
                }

                @Override // okio.Sink
                public Timeout timeout() {
/* 3 */             return this.delegate.timeout();
                }

                public String toString() {
/* 32 */            return getClass().getSimpleName() + '(' + this.delegate + ')';
                }

                @Override // okio.Sink
                public void write(Buffer source, long byteCount) throws IOException {
/* 1 */             source.getClass();
/* 6 */             this.delegate.write(source, byteCount);
                }
            }
