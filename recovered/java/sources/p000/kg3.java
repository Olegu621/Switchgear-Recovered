            package p000;

            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kg3 extends bg3 {

                /* JADX INFO: renamed from: e */
                public static final kg3 f12755e = new kg3(new Object[0], 0);

                /* JADX INFO: renamed from: c */
                public final transient Object[] f12756c;

                /* JADX INFO: renamed from: d */
                public final transient int f12757d;

                public kg3(Object[] objArr, int i) {
/* 4 */             this.f12756c = objArr;
/* 6 */             this.f12757d = i;
                }

                @Override // p000.yf3
                /* JADX INFO: renamed from: a */
                public final Object[] mo273a() {
/* 1 */             return this.f12756c;
                }

                @Override // p000.yf3
                /* JADX INFO: renamed from: b */
                public final int mo274b() {
/* 1 */             return 0;
                }

                @Override // p000.yf3
                /* JADX INFO: renamed from: c */
                public final int mo275c() {
/* 1 */             return this.f12757d;
                }

                @Override // p000.bg3, p000.yf3
                /* JADX INFO: renamed from: d */
                public final int mo1352d(Object[] objArr) {
/* 1 */             Object[] objArr2 = this.f12756c;
/* 4 */             int i = this.f12757d;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i);
/* 9 */             return i;
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 3 */             hu0.m4319J0(i, this.f12757d);
/* 8 */             Object obj = this.f12756c[i];
/* 10 */            Objects.requireNonNull(obj);
/* 13 */            return obj;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.f12757d;
                }
            }
