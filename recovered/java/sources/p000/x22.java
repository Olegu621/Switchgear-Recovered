            package p000;

            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class x22 extends zw0 {

                /* JADX INFO: renamed from: c */
                public final transient Object[] f18917c;

                /* JADX INFO: renamed from: d */
                public final transient int f18918d;

                /* JADX INFO: renamed from: e */
                public final transient int f18919e;

                public x22(Object[] objArr, int i, int i2) {
/* 4 */             this.f18917c = objArr;
/* 6 */             this.f18918d = i;
/* 8 */             this.f18919e = i2;
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 3 */             yy1.m10214i(i, this.f18919e);
/* 13 */            Object obj = this.f18917c[(i * 2) + this.f18918d];
/* 15 */            Objects.requireNonNull(obj);
/* 18 */            return obj;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.f18919e;
                }
            }
