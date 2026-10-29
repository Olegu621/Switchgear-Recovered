            package okhttp3.internal.http2;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.io.Closeable;
            import java.io.EOFException;
            import java.io.IOException;
            import java.util.List;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.ranges.C1847a;
            import okhttp3.HttpUrl;
            import okhttp3.internal.Util;
            import okio.Buffer;
            import okio.BufferedSource;
            import okio.ByteString;
            import okio.Source;
            import okio.Timeout;
            import p000.AbstractC0208c9;
            import p000.AbstractC0886en;
            import p000.ds0;
            import p000.r02;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 #2\u00020\u0001:\u0003#$%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J(\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010 \u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010!\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J(\u0010\"\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m6176d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "client", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokio/BufferedSource;Z)V", "continuation", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "hpackReader", "Lokhttp3/internal/http2/Hpack$Reader;", "close", HttpUrl.FRAGMENT_ENCODE_SET, "nextFrame", "requireSettings", "handler", "Lokhttp3/internal/http2/Http2Reader$Handler;", "readConnectionPreface", "readData", "length", HttpUrl.FRAGMENT_ENCODE_SET, "flags", "streamId", "readGoAway", "readHeaderBlock", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "padding", "readHeaders", "readPing", "readPriority", "readPushPromise", "readRstStream", "readSettings", "readWindowUpdate", "Companion", "ContinuationSource", "Handler", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class Http2Reader implements Closeable {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final Logger logger;
                private final boolean client;
                private final ContinuationSource continuation;
                private final Hpack.Reader hpackReader;
                private final BufferedSource source;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020 H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\n¨\u0006!"}, m6176d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lokio/Source;", FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "(Lokio/BufferedSource;)V", "flags", HttpUrl.FRAGMENT_ENCODE_SET, "getFlags", "()I", "setFlags", "(I)V", "left", "getLeft", "setLeft", "length", "getLength", "setLength", "padding", "getPadding", "setPadding", "streamId", "getStreamId", "setStreamId", "close", HttpUrl.FRAGMENT_ENCODE_SET, "read", HttpUrl.FRAGMENT_ENCODE_SET, "sink", "Lokio/Buffer;", "byteCount", "readContinuationHeader", "timeout", "Lokio/Timeout;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class ContinuationSource implements Source {
                    private int flags;
                    private int left;
                    private int length;
                    private int padding;
                    private final BufferedSource source;
                    private int streamId;

                    public ContinuationSource(BufferedSource bufferedSource) {
/* 1 */                 bufferedSource.getClass();
/* 7 */                 this.source = bufferedSource;
                    }

                    private final void readContinuationHeader() throws IOException {
/* 1 */                 int i = this.streamId;
/* 5 */                 int medium = Util.readMedium(this.source);
/* 9 */                 this.left = medium;
/* 11 */                this.length = medium;
/* 21 */                int iAnd = Util.and(this.source.readByte(), 255);
/* 35 */                this.flags = Util.and(this.source.readByte(), 255);
/* 37 */                Companion companion = Http2Reader.INSTANCE;
/* 49 */                if (companion.getLogger().isLoggable(Level.FINE)) {
/* 68 */                    companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
                        }
/* 80 */                int i2 = this.source.readInt() & AbstractC0208c9.API_PRIORITY_OTHER;
/* 81 */                this.streamId = i2;
/* 85 */                if (iAnd == 9) {
/* 87 */                    if (i2 == i) {
/* 89 */                        return;
                            }
/* 92 */                    ds0.m3195l("TYPE_CONTINUATION streamId changed");
                        } else {
/* 118 */                   throw new IOException(iAnd + " != TYPE_CONTINUATION");
                        }
                    }

                    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
                    }

                    public final int getFlags() {
/* 1 */                 return this.flags;
                    }

                    public final int getLeft() {
/* 1 */                 return this.left;
                    }

                    public final int getLength() {
/* 1 */                 return this.length;
                    }

                    public final int getPadding() {
/* 1 */                 return this.padding;
                    }

                    public final int getStreamId() {
/* 1 */                 return this.streamId;
                    }

                    @Override // okio.Source
                    public long read(Buffer sink, long byteCount) throws IOException {
/* 1 */                 sink.getClass();
                        while (true) {
/* 4 */                     int i = this.left;
/* 6 */                     BufferedSource bufferedSource = this.source;
/* 10 */                    if (i != 0) {
/* 37 */                        long j = bufferedSource.read(sink, Math.min(byteCount, i));
/* 43 */                        if (j == -1) {
/* 8 */                             return -1L;
                                }
/* 50 */                        this.left -= (int) j;
/* 52 */                        return j;
                            }
/* 15 */                    bufferedSource.skip(this.padding);
/* 19 */                    this.padding = 0;
/* 25 */                    if ((this.flags & 4) != 0) {
/* 8 */                         return -1L;
                            }
/* 28 */                    readContinuationHeader();
                        }
                    }

                    public final void setFlags(int i) {
/* 1 */                 this.flags = i;
                    }

                    public final void setLeft(int i) {
/* 1 */                 this.left = i;
                    }

                    public final void setLength(int i) {
/* 1 */                 this.length = i;
                    }

                    public final void setPadding(int i) {
/* 1 */                 this.padding = i;
                    }

                    public final void setStreamId(int i) {
/* 1 */                 this.streamId = i;
                    }

                    @Override // okio.Source
                    /* JADX INFO: renamed from: timeout */
                    public Timeout getTimeout() {
/* 3 */                 return this.source.getTimeout();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J8\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&J(\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H&J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nH&J.\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&J \u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H&J(\u0010#\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0011H&J&\u0010'\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0018\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020-H&J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u000eH&¨\u00060"}, m6176d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", HttpUrl.FRAGMENT_ENCODE_SET, "ackSettings", HttpUrl.FRAGMENT_ENCODE_SET, "alternateService", "streamId", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.ORIGIN, HttpUrl.FRAGMENT_ENCODE_SET, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, "Lokio/ByteString;", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT, "maxAge", HttpUrl.FRAGMENT_ENCODE_SET, SharedDataContentProvider.BASE_PATH, "inFinished", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "length", "goAway", "lastGoodStreamId", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "debugData", "headers", "associatedStreamId", "headerBlock", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "ping", "ack", "payload1", "payload2", "priority", "streamDependency", "weight", "exclusive", "pushPromise", "promisedStreamId", "requestHeaders", "rstStream", "settings", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "windowUpdate", "windowSizeIncrement", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public interface Handler {
                    void ackSettings();

                    void alternateService(int streamId, String origin, ByteString protocol, String host, int port, long maxAge);

                    void data(boolean inFinished, int streamId, BufferedSource source, int length) throws IOException;

                    void goAway(int lastGoodStreamId, ErrorCode errorCode, ByteString debugData);

                    void headers(boolean inFinished, int streamId, int associatedStreamId, List<Header> headerBlock);

                    void ping(boolean ack, int payload1, int payload2);

                    void priority(int streamId, int streamDependency, int weight, boolean exclusive);

                    void pushPromise(int streamId, int promisedStreamId, List<Header> requestHeaders) throws IOException;

                    void rstStream(int streamId, ErrorCode errorCode);

                    void settings(boolean clearPrevious, Settings settings);

                    void windowUpdate(int streamId, long windowSizeIncrement);
                }

                static {
/* 15 */            Logger logger2 = Logger.getLogger(Http2.class.getName());
/* 19 */            logger2.getClass();
/* 22 */            logger = logger2;
                }

                public Http2Reader(BufferedSource bufferedSource, boolean z) {
/* 1 */             bufferedSource.getClass();
/* 7 */             this.source = bufferedSource;
/* 9 */             this.client = z;
/* 13 */            ContinuationSource continuationSource = new ContinuationSource(bufferedSource);
/* 16 */            this.continuation = continuationSource;
/* 28 */            this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
                }

                private final void readData(Handler handler, int length, int flags, int streamId) throws IOException {
/* 1 */             if (streamId == 0) {
/* 57 */                ds0.m3195l("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
/* 60 */                return;
                    }
/* 10 */            boolean z = (flags & 1) != 0;
/* 13 */            if ((flags & 32) != 0) {
/* 51 */                ds0.m3195l("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
/* 54 */                return;
                    }
/* 27 */            int iAnd = (flags & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
/* 39 */            handler.data(z, streamId, this.source, INSTANCE.lengthWithoutPadding(length, flags, iAnd));
/* 45 */            this.source.skip(iAnd);
                }

                private final void readGoAway(Handler handler, int length, int flags, int streamId) throws IOException {
/* 3 */             if (length < 8) {
/* 73 */                ds0.m3195l(Intrinsics.m6219d(Integer.valueOf(length), "TYPE_GOAWAY length < 8: "));
/* 76 */                return;
                    }
/* 5 */             if (streamId != 0) {
/* 59 */                ds0.m3195l("TYPE_GOAWAY streamId != 0");
/* 62 */                return;
                    }
/* 9 */             int i = this.source.readInt();
/* 15 */            int i2 = this.source.readInt();
/* 19 */            int i3 = length - 8;
/* 22 */            ErrorCode errorCodeFromHttp2 = ErrorCode.INSTANCE.fromHttp2(i2);
/* 26 */            if (errorCodeFromHttp2 == null) {
/* 53 */                ds0.m3195l(Intrinsics.m6219d(Integer.valueOf(i2), "TYPE_GOAWAY unexpected error code: "));
/* 56 */                return;
                    }
/* 28 */            ByteString byteString = ByteString.EMPTY;
/* 30 */            if (i3 > 0) {
/* 35 */                byteString = this.source.readByteString(i3);
                    }
/* 39 */            handler.goAway(i, errorCodeFromHttp2, byteString);
                }

                private final List<Header> readHeaderBlock(int length, int padding, int flags, int streamId) throws IOException {
/* 3 */             this.continuation.setLeft(length);
/* 6 */             ContinuationSource continuationSource = this.continuation;
/* 12 */            continuationSource.setLength(continuationSource.getLeft());
/* 17 */            this.continuation.setPadding(padding);
/* 22 */            this.continuation.setFlags(flags);
/* 27 */            this.continuation.setStreamId(streamId);
/* 32 */            this.hpackReader.readHeaders();
/* 37 */            return this.hpackReader.getAndResetHeaderList();
                }

                private final void readHeaders(Handler handler, int length, int flags, int streamId) throws IOException {
/* 1 */             if (streamId == 0) {
/* 53 */                ds0.m3195l("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
/* 56 */                return;
                    }
/* 10 */            boolean z = (flags & 1) != 0;
/* 23 */            int iAnd = (flags & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
/* 29 */            if ((flags & 32) != 0) {
/* 31 */                readPriority(handler, streamId);
/* 34 */                length -= 5;
                    }
/* 47 */            handler.headers(z, streamId, -1, readHeaderBlock(INSTANCE.lengthWithoutPadding(length, flags, iAnd), iAnd, flags, streamId));
                }

                private final void readPing(Handler handler, int length, int flags, int streamId) throws IOException {
/* 3 */             if (length != 8) {
/* 45 */                ds0.m3195l(Intrinsics.m6219d(Integer.valueOf(length), "TYPE_PING length != 8: "));
                    } else {
/* 5 */                 if (streamId != 0) {
/* 31 */                    ds0.m3195l("TYPE_PING streamId != 0");
/* 34 */                    return;
                        }
/* 25 */                handler.ping((flags & 1) != 0, this.source.readInt(), this.source.readInt());
                    }
                }

                private final void readPriority(Handler handler, int streamId) throws IOException {
/* 3 */             int i = this.source.readInt();
/* 33 */            handler.priority(streamId, i & AbstractC0208c9.API_PRIORITY_OTHER, Util.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & i) != 0);
                }

                private final void readPushPromise(Handler handler, int length, int flags, int streamId) throws IOException {
/* 1 */             if (streamId == 0) {
/* 49 */                ds0.m3195l("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    } else {
/* 20 */                int iAnd = (flags & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
/* 43 */                handler.pushPromise(streamId, this.source.readInt() & AbstractC0208c9.API_PRIORITY_OTHER, readHeaderBlock(INSTANCE.lengthWithoutPadding(length - 4, flags, iAnd), iAnd, flags, streamId));
                    }
                }

                private final void readRstStream(Handler handler, int length, int flags, int streamId) throws IOException {
/* 2 */             if (length != 4) {
/* 52 */                ds0.m3195l(AbstractC0886en.m3505i(length, "TYPE_RST_STREAM length: ", " != 4"));
/* 55 */                return;
                    }
/* 4 */             if (streamId == 0) {
/* 40 */                ds0.m3195l("TYPE_RST_STREAM streamId == 0");
/* 43 */                return;
                    }
/* 8 */             int i = this.source.readInt();
/* 14 */            ErrorCode errorCodeFromHttp2 = ErrorCode.INSTANCE.fromHttp2(i);
/* 18 */            if (errorCodeFromHttp2 != null) {
/* 20 */                handler.rstStream(streamId, errorCodeFromHttp2);
                    } else {
/* 34 */                ds0.m3195l(Intrinsics.m6219d(Integer.valueOf(i), "TYPE_RST_STREAM unexpected error code: "));
                    }
                }

                private final void readSettings(Handler handler, int length, int flags, int streamId) throws IOException {
/* 1 */             if (streamId != 0) {
/* 161 */               ds0.m3195l("TYPE_SETTINGS streamId != 0");
/* 164 */               return;
                    }
/* 5 */             if ((flags & 1) != 0) {
/* 7 */                 if (length == 0) {
/* 9 */                     handler.ackSettings();
/* 12 */                    return;
                        } else {
/* 15 */                    ds0.m3195l("FRAME_SIZE_ERROR ack frame should be empty!");
/* 18 */                    return;
                        }
                    }
/* 21 */            if (length % 6 != 0) {
/* 155 */               ds0.m3195l(Intrinsics.m6219d(Integer.valueOf(length), "TYPE_SETTINGS length % 6 != 0: "));
/* 158 */               return;
                    }
/* 25 */            Settings settings = new Settings();
/* 34 */            C1847a c1847aM8047d = r02.m8047d(r02.m8048e(0, length), 6);
/* 38 */            int i = c1847aM8047d.f12926a;
/* 40 */            int i2 = c1847aM8047d.f12927b;
/* 42 */            int i3 = c1847aM8047d.f12928c;
/* 44 */            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                        while (true) {
/* 52 */                    int i4 = i + i3;
/* 63 */                    int iAnd = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
/* 69 */                    int i5 = this.source.readInt();
/* 74 */                    if (iAnd != 2) {
/* 78 */                        if (iAnd == 3) {
/* 120 */                           iAnd = 4;
                                } else if (iAnd != 4) {
/* 83 */                            if (iAnd == 5 && (i5 < 16384 || i5 > 16777215)) {
/* 106 */                               ds0.m3195l(Intrinsics.m6219d(Integer.valueOf(i5), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
/* 109 */                               return;
                                    }
                                } else {
/* 110 */                           if (i5 < 0) {
/* 116 */                               ds0.m3195l("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
/* 119 */                               return;
                                    }
/* 112 */                           iAnd = 7;
                                }
                            } else if (i5 != 0 && i5 != 1) {
/* 129 */                       ds0.m3195l("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
/* 132 */                       return;
                            }
/* 133 */                   settings.set(iAnd, i5);
/* 136 */                   if (i != i2) {
/* 139 */                       i = i4;
                            }
                        }
                    }
/* 141 */           handler.settings(false, settings);
                }

                private final void readWindowUpdate(Handler handler, int length, int flags, int streamId) throws IOException {
/* 2 */             if (length != 4) {
/* 43 */                ds0.m3195l(Intrinsics.m6219d(Integer.valueOf(length), "TYPE_WINDOW_UPDATE length !=4: "));
/* 46 */                return;
                    }
/* 13 */            long jAnd = Util.and(this.source.readInt(), 2147483647L);
/* 21 */            if (jAnd != 0) {
/* 23 */                handler.windowUpdate(streamId, jAnd);
                    } else {
/* 29 */                ds0.m3195l("windowSizeIncrement was 0");
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
/* 3 */             this.source.close();
                }

                public final boolean nextFrame(boolean requireSettings, Handler handler) throws IOException {
/* 1 */             handler.getClass();
                    try {
/* 9 */                 this.source.require(9L);
/* 14 */                int medium = Util.readMedium(this.source);
/* 20 */                if (medium > 16384) {
/* 154 */                   ds0.m3195l(Intrinsics.m6219d(Integer.valueOf(medium), "FRAME_SIZE_ERROR: "));
/* 4 */                     return false;
                        }
/* 30 */                int iAnd = Util.and(this.source.readByte(), 255);
/* 40 */                int iAnd2 = Util.and(this.source.readByte(), 255);
/* 53 */                int i = this.source.readInt() & AbstractC0208c9.API_PRIORITY_OTHER;
/* 55 */                Logger logger2 = logger;
/* 63 */                if (logger2.isLoggable(Level.FINE)) {
/* 72 */                    logger2.fine(Http2.INSTANCE.frameLog(true, i, medium, iAnd, iAnd2));
                        }
/* 75 */                if (requireSettings && iAnd != 4) {
/* 93 */                    ds0.m3195l(Intrinsics.m6219d(Http2.INSTANCE.formattedType$okhttp(iAnd), "Expected a SETTINGS frame but was "));
/* 4 */                     return false;
                        }
                        switch (iAnd) {
                            case 0:
/* 139 */                       readData(handler, medium, iAnd2, i);
/* 142 */                       return true;
                            case 1:
/* 135 */                       readHeaders(handler, medium, iAnd2, i);
/* 142 */                       return true;
                            case 2:
/* 131 */                       readPriority(handler, medium, iAnd2, i);
/* 142 */                       return true;
                            case 3:
/* 127 */                       readRstStream(handler, medium, iAnd2, i);
/* 142 */                       return true;
                            case 4:
/* 123 */                       readSettings(handler, medium, iAnd2, i);
/* 142 */                       return true;
                            case 5:
/* 119 */                       readPushPromise(handler, medium, iAnd2, i);
/* 142 */                       return true;
                            case 6:
/* 115 */                       readPing(handler, medium, iAnd2, i);
/* 142 */                       return true;
                            case 7:
/* 111 */                       readGoAway(handler, medium, iAnd2, i);
/* 142 */                       return true;
                            case 8:
/* 107 */                       readWindowUpdate(handler, medium, iAnd2, i);
/* 142 */                       return true;
                            default:
/* 103 */                       this.source.skip(medium);
/* 142 */                       return true;
                        }
                    } catch (EOFException unused) {
                    }
                }

                public final void readConnectionPreface(Handler handler) throws IOException {
/* 1 */             handler.getClass();
/* 6 */             if (this.client) {
/* 13 */                if (nextFrame(true, handler)) {
/* 71 */                    return;
                        }
/* 18 */                ds0.m3195l("Required SETTINGS preface not received");
/* 21 */                return;
                    }
/* 22 */            BufferedSource bufferedSource = this.source;
/* 24 */            ByteString byteString = Http2.CONNECTION_PREFACE;
/* 31 */            ByteString byteString2 = bufferedSource.readByteString(byteString.size());
/* 35 */            Logger logger2 = logger;
/* 43 */            if (logger2.isLoggable(Level.FINE)) {
/* 62 */                logger2.fine(Util.format(Intrinsics.m6219d(byteString2.hex(), "<< CONNECTION "), new Object[0]));
                    }
/* 69 */            if (Intrinsics.m6216a(byteString, byteString2)) {
/* 71 */                return;
                    }
/* 82 */            ds0.m3195l(Intrinsics.m6219d(byteString2.utf8(), "Expected a connection header but was "));
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m6176d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "lengthWithoutPadding", HttpUrl.FRAGMENT_ENCODE_SET, "length", "flags", "padding", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final Logger getLogger() {
/* 1 */                 return Http2Reader.logger;
                    }

                    public final int lengthWithoutPadding(int length, int flags, int padding) throws IOException {
/* 3 */                 if ((flags & 8) != 0) {
/* 5 */                     length--;
                        }
/* 7 */                 if (padding <= length) {
/* 9 */                     return length - padding;
                        }
/* 19 */                ds0.m3195l(AbstractC0886en.m3506j("PROTOCOL_ERROR padding ", padding, length, " > remaining length "));
/* 22 */                return 0;
                    }

/* 4 */             private Companion() {
                    }
                }

/* 36 */        private final void readPriority(Handler handler, int length, int flags, int streamId) throws IOException {
                    if (length != 5) {
/* 41 */                ds0.m3195l(AbstractC0886en.m3505i(length, "TYPE_PRIORITY length: ", " != 5"));
                    } else if (streamId != 0) {
/* 37 */                readPriority(handler, streamId);
                    } else {
/* 38 */                ds0.m3195l("TYPE_PRIORITY streamId == 0");
                    }
                }
            }
