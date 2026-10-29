            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class ka1 extends dx1 {

                /* JADX INFO: renamed from: c */
                public static final ka1 f12666c;

                static {
/* 5 */             la1.f13161a.getClass();
/* 13 */            f12666c = new ka1(sa1.f16487a);
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: d */
                public final int mo1376d(Object obj) {
/* 1 */             long[] jArr = (long[]) obj;
/* 3 */             jArr.getClass();
/* 6 */             return jArr.length;
                }

                @Override // p000.AbstractC2048ow, p000.AbstractC0973h
                /* JADX INFO: renamed from: f */
                public final void mo1377f(InterfaceC1870ky interfaceC1870ky, int i, Object obj) {
/* 1 */             ia1 ia1Var = (ia1) obj;
/* 3 */             ia1Var.getClass();
/* 8 */             long jMo4363i = interfaceC1870ky.mo4363i(this.f7440b, i);
/* 7 */             ia1Var.mo1466b(ia1Var.mo1467d() + 1);
/* 15 */            long[] jArr = ia1Var.f9511a;
/* 17 */            int i2 = ia1Var.f9512b;
/* 21 */            ia1Var.f9512b = i2 + 1;
/* 23 */            jArr[i2] = jMo4363i;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: g */
                public final Object mo1378g(Object obj) {
/* 1 */             long[] jArr = (long[]) obj;
/* 3 */             jArr.getClass();
/* 8 */             ia1 ia1Var = new ia1();
/* 11 */            ia1Var.f9511a = jArr;
/* 14 */            ia1Var.f9512b = jArr.length;
/* 18 */            ia1Var.mo1466b(10);
/* 21 */            return ia1Var;
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: j */
                public final Object mo1379j() {
/* 2 */             return new long[0];
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: k */
                public final void mo1380k(InterfaceC1907ly interfaceC1907ly, Object obj, int i) {
/* 1 */             long[] jArr = (long[]) obj;
/* 3 */             interfaceC1907ly.getClass();
/* 6 */             jArr.getClass();
/* 10 */            for (int i2 = 0; i2 < i; i2++) {
/* 16 */                interfaceC1907ly.mo1487D(this.f7440b, i2, jArr[i2]);
                    }
                }
            }
