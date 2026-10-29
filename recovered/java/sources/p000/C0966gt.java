            package p000;

            import java.util.Arrays;
            
            /* JADX INFO: renamed from: gt */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C0966gt extends bx1 {

                /* JADX INFO: renamed from: a */
                public char[] f8803a;

                /* JADX INFO: renamed from: b */
                public int f8804b;

                @Override // p000.bx1
                /* JADX INFO: renamed from: a */
                public final Object mo1465a() {
/* 5 */             return Arrays.copyOf(this.f8803a, this.f8804b);
                }

                @Override // p000.bx1
                /* JADX INFO: renamed from: b */
                public final void mo1466b(int i) {
/* 1 */             char[] cArr = this.f8803a;
/* 4 */             if (cArr.length < i) {
/* 7 */                 int length = cArr.length * 2;
/* 9 */                 if (i < length) {
/* 11 */                    i = length;
                        }
/* 16 */                this.f8803a = Arrays.copyOf(cArr, i);
                    }
                }

                @Override // p000.bx1
                /* JADX INFO: renamed from: d */
                public final int mo1467d() {
/* 1 */             return this.f8804b;
                }
            }
