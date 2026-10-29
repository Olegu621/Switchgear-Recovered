            package okio;

            import android.support.v4.media.session.PlaybackStateCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.InputStream;
            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            import kotlin.Metadata;
            import kotlin.text.CharsKt;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.ds0;
            import p000.f42;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\u0001H\u0016J\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J(\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020'H\u0016J \u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020'2\u0006\u0010 \u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010%\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020'2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0018H\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020'H\u0016J\u0018\u0010.\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020\"H\u0016J\b\u00101\u001a\u00020\"H\u0016J\b\u00102\u001a\u00020\u0012H\u0016J\b\u00103\u001a\u00020\u0012H\u0016J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000205H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u0018\u00107\u001a\u0002082\u0006\u0010#\u001a\u00020\u00122\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u000208H\u0016J\u0010\u0010;\u001a\u0002082\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010<\u001a\u00020\"H\u0016J\n\u0010=\u001a\u0004\u0018\u000108H\u0016J\b\u0010>\u001a\u000208H\u0016J\u0010\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020\u0012H\u0016J\u0010\u0010@\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010A\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u000208H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, m6176d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", FirebaseAnalytics.Param.SOURCE, "Lokio/Source;", "(Lokio/Source;)V", "buffer", "Lokio/Buffer;", "getBuffer$annotations", "()V", "getBuffer", "()Lokio/Buffer;", "bufferField", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "close", HttpUrl.FRAGMENT_ENCODE_SET, "exhausted", "indexOf", HttpUrl.FRAGMENT_ENCODE_SET, "b", HttpUrl.FRAGMENT_ENCODE_SET, "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "peek", "rangeEquals", "offset", "bytesOffset", HttpUrl.FRAGMENT_ENCODE_SET, "byteCount", "read", "sink", "Ljava/nio/ByteBuffer;", HttpUrl.FRAGMENT_ENCODE_SET, "readAll", "Lokio/Sink;", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", HttpUrl.FRAGMENT_ENCODE_SET, "readShortLe", "readString", HttpUrl.FRAGMENT_ENCODE_SET, "charset", "Ljava/nio/charset/Charset;", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "skip", "timeout", "Lokio/Timeout;", "toString", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 13 */    public final class RealBufferedSource implements BufferedSource {
                public final Buffer bufferField;
                public boolean closed;
                public final Source source;

                public RealBufferedSource(Source source) {
/* 1 */             source.getClass();
/* 7 */             this.source = source;
/* 14 */            this.bufferField = new Buffer();
                }

                public static /* synthetic */ void getBuffer$annotations() {
                }

                @Override // okio.BufferedSource, okio.BufferedSink
                /* JADX INFO: renamed from: buffer, reason: from getter */
                public Buffer getBufferField() {
/* 1 */             return this.bufferField;
                }

                @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
/* 3 */             if (this.closed) {
/* 18 */                return;
                    }
/* 6 */             this.closed = true;
/* 10 */            this.source.close();
/* 15 */            this.bufferField.clear();
                }

                @Override // okio.BufferedSource
                public boolean exhausted() {
/* 3 */             if (!this.closed) {
                        return this.bufferField.exhausted() && this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
                    }
/* 35 */            f42.m3656l("closed");
/* 38 */            return false;
                }

                @Override // okio.BufferedSource, okio.BufferedSink
                public Buffer getBuffer() {
/* 1 */             return this.bufferField;
                }

                @Override // okio.BufferedSource
                public long indexOf(byte b, long fromIndex, long toIndex) {
/* 5 */             if (this.closed) {
/* 103 */               f42.m3656l("closed");
/* 3 */                 return 0L;
                    }
/* 9 */             if (0 > fromIndex || fromIndex > toIndex) {
/* 100 */               throw new IllegalArgumentException(("fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
                    }
/* 15 */            long jMax = fromIndex;
/* 20 */            while (jMax < toIndex) {
/* 24 */                byte b2 = b;
/* 25 */                long j = toIndex;
/* 26 */                long jIndexOf = this.bufferField.indexOf(b2, jMax, j);
/* 32 */                if (jIndexOf != -1) {
/* 34 */                    return jIndexOf;
                        }
/* 37 */                long size = this.bufferField.size();
/* 43 */                if (size >= j || this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                            break;
                        }
/* 60 */                jMax = Math.max(jMax, size);
/* 64 */                b = b2;
/* 65 */                toIndex = j;
                    }
/* 18 */            return -1L;
                }

                @Override // okio.BufferedSource
                public long indexOfElement(ByteString targetBytes, long fromIndex) {
/* 1 */             targetBytes.getClass();
/* 6 */             if (this.closed) {
/* 49 */                f42.m3656l("closed");
/* 52 */                return 0L;
                    }
                    while (true) {
/* 10 */                long jIndexOfElement = this.bufferField.indexOfElement(targetBytes, fromIndex);
/* 18 */                if (jIndexOfElement != -1) {
/* 20 */                    return jIndexOfElement;
                        }
/* 23 */                long size = this.bufferField.size();
/* 39 */                if (this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
/* 14 */                    return -1L;
                        }
/* 42 */                fromIndex = Math.max(fromIndex, size);
                    }
                }

                @Override // okio.BufferedSource
                public InputStream inputStream() {
/* 3 */             return new InputStream() { // from class: okio.RealBufferedSource.inputStream.1
                        @Override // java.io.InputStream
                        public int available() throws IOException {
/* 1 */                     RealBufferedSource realBufferedSource = RealBufferedSource.this;
/* 5 */                     if (!realBufferedSource.closed) {
/* 20 */                        return (int) Math.min(realBufferedSource.bufferField.size(), 2147483647L);
                            }
/* 24 */                    ds0.m3195l("closed");
/* 27 */                    return 0;
                        }

                        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                        public void close() throws IOException {
/* 3 */                     RealBufferedSource.this.close();
                        }

                        @Override // java.io.InputStream
                        public int read(byte[] data, int offset, int byteCount) throws IOException {
/* 1 */                     data.getClass();
/* 8 */                     if (RealBufferedSource.this.closed) {
/* 62 */                        ds0.m3195l("closed");
/* 65 */                        return 0;
                            }
/* 14 */                    SegmentedByteString.checkOffsetAndCount(data.length, offset, byteCount);
/* 29 */                    if (RealBufferedSource.this.bufferField.size() == 0) {
/* 31 */                        RealBufferedSource realBufferedSource = RealBufferedSource.this;
/* 47 */                        if (realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
/* 49 */                            return -1;
                                }
                            }
/* 55 */                    return RealBufferedSource.this.bufferField.read(data, offset, byteCount);
                        }

                        public String toString() {
/* 16 */                    return RealBufferedSource.this + ".inputStream()";
                        }

                        @Override // java.io.InputStream
/* 66 */                public int read() throws IOException {
/* 67 */                    RealBufferedSource realBufferedSource = RealBufferedSource.this;
                            if (!realBufferedSource.closed) {
                                if (realBufferedSource.bufferField.size() == 0) {
/* 70 */                            RealBufferedSource realBufferedSource2 = RealBufferedSource.this;
                                    if (realBufferedSource2.source.read(realBufferedSource2.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                                        return -1;
                                    }
                                }
/* 75 */                        return RealBufferedSource.this.bufferField.readByte() & 255;
                            }
/* 76 */                    ds0.m3195l("closed");
                            return 0;
                        }
                    };
                }

                @Override // java.nio.channels.Channel
                public boolean isOpen() {
/* 3 */             return !this.closed;
                }

                @Override // okio.BufferedSource
                public BufferedSource peek() {
/* 6 */             return Okio.buffer(new PeekSource(this));
                }

                @Override // okio.BufferedSource
                public boolean rangeEquals(long offset, ByteString bytes, int bytesOffset, int byteCount) {
/* 1 */             bytes.getClass();
/* 7 */             if (this.closed) {
/* 65 */                f42.m3656l("closed");
/* 6 */                 return false;
                    }
/* 13 */            if (offset < 0 || bytesOffset < 0 || byteCount < 0 || bytes.size() - bytesOffset < byteCount) {
/* 6 */                 return false;
                    }
/* 28 */            for (int i = 0; i < byteCount; i++) {
/* 31 */                long j = ((long) i) + offset;
/* 39 */                if (!request(1 + j) || this.bufferField.getByte(j) != bytes.getByte(bytesOffset + i)) {
/* 6 */                     return false;
                        }
                    }
/* 60 */            return true;
                }

                @Override // okio.Source
                public long read(Buffer sink, long byteCount) {
/* 1 */             sink.getClass();
/* 8 */             if (byteCount < 0) {
/* 72 */                ds0.m3200q(pm2.m7488k("byteCount < 0: ", byteCount));
/* 75 */                return 0L;
                    }
/* 12 */            if (this.closed) {
/* 60 */                f42.m3656l("closed");
/* 63 */                return 0L;
                    }
/* 22 */            if (this.bufferField.size() == 0 && this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
/* 34 */                return -1L;
                    }
/* 53 */            return this.bufferField.read(sink, Math.min(byteCount, this.bufferField.size()));
                }

                @Override // okio.BufferedSource
                public long readAll(Sink sink) throws IOException {
                    Buffer buffer;
/* 1 */             sink.getClass();
/* 6 */             long j = 0;
                    while (true) {
/* 13 */                long j2 = this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
/* 21 */                buffer = this.bufferField;
/* 23 */                if (j2 == -1) {
                            break;
                        }
/* 25 */                long jCompleteSegmentByteCount = buffer.completeSegmentByteCount();
/* 31 */                if (jCompleteSegmentByteCount > 0) {
/* 33 */                    j += jCompleteSegmentByteCount;
/* 36 */                    sink.write(this.bufferField, jCompleteSegmentByteCount);
                        }
                    }
/* 46 */            if (buffer.size() <= 0) {
/* 65 */                return j;
                    }
/* 54 */            long size = this.bufferField.size() + j;
/* 55 */            Buffer buffer2 = this.bufferField;
/* 61 */            sink.write(buffer2, buffer2.size());
/* 64 */            return size;
                }

                @Override // okio.BufferedSource
                public byte readByte() throws EOFException {
/* 3 */             require(1L);
/* 8 */             return this.bufferField.readByte();
                }

                @Override // okio.BufferedSource
                public byte[] readByteArray() throws IOException {
/* 5 */             this.bufferField.writeAll(this.source);
/* 10 */            return this.bufferField.readByteArray();
                }

                @Override // okio.BufferedSource
                public ByteString readByteString() throws IOException {
/* 5 */             this.bufferField.writeAll(this.source);
/* 10 */            return this.bufferField.readByteString();
                }

                @Override // okio.BufferedSource
                public long readDecimalLong() throws EOFException {
/* 3 */             require(1L);
/* 8 */             long j = 0;
                    while (true) {
/* 9 */                 long j2 = j + 1;
/* 15 */                if (!request(j2)) {
                            break;
                        }
/* 19 */                byte b = this.bufferField.getByte(j);
/* 25 */                if ((b < 48 || b > 57) && !(j == 0 && b == 45)) {
/* 42 */                    if (j != 0) {
                                break;
                            }
/* 55 */                    String string = Integer.toString(b, CharsKt.checkRadix(CharsKt.checkRadix(16)));
/* 59 */                    string.getClass();
/* 64 */                    C1951n4.m6858i(string, "Expected a digit or '-' but was 0x");
/* 67 */                    return 0L;
                        }
/* 40 */                j = j2;
                    }
/* 72 */            return this.bufferField.readDecimalLong();
                }

                @Override // okio.BufferedSource
                public void readFully(byte[] sink) throws EOFException {
/* 1 */             sink.getClass();
                    try {
/* 6 */                 require(sink.length);
/* 11 */                this.bufferField.readFully(sink);
                    } catch (EOFException e) {
/* 16 */                int i = 0;
/* 27 */                while (this.bufferField.size() > 0) {
/* 29 */                    Buffer buffer = this.bufferField;
/* 36 */                    int i2 = buffer.read(sink, i, (int) buffer.size());
/* 41 */                    if (i2 == -1) {
/* 50 */                        throw new AssertionError();
                            }
/* 43 */                    i += i2;
                        }
/* 51 */                throw e;
                    }
                }

                @Override // okio.BufferedSource
                public long readHexadecimalUnsignedLong() throws EOFException {
/* 3 */             require(1L);
/* 6 */             int i = 0;
                    while (true) {
/* 7 */                 int i2 = i + 1;
/* 14 */                if (!request(i2)) {
                            break;
                        }
/* 19 */                byte b = this.bufferField.getByte(i);
/* 25 */                if ((b < 48 || b > 57) && ((b < 97 || b > 102) && (b < 65 || b > 70))) {
/* 50 */                    if (i != 0) {
                                break;
                            }
/* 63 */                    String string = Integer.toString(b, CharsKt.checkRadix(CharsKt.checkRadix(16)));
/* 67 */                    string.getClass();
/* 72 */                    C1951n4.m6858i(string, "Expected leading [0-9a-fA-F] character but was 0x");
/* 75 */                    return 0L;
                        }
/* 48 */                i = i2;
                    }
/* 80 */            return this.bufferField.readHexadecimalUnsignedLong();
                }

                @Override // okio.BufferedSource
                public int readInt() throws EOFException {
/* 3 */             require(4L);
/* 8 */             return this.bufferField.readInt();
                }

                @Override // okio.BufferedSource
                public int readIntLe() throws EOFException {
/* 3 */             require(4L);
/* 8 */             return this.bufferField.readIntLe();
                }

                @Override // okio.BufferedSource
                public long readLong() throws EOFException {
/* 3 */             require(8L);
/* 8 */             return this.bufferField.readLong();
                }

                @Override // okio.BufferedSource
                public long readLongLe() throws EOFException {
/* 3 */             require(8L);
/* 8 */             return this.bufferField.readLongLe();
                }

                @Override // okio.BufferedSource
                public short readShort() throws EOFException {
/* 3 */             require(2L);
/* 8 */             return this.bufferField.readShort();
                }

                @Override // okio.BufferedSource
                public short readShortLe() throws EOFException {
/* 3 */             require(2L);
/* 8 */             return this.bufferField.readShortLe();
                }

                @Override // okio.BufferedSource
                public String readString(Charset charset) throws IOException {
/* 1 */             charset.getClass();
/* 8 */             this.bufferField.writeAll(this.source);
/* 13 */            return this.bufferField.readString(charset);
                }

                @Override // okio.BufferedSource
                public String readUtf8() throws IOException {
/* 5 */             this.bufferField.writeAll(this.source);
/* 10 */            return this.bufferField.readUtf8();
                }

                @Override // okio.BufferedSource
                public int readUtf8CodePoint() throws EOFException {
/* 3 */             require(1L);
/* 10 */            byte b = this.bufferField.getByte(0L);
/* 18 */            if ((b & 224) == 192) {
/* 22 */                require(2L);
                    } else if ((b & 240) == 224) {
/* 34 */                require(3L);
                    } else if ((b & 248) == 240) {
/* 46 */                require(4L);
                    }
/* 51 */            return this.bufferField.readUtf8CodePoint();
                }

                @Override // okio.BufferedSource
                public String readUtf8Line() {
/* 3 */             long jIndexOf = indexOf((byte) 10);
/* 11 */            Buffer buffer = this.bufferField;
/* 13 */            if (jIndexOf != -1) {
/* 38 */                return okio.internal.Buffer.readUtf8Line(buffer, jIndexOf);
                    }
/* 23 */            if (buffer.size() != 0) {
/* 31 */                return readUtf8(this.bufferField.size());
                    }
/* 36 */            return null;
                }

                @Override // okio.BufferedSource
                public String readUtf8LineStrict(long limit) throws EOFException {
/* 5 */             if (limit < 0) {
/* 143 */               ds0.m3200q(pm2.m7488k("limit < 0: ", limit));
/* 146 */               return null;
                    }
/* 20 */            long j = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
/* 28 */            long jIndexOf = indexOf((byte) 10, 0L, j);
/* 36 */            if (jIndexOf != -1) {
/* 40 */                return okio.internal.Buffer.readUtf8Line(this.bufferField, jIndexOf);
                    }
/* 47 */            if (j < Long.MAX_VALUE && request(j) && this.bufferField.getByte(j - 1) == 13 && request(j + 1) && this.bufferField.getByte(j) == 10) {
/* 87 */                return okio.internal.Buffer.readUtf8Line(this.bufferField, j);
                    }
/* 94 */            Buffer buffer = new Buffer();
/* 97 */            Buffer buffer2 = this.bufferField;
/* 111 */           buffer2.copyTo(buffer, 0L, Math.min(32L, buffer2.size()));
/* 132 */           C1951n4.m6857h(buffer.readByteString().hex(), Math.min(this.bufferField.size(), limit));
/* 135 */           return null;
                }

                @Override // okio.BufferedSource
                public boolean request(long byteCount) {
/* 5 */             if (byteCount < 0) {
/* 54 */                ds0.m3200q(pm2.m7488k("byteCount < 0: ", byteCount));
/* 46 */                return false;
                    }
/* 9 */             if (this.closed) {
/* 43 */                f42.m3656l("closed");
/* 46 */                return false;
                    }
/* 19 */            while (this.bufferField.size() < byteCount) {
/* 35 */                if (this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
/* 37 */                    return false;
                        }
                    }
/* 39 */            return true;
                }

                @Override // okio.BufferedSource
                public void require(long byteCount) throws EOFException {
/* 5 */             if (request(byteCount)) {
/* 7 */                 return;
                    }
/* 8 */             C1951n4.m6854b();
                }

                @Override // okio.BufferedSource
                public int select(Options options) throws EOFException {
/* 1 */             options.getClass();
/* 6 */             if (this.closed) {
/* 58 */                f42.m3656l("closed");
/* 61 */                return 0;
                    }
/* 53 */            do {
/* 11 */                int iSelectPrefix = okio.internal.Buffer.selectPrefix(this.bufferField, options, true);
/* 17 */                if (iSelectPrefix != -2) {
/* 19 */                    if (iSelectPrefix == -1) {
/* 16 */                        return -1;
                            }
/* 34 */                    this.bufferField.skip(options.getByteStrings()[iSelectPrefix].size());
/* 37 */                    return iSelectPrefix;
                        }
/* 53 */            } while (this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
/* 16 */            return -1;
                }

                @Override // okio.BufferedSource
                public void skip(long byteCount) throws EOFException {
/* 3 */             if (this.closed) {
/* 62 */                f42.m3656l("closed");
/* 65 */                return;
                    }
/* 9 */             while (byteCount > 0) {
/* 19 */                if (this.bufferField.size() == 0 && this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
/* 38 */                    C1951n4.m6854b();
/* 41 */                    return;
                        } else {
/* 48 */                    long jMin = Math.min(byteCount, this.bufferField.size());
/* 54 */                    this.bufferField.skip(jMin);
/* 57 */                    byteCount -= jMin;
                        }
                    }
                }

                @Override // okio.Source
                /* JADX INFO: renamed from: timeout */
                public Timeout getTimeout() {
/* 3 */             return this.source.getTimeout();
                }

                public String toString() {
/* 18 */            return "buffer(" + this.source + ')';
                }

                @Override // okio.BufferedSource
/* 14 */        public byte[] readByteArray(long byteCount) throws EOFException {
/* 15 */            require(byteCount);
/* 17 */            return this.bufferField.readByteArray(byteCount);
                }

                @Override // okio.BufferedSource
/* 14 */        public ByteString readByteString(long byteCount) throws EOFException {
/* 15 */            require(byteCount);
/* 17 */            return this.bufferField.readByteString(byteCount);
                }

                @Override // okio.BufferedSource
/* 14 */        public String readUtf8(long byteCount) throws EOFException {
/* 15 */            require(byteCount);
/* 17 */            return this.bufferField.readUtf8(byteCount);
                }

                @Override // okio.BufferedSource
/* 17 */        public String readString(long byteCount, Charset charset) throws EOFException {
                    charset.getClass();
/* 18 */            require(byteCount);
/* 20 */            return this.bufferField.readString(byteCount, charset);
                }

                @Override // okio.BufferedSource
/* 51 */        public void readFully(Buffer sink, long byteCount) throws IOException {
                    sink.getClass();
                    try {
/* 52 */                require(byteCount);
/* 54 */                this.bufferField.readFully(sink, byteCount);
                    } catch (EOFException e) {
/* 56 */                sink.writeAll(this.bufferField);
/* 57 */                throw e;
                    }
                }

                @Override // okio.BufferedSource
/* 54 */        public long indexOfElement(ByteString targetBytes) {
                    targetBytes.getClass();
/* 55 */            return indexOfElement(targetBytes, 0L);
                }

                @Override // okio.BufferedSource
/* 68 */        public boolean rangeEquals(long offset, ByteString bytes) {
                    bytes.getClass();
/* 70 */            return rangeEquals(offset, bytes, 0, bytes.size());
                }

                @Override // okio.BufferedSource
/* 77 */        public int read(byte[] sink) {
                    sink.getClass();
/* 78 */            return read(sink, 0, sink.length);
                }

                @Override // okio.BufferedSource
/* 78 */        public int read(byte[] sink, int offset, int byteCount) {
                    sink.getClass();
                    long j = byteCount;
/* 79 */            SegmentedByteString.checkOffsetAndCount(sink.length, offset, j);
                    if (this.bufferField.size() == 0 && this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return -1;
                    }
/* 89 */            return this.bufferField.read(sink, offset, (int) Math.min(j, this.bufferField.size()));
                }

                @Override // java.nio.channels.ReadableByteChannel
/* 89 */        public int read(ByteBuffer sink) {
                    sink.getClass();
                    if (this.bufferField.size() == 0 && this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return -1;
                    }
/* 96 */            return this.bufferField.read(sink);
                }

                @Override // okio.BufferedSource
/* 106 */       public long indexOf(byte b, long fromIndex) {
/* 107 */           return indexOf(b, fromIndex, Long.MAX_VALUE);
                }

                @Override // okio.BufferedSource
/* 107 */       public long indexOf(ByteString bytes) {
                    bytes.getClass();
/* 108 */           return indexOf(bytes, 0L);
                }

                @Override // okio.BufferedSource
/* 108 */       public long indexOf(byte b) {
/* 109 */           return indexOf(b, 0L, Long.MAX_VALUE);
                }

                @Override // okio.BufferedSource
/* 109 */       public long indexOf(ByteString bytes, long fromIndex) throws IOException {
                    bytes.getClass();
/* 110 */           if (this.closed) {
/* 119 */               f42.m3656l("closed");
                        return 0L;
                    }
                    while (true) {
/* 112 */               long jIndexOf = this.bufferField.indexOf(bytes, fromIndex);
                        if (jIndexOf != -1) {
                            return jIndexOf;
                        }
/* 114 */               long size = this.bufferField.size();
                        if (this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                            return -1L;
                        }
/* 118 */               fromIndex = Math.max(fromIndex, (size - ((long) bytes.size())) + 1);
                    }
                }

                @Override // okio.BufferedSource
/* 147 */       public String readUtf8LineStrict() {
/* 148 */           return readUtf8LineStrict(Long.MAX_VALUE);
                }
            }
