            package okhttp3.internal.cache2;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.nio.channels.FileChannel;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import okio.Buffer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m6176d2 = {"Lokhttp3/internal/cache2/FileOperator;", HttpUrl.FRAGMENT_ENCODE_SET, "fileChannel", "Ljava/nio/channels/FileChannel;", "(Ljava/nio/channels/FileChannel;)V", "read", HttpUrl.FRAGMENT_ENCODE_SET, "pos", HttpUrl.FRAGMENT_ENCODE_SET, "sink", "Lokio/Buffer;", "byteCount", "write", FirebaseAnalytics.Param.SOURCE, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class FileOperator {
                private final FileChannel fileChannel;

                public FileOperator(FileChannel fileChannel) {
/* 1 */             fileChannel.getClass();
/* 7 */             this.fileChannel = fileChannel;
                }

                public final void read(long pos, Buffer sink, long byteCount) throws IOException {
/* 1 */             sink.getClass();
/* 8 */             if (byteCount < 0) {
/* 32 */                throw new IndexOutOfBoundsException();
                    }
/* 10 */            long j = pos;
/* 11 */            long j2 = byteCount;
/* 14 */            while (j2 > 0) {
/* 19 */                long jTransferTo = this.fileChannel.transferTo(j, j2, sink);
/* 23 */                j += jTransferTo;
/* 24 */                j2 -= jTransferTo;
                    }
                }

                public final void write(long pos, Buffer source, long byteCount) throws IOException {
/* 1 */             source.getClass();
/* 8 */             if (byteCount < 0 || byteCount > source.size()) {
/* 40 */                throw new IndexOutOfBoundsException();
                    }
/* 18 */            long j = pos;
/* 19 */            long j2 = byteCount;
/* 22 */            while (j2 > 0) {
/* 27 */                long jTransferFrom = this.fileChannel.transferFrom(source, j, j2);
/* 31 */                j += jTransferFrom;
/* 32 */                j2 -= jTransferFrom;
                    }
                }
            }
