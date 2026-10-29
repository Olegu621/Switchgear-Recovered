            package p000;

            import androidx.constraintlayout.widget.C0075b;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.Iterator;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a00 extends C2569zz {

                /* JADX INFO: renamed from: A0 */
                public final t71 f1A0;

                /* JADX INFO: renamed from: B0 */
                public int f2B0;

                /* JADX INFO: renamed from: C0 */
                public int f3C0;

                /* JADX INFO: renamed from: D0 */
                public int f4D0;

                /* JADX INFO: renamed from: E0 */
                public int f5E0;

                /* JADX INFO: renamed from: F0 */
                public C1804js[] f6F0;

                /* JADX INFO: renamed from: G0 */
                public C1804js[] f7G0;

                /* JADX INFO: renamed from: H0 */
                public int f8H0;

                /* JADX INFO: renamed from: I0 */
                public boolean f9I0;

                /* JADX INFO: renamed from: J0 */
                public boolean f10J0;

                /* JADX INFO: renamed from: K0 */
                public WeakReference f11K0;

                /* JADX INFO: renamed from: L0 */
                public WeakReference f12L0;

                /* JADX INFO: renamed from: M0 */
                public WeakReference f13M0;

                /* JADX INFO: renamed from: N0 */
                public WeakReference f14N0;

                /* JADX INFO: renamed from: O0 */
                public final HashSet f15O0;

                /* JADX INFO: renamed from: P0 */
                public final C2332wi f16P0;

                /* JADX INFO: renamed from: u0 */
                public ArrayList f17u0 = new ArrayList();

                /* JADX INFO: renamed from: v0 */
                public final C0875ec f18v0 = new C0875ec(this);

                /* JADX INFO: renamed from: w0 */
                public final u70 f19w0;

                /* JADX INFO: renamed from: x0 */
                public int f20x0;

                /* JADX INFO: renamed from: y0 */
                public InterfaceC2462xi f21y0;

                /* JADX INFO: renamed from: z0 */
                public boolean f22z0;

                public a00() {
/* 20 */            u70 u70Var = new u70();
/* 24 */            u70Var.f17386b = true;
/* 26 */            u70Var.f17387c = true;
/* 33 */            u70Var.f17389e = new ArrayList();
/* 37 */            new ArrayList();
/* 41 */            u70Var.f17390f = null;
/* 48 */            u70Var.f17391g = new C2332wi();
/* 55 */            u70Var.f17392h = new ArrayList();
/* 57 */            u70Var.f17385a = this;
/* 59 */            u70Var.f17388d = this;
/* 61 */            this.f19w0 = u70Var;
/* 63 */            this.f21y0 = null;
/* 66 */            this.f22z0 = false;
/* 73 */            this.f1A0 = new t71();
/* 75 */            this.f4D0 = 0;
/* 77 */            this.f5E0 = 0;
/* 82 */            this.f6F0 = new C1804js[4];
/* 86 */            this.f7G0 = new C1804js[4];
/* 90 */            this.f8H0 = 257;
/* 92 */            this.f9I0 = false;
/* 94 */            this.f10J0 = false;
/* 96 */            this.f11K0 = null;
/* 98 */            this.f12L0 = null;
/* 100 */           this.f13M0 = null;
/* 102 */           this.f14N0 = null;
/* 109 */           this.f15O0 = new HashSet();
/* 116 */           this.f16P0 = new C2332wi();
                }

                /* JADX INFO: renamed from: W */
                public static void m2W(C2569zz c2569zz, InterfaceC2462xi interfaceC2462xi, C2332wi c2332wi) {
                    int i;
                    int i2;
/* 1 */             if (interfaceC2462xi == null) {
/* 3 */                 return;
                    }
/* 4 */             int i3 = c2569zz.f20438i0;
/* 6 */             int[] iArr = c2569zz.f20459t;
/* 11 */            if (i3 == 8 || (c2569zz instanceof bs0) || (c2569zz instanceof C2294vh)) {
/* 274 */               c2332wi.f18641e = 0;
/* 276 */               c2332wi.f18642f = 0;
/* 278 */               return;
                    }
/* 23 */            EnumC2516yz[] enumC2516yzArr = c2569zz.f20415U;
/* 27 */            c2332wi.f18637a = enumC2516yzArr[0];
/* 32 */            c2332wi.f18638b = enumC2516yzArr[1];
/* 38 */            c2332wi.f18639c = c2569zz.m10475r();
/* 44 */            c2332wi.f18640d = c2569zz.m10472l();
/* 46 */            c2332wi.f18645i = false;
/* 48 */            c2332wi.f18646j = 0;
/* 50 */            EnumC2516yz enumC2516yz = c2332wi.f18637a;
/* 52 */            EnumC2516yz enumC2516yz2 = EnumC2516yz.f19867c;
/* 58 */            boolean z = enumC2516yz == enumC2516yz2;
/* 65 */            boolean z2 = c2332wi.f18638b == enumC2516yz2;
/* 77 */            boolean z3 = z && c2569zz.f20419Y > 0.0f;
/* 88 */            boolean z4 = z2 && c2569zz.f20419Y > 0.0f;
/* 89 */            EnumC2516yz enumC2516yz3 = EnumC2516yz.f19866b;
/* 91 */            EnumC2516yz enumC2516yz4 = EnumC2516yz.f19865a;
/* 93 */            if (z && c2569zz.m10478u(0) && c2569zz.f20455r == 0 && !z3) {
/* 107 */               c2332wi.f18637a = enumC2516yz3;
/* 109 */               if (z2 && c2569zz.f20457s == 0) {
/* 115 */                   c2332wi.f18637a = enumC2516yz4;
                        }
/* 117 */               z = false;
                    }
/* 118 */           if (z2 && c2569zz.m10478u(1) && c2569zz.f20457s == 0 && !z4) {
/* 132 */               c2332wi.f18638b = enumC2516yz3;
/* 134 */               if (z && c2569zz.f20455r == 0) {
/* 140 */                   c2332wi.f18638b = enumC2516yz4;
                        }
/* 142 */               z2 = false;
                    }
/* 147 */           if (c2569zz.mo1422B()) {
/* 149 */               c2332wi.f18637a = enumC2516yz4;
/* 151 */               z = false;
                    }
/* 156 */           if (c2569zz.mo1423C()) {
/* 158 */               c2332wi.f18638b = enumC2516yz4;
/* 160 */               z2 = false;
                    }
/* 162 */           if (z3) {
/* 166 */               if (iArr[0] == 4) {
/* 168 */                   c2332wi.f18637a = enumC2516yz4;
                        } else if (!z2) {
/* 175 */                   if (c2332wi.f18638b == enumC2516yz4) {
/* 177 */                       i2 = c2332wi.f18640d;
                            } else {
/* 180 */                       c2332wi.f18637a = enumC2516yz3;
/* 185 */                       ((C0075b) interfaceC2462xi).m524b(c2569zz, c2332wi);
/* 188 */                       i2 = c2332wi.f18642f;
                            }
/* 190 */                   c2332wi.f18637a = enumC2516yz4;
/* 197 */                   c2332wi.f18639c = (int) (c2569zz.f20419Y * i2);
                        }
                    }
/* 199 */           if (z4) {
/* 203 */               if (iArr[1] == 4) {
/* 205 */                   c2332wi.f18638b = enumC2516yz4;
                        } else if (!z) {
/* 212 */                   if (c2332wi.f18637a == enumC2516yz4) {
/* 214 */                       i = c2332wi.f18639c;
                            } else {
/* 217 */                       c2332wi.f18638b = enumC2516yz3;
/* 222 */                       ((C0075b) interfaceC2462xi).m524b(c2569zz, c2332wi);
/* 225 */                       i = c2332wi.f18641e;
                            }
/* 227 */                   c2332wi.f18638b = enumC2516yz4;
/* 229 */                   int i4 = c2569zz.f20420Z;
/* 231 */                   float f = c2569zz.f20419Y;
/* 234 */                   if (i4 == -1) {
/* 239 */                       c2332wi.f18640d = (int) (i / f);
                            } else {
/* 245 */                       c2332wi.f18640d = (int) (f * i);
                            }
                        }
                    }
/* 249 */           ((C0075b) interfaceC2462xi).m524b(c2569zz, c2332wi);
/* 254 */           c2569zz.m10464P(c2332wi.f18641e);
/* 259 */           c2569zz.m10461M(c2332wi.f18642f);
/* 264 */           c2569zz.f20399E = c2332wi.f18644h;
/* 268 */           c2569zz.m10458J(c2332wi.f18643g);
/* 271 */           c2332wi.f18646j = 0;
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: D */
                public final void mo3D() {
/* 3 */             this.f1A0.m8724t();
/* 7 */             this.f2B0 = 0;
/* 9 */             this.f3C0 = 0;
/* 13 */            this.f17u0.clear();
/* 16 */            super.mo3D();
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: G */
                public final void mo4G(C0875ec c0875ec) {
/* 1 */             super.mo4G(c0875ec);
/* 6 */             int size = this.f17u0.size();
/* 11 */            for (int i = 0; i < size; i++) {
/* 21 */                ((C2569zz) this.f17u0.get(i)).mo4G(c0875ec);
                    }
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: Q */
                public final void mo5Q(boolean z, boolean z2) {
/* 1 */             super.mo5Q(z, z2);
/* 6 */             int size = this.f17u0.size();
/* 11 */            for (int i = 0; i < size; i++) {
/* 21 */                ((C2569zz) this.f17u0.get(i)).mo5Q(z, z2);
                    }
                }

                /* JADX INFO: renamed from: S */
                public final void m6S(C2569zz c2569zz, int i) {
/* 2 */             if (i == 0) {
/* 6 */                 int i2 = this.f4D0 + 1;
/* 7 */                 C1804js[] c1804jsArr = this.f7G0;
/* 10 */                if (i2 >= c1804jsArr.length) {
/* 21 */                    this.f7G0 = (C1804js[]) Arrays.copyOf(c1804jsArr, c1804jsArr.length * 2);
                        }
/* 23 */                C1804js[] c1804jsArr2 = this.f7G0;
/* 25 */                int i3 = this.f4D0;
/* 35 */                c1804jsArr2[i3] = new C1804js(c2569zz, 0, this.f22z0);
/* 38 */                this.f4D0 = i3 + 1;
/* 40 */                return;
                    }
/* 41 */            if (i == 1) {
/* 45 */                int i4 = this.f5E0 + 1;
/* 46 */                C1804js[] c1804jsArr3 = this.f6F0;
/* 49 */                if (i4 >= c1804jsArr3.length) {
/* 60 */                    this.f6F0 = (C1804js[]) Arrays.copyOf(c1804jsArr3, c1804jsArr3.length * 2);
                        }
/* 62 */                C1804js[] c1804jsArr4 = this.f6F0;
/* 64 */                int i5 = this.f5E0;
/* 73 */                c1804jsArr4[i5] = new C1804js(c2569zz, 1, this.f22z0);
/* 76 */                this.f5E0 = i5 + 1;
                    }
                }

                /* JADX INFO: renamed from: T */
                public final void m7T(t71 t71Var) {
                    a00 a00Var;
                    t71 t71Var2;
/* 3 */             boolean zM10X = m10X(64);
/* 7 */             mo1427b(t71Var, zM10X);
/* 12 */            int size = this.f17u0.size();
/* 18 */            boolean z = false;
/* 20 */            for (int i = 0; i < size; i++) {
/* 28 */                C2569zz c2569zz = (C2569zz) this.f17u0.get(i);
/* 30 */                boolean[] zArr = c2569zz.f20414T;
/* 32 */                zArr[0] = false;
/* 34 */                zArr[1] = false;
/* 38 */                if (c2569zz instanceof C2294vh) {
/* 40 */                    z = true;
                        }
                    }
/* 44 */            if (z) {
/* 47 */                for (int i2 = 0; i2 < size; i2++) {
/* 55 */                    C2569zz c2569zz2 = (C2569zz) this.f17u0.get(i2);
/* 59 */                    if (c2569zz2 instanceof C2294vh) {
/* 61 */                        C2294vh c2294vh = (C2294vh) c2569zz2;
/* 66 */                        for (int i3 = 0; i3 < c2294vh.f6907v0; i3++) {
/* 70 */                            C2569zz c2569zz3 = c2294vh.f6906u0[i3];
/* 74 */                            if (c2294vh.f18178x0 || c2569zz3.mo1428c()) {
/* 83 */                                int i4 = c2294vh.f18177w0;
/* 85 */                                if (i4 == 0 || i4 == 1) {
/* 103 */                                   c2569zz3.f20414T[0] = true;
                                        } else if (i4 == 2 || i4 == 3) {
/* 98 */                                    c2569zz3.f20414T[1] = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 111 */           HashSet hashSet = this.f15O0;
/* 113 */           hashSet.clear();
/* 117 */           for (int i5 = 0; i5 < size; i5++) {
/* 125 */               C2569zz c2569zz4 = (C2569zz) this.f17u0.get(i5);
/* 127 */               c2569zz4.getClass();
/* 130 */               boolean z2 = c2569zz4 instanceof y53;
/* 132 */               if (z2 || (c2569zz4 instanceof bs0)) {
/* 138 */                   if (z2) {
/* 140 */                       hashSet.add(c2569zz4);
                            } else {
/* 144 */                       c2569zz4.mo1427b(t71Var, zM10X);
                            }
                        }
                    }
/* 154 */           while (hashSet.size() > 0) {
/* 156 */               int size2 = hashSet.size();
/* 160 */               Iterator it = hashSet.iterator();
/* 168 */               while (it.hasNext()) {
/* 176 */                   y53 y53Var = (y53) ((C2569zz) it.next());
/* 181 */                   for (int i6 = 0; i6 < y53Var.f6907v0; i6++) {
/* 191 */                       if (hashSet.contains(y53Var.f6906u0[i6])) {
/* 193 */                           y53Var.mo1427b(t71Var, zM10X);
/* 196 */                           hashSet.remove(y53Var);
                                    break;
                                }
                            }
                        }
/* 207 */               if (size2 == hashSet.size()) {
/* 209 */                   Iterator it2 = hashSet.iterator();
/* 217 */                   while (it2.hasNext()) {
/* 225 */                       ((C2569zz) it2.next()).mo1427b(t71Var, zM10X);
                            }
/* 229 */                   hashSet.clear();
                        }
                    }
/* 233 */           boolean z3 = t71.f16931p;
/* 235 */           EnumC2516yz enumC2516yz = EnumC2516yz.f19866b;
/* 237 */           if (z3) {
/* 241 */               HashSet<C2569zz> hashSet2 = new HashSet();
/* 245 */               for (int i7 = 0; i7 < size; i7++) {
/* 253 */                   C2569zz c2569zz5 = (C2569zz) this.f17u0.get(i7);
/* 255 */                   c2569zz5.getClass();
/* 260 */                   if (!(c2569zz5 instanceof y53) && !(c2569zz5 instanceof bs0)) {
/* 267 */                       hashSet2.add(c2569zz5);
                            }
                        }
/* 284 */               a00Var = this;
/* 285 */               t71Var2 = t71Var;
/* 286 */               a00Var.m10465a(this, t71Var2, hashSet2, this.f20415U[0] == enumC2516yz ? 0 : 1, false);
/* 297 */               for (C2569zz c2569zz6 : hashSet2) {
/* 305 */                   kb1.m6056i(a00Var, t71Var2, c2569zz6);
/* 308 */                   c2569zz6.mo1427b(t71Var2, zM10X);
                        }
                    } else {
/* 312 */               a00Var = this;
/* 313 */               t71Var2 = t71Var;
/* 315 */               for (int i8 = 0; i8 < size; i8++) {
/* 323 */                   C2569zz c2569zz7 = (C2569zz) a00Var.f17u0.get(i8);
/* 327 */                   if (c2569zz7 instanceof a00) {
/* 329 */                       EnumC2516yz[] enumC2516yzArr = c2569zz7.f20415U;
/* 331 */                       EnumC2516yz enumC2516yz2 = enumC2516yzArr[0];
/* 333 */                       EnumC2516yz enumC2516yz3 = enumC2516yzArr[1];
/* 335 */                       EnumC2516yz enumC2516yz4 = EnumC2516yz.f19865a;
/* 337 */                       if (enumC2516yz2 == enumC2516yz) {
/* 339 */                           c2569zz7.m10462N(enumC2516yz4);
                                }
/* 342 */                       if (enumC2516yz3 == enumC2516yz) {
/* 344 */                           c2569zz7.m10463O(enumC2516yz4);
                                }
/* 347 */                       c2569zz7.mo1427b(t71Var2, zM10X);
/* 350 */                       if (enumC2516yz2 == enumC2516yz) {
/* 352 */                           c2569zz7.m10462N(enumC2516yz2);
                                }
/* 355 */                       if (enumC2516yz3 == enumC2516yz) {
/* 357 */                           c2569zz7.m10463O(enumC2516yz3);
                                }
                            } else {
/* 361 */                       kb1.m6056i(a00Var, t71Var2, c2569zz7);
/* 366 */                       if (!(c2569zz7 instanceof y53) && !(c2569zz7 instanceof bs0)) {
/* 373 */                           c2569zz7.mo1427b(t71Var2, zM10X);
                                }
                            }
                        }
                    }
/* 382 */           if (a00Var.f4D0 > 0) {
/* 384 */               b40.m1219c(a00Var, t71Var2, null, 0);
                    }
/* 389 */           if (a00Var.f5E0 > 0) {
/* 391 */               b40.m1219c(a00Var, t71Var2, null, 1);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:33:0x009b  */
                /* JADX INFO: renamed from: U */
                public final boolean m8U(int i, boolean z) {
                    boolean z2;
                    EnumC2516yz enumC2516yz;
/* 1 */             u70 u70Var = this.f19w0;
/* 3 */             ArrayList<l73> arrayList = u70Var.f17389e;
/* 5 */             a00 a00Var = u70Var.f17385a;
/* 7 */             boolean z3 = false;
/* 8 */             EnumC2516yz enumC2516yzM10471k = a00Var.m10471k(0);
/* 13 */            EnumC2516yz enumC2516yzM10471k2 = a00Var.m10471k(1);
/* 17 */            int iM10476s = a00Var.m10476s();
/* 21 */            int iM10477t = a00Var.m10477t();
/* 25 */            EnumC2516yz enumC2516yz2 = EnumC2516yz.f19865a;
/* 27 */            if (z && (enumC2516yzM10471k == (enumC2516yz = EnumC2516yz.f19866b) || enumC2516yzM10471k2 == enumC2516yz)) {
/* 43 */                for (l73 l73Var : arrayList) {
/* 53 */                    if (l73Var.f13140f == i && !l73Var.mo1445k()) {
/* 61 */                        z = false;
                                break;
                            }
                        }
/* 62 */                if (i == 0) {
/* 64 */                    if (z && enumC2516yzM10471k == enumC2516yz) {
/* 68 */                        a00Var.m10462N(enumC2516yz2);
/* 75 */                        a00Var.m10464P(u70Var.m8966d(a00Var, 0));
/* 86 */                        a00Var.f20427d.f13139e.mo6945d(a00Var.m10475r());
                            }
                        } else if (z && enumC2516yzM10471k2 == enumC2516yz) {
/* 94 */                    a00Var.m10463O(enumC2516yz2);
/* 101 */                   a00Var.m10461M(u70Var.m8966d(a00Var, 1));
/* 112 */                   a00Var.f20429e.f13139e.mo6945d(a00Var.m10472l());
                        }
                    }
/* 115 */           EnumC2516yz[] enumC2516yzArr = a00Var.f20415U;
/* 117 */           EnumC2516yz enumC2516yz3 = EnumC2516yz.f19868d;
/* 119 */           if (i == 0) {
/* 121 */               EnumC2516yz enumC2516yz4 = enumC2516yzArr[0];
/* 123 */               if (enumC2516yz4 == enumC2516yz2 || enumC2516yz4 == enumC2516yz3) {
/* 131 */                   int iM10475r = a00Var.m10475r() + iM10476s;
/* 136 */                   a00Var.f20427d.f13143i.mo6945d(iM10475r);
/* 144 */                   a00Var.f20427d.f13139e.mo6945d(iM10475r - iM10476s);
/* 147 */                   z2 = true;
                        } else {
/* 156 */                   z2 = false;
                        }
                    } else {
/* 149 */               EnumC2516yz enumC2516yz5 = enumC2516yzArr[1];
/* 151 */               if (enumC2516yz5 == enumC2516yz2 || enumC2516yz5 == enumC2516yz3) {
/* 162 */                   int iM10472l = a00Var.m10472l() + iM10477t;
/* 167 */                   a00Var.f20429e.f13143i.mo6945d(iM10472l);
/* 175 */                   a00Var.f20429e.f13139e.mo6945d(iM10472l - iM10477t);
/* 147 */                   z2 = true;
                        } else {
/* 156 */                   z2 = false;
                        }
                    }
/* 179 */           u70Var.m8969g();
/* 190 */           for (l73 l73Var2 : arrayList) {
/* 200 */               if (l73Var2.f13140f == i && (l73Var2.f13136b != a00Var || l73Var2.f13141g)) {
/* 212 */                   l73Var2.mo1443e();
                        }
                    }
/* 224 */           for (l73 l73Var3 : arrayList) {
/* 234 */               if (l73Var3.f13140f == i && (z2 || l73Var3.f13136b != a00Var)) {
/* 248 */                   if (!l73Var3.f13142h.f17890j || !l73Var3.f13143i.f17890j || (!(l73Var3 instanceof C1864ks) && !l73Var3.f13139e.f17890j)) {
/* 270 */                       a00Var.m10462N(enumC2516yzM10471k);
/* 273 */                       a00Var.m10463O(enumC2516yzM10471k2);
/* 276 */                       return z3;
                            }
                        }
                    }
/* 269 */           z3 = true;
/* 270 */           a00Var.m10462N(enumC2516yzM10471k);
/* 273 */           a00Var.m10463O(enumC2516yzM10471k2);
/* 276 */           return z3;
                }

                /* JADX WARN: Code duplicated, block: B:358:0x062e  */
                /* JADX WARN: Code duplicated, block: B:373:0x0660  */
                /* JADX WARN: Code duplicated, block: B:398:0x06ae  */
                /* JADX WARN: Code duplicated, block: B:403:0x06bf  */
                /* JADX WARN: Code duplicated, block: B:410:0x06cf  */
                /* JADX WARN: Code duplicated, block: B:413:0x06d9  */
                /* JADX WARN: Code duplicated, block: B:415:0x06e5  */
                /* JADX WARN: Code duplicated, block: B:419:0x06f6  */
                /* JADX WARN: Code duplicated, block: B:424:0x070a A[Catch: Exception -> 0x0718, LOOP:12: B:423:0x0708->B:424:0x070a, LOOP_END, TryCatch #4 {Exception -> 0x0718, blocks: (B:422:0x0700, B:424:0x070a, B:427:0x071f), top: B:557:0x0700 }] */
                /* JADX WARN: Code duplicated, block: B:448:0x075d  */
                /* JADX WARN: Code duplicated, block: B:451:0x0763 A[Catch: Exception -> 0x074b, TryCatch #0 {Exception -> 0x074b, blocks: (B:437:0x0744, B:449:0x075f, B:451:0x0763, B:453:0x0769, B:454:0x0783, B:456:0x0787, B:458:0x078d, B:462:0x07a3, B:465:0x07ae, B:467:0x07b2, B:469:0x07b8), top: B:549:0x0744 }] */
                /* JADX WARN: Code duplicated, block: B:456:0x0787 A[Catch: Exception -> 0x074b, TryCatch #0 {Exception -> 0x074b, blocks: (B:437:0x0744, B:449:0x075f, B:451:0x0763, B:453:0x0769, B:454:0x0783, B:456:0x0787, B:458:0x078d, B:462:0x07a3, B:465:0x07ae, B:467:0x07b2, B:469:0x07b8), top: B:549:0x0744 }] */
                /* JADX WARN: Code duplicated, block: B:467:0x07b2 A[Catch: Exception -> 0x074b, TryCatch #0 {Exception -> 0x074b, blocks: (B:437:0x0744, B:449:0x075f, B:451:0x0763, B:453:0x0769, B:454:0x0783, B:456:0x0787, B:458:0x078d, B:462:0x07a3, B:465:0x07ae, B:467:0x07b2, B:469:0x07b8), top: B:549:0x0744 }] */
                /* JADX WARN: Code duplicated, block: B:481:0x07dd  */
                /* JADX WARN: Code duplicated, block: B:488:0x0805  */
                /* JADX WARN: Code duplicated, block: B:490:0x081e  */
                /* JADX WARN: Code duplicated, block: B:492:0x0832  */
                /* JADX WARN: Code duplicated, block: B:494:0x0836  */
                /* JADX WARN: Code duplicated, block: B:497:0x0842  */
                /* JADX WARN: Code duplicated, block: B:499:0x0849 A[LOOP:15: B:498:0x0847->B:499:0x0849, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:503:0x085c A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:518:0x08c4  */
                /* JADX WARN: Code duplicated, block: B:521:0x08d6  */
                /* JADX WARN: Code duplicated, block: B:524:0x08f2  */
                /* JADX WARN: Code duplicated, block: B:525:0x08fe  */
                /* JADX WARN: Code duplicated, block: B:527:0x0901  */
                /* JADX WARN: Code duplicated, block: B:529:0x0909 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:532:0x0911  */
                /* JADX WARN: Code duplicated, block: B:535:0x0923 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:539:0x0939 A[PHI: r14 r26
  0x0939: PHI (r14v7 ??) = (r14v6 ??), (r14v10 ??), (r14v10 ??), (r14v10 ??) binds: [B:526:0x08ff, B:534:0x0921, B:535:0x0923, B:537:0x0929] A[DONT_GENERATE, DONT_INLINE]
  0x0939: PHI (r26v6 boolean) = (r26v5 boolean), (r26v7 boolean), (r26v7 boolean), (r26v7 boolean) binds: [B:526:0x08ff, B:534:0x0921, B:535:0x0923, B:537:0x0929] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:541:0x093f  */
                /* JADX WARN: Code duplicated, block: B:542:0x0941  */
                /* JADX WARN: Code duplicated, block: B:546:0x0951  */
                /* JADX WARN: Code duplicated, block: B:615:0x06ea A[SYNTHETIC] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r14v10 */
                /* JADX WARN: Type inference failed for: r14v11 */
                /* JADX WARN: Type inference failed for: r14v12 */
                /* JADX WARN: Type inference failed for: r14v13 */
                /* JADX WARN: Type inference failed for: r14v28 */
                /* JADX WARN: Type inference failed for: r14v29 */
                /* JADX WARN: Type inference failed for: r14v30 */
                /* JADX WARN: Type inference failed for: r14v31 */
                /* JADX WARN: Type inference failed for: r14v32 */
                /* JADX WARN: Type inference failed for: r14v33 */
                /* JADX WARN: Type inference failed for: r14v6 */
                /* JADX WARN: Type inference failed for: r14v7 */
                /* JADX WARN: Type inference failed for: r14v8 */
                /* JADX WARN: Type inference failed for: r15v10 */
                /* JADX WARN: Type inference failed for: r15v17 */
                /* JADX WARN: Type inference failed for: r15v18 */
                /* JADX WARN: Type inference failed for: r15v19 */
                /* JADX WARN: Type inference failed for: r15v2 */
                /* JADX WARN: Type inference failed for: r15v3 */
                /* JADX WARN: Type inference failed for: r15v4 */
                /* JADX WARN: Type inference failed for: r15v40 */
                /* JADX WARN: Type inference failed for: r15v41 */
                /* JADX WARN: Type inference failed for: r15v42 */
                /* JADX WARN: Type inference failed for: r15v5 */
                /* JADX WARN: Type inference failed for: r15v6, types: [boolean] */
                /* JADX WARN: Type inference failed for: r15v7 */
                /* JADX WARN: Type inference failed for: r15v8 */
                /* JADX WARN: Type inference failed for: r15v9 */
                /* JADX WARN: Type inference failed for: r34v0, types: [a00, zz] */
                /* JADX INFO: renamed from: V */
                public final void m9V() {
                    C2051oz c2051oz;
                    int i;
                    C2051oz c2051oz2;
                    int iM10472l;
                    int i2;
                    boolean z;
                    boolean z2;
                    char c;
                    EnumC2516yz[] enumC2516yzArr;
                    boolean z3;
                    int i3;
                    int i4;
                    boolean zM10X;
                    boolean z4;
                    int i5;
                    ?? r15;
                    boolean z5;
                    int i6;
                    boolean z6;
                    boolean z7;
                    ?? r16;
                    int i7;
                    boolean z8;
                    int iMax;
                    boolean z9;
                    int iMax2;
                    ?? r17;
                    ?? r14;
                    int i8;
                    ?? r18;
                    ?? r19;
                    boolean zM10X2;
                    int size;
                    boolean z10;
                    int i9;
                    C2569zz c2569zz;
                    ?? r110;
                    int i10;
                    WeakReference weakReference;
                    WeakReference weakReference2;
                    WeakReference weakReference3;
                    WeakReference weakReference4;
                    C2051oz c2051oz3;
                    C2569zz c2569zz2;
                    k73 k73Var;
                    k73 k73Var2;
                    int i11;
                    int i12;
                    EnumC2516yz enumC2516yz;
                    k73 k73Var3;
                    k73 k73Var4;
                    boolean z11;
                    ArrayList arrayList;
                    int i13;
                    C2051oz c2051oz4;
/* 3 */             boolean[] zArr = kb1.f12671c;
/* 6 */             this.f20422a0 = 0;
/* 8 */             this.f20424b0 = 0;
/* 10 */            this.f9I0 = false;
/* 12 */            this.f10J0 = false;
/* 16 */            int size2 = this.f17u0.size();
/* 24 */            int iMax3 = Math.max(0, m10475r());
/* 32 */            int iMax4 = Math.max(0, m10472l());
/* 36 */            EnumC2516yz[] enumC2516yzArr2 = this.f20415U;
/* 39 */            EnumC2516yz enumC2516yz2 = enumC2516yzArr2[1];
/* 41 */            EnumC2516yz enumC2516yz3 = enumC2516yzArr2[0];
/* 43 */            int i14 = this.f20x0;
/* 45 */            EnumC2516yz enumC2516yz4 = EnumC2516yz.f19867c;
/* 47 */            C2051oz c2051oz5 = this.f20405K;
/* 49 */            C2051oz c2051oz6 = this.f20404J;
/* 51 */            EnumC2516yz enumC2516yz5 = EnumC2516yz.f19865a;
/* 53 */            if (i14 == 0 && kb1.m6029B(this.f8H0, 1)) {
/* 63 */                InterfaceC2462xi interfaceC2462xi = this.f21y0;
/* 65 */                EnumC2516yz[] enumC2516yzArr3 = this.f20415U;
/* 67 */                EnumC2516yz enumC2516yz6 = enumC2516yzArr3[0];
/* 69 */                EnumC2516yz enumC2516yz7 = enumC2516yzArr3[1];
/* 71 */                m10457F();
/* 74 */                ArrayList arrayList2 = this.f17u0;
/* 76 */                int size3 = arrayList2.size();
/* 83 */                for (int i15 = 0; i15 < size3; i15++) {
/* 91 */                    ((C2569zz) arrayList2.get(i15)).m10457F();
                        }
/* 97 */                boolean z12 = this.f22z0;
/* 99 */                if (enumC2516yz6 == enumC2516yz5) {
/* 108 */                   m10459K(0, m10475r());
                        } else {
/* 115 */                   c2051oz6.m7254l(0);
/* 118 */                   this.f20422a0 = 0;
                        }
/* 120 */               boolean z13 = false;
/* 121 */               int i16 = 0;
/* 122 */               boolean z14 = false;
/* 126 */               while (i16 < size3) {
/* 132 */                   boolean z15 = z13;
/* 136 */                   C2569zz c2569zz3 = (C2569zz) arrayList2.get(i16);
/* 138 */                   int i17 = i16;
/* 142 */                   if (c2569zz3 instanceof bs0) {
/* 144 */                       bs0 bs0Var = (bs0) c2569zz3;
/* 148 */                       c2051oz4 = c2051oz6;
/* 151 */                       if (bs0Var.f2590y0 == 1) {
/* 153 */                           int i18 = bs0Var.f2587v0;
/* 156 */                           if (i18 != -1) {
/* 158 */                               bs0Var.m1425S(i18);
                                    } else if (bs0Var.f2588w0 != -1 && mo1422B()) {
/* 179 */                               bs0Var.m1425S(m10475r() - bs0Var.f2588w0);
                                    } else if (mo1422B()) {
/* 200 */                               bs0Var.m1425S((int) ((bs0Var.f2586u0 * m10475r()) + 0.5f));
                                    }
/* 203 */                           z15 = true;
                                }
                            } else {
/* 208 */                       c2051oz4 = c2051oz6;
/* 212 */                       if ((c2569zz3 instanceof C2294vh) && ((C2294vh) c2569zz3).m9270W() == 0) {
/* 222 */                           z13 = z15;
/* 224 */                           z14 = true;
                                }
/* 226 */                       i16 = i17 + 1;
/* 228 */                       c2051oz6 = c2051oz4;
                            }
/* 205 */                   z13 = z15;
/* 226 */                   i16 = i17 + 1;
/* 228 */                   c2051oz6 = c2051oz4;
                        }
/* 233 */               c2051oz = c2051oz6;
/* 235 */               if (z13) {
/* 238 */                   for (int i19 = 0; i19 < size3; i19 = i13 + 1) {
/* 244 */                       C2569zz c2569zz4 = (C2569zz) arrayList2.get(i19);
/* 248 */                       if (c2569zz4 instanceof bs0) {
/* 250 */                           bs0 bs0Var2 = (bs0) c2569zz4;
/* 254 */                           i13 = i19;
/* 257 */                           if (bs0Var2.f2590y0 == 1) {
/* 260 */                               yy1.m10226v(0, interfaceC2462xi, bs0Var2, z12);
                                    }
                                } else {
/* 266 */                           i13 = i19;
                                }
                            }
                        }
/* 274 */               yy1.m10226v(0, interfaceC2462xi, this, z12);
/* 277 */               if (z14) {
/* 280 */                   for (int i20 = 0; i20 < size3; i20++) {
/* 286 */                       C2569zz c2569zz5 = (C2569zz) arrayList2.get(i20);
/* 290 */                       if (c2569zz5 instanceof C2294vh) {
/* 292 */                           C2294vh c2294vh = (C2294vh) c2569zz5;
/* 298 */                           if (c2294vh.m9270W() == 0 && c2294vh.m9269V()) {
/* 307 */                               yy1.m10226v(1, interfaceC2462xi, c2294vh, z12);
                                    }
                                }
                            }
                        }
/* 313 */               if (enumC2516yz7 == enumC2516yz5) {
/* 320 */                   m10460L(0, m10472l());
                        } else {
/* 325 */                   c2051oz5.m7254l(0);
/* 328 */                   this.f20424b0 = 0;
                        }
/* 330 */               int i21 = 0;
/* 331 */               boolean z16 = false;
/* 332 */               boolean z17 = false;
/* 333 */               while (i21 < size3) {
/* 339 */                   C2569zz c2569zz6 = (C2569zz) arrayList2.get(i21);
/* 341 */                   int i22 = i21;
/* 345 */                   if (c2569zz6 instanceof bs0) {
/* 347 */                       bs0 bs0Var3 = (bs0) c2569zz6;
/* 351 */                       if (bs0Var3.f2590y0 == 0) {
/* 353 */                           int i23 = bs0Var3.f2587v0;
/* 356 */                           if (i23 != -1) {
/* 358 */                               bs0Var3.m1425S(i23);
                                    } else if (bs0Var3.f2588w0 != -1 && mo1423C()) {
/* 379 */                               bs0Var3.m1425S(m10472l() - bs0Var3.f2588w0);
                                    } else if (mo1423C()) {
/* 400 */                               bs0Var3.m1425S((int) ((bs0Var3.f2586u0 * m10472l()) + 0.5f));
                                    }
/* 403 */                           z16 = true;
                                }
                            } else if ((c2569zz6 instanceof C2294vh) && ((C2294vh) c2569zz6).m9270W() == 1) {
/* 418 */                       z17 = true;
                            }
/* 419 */                   i21 = i22 + 1;
                        }
/* 422 */               if (z16) {
/* 425 */                   for (int i24 = 0; i24 < size3; i24++) {
/* 431 */                       C2569zz c2569zz7 = (C2569zz) arrayList2.get(i24);
/* 435 */                       if (c2569zz7 instanceof bs0) {
/* 437 */                           bs0 bs0Var4 = (bs0) c2569zz7;
/* 441 */                           if (bs0Var4.f2590y0 == 0) {
/* 444 */                               yy1.m10207N(1, interfaceC2462xi, bs0Var4);
                                    }
                                }
                            }
                        }
/* 451 */               yy1.m10207N(0, interfaceC2462xi, this);
/* 454 */               if (z17) {
/* 457 */                   for (int i25 = 0; i25 < size3; i25++) {
/* 463 */                       C2569zz c2569zz8 = (C2569zz) arrayList2.get(i25);
/* 467 */                       if (c2569zz8 instanceof C2294vh) {
/* 469 */                           C2294vh c2294vh2 = (C2294vh) c2569zz8;
/* 476 */                           if (c2294vh2.m9270W() == 1 && c2294vh2.m9269V()) {
/* 484 */                               yy1.m10207N(1, interfaceC2462xi, c2294vh2);
                                    }
                                }
                            }
                        }
/* 491 */               for (int i26 = 0; i26 < size3; i26++) {
/* 497 */                   C2569zz c2569zz9 = (C2569zz) arrayList2.get(i26);
/* 503 */                   if (c2569zz9.m10455A() && yy1.m10212d(c2569zz9)) {
/* 513 */                       m2W(c2569zz9, interfaceC2462xi, yy1.f19858a);
/* 518 */                       if (!(c2569zz9 instanceof bs0)) {
/* 538 */                           yy1.m10226v(0, interfaceC2462xi, c2569zz9, z12);
/* 541 */                           yy1.m10207N(0, interfaceC2462xi, c2569zz9);
                                } else if (((bs0) c2569zz9).f2590y0 == 0) {
/* 528 */                           yy1.m10207N(0, interfaceC2462xi, c2569zz9);
                                } else {
/* 533 */                           yy1.m10226v(0, interfaceC2462xi, c2569zz9, z12);
                                }
                            }
                        }
/* 548 */               for (int i27 = 0; i27 < size2; i27++) {
/* 556 */                   C2569zz c2569zz10 = (C2569zz) this.f17u0.get(i27);
/* 562 */                   if (c2569zz10.m10455A() && !(c2569zz10 instanceof bs0) && !(c2569zz10 instanceof C2294vh) && !(c2569zz10 instanceof y53) && !c2569zz10.f20401G) {
/* 581 */                       EnumC2516yz enumC2516yzM10471k = c2569zz10.m10471k(0);
/* 586 */                       EnumC2516yz enumC2516yzM10471k2 = c2569zz10.m10471k(1);
/* 590 */                       if (enumC2516yzM10471k != enumC2516yz4 || c2569zz10.f20455r == 1 || enumC2516yzM10471k2 != enumC2516yz4 || c2569zz10.f20457s == 1) {
/* 610 */                           m2W(c2569zz10, this.f21y0, new C2332wi());
                                }
                            }
                        }
                    } else {
/* 618 */               iMax4 = iMax4;
/* 620 */               c2051oz = c2051oz6;
                    }
/* 623 */           EnumC2516yz enumC2516yz8 = EnumC2516yz.f19866b;
/* 625 */           t71 t71Var = this.f1A0;
/* 627 */           if (size2 <= 2 || !((enumC2516yz3 == enumC2516yz8 || enumC2516yz2 == enumC2516yz8) && kb1.m6029B(this.f8H0, Segment.SHARE_MINIMUM))) {
/* 634 */               i = size2;
/* 636 */               c2051oz2 = c2051oz5;
                    } else {
/* 652 */               InterfaceC2462xi interfaceC2462xi2 = this.f21y0;
/* 654 */               ArrayList arrayList3 = this.f17u0;
/* 656 */               int size4 = arrayList3.size();
/* 660 */               int i28 = 0;
                        while (true) {
/* 661 */                   if (i28 >= size4) {
/* 715 */                       i = size2;
/* 717 */                       c2051oz2 = c2051oz5;
/* 719 */                       int i29 = 0;
/* 720 */                       ArrayList arrayList4 = null;
/* 721 */                       ArrayList arrayList5 = null;
/* 722 */                       ArrayList arrayList6 = null;
/* 723 */                       ArrayList arrayList7 = null;
/* 724 */                       ArrayList arrayList8 = null;
/* 726 */                       ArrayList arrayList9 = null;
/* 728 */                       while (i29 < size4) {
/* 734 */                           int i30 = i29;
/* 738 */                           C2569zz c2569zz11 = (C2569zz) arrayList3.get(i29);
/* 740 */                           ArrayList arrayList10 = arrayList4;
/* 742 */                           EnumC2516yz[] enumC2516yzArr4 = this.f20415U;
/* 748 */                           EnumC2516yz enumC2516yz9 = enumC2516yzArr4[0];
/* 750 */                           ArrayList arrayList11 = arrayList5;
/* 754 */                           EnumC2516yz enumC2516yz10 = enumC2516yzArr4[1];
/* 756 */                           ArrayList arrayList12 = arrayList6;
/* 758 */                           EnumC2516yz[] enumC2516yzArr5 = c2569zz11.f20415U;
/* 764 */                           ArrayList arrayList13 = arrayList7;
/* 772 */                           if (!kb1.m6046V(enumC2516yz9, enumC2516yz10, enumC2516yzArr5[0], enumC2516yzArr5[1])) {
/* 776 */                               m2W(c2569zz11, interfaceC2462xi2, this.f16P0);
                                    }
/* 779 */                           boolean z18 = c2569zz11 instanceof bs0;
/* 781 */                           if (z18) {
/* 784 */                               bs0 bs0Var5 = (bs0) c2569zz11;
/* 788 */                               if (bs0Var5.f2590y0 == 0) {
/* 798 */                                   arrayList6 = arrayList12 == null ? new ArrayList() : arrayList12;
/* 800 */                                   arrayList6.add(bs0Var5);
                                        } else {
/* 804 */                                   arrayList6 = arrayList12;
                                        }
/* 808 */                               z11 = z18;
/* 811 */                               if (bs0Var5.f2590y0 == 1) {
/* 821 */                                   arrayList = arrayList10 == null ? new ArrayList() : arrayList10;
/* 823 */                                   arrayList.add(bs0Var5);
                                        } else {
/* 827 */                                   arrayList = arrayList10;
                                        }
                                    } else {
/* 830 */                               z11 = z18;
/* 832 */                               arrayList = arrayList10;
/* 834 */                               arrayList6 = arrayList12;
                                    }
/* 838 */                           if (!(c2569zz11 instanceof cu0)) {
/* 931 */                               arrayList5 = arrayList11;
/* 933 */                               arrayList7 = arrayList13;
                                    } else if (c2569zz11 instanceof C2294vh) {
/* 845 */                               C2294vh c2294vh3 = (C2294vh) c2569zz11;
/* 851 */                               if (c2294vh3.m9270W() == 0) {
/* 861 */                                   ArrayList arrayList14 = arrayList11 == null ? new ArrayList() : arrayList11;
/* 863 */                                   arrayList14.add(c2294vh3);
/* 866 */                                   arrayList11 = arrayList14;
                                        }
/* 875 */                               if (c2294vh3.m9270W() == 1) {
/* 886 */                                   arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
/* 888 */                                   arrayList7.add(c2294vh3);
                                        } else {
/* 892 */                                   arrayList7 = arrayList13;
                                        }
/* 894 */                               arrayList5 = arrayList11;
                                    } else {
/* 900 */                               cu0 cu0Var = (cu0) c2569zz11;
/* 910 */                               arrayList5 = arrayList11 == null ? new ArrayList() : arrayList11;
/* 912 */                               arrayList5.add(cu0Var);
/* 923 */                               arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
/* 925 */                               arrayList7.add(cu0Var);
                                    }
/* 939 */                           if (c2569zz11.f20404J.f14929f == null && c2569zz11.f20406L.f14929f == null && !z11 && !(c2569zz11 instanceof C2294vh)) {
/* 953 */                               if (arrayList8 == null) {
/* 957 */                                   arrayList8 = new ArrayList();
                                        }
/* 960 */                               ArrayList arrayList15 = arrayList8;
/* 962 */                               arrayList15.add(c2569zz11);
/* 965 */                               arrayList8 = arrayList15;
                                    }
/* 971 */                           if (c2569zz11.f20405K.f14929f == null && c2569zz11.f20407M.f14929f == null && c2569zz11.f20408N.f14929f == null && !z11 && !(c2569zz11 instanceof C2294vh)) {
/* 991 */                               if (arrayList9 == null) {
/* 995 */                                   arrayList9 = new ArrayList();
                                        }
/* 998 */                               ArrayList arrayList16 = arrayList9;
/* 1000 */                              arrayList16.add(c2569zz11);
/* 1003 */                              arrayList9 = arrayList16;
                                    }
/* 1005 */                          i29 = i30 + 1;
/* 1007 */                          arrayList4 = arrayList;
                                }
/* 1011 */                      ArrayList arrayList17 = arrayList4;
/* 1013 */                      ArrayList<cu0> arrayList18 = arrayList5;
/* 1015 */                      ArrayList arrayList19 = arrayList6;
/* 1017 */                      ArrayList<cu0> arrayList20 = arrayList7;
/* 1021 */                      ArrayList<k73> arrayList21 = new ArrayList();
/* 1024 */                      if (arrayList17 != null) {
/* 1026 */                          Iterator it = arrayList17.iterator();
/* 1034 */                          while (it.hasNext()) {
/* 1044 */                              kb1.m6031D((bs0) it.next(), 0, arrayList21, null);
                                    }
                                }
/* 1048 */                      k73 k73Var5 = null;
/* 1049 */                      int i31 = 0;
/* 1050 */                      if (arrayList18 != null) {
/* 1060 */                          for (cu0 cu0Var2 : arrayList18) {
/* 1068 */                              k73 k73VarM6031D = kb1.m6031D(cu0Var2, i31, arrayList21, k73Var5);
/* 1072 */                              cu0Var2.m2889T(i31, k73VarM6031D, arrayList21);
/* 1075 */                              k73VarM6031D.m6000a(arrayList21);
/* 1078 */                              k73Var5 = null;
/* 1079 */                              i31 = 0;
                                    }
                                }
/* 1086 */                      HashSet hashSet = mo1430j(2).f14924a;
/* 1088 */                      if (hashSet != null) {
/* 1090 */                          Iterator it2 = hashSet.iterator();
/* 1098 */                          while (it2.hasNext()) {
/* 1110 */                              kb1.m6031D(((C2051oz) it2.next()).f14927d, 0, arrayList21, null);
                                    }
                                }
/* 1119 */                      HashSet hashSet2 = mo1430j(4).f14924a;
/* 1121 */                      if (hashSet2 != null) {
/* 1123 */                          Iterator it3 = hashSet2.iterator();
/* 1131 */                          while (it3.hasNext()) {
/* 1143 */                              kb1.m6031D(((C2051oz) it3.next()).f14927d, 0, arrayList21, null);
                                    }
                                }
/* 1152 */                      HashSet hashSet3 = mo1430j(7).f14924a;
/* 1154 */                      if (hashSet3 != null) {
/* 1156 */                          Iterator it4 = hashSet3.iterator();
/* 1164 */                          while (it4.hasNext()) {
/* 1176 */                              kb1.m6031D(((C2051oz) it4.next()).f14927d, 0, arrayList21, null);
                                    }
                                }
/* 1180 */                      k73 k73Var6 = null;
/* 1182 */                      if (arrayList8 != null) {
/* 1184 */                          Iterator it5 = arrayList8.iterator();
/* 1192 */                          while (it5.hasNext()) {
/* 1200 */                              kb1.m6031D((C2569zz) it5.next(), 0, arrayList21, null);
                                    }
                                }
/* 1204 */                      if (arrayList19 != null) {
/* 1206 */                          Iterator it6 = arrayList19.iterator();
/* 1214 */                          while (it6.hasNext()) {
/* 1223 */                              kb1.m6031D((bs0) it6.next(), 1, arrayList21, null);
                                    }
                                }
/* 1227 */                      int i32 = 1;
/* 1228 */                      if (arrayList20 != null) {
/* 1238 */                          for (cu0 cu0Var3 : arrayList20) {
/* 1246 */                              k73 k73VarM6031D2 = kb1.m6031D(cu0Var3, i32, arrayList21, k73Var6);
/* 1250 */                              cu0Var3.m2889T(i32, k73VarM6031D2, arrayList21);
/* 1253 */                              k73VarM6031D2.m6000a(arrayList21);
/* 1257 */                              k73Var6 = null;
/* 1258 */                              i32 = 1;
                                    }
                                }
/* 1265 */                      HashSet hashSet4 = mo1430j(3).f14924a;
/* 1267 */                      if (hashSet4 != null) {
/* 1269 */                          Iterator it7 = hashSet4.iterator();
/* 1277 */                          while (it7.hasNext()) {
/* 1289 */                              kb1.m6031D(((C2051oz) it7.next()).f14927d, 1, arrayList21, null);
                                    }
                                }
/* 1298 */                      HashSet hashSet5 = mo1430j(6).f14924a;
/* 1300 */                      if (hashSet5 != null) {
/* 1302 */                          Iterator it8 = hashSet5.iterator();
/* 1310 */                          while (it8.hasNext()) {
/* 1322 */                              kb1.m6031D(((C2051oz) it8.next()).f14927d, 1, arrayList21, null);
                                    }
                                }
/* 1331 */                      HashSet hashSet6 = mo1430j(5).f14924a;
/* 1333 */                      if (hashSet6 != null) {
/* 1335 */                          Iterator it9 = hashSet6.iterator();
/* 1343 */                          while (it9.hasNext()) {
/* 1355 */                              kb1.m6031D(((C2051oz) it9.next()).f14927d, 1, arrayList21, null);
                                    }
                                }
/* 1364 */                      HashSet hashSet7 = mo1430j(7).f14924a;
/* 1366 */                      if (hashSet7 != null) {
/* 1368 */                          Iterator it10 = hashSet7.iterator();
/* 1376 */                          while (it10.hasNext()) {
/* 1388 */                              kb1.m6031D(((C2051oz) it10.next()).f14927d, 1, arrayList21, null);
                                    }
                                }
/* 1393 */                      char c2 = 1;
/* 1394 */                      if (arrayList9 != null) {
/* 1396 */                          Iterator it11 = arrayList9.iterator();
/* 1404 */                          while (it11.hasNext()) {
/* 1412 */                              kb1.m6031D((C2569zz) it11.next(), 1, arrayList21, null);
                                    }
                                }
/* 1416 */                      int i33 = 0;
/* 1417 */                      while (i33 < size4) {
/* 1423 */                          C2569zz c2569zz12 = (C2569zz) arrayList3.get(i33);
/* 1425 */                          EnumC2516yz[] enumC2516yzArr6 = c2569zz12.f20415U;
/* 1431 */                          if (enumC2516yzArr6[0] == enumC2516yz4 && enumC2516yzArr6[c2] == enumC2516yz4) {
/* 1437 */                              int i34 = c2569zz12.f20458s0;
/* 1439 */                              int size5 = arrayList21.size();
/* 1443 */                              int i35 = 0;
                                        while (true) {
/* 1444 */                                  if (i35 >= size5) {
/* 1470 */                                      i12 = i33;
/* 1472 */                                      enumC2516yz = enumC2516yz4;
/* 1474 */                                      k73Var3 = null;
                                                break;
                                            }
/* 1450 */                                  i12 = i33;
/* 1454 */                                  k73Var3 = (k73) arrayList21.get(i35);
/* 1456 */                                  enumC2516yz = enumC2516yz4;
/* 1460 */                                  if (i34 == k73Var3.f12639b) {
                                                break;
                                            }
/* 1463 */                                  i35++;
/* 1465 */                                  enumC2516yz4 = enumC2516yz;
/* 1467 */                                  i33 = i12;
                                        }
/* 1475 */                              int i36 = c2569zz12.f20460t0;
/* 1477 */                              int size6 = arrayList21.size();
/* 1481 */                              int i37 = 0;
                                        while (true) {
/* 1482 */                                  if (i37 >= size6) {
/* 1498 */                                      k73Var4 = null;
                                                break;
                                            }
/* 1488 */                                  k73Var4 = (k73) arrayList21.get(i37);
/* 1492 */                                  if (i36 == k73Var4.f12639b) {
                                                break;
                                            } else {
/* 1495 */                                      i37++;
                                            }
                                        }
/* 1499 */                              if (k73Var3 != null && k73Var4 != null) {
/* 1504 */                                  k73Var3.m6002c(0, k73Var4);
/* 1508 */                                  k73Var4.f12640c = 2;
/* 1510 */                                  arrayList21.remove(k73Var3);
                                        }
                                    } else {
/* 1514 */                              i12 = i33;
/* 1516 */                              enumC2516yz = enumC2516yz4;
                                    }
/* 1518 */                          i33 = i12 + 1;
/* 1520 */                          enumC2516yz4 = enumC2516yz;
/* 1522 */                          c2 = 1;
                                }
/* 1529 */                      if (arrayList21.size() > 1) {
/* 1535 */                          int i38 = 0;
/* 1538 */                          if (this.f20415U[0] == enumC2516yz8) {
/* 1544 */                              int i39 = 0;
/* 1545 */                              k73Var = null;
/* 1550 */                              for (k73 k73Var7 : arrayList21) {
/* 1561 */                                  if (k73Var7.f12640c != 1) {
/* 1564 */                                      int iM6001b = k73Var7.m6001b(t71Var, i38);
/* 1568 */                                      if (iM6001b > i39) {
/* 1570 */                                          k73Var = k73Var7;
/* 1571 */                                          i39 = iM6001b;
                                                }
/* 1572 */                                      i38 = 0;
                                            }
                                        }
/* 1574 */                              if (k73Var != null) {
/* 1576 */                                  m10462N(enumC2516yz5);
/* 1579 */                                  m10464P(i39);
                                        } else {
/* 1583 */                                  k73Var = null;
                                        }
                                    } else {
/* 1583 */                              k73Var = null;
                                    }
/* 1586 */                          int i40 = 1;
/* 1589 */                          if (this.f20415U[1] == enumC2516yz8) {
/* 1595 */                              int i41 = 0;
/* 1596 */                              k73Var2 = null;
/* 1601 */                              for (k73 k73Var8 : arrayList21) {
/* 1611 */                                  if (k73Var8.f12640c != 0) {
/* 1614 */                                      int iM6001b2 = k73Var8.m6001b(t71Var, i40);
/* 1618 */                                      if (iM6001b2 > i41) {
/* 1620 */                                          k73Var2 = k73Var8;
/* 1621 */                                          i41 = iM6001b2;
                                                }
/* 1622 */                                      i40 = 1;
                                            }
                                        }
/* 1624 */                              if (k73Var2 != null) {
/* 1626 */                                  m10463O(enumC2516yz5);
/* 1629 */                                  m10461M(i41);
                                        } else {
/* 1633 */                                  k73Var2 = null;
                                        }
                                    } else {
/* 1633 */                              k73Var2 = null;
                                    }
/* 1634 */                          if (k73Var != null || k73Var2 != null) {
/* 1638 */                              if (enumC2516yz3 == enumC2516yz8) {
/* 1644 */                                  if (iMax3 >= m10475r() || iMax3 <= 0) {
/* 1655 */                                      iMax3 = m10475r();
                                            } else {
/* 1648 */                                      m10464P(iMax3);
/* 1652 */                                      this.f9I0 = true;
                                            }
                                        }
/* 1659 */                              if (enumC2516yz2 == enumC2516yz8) {
/* 1665 */                                  i11 = iMax4;
/* 1667 */                                  if (i11 >= m10472l() || i11 <= 0) {
/* 1678 */                                      iM10472l = m10472l();
                                            } else {
/* 1671 */                                      m10461M(i11);
/* 1675 */                                      this.f10J0 = true;
                                            }
/* 1686 */                                  i2 = iMax3;
/* 1687 */                                  z = true;
                                        } else {
/* 1683 */                                  i11 = iMax4;
                                        }
/* 1685 */                              iM10472l = i11;
/* 1686 */                              i2 = iMax3;
/* 1687 */                              z = true;
                                    }
                                }
/* 1698 */                      if (!m10X(64) || m10X(128)) {
/* 1711 */                          z2 = true;
                                } else {
/* 1709 */                          z2 = false;
                                }
/* 1712 */                      t71Var.getClass();
/* 1716 */                      t71Var.f16939g = false;
/* 1720 */                      if (this.f8H0 == 0 && z2) {
/* 1724 */                          c = 1;
/* 1725 */                          t71Var.f16939g = true;
                                } else {
/* 1728 */                          c = 1;
                                }
/* 1729 */                      ArrayList arrayList22 = this.f17u0;
/* 1731 */                      enumC2516yzArr = this.f20415U;
/* 1735 */                      if (enumC2516yzArr[0] != enumC2516yz8 || enumC2516yzArr[c] == enumC2516yz8) {
/* 1744 */                          z3 = true;
                                } else {
/* 1742 */                          z3 = false;
                                }
/* 1745 */                      this.f4D0 = 0;
/* 1747 */                      this.f5E0 = 0;
/* 1749 */                      i3 = i;
/* 1752 */                      for (i4 = 0; i4 < i3; i4++) {
/* 1760 */                          c2569zz2 = (C2569zz) this.f17u0.get(i4);
/* 1764 */                          if (c2569zz2 instanceof a00) {
/* 1768 */                              ((a00) c2569zz2).m9V();
                                    }
                                }
/* 1774 */                      zM10X = m10X(64);
/* 1778 */                      z4 = z;
/* 1779 */                      i5 = 0;
/* 1780 */                      r15 = 1;
/* 1781 */                      while (r15 != 0) {
/* 1785 */                          i6 = i5 + 1;
                                    try {
/* 1787 */                              t71Var.m8724t();
/* 1790 */                              z6 = z3;
                                        try {
/* 1793 */                                  this.f4D0 = 0;
/* 1795 */                                  this.f5E0 = 0;
/* 1797 */                                  m10469h(t71Var);
/* 1801 */                                  for (i10 = 0; i10 < i3; i10++) {
/* 1811 */                                      ((C2569zz) this.f17u0.get(i10)).m10469h(t71Var);
                                            }
/* 1824 */                                  m7T(t71Var);
                                            try {
/* 1827 */                                      weakReference = this.f11K0;
/* 1829 */                                      if (weakReference != null || weakReference.get() == null) {
/* 1886 */                                          z7 = z4;
                                                } else {
/* 1845 */                                          C2051oz c2051oz7 = c2051oz2;
                                                    try {
                                                        try {
/* 1855 */                                                  c2051oz2 = c2051oz7;
/* 1857 */                                                  z7 = z4;
                                                            try {
/* 1861 */                                                      t71Var.m8711f(t71Var.m8716k((C2051oz) this.f11K0.get()), t71Var.m8716k(c2051oz7), 0, 5);
/* 1865 */                                                      this.f11K0 = null;
                                                            } catch (Exception e) {
/* 1868 */                                                      e = e;
/* 1871 */                                                      r110 = 1;
/* 2028 */                                                      e.printStackTrace();
/* 2049 */                                                      System.out.println("EXCEPTION : " + e);
                                                                r16 = r110;
/* 2052 */                                                      if (r16 != 0) {
/* 2058 */                                                          zArr[2] = false;
/* 2062 */                                                          zM10X2 = m10X(64);
/* 2066 */                                                          mo1424R(t71Var, zM10X2);
/* 2071 */                                                          size = this.f17u0.size();
/* 2075 */                                                          z10 = false;
/* 2076 */                                                          i9 = 0;
/* 2077 */                                                          while (i9 < size) {
/* 2085 */                                                              c2569zz = (C2569zz) this.f17u0.get(i9);
/* 2087 */                                                              c2569zz.mo1424R(t71Var, zM10X2);
/* 2090 */                                                              boolean z19 = zM10X2;
/* 2094 */                                                              int i42 = size;
/* 2097 */                                                              if (c2569zz.f20435h == -1) {
/* 2103 */                                                                  z10 = true;
                                                                        } else {
/* 2103 */                                                                  z10 = true;
                                                                        }
/* 2104 */                                                              i9++;
/* 2106 */                                                              zM10X2 = z19;
/* 2108 */                                                              size = i42;
                                                                        z10 = z10;
                                                                    }
                                                                    z8 = z10;
                                                                } else {
/* 2116 */                                                          mo1424R(t71Var, zM10X);
/* 2120 */                                                          for (i7 = 0; i7 < i3; i7++) {
/* 2130 */                                                              ((C2569zz) this.f17u0.get(i7)).mo1424R(t71Var, zM10X);
                                                                    }
/* 2136 */                                                          z8 = false;
                                                                }
/* 2139 */                                                      if (!z6) {
                                                                }
/* 2253 */                                                      iMax = Math.max(this.f20428d0, m10475r());
                                                                z9 = z8;
/* 2261 */                                                      if (iMax > m10475r()) {
/* 2263 */                                                          m10464P(iMax);
/* 2270 */                                                          this.f20415U[0] = enumC2516yz5;
/* 2272 */                                                          z9 = true;
/* 2273 */                                                          z7 = true;
                                                                }
/* 2281 */                                                      iMax2 = Math.max(this.f20430e0, m10472l());
/* 2289 */                                                      if (iMax2 > m10472l()) {
/* 2291 */                                                          m10461M(iMax2);
/* 2296 */                                                          r17 = 1;
/* 2297 */                                                          this.f20415U[1] = enumC2516yz5;
/* 2299 */                                                          r14 = 1;
/* 2300 */                                                          z7 = true;
                                                                } else {
/* 2303 */                                                          r17 = 1;
                                                                }
/* 2304 */                                                      if (z7) {
                                                                    r14 = z9;
/* 2362 */                                                          z4 = z7;
/* 2364 */                                                          i8 = 8;
                                                                    r18 = r14;
                                                                } else {
                                                                    r14 = z9;
/* 2312 */                                                          if (this.f20415U[0] == enumC2516yz8) {
                                                                        r14 = r14;
/* 2320 */                                                              if (m10475r() > i2) {
/* 2322 */                                                                  this.f9I0 = r17;
/* 2326 */                                                                  this.f20415U[0] = enumC2516yz5;
/* 2328 */                                                                  m10464P(i2);
/* 2331 */                                                                  ?? r111 = r17;
/* 2332 */                                                                  z7 = r111 == true ? 1 : 0;
                                                                            r14 = r111;
                                                                        }
                                                                    }
                                                                    r14 = r14;
                                                                    r14 = r14;
/* 2338 */                                                          if (this.f20415U[r17] == enumC2516yz8) {
                                                                        r14 = z9;
/* 2362 */                                                              z4 = z7;
/* 2364 */                                                              i8 = 8;
                                                                        r18 = r14;
                                                                    } else {
                                                                        r14 = z9;
/* 2362 */                                                              z4 = z7;
/* 2364 */                                                              i8 = 8;
                                                                        r18 = r14;
                                                                    }
                                                                }
/* 2366 */                                                      if (i6 > i8) {
/* 2368 */                                                          r19 = 0;
                                                                } else {
/* 2370 */                                                          r19 = r18;
                                                                }
/* 2371 */                                                      i5 = i6;
/* 2372 */                                                      z3 = z6;
/* 2374 */                                                      enumC2516yz5 = enumC2516yz5;
                                                                r15 = r19;
                                                            }
                                                        } catch (Exception e2) {
/* 1874 */                                                  e = e2;
/* 1875 */                                                  c2051oz2 = c2051oz7;
/* 1881 */                                                  z7 = z4;
/* 1871 */                                                  r110 = 1;
/* 2028 */                                                  e.printStackTrace();
/* 2049 */                                                  System.out.println("EXCEPTION : " + e);
                                                            r16 = r110;
/* 2052 */                                                  if (r16 != 0) {
/* 2058 */                                                      zArr[2] = false;
/* 2062 */                                                      zM10X2 = m10X(64);
/* 2066 */                                                      mo1424R(t71Var, zM10X2);
/* 2071 */                                                      size = this.f17u0.size();
/* 2075 */                                                      z10 = false;
/* 2076 */                                                      i9 = 0;
/* 2077 */                                                      while (i9 < size) {
/* 2085 */                                                          c2569zz = (C2569zz) this.f17u0.get(i9);
/* 2087 */                                                          c2569zz.mo1424R(t71Var, zM10X2);
/* 2090 */                                                          boolean z110 = zM10X2;
/* 2094 */                                                          int i43 = size;
/* 2097 */                                                          if (c2569zz.f20435h == -1) {
/* 2103 */                                                              z10 = true;
                                                                    } else {
/* 2103 */                                                              z10 = true;
                                                                    }
/* 2104 */                                                          i9++;
/* 2106 */                                                          zM10X2 = z110;
/* 2108 */                                                          size = i43;
                                                                    z10 = z10;
                                                                }
                                                                z8 = z10;
                                                            } else {
/* 2116 */                                                      mo1424R(t71Var, zM10X);
/* 2120 */                                                      while (i7 < i3) {
/* 2130 */                                                          ((C2569zz) this.f17u0.get(i7)).mo1424R(t71Var, zM10X);
                                                                }
/* 2136 */                                                      z8 = false;
                                                            }
/* 2139 */                                                  if (!z6) {
                                                            }
/* 2253 */                                                  iMax = Math.max(this.f20428d0, m10475r());
                                                            z9 = z8;
/* 2261 */                                                  if (iMax > m10475r()) {
/* 2263 */                                                      m10464P(iMax);
/* 2270 */                                                      this.f20415U[0] = enumC2516yz5;
/* 2272 */                                                      z9 = true;
/* 2273 */                                                      z7 = true;
                                                            }
/* 2281 */                                                  iMax2 = Math.max(this.f20430e0, m10472l());
/* 2289 */                                                  if (iMax2 > m10472l()) {
/* 2291 */                                                      m10461M(iMax2);
/* 2296 */                                                      r17 = 1;
/* 2297 */                                                      this.f20415U[1] = enumC2516yz5;
/* 2299 */                                                      r14 = 1;
/* 2300 */                                                      z7 = true;
                                                            } else {
/* 2303 */                                                      r17 = 1;
                                                            }
/* 2304 */                                                  if (z7) {
                                                                r14 = z9;
/* 2312 */                                                      if (this.f20415U[0] == enumC2516yz8) {
                                                                    r14 = r14;
/* 2320 */                                                          if (m10475r() > i2) {
/* 2322 */                                                              this.f9I0 = r17;
/* 2326 */                                                              this.f20415U[0] = enumC2516yz5;
/* 2328 */                                                              m10464P(i2);
/* 2331 */                                                              ?? r112 = r17;
/* 2332 */                                                              z7 = r112 == true ? 1 : 0;
                                                                        r14 = r112;
                                                                    }
                                                                }
                                                                r14 = r14;
                                                                r14 = r14;
/* 2338 */                                                      if (this.f20415U[r17] == enumC2516yz8) {
                                                                    r14 = z9;
/* 2362 */                                                          z4 = z7;
/* 2364 */                                                          i8 = 8;
                                                                    r18 = r14;
                                                                } else {
                                                                    r14 = z9;
/* 2362 */                                                          z4 = z7;
/* 2364 */                                                          i8 = 8;
                                                                    r18 = r14;
                                                                }
                                                            } else {
                                                                r14 = z9;
/* 2362 */                                                      z4 = z7;
/* 2364 */                                                      i8 = 8;
                                                                r18 = r14;
                                                            }
/* 2366 */                                                  if (i6 > i8) {
/* 2368 */                                                      r19 = 0;
                                                            } else {
/* 2370 */                                                      r19 = r18;
                                                            }
/* 2371 */                                                  i5 = i6;
/* 2372 */                                                  z3 = z6;
/* 2374 */                                                  enumC2516yz5 = enumC2516yz5;
                                                            r15 = r19;
                                                        }
                                                    } catch (Exception e3) {
/* 1878 */                                              e = e3;
/* 1879 */                                              c2051oz2 = c2051oz7;
                                                    }
                                                }
/* 1888 */                                      weakReference2 = this.f13M0;
/* 1890 */                                      if (weakReference2 != null && weakReference2.get() != null) {
/* 1918 */                                          t71Var.m8711f(t71Var.m8716k(this.f20407M), t71Var.m8716k((C2051oz) this.f13M0.get()), 0, 5);
/* 1922 */                                          this.f13M0 = null;
                                                }
/* 1924 */                                      weakReference3 = this.f12L0;
/* 1926 */                                      if (weakReference3 != null && weakReference3.get() != null) {
/* 1942 */                                          c2051oz3 = c2051oz;
                                                    try {
/* 1952 */                                              c2051oz = c2051oz3;
/* 1956 */                                              t71Var.m8711f(t71Var.m8716k((C2051oz) this.f12L0.get()), t71Var.m8716k(c2051oz3), 0, 5);
/* 1960 */                                              this.f12L0 = null;
                                                    } catch (Exception e4) {
/* 1963 */                                              e = e4;
/* 1964 */                                              c2051oz = c2051oz3;
/* 1871 */                                              r110 = 1;
/* 2028 */                                              e.printStackTrace();
/* 2049 */                                              System.out.println("EXCEPTION : " + e);
                                                        r16 = r110;
/* 2052 */                                              if (r16 != 0) {
/* 2058 */                                                  zArr[2] = false;
/* 2062 */                                                  zM10X2 = m10X(64);
/* 2066 */                                                  mo1424R(t71Var, zM10X2);
/* 2071 */                                                  size = this.f17u0.size();
/* 2075 */                                                  z10 = false;
/* 2076 */                                                  i9 = 0;
/* 2077 */                                                  while (i9 < size) {
/* 2085 */                                                      c2569zz = (C2569zz) this.f17u0.get(i9);
/* 2087 */                                                      c2569zz.mo1424R(t71Var, zM10X2);
/* 2090 */                                                      boolean z111 = zM10X2;
/* 2094 */                                                      int i44 = size;
/* 2097 */                                                      if (c2569zz.f20435h == -1) {
/* 2103 */                                                          z10 = true;
                                                                } else {
/* 2103 */                                                          z10 = true;
                                                                }
/* 2104 */                                                      i9++;
/* 2106 */                                                      zM10X2 = z111;
/* 2108 */                                                      size = i44;
                                                                z10 = z10;
                                                            }
                                                            z8 = z10;
                                                        } else {
/* 2116 */                                                  mo1424R(t71Var, zM10X);
/* 2120 */                                                  while (i7 < i3) {
/* 2130 */                                                      ((C2569zz) this.f17u0.get(i7)).mo1424R(t71Var, zM10X);
                                                            }
/* 2136 */                                                  z8 = false;
                                                        }
/* 2139 */                                              if (!z6) {
                                                        }
/* 2253 */                                              iMax = Math.max(this.f20428d0, m10475r());
                                                        z9 = z8;
/* 2261 */                                              if (iMax > m10475r()) {
/* 2263 */                                                  m10464P(iMax);
/* 2270 */                                                  this.f20415U[0] = enumC2516yz5;
/* 2272 */                                                  z9 = true;
/* 2273 */                                                  z7 = true;
                                                        }
/* 2281 */                                              iMax2 = Math.max(this.f20430e0, m10472l());
/* 2289 */                                              if (iMax2 > m10472l()) {
/* 2291 */                                                  m10461M(iMax2);
/* 2296 */                                                  r17 = 1;
/* 2297 */                                                  this.f20415U[1] = enumC2516yz5;
/* 2299 */                                                  r14 = 1;
/* 2300 */                                                  z7 = true;
                                                        } else {
/* 2303 */                                                  r17 = 1;
                                                        }
/* 2304 */                                              if (z7) {
                                                            r14 = z9;
/* 2312 */                                                  if (this.f20415U[0] == enumC2516yz8) {
                                                                r14 = r14;
/* 2320 */                                                      if (m10475r() > i2) {
/* 2322 */                                                          this.f9I0 = r17;
/* 2326 */                                                          this.f20415U[0] = enumC2516yz5;
/* 2328 */                                                          m10464P(i2);
/* 2331 */                                                          ?? r113 = r17;
/* 2332 */                                                          z7 = r113 == true ? 1 : 0;
                                                                    r14 = r113;
                                                                }
                                                            }
                                                            r14 = r14;
                                                            r14 = r14;
/* 2338 */                                                  if (this.f20415U[r17] == enumC2516yz8) {
                                                                r14 = z9;
/* 2362 */                                                      z4 = z7;
/* 2364 */                                                      i8 = 8;
                                                                r18 = r14;
                                                            } else {
                                                                r14 = z9;
/* 2362 */                                                      z4 = z7;
/* 2364 */                                                      i8 = 8;
                                                                r18 = r14;
                                                            }
                                                        } else {
                                                            r14 = z9;
/* 2362 */                                                  z4 = z7;
/* 2364 */                                                  i8 = 8;
                                                            r18 = r14;
                                                        }
/* 2366 */                                              if (i6 > i8) {
/* 2368 */                                                  r19 = 0;
                                                        } else {
/* 2370 */                                                  r19 = r18;
                                                        }
/* 2371 */                                              i5 = i6;
/* 2372 */                                              z3 = z6;
/* 2374 */                                              enumC2516yz5 = enumC2516yz5;
                                                        r15 = r19;
                                                    }
                                                }
/* 1967 */                                      weakReference4 = this.f14N0;
/* 1969 */                                      if (weakReference4 == null && weakReference4.get() != null) {
                                                    try {
                                                        try {
/* 1997 */                                                  t71Var.m8711f(t71Var.m8716k(this.f20406L), t71Var.m8716k((C2051oz) this.f14N0.get()), 0, 5);
                                                            try {
/* 2001 */                                                      this.f14N0 = null;
                                                            } catch (Exception e5) {
/* 2004 */                                                      e = e5;
/* 1871 */                                                      r110 = 1;
/* 2028 */                                                      e.printStackTrace();
/* 2049 */                                                      System.out.println("EXCEPTION : " + e);
                                                                r16 = r110;
                                                            }
                                                        } catch (Exception e6) {
/* 2007 */                                                  e = e6;
/* 1871 */                                                  r110 = 1;
/* 2028 */                                                  e.printStackTrace();
/* 2049 */                                                  System.out.println("EXCEPTION : " + e);
                                                            r16 = r110;
/* 2052 */                                                  if (r16 != 0) {
/* 2058 */                                                      zArr[2] = false;
/* 2062 */                                                      zM10X2 = m10X(64);
/* 2066 */                                                      mo1424R(t71Var, zM10X2);
/* 2071 */                                                      size = this.f17u0.size();
/* 2075 */                                                      z10 = false;
/* 2076 */                                                      i9 = 0;
/* 2077 */                                                      while (i9 < size) {
/* 2085 */                                                          c2569zz = (C2569zz) this.f17u0.get(i9);
/* 2087 */                                                          c2569zz.mo1424R(t71Var, zM10X2);
/* 2090 */                                                          boolean z112 = zM10X2;
/* 2094 */                                                          int i45 = size;
/* 2097 */                                                          if (c2569zz.f20435h == -1) {
/* 2103 */                                                              z10 = true;
                                                                    } else {
/* 2103 */                                                              z10 = true;
                                                                    }
/* 2104 */                                                          i9++;
/* 2106 */                                                          zM10X2 = z112;
/* 2108 */                                                          size = i45;
                                                                    z10 = z10;
                                                                }
                                                                z8 = z10;
                                                            } else {
/* 2116 */                                                      mo1424R(t71Var, zM10X);
/* 2120 */                                                      while (i7 < i3) {
/* 2130 */                                                          ((C2569zz) this.f17u0.get(i7)).mo1424R(t71Var, zM10X);
                                                                }
/* 2136 */                                                      z8 = false;
                                                            }
/* 2139 */                                                  if (!z6) {
                                                            }
/* 2253 */                                                  iMax = Math.max(this.f20428d0, m10475r());
                                                            z9 = z8;
/* 2261 */                                                  if (iMax > m10475r()) {
/* 2263 */                                                      m10464P(iMax);
/* 2270 */                                                      this.f20415U[0] = enumC2516yz5;
/* 2272 */                                                      z9 = true;
/* 2273 */                                                      z7 = true;
                                                            }
/* 2281 */                                                  iMax2 = Math.max(this.f20430e0, m10472l());
/* 2289 */                                                  if (iMax2 > m10472l()) {
/* 2291 */                                                      m10461M(iMax2);
/* 2296 */                                                      r17 = 1;
/* 2297 */                                                      this.f20415U[1] = enumC2516yz5;
/* 2299 */                                                      r14 = 1;
/* 2300 */                                                      z7 = true;
                                                            } else {
/* 2303 */                                                      r17 = 1;
                                                            }
/* 2304 */                                                  if (z7) {
                                                                r14 = z9;
/* 2312 */                                                      if (this.f20415U[0] == enumC2516yz8) {
                                                                    r14 = r14;
/* 2320 */                                                          if (m10475r() > i2) {
/* 2322 */                                                              this.f9I0 = r17;
/* 2326 */                                                              this.f20415U[0] = enumC2516yz5;
/* 2328 */                                                              m10464P(i2);
/* 2331 */                                                              ?? r114 = r17;
/* 2332 */                                                              z7 = r114 == true ? 1 : 0;
                                                                        r14 = r114;
                                                                    }
                                                                }
                                                                r14 = r14;
                                                                r14 = r14;
/* 2338 */                                                      if (this.f20415U[r17] == enumC2516yz8) {
                                                                    r14 = z9;
/* 2362 */                                                          z4 = z7;
/* 2364 */                                                          i8 = 8;
                                                                    r18 = r14;
                                                                } else {
                                                                    r14 = z9;
/* 2362 */                                                          z4 = z7;
/* 2364 */                                                          i8 = 8;
                                                                    r18 = r14;
                                                                }
                                                            } else {
                                                                r14 = z9;
/* 2362 */                                                      z4 = z7;
/* 2364 */                                                      i8 = 8;
                                                                r18 = r14;
                                                            }
/* 2366 */                                                  if (i6 > i8) {
/* 2368 */                                                      r19 = 0;
                                                            } else {
/* 2370 */                                                      r19 = r18;
                                                            }
/* 2371 */                                                  i5 = i6;
/* 2372 */                                                  z3 = z6;
/* 2374 */                                                  enumC2516yz5 = enumC2516yz5;
                                                            r15 = r19;
                                                        }
                                                    } catch (Exception e7) {
/* 2011 */                                              e = e7;
                                                    }
                                                }
/* 2016 */                                      t71Var.m8720p();
/* 2021 */                                      r16 = 1;
                                            } catch (Exception e8) {
/* 1884 */                                      e = e8;
                                            }
                                        } catch (Exception e9) {
/* 1817 */                                  e = e9;
/* 1818 */                                  z7 = z4;
                                            r110 = r15;
/* 2028 */                                  e.printStackTrace();
/* 2049 */                                  System.out.println("EXCEPTION : " + e);
                                            r16 = r110;
/* 2052 */                                  if (r16 != 0) {
/* 2058 */                                      zArr[2] = false;
/* 2062 */                                      zM10X2 = m10X(64);
/* 2066 */                                      mo1424R(t71Var, zM10X2);
/* 2071 */                                      size = this.f17u0.size();
/* 2075 */                                      z10 = false;
/* 2076 */                                      i9 = 0;
/* 2077 */                                      while (i9 < size) {
/* 2085 */                                          c2569zz = (C2569zz) this.f17u0.get(i9);
/* 2087 */                                          c2569zz.mo1424R(t71Var, zM10X2);
/* 2090 */                                          boolean z113 = zM10X2;
/* 2094 */                                          int i46 = size;
/* 2097 */                                          if (c2569zz.f20435h == -1) {
/* 2103 */                                              z10 = true;
                                                    } else {
/* 2103 */                                              z10 = true;
                                                    }
/* 2104 */                                          i9++;
/* 2106 */                                          zM10X2 = z113;
/* 2108 */                                          size = i46;
                                                    z10 = z10;
                                                }
                                                z8 = z10;
                                            } else {
/* 2116 */                                      mo1424R(t71Var, zM10X);
/* 2120 */                                      while (i7 < i3) {
/* 2130 */                                          ((C2569zz) this.f17u0.get(i7)).mo1424R(t71Var, zM10X);
                                                }
/* 2136 */                                      z8 = false;
                                            }
/* 2139 */                                  if (!z6) {
                                            }
/* 2253 */                                  iMax = Math.max(this.f20428d0, m10475r());
                                            z9 = z8;
/* 2261 */                                  if (iMax > m10475r()) {
/* 2263 */                                      m10464P(iMax);
/* 2270 */                                      this.f20415U[0] = enumC2516yz5;
/* 2272 */                                      z9 = true;
/* 2273 */                                      z7 = true;
                                            }
/* 2281 */                                  iMax2 = Math.max(this.f20430e0, m10472l());
/* 2289 */                                  if (iMax2 > m10472l()) {
/* 2291 */                                      m10461M(iMax2);
/* 2296 */                                      r17 = 1;
/* 2297 */                                      this.f20415U[1] = enumC2516yz5;
/* 2299 */                                      r14 = 1;
/* 2300 */                                      z7 = true;
                                            } else {
/* 2303 */                                      r17 = 1;
                                            }
/* 2304 */                                  if (z7) {
                                                r14 = z9;
/* 2312 */                                      if (this.f20415U[0] == enumC2516yz8) {
                                                    r14 = r14;
/* 2320 */                                          if (m10475r() > i2) {
/* 2322 */                                              this.f9I0 = r17;
/* 2326 */                                              this.f20415U[0] = enumC2516yz5;
/* 2328 */                                              m10464P(i2);
/* 2331 */                                              ?? r115 = r17;
/* 2332 */                                              z7 = r115 == true ? 1 : 0;
                                                        r14 = r115;
                                                    }
                                                }
                                                r14 = r14;
                                                r14 = r14;
/* 2338 */                                      if (this.f20415U[r17] == enumC2516yz8) {
                                                    r14 = z9;
/* 2362 */                                          z4 = z7;
/* 2364 */                                          i8 = 8;
                                                    r18 = r14;
                                                } else {
                                                    r14 = z9;
/* 2362 */                                          z4 = z7;
/* 2364 */                                          i8 = 8;
                                                    r18 = r14;
                                                }
                                            } else {
                                                r14 = z9;
/* 2362 */                                      z4 = z7;
/* 2364 */                                      i8 = 8;
                                                r18 = r14;
                                            }
/* 2366 */                                  if (i6 > i8) {
/* 2368 */                                      r19 = 0;
                                            } else {
/* 2370 */                                      r19 = r18;
                                            }
/* 2371 */                                  i5 = i6;
/* 2372 */                                  z3 = z6;
/* 2374 */                                  enumC2516yz5 = enumC2516yz5;
                                            r15 = r19;
                                        }
                                    } catch (Exception e10) {
/* 2023 */                              e = e10;
/* 2024 */                              z6 = z3;
                                    }
/* 2052 */                          if (r16 != 0) {
/* 2058 */                              zArr[2] = false;
/* 2062 */                              zM10X2 = m10X(64);
/* 2066 */                              mo1424R(t71Var, zM10X2);
/* 2071 */                              size = this.f17u0.size();
/* 2075 */                              z10 = false;
/* 2076 */                              i9 = 0;
/* 2077 */                              while (i9 < size) {
/* 2085 */                                  c2569zz = (C2569zz) this.f17u0.get(i9);
/* 2087 */                                  c2569zz.mo1424R(t71Var, zM10X2);
/* 2090 */                                  boolean z114 = zM10X2;
/* 2094 */                                  int i47 = size;
/* 2097 */                                  if (c2569zz.f20435h == -1 || c2569zz.f20437i != -1) {
/* 2103 */                                      z10 = true;
                                            }
/* 2104 */                                  i9++;
/* 2106 */                                  zM10X2 = z114;
/* 2108 */                                  size = i47;
                                            z10 = z10;
                                        }
                                        z8 = z10;
                                    } else {
/* 2116 */                              mo1424R(t71Var, zM10X);
/* 2120 */                              while (i7 < i3) {
/* 2130 */                                  ((C2569zz) this.f17u0.get(i7)).mo1424R(t71Var, zM10X);
                                        }
/* 2136 */                              z8 = false;
                                    }
/* 2139 */                          if (!z6 && i6 < 8) {
/* 2147 */                              if (zArr[2]) {
/* 2150 */                                  int iMax5 = 0;
/* 2151 */                                  int iMax6 = 0;
/* 2152 */                                  for (int i48 = 0; i48 < i3; i48++) {
/* 2160 */                                      C2569zz c2569zz13 = (C2569zz) this.f17u0.get(i48);
/* 2172 */                                      iMax6 = Math.max(iMax6, c2569zz13.m10475r() + c2569zz13.f20422a0);
/* 2183 */                                      iMax5 = Math.max(iMax5, c2569zz13.m10472l() + c2569zz13.f20424b0);
                                            }
/* 2194 */                                  int iMax7 = Math.max(this.f20428d0, iMax6);
/* 2200 */                                  int iMax8 = Math.max(this.f20430e0, iMax5);
                                            z8 = z8;
/* 2204 */                                  if (enumC2516yz3 == enumC2516yz8 && m10475r() < iMax7) {
                                                z8 = z8;
/* 2212 */                                      m10464P(iMax7);
/* 2219 */                                      this.f20415U[0] = enumC2516yz8;
/* 2221 */                                      z8 = true;
/* 2222 */                                      z7 = true;
                                            }
/* 2224 */                                  if (enumC2516yz2 == enumC2516yz8 && m10472l() < iMax8) {
/* 2232 */                                      m10461M(iMax8);
/* 2239 */                                      this.f20415U[1] = enumC2516yz8;
/* 2241 */                                      z8 = true;
/* 2242 */                                      z7 = true;
                                            }
                                        }
                                    }
/* 2253 */                          iMax = Math.max(this.f20428d0, m10475r());
                                    z9 = z8;
/* 2261 */                          if (iMax > m10475r()) {
/* 2263 */                              m10464P(iMax);
/* 2270 */                              this.f20415U[0] = enumC2516yz5;
/* 2272 */                              z9 = true;
/* 2273 */                              z7 = true;
                                    }
/* 2281 */                          iMax2 = Math.max(this.f20430e0, m10472l());
/* 2289 */                          if (iMax2 > m10472l()) {
/* 2291 */                              m10461M(iMax2);
/* 2296 */                              r17 = 1;
/* 2297 */                              this.f20415U[1] = enumC2516yz5;
/* 2299 */                              r14 = 1;
/* 2300 */                              z7 = true;
                                    } else {
/* 2303 */                              r17 = 1;
                                    }
/* 2304 */                          if (z7) {
                                        r14 = z9;
/* 2312 */                              if (this.f20415U[0] == enumC2516yz8 && i2 > 0) {
                                            r14 = r14;
/* 2320 */                                  if (m10475r() > i2) {
/* 2322 */                                      this.f9I0 = r17;
/* 2326 */                                      this.f20415U[0] = enumC2516yz5;
/* 2328 */                                      m10464P(i2);
/* 2331 */                                      ?? r116 = r17;
/* 2332 */                                      z7 = r116 == true ? 1 : 0;
                                                r14 = r116;
                                            }
                                        }
                                        r14 = r14;
                                        r14 = r14;
/* 2338 */                              if (this.f20415U[r17] == enumC2516yz8 || iM10472l <= 0 || m10472l() <= iM10472l) {
                                            r14 = z9;
/* 2362 */                                  z4 = z7;
/* 2364 */                                  i8 = 8;
                                            r18 = r14;
                                        } else {
/* 2348 */                                  this.f10J0 = r17;
/* 2352 */                                  this.f20415U[r17] = enumC2516yz5;
/* 2354 */                                  m10461M(iM10472l);
/* 2357 */                                  i8 = 8;
/* 2359 */                                  z4 = true;
/* 2360 */                                  r18 = 1;
                                        }
                                    } else {
                                        r14 = z9;
/* 2362 */                              z4 = z7;
/* 2364 */                              i8 = 8;
                                        r18 = r14;
                                    }
/* 2366 */                          if (i6 > i8) {
/* 2368 */                              r19 = 0;
                                    } else {
/* 2370 */                              r19 = r18;
                                    }
/* 2371 */                          i5 = i6;
/* 2372 */                          z3 = z6;
/* 2374 */                          enumC2516yz5 = enumC2516yz5;
                                    r15 = r19;
                                }
/* 2380 */                      z5 = z4;
/* 2382 */                      this.f17u0 = arrayList22;
/* 2384 */                      if (z5) {
/* 2386 */                          EnumC2516yz[] enumC2516yzArr7 = this.f20415U;
/* 2390 */                          enumC2516yzArr7[0] = enumC2516yz3;
/* 2394 */                          enumC2516yzArr7[1] = enumC2516yz2;
                                }
/* 2398 */                      mo4G(t71Var.f16944l);
                            }
/* 669 */                   C2569zz c2569zz14 = (C2569zz) arrayList3.get(i28);
/* 671 */                   EnumC2516yz[] enumC2516yzArr8 = this.f20415U;
/* 673 */                   int i49 = i28;
/* 677 */                   EnumC2516yz enumC2516yz11 = enumC2516yzArr8[0];
/* 681 */                   EnumC2516yz enumC2516yz12 = enumC2516yzArr8[1];
/* 683 */                   c2051oz2 = c2051oz5;
/* 685 */                   EnumC2516yz[] enumC2516yzArr9 = c2569zz14.f20415U;
/* 691 */                   i = size2;
/* 699 */                   if (kb1.m6046V(enumC2516yz11, enumC2516yz12, enumC2516yzArr9[0], enumC2516yzArr9[1]) && !(c2569zz14 instanceof gk0)) {
/* 707 */                       i28 = i49 + 1;
/* 709 */                       c2051oz5 = c2051oz2;
/* 711 */                       size2 = i;
                            }
                        }
                    }
/* 1689 */          i2 = iMax3;
/* 1690 */          iM10472l = iMax4;
/* 1691 */          z = false;
/* 1698 */          if (m10X(64)) {
/* 1711 */              z2 = true;
                    } else {
/* 1711 */              z2 = true;
                    }
/* 1712 */          t71Var.getClass();
/* 1716 */          t71Var.f16939g = false;
/* 1720 */          if (this.f8H0 == 0) {
/* 1728 */              c = 1;
                    } else {
/* 1728 */              c = 1;
                    }
/* 1729 */          ArrayList arrayList23 = this.f17u0;
/* 1731 */          enumC2516yzArr = this.f20415U;
/* 1735 */          if (enumC2516yzArr[0] != enumC2516yz8) {
/* 1744 */              z3 = true;
                    } else {
/* 1744 */              z3 = true;
                    }
/* 1745 */          this.f4D0 = 0;
/* 1747 */          this.f5E0 = 0;
/* 1749 */          i3 = i;
/* 1752 */          while (i4 < i3) {
/* 1760 */              c2569zz2 = (C2569zz) this.f17u0.get(i4);
/* 1764 */              if (c2569zz2 instanceof a00) {
/* 1768 */                  ((a00) c2569zz2).m9V();
                        }
                    }
/* 1774 */          zM10X = m10X(64);
/* 1778 */          z4 = z;
/* 1779 */          i5 = 0;
/* 1780 */          r15 = 1;
/* 1781 */          while (r15 != 0) {
/* 1785 */              i6 = i5 + 1;
/* 1787 */              t71Var.m8724t();
/* 1790 */              z6 = z3;
/* 1793 */              this.f4D0 = 0;
/* 1795 */              this.f5E0 = 0;
/* 1797 */              m10469h(t71Var);
/* 1801 */              while (i10 < i3) {
/* 1811 */                  ((C2569zz) this.f17u0.get(i10)).m10469h(t71Var);
                        }
/* 1824 */              m7T(t71Var);
/* 1827 */              weakReference = this.f11K0;
/* 1829 */              if (weakReference != null) {
/* 1886 */                  z7 = z4;
/* 1888 */                  weakReference2 = this.f13M0;
/* 1890 */                  if (weakReference2 != null) {
/* 1918 */                      t71Var.m8711f(t71Var.m8716k(this.f20407M), t71Var.m8716k((C2051oz) this.f13M0.get()), 0, 5);
/* 1922 */                      this.f13M0 = null;
                            }
/* 1924 */                  weakReference3 = this.f12L0;
/* 1926 */                  if (weakReference3 != null) {
/* 1942 */                      c2051oz3 = c2051oz;
/* 1952 */                      c2051oz = c2051oz3;
/* 1956 */                      t71Var.m8711f(t71Var.m8716k((C2051oz) this.f12L0.get()), t71Var.m8716k(c2051oz3), 0, 5);
/* 1960 */                      this.f12L0 = null;
                            }
/* 1967 */                  weakReference4 = this.f14N0;
/* 1969 */                  if (weakReference4 == null) {
                            }
/* 2016 */                  t71Var.m8720p();
/* 2021 */                  r16 = 1;
                        } else {
/* 1886 */                  z7 = z4;
/* 1888 */                  weakReference2 = this.f13M0;
/* 1890 */                  if (weakReference2 != null) {
/* 1918 */                      t71Var.m8711f(t71Var.m8716k(this.f20407M), t71Var.m8716k((C2051oz) this.f13M0.get()), 0, 5);
/* 1922 */                      this.f13M0 = null;
                            }
/* 1924 */                  weakReference3 = this.f12L0;
/* 1926 */                  if (weakReference3 != null) {
/* 1942 */                      c2051oz3 = c2051oz;
/* 1952 */                      c2051oz = c2051oz3;
/* 1956 */                      t71Var.m8711f(t71Var.m8716k((C2051oz) this.f12L0.get()), t71Var.m8716k(c2051oz3), 0, 5);
/* 1960 */                      this.f12L0 = null;
                            }
/* 1967 */                  weakReference4 = this.f14N0;
/* 1969 */                  if (weakReference4 == null) {
                            }
/* 2016 */                  t71Var.m8720p();
/* 2021 */                  r16 = 1;
                        }
/* 2052 */              if (r16 != 0) {
/* 2058 */                  zArr[2] = false;
/* 2062 */                  zM10X2 = m10X(64);
/* 2066 */                  mo1424R(t71Var, zM10X2);
/* 2071 */                  size = this.f17u0.size();
/* 2075 */                  z10 = false;
/* 2076 */                  i9 = 0;
/* 2077 */                  while (i9 < size) {
/* 2085 */                      c2569zz = (C2569zz) this.f17u0.get(i9);
/* 2087 */                      c2569zz.mo1424R(t71Var, zM10X2);
/* 2090 */                      boolean z115 = zM10X2;
/* 2094 */                      int i410 = size;
/* 2097 */                      if (c2569zz.f20435h == -1) {
/* 2103 */                          z10 = true;
                                } else {
/* 2103 */                          z10 = true;
                                }
/* 2104 */                      i9++;
/* 2106 */                      zM10X2 = z115;
/* 2108 */                      size = i410;
                                z10 = z10;
                            }
                            z8 = z10;
                        } else {
/* 2116 */                  mo1424R(t71Var, zM10X);
/* 2120 */                  while (i7 < i3) {
/* 2130 */                      ((C2569zz) this.f17u0.get(i7)).mo1424R(t71Var, zM10X);
                            }
/* 2136 */                  z8 = false;
                        }
/* 2139 */              if (!z6) {
                        }
/* 2253 */              iMax = Math.max(this.f20428d0, m10475r());
                        z9 = z8;
/* 2261 */              if (iMax > m10475r()) {
/* 2263 */                  m10464P(iMax);
/* 2270 */                  this.f20415U[0] = enumC2516yz5;
/* 2272 */                  z9 = true;
/* 2273 */                  z7 = true;
                        }
/* 2281 */              iMax2 = Math.max(this.f20430e0, m10472l());
/* 2289 */              if (iMax2 > m10472l()) {
/* 2291 */                  m10461M(iMax2);
/* 2296 */                  r17 = 1;
/* 2297 */                  this.f20415U[1] = enumC2516yz5;
/* 2299 */                  r14 = 1;
/* 2300 */                  z7 = true;
                        } else {
/* 2303 */                  r17 = 1;
                        }
/* 2304 */              if (z7) {
                            r14 = z9;
/* 2312 */                  if (this.f20415U[0] == enumC2516yz8) {
                                r14 = r14;
/* 2320 */                      if (m10475r() > i2) {
/* 2322 */                          this.f9I0 = r17;
/* 2326 */                          this.f20415U[0] = enumC2516yz5;
/* 2328 */                          m10464P(i2);
/* 2331 */                          ?? r117 = r17;
/* 2332 */                          z7 = r117 == true ? 1 : 0;
                                    r14 = r117;
                                }
                            }
                            r14 = r14;
                            r14 = r14;
/* 2338 */                  if (this.f20415U[r17] == enumC2516yz8) {
                                r14 = z9;
/* 2362 */                      z4 = z7;
/* 2364 */                      i8 = 8;
                                r18 = r14;
                            } else {
                                r14 = z9;
/* 2362 */                      z4 = z7;
/* 2364 */                      i8 = 8;
                                r18 = r14;
                            }
                        } else {
                            r14 = z9;
/* 2362 */                  z4 = z7;
/* 2364 */                  i8 = 8;
                            r18 = r14;
                        }
/* 2366 */              if (i6 > i8) {
/* 2368 */                  r19 = 0;
                        } else {
/* 2370 */                  r19 = r18;
                        }
/* 2371 */              i5 = i6;
/* 2372 */              z3 = z6;
/* 2374 */              enumC2516yz5 = enumC2516yz5;
                        r15 = r19;
                    }
/* 2380 */          z5 = z4;
/* 2382 */          this.f17u0 = arrayList23;
/* 2384 */          if (z5) {
/* 2386 */              EnumC2516yz[] enumC2516yzArr10 = this.f20415U;
/* 2390 */              enumC2516yzArr10[0] = enumC2516yz3;
/* 2394 */              enumC2516yzArr10[1] = enumC2516yz2;
                    }
/* 2398 */          mo4G(t71Var.f16944l);
                }

                /* JADX INFO: renamed from: X */
                public final boolean m10X(int i) {
                    return (this.f8H0 & i) == i;
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: o */
                public final void mo11o(StringBuilder sb) {
/* 20 */            sb.append(this.f20439j + ":{\n");
/* 27 */            StringBuilder sb2 = new StringBuilder("  actualWidth:");
/* 32 */            sb2.append(this.f20417W);
/* 39 */            sb.append(sb2.toString());
/* 44 */            sb.append("\n");
/* 63 */            sb.append("  actualHeight:" + this.f20418X);
/* 66 */            sb.append("\n");
/* 71 */            Iterator it = this.f17u0.iterator();
/* 79 */            while (it.hasNext()) {
/* 87 */                ((C2569zz) it.next()).mo11o(sb);
/* 92 */                sb.append(",\n");
                    }
/* 98 */            sb.append("}");
                }
            }
