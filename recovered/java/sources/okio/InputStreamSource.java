            package okio;

            import java.io.IOException;
            import java.io.InputStream;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.ds0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m6176d2 = {"Lokio/InputStreamSource;", "Lokio/Source;", "input", "Ljava/io/InputStream;", "timeout", "Lokio/Timeout;", "(Ljava/io/InputStream;Lokio/Timeout;)V", "close", HttpUrl.FRAGMENT_ENCODE_SET, "read", HttpUrl.FRAGMENT_ENCODE_SET, "sink", "Lokio/Buffer;", "byteCount", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            class InputStreamSource implements Source {
                private final InputStream input;
                private final Timeout timeout;

                public InputStreamSource(InputStream inputStream, Timeout timeout) {
/* 1 */             inputStream.getClass();
/* 4 */             timeout.getClass();
/* 10 */            this.input = inputStream;
/* 12 */            this.timeout = timeout;
                }

                @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
/* 3 */             this.input.close();
                }

                @Override // okio.Source
                public long read(Buffer sink, long byteCount) throws IOException {
/* 1 */             sink.getClass();
/* 8 */             if (byteCount == 0) {
/* 4 */                 return 0L;
                    }
/* 11 */            if (byteCount < 0) {
/* 99 */                ds0.m3200q(pm2.m7488k("byteCount < 0: ", byteCount));
/* 4 */                 return 0L;
                    }
                    try {
/* 15 */                this.timeout.throwIfReached();
/* 19 */                Segment segmentWritableSegment$okio = sink.writableSegment$okio(1);
/* 39 */                int i = this.input.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(byteCount, 8192 - segmentWritableSegment$okio.limit));
/* 44 */                if (i != -1) {
/* 67 */                    segmentWritableSegment$okio.limit += i;
                            long j = i;
/* 75 */                    sink.setSize$okio(sink.size() + j);
/* 78 */                    return j;
                        }
/* 50 */                if (segmentWritableSegment$okio.pos != segmentWritableSegment$okio.limit) {
/* 61 */                    return -1L;
                        }
/* 56 */                sink.head = segmentWritableSegment$okio.pop();
/* 58 */                SegmentPool.recycle(segmentWritableSegment$okio);
/* 61 */                return -1L;
                    } catch (AssertionError e) {
/* 84 */                if (Okio.isAndroidGetsocknameError(e)) {
/* 91 */                    throw new IOException(e);
                        }
/* 92 */                throw e;
                    }
                }

                @Override // okio.Source
                /* JADX INFO: renamed from: timeout, reason: from getter */
                public Timeout getTimeout() {
/* 1 */             return this.timeout;
                }

                public String toString() {
/* 18 */            return "source(" + this.input + ')';
                }
            }
