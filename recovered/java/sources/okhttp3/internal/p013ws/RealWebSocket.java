            package okhttp3.internal.p013ws;

            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.io.Closeable;
            import java.io.IOException;
            import java.net.ProtocolException;
            import java.net.SocketTimeoutException;
            import java.util.ArrayDeque;
            import java.util.List;
            import java.util.Random;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.collections.C1839a;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.ranges.IntRange;
            import okhttp3.Call;
            import okhttp3.Callback;
            import okhttp3.EventListener;
            import okhttp3.HttpUrl;
            import okhttp3.OkHttpClient;
            import okhttp3.Protocol;
            import okhttp3.Request;
            import okhttp3.Response;
            import okhttp3.WebSocket;
            import okhttp3.WebSocketListener;
            import okhttp3.internal.Util;
            import okhttp3.internal.concurrent.Task;
            import okhttp3.internal.concurrent.TaskQueue;
            import okhttp3.internal.concurrent.TaskRunner;
            import okhttp3.internal.connection.Exchange;
            import okhttp3.internal.connection.RealCall;
            import okio.BufferedSink;
            import okio.BufferedSource;
            import okio.ByteString;
            import p000.C1951n4;
            import p000.ds0;
            import p000.fm0;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0005_`abcB?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0002\u0010\u0010J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\f2\u0006\u00105\u001a\u000206J\b\u00107\u001a\u000203H\u0016J\u001f\u00108\u001a\u0002032\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0002\b=J\u001a\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020%2\b\u0010@\u001a\u0004\u0018\u00010\u0018H\u0016J \u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020%2\b\u0010@\u001a\u0004\u0018\u00010\u00182\u0006\u0010A\u001a\u00020\fJ\u000e\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020DJ\u001c\u0010E\u001a\u0002032\n\u0010F\u001a\u00060Gj\u0002`H2\b\u00109\u001a\u0004\u0018\u00010:J\u0016\u0010I\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+J\u0006\u0010J\u001a\u000203J\u0018\u0010K\u001a\u0002032\u0006\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020\u0018H\u0016J\u0010\u0010L\u001a\u0002032\u0006\u0010M\u001a\u00020\u0018H\u0016J\u0010\u0010L\u001a\u0002032\u0006\u0010N\u001a\u00020 H\u0016J\u0010\u0010O\u001a\u0002032\u0006\u0010P\u001a\u00020 H\u0016J\u0010\u0010Q\u001a\u0002032\u0006\u0010P\u001a\u00020 H\u0016J\u000e\u0010R\u001a\u00020\u00122\u0006\u0010P\u001a\u00020 J\u0006\u0010S\u001a\u00020\u0012J\b\u0010!\u001a\u00020\fH\u0016J\u0006\u0010'\u001a\u00020%J\u0006\u0010(\u001a\u00020%J\b\u0010T\u001a\u00020\u0006H\u0016J\b\u0010U\u001a\u000203H\u0002J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u0018H\u0016J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010N\u001a\u00020 H\u0016J\u0018\u0010V\u001a\u00020\u00122\u0006\u0010W\u001a\u00020 2\u0006\u0010X\u001a\u00020%H\u0002J\u0006\u0010)\u001a\u00020%J\u0006\u0010Y\u001a\u000203J\r\u0010Z\u001a\u00020\u0012H\u0000¢\u0006\u0002\b[J\r\u0010\\\u001a\u000203H\u0000¢\u0006\u0002\b]J\f\u0010^\u001a\u00020\u0012*\u00020\u000eH\u0002R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006d"}, m6176d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "originalRequest", "Lokhttp3/Request;", "listener", "Lokhttp3/WebSocketListener;", "random", "Ljava/util/Random;", "pingIntervalMillis", HttpUrl.FRAGMENT_ENCODE_SET, "extensions", "Lokhttp3/internal/ws/WebSocketExtensions;", "minimumDeflateSize", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "awaitingPong", HttpUrl.FRAGMENT_ENCODE_SET, NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "enqueuedClose", "failed", "key", HttpUrl.FRAGMENT_ENCODE_SET, "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "messageAndCloseQueue", "Ljava/util/ArrayDeque;", HttpUrl.FRAGMENT_ENCODE_SET, "name", "pongQueue", "Lokio/ByteString;", "queueSize", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "receivedCloseCode", HttpUrl.FRAGMENT_ENCODE_SET, "receivedCloseReason", "receivedPingCount", "receivedPongCount", "sentPingCount", "streams", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "awaitTermination", HttpUrl.FRAGMENT_ENCODE_SET, "timeout", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "cancel", "checkUpgradeSuccess", "response", "Lokhttp3/Response;", "exchange", "Lokhttp3/internal/connection/Exchange;", "checkUpgradeSuccess$okhttp", "close", "code", "reason", "cancelAfterCloseMillis", "connect", "client", "Lokhttp3/OkHttpClient;", "failWebSocket", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "initReaderAndWriter", "loopReader", "onReadClose", "onReadMessage", "text", "bytes", "onReadPing", "payload", "onReadPong", "pong", "processNextFrame", "request", "runWriter", "send", SharedDataContentProvider.BASE_PATH, "formatOpcode", "tearDown", "writeOneFrame", "writeOneFrame$okhttp", "writePingFrame", "writePingFrame$okhttp", "isValid", "Close", "Companion", "Message", "Streams", "WriterTask", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 8 */     public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
                private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
                public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
                private static final long MAX_QUEUE_SIZE = 16777216;
                private boolean awaitingPong;
                private Call call;
                private boolean enqueuedClose;
                private WebSocketExtensions extensions;
                private boolean failed;
                private final String key;
                private final WebSocketListener listener;
                private final ArrayDeque<Object> messageAndCloseQueue;
                private long minimumDeflateSize;
                private String name;
                private final Request originalRequest;
                private final long pingIntervalMillis;
                private final ArrayDeque<ByteString> pongQueue;
                private long queueSize;
                private final Random random;
                private WebSocketReader reader;
                private int receivedCloseCode;
                private String receivedCloseReason;
                private int receivedPingCount;
                private int receivedPongCount;
                private int sentPingCount;
                private Streams streams;
                private TaskQueue taskQueue;
                private WebSocketWriter writer;
                private Task writerTask;
                private static final List<Protocol> ONLY_HTTP1 = C1839a.m6210b(Protocol.HTTP_1_1);

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m6176d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", HttpUrl.FRAGMENT_ENCODE_SET, "code", HttpUrl.FRAGMENT_ENCODE_SET, "reason", "Lokio/ByteString;", "cancelAfterCloseMillis", HttpUrl.FRAGMENT_ENCODE_SET, "(ILokio/ByteString;J)V", "getCancelAfterCloseMillis", "()J", "getCode", "()I", "getReason", "()Lokio/ByteString;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class Close {
                    private final long cancelAfterCloseMillis;
                    private final int code;
                    private final ByteString reason;

                    public Close(int i, ByteString byteString, long j) {
/* 4 */                 this.code = i;
/* 6 */                 this.reason = byteString;
/* 8 */                 this.cancelAfterCloseMillis = j;
                    }

                    public final long getCancelAfterCloseMillis() {
/* 1 */                 return this.cancelAfterCloseMillis;
                    }

                    public final int getCode() {
/* 1 */                 return this.code;
                    }

                    public final ByteString getReason() {
/* 1 */                 return this.reason;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m6176d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", HttpUrl.FRAGMENT_ENCODE_SET, "formatOpcode", HttpUrl.FRAGMENT_ENCODE_SET, SharedDataContentProvider.BASE_PATH, "Lokio/ByteString;", "(ILokio/ByteString;)V", "getData", "()Lokio/ByteString;", "getFormatOpcode", "()I", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class Message {
                    private final ByteString data;
                    private final int formatOpcode;

                    public Message(int i, ByteString byteString) {
/* 1 */                 byteString.getClass();
/* 7 */                 this.formatOpcode = i;
/* 9 */                 this.data = byteString;
                    }

                    public final ByteString getData() {
/* 1 */                 return this.data;
                    }

                    public final int getFormatOpcode() {
/* 1 */                 return this.formatOpcode;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m6176d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "client", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "sink", "Lokio/BufferedSink;", "(ZLokio/BufferedSource;Lokio/BufferedSink;)V", "getClient", "()Z", "getSink", "()Lokio/BufferedSink;", "getSource", "()Lokio/BufferedSource;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static abstract class Streams implements Closeable {
                    private final boolean client;
                    private final BufferedSink sink;
                    private final BufferedSource source;

                    public Streams(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink) {
/* 1 */                 bufferedSource.getClass();
/* 4 */                 bufferedSink.getClass();
/* 10 */                this.client = z;
/* 12 */                this.source = bufferedSource;
/* 14 */                this.sink = bufferedSink;
                    }

                    public final boolean getClient() {
/* 1 */                 return this.client;
                    }

                    public final BufferedSink getSink() {
/* 1 */                 return this.sink;
                    }

                    public final BufferedSource getSource() {
/* 1 */                 return this.source;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m6176d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "(Lokhttp3/internal/ws/RealWebSocket;)V", "runOnce", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class WriterTask extends Task {
                    final /* synthetic */ RealWebSocket this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public WriterTask(RealWebSocket realWebSocket) {
/* 19 */                super(Intrinsics.m6219d(" writer", realWebSocket.name), false, 2, null);
/* 1 */                 realWebSocket.getClass();
/* 4 */                 this.this$0 = realWebSocket;
                    }

                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        try {
                            return this.this$0.writeOneFrame$okhttp() ? 0L : -1L;
                        } catch (IOException e) {
/* 16 */                    this.this$0.failWebSocket(e, null);
/* 19 */                    return -1L;
                        }
                    }
                }

                public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j, WebSocketExtensions webSocketExtensions, long j2) {
/* 1 */             taskRunner.getClass();
/* 4 */             request.getClass();
/* 7 */             webSocketListener.getClass();
/* 10 */            random.getClass();
/* 16 */            this.originalRequest = request;
/* 18 */            this.listener = webSocketListener;
/* 20 */            this.random = random;
/* 22 */            this.pingIntervalMillis = j;
/* 24 */            this.extensions = webSocketExtensions;
/* 26 */            this.minimumDeflateSize = j2;
/* 32 */            this.taskQueue = taskRunner.newQueue();
/* 39 */            this.pongQueue = new ArrayDeque<>();
/* 46 */            this.messageAndCloseQueue = new ArrayDeque<>();
/* 49 */            this.receivedCloseCode = -1;
/* 61 */            if (!"GET".equals(request.method())) {
/* 97 */                ds0.m3200q(Intrinsics.m6219d(request.method(), "Request must be GET: "));
/* 101 */               throw null;
                    }
/* 63 */            ByteString.Companion companion = ByteString.INSTANCE;
/* 67 */            byte[] bArr = new byte[16];
/* 69 */            random.nextBytes(bArr);
/* 84 */            this.key = ByteString.Companion.of$default(companion, bArr, 0, 0, 3, null).base64();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final boolean isValid(WebSocketExtensions webSocketExtensions) {
/* 4 */             if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
/* 3 */                 return false;
                    }
/* 15 */            if (webSocketExtensions.serverMaxWindowBits != null) {
/* 23 */                IntRange intRange = new IntRange(8, 15, 1);
/* 28 */                int iIntValue = webSocketExtensions.serverMaxWindowBits.intValue();
/* 32 */                if (8 > iIntValue || iIntValue > intRange.f12927b) {
/* 3 */                     return false;
                        }
                    }
/* 14 */            return true;
                }

                private final void runWriter() {
/* 3 */             if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
/* 22 */                s80.m8422c(Thread.currentThread().getName(), " MUST hold lock on ", this);
/* 25 */                return;
                    }
/* 26 */            Task task = this.writerTask;
/* 28 */            if (task != null) {
/* 36 */                TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
                    }
                }

                private final synchronized boolean send(ByteString data, int formatOpcode) {
/* 5 */             if (!this.failed && !this.enqueuedClose) {
/* 25 */                if (this.queueSize + ((long) data.size()) > MAX_QUEUE_SIZE) {
/* 30 */                    close(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, null);
/* 4 */                     return false;
                        }
/* 45 */                this.queueSize += (long) data.size();
/* 54 */                this.messageAndCloseQueue.add(new Message(formatOpcode, data));
/* 57 */                runWriter();
/* 61 */                return true;
                    }
/* 4 */             return false;
                }

                public final void awaitTermination(long timeout, TimeUnit timeUnit) throws InterruptedException {
/* 1 */             timeUnit.getClass();
/* 10 */            this.taskQueue.idleLatch().await(timeout, timeUnit);
                }

                @Override // okhttp3.WebSocket
                public void cancel() {
/* 1 */             Call call = this.call;
/* 3 */             call.getClass();
/* 6 */             call.cancel();
                }

                public final void checkUpgradeSuccess$okhttp(Response response, Exchange exchange) throws IOException {
/* 1 */             response.getClass();
/* 12 */            if (response.code() != 101) {
/* 202 */               throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
                    }
/* 18 */            String strHeader$default = Response.header$default(response, "Connection", null, 2, null);
/* 28 */            if (!"Upgrade".equalsIgnoreCase(strHeader$default)) {
/* 163 */               throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + ((Object) strHeader$default) + '\'');
                    }
/* 30 */            String strHeader$default2 = Response.header$default(response, "Upgrade", null, 2, null);
/* 40 */            if (!"websocket".equalsIgnoreCase(strHeader$default2)) {
/* 140 */               throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + ((Object) strHeader$default2) + '\'');
                    }
/* 44 */            String strHeader$default3 = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
/* 66 */            String strBase64 = ByteString.INSTANCE.encodeUtf8(Intrinsics.m6219d(WebSocketProtocol.ACCEPT_MAGIC, this.key)).sha1().base64();
/* 74 */            if (Intrinsics.m6216a(strBase64, strHeader$default3)) {
/* 76 */                if (exchange == null) {
/* 86 */                    throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                        }
/* 78 */                return;
                    }
/* 117 */           throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strBase64 + "' but was '" + ((Object) strHeader$default3) + '\'');
                }

                public final synchronized boolean close(int code, String reason, long cancelAfterCloseMillis) {
                    ByteString byteStringEncodeUtf8;
                    try {
/* 4 */                 WebSocketProtocol.INSTANCE.validateCloseCode(code);
/* 7 */                 if (reason != null) {
/* 11 */                    byteStringEncodeUtf8 = ByteString.INSTANCE.encodeUtf8(reason);
/* 24 */                    if (byteStringEncodeUtf8.size() > 123) {
/* 42 */                        throw new IllegalArgumentException(Intrinsics.m6219d(reason, "reason.size() > 123: ").toString());
                            }
                        } else {
/* 45 */                    byteStringEncodeUtf8 = null;
                        }
/* 48 */                if (!this.failed && !this.enqueuedClose) {
/* 56 */                    this.enqueuedClose = true;
/* 65 */                    this.messageAndCloseQueue.add(new Close(code, byteStringEncodeUtf8, cancelAfterCloseMillis));
/* 68 */                    runWriter();
/* 55 */                    return true;
                        }
/* 74 */                return false;
                    } catch (Throwable th) {
/* 77 */                throw th;
                    }
                }

                public final void connect(OkHttpClient client) {
/* 1 */             client.getClass();
/* 12 */            if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
/* 22 */                failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
/* 25 */                return;
                    }
/* 42 */            OkHttpClient okHttpClientBuild = client.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
/* 88 */            final Request requestBuild = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
/* 95 */            RealCall realCall = new RealCall(okHttpClientBuild, requestBuild, true);
/* 98 */            this.call = realCall;
/* 105 */           realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket.connect.1
                        @Override // okhttp3.Callback
                        public void onFailure(Call call, IOException e) {
/* 1 */                     call.getClass();
/* 4 */                     e.getClass();
/* 10 */                    RealWebSocket.this.failWebSocket(e, null);
                        }

                        @Override // okhttp3.Callback
                        public void onResponse(Call call, Response response) throws Throwable {
/* 1 */                     call.getClass();
/* 4 */                     response.getClass();
/* 7 */                     Exchange exchange = response.getExchange();
                            try {
/* 13 */                        RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
/* 16 */                        exchange.getClass();
/* 19 */                        Streams streamsNewWebSocketStreams = exchange.newWebSocketStreams();
/* 29 */                        WebSocketExtensions webSocketExtensions = WebSocketExtensions.INSTANCE.parse(response.headers());
/* 1 */                         RealWebSocket.this.extensions = webSocketExtensions;
/* 44 */                        if (!RealWebSocket.this.isValid(webSocketExtensions)) {
/* 46 */                            RealWebSocket realWebSocket = RealWebSocket.this;
                                    synchronized (realWebSocket) {
/* 53 */                                realWebSocket.messageAndCloseQueue.clear();
/* 60 */                                realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                                    }
                                }
                                try {
/* 102 */                           RealWebSocket.this.initReaderAndWriter(Util.okHttpName + " WebSocket " + requestBuild.url().redact(), streamsNewWebSocketStreams);
/* 113 */                           RealWebSocket.this.getListener().onOpen(RealWebSocket.this, response);
/* 118 */                           RealWebSocket.this.loopReader();
                                } catch (Exception e) {
/* 126 */                           RealWebSocket.this.failWebSocket(e, null);
                                }
                            } catch (IOException e2) {
/* 131 */                       if (exchange != null) {
/* 134 */                           exchange.webSocketUpgradeFailed();
                                }
/* 139 */                       RealWebSocket.this.failWebSocket(e2, response);
/* 142 */                       Util.closeQuietly(response);
                            }
                        }
                    });
                }

                public final void failWebSocket(Exception e, Response response) {
/* 1 */             e.getClass();
                    synchronized (this) {
/* 7 */                 if (this.failed) {
/* 10 */                    return;
                        }
/* 12 */                this.failed = true;
/* 14 */                Streams streams = this.streams;
/* 17 */                this.streams = null;
/* 19 */                WebSocketReader webSocketReader = this.reader;
/* 21 */                this.reader = null;
/* 23 */                WebSocketWriter webSocketWriter = this.writer;
/* 25 */                this.writer = null;
/* 29 */                this.taskQueue.shutdown();
                        try {
/* 35 */                    this.listener.onFailure(this, e, response);
                        } finally {
/* 58 */                    if (streams != null) {
/* 61 */                        Util.closeQuietly(streams);
                            }
/* 64 */                    if (webSocketReader != null) {
/* 67 */                        Util.closeQuietly(webSocketReader);
                            }
/* 70 */                    if (webSocketWriter != null) {
/* 73 */                        Util.closeQuietly(webSocketWriter);
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
                public final WebSocketListener getListener() {
/* 1 */             return this.listener;
                }

                public final void initReaderAndWriter(String name, Streams streams) throws Throwable {
                    Throwable th;
/* 1 */             name.getClass();
/* 4 */             streams.getClass();
/* 7 */             WebSocketExtensions webSocketExtensions = this.extensions;
/* 9 */             webSocketExtensions.getClass();
                    synchronized (this) {
                        try {
/* 13 */                    this.name = name;
/* 15 */                    this.streams = streams;
/* 44 */                    this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
/* 51 */                    this.writerTask = new WriterTask(this);
/* 53 */                    long j = this.pingIntervalMillis;
/* 59 */                    if (j != 0) {
                                try {
/* 63 */                            final long nanos = TimeUnit.MILLISECONDS.toNanos(j);
/* 67 */                            TaskQueue taskQueue = this.taskQueue;
/* 71 */                            final String strM6219d = Intrinsics.m6219d(" ping", name);
/* 80 */                            taskQueue.schedule(new Task(strM6219d, this, nanos) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda-3$$inlined$schedule$1
                                        final /* synthetic */ String $name;
                                        final /* synthetic */ long $pingIntervalNanos$inlined;
                                        final /* synthetic */ RealWebSocket this$0;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
/* 10 */                                    super(strM6219d, false, 2, null);
/* 1 */                                     this.$name = strM6219d;
/* 3 */                                     this.this$0 = this;
/* 5 */                                     this.$pingIntervalNanos$inlined = nanos;
                                        }

                                        @Override // okhttp3.internal.concurrent.Task
                                        public long runOnce() {
/* 3 */                                     this.this$0.writePingFrame$okhttp();
/* 6 */                                     return this.$pingIntervalNanos$inlined;
                                        }
                                    }, nanos);
                                } catch (Throwable th2) {
/* 85 */                            th = th2;
/* 134 */                           throw th;
                                }
                            }
/* 94 */                    if (!this.messageAndCloseQueue.isEmpty()) {
/* 96 */                        runWriter();
                            }
/* 127 */                   this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
                        } catch (Throwable th3) {
/* 132 */                   th = th3;
                        }
                    }
                }

                public final void loopReader() throws IOException {
/* 4 */             while (this.receivedCloseCode == -1) {
/* 6 */                 WebSocketReader webSocketReader = this.reader;
/* 8 */                 webSocketReader.getClass();
/* 11 */                webSocketReader.processNextFrame();
                    }
                }

                @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
                public void onReadClose(int code, String reason) {
                    Streams streams;
                    WebSocketReader webSocketReader;
                    WebSocketWriter webSocketWriter;
/* 1 */             reason.getClass();
/* 5 */             if (code == -1) {
/* 118 */               C1951n4.m6859j("Failed requirement.");
/* 121 */               return;
                    }
                    synchronized (this) {
/* 10 */                if (this.receivedCloseCode != -1) {
/* 113 */                   throw new IllegalStateException("already closed");
                        }
/* 12 */                this.receivedCloseCode = code;
/* 14 */                this.receivedCloseReason = reason;
/* 18 */                streams = null;
/* 19 */                if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
/* 29 */                    Streams streams2 = this.streams;
/* 31 */                    this.streams = null;
/* 33 */                    webSocketReader = this.reader;
/* 35 */                    this.reader = null;
/* 37 */                    webSocketWriter = this.writer;
/* 39 */                    this.writer = null;
/* 43 */                    this.taskQueue.shutdown();
/* 46 */                    streams = streams2;
                        } else {
/* 50 */                    webSocketReader = null;
/* 51 */                    webSocketWriter = null;
                        }
                    }
                    try {
/* 55 */                this.listener.onClosing(this, code, reason);
/* 58 */                if (streams != null) {
/* 62 */                    this.listener.onClosed(this, code, reason);
                        }
                    } finally {
/* 87 */                if (streams != null) {
/* 90 */                    Util.closeQuietly(streams);
                        }
/* 93 */                if (webSocketReader != null) {
/* 96 */                    Util.closeQuietly(webSocketReader);
                        }
/* 99 */                if (webSocketWriter != null) {
/* 102 */                   Util.closeQuietly(webSocketWriter);
                        }
                    }
                }

                @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
                public void onReadMessage(String text) throws IOException {
/* 1 */             text.getClass();
/* 6 */             this.listener.onMessage(this, text);
                }

                @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
                public synchronized void onReadPing(ByteString payload) {
                    try {
/* 2 */                 payload.getClass();
/* 7 */                 if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
/* 26 */                    this.pongQueue.add(payload);
/* 29 */                    runWriter();
/* 36 */                    this.receivedPingCount++;
                        }
                    } catch (Throwable th) {
/* 43 */                throw th;
                    }
                }

                @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
                public synchronized void onReadPong(ByteString payload) {
/* 2 */             payload.getClass();
/* 9 */             this.receivedPongCount++;
/* 12 */            this.awaitingPong = false;
                }

                public final synchronized boolean pong(ByteString payload) {
                    try {
/* 2 */                 payload.getClass();
/* 7 */                 if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
/* 26 */                    this.pongQueue.add(payload);
/* 29 */                    runWriter();
/* 33 */                    return true;
                        }
/* 36 */                return false;
                    } catch (Throwable th) {
/* 39 */                throw th;
                    }
                }

                public final boolean processNextFrame() throws IOException {
                    try {
/* 2 */                 WebSocketReader webSocketReader = this.reader;
/* 4 */                 webSocketReader.getClass();
/* 7 */                 webSocketReader.processNextFrame();
                        return this.receivedCloseCode == -1;
                    } catch (Exception e) {
/* 20 */                failWebSocket(e, null);
/* 1 */                 return false;
                    }
                }

                @Override // okhttp3.WebSocket
                public synchronized long queueSize() {
/* 2 */             return this.queueSize;
                }

                public final synchronized int receivedPingCount() {
/* 2 */             return this.receivedPingCount;
                }

                public final synchronized int receivedPongCount() {
/* 2 */             return this.receivedPongCount;
                }

                @Override // okhttp3.WebSocket
                /* JADX INFO: renamed from: request, reason: from getter */
                public Request getOriginalRequest() {
/* 1 */             return this.originalRequest;
                }

                public final synchronized int sentPingCount() {
/* 2 */             return this.sentPingCount;
                }

                public final void tearDown() throws InterruptedException {
/* 3 */             this.taskQueue.shutdown();
/* 16 */            this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
                }

                public final boolean writeOneFrame$okhttp() throws IOException {
                    String str;
                    WebSocketReader webSocketReader;
                    WebSocketWriter webSocketWriter;
                    int i;
                    Streams streams;
                    synchronized (this) {
                        try {
/* 5 */                     if (this.failed) {
/* 4 */                         return false;
                            }
/* 9 */                     WebSocketWriter webSocketWriter2 = this.writer;
/* 13 */                    ByteString byteStringPoll = this.pongQueue.poll();
/* 17 */                    final boolean z = true;
/* 18 */                    Object obj = null;
/* 20 */                    if (byteStringPoll == null) {
/* 24 */                        Object objPoll = this.messageAndCloseQueue.poll();
/* 30 */                        if (objPoll instanceof Close) {
/* 32 */                            i = this.receivedCloseCode;
/* 34 */                            str = this.receivedCloseReason;
/* 36 */                            if (i != -1) {
/* 38 */                                streams = this.streams;
/* 40 */                                this.streams = null;
/* 42 */                                webSocketReader = this.reader;
/* 44 */                                this.reader = null;
/* 46 */                                webSocketWriter = this.writer;
/* 48 */                                this.writer = null;
/* 52 */                                this.taskQueue.shutdown();
                                    } else {
/* 63 */                                long cancelAfterCloseMillis = ((Close) objPoll).getCancelAfterCloseMillis();
/* 67 */                                TaskQueue taskQueue = this.taskQueue;
/* 73 */                                final String strM6219d = Intrinsics.m6219d(" cancel", this.name);
/* 88 */                                taskQueue.schedule(new Task(strM6219d, z, this) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda-8$$inlined$execute$default$1
                                            final /* synthetic */ boolean $cancelable;
                                            final /* synthetic */ String $name;
                                            final /* synthetic */ RealWebSocket this$0;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
/* 7 */                                         super(strM6219d, z);
/* 1 */                                         this.$name = strM6219d;
/* 3 */                                         this.$cancelable = z;
/* 5 */                                         this.this$0 = this;
                                            }

                                            @Override // okhttp3.internal.concurrent.Task
                                            public long runOnce() {
/* 3 */                                         this.this$0.cancel();
/* 6 */                                         return -1L;
                                            }
                                        }, TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis));
/* 91 */                                streams = null;
/* 92 */                                webSocketReader = null;
/* 93 */                                webSocketWriter = null;
                                    }
                                } else {
/* 95 */                            if (objPoll == null) {
/* 4 */                                 return false;
                                    }
/* 99 */                            str = null;
/* 100 */                           webSocketReader = null;
/* 101 */                           webSocketWriter = null;
/* 102 */                           i = -1;
/* 103 */                           streams = null;
                                }
/* 55 */                        obj = objPoll;
                            } else {
/* 105 */                       str = null;
/* 106 */                       webSocketReader = null;
/* 107 */                       webSocketWriter = null;
/* 108 */                       i = -1;
/* 109 */                       streams = null;
                            }
                            try {
/* 111 */                       if (byteStringPoll != null) {
/* 113 */                           webSocketWriter2.getClass();
/* 118 */                           webSocketWriter2.writePong(byteStringPoll);
                                } else if (obj instanceof Message) {
/* 128 */                           Message message = (Message) obj;
/* 130 */                           webSocketWriter2.getClass();
/* 141 */                           webSocketWriter2.writeMessageFrame(message.getFormatOpcode(), message.getData());
                                    synchronized (this) {
/* 157 */                               this.queueSize -= (long) message.getData().size();
                                    }
                                } else {
/* 166 */                           if (!(obj instanceof Close)) {
/* 218 */                               throw new AssertionError();
                                    }
/* 168 */                           Close close = (Close) obj;
/* 170 */                           webSocketWriter2.getClass();
/* 181 */                           webSocketWriter2.writeClose(close.getCode(), close.getReason());
/* 184 */                           if (streams != null) {
/* 186 */                               WebSocketListener webSocketListener = this.listener;
/* 188 */                               str.getClass();
/* 191 */                               webSocketListener.onClosed(this, i, str);
                                    }
                                }
/* 194 */                       if (streams != null) {
/* 197 */                           Util.closeQuietly(streams);
                                }
/* 200 */                       if (webSocketReader != null) {
/* 203 */                           Util.closeQuietly(webSocketReader);
                                }
/* 206 */                       if (webSocketWriter == null) {
/* 17 */                            return true;
                                }
/* 209 */                       Util.closeQuietly(webSocketWriter);
/* 17 */                        return true;
                            } catch (Throwable th) {
/* 219 */                       if (streams != null) {
/* 222 */                           Util.closeQuietly(streams);
                                }
/* 225 */                       if (webSocketReader != null) {
/* 228 */                           Util.closeQuietly(webSocketReader);
                                }
/* 231 */                       if (webSocketWriter != null) {
/* 234 */                           Util.closeQuietly(webSocketWriter);
                                }
/* 237 */                       throw th;
                            }
                        } catch (Throwable th2) {
/* 239 */                   throw th2;
                        }
                    }
                }

                public final void writePingFrame$okhttp() {
                    synchronized (this) {
                        try {
/* 4 */                     if (this.failed) {
/* 7 */                         return;
                            }
/* 8 */                     WebSocketWriter webSocketWriter = this.writer;
/* 10 */                    if (webSocketWriter == null) {
/* 13 */                        return;
                            }
/* 24 */                    int i = this.awaitingPong ? this.sentPingCount : -1;
/* 29 */                    this.sentPingCount++;
/* 31 */                    this.awaitingPong = true;
/* 35 */                    if (i != -1) {
/* 43 */                        StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
/* 48 */                        sb.append(this.pingIntervalMillis);
/* 53 */                        sb.append("ms (after ");
/* 66 */                        failWebSocket(new SocketTimeoutException(fm0.m3786l(sb, i - 1, " successful ping/pongs)")), null);
/* 69 */                        return;
                            }
                            try {
/* 72 */                        webSocketWriter.writePing(ByteString.EMPTY);
                            } catch (IOException e) {
/* 77 */                        failWebSocket(e, null);
                            }
                        } catch (Throwable th) {
/* 82 */                    throw th;
                        }
                    }
                }

                @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
/* 9 */         public void onReadMessage(ByteString bytes) throws IOException {
                    bytes.getClass();
/* 10 */            this.listener.onMessage(this, bytes);
                }

                @Override // okhttp3.WebSocket
/* 66 */        public boolean send(ByteString bytes) {
                    bytes.getClass();
/* 67 */            return send(bytes, 2);
                }

                @Override // okhttp3.WebSocket
/* 67 */        public boolean send(String text) {
                    text.getClass();
/* 68 */            return send(ByteString.INSTANCE.encodeUtf8(text), 1);
                }

                @Override // okhttp3.WebSocket
/* 77 */        public boolean close(int code, String reason) {
/* 78 */            return close(code, reason, CANCEL_AFTER_CLOSE_MILLIS);
                }
            }
