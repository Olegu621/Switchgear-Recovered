            package okhttp3.internal.http;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, m6176d2 = {"Lokhttp3/internal/http/HttpMethod;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "invalidatesCache", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.METHOD, HttpUrl.FRAGMENT_ENCODE_SET, "permitsRequestBody", "redirectsToGet", "redirectsWithBody", "requiresRequestBody", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class HttpMethod {
                public static final HttpMethod INSTANCE = new HttpMethod();

                private HttpMethod() {
                }

                public static final boolean permitsRequestBody(String method) {
/* 1 */             method.getClass();
                    return (Intrinsics.m6216a(method, "GET") || Intrinsics.m6216a(method, "HEAD")) ? false : true;
                }

                public static final boolean requiresRequestBody(String method) {
/* 1 */             method.getClass();
                    return Intrinsics.m6216a(method, "POST") || Intrinsics.m6216a(method, "PUT") || Intrinsics.m6216a(method, "PATCH") || Intrinsics.m6216a(method, "PROPPATCH") || Intrinsics.m6216a(method, "REPORT");
                }

                public final boolean invalidatesCache(String method) {
/* 1 */             method.getClass();
                    return Intrinsics.m6216a(method, "POST") || Intrinsics.m6216a(method, "PATCH") || Intrinsics.m6216a(method, "PUT") || Intrinsics.m6216a(method, "DELETE") || Intrinsics.m6216a(method, "MOVE");
                }

                public final boolean redirectsToGet(String method) {
/* 1 */             method.getClass();
/* 10 */            return !Intrinsics.m6216a(method, "PROPFIND");
                }

                public final boolean redirectsWithBody(String method) {
/* 1 */             method.getClass();
/* 6 */             return Intrinsics.m6216a(method, "PROPFIND");
                }
            }
