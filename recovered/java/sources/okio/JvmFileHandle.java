            package okio;

            import java.io.RandomAccessFile;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\bH\u0014J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\rH\u0014J\b\u0010\u0014\u001a\u00020\rH\u0014J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m6176d2 = {"Lokio/JvmFileHandle;", "Lokio/FileHandle;", "readWrite", HttpUrl.FRAGMENT_ENCODE_SET, "randomAccessFile", "Ljava/io/RandomAccessFile;", "(ZLjava/io/RandomAccessFile;)V", "protectedClose", HttpUrl.FRAGMENT_ENCODE_SET, "protectedFlush", "protectedRead", HttpUrl.FRAGMENT_ENCODE_SET, "fileOffset", HttpUrl.FRAGMENT_ENCODE_SET, "array", HttpUrl.FRAGMENT_ENCODE_SET, "arrayOffset", "byteCount", "protectedResize", "size", "protectedSize", "protectedWrite", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class JvmFileHandle extends FileHandle {
                private final RandomAccessFile randomAccessFile;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public JvmFileHandle(boolean z, RandomAccessFile randomAccessFile) {
/* 4 */             super(z);
/* 1 */             randomAccessFile.getClass();
/* 7 */             this.randomAccessFile = randomAccessFile;
                }

                @Override // okio.FileHandle
                public synchronized void protectedClose() {
/* 4 */             this.randomAccessFile.close();
                }

                @Override // okio.FileHandle
                public synchronized void protectedFlush() {
/* 8 */             this.randomAccessFile.getFD().sync();
                }

                @Override // okio.FileHandle
                public synchronized int protectedRead(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
/* 2 */             array.getClass();
/* 7 */             this.randomAccessFile.seek(fileOffset);
/* 10 */            int i = 0;
/* 11 */            while (i < byteCount) {
/* 17 */                int i2 = this.randomAccessFile.read(array, arrayOffset, byteCount - i);
/* 22 */                if (i2 == -1) {
/* 24 */                    if (i != 0) {
                                break;
                            }
/* 21 */                    return -1;
                        }
/* 28 */                i += i2;
                    }
/* 33 */            return i;
                }

                @Override // okio.FileHandle
                public synchronized void protectedResize(long size) throws Throwable {
                    JvmFileHandle jvmFileHandle;
                    try {
                        try {
/* 2 */                     long size2 = size();
/* 6 */                     long j = size - size2;
/* 12 */                    if (j > 0) {
/* 14 */                        int i = (int) j;
/* 18 */                        jvmFileHandle = this;
/* 19 */                        jvmFileHandle.protectedWrite(size2, new byte[i], 0, i);
                            } else {
/* 29 */                        jvmFileHandle = this;
/* 32 */                        jvmFileHandle.randomAccessFile.setLength(size);
                            }
/* 36 */                    return;
                        } catch (Throwable th) {
/* 23 */                    th = th;
/* 38 */                    throw th;
                        }
                    } catch (Throwable th2) {
/* 26 */                th = th2;
/* 38 */                throw th;
                    }
/* 38 */            throw th;
                }

                @Override // okio.FileHandle
                public synchronized long protectedSize() {
/* 4 */             return this.randomAccessFile.length();
                }

                @Override // okio.FileHandle
                public synchronized void protectedWrite(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
/* 2 */             array.getClass();
/* 7 */             this.randomAccessFile.seek(fileOffset);
/* 12 */            this.randomAccessFile.write(array, arrayOffset, byteCount);
                }
            }
