            package okhttp3.internal.cache;

            import java.io.IOException;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.text.C1852e;
            import okhttp3.Cache;
            import okhttp3.Call;
            import okhttp3.EventListener;
            import okhttp3.Headers;
            import okhttp3.HttpUrl;
            import okhttp3.Interceptor;
            import okhttp3.Protocol;
            import okhttp3.Request;
            import okhttp3.Response;
            import okhttp3.ResponseBody;
            import okhttp3.internal.Util;
            import okhttp3.internal.connection.RealCall;
            import okhttp3.internal.http.HttpHeaders;
            import okhttp3.internal.http.HttpMethod;
            import okhttp3.internal.http.RealResponseBody;
            import okio.Buffer;
            import okio.BufferedSink;
            import okio.BufferedSource;
            import okio.Okio;
            import okio.Sink;
            import okio.Source;
            import okio.Timeout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m6176d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "cache", "Lokhttp3/Cache;", "(Lokhttp3/Cache;)V", "getCache$okhttp", "()Lokhttp3/Cache;", "cacheWritingResponse", "Lokhttp3/Response;", "cacheRequest", "Lokhttp3/internal/cache/CacheRequest;", "response", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class CacheInterceptor implements Interceptor {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final Cache cache;

                public CacheInterceptor(Cache cache) {
/* 4 */             this.cache = cache;
                }

                private final Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) throws IOException {
/* 1 */             if (cacheRequest == null) {
/* 3 */                 return response;
                    }
/* 4 */             Sink body = cacheRequest.getBody();
/* 8 */             ResponseBody responseBodyBody = response.body();
/* 12 */            responseBodyBody.getClass();
/* 15 */            final BufferedSource source = responseBodyBody.getBodySource();
/* 19 */            final BufferedSink bufferedSinkBuffer = Okio.buffer(body);
/* 25 */            Source source2 = new Source() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
                        private boolean cacheRequestClosed;

                        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                        public void close() throws IOException {
/* 3 */                     if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
/* 16 */                        this.cacheRequestClosed = true;
/* 20 */                        cacheRequest.abort();
                            }
/* 25 */                    source.close();
                        }

                        @Override // okio.Source
                        public long read(Buffer sink, long byteCount) throws IOException {
/* 1 */                     sink.getClass();
                            try {
/* 7 */                         long j = source.read(sink, byteCount);
/* 15 */                        if (j != -1) {
/* 42 */                            sink.copyTo(bufferedSinkBuffer.getBuffer(), sink.size() - j, j);
/* 47 */                            bufferedSinkBuffer.emitCompleteSegments();
/* 50 */                            return j;
                                }
/* 19 */                        if (!this.cacheRequestClosed) {
/* 21 */                            this.cacheRequestClosed = true;
/* 25 */                            bufferedSinkBuffer.close();
                                }
/* 11 */                        return -1L;
                            } catch (IOException e) {
/* 55 */                        if (this.cacheRequestClosed) {
/* 64 */                            throw e;
                                }
/* 57 */                        this.cacheRequestClosed = true;
/* 61 */                        cacheRequest.abort();
/* 64 */                        throw e;
                            }
                        }

                        @Override // okio.Source
                        /* JADX INFO: renamed from: timeout */
                        public Timeout getTimeout() {
/* 3 */                     return source.getTimeout();
                        }
                    };
/* 61 */            return response.newBuilder().body(new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), response.body().getContentLength(), Okio.buffer(source2))).build();
                }

                /* JADX INFO: renamed from: getCache$okhttp, reason: from getter */
                public final Cache getCache() {
/* 1 */             return this.cache;
                }

                @Override // okhttp3.Interceptor
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    ResponseBody responseBodyBody;
                    ResponseBody responseBodyBody2;
                    ResponseBody responseBodyBody3;
/* 1 */             chain.getClass();
/* 4 */             Call call = chain.call();
/* 8 */             Cache cache = this.cache;
/* 19 */            Response response = cache == null ? null : cache.get$okhttp(chain.request());
/* 36 */            CacheStrategy cacheStrategyCompute = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).compute();
/* 40 */            Request networkRequest = cacheStrategyCompute.getNetworkRequest();
/* 44 */            Response cacheResponse = cacheStrategyCompute.getCacheResponse();
/* 48 */            Cache cache2 = this.cache;
/* 50 */            if (cache2 != null) {
/* 53 */                cache2.trackResponse$okhttp(cacheStrategyCompute);
                    }
/* 64 */            RealCall realCall = call instanceof RealCall ? (RealCall) call : null;
/* 68 */            EventListener eventListener = realCall != null ? realCall.getEventListener() : null;
/* 72 */            if (eventListener == null) {
/* 74 */                eventListener = EventListener.NONE;
                    }
/* 76 */            if (response != null && cacheResponse == null && (responseBodyBody3 = response.body()) != null) {
/* 87 */                Util.closeQuietly(responseBodyBody3);
                    }
/* 90 */            if (networkRequest == null && cacheResponse == null) {
/* 145 */               Response responseBuild = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
/* 149 */               eventListener.satisfactionFailure(call, responseBuild);
/* 152 */               return responseBuild;
                    }
/* 153 */           if (networkRequest == null) {
/* 155 */               cacheResponse.getClass();
/* 172 */               Response responseBuild2 = cacheResponse.newBuilder().cacheResponse(INSTANCE.stripBody(cacheResponse)).build();
/* 176 */               eventListener.cacheHit(call, responseBuild2);
/* 179 */               return responseBuild2;
                    }
/* 180 */           if (cacheResponse != null) {
/* 182 */               eventListener.cacheConditionalHit(call, cacheResponse);
                    } else if (this.cache != null) {
/* 190 */               eventListener.cacheMiss(call);
                    }
                    try {
/* 193 */               Response responseProceed = chain.proceed(networkRequest);
/* 197 */               if (responseProceed == null && response != null && (responseBodyBody2 = response.body()) != null) {
/* 208 */                   Util.closeQuietly(responseBodyBody2);
                        }
/* 211 */               if (cacheResponse != null) {
/* 213 */                   if (responseProceed != null && responseProceed.code() == 304) {
/* 224 */                       Response.Builder builderNewBuilder = cacheResponse.newBuilder();
/* 228 */                       Companion companion = INSTANCE;
/* 278 */                       Response responseBuild3 = builderNewBuilder.headers(companion.combine(cacheResponse.headers(), responseProceed.headers())).sentRequestAtMillis(responseProceed.sentRequestAtMillis()).receivedResponseAtMillis(responseProceed.receivedResponseAtMillis()).cacheResponse(companion.stripBody(cacheResponse)).networkResponse(companion.stripBody(responseProceed)).build();
/* 282 */                       ResponseBody responseBodyBody4 = responseProceed.body();
/* 286 */                       responseBodyBody4.getClass();
/* 289 */                       responseBodyBody4.close();
/* 292 */                       Cache cache3 = this.cache;
/* 294 */                       cache3.getClass();
/* 297 */                       cache3.trackConditionalCacheHit$okhttp();
/* 302 */                       this.cache.update$okhttp(cacheResponse, responseBuild3);
/* 305 */                       eventListener.cacheHit(call, responseBuild3);
/* 308 */                       return responseBuild3;
                            }
/* 309 */                   ResponseBody responseBodyBody5 = cacheResponse.body();
/* 313 */                   if (responseBodyBody5 != null) {
/* 316 */                       Util.closeQuietly(responseBodyBody5);
                            }
                        }
/* 319 */               responseProceed.getClass();
/* 322 */               Response.Builder builderNewBuilder2 = responseProceed.newBuilder();
/* 326 */               Companion companion2 = INSTANCE;
/* 344 */               Response responseBuild4 = builderNewBuilder2.cacheResponse(companion2.stripBody(cacheResponse)).networkResponse(companion2.stripBody(responseProceed)).build();
/* 350 */               if (this.cache != null) {
/* 356 */                   if (HttpHeaders.promisesBody(responseBuild4) && CacheStrategy.INSTANCE.isCacheable(responseBuild4, networkRequest)) {
/* 372 */                       Response responseCacheWritingResponse = cacheWritingResponse(this.cache.put$okhttp(responseBuild4), responseBuild4);
/* 376 */                       if (cacheResponse != null) {
/* 378 */                           eventListener.cacheMiss(call);
                                }
/* 381 */                       return responseCacheWritingResponse;
                            }
/* 392 */                   if (HttpMethod.INSTANCE.invalidatesCache(networkRequest.method())) {
                                try {
/* 396 */                           this.cache.remove$okhttp(networkRequest);
                                } catch (IOException unused) {
                                }
                            }
                        }
/* 399 */               return responseBuild4;
                    } catch (Throwable th) {
/* 401 */               if (response != null && (responseBodyBody = response.body()) != null) {
/* 410 */                   Util.closeQuietly(responseBodyBody);
                        }
/* 413 */               throw th;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u000f"}, m6176d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "combine", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "isContentSpecificHeader", HttpUrl.FRAGMENT_ENCODE_SET, "fieldName", HttpUrl.FRAGMENT_ENCODE_SET, "isEndToEnd", "stripBody", "Lokhttp3/Response;", "response", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public final Headers combine(Headers cachedHeaders, Headers networkHeaders) {
/* 3 */                 Headers.Builder builder = new Headers.Builder();
/* 6 */                 int size = cachedHeaders.size();
/* 10 */                int i = 0;
/* 11 */                int i2 = 0;
/* 12 */                while (i2 < size) {
/* 14 */                    int i3 = i2 + 1;
/* 16 */                    String strName = cachedHeaders.name(i2);
/* 20 */                    String strValue = cachedHeaders.value(i2);
/* 30 */                    if ((!"Warning".equalsIgnoreCase(strName) || !C1852e.m6263m(strValue, "1", false)) && (isContentSpecificHeader(strName) || !isEndToEnd(strName) || networkHeaders.get(strName) == null)) {
/* 59 */                        builder.addLenient$okhttp(strName, strValue);
                            }
/* 62 */                    i2 = i3;
                        }
/* 64 */                int size2 = networkHeaders.size();
/* 68 */                while (i < size2) {
/* 70 */                    int i4 = i + 1;
/* 72 */                    String strName2 = networkHeaders.name(i);
/* 80 */                    if (!isContentSpecificHeader(strName2) && isEndToEnd(strName2)) {
/* 92 */                        builder.addLenient$okhttp(strName2, networkHeaders.value(i));
                            }
/* 95 */                    i = i4;
                        }
/* 97 */                return builder.build();
                    }

                    private final boolean isContentSpecificHeader(String fieldName) {
                        return "Content-Length".equalsIgnoreCase(fieldName) || "Content-Encoding".equalsIgnoreCase(fieldName) || "Content-Type".equalsIgnoreCase(fieldName);
                    }

                    private final boolean isEndToEnd(String fieldName) {
                        return ("Connection".equalsIgnoreCase(fieldName) || "Keep-Alive".equalsIgnoreCase(fieldName) || "Proxy-Authenticate".equalsIgnoreCase(fieldName) || "Proxy-Authorization".equalsIgnoreCase(fieldName) || "TE".equalsIgnoreCase(fieldName) || "Trailers".equalsIgnoreCase(fieldName) || "Transfer-Encoding".equalsIgnoreCase(fieldName) || "Upgrade".equalsIgnoreCase(fieldName)) ? false : true;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public final Response stripBody(Response response) {
                        return (response == null ? null : response.body()) != null ? response.newBuilder().body(null).build() : response;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
