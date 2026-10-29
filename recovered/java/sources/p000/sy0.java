            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class sy0 extends dx1 {

                /* JADX INFO: renamed from: c */
                public static final sy0 f16868c;

                static {
/* 5 */             j13.m5658t(ty0.f17302a);
/* 13 */            f16868c = new sy0(az0.f2143a);
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: d */
                public final int mo1376d(Object obj) {
/* 1 */             int[] iArr = (int[]) obj;
/* 3 */             iArr.getClass();
/* 6 */             return iArr.length;
                }

                @Override // p000.AbstractC2048ow, p000.AbstractC0973h
                /* JADX INFO: renamed from: f */
                public final void mo1377f(InterfaceC1870ky interfaceC1870ky, int i, Object obj) {
/* 1 */             qy0 qy0Var = (qy0) obj;
/* 3 */             qy0Var.getClass();
/* 8 */             int iMo4371q = interfaceC1870ky.mo4371q(this.f7440b, i);
/* 7 */             qy0Var.mo1466b(qy0Var.mo1467d() + 1);
/* 15 */            int[] iArr = qy0Var.f15798a;
/* 17 */            int i2 = qy0Var.f15799b;
/* 21 */            qy0Var.f15799b = i2 + 1;
/* 23 */            iArr[i2] = iMo4371q;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: g */
                public final Object mo1378g(Object obj) {
/* 1 */             int[] iArr = (int[]) obj;
/* 3 */             iArr.getClass();
/* 8 */             qy0 qy0Var = new qy0();
/* 11 */            qy0Var.f15798a = iArr;
/* 14 */            qy0Var.f15799b = iArr.length;
/* 18 */            qy0Var.mo1466b(10);
/* 21 */            return qy0Var;
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: j */
                public final Object mo1379j() {
/* 2 */             return new int[0];
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: k */
                public final void mo1380k(InterfaceC1907ly interfaceC1907ly, Object obj, int i) {
/* 1 */             int[] iArr = (int[]) obj;
/* 3 */             interfaceC1907ly.getClass();
/* 6 */             iArr.getClass();
/* 10 */            for (int i2 = 0; i2 < i; i2++) {
/* 16 */                interfaceC1907ly.mo1508l(i2, iArr[i2], this.f7440b);
                    }
                }
            }
