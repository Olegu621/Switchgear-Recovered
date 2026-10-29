            package p000;

            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class vw2 extends dx1 {

                /* JADX INFO: renamed from: c */
                public static final vw2 f18381c;

                static {
/* 5 */             sw2.f16829b.getClass();
/* 13 */            f18381c = new vw2(ww2.f18847a);
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: d */
                public final int mo1376d(Object obj) {
/* 5 */             return ((tw2) obj).f17296a.length;
                }

                @Override // p000.AbstractC2048ow, p000.AbstractC0973h
                /* JADX INFO: renamed from: f */
                public final void mo1377f(InterfaceC1870ky interfaceC1870ky, int i, Object obj) {
/* 1 */             uw2 uw2Var = (uw2) obj;
/* 3 */             uw2Var.getClass();
/* 12 */            long jMo4373s = interfaceC1870ky.mo4359e(this.f7440b, i).mo4373s();
/* 16 */            rw2 rw2Var = sw2.f16829b;
/* 7 */             uw2Var.mo1466b(uw2Var.mo1467d() + 1);
/* 21 */            long[] jArr = uw2Var.f17737a;
/* 23 */            int i2 = uw2Var.f17738b;
/* 27 */            uw2Var.f17738b = i2 + 1;
/* 29 */            jArr[i2] = jMo4373s;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: g */
                public final Object mo1378g(Object obj) {
/* 3 */             long[] jArr = ((tw2) obj).f17296a;
/* 7 */             uw2 uw2Var = new uw2();
/* 10 */            uw2Var.f17737a = jArr;
/* 13 */            uw2Var.f17738b = jArr.length;
/* 17 */            uw2Var.mo1466b(10);
/* 20 */            return uw2Var;
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: j */
                public final Object mo1379j() {
/* 6 */             return new tw2(new long[0]);
                }

                @Override // p000.dx1
                /* JADX INFO: renamed from: k */
                public final void mo1380k(InterfaceC1907ly interfaceC1907ly, Object obj, int i) {
/* 3 */             long[] jArr = ((tw2) obj).f17296a;
/* 5 */             interfaceC1907ly.getClass();
/* 9 */             for (int i2 = 0; i2 < i; i2++) {
/* 13 */                Encoder encoderMo1486C = interfaceC1907ly.mo1486C(this.f7440b, i2);
/* 17 */                long j = jArr[i2];
/* 19 */                rw2 rw2Var = sw2.f16829b;
/* 21 */                encoderMo1486C.mo1485B(j);
                    }
                }
            }
