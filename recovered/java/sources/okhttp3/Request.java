            package okhttp3;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.net.URL;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import okhttp3.internal.Util;
            import okhttp3.internal.http.HttpMethod;
            import p000.C1951n4;
            import p000.C2085pw;
            import p000.ds0;
            import p000.f42;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001*BA\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\u0010\rJ\u000f\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u001fJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050 2\u0006\u0010\u001e\u001a\u00020\u0005J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b!J\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u0004\u0018\u00010\u0001J#\u0010$\u001a\u0004\u0018\u0001H%\"\u0004\b\u0000\u0010%2\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u0002H%0\f¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0005H\u0016J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b)R\u0015\u0010\b\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0017R$\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001a¨\u0006+"}, m6176d2 = {"Lokhttp3/Request;", HttpUrl.FRAGMENT_ENCODE_SET, "url", "Lokhttp3/HttpUrl;", FirebaseAnalytics.Param.METHOD, HttpUrl.FRAGMENT_ENCODE_SET, "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "tags", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/Class;", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/RequestBody;Ljava/util/Map;)V", "()Lokhttp3/RequestBody;", "cacheControl", "Lokhttp3/CacheControl;", "()Lokhttp3/CacheControl;", "()Lokhttp3/Headers;", "isHttps", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "lazyCacheControl", "()Ljava/lang/String;", "getTags$okhttp", "()Ljava/util/Map;", "()Lokhttp3/HttpUrl;", "-deprecated_body", "-deprecated_cacheControl", "header", "name", "-deprecated_headers", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_method", "newBuilder", "Lokhttp3/Request$Builder;", "tag", "T", "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "toString", "-deprecated_url", "Builder", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 5 */     public final class Request {
                private final RequestBody body;
                private final Headers headers;
                private CacheControl lazyCacheControl;
                private final String method;
                private final Map<Class<?>, Object> tags;
                private final HttpUrl url;

                public Request(HttpUrl httpUrl, String str, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
/* 1 */             httpUrl.getClass();
/* 4 */             str.getClass();
/* 7 */             headers.getClass();
/* 10 */            map.getClass();
/* 16 */            this.url = httpUrl;
/* 18 */            this.method = str;
/* 20 */            this.headers = headers;
/* 22 */            this.body = requestBody;
/* 24 */            this.tags = map;
                }

                /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
                public final RequestBody getBody() {
/* 1 */             return this.body;
                }

                /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
                public final CacheControl m10613deprecated_cacheControl() {
/* 1 */             return cacheControl();
                }

                /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
                public final Headers getHeaders() {
/* 1 */             return this.headers;
                }

                /* JADX INFO: renamed from: -deprecated_method, reason: not valid java name and from getter */
                public final String getMethod() {
/* 1 */             return this.method;
                }

                /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name and from getter */
                public final HttpUrl getUrl() {
/* 1 */             return this.url;
                }

                public final RequestBody body() {
/* 1 */             return this.body;
                }

                public final CacheControl cacheControl() {
/* 1 */             CacheControl cacheControl = this.lazyCacheControl;
/* 3 */             if (cacheControl != null) {
/* 15 */                return cacheControl;
                    }
/* 9 */             CacheControl cacheControl2 = CacheControl.INSTANCE.parse(this.headers);
/* 13 */            this.lazyCacheControl = cacheControl2;
/* 15 */            return cacheControl2;
                }

                public final Map<Class<?>, Object> getTags$okhttp() {
/* 1 */             return this.tags;
                }

                public final String header(String name) {
/* 1 */             name.getClass();
/* 6 */             return this.headers.get(name);
                }

                public final List<String> headers(String name) {
/* 1 */             name.getClass();
/* 6 */             return this.headers.values(name);
                }

                public final boolean isHttps() {
/* 3 */             return this.url.getIsHttps();
                }

                public final String method() {
/* 1 */             return this.method;
                }

                public final Builder newBuilder() {
/* 3 */             return new Builder(this);
                }

                public final <T> T tag(Class<? extends T> type) {
/* 1 */             type.getClass();
/* 10 */            return type.cast(this.tags.get(type));
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Request{method=");
/* 12 */            sb.append(method());
/* 17 */            sb.append(", url=");
/* 24 */            sb.append(url());
/* 35 */            if (headers().size() != 0) {
/* 39 */                sb.append(", headers=[");
/* 50 */                int i = 0;
/* 55 */                for (Pair<? extends String, ? extends String> pair : headers()) {
/* 61 */                    int i2 = i + 1;
/* 63 */                    if (i < 0) {
/* 95 */                        C2085pw.m7568g();
/* 99 */                        throw null;
                            }
/* 65 */                    Pair<? extends String, ? extends String> pair2 = pair;
/* 69 */                    String str = (String) pair2.f12908a;
/* 73 */                    String str2 = (String) pair2.f12909b;
/* 75 */                    if (i > 0) {
/* 79 */                        sb.append(", ");
                            }
/* 82 */                    sb.append(str);
/* 87 */                    sb.append(':');
/* 90 */                    sb.append(str2);
/* 93 */                    i = i2;
                        }
/* 102 */               sb.append(']');
                    }
/* 113 */           if (!getTags$okhttp().isEmpty()) {
/* 117 */               sb.append(", tags=");
/* 124 */               sb.append(getTags$okhttp());
                    }
/* 129 */           sb.append('}');
/* 132 */           return sb.toString();
                }

                public final HttpUrl url() {
/* 1 */             return this.url;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*H\u0016J\u0014\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017J\b\u0010,\u001a\u00020\u0000H\u0016J\b\u0010-\u001a\u00020\u0000H\u0016J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020/H\u0016J\u001a\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00101\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00102\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00103\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0013H\u0016J-\u00104\u001a\u00020\u0000\"\u0004\b\u0000\u001052\u000e\u00106\u001a\n\u0012\u0006\b\u0000\u0012\u0002H50\u001a2\b\u00104\u001a\u0004\u0018\u0001H5H\u0016¢\u0006\u0002\u00107J\u0012\u00104\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u000208H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0018\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u0004\u0012\u00020\u00010\u0019X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00069"}, m6176d2 = {"Lokhttp3/Request$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "request", "Lokhttp3/Request;", "(Lokhttp3/Request;)V", "body", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "headers", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", FirebaseAnalytics.Param.METHOD, HttpUrl.FRAGMENT_ENCODE_SET, "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "tags", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/Class;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "url", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "addHeader", "name", FirebaseAnalytics.Param.VALUE, "build", "cacheControl", "Lokhttp3/CacheControl;", "delete", "get", "head", "header", "Lokhttp3/Headers;", "patch", "post", "put", "removeHeader", "tag", "T", "type", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Ljava/net/URL;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 6 */         public static class Builder {
                    private RequestBody body;
                    private Headers.Builder headers;
                    private String method;
                    private Map<Class<?>, Object> tags;
                    private HttpUrl url;

                    public Builder(Request request) {
                        LinkedHashMap linkedHashMap;
/* 1 */                 request.getClass();
/* 12 */                this.tags = new LinkedHashMap();
/* 18 */                this.url = request.url();
/* 24 */                this.method = request.method();
/* 30 */                this.body = request.body();
/* 40 */                if (request.getTags$okhttp().isEmpty()) {
/* 44 */                    linkedHashMap = new LinkedHashMap();
                        } else {
/* 48 */                    Map<Class<?>, Object> tags$okhttp = request.getTags$okhttp();
/* 52 */                    tags$okhttp.getClass();
/* 57 */                    linkedHashMap = new LinkedHashMap(tags$okhttp);
                        }
/* 61 */                this.tags = linkedHashMap;
/* 71 */                this.headers = request.headers().newBuilder();
                    }

                    public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
/* 1 */                 if (obj != null) {
/* 16 */                    C1951n4.m6866q("Super calls with default arguments not supported in this target, function: delete");
/* 19 */                    return null;
                        }
/* 5 */                 if ((i & 1) != 0) {
/* 7 */                     requestBody = Util.EMPTY_REQUEST;
                        }
/* 9 */                 return builder.delete(requestBody);
                    }

                    public Builder addHeader(String name, String value) {
/* 1 */                 name.getClass();
/* 4 */                 value.getClass();
/* 11 */                getHeaders().add(name, value);
/* 14 */                return this;
                    }

                    public Request build() {
/* 1 */                 HttpUrl httpUrl = this.url;
/* 3 */                 if (httpUrl != null) {
/* 23 */                    return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
                        }
/* 29 */                f42.m3656l("url == null");
/* 32 */                return null;
                    }

                    public Builder cacheControl(CacheControl cacheControl) {
/* 1 */                 cacheControl.getClass();
/* 4 */                 String string = cacheControl.toString();
                        return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
                    }

                    public final Builder delete() {
/* 3 */                 return delete$default(this, null, 1, null);
                    }

                    public Builder get() {
/* 4 */                 return method("GET", null);
                    }

                    /* JADX INFO: renamed from: getBody$okhttp, reason: from getter */
                    public final RequestBody getBody() {
/* 1 */                 return this.body;
                    }

                    /* JADX INFO: renamed from: getHeaders$okhttp, reason: from getter */
                    public final Headers.Builder getHeaders() {
/* 1 */                 return this.headers;
                    }

                    /* JADX INFO: renamed from: getMethod$okhttp, reason: from getter */
                    public final String getMethod() {
/* 1 */                 return this.method;
                    }

                    public final Map<Class<?>, Object> getTags$okhttp() {
/* 1 */                 return this.tags;
                    }

                    /* JADX INFO: renamed from: getUrl$okhttp, reason: from getter */
                    public final HttpUrl getUrl() {
/* 1 */                 return this.url;
                    }

                    public Builder head() {
/* 4 */                 return method("HEAD", null);
                    }

                    public Builder header(String name, String value) {
/* 1 */                 name.getClass();
/* 4 */                 value.getClass();
/* 11 */                getHeaders().set(name, value);
/* 14 */                return this;
                    }

                    public Builder headers(Headers headers) {
/* 1 */                 headers.getClass();
/* 8 */                 setHeaders$okhttp(headers.newBuilder());
/* 11 */                return this;
                    }

                    public Builder method(String method, RequestBody body) {
/* 1 */                 method.getClass();
/* 8 */                 if (method.length() <= 0) {
/* 58 */                    C1951n4.m6859j("method.isEmpty() == true");
/* 61 */                    return null;
                        }
/* 12 */                if (body == null) {
/* 18 */                    if (HttpMethod.requiresRequestBody(method)) {
/* 27 */                        ds0.m3200q(fm0.m3784j("method ", method, " must have a request body."));
/* 30 */                        return null;
                            }
                        } else if (!HttpMethod.permitsRequestBody(method)) {
/* 51 */                    ds0.m3200q(fm0.m3784j("method ", method, " must not have a request body."));
/* 54 */                    return null;
                        }
/* 38 */                setMethod$okhttp(method);
/* 41 */                setBody$okhttp(body);
/* 44 */                return this;
                    }

                    public Builder patch(RequestBody body) {
/* 1 */                 body.getClass();
/* 6 */                 return method("PATCH", body);
                    }

                    public Builder post(RequestBody body) {
/* 1 */                 body.getClass();
/* 6 */                 return method("POST", body);
                    }

                    public Builder put(RequestBody body) {
/* 1 */                 body.getClass();
/* 6 */                 return method("PUT", body);
                    }

                    public Builder removeHeader(String name) {
/* 1 */                 name.getClass();
/* 8 */                 getHeaders().removeAll(name);
/* 11 */                return this;
                    }

                    public final void setBody$okhttp(RequestBody requestBody) {
/* 1 */                 this.body = requestBody;
                    }

                    public final void setHeaders$okhttp(Headers.Builder builder) {
/* 1 */                 builder.getClass();
/* 4 */                 this.headers = builder;
                    }

                    public final void setMethod$okhttp(String str) {
/* 1 */                 str.getClass();
/* 4 */                 this.method = str;
                    }

                    public final void setTags$okhttp(Map<Class<?>, Object> map) {
/* 1 */                 map.getClass();
/* 4 */                 this.tags = map;
                    }

                    public final void setUrl$okhttp(HttpUrl httpUrl) {
/* 1 */                 this.url = httpUrl;
                    }

                    public <T> Builder tag(Class<? super T> type, T tag) {
/* 1 */                 type.getClass();
/* 4 */                 if (tag == null) {
/* 10 */                    getTags$okhttp().remove(type);
/* 13 */                    return this;
                        }
/* 22 */                if (getTags$okhttp().isEmpty()) {
/* 29 */                    setTags$okhttp(new LinkedHashMap());
                        }
/* 32 */                Map<Class<?>, Object> tags$okhttp = getTags$okhttp();
/* 36 */                T tCast = type.cast(tag);
/* 40 */                tCast.getClass();
/* 43 */                tags$okhttp.put(type, tCast);
/* 46 */                return this;
                    }

                    public Builder url(String url) {
/* 1 */                 url.getClass();
/* 11 */                if (C1852e.m6263m(url, "ws:", true)) {
/* 20 */                    url = Intrinsics.m6219d(url.substring(3), "http:");
                        } else if (C1852e.m6263m(url, "wss:", true)) {
/* 40 */                    url = Intrinsics.m6219d(url.substring(4), "https:");
                        }
/* 50 */                return url(HttpUrl.INSTANCE.get(url));
                    }

/* 7 */             public Builder delete(RequestBody body) {
/* 8 */                 return method("DELETE", body);
                    }

/* 46 */            public Builder tag(Object tag) {
/* 47 */                return tag(Object.class, tag);
                    }

/* 54 */            public Builder url(HttpUrl url) {
                        url.getClass();
/* 55 */                setUrl$okhttp(url);
                        return this;
                    }

/* 55 */            public Builder url(URL url) {
                        url.getClass();
/* 56 */                HttpUrl.Companion companion = HttpUrl.INSTANCE;
                        String string = url.toString();
                        string.getClass();
                        return url(companion.get(string));
                    }

/* 73 */            public Builder() {
/* 75 */                this.tags = new LinkedHashMap();
/* 76 */                this.method = "GET";
/* 77 */                this.headers = new Headers.Builder();
                    }
                }

/* 10 */        public final Headers headers() {
/* 11 */            return this.headers;
                }

/* 14 */        public final Object tag() {
/* 15 */            return tag(Object.class);
                }
            }
