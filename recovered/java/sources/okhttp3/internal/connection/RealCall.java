            package okhttp3.internal.connection;

            import androidx.core.app.NotificationCompat;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.lang.ref.Reference;
            import java.lang.ref.WeakReference;
            import java.net.Socket;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import javax.net.ssl.HostnameVerifier;
            import javax.net.ssl.SSLSocketFactory;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.Address;
            import okhttp3.Call;
            import okhttp3.Callback;
            import okhttp3.CertificatePinner;
            import okhttp3.Dispatcher;
            import okhttp3.EventListener;
            import okhttp3.HttpUrl;
            import okhttp3.OkHttpClient;
            import okhttp3.Request;
            import okhttp3.Response;
            import okhttp3.internal.Util;
            import okhttp3.internal.cache.CacheInterceptor;
            import okhttp3.internal.http.BridgeInterceptor;
            import okhttp3.internal.http.CallServerInterceptor;
            import okhttp3.internal.http.RealInterceptorChain;
            import okhttp3.internal.http.RetryAndFollowUpInterceptor;
            import okhttp3.internal.platform.Platform;
            import okio.AsyncTimeout;
            import p000.C2270uw;
            import p000.ds0;
            import p000.f42;
            import p000.jf0;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001.\u0018\u00002\u00020\u0001:\u0002deB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u00101\u001a\u0002022\u0006\u0010\u0010\u001a\u00020\u000fJ!\u00103\u001a\u0002H4\"\n\b\u0000\u00104*\u0004\u0018\u0001052\u0006\u00106\u001a\u0002H4H\u0002¢\u0006\u0002\u00107J\b\u00108\u001a\u000202H\u0002J\b\u00109\u001a\u000202H\u0016J\b\u0010:\u001a\u00020\u0000H\u0016J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020AH\u0016J\u0016\u0010B\u001a\u0002022\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0007J\b\u0010E\u001a\u00020FH\u0016J\u0015\u0010G\u001a\u0002022\u0006\u0010H\u001a\u00020\u0007H\u0000¢\u0006\u0002\bIJ\r\u0010J\u001a\u00020FH\u0000¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020NH\u0000¢\u0006\u0002\bOJ\b\u0010P\u001a\u00020\u0007H\u0016J\b\u0010Q\u001a\u00020\u0007H\u0016J;\u0010R\u001a\u0002H4\"\n\b\u0000\u00104*\u0004\u0018\u0001052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u00072\u0006\u00106\u001a\u0002H4H\u0000¢\u0006\u0004\bU\u0010VJ\u0019\u0010W\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0002\bXJ\r\u0010Y\u001a\u00020ZH\u0000¢\u0006\u0002\b[J\u000f\u0010\\\u001a\u0004\u0018\u00010]H\u0000¢\u0006\u0002\b^J\b\u0010C\u001a\u00020\u0005H\u0016J\u0006\u0010_\u001a\u00020\u0007J\b\u0010-\u001a\u00020`H\u0016J\u0006\u00100\u001a\u000202J!\u0010a\u001a\u0002H4\"\n\b\u0000\u00104*\u0004\u0018\u0001052\u0006\u0010b\u001a\u0002H4H\u0002¢\u0006\u0002\u00107J\b\u0010c\u001a\u00020ZH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\"\u0010&\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001e@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0004\n\u0002\u0010/R\u000e\u00100\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006f"}, m6176d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "client", "Lokhttp3/OkHttpClient;", "originalRequest", "Lokhttp3/Request;", "forWebSocket", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "callStackTrace", HttpUrl.FRAGMENT_ENCODE_SET, "canceled", "getClient", "()Lokhttp3/OkHttpClient;", "<set-?>", "Lokhttp3/internal/connection/RealConnection;", "connection", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionToCancel", "getConnectionToCancel", "setConnectionToCancel", "(Lokhttp3/internal/connection/RealConnection;)V", "eventListener", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "exchange", "Lokhttp3/internal/connection/Exchange;", "exchangeFinder", "Lokhttp3/internal/connection/ExchangeFinder;", "executed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "expectMoreExchanges", "getForWebSocket", "()Z", "interceptorScopedExchange", "getInterceptorScopedExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "getOriginalRequest", "()Lokhttp3/Request;", "requestBodyOpen", "responseBodyOpen", "timeout", "okhttp3/internal/connection/RealCall$timeout$1", "Lokhttp3/internal/connection/RealCall$timeout$1;", "timeoutEarlyExit", "acquireConnectionNoEvents", HttpUrl.FRAGMENT_ENCODE_SET, "callDone", "E", "Ljava/io/IOException;", "e", "(Ljava/io/IOException;)Ljava/io/IOException;", "callStart", "cancel", "clone", "createAddress", "Lokhttp3/Address;", "url", "Lokhttp3/HttpUrl;", "enqueue", "responseCallback", "Lokhttp3/Callback;", "enterNetworkInterceptorExchange", "request", "newExchangeFinder", "execute", "Lokhttp3/Response;", "exitNetworkInterceptorExchange", "closeExchange", "exitNetworkInterceptorExchange$okhttp", "getResponseWithInterceptorChain", "getResponseWithInterceptorChain$okhttp", "initExchange", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "initExchange$okhttp", "isCanceled", "isExecuted", "messageDone", "requestDone", "responseDone", "messageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;", "noMoreExchanges", "noMoreExchanges$okhttp", "redactedUrl", HttpUrl.FRAGMENT_ENCODE_SET, "redactedUrl$okhttp", "releaseConnectionNoEvents", "Ljava/net/Socket;", "releaseConnectionNoEvents$okhttp", "retryAfterFailure", "Lokio/AsyncTimeout;", "timeoutExit", "cause", "toLoggableString", "AsyncCall", "CallReference", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 4 */     public final class RealCall implements Call {
                private Object callStackTrace;
                private volatile boolean canceled;
                private final OkHttpClient client;
                private RealConnection connection;
                private final RealConnectionPool connectionPool;
                private volatile RealConnection connectionToCancel;
                private final EventListener eventListener;
                private volatile Exchange exchange;
                private ExchangeFinder exchangeFinder;
                private final AtomicBoolean executed;
                private boolean expectMoreExchanges;
                private final boolean forWebSocket;
                private Exchange interceptorScopedExchange;
                private final Request originalRequest;
                private boolean requestBodyOpen;
                private boolean responseBodyOpen;
                private final C20131 timeout;
                private boolean timeoutEarlyExit;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\u0000R\u00020\u0006J\b\u0010\u001c\u001a\u00020\u0017H\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m6176d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "responseCallback", "Lokhttp3/Callback;", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/Callback;)V", NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "getCall", "()Lokhttp3/internal/connection/RealCall;", "<set-?>", "Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "getCallsPerHost", "()Ljava/util/concurrent/atomic/AtomicInteger;", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, HttpUrl.FRAGMENT_ENCODE_SET, "getHost", "()Ljava/lang/String;", "request", "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "executeOn", HttpUrl.FRAGMENT_ENCODE_SET, "executorService", "Ljava/util/concurrent/ExecutorService;", "reuseCallsPerHostFrom", "other", "run", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class AsyncCall implements Runnable {
                    private volatile AtomicInteger callsPerHost;
                    private final Callback responseCallback;
                    final /* synthetic */ RealCall this$0;

                    public AsyncCall(RealCall realCall, Callback callback) {
/* 1 */                 realCall.getClass();
/* 4 */                 callback.getClass();
/* 7 */                 this.this$0 = realCall;
/* 12 */                this.responseCallback = callback;
/* 20 */                this.callsPerHost = new AtomicInteger(0);
                    }

                    public final void executeOn(ExecutorService executorService) {
/* 1 */                 executorService.getClass();
/* 10 */                Dispatcher dispatcher = this.this$0.getClient().dispatcher();
/* 16 */                if (Util.assertionsEnabled && Thread.holdsLock(dispatcher)) {
/* 35 */                    s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", dispatcher);
/* 38 */                    return;
                        }
                        try {
                            try {
/* 39 */                        executorService.execute(this);
                            } catch (RejectedExecutionException e) {
/* 50 */                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
/* 53 */                        interruptedIOException.initCause(e);
/* 58 */                        this.this$0.noMoreExchanges$okhttp(interruptedIOException);
/* 65 */                        this.responseCallback.onFailure(this.this$0, interruptedIOException);
/* 78 */                        this.this$0.getClient().dispatcher().finished$okhttp(this);
                            }
                        } catch (Throwable th) {
/* 92 */                    this.this$0.getClient().dispatcher().finished$okhttp(this);
/* 95 */                    throw th;
                        }
                    }

                    /* JADX INFO: renamed from: getCall, reason: from getter */
                    public final RealCall getThis$0() {
/* 1 */                 return this.this$0;
                    }

                    public final AtomicInteger getCallsPerHost() {
/* 1 */                 return this.callsPerHost;
                    }

                    public final String getHost() {
/* 11 */                return this.this$0.getOriginalRequest().url().host();
                    }

                    public final Request getRequest() {
/* 3 */                 return this.this$0.getOriginalRequest();
                    }

                    public final void reuseCallsPerHostFrom(AsyncCall other) {
/* 1 */                 other.getClass();
/* 6 */                 this.callsPerHost = other.callsPerHost;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z;
                        Throwable th;
                        IOException e;
                        OkHttpClient client;
/* 9 */                 String strM6219d = Intrinsics.m6219d(this.this$0.redactedUrl$okhttp(), "OkHttp ");
/* 13 */                RealCall realCall = this.this$0;
/* 15 */                Thread threadCurrentThread = Thread.currentThread();
/* 19 */                String name = threadCurrentThread.getName();
/* 23 */                threadCurrentThread.setName(strM6219d);
                        try {
/* 30 */                    realCall.timeout.enter();
                            try {
                                try {
/* 38 */                            z = true;
                                    try {
/* 41 */                                this.responseCallback.onResponse(realCall, realCall.getResponseWithInterceptorChain$okhttp());
/* 44 */                                client = realCall.getClient();
                                    } catch (IOException e2) {
/* 60 */                                e = e2;
/* 98 */                                if (z) {
/* 117 */                                   Platform.INSTANCE.get().log(Intrinsics.m6219d(realCall.toLoggableString(), "Callback failure for "), 4, e);
                                        } else {
/* 123 */                                   this.responseCallback.onFailure(realCall, e);
                                        }
/* 126 */                               client = realCall.getClient();
                                    } catch (Throwable th2) {
/* 58 */                                th = th2;
/* 66 */                                realCall.cancel();
/* 69 */                                if (!z) {
/* 79 */                                    IOException iOException = new IOException(Intrinsics.m6219d(th, "canceled due to "));
/* 82 */                                    jf0.m5798a(iOException, th);
/* 87 */                                    this.responseCallback.onFailure(realCall, iOException);
                                        }
/* 93 */                                throw th;
                                    }
                                } catch (Throwable th3) {
/* 143 */                           realCall.getClient().dispatcher().finished$okhttp(this);
/* 146 */                           throw th3;
                                }
                            } catch (IOException e3) {
/* 96 */                        z = false;
/* 97 */                        e = e3;
                            } catch (Throwable th4) {
/* 64 */                        z = false;
/* 65 */                        th = th4;
                            }
/* 52 */                    client.dispatcher().finished$okhttp(this);
/* 131 */                   threadCurrentThread.setName(name);
                        } catch (Throwable th5) {
/* 147 */                   threadCurrentThread.setName(name);
/* 150 */                   throw th5;
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m6176d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "referent", "callStackTrace", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", "getCallStackTrace", "()Ljava/lang/Object;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class CallReference extends WeakReference<RealCall> {
                    private final Object callStackTrace;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public CallReference(RealCall realCall, Object obj) {
/* 4 */                 super(realCall);
/* 1 */                 realCall.getClass();
/* 7 */                 this.callStackTrace = obj;
                    }

                    public final Object getCallStackTrace() {
/* 1 */                 return this.callStackTrace;
                    }
                }

                /* JADX WARN: Type inference failed for: r2v3, types: [okhttp3.internal.connection.RealCall$timeout$1, okio.Timeout] */
                public RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
/* 1 */             okHttpClient.getClass();
/* 4 */             request.getClass();
/* 10 */            this.client = okHttpClient;
/* 12 */            this.originalRequest = request;
/* 14 */            this.forWebSocket = z;
/* 24 */            this.connectionPool = okHttpClient.connectionPool().getDelegate();
/* 34 */            this.eventListener = okHttpClient.eventListenerFactory().create(this);
/* 38 */            ?? r2 = new AsyncTimeout() { // from class: okhttp3.internal.connection.RealCall.timeout.1
                        @Override // okio.AsyncTimeout
                        public void timedOut() {
/* 3 */                     RealCall.this.cancel();
                        }
                    };
/* 52 */            r2.timeout(getClient().callTimeoutMillis(), TimeUnit.MILLISECONDS);
/* 55 */            this.timeout = r2;
/* 62 */            this.executed = new AtomicBoolean();
/* 65 */            this.expectMoreExchanges = true;
                }

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
                private final <E extends IOException> E callDone(E e) {
                    Socket socketReleaseConnectionNoEvents$okhttp;
/* 1 */             boolean z = Util.assertionsEnabled;
/* 4 */             if (z && Thread.holdsLock(this)) {
/* 23 */                s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
/* 3 */                 return null;
                    }
/* 27 */            RealConnection realConnection = this.connection;
/* 29 */            if (realConnection != null) {
/* 31 */                if (z && Thread.holdsLock(realConnection)) {
/* 50 */                    s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", realConnection);
/* 3 */                     return null;
                        }
                        synchronized (realConnection) {
/* 55 */                    socketReleaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
                        }
/* 62 */                if (this.connection == null) {
/* 64 */                    if (socketReleaseConnectionNoEvents$okhttp != null) {
/* 67 */                        Util.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
                            }
/* 72 */                    this.eventListener.connectionReleased(this, realConnection);
                        } else if (socketReleaseConnectionNoEvents$okhttp != null) {
/* 81 */                    f42.m3656l("Check failed.");
/* 3 */                     return null;
                        }
                    }
/* 88 */            E e2 = (E) timeoutExit(e);
/* 92 */            EventListener eventListener = this.eventListener;
/* 94 */            if (e == null) {
/* 103 */               eventListener.callEnd(this);
/* 106 */               return e2;
                    }
/* 96 */            e2.getClass();
/* 99 */            eventListener.callFailed(this, e2);
/* 102 */           return e2;
                }

                private final void callStart() {
/* 13 */            this.callStackTrace = Platform.INSTANCE.get().getStackTraceForCloseable("response.body().close()");
/* 17 */            this.eventListener.callStart(this);
                }

                private final Address createAddress(HttpUrl url) {
                    SSLSocketFactory sslSocketFactory;
                    HostnameVerifier hostnameVerifier;
                    CertificatePinner certificatePinner;
/* 5 */             if (url.getIsHttps()) {
/* 9 */                 sslSocketFactory = this.client.sslSocketFactory();
/* 15 */                hostnameVerifier = this.client.hostnameVerifier();
/* 21 */                certificatePinner = this.client.certificatePinner();
                    } else {
/* 30 */                sslSocketFactory = null;
/* 31 */                hostnameVerifier = null;
/* 32 */                certificatePinner = null;
                    }
/* 85 */            return new Address(url.host(), url.port(), this.client.dns(), this.client.socketFactory(), sslSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
                }

                private final <E extends IOException> E timeoutExit(E cause) {
/* 3 */             if (this.timeoutEarlyExit || !exit()) {
/* 14 */                return cause;
                    }
/* 19 */            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
/* 22 */            if (cause != null) {
/* 24 */                interruptedIOException.initCause(cause);
                    }
/* 27 */            return interruptedIOException;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final String toLoggableString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 17 */            sb.append(getCanceled() ? "canceled " : HttpUrl.FRAGMENT_ENCODE_SET);
/* 29 */            sb.append(this.forWebSocket ? "web socket" : NotificationCompat.CATEGORY_CALL);
/* 34 */            sb.append(" to ");
/* 41 */            sb.append(redactedUrl$okhttp());
/* 44 */            return sb.toString();
                }

                public final void acquireConnectionNoEvents(RealConnection connection) {
/* 1 */             connection.getClass();
/* 6 */             if (Util.assertionsEnabled && !Thread.holdsLock(connection)) {
/* 25 */                s80.m8422c(Thread.currentThread().getName(), " MUST hold lock on ", connection);
                    } else if (this.connection != null) {
/* 52 */                f42.m3656l("Check failed.");
                    } else {
/* 33 */                this.connection = connection;
/* 46 */                connection.getCalls().add(new CallReference(this, this.callStackTrace));
                    }
                }

                @Override // okhttp3.Call
                public void cancel() {
/* 3 */             if (this.canceled) {
/* 5 */                 return;
                    }
/* 7 */             this.canceled = true;
/* 9 */             Exchange exchange = this.exchange;
/* 11 */            if (exchange != null) {
/* 14 */                exchange.cancel();
                    }
/* 17 */            RealConnection realConnection = this.connectionToCancel;
/* 19 */            if (realConnection != null) {
/* 22 */                realConnection.cancel();
                    }
/* 27 */            this.eventListener.canceled(this);
                }

                @Override // okhttp3.Call
                public RealCall clone() {
/* 9 */             return new RealCall(this.client, this.originalRequest, this.forWebSocket);
                }

                @Override // okhttp3.Call
                public void enqueue(Callback responseCallback) {
/* 1 */             responseCallback.getClass();
/* 12 */            if (!this.executed.compareAndSet(false, true)) {
/* 34 */                f42.m3656l("Already Executed");
                    } else {
/* 14 */                callStart();
/* 28 */                this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, responseCallback));
                    }
                }

                public final void enterNetworkInterceptorExchange(Request request, boolean newExchangeFinder) {
/* 1 */             request.getClass();
/* 6 */             if (this.interceptorScopedExchange != null) {
/* 62 */                f42.m3656l("Check failed.");
/* 65 */                return;
                    }
                    synchronized (this) {
                        try {
/* 11 */                    if (this.responseBodyOpen) {
/* 57 */                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                            }
/* 15 */                    if (this.requestBodyOpen) {
/* 47 */                        throw new IllegalStateException("Check failed.");
                            }
                        } catch (Throwable th) {
/* 59 */                    throw th;
                        }
                    }
/* 18 */            if (newExchangeFinder) {
/* 37 */                this.exchangeFinder = new ExchangeFinder(this.connectionPool, createAddress(request.url()), this, this.eventListener);
                    }
                }

                @Override // okhttp3.Call
                public Response execute() {
/* 9 */             if (!this.executed.compareAndSet(false, true)) {
/* 55 */                f42.m3656l("Already Executed");
/* 58 */                return null;
                    }
/* 13 */            enter();
/* 16 */            callStart();
                    try {
/* 25 */                this.client.dispatcher().executed$okhttp(this);
/* 28 */                return getResponseWithInterceptorChain$okhttp();
                    } finally {
/* 49 */                this.client.dispatcher().finished$okhttp(this);
                    }
                }

                public final void exitNetworkInterceptorExchange$okhttp(boolean closeExchange) {
                    Exchange exchange;
                    synchronized (this) {
/* 4 */                 if (!this.expectMoreExchanges) {
/* 28 */                    throw new IllegalStateException("released");
                        }
                    }
/* 7 */             if (closeExchange && (exchange = this.exchange) != null) {
/* 14 */                exchange.detachWithViolence();
                    }
/* 18 */            this.interceptorScopedExchange = null;
                }

                public final OkHttpClient getClient() {
/* 1 */             return this.client;
                }

                public final RealConnection getConnection() {
/* 1 */             return this.connection;
                }

                public final RealConnection getConnectionToCancel() {
/* 1 */             return this.connectionToCancel;
                }

                /* JADX INFO: renamed from: getEventListener$okhttp, reason: from getter */
                public final EventListener getEventListener() {
/* 1 */             return this.eventListener;
                }

                public final boolean getForWebSocket() {
/* 1 */             return this.forWebSocket;
                }

                /* JADX INFO: renamed from: getInterceptorScopedExchange$okhttp, reason: from getter */
                public final Exchange getInterceptorScopedExchange() {
/* 1 */             return this.interceptorScopedExchange;
                }

                public final Request getOriginalRequest() {
/* 1 */             return this.originalRequest;
                }

                public final Response getResponseWithInterceptorChain$okhttp() throws IOException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 12 */            C2270uw.m9140k(arrayList, this.client.interceptors());
/* 22 */            arrayList.add(new RetryAndFollowUpInterceptor(this.client));
/* 36 */            arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
/* 50 */            arrayList.add(new CacheInterceptor(this.client.cache()));
/* 55 */            arrayList.add(ConnectInterceptor.INSTANCE);
/* 60 */            if (!this.forWebSocket) {
/* 68 */                C2270uw.m9140k(arrayList, this.client.networkInterceptors());
                    }
/* 78 */            arrayList.add(new CallServerInterceptor(this.forWebSocket));
                    try {
                        try {
/* 113 */                   Response responseProceed = new RealInterceptorChain(this, arrayList, 0, null, this.originalRequest, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis()).proceed(this.originalRequest);
/* 121 */                   if (getCanceled()) {
/* 127 */                       Util.closeQuietly(responseProceed);
/* 137 */                       throw new IOException("Canceled");
                            }
/* 123 */                   noMoreExchanges$okhttp(null);
/* 126 */                   return responseProceed;
                        } catch (IOException e) {
/* 142 */                   IOException iOExceptionNoMoreExchanges$okhttp = noMoreExchanges$okhttp(e);
/* 146 */                   if (iOExceptionNoMoreExchanges$okhttp == null) {
/* 155 */                       throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                            }
/* 156 */                   throw iOExceptionNoMoreExchanges$okhttp;
                        }
                    } catch (Throwable th) {
/* 157 */               if (0 == 0) {
/* 159 */                   noMoreExchanges$okhttp(null);
                        }
/* 162 */               throw th;
                    }
                }

                public final Exchange initExchange$okhttp(RealInterceptorChain chain) throws IOException {
/* 1 */             chain.getClass();
                    synchronized (this) {
                        try {
/* 7 */                     if (!this.expectMoreExchanges) {
/* 87 */                        throw new IllegalStateException("released");
                            }
/* 11 */                    if (this.responseBodyOpen) {
/* 79 */                        throw new IllegalStateException("Check failed.");
                            }
/* 15 */                    if (this.requestBodyOpen) {
/* 69 */                        throw new IllegalStateException("Check failed.");
                            }
                        } catch (Throwable th) {
/* 89 */                    throw th;
                        }
                    }
/* 18 */            ExchangeFinder exchangeFinder = this.exchangeFinder;
/* 20 */            exchangeFinder.getClass();
/* 33 */            Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find(this.client, chain));
/* 36 */            this.interceptorScopedExchange = exchange;
/* 38 */            this.exchange = exchange;
                    synchronized (this) {
/* 42 */                this.requestBodyOpen = true;
/* 44 */                this.responseBodyOpen = true;
                    }
/* 49 */            if (!this.canceled) {
/* 51 */                return exchange;
                    }
/* 54 */            ds0.m3195l("Canceled");
/* 57 */            return null;
                }

                @Override // okhttp3.Call
                /* JADX INFO: renamed from: isCanceled, reason: from getter */
                public boolean getCanceled() {
/* 1 */             return this.canceled;
                }

                @Override // okhttp3.Call
                public boolean isExecuted() {
/* 3 */             return this.executed.get();
                }

                /* JADX WARN: Code duplicated, block: B:16:0x001d A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:17:0x001f A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:8:0x0010, B:17:0x001f, B:19:0x0023, B:20:0x0025, B:22:0x002a, B:27:0x0033, B:29:0x0037, B:14:0x0019), top: B:46:0x0010 }] */
                /* JADX WARN: Code duplicated, block: B:19:0x0023 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:8:0x0010, B:17:0x001f, B:19:0x0023, B:20:0x0025, B:22:0x002a, B:27:0x0033, B:29:0x0037, B:14:0x0019), top: B:46:0x0010 }] */
                /* JADX WARN: Code duplicated, block: B:25:0x0030  */
                public final <E extends IOException> E messageDone$okhttp(Exchange exchange, boolean requestDone, boolean responseDone, E e) {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    boolean z4;
/* 1 */             exchange.getClass();
/* 10 */            if (Intrinsics.m6216a(exchange, this.exchange)) {
                        synchronized (this) {
/* 14 */                    z = false;
/* 15 */                    if (requestDone) {
                                try {
/* 19 */                            if (this.requestBodyOpen) {
/* 30 */                                if (requestDone) {
/* 32 */                                    this.requestBodyOpen = false;
                                        }
/* 34 */                                if (responseDone) {
/* 36 */                                    this.responseBodyOpen = false;
                                        }
/* 38 */                                z3 = this.requestBodyOpen;
/* 41 */                                if (z3) {
/* 49 */                                    z4 = false;
                                        } else {
/* 49 */                                    z4 = false;
                                        }
/* 50 */                                if (!z3) {
/* 60 */                                    z = true;
                                        }
/* 61 */                                z2 = z;
/* 62 */                                z = z4;
                                    } else if (responseDone || !this.responseBodyOpen) {
/* 66 */                                z2 = false;
                                    } else {
/* 30 */                                if (requestDone) {
/* 32 */                                    this.requestBodyOpen = false;
                                        }
/* 34 */                                if (responseDone) {
/* 36 */                                    this.responseBodyOpen = false;
                                        }
/* 38 */                                z3 = this.requestBodyOpen;
/* 41 */                                if (z3 || this.responseBodyOpen) {
/* 49 */                                    z4 = false;
                                        } else {
/* 47 */                                    z4 = true;
                                        }
/* 50 */                                if (!z3 && !this.responseBodyOpen && !this.expectMoreExchanges) {
/* 60 */                                    z = true;
                                        }
/* 61 */                                z2 = z;
/* 62 */                                z = z4;
                                    }
                                } catch (Throwable th) {
/* 65 */                            throw th;
                                }
                            } else {
/* 24 */                        if (responseDone) {
                                }
/* 66 */                        z2 = false;
                            }
                        }
/* 68 */                if (z) {
/* 71 */                    this.exchange = null;
/* 73 */                    RealConnection realConnection = this.connection;
/* 75 */                    if (realConnection != null) {
/* 78 */                        realConnection.incrementSuccessCount$okhttp();
                            }
                        }
/* 81 */                if (z2) {
/* 83 */                    return (E) callDone(e);
                        }
                    }
/* 88 */            return e;
                }

                public final IOException noMoreExchanges$okhttp(IOException e) {
                    boolean z;
                    synchronized (this) {
/* 4 */                 z = false;
/* 5 */                 if (this.expectMoreExchanges) {
/* 7 */                     this.expectMoreExchanges = false;
/* 11 */                    if (!this.requestBodyOpen && !this.responseBodyOpen) {
/* 17 */                        z = true;
                            }
                        }
                    }
                    return z ? callDone(e) : e;
                }

                public final String redactedUrl$okhttp() {
/* 7 */             return this.originalRequest.url().redact();
                }

                public final Socket releaseConnectionNoEvents$okhttp() {
/* 1 */             RealConnection realConnection = this.connection;
/* 3 */             realConnection.getClass();
/* 9 */             if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
/* 28 */                s80.m8422c(Thread.currentThread().getName(), " MUST hold lock on ", realConnection);
/* 8 */                 return null;
                    }
/* 32 */            List<Reference<RealCall>> calls = realConnection.getCalls();
/* 36 */            Iterator<Reference<RealCall>> it = calls.iterator();
/* 40 */            int i = 0;
                    while (true) {
/* 46 */                if (!it.hasNext()) {
/* 68 */                    i = -1;
                            break;
                        }
/* 62 */                if (Intrinsics.m6216a(it.next().get(), this)) {
                            break;
                        }
/* 65 */                i++;
                    }
/* 69 */            if (i == -1) {
/* 105 */               f42.m3656l("Check failed.");
/* 8 */                 return null;
                    }
/* 71 */            calls.remove(i);
/* 74 */            this.connection = null;
/* 80 */            if (calls.isEmpty()) {
/* 86 */                realConnection.setIdleAtNs$okhttp(System.nanoTime());
/* 95 */                if (this.connectionPool.connectionBecameIdle(realConnection)) {
/* 97 */                    return realConnection.socket();
                        }
                    }
/* 8 */             return null;
                }

                @Override // okhttp3.Call
                public Request request() {
/* 1 */             return this.originalRequest;
                }

                public final boolean retryAfterFailure() {
/* 1 */             ExchangeFinder exchangeFinder = this.exchangeFinder;
/* 3 */             exchangeFinder.getClass();
/* 6 */             return exchangeFinder.retryAfterFailure();
                }

                public final void setConnectionToCancel(RealConnection realConnection) {
/* 1 */             this.connectionToCancel = realConnection;
                }

                public final void timeoutEarlyExit() {
/* 3 */             if (this.timeoutEarlyExit) {
/* 16 */                f42.m3656l("Check failed.");
                    } else {
/* 6 */                 this.timeoutEarlyExit = true;
/* 10 */                exit();
                    }
                }

                @Override // okhttp3.Call
/* 5 */         public AsyncTimeout timeout() {
/* 6 */             return this.timeout;
                }
            }
