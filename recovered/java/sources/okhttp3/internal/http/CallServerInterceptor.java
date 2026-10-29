            package okhttp3.internal.http;

            import java.io.IOException;
            import java.net.ProtocolException;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import okhttp3.Interceptor;
            import okhttp3.Request;
            import okhttp3.RequestBody;
            import okhttp3.Response;
            import okhttp3.ResponseBody;
            import okhttp3.internal.Util;
            import okhttp3.internal.connection.Exchange;
            import okio.BufferedSink;
            import okio.Okio;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m6176d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", HttpUrl.FRAGMENT_ENCODE_SET, "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class CallServerInterceptor implements Interceptor {
                private final boolean forWebSocket;

                public CallServerInterceptor(boolean z) {
/* 4 */             this.forWebSocket = z;
                }

                @Override // okhttp3.Interceptor
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response.Builder responseHeaders;
                    boolean z;
/* 1 */             chain.getClass();
/* 4 */             RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
/* 6 */             Exchange exchange = realInterceptorChain.getExchange();
/* 10 */            exchange.getClass();
/* 13 */            Request request = realInterceptorChain.getRequest();
/* 17 */            RequestBody requestBodyBody = request.body();
/* 21 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 25 */            exchange.writeRequestHeaders(request);
/* 37 */            boolean z2 = true;
/* 39 */            if (!HttpMethod.permitsRequestBody(request.method()) || requestBodyBody == null) {
/* 127 */               exchange.noRequestBody();
/* 130 */               responseHeaders = null;
                    } else {
/* 55 */                if ("100-continue".equalsIgnoreCase(request.header("Expect"))) {
/* 57 */                    exchange.flushRequest();
/* 60 */                    responseHeaders = exchange.readResponseHeaders(true);
/* 64 */                    exchange.responseHeadersStart();
/* 67 */                    z = false;
                        } else {
/* 69 */                    z = true;
/* 70 */                    responseHeaders = null;
                        }
/* 71 */                if (responseHeaders != null) {
/* 109 */                   exchange.noRequestBody();
/* 120 */                   if (!exchange.getConnection().isMultiplexed$okhttp()) {
/* 122 */                       exchange.noNewExchangesOnConnection();
                            }
                        } else if (requestBodyBody.isDuplex()) {
/* 79 */                    exchange.flushRequest();
/* 90 */                    requestBodyBody.writeTo(Okio.buffer(exchange.createRequestBody(request, true)));
                        } else {
/* 98 */                    BufferedSink bufferedSinkBuffer = Okio.buffer(exchange.createRequestBody(request, false));
/* 102 */                   requestBodyBody.writeTo(bufferedSinkBuffer);
/* 105 */                   bufferedSinkBuffer.close();
                        }
/* 125 */               z2 = z;
                    }
/* 131 */           if (requestBodyBody == null || !requestBodyBody.isDuplex()) {
/* 139 */               exchange.finishRequest();
                    }
/* 142 */           if (responseHeaders == null) {
/* 144 */               responseHeaders = exchange.readResponseHeaders(false);
/* 148 */               responseHeaders.getClass();
/* 151 */               if (z2) {
/* 153 */                   exchange.responseHeadersStart();
/* 156 */                   z2 = false;
                        }
                    }
/* 185 */           Response responseBuild = responseHeaders.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
/* 189 */           int iCode = responseBuild.code();
/* 195 */           if (iCode == 100) {
/* 197 */               Response.Builder responseHeaders2 = exchange.readResponseHeaders(false);
/* 201 */               responseHeaders2.getClass();
/* 204 */               if (z2) {
/* 206 */                   exchange.responseHeadersStart();
                        }
/* 237 */               responseBuild = responseHeaders2.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
/* 241 */               iCode = responseBuild.code();
                    }
/* 245 */           exchange.responseHeadersEnd(responseBuild);
/* 283 */           Response responseBuild2 = (this.forWebSocket && iCode == 101) ? responseBuild.newBuilder().body(Util.EMPTY_RESPONSE).build() : responseBuild.newBuilder().body(exchange.openResponseBody(responseBuild)).build();
/* 303 */           if ("close".equalsIgnoreCase(responseBuild2.request().header("Connection")) || "close".equalsIgnoreCase(Response.header$default(responseBuild2, "Connection", null, 2, null))) {
/* 316 */               exchange.noNewExchangesOnConnection();
                    }
/* 321 */           if (iCode == 204 || iCode == 205) {
/* 327 */               ResponseBody responseBodyBody = responseBuild2.body();
/* 344 */               if ((responseBodyBody == null ? -1L : responseBodyBody.getContentLength()) > 0) {
/* 352 */                   StringBuilder sbM3793s = fm0.m3793s(iCode, "HTTP ", " had non-zero Content-Length: ");
/* 356 */                   ResponseBody responseBodyBody2 = responseBuild2.body();
/* 371 */                   sbM3793s.append(responseBodyBody2 != null ? Long.valueOf(responseBodyBody2.getContentLength()) : null);
/* 381 */                   throw new ProtocolException(sbM3793s.toString());
                        }
                    }
/* 382 */           return responseBuild2;
                }
            }
