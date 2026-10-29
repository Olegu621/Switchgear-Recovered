            package okio;

            import android.support.v4.media.session.PlaybackStateCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.flutter.embedding.android.KeyboardMap;
            import io.flutter.plugin.editing.SpellCheckPlugin;
            import java.io.Closeable;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.nio.ByteBuffer;
            import java.nio.channels.ByteChannel;
            import java.nio.charset.Charset;
            import java.security.InvalidKeyException;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import javax.crypto.Mac;
            import javax.crypto.spec.SecretKeySpec;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.Charsets;
            import okhttp3.HttpUrl;
            import okhttp3.internal.connection.RealConnection;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.C1960nd;
            import p000.ds0;
            import p000.f42;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0090\u0001B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0000H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\u0000J$\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\fJ \u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0000H\u0016J\b\u0010!\u001a\u00020\u0000H\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020\u0012H\u0016J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\fH\u0087\u0002¢\u0006\u0002\b+J\u0015\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\fH\u0007¢\u0006\u0002\b-J\b\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001dH\u0002J\u000e\u00102\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u000e\u00103\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u000e\u00104\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u0010\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)H\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\fH\u0016J \u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001dH\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fH\u0016J\u0010\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001dH\u0016J\u0018\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fH\u0016J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020#H\u0016J\u0006\u0010?\u001a\u00020\u001dJ\b\u0010@\u001a\u00020\u0019H\u0016J\b\u0010A\u001a\u00020\u0001H\u0016J\u0018\u0010B\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001dH\u0016J(\u0010B\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020GH\u0016J \u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010H\u001a\u00020\f2\u0006\u0010E\u001a\u00020IH\u0016J\u0012\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020KH\u0007J\b\u0010M\u001a\u00020)H\u0016J\b\u0010N\u001a\u00020GH\u0016J\u0010\u0010N\u001a\u00020G2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010O\u001a\u00020\u001dH\u0016J\u0010\u0010O\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010P\u001a\u00020\fH\u0016J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020=J\u0016\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\fJ \u0010Q\u001a\u00020\u00122\u0006\u0010R\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010S\u001a\u00020#H\u0002J\u0010\u0010T\u001a\u00020\u00122\u0006\u0010E\u001a\u00020GH\u0016J\u0018\u0010T\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010U\u001a\u00020\fH\u0016J\b\u0010V\u001a\u00020/H\u0016J\b\u0010W\u001a\u00020/H\u0016J\b\u0010X\u001a\u00020\fH\u0016J\b\u0010Y\u001a\u00020\fH\u0016J\b\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020[H\u0016J\u0010\u0010]\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0016J\u0018\u0010]\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010^\u001a\u00020_H\u0016J\u0012\u0010`\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020KH\u0007J\b\u0010a\u001a\u00020\u001fH\u0016J\u0010\u0010a\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010b\u001a\u00020/H\u0016J\n\u0010c\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010d\u001a\u00020\u001fH\u0016J\u0010\u0010d\u001a\u00020\u001f2\u0006\u0010e\u001a\u00020\fH\u0016J\u0010\u0010f\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010g\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010h\u001a\u00020/2\u0006\u0010i\u001a\u00020jH\u0016J\u0006\u0010k\u001a\u00020\u001dJ\u0006\u0010l\u001a\u00020\u001dJ\u0006\u0010m\u001a\u00020\u001dJ\r\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\bnJ\u0010\u0010o\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0006\u0010p\u001a\u00020\u001dJ\u000e\u0010p\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020/J\b\u0010q\u001a\u00020rH\u0016J\b\u0010s\u001a\u00020\u001fH\u0016J\u0015\u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020/H\u0000¢\u0006\u0002\bvJ\u0010\u0010w\u001a\u00020/2\u0006\u0010x\u001a\u00020FH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020GH\u0016J \u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010w\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001dH\u0016J \u0010w\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020z2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010{\u001a\u00020\f2\u0006\u0010x\u001a\u00020zH\u0016J\u0010\u0010|\u001a\u00020\u00002\u0006\u00106\u001a\u00020/H\u0016J\u0010\u0010}\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0010\u0010\u007f\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020/H\u0016J\u0011\u0010\u0083\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0011\u0010\u0084\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0012\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u001a\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0016J,\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/2\u0006\u0010^\u001a\u00020_H\u0016J\u001b\u0010\u008c\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007J\u0012\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001fH\u0016J$\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/H\u0016J\u0012\u0010\u008e\u0001\u001a\u00020\u00002\u0007\u0010\u008f\u0001\u001a\u00020/H\u0016R\u0014\u0010\u0006\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0091\u0001"}, m6176d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/nio/channels/ByteChannel;", "()V", "buffer", "getBuffer", "()Lokio/Buffer;", "head", "Lokio/Segment;", "<set-?>", HttpUrl.FRAGMENT_ENCODE_SET, "size", "()J", "setSize$okio", "(J)V", "clear", HttpUrl.FRAGMENT_ENCODE_SET, "clone", "close", "completeSegmentByteCount", "copy", "copyTo", "out", "Ljava/io/OutputStream;", "offset", "byteCount", "digest", "Lokio/ByteString;", "algorithm", HttpUrl.FRAGMENT_ENCODE_SET, "emit", "emitCompleteSegments", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "exhausted", "flush", "get", HttpUrl.FRAGMENT_ENCODE_SET, "pos", "getByte", FirebaseAnalytics.Param.INDEX, "-deprecated_getByte", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "hmac", "key", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "b", "fromIndex", "toIndex", "bytes", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "md5", "outputStream", "peek", "rangeEquals", "bytesOffset", "read", "sink", "Ljava/nio/ByteBuffer;", HttpUrl.FRAGMENT_ENCODE_SET, "readAll", "Lokio/Sink;", "readAndWriteUnsafe", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFrom", "input", "forever", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", HttpUrl.FRAGMENT_ENCODE_SET, "readShortLe", "readString", "charset", "Ljava/nio/charset/Charset;", "readUnsafe", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "sha1", "sha256", "sha512", "-deprecated_size", "skip", "snapshot", "timeout", "Lokio/Timeout;", "toString", "writableSegment", "minimumCapacity", "writableSegment$okio", "write", FirebaseAnalytics.Param.SOURCE, "byteString", "Lokio/Source;", "writeAll", "writeByte", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", "i", "writeIntLe", "writeLong", "writeLongLe", "writeShort", "s", "writeShortLe", "writeString", "string", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "writeTo", "writeUtf8", "writeUtf8CodePoint", "codePoint", "UnsafeCursor", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 4 */     public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
                public Segment head;
                private long size;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m6176d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "()V", "buffer", "Lokio/Buffer;", SharedDataContentProvider.BASE_PATH, HttpUrl.FRAGMENT_ENCODE_SET, "end", HttpUrl.FRAGMENT_ENCODE_SET, "offset", HttpUrl.FRAGMENT_ENCODE_SET, "readWrite", HttpUrl.FRAGMENT_ENCODE_SET, "segment", "Lokio/Segment;", "getSegment$okio", "()Lokio/Segment;", "setSegment$okio", "(Lokio/Segment;)V", "start", "close", HttpUrl.FRAGMENT_ENCODE_SET, "expandBuffer", "minByteCount", "next", "resizeBuffer", "newSize", "seek", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class UnsafeCursor implements Closeable {
                    public Buffer buffer;
                    public byte[] data;
                    public boolean readWrite;
                    private Segment segment;
                    public long offset = -1;
                    public int start = -1;
                    public int end = -1;

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
/* 3 */                 if (this.buffer == null) {
/* 25 */                    f42.m3656l("not attached to a buffer");
/* 28 */                    return;
                        }
/* 6 */                 this.buffer = null;
/* 8 */                 setSegment$okio(null);
/* 13 */                this.offset = -1L;
/* 15 */                this.data = null;
/* 18 */                this.start = -1;
/* 20 */                this.end = -1;
                    }

                    public final long expandBuffer(int minByteCount) {
/* 3 */                 if (minByteCount <= 0) {
/* 81 */                    ds0.m3200q(fm0.m3781g(minByteCount, "minByteCount <= 0: "));
/* 1 */                     return 0L;
                        }
/* 7 */                 if (minByteCount > 8192) {
/* 71 */                    ds0.m3200q(fm0.m3781g(minByteCount, "minByteCount > Segment.SIZE: "));
/* 1 */                     return 0L;
                        }
/* 9 */                 Buffer buffer = this.buffer;
/* 11 */                if (buffer == null) {
/* 61 */                    f42.m3656l("not attached to a buffer");
/* 1 */                     return 0L;
                        }
/* 15 */                if (!this.readWrite) {
/* 55 */                    f42.m3656l("expandBuffer() only permitted for read/write buffers");
/* 1 */                     return 0L;
                        }
/* 17 */                long size = buffer.size();
/* 21 */                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(minByteCount);
/* 27 */                int i = 8192 - segmentWritableSegment$okio.limit;
/* 29 */                segmentWritableSegment$okio.limit = Segment.SIZE;
                        long j = i;
/* 34 */                buffer.setSize$okio(size + j);
/* 37 */                setSegment$okio(segmentWritableSegment$okio);
/* 40 */                this.offset = size;
/* 44 */                this.data = segmentWritableSegment$okio.data;
/* 48 */                this.start = 8192 - i;
/* 50 */                this.end = Segment.SIZE;
/* 52 */                return j;
                    }

                    /* JADX INFO: renamed from: getSegment$okio, reason: from getter */
                    public final Segment getSegment() {
/* 1 */                 return this.segment;
                    }

                    public final int next() {
/* 1 */                 long j = this.offset;
/* 3 */                 Buffer buffer = this.buffer;
/* 5 */                 buffer.getClass();
/* 14 */                if (j != buffer.size()) {
/* 16 */                    long j2 = this.offset;
                            return j2 == -1 ? seek(0L) : seek(j2 + ((long) (this.end - this.start)));
                        }
/* 45 */                f42.m3656l("no more bytes");
/* 48 */                return 0;
                    }

                    public final long resizeBuffer(long newSize) {
/* 1 */                 Buffer buffer = this.buffer;
/* 5 */                 if (buffer == null) {
/* 153 */                   f42.m3656l("not attached to a buffer");
/* 3 */                     return 0L;
                        }
/* 9 */                 if (!this.readWrite) {
/* 147 */                   f42.m3656l("resizeBuffer() only permitted for read/write buffers");
/* 3 */                     return 0L;
                        }
/* 11 */                long size = buffer.size();
/* 17 */                if (newSize <= size) {
/* 21 */                    if (newSize < 0) {
/* 85 */                        ds0.m3200q(pm2.m7488k("newSize < 0: ", newSize));
/* 3 */                         return 0L;
                            }
/* 23 */                    long j = size - newSize;
/* 27 */                    while (j > 0) {
/* 29 */                        Segment segment = buffer.head;
/* 31 */                        segment.getClass();
/* 34 */                        Segment segment2 = segment.prev;
/* 36 */                        segment2.getClass();
/* 39 */                        int i = segment2.limit;
/* 43 */                        long j2 = i - segment2.pos;
/* 48 */                        if (j2 > j) {
/* 63 */                            segment2.limit = i - ((int) j);
                                    break;
                                }
/* 54 */                        buffer.head = segment2.pop();
/* 56 */                        SegmentPool.recycle(segment2);
/* 59 */                        j -= j2;
                            }
/* 66 */                    setSegment$okio(null);
/* 69 */                    this.offset = newSize;
/* 71 */                    this.data = null;
/* 74 */                    this.start = -1;
/* 76 */                    this.end = -1;
                        } else if (newSize > size) {
/* 91 */                    long j3 = newSize - size;
/* 94 */                    boolean z = true;
/* 97 */                    while (j3 > 0) {
/* 99 */                        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
/* 112 */                       int iMin = (int) Math.min(j3, 8192 - segmentWritableSegment$okio.limit);
/* 116 */                       segmentWritableSegment$okio.limit += iMin;
/* 119 */                       j3 -= (long) iMin;
/* 120 */                       if (z) {
/* 122 */                           setSegment$okio(segmentWritableSegment$okio);
/* 125 */                           this.offset = size;
/* 129 */                           this.data = segmentWritableSegment$okio.data;
/* 131 */                           int i2 = segmentWritableSegment$okio.limit;
/* 135 */                           this.start = i2 - iMin;
/* 137 */                           this.end = i2;
/* 139 */                           z = false;
                                }
                            }
                        }
/* 141 */               buffer.setSize$okio(newSize);
/* 144 */               return size;
                    }

                    public final int seek(long offset) {
                        Segment segmentPush;
/* 1 */                 Buffer buffer = this.buffer;
/* 3 */                 if (buffer == null) {
/* 237 */                   f42.m3656l("not attached to a buffer");
/* 240 */                   return 0;
                        }
/* 9 */                 if (offset < -1 || offset > buffer.size()) {
/* 234 */                   throw new ArrayIndexOutOfBoundsException("offset=" + offset + " > size=" + buffer.size());
                        }
/* 19 */                if (offset == -1 || offset == buffer.size()) {
/* 190 */                   setSegment$okio(null);
/* 193 */                   this.offset = offset;
/* 195 */                   this.data = null;
/* 198 */                   this.start = -1;
/* 200 */                   this.end = -1;
/* 197 */                   return -1;
                        }
/* 31 */                long size = buffer.size();
/* 35 */                Segment segment = buffer.head;
/* 41 */                long j = 0;
/* 43 */                if (getSegment() != null) {
/* 45 */                    long j2 = this.offset;
/* 47 */                    int i = this.start;
/* 49 */                    Segment segment2 = getSegment();
/* 53 */                    segment2.getClass();
/* 60 */                    long j3 = j2 - ((long) (i - segment2.pos));
/* 63 */                    if (j3 > offset) {
/* 69 */                        segmentPush = segment;
/* 65 */                        segment = getSegment();
/* 71 */                        size = j3;
                            } else {
/* 73 */                        segmentPush = getSegment();
/* 77 */                        j = j3;
                            }
                        } else {
/* 79 */                    segmentPush = segment;
                        }
/* 86 */                if (size - offset > offset - j) {
                            while (true) {
/* 88 */                        segmentPush.getClass();
/* 91 */                        int i2 = segmentPush.limit;
/* 93 */                        int i3 = segmentPush.pos;
/* 101 */                       if (offset < ((long) (i2 - i3)) + j) {
                                    break;
                                }
/* 105 */                       j += (long) (i2 - i3);
/* 106 */                       segmentPush = segmentPush.next;
                            }
                        } else {
/* 111 */                   while (size > offset) {
/* 113 */                       segment.getClass();
/* 116 */                       segment = segment.prev;
/* 118 */                       segment.getClass();
/* 127 */                       size -= (long) (segment.limit - segment.pos);
                            }
/* 129 */                   j = size;
/* 130 */                   segmentPush = segment;
                        }
/* 133 */               if (this.readWrite) {
/* 135 */                   segmentPush.getClass();
/* 140 */                   if (segmentPush.shared) {
/* 142 */                       Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
/* 148 */                       if (buffer.head == segmentPush) {
/* 150 */                           buffer.head = segmentUnsharedCopy;
                                }
/* 152 */                       segmentPush = segmentPush.push(segmentUnsharedCopy);
/* 156 */                       Segment segment3 = segmentPush.prev;
/* 158 */                       segment3.getClass();
/* 161 */                       segment3.pop();
                            }
                        }
/* 164 */               setSegment$okio(segmentPush);
/* 167 */               this.offset = offset;
/* 169 */               segmentPush.getClass();
/* 174 */               this.data = segmentPush.data;
/* 180 */               int i4 = segmentPush.pos + ((int) (offset - j));
/* 181 */               this.start = i4;
/* 183 */               int i5 = segmentPush.limit;
/* 185 */               this.end = i5;
/* 187 */               return i5 - i4;
                    }

                    public final void setSegment$okio(Segment segment) {
/* 1 */                 this.segment = segment;
                    }
                }

                public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j, long j2, int i, Object obj) throws IOException {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 j = 0;
                    }
/* 7 */             long j3 = j;
/* 10 */            if ((i & 4) != 0) {
/* 14 */                j2 = buffer.size - j3;
                    }
/* 19 */            return buffer.copyTo(outputStream, j3, j2);
                }

                private final ByteString digest(String algorithm) throws NoSuchAlgorithmException {
/* 1 */             MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
/* 5 */             Segment segment = this.head;
/* 7 */             if (segment != null) {
/* 9 */                 byte[] bArr = segment.data;
/* 11 */                int i = segment.pos;
/* 16 */                messageDigest.update(bArr, i, segment.limit - i);
/* 19 */                Segment segment2 = segment.next;
/* 21 */                segment2.getClass();
/* 24 */                while (segment2 != segment) {
/* 26 */                    byte[] bArr2 = segment2.data;
/* 28 */                    int i2 = segment2.pos;
/* 33 */                    messageDigest.update(bArr2, i2, segment2.limit - i2);
/* 36 */                    segment2 = segment2.next;
/* 38 */                    segment2.getClass();
                        }
                    }
/* 44 */            byte[] bArrDigest = messageDigest.digest();
/* 48 */            bArrDigest.getClass();
/* 51 */            return new ByteString(bArrDigest);
                }

                private final ByteString hmac(String algorithm, ByteString key) throws NoSuchAlgorithmException {
                    try {
/* 1 */                 Mac mac = Mac.getInstance(algorithm);
/* 14 */                mac.init(new SecretKeySpec(key.internalArray$okio(), algorithm));
/* 17 */                Segment segment = this.head;
/* 19 */                if (segment != null) {
/* 21 */                    byte[] bArr = segment.data;
/* 23 */                    int i = segment.pos;
/* 28 */                    mac.update(bArr, i, segment.limit - i);
/* 31 */                    Segment segment2 = segment.next;
/* 33 */                    segment2.getClass();
/* 36 */                    while (segment2 != segment) {
/* 38 */                        byte[] bArr2 = segment2.data;
/* 40 */                        int i2 = segment2.pos;
/* 45 */                        mac.update(bArr2, i2, segment2.limit - i2);
/* 48 */                        segment2 = segment2.next;
/* 50 */                        segment2.getClass();
                            }
                        }
/* 56 */                byte[] bArrDoFinal = mac.doFinal();
/* 60 */                bArrDoFinal.getClass();
/* 63 */                return new ByteString(bArrDoFinal);
                    } catch (InvalidKeyException e) {
/* 68 */                C1951n4.m6863n(e);
/* 71 */                return null;
                    }
                }

                public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
                    }
/* 9 */             return buffer.readAndWriteUnsafe(unsafeCursor);
                }

                private final void readFrom(InputStream input, long byteCount, boolean forever) throws IOException {
                    while (true) {
/* 5 */                 if (byteCount <= 0 && !forever) {
/* 52 */                    return;
                        }
/* 10 */                Segment segmentWritableSegment$okio = writableSegment$okio(1);
/* 28 */                int i = input.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(byteCount, 8192 - segmentWritableSegment$okio.limit));
/* 33 */                if (i == -1) {
/* 39 */                    if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
/* 45 */                        this.head = segmentWritableSegment$okio.pop();
/* 47 */                        SegmentPool.recycle(segmentWritableSegment$okio);
                            }
/* 50 */                    if (forever) {
/* 52 */                        return;
                            }
/* 53 */                    C1951n4.m6854b();
/* 56 */                    return;
                        }
/* 60 */                segmentWritableSegment$okio.limit += i;
                        long j = i;
/* 66 */                this.size += j;
/* 68 */                byteCount -= j;
                    }
                }

                public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
                    }
/* 9 */             return buffer.readUnsafe(unsafeCursor);
                }

                public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j, int i, Object obj) throws IOException {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 j = buffer.size;
                    }
/* 7 */             return buffer.writeTo(outputStream, j);
                }

                /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
                public final byte m10637deprecated_getByte(long index) {
/* 1 */             return getByte(index);
                }

                /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name and from getter */
                public final long getSize() {
/* 1 */             return this.size;
                }

                @Override // okio.BufferedSource, okio.BufferedSink
                /* JADX INFO: renamed from: buffer */
                public Buffer getBufferField() {
/* 1 */             return this;
                }

                public final void clear() throws EOFException {
/* 5 */             skip(size());
                }

                @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }

                public final long completeSegmentByteCount() {
/* 1 */             long size = size();
/* 9 */             if (size == 0) {
/* 5 */                 return 0L;
                    }
/* 12 */            Segment segment = this.head;
/* 14 */            segment.getClass();
/* 17 */            Segment segment2 = segment.prev;
/* 19 */            segment2.getClass();
/* 22 */            int i = segment2.limit;
                    return (i >= 8192 || !segment2.owner) ? size : size - ((long) (i - segment2.pos));
                }

                public final Buffer copy() {
/* 3 */             Buffer buffer = new Buffer();
/* 14 */            if (size() == 0) {
/* 16 */                return buffer;
                    }
/* 17 */            Segment segment = this.head;
/* 19 */            segment.getClass();
/* 22 */            Segment segmentSharedCopy = segment.sharedCopy();
/* 26 */            buffer.head = segmentSharedCopy;
/* 28 */            segmentSharedCopy.prev = segmentSharedCopy;
/* 30 */            segmentSharedCopy.next = segmentSharedCopy;
/* 34 */            for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
/* 36 */                Segment segment3 = segmentSharedCopy.prev;
/* 38 */                segment3.getClass();
/* 41 */                segment2.getClass();
/* 48 */                segment3.push(segment2.sharedCopy());
                    }
/* 58 */            buffer.setSize$okio(size());
/* 61 */            return buffer;
                }

                public final Buffer copyTo(Buffer out, long offset, long byteCount) {
/* 1 */             out.getClass();
/* 8 */             long j = offset;
/* 10 */            SegmentedByteString.checkOffsetAndCount(size(), j, byteCount);
/* 17 */            if (byteCount != 0) {
/* 25 */                out.setSize$okio(out.size() + byteCount);
/* 28 */                Segment segment = this.head;
                        while (true) {
/* 30 */                    segment.getClass();
/* 33 */                    int i = segment.limit;
/* 35 */                    int i2 = segment.pos;
/* 42 */                    if (j < i - i2) {
                                break;
                            }
/* 46 */                    j -= (long) (i - i2);
/* 47 */                    segment = segment.next;
                        }
/* 50 */                Segment segment2 = segment;
/* 51 */                long j2 = byteCount;
/* 54 */                while (j2 > 0) {
/* 56 */                    segment2.getClass();
/* 59 */                    Segment segmentSharedCopy = segment2.sharedCopy();
/* 66 */                    int i3 = segmentSharedCopy.pos + ((int) j);
/* 67 */                    segmentSharedCopy.pos = i3;
/* 77 */                    segmentSharedCopy.limit = Math.min(i3 + ((int) j2), segmentSharedCopy.limit);
/* 79 */                    Segment segment3 = out.head;
/* 81 */                    if (segment3 == null) {
/* 83 */                        segmentSharedCopy.prev = segmentSharedCopy;
/* 85 */                        segmentSharedCopy.next = segmentSharedCopy;
/* 87 */                        out.head = segmentSharedCopy;
                            } else {
/* 90 */                        segment3.getClass();
/* 93 */                        Segment segment4 = segment3.prev;
/* 95 */                        segment4.getClass();
/* 98 */                        segment4.push(segmentSharedCopy);
                            }
/* 107 */                   j2 -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
/* 108 */                   segment2 = segment2.next;
/* 110 */                   j = 0;
                        }
                    }
/* 112 */           return this;
                }

                public boolean equals(Object other) {
/* 6 */             if (this == other) {
/* 5 */                 return true;
                    }
/* 12 */            if (!(other instanceof Buffer)) {
/* 11 */                return false;
                    }
/* 19 */            Buffer buffer = (Buffer) other;
/* 27 */            if (size() != buffer.size()) {
/* 11 */                return false;
                    }
/* 38 */            if (size() == 0) {
/* 5 */                 return true;
                    }
/* 41 */            Segment segment = this.head;
/* 43 */            segment.getClass();
/* 46 */            Segment segment2 = buffer.head;
/* 48 */            segment2.getClass();
/* 51 */            int i = segment.pos;
/* 53 */            int i2 = segment2.pos;
/* 55 */            long j = 0;
/* 62 */            while (j < size()) {
/* 70 */                long jMin = Math.min(segment.limit - i, segment2.limit - i2);
/* 75 */                long j2 = 0;
/* 78 */                while (j2 < jMin) {
/* 82 */                    int i3 = i + 1;
/* 88 */                    int i4 = i2 + 1;
/* 92 */                    if (segment.data[i] != segment2.data[i2]) {
/* 11 */                        return false;
                            }
/* 97 */                    j2++;
/* 98 */                    i = i3;
/* 100 */                   i2 = i4;
                        }
/* 105 */               if (i == segment.limit) {
/* 107 */                   segment = segment.next;
/* 109 */                   segment.getClass();
/* 112 */                   i = segment.pos;
                        }
/* 116 */               if (i2 == segment2.limit) {
/* 118 */                   segment2 = segment2.next;
/* 120 */                   segment2.getClass();
/* 123 */                   i2 = segment2.pos;
                        }
/* 125 */               j += jMin;
                    }
/* 5 */             return true;
                }

                @Override // okio.BufferedSource
                public boolean exhausted() {
                    return this.size == 0;
                }

                @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
                public void flush() {
                }

                @Override // okio.BufferedSource, okio.BufferedSink
                public Buffer getBuffer() {
/* 1 */             return this;
                }

                public final byte getByte(long pos) {
/* 8 */             SegmentedByteString.checkOffsetAndCount(size(), pos, 1L);
/* 11 */            Segment segment = this.head;
/* 13 */            segment.getClass();
/* 23 */            if (size() - pos < pos) {
/* 25 */                long size = size();
/* 31 */                while (size > pos) {
/* 33 */                    segment = segment.prev;
/* 35 */                    segment.getClass();
/* 44 */                    size -= (long) (segment.limit - segment.pos);
                        }
/* 54 */                return segment.data[(int) ((((long) segment.pos) + pos) - size)];
                    }
/* 57 */            long j = 0;
                    while (true) {
/* 59 */                int i = segment.limit;
/* 61 */                int i2 = segment.pos;
/* 65 */                long j2 = ((long) (i - i2)) + j;
/* 68 */                if (j2 > pos) {
/* 83 */                    return segment.data[(int) ((((long) i2) + pos) - j)];
                        }
/* 70 */                segment = segment.next;
/* 72 */                segment.getClass();
/* 75 */                j = j2;
                    }
                }

                public int hashCode() {
/* 1 */             Segment segment = this.head;
/* 3 */             if (segment == null) {
/* 5 */                 return 0;
                    }
/* 7 */             int i = 1;
/* 31 */            do {
/* 10 */                int i2 = segment.limit;
/* 12 */                for (int i3 = segment.pos; i3 < i2; i3++) {
/* 20 */                    i = (i * 31) + segment.data[i3];
                        }
/* 24 */                segment = segment.next;
/* 26 */                segment.getClass();
/* 31 */            } while (segment != this.head);
/* 33 */            return i;
                }

                public final ByteString hmacSha1(ByteString key) {
/* 1 */             key.getClass();
/* 6 */             return hmac("HmacSHA1", key);
                }

                public final ByteString hmacSha256(ByteString key) {
/* 1 */             key.getClass();
/* 6 */             return hmac("HmacSHA256", key);
                }

                public final ByteString hmacSha512(ByteString key) {
/* 1 */             key.getClass();
/* 6 */             return hmac("HmacSHA512", key);
                }

                @Override // okio.BufferedSource
                public long indexOf(ByteString bytes, long fromIndex) throws IOException {
                    int i;
/* 1 */             long j = fromIndex;
/* 3 */             bytes.getClass();
/* 10 */            long size = 0;
/* 12 */            if (bytes.size() <= 0) {
/* 261 */               C1951n4.m6859j("bytes is empty");
/* 10 */                return 0L;
                    }
/* 16 */            if (j < 0) {
/* 255 */               ds0.m3200q(pm2.m7488k("fromIndex < 0: ", j));
/* 10 */                return 0L;
                    }
/* 20 */            Segment segment = this.head;
/* 24 */            if (segment == null) {
/* 22 */                return -1L;
                    }
/* 38 */            if (size() - j < j) {
/* 40 */                size = size();
/* 46 */                while (size > j) {
/* 48 */                    segment = segment.prev;
/* 50 */                    segment.getClass();
/* 59 */                    size -= (long) (segment.limit - segment.pos);
                        }
/* 61 */                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
/* 65 */                byte b = bArrInternalArray$okio[0];
/* 67 */                int size2 = bytes.size();
/* 79 */                long size3 = (size() - ((long) size2)) + 1;
/* 82 */                while (size < size3) {
/* 84 */                    byte[] bArr = segment.data;
/* 98 */                    int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
/* 104 */                   i = (int) ((((long) segment.pos) + j) - size);
/* 105 */                   while (i < iMin) {
/* 109 */                       if (bArr[i] != b || !okio.internal.Buffer.rangeEquals(segment, i + 1, bArrInternalArray$okio, 1, size2)) {
/* 125 */                           i++;
                                }
                            }
/* 134 */                   size += (long) (segment.limit - segment.pos);
/* 135 */                   segment = segment.next;
/* 137 */                   segment.getClass();
/* 140 */                   j = size;
                        }
/* 22 */                return -1L;
                    }
                    while (true) {
/* 151 */               long j2 = ((long) (segment.limit - segment.pos)) + size;
/* 154 */               if (j2 > j) {
                            break;
                        }
/* 156 */               segment = segment.next;
/* 158 */               segment.getClass();
/* 161 */               size = j2;
                    }
/* 163 */           byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
/* 167 */           byte b2 = bArrInternalArray$okio2[0];
/* 169 */           int size4 = bytes.size();
/* 181 */           long size5 = (size() - ((long) size4)) + 1;
/* 185 */           while (size < size5) {
/* 187 */               byte[] bArr2 = segment.data;
/* 196 */               long j3 = size5;
/* 203 */               int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - size);
/* 209 */               i = (int) ((((long) segment.pos) + j) - size);
/* 210 */               while (i < iMin2) {
/* 214 */                   if (bArr2[i] == b2 && okio.internal.Buffer.rangeEquals(segment, i + 1, bArrInternalArray$okio2, 1, size4)) {
                            }
/* 227 */                   i++;
                        }
/* 237 */               size += (long) (segment.limit - segment.pos);
/* 238 */               segment = segment.next;
/* 240 */               segment.getClass();
/* 243 */               size5 = j3;
/* 245 */               j = size;
                    }
/* 22 */            return -1L;
/* 123 */           return ((long) (i - segment.pos)) + size;
                }

                @Override // okio.BufferedSource
                public long indexOfElement(ByteString targetBytes, long fromIndex) {
                    int i;
                    int i2;
/* 1 */             targetBytes.getClass();
/* 4 */             long size = 0;
/* 8 */             if (fromIndex < 0) {
/* 312 */               ds0.m3200q(pm2.m7488k("fromIndex < 0: ", fromIndex));
/* 4 */                 return 0L;
                    }
/* 10 */            Segment segment = this.head;
/* 14 */            if (segment == null) {
/* 12 */                return -1L;
                    }
/* 27 */            if (size() - fromIndex < fromIndex) {
/* 29 */                size = size();
/* 35 */                while (size > fromIndex) {
/* 37 */                    segment = segment.prev;
/* 39 */                    segment.getClass();
/* 48 */                    size -= (long) (segment.limit - segment.pos);
                        }
/* 54 */                if (targetBytes.size() == 2) {
/* 56 */                    byte b = targetBytes.getByte(0);
/* 60 */                    byte b2 = targetBytes.getByte(1);
/* 70 */                    while (size < size()) {
/* 72 */                        byte[] bArr = segment.data;
/* 79 */                        i = (int) ((((long) segment.pos) + fromIndex) - size);
/* 80 */                        int i3 = segment.limit;
                                while (true) {
/* 82 */                            if (i >= i3) {
/* 106 */                               size += (long) (segment.limit - segment.pos);
/* 107 */                               segment = segment.next;
/* 109 */                               segment.getClass();
/* 112 */                               fromIndex = size;
                                    } else {
/* 84 */                                byte b3 = bArr[i];
/* 86 */                                if (b3 == b || b3 == b2) {
/* 94 */                                    i2 = segment.pos;
                                        } else {
/* 91 */                                    i++;
                                        }
                                    }
                                }
                            }
                        } else {
/* 114 */                   byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
/* 124 */                   while (size < size()) {
/* 126 */                       byte[] bArr2 = segment.data;
/* 133 */                       i = (int) ((((long) segment.pos) + fromIndex) - size);
/* 134 */                       int i4 = segment.limit;
                                while (true) {
/* 136 */                           if (i < i4) {
/* 138 */                               byte b4 = bArr2[i];
/* 140 */                               int length = bArrInternalArray$okio.length;
/* 141 */                               int i5 = 0;
                                        while (true) {
/* 142 */                                   if (i5 >= length) {
/* 154 */                                       i++;
                                            } else if (b4 == bArrInternalArray$okio[i5]) {
/* 148 */                                       i2 = segment.pos;
                                            } else {
/* 151 */                                       i5++;
                                            }
                                        }
                                    } else {
/* 163 */                               size += (long) (segment.limit - segment.pos);
/* 164 */                               segment = segment.next;
/* 166 */                               segment.getClass();
/* 169 */                               fromIndex = size;
                                    }
                                }
                            }
                        }
/* 12 */                return -1L;
                    }
                    while (true) {
/* 178 */               long j = ((long) (segment.limit - segment.pos)) + size;
/* 181 */               if (j > fromIndex) {
                            break;
                        }
/* 183 */               segment = segment.next;
/* 185 */               segment.getClass();
/* 188 */               size = j;
                    }
/* 194 */           if (targetBytes.size() == 2) {
/* 196 */               byte b5 = targetBytes.getByte(0);
/* 200 */               byte b6 = targetBytes.getByte(1);
/* 210 */               while (size < size()) {
/* 212 */                   byte[] bArr3 = segment.data;
/* 219 */                   i = (int) ((((long) segment.pos) + fromIndex) - size);
/* 220 */                   int i6 = segment.limit;
                            while (true) {
/* 222 */                       if (i >= i6) {
/* 241 */                           size += (long) (segment.limit - segment.pos);
/* 242 */                           segment = segment.next;
/* 244 */                           segment.getClass();
/* 247 */                           fromIndex = size;
                                } else {
/* 224 */                           byte b7 = bArr3[i];
/* 226 */                           if (b7 == b5 || b7 == b6) {
/* 94 */                                i2 = segment.pos;
                                    } else {
/* 232 */                               i++;
                                    }
                                }
                            }
                        }
                    } else {
/* 249 */               byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
/* 259 */               while (size < size()) {
/* 261 */                   byte[] bArr4 = segment.data;
/* 268 */                   i = (int) ((((long) segment.pos) + fromIndex) - size);
/* 269 */                   int i7 = segment.limit;
                            while (true) {
/* 271 */                       if (i < i7) {
/* 273 */                           byte b8 = bArr4[i];
/* 275 */                           int length2 = bArrInternalArray$okio2.length;
/* 276 */                           int i8 = 0;
                                    while (true) {
/* 277 */                               if (i8 >= length2) {
/* 288 */                                   i++;
                                        } else if (b8 == bArrInternalArray$okio2[i8]) {
/* 148 */                                   i2 = segment.pos;
                                        } else {
/* 285 */                                   i8++;
                                        }
                                    }
                                } else {
/* 297 */                           size += (long) (segment.limit - segment.pos);
/* 298 */                           segment = segment.next;
/* 300 */                           segment.getClass();
/* 303 */                           fromIndex = size;
                                }
                            }
                        }
                    }
/* 12 */            return -1L;
/* 98 */            return ((long) (i - i2)) + size;
                }

                @Override // okio.BufferedSource
                public InputStream inputStream() {
/* 3 */             return new InputStream() { // from class: okio.Buffer.inputStream.1
                        @Override // java.io.InputStream
                        public int available() {
/* 14 */                    return (int) Math.min(Buffer.this.size(), 2147483647L);
                        }

                        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                        public void close() {
                        }

                        @Override // java.io.InputStream
                        public int read() {
/* 11 */                    if (Buffer.this.size() > 0) {
/* 19 */                        return Buffer.this.readByte() & 255;
                            }
/* 22 */                    return -1;
                        }

                        public String toString() {
/* 16 */                    return Buffer.this + ".inputStream()";
                        }

                        @Override // java.io.InputStream
/* 23 */                public int read(byte[] sink, int offset, int byteCount) {
                            sink.getClass();
/* 24 */                    return Buffer.this.read(sink, offset, byteCount);
                        }
                    };
                }

                @Override // java.nio.channels.Channel
                public boolean isOpen() {
/* 1 */             return true;
                }

                public final ByteString md5() {
/* 3 */             return digest("MD5");
                }

                @Override // okio.BufferedSink
                public OutputStream outputStream() {
/* 3 */             return new OutputStream() { // from class: okio.Buffer.outputStream.1
                        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                        public void close() {
                        }

                        @Override // java.io.OutputStream, java.io.Flushable
                        public void flush() {
                        }

                        public String toString() {
/* 16 */                    return Buffer.this + ".outputStream()";
                        }

                        @Override // java.io.OutputStream
                        public void write(byte[] data, int offset, int byteCount) {
/* 1 */                     data.getClass();
/* 6 */                     Buffer.this.write(data, offset, byteCount);
                        }

                        @Override // java.io.OutputStream
/* 9 */                 public void write(int b) {
/* 10 */                    Buffer.this.writeByte(b);
                        }
                    };
                }

                @Override // okio.BufferedSource
                public BufferedSource peek() {
/* 6 */             return Okio.buffer(new PeekSource(this));
                }

                @Override // okio.BufferedSource
                public boolean rangeEquals(long offset, ByteString bytes, int bytesOffset, int byteCount) {
/* 1 */             bytes.getClass();
/* 9 */             if (offset < 0 || bytesOffset < 0 || byteCount < 0 || size() - offset < byteCount || bytes.size() - bytesOffset < byteCount) {
/* 8 */                 return false;
                    }
/* 34 */            for (int i = 0; i < byteCount; i++) {
/* 48 */                if (getByte(((long) i) + offset) != bytes.getByte(bytesOffset + i)) {
/* 8 */                     return false;
                        }
                    }
/* 54 */            return true;
                }

                @Override // okio.BufferedSource
                public int read(byte[] sink, int offset, int byteCount) {
/* 1 */             sink.getClass();
/* 8 */             SegmentedByteString.checkOffsetAndCount(sink.length, offset, byteCount);
/* 11 */            Segment segment = this.head;
/* 13 */            if (segment == null) {
/* 15 */                return -1;
                    }
/* 22 */            int iMin = Math.min(byteCount, segment.limit - segment.pos);
/* 26 */            byte[] bArr = segment.data;
/* 28 */            int i = segment.pos;
/* 32 */            C1960nd.m6964b(bArr, offset, sink, i, i + iMin);
/* 38 */            segment.pos += iMin;
/* 46 */            setSize$okio(size() - ((long) iMin));
/* 53 */            if (segment.pos == segment.limit) {
/* 59 */                this.head = segment.pop();
/* 61 */                SegmentPool.recycle(segment);
                    }
/* 64 */            return iMin;
                }

                @Override // okio.BufferedSource
                public long readAll(Sink sink) throws IOException {
/* 1 */             sink.getClass();
/* 4 */             long size = size();
/* 12 */            if (size > 0) {
/* 14 */                sink.write(this, size);
                    }
/* 17 */            return size;
                }

                public final UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
/* 1 */             unsafeCursor.getClass();
/* 4 */             return okio.internal.Buffer.commonReadAndWriteUnsafe(this, unsafeCursor);
                }

                @Override // okio.BufferedSource
                public byte readByte() throws EOFException {
/* 9 */             if (size() == 0) {
/* 51 */                C1951n4.m6854b();
/* 54 */                return (byte) 0;
                    }
/* 11 */            Segment segment = this.head;
/* 13 */            segment.getClass();
/* 16 */            int i = segment.pos;
/* 18 */            int i2 = segment.limit;
/* 22 */            int i3 = i + 1;
/* 24 */            byte b = segment.data[i];
/* 33 */            setSize$okio(size() - 1);
/* 36 */            if (i3 != i2) {
/* 48 */                segment.pos = i3;
/* 50 */                return b;
                    }
/* 42 */            this.head = segment.pop();
/* 44 */            SegmentPool.recycle(segment);
/* 47 */            return b;
                }

                @Override // okio.BufferedSource
                public byte[] readByteArray(long byteCount) throws EOFException {
/* 5 */             if (byteCount < 0 || byteCount > 2147483647L) {
/* 40 */                ds0.m3200q(pm2.m7488k("byteCount: ", byteCount));
/* 32 */                return null;
                    }
/* 20 */            if (size() < byteCount) {
/* 29 */                C1951n4.m6854b();
/* 32 */                return null;
                    }
/* 23 */            byte[] bArr = new byte[(int) byteCount];
/* 25 */            readFully(bArr);
/* 28 */            return bArr;
                }

                @Override // okio.BufferedSource
                public ByteString readByteString(long byteCount) throws EOFException {
/* 5 */             if (byteCount < 0 || byteCount > 2147483647L) {
/* 58 */                ds0.m3200q(pm2.m7488k("byteCount: ", byteCount));
/* 50 */                return null;
                    }
/* 20 */            if (size() < byteCount) {
/* 47 */                C1951n4.m6854b();
/* 50 */                return null;
                    }
/* 26 */            if (byteCount < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
/* 43 */                return new ByteString(readByteArray(byteCount));
                    }
/* 29 */            ByteString byteStringSnapshot = snapshot((int) byteCount);
/* 33 */            skip(byteCount);
/* 36 */            return byteStringSnapshot;
                }

                @Override // okio.BufferedSource
                public long readDecimalLong() throws EOFException {
                    long j;
                    byte b;
/* 7 */             long j2 = 0;
/* 11 */            if (size() == 0) {
/* 216 */               C1951n4.m6854b();
/* 7 */                 return 0L;
                    }
/* 13 */            int i = 0;
/* 16 */            boolean z = false;
/* 17 */            long j3 = 0;
/* 18 */            long j4 = -7;
/* 19 */            boolean z2 = false;
                    loop0: while (true) {
/* 20 */                Segment segment = this.head;
/* 22 */                segment.getClass();
/* 25 */                byte[] bArr = segment.data;
/* 27 */                int i2 = segment.pos;
/* 29 */                int i3 = segment.limit;
                        while (true) {
/* 31 */                    if (i2 >= i3) {
/* 119 */                       j = j2;
                                break;
                            }
/* 33 */                    b = bArr[i2];
/* 37 */                    if (b < 48 || b > 57) {
/* 98 */                        j = j2;
/* 102 */                       if (b != 45 || i != 0) {
/* 117 */                           z2 = true;
                                    break;
                                }
/* 108 */                       j4--;
/* 109 */                       z = true;
                            } else {
/* 43 */                        int i4 = 48 - b;
/* 52 */                        j = j2;
/* 54 */                        if (j3 < okio.internal.Buffer.OVERFLOW_ZONE || (j3 == okio.internal.Buffer.OVERFLOW_ZONE && i4 < j4)) {
                                    break loop0;
                                }
/* 68 */                        j3 = (j3 * 10) + ((long) i4);
                            }
/* 110 */                   i2++;
/* 112 */                   i++;
/* 114 */                   j2 = j;
                        }
/* 121 */               if (i2 == i3) {
/* 127 */                   this.head = segment.pop();
/* 129 */                   SegmentPool.recycle(segment);
                        } else {
/* 133 */                   segment.pos = i2;
                        }
/* 135 */               if (z2 || this.head == null) {
/* 151 */                   setSize$okio(size() - ((long) i));
/* 159 */                   if (i >= (z ? 2 : 1)) {
                                return z ? j3 : -j3;
                            }
/* 167 */                   if (size() != j) {
/* 180 */                       StringBuilder sbM3794t = fm0.m3794t(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
/* 194 */                       sbM3794t.append(SegmentedByteString.toHexString(getByte(j)));
/* 204 */                       throw new NumberFormatException(sbM3794t.toString());
                            }
/* 205 */                   long j5 = j;
/* 207 */                   C1951n4.m6854b();
/* 210 */                   return j5;
                        }
/* 142 */               j2 = j;
                    }
/* 79 */            Buffer bufferWriteByte = new Buffer().writeDecimalLong(j3).writeByte((int) b);
/* 83 */            if (!z) {
/* 85 */                bufferWriteByte.readByte();
                    }
/* 94 */            C1951n4.m6858i(bufferWriteByte.readUtf8(), "Number too large: ");
/* 97 */            return j;
                }

                @Override // okio.BufferedSource
                public void readFully(Buffer sink, long byteCount) throws EOFException {
/* 1 */             sink.getClass();
/* 10 */            if (size() >= byteCount) {
/* 12 */                sink.write(this, byteCount);
                    } else {
/* 20 */                sink.write(this, size());
/* 23 */                C1951n4.m6854b();
                    }
                }

                @Override // okio.BufferedSource
                public long readHexadecimalUnsignedLong() throws EOFException {
                    int i;
/* 9 */             if (size() == 0) {
/* 144 */               C1951n4.m6854b();
/* 5 */                 return 0L;
                    }
/* 11 */            int i2 = 0;
/* 12 */            boolean z = false;
/* 13 */            long j = 0;
/* 132 */           do {
/* 14 */                Segment segment = this.head;
/* 16 */                segment.getClass();
/* 19 */                byte[] bArr = segment.data;
/* 21 */                int i3 = segment.pos;
/* 23 */                int i4 = segment.limit;
/* 25 */                while (i3 < i4) {
/* 27 */                    byte b = bArr[i3];
/* 31 */                    if (b >= 48 && b <= 57) {
/* 37 */                        i = b - 48;
                            } else if (b >= 97 && b <= 102) {
/* 48 */                        i = b - 87;
                            } else {
/* 53 */                        if (b < 65 || b > 70) {
/* 100 */                           if (i2 != 0) {
/* 102 */                               z = true;
                                        break;
                                    }
/* 110 */                           C1951n4.m6858i(SegmentedByteString.toHexString(b), "Expected leading [0-9a-fA-F] character but was 0x");
/* 5 */                             return 0L;
                                }
/* 59 */                        i = b - 55;
                            }
/* 66 */                    if (((-1152921504606846976L) & j) != 0) {
/* 96 */                        C1951n4.m6858i(new Buffer().writeHexadecimalUnsignedLong(j).writeByte((int) b).readUtf8(), "Number too large: ");
/* 5 */                         return 0L;
                            }
/* 71 */                    j = (j << 4) | ((long) i);
/* 72 */                    i3++;
/* 74 */                    i2++;
                        }
/* 114 */               if (i3 == i4) {
/* 120 */                   this.head = segment.pop();
/* 122 */                   SegmentPool.recycle(segment);
                        } else {
/* 126 */                   segment.pos = i3;
                        }
/* 128 */               if (z) {
                            break;
                        }
/* 132 */           } while (this.head != null);
/* 140 */           setSize$okio(size() - ((long) i2));
/* 143 */           return j;
                }

                @Override // okio.BufferedSource
                public int readInt() throws EOFException {
/* 9 */             if (size() < 4) {
/* 119 */               C1951n4.m6854b();
/* 122 */               return 0;
                    }
/* 11 */            Segment segment = this.head;
/* 13 */            segment.getClass();
/* 16 */            int i = segment.pos;
/* 18 */            int i2 = segment.limit;
/* 25 */            if (i2 - i < 4) {
/* 59 */                return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
                    }
/* 61 */            byte[] bArr = segment.data;
/* 80 */            int i3 = i + 3;
/* 88 */            int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
/* 89 */            int i5 = i + 4;
/* 95 */            int i6 = (bArr[i3] & 255) | i4;
/* 101 */           setSize$okio(size() - 4);
/* 104 */           if (i5 != i2) {
/* 116 */               segment.pos = i5;
/* 118 */               return i6;
                    }
/* 110 */           this.head = segment.pop();
/* 112 */           SegmentPool.recycle(segment);
/* 115 */           return i6;
                }

                @Override // okio.BufferedSource
                public int readIntLe() throws EOFException {
/* 5 */             return SegmentedByteString.reverseBytes(readInt());
                }

                @Override // okio.BufferedSource
                public long readLong() throws EOFException {
/* 9 */             if (size() < 8) {
/* 152 */               C1951n4.m6854b();
/* 155 */               return 0L;
                    }
/* 11 */            Segment segment = this.head;
/* 13 */            segment.getClass();
/* 16 */            int i = segment.pos;
/* 18 */            int i2 = segment.limit;
/* 27 */            if (i2 - i < 8) {
/* 47 */                return ((((long) readInt()) & KeyboardMap.kValueMask) << 32) | (KeyboardMap.kValueMask & ((long) readInt()));
                    }
/* 49 */            byte[] bArr = segment.data;
/* 112 */           int i3 = i + 7;
/* 121 */           long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
/* 122 */           int i4 = i + 8;
/* 127 */           long j2 = j | (((long) bArr[i3]) & 255);
/* 134 */           setSize$okio(size() - 8);
/* 137 */           if (i4 != i2) {
/* 149 */               segment.pos = i4;
/* 151 */               return j2;
                    }
/* 143 */           this.head = segment.pop();
/* 145 */           SegmentPool.recycle(segment);
/* 148 */           return j2;
                }

                @Override // okio.BufferedSource
                public long readLongLe() throws EOFException {
/* 5 */             return SegmentedByteString.reverseBytes(readLong());
                }

                @Override // okio.BufferedSource
                public short readShort() throws EOFException {
/* 9 */             if (size() < 2) {
/* 82 */                C1951n4.m6854b();
/* 85 */                return (short) 0;
                    }
/* 11 */            Segment segment = this.head;
/* 13 */            segment.getClass();
/* 16 */            int i = segment.pos;
/* 18 */            int i2 = segment.limit;
/* 23 */            if (i2 - i < 2) {
/* 40 */                return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
                    }
/* 42 */            byte[] bArr = segment.data;
/* 44 */            int i3 = i + 1;
/* 50 */            int i4 = (bArr[i] & 255) << 8;
/* 52 */            int i5 = i + 2;
/* 57 */            int i6 = (bArr[i3] & 255) | i4;
/* 63 */            setSize$okio(size() - 2);
/* 66 */            if (i5 == i2) {
/* 72 */                this.head = segment.pop();
/* 74 */                SegmentPool.recycle(segment);
                    } else {
/* 78 */                segment.pos = i5;
                    }
/* 80 */            return (short) i6;
                }

                @Override // okio.BufferedSource
                public short readShortLe() throws EOFException {
/* 5 */             return SegmentedByteString.reverseBytes(readShort());
                }

                @Override // okio.BufferedSource
                public String readString(long byteCount, Charset charset) throws EOFException {
/* 1 */             charset.getClass();
/* 9 */             if (byteCount < 0 || byteCount > 2147483647L) {
/* 97 */                ds0.m3200q(pm2.m7488k("byteCount: ", byteCount));
/* 8 */                 return null;
                    }
/* 22 */            if (this.size < byteCount) {
/* 87 */                C1951n4.m6854b();
/* 8 */                 return null;
                    }
/* 24 */            if (byteCount == 0) {
/* 26 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 29 */            Segment segment = this.head;
/* 31 */            segment.getClass();
/* 34 */            int i = segment.pos;
/* 43 */            if (((long) i) + byteCount > segment.limit) {
/* 51 */                return new String(readByteArray(byteCount), charset);
                    }
/* 59 */            int i2 = (int) byteCount;
/* 60 */            String str = new String(segment.data, i, i2, charset);
/* 65 */            int i3 = segment.pos + i2;
/* 66 */            segment.pos = i3;
/* 71 */            this.size -= byteCount;
/* 75 */            if (i3 == segment.limit) {
/* 81 */                this.head = segment.pop();
/* 83 */                SegmentPool.recycle(segment);
                    }
/* 86 */            return str;
                }

                public final UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
/* 1 */             unsafeCursor.getClass();
/* 4 */             return okio.internal.Buffer.commonReadUnsafe(this, unsafeCursor);
                }

                @Override // okio.BufferedSource
                public String readUtf8() {
/* 5 */             return readString(this.size, Charsets.UTF_8);
                }

                @Override // okio.BufferedSource
                public int readUtf8CodePoint() throws EOFException {
                    int i;
                    int i2;
                    int i3;
/* 10 */            if (size() == 0) {
/* 169 */               C1951n4.m6854b();
/* 9 */                 return 0;
                    }
/* 12 */            byte b = getByte(0L);
/* 24 */            if ((b & 128) == 0) {
/* 26 */                i = b & 127;
/* 28 */                i3 = 0;
/* 29 */                i2 = 1;
                    } else if ((b & 224) == 192) {
/* 37 */                i = b & 31;
/* 39 */                i2 = 2;
/* 40 */                i3 = 128;
                    } else if ((b & 240) == 224) {
/* 48 */                i = b & 15;
/* 50 */                i2 = 3;
/* 51 */                i3 = 2048;
                    } else {
/* 58 */                if ((b & 248) != 240) {
/* 165 */                   skip(1L);
/* 21 */                    return Utf8.REPLACEMENT_CODE_POINT;
                        }
/* 60 */                i = b & 7;
/* 62 */                i2 = 4;
/* 63 */                i3 = 65536;
                    }
                    long j = i2;
/* 72 */            if (size() < j) {
/* 127 */               StringBuilder sbM3793s = fm0.m3793s(i2, "size < ", ": ");
/* 135 */               sbM3793s.append(size());
/* 140 */               sbM3793s.append(" (to read code point prefixed 0x");
/* 147 */               sbM3793s.append(SegmentedByteString.toHexString(b));
/* 152 */               sbM3793s.append(')');
/* 162 */               throw new EOFException(sbM3793s.toString());
                    }
/* 74 */            for (int i4 = 1; i4 < i2; i4++) {
                        long j2 = i4;
/* 77 */                byte b2 = getByte(j2);
/* 83 */                if ((b2 & 192) != 128) {
/* 93 */                    skip(j2);
/* 21 */                    return Utf8.REPLACEMENT_CODE_POINT;
                        }
/* 89 */                i = (i << 6) | (b2 & Utf8.REPLACEMENT_BYTE);
                    }
/* 97 */            skip(j);
/* 103 */           if (i > 1114111) {
/* 21 */                return Utf8.REPLACEMENT_CODE_POINT;
                    }
                    return ((55296 > i || i >= 57344) && i >= i3) ? i : Utf8.REPLACEMENT_CODE_POINT;
                }

                @Override // okio.BufferedSource
                public String readUtf8Line() throws EOFException {
/* 3 */             long jIndexOf = indexOf((byte) 10);
/* 11 */            if (jIndexOf != -1) {
/* 13 */                return okio.internal.Buffer.readUtf8Line(this, jIndexOf);
                    }
/* 26 */            if (size() != 0) {
/* 32 */                return readUtf8(size());
                    }
/* 37 */            return null;
                }

                @Override // okio.BufferedSource
                public String readUtf8LineStrict(long limit) throws EOFException {
/* 5 */             if (limit < 0) {
/* 122 */               ds0.m3200q(pm2.m7488k("limit < 0: ", limit));
/* 114 */               return null;
                    }
/* 20 */            long j = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
/* 28 */            long jIndexOf = indexOf((byte) 10, 0L, j);
/* 36 */            if (jIndexOf != -1) {
/* 38 */                return okio.internal.Buffer.readUtf8Line(this, jIndexOf);
                    }
/* 49 */            if (j < size() && getByte(j - 1) == 13 && getByte(j) == 10) {
/* 69 */                return okio.internal.Buffer.readUtf8Line(this, j);
                    }
/* 76 */            Buffer buffer = new Buffer();
/* 92 */            copyTo(buffer, 0L, Math.min(32L, size()));
/* 111 */           C1951n4.m6857h(buffer.readByteString().hex(), Math.min(size(), limit));
/* 114 */           return null;
                }

                @Override // okio.BufferedSource
                public boolean request(long byteCount) {
                    return this.size >= byteCount;
                }

                @Override // okio.BufferedSource
                public void require(long byteCount) throws EOFException {
/* 5 */             if (this.size >= byteCount) {
/* 7 */                 return;
                    }
/* 8 */             C1951n4.m6854b();
                }

                @Override // okio.BufferedSource
                public int select(Options options) throws EOFException {
/* 1 */             options.getClass();
/* 7 */             int iSelectPrefix$default = okio.internal.Buffer.selectPrefix$default(this, options, false, 2, null);
/* 12 */            if (iSelectPrefix$default == -1) {
/* 11 */                return -1;
                    }
/* 26 */            skip(options.getByteStrings()[iSelectPrefix$default].size());
/* 29 */            return iSelectPrefix$default;
                }

                public final void setSize$okio(long j) {
/* 1 */             this.size = j;
                }

                public final ByteString sha1() {
/* 3 */             return digest("SHA-1");
                }

                public final ByteString sha256() {
/* 3 */             return digest("SHA-256");
                }

                public final ByteString sha512() {
/* 3 */             return digest("SHA-512");
                }

                public final long size() {
/* 1 */             return this.size;
                }

                @Override // okio.BufferedSource
                public void skip(long byteCount) throws EOFException {
/* 5 */             while (byteCount > 0) {
/* 7 */                 Segment segment = this.head;
/* 9 */                 if (segment == null) {
/* 51 */                    C1951n4.m6854b();
/* 54 */                    return;
                        }
/* 21 */                int iMin = (int) Math.min(byteCount, segment.limit - segment.pos);
                        long j = iMin;
/* 28 */                setSize$okio(size() - j);
/* 31 */                byteCount -= j;
/* 34 */                int i = segment.pos + iMin;
/* 35 */                segment.pos = i;
/* 39 */                if (i == segment.limit) {
/* 45 */                    this.head = segment.pop();
/* 47 */                    SegmentPool.recycle(segment);
                        }
                    }
                }

                public final ByteString snapshot(int byteCount) {
/* 1 */             if (byteCount == 0) {
/* 3 */                 return ByteString.EMPTY;
                    }
/* 13 */            SegmentedByteString.checkOffsetAndCount(size(), 0L, byteCount);
/* 16 */            Segment segment = this.head;
/* 18 */            int i = 0;
/* 19 */            int i2 = 0;
/* 20 */            int i3 = 0;
/* 21 */            while (i2 < byteCount) {
/* 23 */                segment.getClass();
/* 26 */                int i4 = segment.limit;
/* 28 */                int i5 = segment.pos;
/* 30 */                if (i4 == i5) {
/* 41 */                    C1951n4.m6856g("s.limit == s.pos");
/* 44 */                    return null;
                        }
/* 33 */                i2 += i4 - i5;
/* 34 */                i3++;
/* 36 */                segment = segment.next;
                    }
/* 46 */            byte[][] bArr = new byte[i3][];
/* 50 */            int[] iArr = new int[i3 * 2];
/* 52 */            Segment segment2 = this.head;
/* 54 */            int i6 = 0;
/* 55 */            while (i < byteCount) {
/* 57 */                segment2.getClass();
/* 62 */                bArr[i6] = segment2.data;
/* 69 */                i += segment2.limit - segment2.pos;
/* 74 */                iArr[i6] = Math.min(i, byteCount);
/* 80 */                iArr[i6 + i3] = segment2.pos;
/* 83 */                segment2.shared = true;
/* 85 */                i6++;
/* 86 */                segment2 = segment2.next;
                    }
/* 91 */            return new C2570SegmentedByteString(bArr, iArr);
                }

                @Override // okio.Source
                public Timeout timeout() {
/* 1 */             return Timeout.NONE;
                }

                public String toString() {
/* 5 */             return snapshot().toString();
                }

                public final Segment writableSegment$okio(int minimumCapacity) {
/* 2 */             if (minimumCapacity < 1 || minimumCapacity > 8192) {
/* 53 */                C1951n4.m6859j("unexpected capacity");
/* 56 */                return null;
                    }
/* 8 */             Segment segment = this.head;
/* 10 */            if (segment != null) {
/* 23 */                segment.getClass();
/* 26 */                Segment segment2 = segment.prev;
/* 28 */                segment2.getClass();
                        return (segment2.limit + minimumCapacity > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
                    }
/* 12 */            Segment segmentTake = SegmentPool.take();
/* 16 */            this.head = segmentTake;
/* 18 */            segmentTake.prev = segmentTake;
/* 20 */            segmentTake.next = segmentTake;
/* 22 */            return segmentTake;
                }

                @Override // okio.Sink
                public void write(Buffer source, long byteCount) {
                    Segment segment;
/* 1 */             source.getClass();
/* 4 */             if (source == this) {
/* 182 */               C1951n4.m6859j("source == this");
/* 185 */               return;
                    }
/* 13 */            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
/* 20 */            while (byteCount > 0) {
/* 22 */                Segment segment2 = source.head;
/* 24 */                segment2.getClass();
/* 27 */                int i = segment2.limit;
/* 29 */                Segment segment3 = source.head;
/* 31 */                segment3.getClass();
/* 40 */                if (byteCount < i - segment3.pos) {
/* 42 */                    Segment segment4 = this.head;
/* 44 */                    if (segment4 != null) {
/* 46 */                        segment4.getClass();
/* 49 */                        segment = segment4.prev;
                            } else {
/* 52 */                        segment = null;
                            }
/* 53 */                    if (segment != null && segment.owner) {
/* 77 */                        if ((((long) segment.limit) + byteCount) - ((long) (segment.shared ? 0 : segment.pos)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
/* 79 */                            Segment segment5 = source.head;
/* 81 */                            segment5.getClass();
/* 85 */                            segment5.writeTo(segment, (int) byteCount);
/* 93 */                            source.setSize$okio(source.size() - byteCount);
/* 101 */                           setSize$okio(size() + byteCount);
/* 104 */                           return;
                                }
                            }
/* 105 */                   Segment segment6 = source.head;
/* 107 */                   segment6.getClass();
/* 115 */                   source.head = segment6.split((int) byteCount);
                        }
/* 117 */               Segment segment7 = source.head;
/* 119 */               segment7.getClass();
/* 126 */               long j = segment7.limit - segment7.pos;
/* 132 */               source.head = segment7.pop();
/* 134 */               Segment segment8 = this.head;
/* 136 */               if (segment8 == null) {
/* 138 */                   this.head = segment7;
/* 140 */                   segment7.prev = segment7;
/* 142 */                   segment7.next = segment7;
                        } else {
/* 145 */                   segment8.getClass();
/* 148 */                   Segment segment9 = segment8.prev;
/* 150 */                   segment9.getClass();
/* 157 */                   segment9.push(segment7).compact();
                        }
/* 165 */               source.setSize$okio(source.size() - j);
/* 173 */               setSize$okio(size() + j);
/* 176 */               byteCount -= j;
                    }
                }

                @Override // okio.BufferedSink
                public long writeAll(Source source) throws IOException {
/* 1 */             source.getClass();
/* 4 */             long j = 0;
                    while (true) {
/* 8 */                 long j2 = source.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
/* 16 */                if (j2 == -1) {
/* 20 */                    return j;
                        }
/* 18 */                j += j2;
                    }
                }

                @Override // okio.BufferedSink
                public Buffer writeByte(int b) {
/* 2 */             Segment segmentWritableSegment$okio = writableSegment$okio(1);
/* 6 */             byte[] bArr = segmentWritableSegment$okio.data;
/* 8 */             int i = segmentWritableSegment$okio.limit;
/* 12 */            segmentWritableSegment$okio.limit = i + 1;
/* 15 */            bArr[i] = (byte) b;
/* 24 */            setSize$okio(size() + 1);
/* 27 */            return this;
                }

                @Override // okio.BufferedSink
                public Buffer writeDecimalLong(long v) {
                    boolean z;
/* 5 */             if (v == 0) {
/* 9 */                 return writeByte(48);
                    }
/* 14 */            int i = 1;
/* 15 */            if (v < 0) {
/* 17 */                v = -v;
/* 20 */                if (v < 0) {
/* 24 */                    return writeUtf8("-9223372036854775808");
                        }
/* 29 */                z = true;
                    } else {
/* 31 */                z = false;
                    }
/* 39 */            if (v < 100000000) {
/* 45 */                if (v < 10000) {
/* 51 */                    if (v >= 100) {
/* 71 */                        i = v < 1000 ? 3 : 4;
                            } else if (v >= 10) {
/* 59 */                        i = 2;
                            }
                        } else if (v < 1000000) {
/* 91 */                    i = v < 100000 ? 5 : 6;
                        } else {
/* 104 */                   i = v < 10000000 ? 7 : 8;
                        }
                    } else if (v < 1000000000000L) {
/* 124 */               if (v < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
/* 136 */                   i = v < 1000000000 ? 9 : 10;
                        } else {
/* 151 */                   i = v < 100000000000L ? 11 : 12;
                        }
                    } else if (v < 1000000000000000L) {
/* 170 */               if (v < 10000000000000L) {
/* 172 */                   i = 13;
                        } else {
/* 187 */                   i = v < 100000000000000L ? 14 : 15;
                        }
                    } else if (v < 100000000000000000L) {
/* 211 */               i = v < 10000000000000000L ? 16 : 17;
                    } else {
/* 226 */               i = v < 1000000000000000000L ? 18 : 19;
                    }
/* 228 */           if (z) {
/* 230 */               i++;
                    }
/* 232 */           Segment segmentWritableSegment$okio = writableSegment$okio(i);
/* 236 */           byte[] bArr = segmentWritableSegment$okio.data;
/* 240 */           int i2 = segmentWritableSegment$okio.limit + i;
/* 243 */           while (v != 0) {
/* 248 */               i2--;
/* 256 */               bArr[i2] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (v % 10)];
/* 258 */               v /= 10;
                    }
/* 260 */           if (z) {
/* 266 */               bArr[i2 - 1] = 45;
                    }
/* 271 */           segmentWritableSegment$okio.limit += i;
/* 279 */           setSize$okio(size() + ((long) i));
/* 282 */           return this;
                }

                @Override // okio.BufferedSink
                public Buffer writeHexadecimalUnsignedLong(long v) {
/* 5 */             if (v == 0) {
/* 9 */                 return writeByte(48);
                    }
/* 17 */            long j = (v >>> 1) | v;
/* 21 */            long j2 = j | (j >>> 2);
/* 25 */            long j3 = j2 | (j2 >>> 4);
/* 30 */            long j4 = j3 | (j3 >>> 8);
/* 35 */            long j5 = j4 | (j4 >>> 16);
/* 40 */            long j6 = j5 | (j5 >>> 32);
/* 49 */            long j7 = j6 - ((j6 >>> 1) & 6148914691236517205L);
/* 59 */            long j8 = ((j7 >>> 2) & 3689348814741910323L) + (j7 & 3689348814741910323L);
/* 68 */            long j9 = ((j8 >>> 4) + j8) & 1085102592571150095L;
/* 71 */            long j10 = j9 + (j9 >>> 8);
/* 74 */            long j11 = j10 + (j10 >>> 16);
/* 88 */            int i = (int) ((((j11 & 63) + ((j11 >>> 32) & 63)) + 3) / 4);
/* 89 */            Segment segmentWritableSegment$okio = writableSegment$okio(i);
/* 93 */            byte[] bArr = segmentWritableSegment$okio.data;
/* 95 */            int i2 = segmentWritableSegment$okio.limit;
/* 100 */           for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
/* 112 */               bArr[i3] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (15 & v)];
/* 114 */               v >>>= 4;
                    }
/* 121 */           segmentWritableSegment$okio.limit += i;
/* 129 */           setSize$okio(size() + ((long) i));
/* 132 */           return this;
                }

                @Override // okio.BufferedSink
                public Buffer writeInt(int i) {
/* 2 */             Segment segmentWritableSegment$okio = writableSegment$okio(4);
/* 6 */             byte[] bArr = segmentWritableSegment$okio.data;
/* 8 */             int i2 = segmentWritableSegment$okio.limit;
/* 17 */            bArr[i2] = (byte) ((i >>> 24) & 255);
/* 26 */            bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
/* 35 */            bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
/* 41 */            bArr[i2 + 3] = (byte) (i & 255);
/* 43 */            segmentWritableSegment$okio.limit = i2 + 4;
/* 52 */            setSize$okio(size() + 4);
/* 55 */            return this;
                }

                @Override // okio.BufferedSink
                public Buffer writeIntLe(int i) {
/* 5 */             return writeInt(SegmentedByteString.reverseBytes(i));
                }

                @Override // okio.BufferedSink
                public Buffer writeLong(long v) {
/* 3 */             Segment segmentWritableSegment$okio = writableSegment$okio(8);
/* 7 */             byte[] bArr = segmentWritableSegment$okio.data;
/* 9 */             int i = segmentWritableSegment$okio.limit;
/* 22 */            bArr[i] = (byte) ((v >>> 56) & 255);
/* 33 */            bArr[i + 1] = (byte) ((v >>> 48) & 255);
/* 44 */            bArr[i + 2] = (byte) ((v >>> 40) & 255);
/* 55 */            bArr[i + 3] = (byte) ((v >>> 32) & 255);
/* 66 */            bArr[i + 4] = (byte) ((v >>> 24) & 255);
/* 77 */            bArr[i + 5] = (byte) ((v >>> 16) & 255);
/* 86 */            bArr[i + 6] = (byte) ((v >>> 8) & 255);
/* 92 */            bArr[i + 7] = (byte) (v & 255);
/* 94 */            segmentWritableSegment$okio.limit = i + 8;
/* 103 */           setSize$okio(size() + 8);
/* 106 */           return this;
                }

                @Override // okio.BufferedSink
                public Buffer writeLongLe(long v) {
/* 5 */             return writeLong(SegmentedByteString.reverseBytes(v));
                }

                @Override // okio.BufferedSink
                public Buffer writeShort(int s) {
/* 2 */             Segment segmentWritableSegment$okio = writableSegment$okio(2);
/* 6 */             byte[] bArr = segmentWritableSegment$okio.data;
/* 8 */             int i = segmentWritableSegment$okio.limit;
/* 17 */            bArr[i] = (byte) ((s >>> 8) & 255);
/* 23 */            bArr[i + 1] = (byte) (s & 255);
/* 25 */            segmentWritableSegment$okio.limit = i + 2;
/* 34 */            setSize$okio(size() + 2);
/* 37 */            return this;
                }

                @Override // okio.BufferedSink
                public Buffer writeShortLe(int s) {
/* 6 */             return writeShort((int) SegmentedByteString.reverseBytes((short) s));
                }

                @Override // okio.BufferedSink
                public Buffer writeString(String string, int beginIndex, int endIndex, Charset charset) {
/* 1 */             string.getClass();
/* 4 */             charset.getClass();
/* 8 */             if (beginIndex < 0) {
/* 83 */                ds0.m3200q(fm0.m3781g(beginIndex, "beginIndex < 0: "));
/* 7 */                 return null;
                    }
/* 10 */            if (endIndex < beginIndex) {
/* 73 */                ds0.m3200q(AbstractC0886en.m3506j("endIndex < beginIndex: ", endIndex, beginIndex, " < "));
/* 7 */                 return null;
                    }
/* 16 */            if (endIndex > string.length()) {
/* 61 */                f42.m3652h(string.length(), fm0.m3793s(endIndex, "endIndex > string.length: ", " > "));
/* 7 */                 return null;
                    }
/* 24 */            if (Intrinsics.m6216a(charset, Charsets.UTF_8)) {
/* 26 */                return writeUtf8(string, beginIndex, endIndex);
                    }
/* 35 */            byte[] bytes = string.substring(beginIndex, endIndex).getBytes(charset);
/* 39 */            bytes.getClass();
/* 44 */            return write(bytes, 0, bytes.length);
                }

                public final Buffer writeTo(OutputStream out, long byteCount) throws IOException {
/* 1 */             out.getClass();
/* 9 */             SegmentedByteString.checkOffsetAndCount(this.size, 0L, byteCount);
/* 12 */            Segment segment = this.head;
/* 15 */            long j = byteCount;
/* 20 */            while (j > 0) {
/* 22 */                segment.getClass();
/* 35 */                int iMin = (int) Math.min(j, segment.limit - segment.pos);
/* 40 */                out.write(segment.data, segment.pos, iMin);
/* 45 */                int i = segment.pos + iMin;
/* 46 */                segment.pos = i;
                        long j2 = iMin;
/* 52 */                this.size -= j2;
/* 54 */                j -= j2;
/* 57 */                if (i == segment.limit) {
/* 59 */                    Segment segmentPop = segment.pop();
/* 63 */                    this.head = segmentPop;
/* 65 */                    SegmentPool.recycle(segment);
/* 68 */                    segment = segmentPop;
                        }
                    }
/* 70 */            return this;
                }

                @Override // okio.BufferedSink
                public Buffer writeUtf8(String string, int beginIndex, int endIndex) {
                    char cCharAt;
/* 1 */             string.getClass();
/* 5 */             if (beginIndex < 0) {
/* 319 */               ds0.m3200q(fm0.m3781g(beginIndex, "beginIndex < 0: "));
/* 4 */                 return null;
                    }
/* 7 */             if (endIndex < beginIndex) {
/* 309 */               ds0.m3200q(AbstractC0886en.m3506j("endIndex < beginIndex: ", endIndex, beginIndex, " < "));
/* 4 */                 return null;
                    }
/* 13 */            if (endIndex > string.length()) {
/* 297 */               f42.m3652h(string.length(), fm0.m3793s(endIndex, "endIndex > string.length: ", " > "));
/* 4 */                 return null;
                    }
/* 15 */            while (beginIndex < endIndex) {
/* 17 */                char cCharAt2 = string.charAt(beginIndex);
/* 23 */                if (cCharAt2 < 128) {
/* 26 */                    Segment segmentWritableSegment$okio = writableSegment$okio(1);
/* 30 */                    byte[] bArr = segmentWritableSegment$okio.data;
/* 34 */                    int i = segmentWritableSegment$okio.limit - beginIndex;
/* 37 */                    int iMin = Math.min(endIndex, 8192 - i);
/* 41 */                    int i2 = beginIndex + 1;
/* 45 */                    bArr[beginIndex + i] = (byte) cCharAt2;
                            while (true) {
/* 47 */                        beginIndex = i2;
/* 48 */                        if (beginIndex >= iMin || (cCharAt = string.charAt(beginIndex)) >= 128) {
                                    break;
                                }
/* 56 */                        i2 = beginIndex + 1;
/* 60 */                        bArr[beginIndex + i] = (byte) cCharAt;
                            }
/* 64 */                    int i3 = segmentWritableSegment$okio.limit;
/* 66 */                    int i4 = (i + beginIndex) - i3;
/* 68 */                    segmentWritableSegment$okio.limit = i3 + i4;
/* 76 */                    setSize$okio(size() + ((long) i4));
                        } else {
/* 82 */                    if (cCharAt2 < 2048) {
/* 85 */                        Segment segmentWritableSegment$okio2 = writableSegment$okio(2);
/* 89 */                        byte[] bArr2 = segmentWritableSegment$okio2.data;
/* 91 */                        int i5 = segmentWritableSegment$okio2.limit;
/* 98 */                        bArr2[i5] = (byte) ((cCharAt2 >> 6) | 192);
/* 106 */                       bArr2[i5 + 1] = (byte) ((cCharAt2 & '?') | 128);
/* 109 */                       segmentWritableSegment$okio2.limit = i5 + 2;
/* 118 */                       setSize$okio(size() + 2);
                            } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
/* 237 */                       Segment segmentWritableSegment$okio3 = writableSegment$okio(3);
/* 241 */                       byte[] bArr3 = segmentWritableSegment$okio3.data;
/* 243 */                       int i6 = segmentWritableSegment$okio3.limit;
/* 250 */                       bArr3[i6] = (byte) ((cCharAt2 >> '\f') | 224);
/* 259 */                       bArr3[i6 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
/* 267 */                       bArr3[i6 + 2] = (byte) ((cCharAt2 & '?') | 128);
/* 270 */                       segmentWritableSegment$okio3.limit = i6 + 3;
/* 279 */                       setSize$okio(size() + 3);
                            } else {
/* 137 */                       int i7 = beginIndex + 1;
/* 146 */                       char cCharAt3 = i7 < endIndex ? string.charAt(i7) : (char) 0;
/* 150 */                       if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
/* 230 */                           writeByte(63);
/* 233 */                           beginIndex = i7;
                                } else {
/* 171 */                           int i8 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
/* 173 */                           Segment segmentWritableSegment$okio4 = writableSegment$okio(4);
/* 177 */                           byte[] bArr4 = segmentWritableSegment$okio4.data;
/* 179 */                           int i9 = segmentWritableSegment$okio4.limit;
/* 186 */                           bArr4[i9] = (byte) ((i8 >> 18) | 240);
/* 195 */                           bArr4[i9 + 1] = (byte) (((i8 >> 12) & 63) | 128);
/* 204 */                           bArr4[i9 + 2] = (byte) (((i8 >> 6) & 63) | 128);
/* 211 */                           bArr4[i9 + 3] = (byte) ((i8 & 63) | 128);
/* 214 */                           segmentWritableSegment$okio4.limit = i9 + 4;
/* 223 */                           setSize$okio(size() + 4);
/* 226 */                           beginIndex += 2;
                                }
                            }
/* 121 */                   beginIndex++;
                        }
                    }
/* 284 */           return this;
                }

                @Override // okio.BufferedSink
                public Buffer writeUtf8CodePoint(int codePoint) {
/* 3 */             if (codePoint < 128) {
/* 5 */                 writeByte(codePoint);
/* 8 */                 return this;
                    }
/* 13 */            if (codePoint < 2048) {
/* 16 */                Segment segmentWritableSegment$okio = writableSegment$okio(2);
/* 20 */                byte[] bArr = segmentWritableSegment$okio.data;
/* 22 */                int i = segmentWritableSegment$okio.limit;
/* 29 */                bArr[i] = (byte) ((codePoint >> 6) | 192);
/* 36 */                bArr[i + 1] = (byte) ((codePoint & 63) | 128);
/* 39 */                segmentWritableSegment$okio.limit = i + 2;
/* 48 */                setSize$okio(size() + 2);
/* 51 */                return this;
                    }
/* 55 */            if (55296 <= codePoint && codePoint < 57344) {
/* 62 */                writeByte(63);
/* 65 */                return this;
                    }
/* 68 */            if (codePoint < 65536) {
/* 71 */                Segment segmentWritableSegment$okio2 = writableSegment$okio(3);
/* 75 */                byte[] bArr2 = segmentWritableSegment$okio2.data;
/* 77 */                int i2 = segmentWritableSegment$okio2.limit;
/* 84 */                bArr2[i2] = (byte) ((codePoint >> 12) | 224);
/* 93 */                bArr2[i2 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
/* 100 */               bArr2[i2 + 2] = (byte) ((codePoint & 63) | 128);
/* 103 */               segmentWritableSegment$okio2.limit = i2 + 3;
/* 112 */               setSize$okio(size() + 3);
/* 115 */               return this;
                    }
/* 119 */           if (codePoint > 1114111) {
/* 182 */               C1951n4.m6865p(SegmentedByteString.toHexString(codePoint), "Unexpected code point: 0x");
/* 185 */               return null;
                    }
/* 122 */           Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
/* 126 */           byte[] bArr3 = segmentWritableSegment$okio3.data;
/* 128 */           int i3 = segmentWritableSegment$okio3.limit;
/* 135 */           bArr3[i3] = (byte) ((codePoint >> 18) | 240);
/* 144 */           bArr3[i3 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
/* 153 */           bArr3[i3 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
/* 160 */           bArr3[i3 + 3] = (byte) ((codePoint & 63) | 128);
/* 163 */           segmentWritableSegment$okio3.limit = i3 + 4;
/* 172 */           setSize$okio(size() + 4);
/* 175 */           return this;
                }

/* 5 */         public Buffer clone() {
/* 6 */             return copy();
                }

                @Override // okio.BufferedSink
/* 5 */         public Buffer emit() {
/* 6 */             return this;
                }

                @Override // okio.BufferedSink
/* 5 */         public Buffer emitCompleteSegments() {
/* 6 */             return this;
                }

/* 8 */         public final UnsafeCursor readAndWriteUnsafe() {
/* 9 */             return readAndWriteUnsafe$default(this, null, 1, null);
                }

/* 8 */         public final UnsafeCursor readUnsafe() {
/* 9 */             return readUnsafe$default(this, null, 1, null);
                }

                @Override // okio.BufferedSource
/* 9 */         public String readUtf8(long byteCount) throws EOFException {
/* 10 */            return readString(byteCount, Charsets.UTF_8);
                }

/* 23 */        public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j, long j2, int i, Object obj) {
                    if ((i & 2) != 0) {
                        j = 0;
                    }
/* 24 */            return buffer.copyTo(buffer2, j, j2);
                }

/* 24 */        public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j, int i, Object obj) {
                    if ((i & 2) != 0) {
                        j = 0;
                    }
/* 25 */            return buffer.copyTo(buffer2, j);
                }

                @Override // okio.BufferedSource
/* 26 */        public void readFully(byte[] sink) throws EOFException {
                    sink.getClass();
                    int i = 0;
/* 27 */            while (i < sink.length) {
/* 28 */                int i2 = read(sink, i, sink.length - i);
                        if (i2 == -1) {
/* 29 */                    C1951n4.m6854b();
                            return;
                        }
                        i += i2;
                    }
                }

                @Override // okio.BufferedSource
/* 43 */        public byte[] readByteArray() {
/* 44 */            return readByteArray(size());
                }

                @Override // okio.BufferedSource
/* 56 */        public boolean rangeEquals(long offset, ByteString bytes) {
                    bytes.getClass();
/* 57 */            return rangeEquals(offset, bytes, 0, bytes.size());
                }

                @Override // okio.BufferedSource
/* 61 */        public ByteString readByteString() {
/* 62 */            return readByteString(size());
                }

                @Override // okio.BufferedSource
/* 64 */        public int read(byte[] sink) {
                    sink.getClass();
/* 65 */            return read(sink, 0, sink.length);
                }

                @Override // java.nio.channels.ReadableByteChannel
/* 65 */        public int read(ByteBuffer sink) throws IOException {
                    sink.getClass();
/* 66 */            Segment segment = this.head;
                    if (segment == null) {
                        return -1;
                    }
/* 67 */            int iMin = Math.min(sink.remaining(), segment.limit - segment.pos);
/* 68 */            sink.put(segment.data, segment.pos, iMin);
/* 69 */            int i = segment.pos + iMin;
                    segment.pos = i;
/* 70 */            this.size -= (long) iMin;
/* 71 */            if (i == segment.limit) {
/* 72 */                this.head = segment.pop();
/* 73 */                SegmentPool.recycle(segment);
                    }
                    return iMin;
                }

/* 69 */        public final Buffer readFrom(InputStream input, long byteCount) throws IOException {
                    input.getClass();
                    if (byteCount >= 0) {
/* 70 */                readFrom(input, byteCount, false);
                        return this;
                    }
/* 73 */            ds0.m3200q(pm2.m7488k("byteCount < 0: ", byteCount));
                    return null;
                }

/* 70 */        public final Buffer writeTo(OutputStream outputStream) throws IOException {
/* 71 */            outputStream.getClass();
                    return writeTo$default(this, outputStream, 0L, 2, null);
                }

                @Override // okio.Source
/* 73 */        public long read(Buffer sink, long byteCount) {
                    sink.getClass();
                    if (byteCount < 0) {
/* 79 */                ds0.m3200q(pm2.m7488k("byteCount < 0: ", byteCount));
                        return 0L;
                    }
                    if (size() == 0) {
                        return -1L;
                    }
                    if (byteCount > size()) {
                        byteCount = size();
                    }
/* 76 */            sink.write(this, byteCount);
                    return byteCount;
                }

/* 73 */        public final Buffer readFrom(InputStream input) throws IOException {
                    input.getClass();
/* 74 */            readFrom(input, Long.MAX_VALUE, true);
                    return this;
                }

                @Override // okio.BufferedSink
/* 87 */        public Buffer writeString(String string, Charset charset) {
                    string.getClass();
                    charset.getClass();
/* 89 */            return writeString(string, 0, string.length(), charset);
                }

/* 94 */        public final ByteString snapshot() {
                    if (size() <= 2147483647L) {
/* 96 */                return snapshot((int) size());
                    }
                    throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
                }

                @Override // okio.BufferedSource
/* 100 */       public String readString(Charset charset) {
                    charset.getClass();
/* 101 */           return readString(this.size, charset);
                }

/* 112 */       public final Buffer copyTo(OutputStream outputStream, long j) throws IOException {
/* 113 */           outputStream.getClass();
                    return copyTo$default(this, outputStream, j, 0L, 4, (Object) null);
                }

/* 113 */       public final Buffer copyTo(OutputStream out, long offset, long byteCount) throws IOException {
                    out.getClass();
                    long j = offset;
/* 114 */           SegmentedByteString.checkOffsetAndCount(this.size, j, byteCount);
                    if (byteCount != 0) {
/* 115 */               Segment segment = this.head;
                        while (true) {
/* 116 */                   segment.getClass();
                            int i = segment.limit;
                            int i2 = segment.pos;
                            if (j < i - i2) {
                                break;
                            }
                            j -= (long) (i - i2);
/* 117 */                   segment = segment.next;
                        }
                        Segment segment2 = segment;
                        long j2 = byteCount;
                        while (j2 > 0) {
/* 118 */                   segment2.getClass();
                            int i3 = (int) (((long) segment2.pos) + j);
/* 120 */                   int iMin = (int) Math.min(segment2.limit - i3, j2);
/* 121 */                   out.write(segment2.data, i3, iMin);
                            j2 -= (long) iMin;
/* 122 */                   segment2 = segment2.next;
                            j = 0;
                        }
                    }
                    return this;
                }

/* 122 */       public final Buffer copyTo(Buffer out, long offset) {
                    out.getClass();
/* 123 */           return copyTo(out, offset, this.size - offset);
                }

/* 123 */       public final Buffer copyTo(OutputStream outputStream) throws IOException {
/* 124 */           outputStream.getClass();
                    return copyTo$default(this, outputStream, 0L, 0L, 6, (Object) null);
                }

                @Override // okio.BufferedSource
/* 125 */       public String readUtf8LineStrict() throws EOFException {
/* 126 */           return readUtf8LineStrict(Long.MAX_VALUE);
                }

                @Override // java.nio.channels.WritableByteChannel
/* 189 */       public int write(ByteBuffer source) throws IOException {
                    source.getClass();
/* 190 */           int iRemaining = source.remaining();
                    int i = iRemaining;
                    while (i > 0) {
/* 191 */               Segment segmentWritableSegment$okio = writableSegment$okio(1);
/* 192 */               int iMin = Math.min(i, 8192 - segmentWritableSegment$okio.limit);
/* 193 */               source.get(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
                        i -= iMin;
/* 194 */               segmentWritableSegment$okio.limit += iMin;
                    }
/* 195 */           this.size += (long) iRemaining;
                    return iRemaining;
                }

                @Override // okio.BufferedSink
/* 195 */       public Buffer write(ByteString byteString) {
                    byteString.getClass();
/* 197 */           byteString.write$okio(this, 0, byteString.size());
                    return this;
                }

                @Override // okio.BufferedSink
/* 197 */       public Buffer write(ByteString byteString, int offset, int byteCount) {
                    byteString.getClass();
/* 198 */           byteString.write$okio(this, offset, byteCount);
                    return this;
                }

                @Override // okio.BufferedSink
/* 198 */       public Buffer write(byte[] source) {
                    source.getClass();
/* 199 */           return write(source, 0, source.length);
                }

                @Override // okio.BufferedSink
/* 199 */       public Buffer write(byte[] source, int offset, int byteCount) {
                    source.getClass();
                    long j = byteCount;
/* 200 */           SegmentedByteString.checkOffsetAndCount(source.length, offset, j);
                    int i = byteCount + offset;
                    while (offset < i) {
/* 201 */               Segment segmentWritableSegment$okio = writableSegment$okio(1);
/* 202 */               int iMin = Math.min(i - offset, 8192 - segmentWritableSegment$okio.limit);
                        int i2 = offset + iMin;
/* 205 */               C1960nd.m6964b(source, segmentWritableSegment$okio.limit, segmentWritableSegment$okio.data, offset, i2);
/* 206 */               segmentWritableSegment$okio.limit += iMin;
                        offset = i2;
                    }
/* 207 */           setSize$okio(size() + j);
                    return this;
                }

                @Override // okio.BufferedSink
/* 207 */       public Buffer write(Source source, long byteCount) throws IOException {
                    source.getClass();
                    while (byteCount > 0) {
/* 208 */               long j = source.read(this, byteCount);
                        if (j == -1) {
/* 209 */                   C1951n4.m6854b();
                            return null;
                        }
                        byteCount -= j;
                    }
                    return this;
                }

                @Override // okio.BufferedSource
/* 264 */       public long indexOf(byte b, long fromIndex) {
/* 265 */           return indexOf(b, fromIndex, Long.MAX_VALUE);
                }

                @Override // okio.BufferedSource
/* 265 */       public long indexOf(ByteString bytes) throws IOException {
                    bytes.getClass();
/* 266 */           return indexOf(bytes, 0L);
                }

                @Override // okio.BufferedSource
/* 266 */       public long indexOf(byte b, long fromIndex, long toIndex) {
                    Segment segment;
                    int i;
                    long size = 0;
                    if (0 > fromIndex || fromIndex > toIndex) {
                        throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
                    }
                    if (toIndex > size()) {
                        toIndex = size();
                    }
                    if (fromIndex == toIndex || (segment = this.head) == null) {
                        return -1L;
                    }
                    if (size() - fromIndex < fromIndex) {
/* 270 */               size = size();
                        while (size > fromIndex) {
/* 271 */                   segment = segment.prev;
                            segment.getClass();
/* 272 */                   size -= (long) (segment.limit - segment.pos);
                        }
                        while (size < toIndex) {
/* 273 */                   byte[] bArr = segment.data;
/* 274 */                   int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + toIndex) - size);
/* 275 */                   i = (int) ((((long) segment.pos) + fromIndex) - size);
                            while (i < iMin) {
/* 276 */                       if (bArr[i] != b) {
                                    i++;
                                }
                            }
/* 278 */                   size += (long) (segment.limit - segment.pos);
/* 279 */                   segment = segment.next;
                            segment.getClass();
                            fromIndex = size;
                        }
                        return -1L;
                    }
                    while (true) {
/* 280 */               long j = ((long) (segment.limit - segment.pos)) + size;
                        if (j > fromIndex) {
                            break;
                        }
/* 281 */               segment = segment.next;
                        segment.getClass();
                        size = j;
                    }
                    while (size < toIndex) {
/* 282 */               byte[] bArr2 = segment.data;
/* 283 */               int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + toIndex) - size);
/* 284 */               i = (int) ((((long) segment.pos) + fromIndex) - size);
                        while (i < iMin2) {
/* 285 */                   if (bArr2[i] != b) {
                                i++;
                            }
                        }
/* 286 */               size += (long) (segment.limit - segment.pos);
/* 287 */               segment = segment.next;
                        segment.getClass();
                        fromIndex = size;
                    }
                    return -1L;
/* 277 */           return ((long) (i - segment.pos)) + size;
                }

                @Override // okio.BufferedSource
/* 288 */       public long indexOf(byte b) {
/* 289 */           return indexOf(b, 0L, Long.MAX_VALUE);
                }

                @Override // okio.BufferedSource
/* 315 */       public long indexOfElement(ByteString targetBytes) {
                    targetBytes.getClass();
/* 316 */           return indexOfElement(targetBytes, 0L);
                }

                @Override // okio.BufferedSink
/* 323 */       public Buffer writeUtf8(String string) {
                    string.getClass();
/* 324 */           return writeUtf8(string, 0, string.length());
                }
            }
