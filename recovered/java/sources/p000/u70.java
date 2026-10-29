            package p000;

            import androidx.constraintlayout.widget.C0075b;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class u70 {

                /* JADX INFO: renamed from: a */
                public a00 f17385a;

                /* JADX INFO: renamed from: b */
                public boolean f17386b;

                /* JADX INFO: renamed from: c */
                public boolean f17387c;

                /* JADX INFO: renamed from: d */
                public a00 f17388d;

                /* JADX INFO: renamed from: e */
                public ArrayList f17389e;

                /* JADX INFO: renamed from: f */
                public InterfaceC2462xi f17390f;

                /* JADX INFO: renamed from: g */
                public C2332wi f17391g;

                /* JADX INFO: renamed from: h */
                public ArrayList f17392h;

                /* JADX INFO: renamed from: a */
                public final void m8963a(v70 v70Var, int i, ArrayList arrayList, n52 n52Var) {
/* 1 */             l73 l73Var = v70Var.f17884d;
/* 3 */             n52 n52Var2 = l73Var.f13137c;
/* 5 */             v70 v70Var2 = l73Var.f13143i;
/* 7 */             v70 v70Var3 = l73Var.f13142h;
/* 9 */             if (n52Var2 == null) {
/* 11 */                a00 a00Var = this.f17385a;
/* 15 */                if (l73Var == a00Var.f20427d || l73Var == a00Var.f20429e) {
/* 224 */                   return;
                        }
/* 23 */                if (n52Var == null) {
/* 27 */                    n52Var = new n52();
/* 31 */                    n52Var.f14127a = null;
/* 38 */                    n52Var.f14128b = new ArrayList();
/* 40 */                    n52Var.f14127a = l73Var;
/* 42 */                    arrayList.add(n52Var);
                        }
/* 45 */                l73Var.f13137c = n52Var;
/* 49 */                n52Var.f14128b.add(l73Var);
/* 62 */                for (s70 s70Var : v70Var3.f17891k) {
/* 72 */                    if (s70Var instanceof v70) {
/* 76 */                        m8963a((v70) s70Var, i, arrayList, n52Var);
                            }
                        }
/* 90 */                for (s70 s70Var2 : v70Var2.f17891k) {
/* 100 */                   if (s70Var2 instanceof v70) {
/* 104 */                       m8963a((v70) s70Var2, i, arrayList, n52Var);
                            }
                        }
/* 109 */               if (i == 1 && (l73Var instanceof k23)) {
/* 130 */                   for (s70 s70Var3 : ((k23) l73Var).f12564k.f17891k) {
/* 140 */                       if (s70Var3 instanceof v70) {
/* 144 */                           m8963a((v70) s70Var3, i, arrayList, n52Var);
                                }
                            }
                        }
/* 150 */               Iterator it = v70Var3.f17892l.iterator();
/* 158 */               while (it.hasNext()) {
/* 166 */                   m8963a((v70) it.next(), i, arrayList, n52Var);
                        }
/* 172 */               Iterator it2 = v70Var2.f17892l.iterator();
/* 180 */               while (it2.hasNext()) {
/* 188 */                   m8963a((v70) it2.next(), i, arrayList, n52Var);
                        }
/* 192 */               if (i == 1 && (l73Var instanceof k23)) {
/* 204 */                   Iterator it3 = ((k23) l73Var).f12564k.f17892l.iterator();
/* 212 */                   while (it3.hasNext()) {
/* 220 */                       m8963a((v70) it3.next(), i, arrayList, n52Var);
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m8964b(a00 a00Var) {
                    Iterator it;
                    int iM10472l;
                    EnumC2516yz enumC2516yz;
                    EnumC2516yz enumC2516yz2;
                    EnumC2516yz enumC2516yz3;
                    EnumC2516yz enumC2516yz4;
                    EnumC2516yz enumC2516yz5;
                    EnumC2516yz enumC2516yz6;
/* 5 */             Iterator it2 = a00Var.f17u0.iterator();
/* 13 */            while (it2.hasNext()) {
/* 20 */                C2569zz c2569zz = (C2569zz) it2.next();
/* 22 */                EnumC2516yz[] enumC2516yzArr = c2569zz.f20415U;
/* 24 */                C2051oz[] c2051ozArr = c2569zz.f20412R;
/* 26 */                C2051oz c2051oz = c2569zz.f20407M;
/* 28 */                C2051oz c2051oz2 = c2569zz.f20405K;
/* 30 */                C2051oz c2051oz3 = c2569zz.f20406L;
/* 32 */                C2051oz c2051oz4 = c2569zz.f20404J;
/* 35 */                EnumC2516yz enumC2516yz7 = enumC2516yzArr[0];
/* 38 */                EnumC2516yz enumC2516yz8 = enumC2516yzArr[1];
/* 44 */                if (c2569zz.f20438i0 == 8) {
/* 46 */                    c2569zz.f20421a = true;
                        } else {
/* 49 */                    float f = c2569zz.f20463w;
/* 55 */                    EnumC2516yz enumC2516yz9 = EnumC2516yz.f19867c;
/* 60 */                    if (f < 1.0f && enumC2516yz7 == enumC2516yz9) {
/* 64 */                        c2569zz.f20455r = 2;
                            }
/* 66 */                    float f2 = c2569zz.f20466z;
/* 70 */                    if (f2 < 1.0f && enumC2516yz8 == enumC2516yz9) {
/* 74 */                        c2569zz.f20457s = 2;
                            }
/* 78 */                    float f3 = c2569zz.f20419Y;
/* 84 */                    EnumC2516yz enumC2516yz10 = EnumC2516yz.f19866b;
/* 86 */                    EnumC2516yz enumC2516yz11 = EnumC2516yz.f19865a;
/* 88 */                    if (f3 <= 0.0f) {
/* 102 */                       it = it2;
                            } else {
/* 90 */                        if (enumC2516yz7 == enumC2516yz9 && (enumC2516yz8 == enumC2516yz10 || enumC2516yz8 == enumC2516yz11)) {
/* 100 */                           c2569zz.f20455r = 3;
                                } else if (enumC2516yz8 == enumC2516yz9 && (enumC2516yz7 == enumC2516yz10 || enumC2516yz7 == enumC2516yz11)) {
/* 111 */                           c2569zz.f20457s = 3;
                                } else if (enumC2516yz7 == enumC2516yz9 && enumC2516yz8 == enumC2516yz9) {
/* 118 */                           it = it2;
/* 122 */                           if (c2569zz.f20455r == 0) {
/* 124 */                               c2569zz.f20455r = 3;
                                    }
/* 128 */                           if (c2569zz.f20457s == 0) {
/* 130 */                               c2569zz.f20457s = 3;
                                    }
                                }
/* 102 */                       it = it2;
                            }
/* 132 */                   if (enumC2516yz7 == enumC2516yz9 && c2569zz.f20455r == 1 && (c2051oz4.f14929f == null || c2051oz3.f14929f == null)) {
/* 147 */                       enumC2516yz7 = enumC2516yz10;
                            }
/* 148 */                   if (enumC2516yz8 == enumC2516yz9 && c2569zz.f20457s == 1 && (c2051oz2.f14929f == null || c2051oz.f14929f == null)) {
/* 163 */                       enumC2516yz8 = enumC2516yz10;
                            }
/* 164 */                   uu0 uu0Var = c2569zz.f20427d;
/* 166 */                   uu0Var.f13138d = enumC2516yz7;
/* 168 */                   int i = c2569zz.f20455r;
/* 170 */                   uu0Var.f13135a = i;
/* 172 */                   k23 k23Var = c2569zz.f20429e;
/* 174 */                   k23Var.f13138d = enumC2516yz8;
/* 178 */                   int i2 = c2569zz.f20457s;
/* 180 */                   k23Var.f13135a = i2;
/* 182 */                   EnumC2516yz enumC2516yz12 = EnumC2516yz.f19868d;
/* 184 */                   if ((enumC2516yz7 == enumC2516yz12 || enumC2516yz7 == enumC2516yz11 || enumC2516yz7 == enumC2516yz10) && (enumC2516yz8 == enumC2516yz12 || enumC2516yz8 == enumC2516yz11 || enumC2516yz8 == enumC2516yz10)) {
/* 198 */                       EnumC2516yz enumC2516yz13 = enumC2516yz8;
/* 746 */                       int iM10475r = c2569zz.m10475r();
/* 750 */                       if (enumC2516yz7 == enumC2516yz12) {
/* 761 */                           iM10475r = (a00Var.m10475r() - c2051oz4.f14930g) - c2051oz3.f14930g;
/* 762 */                           enumC2516yz7 = enumC2516yz11;
                                }
/* 763 */                       int iM10472l2 = c2569zz.m10472l();
/* 767 */                       if (enumC2516yz13 == enumC2516yz12) {
/* 778 */                           iM10472l = (a00Var.m10472l() - c2051oz2.f14930g) - c2051oz.f14930g;
/* 781 */                           enumC2516yz = enumC2516yz11;
                                } else {
/* 787 */                           iM10472l = iM10472l2;
/* 788 */                           enumC2516yz = enumC2516yz13;
                                }
/* 790 */                       m8968f(c2569zz, enumC2516yz7, iM10475r, enumC2516yz, iM10472l);
/* 801 */                       c2569zz.f20427d.f13139e.mo6945d(c2569zz.m10475r());
/* 812 */                       c2569zz.f20429e.f13139e.mo6945d(c2569zz.m10472l());
/* 816 */                       c2569zz.f20421a = true;
                            } else {
/* 205 */                       if (enumC2516yz7 != enumC2516yz9 || (enumC2516yz8 != enumC2516yz10 && enumC2516yz8 != enumC2516yz11)) {
/* 213 */                           enumC2516yz2 = enumC2516yz8;
/* 214 */                           enumC2516yz3 = enumC2516yz10;
                                } else if (i == 3) {
/* 219 */                           if (enumC2516yz8 == enumC2516yz10) {
/* 227 */                               m8968f(c2569zz, enumC2516yz10, 0, enumC2516yz10, 0);
                                    }
/* 230 */                           int iM10472l3 = c2569zz.m10472l();
/* 245 */                           m8968f(c2569zz, enumC2516yz11, (int) ((iM10472l3 * c2569zz.f20419Y) + 0.5f), enumC2516yz11, iM10472l3);
/* 256 */                           c2569zz.f20427d.f13139e.mo6945d(c2569zz.m10475r());
/* 267 */                           c2569zz.f20429e.f13139e.mo6945d(c2569zz.m10472l());
/* 271 */                           c2569zz.f20421a = true;
                                } else if (i == 1) {
/* 288 */                           m8968f(c2569zz, enumC2516yz10, 0, enumC2516yz8, 0);
/* 299 */                           c2569zz.f20427d.f13139e.f14161m = c2569zz.m10475r();
                                } else {
/* 302 */                           enumC2516yz3 = enumC2516yz10;
/* 303 */                           enumC2516yz2 = enumC2516yz8;
/* 305 */                           if (i == 2) {
/* 309 */                               EnumC2516yz enumC2516yz14 = a00Var.f20415U[0];
/* 311 */                               if (enumC2516yz14 == enumC2516yz11 || enumC2516yz14 == enumC2516yz12) {
/* 335 */                                   m8968f(c2569zz, enumC2516yz11, (int) ((f * a00Var.m10475r()) + 0.5f), enumC2516yz2, c2569zz.m10472l());
/* 346 */                                   c2569zz.f20427d.f13139e.mo6945d(c2569zz.m10475r());
/* 357 */                                   c2569zz.f20429e.f13139e.mo6945d(c2569zz.m10472l());
/* 361 */                                   c2569zz.f20421a = true;
                                        }
                                    } else if (c2051ozArr[0].f14929f == null || c2051ozArr[1].f14929f == null) {
/* 364 */                               enumC2516yz11 = enumC2516yz11;
/* 364 */                               enumC2516yz11 = enumC2516yz11;
/* 382 */                               m8968f(c2569zz, enumC2516yz3, 0, enumC2516yz2, 0);
/* 393 */                               c2569zz.f20427d.f13139e.mo6945d(c2569zz.m10475r());
/* 404 */                               c2569zz.f20429e.f13139e.mo6945d(c2569zz.m10472l());
/* 408 */                               c2569zz.f20421a = true;
                                    }
                                }
/* 412 */                       if (enumC2516yz2 != enumC2516yz9 || (enumC2516yz7 != enumC2516yz3 && enumC2516yz7 != enumC2516yz11)) {
/* 316 */                           enumC2516yz11 = enumC2516yz11;
/* 420 */                           EnumC2516yz enumC2516yz15 = enumC2516yz2;
/* 421 */                           enumC2516yz4 = enumC2516yz3;
/* 422 */                           enumC2516yz5 = enumC2516yz11;
/* 423 */                           enumC2516yz6 = enumC2516yz15;
                                } else if (i2 == 3) {
/* 429 */                           if (enumC2516yz7 == enumC2516yz3) {
/* 436 */                               m8968f(c2569zz, enumC2516yz3, 0, enumC2516yz3, 0);
                                    }
/* 439 */                           int iM10475r2 = c2569zz.m10475r();
/* 443 */                           float f4 = c2569zz.f20419Y;
/* 448 */                           if (c2569zz.f20420Z == -1) {
/* 450 */                               f4 = 1.0f / f4;
                                    }
/* 461 */                           m8968f(c2569zz, enumC2516yz11, iM10475r2, enumC2516yz11, (int) ((iM10475r2 * f4) + 0.5f));
/* 472 */                           c2569zz.f20427d.f13139e.mo6945d(c2569zz.m10475r());
/* 483 */                           c2569zz.f20429e.f13139e.mo6945d(c2569zz.m10472l());
/* 487 */                           c2569zz.f20421a = true;
                                } else {
/* 491 */                           EnumC2516yz enumC2516yz16 = enumC2516yz11;
/* 493 */                           if (i2 == 1) {
/* 501 */                               m8968f(c2569zz, enumC2516yz7, 0, enumC2516yz3, 0);
/* 512 */                               c2569zz.f20429e.f13139e.f14161m = c2569zz.m10472l();
                                    } else {
/* 516 */                               EnumC2516yz enumC2516yz17 = enumC2516yz3;
/* 517 */                               EnumC2516yz enumC2516yz18 = enumC2516yz7;
/* 519 */                               if (i2 == 2) {
/* 523 */                                   EnumC2516yz enumC2516yz19 = a00Var.f20415U[1];
/* 525 */                                   if (enumC2516yz19 == enumC2516yz16 || enumC2516yz19 == enumC2516yz12) {
/* 552 */                                       m8968f(c2569zz, enumC2516yz18, c2569zz.m10475r(), enumC2516yz16, (int) ((f2 * a00Var.m10472l()) + 0.5f));
/* 563 */                                       c2569zz.f20427d.f13139e.mo6945d(c2569zz.m10475r());
/* 574 */                                       c2569zz.f20429e.f13139e.mo6945d(c2569zz.m10472l());
/* 578 */                                       c2569zz.f20421a = true;
                                            } else {
/* 532 */                                       enumC2516yz6 = enumC2516yz2;
/* 533 */                                       enumC2516yz4 = enumC2516yz17;
/* 534 */                                       enumC2516yz7 = enumC2516yz18;
/* 535 */                                       enumC2516yz5 = enumC2516yz16;
                                            }
                                        } else {
/* 582 */                                   enumC2516yz7 = enumC2516yz18;
/* 583 */                                   enumC2516yz5 = enumC2516yz16;
/* 590 */                                   if (c2051ozArr[2].f14929f == null || c2051ozArr[3].f14929f == null) {
/* 611 */                                       m8968f(c2569zz, enumC2516yz17, 0, enumC2516yz2, 0);
/* 622 */                                       c2569zz.f20427d.f13139e.mo6945d(c2569zz.m10475r());
/* 633 */                                       c2569zz.f20429e.f13139e.mo6945d(c2569zz.m10472l());
/* 637 */                                       c2569zz.f20421a = true;
                                            } else {
/* 602 */                                       enumC2516yz6 = enumC2516yz2;
/* 603 */                                       enumC2516yz4 = enumC2516yz17;
                                            }
                                        }
                                    }
                                }
/* 641 */                       if (enumC2516yz7 == enumC2516yz9 && enumC2516yz6 == enumC2516yz9) {
/* 645 */                           if (i == 1 || i2 == 1) {
/* 721 */                               m8968f(c2569zz, enumC2516yz4, 0, enumC2516yz4, 0);
/* 732 */                               c2569zz.f20427d.f13139e.f14161m = c2569zz.m10475r();
/* 742 */                               c2569zz.f20429e.f13139e.f14161m = c2569zz.m10472l();
                                    } else if (i2 == 2 && i == 2) {
/* 655 */                               EnumC2516yz[] enumC2516yzArr2 = a00Var.f20415U;
/* 659 */                               if (enumC2516yzArr2[0] == enumC2516yz5 && enumC2516yzArr2[1] == enumC2516yz5) {
/* 686 */                                   m8968f(c2569zz, enumC2516yz5, (int) ((f * a00Var.m10475r()) + 0.5f), enumC2516yz5, (int) ((f2 * a00Var.m10472l()) + 0.5f));
/* 697 */                                   c2569zz.f20427d.f13139e.mo6945d(c2569zz.m10475r());
/* 708 */                                   c2569zz.f20429e.f13139e.mo6945d(c2569zz.m10472l());
/* 712 */                                   c2569zz.f20421a = true;
                                        }
                                    }
                                }
                            }
/* 273 */                   it2 = it;
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m8965c() {
/* 1 */             a00 a00Var = this.f17385a;
/* 3 */             ArrayList arrayList = this.f17392h;
/* 5 */             ArrayList<l73> arrayList2 = this.f17389e;
/* 7 */             arrayList2.clear();
/* 10 */            a00 a00Var2 = this.f17388d;
/* 14 */            a00Var2.f20427d.mo1444f();
/* 19 */            a00Var2.f20429e.mo1444f();
/* 24 */            arrayList2.add(a00Var2.f20427d);
/* 29 */            arrayList2.add(a00Var2.f20429e);
/* 38 */            HashSet hashSet = null;
/* 45 */            for (C2569zz c2569zz : a00Var2.f17u0) {
/* 55 */                if (c2569zz instanceof bs0) {
/* 59 */                    cs0 cs0Var = new cs0(c2569zz);
/* 64 */                    c2569zz.f20427d.mo1444f();
/* 69 */                    c2569zz.f20429e.mo1444f();
/* 76 */                    cs0Var.f13140f = ((bs0) c2569zz).f2590y0;
/* 78 */                    arrayList2.add(cs0Var);
                        } else {
/* 86 */                    if (c2569zz.m10482y()) {
/* 90 */                        if (c2569zz.f20423b == null) {
/* 97 */                            c2569zz.f20423b = new C1864ks(c2569zz, 0);
                                }
/* 99 */                        if (hashSet == null) {
/* 103 */                           hashSet = new HashSet();
                                }
/* 108 */                       hashSet.add(c2569zz.f20423b);
                            } else {
/* 114 */                       arrayList2.add(c2569zz.f20427d);
                            }
/* 121 */                   if (c2569zz.m10483z()) {
/* 125 */                       if (c2569zz.f20425c == null) {
/* 132 */                           c2569zz.f20425c = new C1864ks(c2569zz, 1);
                                }
/* 134 */                       if (hashSet == null) {
/* 138 */                           hashSet = new HashSet();
                                }
/* 143 */                       hashSet.add(c2569zz.f20425c);
                            } else {
/* 149 */                       arrayList2.add(c2569zz.f20429e);
                            }
/* 154 */                   if (c2569zz instanceof cu0) {
/* 161 */                       arrayList2.add(new bu0(c2569zz));
                            }
                        }
                    }
/* 165 */           if (hashSet != null) {
/* 167 */               arrayList2.addAll(hashSet);
                    }
/* 170 */           Iterator it = arrayList2.iterator();
/* 178 */           while (it.hasNext()) {
/* 186 */               ((l73) it.next()).mo1444f();
                    }
/* 198 */           for (l73 l73Var : arrayList2) {
/* 208 */               if (l73Var.f13136b != a00Var2) {
/* 211 */                   l73Var.mo1442d();
                        }
                    }
/* 215 */           arrayList.clear();
/* 220 */           m8967e(a00Var.f20427d, 0, arrayList);
/* 225 */           m8967e(a00Var.f20429e, 1, arrayList);
/* 228 */           this.f17386b = false;
                }

                /* JADX INFO: renamed from: d */
                public final int m8966d(a00 a00Var, int i) {
                    ArrayList arrayList;
                    int i2;
                    long jMo6276j;
                    float f;
                    long j;
/* 7 */             ArrayList arrayList2 = this.f17392h;
/* 9 */             int size = arrayList2.size();
/* 13 */            long j2 = 0;
/* 15 */            int i3 = 0;
/* 16 */            long jMax = 0;
/* 17 */            while (i3 < size) {
/* 25 */                l73 l73Var = ((n52) arrayList2.get(i3)).f14127a;
/* 29 */                if (!(l73Var instanceof C1864ks) ? !(i != 0 ? (l73Var instanceof k23) : (l73Var instanceof uu0)) : ((C1864ks) l73Var).f13140f != i) {
/* 61 */                    v70 v70Var = (i == 0 ? a00Var.f20427d : a00Var.f20429e).f13142h;
/* 71 */                    v70 v70Var2 = (i == 0 ? a00Var.f20427d : a00Var.f20429e).f13143i;
/* 77 */                    v70 v70Var3 = l73Var.f13142h;
/* 79 */                    v70 v70Var4 = l73Var.f13143i;
/* 83 */                    boolean zContains = v70Var3.f17892l.contains(v70Var);
/* 89 */                    boolean zContains2 = v70Var4.f17892l.contains(v70Var2);
/* 93 */                    long jMo6276j2 = l73Var.mo6276j();
/* 97 */                    if (zContains && zContains2) {
/* 101 */                       long jM6889b = n52.m6889b(v70Var3, j2);
/* 105 */                       arrayList = arrayList2;
/* 107 */                       long jM6888a = n52.m6888a(v70Var4, j2);
/* 111 */                       long j3 = jM6889b - jMo6276j2;
/* 112 */                       int i4 = v70Var4.f17886f;
/* 115 */                       i2 = i3;
/* 120 */                       if (j3 >= (-i4)) {
/* 123 */                           j3 += (long) i4;
                                }
/* 126 */                       long j4 = v70Var3.f17886f;
/* 129 */                       long j5 = ((-jM6888a) - jMo6276j2) - j4;
/* 132 */                       if (j5 >= j4) {
/* 134 */                           j5 -= j4;
                                }
/* 135 */                       C2569zz c2569zz = l73Var.f13136b;
/* 137 */                       if (i == 0) {
/* 139 */                           f = c2569zz.f20432f0;
                                } else if (i == 1) {
/* 145 */                           f = c2569zz.f20434g0;
                                } else {
/* 148 */                           c2569zz.getClass();
/* 151 */                           f = -1.0f;
                                }
/* 158 */                       if (f > 0.0f) {
/* 167 */                           j = (long) ((j3 / (1.0f - f)) + (j5 / f));
                                } else {
/* 169 */                           j = 0;
                                }
                                float f2 = j;
/* 192 */                       jMo6276j = (((long) v70Var3.f17886f) + ((((long) ((f2 * f) + 0.5f)) + jMo6276j2) + ((long) AbstractC0886en.m3503g(1.0f, f, f2, 0.5f)))) - ((long) v70Var4.f17886f);
                            } else {
/* 194 */                       arrayList = arrayList2;
/* 196 */                       i2 = i3;
/* 198 */                       if (zContains) {
/* 211 */                           jMo6276j = Math.max(n52.m6889b(v70Var3, v70Var3.f17886f), ((long) v70Var3.f17886f) + jMo6276j2);
                                } else if (zContains2) {
/* 231 */                           jMo6276j = Math.max(-n52.m6888a(v70Var4, v70Var4.f17886f), ((long) (-v70Var4.f17886f)) + jMo6276j2);
                                } else {
/* 247 */                           jMo6276j = (l73Var.mo6276j() + ((long) v70Var3.f17886f)) - ((long) v70Var4.f17886f);
                                }
                            }
                        } else {
/* 38 */                    arrayList = arrayList2;
/* 40 */                    jMo6276j = j2;
/* 41 */                    i2 = i3;
                        }
/* 249 */               jMax = Math.max(jMax, jMo6276j);
/* 253 */               i3 = i2 + 1;
/* 255 */               arrayList2 = arrayList;
/* 259 */               j2 = 0;
                    }
/* 263 */           return (int) jMax;
                }

                /* JADX INFO: renamed from: e */
                public final void m8967e(l73 l73Var, int i, ArrayList arrayList) {
/* 1 */             v70 v70Var = l73Var.f13142h;
/* 3 */             v70 v70Var2 = l73Var.f13143i;
/* 16 */            for (s70 s70Var : v70Var.f17891k) {
/* 26 */                if (s70Var instanceof v70) {
/* 30 */                    m8963a((v70) s70Var, i, arrayList, null);
                        } else if (s70Var instanceof l73) {
/* 42 */                    m8963a(((l73) s70Var).f13142h, i, arrayList, null);
                        }
                    }
/* 56 */            for (s70 s70Var2 : v70Var2.f17891k) {
/* 66 */                if (s70Var2 instanceof v70) {
/* 70 */                    m8963a((v70) s70Var2, i, arrayList, null);
                        } else if (s70Var2 instanceof l73) {
/* 82 */                    m8963a(((l73) s70Var2).f13143i, i, arrayList, null);
                        }
                    }
/* 87 */            if (i == 1) {
/* 103 */               for (s70 s70Var3 : ((k23) l73Var).f12564k.f17891k) {
/* 113 */                   if (s70Var3 instanceof v70) {
/* 117 */                       m8963a((v70) s70Var3, i, arrayList, null);
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m8968f(C2569zz c2569zz, EnumC2516yz enumC2516yz, int i, EnumC2516yz enumC2516yz2, int i2) {
/* 1 */             C2332wi c2332wi = this.f17391g;
/* 3 */             c2332wi.f18637a = enumC2516yz;
/* 5 */             c2332wi.f18638b = enumC2516yz2;
/* 7 */             c2332wi.f18639c = i;
/* 9 */             c2332wi.f18640d = i2;
/* 15 */            ((C0075b) this.f17390f).m524b(c2569zz, c2332wi);
/* 20 */            c2569zz.m10464P(c2332wi.f18641e);
/* 25 */            c2569zz.m10461M(c2332wi.f18642f);
/* 30 */            c2569zz.f20399E = c2332wi.f18644h;
/* 34 */            c2569zz.m10458J(c2332wi.f18643g);
                }

                /* JADX INFO: renamed from: g */
                public final void m8969g() {
                    u70 u70Var;
                    C2256ui c2256ui;
/* 13 */            for (C2569zz c2569zz : this.f17385a.f17u0) {
/* 24 */                if (!c2569zz.f20421a) {
/* 27 */                    EnumC2516yz[] enumC2516yzArr = c2569zz.f20415U;
/* 29 */                    boolean z = false;
/* 30 */                    EnumC2516yz enumC2516yz = enumC2516yzArr[0];
/* 33 */                    EnumC2516yz enumC2516yz2 = enumC2516yzArr[1];
/* 35 */                    int i = c2569zz.f20455r;
/* 37 */                    int i2 = c2569zz.f20457s;
/* 39 */                    EnumC2516yz enumC2516yz3 = EnumC2516yz.f19867c;
/* 41 */                    EnumC2516yz enumC2516yz4 = EnumC2516yz.f19866b;
/* 52 */                    boolean z2 = enumC2516yz == enumC2516yz4 || (enumC2516yz == enumC2516yz3 && i == 1);
/* 53 */                    if (enumC2516yz2 == enumC2516yz4 || (enumC2516yz2 == enumC2516yz3 && i2 == 1)) {
/* 59 */                        z = true;
                            }
/* 62 */                    n80 n80Var = c2569zz.f20427d.f13139e;
/* 64 */                    boolean z3 = n80Var.f17890j;
/* 68 */                    n80 n80Var2 = c2569zz.f20429e.f13139e;
/* 70 */                    boolean z4 = n80Var2.f17890j;
/* 72 */                    boolean z5 = z2;
/* 73 */                    EnumC2516yz enumC2516yz5 = EnumC2516yz.f19865a;
/* 75 */                    if (z3 && z4) {
/* 84 */                        u70Var = this;
/* 85 */                        u70Var.m8968f(c2569zz, enumC2516yz5, n80Var.f17887g, enumC2516yz5, n80Var2.f17887g);
/* 88 */                        c2569zz.f20421a = true;
                            } else if (z3 && z) {
/* 99 */                        u70Var = this;
/* 100 */                       u70Var.m8968f(c2569zz, enumC2516yz5, n80Var.f17887g, enumC2516yz4, n80Var2.f17887g);
/* 103 */                       k23 k23Var = c2569zz.f20429e;
/* 105 */                       if (enumC2516yz2 == enumC2516yz3) {
/* 113 */                           k23Var.f13139e.f14161m = c2569zz.m10472l();
                                } else {
/* 122 */                           k23Var.f13139e.mo6945d(c2569zz.m10472l());
/* 125 */                           c2569zz.f20421a = true;
                                }
                            } else {
/* 128 */                       u70Var = this;
/* 129 */                       if (z4 && z5) {
/* 140 */                           u70Var.m8968f(c2569zz, enumC2516yz4, n80Var.f17887g, enumC2516yz5, n80Var2.f17887g);
/* 143 */                           uu0 uu0Var = c2569zz.f20427d;
/* 145 */                           if (enumC2516yz == enumC2516yz3) {
/* 153 */                               uu0Var.f13139e.f14161m = c2569zz.m10475r();
                                    } else {
/* 162 */                               uu0Var.f13139e.mo6945d(c2569zz.m10475r());
/* 165 */                               c2569zz.f20421a = true;
                                    }
                                }
                            }
/* 169 */                   if (c2569zz.f20421a && (c2256ui = c2569zz.f20429e.f12565l) != null) {
/* 179 */                       c2256ui.mo6945d(c2569zz.f20426c0);
                            }
/* 182 */                   this = u70Var;
                        }
                    }
                }
            }
