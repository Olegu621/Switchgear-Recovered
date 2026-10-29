            package okio;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.Closeable;
            import java.io.IOException;
            import java.util.concurrent.locks.ReentrantLock;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.ds0;
            import p000.f42;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002-.B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0013H$J\b\u0010\u001b\u001a\u00020\u0013H$J(\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH$J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0016H$J\b\u0010$\u001a\u00020\u0016H$J(\u0010%\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH$J&\u0010&\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rJ\u001e\u0010&\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0016J \u0010(\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0016H\u0002J\u0016\u0010)\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010)\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010*\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u0016J\u0006\u0010#\u001a\u00020\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u0016J&\u0010+\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rJ\u001e\u0010+\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0016J \u0010,\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006/"}, m6176d2 = {"Lokio/FileHandle;", "Ljava/io/Closeable;", "Lokio/Closeable;", "readWrite", HttpUrl.FRAGMENT_ENCODE_SET, "(Z)V", "closed", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "openStreamCount", HttpUrl.FRAGMENT_ENCODE_SET, "getReadWrite", "()Z", "appendingSink", "Lokio/Sink;", "close", HttpUrl.FRAGMENT_ENCODE_SET, "flush", "position", HttpUrl.FRAGMENT_ENCODE_SET, "sink", FirebaseAnalytics.Param.SOURCE, "Lokio/Source;", "protectedClose", "protectedFlush", "protectedRead", "fileOffset", "array", HttpUrl.FRAGMENT_ENCODE_SET, "arrayOffset", "byteCount", "protectedResize", "size", "protectedSize", "protectedWrite", "read", "Lokio/Buffer;", "readNoCloseCheck", "reposition", "resize", "write", "writeNoCloseCheck", "FileHandleSink", "FileHandleSource", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 33 */    public abstract class FileHandle implements Closeable {
                private boolean closed;
                private final ReentrantLock lock = _JvmPlatformKt.newLock();
                private int openStreamCount;
                private final boolean readWrite;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m6176d2 = {"Lokio/FileHandle$FileHandleSink;", "Lokio/Sink;", "fileHandle", "Lokio/FileHandle;", "position", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokio/FileHandle;J)V", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "getClosed", "()Z", "setClosed", "(Z)V", "getFileHandle", "()Lokio/FileHandle;", "getPosition", "()J", "setPosition", "(J)V", "close", HttpUrl.FRAGMENT_ENCODE_SET, "flush", "timeout", "Lokio/Timeout;", "write", FirebaseAnalytics.Param.SOURCE, "Lokio/Buffer;", "byteCount", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class FileHandleSink implements Sink {
                    private boolean closed;
                    private final FileHandle fileHandle;
                    private long position;

                    public FileHandleSink(FileHandle fileHandle, long j) {
/* 1 */                 fileHandle.getClass();
/* 7 */                 this.fileHandle = fileHandle;
/* 9 */                 this.position = j;
                    }

                    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
/* 3 */                 if (this.closed) {
/* 5 */                     return;
                        }
/* 7 */                 this.closed = true;
/* 11 */                ReentrantLock lock = this.fileHandle.getLock();
/* 15 */                lock.lock();
                        try {
/* 1 */                     this.fileHandle.openStreamCount--;
/* 35 */                    if (this.fileHandle.openStreamCount == 0 && this.fileHandle.closed) {
/* 46 */                        lock.unlock();
/* 51 */                        this.fileHandle.protectedClose();
                            }
                        } finally {
/* 61 */                    lock.unlock();
                        }
                    }

                    @Override // okio.Sink, java.io.Flushable
                    public void flush() throws IOException {
/* 3 */                 if (this.closed) {
/* 13 */                    f42.m3656l("closed");
                        } else {
/* 7 */                     this.fileHandle.protectedFlush();
                        }
                    }

                    public final boolean getClosed() {
/* 1 */                 return this.closed;
                    }

                    public final FileHandle getFileHandle() {
/* 1 */                 return this.fileHandle;
                    }

                    public final long getPosition() {
/* 1 */                 return this.position;
                    }

                    public final void setClosed(boolean z) {
/* 1 */                 this.closed = z;
                    }

                    public final void setPosition(long j) {
/* 1 */                 this.position = j;
                    }

                    @Override // okio.Sink
                    public Timeout timeout() {
/* 1 */                 return Timeout.NONE;
                    }

                    @Override // okio.Sink
                    public void write(Buffer source, long byteCount) throws IOException {
/* 1 */                 source.getClass();
/* 6 */                 if (this.closed) {
/* 25 */                    f42.m3656l("closed");
                        } else {
/* 1 */                     this.fileHandle.writeNoCloseCheck(this.position, source, byteCount);
/* 20 */                    this.position += byteCount;
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, m6176d2 = {"Lokio/FileHandle$FileHandleSource;", "Lokio/Source;", "fileHandle", "Lokio/FileHandle;", "position", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokio/FileHandle;J)V", "closed", HttpUrl.FRAGMENT_ENCODE_SET, "getClosed", "()Z", "setClosed", "(Z)V", "getFileHandle", "()Lokio/FileHandle;", "getPosition", "()J", "setPosition", "(J)V", "close", HttpUrl.FRAGMENT_ENCODE_SET, "read", "sink", "Lokio/Buffer;", "byteCount", "timeout", "Lokio/Timeout;", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
                public static final class FileHandleSource implements Source {
                    private boolean closed;
                    private final FileHandle fileHandle;
                    private long position;

                    public FileHandleSource(FileHandle fileHandle, long j) {
/* 1 */                 fileHandle.getClass();
/* 7 */                 this.fileHandle = fileHandle;
/* 9 */                 this.position = j;
                    }

                    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
/* 3 */                 if (this.closed) {
/* 5 */                     return;
                        }
/* 7 */                 this.closed = true;
/* 11 */                ReentrantLock lock = this.fileHandle.getLock();
/* 15 */                lock.lock();
                        try {
/* 1 */                     this.fileHandle.openStreamCount--;
/* 35 */                    if (this.fileHandle.openStreamCount == 0 && this.fileHandle.closed) {
/* 46 */                        lock.unlock();
/* 51 */                        this.fileHandle.protectedClose();
                            }
                        } finally {
/* 61 */                    lock.unlock();
                        }
                    }

                    public final boolean getClosed() {
/* 1 */                 return this.closed;
                    }

                    public final FileHandle getFileHandle() {
/* 1 */                 return this.fileHandle;
                    }

                    public final long getPosition() {
/* 1 */                 return this.position;
                    }

                    @Override // okio.Source
                    public long read(Buffer sink, long byteCount) throws IOException {
/* 1 */                 sink.getClass();
/* 6 */                 if (this.closed) {
/* 32 */                    f42.m3656l("closed");
/* 35 */                    return 0L;
                        }
/* 1 */                 long noCloseCheck = this.fileHandle.readNoCloseCheck(this.position, sink, byteCount);
/* 22 */                if (noCloseCheck != -1) {
/* 27 */                    this.position += noCloseCheck;
                        }
/* 29 */                return noCloseCheck;
                    }

                    public final void setClosed(boolean z) {
/* 1 */                 this.closed = z;
                    }

                    public final void setPosition(long j) {
/* 1 */                 this.position = j;
                    }

                    @Override // okio.Source
                    public Timeout timeout() {
/* 1 */                 return Timeout.NONE;
                    }
                }

                public FileHandle(boolean z) {
/* 4 */             this.readWrite = z;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final long readNoCloseCheck(long fileOffset, Buffer sink, long byteCount) throws IOException {
/* 9 */             if (byteCount < 0) {
/* 90 */                ds0.m3200q(pm2.m7488k("byteCount < 0: ", byteCount));
/* 5 */                 return 0L;
                    }
/* 11 */            long j = byteCount + fileOffset;
/* 12 */            long j2 = fileOffset;
/* 15 */            while (j2 < j) {
/* 18 */                Segment segmentWritableSegment$okio = sink.writableSegment$okio(1);
/* 22 */                byte[] bArr = segmentWritableSegment$okio.data;
/* 24 */                int i = segmentWritableSegment$okio.limit;
/* 37 */                int iProtectedRead = protectedRead(j2, bArr, i, (int) Math.min(j - j2, 8192 - i));
/* 42 */                if (iProtectedRead == -1) {
/* 48 */                    if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
/* 54 */                        sink.head = segmentWritableSegment$okio.pop();
/* 56 */                        SegmentPool.recycle(segmentWritableSegment$okio);
                            }
/* 61 */                    if (fileOffset != j2) {
                                break;
                            }
/* 63 */                    return -1L;
                        }
/* 69 */                segmentWritableSegment$okio.limit += iProtectedRead;
                        long j3 = iProtectedRead;
/* 72 */                j2 += j3;
/* 78 */                sink.setSize$okio(sink.size() + j3);
                    }
/* 82 */            return j2 - fileOffset;
                }

                public static /* synthetic */ Sink sink$default(FileHandle fileHandle, long j, int i, Object obj) throws IOException {
/* 1 */             if (obj != null) {
/* 16 */                C1951n4.m6866q("Super calls with default arguments not supported in this target, function: sink");
/* 19 */                return null;
                    }
/* 5 */             if ((i & 1) != 0) {
/* 7 */                 j = 0;
                    }
/* 9 */             return fileHandle.sink(j);
                }

                public static /* synthetic */ Source source$default(FileHandle fileHandle, long j, int i, Object obj) throws IOException {
/* 1 */             if (obj != null) {
/* 16 */                C1951n4.m6866q("Super calls with default arguments not supported in this target, function: source");
/* 19 */                return null;
                    }
/* 5 */             if ((i & 1) != 0) {
/* 7 */                 j = 0;
                    }
/* 9 */             return fileHandle.source(j);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void writeNoCloseCheck(long fileOffset, Buffer source, long byteCount) throws IOException {
/* 8 */             SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
/* 11 */            long j = fileOffset + byteCount;
/* 13 */            long j2 = fileOffset;
/* 16 */            while (j2 < j) {
/* 18 */                Segment segment = source.head;
/* 20 */                segment.getClass();
/* 35 */                int iMin = (int) Math.min(j - j2, segment.limit - segment.pos);
/* 40 */                FileHandle fileHandle = this;
/* 41 */                fileHandle.protectedWrite(j2, segment.data, segment.pos, iMin);
/* 47 */                segment.pos += iMin;
                        long j3 = iMin;
/* 50 */                j2 += j3;
/* 56 */                source.setSize$okio(source.size() - j3);
/* 63 */                if (segment.pos == segment.limit) {
/* 69 */                    source.head = segment.pop();
/* 71 */                    SegmentPool.recycle(segment);
                        }
/* 74 */                this = fileHandle;
                    }
                }

                public final Sink appendingSink() throws IOException {
/* 5 */             return sink(size());
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
/* 1 */             ReentrantLock reentrantLock = this.lock;
/* 3 */             reentrantLock.lock();
                    try {
/* 8 */                 if (this.closed) {
/* 10 */                    reentrantLock.unlock();
/* 13 */                    return;
                        }
/* 15 */                this.closed = true;
/* 19 */                if (this.openStreamCount != 0) {
/* 21 */                    reentrantLock.unlock();
                        } else {
/* 25 */                    reentrantLock.unlock();
/* 28 */                    protectedClose();
                        }
                    } catch (Throwable th) {
/* 33 */                reentrantLock.unlock();
/* 36 */                throw th;
                    }
                }

                public final void flush() throws IOException {
/* 3 */             if (!this.readWrite) {
/* 36 */                f42.m3656l("file handle is read-only");
/* 39 */                return;
                    }
/* 5 */             ReentrantLock reentrantLock = this.lock;
/* 7 */             reentrantLock.lock();
                    try {
/* 12 */                if (this.closed) {
/* 28 */                    throw new IllegalStateException("closed");
                        }
/* 14 */                reentrantLock.unlock();
/* 17 */                protectedFlush();
                    } catch (Throwable th) {
/* 30 */                reentrantLock.unlock();
/* 33 */                throw th;
                    }
                }

                public final ReentrantLock getLock() {
/* 1 */             return this.lock;
                }

                public final boolean getReadWrite() {
/* 1 */             return this.readWrite;
                }

                public final long position(Source source) throws IOException {
                    long size;
/* 1 */             source.getClass();
/* 8 */             if (source instanceof RealBufferedSource) {
/* 10 */                RealBufferedSource realBufferedSource = (RealBufferedSource) source;
/* 14 */                size = realBufferedSource.bufferField.size();
/* 18 */                source = realBufferedSource.source;
                    } else {
/* 21 */                size = 0;
                    }
/* 24 */            if (!(source instanceof FileHandleSource) || ((FileHandleSource) source).getFileHandle() != this) {
/* 57 */                C1951n4.m6859j("source was not created by this FileHandle");
/* 6 */                 return 0L;
                    }
/* 35 */            FileHandleSource fileHandleSource = (FileHandleSource) source;
/* 41 */            if (!fileHandleSource.getClosed()) {
/* 47 */                return fileHandleSource.getPosition() - size;
                    }
/* 51 */            f42.m3656l("closed");
/* 6 */             return 0L;
                }

                public abstract void protectedClose() throws IOException;

                public abstract void protectedFlush() throws IOException;

                public abstract int protectedRead(long fileOffset, byte[] array, int arrayOffset, int byteCount) throws IOException;

                public abstract void protectedResize(long size) throws IOException;

                public abstract long protectedSize() throws IOException;

                public abstract void protectedWrite(long fileOffset, byte[] array, int arrayOffset, int byteCount) throws IOException;

                public final int read(long fileOffset, byte[] array, int arrayOffset, int byteCount) throws IOException {
/* 1 */             array.getClass();
/* 4 */             ReentrantLock reentrantLock = this.lock;
/* 6 */             reentrantLock.lock();
                    try {
/* 11 */                if (this.closed) {
/* 28 */                    throw new IllegalStateException("closed");
                        }
/* 13 */                reentrantLock.unlock();
/* 16 */                return protectedRead(fileOffset, array, arrayOffset, byteCount);
                    } catch (Throwable th) {
/* 31 */                reentrantLock.unlock();
/* 34 */                throw th;
                    }
                }

                public final void reposition(Source source, long position) throws IOException {
/* 1 */             source.getClass();
/* 10 */            if (!(source instanceof RealBufferedSource)) {
/* 83 */                if (!(source instanceof FileHandleSource) || ((FileHandleSource) source).getFileHandle() != this) {
/* 110 */                   C1951n4.m6859j("source was not created by this FileHandle");
/* 113 */                   return;
                        }
/* 94 */                FileHandleSource fileHandleSource = (FileHandleSource) source;
/* 100 */               if (fileHandleSource.getClosed()) {
/* 106 */                   f42.m3656l("closed");
/* 109 */                   return;
                        } else {
/* 102 */                   fileHandleSource.setPosition(position);
/* 105 */                   return;
                        }
                    }
/* 12 */            RealBufferedSource realBufferedSource = (RealBufferedSource) source;
/* 14 */            Source source2 = realBufferedSource.source;
/* 18 */            if (!(source2 instanceof FileHandleSource) || ((FileHandleSource) source2).getFileHandle() != this) {
/* 77 */                C1951n4.m6859j("source was not created by this FileHandle");
/* 80 */                return;
                    }
/* 29 */            FileHandleSource fileHandleSource2 = (FileHandleSource) source2;
/* 35 */            if (fileHandleSource2.getClosed()) {
/* 73 */                f42.m3656l("closed");
/* 76 */                return;
                    }
/* 39 */            long size = realBufferedSource.bufferField.size();
/* 48 */            long position2 = position - (fileHandleSource2.getPosition() - size);
/* 54 */            if (0 <= position2 && position2 < size) {
/* 60 */                realBufferedSource.skip(position2);
                    } else {
/* 66 */                realBufferedSource.bufferField.clear();
/* 69 */                fileHandleSource2.setPosition(position);
                    }
                }

                public final void resize(long size) throws IOException {
/* 3 */             if (!this.readWrite) {
/* 36 */                f42.m3656l("file handle is read-only");
/* 39 */                return;
                    }
/* 5 */             ReentrantLock reentrantLock = this.lock;
/* 7 */             reentrantLock.lock();
                    try {
/* 12 */                if (this.closed) {
/* 28 */                    throw new IllegalStateException("closed");
                        }
/* 14 */                reentrantLock.unlock();
/* 17 */                protectedResize(size);
                    } catch (Throwable th) {
/* 30 */                reentrantLock.unlock();
/* 33 */                throw th;
                    }
                }

                public final Sink sink(long fileOffset) throws IOException {
/* 3 */             if (!this.readWrite) {
/* 45 */                f42.m3656l("file handle is read-only");
/* 48 */                return null;
                    }
/* 5 */             ReentrantLock reentrantLock = this.lock;
/* 7 */             reentrantLock.lock();
                    try {
/* 12 */                if (this.closed) {
/* 38 */                    throw new IllegalStateException("closed");
                        }
/* 18 */                this.openStreamCount++;
/* 20 */                reentrantLock.unlock();
/* 25 */                return new FileHandleSink(this, fileOffset);
                    } catch (Throwable th) {
/* 39 */                reentrantLock.unlock();
/* 42 */                throw th;
                    }
                }

                public final long size() throws IOException {
/* 1 */             ReentrantLock reentrantLock = this.lock;
/* 3 */             reentrantLock.lock();
                    try {
/* 8 */                 if (this.closed) {
/* 25 */                    throw new IllegalStateException("closed");
                        }
/* 10 */                reentrantLock.unlock();
/* 13 */                return protectedSize();
                    } catch (Throwable th) {
/* 27 */                reentrantLock.unlock();
/* 30 */                throw th;
                    }
                }

                public final Source source(long fileOffset) throws IOException {
/* 1 */             ReentrantLock reentrantLock = this.lock;
/* 3 */             reentrantLock.lock();
                    try {
/* 8 */                 if (this.closed) {
/* 34 */                    throw new IllegalStateException("closed");
                        }
/* 14 */                this.openStreamCount++;
/* 16 */                reentrantLock.unlock();
/* 21 */                return new FileHandleSource(this, fileOffset);
                    } catch (Throwable th) {
/* 35 */                reentrantLock.unlock();
/* 38 */                throw th;
                    }
                }

                public final void write(long fileOffset, byte[] array, int arrayOffset, int byteCount) throws IOException {
/* 1 */             array.getClass();
/* 6 */             if (!this.readWrite) {
/* 40 */                f42.m3656l("file handle is read-only");
/* 43 */                return;
                    }
/* 8 */             ReentrantLock reentrantLock = this.lock;
/* 10 */            reentrantLock.lock();
                    try {
/* 15 */                if (this.closed) {
/* 31 */                    throw new IllegalStateException("closed");
                        }
/* 17 */                reentrantLock.unlock();
/* 20 */                protectedWrite(fileOffset, array, arrayOffset, byteCount);
                    } catch (Throwable th) {
/* 34 */                reentrantLock.unlock();
/* 37 */                throw th;
                    }
                }

/* 34 */        public final long read(long fileOffset, Buffer sink, long byteCount) throws IOException {
                    sink.getClass();
/* 35 */            ReentrantLock reentrantLock = this.lock;
/* 36 */            reentrantLock.lock();
                    try {
/* 37 */                if (!this.closed) {
/* 38 */                    reentrantLock.unlock();
/* 39 */                    return readNoCloseCheck(fileOffset, sink, byteCount);
                        }
/* 40 */                throw new IllegalStateException("closed");
                    } catch (Throwable th) {
/* 41 */                reentrantLock.unlock();
                        throw th;
                    }
                }

/* 43 */        public final void write(long fileOffset, Buffer source, long byteCount) throws IOException {
                    source.getClass();
/* 44 */            if (this.readWrite) {
/* 45 */                ReentrantLock reentrantLock = this.lock;
/* 46 */                reentrantLock.lock();
                        try {
/* 47 */                    if (!this.closed) {
/* 48 */                        reentrantLock.unlock();
/* 49 */                        writeNoCloseCheck(fileOffset, source, byteCount);
                                return;
                            }
/* 50 */                    throw new IllegalStateException("closed");
                        } catch (Throwable th) {
/* 51 */                    reentrantLock.unlock();
                            throw th;
                        }
                    }
/* 52 */            f42.m3656l("file handle is read-only");
                }

/* 60 */        public final long position(Sink sink) throws IOException {
                    long size;
                    sink.getClass();
/* 61 */            if (sink instanceof RealBufferedSink) {
/* 62 */                RealBufferedSink realBufferedSink = (RealBufferedSink) sink;
/* 64 */                size = realBufferedSink.bufferField.size();
/* 65 */                sink = realBufferedSink.sink;
                    } else {
                        size = 0;
                    }
/* 66 */            if ((sink instanceof FileHandleSink) && ((FileHandleSink) sink).getFileHandle() == this) {
/* 67 */                FileHandleSink fileHandleSink = (FileHandleSink) sink;
                        if (!fileHandleSink.getClosed()) {
/* 68 */                    return fileHandleSink.getPosition() + size;
                        }
/* 69 */                f42.m3656l("closed");
                        return 0L;
                    }
/* 71 */            C1951n4.m6859j("sink was not created by this FileHandle");
                    return 0L;
                }

/* 113 */       public final void reposition(Sink sink, long position) throws IOException {
                    sink.getClass();
/* 114 */           if (sink instanceof RealBufferedSink) {
/* 115 */               RealBufferedSink realBufferedSink = (RealBufferedSink) sink;
                        Sink sink2 = realBufferedSink.sink;
/* 116 */               if ((sink2 instanceof FileHandleSink) && ((FileHandleSink) sink2).getFileHandle() == this) {
/* 117 */                   FileHandleSink fileHandleSink = (FileHandleSink) sink2;
                            if (!fileHandleSink.getClosed()) {
/* 118 */                       realBufferedSink.emit();
/* 119 */                       fileHandleSink.setPosition(position);
                                return;
                            } else {
/* 120 */                       f42.m3656l("closed");
                                return;
                            }
                        }
/* 121 */               C1951n4.m6859j("sink was not created by this FileHandle");
                        return;
                    }
/* 122 */           if ((sink instanceof FileHandleSink) && ((FileHandleSink) sink).getFileHandle() == this) {
/* 123 */               FileHandleSink fileHandleSink2 = (FileHandleSink) sink;
                        if (!fileHandleSink2.getClosed()) {
/* 124 */                   fileHandleSink2.setPosition(position);
                            return;
                        } else {
/* 125 */                   f42.m3656l("closed");
                            return;
                        }
                    }
/* 126 */           C1951n4.m6859j("sink was not created by this FileHandle");
                }
            }
