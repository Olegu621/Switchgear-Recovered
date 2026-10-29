            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.sequences.Sequence;
            import okhttp3.HttpUrl;
            import okio.internal.ResourceFileSystem;
            import p000.C1951n4;
            import p000.jf0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\b&\u0018\u0000 B2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u0004H&¢\u0006\u0004\b\"\u0010#J5\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\u0006\u0010\u0019\u001a\u00020\u00042\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00028\u00000%H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\fH&¢\u0006\u0004\b,\u0010-J\u0015\u0010,\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b,\u0010.J?\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\f2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00028\u00000%H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00102J!\u00104\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b4\u0010-J\u0015\u00104\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b4\u0010.J!\u00106\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\fH&¢\u0006\u0004\b6\u00107J\u0015\u00106\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b6\u00108J\u001f\u00109\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b9\u00107J\u0015\u00109\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b9\u00108J\u001f\u0010;\u001a\u0002052\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0004H&¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u0002052\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010<J!\u0010>\u001a\u0002052\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b>\u00107J\u0015\u0010>\u001a\u0002052\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b>\u00108J!\u0010@\u001a\u0002052\u0006\u0010?\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b@\u00107J\u0015\u0010@\u001a\u0002052\u0006\u0010?\u001a\u00020\u0004¢\u0006\u0004\b@\u00108J\u001f\u0010A\u001a\u0002052\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0004H&¢\u0006\u0004\bA\u0010<\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006C"}, m6176d2 = {"Lokio/FileSystem;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lokio/Path;", "path", "canonicalize", "(Lokio/Path;)Lokio/Path;", "Lokio/FileMetadata;", "metadata", "(Lokio/Path;)Lokio/FileMetadata;", "metadataOrNull", HttpUrl.FRAGMENT_ENCODE_SET, "exists", "(Lokio/Path;)Z", "dir", HttpUrl.FRAGMENT_ENCODE_SET, "list", "(Lokio/Path;)Ljava/util/List;", "listOrNull", "followSymlinks", "Lkotlin/sequences/Sequence;", "listRecursively", "(Lokio/Path;Z)Lkotlin/sequences/Sequence;", "(Lokio/Path;)Lkotlin/sequences/Sequence;", "file", "Lokio/FileHandle;", "openReadOnly", "(Lokio/Path;)Lokio/FileHandle;", "mustCreate", "mustExist", "openReadWrite", "(Lokio/Path;ZZ)Lokio/FileHandle;", "Lokio/Source;", FirebaseAnalytics.Param.SOURCE, "(Lokio/Path;)Lokio/Source;", "T", "Lkotlin/Function1;", "Lokio/BufferedSource;", "readerAction", "-read", "(Lokio/Path;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "read", "Lokio/Sink;", "sink", "(Lokio/Path;Z)Lokio/Sink;", "(Lokio/Path;)Lokio/Sink;", "Lokio/BufferedSink;", "writerAction", "-write", "(Lokio/Path;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "write", "appendingSink", HttpUrl.FRAGMENT_ENCODE_SET, "createDirectory", "(Lokio/Path;Z)V", "(Lokio/Path;)V", "createDirectories", "target", "atomicMove", "(Lokio/Path;Lokio/Path;)V", "copy", "delete", "fileOrDirectory", "deleteRecursively", "createSymlink", "Companion", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 2 */     public abstract class FileSystem {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final FileSystem RESOURCES;
                public static final FileSystem SYSTEM;
                public static final Path SYSTEM_TEMPORARY_DIRECTORY;

                /* JADX INFO: renamed from: -write$default, reason: not valid java name */
                public static /* synthetic */ Object m10649write$default(FileSystem fileSystem, Path path, boolean z, Function1 function1, int i, Object obj) throws Throwable {
                    Object objInvoke;
/* 1 */             Throwable th = null;
/* 2 */             if (obj != null) {
/* 58 */                C1951n4.m6866q("Super calls with default arguments not supported in this target, function: write");
/* 1 */                 return null;
                    }
/* 6 */             if ((i & 2) != 0) {
/* 8 */                 z = false;
                    }
/* 9 */             path.getClass();
/* 12 */            function1.getClass();
/* 19 */            BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(path, z));
                    try {
/* 23 */                objInvoke = function1.invoke(bufferedSinkBuffer);
/* 27 */                if (bufferedSinkBuffer != null) {
                            try {
/* 29 */                        bufferedSinkBuffer.close();
                            } catch (Throwable th2) {
/* 33 */                        th = th2;
                            }
                        }
                    } catch (Throwable th3) {
/* 36 */                if (bufferedSinkBuffer != null) {
                            try {
/* 38 */                        bufferedSinkBuffer.close();
                            } catch (Throwable th4) {
/* 43 */                        jf0.m5798a(th3, th4);
                            }
                        }
/* 47 */                th = th3;
/* 48 */                objInvoke = null;
                    }
/* 49 */            if (th != null) {
/* 55 */                throw th;
                    }
/* 51 */            objInvoke.getClass();
/* 54 */            return objInvoke;
                }

                static {
                    FileSystem jvmSystemFileSystem;
                    try {
/* 11 */                Class.forName("java.nio.file.Files");
/* 16 */                jvmSystemFileSystem = new NioSystemFileSystem();
                    } catch (ClassNotFoundException unused) {
/* 22 */                jvmSystemFileSystem = new JvmSystemFileSystem();
                    }
/* 25 */            SYSTEM = jvmSystemFileSystem;
/* 27 */            Path.Companion companion = Path.INSTANCE;
/* 31 */            String property = System.getProperty("java.io.tmpdir");
/* 35 */            property.getClass();
/* 44 */            SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
/* 50 */            ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
/* 54 */            classLoader.getClass();
/* 60 */            RESOURCES = new ResourceFileSystem(classLoader, false);
                }

                public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
/* 1 */             if (obj != null) {
/* 15 */                C1951n4.m6866q("Super calls with default arguments not supported in this target, function: appendingSink");
/* 18 */                return null;
                    }
/* 5 */             if ((i & 2) != 0) {
/* 7 */                 z = false;
                    }
/* 8 */             return fileSystem.appendingSink(path, z);
                }

                public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
/* 1 */             if (obj != null) {
/* 14 */                C1951n4.m6866q("Super calls with default arguments not supported in this target, function: createDirectories");
/* 17 */                return;
                    }
/* 5 */             if ((i & 2) != 0) {
/* 7 */                 z = false;
                    }
/* 8 */             fileSystem.createDirectories(path, z);
                }

                public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
/* 1 */             if (obj != null) {
/* 14 */                C1951n4.m6866q("Super calls with default arguments not supported in this target, function: createDirectory");
/* 17 */                return;
                    }
/* 5 */             if ((i & 2) != 0) {
/* 7 */                 z = false;
                    }
/* 8 */             fileSystem.createDirectory(path, z);
                }

                public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
/* 1 */             if (obj != null) {
/* 14 */                C1951n4.m6866q("Super calls with default arguments not supported in this target, function: delete");
/* 17 */                return;
                    }
/* 5 */             if ((i & 2) != 0) {
/* 7 */                 z = false;
                    }
/* 8 */             fileSystem.delete(path, z);
                }

                public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
/* 1 */             if (obj != null) {
/* 14 */                C1951n4.m6866q("Super calls with default arguments not supported in this target, function: deleteRecursively");
/* 17 */                return;
                    }
/* 5 */             if ((i & 2) != 0) {
/* 7 */                 z = false;
                    }
/* 8 */             fileSystem.deleteRecursively(path, z);
                }

                public static final FileSystem get(java.nio.file.FileSystem fileSystem) {
/* 3 */             return INSTANCE.get(fileSystem);
                }

                public static /* synthetic */ Sequence listRecursively$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) {
/* 1 */             if (obj != null) {
/* 15 */                C1951n4.m6866q("Super calls with default arguments not supported in this target, function: listRecursively");
/* 18 */                return null;
                    }
/* 5 */             if ((i & 2) != 0) {
/* 7 */                 z = false;
                    }
/* 8 */             return fileSystem.listRecursively(path, z);
                }

                public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z, boolean z2, int i, Object obj) throws IOException {
/* 1 */             if (obj != null) {
/* 21 */                C1951n4.m6866q("Super calls with default arguments not supported in this target, function: openReadWrite");
/* 24 */                return null;
                    }
/* 6 */             if ((i & 2) != 0) {
/* 8 */                 z = false;
                    }
/* 11 */            if ((i & 4) != 0) {
/* 13 */                z2 = false;
                    }
/* 14 */            return fileSystem.openReadWrite(path, z, z2);
                }

                public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
/* 1 */             if (obj != null) {
/* 15 */                C1951n4.m6866q("Super calls with default arguments not supported in this target, function: sink");
/* 18 */                return null;
                    }
/* 5 */             if ((i & 2) != 0) {
/* 7 */                 z = false;
                    }
/* 8 */             return fileSystem.sink(path, z);
                }

                /* JADX INFO: renamed from: -read, reason: not valid java name */
                public final <T> T m10650read(Path file, Function1<? super BufferedSource, ? extends T> readerAction) throws Throwable {
                    T t;
/* 1 */             file.getClass();
/* 4 */             readerAction.getClass();
/* 11 */            BufferedSource bufferedSourceBuffer = Okio.buffer(source(file));
/* 15 */            Throwable th = null;
                    try {
/* 16 */                t = (T) readerAction.invoke(bufferedSourceBuffer);
/* 20 */                if (bufferedSourceBuffer != null) {
                            try {
/* 22 */                        bufferedSourceBuffer.close();
                            } catch (Throwable th2) {
/* 26 */                        th = th2;
                            }
                        }
                    } catch (Throwable th3) {
/* 29 */                if (bufferedSourceBuffer != null) {
                            try {
/* 31 */                        bufferedSourceBuffer.close();
                            } catch (Throwable th4) {
/* 36 */                        jf0.m5798a(th3, th4);
                            }
                        }
/* 40 */                t = null;
/* 41 */                th = th3;
                    }
/* 42 */            if (th != null) {
/* 48 */                throw th;
                    }
/* 44 */            t.getClass();
                    return t;
                }

                /* JADX INFO: renamed from: -write, reason: not valid java name */
                public final <T> T m10651write(Path file, boolean mustCreate, Function1<? super BufferedSink, ? extends T> writerAction) throws Throwable {
                    T t;
/* 1 */             file.getClass();
/* 4 */             writerAction.getClass();
/* 11 */            BufferedSink bufferedSinkBuffer = Okio.buffer(sink(file, mustCreate));
/* 15 */            Throwable th = null;
                    try {
/* 16 */                t = (T) writerAction.invoke(bufferedSinkBuffer);
/* 20 */                if (bufferedSinkBuffer != null) {
                            try {
/* 22 */                        bufferedSinkBuffer.close();
                            } catch (Throwable th2) {
/* 26 */                        th = th2;
                            }
                        }
                    } catch (Throwable th3) {
/* 29 */                if (bufferedSinkBuffer != null) {
                            try {
/* 31 */                        bufferedSinkBuffer.close();
                            } catch (Throwable th4) {
/* 36 */                        jf0.m5798a(th3, th4);
                            }
                        }
/* 40 */                t = null;
/* 41 */                th = th3;
                    }
/* 42 */            if (th != null) {
/* 48 */                throw th;
                    }
/* 44 */            t.getClass();
                    return t;
                }

                public final Sink appendingSink(Path file) throws IOException {
/* 1 */             file.getClass();
/* 5 */             return appendingSink(file, false);
                }

                public abstract Sink appendingSink(Path file, boolean mustExist) throws IOException;

                public abstract void atomicMove(Path source, Path target) throws IOException;

                public abstract Path canonicalize(Path path) throws IOException;

                public void copy(Path source, Path target) throws IOException {
/* 1 */             source.getClass();
/* 4 */             target.getClass();
/* 7 */             okio.internal.FileSystem.commonCopy(this, source, target);
                }

                public final void createDirectories(Path dir) throws IOException {
/* 1 */             dir.getClass();
/* 5 */             createDirectories(dir, false);
                }

                public final void createDirectory(Path dir) throws IOException {
/* 1 */             dir.getClass();
/* 5 */             createDirectory(dir, false);
                }

                public abstract void createDirectory(Path dir, boolean mustCreate) throws IOException;

                public abstract void createSymlink(Path source, Path target) throws IOException;

                public final void delete(Path path) throws IOException {
/* 1 */             path.getClass();
/* 5 */             delete(path, false);
                }

                public abstract void delete(Path path, boolean mustExist) throws IOException;

                public final void deleteRecursively(Path fileOrDirectory) throws IOException {
/* 1 */             fileOrDirectory.getClass();
/* 5 */             deleteRecursively(fileOrDirectory, false);
                }

                public final boolean exists(Path path) throws IOException {
/* 1 */             path.getClass();
/* 4 */             return okio.internal.FileSystem.commonExists(this, path);
                }

                public abstract List<Path> list(Path dir) throws IOException;

                public abstract List<Path> listOrNull(Path dir);

                public final Sequence<Path> listRecursively(Path dir) {
/* 1 */             dir.getClass();
/* 5 */             return listRecursively(dir, false);
                }

                public final FileMetadata metadata(Path path) throws IOException {
/* 1 */             path.getClass();
/* 4 */             return okio.internal.FileSystem.commonMetadata(this, path);
                }

                public abstract FileMetadata metadataOrNull(Path path) throws IOException;

                public abstract FileHandle openReadOnly(Path file) throws IOException;

                public final FileHandle openReadWrite(Path file) throws IOException {
/* 1 */             file.getClass();
/* 5 */             return openReadWrite(file, false, false);
                }

                public abstract FileHandle openReadWrite(Path file, boolean mustCreate, boolean mustExist) throws IOException;

                public final Sink sink(Path file) throws IOException {
/* 1 */             file.getClass();
/* 5 */             return sink(file, false);
                }

                public abstract Sink sink(Path file, boolean mustCreate) throws IOException;

                public abstract Source source(Path file) throws IOException;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\b\u001a\u00020\u0004*\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m6176d2 = {"Lokio/FileSystem$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "RESOURCES", "Lokio/FileSystem;", "SYSTEM", "SYSTEM_TEMPORARY_DIRECTORY", "Lokio/Path;", "asOkioFileSystem", "Ljava/nio/file/FileSystem;", "get", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final FileSystem get(java.nio.file.FileSystem fileSystem) {
/* 1 */                 fileSystem.getClass();
/* 6 */                 return new NioFileSystemWrappingFileSystem(fileSystem);
                    }

/* 4 */             private Companion() {
                    }
                }

/* 8 */         public final void createDirectories(Path dir, boolean mustCreate) throws IOException {
                    dir.getClass();
/* 9 */             okio.internal.FileSystem.commonCreateDirectories(this, dir, mustCreate);
                }

/* 8 */         public void deleteRecursively(Path fileOrDirectory, boolean mustExist) throws IOException {
                    fileOrDirectory.getClass();
/* 9 */             okio.internal.FileSystem.commonDeleteRecursively(this, fileOrDirectory, mustExist);
                }

/* 9 */         public Sequence<Path> listRecursively(Path dir, boolean followSymlinks) {
                    dir.getClass();
/* 10 */            return okio.internal.FileSystem.commonListRecursively(this, dir, followSymlinks);
                }
            }
