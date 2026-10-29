            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class l73 implements s70 {

                /* JADX INFO: renamed from: a */
                public int f13135a;

                /* JADX INFO: renamed from: b */
                public C2569zz f13136b;

                /* JADX INFO: renamed from: c */
                public n52 f13137c;

                /* JADX INFO: renamed from: d */
                public EnumC2516yz f13138d;

                /* JADX INFO: renamed from: e */
                public final n80 f13139e = new n80(this);

                /* JADX INFO: renamed from: f */
                public int f13140f = 0;

                /* JADX INFO: renamed from: g */
                public boolean f13141g = false;

                /* JADX INFO: renamed from: h */
                public final v70 f13142h = new v70(this);

                /* JADX INFO: renamed from: i */
                public final v70 f13143i = new v70(this);

                /* JADX INFO: renamed from: j */
                public int f13144j = 1;

                public l73(C2569zz c2569zz) {
/* 33 */            this.f13136b = c2569zz;
                }

                /* JADX INFO: renamed from: b */
                public static void m6394b(v70 v70Var, v70 v70Var2, int i) {
/* 3 */             v70Var.f17892l.add(v70Var2);
/* 6 */             v70Var.f17886f = i;
/* 10 */            v70Var2.f17891k.add(v70Var);
                }

                /* JADX INFO: renamed from: h */
                public static v70 m6395h(C2051oz c2051oz) {
/* 1 */             C2051oz c2051oz2 = c2051oz.f14929f;
/* 3 */             if (c2051oz2 == null) {
/* 29 */                return null;
                    }
/* 6 */             C2569zz c2569zz = c2051oz2.f14927d;
/* 10 */            int iM3520y = AbstractC0886en.m3520y(c2051oz2.f14928e);
/* 15 */            if (iM3520y == 1) {
/* 53 */                return c2569zz.f20427d.f13142h;
                    }
/* 18 */            if (iM3520y == 2) {
/* 48 */                return c2569zz.f20429e.f13142h;
                    }
/* 21 */            if (iM3520y == 3) {
/* 43 */                return c2569zz.f20427d.f13143i;
                    }
/* 24 */            if (iM3520y == 4) {
/* 38 */                return c2569zz.f20429e.f13143i;
                    }
/* 27 */            if (iM3520y != 5) {
/* 29 */                return null;
                    }
/* 33 */            return c2569zz.f20429e.f12564k;
                }

                /* JADX INFO: renamed from: i */
                public static v70 m6396i(C2051oz c2051oz, int i) {
/* 1 */             C2051oz c2051oz2 = c2051oz.f14929f;
/* 3 */             if (c2051oz2 == null) {
/* 33 */                return null;
                    }
/* 6 */             C2569zz c2569zz = c2051oz2.f14927d;
/* 13 */            l73 l73Var = i == 0 ? c2569zz.f20427d : c2569zz.f20429e;
/* 17 */            int iM3520y = AbstractC0886en.m3520y(c2051oz2.f14928e);
/* 22 */            if (iM3520y == 1 || iM3520y == 2) {
/* 38 */                return l73Var.f13142h;
                    }
/* 28 */            if (iM3520y == 3 || iM3520y == 4) {
/* 35 */                return l73Var.f13143i;
                    }
/* 33 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public final void m6397c(v70 v70Var, v70 v70Var2, int i, n80 n80Var) {
/* 3 */             v70Var.f17892l.add(v70Var2);
/* 10 */            v70Var.f17892l.add(this.f13139e);
/* 13 */            v70Var.f17888h = i;
/* 15 */            v70Var.f17889i = n80Var;
/* 19 */            v70Var2.f17891k.add(v70Var);
/* 24 */            n80Var.f17891k.add(v70Var);
                }

                /* JADX INFO: renamed from: d */
                public abstract void mo1442d();

                /* JADX INFO: renamed from: e */
                public abstract void mo1443e();

                /* JADX INFO: renamed from: f */
                public abstract void mo1444f();

                /* JADX INFO: renamed from: g */
                public final int m6398g(int i, int i2) {
/* 1 */             C2569zz c2569zz = this.f13136b;
/* 3 */             if (i2 == 0) {
/* 5 */                 int i3 = c2569zz.f20462v;
/* 9 */                 int iMax = Math.max(c2569zz.f20461u, i);
/* 13 */                if (i3 > 0) {
/* 15 */                    iMax = Math.min(i3, i);
                        }
/* 19 */                if (iMax != i) {
/* 21 */                    return iMax;
                        }
                    } else {
/* 22 */                int i4 = c2569zz.f20465y;
/* 26 */                int iMax2 = Math.max(c2569zz.f20464x, i);
/* 30 */                if (i4 > 0) {
/* 32 */                    iMax2 = Math.min(i4, i);
                        }
/* 36 */                if (iMax2 != i) {
/* 38 */                    return iMax2;
                        }
                    }
/* 39 */            return i;
                }

                /* JADX INFO: renamed from: j */
                public long mo6276j() {
/* 1 */             n80 n80Var = this.f13139e;
/* 5 */             if (n80Var.f17890j) {
/* 9 */                 return n80Var.f17887g;
                    }
/* 11 */            return 0L;
                }

                /* JADX INFO: renamed from: k */
                public abstract boolean mo1445k();

                /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:30:0x0058  */
                /* JADX WARN: Code duplicated, block: B:33:0x0060  */
                /* JADX WARN: Code duplicated, block: B:35:0x0066  */
                /* JADX WARN: Code duplicated, block: B:36:0x006b  */
                /* JADX INFO: renamed from: l */
                public final void m6399l(C2051oz c2051oz, C2051oz c2051oz2, int i) {
                    n80 n80Var;
                    float f;
                    int i2;
                    int i3;
/* 1 */             v70 v70VarM6395h = m6395h(c2051oz);
/* 5 */             v70 v70VarM6395h2 = m6395h(c2051oz2);
/* 11 */            if (v70VarM6395h.f17890j && v70VarM6395h2.f17890j) {
/* 25 */                int iM7247e = c2051oz.m7247e() + v70VarM6395h.f17887g;
/* 32 */                int iM7247e2 = v70VarM6395h2.f17887g - c2051oz2.m7247e();
/* 33 */                int i4 = iM7247e2 - iM7247e;
/* 35 */                n80 n80Var2 = this.f13139e;
/* 41 */                if (!n80Var2.f17890j) {
/* 43 */                    EnumC2516yz enumC2516yz = this.f13138d;
/* 45 */                    EnumC2516yz enumC2516yz2 = EnumC2516yz.f19867c;
/* 47 */                    if (enumC2516yz == enumC2516yz2) {
/* 49 */                        int i5 = this.f13135a;
/* 51 */                        if (i5 == 0) {
/* 174 */                           n80Var2.mo6945d(m6398g(i4, i));
                                } else if (i5 == 1) {
/* 166 */                           n80Var2.mo6945d(Math.min(m6398g(n80Var2.f14161m, i), i4));
                                } else if (i5 == 2) {
/* 116 */                           C2569zz c2569zz = this.f13136b;
/* 118 */                           C2569zz c2569zz2 = c2569zz.f20416V;
/* 120 */                           if (c2569zz2 != null) {
/* 129 */                               n80 n80Var3 = (i == 0 ? c2569zz2.f20427d : c2569zz2.f20429e).f13139e;
/* 133 */                               if (n80Var3.f17890j) {
/* 152 */                                   n80Var2.mo6945d(m6398g((int) ((n80Var3.f17887g * (i == 0 ? c2569zz.f20463w : c2569zz.f20466z)) + 0.5f), i));
                                        }
                                    }
                                } else if (i5 == 3) {
/* 64 */                            C2569zz c2569zz3 = this.f13136b;
/* 66 */                            l73 l73Var = c2569zz3.f20427d;
/* 70 */                            if (l73Var.f13138d == enumC2516yz2 && l73Var.f13135a == 3) {
/* 76 */                                k23 k23Var = c2569zz3.f20429e;
/* 80 */                                if (k23Var.f13138d != enumC2516yz2 || k23Var.f13135a != 3) {
/* 87 */                                    if (i == 0) {
/* 89 */                                        l73Var = c2569zz3.f20429e;
                                            }
/* 91 */                                    n80Var = l73Var.f13139e;
/* 95 */                                    if (n80Var.f17890j) {
/* 97 */                                        f = c2569zz3.f20419Y;
/* 99 */                                        i2 = n80Var.f17887g;
/* 101 */                                       if (i == 1) {
/* 106 */                                           i3 = (int) ((i2 / f) + 0.5f);
                                                } else {
/* 111 */                                           i3 = (int) ((f * i2) + 0.5f);
                                                }
/* 112 */                                       n80Var2.mo6945d(i3);
                                            }
                                        }
                                    } else {
/* 87 */                                if (i == 0) {
/* 89 */                                    l73Var = c2569zz3.f20429e;
                                        }
/* 91 */                                n80Var = l73Var.f13139e;
/* 95 */                                if (n80Var.f17890j) {
/* 97 */                                    f = c2569zz3.f20419Y;
/* 99 */                                    i2 = n80Var.f17887g;
/* 101 */                                   if (i == 1) {
/* 106 */                                       i3 = (int) ((i2 / f) + 0.5f);
                                            } else {
/* 111 */                                       i3 = (int) ((f * i2) + 0.5f);
                                            }
/* 112 */                                   n80Var2.mo6945d(i3);
                                        }
                                    }
                                }
                            }
                        }
/* 179 */               if (n80Var2.f17890j) {
/* 182 */                   int i6 = n80Var2.f17887g;
/* 184 */                   v70 v70Var = this.f13143i;
/* 186 */                   v70 v70Var2 = this.f13142h;
/* 188 */                   if (i6 == i4) {
/* 190 */                       v70Var2.mo6945d(iM7247e);
/* 193 */                       v70Var.mo6945d(iM7247e2);
/* 196 */                       return;
                            }
/* 197 */                   C2569zz c2569zz4 = this.f13136b;
/* 204 */                   float f2 = i == 0 ? c2569zz4.f20432f0 : c2569zz4.f20434g0;
/* 206 */                   if (v70VarM6395h == v70VarM6395h2) {
/* 208 */                       iM7247e = v70VarM6395h.f17887g;
/* 210 */                       iM7247e2 = v70VarM6395h2.f17887g;
/* 212 */                       f2 = 0.5f;
                            }
/* 221 */                   v70Var2.mo6945d((int) ((((iM7247e2 - iM7247e) - i6) * f2) + iM7247e + 0.5f));
/* 229 */                   v70Var.mo6945d(v70Var2.f17887g + n80Var2.f17887g);
                        }
                    }
                }
            }
