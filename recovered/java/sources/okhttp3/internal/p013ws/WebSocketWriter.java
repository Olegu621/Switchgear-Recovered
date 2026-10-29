            package okhttp3.internal.p013ws;

            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.io.Closeable;
            import java.io.IOException;
            import java.util.Random;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import okio.Buffer;
            import okio.BufferedSink;
            import okio.ByteString;
            import p000.C1951n4;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!J\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020!H\u0002J\u0016\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020!J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020!J\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m6176d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "isClient", HttpUrl.FRAGMENT_ENCODE_SET, "sink", "Lokio/BufferedSink;", "random", "Ljava/util/Random;", "perMessageDeflate", "noContextTakeover", "minimumDeflateSize", HttpUrl.FRAGMENT_ENCODE_SET, "(ZLokio/BufferedSink;Ljava/util/Random;ZZJ)V", "maskCursor", "Lokio/Buffer$UnsafeCursor;", "maskKey", HttpUrl.FRAGMENT_ENCODE_SET, "messageBuffer", "Lokio/Buffer;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "getRandom", "()Ljava/util/Random;", "getSink", "()Lokio/BufferedSink;", "sinkBuffer", "writerClosed", "close", HttpUrl.FRAGMENT_ENCODE_SET, "writeClose", "code", HttpUrl.FRAGMENT_ENCODE_SET, "reason", "Lokio/ByteString;", "writeControlFrame", "opcode", "payload", "writeMessageFrame", "formatOpcode", SharedDataContentProvider.BASE_PATH, "writePing", "writePong", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class WebSocketWriter implements Closeable {
                private final boolean isClient;
                private final Buffer.UnsafeCursor maskCursor;
                private final byte[] maskKey;
                private final Buffer messageBuffer;
                private MessageDeflater messageDeflater;
                private final long minimumDeflateSize;
                private final boolean noContextTakeover;
                private final boolean perMessageDeflate;
                private final Random random;
                private final BufferedSink sink;
                private final Buffer sinkBuffer;
                private boolean writerClosed;

                public WebSocketWriter(boolean z, BufferedSink bufferedSink, Random random, boolean z2, boolean z3, long j) {
/* 1 */             bufferedSink.getClass();
/* 4 */             random.getClass();
/* 10 */            this.isClient = z;
/* 12 */            this.sink = bufferedSink;
/* 14 */            this.random = random;
/* 16 */            this.perMessageDeflate = z2;
/* 18 */            this.noContextTakeover = z3;
/* 20 */            this.minimumDeflateSize = j;
/* 27 */            this.messageBuffer = new Buffer();
/* 33 */            this.sinkBuffer = bufferedSink.getBuffer();
/* 43 */            this.maskKey = z ? new byte[4] : null;
/* 52 */            this.maskCursor = z ? new Buffer.UnsafeCursor() : null;
                }

                private final void writeControlFrame(int opcode, ByteString payload) throws IOException {
/* 3 */             if (this.writerClosed) {
/* 116 */               ds0.m3195l("closed");
/* 119 */               return;
                    }
/* 5 */             int size = payload.size();
/* 14 */            if (size > 125) {
/* 110 */               C1951n4.m6859j("Payload size must be less than or equal to 125");
/* 113 */               return;
                    }
/* 20 */            this.sinkBuffer.writeByte(opcode | 128);
/* 23 */            boolean z = this.isClient;
/* 25 */            Buffer buffer = this.sinkBuffer;
/* 27 */            if (z) {
/* 31 */                buffer.writeByte(size | 128);
/* 34 */                Random random = this.random;
/* 36 */                byte[] bArr = this.maskKey;
/* 38 */                bArr.getClass();
/* 41 */                random.nextBytes(bArr);
/* 48 */                this.sinkBuffer.write(this.maskKey);
/* 51 */                if (size > 0) {
/* 55 */                    long size2 = this.sinkBuffer.size();
/* 61 */                    this.sinkBuffer.write(payload);
/* 64 */                    Buffer buffer2 = this.sinkBuffer;
/* 66 */                    Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
/* 68 */                    unsafeCursor.getClass();
/* 71 */                    buffer2.readAndWriteUnsafe(unsafeCursor);
/* 76 */                    this.maskCursor.seek(size2);
/* 85 */                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
/* 90 */                    this.maskCursor.close();
                        }
                    } else {
/* 94 */                buffer.writeByte(size);
/* 99 */                this.sinkBuffer.write(payload);
                    }
/* 104 */           this.sink.flush();
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() throws Throwable {
/* 1 */             MessageDeflater messageDeflater = this.messageDeflater;
/* 3 */             if (messageDeflater == null) {
/* 5 */                 return;
                    }
/* 6 */             messageDeflater.close();
                }

                public final Random getRandom() {
/* 1 */             return this.random;
                }

                public final BufferedSink getSink() {
/* 1 */             return this.sink;
                }

                public final void writeClose(int code, ByteString reason) throws IOException {
/* 1 */             ByteString byteString = ByteString.EMPTY;
/* 3 */             if (code != 0 || reason != null) {
/* 7 */                 if (code != 0) {
/* 11 */                    WebSocketProtocol.INSTANCE.validateCloseCode(code);
                        }
/* 16 */                Buffer buffer = new Buffer();
/* 19 */                buffer.writeShort(code);
/* 22 */                if (reason != null) {
/* 24 */                    buffer.write(reason);
                        }
/* 27 */                byteString = buffer.readByteString();
                    }
                    try {
/* 34 */                writeControlFrame(8, byteString);
                    } finally {
/* 41 */                this.writerClosed = true;
                    }
                }

                public final void writeMessageFrame(int formatOpcode, ByteString data) throws IOException {
/* 1 */             data.getClass();
/* 6 */             if (this.writerClosed) {
/* 185 */               ds0.m3195l("closed");
/* 188 */               return;
                    }
/* 10 */            this.messageBuffer.write(data);
/* 13 */            int i = formatOpcode | 128;
/* 17 */            if (this.perMessageDeflate && data.size() >= this.minimumDeflateSize) {
/* 30 */                MessageDeflater messageDeflater = this.messageDeflater;
/* 32 */                if (messageDeflater == null) {
/* 38 */                    messageDeflater = new MessageDeflater(this.noContextTakeover);
/* 41 */                    this.messageDeflater = messageDeflater;
                        }
/* 45 */                messageDeflater.deflate(this.messageBuffer);
/* 48 */                i = formatOpcode | 192;
                    }
/* 52 */            long size = this.messageBuffer.size();
/* 58 */            this.sinkBuffer.writeByte(i);
/* 68 */            int i2 = this.isClient ? 128 : 0;
/* 73 */            if (size <= 125) {
/* 79 */                this.sinkBuffer.writeByte(i2 | ((int) size));
                    } else {
/* 88 */                Buffer buffer = this.sinkBuffer;
/* 90 */                if (size <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
/* 94 */                    buffer.writeByte(i2 | WebSocketProtocol.PAYLOAD_SHORT);
/* 100 */                   this.sinkBuffer.writeShort((int) size);
                        } else {
/* 106 */                   buffer.writeByte(i2 | 127);
/* 111 */                   this.sinkBuffer.writeLong(size);
                        }
                    }
/* 116 */           if (this.isClient) {
/* 118 */               Random random = this.random;
/* 120 */               byte[] bArr = this.maskKey;
/* 122 */               bArr.getClass();
/* 125 */               random.nextBytes(bArr);
/* 132 */               this.sinkBuffer.write(this.maskKey);
/* 139 */               if (size > 0) {
/* 141 */                   Buffer buffer2 = this.messageBuffer;
/* 143 */                   Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
/* 145 */                   unsafeCursor.getClass();
/* 148 */                   buffer2.readAndWriteUnsafe(unsafeCursor);
/* 153 */                   this.maskCursor.seek(0L);
/* 162 */                   WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
/* 167 */                   this.maskCursor.close();
                        }
                    }
/* 174 */           this.sinkBuffer.write(this.messageBuffer, size);
/* 179 */           this.sink.emit();
                }

                public final void writePing(ByteString payload) throws IOException {
/* 1 */             payload.getClass();
/* 6 */             writeControlFrame(9, payload);
                }

                public final void writePong(ByteString payload) throws IOException {
/* 1 */             payload.getClass();
/* 6 */             writeControlFrame(10, payload);
                }
            }
