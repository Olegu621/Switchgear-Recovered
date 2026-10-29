            package okio;

            import java.util.ArrayList;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import p000.o21;
            import p000.oc1;
            import p000.od0;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00012\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r¢\u0006\u0004\b\u0013\u0010\u0014Jw\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u0003\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u0004\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b$\u0010!R'\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m6176d2 = {"Lokio/FileMetadata;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "isRegularFile", "isDirectory", "Lokio/Path;", "symlinkTarget", HttpUrl.FRAGMENT_ENCODE_SET, "size", "createdAtMillis", "lastModifiedAtMillis", "lastAccessedAtMillis", HttpUrl.FRAGMENT_ENCODE_SET, "Lo21;", "extras", "<init>", "(ZZLokio/Path;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V", "T", "type", "extra", "(Lo21;)Ljava/lang/Object;", "copy", "(ZZLokio/Path;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)Lokio/FileMetadata;", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "Z", "()Z", "Lokio/Path;", "getSymlinkTarget", "()Lokio/Path;", "Ljava/lang/Long;", "getSize", "()Ljava/lang/Long;", "getCreatedAtMillis", "getLastModifiedAtMillis", "getLastAccessedAtMillis", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 1 */     public final class FileMetadata {
                private final Long createdAtMillis;
                private final Map<o21, Object> extras;
                private final boolean isDirectory;
                private final boolean isRegularFile;
                private final Long lastAccessedAtMillis;
                private final Long lastModifiedAtMillis;
                private final Long size;
                private final Path symlinkTarget;

                /* JADX WARN: Illegal instructions before constructor call */
                public FileMetadata(boolean z, boolean z2, Path path, Long l, Long l2, Long l3, Long l4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    z = (i & 1) != 0 ? false : z;
                    z2 = (i & 2) != 0 ? false : z2;
                    path = (i & 4) != 0 ? null : path;
                    l = (i & 8) != 0 ? null : l;
                    l2 = (i & 16) != 0 ? null : l2;
                    l3 = (i & 32) != 0 ? null : l3;
                    l4 = (i & 64) != 0 ? null : l4;
                    if ((i & 128) != 0) {
/* 1 */                 map = od0.f14715a;
                        map.getClass();
                    }
/* 2 */             this(z, z2, path, l, l2, l3, l4, map);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ FileMetadata copy$default(FileMetadata fileMetadata, boolean z, boolean z2, Path path, Long l, Long l2, Long l3, Long l4, Map map, int i, Object obj) {
                    if ((i & 1) != 0) {
/* 1 */                 z = fileMetadata.isRegularFile;
                    }
                    if ((i & 2) != 0) {
/* 2 */                 z2 = fileMetadata.isDirectory;
                    }
                    if ((i & 4) != 0) {
/* 3 */                 path = fileMetadata.symlinkTarget;
                    }
                    if ((i & 8) != 0) {
/* 4 */                 l = fileMetadata.size;
                    }
                    if ((i & 16) != 0) {
/* 5 */                 l2 = fileMetadata.createdAtMillis;
                    }
                    if ((i & 32) != 0) {
/* 6 */                 l3 = fileMetadata.lastModifiedAtMillis;
                    }
                    if ((i & 64) != 0) {
/* 7 */                 l4 = fileMetadata.lastAccessedAtMillis;
                    }
                    if ((i & 128) != 0) {
/* 8 */                 map = fileMetadata.extras;
                    }
                    Long l5 = l4;
                    Map map2 = map;
                    Long l6 = l2;
                    Long l7 = l3;
/* 9 */             return fileMetadata.copy(z, z2, path, l, l6, l7, l5, map2);
                }

                public final FileMetadata copy(boolean isRegularFile, boolean isDirectory, Path symlinkTarget, Long size, Long createdAtMillis, Long lastModifiedAtMillis, Long lastAccessedAtMillis, Map<o21, ? extends Object> extras) {
/* 1 */             extras.getClass();
/* 6 */             return new FileMetadata(isRegularFile, isDirectory, symlinkTarget, size, createdAtMillis, lastModifiedAtMillis, lastAccessedAtMillis, extras);
                }

                public final <T> T extra(o21 type) {
/* 1 */             type.getClass();
/* 6 */             T t = (T) this.extras.get(type);
/* 10 */            if (t == null) {
/* 12 */                return null;
                    }
/* 14 */            xe2.m9767e(type, t);
/* 17 */            return t;
                }

                public final Long getCreatedAtMillis() {
/* 1 */             return this.createdAtMillis;
                }

                public final Map<o21, Object> getExtras() {
/* 1 */             return this.extras;
                }

                public final Long getLastAccessedAtMillis() {
/* 1 */             return this.lastAccessedAtMillis;
                }

                public final Long getLastModifiedAtMillis() {
/* 1 */             return this.lastModifiedAtMillis;
                }

                public final Long getSize() {
/* 1 */             return this.size;
                }

                public final Path getSymlinkTarget() {
/* 1 */             return this.symlinkTarget;
                }

                /* JADX INFO: renamed from: isDirectory, reason: from getter */
                public final boolean getIsDirectory() {
/* 1 */             return this.isDirectory;
                }

                /* JADX INFO: renamed from: isRegularFile, reason: from getter */
                public final boolean getIsRegularFile() {
/* 1 */             return this.isRegularFile;
                }

                public String toString() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             if (this.isRegularFile) {
/* 12 */                arrayList.add("isRegularFile");
                    }
/* 17 */            if (this.isDirectory) {
/* 21 */                arrayList.add("isDirectory");
                    }
/* 26 */            if (this.size != null) {
/* 44 */                arrayList.add("byteCount=" + this.size);
                    }
/* 49 */            if (this.createdAtMillis != null) {
/* 67 */                arrayList.add("createdAt=" + this.createdAtMillis);
                    }
/* 72 */            if (this.lastModifiedAtMillis != null) {
/* 90 */                arrayList.add("lastModifiedAt=" + this.lastModifiedAtMillis);
                    }
/* 95 */            if (this.lastAccessedAtMillis != null) {
/* 113 */               arrayList.add("lastAccessedAt=" + this.lastAccessedAtMillis);
                    }
/* 122 */           if (!this.extras.isEmpty()) {
/* 140 */               arrayList.add("extras=" + this.extras);
                    }
/* 152 */           return CollectionsKt.m6203x(arrayList, ", ", "FileMetadata(", ")", null, 56);
                }

/* 2 */         public FileMetadata() {
/* 3 */             this(false, false, null, null, null, null, null, null, 255, null);
                }

/* 3 */         public FileMetadata(boolean z, boolean z2, Path path, Long l, Long l2, Long l3, Long l4, Map<o21, ? extends Object> map) {
                    map.getClass();
/* 5 */             this.isRegularFile = z;
/* 6 */             this.isDirectory = z2;
/* 7 */             this.symlinkTarget = path;
/* 8 */             this.size = l;
/* 9 */             this.createdAtMillis = l2;
/* 10 */            this.lastModifiedAtMillis = l3;
/* 11 */            this.lastAccessedAtMillis = l4;
/* 12 */            this.extras = oc1.m7134h(map);
                }
            }
