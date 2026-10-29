            package io.sentry.android.core;

            import java.io.BufferedInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import p000.C1822k8;
            
            /* JADX INFO: renamed from: io.sentry.android.core.a1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 29 */    public final class C1165a1 extends InputStream {

                /* JADX INFO: renamed from: a */
                public final BufferedInputStream f9928a;

                /* JADX INFO: renamed from: b */
                public long f9929b;

                public C1165a1(BufferedInputStream bufferedInputStream, int i) {
/* 4 */             this.f9928a = bufferedInputStream;
/* 7 */             this.f9929b = i;
                }

                @Override // java.io.InputStream
                public final int available() {
/* 10 */            return Math.min(this.f9928a.available(), (int) this.f9929b);
                }

                @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 5 */             C1822k8.m6006l(this.f9928a, this.f9929b);
/* 10 */            this.f9929b = 0L;
                }

                @Override // java.io.InputStream
                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             long j = this.f9929b;
/* 7 */             if (j <= 0) {
/* 9 */                 return -1;
                    }
/* 18 */            int i3 = this.f9928a.read(bArr, i, Math.min(i2, (int) j));
/* 22 */            if (i3 > 0) {
/* 28 */                this.f9929b -= (long) i3;
                    }
/* 30 */            return i3;
                }

                @Override // java.io.InputStream
                public final long skip(long j) throws IOException {
/* 9 */             long jSkip = this.f9928a.skip(Math.min(j, this.f9929b));
/* 16 */            this.f9929b -= jSkip;
/* 18 */            return jSkip;
                }

                @Override // java.io.InputStream
/* 30 */        public final int read() throws IOException {
                    if (this.f9929b <= 0) {
                        return -1;
                    }
/* 32 */            int i = this.f9928a.read();
                    if (i != -1) {
/* 33 */                this.f9929b--;
                    }
                    return i;
                }
            }
