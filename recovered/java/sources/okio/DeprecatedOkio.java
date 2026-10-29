            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.File;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.net.Socket;
            import java.nio.file.OpenOption;
            import java.util.Arrays;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: okio.-DeprecatedOkio, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J)\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J)\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u0016H\u0007¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, m6176d2 = {"Lokio/-DeprecatedOkio;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "appendingSink", "Lokio/Sink;", "file", "Ljava/io/File;", "blackhole", "buffer", "Lokio/BufferedSink;", "sink", "Lokio/BufferedSource;", FirebaseAnalytics.Param.SOURCE, "Lokio/Source;", "outputStream", "Ljava/io/OutputStream;", "socket", "Ljava/net/Socket;", "path", "Ljava/nio/file/Path;", "options", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", "inputStream", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 7 */     public final class DeprecatedOkio {
                public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

                private DeprecatedOkio() {
                }

                public final Sink appendingSink(File file) {
/* 1 */             file.getClass();
/* 4 */             return Okio.appendingSink(file);
                }

                public final Sink blackhole() {
/* 1 */             return Okio.blackhole();
                }

                public final BufferedSink buffer(Sink sink) {
/* 1 */             sink.getClass();
/* 4 */             return Okio.buffer(sink);
                }

                public final Sink sink(java.nio.file.Path path, OpenOption... options) {
/* 1 */             path.getClass();
/* 4 */             options.getClass();
/* 14 */            return Okio.sink(path, (OpenOption[]) Arrays.copyOf(options, options.length));
                }

                public final Source source(java.nio.file.Path path, OpenOption... options) {
/* 1 */             path.getClass();
/* 4 */             options.getClass();
/* 14 */            return Okio.source(path, (OpenOption[]) Arrays.copyOf(options, options.length));
                }

/* 8 */         public final BufferedSource buffer(Source source) {
                    source.getClass();
/* 9 */             return Okio.buffer(source);
                }

/* 18 */        public final Sink sink(OutputStream outputStream) {
                    outputStream.getClass();
/* 19 */            return Okio.sink(outputStream);
                }

/* 18 */        public final Source source(InputStream inputStream) {
                    inputStream.getClass();
/* 19 */            return Okio.source(inputStream);
                }

/* 19 */        public final Sink sink(File file) {
                    file.getClass();
/* 1 */             return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                }

/* 19 */        public final Source source(File file) {
                    file.getClass();
/* 20 */            return Okio.source(file);
                }

/* 20 */        public final Sink sink(Socket socket) {
                    socket.getClass();
/* 21 */            return Okio.sink(socket);
                }

/* 20 */        public final Source source(Socket socket) {
                    socket.getClass();
/* 21 */            return Okio.source(socket);
                }
            }
