            package p000;

            import java.io.IOException;
            import java.net.InetAddress;
            import java.net.Socket;
            import java.security.KeyManagementException;
            import java.security.NoSuchAlgorithmException;
            import javax.net.ssl.SSLContext;
            import javax.net.ssl.SSLSocket;
            import javax.net.ssl.SSLSocketFactory;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 18 */    public final class am2 extends SSLSocketFactory {

                /* JADX INFO: renamed from: a */
                public final String[] f335a;

                /* JADX INFO: renamed from: b */
                public final SSLSocketFactory f336b;

                public am2(String[] strArr) throws NoSuchAlgorithmException, KeyManagementException {
/* 4 */             this.f335a = strArr;
/* 8 */             SSLContext sSLContext = SSLContext.getInstance("TLS");
/* 13 */            sSLContext.init(null, null, null);
/* 16 */            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
/* 20 */            socketFactory.getClass();
/* 23 */            this.f336b = socketFactory;
                }

                /* JADX INFO: renamed from: a */
                public final void m316a(Socket socket) {
/* 3 */             if (socket instanceof SSLSocket) {
/* 9 */                 ((SSLSocket) socket).setEnabledProtocols(this.f335a);
                    }
                }

                @Override // javax.net.ssl.SSLSocketFactory
                public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
/* 1 */             socket.getClass();
/* 4 */             str.getClass();
/* 9 */             Socket socketCreateSocket = this.f336b.createSocket(socket, str, i, z);
/* 13 */            socketCreateSocket.getClass();
/* 16 */            m316a(socketCreateSocket);
/* 19 */            return socketCreateSocket;
                }

                @Override // javax.net.ssl.SSLSocketFactory
                public final String[] getDefaultCipherSuites() {
/* 3 */             String[] defaultCipherSuites = this.f336b.getDefaultCipherSuites();
/* 7 */             defaultCipherSuites.getClass();
/* 10 */            return defaultCipherSuites;
                }

                @Override // javax.net.ssl.SSLSocketFactory
                public final String[] getSupportedCipherSuites() {
/* 3 */             String[] supportedCipherSuites = this.f336b.getSupportedCipherSuites();
/* 7 */             supportedCipherSuites.getClass();
/* 10 */            return supportedCipherSuites;
                }

                @Override // javax.net.SocketFactory
/* 19 */        public final Socket createSocket() throws IOException {
/* 20 */            Socket socketCreateSocket = this.f336b.createSocket();
                    socketCreateSocket.getClass();
                    m316a(socketCreateSocket);
                    return socketCreateSocket;
                }

                @Override // javax.net.SocketFactory
/* 20 */        public final Socket createSocket(String str, int i) throws IOException {
                    str.getClass();
/* 21 */            Socket socketCreateSocket = this.f336b.createSocket(str, i);
                    socketCreateSocket.getClass();
                    m316a(socketCreateSocket);
                    return socketCreateSocket;
                }

                @Override // javax.net.SocketFactory
/* 21 */        public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
                    str.getClass();
                    inetAddress.getClass();
/* 22 */            Socket socketCreateSocket = this.f336b.createSocket(str, i, inetAddress, i2);
                    socketCreateSocket.getClass();
/* 23 */            m316a(socketCreateSocket);
                    return socketCreateSocket;
                }

                @Override // javax.net.SocketFactory
/* 23 */        public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
                    inetAddress.getClass();
/* 24 */            Socket socketCreateSocket = this.f336b.createSocket(inetAddress, i);
                    socketCreateSocket.getClass();
                    m316a(socketCreateSocket);
                    return socketCreateSocket;
                }

                @Override // javax.net.SocketFactory
/* 24 */        public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
                    inetAddress.getClass();
                    inetAddress2.getClass();
/* 25 */            Socket socketCreateSocket = this.f336b.createSocket(inetAddress, i, inetAddress2, i2);
                    socketCreateSocket.getClass();
/* 26 */            m316a(socketCreateSocket);
                    return socketCreateSocket;
                }
            }
