            package com.google.firebase.installations;

            import android.content.Context;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.File;
            import java.io.IOException;
            import java.io.RandomAccessFile;
            import java.nio.channels.FileChannel;
            import java.nio.channels.FileLock;
            import java.nio.channels.OverlappingFileLockException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class CrossProcessLock {
                private static final String TAG = "CrossProcessLock";
                private final FileChannel channel;
                private final FileLock lock;

                private CrossProcessLock(FileChannel fileChannel, FileLock fileLock) {
/* 4 */             this.channel = fileChannel;
/* 6 */             this.lock = fileLock;
                }

                /* JADX WARN: Code duplicated, block: B:33:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:35:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                public static CrossProcessLock acquire(Context context, String str) {
                    FileChannel channel;
                    FileLock fileLockLock;
                    try {
/* 18 */                channel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
                        try {
/* 22 */                    fileLockLock = channel.lock();
                            try {
/* 28 */                        return new CrossProcessLock(channel, fileLockLock);
                            } catch (IOException e) {
/* 36 */                        e = e;
/* 57 */                        AbstractC1245n0.m4877e(TAG, "encountered error while creating and acquiring the lock, ignoring", e);
/* 60 */                        if (fileLockLock != null) {
                                    try {
/* 62 */                                fileLockLock.release();
                                    } catch (IOException unused) {
                                    }
                                }
/* 65 */                        if (channel != null) {
                                    try {
/* 67 */                                channel.close();
                                    } catch (IOException unused2) {
                                    }
                                }
/* 1 */                         return null;
                            } catch (Error e2) {
/* 34 */                        e = e2;
/* 57 */                        AbstractC1245n0.m4877e(TAG, "encountered error while creating and acquiring the lock, ignoring", e);
/* 60 */                        if (fileLockLock != null) {
/* 62 */                            fileLockLock.release();
                                }
/* 65 */                        if (channel != null) {
/* 67 */                            channel.close();
                                }
/* 1 */                         return null;
                            } catch (OverlappingFileLockException e3) {
/* 32 */                        e = e3;
/* 57 */                        AbstractC1245n0.m4877e(TAG, "encountered error while creating and acquiring the lock, ignoring", e);
/* 60 */                        if (fileLockLock != null) {
/* 62 */                            fileLockLock.release();
                                }
/* 65 */                        if (channel != null) {
/* 67 */                            channel.close();
                                }
/* 1 */                         return null;
                            }
                        } catch (IOException | Error | OverlappingFileLockException e4) {
/* 41 */                    e = e4;
/* 39 */                    fileLockLock = null;
                        }
                    } catch (IOException | Error | OverlappingFileLockException e5) {
/* 51 */                e = e5;
/* 46 */                channel = null;
/* 47 */                fileLockLock = null;
                    }
                }

                public void releaseAndClose() {
                    try {
/* 3 */                 this.lock.release();
/* 8 */                 this.channel.close();
                    } catch (IOException e) {
/* 17 */                AbstractC1245n0.m4877e(TAG, "encountered error while releasing, ignoring", e);
                    }
                }
            }
