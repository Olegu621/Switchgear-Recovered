            package okio;

            import java.io.File;
            import java.nio.file.Paths;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.C2122qw;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0000H\u0096\u0002J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\rH\u0087\u0002¢\u0006\u0002\b\"J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b\"J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0002\b\"J\u0013\u0010#\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\u001eH\u0016J\u0006\u0010&\u001a\u00020\u0000J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\bJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\bJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020,J\b\u0010-\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001c¨\u0006/"}, m6176d2 = {"Lokio/Path;", HttpUrl.FRAGMENT_ENCODE_SET, "bytes", "Lokio/ByteString;", "(Lokio/ByteString;)V", "getBytes$okio", "()Lokio/ByteString;", "isAbsolute", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isRelative", "isRoot", "name", HttpUrl.FRAGMENT_ENCODE_SET, "()Ljava/lang/String;", "nameBytes", "parent", "()Lokio/Path;", "root", "getRoot", "segments", HttpUrl.FRAGMENT_ENCODE_SET, "getSegments", "()Ljava/util/List;", "segmentsBytes", "getSegmentsBytes", "volumeLetter", HttpUrl.FRAGMENT_ENCODE_SET, "()Ljava/lang/Character;", "compareTo", HttpUrl.FRAGMENT_ENCODE_SET, "other", "div", "child", "resolve", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "normalized", "relativeTo", "normalize", "toFile", "Ljava/io/File;", "toNioPath", "Ljava/nio/file/Path;", "toString", "Companion", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 2 */     public final class Path implements Comparable<Path> {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final String DIRECTORY_SEPARATOR;
                private final ByteString bytes;

                static {
/* 9 */             String str = File.separator;
/* 11 */            str.getClass();
/* 14 */            DIRECTORY_SEPARATOR = str;
                }

                public Path(ByteString byteString) {
/* 1 */             byteString.getClass();
/* 7 */             this.bytes = byteString;
                }

                public static final Path get(File file) {
/* 3 */             return INSTANCE.get(file);
                }

                public static /* synthetic */ Path resolve$default(Path path, String str, boolean z, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 z = false;
                    }
/* 6 */             return path.resolve(str, z);
                }

                @Override // java.lang.Comparable
                public int compareTo(Path other) {
/* 1 */             other.getClass();
/* 12 */            return getBytes().compareTo(other.getBytes());
                }

                public boolean equals(Object other) {
                    return (other instanceof Path) && Intrinsics.m6216a(((Path) other).getBytes(), getBytes());
                }

                /* JADX INFO: renamed from: getBytes$okio, reason: from getter */
                public final ByteString getBytes() {
/* 1 */             return this.bytes;
                }

                public final Path getRoot() {
/* 1 */             int iRootLength = okio.internal.Path.rootLength(this);
/* 6 */             if (iRootLength == -1) {
/* 8 */                 return null;
                    }
/* 21 */            return new Path(getBytes().substring(0, iRootLength));
                }

                public final List<String> getSegments() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 1 */             int iRootLength = okio.internal.Path.rootLength(this);
/* 13 */            if (iRootLength == -1) {
/* 15 */                iRootLength = 0;
                    } else if (iRootLength < getBytes().size() && getBytes().getByte(iRootLength) == 92) {
/* 37 */                iRootLength++;
                    }
/* 43 */            int size = getBytes().size();
/* 47 */            int i = iRootLength;
/* 48 */            while (iRootLength < size) {
/* 60 */                if (getBytes().getByte(iRootLength) == 47 || getBytes().getByte(iRootLength) == 92) {
/* 80 */                    arrayList.add(getBytes().substring(i, iRootLength));
/* 83 */                    i = iRootLength + 1;
                        }
/* 85 */                iRootLength++;
                    }
/* 96 */            if (i < getBytes().size()) {
/* 114 */               arrayList.add(getBytes().substring(i, getBytes().size()));
                    }
/* 125 */           ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(arrayList, 10));
/* 128 */           Iterator it = arrayList.iterator();
/* 136 */           while (it.hasNext()) {
/* 148 */               arrayList2.add(((ByteString) it.next()).utf8());
                    }
/* 152 */           return arrayList2;
                }

                public final List<ByteString> getSegmentsBytes() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 1 */             int iRootLength = okio.internal.Path.rootLength(this);
/* 13 */            if (iRootLength == -1) {
/* 15 */                iRootLength = 0;
                    } else if (iRootLength < getBytes().size() && getBytes().getByte(iRootLength) == 92) {
/* 37 */                iRootLength++;
                    }
/* 43 */            int size = getBytes().size();
/* 47 */            int i = iRootLength;
/* 48 */            while (iRootLength < size) {
/* 60 */                if (getBytes().getByte(iRootLength) == 47 || getBytes().getByte(iRootLength) == 92) {
/* 80 */                    arrayList.add(getBytes().substring(i, iRootLength));
/* 83 */                    i = iRootLength + 1;
                        }
/* 85 */                iRootLength++;
                    }
/* 96 */            if (i < getBytes().size()) {
/* 114 */               arrayList.add(getBytes().substring(i, getBytes().size()));
                    }
/* 117 */           return arrayList;
                }

                public int hashCode() {
/* 5 */             return getBytes().hashCode();
                }

                public final boolean isAbsolute() {
                    return okio.internal.Path.rootLength(this) != -1;
                }

                public final boolean isRelative() {
                    return okio.internal.Path.rootLength(this) == -1;
                }

                public final boolean isRoot() {
                    return okio.internal.Path.rootLength(this) == getBytes().size();
                }

                public final String name() {
/* 5 */             return nameBytes().utf8();
                }

                public final ByteString nameBytes() {
/* 1 */             int indexOfLastSlash = okio.internal.Path.getIndexOfLastSlash(this);
/* 7 */             if (indexOfLastSlash != -1) {
/* 17 */                return ByteString.substring$default(getBytes(), indexOfLastSlash + 1, 0, 2, null);
                    }
                    return (volumeLetter() == null || getBytes().size() != 2) ? getBytes() : ByteString.EMPTY;
                }

                public final Path normalized() {
/* 8 */             return INSTANCE.get(toString(), true);
                }

                public final Path parent() {
/* 14 */            if (Intrinsics.m6216a(getBytes(), okio.internal.Path.DOT) || Intrinsics.m6216a(getBytes(), okio.internal.Path.SLASH) || Intrinsics.m6216a(getBytes(), okio.internal.Path.BACKSLASH) || okio.internal.Path.lastSegmentIsDotDot(this)) {
/* 13 */                return null;
                    }
/* 1 */             int indexOfLastSlash = okio.internal.Path.getIndexOfLastSlash(this);
/* 59 */            if (indexOfLastSlash == 2 && volumeLetter() != null) {
/* 76 */                if (getBytes().size() == 3) {
/* 13 */                    return null;
                        }
/* 89 */                return new Path(ByteString.substring$default(getBytes(), 0, 3, 1, null));
                    }
/* 93 */            if (indexOfLastSlash == 1 && getBytes().startsWith(okio.internal.Path.BACKSLASH)) {
/* 13 */                return null;
                    }
/* 111 */           if (indexOfLastSlash != -1 || volumeLetter() == null) {
/* 144 */               if (indexOfLastSlash == -1) {
/* 152 */                   return new Path(okio.internal.Path.DOT);
                        }
                        return indexOfLastSlash == 0 ? new Path(ByteString.substring$default(getBytes(), 0, 1, 1, null)) : new Path(ByteString.substring$default(getBytes(), 0, indexOfLastSlash, 1, null));
                    }
/* 127 */           if (getBytes().size() == 2) {
/* 13 */                return null;
                    }
/* 140 */           return new Path(ByteString.substring$default(getBytes(), 0, 2, 1, null));
                }

                public final Path relativeTo(Path other) {
/* 1 */             other.getClass();
/* 17 */            if (!Intrinsics.m6216a(getRoot(), other.getRoot())) {
/* 186 */               ds0.m3194k(this, "Paths of different roots cannot be relative to each other: ", other);
/* 16 */                return null;
                    }
/* 19 */            List<ByteString> segmentsBytes = getSegmentsBytes();
/* 23 */            List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
/* 35 */            int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
/* 40 */            int i = 0;
/* 41 */            while (i < iMin && Intrinsics.m6216a(segmentsBytes.get(i), segmentsBytes2.get(i))) {
/* 57 */                i++;
                    }
/* 60 */            if (i == iMin && getBytes().size() == other.getBytes().size()) {
/* 85 */                return Companion.get$default(INSTANCE, ".", false, 1, (Object) null);
                    }
/* 107 */           if (segmentsBytes2.subList(i, segmentsBytes2.size()).indexOf(okio.internal.Path.DOT_DOT) != -1) {
/* 180 */               ds0.m3194k(this, "Impossible relative path to resolve: ", other);
/* 16 */                return null;
                    }
/* 111 */           Buffer buffer = new Buffer();
/* 1 */             ByteString slash = okio.internal.Path.getSlash(other);
/* 118 */           if (slash == null && (slash = okio.internal.Path.getSlash(this)) == null) {
/* 1 */                 slash = okio.internal.Path.toSlash(DIRECTORY_SEPARATOR);
                    }
/* 132 */           int size = segmentsBytes2.size();
/* 137 */           for (int i2 = i; i2 < size; i2++) {
/* 143 */               buffer.write(okio.internal.Path.DOT_DOT);
/* 146 */               buffer.write(slash);
                    }
/* 152 */           int size2 = segmentsBytes.size();
/* 156 */           while (i < size2) {
/* 164 */               buffer.write(segmentsBytes.get(i));
/* 167 */               buffer.write(slash);
/* 170 */               i++;
                    }
/* 173 */           return okio.internal.Path.toPath(buffer, false);
                }

                public final Path resolve(String child) {
/* 1 */             child.getClass();
/* 18 */            return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().writeUtf8(child), false), false);
                }

                public final File toFile() {
/* 7 */             return new File(toString());
                }

                public final java.nio.file.Path toNioPath() {
/* 1 */             java.nio.file.Path path = Paths.get(toString(), new String[0]);
/* 12 */            path.getClass();
/* 15 */            return path;
                }

                public String toString() {
/* 5 */             return getBytes().utf8();
                }

                public final Character volumeLetter() {
/* 17 */            if (ByteString.indexOf$default(getBytes(), okio.internal.Path.SLASH, 0, 2, (Object) null) != -1 || getBytes().size() < 2 || getBytes().getByte(1) != 58) {
/* 11 */                return null;
                    }
/* 53 */            char c = (char) getBytes().getByte(0);
/* 56 */            if (('a' > c || c >= '{') && ('A' > c || c >= '[')) {
/* 11 */                return null;
                    }
/* 71 */            return Character.valueOf(c);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m6176d2 = {"Lokio/Path$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "DIRECTORY_SEPARATOR", HttpUrl.FRAGMENT_ENCODE_SET, "toOkioPath", "Lokio/Path;", "Ljava/io/File;", "normalize", HttpUrl.FRAGMENT_ENCODE_SET, "get", "Ljava/nio/file/Path;", "toPath", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public static /* synthetic */ Path get$default(Companion companion, String str, boolean z, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     z = false;
                        }
/* 6 */                 return companion.get(str, z);
                    }

                    public final Path get(File file, boolean z) {
/* 1 */                 file.getClass();
/* 4 */                 String string = file.toString();
/* 8 */                 string.getClass();
/* 11 */                return get(string, z);
                    }

/* 4 */             private Companion() {
                    }

/* 10 */            public static /* synthetic */ Path get$default(Companion companion, File file, boolean z, int i, Object obj) {
                        if ((i & 1) != 0) {
                            z = false;
                        }
/* 11 */                return companion.get(file, z);
                    }

/* 11 */            public static /* synthetic */ Path get$default(Companion companion, java.nio.file.Path path, boolean z, int i, Object obj) {
                        if ((i & 1) != 0) {
                            z = false;
                        }
/* 12 */                return companion.get(path, z);
                    }

/* 15 */            public final Path get(String str) {
/* 16 */                str.getClass();
                        return get$default(this, str, false, 1, (Object) null);
                    }

/* 16 */            public final Path get(java.nio.file.Path path) {
/* 17 */                path.getClass();
                        return get$default(this, path, false, 1, (Object) null);
                    }

/* 17 */            public final Path get(String str, boolean z) {
                        str.getClass();
/* 18 */                return okio.internal.Path.commonToPath(str, z);
                    }

/* 18 */            public final Path get(File file) {
/* 19 */                file.getClass();
                        return get$default(this, file, false, 1, (Object) null);
                    }

/* 19 */            public final Path get(java.nio.file.Path path, boolean z) {
                        path.getClass();
/* 20 */                return get(path.toString(), z);
                    }
                }

/* 7 */         public static final Path get(File file, boolean z) {
/* 8 */             return INSTANCE.get(file, z);
                }

/* 8 */         public static final Path get(String str) {
/* 9 */             return INSTANCE.get(str);
                }

/* 9 */         public static final Path get(String str, boolean z) {
/* 10 */            return INSTANCE.get(str, z);
                }

/* 10 */        public static final Path get(java.nio.file.Path path) {
/* 11 */            return INSTANCE.get(path);
                }

/* 10 */        public static /* synthetic */ Path resolve$default(Path path, ByteString byteString, boolean z, int i, Object obj) {
                    if ((i & 2) != 0) {
                        z = false;
                    }
/* 11 */            return path.resolve(byteString, z);
                }

/* 11 */        public static final Path get(java.nio.file.Path path, boolean z) {
/* 12 */            return INSTANCE.get(path, z);
                }

/* 11 */        public static /* synthetic */ Path resolve$default(Path path, Path path2, boolean z, int i, Object obj) {
                    if ((i & 2) != 0) {
                        z = false;
                    }
/* 12 */            return path.resolve(path2, z);
                }

/* 22 */        public final Path resolve(Path child, boolean normalize) {
                    child.getClass();
/* 23 */            return okio.internal.Path.commonResolve(this, child, normalize);
                }

/* 23 */        public final Path resolve(Path child) {
                    child.getClass();
/* 24 */            return okio.internal.Path.commonResolve(this, child, false);
                }

/* 24 */        public final Path resolve(ByteString child) {
                    child.getClass();
/* 26 */            return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().write(child), false), false);
                }

/* 26 */        public final Path resolve(String child, boolean normalize) {
                    child.getClass();
/* 28 */            return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().writeUtf8(child), false), normalize);
                }

/* 28 */        public final Path resolve(ByteString child, boolean normalize) {
                    child.getClass();
/* 30 */            return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().write(child), false), normalize);
                }
            }
