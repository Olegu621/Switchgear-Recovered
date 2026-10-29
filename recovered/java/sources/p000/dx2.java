            package p000;

            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class dx2 extends dx1 {

                /* JADX INFO: renamed from: c */
                public static final dx2 f7441c;

                static {
/* 5 */             ax2.f2137b.getClass();
/* 13 */            f7441c = new dx2(ex2.f7915a);
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: d */
                public final int mo1376d(Object obj) {
/* 5 */             return ((bx2) obj).f2633a.length;
                }

                @Override // p000.AbstractC2048ow, p000.AbstractC0973h
                /* JADX INFO: renamed from: f */
                public final void mo1377f(InterfaceC1870ky interfaceC1870ky, int i, Object obj) {
/* 1 */             cx2 cx2Var = (cx2) obj;
/* 3 */             cx2Var.getClass();
/* 12 */            short sMo4352C = interfaceC1870ky.mo4359e(this.f7440b, i).mo4352C();
/* 16 */            zw2 zw2Var = ax2.f2137b;
/* 7 */             cx2Var.mo1466b(cx2Var.mo1467d() + 1);
/* 21 */            short[] sArr = cx2Var.f6934a;
/* 23 */            int i2 = cx2Var.f6935b;
/* 27 */            cx2Var.f6935b = i2 + 1;
/* 29 */            sArr[i2] = sMo4352C;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: g */
                public final Object mo1378g(Object obj) {
/* 3 */             short[] sArr = ((bx2) obj).f2633a;
/* 7 */             cx2 cx2Var = new cx2();
/* 10 */            cx2Var.f6934a = sArr;
/* 13 */            cx2Var.f6935b = sArr.length;
/* 17 */            cx2Var.mo1466b(10);
/* 20 */            return cx2Var;
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: j */
                public final Object mo1379j() {
/* 6 */             return new bx2(new short[0]);
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: k */
                public final void mo1380k(InterfaceC1907ly interfaceC1907ly, Object obj, int i) {
/* 3 */             short[] sArr = ((bx2) obj).f2633a;
/* 5 */             interfaceC1907ly.getClass();
/* 9 */             for (int i2 = 0; i2 < i; i2++) {
/* 13 */                Encoder encoderMo1486C = interfaceC1907ly.mo1486C(this.f7440b, i2);
/* 17 */                short s = sArr[i2];
/* 19 */                zw2 zw2Var = ax2.f2137b;
/* 21 */                encoderMo1486C.mo1504h(s);
                    }
                }
            }
