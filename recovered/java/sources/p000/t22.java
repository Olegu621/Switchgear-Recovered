            package p000;

            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class t22 extends zw0 {

                /* JADX INFO: renamed from: e */
                public static final t22 f16899e = new t22(new Object[0], 0);

                /* JADX INFO: renamed from: c */
                public final transient Object[] f16900c;

                /* JADX INFO: renamed from: d */
                public final transient int f16901d;

                public t22(Object[] objArr, int i) {
/* 4 */             this.f16900c = objArr;
/* 6 */             this.f16901d = i;
                }

                @Override // p000.zw0, p000.vw0
                /* JADX INFO: renamed from: a */
                public final int mo8149a(Object[] objArr) {
/* 1 */             Object[] objArr2 = this.f16900c;
/* 4 */             int i = this.f16901d;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 9 */             return i;
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: b */
                public final Object[] mo8678b() {
/* 1 */             return this.f16900c;
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: c */
                public final int mo8679c() {
/* 1 */             return this.f16901d;
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: d */
                public final int mo8680d() {
/* 1 */             return 0;
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 3 */             yy1.m10214i(i, this.f16901d);
/* 8 */             Object obj = this.f16900c[i];
/* 10 */            Objects.requireNonNull(obj);
/* 13 */            return obj;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.f16901d;
                }
            }
