            package p000;

            import java.io.FilterInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            
            /* JADX INFO: renamed from: pl */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 30 */    public final class C2074pl extends FilterInputStream {

                /* JADX INFO: renamed from: a */
                public long f15165a;

                /* JADX INFO: renamed from: b */
                public long f15166b;

                public C2074pl(InputStream inputStream) {
/* 1 */             super(inputStream);
/* 6 */             this.f15166b = -1L;
/* 11 */            this.f15165a = 1048577L;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public final int available() {
/* 14 */            return (int) Math.min(((FilterInputStream) this).in.available(), this.f15165a);
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public final synchronized void mark(int i) {
/* 4 */             ((FilterInputStream) this).in.mark(i);
/* 9 */             this.f15166b = this.f15165a;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             long j = this.f15165a;
/* 8 */             if (j == 0) {
/* 7 */                 return -1;
                    }
/* 19 */            int i3 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
/* 23 */            if (i3 != -1) {
/* 29 */                this.f15165a -= (long) i3;
                    }
/* 31 */            return i3;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public final synchronized void reset() {
/* 8 */             if (!((FilterInputStream) this).in.markSupported()) {
/* 46 */                throw new IOException("Mark not supported");
                    }
/* 16 */            if (this.f15166b == -1) {
/* 38 */                throw new IOException("Mark not set");
                    }
/* 20 */            ((FilterInputStream) this).in.reset();
/* 25 */            this.f15165a = this.f15166b;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public final long skip(long j) throws IOException {
/* 9 */             long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.f15165a));
/* 16 */            this.f15165a -= jSkip;
/* 18 */            return jSkip;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
/* 31 */        public final int read() throws IOException {
                    if (this.f15165a == 0) {
                        return -1;
                    }
/* 33 */            int i = ((FilterInputStream) this).in.read();
                    if (i != -1) {
/* 34 */                this.f15165a--;
                    }
                    return i;
                }
            }
