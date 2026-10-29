            package p000;
            
            /* JADX INFO: renamed from: jt */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1805jt extends dx1 {

                /* JADX INFO: renamed from: c */
                public static final C1805jt f12475c;

                static {
/* 5 */             C1865kt.f12999a.getClass();
/* 13 */            f12475c = new C1805jt(C2193st.f16759a);
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: d */
                public final int mo1376d(Object obj) {
/* 1 */             char[] cArr = (char[]) obj;
/* 3 */             cArr.getClass();
/* 6 */             return cArr.length;
                }

                @Override // p000.AbstractC2048ow, p000.AbstractC0973h
                /* JADX INFO: renamed from: f */
                public final void mo1377f(InterfaceC1870ky interfaceC1870ky, int i, Object obj) {
/* 1 */             C0966gt c0966gt = (C0966gt) obj;
/* 3 */             c0966gt.getClass();
/* 8 */             char cMo4366k = interfaceC1870ky.mo4366k(this.f7440b, i);
/* 7 */             c0966gt.mo1466b(c0966gt.mo1467d() + 1);
/* 15 */            char[] cArr = c0966gt.f8803a;
/* 17 */            int i2 = c0966gt.f8804b;
/* 21 */            c0966gt.f8804b = i2 + 1;
/* 23 */            cArr[i2] = cMo4366k;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: g */
                public final Object mo1378g(Object obj) {
/* 1 */             char[] cArr = (char[]) obj;
/* 3 */             cArr.getClass();
/* 8 */             C0966gt c0966gt = new C0966gt();
/* 11 */            c0966gt.f8803a = cArr;
/* 14 */            c0966gt.f8804b = cArr.length;
/* 18 */            c0966gt.mo1466b(10);
/* 21 */            return c0966gt;
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: j */
                public final Object mo1379j() {
/* 2 */             return new char[0];
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: k */
                public final void mo1380k(InterfaceC1907ly interfaceC1907ly, Object obj, int i) {
/* 1 */             char[] cArr = (char[]) obj;
/* 3 */             interfaceC1907ly.getClass();
/* 6 */             cArr.getClass();
/* 10 */            for (int i2 = 0; i2 < i; i2++) {
/* 16 */                interfaceC1907ly.mo1520x(this.f7440b, i2, cArr[i2]);
                    }
                }
            }
