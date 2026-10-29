            package okio.internal;

            import java.io.IOException;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import okio.Buffer;
            import okio.ForwardingSource;
            import okio.Source;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m6176d2 = {"Lokio/internal/FixedLengthSource;", "Lokio/ForwardingSource;", "delegate", "Lokio/Source;", "size", HttpUrl.FRAGMENT_ENCODE_SET, "truncate", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokio/Source;JZ)V", "bytesReceived", "read", "sink", "Lokio/Buffer;", "byteCount", "truncateToSize", HttpUrl.FRAGMENT_ENCODE_SET, "newSize", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class FixedLengthSource extends ForwardingSource {
                private long bytesReceived;
                private final long size;
                private final boolean truncate;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FixedLengthSource(Source source, long j, boolean z) {
/* 4 */             super(source);
/* 1 */             source.getClass();
/* 7 */             this.size = j;
/* 9 */             this.truncate = z;
                }

                private final void truncateToSize(Buffer buffer, long j) throws IOException {
/* 3 */             Buffer buffer2 = new Buffer();
/* 6 */             buffer2.writeAll(buffer);
/* 9 */             buffer.write(buffer2, j);
/* 12 */            buffer2.clear();
                }

                @Override // okio.ForwardingSource, okio.Source
                public long read(Buffer sink, long byteCount) throws IOException {
/* 1 */             sink.getClass();
/* 4 */             long j = this.bytesReceived;
/* 6 */             long j2 = this.size;
/* 14 */            if (j > j2) {
/* 16 */                byteCount = 0;
                    } else if (this.truncate) {
/* 22 */                long j3 = j2 - j;
/* 25 */                if (j3 == 0) {
/* 10 */                    return -1L;
                        }
/* 28 */                byteCount = Math.min(byteCount, j3);
                    }
/* 32 */            long j4 = super.read(sink, byteCount);
/* 38 */            if (j4 != -1) {
/* 43 */                this.bytesReceived += j4;
                    }
/* 45 */            long j5 = this.bytesReceived;
/* 47 */            long j6 = this.size;
/* 51 */            if ((j5 >= j6 || j4 != -1) && j5 <= j6) {
/* 112 */               return j4;
                    }
/* 61 */            if (j4 > 0 && j5 > j6) {
/* 77 */                truncateToSize(sink, sink.size() - (this.bytesReceived - this.size));
                    }
/* 111 */           throw new IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
                }
            }
