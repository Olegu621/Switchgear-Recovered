            package p000;

            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class uu0 extends l73 {

                /* JADX INFO: renamed from: k */
                public static final int[] f17722k = new int[2];

                /* JADX INFO: renamed from: m */
                public static void m9138m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
/* 1 */             int i6 = i2 - i;
/* 2 */             int i7 = i4 - i3;
/* 8 */             if (i5 != -1) {
/* 10 */                if (i5 == 0) {
/* 28 */                    iArr[0] = (int) ((i7 * f) + 0.5f);
/* 30 */                    iArr[1] = i7;
/* 32 */                    return;
                        } else {
/* 12 */                    if (i5 != 1) {
/* 54 */                        return;
                            }
/* 19 */                    iArr[0] = i6;
/* 21 */                    iArr[1] = (int) ((i6 * f) + 0.5f);
/* 23 */                    return;
                        }
                    }
/* 36 */            int i8 = (int) ((i7 * f) + 0.5f);
/* 40 */            int i9 = (int) ((i6 / f) + 0.5f);
/* 41 */            if (i8 <= i6) {
/* 43 */                iArr[0] = i8;
/* 45 */                iArr[1] = i7;
                    } else if (i9 <= i7) {
/* 50 */                iArr[0] = i6;
/* 52 */                iArr[1] = i9;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:116:0x026a  */
                /* JADX WARN: Code duplicated, block: B:118:0x027a  */
                /* JADX WARN: Code duplicated, block: B:11:0x0028  */
                @Override // p000.s70
                /* JADX INFO: renamed from: a */
                public final void mo1441a(s70 s70Var) {
                    float f;
                    int iM6398g;
                    int i;
                    int iM6398g2;
                    float f2;
                    float f3;
                    float f4;
                    int i2;
/* 11 */            if (AbstractC0886en.m3520y(this.f13144j) == 3) {
/* 894 */               C2569zz c2569zz = this.f13136b;
/* 900 */               m6399l(c2569zz.f20404J, c2569zz.f20406L, 0);
/* 903 */               return;
                    }
/* 13 */            n80 n80Var = this.f13139e;
/* 15 */            boolean z = n80Var.f17890j;
/* 17 */            EnumC2516yz enumC2516yz = EnumC2516yz.f19867c;
/* 22 */            v70 v70Var = this.f13142h;
/* 24 */            v70 v70Var2 = this.f13143i;
/* 26 */            if (z || this.f13138d != enumC2516yz) {
/* 41 */                f = 0.5f;
                    } else {
/* 32 */                C2569zz c2569zz2 = this.f13136b;
/* 34 */                int i3 = c2569zz2.f20455r;
/* 37 */                if (i3 == 2) {
/* 653 */                   f = 0.5f;
/* 655 */                   C2569zz c2569zz3 = c2569zz2.f20416V;
/* 657 */                   if (c2569zz3 != null) {
/* 661 */                       n80 n80Var2 = c2569zz3.f20427d.f13139e;
/* 665 */                       if (n80Var2.f17890j) {
/* 676 */                           n80Var.mo6945d((int) ((n80Var2.f17887g * c2569zz2.f20463w) + 0.5f));
                                }
                            }
                        } else if (i3 == 3) {
/* 45 */                    int i4 = c2569zz2.f20457s;
/* 48 */                    if (i4 == 0 || i4 == 3) {
/* 101 */                       k23 k23Var = c2569zz2.f20429e;
/* 103 */                       v70 v70Var3 = k23Var.f13142h;
/* 105 */                       v70 v70Var4 = k23Var.f13143i;
/* 115 */                       boolean z2 = c2569zz2.f20404J.f14929f != null;
/* 124 */                       boolean z3 = c2569zz2.f20405K.f14929f != null;
/* 133 */                       boolean z4 = c2569zz2.f20406L.f14929f != null;
/* 144 */                       boolean z5 = c2569zz2.f20407M.f14929f != null;
/* 141 */                       f = 0.5f;
/* 146 */                       int i5 = c2569zz2.f20420Z;
/* 148 */                       if (z2 && z3 && z4 && z5) {
/* 156 */                           float f5 = c2569zz2.f20419Y;
/* 158 */                           boolean z6 = v70Var3.f17890j;
/* 160 */                           ArrayList arrayList = v70Var3.f17892l;
/* 162 */                           int[] iArr = f17722k;
/* 164 */                           if (z6 && v70Var4.f17890j) {
/* 172 */                               if (v70Var.f17883c && v70Var2.f17883c) {
/* 224 */                                   m9138m(iArr, ((v70) v70Var.f17892l.get(0)).f17887g + v70Var.f17886f, ((v70) v70Var2.f17892l.get(0)).f17887g - v70Var2.f17886f, v70Var3.f17887g + v70Var3.f17886f, v70Var4.f17887g - v70Var4.f17886f, f5, i5);
/* 229 */                                   n80Var.mo6945d(iArr[0]);
/* 240 */                                   this.f13136b.f20429e.f13139e.mo6945d(iArr[1]);
/* 243 */                                   return;
                                        }
/* 893 */                               return;
                                    }
/* 250 */                           if (v70Var.f17890j && v70Var2.f17890j) {
/* 258 */                               if (!v70Var3.f17883c || !v70Var4.f17883c) {
/* 893 */                                   return;
                                        }
/* 304 */                               m9138m(iArr, v70Var.f17887g + v70Var.f17886f, v70Var2.f17887g - v70Var2.f17886f, ((v70) arrayList.get(0)).f17887g + v70Var3.f17886f, ((v70) v70Var4.f17892l.get(0)).f17887g - v70Var4.f17886f, f5, i5);
/* 309 */                               n80Var.mo6945d(iArr[0]);
/* 320 */                               this.f13136b.f20429e.f13139e.mo6945d(iArr[1]);
                                    }
/* 325 */                           if (!v70Var.f17883c || !v70Var2.f17883c || !v70Var3.f17883c || !v70Var4.f17883c) {
/* 893 */                               return;
                                    }
/* 395 */                           m9138m(iArr, ((v70) v70Var.f17892l.get(0)).f17887g + v70Var.f17886f, ((v70) v70Var2.f17892l.get(0)).f17887g - v70Var2.f17886f, ((v70) arrayList.get(0)).f17887g + v70Var3.f17886f, ((v70) v70Var4.f17892l.get(0)).f17887g - v70Var4.f17886f, f5, i5);
/* 400 */                           n80Var.mo6945d(iArr[0]);
/* 411 */                           this.f13136b.f20429e.f13139e.mo6945d(iArr[1]);
                                } else if (z2 && z4) {
/* 422 */                           if (!v70Var.f17883c || !v70Var2.f17883c) {
/* 893 */                               return;
                                    }
/* 430 */                           float f6 = c2569zz2.f20419Y;
/* 444 */                           int i6 = ((v70) v70Var.f17892l.get(0)).f17887g + v70Var.f17886f;
/* 457 */                           int i7 = ((v70) v70Var2.f17892l.get(0)).f17887g - v70Var2.f17886f;
/* 458 */                           if (i5 == -1 || i5 == 0) {
/* 502 */                               int iM6398g3 = m6398g(i7 - i6, 0);
/* 510 */                               int i8 = (int) ((iM6398g3 * f6) + 0.5f);
/* 511 */                               int iM6398g4 = m6398g(i8, 1);
/* 515 */                               if (i8 != iM6398g4) {
/* 521 */                                   iM6398g3 = (int) ((iM6398g4 / f6) + 0.5f);
                                        }
/* 522 */                               n80Var.mo6945d(iM6398g3);
/* 531 */                               this.f13136b.f20429e.f13139e.mo6945d(iM6398g4);
                                    } else if (i5 == 1) {
/* 467 */                               int iM6398g5 = m6398g(i7 - i6, 0);
/* 475 */                               int i9 = (int) ((iM6398g5 / f6) + 0.5f);
/* 476 */                               int iM6398g6 = m6398g(i9, 1);
/* 480 */                               if (i9 != iM6398g6) {
/* 486 */                                   iM6398g5 = (int) ((iM6398g6 * f6) + 0.5f);
                                        }
/* 487 */                               n80Var.mo6945d(iM6398g5);
/* 496 */                               this.f13136b.f20429e.f13139e.mo6945d(iM6398g6);
                                    }
                                } else if (z3 && z5) {
/* 542 */                           if (!v70Var3.f17883c || !v70Var4.f17883c) {
/* 893 */                               return;
                                    }
/* 550 */                           float f7 = c2569zz2.f20419Y;
/* 564 */                           int i10 = ((v70) v70Var3.f17892l.get(0)).f17887g + v70Var3.f17886f;
/* 577 */                           int i11 = ((v70) v70Var4.f17892l.get(0)).f17887g - v70Var4.f17886f;
/* 578 */                           if (i5 == -1) {
/* 620 */                               iM6398g = m6398g(i11 - i10, 1);
/* 628 */                               i = (int) ((iM6398g / f7) + 0.5f);
/* 629 */                               iM6398g2 = m6398g(i, 0);
/* 633 */                               if (i != iM6398g2) {
/* 639 */                                   iM6398g = (int) ((iM6398g2 * f7) + 0.5f);
                                        }
/* 640 */                               n80Var.mo6945d(iM6398g2);
/* 649 */                               this.f13136b.f20429e.f13139e.mo6945d(iM6398g);
                                    } else if (i5 == 0) {
/* 586 */                               int iM6398g7 = m6398g(i11 - i10, 1);
/* 594 */                               int i12 = (int) ((iM6398g7 * f7) + 0.5f);
/* 595 */                               int iM6398g8 = m6398g(i12, 0);
/* 599 */                               if (i12 != iM6398g8) {
/* 605 */                                   iM6398g7 = (int) ((iM6398g8 / f7) + 0.5f);
                                        }
/* 606 */                               n80Var.mo6945d(iM6398g8);
/* 615 */                               this.f13136b.f20429e.f13139e.mo6945d(iM6398g7);
                                    } else if (i5 == 1) {
/* 620 */                               iM6398g = m6398g(i11 - i10, 1);
/* 628 */                               i = (int) ((iM6398g / f7) + 0.5f);
/* 629 */                               iM6398g2 = m6398g(i, 0);
/* 633 */                               if (i != iM6398g2) {
/* 639 */                                   iM6398g = (int) ((iM6398g2 * f7) + 0.5f);
                                        }
/* 640 */                               n80Var.mo6945d(iM6398g2);
/* 649 */                               this.f13136b.f20429e.f13139e.mo6945d(iM6398g);
                                    }
                                }
                            } else {
/* 53 */                        int i13 = c2569zz2.f20420Z;
/* 55 */                        if (i13 != -1) {
/* 57 */                            if (i13 == 0) {
/* 85 */                                f4 = c2569zz2.f20429e.f13139e.f17887g / c2569zz2.f20419Y;
/* 74 */                                i2 = (int) (f4 + 0.5f);
                                    } else if (i13 != 1) {
/* 61 */                                i2 = 0;
                                    } else {
/* 67 */                                f2 = c2569zz2.f20429e.f13139e.f17887g;
/* 70 */                                f3 = c2569zz2.f20419Y;
                                    }
/* 97 */                            n80Var.mo6945d(i2);
/* 41 */                            f = 0.5f;
                                } else {
/* 91 */                            f2 = c2569zz2.f20429e.f13139e.f17887g;
/* 94 */                            f3 = c2569zz2.f20419Y;
                                }
/* 72 */                        f4 = f2 * f3;
/* 74 */                        i2 = (int) (f4 + 0.5f);
/* 97 */                        n80Var.mo6945d(i2);
/* 41 */                        f = 0.5f;
                            }
                        } else {
/* 41 */                    f = 0.5f;
                        }
                    }
/* 679 */           boolean z7 = v70Var.f17883c;
/* 681 */           ArrayList arrayList2 = v70Var.f17892l;
/* 683 */           if (z7) {
/* 685 */               boolean z8 = v70Var2.f17883c;
/* 687 */               ArrayList arrayList3 = v70Var2.f17892l;
/* 689 */               if (z8) {
/* 695 */                   if (v70Var.f17890j && v70Var2.f17890j && n80Var.f17890j) {
/* 893 */                       return;
                            }
/* 709 */                   if (!n80Var.f17890j && this.f13138d == enumC2516yz) {
/* 715 */                       C2569zz c2569zz4 = this.f13136b;
/* 719 */                       if (c2569zz4.f20455r == 0 && !c2569zz4.m10482y()) {
/* 731 */                           v70 v70Var5 = (v70) arrayList2.get(0);
/* 737 */                           v70 v70Var6 = (v70) arrayList3.get(0);
/* 743 */                           int i14 = v70Var5.f17887g + v70Var.f17886f;
/* 748 */                           int i15 = v70Var6.f17887g + v70Var2.f17886f;
/* 751 */                           v70Var.mo6945d(i14);
/* 754 */                           v70Var2.mo6945d(i15);
/* 757 */                           n80Var.mo6945d(i15 - i14);
/* 760 */                           return;
                                }
                            }
/* 763 */                   if (!n80Var.f17890j && this.f13138d == enumC2516yz && this.f13135a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
/* 810 */                       int iMin = Math.min((((v70) arrayList3.get(0)).f17887g + v70Var2.f17886f) - (((v70) arrayList2.get(0)).f17887g + v70Var.f17886f), n80Var.f14161m);
/* 814 */                       C2569zz c2569zz5 = this.f13136b;
/* 816 */                       int i16 = c2569zz5.f20462v;
/* 820 */                       int iMax = Math.max(c2569zz5.f20461u, iMin);
/* 824 */                       if (i16 > 0) {
/* 826 */                           iMax = Math.min(i16, iMax);
                                }
/* 830 */                       n80Var.mo6945d(iMax);
                            }
/* 835 */                   if (n80Var.f17890j) {
/* 842 */                       v70 v70Var7 = (v70) arrayList2.get(0);
/* 848 */                       v70 v70Var8 = (v70) arrayList3.get(0);
/* 850 */                       int i17 = v70Var7.f17887g;
/* 854 */                       int i18 = v70Var.f17886f + i17;
/* 855 */                       int i19 = v70Var8.f17887g;
/* 859 */                       int i20 = v70Var2.f17886f + i19;
/* 862 */                       float f8 = this.f13136b.f20432f0;
/* 864 */                       if (v70Var7 == v70Var8) {
/* 866 */                           f8 = f;
                                } else {
/* 869 */                           i17 = i18;
/* 870 */                           i19 = i20;
                                }
/* 882 */                       v70Var.mo6945d((int) ((((i19 - i17) - n80Var.f17887g) * f8) + i17 + f));
/* 890 */                       v70Var2.mo6945d(v70Var.f17887g + n80Var.f17887g);
                            }
                        }
                    }
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: d */
                public final void mo1442d() {
                    C2569zz c2569zz;
                    C2569zz c2569zz2;
                    EnumC2516yz enumC2516yz;
                    C2569zz c2569zz3;
                    C2569zz c2569zz4;
                    EnumC2516yz enumC2516yz2;
/* 1 */             C2569zz c2569zz5 = this.f13136b;
/* 3 */             boolean z = c2569zz5.f20421a;
/* 5 */             n80 n80Var = this.f13139e;
/* 7 */             if (z) {
/* 13 */                n80Var.mo6945d(c2569zz5.m10475r());
                    }
/* 16 */            boolean z2 = n80Var.f17890j;
/* 18 */            ArrayList arrayList = n80Var.f17891k;
/* 20 */            ArrayList arrayList2 = n80Var.f17892l;
/* 22 */            EnumC2516yz enumC2516yz3 = EnumC2516yz.f19868d;
/* 24 */            EnumC2516yz enumC2516yz4 = EnumC2516yz.f19867c;
/* 26 */            EnumC2516yz enumC2516yz5 = EnumC2516yz.f19865a;
/* 29 */            v70 v70Var = this.f13143i;
/* 31 */            v70 v70Var2 = this.f13142h;
/* 33 */            if (!z2) {
/* 35 */                C2569zz c2569zz6 = this.f13136b;
/* 39 */                EnumC2516yz enumC2516yz6 = c2569zz6.f20415U[0];
/* 41 */                this.f13138d = enumC2516yz6;
/* 43 */                if (enumC2516yz6 != enumC2516yz4) {
/* 45 */                    if (enumC2516yz6 == enumC2516yz3 && (c2569zz4 = c2569zz6.f20416V) != null && ((enumC2516yz2 = c2569zz4.f20415U[0]) == enumC2516yz5 || enumC2516yz2 == enumC2516yz3)) {
/* 80 */                        int iM10475r = (c2569zz4.m10475r() - this.f13136b.f20404J.m7247e()) - this.f13136b.f20406L.m7247e();
/* 93 */                        l73.m6394b(v70Var2, c2569zz4.f20427d.f13142h, this.f13136b.f20404J.m7247e());
/* 109 */                       l73.m6394b(v70Var, c2569zz4.f20427d.f13143i, -this.f13136b.f20406L.m7247e());
/* 112 */                       n80Var.mo6945d(iM10475r);
/* 115 */                       return;
                            }
/* 116 */                   if (enumC2516yz6 == enumC2516yz5) {
/* 122 */                       n80Var.mo6945d(c2569zz6.m10475r());
                            }
                        }
                    } else if (this.f13138d == enumC2516yz3 && (c2569zz2 = (c2569zz = this.f13136b).f20416V) != null && ((enumC2516yz = c2569zz2.f20415U[0]) == enumC2516yz5 || enumC2516yz == enumC2516yz3)) {
/* 154 */               l73.m6394b(v70Var2, c2569zz2.f20427d.f13142h, c2569zz.f20404J.m7247e());
/* 170 */               l73.m6394b(v70Var, c2569zz2.f20427d.f13143i, -this.f13136b.f20406L.m7247e());
/* 173 */               return;
                    }
/* 177 */           if (n80Var.f17890j) {
/* 179 */               C2569zz c2569zz7 = this.f13136b;
/* 183 */               if (c2569zz7.f20421a) {
/* 185 */                   C2051oz[] c2051ozArr = c2569zz7.f20412R;
/* 187 */                   C2051oz c2051oz = c2051ozArr[0];
/* 189 */                   C2051oz c2051oz2 = c2051oz.f14929f;
/* 191 */                   if (c2051oz2 != null && c2051ozArr[1].f14929f != null) {
/* 199 */                       boolean zM10482y = c2569zz7.m10482y();
/* 203 */                       C2569zz c2569zz8 = this.f13136b;
/* 205 */                       if (zM10482y) {
/* 215 */                           v70Var2.f17886f = c2569zz8.f20412R[0].m7247e();
/* 228 */                           v70Var.f17886f = -this.f13136b.f20412R[1].m7247e();
/* 230 */                           return;
                                }
/* 235 */                       v70 v70VarM6395h = l73.m6395h(c2569zz8.f20412R[0]);
/* 239 */                       if (v70VarM6395h != null) {
/* 251 */                           l73.m6394b(v70Var2, v70VarM6395h, this.f13136b.f20412R[0].m7247e());
                                }
/* 260 */                       v70 v70VarM6395h2 = l73.m6395h(this.f13136b.f20412R[1]);
/* 264 */                       if (v70VarM6395h2 != null) {
/* 277 */                           l73.m6394b(v70Var, v70VarM6395h2, -this.f13136b.f20412R[1].m7247e());
                                }
/* 280 */                       v70Var2.f17882b = true;
/* 282 */                       v70Var.f17882b = true;
/* 284 */                       return;
                            }
/* 285 */                   if (c2051oz2 != null) {
/* 287 */                       v70 v70VarM6395h3 = l73.m6395h(c2051oz);
/* 291 */                       if (v70VarM6395h3 != null) {
/* 303 */                           l73.m6394b(v70Var2, v70VarM6395h3, this.f13136b.f20412R[0].m7247e());
/* 308 */                           l73.m6394b(v70Var, v70Var2, n80Var.f17887g);
/* 311 */                           return;
                                }
/* 766 */                       return;
                            }
/* 312 */                   C2051oz c2051oz3 = c2051ozArr[1];
/* 316 */                   if (c2051oz3.f14929f != null) {
/* 318 */                       v70 v70VarM6395h4 = l73.m6395h(c2051oz3);
/* 322 */                       if (v70VarM6395h4 != null) {
/* 335 */                           l73.m6394b(v70Var, v70VarM6395h4, -this.f13136b.f20412R[1].m7247e());
/* 341 */                           l73.m6394b(v70Var2, v70Var, -n80Var.f17887g);
/* 344 */                           return;
                                }
/* 766 */                       return;
                            }
/* 347 */                   if ((c2569zz7 instanceof cu0) || c2569zz7.f20416V == null || c2569zz7.mo1430j(7).f14929f != null) {
/* 766 */                       return;
                            }
/* 362 */                   C2569zz c2569zz9 = this.f13136b;
/* 374 */                   l73.m6394b(v70Var2, c2569zz9.f20416V.f20427d.f13142h, c2569zz9.m10476s());
/* 379 */                   l73.m6394b(v70Var, v70Var2, n80Var.f17887g);
/* 382 */                   return;
                        }
                    }
/* 385 */           if (this.f13138d == enumC2516yz4) {
/* 387 */               C2569zz c2569zz10 = this.f13136b;
/* 389 */               int i = c2569zz10.f20455r;
/* 392 */               if (i == 2) {
/* 583 */                   C2569zz c2569zz11 = c2569zz10.f20416V;
/* 585 */                   if (c2569zz11 != null) {
/* 590 */                       n80 n80Var2 = c2569zz11.f20429e.f13139e;
/* 592 */                       arrayList2.add(n80Var2);
/* 597 */                       n80Var2.f17891k.add(n80Var);
/* 600 */                       n80Var.f17882b = true;
/* 602 */                       arrayList.add(v70Var2);
/* 605 */                       arrayList.add(v70Var);
                            }
                        } else if (i == 3) {
/* 401 */                   if (c2569zz10.f20457s == 3) {
/* 403 */                       v70Var2.f17881a = this;
/* 405 */                       v70Var.f17881a = this;
/* 407 */                       k23 k23Var = c2569zz10.f20429e;
/* 411 */                       k23Var.f13142h.f17881a = this;
/* 415 */                       k23Var.f13143i.f17881a = this;
/* 417 */                       n80Var.f17881a = this;
/* 423 */                       if (c2569zz10.m10483z()) {
/* 431 */                           arrayList2.add(this.f13136b.f20429e.f13139e);
/* 442 */                           this.f13136b.f20429e.f13139e.f17891k.add(n80Var);
/* 447 */                           k23 k23Var2 = this.f13136b.f20429e;
/* 451 */                           k23Var2.f13139e.f17881a = this;
/* 455 */                           arrayList2.add(k23Var2.f13142h);
/* 464 */                           arrayList2.add(this.f13136b.f20429e.f13143i);
/* 475 */                           this.f13136b.f20429e.f13142h.f17891k.add(n80Var);
/* 486 */                           this.f13136b.f20429e.f13143i.f17891k.add(n80Var);
                                } else {
/* 493 */                           boolean zM10482y2 = this.f13136b.m10482y();
/* 497 */                           C2569zz c2569zz12 = this.f13136b;
/* 499 */                           if (zM10482y2) {
/* 507 */                               c2569zz12.f20429e.f13139e.f17892l.add(n80Var);
/* 516 */                               arrayList.add(this.f13136b.f20429e.f13139e);
                                    } else {
/* 526 */                               c2569zz12.f20429e.f13139e.f17892l.add(n80Var);
                                    }
                                }
                            } else {
/* 532 */                       n80 n80Var3 = c2569zz10.f20429e.f13139e;
/* 534 */                       arrayList2.add(n80Var3);
/* 539 */                       n80Var3.f17891k.add(n80Var);
/* 550 */                       this.f13136b.f20429e.f13142h.f17891k.add(n80Var);
/* 561 */                       this.f13136b.f20429e.f13143i.f17891k.add(n80Var);
/* 564 */                       n80Var.f17882b = true;
/* 566 */                       arrayList.add(v70Var2);
/* 569 */                       arrayList.add(v70Var);
/* 574 */                       v70Var2.f17892l.add(n80Var);
/* 579 */                       v70Var.f17892l.add(n80Var);
                            }
                        }
                    }
/* 608 */           C2569zz c2569zz13 = this.f13136b;
/* 610 */           C2051oz[] c2051ozArr2 = c2569zz13.f20412R;
/* 612 */           C2051oz c2051oz4 = c2051ozArr2[0];
/* 614 */           C2051oz c2051oz5 = c2051oz4.f14929f;
/* 616 */           if (c2051oz5 != null && c2051ozArr2[1].f14929f != null) {
/* 624 */               boolean zM10482y3 = c2569zz13.m10482y();
/* 628 */               C2569zz c2569zz14 = this.f13136b;
/* 630 */               if (zM10482y3) {
/* 640 */                   v70Var2.f17886f = c2569zz14.f20412R[0].m7247e();
/* 653 */                   v70Var.f17886f = -this.f13136b.f20412R[1].m7247e();
/* 655 */                   return;
                        }
/* 660 */               v70 v70VarM6395h5 = l73.m6395h(c2569zz14.f20412R[0]);
/* 670 */               v70 v70VarM6395h6 = l73.m6395h(this.f13136b.f20412R[1]);
/* 674 */               if (v70VarM6395h5 != null) {
/* 676 */                   v70VarM6395h5.m9226b(this);
                        }
/* 679 */               if (v70VarM6395h6 != null) {
/* 681 */                   v70VarM6395h6.m9226b(this);
                        }
/* 685 */               this.f13144j = 4;
/* 687 */               return;
                    }
/* 688 */           if (c2051oz5 != null) {
/* 690 */               v70 v70VarM6395h7 = l73.m6395h(c2051oz4);
/* 694 */               if (v70VarM6395h7 != null) {
/* 706 */                   l73.m6394b(v70Var2, v70VarM6395h7, this.f13136b.f20412R[0].m7247e());
/* 709 */                   m6397c(v70Var, v70Var2, 1, n80Var);
/* 712 */                   return;
                        }
/* 766 */               return;
                    }
/* 713 */           C2051oz c2051oz6 = c2051ozArr2[1];
/* 717 */           if (c2051oz6.f14929f != null) {
/* 719 */               v70 v70VarM6395h8 = l73.m6395h(c2051oz6);
/* 723 */               if (v70VarM6395h8 != null) {
/* 736 */                   l73.m6394b(v70Var, v70VarM6395h8, -this.f13136b.f20412R[1].m7247e());
/* 740 */                   m6397c(v70Var2, v70Var, -1, n80Var);
/* 743 */                   return;
                        }
/* 766 */               return;
                    }
/* 746 */           if ((c2569zz13 instanceof cu0) || (c2569zz3 = c2569zz13.f20416V) == null) {
/* 766 */               return;
                    }
/* 760 */           l73.m6394b(v70Var2, c2569zz3.f20427d.f13142h, c2569zz13.m10476s());
/* 763 */           m6397c(v70Var, v70Var2, 1, n80Var);
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: e */
                public final void mo1443e() {
/* 1 */             v70 v70Var = this.f13142h;
/* 5 */             if (v70Var.f17890j) {
/* 11 */                this.f13136b.f20422a0 = v70Var.f17887g;
                    }
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: f */
                public final void mo1444f() {
/* 2 */             this.f13137c = null;
/* 6 */             this.f13142h.m9227c();
/* 11 */            this.f13143i.m9227c();
/* 16 */            this.f13139e.m9227c();
/* 20 */            this.f13141g = false;
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: k */
                public final boolean mo1445k() {
                    return this.f13138d != EnumC2516yz.f19867c || this.f13136b.f20455r == 0;
                }

                /* JADX INFO: renamed from: n */
                public final void m9139n() {
/* 2 */             this.f13141g = false;
/* 4 */             v70 v70Var = this.f13142h;
/* 6 */             v70Var.m9227c();
/* 9 */             v70Var.f17890j = false;
/* 11 */            v70 v70Var2 = this.f13143i;
/* 13 */            v70Var2.m9227c();
/* 16 */            v70Var2.f17890j = false;
/* 20 */            this.f13139e.f17890j = false;
                }

                public final String toString() {
/* 15 */            return "HorizontalRun " + this.f13136b.f20442k0;
                }
            }
