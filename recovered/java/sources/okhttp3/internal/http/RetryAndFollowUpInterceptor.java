            package okhttp3.internal.http;

            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.net.ProtocolException;
            import java.net.Proxy;
            import java.net.SocketTimeoutException;
            import java.security.cert.CertificateException;
            import java.util.ArrayList;
            import java.util.List;
            import javax.net.ssl.SSLHandshakeException;
            import javax.net.ssl.SSLPeerUnverifiedException;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.Regex;
            import okhttp3.HttpUrl;
            import okhttp3.Interceptor;
            import okhttp3.OkHttpClient;
            import okhttp3.Request;
            import okhttp3.RequestBody;
            import okhttp3.Response;
            import okhttp3.ResponseBody;
            import okhttp3.Route;
            import okhttp3.internal.Util;
            import okhttp3.internal.connection.Exchange;
            import okhttp3.internal.connection.RealCall;
            import okhttp3.internal.connection.RealConnection;
            import okhttp3.internal.connection.RouteException;
            import okhttp3.internal.http2.ConnectionShutdownException;
            import p000.AbstractC0208c9;
            import p000.nd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m6176d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "buildRedirectRequest", "Lokhttp3/Request;", "userResponse", "Lokhttp3/Response;", FirebaseAnalytics.Param.METHOD, HttpUrl.FRAGMENT_ENCODE_SET, "followUpRequest", "exchange", "Lokhttp3/internal/connection/Exchange;", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "isRecoverable", HttpUrl.FRAGMENT_ENCODE_SET, "e", "Ljava/io/IOException;", "requestSendStarted", "recover", NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "userRequest", "requestIsOneShot", "retryAfter", HttpUrl.FRAGMENT_ENCODE_SET, "defaultDelay", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class RetryAndFollowUpInterceptor implements Interceptor {
                private static final int MAX_FOLLOW_UPS = 20;
                private final OkHttpClient client;

                public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
/* 1 */             okHttpClient.getClass();
/* 7 */             this.client = okHttpClient;
                }

                private final Request buildRedirectRequest(Response userResponse, String method) {
                    String strHeader$default;
                    HttpUrl httpUrlResolve;
/* 8 */             if (!this.client.followRedirects() || (strHeader$default = Response.header$default(userResponse, "Location", null, 2, null)) == null || (httpUrlResolve = userResponse.request().url().resolve(strHeader$default)) == null) {
/* 7 */                 return null;
                    }
/* 56 */            if (!Intrinsics.m6216a(httpUrlResolve.scheme(), userResponse.request().url().scheme()) && !this.client.followSslRedirects()) {
/* 7 */                 return null;
                    }
/* 71 */            Request.Builder builderNewBuilder = userResponse.request().newBuilder();
/* 79 */            if (HttpMethod.permitsRequestBody(method)) {
/* 81 */                int iCode = userResponse.code();
/* 85 */                HttpMethod httpMethod = HttpMethod.INSTANCE;
/* 104 */               boolean z = httpMethod.redirectsWithBody(method) || iCode == 308 || iCode == 307;
/* 109 */               if (!httpMethod.redirectsToGet(method) || iCode == 308 || iCode == 307) {
/* 131 */                   builderNewBuilder.method(method, z ? userResponse.request().body() : null);
                        } else {
/* 117 */                   builderNewBuilder.method("GET", null);
                        }
/* 134 */               if (!z) {
/* 138 */                   builderNewBuilder.removeHeader("Transfer-Encoding");
/* 143 */                   builderNewBuilder.removeHeader("Content-Length");
/* 148 */                   builderNewBuilder.removeHeader("Content-Type");
                        }
                    }
/* 163 */           if (!Util.canReuseConnectionFor(userResponse.request().url(), httpUrlResolve)) {
/* 167 */               builderNewBuilder.removeHeader("Authorization");
                    }
/* 174 */           return builderNewBuilder.url(httpUrlResolve).build();
                }

                private final Request followUpRequest(Response userResponse, Exchange exchange) throws IOException {
                    RealConnection connection;
/* 13 */            Route route = (exchange == null || (connection = exchange.getConnection()) == null) ? null : connection.getRoute();
/* 17 */            int iCode = userResponse.code();
/* 25 */            String strMethod = userResponse.request().method();
/* 31 */            if (iCode != 307 && iCode != 308) {
/* 39 */                if (iCode == 401) {
/* 220 */                   return this.client.authenticator().authenticate(route, userResponse);
                        }
/* 43 */                if (iCode == 421) {
/* 179 */                   RequestBody requestBodyBody = userResponse.request().body();
/* 183 */                   if ((requestBodyBody != null && requestBodyBody.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
/* 1 */                         return null;
                            }
/* 205 */                   exchange.getConnection().noCoalescedConnections$okhttp();
/* 208 */                   return userResponse.request();
                        }
/* 47 */                if (iCode == 503) {
/* 147 */                   Response responsePriorResponse = userResponse.priorResponse();
/* 151 */                   if ((responsePriorResponse == null || responsePriorResponse.code() != 503) && retryAfter(userResponse, AbstractC0208c9.API_PRIORITY_OTHER) == 0) {
/* 169 */                       return userResponse.request();
                            }
/* 1 */                     return null;
                        }
/* 51 */                if (iCode == 407) {
/* 113 */                   route.getClass();
/* 126 */                   if (route.proxy().type() == Proxy.Type.HTTP) {
/* 134 */                       return this.client.proxyAuthenticator().authenticate(route, userResponse);
                            }
/* 146 */                   throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
/* 55 */                if (iCode == 408) {
/* 67 */                    if (!this.client.retryOnConnectionFailure()) {
/* 1 */                         return null;
                            }
/* 74 */                    RequestBody requestBodyBody2 = userResponse.request().body();
/* 78 */                    if (requestBodyBody2 != null && requestBodyBody2.isOneShot()) {
/* 1 */                         return null;
                            }
/* 87 */                    Response responsePriorResponse2 = userResponse.priorResponse();
/* 91 */                    if ((responsePriorResponse2 == null || responsePriorResponse2.code() != 408) && retryAfter(userResponse, 0) <= 0) {
/* 108 */                       return userResponse.request();
                            }
/* 1 */                     return null;
                        }
                        switch (iCode) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
/* 1 */                         return null;
                        }
                    }
/* 225 */           return buildRedirectRequest(userResponse, strMethod);
                }

                private final boolean isRecoverable(IOException e, boolean requestSendStarted) {
/* 4 */             if (e instanceof ProtocolException) {
/* 3 */                 return false;
                    }
/* 10 */            if (e instanceof InterruptedIOException) {
                        return (e instanceof SocketTimeoutException) && !requestSendStarted;
                    }
                    return (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException)) ? false : true;
                }

                private final boolean recover(IOException e, RealCall call, Request userRequest, boolean requestSendStarted) {
/* 8 */             if (this.client.retryOnConnectionFailure()) {
                        return !(requestSendStarted && requestIsOneShot(e, userRequest)) && isRecoverable(e, requestSendStarted) && call.retryAfterFailure();
                    }
/* 7 */             return false;
                }

                private final boolean requestIsOneShot(IOException e, Request userRequest) {
/* 1 */             RequestBody requestBodyBody = userRequest.body();
                    return (requestBodyBody != null && requestBodyBody.isOneShot()) || (e instanceof FileNotFoundException);
                }

                private final int retryAfter(Response userResponse, int defaultDelay) {
/* 5 */             String strHeader$default = Response.header$default(userResponse, "Retry-After", null, 2, null);
/* 9 */             if (strHeader$default == null) {
/* 11 */                return defaultDelay;
                    }
/* 23 */            if (!new Regex("\\d+").m6223b(strHeader$default)) {
/* 37 */                return AbstractC0208c9.API_PRIORITY_OTHER;
                    }
/* 25 */            Integer numValueOf = Integer.valueOf(strHeader$default);
/* 29 */            numValueOf.getClass();
/* 32 */            return numValueOf.intValue();
                }

                @Override // okhttp3.Interceptor
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    ArrayList arrayList;
                    Response responseProceed;
/* 1 */             chain.getClass();
/* 4 */             RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
/* 6 */             Request request = realInterceptorChain.getRequest();
/* 10 */            RealCall call = realInterceptorChain.getCall();
/* 14 */            List list = nd0.f14189a;
/* 19 */            int i = 0;
/* 20 */            Response response = null;
                    while (true) {
/* 21 */                boolean z = true;
                        while (true) {
/* 22 */                    call.enterNetworkInterceptorExchange(request, z);
                            try {
/* 29 */                        if (call.getCanceled()) {
/* 236 */                           throw new IOException("Canceled");
                                }
                                try {
/* 31 */                            responseProceed = realInterceptorChain.proceed(request);
                                } catch (IOException e) {
/* 152 */                           if (!recover(e, call, request, !(e instanceof ConnectionShutdownException))) {
/* 184 */                               throw Util.withSuppressed(e, list);
                                    }
/* 154 */                           list.getClass();
/* 164 */                           arrayList = new ArrayList(list.size() + 1);
/* 167 */                           arrayList.addAll(list);
/* 170 */                           arrayList.add(e);
/* 173 */                           call.exitNetworkInterceptorExchange$okhttp(true);
/* 176 */                           z = false;
/* 177 */                           list = arrayList;
                                } catch (RouteException e2) {
/* 194 */                           if (!recover(e2.getLastConnectException(), call, request, false)) {
/* 228 */                               throw Util.withSuppressed(e2.getFirstConnectException(), list);
                                    }
/* 196 */                           IOException firstConnectException = e2.getFirstConnectException();
/* 200 */                           list.getClass();
/* 210 */                           arrayList = new ArrayList(list.size() + 1);
/* 213 */                           arrayList.addAll(list);
/* 216 */                           arrayList.add(firstConnectException);
/* 173 */                           call.exitNetworkInterceptorExchange$okhttp(true);
/* 176 */                           z = false;
/* 177 */                           list = arrayList;
                                }
/* 173 */                       call.exitNetworkInterceptorExchange$okhttp(true);
/* 176 */                       z = false;
/* 177 */                       list = arrayList;
                            } catch (Throwable th) {
/* 237 */                       call.exitNetworkInterceptorExchange$okhttp(true);
/* 240 */                       throw th;
                            }
                        }
/* 35 */                if (response != null) {
/* 57 */                    responseProceed = responseProceed.newBuilder().priorResponse(response.newBuilder().body(null).build()).build();
                        }
/* 61 */                response = responseProceed;
/* 66 */                Exchange interceptorScopedExchange = call.getInterceptorScopedExchange();
/* 70 */                Request requestFollowUpRequest = followUpRequest(response, interceptorScopedExchange);
/* 74 */                if (requestFollowUpRequest == null) {
/* 76 */                    if (interceptorScopedExchange != null && interceptorScopedExchange.getIsDuplex()) {
/* 84 */                        call.timeoutEarlyExit();
                            }
/* 87 */                    call.exitNetworkInterceptorExchange$okhttp(false);
/* 90 */                    return response;
                        }
/* 91 */                RequestBody requestBodyBody = requestFollowUpRequest.body();
/* 95 */                if (requestBodyBody != null && requestBodyBody.isOneShot()) {
/* 103 */                   call.exitNetworkInterceptorExchange$okhttp(false);
/* 106 */                   return response;
                        }
/* 107 */               ResponseBody responseBodyBody = response.body();
/* 111 */               if (responseBodyBody != null) {
/* 114 */                   Util.closeQuietly(responseBodyBody);
                        }
/* 117 */               i++;
/* 121 */               if (i > MAX_FOLLOW_UPS) {
/* 143 */                   throw new ProtocolException(Intrinsics.m6219d(Integer.valueOf(i), "Too many follow-up requests: "));
                        }
/* 123 */               call.exitNetworkInterceptorExchange$okhttp(true);
/* 126 */               request = requestFollowUpRequest;
                    }
                }
            }
