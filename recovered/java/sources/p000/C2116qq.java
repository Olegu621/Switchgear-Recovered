            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.util.Pair;
            import android.util.Range;
            import android.util.Rational;
            import android.util.Size;
            import androidx.core.app.NotificationCompat;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.Executor;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: qq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2116qq implements InterfaceC1838ko {

                /* JADX INFO: renamed from: U */
                public final C1801jp f15688U;

                /* JADX INFO: renamed from: V */
                public final Object f15689V;

                /* JADX INFO: renamed from: W */
                public boolean f15690W;

                /* JADX INFO: renamed from: X */
                public InterfaceC2235ty f15691X;

                /* JADX INFO: renamed from: Y */
                public wy2 f15692Y;

                /* JADX INFO: renamed from: Z */
                public lh2 f15693Z;

                /* JADX INFO: renamed from: a */
                public final InterfaceC2559zp f15694a;

                /* JADX INFO: renamed from: a0 */
                public final g42 f15695a0;

                /* JADX INFO: renamed from: b */
                public final InterfaceC2559zp f15696b;

                /* JADX INFO: renamed from: b0 */
                public final g42 f15697b0;

                /* JADX INFO: renamed from: c */
                public final C0210cb f15698c;

                /* JADX INFO: renamed from: c0 */
                public final xt0 f15699c0;

                /* JADX INFO: renamed from: d */
                public final cz2 f15700d;

                /* JADX INFO: renamed from: d0 */
                public final xt0 f15701d0;

                /* JADX INFO: renamed from: e */
                public final C0989hf f15702e;

                /* JADX INFO: renamed from: f */
                public final ArrayList f15703f;

                /* JADX INFO: renamed from: i */
                public final ArrayList f15704i;

                /* JADX INFO: renamed from: v */
                public final C1837kn f15705v;

                /* JADX INFO: renamed from: w */
                public List f15706w;

                public C2116qq(InterfaceC2559zp interfaceC2559zp, InterfaceC2559zp interfaceC2559zp2, g42 g42Var, g42 g42Var2, C1837kn c1837kn, C0210cb c0210cb, C1800jo c1800jo) {
/* 1 */             xt0 xt0Var = xt0.f19356U;
/* 11 */            this.f15703f = new ArrayList();
/* 18 */            this.f15704i = new ArrayList();
/* 22 */            this.f15706w = Collections.EMPTY_LIST;
/* 29 */            this.f15689V = new Object();
/* 32 */            this.f15690W = true;
/* 35 */            this.f15691X = null;
/* 37 */            this.f15694a = interfaceC2559zp;
/* 39 */            this.f15696b = interfaceC2559zp2;
/* 41 */            this.f15699c0 = xt0Var;
/* 43 */            this.f15701d0 = xt0Var;
/* 45 */            this.f15705v = c1837kn;
/* 47 */            this.f15698c = c0210cb;
/* 49 */            this.f15700d = c1800jo;
/* 51 */            C1801jp c1801jp = g42Var.f8469c;
/* 53 */            this.f15688U = c1801jp;
/* 55 */            c1801jp.m4259u();
/* 58 */            this.f15695a0 = g42Var;
/* 60 */            this.f15697b0 = g42Var2;
/* 66 */            this.f15702e = m7970s(g42Var, g42Var2);
                }

                /* JADX INFO: renamed from: n */
                public static Matrix m7968n(Rect rect, Size size) {
/* 18 */            de3.m3023e("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
/* 23 */            RectF rectF = new RectF(rect);
/* 28 */            Matrix matrix = new Matrix();
/* 49 */            matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
/* 52 */            matrix.invert(matrix);
/* 55 */            return matrix;
                }

                /* JADX INFO: renamed from: p */
                public static zv0 m7969p() {
                    Object objMo7025e;
                    Object objMo7025e2;
                    Object objMo7025e3;
                    Object objMo7025e4;
/* 4 */             C1974nr c1974nr = new C1974nr(2);
/* 7 */             C1888lf c1888lf = rm2.f16183D;
/* 9 */             uk1 uk1Var = c1974nr.f14413b;
/* 13 */            uk1Var.m9037p(c1888lf, "ImageCapture-Extra");
/* 16 */            C1888lf c1888lf2 = aw0.f2119d;
/* 18 */            uk1Var.getClass();
                    try {
/* 22 */                objMo7025e = uk1Var.mo7025e(c1888lf2);
                    } catch (IllegalArgumentException unused) {
/* 27 */                objMo7025e = null;
                    }
/* 28 */            Integer num = (Integer) objMo7025e;
/* 31 */            if (num != null) {
/* 35 */                uk1Var.m9037p(hw0.f9338o, num);
                    } else {
/* 39 */                xv0 xv0Var = zv0.f20342x;
                        try {
/* 43 */                    objMo7025e2 = uk1Var.mo7025e(aw0.f2120e);
                        } catch (IllegalArgumentException unused2) {
/* 48 */                    objMo7025e2 = null;
                        }
/* 57 */                if (Objects.equals(objMo7025e2, 1)) {
/* 67 */                    uk1Var.m9037p(hw0.f9338o, 4101);
/* 74 */                    uk1Var.m9037p(hw0.f9339p, mb0.f13670c);
                        } else {
/* 86 */                    uk1Var.m9037p(hw0.f9338o, Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY));
                        }
                    }
/* 95 */            aw0 aw0Var = new aw0(nq1.m7021d(uk1Var));
/* 98 */            jw0.m5922y(aw0Var);
/* 103 */           zv0 zv0Var = new zv0(aw0Var);
                    try {
/* 108 */               objMo7025e3 = uk1Var.mo7025e(jw0.f12523u);
                    } catch (IllegalArgumentException unused3) {
/* 113 */               objMo7025e3 = null;
                    }
/* 114 */           Size size = (Size) objMo7025e3;
/* 116 */           if (size != null) {
/* 128 */               new Rational(size.getWidth(), size.getHeight());
                    }
/* 131 */           C1888lf c1888lf3 = vz0.f18402C;
/* 133 */           Object objM7435n = pg3.m7435n();
                    try {
/* 137 */               objM7435n = uk1Var.mo7025e(c1888lf3);
                    } catch (IllegalArgumentException unused4) {
                    }
/* 145 */           de3.m3027i((Executor) objM7435n, "The IO executor can't be null");
/* 148 */           C1888lf c1888lf4 = aw0.f2118c;
/* 156 */           if (uk1Var.f14411a.containsKey(c1888lf4)) {
/* 162 */               Integer num2 = (Integer) uk1Var.mo7025e(c1888lf4);
/* 164 */               if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
/* 216 */                   s80.m8430k(num2, "The flash mode is not allowed to set: ");
/* 21 */                    return null;
                        }
/* 195 */               if (num2.intValue() == 3) {
                            try {
/* 199 */                       objMo7025e4 = uk1Var.mo7025e(aw0.f2124w);
                            } catch (IllegalArgumentException unused5) {
/* 204 */                       objMo7025e4 = null;
                            }
/* 205 */                   if (objMo7025e4 == null) {
/* 210 */                       C1951n4.m6859j("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
/* 21 */                        return null;
                            }
                        }
                    }
/* 220 */           return zv0Var;
                }

                /* JADX INFO: renamed from: s */
                public static C0989hf m7970s(g42 g42Var, g42 g42Var2) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 12 */            sb.append(g42Var.f334a.mo310b());
/* 26 */            sb.append(g42Var2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : g42Var2.f334a.mo310b());
/* 39 */            return new C0989hf(sb.toString(), g42Var.f8469c.f12414a);
                }

                /* JADX INFO: renamed from: t */
                public static HashMap m7971t(ArrayList arrayList, cz2 cz2Var, cz2 cz2Var2) {
                    zy2 zy2VarMo6439e;
/* 3 */             HashMap map = new HashMap();
/* 6 */             Iterator it = arrayList.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                wy2 wy2Var = (wy2) it.next();
/* 25 */                if (wy2Var instanceof lh2) {
/* 28 */                    lh2 lh2Var = (lh2) wy2Var;
/* 40 */                    zy2 zy2VarMo6439e2 = new C1974nr(3).m7035a().mo6439e(false, cz2Var);
/* 44 */                    if (zy2VarMo6439e2 == null) {
/* 46 */                        zy2VarMo6439e = null;
                            } else {
/* 48 */                        uk1 uk1VarM9035m = uk1.m9035m(zy2VarMo6439e2);
/* 56 */                        uk1VarM9035m.f14411a.remove(rm2.f16184E);
/* 65 */                        zy2VarMo6439e = ((C2340wq) lh2Var.mo6441j(uk1VarM9035m)).mo7036o();
                            }
                        } else {
/* 70 */                    zy2VarMo6439e = wy2Var.mo6439e(false, cz2Var);
                        }
/* 75 */                zy2 zy2VarMo6439e3 = wy2Var.mo6439e(true, cz2Var2);
/* 81 */                C2079pq c2079pq = new C2079pq();
/* 84 */                c2079pq.f15243a = zy2VarMo6439e;
/* 86 */                c2079pq.f15244b = zy2VarMo6439e3;
/* 88 */                map.put(wy2Var, c2079pq);
                    }
/* 92 */            return map;
                }

                /* JADX INFO: renamed from: x */
                public static boolean m7972x(C2069pg c2069pg, fb2 fb2Var) {
/* 1 */             InterfaceC2235ty interfaceC2235ty = c2069pg.f15105d;
/* 5 */             nq1 nq1Var = fb2Var.f8120g.f12442b;
/* 27 */            if (interfaceC2235ty.mo7024c().size() != fb2Var.f8120g.f12442b.mo7024c().size()) {
/* 72 */                return true;
                    }
/* 42 */            for (C1888lf c1888lf : interfaceC2235ty.mo7024c()) {
/* 56 */                if (!nq1Var.f14411a.containsKey(c1888lf) || !Objects.equals(nq1Var.mo7025e(c1888lf), interfaceC2235ty.mo7025e(c1888lf))) {
/* 72 */                    return true;
                        }
                    }
/* 74 */            return false;
                }

                /* JADX INFO: renamed from: z */
                public static ArrayList m7973z(ArrayList arrayList, List list) {
/* 3 */             ArrayList arrayList2 = new ArrayList(list);
/* 6 */             Iterator it = arrayList.iterator();
/* 14 */            while (it.hasNext()) {
/* 22 */                ((wy2) it.next()).getClass();
/* 25 */                Iterator it2 = list.iterator();
/* 33 */                if (it2.hasNext()) {
/* 40 */                    throw fm0.m3780f(it2);
                        }
                    }
/* 41 */            return arrayList2;
                }

                /* JADX INFO: renamed from: A */
                public final void m7974A(LinkedHashSet linkedHashSet, boolean z) {
                    int i;
                    int i2;
                    C2069pg c2069pg;
                    InterfaceC2235ty interfaceC2235ty;
                    boolean z2;
                    synchronized (this.f15689V) {
                        try {
/* 8 */                     m7984w();
                            synchronized (this.f15689V) {
                                try {
/* 20 */                            i = 0;
/* 22 */                            if (!this.f15706w.isEmpty()) {
/* 24 */                                Iterator it = linkedHashSet.iterator();
                                        while (true) {
/* 32 */                                    if (!it.hasNext()) {
/* 72 */                                        z2 = false;
                                                break;
                                            }
/* 38 */                                    wy2 wy2Var = (wy2) it.next();
/* 42 */                                    if (wy2Var instanceof zv0) {
/* 45 */                                        zy2 zy2Var = wy2Var.f18861f;
/* 47 */                                        C1888lf c1888lf = aw0.f2120e;
/* 53 */                                        if (zy2Var.mo7028h(c1888lf)) {
/* 59 */                                            Integer num = (Integer) zy2Var.mo7025e(c1888lf);
/* 61 */                                            num.getClass();
/* 68 */                                            if (num.intValue() == 1) {
/* 70 */                                                z2 = true;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
/* 73 */                                if (z2) {
/* 83 */                                    throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                                        }
                                    }
                                } catch (Throwable th) {
/* 594 */                           throw th;
                                }
                            }
/* 88 */                    if (!z) {
/* 90 */                        m7984w();
                            }
/* 97 */                    lh2 lh2VarM7980q = m7980q(linkedHashSet, z);
/* 101 */                   wy2 wy2VarM7978g = m7978g(linkedHashSet, lh2VarM7980q);
/* 107 */                   ArrayList arrayList = new ArrayList(linkedHashSet);
/* 110 */                   if (wy2VarM7978g != null) {
/* 112 */                       arrayList.add(wy2VarM7978g);
                            }
/* 115 */                   if (lh2VarM7980q != null) {
/* 117 */                       arrayList.add(lh2VarM7980q);
/* 124 */                       arrayList.removeAll(lh2VarM7980q.f13283p.f16439a);
                            }
/* 129 */                   ArrayList<wy2> arrayList2 = new ArrayList(arrayList);
/* 134 */                   arrayList2.removeAll(this.f15704i);
/* 139 */                   ArrayList<wy2> arrayList3 = new ArrayList(arrayList);
/* 144 */                   arrayList3.retainAll(this.f15704i);
/* 151 */                   ArrayList<wy2> arrayList4 = new ArrayList(this.f15704i);
/* 154 */                   arrayList4.removeAll(arrayList);
/* 171 */                   HashMap mapM7971t = m7971t(arrayList2, (cz2) this.f15688U.mo7023b(InterfaceC0999hp.f9168h, cz2.f6943a), this.f15700d);
/* 175 */                   Map mapM7979o = Collections.EMPTY_MAP;
                            try {
                                synchronized (this.f15689V) {
                                    try {
/* 194 */                               i2 = this.f15705v.f12882b == 2 ? 1 : 0;
                                    } catch (Throwable th2) {
/* 575 */                               throw th2;
                                    }
                                }
/* 201 */                       HashMap mapM7979o2 = m7979o(i2, this.f15694a.mo8073m(), arrayList2, arrayList3, mapM7971t);
/* 207 */                       if (this.f15696b != null) {
                                    synchronized (this.f15689V) {
                                        try {
/* 216 */                                   if (this.f15705v.f12882b == 2) {
/* 219 */                                       i = 1;
                                            }
                                        } catch (Throwable th3) {
/* 247 */                                   throw th3;
                                        }
                                    }
/* 224 */                           InterfaceC2559zp interfaceC2559zp = this.f15696b;
/* 226 */                           Objects.requireNonNull(interfaceC2559zp);
/* 238 */                           mapM7979o = m7979o(i, interfaceC2559zp.mo8073m(), arrayList2, arrayList3, mapM7971t);
                                }
/* 249 */                       m7975B(mapM7979o2, arrayList);
/* 254 */                       ArrayList arrayListM7973z = m7973z(arrayList, this.f15706w);
/* 260 */                       ArrayList arrayList5 = new ArrayList(linkedHashSet);
/* 263 */                       arrayList5.removeAll(arrayList);
/* 266 */                       ArrayList arrayListM7973z2 = m7973z(arrayList5, arrayListM7973z);
/* 274 */                       if (arrayListM7973z2.size() > 0) {
/* 292 */                           hu0.m4315H0("CameraUseCaseAdapter", "Unused effects: " + arrayListM7973z2);
                                }
/* 295 */                       Iterator it2 = arrayList4.iterator();
/* 303 */                       while (it2.hasNext()) {
/* 313 */                           ((wy2) it2.next()).m9667z(this.f15694a);
                                }
/* 319 */                       this.f15694a.mo8070i(arrayList4);
/* 324 */                       if (this.f15696b != null) {
/* 334 */                           for (wy2 wy2Var2 : arrayList4) {
/* 342 */                               InterfaceC2559zp interfaceC2559zp2 = this.f15696b;
/* 344 */                               Objects.requireNonNull(interfaceC2559zp2);
/* 347 */                               wy2Var2.m9667z(interfaceC2559zp2);
                                    }
/* 351 */                           InterfaceC2559zp interfaceC2559zp3 = this.f15696b;
/* 353 */                           Objects.requireNonNull(interfaceC2559zp3);
/* 356 */                           interfaceC2559zp3.mo8070i(arrayList4);
                                }
/* 363 */                       if (arrayList4.isEmpty()) {
/* 373 */                           for (wy2 wy2Var3 : arrayList3) {
/* 385 */                               if (mapM7979o2.containsKey(wy2Var3) && (interfaceC2235ty = (c2069pg = (C2069pg) mapM7979o2.get(wy2Var3)).f15105d) != null && m7972x(c2069pg, wy2Var3.f18868m)) {
/* 409 */                                   wy2Var3.f18862g = wy2Var3.mo6446u(interfaceC2235ty);
/* 413 */                                   if (this.f15690W) {
/* 417 */                                       this.f15694a.mo8069g(wy2Var3);
/* 420 */                                       InterfaceC2559zp interfaceC2559zp4 = this.f15696b;
/* 422 */                                       if (interfaceC2559zp4 != null) {
/* 424 */                                           interfaceC2559zp4.mo8069g(wy2Var3);
                                                }
                                            }
                                        }
                                    }
                                }
/* 436 */                       for (wy2 wy2Var4 : arrayList2) {
/* 448 */                           C2079pq c2079pq = (C2079pq) mapM7971t.get(wy2Var4);
/* 450 */                           Objects.requireNonNull(c2079pq);
/* 453 */                           InterfaceC2559zp interfaceC2559zp5 = this.f15696b;
/* 455 */                           InterfaceC2559zp interfaceC2559zp6 = this.f15694a;
/* 457 */                           if (interfaceC2559zp5 != null) {
/* 463 */                               wy2Var4.m9654a(interfaceC2559zp6, interfaceC2559zp5, c2079pq.f15243a, c2079pq.f15244b);
/* 470 */                               C2069pg c2069pg2 = (C2069pg) mapM7979o2.get(wy2Var4);
/* 472 */                               c2069pg2.getClass();
/* 485 */                               wy2Var4.f18862g = wy2Var4.mo6447v(c2069pg2, (C2069pg) mapM7979o.get(wy2Var4));
                                    } else {
/* 493 */                               wy2Var4.m9654a(interfaceC2559zp6, null, c2079pq.f15243a, c2079pq.f15244b);
/* 500 */                               C2069pg c2069pg3 = (C2069pg) mapM7979o2.get(wy2Var4);
/* 502 */                               c2069pg3.getClass();
/* 509 */                               wy2Var4.f18862g = wy2Var4.mo6447v(c2069pg3, null);
                                    }
                                }
/* 514 */                       if (this.f15690W) {
/* 518 */                           this.f15694a.mo8071j(arrayList2);
/* 521 */                           InterfaceC2559zp interfaceC2559zp7 = this.f15696b;
/* 523 */                           if (interfaceC2559zp7 != null) {
/* 525 */                               interfaceC2559zp7.mo8071j(arrayList2);
                                    }
                                }
/* 528 */                       Iterator it3 = arrayList2.iterator();
/* 536 */                       while (it3.hasNext()) {
/* 544 */                           ((wy2) it3.next()).m9665o();
                                }
/* 550 */                       this.f15703f.clear();
/* 555 */                       this.f15703f.addAll(linkedHashSet);
/* 560 */                       this.f15704i.clear();
/* 565 */                       this.f15704i.addAll(arrayList);
/* 568 */                       this.f15692Y = wy2VarM7978g;
/* 570 */                       this.f15693Z = lh2VarM7980q;
                            } catch (IllegalArgumentException e) {
/* 576 */                       if (!z) {
/* 578 */                           m7984w();
/* 585 */                           if (this.f15705v.f12882b != 2) {
/* 587 */                               m7974A(linkedHashSet, true);
/* 591 */                               return;
                                    }
                                }
/* 592 */                       throw e;
                            }
                        } catch (Throwable th4) {
/* 596 */                   throw th4;
                        }
                    }
                }

                /* JADX INFO: renamed from: B */
                public final void m7975B(HashMap map, ArrayList arrayList) {
                    synchronized (this.f15689V) {
                        try {
/* 4 */                     Iterator it = arrayList.iterator();
/* 12 */                    while (it.hasNext()) {
/* 18 */                        wy2 wy2Var = (wy2) it.next();
/* 26 */                        Rect rectMo5849b = this.f15694a.mo8068e().mo5849b();
/* 34 */                        C2069pg c2069pg = (C2069pg) map.get(wy2Var);
/* 36 */                        c2069pg.getClass();
/* 45 */                        wy2Var.mo7563x(m7968n(rectMo5849b, c2069pg.f15102a));
                            }
                        } catch (Throwable th) {
/* 54 */                    throw th;
                        }
                    }
                }

                @Override // p000.InterfaceC1838ko
                /* JADX INFO: renamed from: a */
                public final InterfaceC2469xp mo6170a() {
/* 1 */             return this.f15695a0;
                }

                /* JADX INFO: renamed from: b */
                public final void m7976b(Collection collection) {
                    synchronized (this.f15689V) {
                        try {
/* 8 */                     this.f15694a.mo9992c(this.f15688U);
/* 11 */                    InterfaceC2559zp interfaceC2559zp = this.f15696b;
/* 13 */                    if (interfaceC2559zp != null) {
/* 17 */                        interfaceC2559zp.mo9992c(this.f15688U);
                            }
/* 27 */                    LinkedHashSet linkedHashSet = new LinkedHashSet(this.f15703f);
/* 30 */                    linkedHashSet.addAll(collection);
                            try {
/* 40 */                        m7974A(linkedHashSet, this.f15696b != null);
                            } catch (IllegalArgumentException e) {
/* 51 */                        throw new C2042oq(e);
                            }
                        } catch (Throwable th) {
/* 53 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m7977d() {
                    synchronized (this.f15689V) {
                        try {
/* 6 */                     if (!this.f15690W) {
/* 14 */                        if (!this.f15704i.isEmpty()) {
/* 20 */                            this.f15694a.mo9992c(this.f15688U);
/* 23 */                            InterfaceC2559zp interfaceC2559zp = this.f15696b;
/* 25 */                            if (interfaceC2559zp != null) {
/* 29 */                                interfaceC2559zp.mo9992c(this.f15688U);
                                    }
                                }
/* 39 */                        this.f15694a.mo8071j(this.f15704i);
/* 42 */                        InterfaceC2559zp interfaceC2559zp2 = this.f15696b;
/* 44 */                        if (interfaceC2559zp2 != null) {
/* 48 */                            interfaceC2559zp2.mo8071j(this.f15704i);
                                }
                                synchronized (this.f15689V) {
                                    try {
/* 56 */                                if (this.f15691X != null) {
/* 66 */                                    this.f15694a.mo8068e().mo5848a(this.f15691X);
                                        }
                                    } catch (Throwable th) {
/* 100 */                               throw th;
                                    }
                                }
/* 75 */                        Iterator it = this.f15704i.iterator();
/* 83 */                        while (it.hasNext()) {
/* 91 */                            ((wy2) it.next()).m9665o();
                                }
/* 96 */                        this.f15690W = true;
                            }
                        } catch (Throwable th2) {
/* 104 */                   throw th2;
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:53:0x00b5  */
                /* JADX INFO: renamed from: g */
                public final wy2 m7978g(LinkedHashSet linkedHashSet, lh2 lh2Var) {
                    boolean z;
                    boolean z2;
                    wy2 wy2VarM7969p;
                    synchronized (this.f15689V) {
                        try {
/* 6 */                     ArrayList<wy2> arrayList = new ArrayList(linkedHashSet);
/* 9 */                     if (lh2Var != null) {
/* 11 */                        arrayList.add(lh2Var);
/* 18 */                        arrayList.removeAll(lh2Var.f13283p.f16439a);
                            }
                            synchronized (this.f15689V) {
/* 32 */                        z = false;
/* 52 */                        z2 = ((Integer) this.f15688U.mo7023b(InterfaceC0999hp.f9169j, 0)).intValue() == 1;
                            }
/* 54 */                    if (z2) {
/* 60 */                        boolean z3 = false;
/* 61 */                        boolean z4 = false;
/* 66 */                        for (wy2 wy2Var : arrayList) {
/* 76 */                            if ((wy2Var instanceof vw1) || (wy2Var instanceof lh2)) {
/* 89 */                                z4 = true;
                                    } else if (wy2Var instanceof zv0) {
/* 87 */                                z3 = true;
                                    }
                                }
/* 91 */                        if (!z3 || z4) {
/* 136 */                           boolean z5 = false;
/* 141 */                           for (wy2 wy2Var2 : arrayList) {
/* 151 */                               if ((wy2Var2 instanceof vw1) || (wy2Var2 instanceof lh2)) {
/* 164 */                                   z = true;
                                        } else if (wy2Var2 instanceof zv0) {
/* 162 */                                   z5 = true;
                                        }
                                    }
/* 166 */                           if (!z || z5) {
/* 182 */                               wy2VarM7969p = null;
                                    } else {
/* 170 */                               wy2 wy2Var3 = this.f15692Y;
/* 177 */                               wy2VarM7969p = wy2Var3 instanceof zv0 ? wy2Var3 : m7969p();
                                    }
                                } else {
/* 95 */                            wy2 wy2Var4 = this.f15692Y;
/* 99 */                            if (wy2Var4 instanceof vw1) {
                                        wy2VarM7969p = wy2Var4;
                                    } else {
/* 105 */                               C1974nr c1974nr = new C1974nr(3);
/* 114 */                               c1974nr.f14413b.m9037p(rm2.f16183D, "Preview-Extra");
/* 117 */                               vw1 vw1VarM7035a = c1974nr.m7035a();
/* 128 */                               vw1VarM7035a.m9351D(new C1951n4(20));
                                        wy2VarM7969p = vw1VarM7035a;
                                    }
                                }
                            } else {
/* 182 */                       wy2VarM7969p = null;
                            }
                        } catch (Throwable th) {
/* 189 */                   throw th;
                        }
                    }
/* 184 */           return wy2VarM7969p;
                }

                /* JADX INFO: renamed from: o */
                public final HashMap m7979o(int i, InterfaceC2469xp interfaceC2469xp, ArrayList arrayList, ArrayList arrayList2, HashMap map) {
                    C0210cb c0210cb;
                    HashMap map2;
                    Rect rectMo5849b;
                    Iterator it;
                    boolean z;
/* 7 */             ArrayList arrayList3 = new ArrayList();
/* 10 */            String strMo310b = interfaceC2469xp.mo310b();
/* 16 */            HashMap map3 = new HashMap();
/* 21 */            HashMap map4 = new HashMap();
/* 24 */            Iterator it2 = arrayList2.iterator();
                    while (true) {
/* 28 */                boolean zHasNext = it2.hasNext();
/* 32 */                c0210cb = this.f15698c;
/* 34 */                map2 = null;
/* 35 */                if (!zHasNext) {
                            break;
                        }
/* 41 */                wy2 wy2Var = (wy2) it2.next();
/* 45 */                int iMo1175l = wy2Var.f18861f.mo1175l();
/* 49 */                C2069pg c2069pg = wy2Var.f18862g;
/* 56 */                Size size = c2069pg != null ? c2069pg.f15102a : null;
/* 65 */                cj2 cj2Var = (cj2) ((HashMap) c0210cb.f2804b).get(strMo310b);
/* 83 */                C2143rg c2143rgM8156b = cj2Var != null ? C2143rg.m8156b(i, iMo1175l, size, cj2Var.m1707i(iMo1175l)) : null;
/* 86 */                int iMo1175l2 = wy2Var.f18861f.mo1175l();
/* 90 */                C2069pg c2069pg2 = wy2Var.f18862g;
/* 99 */                Size size2 = c2069pg2 != null ? c2069pg2.f15102a : null;
/* 101 */               c2069pg2.getClass();
/* 132 */               C0017af c0017af = new C0017af(c2143rgM8156b, iMo1175l2, size2, c2069pg2.f15103b, lh2.m6433F(wy2Var), wy2Var.f18862g.f15105d, (Range) wy2Var.f18861f.mo7023b(zy2.f20389L, null));
/* 135 */               arrayList3.add(c0017af);
/* 138 */               map4.put(c0017af, wy2Var);
/* 143 */               map3.put(wy2Var, wy2Var.f18862g);
                    }
/* 153 */           if (!arrayList.isEmpty()) {
/* 157 */               HashMap map5 = new HashMap();
/* 162 */               HashMap map6 = new HashMap();
                        try {
/* 171 */                   rectMo5849b = this.f15694a.mo8068e().mo5849b();
                            while (true) {
/* 273 */                       if (!it.hasNext()) {
/* 329 */                           z = false;
                                    break;
                                }
/* 279 */                       wy2 wy2Var2 = (wy2) it.next();
/* 281 */                       if (wy2Var2 != null) {
/* 291 */                           if (wy2Var2.f18861f.mo7028h(zy2.f20392O)) {
/* 301 */                               if (wy2Var2.f18861f.mo7453t() == bz2.f2642d) {
/* 303 */                                   z = true;
                                            break;
                                        }
                                    } else {
/* 325 */                               AbstractC1245n0.m4876d("CameraUseCaseAdapter", wy2Var2 + " UseCase does not have capture type.");
                                    }
                                }
                            }
                        } catch (NullPointerException unused) {
/* 176 */                   rectMo5849b = null;
                        }
/* 187 */               ac1 ac1Var = new ac1(interfaceC2469xp, rectMo5849b != null ? cr2.m2874d(rectMo5849b) : null);
/* 190 */               Iterator it3 = arrayList.iterator();
/* 194 */               boolean z2 = false;
/* 199 */               while (it3.hasNext()) {
/* 205 */                   wy2 wy2Var3 = (wy2) it3.next();
/* 207 */                   HashMap map7 = map2;
/* 217 */                   C2079pq c2079pq = (C2079pq) map.get(wy2Var3);
/* 225 */                   zy2 zy2VarM9662l = wy2Var3.m9662l(interfaceC2469xp, c2079pq.f15243a, c2079pq.f15244b);
/* 229 */                   map5.put(zy2VarM9662l, wy2Var3);
/* 236 */                   map6.put(zy2VarM9662l, ac1Var.m191v(zy2VarM9662l));
/* 239 */                   zy2 zy2Var = wy2Var3.f18861f;
/* 243 */                   if (zy2Var instanceof ww1) {
/* 257 */                       z2 = ((ww1) zy2Var).m10450v() == 2;
                            }
/* 258 */                   map2 = map7;
                        }
/* 261 */               HashMap map8 = map2;
/* 265 */               it = arrayList.iterator();
/* 330 */               c0210cb.getClass();
/* 341 */               de3.m3023e("No new use cases to be bound.", !map6.isEmpty());
/* 352 */               cj2 cj2Var2 = (cj2) ((HashMap) c0210cb.f2804b).get(strMo310b);
/* 354 */               if (cj2Var2 == null) {
/* 467 */                   C1951n4.m6859j(AbstractC0886en.m3507k("No such camera id in supported combination list: ", strMo310b));
/* 470 */                   return map8;
                        }
/* 359 */               Pair pairM1705g = cj2Var2.m1705g(i, arrayList3, map6, z2, z);
/* 375 */               for (Map.Entry entry : map5.entrySet()) {
/* 403 */                   map3.put((wy2) entry.getValue(), (C2069pg) ((Map) pairM1705g.first).get(entry.getKey()));
                        }
/* 423 */               for (Map.Entry entry2 : ((Map) pairM1705g.second).entrySet()) {
/* 439 */                   if (map4.containsKey(entry2.getKey())) {
/* 457 */                       map3.put((wy2) map4.get(entry2.getKey()), (C2069pg) entry2.getValue());
                            }
                        }
                    }
/* 471 */           return map3;
                }

                /* JADX INFO: renamed from: q */
                public final lh2 m7980q(LinkedHashSet linkedHashSet, boolean z) {
                    boolean z2;
                    synchronized (this.f15689V) {
                        try {
/* 4 */                     HashSet<wy2> hashSetM7982u = m7982u(linkedHashSet, z);
/* 14 */                    if (hashSetM7982u.size() < 2) {
/* 16 */                        m7984w();
/* 12 */                        return null;
                            }
/* 25 */                    lh2 lh2Var = this.f15693Z;
/* 27 */                    if (lh2Var != null && lh2Var.f13283p.f16439a.equals(hashSetM7982u)) {
/* 39 */                        lh2 lh2Var2 = this.f15693Z;
/* 41 */                        Objects.requireNonNull(lh2Var2);
/* 45 */                        return lh2Var2;
                            }
/* 48 */                    int[] iArr = {1, 2, 4};
/* 54 */                    HashSet hashSet = new HashSet();
/* 65 */                    for (wy2 wy2Var : hashSetM7982u) {
/* 76 */                        for (int i = 0; i < 3; i++) {
/* 78 */                            int i2 = iArr[i];
/* 84 */                            Iterator it = wy2Var.mo6440i().iterator();
                                    while (true) {
/* 92 */                                if (!it.hasNext()) {
/* 110 */                                   z2 = false;
                                            break;
                                        }
/* 100 */                               int iIntValue = ((Integer) it.next()).intValue();
/* 106 */                               if ((i2 & iIntValue) == iIntValue) {
/* 108 */                                   z2 = true;
                                            break;
                                        }
                                    }
/* 111 */                           if (z2) {
/* 121 */                               if (hashSet.contains(Integer.valueOf(i2))) {
/* 12 */                                    return null;
                                        }
/* 129 */                               hashSet.add(Integer.valueOf(i2));
                                    }
                                }
                            }
/* 147 */                   return new lh2(this.f15694a, this.f15696b, this.f15699c0, this.f15701d0, hashSetM7982u, this.f15700d);
                        } catch (Throwable th) {
/* 153 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: r */
                public final void m7981r() {
                    synchronized (this.f15689V) {
                        try {
/* 6 */                     if (this.f15690W) {
/* 17 */                        this.f15694a.mo8070i(new ArrayList(this.f15704i));
/* 20 */                        InterfaceC2559zp interfaceC2559zp = this.f15696b;
/* 22 */                        if (interfaceC2559zp != null) {
/* 31 */                            interfaceC2559zp.mo8070i(new ArrayList(this.f15704i));
                                }
                                synchronized (this.f15689V) {
/* 42 */                            InterfaceC1972np interfaceC1972npMo8068e = this.f15694a.mo8068e();
/* 50 */                            this.f15691X = interfaceC1972npMo8068e.mo5853f();
/* 52 */                            interfaceC1972npMo8068e.mo5854g();
                                }
/* 57 */                        this.f15690W = false;
                            }
                        } catch (Throwable th) {
/* 66 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: u */
                public final HashSet m7982u(LinkedHashSet linkedHashSet, boolean z) {
                    int i;
/* 3 */             HashSet hashSet = new HashSet();
                    synchronized (this.f15689V) {
/* 11 */                Iterator it = this.f15706w.iterator();
/* 19 */                if (it.hasNext()) {
/* 91 */                    if (it.next() == null) {
/* 94 */                        throw null;
                            }
/* 100 */                   throw new ClassCastException();
                        }
/* 25 */                i = z ? 3 : 0;
                    }
/* 27 */            Iterator it2 = linkedHashSet.iterator();
/* 35 */            while (it2.hasNext()) {
/* 41 */                wy2 wy2Var = (wy2) it2.next();
/* 49 */                de3.m3023e("Only support one level of sharing for now.", !(wy2Var instanceof lh2));
/* 56 */                Iterator it3 = wy2Var.mo6440i().iterator();
/* 64 */                while (it3.hasNext()) {
/* 72 */                    int iIntValue = ((Integer) it3.next()).intValue();
/* 78 */                    if ((i & iIntValue) == iIntValue) {
/* 80 */                        hashSet.add(wy2Var);
                                break;
                            }
                        }
                    }
/* 84 */            return hashSet;
                }

                /* JADX INFO: renamed from: v */
                public final List m7983v() {
                    ArrayList arrayList;
                    synchronized (this.f15689V) {
/* 8 */                 arrayList = new ArrayList(this.f15703f);
                    }
/* 12 */            return arrayList;
                }

                /* JADX INFO: renamed from: w */
                public final void m7984w() {
                    synchronized (this.f15689V) {
/* 6 */                 this.f15688U.m4259u();
                    }
                }

                /* JADX INFO: renamed from: y */
                public final void m7985y(ArrayList arrayList) {
                    synchronized (this.f15689V) {
/* 8 */                 LinkedHashSet linkedHashSet = new LinkedHashSet(this.f15703f);
/* 11 */                linkedHashSet.removeAll(arrayList);
/* 21 */                m7974A(linkedHashSet, this.f15696b != null);
                    }
                }
            }
