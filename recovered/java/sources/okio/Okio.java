            package okio;

            import java.io.Closeable;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.net.Socket;
            import java.nio.file.OpenOption;
            import java.security.MessageDigest;
            import javax.crypto.Cipher;
            import javax.crypto.Mac;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"okio/Okio__JvmOkioKt", "okio/Okio__OkioKt"}, m6177k = 4, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 4 */     public final class Okio {
                public static final Sink appendingSink(File file) throws FileNotFoundException {
/* 1 */             return Okio__JvmOkioKt.appendingSink(file);
                }

                public static final FileSystem asResourceFileSystem(ClassLoader classLoader) {
/* 1 */             return Okio__JvmOkioKt.asResourceFileSystem(classLoader);
                }

                public static final Sink blackhole() {
/* 1 */             return Okio__OkioKt.blackhole();
                }

                public static final BufferedSink buffer(Sink sink) {
/* 1 */             return Okio__OkioKt.buffer(sink);
                }

                public static final CipherSink cipherSink(Sink sink, Cipher cipher) {
/* 1 */             return Okio__JvmOkioKt.cipherSink(sink, cipher);
                }

                public static final CipherSource cipherSource(Source source, Cipher cipher) {
/* 1 */             return Okio__JvmOkioKt.cipherSource(source, cipher);
                }

                public static final HashingSink hashingSink(Sink sink, MessageDigest messageDigest) {
/* 1 */             return Okio__JvmOkioKt.hashingSink(sink, messageDigest);
                }

                public static final HashingSource hashingSource(Source source, MessageDigest messageDigest) {
/* 1 */             return Okio__JvmOkioKt.hashingSource(source, messageDigest);
                }

                public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
/* 1 */             return Okio__JvmOkioKt.isAndroidGetsocknameError(assertionError);
                }

                public static final FileSystem openZip(FileSystem fileSystem, Path path) throws IOException {
/* 1 */             return Okio__JvmOkioKt.openZip(fileSystem, path);
                }

                public static final Sink sink(File file) throws FileNotFoundException {
/* 1 */             return Okio__JvmOkioKt.sink(file);
                }

                public static final Source source(File file) throws FileNotFoundException {
/* 1 */             return Okio__JvmOkioKt.source(file);
                }

                public static final <T extends Closeable, R> R use(T t, Function1<? super T, ? extends R> function1) {
/* 1 */             return (R) Okio__OkioKt.use(t, function1);
                }

/* 5 */         public static final BufferedSource buffer(Source source) {
/* 6 */             return Okio__OkioKt.buffer(source);
                }

/* 5 */         public static final HashingSink hashingSink(Sink sink, Mac mac) {
/* 6 */             return Okio__JvmOkioKt.hashingSink(sink, mac);
                }

/* 5 */         public static final HashingSource hashingSource(Source source, Mac mac) {
/* 6 */             return Okio__JvmOkioKt.hashingSource(source, mac);
                }

/* 5 */         public static final Sink sink(File file, boolean z) throws FileNotFoundException {
/* 6 */             return Okio__JvmOkioKt.sink(file, z);
                }

/* 5 */         public static final Source source(InputStream inputStream) {
/* 6 */             return Okio__JvmOkioKt.source(inputStream);
                }

/* 6 */         public static final Sink sink(OutputStream outputStream) {
/* 7 */             return Okio__JvmOkioKt.sink(outputStream);
                }

/* 6 */         public static final Source source(Socket socket) throws IOException {
/* 7 */             return Okio__JvmOkioKt.source(socket);
                }

/* 7 */         public static final Sink sink(Socket socket) throws IOException {
/* 8 */             return Okio__JvmOkioKt.sink(socket);
                }

/* 7 */         public static final Source source(java.nio.file.Path path, OpenOption... openOptionArr) throws IOException {
/* 8 */             return Okio__JvmOkioKt.source(path, openOptionArr);
                }

/* 8 */         public static final Sink sink(java.nio.file.Path path, OpenOption... openOptionArr) throws IOException {
/* 9 */             return Okio__JvmOkioKt.sink(path, openOptionArr);
                }
            }
