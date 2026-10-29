            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.util.List;
            import java.util.Map;
            import java.util.zip.Inflater;
            import kotlin.Metadata;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import okio.internal.FixedLengthSource;
            import okio.internal.ZipEntry;
            import okio.internal.ZipFilesKt;
            import p000.ds0;
            import p000.fm0;
            import p000.jf0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B5\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J \u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u0003H\u0016J \u0010$\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020&2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m6176d2 = {"Lokio/ZipFileSystem;", "Lokio/FileSystem;", "zipPath", "Lokio/Path;", "fileSystem", "entries", HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/internal/ZipEntry;", "comment", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokio/Path;Lokio/FileSystem;Ljava/util/Map;Ljava/lang/String;)V", "appendingSink", "Lokio/Sink;", "file", "mustExist", HttpUrl.FRAGMENT_ENCODE_SET, "atomicMove", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.SOURCE, "target", "canonicalize", "path", "canonicalizeInternal", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", HttpUrl.FRAGMENT_ENCODE_SET, "throwOnFailure", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "Companion", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 2 */     public final class ZipFileSystem extends FileSystem {
                private static final Companion Companion = new Companion(null);

                @Deprecated
                private static final Path ROOT = Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null);
                private final String comment;
                private final Map<Path, ZipEntry> entries;
                private final FileSystem fileSystem;
                private final Path zipPath;

                public ZipFileSystem(Path path, FileSystem fileSystem, Map<Path, ZipEntry> map, String str) {
/* 1 */             path.getClass();
/* 4 */             fileSystem.getClass();
/* 7 */             map.getClass();
/* 13 */            this.zipPath = path;
/* 15 */            this.fileSystem = fileSystem;
/* 17 */            this.entries = map;
/* 19 */            this.comment = str;
                }

                private final Path canonicalizeInternal(Path path) {
/* 4 */             return ROOT.resolve(path, true);
                }

                private final List<Path> list(Path dir, boolean throwOnFailure) throws IOException {
/* 7 */             ZipEntry zipEntry = this.entries.get(canonicalizeInternal(dir));
/* 13 */            if (zipEntry != null) {
/* 33 */                return CollectionsKt.m6192K(zipEntry.getChildren());
                    }
/* 16 */            if (!throwOnFailure) {
/* 15 */                return null;
                    }
/* 25 */            ds0.m3195l(fm0.m3792r(dir, "not a directory: "));
/* 15 */            return null;
                }

                @Override // okio.FileSystem
                public Sink appendingSink(Path file, boolean mustExist) throws IOException {
/* 1 */             file.getClass();
/* 11 */            throw new IOException("zip file systems are read-only");
                }

                @Override // okio.FileSystem
                public void atomicMove(Path source, Path target) throws IOException {
/* 1 */             source.getClass();
/* 4 */             target.getClass();
/* 14 */            throw new IOException("zip file systems are read-only");
                }

                @Override // okio.FileSystem
                public Path canonicalize(Path path) throws FileNotFoundException {
/* 1 */             path.getClass();
/* 4 */             Path pathCanonicalizeInternal = canonicalizeInternal(path);
/* 14 */            if (this.entries.containsKey(pathCanonicalizeInternal)) {
/* 16 */                return pathCanonicalizeInternal;
                    }
/* 26 */            throw new FileNotFoundException(String.valueOf(path));
                }

                @Override // okio.FileSystem
                public void createDirectory(Path dir, boolean mustCreate) throws IOException {
/* 1 */             dir.getClass();
/* 11 */            throw new IOException("zip file systems are read-only");
                }

                @Override // okio.FileSystem
                public void createSymlink(Path source, Path target) throws IOException {
/* 1 */             source.getClass();
/* 4 */             target.getClass();
/* 14 */            throw new IOException("zip file systems are read-only");
                }

                @Override // okio.FileSystem
                public void delete(Path path, boolean mustExist) throws IOException {
/* 1 */             path.getClass();
/* 11 */            throw new IOException("zip file systems are read-only");
                }

                @Override // okio.FileSystem
                public List<Path> listOrNull(Path dir) {
/* 1 */             dir.getClass();
/* 5 */             return list(dir, false);
                }

                @Override // okio.FileSystem
                public FileMetadata metadataOrNull(Path path) throws Throwable {
                    BufferedSource bufferedSourceBuffer;
/* 1 */             path.getClass();
/* 10 */            ZipEntry zipEntry = this.entries.get(canonicalizeInternal(path));
/* 16 */            Throwable th = null;
/* 17 */            if (zipEntry == null) {
/* 16 */                return null;
                    }
/* 60 */            FileMetadata fileMetadata = new FileMetadata(!zipEntry.getIsDirectory(), zipEntry.getIsDirectory(), null, zipEntry.getIsDirectory() ? null : Long.valueOf(zipEntry.getSize()), null, zipEntry.getLastModifiedAtMillis(), null, null, 128, null);
/* 71 */            if (zipEntry.getOffset() == -1) {
/* 73 */                return fileMetadata;
                    }
/* 78 */            FileHandle fileHandleOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
                    try {
/* 90 */                bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(zipEntry.getOffset()));
/* 94 */                if (fileHandleOpenReadOnly != null) {
                            try {
/* 96 */                        fileHandleOpenReadOnly.close();
                            } catch (Throwable th2) {
/* 101 */                       th = th2;
                            }
                        }
                    } catch (Throwable th3) {
/* 105 */               if (fileHandleOpenReadOnly != null) {
                            try {
/* 107 */                       fileHandleOpenReadOnly.close();
                            } catch (Throwable th4) {
/* 113 */                       jf0.m5798a(th3, th4);
                            }
                        }
/* 117 */               th = th3;
/* 118 */               bufferedSourceBuffer = null;
                    }
/* 119 */           if (th != null) {
/* 129 */               throw th;
                    }
/* 121 */           bufferedSourceBuffer.getClass();
/* 124 */           return ZipFilesKt.readLocalHeader(bufferedSourceBuffer, fileMetadata);
                }

                @Override // okio.FileSystem
                public FileHandle openReadOnly(Path file) {
/* 1 */             file.getClass();
/* 11 */            throw new UnsupportedOperationException("not implemented yet!");
                }

                @Override // okio.FileSystem
                public FileHandle openReadWrite(Path file, boolean mustCreate, boolean mustExist) throws IOException {
/* 1 */             file.getClass();
/* 11 */            throw new IOException("zip entries are not writable");
                }

                @Override // okio.FileSystem
                public Sink sink(Path file, boolean mustCreate) throws IOException {
/* 1 */             file.getClass();
/* 11 */            throw new IOException("zip file systems are read-only");
                }

                @Override // okio.FileSystem
                public Source source(Path file) throws Throwable {
                    BufferedSource bufferedSourceBuffer;
/* 1 */             file.getClass();
/* 10 */            ZipEntry zipEntry = this.entries.get(canonicalizeInternal(file));
/* 16 */            if (zipEntry == null) {
/* 129 */               throw new FileNotFoundException(fm0.m3792r(file, "no such file: "));
                    }
/* 22 */            FileHandle fileHandleOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
/* 26 */            Throwable th = null;
                    try {
/* 35 */                bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(zipEntry.getOffset()));
/* 39 */                if (fileHandleOpenReadOnly != null) {
                            try {
/* 41 */                        fileHandleOpenReadOnly.close();
                            } catch (Throwable th2) {
/* 45 */                        th = th2;
                            }
                        }
                    } catch (Throwable th3) {
/* 48 */                if (fileHandleOpenReadOnly != null) {
                            try {
/* 50 */                        fileHandleOpenReadOnly.close();
                            } catch (Throwable th4) {
/* 55 */                        jf0.m5798a(th3, th4);
                            }
                        }
/* 59 */                bufferedSourceBuffer = null;
/* 60 */                th = th3;
                    }
/* 61 */            if (th != null) {
/* 117 */               throw th;
                    }
/* 63 */            bufferedSourceBuffer.getClass();
/* 66 */            ZipFilesKt.skipLocalHeader(bufferedSourceBuffer);
                    return zipEntry.getCompressionMethod() == 0 ? new FixedLengthSource(bufferedSourceBuffer, zipEntry.getSize(), true) : new FixedLengthSource(new InflaterSource(new FixedLengthSource(bufferedSourceBuffer, zipEntry.getCompressedSize(), true), new Inflater(true)), zipEntry.getSize(), false);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m6176d2 = {"Lokio/ZipFileSystem$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "ROOT", "Lokio/Path;", "getROOT", "()Lokio/Path;", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final Path getROOT() {
/* 1 */                 return ZipFileSystem.ROOT;
                    }

/* 4 */             private Companion() {
                    }
                }

                @Override // okio.FileSystem
/* 37 */        public List<Path> list(Path dir) throws IOException {
                    dir.getClass();
/* 38 */            List<Path> list = list(dir, true);
                    list.getClass();
                    return list;
                }
            }
