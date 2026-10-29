            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class sd2 extends dx1 {

                /* JADX INFO: renamed from: c */
                public static final sd2 f16541c;

                static {
/* 5 */             td2.f17051a.getClass();
/* 13 */            f16541c = new sd2(ud2.f17475a);
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: d */
                public final int mo1376d(Object obj) {
/* 1 */             short[] sArr = (short[]) obj;
/* 3 */             sArr.getClass();
/* 6 */             return sArr.length;
                }

                @Override // p000.AbstractC2048ow, p000.AbstractC0973h
                /* JADX INFO: renamed from: f */
                public final void mo1377f(InterfaceC1870ky interfaceC1870ky, int i, Object obj) {
/* 1 */             rd2 rd2Var = (rd2) obj;
/* 3 */             rd2Var.getClass();
/* 8 */             short sMo4370p = interfaceC1870ky.mo4370p(this.f7440b, i);
/* 7 */             rd2Var.mo1466b(rd2Var.mo1467d() + 1);
/* 15 */            short[] sArr = rd2Var.f15998a;
/* 17 */            int i2 = rd2Var.f15999b;
/* 21 */            rd2Var.f15999b = i2 + 1;
/* 23 */            sArr[i2] = sMo4370p;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: g */
                public final Object mo1378g(Object obj) {
/* 1 */             short[] sArr = (short[]) obj;
/* 3 */             sArr.getClass();
/* 8 */             rd2 rd2Var = new rd2();
/* 11 */            rd2Var.f15998a = sArr;
/* 14 */            rd2Var.f15999b = sArr.length;
/* 18 */            rd2Var.mo1466b(10);
/* 21 */            return rd2Var;
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: j */
                public final Object mo1379j() {
/* 2 */             return new short[0];
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: k */
                public final void mo1380k(InterfaceC1907ly interfaceC1907ly, Object obj, int i) {
/* 1 */             short[] sArr = (short[]) obj;
/* 3 */             interfaceC1907ly.getClass();
/* 6 */             sArr.getClass();
/* 10 */            for (int i2 = 0; i2 < i; i2++) {
/* 16 */                interfaceC1907ly.mo1516t(this.f7440b, i2, sArr[i2]);
                    }
                }
            }
