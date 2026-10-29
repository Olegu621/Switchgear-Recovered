            package okhttp3.internal.http;

            import java.io.IOException;
            import java.util.List;
            import kotlin.Metadata;
            import okhttp3.Cookie;
            import okhttp3.CookieJar;
            import okhttp3.HttpUrl;
            import okhttp3.Interceptor;
            import okhttp3.MediaType;
            import okhttp3.Request;
            import okhttp3.RequestBody;
            import okhttp3.Response;
            import okhttp3.ResponseBody;
            import okhttp3.internal.Util;
            import okio.GzipSource;
            import okio.Okio;
            import p000.C2085pw;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m6176d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "cookieJar", "Lokhttp3/CookieJar;", "(Lokhttp3/CookieJar;)V", "cookieHeader", HttpUrl.FRAGMENT_ENCODE_SET, "cookies", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Cookie;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class BridgeInterceptor implements Interceptor {
                private final CookieJar cookieJar;

                public BridgeInterceptor(CookieJar cookieJar) {
/* 1 */             cookieJar.getClass();
/* 7 */             this.cookieJar = cookieJar;
                }

                private final String cookieHeader(List<Cookie> cookies) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            int i = 0;
/* 15 */            for (Object obj : cookies) {
/* 21 */                int i2 = i + 1;
/* 23 */                if (i < 0) {
/* 55 */                    C2085pw.m7568g();
/* 59 */                    throw null;
                        }
/* 25 */                Cookie cookie = (Cookie) obj;
/* 27 */                if (i > 0) {
/* 31 */                    sb.append("; ");
                        }
/* 38 */                sb.append(cookie.name());
/* 43 */                sb.append('=');
/* 50 */                sb.append(cookie.value());
/* 53 */                i = i2;
                    }
/* 60 */            return sb.toString();
                }

                @Override // okhttp3.Interceptor
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    ResponseBody responseBodyBody;
/* 1 */             chain.getClass();
/* 4 */             Request request = chain.request();
/* 8 */             Request.Builder builderNewBuilder = request.newBuilder();
/* 12 */            RequestBody requestBodyBody = request.body();
/* 22 */            if (requestBodyBody != null) {
/* 24 */                MediaType mediaType = requestBodyBody.getContentType();
/* 28 */                if (mediaType != null) {
/* 34 */                    builderNewBuilder.header("Content-Type", mediaType.getMediaType());
                        }
/* 37 */                long jContentLength = requestBodyBody.contentLength();
/* 45 */                if (jContentLength != -1) {
/* 51 */                    builderNewBuilder.header("Content-Length", String.valueOf(jContentLength));
/* 54 */                    builderNewBuilder.removeHeader("Transfer-Encoding");
                        } else {
/* 60 */                    builderNewBuilder.header("Transfer-Encoding", "chunked");
/* 63 */                    builderNewBuilder.removeHeader("Content-Length");
                        }
                    }
/* 72 */            boolean z = true;
/* 75 */            if (request.header("Host") == null) {
/* 85 */                builderNewBuilder.header("Host", Util.toHostHeader$default(request.url(), false, 1, null));
                    }
/* 94 */            if (request.header("Connection") == null) {
/* 98 */                builderNewBuilder.header("Connection", "Keep-Alive");
                    }
/* 109 */           if (request.header("Accept-Encoding") == null && request.header("Range") == null) {
/* 119 */               builderNewBuilder.header("Accept-Encoding", "gzip");
                    } else {
/* 123 */               z = false;
                    }
/* 130 */           List<Cookie> listLoadForRequest = this.cookieJar.loadForRequest(request.url());
/* 138 */           if (!listLoadForRequest.isEmpty()) {
/* 146 */               builderNewBuilder.header("Cookie", cookieHeader(listLoadForRequest));
                    }
/* 155 */           if (request.header("User-Agent") == null) {
/* 159 */               builderNewBuilder.header("User-Agent", Util.userAgent);
                    }
/* 166 */           Response responseProceed = chain.proceed(builderNewBuilder.build());
/* 180 */           HttpHeaders.receiveHeaders(this.cookieJar, request.url(), responseProceed.headers());
/* 187 */           Response.Builder builderRequest = responseProceed.newBuilder().request(request);
/* 191 */           if (z && "gzip".equalsIgnoreCase(Response.header$default(responseProceed, "Content-Encoding", null, 2, null)) && HttpHeaders.promisesBody(responseProceed) && (responseBodyBody = responseProceed.body()) != null) {
/* 224 */               GzipSource gzipSource = new GzipSource(responseBodyBody.getBodySource());
/* 247 */               builderRequest.headers(responseProceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
/* 263 */               builderRequest.body(new RealResponseBody(Response.header$default(responseProceed, "Content-Type", null, 2, null), -1L, Okio.buffer(gzipSource)));
                    }
/* 266 */           return builderRequest.build();
                }
            }
