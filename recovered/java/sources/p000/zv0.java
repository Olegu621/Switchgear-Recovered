            package p000;

            import android.util.Pair;
            import android.util.Size;
            import android.view.Surface;
            import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
            import androidx.core.app.NotificationCompat;
            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zv0 extends wy2 {

                /* JADX INFO: renamed from: x */
                public static final xv0 f20342x = new xv0();

                /* JADX INFO: renamed from: o */
                public final int f20343o;

                /* JADX INFO: renamed from: p */
                public final AtomicReference f20344p;

                /* JADX INFO: renamed from: q */
                public final int f20345q;

                /* JADX INFO: renamed from: r */
                public final s72 f20346r;

                /* JADX INFO: renamed from: s */
                public bb2 f20347s;

                /* JADX INFO: renamed from: t */
                public ra2 f20348t;

                /* JADX INFO: renamed from: u */
                public qm2 f20349u;

                /* JADX INFO: renamed from: v */
                public cb2 f20350v;

                /* JADX INFO: renamed from: w */
                public final zb0 f20351w;

                public zv0(aw0 aw0Var) {
/* 1 */             super(aw0Var);
/* 10 */            this.f20344p = new AtomicReference(null);
/* 13 */            this.f20345q = -1;
/* 22 */            this.f20351w = new zb0(this, 15);
/* 26 */            aw0 aw0Var2 = (aw0) this.f18861f;
/* 28 */            C1888lf c1888lf = aw0.f2117b;
/* 34 */            if (aw0Var2.mo7028h(c1888lf)) {
/* 46 */                this.f20343o = ((Integer) aw0Var2.mo7025e(c1888lf)).intValue();
                    } else {
/* 50 */                this.f20343o = 1;
                    }
/* 65 */            ((Integer) aw0Var2.mo7023b(aw0.f2123v, 0)).getClass();
/* 81 */            this.f20346r = new s72((s72) aw0Var2.mo7023b(aw0.f2124w, null));
                }

                /* JADX INFO: renamed from: E */
                public static boolean m10443E(int i, List list) {
/* 1 */             Iterator it = list.iterator();
/* 9 */             while (it.hasNext()) {
/* 29 */                if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
/* 31 */                    return true;
                        }
                    }
/* 33 */            return false;
                }

                /* JADX INFO: renamed from: B */
                public final void m10444B(boolean z) {
                    qm2 qm2Var;
/* 1 */             pg3.m7423a();
/* 4 */             cb2 cb2Var = this.f20350v;
/* 7 */             if (cb2Var != null) {
/* 9 */                 cb2Var.m1609b();
/* 12 */                this.f20350v = null;
                    }
/* 14 */            ra2 ra2Var = this.f20348t;
/* 16 */            if (ra2Var != null) {
/* 18 */                ra2Var.m8104g();
/* 21 */                this.f20348t = null;
                    }
/* 23 */            if (z || (qm2Var = this.f20349u) == null) {
/* 34 */                return;
                    }
/* 29 */            qm2Var.m7951a();
/* 32 */            this.f20349u = null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: C */
                public final bb2 m10445C(String str, aw0 aw0Var, C2069pg c2069pg) {
                    int iIntValue;
                    int i;
                    C1863kr c1863kr;
                    ow0 ow0Var;
/* 7 */             pg3.m7423a();
/* 10 */            Objects.toString(c2069pg);
/* 13 */            Size size = c2069pg.f15102a;
/* 15 */            InterfaceC2559zp interfaceC2559zpM9655b = m9655b();
/* 19 */            Objects.requireNonNull(interfaceC2559zpM9655b);
/* 22 */            boolean zMo8072k = interfaceC2559zpM9655b.mo8072k();
/* 26 */            boolean z = !zMo8072k;
/* 31 */            if (this.f20348t != null) {
/* 33 */                de3.m3028j(null, z);
/* 38 */                this.f20348t.m8104g();
                    }
/* 57 */            if (((Boolean) this.f18861f.mo7023b(aw0.f2116U, Boolean.FALSE)).booleanValue()) {
/* 67 */                m9655b().mo9993f().m4259u();
                    }
/* 72 */            ra2 ra2Var = new ra2();
/* 75 */            pg3.m7423a();
/* 78 */            ra2Var.f15955a = aw0Var;
/* 86 */            C0223co c0223co = (C0223co) aw0Var.mo7023b(zy2.f20387J, null);
/* 88 */            if (c0223co == null) {
/* 600 */               ds0.m3206w((String) aw0Var.mo7023b(rm2.f16183D, aw0Var.toString()), "Implementation is missing option unpacker for ");
/* 603 */               throw null;
                    }
/* 92 */            C1767ir c1767ir = new C1767ir();
/* 95 */            c0223co.mo1448a(aw0Var, c1767ir);
/* 98 */            c1767ir.m5546i();
/* 106 */           C0210cb c0210cb = new C0210cb(21, false);
/* 109 */           ra2Var.f15956b = c0210cb;
/* 123 */           Executor executor = (Executor) aw0Var.mo7023b(vz0.f18402C, pg3.m7435n());
/* 125 */           Objects.requireNonNull(executor);
/* 128 */           C1822k8 c1822k8 = new C1822k8(executor);
/* 131 */           ra2Var.f15957c = c1822k8;
/* 133 */           int iMo1175l = aw0Var.mo1175l();
/* 143 */           Integer num = (Integer) aw0Var.mo7023b(aw0.f2119d, null);
/* 145 */           if (num != null) {
/* 147 */               iIntValue = num.intValue();
                    } else {
/* 158 */               Integer num2 = (Integer) aw0Var.mo7023b(hw0.f9338o, null);
/* 172 */               iIntValue = (num2 == null || num2.intValue() != 4101) ? NotificationCompat.FLAG_LOCAL_ONLY : 4101;
                    }
/* 180 */           if (aw0Var.mo7023b(aw0.f2121f, null) != null) {
/* 581 */               C1697u2.m5431g();
/* 584 */               throw null;
                    }
/* 187 */           ac0 ac0Var = new ac0();
/* 192 */           ac0 ac0Var2 = new ac0();
/* 195 */           C1791jf c1791jf = new C1791jf(size, iMo1175l, iIntValue, z, ac0Var, ac0Var2);
/* 198 */           ra2Var.f15958d = c1791jf;
/* 217 */           de3.m3028j("CaptureNode does not support recreation yet.", ((C1791jf) c0210cb.f2805c) == null && ((C1767ir) c0210cb.f2804b) == null);
/* 220 */           c0210cb.f2805c = c1791jf;
/* 224 */           C1937mr c1937mr = new C1937mr();
/* 227 */           int i2 = 2;
/* 229 */           if (zMo8072k) {
/* 245 */               li1 li1Var = new li1(size.getWidth(), size.getHeight(), iMo1175l, 4);
/* 256 */               List<AbstractC1934mo> listAsList = Arrays.asList(c1937mr, li1Var.f13305b);
/* 264 */               if (!listAsList.isEmpty()) {
/* 273 */                   if (listAsList.size() == 1) {
                            } else {
/* 286 */                       ArrayList arrayList = new ArrayList();
/* 297 */                       for (AbstractC1934mo abstractC1934mo : listAsList) {
/* 307 */                           if (!(abstractC1934mo instanceof AbstractC2040oo)) {
/* 309 */                               arrayList.add(abstractC1934mo);
                                    }
                                }
                            }
                        }
/* 315 */               i = 0;
/* 316 */               c1863kr = new C1863kr(c0210cb, i);
                        ow0Var = li1Var;
                    } else {
/* 320 */               i = 0;
/* 336 */               fs0 fs0Var = new fs0(i13.m4433j(size.getWidth(), size.getHeight(), iMo1175l, 4), 7);
/* 342 */               c1863kr = new C1863kr(c0210cb, 1);
                        ow0Var = fs0Var;
                    }
/* 345 */           Surface surface = ow0Var.getSurface();
/* 349 */           Objects.requireNonNull(surface);
/* 361 */           de3.m3028j("The surface is already set.", c1791jf.f12240a == null ? 1 : i);
/* 369 */           c1791jf.f12240a = new uw0(surface, size, iMo1175l);
/* 376 */           c0210cb.f2804b = new C1767ir(ow0Var);
/* 387 */           ow0Var.mo3811f(new C1951n4(c0210cb), pg3.m7436o());
/* 390 */           ac0Var.f173b = c1863kr;
/* 397 */           ac0Var2.f173b = new C1863kr(c0210cb, i2);
/* 411 */           this.f20348t = ra2Var;
/* 415 */           if (this.f20349u == null) {
/* 424 */               this.f20349u = new qm2(this.f20351w);
                    }
/* 426 */           qm2 qm2Var = this.f20349u;
/* 428 */           ra2 ra2Var2 = this.f20348t;
/* 430 */           qm2Var.getClass();
/* 433 */           pg3.m7423a();
/* 436 */           qm2Var.f15655b = ra2Var2;
/* 438 */           ra2Var2.getClass();
/* 441 */           pg3.m7423a();
/* 446 */           C0210cb c0210cb2 = (C0210cb) ra2Var2.f15956b;
/* 448 */           c0210cb2.getClass();
/* 451 */           pg3.m7423a();
/* 465 */           de3.m3028j("The ImageReader is not initialized.", ((C1767ir) c0210cb2.f2804b) != null);
/* 470 */           C1767ir c1767ir2 = (C1767ir) c0210cb2.f2804b;
                    synchronized (c1767ir2.f11910c) {
/* 475 */               c1767ir2.f11913f = qm2Var;
                    }
/* 478 */           ra2 ra2Var3 = this.f20348t;
/* 486 */           bb2 bb2VarM1315d = bb2.m1315d((aw0) ra2Var3.f15955a, c2069pg.f15102a);
/* 492 */           C1791jf c1791jf2 = (C1791jf) ra2Var3.f15958d;
/* 494 */           uw0 uw0Var = c1791jf2.f12240a;
/* 496 */           Objects.requireNonNull(uw0Var);
/* 499 */           mb0 mb0Var = mb0.f13671d;
/* 501 */           C0168b5 c0168b5M6646a = C1926mg.m6646a(uw0Var);
/* 505 */           c0168b5M6646a.f2215f = mb0Var;
/* 513 */           bb2VarM1315d.f163a.add(c0168b5M6646a.m1265j());
/* 516 */           uw0 uw0Var2 = c1791jf2.f12241b;
/* 518 */           if (uw0Var2 != null) {
/* 528 */               bb2VarM1315d.f170h = C1926mg.m6646a(uw0Var2).m1265j();
                    }
/* 532 */           if (this.f20343o == 2 && !c2069pg.f15106e) {
/* 542 */               m9656c().mo5852e(bb2VarM1315d);
                    }
/* 545 */           InterfaceC2235ty interfaceC2235ty = c2069pg.f15105d;
/* 547 */           if (interfaceC2235ty != null) {
/* 551 */               bb2VarM1315d.f164b.m5545e(interfaceC2235ty);
                    }
/* 554 */           cb2 cb2Var = this.f20350v;
/* 556 */           if (cb2Var != null) {
/* 558 */               cb2Var.m1609b();
                    }
/* 569 */           cb2 cb2Var2 = new cb2(new kv0(this, 1));
/* 572 */           this.f20350v = cb2Var2;
/* 574 */           bb2VarM1315d.f168f = cb2Var2;
/* 576 */           return bb2VarM1315d;
                }

                /* JADX INFO: renamed from: D */
                public final int m10446D() {
                    int iIntValue;
                    synchronized (this.f20344p) {
/* 4 */                 iIntValue = this.f20345q;
/* 7 */                 if (iIntValue == -1) {
/* 27 */                    iIntValue = ((Integer) ((aw0) this.f18861f).mo7023b(aw0.f2118c, 2)).intValue();
                        }
                    }
/* 32 */            return iIntValue;
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: e */
                public final zy2 mo6439e(boolean z, cz2 cz2Var) {
/* 3 */             f20342x.getClass();
/* 6 */             aw0 aw0Var = xv0.f19382a;
/* 14 */            InterfaceC2235ty interfaceC2235tyMo1183a = cz2Var.mo1183a(aw0Var.mo7453t(), this.f20343o);
/* 18 */            if (z) {
/* 20 */                interfaceC2235tyMo1183a = InterfaceC2235ty.m8924q(interfaceC2235tyMo1183a, aw0Var);
                    }
/* 24 */            if (interfaceC2235tyMo1183a == null) {
/* 26 */                return null;
                    }
/* 42 */            return new aw0(nq1.m7021d(((C1974nr) mo6441j(interfaceC2235tyMo1183a)).f14413b));
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: i */
                public final Set mo6440i() {
/* 3 */             HashSet hashSet = new HashSet();
/* 11 */            hashSet.add(4);
/* 14 */            return hashSet;
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: j */
                public final yy2 mo6441j(InterfaceC2235ty interfaceC2235ty) {
/* 8 */             return new C1974nr(uk1.m9035m(interfaceC2235ty), 2);
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: p */
                public final void mo6442p() {
/* 7 */             de3.m3027i(m9655b(), "Attached camera cannot be null");
/* 15 */            if (m10446D() == 3) {
/* 17 */                InterfaceC2559zp interfaceC2559zpM9655b = m9655b();
/* 33 */                if ((interfaceC2559zpM9655b != null ? interfaceC2559zpM9655b.mo8073m().mo312d() : -1) == 0) {
/* 41 */                    return;
                        }
/* 38 */                C1951n4.m6859j("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
                    }
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: q */
                public final void mo9666q() {
/* 3 */             hu0.m4312F0("ImageCapture");
                    synchronized (this.f20344p) {
                        try {
/* 15 */                    if (this.f20344p.get() == null) {
/* 29 */                        m9656c().mo5850c(m10446D());
                            }
                        } catch (Throwable th) {
/* 44 */                    throw th;
                        }
                    }
/* 39 */            m9656c().mo5851d(this.f20346r);
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: r */
                public final zy2 mo6443r(InterfaceC2469xp interfaceC2469xp, yy2 yy2Var) {
                    Object objMo7025e;
                    Object objMo7025e2;
                    Object objMo7025e3;
/* 9 */             Integer numValueOf = Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY);
/* 25 */            if (interfaceC2469xp.mo314f().m3579d(SoftwareJpegEncodingPreferredQuirk.class)) {
/* 27 */                Boolean bool = Boolean.FALSE;
/* 29 */                uk1 uk1VarMo2939m = yy2Var.mo2939m();
/* 33 */                C1888lf c1888lf = aw0.f2122i;
/* 35 */                Object objMo7025e4 = Boolean.TRUE;
/* 37 */                uk1VarMo2939m.getClass();
                        try {
/* 40 */                    objMo7025e4 = uk1VarMo2939m.mo7025e(c1888lf);
                        } catch (IllegalArgumentException unused) {
                        }
/* 48 */                if (bool.equals(objMo7025e4)) {
/* 52 */                    hu0.m4315H0("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
                        } else {
/* 56 */                    hu0.m4312F0("ImageCapture");
/* 67 */                    yy2Var.mo2939m().m9037p(aw0.f2122i, Boolean.TRUE);
                        }
                    }
/* 70 */            uk1 uk1VarMo2939m2 = yy2Var.mo2939m();
/* 74 */            Boolean bool2 = Boolean.TRUE;
/* 76 */            C1888lf c1888lf2 = aw0.f2122i;
/* 78 */            Object objMo7025e5 = Boolean.FALSE;
/* 80 */            uk1VarMo2939m2.getClass();
                    try {
/* 83 */                objMo7025e5 = uk1VarMo2939m2.mo7025e(c1888lf2);
                    } catch (IllegalArgumentException unused2) {
                    }
/* 87 */            boolean zEquals = bool2.equals(objMo7025e5);
/* 92 */            Object objMo7025e6 = null;
/* 93 */            boolean z = false;
/* 94 */            if (zEquals) {
/* 100 */               if (m9655b() != null) {
/* 111 */                   m9655b().mo9993f().m4259u();
                        }
                        try {
/* 116 */                   objMo7025e3 = uk1VarMo2939m2.mo7025e(aw0.f2119d);
                        } catch (IllegalArgumentException unused3) {
/* 121 */                   objMo7025e3 = null;
                        }
/* 122 */               Integer num = (Integer) objMo7025e3;
/* 124 */               if (num == null || num.intValue() == 256) {
/* 138 */                   z = true;
                        } else {
/* 134 */                   hu0.m4315H0("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
                        }
/* 139 */               if (!z) {
/* 143 */                   hu0.m4315H0("ImageCapture", "Unable to support software JPEG. Disabling.");
/* 150 */                   uk1VarMo2939m2.m9037p(aw0.f2122i, Boolean.FALSE);
                        }
                    }
/* 153 */           uk1 uk1VarMo2939m3 = yy2Var.mo2939m();
/* 157 */           C1888lf c1888lf3 = aw0.f2119d;
/* 159 */           uk1VarMo2939m3.getClass();
                    try {
/* 162 */               objMo7025e = uk1VarMo2939m3.mo7025e(c1888lf3);
                    } catch (IllegalArgumentException unused4) {
/* 167 */               objMo7025e = null;
                    }
/* 168 */           Integer num2 = (Integer) objMo7025e;
/* 170 */           if (num2 != null) {
/* 176 */               if (m9655b() != null) {
/* 187 */                   m9655b().mo9993f().m4259u();
                        }
/* 207 */               yy2Var.mo2939m().m9037p(hw0.f9338o, Integer.valueOf(z ? 35 : num2.intValue()));
                    } else {
/* 212 */               uk1 uk1VarMo2939m4 = yy2Var.mo2939m();
/* 216 */               C1888lf c1888lf4 = aw0.f2120e;
/* 218 */               uk1VarMo2939m4.getClass();
                        try {
/* 221 */                   objMo7025e2 = uk1VarMo2939m4.mo7025e(c1888lf4);
                        } catch (IllegalArgumentException unused5) {
/* 226 */                   objMo7025e2 = null;
                        }
/* 235 */               if (Objects.equals(objMo7025e2, 1)) {
/* 249 */                   yy2Var.mo2939m().m9037p(hw0.f9338o, 4101);
/* 260 */                   yy2Var.mo2939m().m9037p(hw0.f9339p, mb0.f13670c);
                        } else if (z) {
/* 272 */                   yy2Var.mo2939m().m9037p(hw0.f9338o, 35);
                        } else {
/* 276 */                   uk1 uk1VarMo2939m5 = yy2Var.mo2939m();
/* 280 */                   C1888lf c1888lf5 = jw0.f12526z;
/* 282 */                   uk1VarMo2939m5.getClass();
                            try {
/* 285 */                       objMo7025e6 = uk1VarMo2939m5.mo7025e(c1888lf5);
                            } catch (IllegalArgumentException unused6) {
                            }
/* 289 */                   List list = (List) objMo7025e6;
/* 291 */                   if (list == null || m10443E(NotificationCompat.FLAG_LOCAL_ONLY, list)) {
/* 315 */                       yy2Var.mo2939m().m9037p(hw0.f9338o, numValueOf);
                            } else if (m10443E(35, list)) {
/* 331 */                       yy2Var.mo2939m().m9037p(hw0.f9338o, 35);
                            }
                        }
                    }
/* 334 */           return yy2Var.mo7036o();
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: t */
                public final void mo6445t() {
/* 1 */             s72 s72Var = this.f20346r;
/* 3 */             s72Var.m8419b();
/* 6 */             s72Var.m8418a();
/* 9 */             qm2 qm2Var = this.f20349u;
/* 11 */            if (qm2Var != null) {
/* 13 */                qm2Var.m7951a();
                    }
                }

                public final String toString() {
/* 7 */             return "ImageCapture:".concat(m9658f());
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: u */
                public final C2069pg mo6446u(InterfaceC2235ty interfaceC2235ty) {
/* 3 */             this.f20347s.m1316a(interfaceC2235ty);
/* 12 */            Object[] objArr = {this.f20347s.m1318c()};
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
/* 9 */             bb2 bb2VarM10445C = m10445C(m9657d(), (aw0) this.f18861f, c2069pg);
/* 13 */            this.f20347s = bb2VarM10445C;
/* 19 */            Object[] objArr = {bb2VarM10445C.m1318c()};
/* 26 */            ArrayList arrayList = new ArrayList(1);
/* 30 */            Object obj = objArr[0];
/* 32 */            Objects.requireNonNull(obj);
/* 35 */            arrayList.add(obj);
/* 42 */            m9653A(Collections.unmodifiableList(arrayList));
/* 45 */            m9663m();
/* 48 */            return c2069pg;
                }

                @Override // p000.wy2
                /* JADX INFO: renamed from: w */
                public final void mo6448w() {
/* 1 */             s72 s72Var = this.f20346r;
/* 3 */             s72Var.m8419b();
/* 6 */             s72Var.m8418a();
/* 9 */             qm2 qm2Var = this.f20349u;
/* 11 */            if (qm2Var != null) {
/* 13 */                qm2Var.m7951a();
                    }
/* 17 */            m10444B(false);
/* 25 */            m9656c().mo5851d(null);
                }
            }
