            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class aj3 implements Iterator {

                /* JADX INFO: renamed from: a */
                public final ph3 f315a;

                /* JADX INFO: renamed from: b */
                public int f316b;

                /* JADX INFO: renamed from: c */
                public int f317c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ cj3 f318d;

                public /* synthetic */ aj3(cj3 cj3Var, ph3 ph3Var, int i) {
/* 4 */             this.f318d = cj3Var;
/* 6 */             this.f315a = ph3Var;
/* 8 */             int i2 = i & 31;
/* 10 */            this.f316b = i2;
/* 16 */            this.f317c = i >>> (i2 + 5);
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.f316b >= 0;
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 1 */             int i = this.f316b;
/* 3 */             cj3 cj3Var = this.f318d;
/* 21 */            Object objCast = this.f315a.f15132b.cast((i >= 0 ? cj3Var.f2966c : cj3Var.f2965b).mo3440Z(i));
/* 25 */            int i2 = this.f317c;
/* 27 */            if (i2 == 0) {
/* 47 */                this.f316b = -1;
/* 49 */                return objCast;
                    }
/* 33 */            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
/* 38 */            this.f317c >>>= iNumberOfTrailingZeros;
/* 43 */            this.f316b += iNumberOfTrailingZeros;
/* 45 */            return objCast;
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 6 */             throw new UnsupportedOperationException();
                }
            }
