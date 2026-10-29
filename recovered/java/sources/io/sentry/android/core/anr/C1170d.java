            package io.sentry.android.core.anr;

            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.cache.tape.AbstractC1407f;
            import io.sentry.cache.tape.C1403b;
            import io.sentry.cache.tape.C1405d;
            import io.sentry.cache.tape.C1410i;
            import io.sentry.hints.C1482j;
            import java.io.File;
            import java.io.IOException;
            import java.io.RandomAccessFile;
            
            /* JADX INFO: renamed from: io.sentry.android.core.anr.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1170d implements AutoCloseable {

                /* JADX INFO: renamed from: a */
                public final AbstractC1407f f9958a;

                public C1170d(C1554m6 c1554m6, File file) {
                    C1410i c1410i;
/* 4 */             ILogger logger = c1554m6.getLogger();
                    try {
/* 10 */                RandomAccessFile randomAccessFileM5135c = C1410i.m5135c(file);
                        try {
                            try {
/* 16 */                        c1410i = new C1410i(file, randomAccessFileM5135c, 120);
                            } catch (Throwable th) {
/* 21 */                        randomAccessFileM5135c.close();
/* 24 */                        throw th;
                            }
                        } catch (IOException e) {
/* 59 */                    logger.mo4671d(EnumC1553m5.ERROR, "Failed to create stacktrace queue", e);
/* 62 */                    c1410i = null;
                        }
                    } catch (IOException unused) {
/* 29 */                if (!file.delete()) {
/* 53 */                    throw new IOException("Could not delete file");
                        }
/* 31 */                RandomAccessFile randomAccessFileM5135c2 = C1410i.m5135c(file);
                        try {
/* 37 */                    c1410i = new C1410i(file, randomAccessFileM5135c2, 120);
                        } catch (Throwable th2) {
/* 42 */                    randomAccessFileM5135c2.close();
/* 45 */                    throw th2;
                        }
                    }
/* 63 */            if (c1410i == null) {
/* 70 */                this.f9958a = new C1403b();
                    } else {
/* 83 */                this.f9958a = new C1405d(c1410i, new C1482j());
                    }
                }

                @Override // java.lang.AutoCloseable
                public final void close() {
/* 3 */             this.f9958a.close();
                }
            }
