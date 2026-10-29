            package p000;

            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class pw2 extends dx1 {

                /* JADX INFO: renamed from: c */
                public static final pw2 f15300c;

                static {
/* 5 */             mw2.f14054b.getClass();
/* 13 */            f15300c = new pw2(qw2.f15786a);
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: d */
                public final int mo1376d(Object obj) {
/* 5 */             return ((nw2) obj).f14553a.length;
                }

                @Override // p000.AbstractC2048ow, p000.AbstractC0973h
                /* JADX INFO: renamed from: f */
                public final void mo1377f(InterfaceC1870ky interfaceC1870ky, int i, Object obj) {
/* 1 */             ow2 ow2Var = (ow2) obj;
/* 3 */             ow2Var.getClass();
/* 12 */            int iMo4369o = interfaceC1870ky.mo4359e(this.f7440b, i).mo4369o();
/* 16 */            lw2 lw2Var = mw2.f14054b;
/* 7 */             ow2Var.mo1466b(ow2Var.mo1467d() + 1);
/* 21 */            int[] iArr = ow2Var.f14909a;
/* 23 */            int i2 = ow2Var.f14910b;
/* 27 */            ow2Var.f14910b = i2 + 1;
/* 29 */            iArr[i2] = iMo4369o;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: g */
                public final Object mo1378g(Object obj) {
/* 3 */             int[] iArr = ((nw2) obj).f14553a;
/* 7 */             ow2 ow2Var = new ow2();
/* 10 */            ow2Var.f14909a = iArr;
/* 13 */            ow2Var.f14910b = iArr.length;
/* 17 */            ow2Var.mo1466b(10);
/* 20 */            return ow2Var;
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: j */
                public final Object mo1379j() {
/* 6 */             return new nw2(new int[0]);
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: k */
                public final void mo1380k(InterfaceC1907ly interfaceC1907ly, Object obj, int i) {
/* 3 */             int[] iArr = ((nw2) obj).f14553a;
/* 5 */             interfaceC1907ly.getClass();
/* 9 */             for (int i2 = 0; i2 < i; i2++) {
/* 13 */                Encoder encoderMo1486C = interfaceC1907ly.mo1486C(this.f7440b, i2);
/* 17 */                int i3 = iArr[i2];
/* 19 */                lw2 lw2Var = mw2.f14054b;
/* 21 */                encoderMo1486C.mo1521y(i3);
                    }
                }
            }
