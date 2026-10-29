            package p000;

            import java.util.ArrayList;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class t71 {

                /* JADX INFO: renamed from: p */
                public static boolean f16931p = false;

                /* JADX INFO: renamed from: q */
                public static int f16932q = 1000;

                /* JADX INFO: renamed from: c */
                public final qx1 f16935c;

                /* JADX INFO: renamed from: f */
                public C1789jd[] f16938f;

                /* JADX INFO: renamed from: l */
                public final C0875ec f16944l;

                /* JADX INFO: renamed from: o */
                public C1789jd f16947o;

                /* JADX INFO: renamed from: a */
                public boolean f16933a = false;

                /* JADX INFO: renamed from: b */
                public int f16934b = 0;

                /* JADX INFO: renamed from: d */
                public int f16936d = 32;

                /* JADX INFO: renamed from: e */
                public int f16937e = 32;

                /* JADX INFO: renamed from: g */
                public boolean f16939g = false;

                /* JADX INFO: renamed from: h */
                public boolean[] f16940h = new boolean[32];

                /* JADX INFO: renamed from: i */
                public int f16941i = 1;

                /* JADX INFO: renamed from: j */
                public int f16942j = 0;

                /* JADX INFO: renamed from: k */
                public int f16943k = 32;

                /* JADX INFO: renamed from: m */
                public qf2[] f16945m = new qf2[f16932q];

                /* JADX INFO: renamed from: n */
                public int f16946n = 0;

                public t71() {
/* 16 */            this.f16938f = null;
/* 41 */            this.f16938f = new C1789jd[32];
/* 43 */            m8723s();
/* 50 */            C0875ec c0875ec = new C0875ec(13);
/* 58 */            c0875ec.f7613b = new nt1();
/* 65 */            c0875ec.f7614c = new nt1();
/* 69 */            c0875ec.f7615d = new qf2[32];
/* 71 */            this.f16944l = c0875ec;
/* 75 */            qx1 qx1Var = new qx1(c0875ec);
/* 82 */            qx1Var.f15790f = new qf2[128];
/* 86 */            qx1Var.f15791g = new qf2[128];
/* 88 */            qx1Var.f15792h = 0;
/* 98 */            qx1Var.f15793i = new wc0(25, (Object) qx1Var, false);
/* 100 */           this.f16935c = qx1Var;
/* 107 */           this.f16947o = new C1789jd(c0875ec);
                }

                /* JADX INFO: renamed from: n */
                public static int m8705n(Object obj) {
/* 3 */             qf2 qf2Var = ((C2051oz) obj).f14932i;
/* 5 */             if (qf2Var != null) {
/* 12 */                return (int) (qf2Var.f15518e + 0.5f);
                    }
/* 14 */            return 0;
                }

                /* JADX INFO: renamed from: a */
                public final qf2 m8706a(int i) {
/* 5 */             nt1 nt1Var = (nt1) this.f16944l.f7614c;
/* 7 */             int i2 = nt1Var.f14449b;
/* 9 */             Object obj = null;
/* 10 */            if (i2 > 0) {
/* 12 */                int i3 = i2 - 1;
/* 14 */                Object[] objArr = nt1Var.f14448a;
/* 16 */                Object obj2 = objArr[i3];
/* 18 */                objArr[i3] = null;
/* 20 */                nt1Var.f14449b = i3;
/* 22 */                obj = obj2;
                    }
/* 23 */            qf2 qf2Var = (qf2) obj;
/* 25 */            if (qf2Var == null) {
/* 29 */                qf2Var = new qf2(i);
/* 32 */                qf2Var.f15513W = i;
                    } else {
/* 35 */                qf2Var.m7787c();
/* 38 */                qf2Var.f15513W = i;
                    }
/* 40 */            int i4 = this.f16946n;
/* 42 */            int i5 = f16932q;
/* 44 */            if (i4 >= i5) {
/* 46 */                int i6 = i5 * 2;
/* 48 */                f16932q = i6;
/* 58 */                this.f16945m = (qf2[]) Arrays.copyOf(this.f16945m, i6);
                    }
/* 60 */            qf2[] qf2VarArr = this.f16945m;
/* 62 */            int i7 = this.f16946n;
/* 66 */            this.f16946n = i7 + 1;
/* 68 */            qf2VarArr[i7] = qf2Var;
/* 70 */            return qf2Var;
                }

                /* JADX INFO: renamed from: b */
                public final void m8707b(qf2 qf2Var, qf2 qf2Var2, int i, float f, qf2 qf2Var3, qf2 qf2Var4, int i2, int i3) {
/* 1 */             C1789jd c1789jdM8717l = m8717l();
/* 7 */             if (qf2Var2 == qf2Var3) {
/* 11 */                c1789jdM8717l.f12225d.m3722g(qf2Var, 1.0f);
/* 16 */                c1789jdM8717l.f12225d.m3722g(qf2Var4, 1.0f);
/* 23 */                c1789jdM8717l.f12225d.m3722g(qf2Var2, -2.0f);
                    } else {
/* 31 */                C0913fd c0913fd = c1789jdM8717l.f12225d;
/* 35 */                if (f == 0.5f) {
/* 37 */                    c0913fd.m3722g(qf2Var, 1.0f);
/* 42 */                    c1789jdM8717l.f12225d.m3722g(qf2Var2, -1.0f);
/* 47 */                    c1789jdM8717l.f12225d.m3722g(qf2Var3, -1.0f);
/* 52 */                    c1789jdM8717l.f12225d.m3722g(qf2Var4, 1.0f);
/* 55 */                    if (i > 0 || i2 > 0) {
/* 62 */                        c1789jdM8717l.f12223b = (-i) + i2;
                            }
                        } else if (f <= 0.0f) {
/* 70 */                    c0913fd.m3722g(qf2Var, -1.0f);
/* 75 */                    c1789jdM8717l.f12225d.m3722g(qf2Var2, 1.0f);
/* 79 */                    c1789jdM8717l.f12223b = i;
                        } else if (f >= 1.0f) {
/* 86 */                    c0913fd.m3722g(qf2Var4, -1.0f);
/* 91 */                    c1789jdM8717l.f12225d.m3722g(qf2Var3, 1.0f);
/* 96 */                    c1789jdM8717l.f12223b = -i2;
                        } else {
/* 99 */                    float f2 = 1.0f - f;
/* 103 */                   c0913fd.m3722g(qf2Var, f2 * 1.0f);
/* 110 */                   c1789jdM8717l.f12225d.m3722g(qf2Var2, f2 * (-1.0f));
/* 116 */                   c1789jdM8717l.f12225d.m3722g(qf2Var3, (-1.0f) * f);
/* 122 */                   c1789jdM8717l.f12225d.m3722g(qf2Var4, 1.0f * f);
/* 125 */                   if (i > 0 || i2 > 0) {
/* 135 */                       c1789jdM8717l.f12223b = (i2 * f) + ((-i) * f2);
                            }
                        }
                    }
/* 139 */           if (i3 != 8) {
/* 141 */               c1789jdM8717l.m5787a(this, i3);
                    }
/* 144 */           m8708c(c1789jdM8717l);
                }

                /* JADX WARN: Code duplicated, block: B:119:0x01ab  */
                /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
                /* JADX WARN: Code duplicated, block: B:75:0x00f5  */
                /* JADX INFO: renamed from: c */
                public final void m8708c(C1789jd c1789jd) {
                    boolean z;
                    boolean z2;
                    qf2 qf2VarM5792f;
/* 11 */            if (this.f16942j + 1 >= this.f16943k || this.f16941i + 1 >= this.f16937e) {
/* 20 */                m8719o();
                    }
/* 25 */            if (c1789jd.f12226e) {
/* 444 */               z = false;
                    } else {
/* 27 */                ArrayList arrayList = c1789jd.f12224c;
/* 33 */                if (this.f16938f.length != 0) {
/* 36 */                    boolean z3 = false;
/* 37 */                    while (!z3) {
/* 41 */                        int iM3719d = c1789jd.f12225d.m3719d();
/* 46 */                        for (int i = 0; i < iM3719d; i++) {
/* 50 */                            qf2 qf2VarM3720e = c1789jd.f12225d.m3720e(i);
/* 56 */                            if (qf2VarM3720e.f15516c != -1 || qf2VarM3720e.f15519f) {
/* 63 */                                arrayList.add(qf2VarM3720e);
                                    }
                                }
/* 69 */                        int size = arrayList.size();
/* 73 */                        if (size > 0) {
/* 76 */                            for (int i2 = 0; i2 < size; i2++) {
/* 82 */                                qf2 qf2Var = (qf2) arrayList.get(i2);
/* 86 */                                if (qf2Var.f15519f) {
/* 88 */                                    c1789jd.m5794h(this, qf2Var, true);
                                        } else {
/* 98 */                                    c1789jd.mo5795i(this, this.f16938f[qf2Var.f15516c], true);
                                        }
                                    }
/* 104 */                           arrayList.clear();
                                } else {
/* 108 */                           z3 = true;
                                }
                            }
/* 112 */                   if (c1789jd.f12222a != null && c1789jd.f12225d.m3719d() == 0) {
/* 122 */                       c1789jd.f12226e = true;
/* 124 */                       this.f16933a = true;
                            }
                        }
/* 130 */               if (c1789jd.mo5791e()) {
/* 450 */                   return;
                        }
/* 134 */               float f = c1789jd.f12223b;
/* 136 */               float f2 = 0.0f;
/* 139 */               if (f < 0.0f) {
/* 144 */                   c1789jd.f12223b = f * (-1.0f);
/* 146 */                   C0913fd c0913fd = c1789jd.f12225d;
/* 148 */                   int i3 = c0913fd.f8138h;
/* 151 */                   for (int i4 = 0; i3 != -1 && i4 < c0913fd.f8131a; i4++) {
/* 157 */                       float[] fArr = c0913fd.f8137g;
/* 162 */                       fArr[i3] = fArr[i3] * (-1.0f);
/* 166 */                       i3 = c0913fd.f8136f[i3];
                            }
                        }
/* 173 */               int iM3719d2 = c1789jd.f12225d.m3719d();
/* 178 */               float f3 = 0.0f;
/* 179 */               float f4 = 0.0f;
/* 180 */               qf2 qf2Var2 = null;
/* 181 */               qf2 qf2Var3 = null;
/* 182 */               int i5 = 0;
/* 183 */               boolean z4 = false;
/* 184 */               boolean z5 = false;
/* 185 */               while (i5 < iM3719d2) {
/* 189 */                   float fM3721f = c1789jd.f12225d.m3721f(i5);
/* 195 */                   qf2 qf2VarM3720e2 = c1789jd.f12225d.m3720e(i5);
/* 199 */                   float f5 = f2;
/* 203 */                   if (qf2VarM3720e2.f15513W == 1) {
/* 205 */                       if (qf2Var2 == null) {
/* 209 */                           if (qf2VarM3720e2.f15512V <= 1) {
/* 231 */                               z4 = true;
                                    } else {
/* 212 */                               z4 = false;
                                    }
/* 213 */                           qf2Var2 = qf2VarM3720e2;
/* 214 */                           f3 = fM3721f;
                                } else {
/* 218 */                           if (f3 > fM3721f) {
/* 222 */                               if (qf2VarM3720e2.f15512V > 1) {
/* 212 */                                   z4 = false;
                                        }
/* 213 */                               qf2Var2 = qf2VarM3720e2;
/* 214 */                               f3 = fM3721f;
                                    } else if (z4 || qf2VarM3720e2.f15512V > 1) {
                                    }
/* 231 */                           z4 = true;
/* 213 */                           qf2Var2 = qf2VarM3720e2;
/* 214 */                           f3 = fM3721f;
                                }
                            } else if (qf2Var2 == null && fM3721f < f5) {
/* 239 */                       if (qf2Var3 == null) {
/* 243 */                           if (qf2VarM3720e2.f15512V <= 1) {
/* 265 */                               z5 = true;
                                    } else {
/* 246 */                               z5 = false;
                                    }
/* 247 */                           qf2Var3 = qf2VarM3720e2;
/* 248 */                           f4 = fM3721f;
                                } else {
/* 252 */                           if (f4 > fM3721f) {
/* 256 */                               if (qf2VarM3720e2.f15512V > 1) {
/* 246 */                                   z5 = false;
                                        }
/* 247 */                               qf2Var3 = qf2VarM3720e2;
/* 248 */                               f4 = fM3721f;
                                    } else if (z5 || qf2VarM3720e2.f15512V > 1) {
                                    }
/* 265 */                           z5 = true;
/* 247 */                           qf2Var3 = qf2VarM3720e2;
/* 248 */                           f4 = fM3721f;
                                }
                            }
/* 267 */                   i5++;
/* 269 */                   f2 = f5;
                        }
/* 272 */               float f6 = f2;
/* 274 */               if (qf2Var2 == null) {
/* 277 */                   qf2Var2 = qf2Var3;
                        }
/* 278 */               if (qf2Var2 == null) {
/* 280 */                   z2 = true;
                        } else {
/* 282 */                   c1789jd.m5793g(qf2Var2);
/* 285 */                   z2 = false;
                        }
/* 292 */               if (c1789jd.f12225d.m3719d() == 0) {
/* 294 */                   c1789jd.f12226e = true;
                        }
/* 296 */               if (z2) {
/* 303 */                   if (this.f16941i + 1 >= this.f16937e) {
/* 305 */                       m8719o();
                            }
/* 309 */                   qf2 qf2VarM8706a = m8706a(3);
/* 315 */                   int i6 = this.f16934b + 1;
/* 316 */                   this.f16934b = i6;
/* 321 */                   this.f16941i++;
/* 323 */                   qf2VarM8706a.f15515b = i6;
/* 325 */                   C0875ec c0875ec = this.f16944l;
/* 331 */                   ((qf2[]) c0875ec.f7615d)[i6] = qf2VarM8706a;
/* 333 */                   c1789jd.f12222a = qf2VarM8706a;
/* 335 */                   int i7 = this.f16942j;
/* 337 */                   m8713h(c1789jd);
/* 343 */                   if (this.f16942j == i7 + 1) {
/* 345 */                       C1789jd c1789jd2 = this.f16947o;
/* 347 */                       c1789jd2.f12222a = null;
/* 351 */                       c1789jd2.f12225d.m3717b();
/* 361 */                       for (int i8 = 0; i8 < c1789jd.f12225d.m3719d(); i8++) {
/* 377 */                           c1789jd2.f12225d.m3716a(c1789jd.f12225d.m3720e(i8), c1789jd.f12225d.m3721f(i8), true);
                                }
/* 385 */                       m8722r(this.f16947o);
/* 390 */                       if (qf2VarM8706a.f15516c == -1) {
/* 394 */                           if (c1789jd.f12222a == qf2VarM8706a && (qf2VarM5792f = c1789jd.m5792f(null, qf2VarM8706a)) != null) {
/* 402 */                               c1789jd.m5793g(qf2VarM5792f);
                                    }
/* 407 */                           if (!c1789jd.f12226e) {
/* 411 */                               c1789jd.f12222a.m7789e(this, c1789jd);
                                    }
/* 418 */                           ((nt1) c0875ec.f7613b).m7043b(c1789jd);
/* 424 */                           this.f16942j--;
                                }
/* 426 */                       z = true;
                            } else {
/* 428 */                       z = false;
                            }
                        } else {
/* 428 */                   z = false;
                        }
/* 429 */               qf2 qf2Var4 = c1789jd.f12222a;
/* 431 */               if (qf2Var4 == null) {
/* 450 */                   return;
                        }
/* 435 */               if (qf2Var4.f15513W != 1 && c1789jd.f12223b < f6) {
/* 450 */                   return;
                        }
                    }
/* 445 */           if (z) {
/* 450 */               return;
                    }
/* 447 */           m8713h(c1789jd);
                }

                /* JADX INFO: renamed from: d */
                public final void m8709d(qf2 qf2Var, int i) {
/* 1 */             int i2 = qf2Var.f15516c;
/* 5 */             if (i2 == -1) {
/* 8 */                 qf2Var.m7788d(this, i);
/* 15 */                for (int i3 = 0; i3 < this.f16934b + 1; i3++) {
/* 23 */                    qf2 qf2Var2 = ((qf2[]) this.f16944l.f7615d)[i3];
                        }
/* 28 */                return;
                    }
/* 29 */            if (i2 == -1) {
/* 89 */                C1789jd c1789jdM8717l = m8717l();
/* 93 */                c1789jdM8717l.f12222a = qf2Var;
                        float f = i;
/* 96 */                qf2Var.f15518e = f;
/* 98 */                c1789jdM8717l.f12223b = f;
/* 100 */               c1789jdM8717l.f12226e = true;
/* 102 */               m8708c(c1789jdM8717l);
/* 105 */               return;
                    }
/* 33 */            C1789jd c1789jd = this.f16938f[i2];
/* 37 */            if (c1789jd.f12226e) {
/* 40 */                c1789jd.f12223b = i;
/* 42 */                return;
                    }
/* 49 */            if (c1789jd.f12225d.m3719d() == 0) {
/* 51 */                c1789jd.f12226e = true;
/* 54 */                c1789jd.f12223b = i;
/* 56 */                return;
                    }
/* 57 */            C1789jd c1789jdM8717l2 = m8717l();
/* 61 */            if (i < 0) {
/* 65 */                c1789jdM8717l2.f12223b = i * (-1);
/* 71 */                c1789jdM8717l2.f12225d.m3722g(qf2Var, 1.0f);
                    } else {
/* 76 */                c1789jdM8717l2.f12223b = i;
/* 82 */                c1789jdM8717l2.f12225d.m3722g(qf2Var, -1.0f);
                    }
/* 85 */            m8708c(c1789jdM8717l2);
                }

                /* JADX INFO: renamed from: e */
                public final void m8710e(qf2 qf2Var, qf2 qf2Var2, int i, int i2) {
/* 3 */             if (i2 == 8 && qf2Var2.f15519f && qf2Var.f15516c == -1) {
/* 18 */                qf2Var.m7788d(this, qf2Var2.f15518e + i);
/* 21 */                return;
                    }
/* 22 */            C1789jd c1789jdM8717l = m8717l();
/* 26 */            boolean z = false;
/* 27 */            if (i != 0) {
/* 29 */                if (i < 0) {
/* 31 */                    i *= -1;
/* 33 */                    z = true;
                        }
/* 35 */                c1789jdM8717l.f12223b = i;
                    }
/* 37 */            C0913fd c0913fd = c1789jdM8717l.f12225d;
/* 43 */            if (z) {
/* 54 */                c0913fd.m3722g(qf2Var, 1.0f);
/* 59 */                c1789jdM8717l.f12225d.m3722g(qf2Var2, -1.0f);
                    } else {
/* 45 */                c0913fd.m3722g(qf2Var, -1.0f);
/* 50 */                c1789jdM8717l.f12225d.m3722g(qf2Var2, 1.0f);
                    }
/* 62 */            if (i2 != 8) {
/* 64 */                c1789jdM8717l.m5787a(this, i2);
                    }
/* 67 */            m8708c(c1789jdM8717l);
                }

                /* JADX INFO: renamed from: f */
                public final void m8711f(qf2 qf2Var, qf2 qf2Var2, int i, int i2) {
/* 1 */             C1789jd c1789jdM8717l = m8717l();
/* 5 */             qf2 qf2VarM8718m = m8718m();
/* 10 */            qf2VarM8718m.f15517d = 0;
/* 12 */            c1789jdM8717l.m5788b(qf2Var, qf2Var2, qf2VarM8718m, i);
/* 17 */            if (i2 != 8) {
/* 36 */                c1789jdM8717l.f12225d.m3722g(m8715j(i2), (int) (c1789jdM8717l.f12225d.m3718c(qf2VarM8718m) * (-1.0f)));
                    }
/* 39 */            m8708c(c1789jdM8717l);
                }

                /* JADX INFO: renamed from: g */
                public final void m8712g(qf2 qf2Var, qf2 qf2Var2, int i, int i2) {
/* 1 */             C1789jd c1789jdM8717l = m8717l();
/* 5 */             qf2 qf2VarM8718m = m8718m();
/* 10 */            qf2VarM8718m.f15517d = 0;
/* 12 */            c1789jdM8717l.m5789c(qf2Var, qf2Var2, qf2VarM8718m, i);
/* 17 */            if (i2 != 8) {
/* 36 */                c1789jdM8717l.f12225d.m3722g(m8715j(i2), (int) (c1789jdM8717l.f12225d.m3718c(qf2VarM8718m) * (-1.0f)));
                    }
/* 39 */            m8708c(c1789jdM8717l);
                }

                /* JADX INFO: renamed from: h */
                public final void m8713h(C1789jd c1789jd) {
                    int i;
/* 3 */             if (c1789jd.f12226e) {
/* 9 */                 c1789jd.f12222a.m7788d(this, c1789jd.f12223b);
                    } else {
/* 13 */                C1789jd[] c1789jdArr = this.f16938f;
/* 15 */                int i2 = this.f16942j;
/* 17 */                c1789jdArr[i2] = c1789jd;
/* 19 */                qf2 qf2Var = c1789jd.f12222a;
/* 21 */                qf2Var.f15516c = i2;
/* 25 */                this.f16942j = i2 + 1;
/* 27 */                qf2Var.m7789e(this, c1789jd);
                    }
/* 32 */            if (this.f16933a) {
/* 35 */                int i3 = 0;
/* 38 */                while (i3 < this.f16942j) {
/* 44 */                    if (this.f16938f[i3] == null) {
/* 50 */                        System.out.println("WTF");
                            }
/* 55 */                    C1789jd c1789jd2 = this.f16938f[i3];
/* 57 */                    if (c1789jd2 != null && c1789jd2.f12226e) {
/* 67 */                        c1789jd2.f12222a.m7788d(this, c1789jd2.f12223b);
/* 76 */                        ((nt1) this.f16944l.f7613b).m7043b(c1789jd2);
/* 82 */                        this.f16938f[i3] = null;
/* 84 */                        int i4 = i3 + 1;
/* 86 */                        int i5 = i4;
                                while (true) {
/* 87 */                            i = this.f16942j;
/* 89 */                            if (i4 >= i) {
                                        break;
                                    }
/* 91 */                            C1789jd[] c1789jdArr2 = this.f16938f;
/* 93 */                            int i6 = i4 - 1;
/* 95 */                            C1789jd c1789jd3 = c1789jdArr2[i4];
/* 97 */                            c1789jdArr2[i6] = c1789jd3;
/* 99 */                            qf2 qf2Var2 = c1789jd3.f12222a;
/* 103 */                           if (qf2Var2.f15516c == i4) {
/* 105 */                               qf2Var2.f15516c = i6;
                                    }
/* 110 */                           i5 = i4;
/* 107 */                           i4++;
                                }
/* 113 */                       if (i5 < i) {
/* 117 */                           this.f16938f[i5] = null;
                                }
/* 121 */                       this.f16942j = i - 1;
/* 123 */                       i3--;
                            }
/* 125 */                   i3++;
                        }
/* 128 */               this.f16933a = false;
                    }
                }

                /* JADX INFO: renamed from: i */
                public final void m8714i() {
/* 4 */             for (int i = 0; i < this.f16942j; i++) {
/* 8 */                 C1789jd c1789jd = this.f16938f[i];
/* 14 */                c1789jd.f12222a.f15518e = c1789jd.f12223b;
                    }
                }

                /* JADX INFO: renamed from: j */
                public final qf2 m8715j(int i) {
/* 7 */             if (this.f16941i + 1 >= this.f16937e) {
/* 9 */                 m8719o();
                    }
/* 13 */            qf2 qf2VarM8706a = m8706a(4);
/* 17 */            float[] fArr = qf2VarM8706a.f15521v;
/* 21 */            int i2 = this.f16934b + 1;
/* 23 */            this.f16934b = i2;
/* 29 */            this.f16941i++;
/* 31 */            qf2VarM8706a.f15515b = i2;
/* 33 */            qf2VarM8706a.f15517d = i;
/* 41 */            ((qf2[]) this.f16944l.f7615d)[i2] = qf2VarM8706a;
/* 43 */            qx1 qx1Var = this.f16935c;
/* 47 */            qx1Var.f15793i.f18577b = qf2VarM8706a;
/* 50 */            Arrays.fill(fArr, 0.0f);
/* 57 */            fArr[qf2VarM8706a.f15517d] = 1.0f;
/* 59 */            qx1Var.m8026j(qf2VarM8706a);
/* 62 */            return qf2VarM8706a;
                }

                /* JADX INFO: renamed from: k */
                public final qf2 m8716k(Object obj) {
/* 1 */             if (obj == null) {
/* 77 */                return null;
                    }
/* 10 */            if (this.f16941i + 1 >= this.f16937e) {
/* 12 */                m8719o();
                    }
/* 17 */            if (!(obj instanceof C2051oz)) {
/* 77 */                return null;
                    }
/* 19 */            C2051oz c2051oz = (C2051oz) obj;
/* 21 */            qf2 qf2Var = c2051oz.f14932i;
/* 23 */            if (qf2Var == null) {
/* 25 */                c2051oz.m7253k();
/* 28 */                qf2Var = c2051oz.f14932i;
                    }
/* 30 */            int i = qf2Var.f15515b;
/* 33 */            C0875ec c0875ec = this.f16944l;
/* 35 */            if (i != -1 && i <= this.f16934b && ((qf2[]) c0875ec.f7615d)[i] != null) {
/* 50 */                return qf2Var;
                    }
/* 51 */            if (i != -1) {
/* 53 */                qf2Var.m7787c();
                    }
/* 58 */            int i2 = this.f16934b + 1;
/* 59 */            this.f16934b = i2;
/* 64 */            this.f16941i++;
/* 66 */            qf2Var.f15515b = i2;
/* 68 */            qf2Var.f15513W = 1;
/* 74 */            ((qf2[]) c0875ec.f7615d)[i2] = qf2Var;
/* 76 */            return qf2Var;
                }

                /* JADX INFO: renamed from: l */
                public final C1789jd m8717l() {
                    Object obj;
/* 1 */             C0875ec c0875ec = this.f16944l;
/* 5 */             nt1 nt1Var = (nt1) c0875ec.f7613b;
/* 7 */             int i = nt1Var.f14449b;
/* 10 */            if (i > 0) {
/* 12 */                int i2 = i - 1;
/* 14 */                Object[] objArr = nt1Var.f14448a;
/* 16 */                obj = objArr[i2];
/* 18 */                objArr[i2] = null;
/* 20 */                nt1Var.f14449b = i2;
                    } else {
/* 23 */                obj = null;
                    }
/* 24 */            C1789jd c1789jd = (C1789jd) obj;
/* 26 */            if (c1789jd == null) {
/* 30 */                return new C1789jd(c0875ec);
                    }
/* 34 */            c1789jd.f12222a = null;
/* 38 */            c1789jd.f12225d.m3717b();
/* 42 */            c1789jd.f12223b = 0.0f;
/* 45 */            c1789jd.f12226e = false;
/* 47 */            return c1789jd;
                }

                /* JADX INFO: renamed from: m */
                public final qf2 m8718m() {
/* 7 */             if (this.f16941i + 1 >= this.f16937e) {
/* 9 */                 m8719o();
                    }
/* 13 */            qf2 qf2VarM8706a = m8706a(3);
/* 19 */            int i = this.f16934b + 1;
/* 21 */            this.f16934b = i;
/* 27 */            this.f16941i++;
/* 29 */            qf2VarM8706a.f15515b = i;
/* 37 */            ((qf2[]) this.f16944l.f7615d)[i] = qf2VarM8706a;
/* 39 */            return qf2VarM8706a;
                }

                /* JADX INFO: renamed from: o */
                public final void m8719o() {
/* 3 */             int i = this.f16936d * 2;
/* 5 */             this.f16936d = i;
/* 15 */            this.f16938f = (C1789jd[]) Arrays.copyOf(this.f16938f, i);
/* 17 */            C0875ec c0875ec = this.f16944l;
/* 31 */            c0875ec.f7615d = (qf2[]) Arrays.copyOf((qf2[]) c0875ec.f7615d, this.f16936d);
/* 33 */            int i2 = this.f16936d;
/* 37 */            this.f16940h = new boolean[i2];
/* 39 */            this.f16937e = i2;
/* 41 */            this.f16943k = i2;
                }

                /* JADX INFO: renamed from: p */
                public final void m8720p() {
/* 1 */             qx1 qx1Var = this.f16935c;
/* 7 */             if (qx1Var.mo5791e()) {
/* 9 */                 m8714i();
/* 12 */                return;
                    }
/* 15 */            if (!this.f16939g) {
/* 41 */                m8721q(qx1Var);
/* 44 */                return;
                    }
/* 20 */            for (int i = 0; i < this.f16942j; i++) {
/* 28 */                if (!this.f16938f[i].f12226e) {
/* 30 */                    m8721q(qx1Var);
/* 33 */                    return;
                        }
                    }
/* 37 */            m8714i();
                }

                /* JADX INFO: renamed from: q */
                public final void m8721q(qx1 qx1Var) {
/* 6 */             for (int i = 0; i < this.f16942j; i++) {
/* 10 */                C1789jd c1789jd = this.f16938f[i];
/* 16 */                int i2 = 1;
/* 17 */                if (c1789jd.f12222a.f15513W != 1) {
/* 23 */                    float f = 0.0f;
/* 26 */                    if (c1789jd.f12223b < 0.0f) {
/* 28 */                        boolean z = false;
/* 29 */                        int i3 = 0;
/* 30 */                        while (!z) {
/* 32 */                            i3 += i2;
/* 34 */                            float f2 = Float.MAX_VALUE;
/* 37 */                            int i4 = -1;
/* 38 */                            int i5 = -1;
/* 39 */                            int i6 = 0;
/* 40 */                            int i7 = 0;
/* 43 */                            while (i6 < this.f16942j) {
/* 47 */                                C1789jd c1789jd2 = this.f16938f[i6];
/* 53 */                                if (c1789jd2.f12222a.f15513W != i2 && !c1789jd2.f12226e && c1789jd2.f12223b < f) {
/* 69 */                                    int iM3719d = c1789jd2.f12225d.m3719d();
/* 73 */                                    int i8 = 0;
/* 74 */                                    while (i8 < iM3719d) {
/* 78 */                                        qf2 qf2VarM3720e = c1789jd2.f12225d.m3720e(i8);
/* 84 */                                        float fM3718c = c1789jd2.f12225d.m3718c(qf2VarM3720e);
/* 90 */                                        if (fM3718c > f) {
/* 96 */                                            for (int i9 = 0; i9 < 9; i9++) {
/* 102 */                                               float f3 = qf2VarM3720e.f15520i[i9] / fM3718c;
/* 105 */                                               if ((f3 < f2 && i9 == i7) || i9 > i7) {
/* 113 */                                                   i7 = i9;
/* 111 */                                                   i5 = qf2VarM3720e.f15515b;
/* 115 */                                                   i4 = i6;
/* 116 */                                                   f2 = f3;
                                                        }
                                                    }
                                                }
/* 120 */                                       i8++;
/* 122 */                                       f = 0.0f;
                                            }
                                        }
/* 125 */                               i6++;
/* 127 */                               f = 0.0f;
/* 128 */                               i2 = 1;
                                    }
/* 130 */                           if (i4 != -1) {
/* 134 */                               C1789jd c1789jd3 = this.f16938f[i4];
/* 138 */                               c1789jd3.f12222a.f15516c = -1;
/* 148 */                               c1789jd3.m5793g(((qf2[]) this.f16944l.f7615d)[i5]);
/* 151 */                               qf2 qf2Var = c1789jd3.f12222a;
/* 153 */                               qf2Var.f15516c = i4;
/* 155 */                               qf2Var.m7789e(this, c1789jd3);
                                    } else {
/* 159 */                               z = true;
                                    }
/* 164 */                           if (i3 > this.f16941i / 2) {
/* 166 */                               z = true;
                                    }
/* 167 */                           f = 0.0f;
/* 168 */                           i2 = 1;
                                }
                                break;
                            }
                        }
                    }
/* 175 */           m8722r(qx1Var);
/* 178 */           m8714i();
                }

                /* JADX INFO: renamed from: r */
                public final void m8722r(C1789jd c1789jd) {
                    boolean z;
/* 5 */             int i = 0;
/* 9 */             for (int i2 = 0; i2 < this.f16941i; i2++) {
/* 13 */                this.f16940h[i2] = false;
                    }
/* 18 */            boolean z2 = false;
/* 19 */            int i3 = 0;
/* 20 */            while (!z2) {
/* 23 */                i3++;
/* 28 */                if (i3 >= this.f16941i * 2) {
/* 175 */                   return;
                        }
/* 32 */                qf2 qf2Var = c1789jd.f12222a;
/* 34 */                if (qf2Var != null) {
/* 40 */                    this.f16940h[qf2Var.f15515b] = true;
                        }
/* 44 */                qf2 qf2VarMo5790d = c1789jd.mo5790d(this.f16940h);
/* 48 */                if (qf2VarMo5790d != null) {
/* 50 */                    boolean[] zArr = this.f16940h;
/* 52 */                    int i4 = qf2VarMo5790d.f15515b;
/* 56 */                    if (zArr[i4]) {
/* 175 */                       return;
                            } else {
/* 60 */                        zArr[i4] = true;
                            }
                        }
/* 62 */                if (qf2VarMo5790d != null) {
/* 65 */                    float f = Float.MAX_VALUE;
/* 68 */                    int i5 = i;
/* 69 */                    int i6 = -1;
/* 72 */                    while (i5 < this.f16942j) {
/* 76 */                        C1789jd c1789jd2 = this.f16938f[i5];
/* 82 */                        if (c1789jd2.f12222a.f15513W != 1 && !c1789jd2.f12226e) {
/* 90 */                            C0913fd c0913fd = c1789jd2.f12225d;
/* 92 */                            int i7 = c0913fd.f8138h;
/* 94 */                            if (i7 == -1) {
/* 122 */                               z = false;
                                        break;
                                    }
/* 97 */                            int i8 = i;
                                    while (true) {
/* 98 */                                if (i7 == -1 || i8 >= c0913fd.f8131a) {
/* 122 */                                   z = false;
                                            break;
                                        } else if (c0913fd.f8135e[i7] == qf2VarMo5790d.f15515b) {
/* 112 */                                   z = true;
                                            break;
                                        } else {
/* 116 */                                   i7 = c0913fd.f8136f[i7];
/* 118 */                                   i8++;
                                        }
                                    }
/* 123 */                           if (z) {
/* 127 */                               float fM3718c = c1789jd2.f12225d.m3718c(qf2VarMo5790d);
/* 134 */                               if (fM3718c < 0.0f) {
/* 139 */                                   float f2 = (-c1789jd2.f12223b) / fM3718c;
/* 142 */                                   if (f2 < f) {
/* 144 */                                       i6 = i5;
/* 145 */                                       f = f2;
                                            }
                                        }
                                    }
                                }
/* 146 */                       i5++;
/* 148 */                       i = 0;
                            }
/* 150 */                   if (i6 > -1) {
/* 154 */                       C1789jd c1789jd3 = this.f16938f[i6];
/* 158 */                       c1789jd3.f12222a.f15516c = -1;
/* 160 */                       c1789jd3.m5793g(qf2VarMo5790d);
/* 163 */                       qf2 qf2Var2 = c1789jd3.f12222a;
/* 165 */                       qf2Var2.f15516c = i6;
/* 167 */                       qf2Var2.m7789e(this, c1789jd3);
                            }
                        } else {
/* 171 */                   z2 = true;
                        }
/* 172 */               i = 0;
                    }
                }

                /* JADX INFO: renamed from: s */
                public final void m8723s() {
/* 4 */             for (int i = 0; i < this.f16942j; i++) {
/* 8 */                 C1789jd c1789jd = this.f16938f[i];
/* 10 */                if (c1789jd != null) {
/* 18 */                    ((nt1) this.f16944l.f7613b).m7043b(c1789jd);
                        }
/* 24 */                this.f16938f[i] = null;
                    }
                }

                /* JADX INFO: renamed from: t */
                public final void m8724t() {
                    C0875ec c0875ec;
/* 2 */             int i = 0;
                    while (true) {
/* 3 */                 c0875ec = this.f16944l;
/* 7 */                 qf2[] qf2VarArr = (qf2[]) c0875ec.f7615d;
/* 10 */                if (i >= qf2VarArr.length) {
                            break;
                        }
/* 12 */                qf2 qf2Var = qf2VarArr[i];
/* 14 */                if (qf2Var != null) {
/* 16 */                    qf2Var.m7787c();
                        }
/* 19 */                i++;
                    }
/* 24 */            nt1 nt1Var = (nt1) c0875ec.f7614c;
/* 26 */            qf2[] qf2VarArr2 = this.f16945m;
/* 28 */            int length = this.f16946n;
/* 30 */            nt1Var.getClass();
/* 34 */            if (length > qf2VarArr2.length) {
/* 36 */                length = qf2VarArr2.length;
                    }
/* 38 */            for (int i2 = 0; i2 < length; i2++) {
/* 40 */                qf2 qf2Var2 = qf2VarArr2[i2];
/* 42 */                int i3 = nt1Var.f14449b;
/* 44 */                Object[] objArr = nt1Var.f14448a;
/* 47 */                if (i3 < objArr.length) {
/* 49 */                    objArr[i3] = qf2Var2;
/* 53 */                    nt1Var.f14449b = i3 + 1;
                        }
                    }
/* 58 */            this.f16946n = 0;
/* 65 */            Arrays.fill((qf2[]) c0875ec.f7615d, (Object) null);
/* 68 */            this.f16934b = 0;
/* 70 */            qx1 qx1Var = this.f16935c;
/* 72 */            qx1Var.f15792h = 0;
/* 75 */            qx1Var.f12223b = 0.0f;
/* 78 */            this.f16941i = 1;
/* 83 */            for (int i4 = 0; i4 < this.f16942j; i4++) {
/* 87 */                C1789jd c1789jd = this.f16938f[i4];
                    }
/* 92 */            m8723s();
/* 95 */            this.f16942j = 0;
/* 102 */           this.f16947o = new C1789jd(c0875ec);
                }
            }
