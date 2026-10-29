            package okio;

            import java.io.IOException;
            import java.net.Socket;
            import java.net.SocketTimeoutException;
            import java.util.logging.Level;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\b\u001a\u00020\tH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m6176d2 = {"Lokio/SocketAsyncTimeout;", "Lokio/AsyncTimeout;", "socket", "Ljava/net/Socket;", "(Ljava/net/Socket;)V", "newTimeoutException", "Ljava/io/IOException;", "cause", "timedOut", HttpUrl.FRAGMENT_ENCODE_SET, "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            final class SocketAsyncTimeout extends AsyncTimeout {
                private final Socket socket;

                public SocketAsyncTimeout(Socket socket) {
/* 1 */             socket.getClass();
/* 7 */             this.socket = socket;
                }

                @Override // okio.AsyncTimeout
                public IOException newTimeoutException(IOException cause) {
/* 5 */             SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
/* 8 */             if (cause != null) {
/* 10 */                socketTimeoutException.initCause(cause);
                    }
/* 13 */            return socketTimeoutException;
                }

                @Override // okio.AsyncTimeout
                public void timedOut() {
                    try {
/* 5 */                 this.socket.close();
                    } catch (AssertionError e) {
/* 17 */                if (!Okio.isAndroidGetsocknameError(e)) {
/* 43 */                    throw e;
                        }
/* 39 */                Okio__JvmOkioKt.logger.log(Level.WARNING, "Failed to close timed out socket " + this.socket, (Throwable) e);
                    } catch (Exception e2) {
/* 64 */                Okio__JvmOkioKt.logger.log(Level.WARNING, "Failed to close timed out socket " + this.socket, (Throwable) e2);
                    }
                }
            }
