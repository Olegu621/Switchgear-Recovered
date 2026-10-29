            package okhttp3.internal.http;

            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.util.List;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import okhttp3.Call;
            import okhttp3.Connection;
            import okhttp3.HttpUrl;
            import okhttp3.Interceptor;
            import okhttp3.Request;
            import okhttp3.Response;
            import okhttp3.internal.Util;
            import okhttp3.internal.connection.Exchange;
            import okhttp3.internal.connection.RealCall;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0002\u0010\u0010J\b\u0010\u0002\u001a\u00020\u001cH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010(\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006)"}, m6176d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "interceptors", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Interceptor;", FirebaseAnalytics.Param.INDEX, HttpUrl.FRAGMENT_ENCODE_SET, "exchange", "Lokhttp3/internal/connection/Exchange;", "request", "Lokhttp3/Request;", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)V", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "calls", "getConnectTimeoutMillis$okhttp", "()I", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "getReadTimeoutMillis$okhttp", "getRequest$okhttp", "()Lokhttp3/Request;", "getWriteTimeoutMillis$okhttp", "Lokhttp3/Call;", "connection", "Lokhttp3/Connection;", "copy", "copy$okhttp", "proceed", "Lokhttp3/Response;", "withConnectTimeout", "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "withReadTimeout", "withWriteTimeout", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class RealInterceptorChain implements Interceptor.Chain {
                private final RealCall call;
                private int calls;
                private final int connectTimeoutMillis;
                private final Exchange exchange;
                private final int index;
                private final List<Interceptor> interceptors;
                private final int readTimeoutMillis;
                private final Request request;
                private final int writeTimeoutMillis;

                /* JADX WARN: Multi-variable type inference failed */
                public RealInterceptorChain(RealCall realCall, List<? extends Interceptor> list, int i, Exchange exchange, Request request, int i2, int i3, int i4) {
/* 1 */             realCall.getClass();
/* 4 */             list.getClass();
/* 7 */             request.getClass();
/* 13 */            this.call = realCall;
/* 15 */            this.interceptors = list;
/* 17 */            this.index = i;
/* 19 */            this.exchange = exchange;
/* 21 */            this.request = request;
/* 23 */            this.connectTimeoutMillis = i2;
/* 25 */            this.readTimeoutMillis = i3;
/* 27 */            this.writeTimeoutMillis = i4;
                }

                public static /* synthetic */ RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request request, int i2, int i3, int i4, int i5, Object obj) {
/* 3 */             if ((i5 & 1) != 0) {
/* 5 */                 i = realInterceptorChain.index;
                    }
/* 9 */             if ((i5 & 2) != 0) {
/* 11 */                exchange = realInterceptorChain.exchange;
                    }
/* 15 */            if ((i5 & 4) != 0) {
/* 17 */                request = realInterceptorChain.request;
                    }
/* 21 */            if ((i5 & 8) != 0) {
/* 23 */                i2 = realInterceptorChain.connectTimeoutMillis;
                    }
/* 27 */            if ((i5 & 16) != 0) {
/* 29 */                i3 = realInterceptorChain.readTimeoutMillis;
                    }
/* 33 */            if ((i5 & 32) != 0) {
/* 35 */                i4 = realInterceptorChain.writeTimeoutMillis;
                    }
/* 37 */            int i6 = i3;
/* 38 */            int i7 = i4;
/* 44 */            return realInterceptorChain.copy$okhttp(i, exchange, request, i2, i6, i7);
                }

                @Override // okhttp3.Interceptor.Chain
                public Call call() {
/* 1 */             return this.call;
                }

                @Override // okhttp3.Interceptor.Chain
                /* JADX INFO: renamed from: connectTimeoutMillis, reason: from getter */
                public int getConnectTimeoutMillis() {
/* 1 */             return this.connectTimeoutMillis;
                }

                @Override // okhttp3.Interceptor.Chain
                public Connection connection() {
/* 1 */             Exchange exchange = this.exchange;
/* 3 */             if (exchange == null) {
/* 5 */                 return null;
                    }
/* 7 */             return exchange.getConnection();
                }

                public final RealInterceptorChain copy$okhttp(int index, Exchange exchange, Request request, int connectTimeoutMillis, int readTimeoutMillis, int writeTimeoutMillis) {
/* 1 */             request.getClass();
/* 16 */            return new RealInterceptorChain(this.call, this.interceptors, index, exchange, request, connectTimeoutMillis, readTimeoutMillis, writeTimeoutMillis);
                }

                /* JADX INFO: renamed from: getCall$okhttp, reason: from getter */
                public final RealCall getCall() {
/* 1 */             return this.call;
                }

                public final int getConnectTimeoutMillis$okhttp() {
/* 1 */             return this.connectTimeoutMillis;
                }

                /* JADX INFO: renamed from: getExchange$okhttp, reason: from getter */
                public final Exchange getExchange() {
/* 1 */             return this.exchange;
                }

                /* JADX INFO: renamed from: getReadTimeoutMillis$okhttp, reason: from getter */
                public final int getReadTimeoutMillis() {
/* 1 */             return this.readTimeoutMillis;
                }

                /* JADX INFO: renamed from: getRequest$okhttp, reason: from getter */
                public final Request getRequest() {
/* 1 */             return this.request;
                }

                /* JADX INFO: renamed from: getWriteTimeoutMillis$okhttp, reason: from getter */
                public final int getWriteTimeoutMillis() {
/* 1 */             return this.writeTimeoutMillis;
                }

                @Override // okhttp3.Interceptor.Chain
                public Response proceed(Request request) throws IOException {
/* 1 */             request.getClass();
/* 13 */            if (this.index >= this.interceptors.size()) {
/* 173 */               f42.m3656l("Check failed.");
/* 12 */                return null;
                    }
/* 19 */            this.calls++;
/* 21 */            Exchange exchange = this.exchange;
/* 27 */            if (exchange != null) {
/* 41 */                if (!exchange.getFinder().sameHostAndPort(request.url())) {
/* 72 */                    ds0.m3202s(this.interceptors.get(this.index - 1), "network interceptor ", " must retain the same host and port");
/* 12 */                    return null;
                        }
/* 45 */                if (this.calls != 1) {
/* 57 */                    ds0.m3202s(this.interceptors.get(this.index - 1), "network interceptor ", " must call proceed() exactly once");
/* 12 */                    return null;
                        }
                    }
/* 89 */            RealInterceptorChain realInterceptorChainCopy$okhttp$default = copy$okhttp$default(this, this.index + 1, null, request, 0, 0, 0, 58, null);
/* 97 */            Interceptor interceptor = this.interceptors.get(this.index);
/* 103 */           Response responseIntercept = interceptor.intercept(realInterceptorChainCopy$okhttp$default);
/* 109 */           if (responseIntercept == null) {
/* 170 */               throw new NullPointerException("interceptor " + interceptor + " returned null");
                    }
/* 113 */           if (this.exchange != null && this.index + 1 < this.interceptors.size() && realInterceptorChainCopy$okhttp$default.calls != 1) {
/* 131 */               ds0.m3202s(interceptor, "network interceptor ", " must call proceed() exactly once");
/* 12 */                return null;
                    }
/* 139 */           if (responseIntercept.body() != null) {
/* 141 */               return responseIntercept;
                    }
/* 144 */           ds0.m3202s(interceptor, "interceptor ", " returned a response with no body");
/* 12 */            return null;
                }

                @Override // okhttp3.Interceptor.Chain
                public int readTimeoutMillis() {
/* 1 */             return this.readTimeoutMillis;
                }

                @Override // okhttp3.Interceptor.Chain
                public Request request() {
/* 1 */             return this.request;
                }

                @Override // okhttp3.Interceptor.Chain
                public Interceptor.Chain withConnectTimeout(int timeout, TimeUnit unit) {
/* 1 */             unit.getClass();
/* 6 */             if (this.exchange == null) {
/* 24 */                return copy$okhttp$default(this, 0, null, null, Util.checkDuration("connectTimeout", timeout, unit), 0, 0, 55, null);
                    }
/* 31 */            f42.m3656l("Timeouts can't be adjusted in a network interceptor");
/* 34 */            return null;
                }

                @Override // okhttp3.Interceptor.Chain
                public Interceptor.Chain withReadTimeout(int timeout, TimeUnit unit) {
/* 1 */             unit.getClass();
/* 6 */             if (this.exchange == null) {
/* 24 */                return copy$okhttp$default(this, 0, null, null, 0, Util.checkDuration("readTimeout", timeout, unit), 0, 47, null);
                    }
/* 31 */            f42.m3656l("Timeouts can't be adjusted in a network interceptor");
/* 34 */            return null;
                }

                @Override // okhttp3.Interceptor.Chain
                public Interceptor.Chain withWriteTimeout(int timeout, TimeUnit unit) {
/* 1 */             unit.getClass();
/* 6 */             if (this.exchange == null) {
/* 24 */                return copy$okhttp$default(this, 0, null, null, 0, 0, Util.checkDuration("writeTimeout", timeout, unit), 31, null);
                    }
/* 31 */            f42.m3656l("Timeouts can't be adjusted in a network interceptor");
/* 34 */            return null;
                }

                @Override // okhttp3.Interceptor.Chain
                public int writeTimeoutMillis() {
/* 1 */             return this.writeTimeoutMillis;
                }
            }
