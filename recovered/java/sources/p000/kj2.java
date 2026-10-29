            package p000;

            import android.util.Size;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kj2 extends d70 {

                /* JADX INFO: renamed from: o */
                public final C2466xm f12825o;

                /* JADX INFO: renamed from: p */
                public final C2260um f12826p;

                /* JADX INFO: renamed from: q */
                public d70 f12827q;

                /* JADX INFO: renamed from: r */
                public mj2 f12828r;

                public kj2(Size size, int i) {
/* 1 */             super(size, i);
/* 6 */             C2260um c2260um = new C2260um();
/* 14 */            c2260um.f17592c = new u32();
/* 18 */            C2466xm c2466xm = new C2466xm(c2260um);
/* 21 */            c2260um.f17591b = c2466xm;
/* 25 */            c2260um.f17590a = AbstractC0886en.class;
                    try {
/* 27 */                this.f12826p = c2260um;
/* 47 */                c2260um.f17590a = "SettableFuture hashCode: " + hashCode();
                    } catch (Exception e) {
/* 51 */                c2466xm.m9977b(e);
                    }
/* 54 */            this.f12825o = c2466xm;
                }

                @Override // p000.d70
                /* JADX INFO: renamed from: a */
                public final void mo2951a() {
/* 1 */             super.mo2951a();
/* 10 */            pg3.m7443w(new gj2(this, 2));
                }

                @Override // p000.d70
                /* JADX INFO: renamed from: f */
                public final s81 mo2956f() {
/* 1 */             return this.f12825o;
                }

                /* JADX INFO: renamed from: g */
                public final boolean m6121g(d70 d70Var, Runnable runnable) {
                    boolean z;
/* 5 */             Size size = this.f7033h;
/* 7 */             pg3.m7423a();
/* 10 */            d70Var.getClass();
/* 13 */            int i = d70Var.f7034i;
/* 15 */            Size size2 = d70Var.f7033h;
/* 17 */            d70 d70Var2 = this.f12827q;
/* 20 */            if (d70Var2 == d70Var) {
/* 19 */                return false;
                    }
/* 31 */            de3.m3028j("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", d70Var2 == null);
/* 61 */            de3.m3023e("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
/* 64 */            int i2 = this.f7034i;
/* 92 */            de3.m3023e("The provider's format(" + i2 + ") must match the parent(" + i + ")", i2 == i);
                    synchronized (this.f7026a) {
/* 98 */                z = this.f7028c;
                    }
/* 105 */           de3.m3028j("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
/* 108 */           this.f12827q = d70Var;
/* 120 */           w11.m9392B(true, d70Var.m2953c(), this.f12826p, pg3.m7428g());
/* 123 */           d70Var.m2954d();
/* 141 */           w11.m9453w(this.f7030e).mo3676a(new hj2(d70Var, 1), pg3.m7428g());
/* 154 */           w11.m9453w(d70Var.f7032g).mo3676a(runnable, pg3.m7436o());
/* 23 */            return true;
                }
            }
