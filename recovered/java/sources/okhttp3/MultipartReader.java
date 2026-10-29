            package okhttp3;

            import android.support.v4.media.session.PlaybackStateCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.Closeable;
            import java.io.IOException;
            import java.net.ProtocolException;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.internal.http1.HeadersReader;
            import okio.Buffer;
            import okio.BufferedSource;
            import okio.ByteString;
            import okio.Okio;
            import okio.Options;
            import okio.Source;
            import okio.Timeout;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001c\u001d\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0018\u00010\u0010R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m6176d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "response", "Lokhttp3/ResponseBody;", "(Lokhttp3/ResponseBody;)V", FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "boundary", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokio/BufferedSource;Ljava/lang/String;)V", "()Ljava/lang/String;", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "crlfDashDashBoundary", "Lokio/ByteString;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "dashDashBoundary", "noMoreParts", "partCount", HttpUrl.FRAGMENT_ENCODE_SET, "close", HttpUrl.FRAGMENT_ENCODE_SET, "currentPartBytesRemaining", HttpUrl.FRAGMENT_ENCODE_SET, "maxResult", "nextPart", "Lokhttp3/MultipartReader$Part;", "Companion", "Part", "PartSource", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class MultipartReader implements Closeable {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final Options afterBoundaryOptions;
                private final String boundary;
                private boolean closed;
                private final ByteString crlfDashDashBoundary;
                private PartSource currentPart;
                private final ByteString dashDashBoundary;
                private boolean noMoreParts;
                private int partCount;
                private final BufferedSource source;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\nH\u0096\u0001R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\b¨\u0006\u000b"}, m6176d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "headers", "Lokhttp3/Headers;", "body", "Lokio/BufferedSource;", "(Lokhttp3/Headers;Lokio/BufferedSource;)V", "()Lokio/BufferedSource;", "()Lokhttp3/Headers;", "close", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class Part implements Closeable {
                    private final BufferedSource body;
                    private final Headers headers;

                    public Part(Headers headers, BufferedSource bufferedSource) {
/* 1 */                 headers.getClass();
/* 4 */                 bufferedSource.getClass();
/* 10 */                this.headers = headers;
/* 12 */                this.body = bufferedSource;
                    }

                    /* JADX INFO: renamed from: body, reason: from getter */
                    public final BufferedSource getBody() {
/* 1 */                 return this.body;
                    }

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
/* 3 */                 this.body.close();
                    }

                    /* JADX INFO: renamed from: headers, reason: from getter */
                    public final Headers getHeaders() {
/* 1 */                 return this.headers;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\u0003\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m6176d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lokio/Source;", "(Lokhttp3/MultipartReader;)V", "timeout", "Lokio/Timeout;", "close", HttpUrl.FRAGMENT_ENCODE_SET, "read", HttpUrl.FRAGMENT_ENCODE_SET, "sink", "Lokio/Buffer;", "byteCount", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class PartSource implements Source {
                    final /* synthetic */ MultipartReader this$0;
                    private final Timeout timeout;

                    public PartSource(MultipartReader multipartReader) {
/* 1 */                 multipartReader.getClass();
/* 4 */                 this.this$0 = multipartReader;
/* 14 */                this.timeout = new Timeout();
                    }

                    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
/* 11 */                if (Intrinsics.m6216a(this.this$0.currentPart, this)) {
/* 1 */                     this.this$0.currentPart = null;
                        }
                    }

                    @Override // okio.Source
                    public long read(Buffer sink, long byteCount) {
/* 7 */                 sink.getClass();
/* 14 */                if (byteCount < 0) {
/* 223 */                   ds0.m3200q(Intrinsics.m6219d(Long.valueOf(byteCount), "byteCount < 0: "));
/* 10 */                    return 0L;
                        }
/* 26 */                if (!Intrinsics.m6216a(this.this$0.currentPart, this)) {
/* 208 */                   f42.m3656l("closed");
/* 10 */                    return 0L;
                        }
/* 34 */                Timeout timeout = this.this$0.source.getTimeout();
/* 38 */                Timeout timeout2 = this.timeout;
/* 40 */                MultipartReader multipartReader = this.this$0;
/* 42 */                long timeoutNanos = timeout.getTimeoutNanos();
/* 56 */                long jMinTimeout = Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
/* 60 */                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
/* 62 */                timeout.timeout(jMinTimeout, timeUnit);
/* 69 */                if (!timeout.getHasDeadline()) {
/* 150 */                   if (timeout2.getHasDeadline()) {
/* 156 */                       timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
/* 1 */                         long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(byteCount);
/* 174 */                       return jCurrentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining);
                            } finally {
/* 192 */                       timeout.timeout(timeoutNanos, timeUnit);
/* 199 */                       if (timeout2.getHasDeadline()) {
/* 201 */                           timeout.clearDeadline();
                                }
                            }
                        }
/* 71 */                long jDeadlineNanoTime = timeout.deadlineNanoTime();
/* 79 */                if (timeout2.getHasDeadline()) {
/* 94 */                    timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
/* 1 */                     long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(byteCount);
/* 114 */                   return jCurrentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining2);
                        } finally {
/* 132 */                   timeout.timeout(timeoutNanos, timeUnit);
/* 139 */                   if (timeout2.getHasDeadline()) {
/* 141 */                       timeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                        }
                    }

                    @Override // okio.Source
                    /* JADX INFO: renamed from: timeout, reason: from getter */
                    public Timeout getTimeout() {
/* 1 */                 return this.timeout;
                    }
                }

                static {
/* 9 */             Options.Companion companion = Options.INSTANCE;
/* 11 */            ByteString.Companion companion2 = ByteString.INSTANCE;
/* 45 */            afterBoundaryOptions = companion.m7205of(companion2.encodeUtf8("\r\n"), companion2.encodeUtf8("--"), companion2.encodeUtf8(" "), companion2.encodeUtf8("\t"));
                }

                public MultipartReader(BufferedSource bufferedSource, String str) throws IOException {
/* 1 */             bufferedSource.getClass();
/* 4 */             str.getClass();
/* 10 */            this.source = bufferedSource;
/* 12 */            this.boundary = str;
/* 33 */            this.dashDashBoundary = new Buffer().writeUtf8("--").writeUtf8(str).readByteString();
/* 54 */            this.crlfDashDashBoundary = new Buffer().writeUtf8("\r\n--").writeUtf8(str).readByteString();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final long currentPartBytesRemaining(long maxResult) throws IOException {
/* 10 */            this.source.require(this.crlfDashDashBoundary.size());
/* 21 */            long jIndexOf = this.source.getBuffer().indexOf(this.crlfDashDashBoundary);
                    return jIndexOf == -1 ? Math.min(maxResult, (this.source.getBuffer().size() - ((long) this.crlfDashDashBoundary.size())) + 1) : Math.min(maxResult, jIndexOf);
                }

                /* JADX INFO: renamed from: boundary, reason: from getter */
                public final String getBoundary() {
/* 1 */             return this.boundary;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
/* 3 */             if (this.closed) {
/* 5 */                 return;
                    }
/* 7 */             this.closed = true;
/* 10 */            this.currentPart = null;
/* 14 */            this.source.close();
                }

                public final Part nextPart() throws IOException {
                    BufferedSource bufferedSource;
/* 3 */             if (this.closed) {
/* 158 */               f42.m3656l("closed");
/* 161 */               return null;
                    }
/* 8 */             if (this.noMoreParts) {
/* 7 */                 return null;
                    }
/* 15 */            if (this.partCount == 0 && this.source.rangeEquals(0L, this.dashDashBoundary)) {
/* 36 */                this.source.skip(this.dashDashBoundary.size());
                    } else {
                        while (true) {
/* 42 */                    long jCurrentPartBytesRemaining = currentPartBytesRemaining(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
/* 48 */                    bufferedSource = this.source;
/* 50 */                    if (jCurrentPartBytesRemaining == 0) {
                                break;
                            }
/* 152 */                   bufferedSource.skip(jCurrentPartBytesRemaining);
                        }
/* 59 */                bufferedSource.skip(this.crlfDashDashBoundary.size());
                    }
/* 62 */            boolean z = false;
                    while (true) {
/* 67 */                int iSelect = this.source.select(afterBoundaryOptions);
/* 74 */                if (iSelect == -1) {
/* 151 */                   throw new ProtocolException("unexpected characters after boundary");
                        }
/* 77 */                if (iSelect == 0) {
/* 116 */                   this.partCount++;
/* 125 */                   Headers headers = new HeadersReader(this.source).readHeaders();
/* 131 */                   PartSource partSource = new PartSource(this);
/* 134 */                   this.currentPart = partSource;
/* 142 */                   return new Part(headers, Okio.buffer(partSource));
                        }
/* 79 */                if (iSelect == 1) {
/* 90 */                    if (z) {
/* 112 */                       throw new ProtocolException("unexpected characters after boundary");
                            }
/* 94 */                    if (this.partCount == 0) {
/* 106 */                       throw new ProtocolException("expected at least 1 part");
                            }
/* 96 */                    this.noMoreParts = true;
/* 7 */                     return null;
                        }
/* 82 */                if (iSelect == 2 || iSelect == 3) {
/* 88 */                    z = true;
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m6176d2 = {"Lokhttp3/MultipartReader$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "afterBoundaryOptions", "Lokio/Options;", "getAfterBoundaryOptions", "()Lokio/Options;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final Options getAfterBoundaryOptions() {
/* 1 */                 return MultipartReader.afterBoundaryOptions;
                    }

/* 4 */             private Companion() {
                    }
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 56 */        public MultipartReader(ResponseBody responseBody) throws IOException {
                    responseBody.getClass();
/* 57 */            BufferedSource bodySource = responseBody.getBodySource();
/* 58 */            MediaType mediaType = responseBody.get$contentType();
                    String strParameter = mediaType == null ? null : mediaType.parameter("boundary");
                    if (strParameter != null) {
/* 59 */                this(bodySource, strParameter);
                        return;
                    }
/* 60 */            throw new ProtocolException("expected the Content-Type to have a boundary parameter");
                }
            }
