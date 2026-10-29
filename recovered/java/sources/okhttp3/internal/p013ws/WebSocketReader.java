            package okhttp3.internal.p013ws;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.Closeable;
            import java.io.IOException;
            import java.net.ProtocolException;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import okhttp3.internal.Util;
            import okhttp3.internal.http2.Settings;
            import okio.Buffer;
            import okio.BufferedSource;
            import okio.ByteString;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001&B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0006\u0010 \u001a\u00020\u001fJ\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\b\u0010%\u001a\u00020\u001fH\u0002R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, m6176d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "isClient", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "frameCallback", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "perMessageDeflate", "noContextTakeover", "(ZLokio/BufferedSource;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "closed", "controlFrameBuffer", "Lokio/Buffer;", "frameLength", HttpUrl.FRAGMENT_ENCODE_SET, "isControlFrame", "isFinalFrame", "maskCursor", "Lokio/Buffer$UnsafeCursor;", "maskKey", HttpUrl.FRAGMENT_ENCODE_SET, "messageFrameBuffer", "messageInflater", "Lokhttp3/internal/ws/MessageInflater;", "opcode", HttpUrl.FRAGMENT_ENCODE_SET, "readingCompressedMessage", "getSource", "()Lokio/BufferedSource;", "close", HttpUrl.FRAGMENT_ENCODE_SET, "processNextFrame", "readControlFrame", "readHeader", "readMessage", "readMessageFrame", "readUntilNonControlFrame", "FrameCallback", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class WebSocketReader implements Closeable {
                private boolean closed;
                private final Buffer controlFrameBuffer;
                private final FrameCallback frameCallback;
                private long frameLength;
                private final boolean isClient;
                private boolean isControlFrame;
                private boolean isFinalFrame;
                private final Buffer.UnsafeCursor maskCursor;
                private final byte[] maskKey;
                private final Buffer messageFrameBuffer;
                private MessageInflater messageInflater;
                private final boolean noContextTakeover;
                private int opcode;
                private final boolean perMessageDeflate;
                private boolean readingCompressedMessage;
                private final BufferedSource source;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH&¨\u0006\u000f"}, m6176d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", HttpUrl.FRAGMENT_ENCODE_SET, "onReadClose", HttpUrl.FRAGMENT_ENCODE_SET, "code", HttpUrl.FRAGMENT_ENCODE_SET, "reason", HttpUrl.FRAGMENT_ENCODE_SET, "onReadMessage", "text", "bytes", "Lokio/ByteString;", "onReadPing", "payload", "onReadPong", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public interface FrameCallback {
                    void onReadClose(int code, String reason);

                    void onReadMessage(String text) throws IOException;

                    void onReadMessage(ByteString bytes) throws IOException;

                    void onReadPing(ByteString payload);

                    void onReadPong(ByteString payload);
                }

                public WebSocketReader(boolean z, BufferedSource bufferedSource, FrameCallback frameCallback, boolean z2, boolean z3) {
/* 1 */             bufferedSource.getClass();
/* 4 */             frameCallback.getClass();
/* 10 */            this.isClient = z;
/* 12 */            this.source = bufferedSource;
/* 14 */            this.frameCallback = frameCallback;
/* 16 */            this.perMessageDeflate = z2;
/* 18 */            this.noContextTakeover = z3;
/* 25 */            this.controlFrameBuffer = new Buffer();
/* 32 */            this.messageFrameBuffer = new Buffer();
/* 42 */            this.maskKey = z ? null : new byte[4];
/* 52 */            this.maskCursor = z ? null : new Buffer.UnsafeCursor();
                }

                private final void readControlFrame() throws IOException {
                    short s;
                    String utf8;
/* 1 */             long j = this.frameLength;
/* 7 */             if (j > 0) {
/* 13 */                this.source.readFully(this.controlFrameBuffer, j);
/* 18 */                if (!this.isClient) {
/* 20 */                    Buffer buffer = this.controlFrameBuffer;
/* 22 */                    Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
/* 24 */                    unsafeCursor.getClass();
/* 27 */                    buffer.readAndWriteUnsafe(unsafeCursor);
/* 32 */                    this.maskCursor.seek(0L);
/* 35 */                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
/* 37 */                    Buffer.UnsafeCursor unsafeCursor2 = this.maskCursor;
/* 39 */                    byte[] bArr = this.maskKey;
/* 41 */                    bArr.getClass();
/* 44 */                    webSocketProtocol.toggleMask(unsafeCursor2, bArr);
/* 49 */                    this.maskCursor.close();
                        }
                    }
                    switch (this.opcode) {
                        case 8:
/* 101 */                   long size = this.controlFrameBuffer.size();
/* 109 */                   if (size == 1) {
/* 162 */                       throw new ProtocolException("Malformed close payload length of 1.");
                            }
/* 113 */                   if (size != 0) {
/* 117 */                       s = this.controlFrameBuffer.readShort();
/* 123 */                       utf8 = this.controlFrameBuffer.readUtf8();
/* 129 */                       String strCloseCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
/* 133 */                       if (strCloseCodeExceptionMessage != null) {
/* 141 */                           throw new ProtocolException(strCloseCodeExceptionMessage);
                                }
                            } else {
/* 142 */                       s = 1005;
/* 144 */                       utf8 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 148 */                   this.frameCallback.onReadClose(s, utf8);
/* 152 */                   this.closed = true;
/* 154 */                   return;
                        case 9:
/* 95 */                    this.frameCallback.onReadPing(this.controlFrameBuffer.readByteString());
/* 98 */                    return;
                        case 10:
/* 83 */                    this.frameCallback.onReadPong(this.controlFrameBuffer.readByteString());
/* 86 */                    return;
                        default:
/* 74 */                    throw new ProtocolException(Intrinsics.m6219d(Util.toHexString(this.opcode), "Unknown control opcode: "));
                    }
                }

                private final void readHeader() throws IOException {
                    boolean z;
/* 1 */             TimeUnit timeUnit = TimeUnit.NANOSECONDS;
/* 5 */             if (this.closed) {
/* 309 */               ds0.m3195l("closed");
/* 312 */               return;
                    }
/* 13 */            long timeoutNanos = this.source.getTimeout().getTimeoutNanos();
/* 23 */            this.source.getTimeout().clearTimeout();
                    try {
/* 34 */                int iAnd = Util.and(this.source.readByte(), 255);
/* 44 */                this.source.getTimeout().timeout(timeoutNanos, timeUnit);
/* 47 */                int i = iAnd & 15;
/* 49 */                this.opcode = i;
/* 59 */                boolean z2 = (iAnd & 128) != 0;
/* 60 */                this.isFinalFrame = z2;
/* 68 */                boolean z3 = (iAnd & 8) != 0;
/* 69 */                this.isControlFrame = z3;
/* 71 */                if (z3 && !z2) {
/* 83 */                    throw new ProtocolException("Control frames must be final.");
                        }
/* 90 */                boolean z4 = (iAnd & 64) != 0;
/* 93 */                if (i == 1 || i == 2) {
/* 107 */                   if (!z4) {
/* 121 */                       z = false;
                            } else {
/* 111 */                       if (!this.perMessageDeflate) {
/* 120 */                           throw new ProtocolException("Unexpected rsv1 flag");
                                }
/* 113 */                       z = true;
                            }
/* 122 */                   this.readingCompressedMessage = z;
                        } else if (z4) {
/* 106 */                   throw new ProtocolException("Unexpected rsv1 flag");
                        }
/* 126 */               if ((iAnd & 32) != 0) {
/* 295 */                   throw new ProtocolException("Unexpected rsv2 flag");
                        }
/* 130 */               if ((iAnd & 16) != 0) {
/* 287 */                   throw new ProtocolException("Unexpected rsv3 flag");
                        }
/* 138 */               int iAnd2 = Util.and(this.source.readByte(), 255);
/* 144 */               boolean z5 = (iAnd2 & 128) != 0;
/* 149 */               if (z5 == this.isClient) {
/* 165 */                   throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                        }
/* 166 */               long j = iAnd2 & 127;
/* 169 */               this.frameLength = j;
/* 175 */               if (j == 126) {
/* 191 */                   this.frameLength = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        } else if (j == 127) {
/* 202 */                   long j2 = this.source.readLong();
/* 206 */                   this.frameLength = j2;
/* 212 */                   if (j2 < 0) {
/* 245 */                       throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                            }
                        }
/* 248 */               if (this.isControlFrame && this.frameLength > 125) {
/* 266 */                   throw new ProtocolException("Control frame must be less than 125B.");
                        }
/* 267 */               if (z5) {
/* 269 */                   BufferedSource bufferedSource = this.source;
/* 271 */                   byte[] bArr = this.maskKey;
/* 273 */                   bArr.getClass();
/* 276 */                   bufferedSource.readFully(bArr);
                        }
                    } catch (Throwable th) {
/* 303 */               this.source.getTimeout().timeout(timeoutNanos, timeUnit);
/* 306 */               throw th;
                    }
                }

                private final void readMessage() throws IOException {
/* 3 */             while (!this.closed) {
/* 5 */                 long j = this.frameLength;
/* 11 */                if (j > 0) {
/* 17 */                    this.source.readFully(this.messageFrameBuffer, j);
/* 22 */                    if (!this.isClient) {
/* 24 */                        Buffer buffer = this.messageFrameBuffer;
/* 26 */                        Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
/* 28 */                        unsafeCursor.getClass();
/* 31 */                        buffer.readAndWriteUnsafe(unsafeCursor);
/* 45 */                        this.maskCursor.seek(this.messageFrameBuffer.size() - this.frameLength);
/* 48 */                        WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
/* 50 */                        Buffer.UnsafeCursor unsafeCursor2 = this.maskCursor;
/* 52 */                        byte[] bArr = this.maskKey;
/* 54 */                        bArr.getClass();
/* 57 */                        webSocketProtocol.toggleMask(unsafeCursor2, bArr);
/* 62 */                        this.maskCursor.close();
                            }
                        }
/* 67 */                if (this.isFinalFrame) {
/* 69 */                    return;
                        }
/* 70 */                readUntilNonControlFrame();
/* 75 */                if (this.opcode != 0) {
/* 95 */                    throw new ProtocolException(Intrinsics.m6219d(Util.toHexString(this.opcode), "Expected continuation opcode. Got: "));
                        }
                    }
/* 98 */            ds0.m3195l("closed");
                }

                private final void readMessageFrame() throws IOException {
/* 1 */             int i = this.opcode;
/* 4 */             if (i != 1 && i != 2) {
/* 25 */                throw new ProtocolException(Intrinsics.m6219d(Util.toHexString(i), "Unknown opcode: "));
                    }
/* 26 */            readMessage();
/* 31 */            if (this.readingCompressedMessage) {
/* 33 */                MessageInflater messageInflater = this.messageInflater;
/* 35 */                if (messageInflater == null) {
/* 41 */                    messageInflater = new MessageInflater(this.noContextTakeover);
/* 44 */                    this.messageInflater = messageInflater;
                        }
/* 48 */                messageInflater.inflate(this.messageFrameBuffer);
                    }
/* 51 */            FrameCallback frameCallback = this.frameCallback;
/* 53 */            if (i == 1) {
/* 61 */                frameCallback.onReadMessage(this.messageFrameBuffer.readUtf8());
                    } else {
/* 71 */                frameCallback.onReadMessage(this.messageFrameBuffer.readByteString());
                    }
                }

                private final void readUntilNonControlFrame() throws IOException {
/* 3 */             while (!this.closed) {
/* 5 */                 readHeader();
/* 10 */                if (!this.isControlFrame) {
/* 17 */                    return;
                        } else {
/* 13 */                    readControlFrame();
                        }
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
/* 1 */             MessageInflater messageInflater = this.messageInflater;
/* 3 */             if (messageInflater == null) {
/* 5 */                 return;
                    }
/* 6 */             messageInflater.close();
                }

                public final BufferedSource getSource() {
/* 1 */             return this.source;
                }

                public final void processNextFrame() throws IOException {
/* 1 */             readHeader();
/* 6 */             if (this.isControlFrame) {
/* 8 */                 readControlFrame();
                    } else {
/* 12 */                readMessageFrame();
                    }
                }
            }
