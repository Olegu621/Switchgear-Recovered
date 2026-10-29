            package p000;

            import java.util.HashMap;
            
            /* JADX INFO: renamed from: vh */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2294vh extends cu0 {

                /* JADX INFO: renamed from: w0 */
                public int f18177w0 = 0;

                /* JADX INFO: renamed from: x0 */
                public boolean f18178x0 = true;

                /* JADX INFO: renamed from: y0 */
                public int f18179y0 = 0;

                /* JADX INFO: renamed from: z0 */
                public boolean f18180z0 = false;

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: B */
                public final boolean mo1422B() {
/* 1 */             return this.f18180z0;
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: C */
                public final boolean mo1423C() {
/* 1 */             return this.f18180z0;
                }

                /* JADX INFO: renamed from: V */
                public final boolean m9269V() {
                    int i;
                    int i2;
                    int i3;
/* 3 */             boolean z = true;
/* 4 */             int i4 = 0;
                    while (true) {
/* 5 */                 i = this.f6907v0;
/* 9 */                 if (i4 >= i) {
                            break;
                        }
/* 13 */                C2569zz c2569zz = this.f6906u0[i4];
/* 17 */                if ((this.f18178x0 || c2569zz.mo1428c()) && ((((i2 = this.f18177w0) == 0 || i2 == 1) && !c2569zz.mo1422B()) || (((i3 = this.f18177w0) == 2 || i3 == 3) && !c2569zz.mo1423C()))) {
/* 38 */                    z = false;
                        }
/* 53 */                i4++;
                    }
/* 56 */            if (!z || i <= 0) {
/* 2 */                 return false;
                    }
/* 60 */            int iMax = 0;
/* 61 */            boolean z2 = false;
/* 64 */            for (int i5 = 0; i5 < this.f6907v0; i5++) {
/* 68 */                C2569zz c2569zz2 = this.f6906u0[i5];
/* 72 */                if (this.f18178x0 || c2569zz2.mo1428c()) {
/* 84 */                    if (!z2) {
/* 86 */                        int i6 = this.f18177w0;
/* 88 */                        if (i6 == 0) {
/* 94 */                            iMax = c2569zz2.mo1430j(2).m7246d();
                                } else if (i6 == 1) {
/* 105 */                           iMax = c2569zz2.mo1430j(4).m7246d();
                                } else if (i6 == 2) {
/* 116 */                           iMax = c2569zz2.mo1430j(3).m7246d();
                                } else if (i6 == 3) {
/* 127 */                           iMax = c2569zz2.mo1430j(5).m7246d();
                                }
/* 131 */                       z2 = true;
                            }
/* 132 */                   int i7 = this.f18177w0;
/* 134 */                   if (i7 == 0) {
/* 144 */                       iMax = Math.min(iMax, c2569zz2.mo1430j(2).m7246d());
                            } else if (i7 == 1) {
/* 159 */                       iMax = Math.max(iMax, c2569zz2.mo1430j(4).m7246d());
                            } else if (i7 == 2) {
/* 174 */                       iMax = Math.min(iMax, c2569zz2.mo1430j(3).m7246d());
                            } else if (i7 == 3) {
/* 189 */                       iMax = Math.max(iMax, c2569zz2.mo1430j(5).m7246d());
                            }
                        }
                    }
/* 199 */           int i8 = iMax + this.f18179y0;
/* 200 */           int i9 = this.f18177w0;
/* 202 */           if (i9 == 0 || i9 == 1) {
/* 211 */               m10459K(i8, i8);
                    } else {
/* 207 */               m10460L(i8, i8);
                    }
/* 214 */           this.f18180z0 = true;
/* 1 */             return true;
                }

                /* JADX INFO: renamed from: W */
                public final int m9270W() {
/* 1 */             int i = this.f18177w0;
/* 3 */             if (i == 0 || i == 1) {
/* 17 */                return 0;
                    }
                    return (i == 2 || i == 3) ? 1 : -1;
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: b */
                public final void mo1427b(t71 t71Var, boolean z) {
                    boolean z2;
                    int i;
/* 5 */             C2051oz[] c2051ozArr = this.f20412R;
/* 8 */             C2051oz c2051oz = this.f20404J;
/* 10 */            c2051ozArr[0] = c2051oz;
/* 12 */            int i2 = 2;
/* 13 */            C2051oz c2051oz2 = this.f20405K;
/* 15 */            c2051ozArr[2] = c2051oz2;
/* 18 */            C2051oz c2051oz3 = this.f20406L;
/* 20 */            c2051ozArr[1] = c2051oz3;
/* 23 */            C2051oz c2051oz4 = this.f20407M;
/* 25 */            c2051ozArr[3] = c2051oz4;
/* 29 */            for (C2051oz c2051oz5 : c2051ozArr) {
/* 37 */                c2051oz5.f14932i = t71Var.m8716k(c2051oz5);
                    }
/* 42 */            int i3 = this.f18177w0;
/* 44 */            if (i3 < 0 || i3 >= 4) {
/* 491 */               return;
                    }
/* 49 */            C2051oz c2051oz6 = c2051ozArr[i3];
/* 53 */            if (!this.f18180z0) {
/* 55 */                m9269V();
                    }
/* 60 */            if (this.f18180z0) {
/* 62 */                this.f18180z0 = false;
/* 64 */                int i4 = this.f18177w0;
/* 66 */                if (i4 == 0 || i4 == 1) {
/* 94 */                    t71Var.m8709d(c2051oz.f14932i, this.f20422a0);
/* 101 */                   t71Var.m8709d(c2051oz3.f14932i, this.f20422a0);
/* 104 */                   return;
                        } else {
/* 71 */                    if (i4 == 2 || i4 == 3) {
/* 79 */                        t71Var.m8709d(c2051oz2.f14932i, this.f20424b0);
/* 86 */                        t71Var.m8709d(c2051oz4.f14932i, this.f20424b0);
/* 89 */                        return;
                            }
/* 491 */                   return;
                        }
                    }
/* 105 */           int i5 = 0;
                    while (true) {
/* 108 */               if (i5 >= this.f6907v0) {
/* 180 */                   z2 = false;
                            break;
                        }
/* 112 */               C2569zz c2569zz = this.f6906u0[i5];
/* 116 */               if (this.f18178x0 || c2569zz.mo1428c()) {
/* 125 */                   int i6 = this.f18177w0;
/* 127 */                   EnumC2516yz enumC2516yz = EnumC2516yz.f19867c;
/* 129 */                   if (((i6 == 0 || i6 == 1) && c2569zz.f20415U[0] == enumC2516yz && c2569zz.f20404J.f14929f != null && c2569zz.f20406L.f14929f != null) || ((i6 == 2 || i6 == 3) && c2569zz.f20415U[1] == enumC2516yz && c2569zz.f20405K.f14929f != null && c2569zz.f20407M.f14929f != null)) {
/* 151 */                       z2 = true;
                                break;
                            }
                        }
/* 176 */               i5++;
                    }
/* 196 */           boolean z3 = c2051oz.m7249g() || c2051oz3.m7249g();
/* 212 */           boolean z4 = c2051oz2.m7249g() || c2051oz4.m7249g();
/* 240 */           int i7 = !(!z2 && (((i = this.f18177w0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
/* 241 */           int i8 = 0;
/* 244 */           while (i8 < this.f6907v0) {
/* 248 */               C2569zz c2569zz2 = this.f6906u0[i8];
/* 252 */               if (this.f18178x0 || c2569zz2.mo1428c()) {
/* 267 */                   qf2 qf2VarM8716k = t71Var.m8716k(c2569zz2.f20412R[this.f18177w0]);
/* 271 */                   C2051oz[] c2051ozArr2 = c2569zz2.f20412R;
/* 273 */                   int i9 = this.f18177w0;
/* 275 */                   C2051oz c2051oz7 = c2051ozArr2[i9];
/* 277 */                   c2051oz7.f14932i = qf2VarM8716k;
/* 279 */                   C2051oz c2051oz8 = c2051oz7.f14929f;
/* 290 */                   int i10 = (c2051oz8 == null || c2051oz8.f14927d != this) ? 0 : c2051oz7.f14930g;
/* 291 */                   if (i9 == 0 || i9 == i2) {
/* 318 */                       qf2 qf2Var = c2051oz6.f14932i;
/* 322 */                       int i11 = this.f18179y0 - i10;
/* 323 */                       C1789jd c1789jdM8717l = t71Var.m8717l();
/* 327 */                       qf2 qf2VarM8718m = t71Var.m8718m();
/* 331 */                       qf2VarM8718m.f15517d = 0;
/* 333 */                       c1789jdM8717l.m5789c(qf2Var, qf2VarM8716k, qf2VarM8718m, i11);
/* 336 */                       t71Var.m8708c(c1789jdM8717l);
                            } else {
/* 296 */                       qf2 qf2Var2 = c2051oz6.f14932i;
/* 300 */                       int i12 = this.f18179y0 + i10;
/* 301 */                       C1789jd c1789jdM8717l2 = t71Var.m8717l();
/* 305 */                       qf2 qf2VarM8718m2 = t71Var.m8718m();
/* 309 */                       qf2VarM8718m2.f15517d = 0;
/* 311 */                       c1789jdM8717l2.m5788b(qf2Var2, qf2VarM8716k, qf2VarM8718m2, i12);
/* 314 */                       t71Var.m8708c(c1789jdM8717l2);
                            }
/* 344 */                   t71Var.m8710e(c2051oz6.f14932i, qf2VarM8716k, this.f18179y0 + i10, i7);
                        }
/* 347 */               i8++;
/* 349 */               i2 = 2;
                    }
/* 353 */           int i13 = this.f18177w0;
/* 357 */           if (i13 == 0) {
/* 363 */               t71Var.m8710e(c2051oz3.f14932i, c2051oz.f14932i, 0, 8);
/* 375 */               t71Var.m8710e(c2051oz.f14932i, this.f20416V.f20406L.f14932i, 0, 4);
/* 386 */               t71Var.m8710e(c2051oz.f14932i, this.f20416V.f20404J.f14932i, 0, 0);
/* 389 */               return;
                    }
/* 391 */           if (i13 == 1) {
/* 397 */               t71Var.m8710e(c2051oz.f14932i, c2051oz3.f14932i, 0, 8);
/* 409 */               t71Var.m8710e(c2051oz.f14932i, this.f20416V.f20404J.f14932i, 0, 4);
/* 420 */               t71Var.m8710e(c2051oz.f14932i, this.f20416V.f20406L.f14932i, 0, 0);
                    } else if (i13 == 2) {
/* 431 */               t71Var.m8710e(c2051oz4.f14932i, c2051oz2.f14932i, 0, 8);
/* 443 */               t71Var.m8710e(c2051oz2.f14932i, this.f20416V.f20407M.f14932i, 0, 4);
/* 454 */               t71Var.m8710e(c2051oz2.f14932i, this.f20416V.f20405K.f14932i, 0, 0);
                    } else if (i13 == 3) {
/* 465 */               t71Var.m8710e(c2051oz2.f14932i, c2051oz4.f14932i, 0, 8);
/* 477 */               t71Var.m8710e(c2051oz2.f14932i, this.f20416V.f20405K.f14932i, 0, 4);
/* 488 */               t71Var.m8710e(c2051oz2.f14932i, this.f20416V.f20407M.f14932i, 0, 0);
                    }
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: c */
                public final boolean mo1428c() {
/* 1 */             return true;
                }

                @Override // p000.cu0, p000.C2569zz
                /* JADX INFO: renamed from: g */
                public final void mo1429g(C2569zz c2569zz, HashMap map) {
/* 1 */             super.mo1429g(c2569zz, map);
/* 4 */             C2294vh c2294vh = (C2294vh) c2569zz;
/* 8 */             this.f18177w0 = c2294vh.f18177w0;
/* 12 */            this.f18178x0 = c2294vh.f18178x0;
/* 16 */            this.f18179y0 = c2294vh.f18179y0;
                }

                @Override // p000.C2569zz
                public final String toString() {
/* 12 */            String strM3789o = fm0.m3789o(new StringBuilder("[Barrier] "), this.f20442k0, " {");
/* 19 */            for (int i = 0; i < this.f6907v0; i++) {
/* 23 */                C2569zz c2569zz = this.f6906u0[i];
/* 25 */                if (i > 0) {
/* 29 */                    strM3789o = strM3789o.concat(", ");
                        }
/* 33 */                StringBuilder sbM3512p = AbstractC0886en.m3512p(strM3789o);
/* 39 */                sbM3512p.append(c2569zz.f20442k0);
/* 42 */                strM3789o = sbM3512p.toString();
                    }
/* 51 */            return strM3789o.concat("}");
                }
            }
