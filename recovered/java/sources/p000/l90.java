            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class l90 extends dx1 {

                /* JADX INFO: renamed from: c */
                public static final l90 f13156c;

                static {
/* 5 */             n90.f14166a.getClass();
/* 13 */            f13156c = new l90(o90.f14676a);
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: d */
                public final int mo1376d(Object obj) {
/* 1 */             double[] dArr = (double[]) obj;
/* 3 */             dArr.getClass();
/* 6 */             return dArr.length;
                }

                @Override // p000.AbstractC2048ow, p000.AbstractC0973h
                /* JADX INFO: renamed from: f */
                public final void mo1377f(InterfaceC1870ky interfaceC1870ky, int i, Object obj) {
/* 1 */             j90 j90Var = (j90) obj;
/* 3 */             j90Var.getClass();
/* 8 */             double dMo4364j = interfaceC1870ky.mo4364j(this.f7440b, i);
/* 7 */             j90Var.mo1466b(j90Var.mo1467d() + 1);
/* 15 */            double[] dArr = j90Var.f12149a;
/* 17 */            int i2 = j90Var.f12150b;
/* 21 */            j90Var.f12150b = i2 + 1;
/* 23 */            dArr[i2] = dMo4364j;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: g */
                public final Object mo1378g(Object obj) {
/* 1 */             double[] dArr = (double[]) obj;
/* 3 */             dArr.getClass();
/* 8 */             j90 j90Var = new j90();
/* 11 */            j90Var.f12149a = dArr;
/* 14 */            j90Var.f12150b = dArr.length;
/* 18 */            j90Var.mo1466b(10);
/* 21 */            return j90Var;
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: j */
                public final Object mo1379j() {
/* 2 */             return new double[0];
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: k */
                public final void mo1380k(InterfaceC1907ly interfaceC1907ly, Object obj, int i) {
/* 1 */             double[] dArr = (double[]) obj;
/* 3 */             interfaceC1907ly.getClass();
/* 6 */             dArr.getClass();
/* 10 */            for (int i2 = 0; i2 < i; i2++) {
/* 16 */                interfaceC1907ly.mo1501e(this.f7440b, i2, dArr[i2]);
                    }
                }
            }
