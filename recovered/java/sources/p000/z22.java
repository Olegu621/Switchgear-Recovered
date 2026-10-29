            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z22 extends fx0 {

                /* JADX INFO: renamed from: U */
                public static final z22 f19912U;

                /* JADX INFO: renamed from: w */
                public static final Object[] f19913w;

                /* JADX INFO: renamed from: d */
                public final transient Object[] f19914d;

                /* JADX INFO: renamed from: e */
                public final transient int f19915e;

                /* JADX INFO: renamed from: f */
                public final transient Object[] f19916f;

                /* JADX INFO: renamed from: i */
                public final transient int f19917i;

                /* JADX INFO: renamed from: v */
                public final transient int f19918v;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             f19913w = objArr;
/* 15 */            f19912U = new z22(objArr, 0, objArr, 0, 0);
                }

                public z22(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
/* 4 */             this.f19914d = objArr;
/* 6 */             this.f19915e = i;
/* 8 */             this.f19916f = objArr2;
/* 10 */            this.f19917i = i2;
/* 12 */            this.f19918v = i3;
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: a */
                public final int mo8149a(Object[] objArr) {
/* 1 */             Object[] objArr2 = this.f19914d;
/* 4 */             int i = this.f19918v;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 9 */             return i;
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: b */
                public final Object[] mo8678b() {
/* 1 */             return this.f19914d;
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: c */
                public final int mo8679c() {
/* 1 */             return this.f19918v;
                }

                @Override // p000.vw0, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
/* 2 */             if (obj != null) {
/* 4 */                 Object[] objArr = this.f19916f;
/* 7 */                 if (objArr.length != 0) {
/* 14 */                    int iM7444z = pg3.m7444z(obj.hashCode());
                            while (true) {
/* 20 */                        int i = iM7444z & this.f19917i;
/* 21 */                        Object obj2 = objArr[i];
/* 23 */                        if (obj2 == null) {
/* 1 */                             return false;
                                }
/* 30 */                        if (obj2.equals(obj)) {
/* 32 */                            return true;
                                }
/* 34 */                        iM7444z = i + 1;
                            }
                        }
                    }
/* 1 */             return false;
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: d */
                public final int mo8680d() {
/* 1 */             return 0;
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: e */
                public final wx2 iterator() {
/* 6 */             return mo3852f().listIterator(0);
                }

                @Override // p000.fx0, java.util.Collection, java.util.Set
                public final int hashCode() {
/* 1 */             return this.f19915e;
                }

                @Override // p000.fx0
                /* JADX INFO: renamed from: i */
                public final zw0 mo3853i() {
/* 5 */             return zw0.m10447f(this.f19918v, this.f19914d);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 1 */             return this.f19918v;
                }
            }
