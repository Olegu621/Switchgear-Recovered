            package okio.internal;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.net.URI;
            import java.net.URL;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Enumeration;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import okio.FileHandle;
            import okio.FileMetadata;
            import okio.FileSystem;
            import okio.Path;
            import okio.Sink;
            import okio.Source;
            import p000.C2122qw;
            import p000.C2270uw;
            import p000.fm0;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 52\u00020\u0001:\u00015B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010%J\u001f\u0010(\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020'2\u0006\u0010!\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020'2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010)J\u001f\u0010.\u001a\u00020'2\u0006\u0010!\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010,R-\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0/0\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00066"}, m6176d2 = {"Lokio/internal/ResourceFileSystem;", "Lokio/FileSystem;", "Ljava/lang/ClassLoader;", "classLoader", HttpUrl.FRAGMENT_ENCODE_SET, "indexEagerly", "<init>", "(Ljava/lang/ClassLoader;Z)V", "Lokio/Path;", "path", "canonicalizeInternal", "(Lokio/Path;)Lokio/Path;", HttpUrl.FRAGMENT_ENCODE_SET, "toRelativePath", "(Lokio/Path;)Ljava/lang/String;", "canonicalize", "dir", HttpUrl.FRAGMENT_ENCODE_SET, "list", "(Lokio/Path;)Ljava/util/List;", "listOrNull", "file", "Lokio/FileHandle;", "openReadOnly", "(Lokio/Path;)Lokio/FileHandle;", "mustCreate", "mustExist", "openReadWrite", "(Lokio/Path;ZZ)Lokio/FileHandle;", "Lokio/FileMetadata;", "metadataOrNull", "(Lokio/Path;)Lokio/FileMetadata;", "Lokio/Source;", FirebaseAnalytics.Param.SOURCE, "(Lokio/Path;)Lokio/Source;", "Lokio/Sink;", "sink", "(Lokio/Path;Z)Lokio/Sink;", "appendingSink", HttpUrl.FRAGMENT_ENCODE_SET, "createDirectory", "(Lokio/Path;Z)V", "target", "atomicMove", "(Lokio/Path;Lokio/Path;)V", "delete", "createSymlink", "Lkotlin/Pair;", "roots$delegate", "Lp51;", "getRoots", "()Ljava/util/List;", "roots", "Companion", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 2 */     public final class ResourceFileSystem extends FileSystem {
                private static final Companion Companion = new Companion(null);

                @Deprecated
                private static final Path ROOT = Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null);

                /* JADX INFO: renamed from: roots$delegate, reason: from kotlin metadata */
                private final p51 roots;

                public ResourceFileSystem(ClassLoader classLoader, boolean z) {
/* 1 */             classLoader.getClass();
/* 16 */            this.roots = r51.m8065b(new ResourceFileSystem$roots$2(classLoader));
/* 18 */            if (z) {
/* 24 */                getRoots().size();
                    }
                }

                private final Path canonicalizeInternal(Path path) {
/* 4 */             return ROOT.resolve(path, true);
                }

                private final List<Pair<FileSystem, Path>> getRoots() {
/* 7 */             return (List) this.roots.getValue();
                }

                private final String toRelativePath(Path path) {
/* 11 */            return canonicalizeInternal(path).relativeTo(ROOT).toString();
                }

                @Override // okio.FileSystem
                public Sink appendingSink(Path file, boolean mustExist) throws IOException {
/* 1 */             file.getClass();
/* 26 */            throw new IOException(this + " is read-only");
                }

                @Override // okio.FileSystem
                public void atomicMove(Path source, Path target) throws IOException {
/* 1 */             source.getClass();
/* 4 */             target.getClass();
/* 29 */            throw new IOException(this + " is read-only");
                }

                @Override // okio.FileSystem
                public Path canonicalize(Path path) {
/* 1 */             path.getClass();
/* 4 */             return canonicalizeInternal(path);
                }

                @Override // okio.FileSystem
                public void createDirectory(Path dir, boolean mustCreate) throws IOException {
/* 1 */             dir.getClass();
/* 26 */            throw new IOException(this + " is read-only");
                }

                @Override // okio.FileSystem
                public void createSymlink(Path source, Path target) throws IOException {
/* 1 */             source.getClass();
/* 4 */             target.getClass();
/* 29 */            throw new IOException(this + " is read-only");
                }

                @Override // okio.FileSystem
                public void delete(Path path, boolean mustExist) throws IOException {
/* 1 */             path.getClass();
/* 26 */            throw new IOException(this + " is read-only");
                }

                @Override // okio.FileSystem
                public List<Path> list(Path dir) throws FileNotFoundException {
/* 1 */             dir.getClass();
/* 4 */             String relativePath = toRelativePath(dir);
/* 10 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 21 */            boolean z = false;
/* 26 */            for (Pair<FileSystem, Path> pair : getRoots()) {
/* 36 */                FileSystem fileSystem = (FileSystem) pair.f12908a;
/* 40 */                Path path = (Path) pair.f12909b;
                        try {
/* 46 */                    List<Path> list = fileSystem.list(path.resolve(relativePath));
/* 52 */                    ArrayList arrayList = new ArrayList();
/* 63 */                    for (Object obj : list) {
/* 78 */                        if (Companion.keepPath((Path) obj)) {
/* 80 */                            arrayList.add(obj);
                                }
                            }
/* 92 */                    ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(arrayList, 10));
/* 95 */                    Iterator it = arrayList.iterator();
/* 103 */                   while (it.hasNext()) {
/* 117 */                       arrayList2.add(Companion.removeBase((Path) it.next(), path));
                            }
/* 121 */                   C2270uw.m9140k(linkedHashSet, arrayList2);
/* 124 */                   z = true;
                        } catch (IOException unused) {
                        }
                    }
/* 126 */           if (z) {
/* 128 */               return CollectionsKt.m6192K(linkedHashSet);
                    }
/* 144 */           throw new FileNotFoundException(fm0.m3792r(dir, "file not found: "));
                }

                @Override // okio.FileSystem
                public List<Path> listOrNull(Path dir) {
/* 1 */             dir.getClass();
/* 4 */             String relativePath = toRelativePath(dir);
/* 10 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 17 */            Iterator<Pair<FileSystem, Path>> it = getRoots().iterator();
/* 21 */            boolean z = false;
                    while (true) {
/* 26 */                ArrayList arrayList = null;
/* 27 */                if (!it.hasNext()) {
                            break;
                        }
/* 29 */                Pair<FileSystem, Path> next = it.next();
/* 37 */                FileSystem fileSystem = (FileSystem) next.f12908a;
/* 41 */                Path path = (Path) next.f12909b;
/* 47 */                List<Path> listListOrNull = fileSystem.listOrNull(path.resolve(relativePath));
/* 51 */                if (listListOrNull != null) {
/* 55 */                    ArrayList arrayList2 = new ArrayList();
/* 66 */                    for (Object obj : listListOrNull) {
/* 81 */                        if (Companion.keepPath((Path) obj)) {
/* 83 */                            arrayList2.add(obj);
                                }
                            }
/* 95 */                    ArrayList arrayList3 = new ArrayList(C2122qw.m8020h(arrayList2, 10));
/* 98 */                    Iterator it2 = arrayList2.iterator();
/* 106 */                   while (it2.hasNext()) {
/* 120 */                       arrayList3.add(Companion.removeBase((Path) it2.next(), path));
                            }
/* 124 */                   arrayList = arrayList3;
                        }
/* 125 */               if (arrayList != null) {
/* 127 */                   C2270uw.m9140k(linkedHashSet, arrayList);
/* 130 */                   z = true;
                        }
                    }
/* 132 */           if (z) {
/* 134 */               return CollectionsKt.m6192K(linkedHashSet);
                    }
/* 26 */            return null;
                }

                @Override // okio.FileSystem
                public FileMetadata metadataOrNull(Path path) throws IOException {
/* 1 */             path.getClass();
/* 11 */            if (!Companion.keepPath(path)) {
/* 10 */                return null;
                    }
/* 14 */            String relativePath = toRelativePath(path);
/* 30 */            for (Pair<FileSystem, Path> pair : getRoots()) {
/* 50 */                FileMetadata fileMetadataMetadataOrNull = ((FileSystem) pair.f12908a).metadataOrNull(((Path) pair.f12909b).resolve(relativePath));
/* 54 */                if (fileMetadataMetadataOrNull != null) {
/* 57 */                    return fileMetadataMetadataOrNull;
                        }
                    }
/* 10 */            return null;
                }

                @Override // okio.FileSystem
                public FileHandle openReadOnly(Path file) throws FileNotFoundException {
/* 1 */             file.getClass();
/* 12 */            if (!Companion.keepPath(file)) {
/* 74 */                throw new FileNotFoundException(fm0.m3792r(file, "file not found: "));
                    }
/* 14 */            String relativePath = toRelativePath(file);
/* 22 */            Iterator<Pair<FileSystem, Path>> it = getRoots().iterator();
/* 30 */            while (it.hasNext()) {
/* 32 */                Pair<FileSystem, Path> next = it.next();
                        try {
/* 50 */                    return ((FileSystem) next.f12908a).openReadOnly(((Path) next.f12909b).resolve(relativePath));
                        } catch (FileNotFoundException unused) {
                        }
                    }
/* 64 */            throw new FileNotFoundException(fm0.m3792r(file, "file not found: "));
                }

                @Override // okio.FileSystem
                public FileHandle openReadWrite(Path file, boolean mustCreate, boolean mustExist) throws IOException {
/* 1 */             file.getClass();
/* 11 */            throw new IOException("resources are not writable");
                }

                @Override // okio.FileSystem
                public Sink sink(Path file, boolean mustCreate) throws IOException {
/* 1 */             file.getClass();
/* 26 */            throw new IOException(this + " is read-only");
                }

                @Override // okio.FileSystem
                public Source source(Path file) throws FileNotFoundException {
/* 1 */             file.getClass();
/* 12 */            if (!Companion.keepPath(file)) {
/* 74 */                throw new FileNotFoundException(fm0.m3792r(file, "file not found: "));
                    }
/* 14 */            String relativePath = toRelativePath(file);
/* 22 */            Iterator<Pair<FileSystem, Path>> it = getRoots().iterator();
/* 30 */            while (it.hasNext()) {
/* 32 */                Pair<FileSystem, Path> next = it.next();
                        try {
/* 50 */                    return ((FileSystem) next.f12908a).source(((Path) next.f12909b).resolve(relativePath));
                        } catch (FileNotFoundException unused) {
                        }
                    }
/* 64 */            throw new FileNotFoundException(fm0.m3792r(file, "file not found: "));
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u001c\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000e0\r*\u00020\u0010J\u0018\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e*\u00020\u0012J\u0018\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e*\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, m6176d2 = {"Lokio/internal/ResourceFileSystem$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "ROOT", "Lokio/Path;", "getROOT", "()Lokio/Path;", "keepPath", HttpUrl.FRAGMENT_ENCODE_SET, "path", "removeBase", "base", "toClasspathRoots", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/Pair;", "Lokio/FileSystem;", "Ljava/lang/ClassLoader;", "toFileRoot", "Ljava/net/URL;", "toJarRoot", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public final boolean keepPath(Path path) {
/* 12 */                return !C1852e.m6257g(path.name(), ".class", true);
                    }

                    public final Path getROOT() {
/* 1 */                 return ResourceFileSystem.ROOT;
                    }

                    public final Path removeBase(Path path, Path path2) {
/* 1 */                 path.getClass();
/* 4 */                 path2.getClass();
/* 7 */                 String string = path2.toString();
/* 11 */                Path root = getROOT();
/* 27 */                String strReplace = StringsKt.m6233I(path.toString(), string).replace('\\', '/');
/* 31 */                strReplace.getClass();
/* 34 */                return root.resolve(strReplace);
                    }

                    public final List<Pair<FileSystem, Path>> toClasspathRoots(ClassLoader classLoader) throws IOException {
/* 1 */                 classLoader.getClass();
/* 6 */                 Enumeration<URL> resources = classLoader.getResources(HttpUrl.FRAGMENT_ENCODE_SET);
/* 10 */                resources.getClass();
/* 13 */                ArrayList<URL> list = Collections.list(resources);
/* 17 */                list.getClass();
/* 22 */                ArrayList arrayList = new ArrayList();
/* 33 */                for (URL url : list) {
/* 1 */                     Companion companion = ResourceFileSystem.Companion;
/* 45 */                    url.getClass();
/* 48 */                    Pair<FileSystem, Path> fileRoot = companion.toFileRoot(url);
/* 52 */                    if (fileRoot != null) {
/* 54 */                        arrayList.add(fileRoot);
                            }
                        }
/* 60 */                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
/* 64 */                resources2.getClass();
/* 67 */                ArrayList<URL> list2 = Collections.list(resources2);
/* 71 */                list2.getClass();
/* 76 */                ArrayList arrayList2 = new ArrayList();
/* 87 */                for (URL url2 : list2) {
/* 1 */                     Companion companion2 = ResourceFileSystem.Companion;
/* 99 */                    url2.getClass();
/* 102 */                   Pair<FileSystem, Path> jarRoot = companion2.toJarRoot(url2);
/* 106 */                   if (jarRoot != null) {
/* 108 */                       arrayList2.add(jarRoot);
                            }
                        }
/* 112 */               return CollectionsKt.m6183B(arrayList, arrayList2);
                    }

                    public final Pair<FileSystem, Path> toFileRoot(URL url) {
/* 1 */                 url.getClass();
/* 15 */                if (Intrinsics.m6216a(url.getProtocol(), "file")) {
/* 39 */                    return new Pair<>(FileSystem.SYSTEM, Path.Companion.get$default(Path.INSTANCE, new File(url.toURI()), false, 1, (Object) null));
                        }
/* 14 */                return null;
                    }

                    public final Pair<FileSystem, Path> toJarRoot(URL url) {
                        int iM6229E;
/* 1 */                 url.getClass();
/* 4 */                 String string = url.toString();
/* 8 */                 string.getClass();
/* 19 */                if (C1852e.m6263m(string, "jar:file:", false) && (iM6229E = StringsKt.m6229E(6, string, "!")) != -1) {
/* 68 */                    return new Pair<>(ZipFilesKt.openZip(Path.Companion.get$default(Path.INSTANCE, new File(URI.create(string.substring(4, iM6229E))), false, 1, (Object) null), FileSystem.SYSTEM, ResourceFileSystem$Companion$toJarRoot$zip$1.INSTANCE), getROOT());
                        }
/* 18 */                return null;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
