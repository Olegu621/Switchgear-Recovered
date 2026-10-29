            package okhttp3.internal.http2;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.io.Closeable;
            import java.io.IOException;
            import java.util.List;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import okhttp3.internal.Util;
            import okio.Buffer;
            import okio.BufferedSink;
            import p000.AbstractC0208c9;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 :2\u00020\u0001:\u0001:B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0006\u0010\u0015\u001a\u00020\u0011J(\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u000fJ(\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u000fJ\u0006\u0010\u001e\u001a\u00020\u0011J&\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fJ\u001e\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J$\u0010(\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\u0006\u0010,\u001a\u00020\u000fJ\u001e\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000fJ$\u00101\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020+0*J\u0016\u00104\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%J\u000e\u00105\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0013J\u0016\u00106\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u00107\u001a\u000208J\u0018\u00109\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u000208H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, m6176d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "sink", "Lokio/BufferedSink;", "client", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokio/BufferedSink;Z)V", "closed", "hpackBuffer", "Lokio/Buffer;", "hpackWriter", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "maxFrameSize", HttpUrl.FRAGMENT_ENCODE_SET, "applyAndAckSettings", HttpUrl.FRAGMENT_ENCODE_SET, "peerSettings", "Lokhttp3/internal/http2/Settings;", "close", "connectionPreface", SharedDataContentProvider.BASE_PATH, "outFinished", "streamId", FirebaseAnalytics.Param.SOURCE, "byteCount", "dataFrame", "flags", "buffer", "flush", "frameHeader", "length", "type", "goAway", "lastGoodStreamId", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "debugData", HttpUrl.FRAGMENT_ENCODE_SET, "headers", "headerBlock", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "maxDataLength", "ping", "ack", "payload1", "payload2", "pushPromise", "promisedStreamId", "requestHeaders", "rstStream", "settings", "windowUpdate", "windowSizeIncrement", HttpUrl.FRAGMENT_ENCODE_SET, "writeContinuationFrames", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class Http2Writer implements Closeable {
                private static final Logger logger = Logger.getLogger(Http2.class.getName());
                private final boolean client;
                private boolean closed;
                private final Buffer hpackBuffer;
                private final Hpack.Writer hpackWriter;
                private int maxFrameSize;
                private final BufferedSink sink;

                public Http2Writer(BufferedSink bufferedSink, boolean z) {
/* 1 */             bufferedSink.getClass();
/* 7 */             this.sink = bufferedSink;
/* 9 */             this.client = z;
/* 13 */            Buffer buffer = new Buffer();
/* 16 */            this.hpackBuffer = buffer;
/* 20 */            this.maxFrameSize = Http2.INITIAL_MAX_FRAME_SIZE;
/* 31 */            this.hpackWriter = new Hpack.Writer(0, false, buffer, 3, null);
                }

                private final void writeContinuationFrames(int streamId, long byteCount) throws IOException {
/* 5 */             while (byteCount > 0) {
/* 10 */                long jMin = Math.min(this.maxFrameSize, byteCount);
/* 14 */                byteCount -= jMin;
/* 25 */                frameHeader(streamId, (int) jMin, 9, byteCount == 0 ? 4 : 0);
/* 32 */                this.sink.write(this.hpackBuffer, jMin);
                    }
                }

                public final synchronized void applyAndAckSettings(Settings peerSettings) throws IOException {
                    try {
/* 2 */                 peerSettings.getClass();
/* 7 */                 if (this.closed) {
/* 56 */                    throw new IOException("closed");
                        }
/* 15 */                this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
/* 22 */                if (peerSettings.getHeaderTableSize() != -1) {
/* 30 */                    this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
                        }
/* 39 */                frameHeader(0, 0, 4, 1);
/* 44 */                this.sink.flush();
                    } catch (Throwable th) {
/* 58 */                throw th;
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public synchronized void close() throws IOException {
/* 3 */             this.closed = true;
/* 7 */             this.sink.close();
                }

                public final synchronized void connectionPreface() throws IOException {
                    try {
/* 4 */                 if (this.closed) {
/* 68 */                    throw new IOException("closed");
                        }
/* 8 */                 if (this.client) {
/* 12 */                    Logger logger2 = logger;
/* 20 */                    if (logger2.isLoggable(Level.FINE)) {
/* 41 */                        logger2.fine(Util.format(Intrinsics.m6219d(Http2.CONNECTION_PREFACE.hex(), ">> CONNECTION "), new Object[0]));
                            }
/* 51 */                    this.sink.write(Http2.CONNECTION_PREFACE);
/* 56 */                    this.sink.flush();
                        }
                    } catch (Throwable th) {
/* 70 */                throw th;
                    }
                }

                public final synchronized void data(boolean outFinished, int streamId, Buffer source, int byteCount) throws IOException {
/* 4 */             if (this.closed) {
/* 20 */                throw new IOException("closed");
                    }
/* 6 */             dataFrame(streamId, outFinished ? 1 : 0, source, byteCount);
                }

                public final void dataFrame(int streamId, int flags, Buffer buffer, int byteCount) throws IOException {
/* 2 */             frameHeader(streamId, byteCount, 0, flags);
/* 5 */             if (byteCount > 0) {
/* 7 */                 BufferedSink bufferedSink = this.sink;
/* 9 */                 buffer.getClass();
/* 13 */                bufferedSink.write(buffer, byteCount);
                    }
                }

                public final synchronized void flush() throws IOException {
/* 4 */             if (this.closed) {
/* 22 */                throw new IOException("closed");
                    }
/* 8 */             this.sink.flush();
                }

                public final void frameHeader(int streamId, int length, int type, int flags) throws IOException {
                    int i;
                    int i2;
                    int i3;
                    int i4;
/* 1 */             Logger logger2 = logger;
/* 9 */             if (logger2.isLoggable(Level.FINE)) {
/* 14 */                i = streamId;
/* 15 */                i2 = length;
/* 16 */                i3 = type;
/* 17 */                i4 = flags;
/* 22 */                logger2.fine(Http2.INSTANCE.frameLog(false, i, i2, i3, i4));
                    } else {
/* 26 */                i = streamId;
/* 27 */                i2 = length;
/* 28 */                i3 = type;
/* 29 */                i4 = flags;
                    }
/* 32 */            if (i2 > this.maxFrameSize) {
/* 115 */               throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i2).toString());
                    }
/* 37 */            if ((Integer.MIN_VALUE & i) != 0) {
/* 78 */                ds0.m3200q(Intrinsics.m6219d(Integer.valueOf(i), "reserved bit set: "));
/* 81 */                return;
                    }
/* 41 */            Util.writeMedium(this.sink, i2);
/* 48 */            this.sink.writeByte(i3 & 255);
/* 55 */            this.sink.writeByte(i4 & 255);
/* 64 */            this.sink.writeInt(Integer.MAX_VALUE & i);
                }

                public final Hpack.Writer getHpackWriter() {
/* 1 */             return this.hpackWriter;
                }

                public final synchronized void goAway(int lastGoodStreamId, ErrorCode errorCode, byte[] debugData) throws IOException {
                    try {
/* 2 */                 errorCode.getClass();
/* 5 */                 debugData.getClass();
/* 10 */                if (this.closed) {
/* 77 */                    throw new IOException("closed");
                        }
/* 17 */                if (errorCode.getHttpCode() == -1) {
/* 69 */                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                        }
/* 24 */                frameHeader(0, debugData.length + 8, 7, 0);
/* 29 */                this.sink.writeInt(lastGoodStreamId);
/* 38 */                this.sink.writeInt(errorCode.getHttpCode());
/* 45 */                if (!(debugData.length == 0)) {
/* 49 */                    this.sink.write(debugData);
                        }
/* 57 */                this.sink.flush();
                    } catch (Throwable th) {
/* 79 */                throw th;
                    }
                }

                public final synchronized void headers(boolean outFinished, int streamId, List<Header> headerBlock) throws IOException {
/* 2 */             headerBlock.getClass();
/* 7 */             if (this.closed) {
/* 68 */                throw new IOException("closed");
                    }
/* 11 */            this.hpackWriter.writeHeaders(headerBlock);
/* 16 */            long size = this.hpackBuffer.size();
/* 23 */            long jMin = Math.min(this.maxFrameSize, size);
/* 33 */            int i = size == jMin ? 4 : 0;
/* 34 */            if (outFinished) {
/* 36 */                i |= 1;
                    }
/* 40 */            frameHeader(streamId, (int) jMin, 1, i);
/* 47 */            this.sink.write(this.hpackBuffer, jMin);
/* 50 */            if (size > jMin) {
/* 53 */                writeContinuationFrames(streamId, size - jMin);
                    }
                }

                /* JADX INFO: renamed from: maxDataLength, reason: from getter */
                public final int getMaxFrameSize() {
/* 1 */             return this.maxFrameSize;
                }

                public final synchronized void ping(boolean ack, int payload1, int payload2) throws IOException {
/* 4 */             if (this.closed) {
/* 39 */                throw new IOException("closed");
                    }
/* 10 */            frameHeader(0, 8, 6, ack ? 1 : 0);
/* 15 */            this.sink.writeInt(payload1);
/* 20 */            this.sink.writeInt(payload2);
/* 25 */            this.sink.flush();
                }

                public final synchronized void pushPromise(int streamId, int promisedStreamId, List<Header> requestHeaders) throws IOException {
/* 2 */             requestHeaders.getClass();
/* 7 */             if (this.closed) {
/* 79 */                throw new IOException("closed");
                    }
/* 11 */            this.hpackWriter.writeHeaders(requestHeaders);
/* 16 */            long size = this.hpackBuffer.size();
/* 30 */            int iMin = (int) Math.min(((long) this.maxFrameSize) - 4, size);
                    long j = iMin;
/* 42 */            frameHeader(streamId, iMin + 4, 5, size == j ? 4 : 0);
/* 51 */            this.sink.writeInt(promisedStreamId & AbstractC0208c9.API_PRIORITY_OTHER);
/* 58 */            this.sink.write(this.hpackBuffer, j);
/* 61 */            if (size > j) {
/* 64 */                writeContinuationFrames(streamId, size - j);
                    }
                }

                public final synchronized void rstStream(int streamId, ErrorCode errorCode) throws IOException {
/* 2 */             errorCode.getClass();
/* 7 */             if (this.closed) {
/* 55 */                throw new IOException("closed");
                    }
/* 14 */            if (errorCode.getHttpCode() == -1) {
/* 47 */                throw new IllegalArgumentException("Failed requirement.");
                    }
/* 19 */            frameHeader(streamId, 4, 3, 0);
/* 28 */            this.sink.writeInt(errorCode.getHttpCode());
/* 33 */            this.sink.flush();
                }

                public final synchronized void settings(Settings settings) throws IOException {
                    int i;
                    try {
/* 2 */                 settings.getClass();
/* 7 */                 if (this.closed) {
/* 75 */                    throw new IOException("closed");
                        }
/* 16 */                int i2 = 0;
/* 17 */                frameHeader(0, settings.size() * 6, 4, 0);
/* 22 */                while (i2 < 10) {
/* 24 */                    int i3 = i2 + 1;
/* 30 */                    if (settings.isSet(i2)) {
/* 33 */                        if (i2 != 4) {
/* 40 */                            i = i2 != 7 ? i2 : 4;
                                } else {
/* 42 */                            i = 3;
                                }
/* 45 */                        this.sink.writeShort(i);
/* 54 */                        this.sink.writeInt(settings.get(i2));
                            }
/* 57 */                    i2 = i3;
                        }
/* 63 */                this.sink.flush();
                    } catch (Throwable th) {
/* 77 */                throw th;
                    }
                }

                public final synchronized void windowUpdate(int streamId, long windowSizeIncrement) throws IOException {
/* 4 */             if (this.closed) {
/* 68 */                throw new IOException("closed");
                    }
/* 10 */            if (windowSizeIncrement == 0 || windowSizeIncrement > 2147483647L) {
/* 60 */                throw new IllegalArgumentException(Intrinsics.m6219d(Long.valueOf(windowSizeIncrement), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
                    }
/* 23 */            frameHeader(streamId, 4, 8, 0);
/* 29 */            this.sink.writeInt((int) windowSizeIncrement);
/* 34 */            this.sink.flush();
                }
            }
