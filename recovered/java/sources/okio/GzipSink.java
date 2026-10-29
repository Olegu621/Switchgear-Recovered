            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.util.zip.CRC32;
            import java.util.zip.Deflater;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.ds0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0010J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m6176d2 = {"Lokio/GzipSink;", "Lokio/Sink;", "sink", "(Lokio/Sink;)V", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "crc", "Ljava/util/zip/CRC32;", "deflater", "Ljava/util/zip/Deflater;", "()Ljava/util/zip/Deflater;", "deflaterSink", "Lokio/DeflaterSink;", "Lokio/RealBufferedSink;", "close", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_deflater", "flush", "timeout", "Lokio/Timeout;", "updateCrc", "buffer", "Lokio/Buffer;", "byteCount", HttpUrl.FRAGMENT_ENCODE_SET, "write", FirebaseAnalytics.Param.SOURCE, "writeFooter", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class GzipSink implements Sink {
                private boolean closed;
                private final CRC32 crc;
                private final Deflater deflater;
                private final DeflaterSink deflaterSink;
                private final RealBufferedSink sink;

                public GzipSink(Sink sink) {
/* 1 */             sink.getClass();
/* 9 */             RealBufferedSink realBufferedSink = new RealBufferedSink(sink);
/* 12 */            this.sink = realBufferedSink;
/* 18 */            Deflater deflater = new Deflater(-1, true);
/* 21 */            this.deflater = deflater;
/* 28 */            this.deflaterSink = new DeflaterSink((BufferedSink) realBufferedSink, deflater);
/* 35 */            this.crc = new CRC32();
/* 37 */            Buffer buffer = realBufferedSink.bufferField;
/* 41 */            buffer.writeShort(8075);
/* 46 */            buffer.writeByte(8);
/* 50 */            buffer.writeByte(0);
/* 53 */            buffer.writeInt(0);
/* 56 */            buffer.writeByte(0);
/* 59 */            buffer.writeByte(0);
                }

                private final void updateCrc(Buffer buffer, long byteCount) {
/* 1 */             Segment segment = buffer.head;
/* 3 */             segment.getClass();
/* 10 */            while (byteCount > 0) {
/* 22 */                int iMin = (int) Math.min(byteCount, segment.limit - segment.pos);
/* 29 */                this.crc.update(segment.data, segment.pos, iMin);
/* 33 */                byteCount -= (long) iMin;
/* 34 */                segment = segment.next;
/* 36 */                segment.getClass();
                    }
                }

                private final void writeFooter() {
/* 10 */            this.sink.writeIntLe((int) this.crc.getValue());
/* 22 */            this.sink.writeIntLe((int) this.deflater.getBytesRead());
                }

                /* JADX INFO: renamed from: -deprecated_deflater, reason: not valid java name and from getter */
                public final Deflater getDeflater() {
/* 1 */             return this.deflater;
                }

                @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws Throwable {
/* 3 */             if (this.closed) {
/* 42 */                return;
                    }
/* 8 */             this.deflaterSink.finishDeflate$okio();
/* 11 */            writeFooter();
/* 14 */            th = null;
                    try {
/* 19 */                this.deflater.end();
                    } catch (Throwable th) {
/* 24 */                if (th == null) {
/* 26 */                    th = th;
                        }
                    }
                    try {
/* 29 */                this.sink.close();
                    } catch (Throwable th2) {
/* 34 */                if (th == null) {
/* 36 */                    th = th2;
                        }
                    }
/* 38 */            this.closed = true;
/* 40 */            if (th != null) {
/* 43 */                throw th;
                    }
                }

                public final Deflater deflater() {
/* 1 */             return this.deflater;
                }

                @Override // okio.Sink, java.io.Flushable
                public void flush() throws IOException {
/* 3 */             this.deflaterSink.flush();
                }

                @Override // okio.Sink
                public Timeout timeout() {
/* 3 */             return this.sink.timeout();
                }

                @Override // okio.Sink
                public void write(Buffer source, long byteCount) throws IOException {
/* 1 */             source.getClass();
/* 8 */             if (byteCount < 0) {
/* 28 */                ds0.m3200q(pm2.m7488k("byteCount < 0: ", byteCount));
                    } else {
/* 10 */                if (byteCount == 0) {
/* 12 */                    return;
                        }
/* 13 */                updateCrc(source, byteCount);
/* 18 */                this.deflaterSink.write(source, byteCount);
                    }
                }
            }
