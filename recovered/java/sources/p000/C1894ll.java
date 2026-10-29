            package p000;

            import java.util.Arrays;
            
            /* JADX INFO: renamed from: ll */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1894ll extends bx1 {

                /* JADX INFO: renamed from: a */
                public byte[] f13372a;

                /* JADX INFO: renamed from: b */
                public int f13373b;

                @Override // p000.bx1
                /* JADX INFO: renamed from: a */
                public final Object mo1465a() {
/* 5 */             return Arrays.copyOf(this.f13372a, this.f13373b);
                }

                @Override // p000.bx1
                /* JADX INFO: renamed from: b */
                public final void mo1466b(int i) {
/* 1 */             byte[] bArr = this.f13372a;
/* 4 */             if (bArr.length < i) {
/* 7 */                 int length = bArr.length * 2;
/* 9 */                 if (i < length) {
/* 11 */                    i = length;
                        }
/* 16 */                this.f13372a = Arrays.copyOf(bArr, i);
                    }
                }

                @Override // p000.bx1
                /* JADX INFO: renamed from: d */
                public final int mo1467d() {
/* 1 */             return this.f13373b;
                }
            }
