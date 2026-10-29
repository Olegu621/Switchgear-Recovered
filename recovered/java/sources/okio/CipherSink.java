            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import javax.crypto.Cipher;
            import javax.crypto.ShortBufferException;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0018H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m6176d2 = {"Lokio/CipherSink;", "Lokio/Sink;", "sink", "Lokio/BufferedSink;", "cipher", "Ljavax/crypto/Cipher;", "(Lokio/BufferedSink;Ljavax/crypto/Cipher;)V", "blockSize", HttpUrl.FRAGMENT_ENCODE_SET, "getCipher", "()Ljavax/crypto/Cipher;", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "close", HttpUrl.FRAGMENT_ENCODE_SET, "doFinal", HttpUrl.FRAGMENT_ENCODE_SET, "flush", "timeout", "Lokio/Timeout;", "update", FirebaseAnalytics.Param.SOURCE, "Lokio/Buffer;", "remaining", HttpUrl.FRAGMENT_ENCODE_SET, "write", "byteCount", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class CipherSink implements Sink {
                private final int blockSize;
                private final Cipher cipher;
                private boolean closed;
                private final BufferedSink sink;

                public CipherSink(BufferedSink bufferedSink, Cipher cipher) {
/* 1 */             bufferedSink.getClass();
/* 4 */             cipher.getClass();
/* 10 */            this.sink = bufferedSink;
/* 12 */            this.cipher = cipher;
/* 14 */            int blockSize = cipher.getBlockSize();
/* 18 */            this.blockSize = blockSize;
/* 20 */            if (blockSize > 0) {
/* 22 */                return;
                    }
/* 25 */            C1951n4.m6867r(cipher, "Block cipher required ");
/* 29 */            throw null;
                }

                private final Throwable doFinal() {
/* 4 */             int outputSize = this.cipher.getOutputSize(0);
/* 8 */             Throwable th = null;
/* 9 */             if (outputSize == 0) {
/* 8 */                 return null;
                    }
/* 12 */            BufferedSink bufferedSink = this.sink;
/* 16 */            if (outputSize > 8192) {
                        try {
/* 20 */                    byte[] bArrDoFinal = this.cipher.doFinal();
/* 24 */                    bArrDoFinal.getClass();
/* 27 */                    bufferedSink.write(bArrDoFinal);
/* 8 */                     return null;
                        } catch (Throwable th2) {
/* 32 */                    return th2;
                        }
                    }
/* 33 */            Buffer buffer = bufferedSink.getBuffer();
/* 37 */            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(outputSize);
                    try {
/* 47 */                int iDoFinal = this.cipher.doFinal(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit);
/* 54 */                segmentWritableSegment$okio.limit += iDoFinal;
/* 62 */                buffer.setSize$okio(buffer.size() + ((long) iDoFinal));
                    } catch (Throwable th3) {
/* 67 */                th = th3;
                    }
/* 72 */            if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
/* 78 */                buffer.head = segmentWritableSegment$okio.pop();
/* 80 */                SegmentPool.recycle(segmentWritableSegment$okio);
                    }
/* 83 */            return th;
                }

                private final int update(Buffer source, long remaining) throws IOException, ShortBufferException {
/* 1 */             Segment segment = source.head;
/* 3 */             segment.getClass();
/* 16 */            int iMin = (int) Math.min(remaining, segment.limit - segment.pos);
/* 19 */            Buffer buffer = this.sink.getBuffer();
/* 25 */            int outputSize = this.cipher.getOutputSize(iMin);
/* 29 */            int i = iMin;
/* 32 */            while (outputSize > 8192) {
/* 34 */                int i2 = this.blockSize;
/* 36 */                if (i <= i2) {
/* 38 */                    BufferedSink bufferedSink = this.sink;
/* 46 */                    byte[] bArrUpdate = this.cipher.update(source.readByteArray(remaining));
/* 50 */                    bArrUpdate.getClass();
/* 53 */                    bufferedSink.write(bArrUpdate);
/* 56 */                    return (int) remaining;
                        }
/* 58 */                i -= i2;
/* 61 */                outputSize = this.cipher.getOutputSize(i);
                    }
/* 66 */            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(outputSize);
/* 80 */            int iUpdate = this.cipher.update(segment.data, segment.pos, i, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit);
/* 87 */            segmentWritableSegment$okio.limit += iUpdate;
/* 95 */            buffer.setSize$okio(buffer.size() + ((long) iUpdate));
/* 102 */           if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
/* 108 */               buffer.head = segmentWritableSegment$okio.pop();
/* 110 */               SegmentPool.recycle(segmentWritableSegment$okio);
                    }
/* 115 */           this.sink.emitCompleteSegments();
/* 124 */           source.setSize$okio(source.size() - ((long) i));
/* 129 */           int i3 = segment.pos + i;
/* 130 */           segment.pos = i3;
/* 134 */           if (i3 == segment.limit) {
/* 140 */               source.head = segment.pop();
/* 142 */               SegmentPool.recycle(segment);
                    }
/* 145 */           return i;
                }

                @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws Throwable {
/* 3 */             if (this.closed) {
/* 25 */                return;
                    }
/* 7 */             this.closed = true;
/* 9 */             Throwable thDoFinal = doFinal();
                    try {
/* 15 */                this.sink.close();
                    } catch (Throwable th) {
/* 20 */                if (thDoFinal == null) {
/* 22 */                    thDoFinal = th;
                        }
                    }
/* 23 */            if (thDoFinal != null) {
/* 26 */                throw thDoFinal;
                    }
                }

                @Override // okio.Sink, java.io.Flushable
                public void flush() throws IOException {
/* 3 */             this.sink.flush();
                }

                public final Cipher getCipher() {
/* 1 */             return this.cipher;
                }

                @Override // okio.Sink
                /* JADX INFO: renamed from: timeout */
                public Timeout getTimeout() {
/* 3 */             return this.sink.getTimeout();
                }

                @Override // okio.Sink
                public void write(Buffer source, long byteCount) throws IOException {
/* 1 */             source.getClass();
/* 11 */            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
/* 16 */            if (this.closed) {
/* 35 */                f42.m3656l("closed");
/* 38 */                return;
                    }
/* 18 */            long jUpdate = byteCount;
/* 23 */            while (jUpdate > 0) {
/* 30 */                jUpdate -= (long) update(source, jUpdate);
                    }
                }
            }
