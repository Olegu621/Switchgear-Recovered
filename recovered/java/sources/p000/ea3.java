            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ea3 extends fa3 {

                /* JADX INFO: renamed from: c */
                public final transient int f7594c;

                /* JADX INFO: renamed from: d */
                public final transient int f7595d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ fa3 f7596e;

                public ea3(fa3 fa3Var, int i, int i2) {
/* 1 */             this.f7596e = fa3Var;
/* 6 */             this.f7594c = i;
/* 8 */             this.f7595d = i2;
                }

                @Override // p000.ca3
                /* JADX INFO: renamed from: b */
                public final int mo1562b() {
/* 12 */            return this.f7596e.mo1563c() + this.f7594c + this.f7595d;
                }

                @Override // p000.ca3
                /* JADX INFO: renamed from: c */
                public final int mo1563c() {
/* 9 */             return this.f7596e.mo1563c() + this.f7594c;
                }

                @Override // p000.ca3
                /* JADX INFO: renamed from: d */
                public final Object[] mo1564d() {
/* 3 */             return this.f7596e.mo1564d();
                }

                @Override // p000.fa3, java.util.List
                /* JADX INFO: renamed from: e */
                public final fa3 subList(int i, int i2) {
/* 3 */             i13.m4430g(i, i2, this.f7595d);
/* 6 */             int i3 = this.f7594c;
/* 12 */            return this.f7596e.subList(i + i3, i2 + i3);
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 3 */             i13.m4424a(i, this.f7595d);
/* 11 */            return this.f7596e.get(i + this.f7594c);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.f7595d;
                }
            }
