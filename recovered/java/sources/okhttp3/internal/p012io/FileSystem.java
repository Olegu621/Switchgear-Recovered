            package okhttp3.internal.p012io;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import okio.Okio;
            import okio.Okio__JvmOkioKt;
            import okio.Sink;
            import okio.Source;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0015"}, m6176d2 = {"Lokhttp3/internal/io/FileSystem;", HttpUrl.FRAGMENT_ENCODE_SET, "appendingSink", "Lokio/Sink;", "file", "Ljava/io/File;", "delete", HttpUrl.FRAGMENT_ENCODE_SET, "deleteContents", "directory", "exists", HttpUrl.FRAGMENT_ENCODE_SET, "rename", "from", "to", "sink", "size", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.SOURCE, "Lokio/Source;", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public interface FileSystem {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = Companion.$$INSTANCE;
                public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, m6176d2 = {"Lokhttp3/internal/io/FileSystem$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "SYSTEM", "Lokhttp3/internal/io/FileSystem;", "SystemFileSystem", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class Companion {
                    static final /* synthetic */ Companion $$INSTANCE = new Companion();

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    @Metadata(m6175d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, m6176d2 = {"Lokhttp3/internal/io/FileSystem$Companion$SystemFileSystem;", "Lokhttp3/internal/io/FileSystem;", "()V", "appendingSink", "Lokio/Sink;", "file", "Ljava/io/File;", "delete", HttpUrl.FRAGMENT_ENCODE_SET, "deleteContents", "directory", "exists", HttpUrl.FRAGMENT_ENCODE_SET, "rename", "from", "to", "sink", "size", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.SOURCE, "Lokio/Source;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                    public static final class SystemFileSystem implements FileSystem {
                        @Override // okhttp3.internal.p012io.FileSystem
                        public Sink appendingSink(File file) throws FileNotFoundException {
/* 1 */                     file.getClass();
                            try {
/* 4 */                         return Okio.appendingSink(file);
                            } catch (FileNotFoundException unused) {
/* 13 */                        file.getParentFile().mkdirs();
/* 16 */                        return Okio.appendingSink(file);
                            }
                        }

                        @Override // okhttp3.internal.p012io.FileSystem
                        public void delete(File file) throws IOException {
/* 1 */                     file.getClass();
/* 8 */                     if (file.delete() || !file.exists()) {
/* 26 */                        return;
                            }
/* 23 */                    ds0.m3195l(Intrinsics.m6219d(file, "failed to delete "));
                        }

                        @Override // okhttp3.internal.p012io.FileSystem
                        public void deleteContents(File directory) throws IOException {
/* 1 */                     directory.getClass();
/* 4 */                     File[] fileArrListFiles = directory.listFiles();
/* 8 */                     if (fileArrListFiles == null) {
/* 50 */                        ds0.m3195l(Intrinsics.m6219d(directory, "not a readable directory: "));
/* 53 */                        return;
                            }
/* 10 */                    int length = fileArrListFiles.length;
/* 11 */                    int i = 0;
/* 12 */                    while (i < length) {
/* 14 */                        File file = fileArrListFiles[i];
/* 16 */                        i++;
/* 22 */                        if (file.isDirectory()) {
/* 24 */                            deleteContents(file);
                                }
/* 31 */                        if (!file.delete()) {
/* 40 */                            ds0.m3195l(Intrinsics.m6219d(file, "failed to delete "));
/* 43 */                            return;
                                }
                            }
                        }

                        @Override // okhttp3.internal.p012io.FileSystem
                        public boolean exists(File file) {
/* 1 */                     file.getClass();
/* 4 */                     return file.exists();
                        }

                        @Override // okhttp3.internal.p012io.FileSystem
                        public void rename(File from, File to) throws IOException {
/* 1 */                     from.getClass();
/* 4 */                     to.getClass();
/* 7 */                     delete(to);
/* 14 */                    if (from.renameTo(to)) {
/* 16 */                        return;
                            }
/* 44 */                    throw new IOException("failed to rename " + from + " to " + to);
                        }

                        @Override // okhttp3.internal.p012io.FileSystem
                        public Sink sink(File file) throws FileNotFoundException {
/* 1 */                     file.getClass();
                            try {
/* 1 */                         return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                            } catch (FileNotFoundException unused) {
/* 16 */                        file.getParentFile().mkdirs();
/* 1 */                         return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                            }
                        }

                        @Override // okhttp3.internal.p012io.FileSystem
                        public long size(File file) {
/* 1 */                     file.getClass();
/* 4 */                     return file.length();
                        }

                        @Override // okhttp3.internal.p012io.FileSystem
                        public Source source(File file) throws FileNotFoundException {
/* 1 */                     file.getClass();
/* 4 */                     return Okio.source(file);
                        }

                        public String toString() {
/* 1 */                     return "FileSystem.SYSTEM";
                        }
                    }

                    private Companion() {
                    }
                }

                Sink appendingSink(File file) throws FileNotFoundException;

                void delete(File file) throws IOException;

                void deleteContents(File directory) throws IOException;

                boolean exists(File file);

                void rename(File from, File to) throws IOException;

                Sink sink(File file) throws FileNotFoundException;

                long size(File file);

                Source source(File file) throws FileNotFoundException;
            }
