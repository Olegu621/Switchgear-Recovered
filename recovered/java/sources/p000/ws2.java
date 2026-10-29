            package p000;

            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class ws2 extends dx1 {

                /* JADX INFO: renamed from: c */
                public static final ws2 f18800c;

                static {
/* 5 */             ts2.f17251b.getClass();
/* 13 */            f18800c = new ws2(xs2.f19353a);
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: d */
                public final int mo1376d(Object obj) {
/* 5 */             return ((us2) obj).f17713a.length;
                }

                @Override // p000.AbstractC2048ow, p000.AbstractC0973h
                /* JADX INFO: renamed from: f */
                public final void mo1377f(InterfaceC1870ky interfaceC1870ky, int i, Object obj) {
/* 1 */             vs2 vs2Var = (vs2) obj;
/* 3 */             vs2Var.getClass();
/* 12 */            byte bMo4351B = interfaceC1870ky.mo4359e(this.f7440b, i).mo4351B();
/* 16 */            ss2 ss2Var = ts2.f17251b;
/* 7 */             vs2Var.mo1466b(vs2Var.mo1467d() + 1);
/* 21 */            byte[] bArr = vs2Var.f18346a;
/* 23 */            int i2 = vs2Var.f18347b;
/* 27 */            vs2Var.f18347b = i2 + 1;
/* 29 */            bArr[i2] = bMo4351B;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: g */
                public final Object mo1378g(Object obj) {
/* 3 */             byte[] bArr = ((us2) obj).f17713a;
/* 7 */             vs2 vs2Var = new vs2();
/* 10 */            vs2Var.f18346a = bArr;
/* 13 */            vs2Var.f18347b = bArr.length;
/* 17 */            vs2Var.mo1466b(10);
/* 20 */            return vs2Var;
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: j */
                public final Object mo1379j() {
/* 6 */             return new us2(new byte[0]);
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: k */
                public final void mo1380k(InterfaceC1907ly interfaceC1907ly, Object obj, int i) {
/* 3 */             byte[] bArr = ((us2) obj).f17713a;
/* 5 */             interfaceC1907ly.getClass();
/* 9 */             for (int i2 = 0; i2 < i; i2++) {
/* 13 */                Encoder encoderMo1486C = interfaceC1907ly.mo1486C(this.f7440b, i2);
/* 17 */                byte b = bArr[i2];
/* 19 */                ss2 ss2Var = ts2.f17251b;
/* 21 */                encoderMo1486C.mo1506j(b);
                    }
                }
            }
