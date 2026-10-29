            package p000;
            
            /* JADX INFO: renamed from: ml */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1931ml extends dx1 {

                /* JADX INFO: renamed from: c */
                public static final C1931ml f13845c;

                static {
/* 5 */             C1968nl.f14354a.getClass();
/* 13 */            f13845c = new C1931ml(C2037ol.f14796a);
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: d */
                public final int mo1376d(Object obj) {
/* 1 */             byte[] bArr = (byte[]) obj;
/* 3 */             bArr.getClass();
/* 6 */             return bArr.length;
                }

                @Override // p000.AbstractC2048ow, p000.AbstractC0973h
                /* JADX INFO: renamed from: f */
                public final void mo1377f(InterfaceC1870ky interfaceC1870ky, int i, Object obj) {
/* 1 */             C1894ll c1894ll = (C1894ll) obj;
/* 3 */             c1894ll.getClass();
/* 8 */             byte bMo4368n = interfaceC1870ky.mo4368n(this.f7440b, i);
/* 7 */             c1894ll.mo1466b(c1894ll.mo1467d() + 1);
/* 15 */            byte[] bArr = c1894ll.f13372a;
/* 17 */            int i2 = c1894ll.f13373b;
/* 21 */            c1894ll.f13373b = i2 + 1;
/* 23 */            bArr[i2] = bMo4368n;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: g */
                public final Object mo1378g(Object obj) {
/* 1 */             byte[] bArr = (byte[]) obj;
/* 3 */             bArr.getClass();
/* 8 */             C1894ll c1894ll = new C1894ll();
/* 11 */            c1894ll.f13372a = bArr;
/* 14 */            c1894ll.f13373b = bArr.length;
/* 18 */            c1894ll.mo1466b(10);
/* 21 */            return c1894ll;
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: j */
                public final Object mo1379j() {
/* 2 */             return new byte[0];
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: k */
                public final void mo1380k(InterfaceC1907ly interfaceC1907ly, Object obj, int i) {
/* 1 */             byte[] bArr = (byte[]) obj;
/* 3 */             interfaceC1907ly.getClass();
/* 6 */             bArr.getClass();
/* 10 */            for (int i2 = 0; i2 < i; i2++) {
/* 16 */                interfaceC1907ly.mo1510n(this.f7440b, i2, bArr[i2]);
                    }
                }
            }
