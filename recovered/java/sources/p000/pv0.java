            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.util.Range;
            import android.util.Size;
            import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Objects;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pv0 extends wy2 {

                /* JADX INFO: renamed from: u */
                public static final nv0 f15290u = new nv0();

                /* JADX INFO: renamed from: o */
                public final rv0 f15291o;

                /* JADX INFO: renamed from: p */
                public final Object f15292p;

                /* JADX INFO: renamed from: q */
                public lv0 f15293q;

                /* JADX INFO: renamed from: r */
                public bb2 f15294r;

                /* JADX INFO: renamed from: s */
                public uw0 f15295s;

                /* JADX INFO: renamed from: t */
                public cb2 f15296t;

                public pv0(tv0 tv0Var) {
/* 1 */             super(tv0Var);
/* 9 */             this.f15292p = new Object();
/* 33 */            if (((Integer) ((tv0) this.f18861f).mo7023b(tv0.f17281b, 0)).intValue() == 1) {
/* 40 */                this.f15291o = new sv0();
                    } else {
/* 60 */                this.f15291o = new wv0((Executor) tv0Var.mo7023b(xn2.f19289F, pg3.m7434m()));
                    }
/* 68 */            this.f15291o.f16315d = m7561C();
/* 90 */            this.f15291o.f16317e = ((Boolean) ((tv0) this.f18861f).mo7023b(tv0.f17286i, Boolean.FALSE)).booleanValue();
                }

                /* JADX WARN: Code duplicated, block: B:15:0x008b  */
                /* JADX INFO: renamed from: B */
                public final bb2 m7560B(tv0 tv0Var, C2069pg c2069pg) {
                    boolean z;
/* 1 */             pg3.m7423a();
/* 4 */             Size size = c2069pg.f15102a;
/* 16 */            Executor executor = (Executor) tv0Var.mo7023b(xn2.f19289F, pg3.m7434m());
/* 18 */            executor.getClass();
/* 27 */            int i = 0;
/* 42 */            boolean z2 = true;
/* 67 */            int iIntValue = ((Integer) ((tv0) this.f18861f).mo7023b(tv0.f17281b, 0)).intValue() == 1 ? ((Integer) ((tv0) this.f18861f).mo7023b(tv0.f17282c, 6)).intValue() : 4;
/* 75 */            if (tv0Var.mo7023b(tv0.f17283d, null) != null) {
/* 393 */               C1697u2.m5431g();
/* 70 */                return null;
                    }
/* 97 */            C1767ir c1767ir = new C1767ir(i13.m4433j(size.getWidth(), size.getHeight(), this.f18861f.mo1175l(), iIntValue));
/* 104 */           if (m9655b() != null) {
/* 106 */               InterfaceC2559zp interfaceC2559zpM9655b = m9655b();
/* 128 */               if (!((Boolean) ((tv0) this.f18861f).mo7023b(tv0.f17286i, Boolean.FALSE)).booleanValue() || m9659g(interfaceC2559zpM9655b, false) % 180 == 0) {
/* 140 */                   z = false;
                        } else {
/* 138 */                   z = true;
                        }
                    } else {
/* 140 */               z = false;
                    }
/* 148 */           int height = z ? size.getHeight() : size.getWidth();
/* 159 */           int width = z ? size.getWidth() : size.getHeight();
/* 174 */           int i2 = m7561C() == 2 ? 1 : 35;
/* 191 */           boolean z3 = this.f18861f.mo1175l() == 35 && m7561C() == 2;
/* 198 */           if (this.f18861f.mo1175l() != 35 || ((m9655b() == null || m9659g(m9655b(), false) == 0) && !Boolean.TRUE.equals((Boolean) ((tv0) this.f18861f).mo7023b(tv0.f17285f, null)))) {
/* 237 */               z2 = false;
                    }
/* 252 */           C1767ir c1767ir2 = (z3 || z2) ? new C1767ir(i13.m4433j(height, width, i2, c1767ir.mo3812g())) : null;
/* 255 */           if (c1767ir2 != null) {
/* 257 */               rv0 rv0Var = this.f15291o;
                        synchronized (rv0Var.f16314c0) {
/* 262 */                   rv0Var.f16320v = c1767ir2;
                        }
                    }
/* 269 */           InterfaceC2559zp interfaceC2559zpM9655b2 = m9655b();
/* 273 */           if (interfaceC2559zpM9655b2 != null) {
/* 281 */               this.f15291o.f16311b = m9659g(interfaceC2559zpM9655b2, false);
                    }
/* 285 */           c1767ir.mo3811f(this.f15291o, executor);
/* 290 */           bb2 bb2VarM1315d = bb2.m1315d(tv0Var, c2069pg.f15102a);
/* 294 */           InterfaceC2235ty interfaceC2235ty = c2069pg.f15105d;
/* 296 */           if (interfaceC2235ty != null) {
/* 300 */               bb2VarM1315d.f164b.m5545e(interfaceC2235ty);
                    }
/* 303 */           uw0 uw0Var = this.f15295s;
/* 305 */           if (uw0Var != null) {
/* 307 */               uw0Var.mo2951a();
                    }
/* 322 */           uw0 uw0Var2 = new uw0(c1767ir.getSurface(), size, this.f18861f.mo1175l());
/* 325 */           this.f15295s = uw0Var2;
/* 344 */           w11.m9453w(uw0Var2.f7030e).mo3676a(new RunnableC1784j8(27, c1767ir, c1767ir2), pg3.m7436o());
/* 347 */           Range range = c2069pg.f15104c;
/* 349 */           C1767ir c1767ir3 = bb2VarM1315d.f164b;
/* 351 */           c1767ir3.getClass();
/* 360 */           ((uk1) c1767ir3.f11911d).m9037p(C1803jr.f12440j, range);
/* 368 */           bb2VarM1315d.m1317b(this.f15295s, c2069pg.f15103b, -1);
/* 371 */           cb2 cb2Var = this.f15296t;
/* 373 */           if (cb2Var != null) {
/* 375 */               cb2Var.m1609b();
                    }
/* 385 */           cb2 cb2Var2 = new cb2(new kv0(this, i));
/* 388 */           this.f15296t = cb2Var2;
/* 390 */           bb2VarM1315d.f168f = cb2Var2;
/* 392 */           return bb2VarM1315d;
                }

                /* JADX INFO: renamed from: C */
                public final int m7561C() {
/* 18 */            return ((Integer) ((tv0) this.f18861f).mo7023b(tv0.f17284e, 1)).intValue();
                }

                /* JADX INFO: renamed from: D */
                public final void m7562D(Executor executor, lv0 lv0Var) {
                    synchronized (this.f15292p) {
                        try {
/* 4 */                     rv0 rv0Var = this.f15291o;
/* 9 */                     C2357x6 c2357x6 = new C2357x6(lv0Var, 4);
                            synchronized (rv0Var.f16314c0) {
/* 15 */                        rv0Var.f16309a = c2357x6;
/* 17 */                        rv0Var.f16319i = executor;
                            }
/* 22 */                    if (this.f15293q == null) {
/* 24 */                        m9663m();
                            }
/* 30 */                    this.f15293q = lv0Var;
                        } catch (Throwable th) {
/* 38 */                    throw th;
                        }
                    }
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: e */
                public final zy2 mo6439e(boolean z, cz2 cz2Var) {
/* 3 */             f15290u.getClass();
/* 6 */             tv0 tv0Var = nv0.f14464a;
/* 13 */            InterfaceC2235ty interfaceC2235tyMo1183a = cz2Var.mo1183a(tv0Var.mo7453t(), 1);
/* 17 */            if (z) {
/* 19 */                interfaceC2235tyMo1183a = InterfaceC2235ty.m8924q(interfaceC2235tyMo1183a, tv0Var);
                    }
/* 23 */            if (interfaceC2235tyMo1183a == null) {
/* 25 */                return null;
                    }
/* 41 */            return new tv0(nq1.m7021d(((C1974nr) mo6441j(interfaceC2235tyMo1183a)).f14413b));
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: j */
                public final yy2 mo6441j(InterfaceC2235ty interfaceC2235ty) {
/* 8 */             return new C1974nr(uk1.m9035m(interfaceC2235ty), 1);
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: p */
                public final void mo6442p() {
/* 4 */             this.f15291o.f16316d0 = true;
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: r */
                public final zy2 mo6443r(InterfaceC2469xp interfaceC2469xp, yy2 yy2Var) {
/* 12 */            Boolean bool = (Boolean) ((tv0) this.f18861f).mo7023b(tv0.f17285f, null);
/* 20 */            boolean zM3579d = interfaceC2469xp.mo314f().m3579d(OnePixelShiftQuirk.class);
/* 24 */            rv0 rv0Var = this.f15291o;
/* 26 */            if (bool != null) {
/* 29 */                zM3579d = bool.booleanValue();
                    }
/* 33 */            rv0Var.f16318f = zM3579d;
                    synchronized (this.f15292p) {
                    }
/* 39 */            return yy2Var.mo7036o();
                }

                public final String toString() {
/* 7 */             return "ImageAnalysis:".concat(m9658f());
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: u */
                public final C2069pg mo6446u(InterfaceC2235ty interfaceC2235ty) {
/* 3 */             this.f15294r.m1316a(interfaceC2235ty);
/* 12 */            Object[] objArr = {this.f15294r.m1318c()};
/* 19 */            ArrayList arrayList = new ArrayList(1);
/* 23 */            Object obj = objArr[0];
/* 25 */            Objects.requireNonNull(obj);
/* 28 */            arrayList.add(obj);
/* 35 */            m9653A(Collections.unmodifiableList(arrayList));
/* 40 */            C0168b5 c0168b5M7414a = this.f18862g.m7414a();
/* 44 */            c0168b5M7414a.f2214e = interfaceC2235ty;
/* 46 */            return c0168b5M7414a.m1266k();
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: v */
                public final C2069pg mo6447v(C2069pg c2069pg, C2069pg c2069pg2) {
/* 3 */             tv0 tv0Var = (tv0) this.f18861f;
/* 5 */             m9657d();
/* 8 */             bb2 bb2VarM7560B = m7560B(tv0Var, c2069pg);
/* 12 */            this.f15294r = bb2VarM7560B;
/* 18 */            Object[] objArr = {bb2VarM7560B.m1318c()};
/* 25 */            ArrayList arrayList = new ArrayList(1);
/* 29 */            Object obj = objArr[0];
/* 31 */            Objects.requireNonNull(obj);
/* 34 */            arrayList.add(obj);
/* 41 */            m9653A(Collections.unmodifiableList(arrayList));
/* 44 */            return c2069pg;
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: w */
                public final void mo6448w() {
/* 1 */             pg3.m7423a();
/* 4 */             cb2 cb2Var = this.f15296t;
/* 7 */             if (cb2Var != null) {
/* 9 */                 cb2Var.m1609b();
/* 12 */                this.f15296t = null;
                    }
/* 14 */            uw0 uw0Var = this.f15295s;
/* 16 */            if (uw0Var != null) {
/* 18 */                uw0Var.mo2951a();
/* 21 */                this.f15295s = null;
                    }
/* 24 */            rv0 rv0Var = this.f15291o;
/* 26 */            rv0Var.f16316d0 = false;
/* 28 */            rv0Var.mo8260c();
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: x */
                public final void mo7563x(Matrix matrix) {
/* 1 */             super.mo7563x(matrix);
/* 4 */             rv0 rv0Var = this.f15291o;
                    synchronized (rv0Var.f16314c0) {
/* 9 */                 rv0Var.f16305W = matrix;
/* 18 */                rv0Var.f16306X = new Matrix(rv0Var.f16305W);
                    }
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: y */
                public final void mo7564y(Rect rect) {
/* 1 */             this.f18864i = rect;
/* 3 */             rv0 rv0Var = this.f15291o;
                    synchronized (rv0Var.f16314c0) {
/* 8 */                 rv0Var.f16303U = rect;
/* 17 */                rv0Var.f16304V = new Rect(rv0Var.f16303U);
                    }
                }
            }
