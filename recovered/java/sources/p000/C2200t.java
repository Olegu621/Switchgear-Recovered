            package p000;

            import java.util.List;
            import java.util.RandomAccess;
            
            /* JADX INFO: renamed from: t */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C2200t extends AbstractC2237u implements RandomAccess {

                /* JADX INFO: renamed from: a */
                public final AbstractC2237u f16882a;

                /* JADX INFO: renamed from: b */
                public final int f16883b;

                /* JADX INFO: renamed from: c */
                public final int f16884c;

                public C2200t(AbstractC2237u abstractC2237u, int i, int i2) {
/* 4 */             this.f16882a = abstractC2237u;
/* 6 */             this.f16883b = i;
/* 8 */             C2089q c2089q = AbstractC2237u.Companion;
/* 10 */            int size = abstractC2237u.size();
/* 14 */            c2089q.getClass();
/* 17 */            C2089q.m7640c(i, i2, size);
/* 21 */            this.f16884c = i2 - i;
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 3 */             AbstractC2237u.Companion.getClass();
/* 8 */             C2089q.m7638a(i, this.f16884c);
/* 16 */            return this.f16882a.get(this.f16883b + i);
                }

                @Override // p000.AbstractC0936g
                public final int getSize() {
/* 1 */             return this.f16884c;
                }

                @Override // p000.AbstractC2237u, java.util.List
                public final List subList(int i, int i2) {
/* 3 */             AbstractC2237u.Companion.getClass();
/* 8 */             C2089q.m7640c(i, i2, this.f16884c);
/* 13 */            int i3 = this.f16883b;
/* 19 */            return new C2200t(this.f16882a, i + i3, i3 + i2);
                }
            }
