            package okhttp3.internal.p013ws;

            import java.io.Closeable;
            import java.io.IOException;
            import java.util.zip.Deflater;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import okio.Buffer;
            import okio.ByteString;
            import okio.DeflaterSink;
            import okio.Sink;
            import p000.C1951n4;
            import p000.jb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006J\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m6176d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "noContextTakeover", HttpUrl.FRAGMENT_ENCODE_SET, "(Z)V", "deflatedBytes", "Lokio/Buffer;", "deflater", "Ljava/util/zip/Deflater;", "deflaterSink", "Lokio/DeflaterSink;", "close", HttpUrl.FRAGMENT_ENCODE_SET, "deflate", "buffer", "endsWith", "suffix", "Lokio/ByteString;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class MessageDeflater implements Closeable {
                private final Buffer deflatedBytes;
                private final Deflater deflater;
                private final DeflaterSink deflaterSink;
                private final boolean noContextTakeover;

                public MessageDeflater(boolean z) {
/* 4 */             this.noContextTakeover = z;
/* 8 */             Buffer buffer = new Buffer();
/* 11 */            this.deflatedBytes = buffer;
/* 17 */            Deflater deflater = new Deflater(-1, true);
/* 20 */            this.deflater = deflater;
/* 27 */            this.deflaterSink = new DeflaterSink((Sink) buffer, deflater);
                }

                private final boolean endsWith(Buffer buffer, ByteString byteString) {
/* 11 */            return buffer.rangeEquals(buffer.size() - ((long) byteString.size()), byteString);
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() throws Throwable {
/* 3 */             this.deflaterSink.close();
                }

                public final void deflate(Buffer buffer) throws IOException {
/* 1 */             buffer.getClass();
/* 14 */            if (this.deflatedBytes.size() != 0) {
/* 98 */                C1951n4.m6859j("Failed requirement.");
/* 101 */               return;
                    }
/* 18 */            if (this.noContextTakeover) {
/* 22 */                this.deflater.reset();
                    }
/* 31 */            this.deflaterSink.write(buffer, buffer.size());
/* 36 */            this.deflaterSink.flush();
/* 45 */            boolean zEndsWith = endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK);
/* 49 */            Buffer buffer2 = this.deflatedBytes;
/* 51 */            if (zEndsWith) {
/* 59 */                long size = buffer2.size() - 4;
/* 64 */                Buffer.UnsafeCursor andWriteUnsafe$default = Buffer.readAndWriteUnsafe$default(this.deflatedBytes, null, 1, null);
                        try {
/* 68 */                    andWriteUnsafe$default.resizeBuffer(size);
/* 71 */                    andWriteUnsafe$default.close();
                        } catch (Throwable th) {
                            try {
/* 76 */                        throw th;
                            } catch (Throwable th2) {
/* 78 */                        jb1.m5754n(andWriteUnsafe$default, th);
/* 81 */                        throw th2;
                            }
                        }
                    } else {
/* 83 */                buffer2.writeByte(0);
                    }
/* 86 */            Buffer buffer3 = this.deflatedBytes;
/* 92 */            buffer.write(buffer3, buffer3.size());
                }
            }
