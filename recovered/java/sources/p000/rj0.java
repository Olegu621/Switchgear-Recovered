            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class rj0 extends dx1 {

                /* JADX INFO: renamed from: c */
                public static final rj0 f16117c;

                static {
/* 5 */             sj0.f16655a.getClass();
/* 13 */            f16117c = new rj0(tj0.f17125a);
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: d */
                public final int mo1376d(Object obj) {
/* 1 */             float[] fArr = (float[]) obj;
/* 3 */             fArr.getClass();
/* 6 */             return fArr.length;
                }

                @Override // p000.AbstractC2048ow, p000.AbstractC0973h
                /* JADX INFO: renamed from: f */
                public final void mo1377f(InterfaceC1870ky interfaceC1870ky, int i, Object obj) {
/* 1 */             oj0 oj0Var = (oj0) obj;
/* 3 */             oj0Var.getClass();
/* 8 */             float fMo4367l = interfaceC1870ky.mo4367l(this.f7440b, i);
/* 7 */             oj0Var.mo1466b(oj0Var.mo1467d() + 1);
/* 15 */            float[] fArr = oj0Var.f14777a;
/* 17 */            int i2 = oj0Var.f14778b;
/* 21 */            oj0Var.f14778b = i2 + 1;
/* 23 */            fArr[i2] = fMo4367l;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: g */
                public final Object mo1378g(Object obj) {
/* 1 */             float[] fArr = (float[]) obj;
/* 3 */             fArr.getClass();
/* 8 */             oj0 oj0Var = new oj0();
/* 11 */            oj0Var.f14777a = fArr;
/* 14 */            oj0Var.f14778b = fArr.length;
/* 18 */            oj0Var.mo1466b(10);
/* 21 */            return oj0Var;
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: j */
                public final Object mo1379j() {
/* 2 */             return new float[0];
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: k */
                public final void mo1380k(InterfaceC1907ly interfaceC1907ly, Object obj, int i) {
/* 1 */             float[] fArr = (float[]) obj;
/* 3 */             interfaceC1907ly.getClass();
/* 6 */             fArr.getClass();
/* 10 */            for (int i2 = 0; i2 < i; i2++) {
/* 16 */                interfaceC1907ly.mo1512p(this.f7440b, i2, fArr[i2]);
                    }
                }
            }
