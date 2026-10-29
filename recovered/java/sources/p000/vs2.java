            package p000;

            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class vs2 extends bx1 {

                /* JADX INFO: renamed from: a */
                public byte[] f18346a;

                /* JADX INFO: renamed from: b */
                public int f18347b;

                @Override // p000.bx1
                /* JADX INFO: renamed from: a */
                public final Object mo1465a() {
/* 11 */            return new us2(Arrays.copyOf(this.f18346a, this.f18347b));
                }

                @Override // p000.bx1
                /* JADX INFO: renamed from: b */
                public final void mo1466b(int i) {
/* 1 */             byte[] bArr = this.f18346a;
/* 4 */             if (bArr.length < i) {
/* 7 */                 int length = bArr.length * 2;
/* 9 */                 if (i < length) {
/* 11 */                    i = length;
                        }
/* 16 */                this.f18346a = Arrays.copyOf(bArr, i);
                    }
                }

                @Override // p000.bx1
                /* JADX INFO: renamed from: d */
                public final int mo1467d() {
/* 1 */             return this.f18347b;
                }
            }
