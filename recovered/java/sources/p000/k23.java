            package p000;

            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class k23 extends l73 {

                /* JADX INFO: renamed from: k */
                public v70 f12564k;

                /* JADX INFO: renamed from: l */
                public C2256ui f12565l;

                @Override // p000.s70
                /* JADX INFO: renamed from: a */
                public final void mo1441a(s70 s70Var) {
                    float f;
                    float f2;
                    float f3;
                    int i;
/* 9 */             if (AbstractC0886en.m3520y(this.f13144j) == 3) {
/* 323 */               C2569zz c2569zz = this.f13136b;
/* 329 */               m6399l(c2569zz.f20405K, c2569zz.f20407M, 1);
/* 332 */               return;
                    }
/* 11 */            n80 n80Var = this.f13139e;
/* 13 */            boolean z = n80Var.f17883c;
/* 15 */            EnumC2516yz enumC2516yz = EnumC2516yz.f19867c;
/* 20 */            if (z && !n80Var.f17890j && this.f13138d == enumC2516yz) {
/* 30 */                C2569zz c2569zz2 = this.f13136b;
/* 32 */                int i2 = c2569zz2.f20457s;
/* 35 */                if (i2 == 2) {
/* 85 */                    C2569zz c2569zz3 = c2569zz2.f20416V;
/* 87 */                    if (c2569zz3 != null) {
/* 91 */                        n80 n80Var2 = c2569zz3.f20429e.f13139e;
/* 95 */                        if (n80Var2.f17890j) {
/* 105 */                           n80Var.mo6945d((int) ((n80Var2.f17887g * c2569zz2.f20466z) + 0.5f));
                                }
                            }
                        } else if (i2 == 3) {
/* 42 */                    n80 n80Var3 = c2569zz2.f20427d.f13139e;
/* 46 */                    if (n80Var3.f17890j) {
/* 48 */                        int i3 = c2569zz2.f20420Z;
/* 51 */                        if (i3 != -1) {
/* 53 */                            if (i3 == 0) {
/* 73 */                                f3 = n80Var3.f17887g * c2569zz2.f20419Y;
/* 66 */                                i = (int) (f3 + 0.5f);
                                    } else if (i3 != 1) {
/* 57 */                                i = 0;
                                    } else {
/* 59 */                                f = n80Var3.f17887g;
/* 62 */                                f2 = c2569zz2.f20419Y;
                                    }
/* 81 */                            n80Var.mo6945d(i);
                                } else {
/* 75 */                            f = n80Var3.f17887g;
/* 78 */                            f2 = c2569zz2.f20419Y;
                                }
/* 64 */                        f3 = f / f2;
/* 66 */                        i = (int) (f3 + 0.5f);
/* 81 */                        n80Var.mo6945d(i);
                            }
                        }
                    }
/* 108 */           v70 v70Var = this.f13142h;
/* 110 */           boolean z2 = v70Var.f17883c;
/* 112 */           ArrayList arrayList = v70Var.f17892l;
/* 114 */           if (z2) {
/* 116 */               v70 v70Var2 = this.f13143i;
/* 118 */               boolean z3 = v70Var2.f17883c;
/* 120 */               ArrayList arrayList2 = v70Var2.f17892l;
/* 122 */               if (z3) {
/* 128 */                   if (v70Var.f17890j && v70Var2.f17890j && n80Var.f17890j) {
/* 322 */                       return;
                            }
/* 142 */                   if (!n80Var.f17890j && this.f13138d == enumC2516yz) {
/* 148 */                       C2569zz c2569zz4 = this.f13136b;
/* 152 */                       if (c2569zz4.f20455r == 0 && !c2569zz4.m10483z()) {
/* 164 */                           v70 v70Var3 = (v70) arrayList.get(0);
/* 170 */                           v70 v70Var4 = (v70) arrayList2.get(0);
/* 176 */                           int i4 = v70Var3.f17887g + v70Var.f17886f;
/* 181 */                           int i5 = v70Var4.f17887g + v70Var2.f17886f;
/* 184 */                           v70Var.mo6945d(i4);
/* 187 */                           v70Var2.mo6945d(i5);
/* 190 */                           n80Var.mo6945d(i5 - i4);
/* 193 */                           return;
                                }
                            }
/* 196 */                   if (!n80Var.f17890j && this.f13138d == enumC2516yz && this.f13135a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
/* 222 */                       v70 v70Var5 = (v70) arrayList.get(0);
/* 240 */                       int i6 = (((v70) arrayList2.get(0)).f17887g + v70Var2.f17886f) - (v70Var5.f17887g + v70Var.f17886f);
/* 241 */                       int i7 = n80Var.f14161m;
/* 243 */                       if (i6 < i7) {
/* 245 */                           n80Var.mo6945d(i6);
                                } else {
/* 249 */                           n80Var.mo6945d(i7);
                                }
                            }
/* 254 */                   if (n80Var.f17890j && arrayList.size() > 0 && arrayList2.size() > 0) {
/* 273 */                       v70 v70Var6 = (v70) arrayList.get(0);
/* 279 */                       v70 v70Var7 = (v70) arrayList2.get(0);
/* 281 */                       int i8 = v70Var6.f17887g;
/* 285 */                       int i9 = v70Var.f17886f + i8;
/* 286 */                       int i10 = v70Var7.f17887g;
/* 290 */                       int i11 = v70Var2.f17886f + i10;
/* 293 */                       float f4 = this.f13136b.f20434g0;
/* 295 */                       if (v70Var6 == v70Var7) {
/* 297 */                           f4 = 0.5f;
                                } else {
/* 299 */                           i8 = i9;
/* 300 */                           i10 = i11;
                                }
/* 311 */                       v70Var.mo6945d((int) ((((i10 - i8) - n80Var.f17887g) * f4) + i8 + 0.5f));
/* 319 */                       v70Var2.mo6945d(v70Var.f17887g + n80Var.f17887g);
                            }
                        }
                    }
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: d */
                public final void mo1442d() {
                    C2569zz c2569zz;
                    C2569zz c2569zz2;
                    C2569zz c2569zz3;
                    C2569zz c2569zz4;
/* 3 */             v70 v70Var = this.f12564k;
/* 5 */             C2569zz c2569zz5 = this.f13136b;
/* 7 */             boolean z = c2569zz5.f20421a;
/* 9 */             n80 n80Var = this.f13139e;
/* 11 */            if (z) {
/* 17 */                n80Var.mo6945d(c2569zz5.m10472l());
                    }
/* 20 */            boolean z2 = n80Var.f17890j;
/* 22 */            ArrayList arrayList = n80Var.f17891k;
/* 24 */            ArrayList arrayList2 = n80Var.f17892l;
/* 26 */            EnumC2516yz enumC2516yz = EnumC2516yz.f19868d;
/* 28 */            EnumC2516yz enumC2516yz2 = EnumC2516yz.f19865a;
/* 30 */            EnumC2516yz enumC2516yz3 = EnumC2516yz.f19867c;
/* 33 */            v70 v70Var2 = this.f13143i;
/* 35 */            v70 v70Var3 = this.f13142h;
/* 37 */            if (!z2) {
/* 39 */                C2569zz c2569zz6 = this.f13136b;
/* 45 */                this.f13138d = c2569zz6.f20415U[1];
/* 49 */                if (c2569zz6.f20399E) {
/* 56 */                    this.f12565l = new C2256ui(this);
                        }
/* 58 */                EnumC2516yz enumC2516yz4 = this.f13138d;
/* 60 */                if (enumC2516yz4 != enumC2516yz3) {
/* 62 */                    if (enumC2516yz4 == enumC2516yz && (c2569zz4 = this.f13136b.f20416V) != null && c2569zz4.f20415U[1] == enumC2516yz2) {
/* 97 */                        int iM10472l = (c2569zz4.m10472l() - this.f13136b.f20405K.m7247e()) - this.f13136b.f20407M.m7247e();
/* 110 */                       l73.m6394b(v70Var3, c2569zz4.f20429e.f13142h, this.f13136b.f20405K.m7247e());
/* 126 */                       l73.m6394b(v70Var2, c2569zz4.f20429e.f13143i, -this.f13136b.f20407M.m7247e());
/* 129 */                       n80Var.mo6945d(iM10472l);
/* 132 */                       return;
                            }
/* 133 */                   if (enumC2516yz4 == enumC2516yz2) {
/* 141 */                       n80Var.mo6945d(this.f13136b.m10472l());
                            }
                        }
                    } else if (this.f13138d == enumC2516yz && (c2569zz2 = (c2569zz = this.f13136b).f20416V) != null && c2569zz2.f20415U[1] == enumC2516yz2) {
/* 171 */               l73.m6394b(v70Var3, c2569zz2.f20429e.f13142h, c2569zz.f20405K.m7247e());
/* 187 */               l73.m6394b(v70Var2, c2569zz2.f20429e.f13143i, -this.f13136b.f20407M.m7247e());
/* 190 */               return;
                    }
/* 191 */           boolean z3 = n80Var.f17890j;
/* 197 */           if (z3) {
/* 199 */               C2569zz c2569zz7 = this.f13136b;
/* 203 */               if (c2569zz7.f20421a) {
/* 205 */                   C2051oz[] c2051ozArr = c2569zz7.f20412R;
/* 207 */                   C2051oz c2051oz = c2051ozArr[2];
/* 209 */                   C2051oz c2051oz2 = c2051oz.f14929f;
/* 211 */                   if (c2051oz2 != null && c2051ozArr[3].f14929f != null) {
/* 219 */                       boolean zM10483z = c2569zz7.m10483z();
/* 223 */                       C2569zz c2569zz8 = this.f13136b;
/* 225 */                       if (zM10483z) {
/* 235 */                           v70Var3.f17886f = c2569zz8.f20412R[2].m7247e();
/* 248 */                           v70Var2.f17886f = -this.f13136b.f20412R[3].m7247e();
                                } else {
/* 255 */                           v70 v70VarM6395h = l73.m6395h(c2569zz8.f20412R[2]);
/* 259 */                           if (v70VarM6395h != null) {
/* 271 */                               l73.m6394b(v70Var3, v70VarM6395h, this.f13136b.f20412R[2].m7247e());
                                    }
/* 280 */                           v70 v70VarM6395h2 = l73.m6395h(this.f13136b.f20412R[3]);
/* 284 */                           if (v70VarM6395h2 != null) {
/* 297 */                               l73.m6394b(v70Var2, v70VarM6395h2, -this.f13136b.f20412R[3].m7247e());
                                    }
/* 300 */                           v70Var3.f17882b = true;
/* 302 */                           v70Var2.f17882b = true;
                                }
/* 304 */                       C2569zz c2569zz9 = this.f13136b;
/* 308 */                       if (c2569zz9.f20399E) {
/* 312 */                           l73.m6394b(v70Var, v70Var3, c2569zz9.f20426c0);
/* 315 */                           return;
                                }
/* 866 */                       return;
                            }
/* 316 */                   if (c2051oz2 != null) {
/* 318 */                       v70 v70VarM6395h3 = l73.m6395h(c2051oz);
/* 322 */                       if (v70VarM6395h3 != null) {
/* 334 */                           l73.m6394b(v70Var3, v70VarM6395h3, this.f13136b.f20412R[2].m7247e());
/* 339 */                           l73.m6394b(v70Var2, v70Var3, n80Var.f17887g);
/* 342 */                           C2569zz c2569zz10 = this.f13136b;
/* 346 */                           if (c2569zz10.f20399E) {
/* 350 */                               l73.m6394b(v70Var, v70Var3, c2569zz10.f20426c0);
/* 353 */                               return;
                                    }
/* 866 */                           return;
                                }
/* 866 */                       return;
                            }
/* 354 */                   C2051oz c2051oz3 = c2051ozArr[3];
/* 358 */                   if (c2051oz3.f14929f != null) {
/* 360 */                       v70 v70VarM6395h4 = l73.m6395h(c2051oz3);
/* 364 */                       if (v70VarM6395h4 != null) {
/* 377 */                           l73.m6394b(v70Var2, v70VarM6395h4, -this.f13136b.f20412R[3].m7247e());
/* 383 */                           l73.m6394b(v70Var3, v70Var2, -n80Var.f17887g);
                                }
/* 386 */                       C2569zz c2569zz11 = this.f13136b;
/* 390 */                       if (c2569zz11.f20399E) {
/* 394 */                           l73.m6394b(v70Var, v70Var3, c2569zz11.f20426c0);
/* 397 */                           return;
                                }
/* 866 */                       return;
                            }
/* 398 */                   C2051oz c2051oz4 = c2051ozArr[4];
/* 402 */                   if (c2051oz4.f14929f != null) {
/* 404 */                       v70 v70VarM6395h5 = l73.m6395h(c2051oz4);
/* 408 */                       if (v70VarM6395h5 != null) {
/* 410 */                           l73.m6394b(v70Var, v70VarM6395h5, 0);
/* 418 */                           l73.m6394b(v70Var3, v70Var, -this.f13136b.f20426c0);
/* 423 */                           l73.m6394b(v70Var2, v70Var3, n80Var.f17887g);
/* 426 */                           return;
                                }
/* 866 */                       return;
                            }
/* 429 */                   if ((c2569zz7 instanceof cu0) || c2569zz7.f20416V == null || c2569zz7.mo1430j(7).f14929f != null) {
/* 866 */                       return;
                            }
/* 444 */                   C2569zz c2569zz12 = this.f13136b;
/* 456 */                   l73.m6394b(v70Var3, c2569zz12.f20416V.f20429e.f13142h, c2569zz12.m10477t());
/* 461 */                   l73.m6394b(v70Var2, v70Var3, n80Var.f17887g);
/* 464 */                   C2569zz c2569zz13 = this.f13136b;
/* 468 */                   if (c2569zz13.f20399E) {
/* 472 */                       l73.m6394b(v70Var, v70Var3, c2569zz13.f20426c0);
/* 475 */                       return;
                            }
/* 866 */                   return;
                        }
                    }
/* 476 */           if (z3 || this.f13138d != enumC2516yz3) {
/* 551 */               n80Var.m9226b(this);
                    } else {
/* 482 */               C2569zz c2569zz14 = this.f13136b;
/* 484 */               int i = c2569zz14.f20457s;
/* 486 */               if (i == 2) {
/* 525 */                   C2569zz c2569zz15 = c2569zz14.f20416V;
/* 527 */                   if (c2569zz15 != null) {
/* 532 */                       n80 n80Var2 = c2569zz15.f20429e.f13139e;
/* 534 */                       arrayList2.add(n80Var2);
/* 539 */                       n80Var2.f17891k.add(n80Var);
/* 542 */                       n80Var.f17882b = true;
/* 544 */                       arrayList.add(v70Var3);
/* 547 */                       arrayList.add(v70Var2);
                            }
                        } else if (i == 3 && !c2569zz14.m10483z()) {
/* 497 */                   C2569zz c2569zz16 = this.f13136b;
/* 501 */                   if (c2569zz16.f20455r != 3) {
/* 506 */                       n80 n80Var3 = c2569zz16.f20427d.f13139e;
/* 508 */                       arrayList2.add(n80Var3);
/* 513 */                       n80Var3.f17891k.add(n80Var);
/* 516 */                       n80Var.f17882b = true;
/* 518 */                       arrayList.add(v70Var3);
/* 521 */                       arrayList.add(v70Var2);
                            }
                        }
                    }
/* 554 */           C2569zz c2569zz17 = this.f13136b;
/* 556 */           C2051oz[] c2051ozArr2 = c2569zz17.f20412R;
/* 558 */           C2051oz c2051oz5 = c2051ozArr2[2];
/* 560 */           C2051oz c2051oz6 = c2051oz5.f14929f;
/* 564 */           if (c2051oz6 != null && c2051ozArr2[3].f14929f != null) {
/* 572 */               boolean zM10483z2 = c2569zz17.m10483z();
/* 576 */               C2569zz c2569zz18 = this.f13136b;
/* 578 */               if (zM10483z2) {
/* 588 */                   v70Var3.f17886f = c2569zz18.f20412R[2].m7247e();
/* 601 */                   v70Var2.f17886f = -this.f13136b.f20412R[3].m7247e();
                        } else {
/* 608 */                   v70 v70VarM6395h6 = l73.m6395h(c2569zz18.f20412R[2]);
/* 618 */                   v70 v70VarM6395h7 = l73.m6395h(this.f13136b.f20412R[3]);
/* 622 */                   if (v70VarM6395h6 != null) {
/* 624 */                       v70VarM6395h6.m9226b(this);
                            }
/* 627 */                   if (v70VarM6395h7 != null) {
/* 629 */                       v70VarM6395h7.m9226b(this);
                            }
/* 632 */                   this.f13144j = 4;
                        }
/* 638 */               if (this.f13136b.f20399E) {
/* 642 */                   m6397c(v70Var, v70Var3, 1, this.f12565l);
                        }
                    } else if (c2051oz6 != null) {
/* 650 */               v70 v70VarM6395h8 = l73.m6395h(c2051oz5);
/* 654 */               if (v70VarM6395h8 != null) {
/* 666 */                   l73.m6394b(v70Var3, v70VarM6395h8, this.f13136b.f20412R[2].m7247e());
/* 669 */                   m6397c(v70Var2, v70Var3, 1, n80Var);
/* 676 */                   if (this.f13136b.f20399E) {
/* 680 */                       m6397c(v70Var, v70Var3, 1, this.f12565l);
                            }
/* 685 */                   if (this.f13138d == enumC2516yz3) {
/* 687 */                       C2569zz c2569zz19 = this.f13136b;
/* 693 */                       if (c2569zz19.f20419Y > 0.0f) {
/* 695 */                           uu0 uu0Var = c2569zz19.f20427d;
/* 699 */                           if (uu0Var.f13138d == enumC2516yz3) {
/* 705 */                               uu0Var.f13139e.f17891k.add(n80Var);
/* 714 */                               arrayList2.add(this.f13136b.f20427d.f13139e);
/* 717 */                               n80Var.f17881a = this;
                                    }
                                }
                            }
                        }
                    } else {
/* 721 */               C2051oz c2051oz7 = c2051ozArr2[3];
/* 728 */               if (c2051oz7.f14929f != null) {
/* 730 */                   v70 v70VarM6395h9 = l73.m6395h(c2051oz7);
/* 734 */                   if (v70VarM6395h9 != null) {
/* 747 */                       l73.m6394b(v70Var2, v70VarM6395h9, -this.f13136b.f20412R[3].m7247e());
/* 750 */                       m6397c(v70Var3, v70Var2, -1, n80Var);
/* 757 */                       if (this.f13136b.f20399E) {
/* 761 */                           m6397c(v70Var, v70Var3, 1, this.f12565l);
                                }
                            }
                        } else {
/* 765 */                   C2051oz c2051oz8 = c2051ozArr2[4];
/* 769 */                   if (c2051oz8.f14929f != null) {
/* 771 */                       v70 v70VarM6395h10 = l73.m6395h(c2051oz8);
/* 775 */                       if (v70VarM6395h10 != null) {
/* 777 */                           l73.m6394b(v70Var, v70VarM6395h10, 0);
/* 782 */                           m6397c(v70Var3, v70Var, -1, this.f12565l);
/* 785 */                           m6397c(v70Var2, v70Var3, 1, n80Var);
                                }
                            } else if (!(c2569zz17 instanceof cu0) && (c2569zz3 = c2569zz17.f20416V) != null) {
/* 805 */                       l73.m6394b(v70Var3, c2569zz3.f20429e.f13142h, c2569zz17.m10477t());
/* 808 */                       m6397c(v70Var2, v70Var3, 1, n80Var);
/* 815 */                       if (this.f13136b.f20399E) {
/* 819 */                           m6397c(v70Var, v70Var3, 1, this.f12565l);
                                }
/* 824 */                       if (this.f13138d == enumC2516yz3) {
/* 826 */                           C2569zz c2569zz20 = this.f13136b;
/* 832 */                           if (c2569zz20.f20419Y > 0.0f) {
/* 834 */                               uu0 uu0Var2 = c2569zz20.f20427d;
/* 838 */                               if (uu0Var2.f13138d == enumC2516yz3) {
/* 844 */                                   uu0Var2.f13139e.f17891k.add(n80Var);
/* 853 */                                   arrayList2.add(this.f13136b.f20427d.f13139e);
/* 856 */                                   n80Var.f17881a = this;
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 862 */           if (arrayList2.size() == 0) {
/* 864 */               n80Var.f17883c = true;
                    }
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: e */
                public final void mo1443e() {
/* 1 */             v70 v70Var = this.f13142h;
/* 5 */             if (v70Var.f17890j) {
/* 11 */                this.f13136b.f20424b0 = v70Var.f17887g;
                    }
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: f */
                public final void mo1444f() {
/* 2 */             this.f13137c = null;
/* 6 */             this.f13142h.m9227c();
/* 11 */            this.f13143i.m9227c();
/* 16 */            this.f12564k.m9227c();
/* 21 */            this.f13139e.m9227c();
/* 25 */            this.f13141g = false;
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: k */
                public final boolean mo1445k() {
                    return this.f13138d != EnumC2516yz.f19867c || this.f13136b.f20457s == 0;
                }

                /* JADX INFO: renamed from: m */
                public final void m5936m() {
/* 2 */             this.f13141g = false;
/* 4 */             v70 v70Var = this.f13142h;
/* 6 */             v70Var.m9227c();
/* 9 */             v70Var.f17890j = false;
/* 11 */            v70 v70Var2 = this.f13143i;
/* 13 */            v70Var2.m9227c();
/* 16 */            v70Var2.f17890j = false;
/* 18 */            v70 v70Var3 = this.f12564k;
/* 20 */            v70Var3.m9227c();
/* 23 */            v70Var3.f17890j = false;
/* 27 */            this.f13139e.f17890j = false;
                }

                public final String toString() {
/* 15 */            return "VerticalRun " + this.f13136b.f20442k0;
                }
            }
