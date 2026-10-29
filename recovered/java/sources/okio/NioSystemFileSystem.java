            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.nio.file.FileSystemException;
            import java.nio.file.Files;
            import java.nio.file.LinkOption;
            import java.nio.file.NoSuchFileException;
            import java.nio.file.StandardCopyOption;
            import java.nio.file.attribute.BasicFileAttributes;
            import java.nio.file.attribute.FileAttribute;
            import java.nio.file.attribute.FileTime;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m6176d2 = {"Lokio/NioSystemFileSystem;", "Lokio/JvmSystemFileSystem;", "()V", "atomicMove", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.SOURCE, "Lokio/Path;", "target", "createSymlink", "metadataOrNull", "Lokio/FileMetadata;", "nioPath", "Ljava/nio/file/Path;", "path", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "zeroToNull", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/nio/file/attribute/FileTime;", "(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 109 */   public class NioSystemFileSystem extends JvmSystemFileSystem {
                private final Long zeroToNull(FileTime fileTime) {
/* 1 */             long millis = fileTime.toMillis();
/* 5 */             Long lValueOf = Long.valueOf(millis);
/* 13 */            if (millis != 0) {
/* 15 */                return lValueOf;
                    }
/* 16 */            return null;
                }

                @Override // okio.JvmSystemFileSystem, okio.FileSystem
                public void atomicMove(Path source, Path target) throws IOException {
/* 1 */             source.getClass();
/* 4 */             target.getClass();
                    try {
/* 28 */                Files.move(source.toNioPath(), target.toNioPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
                    } catch (UnsupportedOperationException unused) {
/* 34 */                ds0.m3195l("atomic move not supported");
                    } catch (NoSuchFileException e) {
/* 48 */                throw new FileNotFoundException(e.getMessage());
                    }
                }

                @Override // okio.JvmSystemFileSystem, okio.FileSystem
                public void createSymlink(Path source, Path target) throws IOException {
/* 1 */             source.getClass();
/* 4 */             target.getClass();
/* 1 */             Files.createSymbolicLink(source.toNioPath(), target.toNioPath(), new FileAttribute[0]);
                }

                public final FileMetadata metadataOrNull(java.nio.file.Path nioPath) {
/* 3 */             nioPath.getClass();
                    try {
/* 19 */                BasicFileAttributes attributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
/* 34 */                java.nio.file.Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(nioPath) : null;
/* 37 */                boolean zIsRegularFile = attributes.isRegularFile();
/* 41 */                boolean zIsDirectory = attributes.isDirectory();
/* 55 */                Path path = symbolicLink != null ? Path.Companion.get$default(Path.INSTANCE, symbolicLink, false, 1, (Object) null) : null;
/* 60 */                Long lValueOf = Long.valueOf(attributes.size());
/* 64 */                FileTime fileTimeCreationTime = attributes.creationTime();
/* 76 */                Long lZeroToNull = fileTimeCreationTime != null ? zeroToNull(fileTimeCreationTime) : null;
/* 77 */                FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
/* 89 */                Long lZeroToNull2 = fileTimeLastModifiedTime != null ? zeroToNull(fileTimeLastModifiedTime) : null;
/* 90 */                FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
/* 106 */               return new FileMetadata(zIsRegularFile, zIsDirectory, path, lValueOf, lZeroToNull, lZeroToNull2, fileTimeLastAccessTime != null ? zeroToNull(fileTimeLastAccessTime) : null, null, 128, null);
                    } catch (NoSuchFileException | FileSystemException unused) {
/* 6 */                 return null;
                    }
                }

                @Override // okio.JvmSystemFileSystem
                public String toString() {
/* 1 */             return "NioSystemFileSystem";
                }

                @Override // okio.JvmSystemFileSystem, okio.FileSystem
/* 110 */       public FileMetadata metadataOrNull(Path path) {
                    path.getClass();
/* 111 */           return metadataOrNull(path.toNioPath());
                }
            }
