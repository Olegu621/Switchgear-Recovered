            package p000;

            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ha3 extends fa3 {

                /* JADX INFO: renamed from: d */
                public static final ha3 f8990d = new ha3(new Object[0]);

                /* JADX INFO: renamed from: c */
                public final transient Object[] f8991c;

                public ha3(Object[] objArr) {
/* 4 */             this.f8991c = objArr;
                }

                @Override // p000.fa3, p000.ca3
                /* JADX INFO: renamed from: a */
                public final int mo1561a(Object[] objArr) {
/* 4 */             System.arraycopy(this.f8991c, 0, objArr, 0, 0);
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

                @Override // p000.ca3
                /* JADX INFO: renamed from: d */
                public final Object[] mo1564d() {
/* 1 */             return this.f8991c;
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 2 */             i13.m4424a(i, 0);
/* 7 */             Object obj = this.f8991c[i];
/* 9 */             Objects.requireNonNull(obj);
/* 12 */            return obj;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return 0;
                }
            }
