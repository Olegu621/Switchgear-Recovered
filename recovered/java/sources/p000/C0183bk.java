            package p000;
            
            /* JADX INFO: renamed from: bk */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C0183bk extends dx1 {

                /* JADX INFO: renamed from: c */
                public static final C0183bk f2459c;

                static {
/* 5 */             C0219ck.f2969a.getClass();
/* 13 */            f2459c = new C0183bk(C0920fk.f8246a);
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: d */
                public final int mo1376d(Object obj) {
/* 1 */             boolean[] zArr = (boolean[]) obj;
/* 3 */             zArr.getClass();
/* 6 */             return zArr.length;
                }

                @Override // p000.AbstractC2048ow, p000.AbstractC0973h
                /* JADX INFO: renamed from: f */
                public final void mo1377f(InterfaceC1870ky interfaceC1870ky, int i, Object obj) {
/* 1 */             C2553zj c2553zj = (C2553zj) obj;
/* 3 */             c2553zj.getClass();
/* 8 */             boolean zMo4374t = interfaceC1870ky.mo4374t(this.f7440b, i);
/* 7 */             c2553zj.mo1466b(c2553zj.mo1467d() + 1);
/* 15 */            boolean[] zArr = c2553zj.f20165a;
/* 17 */            int i2 = c2553zj.f20166b;
/* 21 */            c2553zj.f20166b = i2 + 1;
/* 23 */            zArr[i2] = zMo4374t;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: g */
                public final Object mo1378g(Object obj) {
/* 1 */             boolean[] zArr = (boolean[]) obj;
/* 3 */             zArr.getClass();
/* 8 */             C2553zj c2553zj = new C2553zj();
/* 11 */            c2553zj.f20165a = zArr;
/* 14 */            c2553zj.f20166b = zArr.length;
/* 18 */            c2553zj.mo1466b(10);
/* 21 */            return c2553zj;
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: j */
                public final Object mo1379j() {
/* 2 */             return new boolean[0];
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: k */
                public final void mo1380k(InterfaceC1907ly interfaceC1907ly, Object obj, int i) {
/* 1 */             boolean[] zArr = (boolean[]) obj;
/* 3 */             interfaceC1907ly.getClass();
/* 6 */             zArr.getClass();
/* 10 */            for (int i2 = 0; i2 < i; i2++) {
/* 16 */                interfaceC1907ly.mo1513q(this.f7440b, i2, zArr[i2]);
                    }
                }
            }
