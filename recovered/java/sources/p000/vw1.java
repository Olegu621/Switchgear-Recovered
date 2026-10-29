            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.util.Range;
            import android.util.Size;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vw1 extends wy2 {

                /* JADX INFO: renamed from: v */
                public static final tw1 f18372v = new tw1();

                /* JADX INFO: renamed from: w */
                public static final nt0 f18373w = pg3.m7436o();

                /* JADX INFO: renamed from: o */
                public uw1 f18374o;

                /* JADX INFO: renamed from: p */
                public Executor f18375p;

                /* JADX INFO: renamed from: q */
                public bb2 f18376q;

                /* JADX INFO: renamed from: r */
                public uw0 f18377r;

                /* JADX INFO: renamed from: s */
                public lj2 f18378s;

                /* JADX INFO: renamed from: t */
                public rj2 f18379t;

                /* JADX INFO: renamed from: u */
                public cb2 f18380u;

                /* JADX INFO: renamed from: B */
                public final void m9349B() {
/* 1 */             cb2 cb2Var = this.f18380u;
/* 4 */             if (cb2Var != null) {
/* 6 */                 cb2Var.m1609b();
/* 9 */                 this.f18380u = null;
                    }
/* 11 */            uw0 uw0Var = this.f18377r;
/* 13 */            if (uw0Var != null) {
/* 15 */                uw0Var.mo2951a();
/* 18 */                this.f18377r = null;
                    }
/* 20 */            lj2 lj2Var = this.f18378s;
/* 22 */            if (lj2Var != null) {
/* 24 */                lj2Var.m6462b();
/* 27 */                this.f18378s = null;
                    }
/* 29 */            this.f18379t = null;
                }

                /* JADX INFO: renamed from: C */
                public final fs0 m9350C() {
/* 1 */             InterfaceC2559zp interfaceC2559zpM9655b = m9655b();
/* 5 */             C2069pg c2069pg = this.f18862g;
/* 13 */            Size size = c2069pg != null ? c2069pg.f15102a : null;
/* 14 */            if (interfaceC2559zpM9655b == null || size == null) {
/* 7 */                 return null;
                    }
/* 19 */            Rect rect = this.f18864i;
/* 22 */            if (rect == null) {
/* 34 */                rect = new Rect(0, 0, size.getWidth(), size.getHeight());
                    }
/* 43 */            return new fs0(size, rect, m9659g(interfaceC2559zpM9655b, false));
                }

                /* JADX INFO: renamed from: D */
                public final void m9351D(uw1 uw1Var) {
/* 1 */             pg3.m7423a();
/* 4 */             this.f18374o = uw1Var;
/* 8 */             this.f18375p = f18373w;
/* 10 */            C2069pg c2069pg = this.f18862g;
/* 18 */            if ((c2069pg != null ? c2069pg.f15102a : null) != null) {
/* 24 */                m9352E((ww1) this.f18861f, c2069pg);
/* 27 */                m9664n();
                    }
/* 30 */            m9663m();
                }

                /* JADX INFO: renamed from: E */
                public final void m9352E(ww1 ww1Var, C2069pg c2069pg) {
                    Rect rect;
/* 8 */             pg3.m7423a();
/* 11 */            InterfaceC2559zp interfaceC2559zpM9655b = m9655b();
/* 15 */            Objects.requireNonNull(interfaceC2559zpM9655b);
/* 18 */            m9349B();
/* 31 */            de3.m3028j(null, this.f18378s == null);
/* 36 */            Matrix matrix = this.f18865j;
/* 38 */            boolean zMo8072k = interfaceC2559zpM9655b.mo8072k();
/* 42 */            Size size = c2069pg.f15102a;
/* 44 */            Rect rect2 = this.f18864i;
/* 46 */            if (rect2 != null) {
/* 48 */                rect = rect2;
                    } else {
/* 62 */                rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
                    }
/* 66 */            Objects.requireNonNull(rect);
/* 73 */            int iM9659g = m9659g(interfaceC2559zpM9655b, m9661k(interfaceC2559zpM9655b));
/* 79 */            jw0 jw0Var = (jw0) this.f18861f;
/* 81 */            C1888lf c1888lf = jw0.f12521s;
/* 113 */           lj2 lj2Var = new lj2(1, 34, c2069pg, matrix, zMo8072k, rect, iM9659g, ((Integer) jw0Var.mo7023b(c1888lf, -1)).intValue(), interfaceC2559zpM9655b.mo8072k() && m9661k(interfaceC2559zpM9655b));
/* 116 */           this.f18378s = lj2Var;
/* 122 */           RunnableC2166s2 runnableC2166s2 = new RunnableC2166s2(this, 27);
/* 125 */           pg3.m7423a();
/* 128 */           lj2Var.m6461a();
/* 133 */           lj2Var.f13330m.add(runnableC2166s2);
/* 138 */           rj2 rj2VarM6463c = this.f18378s.m6463c(true);
/* 142 */           this.f18379t = rj2VarM6463c;
/* 146 */           this.f18377r = rj2VarM6463c.f16130j;
/* 150 */           int i = 3;
/* 151 */           if (this.f18374o != null) {
/* 153 */               InterfaceC2559zp interfaceC2559zpM9655b2 = m9655b();
/* 157 */               lj2 lj2Var2 = this.f18378s;
/* 159 */               if (interfaceC2559zpM9655b2 != null && lj2Var2 != null) {
/* 190 */                   pg3.m7443w(new ij2(lj2Var2, m9659g(interfaceC2559zpM9655b2, m9661k(interfaceC2559zpM9655b2)), ((Integer) ((jw0) this.f18861f).mo7023b(c1888lf, -1)).intValue()));
                        }
/* 193 */               uw1 uw1Var = this.f18374o;
/* 195 */               uw1Var.getClass();
/* 198 */               rj2 rj2Var = this.f18379t;
/* 200 */               rj2Var.getClass();
/* 210 */               this.f18375p.execute(new ji1(3, uw1Var, rj2Var));
                    }
/* 215 */           bb2 bb2VarM1315d = bb2.m1315d(ww1Var, c2069pg.f15102a);
/* 219 */           C1767ir c1767ir = bb2VarM1315d.f164b;
/* 221 */           Range range = c2069pg.f15104c;
/* 223 */           c1767ir.getClass();
/* 232 */           ((uk1) c1767ir.f11911d).m9037p(C1803jr.f12440j, range);
/* 235 */           int iM10450v = ww1Var.m10450v();
/* 239 */           if (iM10450v != 0) {
/* 241 */               c1767ir.getClass();
/* 244 */               if (iM10450v != 0) {
/* 256 */                   ((uk1) c1767ir.f11911d).m9037p(zy2.f20393P, Integer.valueOf(iM10450v));
                        }
                    }
/* 259 */           InterfaceC2235ty interfaceC2235ty = c2069pg.f15105d;
/* 261 */           if (interfaceC2235ty != null) {
/* 263 */               c1767ir.m5545e(interfaceC2235ty);
                    }
/* 268 */           if (this.f18374o != null) {
/* 290 */               bb2VarM1315d.m1317b(this.f18377r, c2069pg.f15103b, ((Integer) ((jw0) this.f18861f).mo7023b(jw0.f12522t, -1)).intValue());
                    }
/* 293 */           cb2 cb2Var = this.f18380u;
/* 295 */           if (cb2Var != null) {
/* 297 */               cb2Var.m1609b();
                    }
/* 307 */           cb2 cb2Var2 = new cb2(new kv0(this, i));
/* 310 */           this.f18380u = cb2Var2;
/* 312 */           bb2VarM1315d.f168f = cb2Var2;
/* 314 */           this.f18376q = bb2VarM1315d;
/* 320 */           Object[] objArr = {bb2VarM1315d.m1318c()};
/* 326 */           ArrayList arrayList = new ArrayList(1);
/* 329 */           Object obj = objArr[0];
/* 331 */           Objects.requireNonNull(obj);
/* 334 */           arrayList.add(obj);
/* 341 */           m9653A(Collections.unmodifiableList(arrayList));
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: e */
                public final zy2 mo6439e(boolean z, cz2 cz2Var) {
/* 3 */             f18372v.getClass();
/* 6 */             ww1 ww1Var = tw1.f17295a;
/* 13 */            InterfaceC2235ty interfaceC2235tyMo1183a = cz2Var.mo1183a(ww1Var.mo7453t(), 1);
/* 17 */            if (z) {
/* 19 */                interfaceC2235tyMo1183a = InterfaceC2235ty.m8924q(interfaceC2235tyMo1183a, ww1Var);
                    }
/* 23 */            if (interfaceC2235tyMo1183a == null) {
/* 25 */                return null;
                    }
/* 41 */            return new ww1(nq1.m7021d(((C1974nr) mo6441j(interfaceC2235tyMo1183a)).f14413b));
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: i */
                public final Set mo6440i() {
/* 3 */             HashSet hashSet = new HashSet();
/* 11 */            hashSet.add(1);
/* 14 */            return hashSet;
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: j */
                public final yy2 mo6441j(InterfaceC2235ty interfaceC2235ty) {
/* 8 */             return new C1974nr(uk1.m9035m(interfaceC2235ty), 3);
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: r */
                public final zy2 mo6443r(InterfaceC2469xp interfaceC2469xp, yy2 yy2Var) {
/* 13 */            yy2Var.mo2939m().m9037p(hw0.f9338o, 34);
/* 16 */            return yy2Var.mo7036o();
                }

                public final String toString() {
/* 7 */             return "Preview:".concat(m9658f());
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: u */
                public final C2069pg mo6446u(InterfaceC2235ty interfaceC2235ty) {
/* 3 */             this.f18376q.m1316a(interfaceC2235ty);
/* 12 */            Object[] objArr = {this.f18376q.m1318c()};
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
/* 5 */             m9352E((ww1) this.f18861f, c2069pg);
/* 8 */             return c2069pg;
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: w */
                public final void mo6448w() {
/* 1 */             m9349B();
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: y */
                public final void mo7564y(Rect rect) {
/* 1 */             this.f18864i = rect;
/* 3 */             InterfaceC2559zp interfaceC2559zpM9655b = m9655b();
/* 7 */             lj2 lj2Var = this.f18378s;
/* 9 */             if (interfaceC2559zpM9655b == null || lj2Var == null) {
/* 50 */                return;
                    }
/* 47 */            pg3.m7443w(new ij2(lj2Var, m9659g(interfaceC2559zpM9655b, m9661k(interfaceC2559zpM9655b)), ((Integer) ((jw0) this.f18861f).mo7023b(jw0.f12521s, -1)).intValue()));
                }
            }
