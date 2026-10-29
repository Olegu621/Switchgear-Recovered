            package okhttp3.internal.http2;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.io.Closeable;
            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.net.Socket;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import okhttp3.internal.Util;
            import okhttp3.internal.concurrent.Task;
            import okhttp3.internal.concurrent.TaskQueue;
            import okhttp3.internal.concurrent.TaskRunner;
            import okhttp3.internal.platform.Platform;
            import okio.Buffer;
            import okio.BufferedSink;
            import okio.BufferedSource;
            import okio.ByteString;
            import okio.Okio;
            import p000.f22;
            import p000.f42;
            import p000.h22;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u0099\u00012\u00020\u0001:\b\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010P\u001a\u00020QJ\b\u0010R\u001a\u00020QH\u0016J'\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020T2\b\u0010V\u001a\u0004\u0018\u00010WH\u0000¢\u0006\u0002\bXJ\u0012\u0010Y\u001a\u00020Q2\b\u0010Z\u001a\u0004\u0018\u00010WH\u0002J\u0006\u0010[\u001a\u00020QJ\u0010\u0010\\\u001a\u0004\u0018\u00010B2\u0006\u0010]\u001a\u00020\u0012J\u000e\u0010^\u001a\u00020\t2\u0006\u0010_\u001a\u00020\u0006J&\u0010`\u001a\u00020B2\u0006\u0010a\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010e\u001a\u00020\tH\u0002J\u001c\u0010`\u001a\u00020B2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010e\u001a\u00020\tJ\u0006\u0010f\u001a\u00020\u0012J-\u0010g\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020\u00122\u0006\u0010l\u001a\u00020\tH\u0000¢\u0006\u0002\bmJ+\u0010n\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010l\u001a\u00020\tH\u0000¢\u0006\u0002\boJ#\u0010p\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0cH\u0000¢\u0006\u0002\bqJ\u001d\u0010r\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010s\u001a\u00020TH\u0000¢\u0006\u0002\btJ$\u0010u\u001a\u00020B2\u0006\u0010a\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010e\u001a\u00020\tJ\u0015\u0010v\u001a\u00020\t2\u0006\u0010h\u001a\u00020\u0012H\u0000¢\u0006\u0002\bwJ\u0017\u0010x\u001a\u0004\u0018\u00010B2\u0006\u0010h\u001a\u00020\u0012H\u0000¢\u0006\u0002\byJ\r\u0010z\u001a\u00020QH\u0000¢\u0006\u0002\b{J\u000e\u0010|\u001a\u00020Q2\u0006\u0010}\u001a\u00020&J\u000e\u0010~\u001a\u00020Q2\u0006\u0010\u007f\u001a\u00020TJ\u001e\u0010\u0080\u0001\u001a\u00020Q2\t\b\u0002\u0010\u0081\u0001\u001a\u00020\t2\b\b\u0002\u0010E\u001a\u00020FH\u0007J\u0018\u0010\u0082\u0001\u001a\u00020Q2\u0007\u0010\u0083\u0001\u001a\u00020\u0006H\u0000¢\u0006\u0003\b\u0084\u0001J,\u0010\u0085\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0007\u0010\u0086\u0001\u001a\u00020\t2\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u00012\u0006\u0010k\u001a\u00020\u0006J/\u0010\u0089\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0007\u0010\u0086\u0001\u001a\u00020\t2\r\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020d0cH\u0000¢\u0006\u0003\b\u008b\u0001J\u0007\u0010\u008c\u0001\u001a\u00020QJ\"\u0010\u008c\u0001\u001a\u00020Q2\u0007\u0010\u008d\u0001\u001a\u00020\t2\u0007\u0010\u008e\u0001\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020\u0012J\u0007\u0010\u0090\u0001\u001a\u00020QJ\u001f\u0010\u0091\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010\u007f\u001a\u00020TH\u0000¢\u0006\u0003\b\u0092\u0001J\u001f\u0010\u0093\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010s\u001a\u00020TH\u0000¢\u0006\u0003\b\u0094\u0001J \u0010\u0095\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0007\u0010\u0096\u0001\u001a\u00020\u0006H\u0000¢\u0006\u0003\b\u0097\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010\u001dR\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010(\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001e\u00105\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0015\u00107\u001a\u000608R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u000e\u0010;\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u00020=X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020B0AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010G\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u001e\u0010I\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bJ\u00104R\u0011\u0010K\u001a\u00020L¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u000e\u0010O\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u009c\u0001"}, m6176d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "builder", "Lokhttp3/internal/http2/Http2Connection$Builder;", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "awaitPingsSent", HttpUrl.FRAGMENT_ENCODE_SET, "awaitPongsReceived", "client", HttpUrl.FRAGMENT_ENCODE_SET, "getClient$okhttp", "()Z", "connectionName", HttpUrl.FRAGMENT_ENCODE_SET, "getConnectionName$okhttp", "()Ljava/lang/String;", "currentPushRequests", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "degradedPingsSent", "degradedPongDeadlineNs", "degradedPongsReceived", "intervalPingsSent", "intervalPongsReceived", "isShutdown", "lastGoodStreamId", "getLastGoodStreamId$okhttp", "()I", "setLastGoodStreamId$okhttp", "(I)V", "listener", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "nextStreamId", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "okHttpSettings", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "peerSettings", "getPeerSettings", "setPeerSettings", "(Lokhttp3/internal/http2/Settings;)V", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "pushQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "<set-?>", "readBytesAcknowledged", "getReadBytesAcknowledged", "()J", "readBytesTotal", "getReadBytesTotal", "readerRunnable", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "settingsListenerQueue", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "streams", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Http2Stream;", "getStreams$okhttp", "()Ljava/util/Map;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "writeBytesMaximum", "getWriteBytesMaximum", "writeBytesTotal", "getWriteBytesTotal", "writer", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "writerQueue", "awaitPong", HttpUrl.FRAGMENT_ENCODE_SET, "close", "connectionCode", "Lokhttp3/internal/http2/ErrorCode;", "streamCode", "cause", "Ljava/io/IOException;", "close$okhttp", "failConnection", "e", "flush", "getStream", "id", "isHealthy", "nowNs", "newStream", "associatedStreamId", "requestHeaders", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "out", "openStreamCount", "pushDataLater", "streamId", FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "byteCount", "inFinished", "pushDataLater$okhttp", "pushHeadersLater", "pushHeadersLater$okhttp", "pushRequestLater", "pushRequestLater$okhttp", "pushResetLater", "errorCode", "pushResetLater$okhttp", "pushStream", "pushedStream", "pushedStream$okhttp", "removeStream", "removeStream$okhttp", "sendDegradedPingLater", "sendDegradedPingLater$okhttp", "setSettings", "settings", "shutdown", "statusCode", "start", "sendConnectionPreface", "updateConnectionFlowControl", "read", "updateConnectionFlowControl$okhttp", "writeData", "outFinished", "buffer", "Lokio/Buffer;", "writeHeaders", "alternating", "writeHeaders$okhttp", "writePing", "reply", "payload1", "payload2", "writePingAndAwaitPong", "writeSynReset", "writeSynReset$okhttp", "writeSynResetLater", "writeSynResetLater$okhttp", "writeWindowUpdateLater", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "Builder", "Companion", "Listener", "ReaderRunnable", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class Http2Connection implements Closeable {
                public static final int AWAIT_PING = 3;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final Settings DEFAULT_SETTINGS;
                public static final int DEGRADED_PING = 2;
                public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
                public static final int INTERVAL_PING = 1;
                public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
                private long awaitPingsSent;
                private long awaitPongsReceived;
                private final boolean client;
                private final String connectionName;
                private final Set<Integer> currentPushRequests;
                private long degradedPingsSent;
                private long degradedPongDeadlineNs;
                private long degradedPongsReceived;
                private long intervalPingsSent;
                private long intervalPongsReceived;
                private boolean isShutdown;
                private int lastGoodStreamId;
                private final Listener listener;
                private int nextStreamId;
                private final Settings okHttpSettings;
                private Settings peerSettings;
                private final PushObserver pushObserver;
                private final TaskQueue pushQueue;
                private long readBytesAcknowledged;
                private long readBytesTotal;
                private final ReaderRunnable readerRunnable;
                private final TaskQueue settingsListenerQueue;
                private final Socket socket;
                private final Map<Integer, Http2Stream> streams;
                private final TaskRunner taskRunner;
                private long writeBytesMaximum;
                private long writeBytesTotal;
                private final Http2Writer writer;
                private final TaskQueue writerQueue;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, m6176d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "onSettings", HttpUrl.FRAGMENT_ENCODE_SET, "connection", "Lokhttp3/internal/http2/Http2Connection;", "settings", "Lokhttp3/internal/http2/Settings;", "onStream", "stream", "Lokhttp3/internal/http2/Http2Stream;", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static abstract class Listener {
                    public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
                        @Override // okhttp3.internal.http2.Http2Connection.Listener
                        public void onStream(Http2Stream stream) throws IOException {
/* 1 */                     stream.getClass();
/* 7 */                     stream.close(ErrorCode.REFUSED_STREAM, null);
                        }
                    };

                    public void onSettings(Http2Connection connection, Settings settings) {
/* 1 */                 connection.getClass();
/* 4 */                 settings.getClass();
                    }

                    public abstract void onStream(Http2Stream stream) throws IOException;
                }

                static {
/* 11 */            Settings settings = new Settings();
/* 18 */            settings.set(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
/* 24 */            settings.set(5, Http2.INITIAL_MAX_FRAME_SIZE);
/* 27 */            DEFAULT_SETTINGS = settings;
                }

                public Http2Connection(Builder builder) {
/* 1 */             builder.getClass();
/* 7 */             boolean client = builder.getClient();
/* 11 */            this.client = client;
/* 17 */            this.listener = builder.getListener();
/* 24 */            this.streams = new LinkedHashMap();
/* 26 */            String connectionName$okhttp = builder.getConnectionName$okhttp();
/* 30 */            this.connectionName = connectionName$okhttp;
/* 41 */            this.nextStreamId = builder.getClient() ? 3 : 2;
/* 43 */            TaskRunner taskRunner = builder.getTaskRunner();
/* 47 */            this.taskRunner = taskRunner;
/* 49 */            TaskQueue taskQueueNewQueue = taskRunner.newQueue();
/* 53 */            this.writerQueue = taskQueueNewQueue;
/* 59 */            this.pushQueue = taskRunner.newQueue();
/* 65 */            this.settingsListenerQueue = taskRunner.newQueue();
/* 71 */            this.pushObserver = builder.getPushObserver();
/* 75 */            Settings settings = new Settings();
/* 82 */            if (builder.getClient()) {
/* 87 */                settings.set(7, OKHTTP_CLIENT_WINDOW_SIZE);
                    }
/* 90 */            this.okHttpSettings = settings;
/* 92 */            Settings settings2 = DEFAULT_SETTINGS;
/* 94 */            this.peerSettings = settings2;
/* 101 */           this.writeBytesMaximum = settings2.getInitialWindowSize();
/* 107 */           this.socket = builder.getSocket$okhttp();
/* 118 */           this.writer = new Http2Writer(builder.getSink$okhttp(), client);
/* 134 */           this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client));
/* 141 */           this.currentPushRequests = new LinkedHashSet();
/* 147 */           if (builder.getPingIntervalMillis() != 0) {
/* 156 */               final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis());
/* 162 */               final String strM6219d = Intrinsics.m6219d(" ping", connectionName$okhttp);
/* 171 */               taskQueueNewQueue.schedule(new Task(strM6219d, this, nanos) { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                            final /* synthetic */ String $name;
                            final /* synthetic */ long $pingIntervalNanos$inlined;
                            final /* synthetic */ Http2Connection this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
/* 10 */                        super(strM6219d, false, 2, null);
/* 1 */                         this.$name = strM6219d;
/* 3 */                         this.this$0 = this;
/* 5 */                         this.$pingIntervalNanos$inlined = nanos;
                            }

                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                boolean z;
                                synchronized (this.this$0) {
/* 20 */                            if (this.this$0.intervalPongsReceived < this.this$0.intervalPingsSent) {
/* 22 */                                z = true;
                                    } else {
/* 1 */                                 this.this$0.intervalPingsSent++;
/* 38 */                                z = false;
                                    }
                                }
/* 40 */                        Http2Connection http2Connection = this.this$0;
/* 42 */                        if (z) {
/* 1 */                             http2Connection.failConnection(null);
/* 48 */                            return -1L;
                                }
/* 51 */                        http2Connection.writePing(false, 1, 0);
/* 54 */                        return this.$pingIntervalNanos$inlined;
                            }
                        }, nanos);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void failConnection(IOException e) {
/* 1 */             ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
/* 3 */             close$okhttp(errorCode, errorCode, e);
                }

                private final Http2Stream newStream(int associatedStreamId, List<Header> requestHeaders, boolean out) throws IOException {
                    Throwable th;
                    Http2Stream http2Stream;
                    boolean z;
/* 1 */             boolean z2 = !out;
                    synchronized (this.writer) {
                        try {
                            synchronized (this) {
                                try {
/* 14 */                            if (getNextStreamId() > 1073741823) {
                                        try {
/* 18 */                                    shutdown(ErrorCode.REFUSED_STREAM);
                                        } catch (Throwable th2) {
/* 23 */                                    th = th2;
                                        }
                                    }
                                    try {
/* 29 */                                if (this.isShutdown) {
/* 155 */                                   throw new ConnectionShutdownException();
                                        }
/* 31 */                                int nextStreamId = getNextStreamId();
/* 41 */                                setNextStreamId$okhttp(getNextStreamId() + 2);
/* 49 */                                http2Stream = new Http2Stream(nextStreamId, this, z2, false, null);
/* 84 */                                z = !out || getWriteBytesTotal() >= getWriteBytesMaximum() || http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum();
/* 89 */                                if (http2Stream.isOpen()) {
/* 99 */                                    getStreams$okhttp().put(Integer.valueOf(nextStreamId), http2Stream);
                                        }
/* 103 */                               if (associatedStreamId == 0) {
/* 109 */                                   getWriter().headers(z2, nextStreamId, requestHeaders);
                                        } else {
/* 120 */                                   if (getClient()) {
/* 145 */                                       throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                            }
/* 126 */                                   getWriter().pushPromise(associatedStreamId, nextStreamId, requestHeaders);
                                        }
                                    } catch (Throwable th3) {
/* 81 */                                th = th3;
                                    }
                                } catch (Throwable th4) {
/* 146 */                           th = th4;
                                }
/* 82 */                        th = th;
/* 157 */                       throw th;
                            }
                        } catch (Throwable th5) {
/* 159 */                   throw th5;
                        }
                    }
/* 130 */           if (z) {
/* 134 */               this.writer.flush();
                    }
/* 137 */           return http2Stream;
                }

                public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z, TaskRunner taskRunner, int i, Object obj) throws IOException {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 z = true;
                    }
/* 8 */             if ((i & 2) != 0) {
/* 10 */                taskRunner = TaskRunner.INSTANCE;
                    }
/* 12 */            http2Connection.start(z, taskRunner);
                }

                public final synchronized void awaitPong() throws InterruptedException {
/* 8 */             while (this.awaitPongsReceived < this.awaitPingsSent) {
/* 10 */                wait();
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
/* 6 */             close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
                }

                public final void close$okhttp(ErrorCode connectionCode, ErrorCode streamCode, IOException cause) {
                    int i;
                    Object[] array;
/* 1 */             connectionCode.getClass();
/* 4 */             streamCode.getClass();
/* 9 */             if (Util.assertionsEnabled && Thread.holdsLock(this)) {
/* 28 */                s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
/* 31 */                return;
                    }
                    try {
/* 32 */                shutdown(connectionCode);
                    } catch (IOException unused) {
                    }
                    synchronized (this) {
                        try {
/* 45 */                    if (getStreams$okhttp().isEmpty()) {
/* 81 */                        array = null;
                            } else {
/* 57 */                        array = getStreams$okhttp().values().toArray(new Http2Stream[0]);
/* 61 */                        if (array == null) {
/* 80 */                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                }
/* 67 */                        getStreams$okhttp().clear();
                            }
                        } catch (Throwable th) {
/* 130 */                   throw th;
                        }
                    }
/* 83 */            Http2Stream[] http2StreamArr = (Http2Stream[]) array;
/* 85 */            if (http2StreamArr != null) {
/* 89 */                for (Http2Stream http2Stream : http2StreamArr) {
                            try {
/* 93 */                        http2Stream.close(streamCode, cause);
                            } catch (IOException unused2) {
                            }
                        }
                    }
                    try {
/* 103 */               getWriter().close();
                    } catch (IOException unused3) {
                    }
                    try {
/* 110 */               getSocket().close();
                    } catch (IOException unused4) {
                    }
/* 115 */           this.writerQueue.shutdown();
/* 120 */           this.pushQueue.shutdown();
/* 125 */           this.settingsListenerQueue.shutdown();
                }

                public final void flush() throws IOException {
/* 3 */             this.writer.flush();
                }

                /* JADX INFO: renamed from: getClient$okhttp, reason: from getter */
                public final boolean getClient() {
/* 1 */             return this.client;
                }

                /* JADX INFO: renamed from: getConnectionName$okhttp, reason: from getter */
                public final String getConnectionName() {
/* 1 */             return this.connectionName;
                }

                /* JADX INFO: renamed from: getLastGoodStreamId$okhttp, reason: from getter */
                public final int getLastGoodStreamId() {
/* 1 */             return this.lastGoodStreamId;
                }

                /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
                public final Listener getListener() {
/* 1 */             return this.listener;
                }

                /* JADX INFO: renamed from: getNextStreamId$okhttp, reason: from getter */
                public final int getNextStreamId() {
/* 1 */             return this.nextStreamId;
                }

                public final Settings getOkHttpSettings() {
/* 1 */             return this.okHttpSettings;
                }

                public final Settings getPeerSettings() {
/* 1 */             return this.peerSettings;
                }

                public final long getReadBytesAcknowledged() {
/* 1 */             return this.readBytesAcknowledged;
                }

                public final long getReadBytesTotal() {
/* 1 */             return this.readBytesTotal;
                }

                public final ReaderRunnable getReaderRunnable() {
/* 1 */             return this.readerRunnable;
                }

                /* JADX INFO: renamed from: getSocket$okhttp, reason: from getter */
                public final Socket getSocket() {
/* 1 */             return this.socket;
                }

                public final synchronized Http2Stream getStream(int id) {
/* 8 */             return this.streams.get(Integer.valueOf(id));
                }

                public final Map<Integer, Http2Stream> getStreams$okhttp() {
/* 1 */             return this.streams;
                }

                public final long getWriteBytesMaximum() {
/* 1 */             return this.writeBytesMaximum;
                }

                public final long getWriteBytesTotal() {
/* 1 */             return this.writeBytesTotal;
                }

                public final Http2Writer getWriter() {
/* 1 */             return this.writer;
                }

                public final synchronized boolean isHealthy(long nowNs) {
/* 5 */             if (this.isShutdown) {
/* 4 */                 return false;
                    }
                    return this.degradedPongsReceived >= this.degradedPingsSent || nowNs < this.degradedPongDeadlineNs;
                }

                public final synchronized int openStreamCount() {
/* 4 */             return this.streams.size();
                }

                public final void pushDataLater$okhttp(final int streamId, BufferedSource source, final int byteCount, final boolean inFinished) throws IOException {
/* 1 */             source.getClass();
/* 6 */             final Buffer buffer = new Buffer();
                    long j = byteCount;
/* 10 */            source.require(j);
/* 13 */            source.read(buffer, j);
/* 16 */            TaskQueue taskQueue = this.pushQueue;
/* 41 */            final String str = this.connectionName + '[' + streamId + "] onData";
/* 47 */            final boolean z = true;
/* 57 */            taskQueue.schedule(new Task(str, z, this, streamId, buffer, byteCount, inFinished) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
                        final /* synthetic */ Buffer $buffer$inlined;
                        final /* synthetic */ int $byteCount$inlined;
                        final /* synthetic */ boolean $cancelable;
                        final /* synthetic */ boolean $inFinished$inlined;
                        final /* synthetic */ String $name;
                        final /* synthetic */ int $streamId$inlined;
                        final /* synthetic */ Http2Connection this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
/* 15 */                    super(str, z);
/* 1 */                     this.$name = str;
/* 3 */                     this.$cancelable = z;
/* 5 */                     this.this$0 = this;
/* 7 */                     this.$streamId$inlined = streamId;
/* 9 */                     this.$buffer$inlined = buffer;
/* 11 */                    this.$byteCount$inlined = byteCount;
/* 13 */                    this.$inFinished$inlined = inFinished;
                        }

                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            try {
/* 15 */                        boolean zOnData = this.this$0.pushObserver.onData(this.$streamId$inlined, this.$buffer$inlined, this.$byteCount$inlined, this.$inFinished$inlined);
/* 19 */                        if (zOnData) {
/* 31 */                            this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                                }
/* 34 */                        if (!zOnData && !this.$inFinished$inlined) {
/* 63 */                            return -1L;
                                }
                                synchronized (this.this$0) {
/* 55 */                            this.this$0.currentPushRequests.remove(Integer.valueOf(this.$streamId$inlined));
                                }
/* 63 */                        return -1L;
                            } catch (IOException unused) {
/* 63 */                        return -1L;
                            }
                        }
                    }, 0L);
                }

                public final void pushHeadersLater$okhttp(final int streamId, final List<Header> requestHeaders, final boolean inFinished) {
/* 1 */             requestHeaders.getClass();
/* 4 */             TaskQueue taskQueue = this.pushQueue;
/* 29 */            final String str = this.connectionName + '[' + streamId + "] onHeaders";
/* 35 */            final boolean z = true;
/* 45 */            taskQueue.schedule(new Task(str, z, this, streamId, requestHeaders, inFinished) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
                        final /* synthetic */ boolean $cancelable;
                        final /* synthetic */ boolean $inFinished$inlined;
                        final /* synthetic */ String $name;
                        final /* synthetic */ List $requestHeaders$inlined;
                        final /* synthetic */ int $streamId$inlined;
                        final /* synthetic */ Http2Connection this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
/* 13 */                    super(str, z);
/* 1 */                     this.$name = str;
/* 3 */                     this.$cancelable = z;
/* 5 */                     this.this$0 = this;
/* 7 */                     this.$streamId$inlined = streamId;
/* 9 */                     this.$requestHeaders$inlined = requestHeaders;
/* 11 */                    this.$inFinished$inlined = inFinished;
                        }

                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
/* 13 */                    boolean zOnHeaders = this.this$0.pushObserver.onHeaders(this.$streamId$inlined, this.$requestHeaders$inlined, this.$inFinished$inlined);
/* 17 */                    if (zOnHeaders) {
                                try {
/* 29 */                            this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                                } catch (IOException unused) {
/* 61 */                            return -1L;
                                }
                            }
/* 32 */                    if (!zOnHeaders && !this.$inFinished$inlined) {
/* 61 */                        return -1L;
                            }
                            synchronized (this.this$0) {
/* 53 */                        this.this$0.currentPushRequests.remove(Integer.valueOf(this.$streamId$inlined));
                            }
/* 61 */                    return -1L;
                        }
                    }, 0L);
                }

                public final void pushRequestLater$okhttp(final int streamId, final List<Header> requestHeaders) throws Throwable {
                    Throwable th;
/* 1 */             requestHeaders.getClass();
                    synchronized (this) {
                        try {
/* 15 */                    if (!this.currentPushRequests.contains(Integer.valueOf(streamId))) {
/* 34 */                        this.currentPushRequests.add(Integer.valueOf(streamId));
/* 38 */                        TaskQueue taskQueue = this.pushQueue;
/* 63 */                        final String str = this.connectionName + '[' + streamId + "] onRequest";
/* 69 */                        final boolean z = true;
/* 78 */                        taskQueue.schedule(new Task(str, z, this, streamId, requestHeaders) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                                    final /* synthetic */ boolean $cancelable;
                                    final /* synthetic */ String $name;
                                    final /* synthetic */ List $requestHeaders$inlined;
                                    final /* synthetic */ int $streamId$inlined;
                                    final /* synthetic */ Http2Connection this$0;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
/* 11 */                                super(str, z);
/* 1 */                                 this.$name = str;
/* 3 */                                 this.$cancelable = z;
/* 5 */                                 this.this$0 = this;
/* 7 */                                 this.$streamId$inlined = streamId;
/* 9 */                                 this.$requestHeaders$inlined = requestHeaders;
                                    }

                                    @Override // okhttp3.internal.concurrent.Task
                                    public long runOnce() {
/* 15 */                                if (!this.this$0.pushObserver.onRequest(this.$streamId$inlined, this.$requestHeaders$inlined)) {
/* 53 */                                    return -1L;
                                        }
                                        try {
/* 27 */                                    this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                                            synchronized (this.this$0) {
/* 45 */                                        this.this$0.currentPushRequests.remove(Integer.valueOf(this.$streamId$inlined));
                                            }
/* 53 */                                    return -1L;
                                        } catch (IOException unused) {
/* 53 */                                    return -1L;
                                        }
                                    }
                                }, 0L);
/* 81 */                        return;
                            }
                            try {
/* 19 */                        writeSynResetLater$okhttp(streamId, ErrorCode.PROTOCOL_ERROR);
/* 23 */                        return;
                            } catch (Throwable th2) {
/* 25 */                        th = th2;
                            }
                        } catch (Throwable th3) {
/* 84 */                    th = th3;
                        }
/* 86 */                throw th;
                    }
                }

                public final void pushResetLater$okhttp(final int streamId, final ErrorCode errorCode) {
/* 1 */             errorCode.getClass();
/* 4 */             TaskQueue taskQueue = this.pushQueue;
/* 29 */            final String str = this.connectionName + '[' + streamId + "] onReset";
/* 35 */            final boolean z = true;
/* 44 */            taskQueue.schedule(new Task(str, z, this, streamId, errorCode) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
                        final /* synthetic */ boolean $cancelable;
                        final /* synthetic */ ErrorCode $errorCode$inlined;
                        final /* synthetic */ String $name;
                        final /* synthetic */ int $streamId$inlined;
                        final /* synthetic */ Http2Connection this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
/* 11 */                    super(str, z);
/* 1 */                     this.$name = str;
/* 3 */                     this.$cancelable = z;
/* 5 */                     this.this$0 = this;
/* 7 */                     this.$streamId$inlined = streamId;
/* 9 */                     this.$errorCode$inlined = errorCode;
                        }

                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
/* 11 */                    this.this$0.pushObserver.onReset(this.$streamId$inlined, this.$errorCode$inlined);
                            synchronized (this.this$0) {
/* 29 */                        this.this$0.currentPushRequests.remove(Integer.valueOf(this.$streamId$inlined));
                            }
/* 33 */                    return -1L;
                        }
                    }, 0L);
                }

                public final Http2Stream pushStream(int associatedStreamId, List<Header> requestHeaders, boolean out) throws IOException {
/* 1 */             requestHeaders.getClass();
/* 6 */             if (!this.client) {
/* 8 */                 return newStream(associatedStreamId, requestHeaders, out);
                    }
/* 15 */            f42.m3656l("Client cannot push requests.");
/* 18 */            return null;
                }

                public final boolean pushedStream$okhttp(int streamId) {
                    return streamId != 0 && (streamId & 1) == 0;
                }

                public final synchronized Http2Stream removeStream$okhttp(int streamId) {
                    Http2Stream http2StreamRemove;
/* 8 */             http2StreamRemove = this.streams.remove(Integer.valueOf(streamId));
/* 14 */            notifyAll();
/* 18 */            return http2StreamRemove;
                }

                public final void sendDegradedPingLater$okhttp() {
                    synchronized (this) {
/* 2 */                 long j = this.degradedPongsReceived;
/* 4 */                 long j2 = this.degradedPingsSent;
/* 8 */                 if (j < j2) {
/* 11 */                    return;
                        }
/* 15 */                this.degradedPingsSent = j2 + 1;
/* 25 */                this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
/* 28 */                TaskQueue taskQueue = this.writerQueue;
/* 34 */                final String strM6219d = Intrinsics.m6219d(" ping", this.connectionName);
/* 40 */                final boolean z = true;
/* 46 */                taskQueue.schedule(new Task(strM6219d, z, this) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                            final /* synthetic */ boolean $cancelable;
                            final /* synthetic */ String $name;
                            final /* synthetic */ Http2Connection this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
/* 7 */                         super(strM6219d, z);
/* 1 */                         this.$name = strM6219d;
/* 3 */                         this.$cancelable = z;
/* 5 */                         this.this$0 = this;
                            }

                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
/* 5 */                         this.this$0.writePing(false, 2, 0);
/* 8 */                         return -1L;
                            }
                        }, 0L);
                    }
                }

                public final void setLastGoodStreamId$okhttp(int i) {
/* 1 */             this.lastGoodStreamId = i;
                }

                public final void setNextStreamId$okhttp(int i) {
/* 1 */             this.nextStreamId = i;
                }

                public final void setPeerSettings(Settings settings) {
/* 1 */             settings.getClass();
/* 4 */             this.peerSettings = settings;
                }

                public final void setSettings(Settings settings) throws IOException {
/* 1 */             settings.getClass();
                    synchronized (this.writer) {
                        synchronized (this) {
/* 10 */                    if (this.isShutdown) {
/* 38 */                        throw new ConnectionShutdownException();
                            }
/* 16 */                    getOkHttpSettings().merge(settings);
                        }
/* 24 */                getWriter().settings(settings);
                    }
                }

                public final void shutdown(ErrorCode statusCode) throws IOException {
/* 1 */             statusCode.getClass();
                    synchronized (this.writer) {
/* 9 */                 f22 f22Var = new f22();
                        synchronized (this) {
/* 15 */                    if (this.isShutdown) {
/* 19 */                        return;
                            }
/* 23 */                    this.isShutdown = true;
/* 29 */                    f22Var.f7976a = getLastGoodStreamId();
/* 40 */                    getWriter().goAway(f22Var.f7976a, statusCode, Util.EMPTY_BYTE_ARRAY);
                        }
                    }
                }

                public final void start(boolean sendConnectionPreface, TaskRunner taskRunner) throws IOException {
/* 1 */             taskRunner.getClass();
/* 4 */             if (sendConnectionPreface) {
/* 8 */                 this.writer.connectionPreface();
/* 15 */                this.writer.settings(this.okHttpSettings);
/* 20 */                int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
/* 27 */                if (initialWindowSize != 65535) {
/* 34 */                    this.writer.windowUpdate(0, initialWindowSize - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        }
                    }
/* 53 */            taskRunner.newQueue().schedule(new TaskQueue.C20111(this.connectionName, true, this.readerRunnable), 0L);
                }

                public final synchronized void updateConnectionFlowControl$okhttp(long read) {
/* 4 */             long j = this.readBytesTotal + read;
/* 5 */             this.readBytesTotal = j;
/* 9 */             long j2 = j - this.readBytesAcknowledged;
/* 21 */            if (j2 >= this.okHttpSettings.getInitialWindowSize() / 2) {
/* 24 */                writeWindowUpdateLater$okhttp(0, j2);
/* 30 */                this.readBytesAcknowledged += j2;
                    }
                }

                public final void writeData(int streamId, boolean outFinished, Buffer buffer, long byteCount) throws IOException {
                    int iMin;
                    long j;
/* 6 */             if (byteCount == 0) {
/* 10 */                this.writer.data(outFinished, streamId, buffer, 0);
/* 13 */                return;
                    }
/* 16 */            while (byteCount > 0) {
                        synchronized (this) {
/* 29 */                    while (getWriteBytesTotal() >= getWriteBytesMaximum()) {
                                try {
                                    try {
/* 43 */                                if (!getStreams$okhttp().containsKey(Integer.valueOf(streamId))) {
/* 58 */                                    throw new IOException("stream closed");
                                        }
/* 45 */                                wait();
                                    } catch (InterruptedException unused) {
/* 114 */                               Thread.currentThread().interrupt();
/* 122 */                               throw new InterruptedIOException();
                                    }
                                } catch (Throwable th) {
/* 124 */                           throw th;
                                }
                            }
/* 81 */                    iMin = Math.min((int) Math.min(byteCount, getWriteBytesMaximum() - getWriteBytesTotal()), getWriter().getMaxFrameSize());
                            j = iMin;
/* 91 */                    this.writeBytesTotal = getWriteBytesTotal() + j;
                        }
/* 94 */                byteCount -= j;
/* 106 */               this.writer.data(outFinished && byteCount == 0, streamId, buffer, iMin);
                    }
                }

                public final void writeHeaders$okhttp(int streamId, boolean outFinished, List<Header> alternating) throws IOException {
/* 1 */             alternating.getClass();
/* 6 */             this.writer.headers(outFinished, streamId, alternating);
                }

                public final void writePing() throws InterruptedException {
                    synchronized (this) {
/* 7 */                 this.awaitPingsSent++;
                    }
/* 15 */            writePing(false, 3, 1330343787);
                }

                public final void writePingAndAwaitPong() throws InterruptedException {
/* 1 */             writePing();
/* 4 */             awaitPong();
                }

                public final void writeSynReset$okhttp(int streamId, ErrorCode statusCode) throws IOException {
/* 1 */             statusCode.getClass();
/* 6 */             this.writer.rstStream(streamId, statusCode);
                }

                public final void writeSynResetLater$okhttp(final int streamId, final ErrorCode errorCode) {
/* 1 */             errorCode.getClass();
/* 4 */             TaskQueue taskQueue = this.writerQueue;
/* 29 */            final String str = this.connectionName + '[' + streamId + "] writeSynReset";
/* 35 */            final boolean z = true;
/* 44 */            taskQueue.schedule(new Task(str, z, this, streamId, errorCode) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
                        final /* synthetic */ boolean $cancelable;
                        final /* synthetic */ ErrorCode $errorCode$inlined;
                        final /* synthetic */ String $name;
                        final /* synthetic */ int $streamId$inlined;
                        final /* synthetic */ Http2Connection this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
/* 11 */                    super(str, z);
/* 1 */                     this.$name = str;
/* 3 */                     this.$cancelable = z;
/* 5 */                     this.this$0 = this;
/* 7 */                     this.$streamId$inlined = streamId;
/* 9 */                     this.$errorCode$inlined = errorCode;
                        }

                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            try {
/* 7 */                         this.this$0.writeSynReset$okhttp(this.$streamId$inlined, this.$errorCode$inlined);
/* 17 */                        return -1L;
                            } catch (IOException e) {
/* 1 */                         this.this$0.failConnection(e);
/* 17 */                        return -1L;
                            }
                        }
                    }, 0L);
                }

                public final void writeWindowUpdateLater$okhttp(final int streamId, final long unacknowledgedBytesRead) {
/* 1 */             TaskQueue taskQueue = this.writerQueue;
/* 26 */            final String str = this.connectionName + '[' + streamId + "] windowUpdate";
/* 32 */            final boolean z = true;
/* 41 */            taskQueue.schedule(new Task(str, z, this, streamId, unacknowledgedBytesRead) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
                        final /* synthetic */ boolean $cancelable;
                        final /* synthetic */ String $name;
                        final /* synthetic */ int $streamId$inlined;
                        final /* synthetic */ long $unacknowledgedBytesRead$inlined;
                        final /* synthetic */ Http2Connection this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
/* 11 */                    super(str, z);
/* 1 */                     this.$name = str;
/* 3 */                     this.$cancelable = z;
/* 5 */                     this.this$0 = this;
/* 7 */                     this.$streamId$inlined = streamId;
/* 9 */                     this.$unacknowledgedBytesRead$inlined = unacknowledgedBytesRead;
                        }

                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            try {
/* 11 */                        this.this$0.getWriter().windowUpdate(this.$streamId$inlined, this.$unacknowledgedBytesRead$inlined);
/* 21 */                        return -1L;
                            } catch (IOException e) {
/* 1 */                         this.this$0.failConnection(e);
/* 21 */                        return -1L;
                            }
                        }
                    }, 0L);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m6176d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "AWAIT_PING", HttpUrl.FRAGMENT_ENCODE_SET, "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/Settings;", "getDEFAULT_SETTINGS", "()Lokhttp3/internal/http2/Settings;", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final Settings getDEFAULT_SETTINGS() {
/* 1 */                 return Http2Connection.DEFAULT_SETTINGS;
                    }

/* 4 */             private Companion() {
                    }
                }

/* 21 */        public final void writePing(boolean reply, int payload1, int payload2) {
                    try {
/* 22 */                this.writer.ping(reply, payload1, payload2);
                    } catch (IOException e) {
/* 23 */                failConnection(e);
                    }
                }

/* 56 */        public final void start(boolean z) throws IOException {
/* 57 */            start$default(this, z, null, 2, null);
                }

/* 57 */        public final void start() throws IOException {
/* 58 */            start$default(this, false, null, 3, null);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u00107\u001a\u000208J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eJ.\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\b\b\u0002\u00109\u001a\u00020\f2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010#\u001a\u00020$H\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020*X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006:"}, m6176d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "client", HttpUrl.FRAGMENT_ENCODE_SET, "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "getClient$okhttp", "()Z", "setClient$okhttp", "(Z)V", "connectionName", HttpUrl.FRAGMENT_ENCODE_SET, "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "listener", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "pingIntervalMillis", HttpUrl.FRAGMENT_ENCODE_SET, "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", "sink", "Lokio/BufferedSink;", "getSink$okhttp", "()Lokio/BufferedSink;", "setSink$okhttp", "(Lokio/BufferedSink;)V", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "getSource$okhttp", "()Lokio/BufferedSource;", "setSource$okhttp", "(Lokio/BufferedSource;)V", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "build", "Lokhttp3/internal/http2/Http2Connection;", "peerName", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 59 */        public static final class Builder {
                    private boolean client;
                    public String connectionName;
                    private Listener listener;
                    private int pingIntervalMillis;
                    private PushObserver pushObserver;
                    public BufferedSink sink;
                    public Socket socket;
                    public BufferedSource source;
                    private final TaskRunner taskRunner;

                    public Builder(boolean z, TaskRunner taskRunner) {
/* 1 */                 taskRunner.getClass();
/* 7 */                 this.client = z;
/* 9 */                 this.taskRunner = taskRunner;
/* 13 */                this.listener = Listener.REFUSE_INCOMING_STREAMS;
/* 17 */                this.pushObserver = PushObserver.CANCEL;
                    }

                    public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink, int i, Object obj) throws IOException {
/* 3 */                 if ((i & 2) != 0) {
/* 5 */                     str = Util.peerName(socket);
                        }
/* 11 */                if ((i & 4) != 0) {
/* 17 */                    bufferedSource = Okio.buffer(Okio.source(socket));
                        }
/* 23 */                if ((i & 8) != 0) {
/* 29 */                    bufferedSink = Okio.buffer(Okio.sink(socket));
                        }
/* 33 */                return builder.socket(socket, str, bufferedSource, bufferedSink);
                    }

                    public final Http2Connection build() {
/* 3 */                 return new Http2Connection(this);
                    }

                    /* JADX INFO: renamed from: getClient$okhttp, reason: from getter */
                    public final boolean getClient() {
/* 1 */                 return this.client;
                    }

                    public final String getConnectionName$okhttp() {
/* 1 */                 String str = this.connectionName;
/* 3 */                 if (str != null) {
/* 5 */                     return str;
                        }
/* 8 */                 Intrinsics.m6220e("connectionName");
/* 12 */                throw null;
                    }

                    /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
                    public final Listener getListener() {
/* 1 */                 return this.listener;
                    }

                    /* JADX INFO: renamed from: getPingIntervalMillis$okhttp, reason: from getter */
                    public final int getPingIntervalMillis() {
/* 1 */                 return this.pingIntervalMillis;
                    }

                    /* JADX INFO: renamed from: getPushObserver$okhttp, reason: from getter */
                    public final PushObserver getPushObserver() {
/* 1 */                 return this.pushObserver;
                    }

                    public final BufferedSink getSink$okhttp() {
/* 1 */                 BufferedSink bufferedSink = this.sink;
/* 3 */                 if (bufferedSink != null) {
/* 5 */                     return bufferedSink;
                        }
/* 8 */                 Intrinsics.m6220e("sink");
/* 12 */                throw null;
                    }

                    public final Socket getSocket$okhttp() {
/* 1 */                 Socket socket = this.socket;
/* 3 */                 if (socket != null) {
/* 5 */                     return socket;
                        }
/* 8 */                 Intrinsics.m6220e("socket");
/* 12 */                throw null;
                    }

                    public final BufferedSource getSource$okhttp() {
/* 1 */                 BufferedSource bufferedSource = this.source;
/* 3 */                 if (bufferedSource != null) {
/* 5 */                     return bufferedSource;
                        }
/* 8 */                 Intrinsics.m6220e(FirebaseAnalytics.Param.SOURCE);
/* 12 */                throw null;
                    }

                    /* JADX INFO: renamed from: getTaskRunner$okhttp, reason: from getter */
                    public final TaskRunner getTaskRunner() {
/* 1 */                 return this.taskRunner;
                    }

                    public final Builder listener(Listener listener) {
/* 1 */                 listener.getClass();
/* 4 */                 setListener$okhttp(listener);
/* 7 */                 return this;
                    }

                    public final Builder pingIntervalMillis(int pingIntervalMillis) {
/* 1 */                 setPingIntervalMillis$okhttp(pingIntervalMillis);
/* 4 */                 return this;
                    }

                    public final Builder pushObserver(PushObserver pushObserver) {
/* 1 */                 pushObserver.getClass();
/* 4 */                 setPushObserver$okhttp(pushObserver);
/* 7 */                 return this;
                    }

                    public final void setClient$okhttp(boolean z) {
/* 1 */                 this.client = z;
                    }

                    public final void setConnectionName$okhttp(String str) {
/* 1 */                 str.getClass();
/* 4 */                 this.connectionName = str;
                    }

                    public final void setListener$okhttp(Listener listener) {
/* 1 */                 listener.getClass();
/* 4 */                 this.listener = listener;
                    }

                    public final void setPingIntervalMillis$okhttp(int i) {
/* 1 */                 this.pingIntervalMillis = i;
                    }

                    public final void setPushObserver$okhttp(PushObserver pushObserver) {
/* 1 */                 pushObserver.getClass();
/* 4 */                 this.pushObserver = pushObserver;
                    }

                    public final void setSink$okhttp(BufferedSink bufferedSink) {
/* 1 */                 bufferedSink.getClass();
/* 4 */                 this.sink = bufferedSink;
                    }

                    public final void setSocket$okhttp(Socket socket) {
/* 1 */                 socket.getClass();
/* 4 */                 this.socket = socket;
                    }

                    public final void setSource$okhttp(BufferedSource bufferedSource) {
/* 1 */                 bufferedSource.getClass();
/* 4 */                 this.source = bufferedSource;
                    }

                    public final Builder socket(Socket socket, String peerName, BufferedSource source, BufferedSink sink) throws IOException {
                        String strM6219d;
/* 1 */                 socket.getClass();
/* 4 */                 peerName.getClass();
/* 7 */                 source.getClass();
/* 10 */                sink.getClass();
/* 13 */                setSocket$okhttp(socket);
/* 20 */                if (getClient()) {
/* 40 */                    strM6219d = Util.okHttpName + ' ' + peerName;
                        } else {
/* 47 */                    strM6219d = Intrinsics.m6219d(peerName, "MockWebServer ");
                        }
/* 51 */                setConnectionName$okhttp(strM6219d);
/* 54 */                setSource$okhttp(source);
/* 57 */                setSink$okhttp(sink);
/* 60 */                return this;
                    }

/* 60 */            public final Builder socket(Socket socket, String str) throws IOException {
/* 61 */                socket.getClass();
                        str.getClass();
                        return socket$default(this, socket, str, null, null, 12, null);
                    }

/* 61 */            public final Builder socket(Socket socket, String str, BufferedSource bufferedSource) throws IOException {
/* 62 */                socket.getClass();
                        str.getClass();
                        bufferedSource.getClass();
                        return socket$default(this, socket, str, bufferedSource, null, 8, null);
                    }

/* 62 */            public final Builder socket(Socket socket) throws IOException {
/* 63 */                socket.getClass();
                        return socket$default(this, socket, null, null, null, 14, null);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0003H\u0016J8\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J(\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fH\u0016J \u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0010H\u0016J.\u0010$\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0016J\t\u0010)\u001a\u00020\u0003H\u0096\u0002J \u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\fH\u0016J(\u0010.\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0017H\u0016J&\u00102\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\f\u00104\u001a\b\u0012\u0004\u0012\u00020(0'H\u0016J\u0018\u00105\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u00106\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00107\u001a\u00020\u0014H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u00068"}, m6176d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", HttpUrl.FRAGMENT_ENCODE_SET, "reader", "Lokhttp3/internal/http2/Http2Reader;", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;", "ackSettings", "alternateService", "streamId", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.ORIGIN, HttpUrl.FRAGMENT_ENCODE_SET, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, "Lokio/ByteString;", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT, "maxAge", HttpUrl.FRAGMENT_ENCODE_SET, "applyAndAckSettings", "clearPrevious", HttpUrl.FRAGMENT_ENCODE_SET, "settings", "Lokhttp3/internal/http2/Settings;", SharedDataContentProvider.BASE_PATH, "inFinished", FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "length", "goAway", "lastGoodStreamId", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "debugData", "headers", "associatedStreamId", "headerBlock", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "invoke", "ping", "ack", "payload1", "payload2", "priority", "streamDependency", "weight", "exclusive", "pushPromise", "promisedStreamId", "requestHeaders", "rstStream", "windowUpdate", "windowSizeIncrement", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 60 */        public final class ReaderRunnable implements Http2Reader.Handler, Function0<Unit> {
                    private final Http2Reader reader;
                    final /* synthetic */ Http2Connection this$0;

                    public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
/* 1 */                 http2Connection.getClass();
/* 4 */                 http2Reader.getClass();
/* 7 */                 this.this$0 = http2Connection;
/* 12 */                this.reader = http2Reader;
                    }

                    @Override // okhttp3.internal.http2.Http2Reader.Handler
                    public void ackSettings() {
                    }

                    @Override // okhttp3.internal.http2.Http2Reader.Handler
                    public void alternateService(int streamId, String origin, ByteString protocol, String host, int port, long maxAge) {
/* 1 */                 origin.getClass();
/* 4 */                 protocol.getClass();
/* 7 */                 host.getClass();
                    }

                    public final void applyAndAckSettings(boolean clearPrevious, Settings settings) {
                        long initialWindowSize;
                        int i;
                        Http2Stream[] http2StreamArr;
/* 1 */                 settings.getClass();
/* 6 */                 final h22 h22Var = new h22();
/* 11 */                Http2Writer writer = this.this$0.getWriter();
/* 15 */                final Http2Connection http2Connection = this.this$0;
                        synchronized (writer) {
                            synchronized (http2Connection) {
                                try {
/* 19 */                            Settings peerSettings = http2Connection.getPeerSettings();
/* 23 */                            if (!clearPrevious) {
/* 28 */                                Settings settings2 = new Settings();
/* 31 */                                settings2.merge(peerSettings);
/* 34 */                                settings2.merge(settings);
/* 37 */                                settings = settings2;
                                    }
/* 38 */                            h22Var.f8873a = settings;
/* 50 */                            initialWindowSize = ((long) settings.getInitialWindowSize()) - ((long) peerSettings.getInitialWindowSize());
/* 55 */                            i = 0;
/* 56 */                            if (initialWindowSize == 0 || http2Connection.getStreams$okhttp().isEmpty()) {
/* 98 */                                http2StreamArr = null;
                                    } else {
/* 79 */                                Object[] array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
/* 83 */                                if (array == null) {
/* 97 */                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                        }
/* 85 */                                http2StreamArr = (Http2Stream[]) array;
                                    }
/* 103 */                           http2Connection.setPeerSettings((Settings) h22Var.f8873a);
/* 1 */                             TaskQueue taskQueue = http2Connection.settingsListenerQueue;
/* 116 */                           final String strM6219d = Intrinsics.m6219d(" onSettings", http2Connection.getConnectionName());
/* 122 */                           final boolean z = true;
/* 126 */                           taskQueue.schedule(new Task(strM6219d, z, http2Connection, h22Var) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1
                                        final /* synthetic */ boolean $cancelable;
                                        final /* synthetic */ String $name;
                                        final /* synthetic */ h22 $newPeerSettings$inlined;
                                        final /* synthetic */ Http2Connection this$0;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
/* 9 */                                     super(strM6219d, z);
/* 1 */                                     this.$name = strM6219d;
/* 3 */                                     this.$cancelable = z;
/* 5 */                                     this.this$0 = http2Connection;
/* 7 */                                     this.$newPeerSettings$inlined = h22Var;
                                        }

                                        @Override // okhttp3.internal.concurrent.Task
                                        public long runOnce() {
/* 15 */                                    this.this$0.getListener().onSettings(this.this$0, (Settings) this.$newPeerSettings$inlined.f8873a);
/* 18 */                                    return -1L;
                                        }
                                    }, 0L);
                                } catch (Throwable th) {
/* 169 */                           throw th;
                                }
                            }
                            try {
/* 138 */                       http2Connection.getWriter().applyAndAckSettings((Settings) h22Var.f8873a);
                            } catch (IOException e) {
/* 1 */                         http2Connection.failConnection(e);
                            }
                        }
/* 149 */               if (http2StreamArr != null) {
/* 151 */                   int length = http2StreamArr.length;
/* 152 */                   while (i < length) {
/* 154 */                       Http2Stream http2Stream = http2StreamArr[i];
/* 156 */                       i++;
                                synchronized (http2Stream) {
/* 159 */                           http2Stream.addBytesToWriteWindow(initialWindowSize);
                                }
                            }
                        }
                    }

                    @Override // okhttp3.internal.http2.Http2Reader.Handler
                    public void data(boolean inFinished, int streamId, BufferedSource source, int length) throws IOException {
/* 1 */                 source.getClass();
/* 6 */                 boolean zPushedStream$okhttp = this.this$0.pushedStream$okhttp(streamId);
/* 10 */                Http2Connection http2Connection = this.this$0;
/* 12 */                if (zPushedStream$okhttp) {
/* 14 */                    http2Connection.pushDataLater$okhttp(streamId, source, length, inFinished);
/* 17 */                    return;
                        }
/* 18 */                Http2Stream stream = http2Connection.getStream(streamId);
/* 22 */                if (stream == null) {
/* 28 */                    this.this$0.writeSynResetLater$okhttp(streamId, ErrorCode.PROTOCOL_ERROR);
                            long j = length;
/* 34 */                    this.this$0.updateConnectionFlowControl$okhttp(j);
/* 37 */                    source.skip(j);
/* 40 */                    return;
                        }
/* 41 */                stream.receiveData(source, length);
/* 44 */                if (inFinished) {
/* 49 */                    stream.receiveHeaders(Util.EMPTY_HEADERS, true);
                        }
                    }

                    /* JADX INFO: renamed from: getReader$okhttp, reason: from getter */
                    public final Http2Reader getReader() {
/* 1 */                 return this.reader;
                    }

                    @Override // okhttp3.internal.http2.Http2Reader.Handler
                    public void goAway(int lastGoodStreamId, ErrorCode errorCode, ByteString debugData) {
                        int i;
                        Object[] array;
/* 1 */                 errorCode.getClass();
/* 4 */                 debugData.getClass();
/* 7 */                 debugData.size();
/* 10 */                Http2Connection http2Connection = this.this$0;
                        synchronized (http2Connection) {
/* 21 */                    i = 0;
/* 24 */                    array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
/* 28 */                    if (array == null) {
/* 81 */                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            }
/* 1 */                     http2Connection.isShutdown = true;
                        }
/* 35 */                Http2Stream[] http2StreamArr = (Http2Stream[]) array;
/* 37 */                int length = http2StreamArr.length;
/* 38 */                while (i < length) {
/* 40 */                    Http2Stream http2Stream = http2StreamArr[i];
/* 42 */                    i++;
/* 48 */                    if (http2Stream.getId() > lastGoodStreamId && http2Stream.isLocallyInitiated()) {
/* 58 */                        http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
/* 67 */                        this.this$0.removeStream$okhttp(http2Stream.getId());
                            }
                        }
                    }

                    @Override // okhttp3.internal.http2.Http2Reader.Handler
                    public void headers(boolean inFinished, int streamId, int associatedStreamId, List<Header> headerBlock) {
/* 1 */                 headerBlock.getClass();
/* 6 */                 boolean zPushedStream$okhttp = this.this$0.pushedStream$okhttp(streamId);
/* 10 */                final Http2Connection http2Connection = this.this$0;
/* 12 */                if (zPushedStream$okhttp) {
/* 14 */                    http2Connection.pushHeadersLater$okhttp(streamId, headerBlock, inFinished);
/* 17 */                    return;
                        }
                        synchronized (http2Connection) {
/* 19 */                    Http2Stream stream = http2Connection.getStream(streamId);
/* 23 */                    if (stream != null) {
/* 138 */                       stream.receiveHeaders(Util.toHeaders(headerBlock), inFinished);
/* 141 */                       return;
                            }
/* 29 */                    if (http2Connection.isShutdown) {
/* 32 */                        return;
                            }
/* 37 */                    if (streamId <= http2Connection.getLastGoodStreamId()) {
/* 40 */                        return;
                            }
/* 49 */                    if (streamId % 2 == http2Connection.getNextStreamId() % 2) {
/* 52 */                        return;
                            }
/* 62 */                    final Http2Stream http2Stream = new Http2Stream(streamId, http2Connection, false, inFinished, Util.toHeaders(headerBlock));
/* 65 */                    http2Connection.setLastGoodStreamId$okhttp(streamId);
/* 76 */                    http2Connection.getStreams$okhttp().put(Integer.valueOf(streamId), http2Stream);
/* 83 */                    TaskQueue taskQueueNewQueue = http2Connection.taskRunner.newQueue();
/* 112 */                   final String str = http2Connection.getConnectionName() + '[' + streamId + "] onStream";
/* 118 */                   final boolean z = true;
/* 124 */                   taskQueueNewQueue.schedule(new Task(str, z, http2Connection, http2Stream) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1
                                final /* synthetic */ boolean $cancelable;
                                final /* synthetic */ String $name;
                                final /* synthetic */ Http2Stream $newStream$inlined;
                                final /* synthetic */ Http2Connection this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
/* 9 */                             super(str, z);
/* 1 */                             this.$name = str;
/* 3 */                             this.$cancelable = z;
/* 5 */                             this.this$0 = http2Connection;
/* 7 */                             this.$newStream$inlined = http2Stream;
                                }

                                @Override // okhttp3.internal.concurrent.Task
                                public long runOnce() {
                                    try {
/* 9 */                                 this.this$0.getListener().onStream(this.$newStream$inlined);
/* 43 */                                return -1L;
                                    } catch (IOException e) {
/* 33 */                                Platform.INSTANCE.get().log(Intrinsics.m6219d(this.this$0.getConnectionName(), "Http2Connection.Listener failure for "), 4, e);
                                        try {
/* 40 */                                    this.$newStream$inlined.close(ErrorCode.PROTOCOL_ERROR, e);
/* 43 */                                    return -1L;
                                        } catch (IOException unused) {
/* 43 */                                    return -1L;
                                        }
                                    }
                                }
                            }, 0L);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r5v3 */
                    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable, okhttp3.internal.http2.Http2Reader] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public void m10636invoke() throws Throwable {
                        ErrorCode errorCode;
/* 1 */                 ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
/* 3 */                 IOException e = null;
                        try {
                            try {
/* 6 */                         this.reader.readConnectionPreface(this);
/* 16 */                        while (this.reader.nextFrame(false, this)) {
                                }
/* 19 */                        ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                                try {
/* 21 */                            errorCode2 = ErrorCode.CANCEL;
/* 25 */                            this.this$0.close$okhttp(errorCode3, errorCode2, null);
                                    errorCode = errorCode3;
                                } catch (IOException e2) {
/* 36 */                            e = e2;
/* 43 */                            errorCode2 = ErrorCode.PROTOCOL_ERROR;
/* 45 */                            Http2Connection http2Connection = this.this$0;
/* 47 */                            http2Connection.close$okhttp(errorCode2, errorCode2, e);
                                    errorCode = http2Connection;
                                }
                            } catch (Throwable th) {
/* 34 */                        th = th;
/* 53 */                        this.this$0.close$okhttp(errorCode, errorCode2, e);
/* 58 */                        Util.closeQuietly(this.reader);
/* 61 */                        throw th;
                            }
                        } catch (IOException e3) {
/* 41 */                    e = e3;
                        } catch (Throwable th2) {
/* 38 */                    th = th2;
/* 39 */                    errorCode = errorCode2;
/* 53 */                    this.this$0.close$okhttp(errorCode, errorCode2, e);
/* 58 */                    Util.closeQuietly(this.reader);
/* 61 */                    throw th;
                        }
/* 28 */                this = this.reader;
/* 30 */                Util.closeQuietly((Closeable) this);
                    }

                    @Override // okhttp3.internal.http2.Http2Reader.Handler
                    public void ping(boolean ack, final int payload1, final int payload2) {
/* 1 */                 Http2Connection http2Connection = this.this$0;
/* 3 */                 if (!ack) {
/* 1 */                     TaskQueue taskQueue = http2Connection.writerQueue;
/* 66 */                    final String strM6219d = Intrinsics.m6219d(" ping", this.this$0.getConnectionName());
/* 70 */                    final Http2Connection http2Connection2 = this.this$0;
/* 74 */                    final boolean z = true;
/* 82 */                    taskQueue.schedule(new Task(strM6219d, z, http2Connection2, payload1, payload2) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                                final /* synthetic */ boolean $cancelable;
                                final /* synthetic */ String $name;
                                final /* synthetic */ int $payload1$inlined;
                                final /* synthetic */ int $payload2$inlined;
                                final /* synthetic */ Http2Connection this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
/* 11 */                            super(strM6219d, z);
/* 1 */                             this.$name = strM6219d;
/* 3 */                             this.$cancelable = z;
/* 5 */                             this.this$0 = http2Connection2;
/* 7 */                             this.$payload1$inlined = payload1;
/* 9 */                             this.$payload2$inlined = payload2;
                                }

                                @Override // okhttp3.internal.concurrent.Task
                                public long runOnce() {
/* 8 */                             this.this$0.writePing(true, this.$payload1$inlined, this.$payload2$inlined);
/* 11 */                            return -1L;
                                }
                            }, 0L);
/* 85 */                    return;
                        }
                        synchronized (http2Connection) {
                            try {
/* 9 */                         if (payload1 == 1) {
/* 1 */                             http2Connection.intervalPongsReceived++;
                                } else if (payload1 == 2) {
/* 1 */                             http2Connection.degradedPongsReceived++;
                                } else if (payload1 == 3) {
/* 1 */                             http2Connection.awaitPongsReceived++;
/* 26 */                            http2Connection.notifyAll();
                                }
                            } catch (Throwable th) {
/* 53 */                        throw th;
                            }
                        }
                    }

                    @Override // okhttp3.internal.http2.Http2Reader.Handler
                    public void priority(int streamId, int streamDependency, int weight, boolean exclusive) {
                    }

                    @Override // okhttp3.internal.http2.Http2Reader.Handler
                    public void pushPromise(int streamId, int promisedStreamId, List<Header> requestHeaders) throws Throwable {
/* 1 */                 requestHeaders.getClass();
/* 6 */                 this.this$0.pushRequestLater$okhttp(promisedStreamId, requestHeaders);
                    }

                    @Override // okhttp3.internal.http2.Http2Reader.Handler
                    public void rstStream(int streamId, ErrorCode errorCode) {
/* 1 */                 errorCode.getClass();
/* 6 */                 boolean zPushedStream$okhttp = this.this$0.pushedStream$okhttp(streamId);
/* 10 */                Http2Connection http2Connection = this.this$0;
/* 12 */                if (zPushedStream$okhttp) {
/* 14 */                    http2Connection.pushResetLater$okhttp(streamId, errorCode);
/* 17 */                    return;
                        }
/* 18 */                Http2Stream http2StreamRemoveStream$okhttp = http2Connection.removeStream$okhttp(streamId);
/* 22 */                if (http2StreamRemoveStream$okhttp == null) {
/* 24 */                    return;
                        }
/* 25 */                http2StreamRemoveStream$okhttp.receiveRstStream(errorCode);
                    }

                    @Override // okhttp3.internal.http2.Http2Reader.Handler
                    public void settings(final boolean clearPrevious, final Settings settings) {
/* 1 */                 settings.getClass();
/* 1 */                 TaskQueue taskQueue = this.this$0.writerQueue;
/* 18 */                final String strM6219d = Intrinsics.m6219d(" applyAndAckSettings", this.this$0.getConnectionName());
/* 24 */                final boolean z = true;
/* 33 */                taskQueue.schedule(new Task(strM6219d, z, this, clearPrevious, settings) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                            final /* synthetic */ boolean $cancelable;
                            final /* synthetic */ boolean $clearPrevious$inlined;
                            final /* synthetic */ String $name;
                            final /* synthetic */ Settings $settings$inlined;
                            final /* synthetic */ Http2Connection.ReaderRunnable this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
/* 11 */                        super(strM6219d, z);
/* 1 */                         this.$name = strM6219d;
/* 3 */                         this.$cancelable = z;
/* 5 */                         this.this$0 = this;
/* 7 */                         this.$clearPrevious$inlined = clearPrevious;
/* 9 */                         this.$settings$inlined = settings;
                            }

                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
/* 7 */                         this.this$0.applyAndAckSettings(this.$clearPrevious$inlined, this.$settings$inlined);
/* 10 */                        return -1L;
                            }
                        }, 0L);
                    }

                    @Override // okhttp3.internal.http2.Http2Reader.Handler
                    public void windowUpdate(int streamId, long windowSizeIncrement) {
/* 1 */                 Http2Connection http2Connection = this.this$0;
/* 3 */                 if (streamId == 0) {
                            synchronized (http2Connection) {
/* 1 */                         http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + windowSizeIncrement;
/* 14 */                        http2Connection.notifyAll();
                            }
                        } else {
/* 22 */                    Http2Stream stream = http2Connection.getStream(streamId);
/* 26 */                    if (stream != null) {
                                synchronized (stream) {
/* 29 */                            stream.addBytesToWriteWindow(windowSizeIncrement);
                                }
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
/* 61 */            public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
/* 62 */                m10636invoke();
                        return Unit.f12910a;
                    }
                }

/* 159 */       public final Http2Stream newStream(List<Header> requestHeaders, boolean out) throws IOException {
                    requestHeaders.getClass();
/* 160 */           return newStream(0, requestHeaders, out);
                }
            }
