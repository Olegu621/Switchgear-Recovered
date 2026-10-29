            package okhttp3.internal.cache;

            import java.util.Date;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.text.C1852e;
            import okhttp3.CacheControl;
            import okhttp3.Headers;
            import okhttp3.HttpUrl;
            import okhttp3.Request;
            import okhttp3.Response;
            import okhttp3.internal.Util;
            import okhttp3.internal.http.DatesKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u001b\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m6176d2 = {"Lokhttp3/internal/cache/CacheStrategy;", HttpUrl.FRAGMENT_ENCODE_SET, "networkRequest", "Lokhttp3/Request;", "cacheResponse", "Lokhttp3/Response;", "(Lokhttp3/Request;Lokhttp3/Response;)V", "getCacheResponse", "()Lokhttp3/Response;", "getNetworkRequest", "()Lokhttp3/Request;", "Companion", "Factory", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class CacheStrategy {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final Response cacheResponse;
                private final Request networkRequest;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0003H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m6176d2 = {"Lokhttp3/internal/cache/CacheStrategy$Factory;", HttpUrl.FRAGMENT_ENCODE_SET, "nowMillis", HttpUrl.FRAGMENT_ENCODE_SET, "request", "Lokhttp3/Request;", "cacheResponse", "Lokhttp3/Response;", "(JLokhttp3/Request;Lokhttp3/Response;)V", "ageSeconds", HttpUrl.FRAGMENT_ENCODE_SET, "etag", HttpUrl.FRAGMENT_ENCODE_SET, "expires", "Ljava/util/Date;", "lastModified", "lastModifiedString", "receivedResponseMillis", "getRequest$okhttp", "()Lokhttp3/Request;", "sentRequestMillis", "servedDate", "servedDateString", "cacheResponseAge", "compute", "Lokhttp3/internal/cache/CacheStrategy;", "computeCandidate", "computeFreshnessLifetime", "hasConditions", HttpUrl.FRAGMENT_ENCODE_SET, "isFreshnessLifetimeHeuristic", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class Factory {
                    private int ageSeconds;
                    private final Response cacheResponse;
                    private String etag;
                    private Date expires;
                    private Date lastModified;
                    private String lastModifiedString;
                    private final long nowMillis;
                    private long receivedResponseMillis;
                    private final Request request;
                    private long sentRequestMillis;
                    private Date servedDate;
                    private String servedDateString;

                    public Factory(long j, Request request, Response response) {
/* 1 */                 request.getClass();
/* 7 */                 this.nowMillis = j;
/* 9 */                 this.request = request;
/* 11 */                this.cacheResponse = response;
/* 14 */                this.ageSeconds = -1;
/* 16 */                if (response != null) {
/* 22 */                    this.sentRequestMillis = response.sentRequestAtMillis();
/* 28 */                    this.receivedResponseMillis = response.receivedResponseAtMillis();
/* 30 */                    Headers headers = response.headers();
/* 34 */                    int size = headers.size();
/* 38 */                    int i = 0;
/* 39 */                    while (i < size) {
/* 41 */                        int i2 = i + 1;
/* 43 */                        String strName = headers.name(i);
/* 47 */                        String strValue = headers.value(i);
/* 57 */                        if (C1852e.m6258h(strName, "Date")) {
/* 63 */                            this.servedDate = DatesKt.toHttpDateOrNull(strValue);
/* 65 */                            this.servedDateString = strValue;
                                } else if (C1852e.m6258h(strName, "Expires")) {
/* 80 */                            this.expires = DatesKt.toHttpDateOrNull(strValue);
                                } else if (C1852e.m6258h(strName, "Last-Modified")) {
/* 95 */                            this.lastModified = DatesKt.toHttpDateOrNull(strValue);
/* 97 */                            this.lastModifiedString = strValue;
                                } else if (C1852e.m6258h(strName, "ETag")) {
/* 108 */                           this.etag = strValue;
                                } else if (C1852e.m6258h(strName, "Age")) {
/* 123 */                           this.ageSeconds = Util.toNonNegativeInt(strValue, -1);
                                }
/* 125 */                       i = i2;
                            }
                        }
                    }

                    private final long cacheResponseAge() {
/* 1 */                 Date date = this.servedDate;
/* 14 */                long jMax = date != null ? Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
/* 18 */                int i = this.ageSeconds;
/* 21 */                if (i != -1) {
/* 30 */                    jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
                        }
/* 34 */                long j = this.receivedResponseMillis;
/* 44 */                return jMax + (j - this.sentRequestMillis) + (this.nowMillis - j);
                    }

                    private final CacheStrategy computeCandidate() {
                        String str;
/* 4 */                 if (this.cacheResponse == null) {
/* 10 */                    return new CacheStrategy(this.request, null);
                        }
/* 20 */                if (this.request.isHttps() && this.cacheResponse.handshake() == null) {
/* 34 */                    return new CacheStrategy(this.request, null);
                        }
/* 48 */                if (!CacheStrategy.INSTANCE.isCacheable(this.cacheResponse, this.request)) {
/* 54 */                    return new CacheStrategy(this.request, null);
                        }
/* 60 */                CacheControl cacheControl = this.request.cacheControl();
/* 68 */                if (cacheControl.noCache() || hasConditions(this.request)) {
/* 291 */                   return new CacheStrategy(this.request, null);
                        }
/* 82 */                CacheControl cacheControl2 = this.cacheResponse.cacheControl();
/* 86 */                long jCacheResponseAge = cacheResponseAge();
/* 90 */                long jComputeFreshnessLifetime = computeFreshnessLifetime();
/* 94 */                int iMaxAgeSeconds = cacheControl.maxAgeSeconds();
/* 98 */                TimeUnit timeUnit = TimeUnit.SECONDS;
/* 101 */               if (iMaxAgeSeconds != -1) {
/* 112 */                   jComputeFreshnessLifetime = Math.min(jComputeFreshnessLifetime, timeUnit.toMillis(cacheControl.maxAgeSeconds()));
                        }
/* 120 */               long millis = 0;
/* 134 */               long millis2 = cacheControl.minFreshSeconds() != -1 ? timeUnit.toMillis(cacheControl.minFreshSeconds()) : 0L;
/* 139 */               if (!cacheControl2.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
/* 152 */                   millis = timeUnit.toMillis(cacheControl.maxStaleSeconds());
                        }
/* 160 */               if (!cacheControl2.noCache()) {
/* 162 */                   long j = millis2 + jCacheResponseAge;
/* 166 */                   if (j < millis + jComputeFreshnessLifetime) {
/* 170 */                       Response.Builder builderNewBuilder = this.cacheResponse.newBuilder();
/* 178 */                       if (j >= jComputeFreshnessLifetime) {
/* 182 */                           builderNewBuilder.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
/* 190 */                       if (jCacheResponseAge > 86400000 && isFreshnessLifetimeHeuristic()) {
/* 200 */                           builderNewBuilder.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                }
/* 209 */                       return new CacheStrategy(null, builderNewBuilder.build());
                            }
                        }
/* 213 */               String str2 = this.etag;
/* 215 */               if (str2 != null) {
/* 217 */                   str = "If-None-Match";
                        } else {
/* 224 */                   if (this.lastModified != null) {
/* 226 */                       str2 = this.lastModifiedString;
                            } else {
/* 232 */                       if (this.servedDate == null) {
/* 283 */                           return new CacheStrategy(this.request, null);
                                }
/* 234 */                       str2 = this.servedDateString;
                            }
/* 222 */                   str = "If-Modified-Since";
                        }
/* 243 */               Headers.Builder builderNewBuilder2 = this.request.headers().newBuilder();
/* 247 */               str2.getClass();
/* 250 */               builderNewBuilder2.addLenient$okhttp(str, str2);
/* 275 */               return new CacheStrategy(this.request.newBuilder().headers(builderNewBuilder2.build()).build(), this.cacheResponse);
                    }

                    private final long computeFreshnessLifetime() {
                        Long lValueOf;
/* 1 */                 Response response = this.cacheResponse;
/* 3 */                 response.getClass();
/* 6 */                 CacheControl cacheControl = response.cacheControl();
/* 15 */                if (cacheControl.maxAgeSeconds() != -1) {
/* 24 */                    return TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds());
                        }
/* 29 */                Date date = this.expires;
/* 34 */                if (date != null) {
/* 36 */                    Date date2 = this.servedDate;
/* 45 */                    lValueOf = date2 != null ? Long.valueOf(date2.getTime()) : null;
/* 62 */                    long time = date.getTime() - (lValueOf == null ? this.receivedResponseMillis : lValueOf.longValue());
/* 65 */                    if (time > 0) {
/* 67 */                        return time;
                            }
/* 32 */                    return 0L;
                        }
/* 71 */                if (this.lastModified != null && this.cacheResponse.request().url().query() == null) {
/* 89 */                    Date date3 = this.servedDate;
/* 98 */                    lValueOf = date3 != null ? Long.valueOf(date3.getTime()) : null;
/* 107 */                   long jLongValue = lValueOf == null ? this.sentRequestMillis : lValueOf.longValue();
/* 111 */                   Date date4 = this.lastModified;
/* 113 */                   date4.getClass();
/* 120 */                   long time2 = jLongValue - date4.getTime();
/* 123 */                   if (time2 > 0) {
/* 127 */                       return time2 / 10;
                            }
                        }
/* 32 */                return 0L;
                    }

                    private final boolean hasConditions(Request request) {
                        return (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) ? false : true;
                    }

                    private final boolean isFreshnessLifetimeHeuristic() {
/* 1 */                 Response response = this.cacheResponse;
/* 3 */                 response.getClass();
                        return response.cacheControl().maxAgeSeconds() == -1 && this.expires == null;
                    }

                    public final CacheStrategy compute() {
/* 1 */                 CacheStrategy cacheStrategyComputeCandidate = computeCandidate();
                        return (cacheStrategyComputeCandidate.getNetworkRequest() == null || !this.request.cacheControl().onlyIfCached()) ? cacheStrategyComputeCandidate : new CacheStrategy(null, null);
                    }

                    /* JADX INFO: renamed from: getRequest$okhttp, reason: from getter */
                    public final Request getRequest() {
/* 1 */                 return this.request;
                    }
                }

                public CacheStrategy(Request request, Response response) {
/* 4 */             this.networkRequest = request;
/* 6 */             this.cacheResponse = response;
                }

                public final Response getCacheResponse() {
/* 1 */             return this.cacheResponse;
                }

                public final Request getNetworkRequest() {
/* 1 */             return this.networkRequest;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m6176d2 = {"Lokhttp3/internal/cache/CacheStrategy$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "isCacheable", HttpUrl.FRAGMENT_ENCODE_SET, "response", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    /* JADX WARN: Code duplicated, block: B:24:0x0037  */
                    public final boolean isCacheable(Response response, Request request) {
/* 1 */                 response.getClass();
/* 4 */                 request.getClass();
/* 7 */                 int iCode = response.code();
/* 14 */                if (iCode != 200 && iCode != 410 && iCode != 414 && iCode != 501 && iCode != 203 && iCode != 204) {
/* 38 */                    if (iCode == 307) {
/* 64 */                        if (Response.header$default(response, "Expires", null, 2, null) == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().getIsPublic() && !response.cacheControl().getIsPrivate()) {
/* 13 */                            return false;
                                }
                            } else if (iCode != 308 && iCode != 404 && iCode != 405) {
                                switch (iCode) {
                                    case 300:
                                    case 301:
                                        break;
                                    case 302:
/* 64 */                                if (Response.header$default(response, "Expires", null, 2, null) == null) {
/* 13 */                                    return false;
                                        }
                                        break;
                                    default:
/* 13 */                                return false;
                                }
                            }
                        }
                        return (response.cacheControl().noStore() || request.cacheControl().noStore()) ? false : true;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
