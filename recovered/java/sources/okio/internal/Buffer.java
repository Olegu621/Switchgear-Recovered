            package okio.internal;

            import android.support.v4.media.session.PlaybackStateCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.embedding.android.KeyboardMap;
            import io.flutter.plugin.editing.SpellCheckPlugin;
            import java.io.EOFException;
            import java.io.IOException;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function2;
            import okhttp3.HttpUrl;
            import okhttp3.internal.connection.RealConnection;
            import okio.ByteString;
            import okio.C2570SegmentedByteString;
            import okio.Options;
            import okio.Segment;
            import okio.SegmentPool;
            import okio.SegmentedByteString;
            import okio.Sink;
            import okio.Source;
            import okio.Utf8;
            import okio._JvmPlatformKt;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.C1960nd;
            import p000.ds0;
            import p000.f42;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: renamed from: okio.internal.-Buffer, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\r\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0080\b\u001a\r\u0010\u0016\u001a\u00020\u0014*\u00020\u0017H\u0080\b\u001a\r\u0010\u0018\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\u0015*\u00020\u0015H\u0080\b\u001a%\u0010\u001a\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0017\u0010\u001e\u001a\u00020\f*\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0007*\u00020\u00172\u0006\u0010\"\u001a\u00020\nH\u0080\b\u001a\u0015\u0010#\u001a\u00020$*\u00020\u00152\u0006\u0010%\u001a\u00020\u0007H\u0080\b\u001a\r\u0010&\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a%\u0010'\u001a\u00020\u0007*\u00020\u00152\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010'\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0010\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010,\u001a\u00020\u0007*\u00020\u00152\u0006\u0010-\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0007H\u0080\b\u001a\r\u0010.\u001a\u00020\n*\u00020\u0017H\u0080\b\u001a-\u0010/\u001a\u00020\f*\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u0015\u00100\u001a\u00020\n*\u00020\u00152\u0006\u00101\u001a\u00020\u0001H\u0080\b\u001a%\u00100\u001a\u00020\n*\u00020\u00152\u0006\u00101\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u00100\u001a\u00020\u0007*\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0015\u00102\u001a\u00020\u0007*\u00020\u00152\u0006\u00101\u001a\u000203H\u0080\b\u001a\u0014\u00104\u001a\u00020\u0017*\u00020\u00152\u0006\u00105\u001a\u00020\u0017H\u0000\u001a\r\u00106\u001a\u00020$*\u00020\u0015H\u0080\b\u001a\r\u00107\u001a\u00020\u0001*\u00020\u0015H\u0080\b\u001a\u0015\u00107\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u00108\u001a\u00020+*\u00020\u0015H\u0080\b\u001a\u0015\u00108\u001a\u00020+*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u00109\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\u0015\u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u00101\u001a\u00020\u0001H\u0080\b\u001a\u001d\u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010;\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010<\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a\r\u0010=\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010>\u001a\u00020?*\u00020\u0015H\u0080\b\u001a\u0014\u0010@\u001a\u00020\u0017*\u00020\u00152\u0006\u00105\u001a\u00020\u0017H\u0000\u001a\u0015\u0010A\u001a\u00020B*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010C\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a\u000f\u0010D\u001a\u0004\u0018\u00010B*\u00020\u0015H\u0080\b\u001a\u0015\u0010E\u001a\u00020B*\u00020\u00152\u0006\u0010F\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010G\u001a\u00020\u0007*\u00020\u00172\u0006\u0010H\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010I\u001a\u00020\n*\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010J\u001a\u00020\n*\u00020\u00152\u0006\u0010K\u001a\u00020LH\u0080\b\u001a\u0015\u0010M\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010N\u001a\u00020+*\u00020\u0015H\u0080\b\u001a\u0015\u0010N\u001a\u00020+*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u0015\u0010O\u001a\u00020\u000e*\u00020\u00152\u0006\u0010P\u001a\u00020\nH\u0080\b\u001a\u0015\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020\u0001H\u0080\b\u001a%\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u0014*\u00020\u00152\u0006\u0010R\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a)\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010S\u001a\u00020+2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020T2\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010U\u001a\u00020\u0007*\u00020\u00152\u0006\u0010R\u001a\u00020TH\u0080\b\u001a\u0015\u0010V\u001a\u00020\u0015*\u00020\u00152\u0006\u0010(\u001a\u00020\nH\u0080\b\u001a\u0015\u0010W\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010Y\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010Z\u001a\u00020\u0015*\u00020\u00152\u0006\u0010[\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\\\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010]\u001a\u00020\u0015*\u00020\u00152\u0006\u0010^\u001a\u00020\nH\u0080\b\u001a%\u0010_\u001a\u00020\u0015*\u00020\u00152\u0006\u0010`\u001a\u00020B2\u0006\u0010a\u001a\u00020\n2\u0006\u0010b\u001a\u00020\nH\u0080\b\u001a\u0015\u0010c\u001a\u00020\u0015*\u00020\u00152\u0006\u0010d\u001a\u00020\nH\u0080\b\u001a\u0014\u0010e\u001a\u00020B*\u00020\u00152\u0006\u0010f\u001a\u00020\u0007H\u0000\u001a?\u0010g\u001a\u0002Hh\"\u0004\b\u0000\u0010h*\u00020\u00152\u0006\u0010)\u001a\u00020\u00072\u001a\u0010i\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002Hh0jH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010k\u001a\u001e\u0010l\u001a\u00020\n*\u00020\u00152\u0006\u0010K\u001a\u00020L2\b\b\u0002\u0010m\u001a\u00020\fH\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006n"}, m6176d2 = {"HEX_DIGIT_BYTES", HttpUrl.FRAGMENT_ENCODE_SET, "getHEX_DIGIT_BYTES$annotations", "()V", "getHEX_DIGIT_BYTES", "()[B", "OVERFLOW_DIGIT_START", HttpUrl.FRAGMENT_ENCODE_SET, "OVERFLOW_ZONE", "SEGMENTING_THRESHOLD", HttpUrl.FRAGMENT_ENCODE_SET, "rangeEquals", HttpUrl.FRAGMENT_ENCODE_SET, "segment", "Lokio/Segment;", "segmentPos", "bytes", "bytesOffset", "bytesLimit", "commonClear", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/Buffer;", "commonClose", "Lokio/Buffer$UnsafeCursor;", "commonCompleteSegmentByteCount", "commonCopy", "commonCopyTo", "out", "offset", "byteCount", "commonEquals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "commonExpandBuffer", "minByteCount", "commonGet", HttpUrl.FRAGMENT_ENCODE_SET, "pos", "commonHashCode", "commonIndexOf", "b", "fromIndex", "toIndex", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonNext", "commonRangeEquals", "commonRead", "sink", "commonReadAll", "Lokio/Sink;", "commonReadAndWriteUnsafe", "unsafeCursor", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadLong", "commonReadShort", HttpUrl.FRAGMENT_ENCODE_SET, "commonReadUnsafe", "commonReadUtf8", HttpUrl.FRAGMENT_ENCODE_SET, "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonResizeBuffer", "newSize", "commonSeek", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonSnapshot", "commonWritableSegment", "minimumCapacity", "commonWrite", FirebaseAnalytics.Param.SOURCE, "byteString", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "commonWriteDecimalLong", "v", "commonWriteHexadecimalUnsignedLong", "commonWriteInt", "i", "commonWriteLong", "commonWriteShort", "s", "commonWriteUtf8", "string", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "commonWriteUtf8CodePoint", "codePoint", "readUtf8Line", "newline", "seek", "T", "lambda", "Lkotlin/Function2;", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "selectPrefix", "selectTruncated", "okio"}, m6177k = 2, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 28 */    public final class Buffer {
                private static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");
                public static final long OVERFLOW_DIGIT_START = -7;
                public static final long OVERFLOW_ZONE = -922337203685477580L;
                public static final int SEGMENTING_THRESHOLD = 4096;

                public static final void commonClear(okio.Buffer buffer) throws EOFException {
/* 1 */             buffer.getClass();
/* 8 */             buffer.skip(buffer.size());
                }

                public static final void commonClose(okio.Buffer.UnsafeCursor unsafeCursor) {
/* 1 */             unsafeCursor.getClass();
/* 6 */             if (unsafeCursor.buffer == null) {
/* 28 */                f42.m3656l("not attached to a buffer");
/* 31 */                return;
                    }
/* 9 */             unsafeCursor.buffer = null;
/* 11 */            unsafeCursor.setSegment$okio(null);
/* 16 */            unsafeCursor.offset = -1L;
/* 18 */            unsafeCursor.data = null;
/* 21 */            unsafeCursor.start = -1;
/* 23 */            unsafeCursor.end = -1;
                }

                public static final long commonCompleteSegmentByteCount(okio.Buffer buffer) {
/* 1 */             buffer.getClass();
/* 4 */             long size = buffer.size();
/* 12 */            if (size == 0) {
/* 8 */                 return 0L;
                    }
/* 15 */            Segment segment = buffer.head;
/* 17 */            segment.getClass();
/* 20 */            Segment segment2 = segment.prev;
/* 22 */            segment2.getClass();
/* 25 */            int i = segment2.limit;
                    return (i >= 8192 || !segment2.owner) ? size : size - ((long) (i - segment2.pos));
                }

                public static final okio.Buffer commonCopy(okio.Buffer buffer) {
/* 1 */             buffer.getClass();
/* 6 */             okio.Buffer buffer2 = new okio.Buffer();
/* 17 */            if (buffer.size() == 0) {
/* 19 */                return buffer2;
                    }
/* 20 */            Segment segment = buffer.head;
/* 22 */            segment.getClass();
/* 25 */            Segment segmentSharedCopy = segment.sharedCopy();
/* 29 */            buffer2.head = segmentSharedCopy;
/* 31 */            segmentSharedCopy.prev = segmentSharedCopy;
/* 33 */            segmentSharedCopy.next = segmentSharedCopy;
/* 37 */            for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
/* 39 */                Segment segment3 = segmentSharedCopy.prev;
/* 41 */                segment3.getClass();
/* 44 */                segment2.getClass();
/* 51 */                segment3.push(segment2.sharedCopy());
                    }
/* 61 */            buffer2.setSize$okio(buffer.size());
/* 64 */            return buffer2;
                }

                public static final okio.Buffer commonCopyTo(okio.Buffer buffer, okio.Buffer buffer2, long j, long j2) {
/* 1 */             buffer.getClass();
/* 4 */             buffer2.getClass();
/* 11 */            long j3 = j;
/* 13 */            SegmentedByteString.checkOffsetAndCount(buffer.size(), j3, j2);
/* 20 */            if (j2 != 0) {
/* 28 */                buffer2.setSize$okio(buffer2.size() + j2);
/* 31 */                Segment segment = buffer.head;
                        while (true) {
/* 33 */                    segment.getClass();
/* 36 */                    int i = segment.limit;
/* 38 */                    int i2 = segment.pos;
/* 45 */                    if (j3 < i - i2) {
                                break;
                            }
/* 49 */                    j3 -= (long) (i - i2);
/* 50 */                    segment = segment.next;
                        }
/* 53 */                Segment segment2 = segment;
/* 54 */                long j4 = j2;
/* 57 */                while (j4 > 0) {
/* 59 */                    segment2.getClass();
/* 62 */                    Segment segmentSharedCopy = segment2.sharedCopy();
/* 69 */                    int i3 = segmentSharedCopy.pos + ((int) j3);
/* 70 */                    segmentSharedCopy.pos = i3;
/* 80 */                    segmentSharedCopy.limit = Math.min(i3 + ((int) j4), segmentSharedCopy.limit);
/* 82 */                    Segment segment3 = buffer2.head;
/* 84 */                    if (segment3 == null) {
/* 86 */                        segmentSharedCopy.prev = segmentSharedCopy;
/* 88 */                        segmentSharedCopy.next = segmentSharedCopy;
/* 90 */                        buffer2.head = segmentSharedCopy;
                            } else {
/* 93 */                        segment3.getClass();
/* 96 */                        Segment segment4 = segment3.prev;
/* 98 */                        segment4.getClass();
/* 101 */                       segment4.push(segmentSharedCopy);
                            }
/* 110 */                   j4 -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
/* 111 */                   segment2 = segment2.next;
/* 113 */                   j3 = 0;
                        }
                    }
/* 115 */           return buffer;
                }

                public static final boolean commonEquals(okio.Buffer buffer, Object obj) {
/* 5 */             buffer.getClass();
/* 9 */             if (buffer == obj) {
/* 8 */                 return true;
                    }
/* 15 */            if (!(obj instanceof okio.Buffer)) {
/* 14 */                return false;
                    }
/* 22 */            okio.Buffer buffer2 = (okio.Buffer) obj;
/* 30 */            if (buffer.size() != buffer2.size()) {
/* 14 */                return false;
                    }
/* 41 */            if (buffer.size() == 0) {
/* 8 */                 return true;
                    }
/* 44 */            Segment segment = buffer.head;
/* 46 */            segment.getClass();
/* 49 */            Segment segment2 = buffer2.head;
/* 51 */            segment2.getClass();
/* 54 */            int i = segment.pos;
/* 56 */            int i2 = segment2.pos;
/* 58 */            long j = 0;
/* 65 */            while (j < buffer.size()) {
/* 73 */                long jMin = Math.min(segment.limit - i, segment2.limit - i2);
/* 78 */                long j2 = 0;
/* 81 */                while (j2 < jMin) {
/* 85 */                    int i3 = i + 1;
/* 91 */                    int i4 = i2 + 1;
/* 95 */                    if (segment.data[i] != segment2.data[i2]) {
/* 14 */                        return false;
                            }
/* 100 */                   j2++;
/* 101 */                   i = i3;
/* 103 */                   i2 = i4;
                        }
/* 108 */               if (i == segment.limit) {
/* 110 */                   segment = segment.next;
/* 112 */                   segment.getClass();
/* 115 */                   i = segment.pos;
                        }
/* 119 */               if (i2 == segment2.limit) {
/* 121 */                   segment2 = segment2.next;
/* 123 */                   segment2.getClass();
/* 126 */                   i2 = segment2.pos;
                        }
/* 128 */               j += jMin;
                    }
/* 8 */             return true;
                }

                public static final long commonExpandBuffer(okio.Buffer.UnsafeCursor unsafeCursor, int i) {
/* 1 */             unsafeCursor.getClass();
/* 6 */             if (i <= 0) {
/* 84 */                ds0.m3200q(fm0.m3781g(i, "minByteCount <= 0: "));
/* 4 */                 return 0L;
                    }
/* 10 */            if (i > 8192) {
/* 74 */                ds0.m3200q(fm0.m3781g(i, "minByteCount > Segment.SIZE: "));
/* 4 */                 return 0L;
                    }
/* 12 */            okio.Buffer buffer = unsafeCursor.buffer;
/* 14 */            if (buffer == null) {
/* 64 */                f42.m3656l("not attached to a buffer");
/* 4 */                 return 0L;
                    }
/* 18 */            if (!unsafeCursor.readWrite) {
/* 58 */                f42.m3656l("expandBuffer() only permitted for read/write buffers");
/* 4 */                 return 0L;
                    }
/* 20 */            long size = buffer.size();
/* 24 */            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
/* 30 */            int i2 = 8192 - segmentWritableSegment$okio.limit;
/* 32 */            segmentWritableSegment$okio.limit = Segment.SIZE;
                    long j = i2;
/* 37 */            buffer.setSize$okio(size + j);
/* 40 */            unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
/* 43 */            unsafeCursor.offset = size;
/* 47 */            unsafeCursor.data = segmentWritableSegment$okio.data;
/* 51 */            unsafeCursor.start = 8192 - i2;
/* 53 */            unsafeCursor.end = Segment.SIZE;
/* 55 */            return j;
                }

                public static final byte commonGet(okio.Buffer buffer, long j) {
/* 1 */             buffer.getClass();
/* 11 */            SegmentedByteString.checkOffsetAndCount(buffer.size(), j, 1L);
/* 14 */            Segment segment = buffer.head;
/* 16 */            segment.getClass();
/* 26 */            if (buffer.size() - j < j) {
/* 28 */                long size = buffer.size();
/* 34 */                while (size > j) {
/* 36 */                    segment = segment.prev;
/* 38 */                    segment.getClass();
/* 47 */                    size -= (long) (segment.limit - segment.pos);
                        }
/* 57 */                return segment.data[(int) ((((long) segment.pos) + j) - size)];
                    }
/* 60 */            long j2 = 0;
                    while (true) {
/* 62 */                int i = segment.limit;
/* 64 */                int i2 = segment.pos;
/* 68 */                long j3 = ((long) (i - i2)) + j2;
/* 71 */                if (j3 > j) {
/* 86 */                    return segment.data[(int) ((((long) i2) + j) - j2)];
                        }
/* 73 */                segment = segment.next;
/* 75 */                segment.getClass();
/* 78 */                j2 = j3;
                    }
                }

                public static final int commonHashCode(okio.Buffer buffer) {
/* 1 */             buffer.getClass();
/* 4 */             Segment segment = buffer.head;
/* 6 */             if (segment == null) {
/* 8 */                 return 0;
                    }
/* 10 */            int i = 1;
/* 34 */            do {
/* 13 */                int i2 = segment.limit;
/* 15 */                for (int i3 = segment.pos; i3 < i2; i3++) {
/* 23 */                    i = (i * 31) + segment.data[i3];
                        }
/* 27 */                segment = segment.next;
/* 29 */                segment.getClass();
/* 34 */            } while (segment != buffer.head);
/* 36 */            return i;
                }

                public static final long commonIndexOf(okio.Buffer buffer, ByteString byteString, long j) {
                    int i;
/* 1 */             long j2 = j;
/* 3 */             buffer.getClass();
/* 6 */             byteString.getClass();
/* 13 */            long size = 0;
/* 15 */            if (byteString.size() <= 0) {
/* 264 */               C1951n4.m6859j("bytes is empty");
/* 13 */                return 0L;
                    }
/* 19 */            if (j2 < 0) {
/* 258 */               ds0.m3200q(pm2.m7488k("fromIndex < 0: ", j2));
/* 13 */                return 0L;
                    }
/* 23 */            Segment segment = buffer.head;
/* 27 */            if (segment == null) {
/* 25 */                return -1L;
                    }
/* 41 */            if (buffer.size() - j2 < j2) {
/* 43 */                size = buffer.size();
/* 49 */                while (size > j2) {
/* 51 */                    segment = segment.prev;
/* 53 */                    segment.getClass();
/* 62 */                    size -= (long) (segment.limit - segment.pos);
                        }
/* 64 */                byte[] bArrInternalArray$okio = byteString.internalArray$okio();
/* 68 */                byte b = bArrInternalArray$okio[0];
/* 70 */                int size2 = byteString.size();
/* 82 */                long size3 = (buffer.size() - ((long) size2)) + 1;
/* 85 */                while (size < size3) {
/* 87 */                    byte[] bArr = segment.data;
/* 101 */                   int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
/* 107 */                   i = (int) ((((long) segment.pos) + j2) - size);
/* 108 */                   while (i < iMin) {
/* 112 */                       if (bArr[i] != b || !rangeEquals(segment, i + 1, bArrInternalArray$okio, 1, size2)) {
/* 128 */                           i++;
                                }
                            }
/* 137 */                   size += (long) (segment.limit - segment.pos);
/* 138 */                   segment = segment.next;
/* 140 */                   segment.getClass();
/* 143 */                   j2 = size;
                        }
/* 25 */                return -1L;
                    }
                    while (true) {
/* 154 */               long j3 = ((long) (segment.limit - segment.pos)) + size;
/* 157 */               if (j3 > j2) {
                            break;
                        }
/* 159 */               segment = segment.next;
/* 161 */               segment.getClass();
/* 164 */               size = j3;
                    }
/* 166 */           byte[] bArrInternalArray$okio2 = byteString.internalArray$okio();
/* 170 */           byte b2 = bArrInternalArray$okio2[0];
/* 172 */           int size4 = byteString.size();
/* 184 */           long size5 = (buffer.size() - ((long) size4)) + 1;
/* 188 */           while (size < size5) {
/* 190 */               byte[] bArr2 = segment.data;
/* 199 */               long j4 = size5;
/* 206 */               int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - size);
/* 212 */               i = (int) ((((long) segment.pos) + j2) - size);
/* 213 */               while (i < iMin2) {
/* 217 */                   if (bArr2[i] == b2 && rangeEquals(segment, i + 1, bArrInternalArray$okio2, 1, size4)) {
                            }
/* 230 */                   i++;
                        }
/* 240 */               size += (long) (segment.limit - segment.pos);
/* 241 */               segment = segment.next;
/* 243 */               segment.getClass();
/* 246 */               size5 = j4;
/* 248 */               j2 = size;
                    }
/* 25 */            return -1L;
/* 126 */           return ((long) (i - segment.pos)) + size;
                }

                public static final long commonIndexOfElement(okio.Buffer buffer, ByteString byteString, long j) {
                    int i;
                    int i2;
/* 1 */             buffer.getClass();
/* 4 */             byteString.getClass();
/* 7 */             long size = 0;
/* 11 */            if (j < 0) {
/* 315 */               ds0.m3200q(pm2.m7488k("fromIndex < 0: ", j));
/* 7 */                 return 0L;
                    }
/* 13 */            Segment segment = buffer.head;
/* 17 */            if (segment == null) {
/* 15 */                return -1L;
                    }
/* 30 */            if (buffer.size() - j < j) {
/* 32 */                size = buffer.size();
/* 38 */                while (size > j) {
/* 40 */                    segment = segment.prev;
/* 42 */                    segment.getClass();
/* 51 */                    size -= (long) (segment.limit - segment.pos);
                        }
/* 57 */                if (byteString.size() == 2) {
/* 59 */                    byte b = byteString.getByte(0);
/* 63 */                    byte b2 = byteString.getByte(1);
/* 73 */                    while (size < buffer.size()) {
/* 75 */                        byte[] bArr = segment.data;
/* 82 */                        i = (int) ((((long) segment.pos) + j) - size);
/* 83 */                        int i3 = segment.limit;
                                while (true) {
/* 85 */                            if (i >= i3) {
/* 109 */                               size += (long) (segment.limit - segment.pos);
/* 110 */                               segment = segment.next;
/* 112 */                               segment.getClass();
/* 115 */                               j = size;
                                    } else {
/* 87 */                                byte b3 = bArr[i];
/* 89 */                                if (b3 == b || b3 == b2) {
/* 97 */                                    i2 = segment.pos;
                                        } else {
/* 94 */                                    i++;
                                        }
                                    }
                                }
                            }
                        } else {
/* 117 */                   byte[] bArrInternalArray$okio = byteString.internalArray$okio();
/* 127 */                   while (size < buffer.size()) {
/* 129 */                       byte[] bArr2 = segment.data;
/* 136 */                       i = (int) ((((long) segment.pos) + j) - size);
/* 137 */                       int i4 = segment.limit;
                                while (true) {
/* 139 */                           if (i < i4) {
/* 141 */                               byte b4 = bArr2[i];
/* 143 */                               int length = bArrInternalArray$okio.length;
/* 144 */                               int i5 = 0;
                                        while (true) {
/* 145 */                                   if (i5 >= length) {
/* 157 */                                       i++;
                                            } else if (b4 == bArrInternalArray$okio[i5]) {
/* 151 */                                       i2 = segment.pos;
                                            } else {
/* 154 */                                       i5++;
                                            }
                                        }
                                    } else {
/* 166 */                               size += (long) (segment.limit - segment.pos);
/* 167 */                               segment = segment.next;
/* 169 */                               segment.getClass();
/* 172 */                               j = size;
                                    }
                                }
                            }
                        }
/* 15 */                return -1L;
                    }
                    while (true) {
/* 181 */               long j2 = ((long) (segment.limit - segment.pos)) + size;
/* 184 */               if (j2 > j) {
                            break;
                        }
/* 186 */               segment = segment.next;
/* 188 */               segment.getClass();
/* 191 */               size = j2;
                    }
/* 197 */           if (byteString.size() == 2) {
/* 199 */               byte b5 = byteString.getByte(0);
/* 203 */               byte b6 = byteString.getByte(1);
/* 213 */               while (size < buffer.size()) {
/* 215 */                   byte[] bArr3 = segment.data;
/* 222 */                   i = (int) ((((long) segment.pos) + j) - size);
/* 223 */                   int i6 = segment.limit;
                            while (true) {
/* 225 */                       if (i >= i6) {
/* 244 */                           size += (long) (segment.limit - segment.pos);
/* 245 */                           segment = segment.next;
/* 247 */                           segment.getClass();
/* 250 */                           j = size;
                                } else {
/* 227 */                           byte b7 = bArr3[i];
/* 229 */                           if (b7 == b5 || b7 == b6) {
/* 97 */                                i2 = segment.pos;
                                    } else {
/* 235 */                               i++;
                                    }
                                }
                            }
                        }
                    } else {
/* 252 */               byte[] bArrInternalArray$okio2 = byteString.internalArray$okio();
/* 262 */               while (size < buffer.size()) {
/* 264 */                   byte[] bArr4 = segment.data;
/* 271 */                   i = (int) ((((long) segment.pos) + j) - size);
/* 272 */                   int i7 = segment.limit;
                            while (true) {
/* 274 */                       if (i < i7) {
/* 276 */                           byte b8 = bArr4[i];
/* 278 */                           int length2 = bArrInternalArray$okio2.length;
/* 279 */                           int i8 = 0;
                                    while (true) {
/* 280 */                               if (i8 >= length2) {
/* 291 */                                   i++;
                                        } else if (b8 == bArrInternalArray$okio2[i8]) {
/* 151 */                                   i2 = segment.pos;
                                        } else {
/* 288 */                                   i8++;
                                        }
                                    }
                                } else {
/* 300 */                           size += (long) (segment.limit - segment.pos);
/* 301 */                           segment = segment.next;
/* 303 */                           segment.getClass();
/* 306 */                           j = size;
                                }
                            }
                        }
                    }
/* 15 */            return -1L;
/* 101 */           return ((long) (i - i2)) + size;
                }

                public static final int commonNext(okio.Buffer.UnsafeCursor unsafeCursor) {
/* 1 */             unsafeCursor.getClass();
/* 4 */             long j = unsafeCursor.offset;
/* 6 */             okio.Buffer buffer = unsafeCursor.buffer;
/* 8 */             buffer.getClass();
/* 17 */            if (j != buffer.size()) {
/* 19 */                long j2 = unsafeCursor.offset;
                        return j2 == -1 ? unsafeCursor.seek(0L) : unsafeCursor.seek(j2 + ((long) (unsafeCursor.end - unsafeCursor.start)));
                    }
/* 48 */            f42.m3656l("no more bytes");
/* 51 */            return 0;
                }

                public static final boolean commonRangeEquals(okio.Buffer buffer, long j, ByteString byteString, int i, int i2) {
/* 1 */             buffer.getClass();
/* 4 */             byteString.getClass();
/* 12 */            if (j < 0 || i < 0 || i2 < 0 || buffer.size() - j < i2 || byteString.size() - i < i2) {
/* 11 */                return false;
                    }
/* 37 */            for (int i3 = 0; i3 < i2; i3++) {
/* 51 */                if (buffer.getByte(((long) i3) + j) != byteString.getByte(i + i3)) {
/* 11 */                    return false;
                        }
                    }
/* 57 */            return true;
                }

                public static final int commonRead(okio.Buffer buffer, byte[] bArr, int i, int i2) {
/* 1 */             buffer.getClass();
/* 4 */             bArr.getClass();
/* 11 */            SegmentedByteString.checkOffsetAndCount(bArr.length, i, i2);
/* 14 */            Segment segment = buffer.head;
/* 16 */            if (segment == null) {
/* 18 */                return -1;
                    }
/* 25 */            int iMin = Math.min(i2, segment.limit - segment.pos);
/* 29 */            byte[] bArr2 = segment.data;
/* 31 */            int i3 = segment.pos;
/* 35 */            C1960nd.m6964b(bArr2, i, bArr, i3, i3 + iMin);
/* 41 */            segment.pos += iMin;
/* 49 */            buffer.setSize$okio(buffer.size() - ((long) iMin));
/* 56 */            if (segment.pos == segment.limit) {
/* 62 */                buffer.head = segment.pop();
/* 64 */                SegmentPool.recycle(segment);
                    }
/* 67 */            return iMin;
                }

                public static final long commonReadAll(okio.Buffer buffer, Sink sink) throws IOException {
/* 1 */             buffer.getClass();
/* 4 */             sink.getClass();
/* 7 */             long size = buffer.size();
/* 15 */            if (size > 0) {
/* 17 */                sink.write(buffer, size);
                    }
/* 20 */            return size;
                }

                public static final okio.Buffer.UnsafeCursor commonReadAndWriteUnsafe(okio.Buffer buffer, okio.Buffer.UnsafeCursor unsafeCursor) {
/* 1 */             buffer.getClass();
/* 4 */             unsafeCursor.getClass();
/* 7 */             okio.Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
/* 13 */            if (unsafeCursorResolveDefaultParameter.buffer != null) {
/* 23 */                f42.m3656l("already attached to a buffer");
/* 26 */                return null;
                    }
/* 15 */            unsafeCursorResolveDefaultParameter.buffer = buffer;
/* 18 */            unsafeCursorResolveDefaultParameter.readWrite = true;
/* 20 */            return unsafeCursorResolveDefaultParameter;
                }

                public static final byte commonReadByte(okio.Buffer buffer) throws EOFException {
/* 1 */             buffer.getClass();
/* 12 */            if (buffer.size() == 0) {
/* 54 */                C1951n4.m6854b();
/* 57 */                return (byte) 0;
                    }
/* 14 */            Segment segment = buffer.head;
/* 16 */            segment.getClass();
/* 19 */            int i = segment.pos;
/* 21 */            int i2 = segment.limit;
/* 25 */            int i3 = i + 1;
/* 27 */            byte b = segment.data[i];
/* 36 */            buffer.setSize$okio(buffer.size() - 1);
/* 39 */            if (i3 != i2) {
/* 51 */                segment.pos = i3;
/* 53 */                return b;
                    }
/* 45 */            buffer.head = segment.pop();
/* 47 */            SegmentPool.recycle(segment);
/* 50 */            return b;
                }

                public static final byte[] commonReadByteArray(okio.Buffer buffer, long j) throws EOFException {
/* 1 */             buffer.getClass();
/* 9 */             if (j < 0 || j > 2147483647L) {
/* 43 */                ds0.m3200q(pm2.m7488k("byteCount: ", j));
/* 8 */                 return null;
                    }
/* 24 */            if (buffer.size() < j) {
/* 33 */                C1951n4.m6854b();
/* 8 */                 return null;
                    }
/* 27 */            byte[] bArr = new byte[(int) j];
/* 29 */            buffer.readFully(bArr);
/* 32 */            return bArr;
                }

                public static final ByteString commonReadByteString(okio.Buffer buffer, long j) throws EOFException {
/* 1 */             buffer.getClass();
/* 9 */             if (j < 0 || j > 2147483647L) {
/* 61 */                ds0.m3200q(pm2.m7488k("byteCount: ", j));
/* 8 */                 return null;
                    }
/* 24 */            if (buffer.size() < j) {
/* 51 */                C1951n4.m6854b();
/* 8 */                 return null;
                    }
/* 30 */            if (j < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
/* 47 */                return new ByteString(buffer.readByteArray(j));
                    }
/* 33 */            ByteString byteStringSnapshot = buffer.snapshot((int) j);
/* 37 */            buffer.skip(j);
/* 40 */            return byteStringSnapshot;
                }

                public static final long commonReadDecimalLong(okio.Buffer buffer) throws EOFException {
                    long j;
                    byte b;
/* 3 */             buffer.getClass();
/* 10 */            long j2 = 0;
/* 14 */            if (buffer.size() == 0) {
/* 219 */               C1951n4.m6854b();
/* 10 */                return 0L;
                    }
/* 16 */            int i = 0;
/* 19 */            boolean z = false;
/* 20 */            long j3 = 0;
/* 21 */            long j4 = -7;
/* 22 */            boolean z2 = false;
                    loop0: while (true) {
/* 23 */                Segment segment = buffer.head;
/* 25 */                segment.getClass();
/* 28 */                byte[] bArr = segment.data;
/* 30 */                int i2 = segment.pos;
/* 32 */                int i3 = segment.limit;
                        while (true) {
/* 34 */                    if (i2 >= i3) {
/* 122 */                       j = j2;
                                break;
                            }
/* 36 */                    b = bArr[i2];
/* 40 */                    if (b < 48 || b > 57) {
/* 101 */                       j = j2;
/* 105 */                       if (b != 45 || i != 0) {
/* 120 */                           z2 = true;
                                    break;
                                }
/* 111 */                       j4--;
/* 112 */                       z = true;
                            } else {
/* 46 */                        int i4 = 48 - b;
/* 55 */                        j = j2;
/* 57 */                        if (j3 < OVERFLOW_ZONE || (j3 == OVERFLOW_ZONE && i4 < j4)) {
                                    break loop0;
                                }
/* 71 */                        j3 = (j3 * 10) + ((long) i4);
                            }
/* 113 */                   i2++;
/* 115 */                   i++;
/* 117 */                   j2 = j;
                        }
/* 124 */               if (i2 == i3) {
/* 130 */                   buffer.head = segment.pop();
/* 132 */                   SegmentPool.recycle(segment);
                        } else {
/* 136 */                   segment.pos = i2;
                        }
/* 138 */               if (z2 || buffer.head == null) {
/* 154 */                   buffer.setSize$okio(buffer.size() - ((long) i));
/* 162 */                   if (i >= (z ? 2 : 1)) {
                                return z ? j3 : -j3;
                            }
/* 170 */                   if (buffer.size() != j) {
/* 183 */                       StringBuilder sbM3794t = fm0.m3794t(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
/* 197 */                       sbM3794t.append(SegmentedByteString.toHexString(buffer.getByte(j)));
/* 207 */                       throw new NumberFormatException(sbM3794t.toString());
                            }
/* 208 */                   long j5 = j;
/* 210 */                   C1951n4.m6854b();
/* 213 */                   return j5;
                        }
/* 145 */               j2 = j;
                    }
/* 82 */            okio.Buffer bufferWriteByte = new okio.Buffer().writeDecimalLong(j3).writeByte((int) b);
/* 86 */            if (!z) {
/* 88 */                bufferWriteByte.readByte();
                    }
/* 97 */            C1951n4.m6858i(bufferWriteByte.readUtf8(), "Number too large: ");
/* 100 */           return j;
                }

                public static final void commonReadFully(okio.Buffer buffer, okio.Buffer buffer2, long j) throws EOFException {
/* 1 */             buffer.getClass();
/* 4 */             buffer2.getClass();
/* 13 */            if (buffer.size() >= j) {
/* 15 */                buffer2.write(buffer, j);
                    } else {
/* 23 */                buffer2.write(buffer, buffer.size());
/* 26 */                C1951n4.m6854b();
                    }
                }

                public static final long commonReadHexadecimalUnsignedLong(okio.Buffer buffer) throws EOFException {
                    int i;
/* 1 */             buffer.getClass();
/* 12 */            if (buffer.size() == 0) {
/* 147 */               C1951n4.m6854b();
/* 8 */                 return 0L;
                    }
/* 14 */            int i2 = 0;
/* 15 */            boolean z = false;
/* 16 */            long j = 0;
/* 135 */           do {
/* 17 */                Segment segment = buffer.head;
/* 19 */                segment.getClass();
/* 22 */                byte[] bArr = segment.data;
/* 24 */                int i3 = segment.pos;
/* 26 */                int i4 = segment.limit;
/* 28 */                while (i3 < i4) {
/* 30 */                    byte b = bArr[i3];
/* 34 */                    if (b >= 48 && b <= 57) {
/* 40 */                        i = b - 48;
                            } else if (b >= 97 && b <= 102) {
/* 51 */                        i = b - 87;
                            } else {
/* 56 */                        if (b < 65 || b > 70) {
/* 103 */                           if (i2 != 0) {
/* 105 */                               z = true;
                                        break;
                                    }
/* 113 */                           C1951n4.m6858i(SegmentedByteString.toHexString(b), "Expected leading [0-9a-fA-F] character but was 0x");
/* 8 */                             return 0L;
                                }
/* 62 */                        i = b - 55;
                            }
/* 69 */                    if (((-1152921504606846976L) & j) != 0) {
/* 99 */                        C1951n4.m6858i(new okio.Buffer().writeHexadecimalUnsignedLong(j).writeByte((int) b).readUtf8(), "Number too large: ");
/* 8 */                         return 0L;
                            }
/* 74 */                    j = (j << 4) | ((long) i);
/* 75 */                    i3++;
/* 77 */                    i2++;
                        }
/* 117 */               if (i3 == i4) {
/* 123 */                   buffer.head = segment.pop();
/* 125 */                   SegmentPool.recycle(segment);
                        } else {
/* 129 */                   segment.pos = i3;
                        }
/* 131 */               if (z) {
                            break;
                        }
/* 135 */           } while (buffer.head != null);
/* 143 */           buffer.setSize$okio(buffer.size() - ((long) i2));
/* 146 */           return j;
                }

                public static final int commonReadInt(okio.Buffer buffer) throws EOFException {
/* 1 */             buffer.getClass();
/* 12 */            if (buffer.size() < 4) {
/* 122 */               C1951n4.m6854b();
/* 125 */               return 0;
                    }
/* 14 */            Segment segment = buffer.head;
/* 16 */            segment.getClass();
/* 19 */            int i = segment.pos;
/* 21 */            int i2 = segment.limit;
/* 28 */            if (i2 - i < 4) {
/* 62 */                return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
                    }
/* 64 */            byte[] bArr = segment.data;
/* 83 */            int i3 = i + 3;
/* 91 */            int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
/* 92 */            int i5 = i + 4;
/* 98 */            int i6 = (bArr[i3] & 255) | i4;
/* 104 */           buffer.setSize$okio(buffer.size() - 4);
/* 107 */           if (i5 != i2) {
/* 119 */               segment.pos = i5;
/* 121 */               return i6;
                    }
/* 113 */           buffer.head = segment.pop();
/* 115 */           SegmentPool.recycle(segment);
/* 118 */           return i6;
                }

                public static final long commonReadLong(okio.Buffer buffer) throws EOFException {
/* 1 */             buffer.getClass();
/* 12 */            if (buffer.size() < 8) {
/* 155 */               C1951n4.m6854b();
/* 158 */               return 0L;
                    }
/* 14 */            Segment segment = buffer.head;
/* 16 */            segment.getClass();
/* 19 */            int i = segment.pos;
/* 21 */            int i2 = segment.limit;
/* 30 */            if (i2 - i < 8) {
/* 50 */                return ((((long) buffer.readInt()) & KeyboardMap.kValueMask) << 32) | (KeyboardMap.kValueMask & ((long) buffer.readInt()));
                    }
/* 52 */            byte[] bArr = segment.data;
/* 115 */           int i3 = i + 7;
/* 124 */           long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
/* 125 */           int i4 = i + 8;
/* 130 */           long j2 = j | (((long) bArr[i3]) & 255);
/* 137 */           buffer.setSize$okio(buffer.size() - 8);
/* 140 */           if (i4 != i2) {
/* 152 */               segment.pos = i4;
/* 154 */               return j2;
                    }
/* 146 */           buffer.head = segment.pop();
/* 148 */           SegmentPool.recycle(segment);
/* 151 */           return j2;
                }

                public static final short commonReadShort(okio.Buffer buffer) throws EOFException {
/* 1 */             buffer.getClass();
/* 12 */            if (buffer.size() < 2) {
/* 85 */                C1951n4.m6854b();
/* 88 */                return (short) 0;
                    }
/* 14 */            Segment segment = buffer.head;
/* 16 */            segment.getClass();
/* 19 */            int i = segment.pos;
/* 21 */            int i2 = segment.limit;
/* 26 */            if (i2 - i < 2) {
/* 43 */                return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
                    }
/* 45 */            byte[] bArr = segment.data;
/* 47 */            int i3 = i + 1;
/* 53 */            int i4 = (bArr[i] & 255) << 8;
/* 55 */            int i5 = i + 2;
/* 60 */            int i6 = (bArr[i3] & 255) | i4;
/* 66 */            buffer.setSize$okio(buffer.size() - 2);
/* 69 */            if (i5 == i2) {
/* 75 */                buffer.head = segment.pop();
/* 77 */                SegmentPool.recycle(segment);
                    } else {
/* 81 */                segment.pos = i5;
                    }
/* 83 */            return (short) i6;
                }

                public static final okio.Buffer.UnsafeCursor commonReadUnsafe(okio.Buffer buffer, okio.Buffer.UnsafeCursor unsafeCursor) {
/* 1 */             buffer.getClass();
/* 4 */             unsafeCursor.getClass();
/* 7 */             okio.Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
/* 13 */            if (unsafeCursorResolveDefaultParameter.buffer != null) {
/* 23 */                f42.m3656l("already attached to a buffer");
/* 26 */                return null;
                    }
/* 15 */            unsafeCursorResolveDefaultParameter.buffer = buffer;
/* 18 */            unsafeCursorResolveDefaultParameter.readWrite = false;
/* 20 */            return unsafeCursorResolveDefaultParameter;
                }

                public static final String commonReadUtf8(okio.Buffer buffer, long j) throws EOFException {
/* 1 */             buffer.getClass();
/* 9 */             if (j < 0 || j > 2147483647L) {
/* 106 */               ds0.m3200q(pm2.m7488k("byteCount: ", j));
/* 8 */                 return null;
                    }
/* 24 */            if (buffer.size() < j) {
/* 96 */                C1951n4.m6854b();
/* 8 */                 return null;
                    }
/* 26 */            if (j == 0) {
/* 28 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 31 */            Segment segment = buffer.head;
/* 33 */            segment.getClass();
/* 36 */            int i = segment.pos;
/* 45 */            if (((long) i) + j > segment.limit) {
/* 53 */                return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j), 0, 0, 3, null);
                    }
/* 60 */            int i2 = (int) j;
/* 63 */            String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i, i + i2);
/* 70 */            segment.pos += i2;
/* 77 */            buffer.setSize$okio(buffer.size() - j);
/* 84 */            if (segment.pos == segment.limit) {
/* 90 */                buffer.head = segment.pop();
/* 92 */                SegmentPool.recycle(segment);
                    }
/* 95 */            return strCommonToUtf8String;
                }

                public static final int commonReadUtf8CodePoint(okio.Buffer buffer) throws EOFException {
                    int i;
                    int i2;
                    int i3;
/* 1 */             buffer.getClass();
/* 13 */            if (buffer.size() == 0) {
/* 172 */               C1951n4.m6854b();
/* 12 */                return 0;
                    }
/* 15 */            byte b = buffer.getByte(0L);
/* 27 */            if ((b & 128) == 0) {
/* 29 */                i = b & 127;
/* 31 */                i3 = 0;
/* 32 */                i2 = 1;
                    } else if ((b & 224) == 192) {
/* 40 */                i = b & 31;
/* 42 */                i2 = 2;
/* 43 */                i3 = 128;
                    } else if ((b & 240) == 224) {
/* 51 */                i = b & 15;
/* 53 */                i2 = 3;
/* 54 */                i3 = 2048;
                    } else {
/* 61 */                if ((b & 248) != 240) {
/* 168 */                   buffer.skip(1L);
/* 24 */                    return Utf8.REPLACEMENT_CODE_POINT;
                        }
/* 63 */                i = b & 7;
/* 65 */                i2 = 4;
/* 66 */                i3 = 65536;
                    }
                    long j = i2;
/* 75 */            if (buffer.size() < j) {
/* 130 */               StringBuilder sbM3793s = fm0.m3793s(i2, "size < ", ": ");
/* 138 */               sbM3793s.append(buffer.size());
/* 143 */               sbM3793s.append(" (to read code point prefixed 0x");
/* 150 */               sbM3793s.append(SegmentedByteString.toHexString(b));
/* 155 */               sbM3793s.append(')');
/* 165 */               throw new EOFException(sbM3793s.toString());
                    }
/* 77 */            for (int i4 = 1; i4 < i2; i4++) {
                        long j2 = i4;
/* 80 */                byte b2 = buffer.getByte(j2);
/* 86 */                if ((b2 & 192) != 128) {
/* 96 */                    buffer.skip(j2);
/* 24 */                    return Utf8.REPLACEMENT_CODE_POINT;
                        }
/* 92 */                i = (i << 6) | (b2 & Utf8.REPLACEMENT_BYTE);
                    }
/* 100 */           buffer.skip(j);
/* 106 */           if (i > 1114111) {
/* 24 */                return Utf8.REPLACEMENT_CODE_POINT;
                    }
                    return ((55296 > i || i >= 57344) && i >= i3) ? i : Utf8.REPLACEMENT_CODE_POINT;
                }

                public static final String commonReadUtf8Line(okio.Buffer buffer) {
/* 1 */             buffer.getClass();
/* 6 */             long jIndexOf = buffer.indexOf((byte) 10);
/* 14 */            if (jIndexOf != -1) {
/* 16 */                return readUtf8Line(buffer, jIndexOf);
                    }
/* 29 */            if (buffer.size() != 0) {
/* 35 */                return buffer.readUtf8(buffer.size());
                    }
/* 40 */            return null;
                }

                public static final String commonReadUtf8LineStrict(okio.Buffer buffer, long j) throws EOFException {
/* 1 */             buffer.getClass();
/* 9 */             if (j < 0) {
/* 125 */               ds0.m3200q(pm2.m7488k("limit < 0: ", j));
/* 8 */                 return null;
                    }
/* 24 */            long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
/* 32 */            long jIndexOf = buffer.indexOf((byte) 10, 0L, j2);
/* 40 */            if (jIndexOf != -1) {
/* 42 */                return readUtf8Line(buffer, jIndexOf);
                    }
/* 53 */            if (j2 < buffer.size() && buffer.getByte(j2 - 1) == 13 && buffer.getByte(j2) == 10) {
/* 73 */                return readUtf8Line(buffer, j2);
                    }
/* 80 */            okio.Buffer buffer2 = new okio.Buffer();
/* 96 */            buffer.copyTo(buffer2, 0L, Math.min(32L, buffer.size()));
/* 115 */           C1951n4.m6857h(buffer2.readByteString().hex(), Math.min(buffer.size(), j));
/* 8 */             return null;
                }

                public static final long commonResizeBuffer(okio.Buffer.UnsafeCursor unsafeCursor, long j) {
/* 1 */             unsafeCursor.getClass();
/* 4 */             okio.Buffer buffer = unsafeCursor.buffer;
/* 8 */             if (buffer == null) {
/* 156 */               f42.m3656l("not attached to a buffer");
/* 6 */                 return 0L;
                    }
/* 12 */            if (!unsafeCursor.readWrite) {
/* 150 */               f42.m3656l("resizeBuffer() only permitted for read/write buffers");
/* 6 */                 return 0L;
                    }
/* 14 */            long size = buffer.size();
/* 20 */            if (j <= size) {
/* 24 */                if (j < 0) {
/* 88 */                    ds0.m3200q(pm2.m7488k("newSize < 0: ", j));
/* 6 */                     return 0L;
                        }
/* 26 */                long j2 = size - j;
/* 30 */                while (j2 > 0) {
/* 32 */                    Segment segment = buffer.head;
/* 34 */                    segment.getClass();
/* 37 */                    Segment segment2 = segment.prev;
/* 39 */                    segment2.getClass();
/* 42 */                    int i = segment2.limit;
/* 46 */                    long j3 = i - segment2.pos;
/* 51 */                    if (j3 > j2) {
/* 66 */                        segment2.limit = i - ((int) j2);
                                break;
                            }
/* 57 */                    buffer.head = segment2.pop();
/* 59 */                    SegmentPool.recycle(segment2);
/* 62 */                    j2 -= j3;
                        }
/* 69 */                unsafeCursor.setSegment$okio(null);
/* 72 */                unsafeCursor.offset = j;
/* 74 */                unsafeCursor.data = null;
/* 77 */                unsafeCursor.start = -1;
/* 79 */                unsafeCursor.end = -1;
                    } else if (j > size) {
/* 94 */                long j4 = j - size;
/* 97 */                boolean z = true;
/* 100 */               while (j4 > 0) {
/* 102 */                   Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
/* 115 */                   int iMin = (int) Math.min(j4, 8192 - segmentWritableSegment$okio.limit);
/* 119 */                   segmentWritableSegment$okio.limit += iMin;
/* 122 */                   j4 -= (long) iMin;
/* 123 */                   if (z) {
/* 125 */                       unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
/* 128 */                       unsafeCursor.offset = size;
/* 132 */                       unsafeCursor.data = segmentWritableSegment$okio.data;
/* 134 */                       int i2 = segmentWritableSegment$okio.limit;
/* 138 */                       unsafeCursor.start = i2 - iMin;
/* 140 */                       unsafeCursor.end = i2;
/* 142 */                       z = false;
                            }
                        }
                    }
/* 144 */           buffer.setSize$okio(j);
/* 147 */           return size;
                }

                public static final int commonSeek(okio.Buffer.UnsafeCursor unsafeCursor, long j) {
                    Segment segmentPush;
/* 1 */             unsafeCursor.getClass();
/* 4 */             okio.Buffer buffer = unsafeCursor.buffer;
/* 6 */             if (buffer == null) {
/* 240 */               f42.m3656l("not attached to a buffer");
/* 243 */               return 0;
                    }
/* 12 */            if (j < -1 || j > buffer.size()) {
/* 237 */               throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + buffer.size());
                    }
/* 22 */            if (j == -1 || j == buffer.size()) {
/* 193 */               unsafeCursor.setSegment$okio(null);
/* 196 */               unsafeCursor.offset = j;
/* 198 */               unsafeCursor.data = null;
/* 201 */               unsafeCursor.start = -1;
/* 203 */               unsafeCursor.end = -1;
/* 200 */               return -1;
                    }
/* 34 */            long size = buffer.size();
/* 38 */            Segment segment = buffer.head;
/* 44 */            long j2 = 0;
/* 46 */            if (unsafeCursor.getSegment() != null) {
/* 48 */                long j3 = unsafeCursor.offset;
/* 50 */                int i = unsafeCursor.start;
/* 52 */                Segment segment2 = unsafeCursor.getSegment();
/* 56 */                segment2.getClass();
/* 63 */                long j4 = j3 - ((long) (i - segment2.pos));
/* 66 */                if (j4 > j) {
/* 72 */                    segmentPush = segment;
/* 68 */                    segment = unsafeCursor.getSegment();
/* 74 */                    size = j4;
                        } else {
/* 76 */                    segmentPush = unsafeCursor.getSegment();
/* 80 */                    j2 = j4;
                        }
                    } else {
/* 82 */                segmentPush = segment;
                    }
/* 89 */            if (size - j > j - j2) {
                        while (true) {
/* 91 */                    segmentPush.getClass();
/* 94 */                    int i2 = segmentPush.limit;
/* 96 */                    int i3 = segmentPush.pos;
/* 104 */                   if (j < ((long) (i2 - i3)) + j2) {
                                break;
                            }
/* 108 */                   j2 += (long) (i2 - i3);
/* 109 */                   segmentPush = segmentPush.next;
                        }
                    } else {
/* 114 */               while (size > j) {
/* 116 */                   segment.getClass();
/* 119 */                   segment = segment.prev;
/* 121 */                   segment.getClass();
/* 130 */                   size -= (long) (segment.limit - segment.pos);
                        }
/* 132 */               j2 = size;
/* 133 */               segmentPush = segment;
                    }
/* 136 */           if (unsafeCursor.readWrite) {
/* 138 */               segmentPush.getClass();
/* 143 */               if (segmentPush.shared) {
/* 145 */                   Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
/* 151 */                   if (buffer.head == segmentPush) {
/* 153 */                       buffer.head = segmentUnsharedCopy;
                            }
/* 155 */                   segmentPush = segmentPush.push(segmentUnsharedCopy);
/* 159 */                   Segment segment3 = segmentPush.prev;
/* 161 */                   segment3.getClass();
/* 164 */                   segment3.pop();
                        }
                    }
/* 167 */           unsafeCursor.setSegment$okio(segmentPush);
/* 170 */           unsafeCursor.offset = j;
/* 172 */           segmentPush.getClass();
/* 177 */           unsafeCursor.data = segmentPush.data;
/* 183 */           int i4 = segmentPush.pos + ((int) (j - j2));
/* 184 */           unsafeCursor.start = i4;
/* 186 */           int i5 = segmentPush.limit;
/* 188 */           unsafeCursor.end = i5;
/* 190 */           return i5 - i4;
                }

                public static final int commonSelect(okio.Buffer buffer, Options options) throws EOFException {
/* 1 */             buffer.getClass();
/* 4 */             options.getClass();
/* 10 */            int iSelectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
/* 15 */            if (iSelectPrefix$default == -1) {
/* 14 */                return -1;
                    }
/* 29 */            buffer.skip(options.getByteStrings()[iSelectPrefix$default].size());
/* 32 */            return iSelectPrefix$default;
                }

                public static final void commonSkip(okio.Buffer buffer, long j) throws EOFException {
/* 1 */             buffer.getClass();
/* 8 */             while (j > 0) {
/* 10 */                Segment segment = buffer.head;
/* 12 */                if (segment == null) {
/* 54 */                    C1951n4.m6854b();
/* 57 */                    return;
                        }
/* 24 */                int iMin = (int) Math.min(j, segment.limit - segment.pos);
                        long j2 = iMin;
/* 31 */                buffer.setSize$okio(buffer.size() - j2);
/* 34 */                j -= j2;
/* 37 */                int i = segment.pos + iMin;
/* 38 */                segment.pos = i;
/* 42 */                if (i == segment.limit) {
/* 48 */                    buffer.head = segment.pop();
/* 50 */                    SegmentPool.recycle(segment);
                        }
                    }
                }

                public static final ByteString commonSnapshot(okio.Buffer buffer, int i) {
/* 1 */             buffer.getClass();
/* 4 */             if (i == 0) {
/* 6 */                 return ByteString.EMPTY;
                    }
/* 16 */            SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i);
/* 19 */            Segment segment = buffer.head;
/* 21 */            int i2 = 0;
/* 22 */            int i3 = 0;
/* 23 */            int i4 = 0;
/* 24 */            while (i3 < i) {
/* 26 */                segment.getClass();
/* 29 */                int i5 = segment.limit;
/* 31 */                int i6 = segment.pos;
/* 33 */                if (i5 == i6) {
/* 44 */                    C1951n4.m6856g("s.limit == s.pos");
/* 47 */                    return null;
                        }
/* 36 */                i3 += i5 - i6;
/* 37 */                i4++;
/* 39 */                segment = segment.next;
                    }
/* 49 */            byte[][] bArr = new byte[i4][];
/* 53 */            int[] iArr = new int[i4 * 2];
/* 55 */            Segment segment2 = buffer.head;
/* 57 */            int i7 = 0;
/* 58 */            while (i2 < i) {
/* 60 */                segment2.getClass();
/* 65 */                bArr[i7] = segment2.data;
/* 72 */                i2 += segment2.limit - segment2.pos;
/* 77 */                iArr[i7] = Math.min(i2, i);
/* 83 */                iArr[i7 + i4] = segment2.pos;
/* 86 */                segment2.shared = true;
/* 88 */                i7++;
/* 89 */                segment2 = segment2.next;
                    }
/* 94 */            return new C2570SegmentedByteString(bArr, iArr);
                }

                public static final Segment commonWritableSegment(okio.Buffer buffer, int i) {
/* 1 */             buffer.getClass();
/* 5 */             if (i < 1 || i > 8192) {
/* 56 */                C1951n4.m6859j("unexpected capacity");
/* 59 */                return null;
                    }
/* 11 */            Segment segment = buffer.head;
/* 13 */            if (segment != null) {
/* 26 */                segment.getClass();
/* 29 */                Segment segment2 = segment.prev;
/* 31 */                segment2.getClass();
                        return (segment2.limit + i > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
                    }
/* 15 */            Segment segmentTake = SegmentPool.take();
/* 19 */            buffer.head = segmentTake;
/* 21 */            segmentTake.prev = segmentTake;
/* 23 */            segmentTake.next = segmentTake;
/* 25 */            return segmentTake;
                }

                public static final void commonWrite(okio.Buffer buffer, okio.Buffer buffer2, long j) {
                    Segment segment;
/* 1 */             buffer.getClass();
/* 4 */             buffer2.getClass();
/* 7 */             if (buffer2 == buffer) {
/* 185 */               C1951n4.m6859j("source == this");
/* 188 */               return;
                    }
/* 16 */            SegmentedByteString.checkOffsetAndCount(buffer2.size(), 0L, j);
/* 23 */            while (j > 0) {
/* 25 */                Segment segment2 = buffer2.head;
/* 27 */                segment2.getClass();
/* 30 */                int i = segment2.limit;
/* 32 */                Segment segment3 = buffer2.head;
/* 34 */                segment3.getClass();
/* 43 */                if (j < i - segment3.pos) {
/* 45 */                    Segment segment4 = buffer.head;
/* 47 */                    if (segment4 != null) {
/* 49 */                        segment4.getClass();
/* 52 */                        segment = segment4.prev;
                            } else {
/* 55 */                        segment = null;
                            }
/* 56 */                    if (segment != null && segment.owner) {
/* 80 */                        if ((((long) segment.limit) + j) - ((long) (segment.shared ? 0 : segment.pos)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
/* 82 */                            Segment segment5 = buffer2.head;
/* 84 */                            segment5.getClass();
/* 88 */                            segment5.writeTo(segment, (int) j);
/* 96 */                            buffer2.setSize$okio(buffer2.size() - j);
/* 104 */                           buffer.setSize$okio(buffer.size() + j);
/* 107 */                           return;
                                }
                            }
/* 108 */                   Segment segment6 = buffer2.head;
/* 110 */                   segment6.getClass();
/* 118 */                   buffer2.head = segment6.split((int) j);
                        }
/* 120 */               Segment segment7 = buffer2.head;
/* 122 */               segment7.getClass();
/* 129 */               long j2 = segment7.limit - segment7.pos;
/* 135 */               buffer2.head = segment7.pop();
/* 137 */               Segment segment8 = buffer.head;
/* 139 */               if (segment8 == null) {
/* 141 */                   buffer.head = segment7;
/* 143 */                   segment7.prev = segment7;
/* 145 */                   segment7.next = segment7;
                        } else {
/* 148 */                   segment8.getClass();
/* 151 */                   Segment segment9 = segment8.prev;
/* 153 */                   segment9.getClass();
/* 160 */                   segment9.push(segment7).compact();
                        }
/* 168 */               buffer2.setSize$okio(buffer2.size() - j2);
/* 176 */               buffer.setSize$okio(buffer.size() + j2);
/* 179 */               j -= j2;
                    }
                }

                public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer buffer, ByteString byteString, int i, int i2, int i3, Object obj) {
/* 3 */             if ((i3 & 2) != 0) {
/* 5 */                 i = 0;
                    }
/* 8 */             if ((i3 & 4) != 0) {
/* 10 */                i2 = byteString.size();
                    }
/* 14 */            buffer.getClass();
/* 17 */            byteString.getClass();
/* 20 */            byteString.write$okio(buffer, i, i2);
/* 23 */            return buffer;
                }

                public static final long commonWriteAll(okio.Buffer buffer, Source source) throws IOException {
/* 1 */             buffer.getClass();
/* 4 */             source.getClass();
/* 7 */             long j = 0;
                    while (true) {
/* 11 */                long j2 = source.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
/* 19 */                if (j2 == -1) {
/* 23 */                    return j;
                        }
/* 21 */                j += j2;
                    }
                }

                public static final okio.Buffer commonWriteByte(okio.Buffer buffer, int i) {
/* 1 */             buffer.getClass();
/* 5 */             Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
/* 9 */             byte[] bArr = segmentWritableSegment$okio.data;
/* 11 */            int i2 = segmentWritableSegment$okio.limit;
/* 15 */            segmentWritableSegment$okio.limit = i2 + 1;
/* 18 */            bArr[i2] = (byte) i;
/* 27 */            buffer.setSize$okio(buffer.size() + 1);
/* 30 */            return buffer;
                }

                public static final okio.Buffer commonWriteDecimalLong(okio.Buffer buffer, long j) {
                    boolean z;
/* 1 */             buffer.getClass();
/* 8 */             if (j == 0) {
/* 12 */                return buffer.writeByte(48);
                    }
/* 17 */            int i = 1;
/* 18 */            if (j < 0) {
/* 20 */                j = -j;
/* 23 */                if (j < 0) {
/* 27 */                    return buffer.writeUtf8("-9223372036854775808");
                        }
/* 32 */                z = true;
                    } else {
/* 34 */                z = false;
                    }
/* 42 */            if (j < 100000000) {
/* 48 */                if (j < 10000) {
/* 54 */                    if (j >= 100) {
/* 74 */                        i = j < 1000 ? 3 : 4;
                            } else if (j >= 10) {
/* 62 */                        i = 2;
                            }
                        } else if (j < 1000000) {
/* 94 */                    i = j < 100000 ? 5 : 6;
                        } else {
/* 107 */                   i = j < 10000000 ? 7 : 8;
                        }
                    } else if (j < 1000000000000L) {
/* 127 */               if (j < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
/* 139 */                   i = j < 1000000000 ? 9 : 10;
                        } else {
/* 154 */                   i = j < 100000000000L ? 11 : 12;
                        }
                    } else if (j < 1000000000000000L) {
/* 173 */               if (j < 10000000000000L) {
/* 175 */                   i = 13;
                        } else {
/* 190 */                   i = j < 100000000000000L ? 14 : 15;
                        }
                    } else if (j < 100000000000000000L) {
/* 214 */               i = j < 10000000000000000L ? 16 : 17;
                    } else {
/* 229 */               i = j < 1000000000000000000L ? 18 : 19;
                    }
/* 231 */           if (z) {
/* 233 */               i++;
                    }
/* 235 */           Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
/* 239 */           byte[] bArr = segmentWritableSegment$okio.data;
/* 243 */           int i2 = segmentWritableSegment$okio.limit + i;
/* 246 */           while (j != 0) {
/* 251 */               i2--;
/* 259 */               bArr[i2] = getHEX_DIGIT_BYTES()[(int) (j % 10)];
/* 261 */               j /= 10;
                    }
/* 263 */           if (z) {
/* 269 */               bArr[i2 - 1] = 45;
                    }
/* 274 */           segmentWritableSegment$okio.limit += i;
/* 282 */           buffer.setSize$okio(buffer.size() + ((long) i));
/* 285 */           return buffer;
                }

                public static final okio.Buffer commonWriteHexadecimalUnsignedLong(okio.Buffer buffer, long j) {
/* 1 */             buffer.getClass();
/* 8 */             if (j == 0) {
/* 12 */                return buffer.writeByte(48);
                    }
/* 20 */            long j2 = (j >>> 1) | j;
/* 24 */            long j3 = j2 | (j2 >>> 2);
/* 28 */            long j4 = j3 | (j3 >>> 4);
/* 33 */            long j5 = j4 | (j4 >>> 8);
/* 38 */            long j6 = j5 | (j5 >>> 16);
/* 43 */            long j7 = j6 | (j6 >>> 32);
/* 52 */            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
/* 62 */            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
/* 71 */            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
/* 74 */            long j11 = j10 + (j10 >>> 8);
/* 77 */            long j12 = j11 + (j11 >>> 16);
/* 91 */            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
/* 92 */            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i);
/* 96 */            byte[] bArr = segmentWritableSegment$okio.data;
/* 98 */            int i2 = segmentWritableSegment$okio.limit;
/* 103 */           for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
/* 115 */               bArr[i3] = getHEX_DIGIT_BYTES()[(int) (15 & j)];
/* 117 */               j >>>= 4;
                    }
/* 124 */           segmentWritableSegment$okio.limit += i;
/* 132 */           buffer.setSize$okio(buffer.size() + ((long) i));
/* 135 */           return buffer;
                }

                public static final okio.Buffer commonWriteInt(okio.Buffer buffer, int i) {
/* 1 */             buffer.getClass();
/* 5 */             Segment segmentWritableSegment$okio = buffer.writableSegment$okio(4);
/* 9 */             byte[] bArr = segmentWritableSegment$okio.data;
/* 11 */            int i2 = segmentWritableSegment$okio.limit;
/* 20 */            bArr[i2] = (byte) ((i >>> 24) & 255);
/* 29 */            bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
/* 38 */            bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
/* 44 */            bArr[i2 + 3] = (byte) (i & 255);
/* 46 */            segmentWritableSegment$okio.limit = i2 + 4;
/* 55 */            buffer.setSize$okio(buffer.size() + 4);
/* 58 */            return buffer;
                }

                public static final okio.Buffer commonWriteLong(okio.Buffer buffer, long j) {
/* 1 */             buffer.getClass();
/* 6 */             Segment segmentWritableSegment$okio = buffer.writableSegment$okio(8);
/* 10 */            byte[] bArr = segmentWritableSegment$okio.data;
/* 12 */            int i = segmentWritableSegment$okio.limit;
/* 25 */            bArr[i] = (byte) ((j >>> 56) & 255);
/* 36 */            bArr[i + 1] = (byte) ((j >>> 48) & 255);
/* 47 */            bArr[i + 2] = (byte) ((j >>> 40) & 255);
/* 58 */            bArr[i + 3] = (byte) ((j >>> 32) & 255);
/* 69 */            bArr[i + 4] = (byte) ((j >>> 24) & 255);
/* 80 */            bArr[i + 5] = (byte) ((j >>> 16) & 255);
/* 89 */            bArr[i + 6] = (byte) ((j >>> 8) & 255);
/* 95 */            bArr[i + 7] = (byte) (j & 255);
/* 97 */            segmentWritableSegment$okio.limit = i + 8;
/* 106 */           buffer.setSize$okio(buffer.size() + 8);
/* 109 */           return buffer;
                }

                public static final okio.Buffer commonWriteShort(okio.Buffer buffer, int i) {
/* 1 */             buffer.getClass();
/* 5 */             Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
/* 9 */             byte[] bArr = segmentWritableSegment$okio.data;
/* 11 */            int i2 = segmentWritableSegment$okio.limit;
/* 20 */            bArr[i2] = (byte) ((i >>> 8) & 255);
/* 26 */            bArr[i2 + 1] = (byte) (i & 255);
/* 28 */            segmentWritableSegment$okio.limit = i2 + 2;
/* 37 */            buffer.setSize$okio(buffer.size() + 2);
/* 40 */            return buffer;
                }

                public static final okio.Buffer commonWriteUtf8(okio.Buffer buffer, String str, int i, int i2) {
                    char cCharAt;
/* 1 */             buffer.getClass();
/* 4 */             str.getClass();
/* 8 */             if (i < 0) {
/* 322 */               ds0.m3200q(fm0.m3781g(i, "beginIndex < 0: "));
/* 7 */                 return null;
                    }
/* 10 */            if (i2 < i) {
/* 312 */               ds0.m3200q(AbstractC0886en.m3506j("endIndex < beginIndex: ", i2, i, " < "));
/* 7 */                 return null;
                    }
/* 16 */            if (i2 > str.length()) {
/* 300 */               f42.m3652h(str.length(), fm0.m3793s(i2, "endIndex > string.length: ", " > "));
/* 7 */                 return null;
                    }
/* 18 */            while (i < i2) {
/* 20 */                char cCharAt2 = str.charAt(i);
/* 26 */                if (cCharAt2 < 128) {
/* 29 */                    Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
/* 33 */                    byte[] bArr = segmentWritableSegment$okio.data;
/* 37 */                    int i3 = segmentWritableSegment$okio.limit - i;
/* 40 */                    int iMin = Math.min(i2, 8192 - i3);
/* 44 */                    int i4 = i + 1;
/* 48 */                    bArr[i + i3] = (byte) cCharAt2;
                            while (true) {
/* 50 */                        i = i4;
/* 51 */                        if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                                    break;
                                }
/* 59 */                        i4 = i + 1;
/* 63 */                        bArr[i + i3] = (byte) cCharAt;
                            }
/* 67 */                    int i5 = segmentWritableSegment$okio.limit;
/* 69 */                    int i6 = (i3 + i) - i5;
/* 71 */                    segmentWritableSegment$okio.limit = i5 + i6;
/* 79 */                    buffer.setSize$okio(buffer.size() + ((long) i6));
                        } else {
/* 85 */                    if (cCharAt2 < 2048) {
/* 88 */                        Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(2);
/* 92 */                        byte[] bArr2 = segmentWritableSegment$okio2.data;
/* 94 */                        int i7 = segmentWritableSegment$okio2.limit;
/* 101 */                       bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
/* 109 */                       bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
/* 112 */                       segmentWritableSegment$okio2.limit = i7 + 2;
/* 121 */                       buffer.setSize$okio(buffer.size() + 2);
                            } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
/* 240 */                       Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(3);
/* 244 */                       byte[] bArr3 = segmentWritableSegment$okio3.data;
/* 246 */                       int i8 = segmentWritableSegment$okio3.limit;
/* 253 */                       bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
/* 262 */                       bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
/* 270 */                       bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
/* 273 */                       segmentWritableSegment$okio3.limit = i8 + 3;
/* 282 */                       buffer.setSize$okio(buffer.size() + 3);
                            } else {
/* 140 */                       int i9 = i + 1;
/* 149 */                       char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
/* 153 */                       if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
/* 233 */                           buffer.writeByte(63);
/* 236 */                           i = i9;
                                } else {
/* 174 */                           int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
/* 176 */                           Segment segmentWritableSegment$okio4 = buffer.writableSegment$okio(4);
/* 180 */                           byte[] bArr4 = segmentWritableSegment$okio4.data;
/* 182 */                           int i11 = segmentWritableSegment$okio4.limit;
/* 189 */                           bArr4[i11] = (byte) ((i10 >> 18) | 240);
/* 198 */                           bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
/* 207 */                           bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
/* 214 */                           bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
/* 217 */                           segmentWritableSegment$okio4.limit = i11 + 4;
/* 226 */                           buffer.setSize$okio(buffer.size() + 4);
/* 229 */                           i += 2;
                                }
                            }
/* 124 */                   i++;
                        }
                    }
/* 287 */           return buffer;
                }

                public static final okio.Buffer commonWriteUtf8CodePoint(okio.Buffer buffer, int i) {
/* 1 */             buffer.getClass();
/* 6 */             if (i < 128) {
/* 8 */                 buffer.writeByte(i);
/* 11 */                return buffer;
                    }
/* 16 */            if (i < 2048) {
/* 19 */                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
/* 23 */                byte[] bArr = segmentWritableSegment$okio.data;
/* 25 */                int i2 = segmentWritableSegment$okio.limit;
/* 32 */                bArr[i2] = (byte) ((i >> 6) | 192);
/* 39 */                bArr[i2 + 1] = (byte) ((i & 63) | 128);
/* 42 */                segmentWritableSegment$okio.limit = i2 + 2;
/* 51 */                buffer.setSize$okio(buffer.size() + 2);
/* 54 */                return buffer;
                    }
/* 58 */            if (55296 <= i && i < 57344) {
/* 65 */                buffer.writeByte(63);
/* 68 */                return buffer;
                    }
/* 71 */            if (i < 65536) {
/* 74 */                Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(3);
/* 78 */                byte[] bArr2 = segmentWritableSegment$okio2.data;
/* 80 */                int i3 = segmentWritableSegment$okio2.limit;
/* 87 */                bArr2[i3] = (byte) ((i >> 12) | 224);
/* 96 */                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
/* 103 */               bArr2[i3 + 2] = (byte) ((i & 63) | 128);
/* 106 */               segmentWritableSegment$okio2.limit = i3 + 3;
/* 115 */               buffer.setSize$okio(buffer.size() + 3);
/* 118 */               return buffer;
                    }
/* 122 */           if (i > 1114111) {
/* 185 */               C1951n4.m6865p(SegmentedByteString.toHexString(i), "Unexpected code point: 0x");
/* 188 */               return null;
                    }
/* 125 */           Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(4);
/* 129 */           byte[] bArr3 = segmentWritableSegment$okio3.data;
/* 131 */           int i4 = segmentWritableSegment$okio3.limit;
/* 138 */           bArr3[i4] = (byte) ((i >> 18) | 240);
/* 147 */           bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
/* 156 */           bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
/* 163 */           bArr3[i4 + 3] = (byte) ((i & 63) | 128);
/* 166 */           segmentWritableSegment$okio3.limit = i4 + 4;
/* 175 */           buffer.setSize$okio(buffer.size() + 4);
/* 178 */           return buffer;
                }

                public static final byte[] getHEX_DIGIT_BYTES() {
/* 1 */             return HEX_DIGIT_BYTES;
                }

                public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
                }

                public static final boolean rangeEquals(Segment segment, int i, byte[] bArr, int i2, int i3) {
/* 1 */             segment.getClass();
/* 4 */             bArr.getClass();
/* 7 */             int i4 = segment.limit;
/* 9 */             byte[] bArr2 = segment.data;
/* 11 */            while (i2 < i3) {
/* 13 */                if (i == i4) {
/* 15 */                    segment = segment.next;
/* 17 */                    segment.getClass();
/* 20 */                    byte[] bArr3 = segment.data;
/* 27 */                    bArr2 = bArr3;
/* 22 */                    i = segment.pos;
/* 24 */                    i4 = segment.limit;
                        }
/* 34 */                if (bArr2[i] != bArr[i2]) {
/* 36 */                    return false;
                        }
/* 38 */                i++;
/* 40 */                i2++;
                    }
/* 43 */            return true;
                }

                public static final String readUtf8Line(okio.Buffer buffer, long j) throws EOFException {
/* 1 */             buffer.getClass();
/* 10 */            if (j > 0) {
/* 12 */                long j2 = j - 1;
/* 20 */                if (buffer.getByte(j2) == 13) {
/* 22 */                    String utf8 = buffer.readUtf8(j2);
/* 28 */                    buffer.skip(2L);
/* 31 */                    return utf8;
                        }
                    }
/* 32 */            String utf9 = buffer.readUtf8(j);
/* 36 */            buffer.skip(1L);
/* 39 */            return utf9;
                }

                public static final <T> T seek(okio.Buffer buffer, long j, Function2<? super Segment, ? super Long, ? extends T> function2) {
/* 1 */             buffer.getClass();
/* 4 */             function2.getClass();
/* 7 */             Segment segment = buffer.head;
/* 9 */             if (segment == null) {
/* 18 */                return (T) function2.invoke(null, -1L);
                    }
/* 30 */            if (buffer.size() - j < j) {
/* 32 */                long size = buffer.size();
/* 38 */                while (size > j) {
/* 40 */                    segment = segment.prev;
/* 42 */                    segment.getClass();
/* 51 */                    size -= (long) (segment.limit - segment.pos);
                        }
/* 57 */                return (T) function2.invoke(segment, Long.valueOf(size));
                    }
/* 62 */            long j2 = 0;
                    while (true) {
/* 70 */                long j3 = ((long) (segment.limit - segment.pos)) + j2;
/* 73 */                if (j3 > j) {
/* 86 */                    return (T) function2.invoke(segment, Long.valueOf(j2));
                        }
/* 75 */                segment = segment.next;
/* 77 */                segment.getClass();
/* 80 */                j2 = j3;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:46:0x009f A[LOOP:0: B:8:0x0020->B:46:0x009f, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:52:0x009e A[SYNTHETIC] */
                public static final int selectPrefix(okio.Buffer buffer, Options options, boolean z) {
                    int i;
                    int i2;
                    Segment segment;
                    int i3;
                    int i4;
/* 1 */             buffer.getClass();
/* 4 */             options.getClass();
/* 9 */             Segment segment2 = buffer.head;
/* 13 */            if (segment2 == null) {
                        return z ? -2 : -1;
                    }
/* 19 */            byte[] bArr = segment2.data;
/* 21 */            int i5 = segment2.pos;
/* 23 */            int i6 = segment2.limit;
/* 25 */            int[] trie$okio = options.getTrie();
/* 30 */            Segment segment3 = segment2;
/* 31 */            int i7 = -1;
/* 32 */            int i8 = 0;
                    loop0: while (true) {
/* 33 */                int i9 = i8 + 1;
/* 35 */                int i10 = trie$okio[i8];
/* 37 */                int i11 = i8 + 2;
/* 39 */                int i12 = trie$okio[i9];
/* 41 */                if (i12 != -1) {
/* 43 */                    i7 = i12;
                        }
/* 44 */                if (segment3 == null) {
                            break;
                        }
/* 48 */                if (i10 >= 0) {
/* 120 */                   i = i5 + 1;
/* 124 */                   int i13 = bArr[i5] & 255;
/* 126 */                   int i14 = i11 + i10;
/* 128 */                   while (i11 != i14) {
/* 133 */                       if (i13 == trie$okio[i11]) {
/* 136 */                           i2 = trie$okio[i11 + i10];
/* 138 */                           if (i == i6) {
/* 140 */                               segment3 = segment3.next;
/* 142 */                               segment3.getClass();
/* 145 */                               i = segment3.pos;
/* 147 */                               bArr = segment3.data;
/* 149 */                               i6 = segment3.limit;
/* 154 */                               if (segment3 == segment2) {
/* 156 */                                   segment3 = null;
                                        }
                                    }
/* 157 */                           if (i2 >= 0) {
/* 159 */                               return i2;
                                    }
/* 160 */                           i8 = -i2;
/* 161 */                           i5 = i;
                                } else {
/* 164 */                           i11++;
                                }
                            }
/* 130 */                   return i7;
                        }
/* 52 */                int i15 = (i10 * (-1)) + i11;
                        while (true) {
/* 54 */                    int i16 = i5 + 1;
/* 60 */                    int i17 = i11 + 1;
/* 64 */                    if ((bArr[i5] & 255) == trie$okio[i11]) {
/* 71 */                        boolean z2 = i17 == i15;
/* 72 */                        if (i16 == i6) {
/* 74 */                            segment3.getClass();
/* 77 */                            Segment segment4 = segment3.next;
/* 79 */                            segment4.getClass();
/* 82 */                            i4 = segment4.pos;
/* 84 */                            byte[] bArr2 = segment4.data;
/* 86 */                            i3 = segment4.limit;
/* 88 */                            if (segment4 != segment2) {
/* 100 */                               segment = segment4;
/* 101 */                               bArr = bArr2;
                                    } else {
/* 90 */                                if (!z2) {
                                            break loop0;
                                        }
/* 92 */                                bArr = bArr2;
/* 93 */                                segment = null;
                                    }
                                } else {
/* 104 */                           segment = segment3;
/* 105 */                           i3 = i6;
/* 106 */                           i4 = i16;
                                }
/* 107 */                       if (z2) {
/* 109 */                           i2 = trie$okio[i17];
/* 111 */                           i = i4;
/* 112 */                           i6 = i3;
/* 113 */                           segment3 = segment;
                                    break;
                                }
/* 115 */                       i5 = i4;
/* 116 */                       i6 = i3;
/* 117 */                       segment3 = segment;
/* 118 */                       i11 = i17;
                            }
/* 130 */                   return i7;
                        }
/* 157 */               if (i2 >= 0) {
/* 159 */                   return i2;
                        }
/* 160 */               i8 = -i2;
/* 161 */               i5 = i;
                    }
/* 95 */            if (z) {
/* 11 */                return -2;
                    }
/* 130 */           return i7;
                }

                public static /* synthetic */ int selectPrefix$default(okio.Buffer buffer, Options options, boolean z, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 z = false;
                    }
/* 6 */             return selectPrefix(buffer, options, z);
                }

/* 29 */        public static final void commonReadFully(okio.Buffer buffer, byte[] bArr) throws EOFException {
                    buffer.getClass();
                    bArr.getClass();
                    int i = 0;
/* 30 */            while (i < bArr.length) {
/* 31 */                int i2 = buffer.read(bArr, i, bArr.length - i);
                        if (i2 == -1) {
/* 32 */                    C1951n4.m6854b();
                            return;
                        }
                        i += i2;
                    }
                }

/* 46 */        public static final byte[] commonReadByteArray(okio.Buffer buffer) {
                    buffer.getClass();
/* 47 */            return buffer.readByteArray(buffer.size());
                }

/* 64 */        public static final ByteString commonReadByteString(okio.Buffer buffer) {
                    buffer.getClass();
/* 65 */            return buffer.readByteString(buffer.size());
                }

/* 67 */        public static final int commonRead(okio.Buffer buffer, byte[] bArr) {
                    buffer.getClass();
                    bArr.getClass();
/* 68 */            return buffer.read(bArr, 0, bArr.length);
                }

/* 68 */        public static final long commonRead(okio.Buffer buffer, okio.Buffer buffer2, long j) {
                    buffer.getClass();
                    buffer2.getClass();
                    if (j < 0) {
/* 74 */                ds0.m3200q(pm2.m7488k("byteCount < 0: ", j));
                        return 0L;
                    }
                    if (buffer.size() == 0) {
                        return -1L;
                    }
                    if (j > buffer.size()) {
                        j = buffer.size();
                    }
/* 71 */            buffer2.write(buffer, j);
                    return j;
                }

/* 97 */        public static final ByteString commonSnapshot(okio.Buffer buffer) {
                    buffer.getClass();
                    if (buffer.size() <= 2147483647L) {
/* 99 */                return buffer.snapshot((int) buffer.size());
                    }
                    throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
                }

/* 188 */       public static final okio.Buffer commonWrite(okio.Buffer buffer, byte[] bArr) {
                    buffer.getClass();
                    bArr.getClass();
/* 189 */           return buffer.write(bArr, 0, bArr.length);
                }

/* 189 */       public static final okio.Buffer commonWrite(okio.Buffer buffer, byte[] bArr, int i, int i2) {
                    buffer.getClass();
                    bArr.getClass();
                    long j = i2;
/* 190 */           SegmentedByteString.checkOffsetAndCount(bArr.length, i, j);
                    int i3 = i2 + i;
                    while (i < i3) {
/* 191 */               Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
/* 192 */               int iMin = Math.min(i3 - i, 8192 - segmentWritableSegment$okio.limit);
                        int i4 = i + iMin;
/* 195 */               C1960nd.m6964b(bArr, segmentWritableSegment$okio.limit, segmentWritableSegment$okio.data, i, i4);
/* 196 */               segmentWritableSegment$okio.limit += iMin;
                        i = i4;
                    }
/* 197 */           buffer.setSize$okio(buffer.size() + j);
                    return buffer;
                }

/* 197 */       public static final okio.Buffer commonWrite(okio.Buffer buffer, Source source, long j) throws IOException {
                    buffer.getClass();
                    source.getClass();
                    while (j > 0) {
/* 198 */               long j2 = source.read(buffer, j);
                        if (j2 == -1) {
/* 199 */                   C1951n4.m6854b();
                            return null;
                        }
                        j -= j2;
                    }
                    return buffer;
                }

/* 199 */       public static final okio.Buffer commonWrite(okio.Buffer buffer, ByteString byteString, int i, int i2) {
                    buffer.getClass();
                    byteString.getClass();
/* 200 */           byteString.write$okio(buffer, i, i2);
                    return buffer;
                }

/* 267 */       public static final long commonIndexOf(okio.Buffer buffer, byte b, long j, long j2) {
                    Segment segment;
                    int i;
                    buffer.getClass();
                    long size = 0;
                    if (0 > j || j > j2) {
                        throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j + " toIndex=" + j2).toString());
                    }
                    if (j2 > buffer.size()) {
                        j2 = buffer.size();
                    }
                    if (j == j2 || (segment = buffer.head) == null) {
                        return -1L;
                    }
                    if (buffer.size() - j < j) {
/* 271 */               size = buffer.size();
                        while (size > j) {
/* 272 */                   segment = segment.prev;
                            segment.getClass();
/* 273 */                   size -= (long) (segment.limit - segment.pos);
                        }
                        while (size < j2) {
/* 274 */                   byte[] bArr = segment.data;
/* 275 */                   int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + j2) - size);
/* 276 */                   i = (int) ((((long) segment.pos) + j) - size);
                            while (i < iMin) {
/* 277 */                       if (bArr[i] != b) {
                                    i++;
                                }
                            }
/* 279 */                   size += (long) (segment.limit - segment.pos);
/* 280 */                   segment = segment.next;
                            segment.getClass();
                            j = size;
                        }
                        return -1L;
                    }
                    while (true) {
/* 281 */               long j3 = ((long) (segment.limit - segment.pos)) + size;
                        if (j3 > j) {
                            break;
                        }
/* 282 */               segment = segment.next;
                        segment.getClass();
                        size = j3;
                    }
                    while (size < j2) {
/* 283 */               byte[] bArr2 = segment.data;
/* 284 */               int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + j2) - size);
/* 285 */               i = (int) ((((long) segment.pos) + j) - size);
                        while (i < iMin2) {
/* 286 */                   if (bArr2[i] != b) {
                                i++;
                            }
                        }
/* 287 */               size += (long) (segment.limit - segment.pos);
/* 288 */               segment = segment.next;
                        segment.getClass();
                        j = size;
                    }
                    return -1L;
/* 278 */           return ((long) (i - segment.pos)) + size;
                }
            }
