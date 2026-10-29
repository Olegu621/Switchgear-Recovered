            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InterruptedIOException;
            import java.io.OutputStream;
            import java.nio.channels.FileChannel;
            import java.nio.file.CopyOption;
            import java.nio.file.DirectoryStream;
            import java.nio.file.Files;
            import java.nio.file.LinkOption;
            import java.nio.file.NoSuchFileException;
            import java.nio.file.OpenOption;
            import java.nio.file.StandardCopyOption;
            import java.nio.file.StandardOpenOption;
            import java.nio.file.attribute.FileAttribute;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.C2233tw;
            import p000.ds0;
            import p000.fm0;
            import p000.j22;
            import p000.jb1;
            import p000.z71;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J \u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010!\u001a\u00020\"H\u0016J\f\u0010#\u001a\u00020$*\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m6176d2 = {"Lokio/NioFileSystemWrappingFileSystem;", "Lokio/NioSystemFileSystem;", "nioFileSystem", "Ljava/nio/file/FileSystem;", "(Ljava/nio/file/FileSystem;)V", "appendingSink", "Lokio/Sink;", "file", "Lokio/Path;", "mustExist", HttpUrl.FRAGMENT_ENCODE_SET, "atomicMove", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.SOURCE, "target", "canonicalize", "path", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", HttpUrl.FRAGMENT_ENCODE_SET, "throwOnFailure", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "resolve", "Ljava/nio/file/Path;", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 107 */   public final class NioFileSystemWrappingFileSystem extends NioSystemFileSystem {
                private final java.nio.file.FileSystem nioFileSystem;

                public NioFileSystemWrappingFileSystem(java.nio.file.FileSystem fileSystem) {
/* 1 */             fileSystem.getClass();
/* 7 */             this.nioFileSystem = fileSystem;
                }

                private final List<Path> list(Path dir, boolean throwOnFailure) throws IOException {
/* 1 */             java.nio.file.Path pathResolve = resolve(dir);
                    try {
/* 8 */                 pathResolve.getClass();
/* 11 */                DirectoryStream<java.nio.file.Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(pathResolve, "*");
                        try {
/* 15 */                    directoryStreamNewDirectoryStream.getClass();
/* 18 */                    List listM6192K = CollectionsKt.m6192K(directoryStreamNewDirectoryStream);
/* 22 */                    jb1.m5754n(directoryStreamNewDirectoryStream, null);
/* 27 */                    ArrayList arrayList = new ArrayList();
/* 30 */                    Iterator it = listM6192K.iterator();
/* 38 */                    while (it.hasNext()) {
/* 54 */                        arrayList.add(dir.resolve(((java.nio.file.Path) it.next()).toString()));
                            }
/* 58 */                    C2233tw.m8919j(arrayList);
/* 61 */                    return arrayList;
                        } catch (Throwable th) {
                            try {
/* 63 */                        throw th;
                            } catch (Throwable th2) {
/* 65 */                        jb1.m5754n(directoryStreamNewDirectoryStream, th);
/* 68 */                        throw th2;
                            }
                        }
                    } catch (Exception unused) {
/* 69 */                if (!throwOnFailure) {
/* 5 */                     return null;
                        }
/* 84 */                if (!Files.exists(pathResolve, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
/* 107 */                   throw new FileNotFoundException(fm0.m3792r(dir, "no such file: "));
                        }
/* 92 */                ds0.m3195l(fm0.m3792r(dir, "failed to list "));
/* 5 */                 return null;
                    }
                }

                private final java.nio.file.Path resolve(Path path) {
/* 1 */             java.nio.file.Path path2 = this.nioFileSystem.getPath(path.toString(), new String[0]);
/* 14 */            path2.getClass();
/* 17 */            return path2;
                }

                @Override // okio.JvmSystemFileSystem, okio.FileSystem
                public Sink appendingSink(Path file, boolean mustExist) throws IOException {
/* 1 */             file.getClass();
/* 9 */             z71 z71Var = new z71(0, 1, null);
/* 14 */            z71Var.add(StandardOpenOption.APPEND);
/* 17 */            if (!mustExist) {
/* 21 */                z71Var.add(StandardOpenOption.CREATE);
                    }
/* 24 */            z71 z71VarM6209a = C1839a.m6209a(z71Var);
/* 28 */            java.nio.file.Path pathResolve = resolve(file);
/* 38 */            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) z71VarM6209a.toArray(new StandardOpenOption[0]);
/* 45 */            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
/* 54 */            OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathResolve, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
/* 58 */            outputStreamNewOutputStream.getClass();
/* 61 */            return Okio.sink(outputStreamNewOutputStream);
                }

                @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
                public void atomicMove(Path source, Path target) throws IOException {
/* 1 */             source.getClass();
/* 4 */             target.getClass();
                    try {
/* 38 */                Files.move(resolve(source), resolve(target), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)).getClass();
                    } catch (UnsupportedOperationException unused) {
/* 44 */                ds0.m3195l("atomic move not supported");
                    } catch (NoSuchFileException e) {
/* 58 */                throw new FileNotFoundException(e.getMessage());
                    }
                }

                @Override // okio.JvmSystemFileSystem, okio.FileSystem
                public Path canonicalize(Path path) throws IOException {
/* 1 */             path.getClass();
                    try {
/* 4 */                 Path.Companion companion = Path.INSTANCE;
/* 13 */                java.nio.file.Path realPath = resolve(path).toRealPath(new LinkOption[0]);
/* 17 */                realPath.getClass();
/* 22 */                return Path.Companion.get$default(companion, realPath, false, 1, (Object) null);
                    } catch (NoSuchFileException unused) {
/* 38 */                throw new FileNotFoundException(fm0.m3792r(path, "no such file: "));
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0012  */
                @Override // okio.JvmSystemFileSystem, okio.FileSystem
                public void createDirectory(Path dir, boolean mustCreate) throws IOException {
                    boolean z;
/* 1 */             dir.getClass();
/* 4 */             FileMetadata fileMetadataMetadataOrNull = metadataOrNull(dir);
/* 9 */             if (fileMetadataMetadataOrNull != null) {
/* 16 */                z = fileMetadataMetadataOrNull.getIsDirectory();
                    }
/* 20 */            if (z && mustCreate) {
/* 27 */                ds0.m3191h(dir, " already exist.");
/* 30 */                return;
                    }
                    try {
/* 47 */                Files.createDirectory(resolve(dir), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)).getClass();
                    } catch (IOException e) {
/* 52 */                if (!z) {
/* 66 */                    throw new IOException(fm0.m3792r(dir, "failed to create directory: "), e);
                        }
                    }
                }

                @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
                public void createSymlink(Path source, Path target) {
/* 1 */             source.getClass();
/* 4 */             target.getClass();
/* 28 */            Files.createSymbolicLink(resolve(source), resolve(target), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)).getClass();
                }

                @Override // okio.JvmSystemFileSystem, okio.FileSystem
                public void delete(Path path, boolean mustExist) throws IOException {
/* 1 */             path.getClass();
/* 8 */             if (Thread.interrupted()) {
/* 66 */                throw new InterruptedIOException("interrupted");
                    }
/* 10 */            java.nio.file.Path pathResolve = resolve(path);
                    try {
/* 14 */                Files.delete(pathResolve);
                    } catch (NoSuchFileException unused) {
/* 44 */                if (mustExist) {
/* 58 */                    throw new FileNotFoundException(fm0.m3792r(path, "no such file: "));
                        }
                    } catch (IOException unused2) {
/* 31 */                if (Files.exists(pathResolve, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
/* 40 */                    ds0.m3195l(fm0.m3792r(path, "failed to delete "));
                        }
                    }
                }

                @Override // okio.JvmSystemFileSystem, okio.FileSystem
                public List<Path> listOrNull(Path dir) {
/* 1 */             dir.getClass();
/* 5 */             return list(dir, false);
                }

                @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
                public FileMetadata metadataOrNull(Path path) {
/* 1 */             path.getClass();
/* 8 */             return metadataOrNull(resolve(path));
                }

                @Override // okio.JvmSystemFileSystem, okio.FileSystem
                public FileHandle openReadOnly(Path file) throws IOException {
/* 1 */             file.getClass();
                    try {
/* 16 */                FileChannel fileChannelOpen = FileChannel.open(resolve(file), StandardOpenOption.READ);
/* 22 */                fileChannelOpen.getClass();
/* 25 */                return new NioFileSystemFileHandle(false, fileChannelOpen);
                    } catch (NoSuchFileException unused) {
/* 40 */                throw new FileNotFoundException(fm0.m3792r(file, "no such file: "));
                    }
                }

                @Override // okio.JvmSystemFileSystem, okio.FileSystem
                public FileHandle openReadWrite(Path file, boolean mustCreate, boolean mustExist) throws IOException {
/* 1 */             file.getClass();
/* 4 */             DefaultConstructorMarker defaultConstructorMarker = null;
/* 5 */             if (mustCreate && mustExist) {
/* 12 */                C1951n4.m6859j("Cannot require mustCreate and mustExist at the same time.");
/* 4 */                 return null;
                    }
/* 20 */            z71 z71Var = new z71(0, 1, defaultConstructorMarker);
/* 25 */            z71Var.add(StandardOpenOption.READ);
/* 30 */            z71Var.add(StandardOpenOption.WRITE);
/* 33 */            if (mustCreate) {
/* 37 */                z71Var.add(StandardOpenOption.CREATE_NEW);
                    } else if (!mustExist) {
/* 45 */                z71Var.add(StandardOpenOption.CREATE);
                    }
/* 48 */            z71 z71VarM6209a = C1839a.m6209a(z71Var);
                    try {
/* 52 */                java.nio.file.Path pathResolve = resolve(file);
/* 62 */                StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) z71VarM6209a.toArray(new StandardOpenOption[0]);
/* 71 */                FileChannel fileChannelOpen = FileChannel.open(pathResolve, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
/* 77 */                fileChannelOpen.getClass();
/* 80 */                return new NioFileSystemFileHandle(true, fileChannelOpen);
                    } catch (NoSuchFileException unused) {
/* 95 */                throw new FileNotFoundException(fm0.m3792r(file, "no such file: "));
                    }
                }

                @Override // okio.JvmSystemFileSystem, okio.FileSystem
                public Sink sink(Path file, boolean mustCreate) throws IOException {
/* 1 */             file.getClass();
/* 9 */             z71 z71Var = new z71(0, 1, null);
/* 12 */            if (mustCreate) {
/* 16 */                z71Var.add(StandardOpenOption.CREATE_NEW);
                    }
/* 19 */            z71 z71VarM6209a = C1839a.m6209a(z71Var);
                    try {
/* 23 */                java.nio.file.Path pathResolve = resolve(file);
/* 33 */                StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) z71VarM6209a.toArray(new StandardOpenOption[0]);
/* 40 */                OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
/* 49 */                OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathResolve, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
/* 53 */                outputStreamNewOutputStream.getClass();
/* 56 */                return Okio.sink(outputStreamNewOutputStream);
                    } catch (NoSuchFileException unused) {
/* 72 */                throw new FileNotFoundException(fm0.m3792r(file, "no such file: "));
                    }
                }

                @Override // okio.JvmSystemFileSystem, okio.FileSystem
                public Source source(Path file) throws IOException {
/* 1 */             file.getClass();
                    try {
/* 17 */                InputStream inputStreamNewInputStream = Files.newInputStream(resolve(file), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
/* 21 */                inputStreamNewInputStream.getClass();
/* 24 */                return Okio.source(inputStreamNewInputStream);
                    } catch (NoSuchFileException unused) {
/* 40 */                throw new FileNotFoundException(fm0.m3792r(file, "no such file: "));
                    }
                }

                @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem
                public String toString() {
/* 11 */            String strM3242b = j22.m5667a(this.nioFileSystem.getClass()).m3242b();
/* 15 */            strM3242b.getClass();
/* 18 */            return strM3242b;
                }

                @Override // okio.JvmSystemFileSystem, okio.FileSystem
/* 108 */       public List<Path> list(Path dir) throws IOException {
                    dir.getClass();
/* 109 */           List<Path> list = list(dir, true);
                    list.getClass();
                    return list;
                }
            }
