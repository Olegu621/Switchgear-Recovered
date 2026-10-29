            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import javax.crypto.BadPaddingException;
            import javax.crypto.Cipher;
            import javax.crypto.IllegalBlockSizeException;
            import javax.crypto.ShortBufferException;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.ds0;
            import p000.f42;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m6176d2 = {"Lokio/CipherSource;", "Lokio/Source;", FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "cipher", "Ljavax/crypto/Cipher;", "(Lokio/BufferedSource;Ljavax/crypto/Cipher;)V", "blockSize", HttpUrl.FRAGMENT_ENCODE_SET, "buffer", "Lokio/Buffer;", "getCipher", "()Ljavax/crypto/Cipher;", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "final", "close", HttpUrl.FRAGMENT_ENCODE_SET, "doFinal", "read", HttpUrl.FRAGMENT_ENCODE_SET, "sink", "byteCount", "refill", "timeout", "Lokio/Timeout;", "update", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class CipherSource implements Source {
                private final int blockSize;
                private final Buffer buffer;
                private final Cipher cipher;
                private boolean closed;
                private boolean final;
                private final BufferedSource source;

                public CipherSource(BufferedSource bufferedSource, Cipher cipher) {
/* 1 */             bufferedSource.getClass();
/* 4 */             cipher.getClass();
/* 10 */            this.source = bufferedSource;
/* 12 */            this.cipher = cipher;
/* 14 */            int blockSize = cipher.getBlockSize();
/* 18 */            this.blockSize = blockSize;
/* 25 */            this.buffer = new Buffer();
/* 27 */            if (blockSize > 0) {
/* 29 */                return;
                    }
/* 32 */            C1951n4.m6867r(cipher, "Block cipher required ");
/* 36 */            throw null;
                }

                private final void doFinal() throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
/* 4 */             int outputSize = this.cipher.getOutputSize(0);
/* 8 */             if (outputSize == 0) {
/* 60 */                return;
                    }
/* 13 */            Segment segmentWritableSegment$okio = this.buffer.writableSegment$okio(outputSize);
/* 23 */            int iDoFinal = this.cipher.doFinal(segmentWritableSegment$okio.data, segmentWritableSegment$okio.pos);
/* 30 */            segmentWritableSegment$okio.limit += iDoFinal;
/* 32 */            Buffer buffer = this.buffer;
/* 40 */            buffer.setSize$okio(buffer.size() + ((long) iDoFinal));
/* 47 */            if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
/* 55 */                this.buffer.head = segmentWritableSegment$okio.pop();
/* 57 */                SegmentPool.recycle(segmentWritableSegment$okio);
                    }
                }

                private final void refill() throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
/* 11 */            while (this.buffer.size() == 0 && !this.final) {
/* 23 */                if (this.source.exhausted()) {
/* 26 */                    this.final = true;
/* 28 */                    doFinal();
/* 31 */                    return;
                        }
/* 32 */                update();
                    }
                }

                private final void update() throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
/* 7 */             Segment segment = this.source.getBuffer().head;
/* 9 */             segment.getClass();
/* 16 */            int i = segment.limit - segment.pos;
/* 19 */            int outputSize = this.cipher.getOutputSize(i);
/* 23 */            int i2 = i;
/* 26 */            while (outputSize > 8192) {
/* 28 */                int i3 = this.blockSize;
/* 30 */                if (i2 <= i3) {
/* 33 */                    this.final = true;
/* 35 */                    Buffer buffer = this.buffer;
/* 45 */                    byte[] bArrDoFinal = this.cipher.doFinal(this.source.readByteArray());
/* 49 */                    bArrDoFinal.getClass();
/* 52 */                    buffer.write(bArrDoFinal);
/* 55 */                    return;
                        }
/* 56 */                i2 -= i3;
/* 59 */                outputSize = this.cipher.getOutputSize(i2);
                    }
/* 66 */            Segment segmentWritableSegment$okio = this.buffer.writableSegment$okio(outputSize);
/* 80 */            int iUpdate = this.cipher.update(segment.data, segment.pos, i2, segmentWritableSegment$okio.data, segmentWritableSegment$okio.pos);
/* 87 */            this.source.skip(i2);
/* 93 */            segmentWritableSegment$okio.limit += iUpdate;
/* 95 */            Buffer buffer2 = this.buffer;
/* 103 */           buffer2.setSize$okio(buffer2.size() + ((long) iUpdate));
/* 110 */           if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
/* 118 */               this.buffer.head = segmentWritableSegment$okio.pop();
/* 120 */               SegmentPool.recycle(segmentWritableSegment$okio);
                    }
                }

                @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
/* 2 */             this.closed = true;
/* 6 */             this.source.close();
                }

                public final Cipher getCipher() {
/* 1 */             return this.cipher;
                }

                @Override // okio.Source
                public long read(Buffer sink, long byteCount) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
/* 1 */             sink.getClass();
/* 8 */             if (byteCount < 0) {
/* 41 */                ds0.m3200q(pm2.m7488k("byteCount < 0: ", byteCount));
/* 44 */                return 0L;
                    }
/* 12 */            if (this.closed) {
/* 29 */                f42.m3656l("closed");
/* 32 */                return 0L;
                    }
/* 14 */            if (byteCount == 0) {
/* 4 */                 return 0L;
                    }
/* 17 */            refill();
/* 22 */            return this.buffer.read(sink, byteCount);
                }

                @Override // okio.Source
                /* JADX INFO: renamed from: timeout */
                public Timeout getTimeout() {
/* 3 */             return this.source.getTimeout();
                }
            }
