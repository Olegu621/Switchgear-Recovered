            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.io.RandomAccessFile;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.C2233tw;
            import p000.ds0;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J \u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\f\u0010!\u001a\u00020\n*\u00020\u0006H\u0002J\f\u0010\"\u001a\u00020\n*\u00020\u0006H\u0002¨\u0006#"}, m6176d2 = {"Lokio/JvmSystemFileSystem;", "Lokio/FileSystem;", "()V", "appendingSink", "Lokio/Sink;", "file", "Lokio/Path;", "mustExist", HttpUrl.FRAGMENT_ENCODE_SET, "atomicMove", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.SOURCE, "target", "canonicalize", "path", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", HttpUrl.FRAGMENT_ENCODE_SET, "throwOnFailure", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "requireCreate", "requireExist", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 69 */    public class JvmSystemFileSystem extends FileSystem {
                private final List<Path> list(Path dir, boolean throwOnFailure) throws IOException {
/* 1 */             File file = dir.toFile();
/* 5 */             String[] list = file.list();
/* 9 */             if (list == null) {
/* 12 */                if (!throwOnFailure) {
/* 11 */                    return null;
                        }
/* 18 */                if (!file.exists()) {
/* 41 */                    throw new FileNotFoundException(fm0.m3792r(dir, "no such file: "));
                        }
/* 26 */                ds0.m3195l(fm0.m3792r(dir, "failed to list "));
/* 11 */                return null;
                    }
/* 45 */            ArrayList arrayList = new ArrayList();
/* 50 */            for (String str : list) {
/* 54 */                str.getClass();
/* 61 */                arrayList.add(dir.resolve(str));
                    }
/* 67 */            C2233tw.m8919j(arrayList);
/* 70 */            return arrayList;
                }

                private final void requireCreate(Path path) throws IOException {
/* 5 */             if (exists(path)) {
/* 10 */                ds0.m3191h(path, " already exists.");
                    }
                }

                private final void requireExist(Path path) throws IOException {
/* 5 */             if (exists(path)) {
/* 7 */                 return;
                    }
/* 10 */            ds0.m3191h(path, " doesn't exist.");
                }

                @Override // okio.FileSystem
                public Sink appendingSink(Path file, boolean mustExist) throws IOException {
/* 1 */             file.getClass();
/* 4 */             if (mustExist) {
/* 6 */                 requireExist(file);
                    }
/* 14 */            return Okio.sink(file.toFile(), true);
                }

                @Override // okio.FileSystem
                public void atomicMove(Path source, Path target) throws IOException {
/* 1 */             source.getClass();
/* 4 */             target.getClass();
/* 19 */            if (source.toFile().renameTo(target.toFile())) {
/* 21 */                return;
                    }
/* 49 */            throw new IOException("failed to move " + source + " to " + target);
                }

                @Override // okio.FileSystem
                public Path canonicalize(Path path) throws IOException {
/* 1 */             path.getClass();
/* 8 */             File canonicalFile = path.toFile().getCanonicalFile();
/* 16 */            if (canonicalFile.exists()) {
/* 23 */                return Path.Companion.get$default(Path.INSTANCE, canonicalFile, false, 1, (Object) null);
                    }
/* 35 */            throw new FileNotFoundException("no such file");
                }

                @Override // okio.FileSystem
                public void createDirectory(Path dir, boolean mustCreate) throws IOException {
/* 1 */             dir.getClass();
/* 12 */            if (dir.toFile().mkdir()) {
/* 45 */                return;
                    }
/* 14 */            FileMetadata fileMetadataMetadataOrNull = metadataOrNull(dir);
/* 18 */            if (fileMetadataMetadataOrNull == null || !fileMetadataMetadataOrNull.getIsDirectory()) {
/* 42 */                ds0.m3195l(fm0.m3792r(dir, "failed to create directory: "));
                    } else if (mustCreate) {
/* 32 */                ds0.m3191h(dir, " already exist.");
                    }
                }

                @Override // okio.FileSystem
                public void createSymlink(Path source, Path target) throws IOException {
/* 1 */             source.getClass();
/* 4 */             target.getClass();
/* 14 */            throw new IOException("unsupported");
                }

                @Override // okio.FileSystem
                public void delete(Path path, boolean mustExist) throws IOException {
/* 1 */             path.getClass();
/* 8 */             if (Thread.interrupted()) {
/* 58 */                throw new InterruptedIOException("interrupted");
                    }
/* 10 */            File file = path.toFile();
/* 18 */            if (file.delete()) {
/* 50 */                return;
                    }
/* 24 */            if (file.exists()) {
/* 47 */                ds0.m3195l(fm0.m3792r(path, "failed to delete "));
                    } else if (mustExist) {
/* 40 */                throw new FileNotFoundException(fm0.m3792r(path, "no such file: "));
                    }
                }

                @Override // okio.FileSystem
                public List<Path> listOrNull(Path dir) {
/* 1 */             dir.getClass();
/* 5 */             return list(dir, false);
                }

                @Override // okio.FileSystem
                public FileMetadata metadataOrNull(Path path) {
/* 1 */             path.getClass();
/* 4 */             File file = path.toFile();
/* 8 */             boolean zIsFile = file.isFile();
/* 12 */            boolean zIsDirectory = file.isDirectory();
/* 16 */            long jLastModified = file.lastModified();
/* 20 */            long length = file.length();
/* 24 */            if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
/* 64 */                return new FileMetadata(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
                    }
/* 44 */            return null;
                }

                @Override // okio.FileSystem
                public FileHandle openReadOnly(Path file) {
/* 1 */             file.getClass();
/* 18 */            return new JvmFileHandle(false, new RandomAccessFile(file.toFile(), "r"));
                }

                @Override // okio.FileSystem
                public FileHandle openReadWrite(Path file, boolean mustCreate, boolean mustExist) throws IOException {
/* 1 */             file.getClass();
/* 4 */             if (mustCreate && mustExist) {
/* 11 */                C1951n4.m6859j("Cannot require mustCreate and mustExist at the same time.");
/* 14 */                return null;
                    }
/* 16 */            if (mustCreate) {
/* 18 */                requireCreate(file);
                    }
/* 21 */            if (mustExist) {
/* 23 */                requireExist(file);
                    }
/* 40 */            return new JvmFileHandle(true, new RandomAccessFile(file.toFile(), "rw"));
                }

                @Override // okio.FileSystem
                public Sink sink(Path file, boolean mustCreate) throws IOException {
/* 1 */             file.getClass();
/* 4 */             if (mustCreate) {
/* 6 */                 requireCreate(file);
                    }
/* 1 */             return Okio__JvmOkioKt.sink$default(file.toFile(), false, 1, null);
                }

                @Override // okio.FileSystem
                public Source source(Path file) {
/* 1 */             file.getClass();
/* 8 */             return Okio.source(file.toFile());
                }

                public String toString() {
/* 1 */             return "JvmSystemFileSystem";
                }

                @Override // okio.FileSystem
/* 70 */        public List<Path> list(Path dir) throws IOException {
                    dir.getClass();
/* 71 */            List<Path> list = list(dir, true);
                    list.getClass();
                    return list;
                }
            }
