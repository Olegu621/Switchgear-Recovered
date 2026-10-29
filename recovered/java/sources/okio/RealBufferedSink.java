            package okio;

            import android.support.v4.media.session.PlaybackStateCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.plugin.editing.SpellCheckPlugin;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001eH\u0016J \u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#H\u0016J \u0010\u001a\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020$2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u001bH\u0016J\u0010\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010*\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010-\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010.\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u0010/\u001a\u00020\u00012\u0006\u0010)\u001a\u00020!H\u0016J\u0010\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u001bH\u0016J\u0010\u00102\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u001bH\u0016J\u0018\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u000206H\u0016J(\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001b2\u0006\u00105\u001a\u000206H\u0016J\u0010\u00109\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u0019H\u0016J \u00109\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001bH\u0016J\u0010\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u001bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, m6176d2 = {"Lokio/RealBufferedSink;", "Lokio/BufferedSink;", "sink", "Lokio/Sink;", "(Lokio/Sink;)V", "buffer", "Lokio/Buffer;", "getBuffer$annotations", "()V", "getBuffer", "()Lokio/Buffer;", "bufferField", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "close", HttpUrl.FRAGMENT_ENCODE_SET, "emit", "emitCompleteSegments", "flush", "isOpen", "outputStream", "Ljava/io/OutputStream;", "timeout", "Lokio/Timeout;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "write", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.SOURCE, "Ljava/nio/ByteBuffer;", HttpUrl.FRAGMENT_ENCODE_SET, "offset", "byteCount", HttpUrl.FRAGMENT_ENCODE_SET, "byteString", "Lokio/ByteString;", "Lokio/Source;", "writeAll", "writeByte", "b", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", "i", "writeIntLe", "writeLong", "writeLongLe", "writeShort", "s", "writeShortLe", "writeString", "string", "charset", "Ljava/nio/charset/Charset;", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "writeUtf8", "writeUtf8CodePoint", "codePoint", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 23 */    public final class RealBufferedSink implements BufferedSink {
                public final Buffer bufferField;
                public boolean closed;
                public final Sink sink;

                public RealBufferedSink(Sink sink) {
/* 1 */             sink.getClass();
/* 7 */             this.sink = sink;
/* 14 */            this.bufferField = new Buffer();
                }

                public static /* synthetic */ void getBuffer$annotations() {
                }

                @Override // okio.BufferedSink
                /* JADX INFO: renamed from: buffer, reason: from getter */
                public Buffer getBufferField() {
/* 1 */             return this.bufferField;
                }

                @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws Throwable {
/* 3 */             if (this.closed) {
/* 49 */                return;
                    }
/* 15 */            if (this.bufferField.size() > 0) {
/* 17 */                Sink sink = this.sink;
/* 19 */                Buffer buffer = this.bufferField;
/* 25 */                sink.write(buffer, buffer.size());
                    }
/* 31 */            th = null;
                    try {
/* 34 */                this.sink.close();
                    } catch (Throwable th) {
/* 39 */                if (th == null) {
/* 41 */                    th = th;
                        }
                    }
/* 43 */            this.closed = true;
/* 45 */            if (th != null) {
/* 48 */                throw th;
                    }
                }

                @Override // okio.BufferedSink
                public BufferedSink emit() throws IOException {
/* 3 */             if (this.closed) {
/* 27 */                f42.m3656l("closed");
/* 30 */                return null;
                    }
/* 7 */             long size = this.bufferField.size();
/* 15 */            if (size > 0) {
/* 21 */                this.sink.write(this.bufferField, size);
                    }
/* 24 */            return this;
                }

                @Override // okio.BufferedSink
                public BufferedSink emitCompleteSegments() throws IOException {
/* 3 */             if (this.closed) {
/* 27 */                f42.m3656l("closed");
/* 30 */                return null;
                    }
/* 7 */             long jCompleteSegmentByteCount = this.bufferField.completeSegmentByteCount();
/* 15 */            if (jCompleteSegmentByteCount > 0) {
/* 21 */                this.sink.write(this.bufferField, jCompleteSegmentByteCount);
                    }
/* 24 */            return this;
                }

                @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
                public void flush() throws IOException {
/* 3 */             if (this.closed) {
/* 36 */                f42.m3656l("closed");
/* 39 */                return;
                    }
/* 15 */            if (this.bufferField.size() > 0) {
/* 17 */                Sink sink = this.sink;
/* 19 */                Buffer buffer = this.bufferField;
/* 25 */                sink.write(buffer, buffer.size());
                    }
/* 30 */            this.sink.flush();
                }

                @Override // okio.BufferedSink
                public Buffer getBuffer() {
/* 1 */             return this.bufferField;
                }

                @Override // java.nio.channels.Channel
                public boolean isOpen() {
/* 3 */             return !this.closed;
                }

                @Override // okio.BufferedSink
                public OutputStream outputStream() {
/* 3 */             return new OutputStream() { // from class: okio.RealBufferedSink.outputStream.1
                        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                        public void close() throws Throwable {
/* 3 */                     RealBufferedSink.this.close();
                        }

                        @Override // java.io.OutputStream, java.io.Flushable
                        public void flush() throws IOException {
/* 1 */                     RealBufferedSink realBufferedSink = RealBufferedSink.this;
/* 5 */                     if (realBufferedSink.closed) {
/* 10 */                        return;
                            }
/* 7 */                     realBufferedSink.flush();
                        }

                        public String toString() {
/* 16 */                    return RealBufferedSink.this + ".outputStream()";
                        }

                        @Override // java.io.OutputStream
                        public void write(byte[] data, int offset, int byteCount) throws IOException {
/* 1 */                     data.getClass();
/* 4 */                     RealBufferedSink realBufferedSink = RealBufferedSink.this;
/* 8 */                     if (realBufferedSink.closed) {
/* 23 */                        ds0.m3195l("closed");
                            } else {
/* 12 */                        realBufferedSink.bufferField.write(data, offset, byteCount);
/* 17 */                        RealBufferedSink.this.emitCompleteSegments();
                            }
                        }

                        @Override // java.io.OutputStream
/* 26 */                public void write(int b) throws IOException {
/* 27 */                    RealBufferedSink realBufferedSink = RealBufferedSink.this;
                            if (!realBufferedSink.closed) {
/* 29 */                        realBufferedSink.bufferField.writeByte((int) ((byte) b));
/* 30 */                        RealBufferedSink.this.emitCompleteSegments();
                            } else {
/* 31 */                        ds0.m3195l("closed");
                            }
                        }
                    };
                }

                @Override // okio.Sink
                /* JADX INFO: renamed from: timeout */
                public Timeout getTimeout() {
/* 3 */             return this.sink.getTimeout();
                }

                public String toString() {
/* 18 */            return "buffer(" + this.sink + ')';
                }

                @Override // okio.BufferedSink
                public BufferedSink write(Source source, long byteCount) throws IOException {
/* 1 */             source.getClass();
/* 8 */             while (byteCount > 0) {
/* 12 */                long j = source.read(this.bufferField, byteCount);
/* 20 */                if (j == -1) {
/* 27 */                    C1951n4.m6854b();
/* 30 */                    return null;
                        }
/* 22 */                byteCount -= j;
/* 23 */                emitCompleteSegments();
                    }
/* 31 */            return this;
                }

                @Override // okio.BufferedSink
                public long writeAll(Source source) throws IOException {
/* 1 */             source.getClass();
/* 4 */             long j = 0;
                    while (true) {
/* 10 */                long j2 = source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
/* 18 */                if (j2 == -1) {
/* 25 */                    return j;
                        }
/* 20 */                j += j2;
/* 21 */                emitCompleteSegments();
                    }
                }

                @Override // okio.BufferedSink
                public BufferedSink writeByte(int b) {
/* 3 */             if (this.closed) {
/* 17 */                f42.m3656l("closed");
/* 20 */                return null;
                    }
/* 7 */             this.bufferField.writeByte(b);
/* 10 */            return emitCompleteSegments();
                }

                @Override // okio.BufferedSink
                public BufferedSink writeDecimalLong(long v) {
/* 3 */             if (this.closed) {
/* 17 */                f42.m3656l("closed");
/* 20 */                return null;
                    }
/* 7 */             this.bufferField.writeDecimalLong(v);
/* 10 */            return emitCompleteSegments();
                }

                @Override // okio.BufferedSink
                public BufferedSink writeHexadecimalUnsignedLong(long v) {
/* 3 */             if (this.closed) {
/* 17 */                f42.m3656l("closed");
/* 20 */                return null;
                    }
/* 7 */             this.bufferField.writeHexadecimalUnsignedLong(v);
/* 10 */            return emitCompleteSegments();
                }

                @Override // okio.BufferedSink
                public BufferedSink writeInt(int i) {
/* 3 */             if (this.closed) {
/* 17 */                f42.m3656l("closed");
/* 20 */                return null;
                    }
/* 7 */             this.bufferField.writeInt(i);
/* 10 */            return emitCompleteSegments();
                }

                @Override // okio.BufferedSink
                public BufferedSink writeIntLe(int i) {
/* 3 */             if (this.closed) {
/* 17 */                f42.m3656l("closed");
/* 20 */                return null;
                    }
/* 7 */             this.bufferField.writeIntLe(i);
/* 10 */            return emitCompleteSegments();
                }

                @Override // okio.BufferedSink
                public BufferedSink writeLong(long v) {
/* 3 */             if (this.closed) {
/* 17 */                f42.m3656l("closed");
/* 20 */                return null;
                    }
/* 7 */             this.bufferField.writeLong(v);
/* 10 */            return emitCompleteSegments();
                }

                @Override // okio.BufferedSink
                public BufferedSink writeLongLe(long v) {
/* 3 */             if (this.closed) {
/* 17 */                f42.m3656l("closed");
/* 20 */                return null;
                    }
/* 7 */             this.bufferField.writeLongLe(v);
/* 10 */            return emitCompleteSegments();
                }

                @Override // okio.BufferedSink
                public BufferedSink writeShort(int s) {
/* 3 */             if (this.closed) {
/* 17 */                f42.m3656l("closed");
/* 20 */                return null;
                    }
/* 7 */             this.bufferField.writeShort(s);
/* 10 */            return emitCompleteSegments();
                }

                @Override // okio.BufferedSink
                public BufferedSink writeShortLe(int s) {
/* 3 */             if (this.closed) {
/* 17 */                f42.m3656l("closed");
/* 20 */                return null;
                    }
/* 7 */             this.bufferField.writeShortLe(s);
/* 10 */            return emitCompleteSegments();
                }

                @Override // okio.BufferedSink
                public BufferedSink writeString(String string, Charset charset) {
/* 1 */             string.getClass();
/* 4 */             charset.getClass();
/* 9 */             if (this.closed) {
/* 23 */                f42.m3656l("closed");
/* 26 */                return null;
                    }
/* 13 */            this.bufferField.writeString(string, charset);
/* 16 */            return emitCompleteSegments();
                }

                @Override // okio.BufferedSink
                public BufferedSink writeUtf8(String string) {
/* 1 */             string.getClass();
/* 6 */             if (this.closed) {
/* 20 */                f42.m3656l("closed");
/* 23 */                return null;
                    }
/* 10 */            this.bufferField.writeUtf8(string);
/* 13 */            return emitCompleteSegments();
                }

                @Override // okio.BufferedSink
                public BufferedSink writeUtf8CodePoint(int codePoint) {
/* 3 */             if (this.closed) {
/* 17 */                f42.m3656l("closed");
/* 20 */                return null;
                    }
/* 7 */             this.bufferField.writeUtf8CodePoint(codePoint);
/* 10 */            return emitCompleteSegments();
                }

                @Override // okio.BufferedSink
/* 24 */        public BufferedSink writeUtf8(String string, int beginIndex, int endIndex) {
                    string.getClass();
/* 25 */            if (!this.closed) {
/* 27 */                this.bufferField.writeUtf8(string, beginIndex, endIndex);
/* 28 */                return emitCompleteSegments();
                    }
/* 29 */            f42.m3656l("closed");
                    return null;
                }

                @Override // okio.BufferedSink
/* 27 */        public BufferedSink writeString(String string, int beginIndex, int endIndex, Charset charset) {
                    string.getClass();
                    charset.getClass();
/* 28 */            if (!this.closed) {
/* 30 */                this.bufferField.writeString(string, beginIndex, endIndex, charset);
/* 31 */                return emitCompleteSegments();
                    }
/* 32 */            f42.m3656l("closed");
                    return null;
                }

                @Override // okio.Sink
/* 31 */        public void write(Buffer source, long byteCount) throws IOException {
                    source.getClass();
/* 32 */            if (!this.closed) {
/* 34 */                this.bufferField.write(source, byteCount);
/* 35 */                emitCompleteSegments();
                    } else {
/* 36 */                f42.m3656l("closed");
                    }
                }

                @Override // okio.BufferedSink
/* 36 */        public BufferedSink write(ByteString byteString) {
                    byteString.getClass();
/* 37 */            if (!this.closed) {
/* 39 */                this.bufferField.write(byteString);
/* 40 */                return emitCompleteSegments();
                    }
/* 41 */            f42.m3656l("closed");
                    return null;
                }

                @Override // okio.BufferedSink
/* 41 */        public BufferedSink write(ByteString byteString, int offset, int byteCount) {
                    byteString.getClass();
/* 42 */            if (!this.closed) {
/* 44 */                this.bufferField.write(byteString, offset, byteCount);
/* 45 */                return emitCompleteSegments();
                    }
/* 46 */            f42.m3656l("closed");
                    return null;
                }

                @Override // okio.BufferedSink
/* 46 */        public BufferedSink write(byte[] source) {
                    source.getClass();
/* 47 */            if (!this.closed) {
/* 49 */                this.bufferField.write(source);
/* 50 */                return emitCompleteSegments();
                    }
/* 51 */            f42.m3656l("closed");
                    return null;
                }

                @Override // okio.BufferedSink
/* 51 */        public BufferedSink write(byte[] source, int offset, int byteCount) {
                    source.getClass();
/* 52 */            if (!this.closed) {
/* 54 */                this.bufferField.write(source, offset, byteCount);
/* 55 */                return emitCompleteSegments();
                    }
/* 56 */            f42.m3656l("closed");
                    return null;
                }

                @Override // java.nio.channels.WritableByteChannel
/* 56 */        public int write(ByteBuffer source) throws IOException {
                    source.getClass();
/* 57 */            if (!this.closed) {
/* 59 */                int iWrite = this.bufferField.write(source);
/* 60 */                emitCompleteSegments();
                        return iWrite;
                    }
/* 61 */            f42.m3656l("closed");
                    return 0;
                }
            }
