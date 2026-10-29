            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import kotlin.sequences.Sequence;
            import okhttp3.HttpUrl;
            import p000.C2233tw;
            import p000.b51;
            import p000.j22;
            import p000.li0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0010\u001a\u00020\bH\u0016J \u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010&\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010(\u001a\u00020 H\u0016R\u0013\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0004¨\u0006)"}, m6176d2 = {"Lokio/ForwardingFileSystem;", "Lokio/FileSystem;", "delegate", "(Lokio/FileSystem;)V", "()Lokio/FileSystem;", "appendingSink", "Lokio/Sink;", "file", "Lokio/Path;", "mustExist", HttpUrl.FRAGMENT_ENCODE_SET, "atomicMove", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.SOURCE, "target", "canonicalize", "path", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", HttpUrl.FRAGMENT_ENCODE_SET, "listOrNull", "listRecursively", "Lkotlin/sequences/Sequence;", "followSymlinks", "metadataOrNull", "Lokio/FileMetadata;", "onPathParameter", "functionName", HttpUrl.FRAGMENT_ENCODE_SET, "parameterName", "onPathResult", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toString", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public abstract class ForwardingFileSystem extends FileSystem {
                private final FileSystem delegate;

                /* JADX INFO: renamed from: okio.ForwardingFileSystem$listRecursively$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m6176d2 = {"<anonymous>", "Lokio/Path;", "it", "invoke"}, m6177k = 3, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class C20251 extends b51 implements Function1<Path, Path> {
                    public C20251() {
/* 4 */                 super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Path invoke(Path path) {
/* 1 */                 path.getClass();
/* 8 */                 return ForwardingFileSystem.this.onPathResult(path, "listRecursively");
                    }
                }

                public ForwardingFileSystem(FileSystem fileSystem) {
/* 1 */             fileSystem.getClass();
/* 7 */             this.delegate = fileSystem;
                }

                @Override // okio.FileSystem
                public Sink appendingSink(Path file, boolean mustExist) throws IOException {
/* 1 */             file.getClass();
/* 14 */            return this.delegate.appendingSink(onPathParameter(file, "appendingSink", "file"), mustExist);
                }

                @Override // okio.FileSystem
                public void atomicMove(Path source, Path target) throws IOException {
/* 1 */             source.getClass();
/* 4 */             target.getClass();
/* 23 */            this.delegate.atomicMove(onPathParameter(source, "atomicMove", FirebaseAnalytics.Param.SOURCE), onPathParameter(target, "atomicMove", "target"));
                }

                @Override // okio.FileSystem
                public Path canonicalize(Path path) throws IOException {
/* 1 */             path.getClass();
/* 18 */            return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
                }

                @Override // okio.FileSystem
                public void createDirectory(Path dir, boolean mustCreate) throws IOException {
/* 1 */             dir.getClass();
/* 14 */            this.delegate.createDirectory(onPathParameter(dir, "createDirectory", "dir"), mustCreate);
                }

                @Override // okio.FileSystem
                public void createSymlink(Path source, Path target) throws IOException {
/* 1 */             source.getClass();
/* 4 */             target.getClass();
/* 23 */            this.delegate.createSymlink(onPathParameter(source, "createSymlink", FirebaseAnalytics.Param.SOURCE), onPathParameter(target, "createSymlink", "target"));
                }

                /* JADX INFO: renamed from: delegate, reason: from getter */
                public final FileSystem getDelegate() {
/* 1 */             return this.delegate;
                }

                @Override // okio.FileSystem
                public void delete(Path path, boolean mustExist) throws IOException {
/* 1 */             path.getClass();
/* 14 */            this.delegate.delete(onPathParameter(path, "delete", "path"), mustExist);
                }

                @Override // okio.FileSystem
                public List<Path> list(Path dir) throws IOException {
/* 1 */             dir.getClass();
/* 14 */            List<Path> list = this.delegate.list(onPathParameter(dir, "list", "dir"));
/* 20 */            ArrayList arrayList = new ArrayList();
/* 23 */            Iterator<T> it = list.iterator();
/* 31 */            while (it.hasNext()) {
/* 43 */                arrayList.add(onPathResult((Path) it.next(), "list"));
                    }
/* 47 */            C2233tw.m8919j(arrayList);
/* 50 */            return arrayList;
                }

                @Override // okio.FileSystem
                public List<Path> listOrNull(Path dir) {
/* 1 */             dir.getClass();
/* 14 */            List<Path> listListOrNull = this.delegate.listOrNull(onPathParameter(dir, "listOrNull", "dir"));
/* 18 */            if (listListOrNull == null) {
/* 20 */                return null;
                    }
/* 24 */            ArrayList arrayList = new ArrayList();
/* 27 */            Iterator<T> it = listListOrNull.iterator();
/* 35 */            while (it.hasNext()) {
/* 47 */                arrayList.add(onPathResult((Path) it.next(), "listOrNull"));
                    }
/* 51 */            C2233tw.m8919j(arrayList);
/* 54 */            return arrayList;
                }

                @Override // okio.FileSystem
                public Sequence<Path> listRecursively(Path dir, boolean followSymlinks) {
/* 1 */             dir.getClass();
/* 14 */            Sequence<Path> sequenceListRecursively = this.delegate.listRecursively(onPathParameter(dir, "listRecursively", "dir"), followSymlinks);
/* 20 */            C20251 c20251 = new C20251();
/* 23 */            sequenceListRecursively.getClass();
/* 28 */            return new li0(sequenceListRecursively, c20251);
                }

                @Override // okio.FileSystem
                public FileMetadata metadataOrNull(Path path) throws IOException {
/* 1 */             path.getClass();
/* 14 */            FileMetadata fileMetadataMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
/* 18 */            if (fileMetadataMetadataOrNull == null) {
/* 20 */                return null;
                    }
                    return fileMetadataMetadataOrNull.getSymlinkTarget() == null ? fileMetadataMetadataOrNull : FileMetadata.copy$default(fileMetadataMetadataOrNull, false, false, onPathResult(fileMetadataMetadataOrNull.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, 251, null);
                }

                public Path onPathParameter(Path path, String functionName, String parameterName) {
/* 1 */             path.getClass();
/* 4 */             functionName.getClass();
/* 7 */             parameterName.getClass();
/* 10 */            return path;
                }

                public Path onPathResult(Path path, String functionName) {
/* 1 */             path.getClass();
/* 4 */             functionName.getClass();
/* 7 */             return path;
                }

                @Override // okio.FileSystem
                public FileHandle openReadOnly(Path file) throws IOException {
/* 1 */             file.getClass();
/* 14 */            return this.delegate.openReadOnly(onPathParameter(file, "openReadOnly", "file"));
                }

                @Override // okio.FileSystem
                public FileHandle openReadWrite(Path file, boolean mustCreate, boolean mustExist) throws IOException {
/* 1 */             file.getClass();
/* 14 */            return this.delegate.openReadWrite(onPathParameter(file, "openReadWrite", "file"), mustCreate, mustExist);
                }

                @Override // okio.FileSystem
                public Sink sink(Path file, boolean mustCreate) throws IOException {
/* 1 */             file.getClass();
/* 14 */            return this.delegate.sink(onPathParameter(file, "sink", "file"), mustCreate);
                }

                @Override // okio.FileSystem
                public Source source(Path file) throws IOException {
/* 1 */             file.getClass();
/* 14 */            return this.delegate.source(onPathParameter(file, FirebaseAnalytics.Param.SOURCE, "file"));
                }

                public String toString() {
/* 36 */            return j22.m5667a(getClass()).m3242b() + '(' + this.delegate + ')';
                }
            }
