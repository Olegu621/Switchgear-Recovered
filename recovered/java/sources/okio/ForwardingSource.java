            package okio;

            import java.io.IOException;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\r\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0013\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0011"}, m6176d2 = {"Lokio/ForwardingSource;", "Lokio/Source;", "delegate", "(Lokio/Source;)V", "()Lokio/Source;", "close", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_delegate", "read", HttpUrl.FRAGMENT_ENCODE_SET, "sink", "Lokio/Buffer;", "byteCount", "timeout", "Lokio/Timeout;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public abstract class ForwardingSource implements Source {
                private final Source delegate;

                public ForwardingSource(Source source) {
/* 1 */             source.getClass();
/* 7 */             this.delegate = source;
                }

                /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name and from getter */
                public final Source getDelegate() {
/* 1 */             return this.delegate;
                }

                @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
/* 3 */             this.delegate.close();
                }

                public final Source delegate() {
/* 1 */             return this.delegate;
                }

                @Override // okio.Source
                public long read(Buffer sink, long byteCount) throws IOException {
/* 1 */             sink.getClass();
/* 6 */             return this.delegate.read(sink, byteCount);
                }

                @Override // okio.Source
                public Timeout timeout() {
/* 3 */             return this.delegate.timeout();
                }

                public String toString() {
/* 32 */            return getClass().getSimpleName() + '(' + this.delegate + ')';
                }
            }
