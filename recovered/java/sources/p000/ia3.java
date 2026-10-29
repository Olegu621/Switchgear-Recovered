            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ia3 extends ga3 {

                /* JADX INFO: renamed from: f */
                public static final Object[] f9513f;

                /* JADX INFO: renamed from: i */
                public static final ia3 f9514i;

                /* JADX INFO: renamed from: d */
                public final transient Object[] f9515d;

                /* JADX INFO: renamed from: e */
                public final transient Object[] f9516e;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             f9513f = objArr;
/* 11 */            f9514i = new ia3(objArr, objArr);
                }

                public ia3(Object[] objArr, Object[] objArr2) {
/* 4 */             this.f9515d = objArr;
/* 6 */             this.f9516e = objArr2;
                }

                @Override // p000.ca3
                /* JADX INFO: renamed from: a */
                public final int mo1561a(Object[] objArr) {
/* 4 */             System.arraycopy(this.f9515d, 0, objArr, 0, 0);
/* 3 */             return 0;
                }

                @Override // p000.ca3
                /* JADX INFO: renamed from: b */
                public final int mo1562b() {
/* 1 */             return 0;
                }

                @Override // p000.ca3
                /* JADX INFO: renamed from: c */
                public final int mo1563c() {
/* 1 */             return 0;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
/* 1 */             if (obj == null) {
/* 6 */                 return false;
                    }
/* 5 */             int length = this.f9516e.length;
/* 6 */             return false;
                }

                @Override // p000.ca3
                /* JADX INFO: renamed from: d */
                public final Object[] mo1564d() {
/* 1 */             return this.f9515d;
                }

                @Override // java.util.Collection, java.util.Set
                public final int hashCode() {
/* 1 */             return 0;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
/* 1 */             ha3 ha3Var = this.f8529b;
/* 3 */             if (ha3Var == null) {
/* 5 */                 da3 da3Var = fa3.f8056b;
/* 7 */                 ha3Var = ha3.f8990d;
/* 9 */                 this.f8529b = ha3Var;
                    }
/* 12 */            return ha3Var.listIterator(0);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 1 */             return 0;
                }
            }
