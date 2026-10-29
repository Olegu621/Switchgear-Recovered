            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lg3 extends ig3 {

                /* JADX INFO: renamed from: U */
                public static final lg3 f13271U;

                /* JADX INFO: renamed from: w */
                public static final Object[] f13272w;

                /* JADX INFO: renamed from: d */
                public final transient Object[] f13273d;

                /* JADX INFO: renamed from: e */
                public final transient int f13274e;

                /* JADX INFO: renamed from: f */
                public final transient Object[] f13275f;

                /* JADX INFO: renamed from: i */
                public final transient int f13276i;

                /* JADX INFO: renamed from: v */
                public final transient int f13277v;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             f13272w = objArr;
/* 15 */            f13271U = new lg3(objArr, 0, objArr, 0, 0);
                }

                public lg3(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
/* 4 */             this.f13273d = objArr;
/* 6 */             this.f13274e = i;
/* 8 */             this.f13275f = objArr2;
/* 10 */            this.f13276i = i2;
/* 12 */            this.f13277v = i3;
                }

                @Override // p000.yf3
                /* JADX INFO: renamed from: a */
                public final Object[] mo273a() {
/* 1 */             return this.f13273d;
                }

                @Override // p000.yf3
                /* JADX INFO: renamed from: b */
                public final int mo274b() {
/* 1 */             return 0;
                }

                @Override // p000.yf3
                /* JADX INFO: renamed from: c */
                public final int mo275c() {
/* 1 */             return this.f13277v;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
/* 1 */             if (obj == null) {
/* 50 */                return false;
                    }
/* 3 */             Object[] objArr = this.f13275f;
/* 6 */             if (objArr.length == 0) {
/* 50 */                return false;
                    }
/* 30 */            int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
                    while (true) {
/* 33 */                int i = iRotateLeft & this.f13276i;
/* 34 */                Object obj2 = objArr[i];
/* 36 */                if (obj2 == null) {
/* 50 */                    return false;
                        }
/* 43 */                if (obj2.equals(obj)) {
/* 45 */                    return true;
                        }
/* 47 */                iRotateLeft = i + 1;
                    }
                }

                @Override // p000.yf3
                /* JADX INFO: renamed from: d */
                public final int mo1352d(Object[] objArr) {
/* 1 */             Object[] objArr2 = this.f13273d;
/* 4 */             int i = this.f13277v;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 9 */             return i;
                }

                @Override // p000.ig3
                /* JADX INFO: renamed from: e */
                public final wx2 mo4530e() {
/* 1 */             bg3 kg3Var = this.f9585b;
/* 3 */             if (kg3Var == null) {
/* 5 */                 zf3 zf3Var = bg3.f2421b;
/* 7 */                 int i = this.f13277v;
/* 18 */                kg3Var = i == 0 ? kg3.f12755e : new kg3(this.f13273d, i);
/* 22 */                this.f9585b = kg3Var;
                    }
/* 25 */            return kg3Var.listIterator(0);
                }

                @Override // p000.ig3, java.util.Collection, java.util.Set
                public final int hashCode() {
/* 1 */             return this.f13274e;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
/* 1 */             bg3 kg3Var = this.f9585b;
/* 3 */             if (kg3Var == null) {
/* 5 */                 zf3 zf3Var = bg3.f2421b;
/* 7 */                 int i = this.f13277v;
/* 18 */                kg3Var = i == 0 ? kg3.f12755e : new kg3(this.f13273d, i);
/* 22 */                this.f9585b = kg3Var;
                    }
/* 25 */            return kg3Var.listIterator(0);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 1 */             return this.f13277v;
                }
            }
