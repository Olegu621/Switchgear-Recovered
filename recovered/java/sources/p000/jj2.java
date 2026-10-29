            package p000;

            import android.view.Surface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class jj2 implements InterfaceC2251ud {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ lj2 f12328a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ kj2 f12329b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f12330c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C2180sg f12331d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ C2180sg f12332e;

                public /* synthetic */ jj2(lj2 lj2Var, kj2 kj2Var, int i, C2180sg c2180sg, C2180sg c2180sg2) {
/* 4 */             this.f12328a = lj2Var;
/* 6 */             this.f12329b = kj2Var;
/* 8 */             this.f12330c = i;
/* 10 */            this.f12331d = c2180sg;
/* 12 */            this.f12332e = c2180sg2;
                }

                @Override // p000.InterfaceC2251ud
                /* JADX INFO: renamed from: apply */
                public final s81 mo10660apply(Object obj) {
/* 1 */             kj2 kj2Var = this.f12329b;
/* 4 */             Surface surface = (Surface) obj;
/* 6 */             lj2 lj2Var = this.f12328a;
/* 8 */             lj2Var.getClass();
/* 11 */            surface.getClass();
                    try {
/* 15 */                kj2Var.m2954d();
/* 30 */                mj2 mj2Var = new mj2(surface, this.f12330c, lj2Var.f13324g.f15102a, this.f12331d, this.f12332e);
/* 46 */                mj2Var.f13812U.f19248b.mo3676a(new gj2(kj2Var, 1), pg3.m7428g());
/* 57 */                de3.m3028j("Consumer can only be linked once.", kj2Var.f12828r == null);
/* 60 */                kj2Var.f12828r = mj2Var;
/* 62 */                return w11.m9450t(mj2Var);
                    } catch (c70 e) {
/* 71 */                return new tw0(e, 1);
                    }
                }
            }
