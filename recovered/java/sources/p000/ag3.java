            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ag3 extends bg3 {

                /* JADX INFO: renamed from: c */
                public final transient int f248c;

                /* JADX INFO: renamed from: d */
                public final transient int f249d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ bg3 f250e;

                public ag3(bg3 bg3Var, int i, int i2) {
/* 1 */             this.f250e = bg3Var;
/* 6 */             this.f248c = i;
/* 8 */             this.f249d = i2;
                }

                @Override // p000.yf3
                /* JADX INFO: renamed from: a */
                public final Object[] mo273a() {
/* 3 */             return this.f250e.mo273a();
                }

                @Override // p000.yf3
                /* JADX INFO: renamed from: b */
                public final int mo274b() {
/* 9 */             return this.f250e.mo274b() + this.f248c;
                }

                @Override // p000.yf3
                /* JADX INFO: renamed from: c */
                public final int mo275c() {
/* 12 */            return this.f250e.mo274b() + this.f248c + this.f249d;
                }

                @Override // p000.bg3, java.util.List
                /* JADX INFO: renamed from: e */
                public final bg3 subList(int i, int i2) {
/* 3 */             hu0.m4321K0(i, i2, this.f249d);
/* 6 */             int i3 = this.f248c;
/* 12 */            return this.f250e.subList(i + i3, i2 + i3);
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 3 */             hu0.m4319J0(i, this.f249d);
/* 11 */            return this.f250e.get(i + this.f248c);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.f249d;
                }
            }
