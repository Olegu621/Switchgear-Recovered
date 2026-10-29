            package okio;

            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.ds0;
            import p000.f42;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m6176d2 = {"Lokio/PeekSource;", "Lokio/Source;", "upstream", "Lokio/BufferedSource;", "(Lokio/BufferedSource;)V", "buffer", "Lokio/Buffer;", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "expectedPos", HttpUrl.FRAGMENT_ENCODE_SET, "expectedSegment", "Lokio/Segment;", "pos", HttpUrl.FRAGMENT_ENCODE_SET, "close", HttpUrl.FRAGMENT_ENCODE_SET, "read", "sink", "byteCount", "timeout", "Lokio/Timeout;", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class PeekSource implements Source {
                private final Buffer buffer;
                private boolean closed;
                private int expectedPos;
                private Segment expectedSegment;
                private long pos;
                private final BufferedSource upstream;

                public PeekSource(BufferedSource bufferedSource) {
/* 1 */             bufferedSource.getClass();
/* 7 */             this.upstream = bufferedSource;
/* 9 */             Buffer buffer = bufferedSource.getBuffer();
/* 13 */            this.buffer = buffer;
/* 15 */            Segment segment = buffer.head;
/* 17 */            this.expectedSegment = segment;
/* 25 */            this.expectedPos = segment != null ? segment.pos : -1;
                }

                @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
/* 2 */             this.closed = true;
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
                
                    if (r3 == r4.pos) goto L15;
                 */
                @Override // okio.Source
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public long read(Buffer sink, long byteCount) {
                    Segment segment;
/* 1 */             sink.getClass();
/* 8 */             if (byteCount < 0) {
/* 117 */               ds0.m3200q(pm2.m7488k("byteCount < 0: ", byteCount));
/* 4 */                 return 0L;
                    }
/* 12 */            if (this.closed) {
/* 107 */               f42.m3656l("closed");
/* 4 */                 return 0L;
                    }
/* 14 */            Segment segment2 = this.expectedSegment;
/* 16 */            if (segment2 != null) {
/* 20 */                Segment segment3 = this.buffer.head;
/* 22 */                if (segment2 == segment3) {
/* 24 */                    int i = this.expectedPos;
/* 26 */                    segment3.getClass();
                        }
/* 36 */                f42.m3656l("Peek source is invalid because upstream source was used");
/* 4 */                 return 0L;
                    }
/* 40 */            if (byteCount == 0) {
/* 4 */                 return 0L;
                    }
/* 54 */            if (!this.upstream.request(this.pos + 1)) {
/* 56 */                return -1L;
                    }
/* 61 */            if (this.expectedSegment == null && (segment = this.buffer.head) != null) {
/* 69 */                this.expectedSegment = segment;
/* 71 */                segment.getClass();
/* 76 */                this.expectedPos = segment.pos;
                    }
/* 87 */            long jMin = Math.min(byteCount, this.buffer.size() - this.pos);
/* 96 */            this.buffer.copyTo(sink, this.pos, jMin);
/* 102 */           this.pos += jMin;
/* 104 */           return jMin;
                }

                @Override // okio.Source
                /* JADX INFO: renamed from: timeout */
                public Timeout getTimeout() {
/* 3 */             return this.upstream.getTimeout();
                }
            }
