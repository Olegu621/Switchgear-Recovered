            package p000;

            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.OutputStream;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public final class ix2 extends OutputStream {

                /* JADX INFO: renamed from: a */
                public final FileOutputStream f11953a;

                public ix2(FileOutputStream fileOutputStream) {
/* 1 */             fileOutputStream.getClass();
/* 7 */             this.f11953a = fileOutputStream;
                }

                @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }

                @Override // java.io.OutputStream, java.io.Flushable
                public final void flush() throws IOException {
/* 3 */             this.f11953a.flush();
                }

                @Override // java.io.OutputStream
                public final void write(byte[] bArr) throws IOException {
/* 1 */             bArr.getClass();
/* 6 */             this.f11953a.write(bArr);
                }

                @Override // java.io.OutputStream
/* 9 */         public final void write(int i) throws IOException {
/* 10 */            this.f11953a.write(i);
                }

                @Override // java.io.OutputStream
/* 10 */        public final void write(byte[] bArr, int i, int i2) throws IOException {
                    bArr.getClass();
/* 11 */            this.f11953a.write(bArr, i, i2);
                }
            }
