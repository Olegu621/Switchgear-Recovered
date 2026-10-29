            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wb1 implements Iterator {

                /* JADX INFO: renamed from: a */
                public final int f18562a;

                /* JADX INFO: renamed from: b */
                public int f18563b;

                /* JADX INFO: renamed from: c */
                public int f18564c;

                /* JADX INFO: renamed from: d */
                public boolean f18565d = false;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ kx0 f18566e;

                public wb1(kx0 kx0Var, int i) {
/* 4 */             this.f18566e = kx0Var;
/* 9 */             this.f18562a = i;
/* 15 */            this.f18563b = kx0Var.mo4169e();
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.f18564c < this.f18563b;
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 26 */                C1951n4.m6864o();
/* 29 */                return null;
                    }
/* 13 */            Object objMo4167c = this.f18566e.mo4167c(this.f18564c, this.f18562a);
/* 21 */            this.f18564c++;
/* 23 */            this.f18565d = true;
/* 25 */            return objMo4167c;
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 3 */             if (!this.f18565d) {
/* 26 */                f42.m3664t();
/* 29 */                return;
                    }
/* 7 */             int i = this.f18564c - 1;
/* 9 */             this.f18564c = i;
/* 15 */            this.f18563b--;
/* 18 */            this.f18565d = false;
/* 22 */            this.f18566e.mo4173i(i);
                }
            }
