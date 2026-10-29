            package okio.internal;

            import android.support.v4.media.session.PlaybackStateCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.plugin.editing.SpellCheckPlugin;
            import java.io.IOException;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import okio.Buffer;
            import okio.BufferedSink;
            import okio.ByteString;
            import okio.Sink;
            import okio.Source;
            import okio.Timeout;
            import p000.C1951n4;
            import p000.f42;
            
            /* JADX INFO: renamed from: okio.internal.-RealBufferedSink, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\t\u001a\u00020\n*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u0016\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0015H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u0019\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010#\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\nH\u0080\b\u001a%\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010(\u001a\u00020\u0004*\u00020\u00022\u0006\u0010)\u001a\u00020\u000fH\u0080\b¨\u0006*"}, m6176d2 = {"commonClose", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/RealBufferedSink;", "commonEmit", "Lokio/BufferedSink;", "commonEmitCompleteSegments", "commonFlush", "commonTimeout", "Lokio/Timeout;", "commonToString", HttpUrl.FRAGMENT_ENCODE_SET, "commonWrite", FirebaseAnalytics.Param.SOURCE, HttpUrl.FRAGMENT_ENCODE_SET, "offset", HttpUrl.FRAGMENT_ENCODE_SET, "byteCount", "Lokio/Buffer;", HttpUrl.FRAGMENT_ENCODE_SET, "byteString", "Lokio/ByteString;", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "b", "commonWriteDecimalLong", "v", "commonWriteHexadecimalUnsignedLong", "commonWriteInt", "i", "commonWriteIntLe", "commonWriteLong", "commonWriteLongLe", "commonWriteShort", "s", "commonWriteShortLe", "commonWriteUtf8", "string", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "commonWriteUtf8CodePoint", "codePoint", "okio"}, m6177k = 2, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 26 */    public final class RealBufferedSink {
                public static final void commonClose(okio.RealBufferedSink realBufferedSink) throws Throwable {
/* 1 */             realBufferedSink.getClass();
/* 6 */             if (realBufferedSink.closed) {
/* 51 */                return;
                    }
/* 19 */            if (realBufferedSink.bufferField.size() > 0) {
/* 21 */                Sink sink = realBufferedSink.sink;
/* 23 */                Buffer buffer = realBufferedSink.bufferField;
/* 29 */                sink.write(buffer, buffer.size());
                    }
/* 35 */            th = null;
                    try {
/* 38 */                realBufferedSink.sink.close();
                    } catch (Throwable th) {
/* 43 */                if (th == null) {
/* 45 */                    th = th;
                        }
                    }
/* 47 */            realBufferedSink.closed = true;
/* 49 */            if (th != null) {
/* 52 */                throw th;
                    }
                }

                public static final BufferedSink commonEmit(okio.RealBufferedSink realBufferedSink) throws IOException {
/* 1 */             realBufferedSink.getClass();
/* 6 */             if (realBufferedSink.closed) {
/* 30 */                f42.m3656l("closed");
/* 33 */                return null;
                    }
/* 10 */            long size = realBufferedSink.bufferField.size();
/* 18 */            if (size > 0) {
/* 24 */                realBufferedSink.sink.write(realBufferedSink.bufferField, size);
                    }
/* 27 */            return realBufferedSink;
                }

                public static final BufferedSink commonEmitCompleteSegments(okio.RealBufferedSink realBufferedSink) throws IOException {
/* 1 */             realBufferedSink.getClass();
/* 6 */             if (realBufferedSink.closed) {
/* 30 */                f42.m3656l("closed");
/* 33 */                return null;
                    }
/* 10 */            long jCompleteSegmentByteCount = realBufferedSink.bufferField.completeSegmentByteCount();
/* 18 */            if (jCompleteSegmentByteCount > 0) {
/* 24 */                realBufferedSink.sink.write(realBufferedSink.bufferField, jCompleteSegmentByteCount);
                    }
/* 27 */            return realBufferedSink;
                }

                public static final void commonFlush(okio.RealBufferedSink realBufferedSink) throws IOException {
/* 1 */             realBufferedSink.getClass();
/* 6 */             if (realBufferedSink.closed) {
/* 39 */                f42.m3656l("closed");
/* 42 */                return;
                    }
/* 18 */            if (realBufferedSink.bufferField.size() > 0) {
/* 20 */                Sink sink = realBufferedSink.sink;
/* 22 */                Buffer buffer = realBufferedSink.bufferField;
/* 28 */                sink.write(buffer, buffer.size());
                    }
/* 33 */            realBufferedSink.sink.flush();
                }

                public static final Timeout commonTimeout(okio.RealBufferedSink realBufferedSink) {
/* 1 */             realBufferedSink.getClass();
/* 6 */             return realBufferedSink.sink.getTimeout();
                }

                public static final String commonToString(okio.RealBufferedSink realBufferedSink) {
/* 1 */             realBufferedSink.getClass();
/* 21 */            return "buffer(" + realBufferedSink.sink + ')';
                }

                public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, Source source, long j) throws IOException {
/* 1 */             realBufferedSink.getClass();
/* 4 */             source.getClass();
/* 11 */            while (j > 0) {
/* 15 */                long j2 = source.read(realBufferedSink.bufferField, j);
/* 23 */                if (j2 == -1) {
/* 30 */                    C1951n4.m6854b();
/* 33 */                    return null;
                        }
/* 25 */                j -= j2;
/* 26 */                realBufferedSink.emitCompleteSegments();
                    }
/* 34 */            return realBufferedSink;
                }

                public static final long commonWriteAll(okio.RealBufferedSink realBufferedSink, Source source) throws IOException {
/* 1 */             realBufferedSink.getClass();
/* 4 */             source.getClass();
/* 7 */             long j = 0;
                    while (true) {
/* 13 */                long j2 = source.read(realBufferedSink.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
/* 21 */                if (j2 == -1) {
/* 28 */                    return j;
                        }
/* 23 */                j += j2;
/* 24 */                realBufferedSink.emitCompleteSegments();
                    }
                }

                public static final BufferedSink commonWriteByte(okio.RealBufferedSink realBufferedSink, int i) {
/* 1 */             realBufferedSink.getClass();
/* 6 */             if (realBufferedSink.closed) {
/* 20 */                f42.m3656l("closed");
/* 23 */                return null;
                    }
/* 10 */            realBufferedSink.bufferField.writeByte(i);
/* 13 */            return realBufferedSink.emitCompleteSegments();
                }

                public static final BufferedSink commonWriteDecimalLong(okio.RealBufferedSink realBufferedSink, long j) {
/* 1 */             realBufferedSink.getClass();
/* 6 */             if (realBufferedSink.closed) {
/* 20 */                f42.m3656l("closed");
/* 23 */                return null;
                    }
/* 10 */            realBufferedSink.bufferField.writeDecimalLong(j);
/* 13 */            return realBufferedSink.emitCompleteSegments();
                }

                public static final BufferedSink commonWriteHexadecimalUnsignedLong(okio.RealBufferedSink realBufferedSink, long j) {
/* 1 */             realBufferedSink.getClass();
/* 6 */             if (realBufferedSink.closed) {
/* 20 */                f42.m3656l("closed");
/* 23 */                return null;
                    }
/* 10 */            realBufferedSink.bufferField.writeHexadecimalUnsignedLong(j);
/* 13 */            return realBufferedSink.emitCompleteSegments();
                }

                public static final BufferedSink commonWriteInt(okio.RealBufferedSink realBufferedSink, int i) {
/* 1 */             realBufferedSink.getClass();
/* 6 */             if (realBufferedSink.closed) {
/* 20 */                f42.m3656l("closed");
/* 23 */                return null;
                    }
/* 10 */            realBufferedSink.bufferField.writeInt(i);
/* 13 */            return realBufferedSink.emitCompleteSegments();
                }

                public static final BufferedSink commonWriteIntLe(okio.RealBufferedSink realBufferedSink, int i) {
/* 1 */             realBufferedSink.getClass();
/* 6 */             if (realBufferedSink.closed) {
/* 20 */                f42.m3656l("closed");
/* 23 */                return null;
                    }
/* 10 */            realBufferedSink.bufferField.writeIntLe(i);
/* 13 */            return realBufferedSink.emitCompleteSegments();
                }

                public static final BufferedSink commonWriteLong(okio.RealBufferedSink realBufferedSink, long j) {
/* 1 */             realBufferedSink.getClass();
/* 6 */             if (realBufferedSink.closed) {
/* 20 */                f42.m3656l("closed");
/* 23 */                return null;
                    }
/* 10 */            realBufferedSink.bufferField.writeLong(j);
/* 13 */            return realBufferedSink.emitCompleteSegments();
                }

                public static final BufferedSink commonWriteLongLe(okio.RealBufferedSink realBufferedSink, long j) {
/* 1 */             realBufferedSink.getClass();
/* 6 */             if (realBufferedSink.closed) {
/* 20 */                f42.m3656l("closed");
/* 23 */                return null;
                    }
/* 10 */            realBufferedSink.bufferField.writeLongLe(j);
/* 13 */            return realBufferedSink.emitCompleteSegments();
                }

                public static final BufferedSink commonWriteShort(okio.RealBufferedSink realBufferedSink, int i) {
/* 1 */             realBufferedSink.getClass();
/* 6 */             if (realBufferedSink.closed) {
/* 20 */                f42.m3656l("closed");
/* 23 */                return null;
                    }
/* 10 */            realBufferedSink.bufferField.writeShort(i);
/* 13 */            return realBufferedSink.emitCompleteSegments();
                }

                public static final BufferedSink commonWriteShortLe(okio.RealBufferedSink realBufferedSink, int i) {
/* 1 */             realBufferedSink.getClass();
/* 6 */             if (realBufferedSink.closed) {
/* 20 */                f42.m3656l("closed");
/* 23 */                return null;
                    }
/* 10 */            realBufferedSink.bufferField.writeShortLe(i);
/* 13 */            return realBufferedSink.emitCompleteSegments();
                }

                public static final BufferedSink commonWriteUtf8(okio.RealBufferedSink realBufferedSink, String str) {
/* 1 */             realBufferedSink.getClass();
/* 4 */             str.getClass();
/* 9 */             if (realBufferedSink.closed) {
/* 23 */                f42.m3656l("closed");
/* 26 */                return null;
                    }
/* 13 */            realBufferedSink.bufferField.writeUtf8(str);
/* 16 */            return realBufferedSink.emitCompleteSegments();
                }

                public static final BufferedSink commonWriteUtf8CodePoint(okio.RealBufferedSink realBufferedSink, int i) {
/* 1 */             realBufferedSink.getClass();
/* 6 */             if (realBufferedSink.closed) {
/* 20 */                f42.m3656l("closed");
/* 23 */                return null;
                    }
/* 10 */            realBufferedSink.bufferField.writeUtf8CodePoint(i);
/* 13 */            return realBufferedSink.emitCompleteSegments();
                }

/* 27 */        public static final BufferedSink commonWriteUtf8(okio.RealBufferedSink realBufferedSink, String str, int i, int i2) {
                    realBufferedSink.getClass();
                    str.getClass();
/* 28 */            if (!realBufferedSink.closed) {
/* 30 */                realBufferedSink.bufferField.writeUtf8(str, i, i2);
/* 31 */                return realBufferedSink.emitCompleteSegments();
                    }
/* 32 */            f42.m3656l("closed");
                    return null;
                }

/* 34 */        public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, ByteString byteString) {
                    realBufferedSink.getClass();
                    byteString.getClass();
/* 35 */            if (!realBufferedSink.closed) {
/* 37 */                realBufferedSink.bufferField.write(byteString);
/* 38 */                return realBufferedSink.emitCompleteSegments();
                    }
/* 39 */            f42.m3656l("closed");
                    return null;
                }

/* 39 */        public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, ByteString byteString, int i, int i2) {
                    realBufferedSink.getClass();
                    byteString.getClass();
/* 40 */            if (!realBufferedSink.closed) {
/* 42 */                realBufferedSink.bufferField.write(byteString, i, i2);
/* 43 */                return realBufferedSink.emitCompleteSegments();
                    }
/* 44 */            f42.m3656l("closed");
                    return null;
                }

/* 44 */        public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, byte[] bArr) {
                    realBufferedSink.getClass();
                    bArr.getClass();
/* 45 */            if (!realBufferedSink.closed) {
/* 47 */                realBufferedSink.bufferField.write(bArr);
/* 48 */                return realBufferedSink.emitCompleteSegments();
                    }
/* 49 */            f42.m3656l("closed");
                    return null;
                }

/* 49 */        public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, byte[] bArr, int i, int i2) {
                    realBufferedSink.getClass();
                    bArr.getClass();
/* 50 */            if (!realBufferedSink.closed) {
/* 52 */                realBufferedSink.bufferField.write(bArr, i, i2);
/* 53 */                return realBufferedSink.emitCompleteSegments();
                    }
/* 54 */            f42.m3656l("closed");
                    return null;
                }

/* 54 */        public static final void commonWrite(okio.RealBufferedSink realBufferedSink, Buffer buffer, long j) throws IOException {
                    realBufferedSink.getClass();
                    buffer.getClass();
/* 55 */            if (!realBufferedSink.closed) {
/* 57 */                realBufferedSink.bufferField.write(buffer, j);
/* 58 */                realBufferedSink.emitCompleteSegments();
                    } else {
/* 59 */                f42.m3656l("closed");
                    }
                }
            }
