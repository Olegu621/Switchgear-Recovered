            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class yy0 extends wy0 {

                /* JADX INFO: renamed from: a */
                public final int f19854a;

                /* JADX INFO: renamed from: b */
                public final int f19855b;

                /* JADX INFO: renamed from: c */
                public boolean f19856c;

                /* JADX INFO: renamed from: d */
                public int f19857d;

                public yy0(int i, int i2, int i3) {
/* 4 */             this.f19854a = i3;
/* 6 */             this.f19855b = i2;
/* 8 */             boolean z = false;
/* 10 */            if (i3 <= 0 ? i >= i2 : i <= i2) {
/* 14 */                z = true;
                    }
/* 19 */            this.f19856c = z;
/* 25 */            this.f19857d = z ? i : i2;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 1 */             return this.f19856c;
                }

                @Override // p000.wy0
                public final int nextInt() {
/* 1 */             int i = this.f19857d;
/* 5 */             if (i != this.f19855b) {
/* 23 */                this.f19857d = this.f19854a + i;
/* 25 */                return i;
                    }
/* 9 */             if (this.f19856c) {
/* 12 */                this.f19856c = false;
/* 14 */                return i;
                    }
/* 15 */            C1951n4.m6864o();
/* 18 */            return 0;
                }
            }
