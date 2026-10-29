            package okhttp3;

            import kotlin.Metadata;
            import okio.ByteString;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0016"}, m6176d2 = {"Lokhttp3/WebSocketListener;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "onClosed", HttpUrl.FRAGMENT_ENCODE_SET, "webSocket", "Lokhttp3/WebSocket;", "code", HttpUrl.FRAGMENT_ENCODE_SET, "reason", HttpUrl.FRAGMENT_ENCODE_SET, "onClosing", "onFailure", "t", HttpUrl.FRAGMENT_ENCODE_SET, "response", "Lokhttp3/Response;", "onMessage", "text", "bytes", "Lokio/ByteString;", "onOpen", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 6 */     public abstract class WebSocketListener {
                public void onClosed(WebSocket webSocket, int code, String reason) {
/* 1 */             webSocket.getClass();
/* 4 */             reason.getClass();
                }

                public void onClosing(WebSocket webSocket, int code, String reason) {
/* 1 */             webSocket.getClass();
/* 4 */             reason.getClass();
                }

                public void onFailure(WebSocket webSocket, Throwable t, Response response) {
/* 1 */             webSocket.getClass();
/* 4 */             t.getClass();
                }

                public void onMessage(WebSocket webSocket, String text) {
/* 1 */             webSocket.getClass();
/* 4 */             text.getClass();
                }

                public void onOpen(WebSocket webSocket, Response response) {
/* 1 */             webSocket.getClass();
/* 4 */             response.getClass();
                }

/* 7 */         public void onMessage(WebSocket webSocket, ByteString bytes) {
/* 8 */             webSocket.getClass();
                    bytes.getClass();
                }
            }
