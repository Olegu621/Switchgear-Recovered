            package okio.internal;

            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, m6176d2 = {"Lokio/internal/EocdRecord;", HttpUrl.FRAGMENT_ENCODE_SET, "entryCount", HttpUrl.FRAGMENT_ENCODE_SET, "centralDirectoryOffset", "commentByteCount", HttpUrl.FRAGMENT_ENCODE_SET, "(JJI)V", "getCentralDirectoryOffset", "()J", "getCommentByteCount", "()I", "getEntryCount", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            final class EocdRecord {
                private final long centralDirectoryOffset;
                private final int commentByteCount;
                private final long entryCount;

                public EocdRecord(long j, long j2, int i) {
/* 4 */             this.entryCount = j;
/* 6 */             this.centralDirectoryOffset = j2;
/* 8 */             this.commentByteCount = i;
                }

                public final long getCentralDirectoryOffset() {
/* 1 */             return this.centralDirectoryOffset;
                }

                public final int getCommentByteCount() {
/* 1 */             return this.commentByteCount;
                }

                public final long getEntryCount() {
/* 1 */             return this.entryCount;
                }
            }
