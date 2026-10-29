            package okhttp3.internal.http;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import okhttp3.MediaType;
            import okhttp3.ResponseBody;
            import okio.BufferedSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0004\u001a\u00020\u0005H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m6176d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", "contentTypeString", HttpUrl.FRAGMENT_ENCODE_SET, "contentLength", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "(Ljava/lang/String;JLokio/BufferedSource;)V", "contentType", "Lokhttp3/MediaType;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class RealResponseBody extends ResponseBody {
                private final long contentLength;
                private final String contentTypeString;
                private final BufferedSource source;

                public RealResponseBody(String str, long j, BufferedSource bufferedSource) {
/* 1 */             bufferedSource.getClass();
/* 7 */             this.contentTypeString = str;
/* 9 */             this.contentLength = j;
/* 11 */            this.source = bufferedSource;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentLength, reason: from getter */
                public long getContentLength() {
/* 1 */             return this.contentLength;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentType */
                public MediaType get$contentType() {
/* 1 */             String str = this.contentTypeString;
/* 3 */             if (str == null) {
/* 5 */                 return null;
                    }
/* 9 */             return MediaType.INSTANCE.parse(str);
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: source, reason: from getter */
                public BufferedSource getSource() {
/* 1 */             return this.source;
                }
            }
