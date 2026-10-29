            package okhttp3.internal.connection;

            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.net.ProtocolException;
            import java.net.UnknownServiceException;
            import java.security.cert.CertificateException;
            import java.util.Arrays;
            import java.util.List;
            import javax.net.ssl.SSLException;
            import javax.net.ssl.SSLHandshakeException;
            import javax.net.ssl.SSLPeerUnverifiedException;
            import javax.net.ssl.SSLSocket;
            import kotlin.Metadata;
            import okhttp3.ConnectionSpec;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\rH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m6176d2 = {"Lokhttp3/internal/connection/ConnectionSpecSelector;", HttpUrl.FRAGMENT_ENCODE_SET, "connectionSpecs", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/ConnectionSpec;", "(Ljava/util/List;)V", "isFallback", HttpUrl.FRAGMENT_ENCODE_SET, "isFallbackPossible", "nextModeIndex", HttpUrl.FRAGMENT_ENCODE_SET, "configureSecureSocket", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "connectionFailed", "e", "Ljava/io/IOException;", "socket", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class ConnectionSpecSelector {
                private final List<ConnectionSpec> connectionSpecs;
                private boolean isFallback;
                private boolean isFallbackPossible;
                private int nextModeIndex;

                public ConnectionSpecSelector(List<ConnectionSpec> list) {
/* 1 */             list.getClass();
/* 7 */             this.connectionSpecs = list;
                }

                private final boolean isFallbackPossible(SSLSocket socket) {
/* 1 */             int i = this.nextModeIndex;
/* 5 */             int size = this.connectionSpecs.size();
/* 9 */             while (i < size) {
/* 11 */                int i2 = i + 1;
/* 25 */                if (this.connectionSpecs.get(i).isCompatible(socket)) {
/* 27 */                    return true;
                        }
/* 29 */                i = i2;
                    }
/* 31 */            return false;
                }

                public final ConnectionSpec configureSecureSocket(SSLSocket sslSocket) throws IOException {
                    ConnectionSpec connectionSpec;
/* 1 */             sslSocket.getClass();
/* 4 */             int i = this.nextModeIndex;
/* 8 */             int size = this.connectionSpecs.size();
                    while (true) {
/* 12 */                if (i >= size) {
/* 35 */                    connectionSpec = null;
                            break;
                        }
/* 14 */                int i2 = i + 1;
/* 18 */                connectionSpec = this.connectionSpecs.get(i);
/* 28 */                if (connectionSpec.isCompatible(sslSocket)) {
/* 30 */                    this.nextModeIndex = i2;
                            break;
                        }
/* 33 */                i = i2;
                    }
/* 36 */            if (connectionSpec != null) {
/* 42 */                this.isFallbackPossible = isFallbackPossible(sslSocket);
/* 46 */                connectionSpec.apply$okhttp(sslSocket, this.isFallback);
/* 49 */                return connectionSpec;
                    }
/* 56 */            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
/* 61 */            sb.append(this.isFallback);
/* 66 */            sb.append(", modes=");
/* 71 */            sb.append(this.connectionSpecs);
/* 74 */            String[] enabledProtocols = sslSocket.getEnabledProtocols();
/* 78 */            enabledProtocols.getClass();
/* 81 */            String string = Arrays.toString(enabledProtocols);
/* 85 */            string.getClass();
/* 90 */            sb.append(", supported protocols=");
/* 93 */            sb.append(string);
/* 103 */           throw new UnknownServiceException(sb.toString());
                }

                public final boolean connectionFailed(IOException e) {
/* 1 */             e.getClass();
/* 5 */             this.isFallback = true;
/* 10 */            if (!this.isFallbackPossible || (e instanceof ProtocolException) || (e instanceof InterruptedIOException)) {
/* 9 */                 return false;
                    }
                    return (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException)) ? false : true;
                }
            }
