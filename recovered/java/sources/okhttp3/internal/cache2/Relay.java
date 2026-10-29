            package okhttp3.internal.cache2;

            import java.io.File;
            import java.io.IOException;
            import java.io.RandomAccessFile;
            import java.nio.channels.FileChannel;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import okhttp3.internal.Util;
            import okio.Buffer;
            import okio.ByteString;
            import okio.Source;
            import okio.Timeout;
            import p000.C1951n4;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 :2\u00020\u0001:\u0002:;B3\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u000e\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u00105\u001a\u0004\u0018\u00010\u0005J \u00106\u001a\u0002032\u0006\u00107\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0002J\u0010\u00109\u001a\u0002032\u0006\u00104\u001a\u00020\u0007H\u0002R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006<"}, m6176d2 = {"Lokhttp3/internal/cache2/Relay;", HttpUrl.FRAGMENT_ENCODE_SET, "file", "Ljava/io/RandomAccessFile;", "upstream", "Lokio/Source;", "upstreamPos", HttpUrl.FRAGMENT_ENCODE_SET, "metadata", "Lokio/ByteString;", "bufferMaxSize", "(Ljava/io/RandomAccessFile;Lokio/Source;JLokio/ByteString;J)V", "buffer", "Lokio/Buffer;", "getBuffer", "()Lokio/Buffer;", "getBufferMaxSize", "()J", "complete", HttpUrl.FRAGMENT_ENCODE_SET, "getComplete", "()Z", "setComplete", "(Z)V", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "isClosed", "sourceCount", HttpUrl.FRAGMENT_ENCODE_SET, "getSourceCount", "()I", "setSourceCount", "(I)V", "getUpstream", "()Lokio/Source;", "setUpstream", "(Lokio/Source;)V", "upstreamBuffer", "getUpstreamBuffer", "getUpstreamPos", "setUpstreamPos", "(J)V", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "commit", HttpUrl.FRAGMENT_ENCODE_SET, "upstreamSize", "newSource", "writeHeader", "prefix", "metadataSize", "writeMetadata", "Companion", "RelaySource", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class Relay {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final long FILE_HEADER_SIZE = 32;
                public static final ByteString PREFIX_CLEAN;
                public static final ByteString PREFIX_DIRTY;
                private static final int SOURCE_FILE = 2;
                private static final int SOURCE_UPSTREAM = 1;
                private final Buffer buffer;
                private final long bufferMaxSize;
                private boolean complete;
                private RandomAccessFile file;
                private final ByteString metadata;
                private int sourceCount;
                private Source upstream;
                private final Buffer upstreamBuffer;
                private long upstreamPos;
                private Thread upstreamReader;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m6176d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lokio/Source;", "(Lokhttp3/internal/cache2/Relay;)V", "fileOperator", "Lokhttp3/internal/cache2/FileOperator;", "sourcePos", HttpUrl.FRAGMENT_ENCODE_SET, "timeout", "Lokio/Timeout;", "close", HttpUrl.FRAGMENT_ENCODE_SET, "read", "sink", "Lokio/Buffer;", "byteCount", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public final class RelaySource implements Source {
                    private FileOperator fileOperator;
                    private long sourcePos;
                    final /* synthetic */ Relay this$0;
                    private final Timeout timeout;

                    public RelaySource(Relay relay) {
/* 1 */                 relay.getClass();
/* 4 */                 this.this$0 = relay;
/* 14 */                this.timeout = new Timeout();
/* 18 */                RandomAccessFile file = relay.getFile();
/* 22 */                file.getClass();
/* 25 */                FileChannel channel = file.getChannel();
/* 29 */                channel.getClass();
/* 35 */                this.fileOperator = new FileOperator(channel);
                    }

                    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
/* 3 */                 if (this.fileOperator == null) {
/* 41 */                    return;
                        }
/* 6 */                 RandomAccessFile randomAccessFile = null;
/* 7 */                 this.fileOperator = null;
/* 9 */                 Relay relay = this.this$0;
                        synchronized (relay) {
/* 18 */                    relay.setSourceCount(relay.getSourceCount() - 1);
/* 25 */                    if (relay.getSourceCount() == 0) {
/* 27 */                        RandomAccessFile file = relay.getFile();
/* 31 */                        relay.setFile(null);
/* 34 */                        randomAccessFile = file;
                            }
                        }
/* 39 */                if (randomAccessFile == null) {
/* 41 */                    return;
                        }
/* 42 */                Util.closeQuietly(randomAccessFile);
                    }

                    @Override // okio.Source
                    public long read(Buffer sink, long byteCount) throws IOException {
                        char c;
/* 5 */                 sink.getClass();
/* 10 */                if (this.fileOperator == null) {
/* 351 */                   f42.m3656l("Check failed.");
/* 354 */                   return 0L;
                        }
/* 12 */                Relay relay = this.this$0;
                        synchronized (relay) {
                            while (true) {
/* 26 */                        if (this.sourcePos == relay.getUpstreamPos()) {
/* 87 */                            if (!relay.getComplete()) {
/* 95 */                                if (relay.getUpstreamReader() == null) {
/* 107 */                                   relay.setUpstreamReader(Thread.currentThread());
/* 110 */                                   c = 1;
                                            break;
                                        }
/* 99 */                                this.timeout.waitUntilNotified(relay);
                                    } else {
/* 24 */                                return -1L;
                                    }
                                } else {
/* 40 */                            long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().size();
/* 45 */                            if (this.sourcePos < upstreamPos) {
/* 47 */                                c = 2;
                                        break;
                                    }
/* 56 */                            long jMin = Math.min(byteCount, relay.getUpstreamPos() - this.sourcePos);
/* 70 */                            relay.getBuffer().copyTo(sink, this.sourcePos - upstreamPos, jMin);
/* 76 */                            this.sourcePos += jMin;
/* 79 */                            return jMin;
                                }
                            }
/* 112 */                   Relay relay2 = this.this$0;
/* 116 */                   if (c == 2) {
/* 125 */                       long jMin2 = Math.min(byteCount, relay2.getUpstreamPos() - this.sourcePos);
/* 129 */                       FileOperator fileOperator = this.fileOperator;
/* 131 */                       fileOperator.getClass();
/* 140 */                       fileOperator.read(this.sourcePos + 32, sink, jMin2);
/* 146 */                       this.sourcePos += jMin2;
/* 148 */                       return jMin2;
                            }
                            try {
/* 150 */                       Source upstream = relay2.getUpstream();
/* 154 */                       upstream.getClass();
/* 169 */                       long j = upstream.read(this.this$0.getUpstreamBuffer(), this.this$0.getBufferMaxSize());
/* 175 */                       if (j == -1) {
/* 177 */                           Relay relay3 = this.this$0;
/* 183 */                           relay3.commit(relay3.getUpstreamPos());
/* 186 */                           Relay relay4 = this.this$0;
                                    synchronized (relay4) {
/* 189 */                               relay4.setUpstreamReader(null);
/* 192 */                               relay4.notifyAll();
                                    }
/* 24 */                            return -1L;
                                }
/* 203 */                       long jMin3 = Math.min(j, byteCount);
/* 217 */                       this.this$0.getUpstreamBuffer().copyTo(sink, 0L, jMin3);
/* 223 */                       this.sourcePos += jMin3;
/* 227 */                       FileOperator fileOperator2 = this.fileOperator;
/* 229 */                       fileOperator2.getClass();
/* 250 */                       fileOperator2.write(this.this$0.getUpstreamPos() + 32, this.this$0.getUpstreamBuffer().clone(), j);
/* 255 */                       Relay relay5 = this.this$0;
                                synchronized (relay5) {
                                    try {
/* 266 */                               relay5.getBuffer().write(relay5.getUpstreamBuffer(), j);
/* 283 */                               if (relay5.getBuffer().size() > relay5.getBufferMaxSize()) {
/* 302 */                                   relay5.getBuffer().skip(relay5.getBuffer().size() - relay5.getBufferMaxSize());
                                        }
/* 313 */                               relay5.setUpstreamPos(relay5.getUpstreamPos() + j);
                                    } catch (Throwable th) {
/* 332 */                               throw th;
                                    }
                                }
/* 317 */                       Relay relay6 = this.this$0;
                                synchronized (relay6) {
/* 320 */                           relay6.setUpstreamReader(null);
/* 323 */                           relay6.notifyAll();
                                }
/* 327 */                       return jMin3;
                            } catch (Throwable th2) {
/* 333 */                       Relay relay7 = this.this$0;
                                synchronized (relay7) {
/* 336 */                           relay7.setUpstreamReader(null);
/* 339 */                           relay7.notifyAll();
/* 343 */                           throw th2;
                                }
                            }
                        }
                    }

                    @Override // okio.Source
                    /* JADX INFO: renamed from: timeout, reason: from getter */
                    public Timeout getTimeout() {
/* 1 */                 return this.timeout;
                    }
                }

                static {
/* 9 */             ByteString.Companion companion = ByteString.INSTANCE;
/* 17 */            PREFIX_CLEAN = companion.encodeUtf8("OkHttp cache v1\n");
/* 25 */            PREFIX_DIRTY = companion.encodeUtf8("OkHttp DIRTY :(\n");
                }

                private Relay(RandomAccessFile randomAccessFile, Source source, long j, ByteString byteString, long j2) {
/* 4 */             this.file = randomAccessFile;
/* 6 */             this.upstream = source;
/* 8 */             this.upstreamPos = j;
/* 10 */            this.metadata = byteString;
/* 12 */            this.bufferMaxSize = j2;
/* 19 */            this.upstreamBuffer = new Buffer();
/* 28 */            this.complete = this.upstream == null;
/* 35 */            this.buffer = new Buffer();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void writeHeader(ByteString prefix, long upstreamSize, long metadataSize) throws IOException {
/* 4 */             Buffer buffer = new Buffer();
/* 7 */             buffer.write(prefix);
/* 10 */            buffer.writeLong(upstreamSize);
/* 13 */            buffer.writeLong(metadataSize);
/* 24 */            if (buffer.size() != 32) {
/* 54 */                C1951n4.m6859j("Failed requirement.");
/* 57 */                return;
                    }
/* 29 */            RandomAccessFile randomAccessFile = this.file;
/* 31 */            randomAccessFile.getClass();
/* 34 */            FileChannel channel = randomAccessFile.getChannel();
/* 38 */            channel.getClass();
/* 48 */            new FileOperator(channel).write(0L, buffer, 32L);
                }

                private final void writeMetadata(long upstreamSize) throws IOException {
/* 3 */             Buffer buffer = new Buffer();
/* 8 */             buffer.write(this.metadata);
/* 13 */            RandomAccessFile randomAccessFile = this.file;
/* 15 */            randomAccessFile.getClass();
/* 18 */            FileChannel channel = randomAccessFile.getChannel();
/* 22 */            channel.getClass();
/* 38 */            new FileOperator(channel).write(32 + upstreamSize, buffer, this.metadata.size());
                }

                public final void commit(long upstreamSize) throws IOException {
/* 1 */             writeMetadata(upstreamSize);
/* 4 */             RandomAccessFile randomAccessFile = this.file;
/* 6 */             randomAccessFile.getClass();
/* 14 */            randomAccessFile.getChannel().force(false);
/* 28 */            writeHeader(PREFIX_CLEAN, upstreamSize, this.metadata.size());
/* 31 */            RandomAccessFile randomAccessFile2 = this.file;
/* 33 */            randomAccessFile2.getClass();
/* 40 */            randomAccessFile2.getChannel().force(false);
                    synchronized (this) {
/* 45 */                setComplete(true);
                    }
/* 49 */            Source source = this.upstream;
/* 51 */            if (source != null) {
/* 54 */                Util.closeQuietly(source);
                    }
/* 58 */            this.upstream = null;
                }

                public final Buffer getBuffer() {
/* 1 */             return this.buffer;
                }

                public final long getBufferMaxSize() {
/* 1 */             return this.bufferMaxSize;
                }

                public final boolean getComplete() {
/* 1 */             return this.complete;
                }

                public final RandomAccessFile getFile() {
/* 1 */             return this.file;
                }

                public final int getSourceCount() {
/* 1 */             return this.sourceCount;
                }

                public final Source getUpstream() {
/* 1 */             return this.upstream;
                }

                public final Buffer getUpstreamBuffer() {
/* 1 */             return this.upstreamBuffer;
                }

                public final long getUpstreamPos() {
/* 1 */             return this.upstreamPos;
                }

                public final Thread getUpstreamReader() {
/* 1 */             return this.upstreamReader;
                }

                public final boolean isClosed() {
                    return this.file == null;
                }

                /* JADX INFO: renamed from: metadata, reason: from getter */
                public final ByteString getMetadata() {
/* 1 */             return this.metadata;
                }

                public final Source newSource() {
                    synchronized (this) {
/* 6 */                 if (getFile() == null) {
/* 9 */                     return null;
                        }
/* 17 */                setSourceCount(getSourceCount() + 1);
/* 23 */                return new RelaySource(this);
                    }
                }

                public final void setComplete(boolean z) {
/* 1 */             this.complete = z;
                }

                public final void setFile(RandomAccessFile randomAccessFile) {
/* 1 */             this.file = randomAccessFile;
                }

                public final void setSourceCount(int i) {
/* 1 */             this.sourceCount = i;
                }

                public final void setUpstream(Source source) {
/* 1 */             this.upstream = source;
                }

                public final void setUpstreamPos(long j) {
/* 1 */             this.upstreamPos = j;
                }

                public final void setUpstreamReader(Thread thread) {
/* 1 */             this.upstreamReader = thread;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m6176d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "FILE_HEADER_SIZE", HttpUrl.FRAGMENT_ENCODE_SET, "PREFIX_CLEAN", "Lokio/ByteString;", "PREFIX_DIRTY", "SOURCE_FILE", HttpUrl.FRAGMENT_ENCODE_SET, "SOURCE_UPSTREAM", "edit", "Lokhttp3/internal/cache2/Relay;", "file", "Ljava/io/File;", "upstream", "Lokio/Source;", "metadata", "bufferMaxSize", "read", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final Relay edit(File file, Source upstream, ByteString metadata, long bufferMaxSize) throws IOException {
/* 1 */                 file.getClass();
/* 4 */                 upstream.getClass();
/* 7 */                 metadata.getClass();
/* 14 */                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
/* 25 */                Relay relay = new Relay(randomAccessFile, upstream, 0L, metadata, bufferMaxSize, null);
/* 30 */                randomAccessFile.setLength(0L);
/* 1 */                 relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
/* 43 */                return relay;
                    }

                    public final Relay read(File file) throws IOException {
/* 1 */                 file.getClass();
/* 8 */                 RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
/* 13 */                FileChannel channel = randomAccessFile.getChannel();
/* 17 */                channel.getClass();
/* 20 */                FileOperator fileOperator = new FileOperator(channel);
/* 25 */                Buffer buffer = new Buffer();
/* 32 */                fileOperator.read(0L, buffer, 32L);
/* 35 */                ByteString byteString = Relay.PREFIX_CLEAN;
/* 50 */                if (!Intrinsics.m6216a(buffer.readByteString(byteString.size()), byteString)) {
/* 88 */                    ds0.m3195l("unreadable cache file");
/* 91 */                    return null;
                        }
/* 52 */                long j = buffer.readLong();
/* 56 */                long j2 = buffer.readLong();
/* 62 */                Buffer buffer2 = new Buffer();
/* 68 */                fileOperator.read(32 + j, buffer2, j2);
/* 82 */                return new Relay(randomAccessFile, null, j, buffer2.readByteString(), 0L, null);
                    }

/* 4 */             private Companion() {
                    }
                }

/* 37 */        public /* synthetic */ Relay(RandomAccessFile randomAccessFile, Source source, long j, ByteString byteString, long j2, DefaultConstructorMarker defaultConstructorMarker) {
/* 38 */            this(randomAccessFile, source, j, byteString, j2);
                }
            }
