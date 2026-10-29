            package p000;

            import java.io.OutputStream;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 25 */    public final class p61 extends OutputStream {

                /* JADX INFO: renamed from: a */
                public long f14982a;

                @Override // java.io.OutputStream
                public final void write(byte[] bArr, int i, int i2) {
                    int i3;
/* 1 */             if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
/* 26 */                throw new IndexOutOfBoundsException();
                    }
/* 18 */            this.f14982a += (long) i2;
                }

                @Override // java.io.OutputStream
/* 26 */        public final void write(byte[] bArr) {
/* 27 */            this.f14982a += (long) bArr.length;
                }

                @Override // java.io.OutputStream
/* 27 */        public final void write(int i) {
/* 28 */            this.f14982a++;
                }
            }
