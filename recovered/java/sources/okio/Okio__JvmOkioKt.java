            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.config.AbstractC1417a;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.net.Socket;
            import java.nio.file.Files;
            import java.nio.file.OpenOption;
            import java.security.MessageDigest;
            import java.util.Arrays;
            import java.util.logging.Logger;
            import javax.crypto.Cipher;
            import javax.crypto.Mac;
            import kotlin.Metadata;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import okio.internal.ResourceFileSystem;
            import okio.internal.ZipFilesKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\b\u001a\u00020\t*\u00020\n\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\r\u001a\u0012\u0010\u000e\u001a\u00020\u000f*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0012\u0010\u0015\u001a\u00020\u0016*\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u0012\u0010\u0015\u001a\u00020\u0016*\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a\u001a\u0012\u0010\u001b\u001a\u00020\u001c*\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u0012\u0010\u001b\u001a\u00020\u001c*\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a\u001a\u0012\u0010\u001d\u001a\u00020\f*\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f\u001a\u0016\u0010 \u001a\u00020\t*\u00020\n2\b\b\u0002\u0010!\u001a\u00020\u0004H\u0007\u001a\n\u0010 \u001a\u00020\t*\u00020\"\u001a\n\u0010 \u001a\u00020\t*\u00020#\u001a#\u0010 \u001a\u00020\t*\u00020$2\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0&\"\u00020'¢\u0006\u0002\u0010(\u001a\n\u0010)\u001a\u00020\u0014*\u00020\n\u001a\n\u0010)\u001a\u00020\u0014*\u00020*\u001a\n\u0010)\u001a\u00020\u0014*\u00020#\u001a#\u0010)\u001a\u00020\u0014*\u00020$2\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0&\"\u00020'¢\u0006\u0002\u0010+\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0003\u001a\u00020\u0004*\u00060\u0005j\u0002`\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0007¨\u0006,"}, m6176d2 = {"logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "isAndroidGetsocknameError", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "(Ljava/lang/AssertionError;)Z", "appendingSink", "Lokio/Sink;", "Ljava/io/File;", "asResourceFileSystem", "Lokio/FileSystem;", "Ljava/lang/ClassLoader;", "cipherSink", "Lokio/CipherSink;", "cipher", "Ljavax/crypto/Cipher;", "cipherSource", "Lokio/CipherSource;", "Lokio/Source;", "hashingSink", "Lokio/HashingSink;", "digest", "Ljava/security/MessageDigest;", "mac", "Ljavax/crypto/Mac;", "hashingSource", "Lokio/HashingSource;", "openZip", "zipPath", "Lokio/Path;", "sink", "append", "Ljava/io/OutputStream;", "Ljava/net/Socket;", "Ljava/nio/file/Path;", "options", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", FirebaseAnalytics.Param.SOURCE, "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "okio"}, m6177k = 5, m6178mv = {1, 8, 0}, m6180xi = 48, m6181xs = "okio/Okio")
/* 11 */    final /* synthetic */ class Okio__JvmOkioKt {
                private static final Logger logger = Logger.getLogger("okio.Okio");

                public static final Sink appendingSink(File file) throws FileNotFoundException {
/* 1 */             file.getClass();
/* 14 */            return Okio.sink(AbstractC1417a.m5166d(file, new FileOutputStream(file, true), true));
                }

                public static final FileSystem asResourceFileSystem(ClassLoader classLoader) {
/* 1 */             classLoader.getClass();
/* 7 */             return new ResourceFileSystem(classLoader, true);
                }

                public static final CipherSink cipherSink(Sink sink, Cipher cipher) {
/* 1 */             sink.getClass();
/* 4 */             cipher.getClass();
/* 13 */            return new CipherSink(Okio.buffer(sink), cipher);
                }

                public static final CipherSource cipherSource(Source source, Cipher cipher) {
/* 1 */             source.getClass();
/* 4 */             cipher.getClass();
/* 13 */            return new CipherSource(Okio.buffer(source), cipher);
                }

                public static final HashingSink hashingSink(Sink sink, Mac mac) {
/* 1 */             sink.getClass();
/* 4 */             mac.getClass();
/* 9 */             return new HashingSink(sink, mac);
                }

                public static final HashingSource hashingSource(Source source, Mac mac) {
/* 1 */             source.getClass();
/* 4 */             mac.getClass();
/* 9 */             return new HashingSource(source, mac);
                }

                public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
/* 1 */             assertionError.getClass();
/* 9 */             if (assertionError.getCause() != null) {
/* 11 */                String message = assertionError.getMessage();
/* 25 */                if (message != null ? StringsKt.m6240z(message, "getsockname failed", false) : false) {
/* 27 */                    return true;
                        }
                    }
/* 8 */             return false;
                }

                public static final FileSystem openZip(FileSystem fileSystem, Path path) throws IOException {
/* 1 */             fileSystem.getClass();
/* 4 */             path.getClass();
/* 9 */             return ZipFilesKt.openZip$default(path, fileSystem, null, 4, null);
                }

                public static final Sink sink(Socket socket) throws IOException {
/* 1 */             socket.getClass();
/* 6 */             SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
/* 11 */            OutputStream outputStream = socket.getOutputStream();
/* 15 */            outputStream.getClass();
/* 21 */            return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
                }

                public static /* synthetic */ Sink sink$default(File file, boolean z, int i, Object obj) throws FileNotFoundException {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 z = false;
                    }
/* 6 */             return Okio.sink(file, z);
                }

                public static final Source source(Socket socket) throws IOException {
/* 1 */             socket.getClass();
/* 6 */             SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
/* 11 */            InputStream inputStream = socket.getInputStream();
/* 15 */            inputStream.getClass();
/* 21 */            return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
                }

/* 12 */        public static final HashingSink hashingSink(Sink sink, MessageDigest messageDigest) {
                    sink.getClass();
                    messageDigest.getClass();
/* 13 */            return new HashingSink(sink, messageDigest);
                }

/* 12 */        public static final HashingSource hashingSource(Source source, MessageDigest messageDigest) {
                    source.getClass();
                    messageDigest.getClass();
/* 13 */            return new HashingSource(source, messageDigest);
                }

/* 25 */        public static final Sink sink(OutputStream outputStream) {
                    outputStream.getClass();
/* 26 */            return new OutputStreamSink(outputStream, new Timeout());
                }

/* 25 */        public static final Source source(InputStream inputStream) {
                    inputStream.getClass();
/* 26 */            return new InputStreamSource(inputStream, new Timeout());
                }

/* 26 */        public static final Sink sink(File file) throws FileNotFoundException {
/* 27 */            file.getClass();
/* 1 */             return sink$default(file, false, 1, null);
                }

/* 26 */        public static final Source source(File file) throws FileNotFoundException {
                    file.getClass();
/* 27 */            return new InputStreamSource(AbstractC1417a.m5164b(file, new FileInputStream(file)), Timeout.NONE);
                }

/* 27 */        public static final Sink sink(File file, boolean z) throws FileNotFoundException {
                    file.getClass();
/* 28 */            return Okio.sink(AbstractC1417a.m5166d(file, new FileOutputStream(file, z), z));
                }

/* 27 */        public static final Source source(java.nio.file.Path path, OpenOption... openOptionArr) throws IOException {
                    path.getClass();
                    openOptionArr.getClass();
/* 28 */            InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
                    inputStreamNewInputStream.getClass();
                    return Okio.source(inputStreamNewInputStream);
                }

/* 28 */        public static final Sink sink(java.nio.file.Path path, OpenOption... openOptionArr) throws IOException {
                    path.getClass();
                    openOptionArr.getClass();
/* 29 */            OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
                    outputStreamNewOutputStream.getClass();
                    return Okio.sink(outputStreamNewOutputStream);
                }
            }
