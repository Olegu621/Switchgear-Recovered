            package p000;

            import java.util.AbstractSet;
            import java.util.Arrays;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gk3 extends AbstractSet {

                /* JADX INFO: renamed from: a */
                public final int f8687a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ik3 f8688b;

                public gk3(ik3 ik3Var, int i) {
/* 1 */             this.f8688b = ik3Var;
/* 6 */             this.f8687a = i;
                }

                /* JADX INFO: renamed from: a */
                public final int m3965a() {
/* 2 */             int i = this.f8687a;
/* 4 */             if (i == -1) {
/* 6 */                 return 0;
                    }
/* 12 */            return this.f8688b.f9698b[i];
                }

                /* JADX INFO: renamed from: b */
                public final int m3966b() {
/* 9 */             return this.f8688b.f9698b[this.f8687a + 1];
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
                    return Arrays.binarySearch(this.f8688b.f9697a, m3965a(), m3966b(), obj, this.f8687a == -1 ? ik3.f9696f : kk3.f12864b) >= 0;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
/* 4 */             return new y30(this, 2);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 9 */             return m3966b() - m3965a();
                }
            }
