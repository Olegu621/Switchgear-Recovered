            package okhttp3.internal.p013ws;

            import java.io.Closeable;
            import java.io.IOException;
            import java.util.zip.Inflater;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import okhttp3.internal.http2.Settings;
            import okio.Buffer;
            import okio.InflaterSource;
            import okio.Source;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m6176d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "noContextTakeover", HttpUrl.FRAGMENT_ENCODE_SET, "(Z)V", "deflatedBytes", "Lokio/Buffer;", "inflater", "Ljava/util/zip/Inflater;", "inflaterSource", "Lokio/InflaterSource;", "close", HttpUrl.FRAGMENT_ENCODE_SET, "inflate", "buffer", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class MessageInflater implements Closeable {
                private final Buffer deflatedBytes;
                private final Inflater inflater;
                private final InflaterSource inflaterSource;
                private final boolean noContextTakeover;

                public MessageInflater(boolean z) {
/* 4 */             this.noContextTakeover = z;
/* 8 */             Buffer buffer = new Buffer();
/* 11 */            this.deflatedBytes = buffer;
/* 16 */            Inflater inflater = new Inflater(true);
/* 19 */            this.inflater = inflater;
/* 26 */            this.inflaterSource = new InflaterSource((Source) buffer, inflater);
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
/* 3 */             this.inflaterSource.close();
                }

                public final void inflate(Buffer buffer) throws IOException {
/* 1 */             buffer.getClass();
/* 14 */            if (this.deflatedBytes.size() != 0) {
/* 74 */                C1951n4.m6859j("Failed requirement.");
/* 77 */                return;
                    }
/* 18 */            if (this.noContextTakeover) {
/* 22 */                this.inflater.reset();
                    }
/* 27 */            this.deflatedBytes.writeAll(buffer);
/* 35 */            this.deflatedBytes.writeInt(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
/* 50 */            long size = this.deflatedBytes.size() + this.inflater.getBytesRead();
/* 69 */            do {
/* 58 */                this.inflaterSource.readOrInflate(buffer, Long.MAX_VALUE);
/* 69 */            } while (this.inflater.getBytesRead() < size);
                }
            }
