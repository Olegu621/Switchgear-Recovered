            package okhttp3.internal.http2;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, m6176d2 = {"Lokhttp3/internal/http2/ErrorCode;", HttpUrl.FRAGMENT_ENCODE_SET, "httpCode", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;II)V", "getHttpCode", "()I", "NO_ERROR", "PROTOCOL_ERROR", "INTERNAL_ERROR", "FLOW_CONTROL_ERROR", "SETTINGS_TIMEOUT", "STREAM_CLOSED", "FRAME_SIZE_ERROR", "REFUSED_STREAM", "CANCEL", "COMPRESSION_ERROR", "CONNECT_ERROR", "ENHANCE_YOUR_CALM", "INADEQUATE_SECURITY", "HTTP_1_1_REQUIRED", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public enum ErrorCode {
                NO_ERROR(0),
                PROTOCOL_ERROR(1),
                INTERNAL_ERROR(2),
                FLOW_CONTROL_ERROR(3),
                SETTINGS_TIMEOUT(4),
                STREAM_CLOSED(5),
                FRAME_SIZE_ERROR(6),
                REFUSED_STREAM(7),
                CANCEL(8),
                COMPRESSION_ERROR(9),
                CONNECT_ERROR(10),
                ENHANCE_YOUR_CALM(11),
                INADEQUATE_SECURITY(12),
                HTTP_1_1_REQUIRED(13);


                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final int httpCode;

                ErrorCode(int i) {
/* 4 */             this.httpCode = i;
                }

                public final int getHttpCode() {
/* 1 */             return this.httpCode;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m6176d2 = {"Lokhttp3/internal/http2/ErrorCode$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "fromHttp2", "Lokhttp3/internal/http2/ErrorCode;", "code", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final ErrorCode fromHttp2(int code) {
/* 7 */                 for (ErrorCode errorCode : ErrorCode.values()) {
/* 15 */                    if (errorCode.getHttpCode() == code) {
/* 17 */                        return errorCode;
                            }
                        }
/* 21 */                return null;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
