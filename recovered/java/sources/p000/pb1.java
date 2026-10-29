            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class pb1 extends rb1 implements Iterator, r21 {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f15052e;

                public pb1(sb1 sb1Var, int i) {
/* 1 */             this.f15052e = i;
/* 3 */             sb1Var.getClass();
/* 9 */             this.f15965d = sb1Var;
/* 12 */            this.f15963b = -1;
/* 16 */            this.f15964c = sb1Var.f16504v;
/* 18 */            m8128e();
                }

                @Override // java.util.Iterator
                public final Object next() {
                    switch (this.f15052e) {
                        case 0:
/* 74 */                    m8127b();
/* 77 */                    int i = this.f15962a;
/* 81 */                    sb1 sb1Var = (sb1) this.f15965d;
/* 85 */                    if (i >= sb1Var.f16502f) {
/* 102 */                       C1951n4.m6864o();
/* 3 */                         return null;
                            }
/* 89 */                    this.f15962a = i + 1;
/* 91 */                    this.f15963b = i;
/* 95 */                    qb1 qb1Var = new qb1(sb1Var, i);
/* 98 */                    m8128e();
/* 105 */                   return qb1Var;
                        case 1:
/* 43 */                    m8127b();
/* 46 */                    int i2 = this.f15962a;
/* 50 */                    sb1 sb1Var2 = (sb1) this.f15965d;
/* 54 */                    if (i2 >= sb1Var2.f16502f) {
/* 70 */                        C1951n4.m6864o();
/* 3 */                         return null;
                            }
/* 58 */                    this.f15962a = i2 + 1;
/* 60 */                    this.f15963b = i2;
/* 64 */                    Object obj = sb1Var2.f16497a[i2];
/* 66 */                    m8128e();
/* 73 */                    return obj;
                        default:
/* 7 */                     m8127b();
/* 10 */                    int i3 = this.f15962a;
/* 14 */                    sb1 sb1Var3 = (sb1) this.f15965d;
/* 18 */                    if (i3 >= sb1Var3.f16502f) {
/* 39 */                        C1951n4.m6864o();
/* 3 */                         return null;
                            }
/* 22 */                    this.f15962a = i3 + 1;
/* 24 */                    this.f15963b = i3;
/* 26 */                    Object[] objArr = sb1Var3.f16498b;
/* 28 */                    objArr.getClass();
/* 33 */                    Object obj2 = objArr[this.f15963b];
/* 35 */                    m8128e();
/* 42 */                    return obj2;
                    }
                }
            }
