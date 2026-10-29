            package okhttp3.internal.connection;

            import java.io.IOException;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.jf0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000e"}, m6176d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "firstConnectException", "Ljava/io/IOException;", "(Ljava/io/IOException;)V", "getFirstConnectException", "()Ljava/io/IOException;", "<set-?>", "lastConnectException", "getLastConnectException", "addConnectException", HttpUrl.FRAGMENT_ENCODE_SET, "e", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class RouteException extends RuntimeException {
                private final IOException firstConnectException;
                private IOException lastConnectException;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public RouteException(IOException iOException) {
/* 4 */             super(iOException);
/* 1 */             iOException.getClass();
/* 7 */             this.firstConnectException = iOException;
/* 9 */             this.lastConnectException = iOException;
                }

                public final void addConnectException(IOException e) {
/* 1 */             e.getClass();
/* 6 */             jf0.m5798a(this.firstConnectException, e);
/* 9 */             this.lastConnectException = e;
                }

                public final IOException getFirstConnectException() {
/* 1 */             return this.firstConnectException;
                }

                public final IOException getLastConnectException() {
/* 1 */             return this.lastConnectException;
                }
            }
