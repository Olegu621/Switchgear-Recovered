            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.util.zip.Deflater;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0002J\r\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u000fJ\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m6176d2 = {"Lokio/DeflaterSink;", "Lokio/Sink;", "sink", "deflater", "Ljava/util/zip/Deflater;", "(Lokio/Sink;Ljava/util/zip/Deflater;)V", "Lokio/BufferedSink;", "(Lokio/BufferedSink;Ljava/util/zip/Deflater;)V", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "close", HttpUrl.FRAGMENT_ENCODE_SET, "deflate", "syncFlush", "finishDeflate", "finishDeflate$okio", "flush", "timeout", "Lokio/Timeout;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "write", FirebaseAnalytics.Param.SOURCE, "Lokio/Buffer;", "byteCount", HttpUrl.FRAGMENT_ENCODE_SET, "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 13 */    public final class DeflaterSink implements Sink {
                private boolean closed;
                private final Deflater deflater;
                private final BufferedSink sink;

                public DeflaterSink(BufferedSink bufferedSink, Deflater deflater) {
/* 1 */             bufferedSink.getClass();
/* 4 */             deflater.getClass();
/* 10 */            this.sink = bufferedSink;
/* 12 */            this.deflater = deflater;
                }

                private final void deflate(boolean syncFlush) throws IOException {
                    Segment segmentWritableSegment$okio;
                    int iDeflate;
/* 3 */             Buffer buffer = this.sink.getBuffer();
                    while (true) {
/* 8 */                 segmentWritableSegment$okio = buffer.writableSegment$okio(1);
/* 12 */                Deflater deflater = this.deflater;
/* 14 */                if (syncFlush) {
/* 16 */                    byte[] bArr = segmentWritableSegment$okio.data;
/* 18 */                    int i = segmentWritableSegment$okio.limit;
/* 23 */                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                        } else {
/* 28 */                    byte[] bArr2 = segmentWritableSegment$okio.data;
/* 30 */                    int i2 = segmentWritableSegment$okio.limit;
/* 34 */                    iDeflate = deflater.deflate(bArr2, i2, 8192 - i2);
                        }
/* 38 */                if (iDeflate > 0) {
/* 43 */                    segmentWritableSegment$okio.limit += iDeflate;
/* 51 */                    buffer.setSize$okio(buffer.size() + ((long) iDeflate));
/* 56 */                    this.sink.emitCompleteSegments();
                        } else if (this.deflater.needsInput()) {
                            break;
                        }
                    }
/* 72 */            if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
/* 78 */                buffer.head = segmentWritableSegment$okio.pop();
/* 80 */                SegmentPool.recycle(segmentWritableSegment$okio);
                    }
                }

                @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws Throwable {
/* 3 */             if (this.closed) {
/* 37 */                return;
                    }
/* 6 */             finishDeflate$okio();
/* 9 */             th = null;
                    try {
/* 14 */                this.deflater.end();
                    } catch (Throwable th) {
/* 19 */                if (th == null) {
/* 21 */                    th = th;
                        }
                    }
                    try {
/* 24 */                this.sink.close();
                    } catch (Throwable th2) {
/* 29 */                if (th == null) {
/* 31 */                    th = th2;
                        }
                    }
/* 33 */            this.closed = true;
/* 35 */            if (th != null) {
/* 38 */                throw th;
                    }
                }

                public final void finishDeflate$okio() throws IOException {
/* 3 */             this.deflater.finish();
/* 7 */             deflate(false);
                }

                @Override // okio.Sink, java.io.Flushable
                public void flush() throws IOException {
/* 2 */             deflate(true);
/* 7 */             this.sink.flush();
                }

                @Override // okio.Sink
                public Timeout timeout() {
/* 3 */             return this.sink.timeout();
                }

                public String toString() {
/* 18 */            return "DeflaterSink(" + this.sink + ')';
                }

                @Override // okio.Sink
                public void write(Buffer source, long byteCount) throws IOException {
/* 1 */             source.getClass();
/* 11 */            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
/* 18 */            while (byteCount > 0) {
/* 20 */                Segment segment = source.head;
/* 22 */                segment.getClass();
/* 35 */                int iMin = (int) Math.min(byteCount, segment.limit - segment.pos);
/* 42 */                this.deflater.setInput(segment.data, segment.pos, iMin);
/* 46 */                deflate(false);
                        long j = iMin;
/* 55 */                source.setSize$okio(source.size() - j);
/* 60 */                int i = segment.pos + iMin;
/* 61 */                segment.pos = i;
/* 65 */                if (i == segment.limit) {
/* 71 */                    source.head = segment.pop();
/* 73 */                    SegmentPool.recycle(segment);
                        }
/* 76 */                byteCount -= j;
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 14 */        public DeflaterSink(Sink sink, Deflater deflater) {
/* 15 */            this(Okio.buffer(sink), deflater);
                    sink.getClass();
                    deflater.getClass();
                }
            }
