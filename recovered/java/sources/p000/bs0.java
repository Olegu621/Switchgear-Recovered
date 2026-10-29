            package p000;

            import java.util.ArrayList;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bs0 extends C2569zz {

                /* JADX INFO: renamed from: u0 */
                public float f2586u0 = -1.0f;

                /* JADX INFO: renamed from: v0 */
                public int f2587v0 = -1;

                /* JADX INFO: renamed from: w0 */
                public int f2588w0 = -1;

                /* JADX INFO: renamed from: x0 */
                public C2051oz f2589x0 = this.f20405K;

                /* JADX INFO: renamed from: y0 */
                public int f2590y0 = 0;

                /* JADX INFO: renamed from: z0 */
                public boolean f2591z0;

                public bs0() {
/* 22 */            this.f20413S.clear();
/* 29 */            this.f20413S.add(this.f2589x0);
/* 34 */            int length = this.f20412R.length;
/* 35 */            for (int i = 0; i < length; i++) {
/* 41 */                this.f20412R[i] = this.f2589x0;
                    }
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: B */
                public final boolean mo1422B() {
/* 1 */             return this.f2591z0;
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: C */
                public final boolean mo1423C() {
/* 1 */             return this.f2591z0;
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: R */
                public final void mo1424R(t71 t71Var, boolean z) {
/* 3 */             if (this.f20416V == null) {
/* 5 */                 return;
                    }
/* 6 */             C2051oz c2051oz = this.f2589x0;
/* 8 */             t71Var.getClass();
/* 11 */            int iM8705n = t71.m8705n(c2051oz);
/* 19 */            if (this.f2590y0 == 1) {
/* 21 */                this.f20422a0 = iM8705n;
/* 23 */                this.f20424b0 = 0;
/* 31 */                m10461M(this.f20416V.m10472l());
/* 34 */                m10464P(0);
/* 37 */                return;
                    }
/* 38 */            this.f20422a0 = 0;
/* 40 */            this.f20424b0 = iM8705n;
/* 48 */            m10464P(this.f20416V.m10475r());
/* 51 */            m10461M(0);
                }

                /* JADX INFO: renamed from: S */
                public final void m1425S(int i) {
/* 3 */             this.f2589x0.m7254l(i);
/* 7 */             this.f2591z0 = true;
                }

                /* JADX INFO: renamed from: T */
                public final void m1426T(int i) {
/* 3 */             if (this.f2590y0 == i) {
/* 45 */                return;
                    }
/* 6 */             this.f2590y0 = i;
/* 8 */             ArrayList arrayList = this.f20413S;
/* 10 */            arrayList.clear();
/* 16 */            if (this.f2590y0 == 1) {
/* 20 */                this.f2589x0 = this.f20404J;
                    } else {
/* 25 */                this.f2589x0 = this.f20405K;
                    }
/* 29 */            arrayList.add(this.f2589x0);
/* 32 */            C2051oz[] c2051ozArr = this.f20412R;
/* 34 */            int length = c2051ozArr.length;
/* 36 */            for (int i2 = 0; i2 < length; i2++) {
/* 40 */                c2051ozArr[i2] = this.f2589x0;
                    }
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: b */
                public final void mo1427b(t71 t71Var, boolean z) {
/* 3 */             a00 a00Var = (a00) this.f20416V;
/* 5 */             if (a00Var == null) {
/* 225 */               return;
                    }
/* 10 */            Object objMo1430j = a00Var.mo1430j(2);
/* 15 */            Object objMo1430j2 = a00Var.mo1430j(4);
/* 19 */            C2569zz c2569zz = this.f20416V;
/* 21 */            EnumC2516yz enumC2516yz = EnumC2516yz.f19866b;
/* 35 */            boolean z2 = c2569zz != null && c2569zz.f20415U[0] == enumC2516yz;
/* 39 */            if (this.f2590y0 == 0) {
/* 42 */                objMo1430j = a00Var.mo1430j(3);
/* 46 */                objMo1430j2 = a00Var.mo1430j(5);
/* 50 */                C2569zz c2569zz2 = this.f20416V;
/* 52 */                z2 = c2569zz2 != null && c2569zz2.f20415U[1] == enumC2516yz;
                    }
/* 66 */            if (this.f2591z0) {
/* 68 */                C2051oz c2051oz = this.f2589x0;
/* 72 */                if (c2051oz.f14926c) {
/* 74 */                    qf2 qf2VarM8716k = t71Var.m8716k(c2051oz);
/* 84 */                    t71Var.m8709d(qf2VarM8716k, this.f2589x0.m7246d());
/* 89 */                    if (this.f2587v0 != -1) {
/* 91 */                        if (z2) {
/* 97 */                            t71Var.m8711f(t71Var.m8716k(objMo1430j2), qf2VarM8716k, 0, 5);
                                }
                            } else if (this.f2588w0 != -1 && z2) {
/* 107 */                       qf2 qf2VarM8716k2 = t71Var.m8716k(objMo1430j2);
/* 115 */                       t71Var.m8711f(qf2VarM8716k, t71Var.m8716k(objMo1430j), 0, 5);
/* 118 */                       t71Var.m8711f(qf2VarM8716k2, qf2VarM8716k, 0, 5);
                            }
/* 121 */                   this.f2591z0 = false;
/* 123 */                   return;
                        }
                    }
/* 128 */           if (this.f2587v0 != -1) {
/* 132 */               qf2 qf2VarM8716k3 = t71Var.m8716k(this.f2589x0);
/* 142 */               t71Var.m8710e(qf2VarM8716k3, t71Var.m8716k(objMo1430j), this.f2587v0, 8);
/* 145 */               if (z2) {
/* 151 */                   t71Var.m8711f(t71Var.m8716k(objMo1430j2), qf2VarM8716k3, 0, 5);
/* 154 */                   return;
                        }
/* 225 */               return;
                    }
/* 157 */           if (this.f2588w0 != -1) {
/* 161 */               qf2 qf2VarM8716k4 = t71Var.m8716k(this.f2589x0);
/* 165 */               qf2 qf2VarM8716k5 = t71Var.m8716k(objMo1430j2);
/* 172 */               t71Var.m8710e(qf2VarM8716k4, qf2VarM8716k5, -this.f2588w0, 8);
/* 175 */               if (z2) {
/* 181 */                   t71Var.m8711f(qf2VarM8716k4, t71Var.m8716k(objMo1430j), 0, 5);
/* 184 */                   t71Var.m8711f(qf2VarM8716k5, qf2VarM8716k4, 0, 5);
/* 187 */                   return;
                        }
/* 225 */               return;
                    }
/* 194 */           if (this.f2586u0 != -1.0f) {
/* 198 */               qf2 qf2VarM8716k6 = t71Var.m8716k(this.f2589x0);
/* 202 */               qf2 qf2VarM8716k7 = t71Var.m8716k(objMo1430j2);
/* 206 */               float f = this.f2586u0;
/* 208 */               C1789jd c1789jdM8717l = t71Var.m8717l();
/* 214 */               c1789jdM8717l.f12225d.m3722g(qf2VarM8716k6, -1.0f);
/* 219 */               c1789jdM8717l.f12225d.m3722g(qf2VarM8716k7, f);
/* 222 */               t71Var.m8708c(c1789jdM8717l);
                    }
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: c */
                public final boolean mo1428c() {
/* 1 */             return true;
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: g */
                public final void mo1429g(C2569zz c2569zz, HashMap map) {
/* 1 */             super.mo1429g(c2569zz, map);
/* 4 */             bs0 bs0Var = (bs0) c2569zz;
/* 8 */             this.f2586u0 = bs0Var.f2586u0;
/* 12 */            this.f2587v0 = bs0Var.f2587v0;
/* 16 */            this.f2588w0 = bs0Var.f2588w0;
/* 20 */            m1426T(bs0Var.f2590y0);
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: j */
                public final C2051oz mo1430j(int i) {
/* 1 */             int iM3520y = AbstractC0886en.m3520y(i);
/* 6 */             if (iM3520y != 1) {
/* 9 */                 if (iM3520y != 2) {
/* 12 */                    if (iM3520y != 3) {
/* 15 */                        if (iM3520y != 4) {
/* 32 */                            return null;
                                }
                            }
                        }
/* 20 */                if (this.f2590y0 == 0) {
/* 22 */                    return this.f2589x0;
                        }
/* 32 */                return null;
                    }
/* 27 */            if (this.f2590y0 == 1) {
/* 29 */                return this.f2589x0;
                    }
/* 32 */            return null;
                }
            }
