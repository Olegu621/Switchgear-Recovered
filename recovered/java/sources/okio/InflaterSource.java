            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.EOFException;
            import java.io.IOException;
            import java.util.zip.DataFormatException;
            import java.util.zip.Inflater;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.ds0;
            import p000.f42;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000bJ\b\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m6176d2 = {"Lokio/InflaterSource;", "Lokio/Source;", FirebaseAnalytics.Param.SOURCE, "inflater", "Ljava/util/zip/Inflater;", "(Lokio/Source;Ljava/util/zip/Inflater;)V", "Lokio/BufferedSource;", "(Lokio/BufferedSource;Ljava/util/zip/Inflater;)V", "bufferBytesHeldByInflater", HttpUrl.FRAGMENT_ENCODE_SET, "closed", HttpUrl.FRAGMENT_ENCODE_SET, "close", HttpUrl.FRAGMENT_ENCODE_SET, "read", HttpUrl.FRAGMENT_ENCODE_SET, "sink", "Lokio/Buffer;", "byteCount", "readOrInflate", "refill", "releaseBytesAfterInflate", "timeout", "Lokio/Timeout;", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 13 */    public final class InflaterSource implements Source {
                private int bufferBytesHeldByInflater;
                private boolean closed;
                private final Inflater inflater;
                private final BufferedSource source;

                public InflaterSource(BufferedSource bufferedSource, Inflater inflater) {
/* 1 */             bufferedSource.getClass();
/* 4 */             inflater.getClass();
/* 10 */            this.source = bufferedSource;
/* 12 */            this.inflater = inflater;
                }

                private final void releaseBytesAfterInflate() throws IOException {
/* 1 */             int i = this.bufferBytesHeldByInflater;
/* 3 */             if (i == 0) {
/* 5 */                 return;
                    }
/* 12 */            int remaining = i - this.inflater.getRemaining();
/* 16 */            this.bufferBytesHeldByInflater -= remaining;
/* 21 */            this.source.skip(remaining);
                }

                @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
/* 3 */             if (this.closed) {
/* 5 */                 return;
                    }
/* 8 */             this.inflater.end();
/* 12 */            this.closed = true;
/* 16 */            this.source.close();
                }

                @Override // okio.Source
                public long read(Buffer sink, long byteCount) throws IOException {
/* 1 */             sink.getClass();
/* 38 */            do {
/* 4 */                 long orInflate = readOrInflate(sink, byteCount);
/* 12 */                if (orInflate > 0) {
/* 14 */                    return orInflate;
                        }
/* 21 */                if (this.inflater.finished() || this.inflater.needsDictionary()) {
/* 49 */                    return -1L;
                        }
/* 38 */            } while (!this.source.exhausted());
/* 48 */            throw new EOFException("source exhausted prematurely");
                }

                public final long readOrInflate(Buffer sink, long byteCount) throws IOException {
/* 1 */             sink.getClass();
/* 8 */             if (byteCount < 0) {
/* 100 */               ds0.m3200q(pm2.m7488k("byteCount < 0: ", byteCount));
/* 4 */                 return 0L;
                    }
/* 12 */            if (this.closed) {
/* 90 */                f42.m3656l("closed");
/* 4 */                 return 0L;
                    }
/* 14 */            if (byteCount == 0) {
/* 4 */                 return 0L;
                    }
                    try {
/* 18 */                Segment segmentWritableSegment$okio = sink.writableSegment$okio(1);
/* 31 */                int iMin = (int) Math.min(byteCount, 8192 - segmentWritableSegment$okio.limit);
/* 32 */                refill();
/* 41 */                int iInflate = this.inflater.inflate(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
/* 45 */                releaseBytesAfterInflate();
/* 48 */                if (iInflate > 0) {
/* 53 */                    segmentWritableSegment$okio.limit += iInflate;
                            long j = iInflate;
/* 61 */                    sink.setSize$okio(sink.size() + j);
/* 64 */                    return j;
                        }
/* 69 */                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
/* 75 */                    sink.head = segmentWritableSegment$okio.pop();
/* 77 */                    SegmentPool.recycle(segmentWritableSegment$okio);
                        }
/* 4 */                 return 0L;
                    } catch (DataFormatException e) {
/* 87 */                throw new IOException(e);
                    }
                }

                public final boolean refill() throws IOException {
/* 8 */             if (!this.inflater.needsInput()) {
/* 7 */                 return false;
                    }
/* 17 */            if (this.source.exhausted()) {
/* 19 */                return true;
                    }
/* 27 */            Segment segment = this.source.getBuffer().head;
/* 29 */            segment.getClass();
/* 32 */            int i = segment.limit;
/* 34 */            int i2 = segment.pos;
/* 36 */            int i3 = i - i2;
/* 37 */            this.bufferBytesHeldByInflater = i3;
/* 43 */            this.inflater.setInput(segment.data, i2, i3);
/* 7 */             return false;
                }

                @Override // okio.Source
                public Timeout timeout() {
/* 3 */             return this.source.timeout();
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 14 */        public InflaterSource(Source source, Inflater inflater) {
/* 15 */            this(Okio.buffer(source), inflater);
                    source.getClass();
                    inflater.getClass();
                }
            }
