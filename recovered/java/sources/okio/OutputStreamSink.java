            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.io.OutputStream;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m6176d2 = {"Lokio/OutputStreamSink;", "Lokio/Sink;", "out", "Ljava/io/OutputStream;", "timeout", "Lokio/Timeout;", "(Ljava/io/OutputStream;Lokio/Timeout;)V", "close", HttpUrl.FRAGMENT_ENCODE_SET, "flush", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "write", FirebaseAnalytics.Param.SOURCE, "Lokio/Buffer;", "byteCount", HttpUrl.FRAGMENT_ENCODE_SET, "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            final class OutputStreamSink implements Sink {
                private final OutputStream out;
                private final Timeout timeout;

                public OutputStreamSink(OutputStream outputStream, Timeout timeout) {
/* 1 */             outputStream.getClass();
/* 4 */             timeout.getClass();
/* 10 */            this.out = outputStream;
/* 12 */            this.timeout = timeout;
                }

                @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
/* 3 */             this.out.close();
                }

                @Override // okio.Sink, java.io.Flushable
                public void flush() throws IOException {
/* 3 */             this.out.flush();
                }

                @Override // okio.Sink
                /* JADX INFO: renamed from: timeout, reason: from getter */
                public Timeout getTimeout() {
/* 1 */             return this.timeout;
                }

                public String toString() {
/* 18 */            return "sink(" + this.out + ')';
                }

                @Override // okio.Sink
                public void write(Buffer source, long byteCount) throws IOException {
/* 1 */             source.getClass();
/* 11 */            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
/* 18 */            while (byteCount > 0) {
/* 22 */                this.timeout.throwIfReached();
/* 25 */                Segment segment = source.head;
/* 27 */                segment.getClass();
/* 40 */                int iMin = (int) Math.min(byteCount, segment.limit - segment.pos);
/* 47 */                this.out.write(segment.data, segment.pos, iMin);
/* 53 */                segment.pos += iMin;
                        long j = iMin;
/* 56 */                byteCount -= j;
/* 62 */                source.setSize$okio(source.size() - j);
/* 69 */                if (segment.pos == segment.limit) {
/* 75 */                    source.head = segment.pop();
/* 77 */                    SegmentPool.recycle(segment);
                        }
                    }
                }
            }
