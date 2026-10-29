            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: ks */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1864ks extends l73 {

                /* JADX INFO: renamed from: k */
                public final ArrayList f12993k;

                /* JADX INFO: renamed from: l */
                public int f12994l;

                public C1864ks(C2569zz c2569zz, int i) {
                    C2569zz c2569zz2;
/* 1 */             super(c2569zz);
/* 6 */             ArrayList<l73> arrayList = new ArrayList();
/* 9 */             this.f12993k = arrayList;
/* 11 */            this.f13140f = i;
/* 13 */            C2569zz c2569zz3 = this.f13136b;
/* 15 */            C2569zz c2569zzM10474n = c2569zz3.m10474n(i);
                    while (true) {
/* 19 */                c2569zz2 = c2569zz3;
/* 20 */                c2569zz3 = c2569zzM10474n;
/* 22 */                if (c2569zz3 == null) {
                            break;
                        } else {
/* 26 */                    c2569zzM10474n = c2569zz3.m10474n(this.f13140f);
                        }
                    }
/* 31 */            this.f13136b = c2569zz2;
/* 33 */            int i2 = this.f13140f;
/* 48 */            arrayList.add(i2 == 0 ? c2569zz2.f20427d : i2 == 1 ? c2569zz2.f20429e : null);
/* 53 */            C2569zz c2569zzM10473m = c2569zz2.m10473m(this.f13140f);
/* 57 */            while (c2569zzM10473m != null) {
/* 59 */                int i3 = this.f13140f;
/* 72 */                arrayList.add(i3 == 0 ? c2569zzM10473m.f20427d : i3 == 1 ? c2569zzM10473m.f20429e : null);
/* 77 */                c2569zzM10473m = c2569zzM10473m.m10473m(this.f13140f);
                    }
/* 90 */            for (l73 l73Var : arrayList) {
/* 98 */                int i4 = this.f13140f;
/* 100 */               if (i4 == 0) {
/* 104 */                   l73Var.f13136b.f20423b = this;
                        } else if (i4 == 1) {
/* 111 */                   l73Var.f13136b.f20425c = this;
                        }
                    }
/* 116 */           if (this.f13140f == 0 && ((a00) this.f13136b.f20416V).f22z0 && arrayList.size() > 1) {
/* 147 */               this.f13136b = ((l73) arrayList.get(arrayList.size() - 1)).f13136b;
                    }
/* 149 */           int i5 = this.f13140f;
/* 151 */           C2569zz c2569zz4 = this.f13136b;
/* 160 */           this.f12994l = i5 == 0 ? c2569zz4.f20444l0 : c2569zz4.f20446m0;
                }

                /* JADX WARN: Code duplicated, block: B:293:0x00ee A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:62:0x00d1  */
                /* JADX WARN: Code duplicated, block: B:64:0x00dd  */
                /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
                /* JADX WARN: Code duplicated, block: B:68:0x00e6 A[ADDED_TO_REGION] */
                @Override // p000.s70
                /* JADX INFO: renamed from: a */
                public final void mo1441a(s70 s70Var) {
                    int i;
                    int i2;
                    EnumC2516yz enumC2516yz;
                    boolean z;
                    float f;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    float f2;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    float f3;
/* 3 */             v70 v70Var = this.f13142h;
/* 7 */             if (v70Var.f17890j) {
/* 9 */                 v70 v70Var2 = this.f13143i;
/* 13 */                if (v70Var2.f17890j) {
/* 19 */                    C2569zz c2569zz = this.f13136b.f20416V;
/* 30 */                    boolean z2 = c2569zz instanceof a00 ? ((a00) c2569zz).f22z0 : false;
/* 35 */                    int i13 = v70Var2.f17887g - v70Var.f17887g;
/* 36 */                    ArrayList arrayList = this.f12993k;
/* 38 */                    int size = arrayList.size();
/* 42 */                    int i14 = 0;
                            while (true) {
/* 43 */                        i = -1;
/* 44 */                        i2 = 8;
/* 46 */                        if (i14 >= size) {
/* 63 */                            i14 = -1;
                                    break;
                                } else if (((l73) arrayList.get(i14)).f13136b.f20438i0 != 8) {
                                    break;
                                } else {
/* 60 */                            i14++;
                                }
                            }
/* 64 */                    int i15 = size - 1;
/* 67 */                    for (int i16 = i15; i16 >= 0; i16--) {
/* 79 */                        if (((l73) arrayList.get(i16)).f13136b.f20438i0 != 8) {
/* 84 */                            i = i16;
                                    break;
                                }
                            }
/* 85 */                    int i17 = 0;
                            while (true) {
/* 86 */                        enumC2516yz = EnumC2516yz.f19867c;
/* 91 */                        if (i17 >= 2) {
/* 271 */                           z = z2;
/* 273 */                           f = 0.0f;
/* 275 */                           i3 = 0;
/* 276 */                           i4 = 0;
/* 277 */                           i5 = 0;
                                    break;
                                }
/* 93 */                        f = 0.0f;
/* 95 */                        int i18 = 0;
/* 96 */                        i5 = 0;
/* 97 */                        int i19 = 0;
/* 99 */                        int i20 = 0;
/* 101 */                       while (i18 < size) {
/* 109 */                           l73 l73Var = (l73) arrayList.get(i18);
/* 111 */                           boolean z3 = z2;
/* 113 */                           C2569zz c2569zz2 = l73Var.f13136b;
/* 115 */                           int i21 = i17;
/* 119 */                           if (c2569zz2.f20438i0 != i2) {
/* 123 */                               i20++;
/* 125 */                               if (i18 > 0 && i18 >= i14) {
/* 133 */                                   i5 += l73Var.f13142h.f17886f;
                                        }
/* 134 */                               n80 n80Var = l73Var.f13139e;
/* 136 */                               int i22 = n80Var.f17887g;
/* 146 */                               boolean z4 = l73Var.f13138d != enumC2516yz;
/* 147 */                               if (z4) {
/* 149 */                                   int i23 = this.f13140f;
/* 153 */                                   if (i23 == 0 && !c2569zz2.f20427d.f13139e.f17890j) {
/* 945 */                                       return;
                                            }
/* 166 */                                   if (i23 == 1 && !c2569zz2.f20429e.f13139e.f17890j) {
/* 945 */                                       return;
                                            } else {
/* 178 */                                       i11 = i5;
                                            }
                                        } else {
/* 183 */                                   i11 = i5;
/* 188 */                                   if (l73Var.f13135a == 1 && i21 == 0) {
/* 192 */                                       i12 = n80Var.f14161m;
/* 194 */                                       i19++;
                                            } else {
/* 201 */                                       if (n80Var.f17890j) {
/* 203 */                                           i12 = i22;
                                                }
/* 208 */                                       if (z4) {
/* 227 */                                           i5 = i11 + i12;
                                                } else {
/* 210 */                                           i19++;
/* 216 */                                           f3 = c2569zz2.f20448n0[this.f13140f];
/* 220 */                                           if (f3 >= 0.0f) {
/* 222 */                                               f += f3;
                                                    }
/* 224 */                                           i5 = i11;
                                                }
/* 229 */                                       if (i18 >= i15 && i18 < i) {
/* 238 */                                           i5 += -l73Var.f13143i.f17886f;
                                                }
                                            }
/* 196 */                                   z4 = true;
/* 208 */                                   if (z4) {
/* 210 */                                       i19++;
/* 216 */                                       f3 = c2569zz2.f20448n0[this.f13140f];
/* 220 */                                       if (f3 >= 0.0f) {
/* 222 */                                           f += f3;
                                                }
/* 224 */                                       i5 = i11;
                                            } else {
/* 227 */                                       i5 = i11 + i12;
                                            }
/* 229 */                                   if (i18 >= i15) {
                                            }
                                        }
/* 206 */                               i12 = i22;
/* 208 */                               if (z4) {
/* 210 */                                   i19++;
/* 216 */                                   f3 = c2569zz2.f20448n0[this.f13140f];
/* 220 */                                   if (f3 >= 0.0f) {
/* 222 */                                       f += f3;
                                            }
/* 224 */                                   i5 = i11;
                                        } else {
/* 227 */                                   i5 = i11 + i12;
                                        }
/* 229 */                               if (i18 >= i15) {
                                        }
                                    }
/* 239 */                           i18++;
/* 241 */                           z2 = z3;
/* 243 */                           i17 = i21;
/* 245 */                           i2 = 8;
                                }
/* 249 */                       z = z2;
/* 251 */                       int i24 = i17;
/* 253 */                       if (i5 < i13 || i19 == 0) {
/* 266 */                           i3 = i19;
/* 268 */                           i4 = i20;
                                    break;
                                } else {
/* 258 */                           i17 = i24 + 1;
/* 260 */                           z2 = z;
/* 262 */                           i2 = 8;
                                }
                            }
/* 278 */                   int i25 = v70Var.f17887g;
/* 280 */                   if (z) {
/* 282 */                       i25 = v70Var2.f17887g;
                            }
/* 284 */                   float f4 = 0.5f;
/* 286 */                   if (i5 > i13) {
/* 306 */                       i25 = z ? i25 + ((int) (((i5 - i13) / 2.0f) + 0.5f)) : i25 - ((int) (((i5 - i13) / 2.0f) + 0.5f));
                            }
/* 307 */                   if (i3 > 0) {
/* 309 */                       float f5 = i13 - i5;
/* 316 */                       int i26 = (int) ((f5 / i3) + 0.5f);
/* 317 */                       int i27 = 0;
/* 318 */                       int i28 = 0;
/* 320 */                       while (i27 < size) {
/* 326 */                           float f6 = f4;
/* 330 */                           l73 l73Var2 = (l73) arrayList.get(i27);
/* 332 */                           int i29 = i25;
/* 334 */                           C2569zz c2569zz3 = l73Var2.f13136b;
/* 336 */                           int i30 = i3;
/* 338 */                           n80 n80Var2 = l73Var2.f13139e;
/* 340 */                           float f7 = f5;
/* 344 */                           int i31 = i26;
/* 348 */                           if (c2569zz3.f20438i0 != 8 && l73Var2.f13138d == enumC2516yz && !n80Var2.f17890j) {
/* 379 */                               int i32 = f > 0.0f ? (int) (((c2569zz3.f20448n0[this.f13140f] * f7) / f) + f6) : i31;
/* 383 */                               if (this.f13140f == 0) {
/* 385 */                                   i9 = c2569zz3.f20462v;
/* 387 */                                   i10 = c2569zz3.f20461u;
                                        } else {
/* 390 */                                   i9 = c2569zz3.f20465y;
/* 392 */                                   i10 = c2569zz3.f20464x;
                                        }
/* 409 */                               int iMax = Math.max(i10, l73Var2.f13135a == 1 ? Math.min(i32, n80Var2.f14161m) : i32);
/* 413 */                               if (i9 > 0) {
/* 415 */                                   iMax = Math.min(i9, iMax);
                                        }
/* 419 */                               if (iMax != i32) {
/* 421 */                                   i28++;
/* 423 */                                   i32 = iMax;
                                        }
/* 424 */                               n80Var2.mo6945d(i32);
                                    }
/* 427 */                           i27++;
/* 429 */                           i25 = i29;
/* 431 */                           f4 = f6;
/* 433 */                           i3 = i30;
/* 435 */                           f5 = f7;
/* 437 */                           i26 = i31;
                                }
/* 440 */                       i6 = i25;
/* 442 */                       f2 = f4;
/* 444 */                       int i33 = i3;
/* 446 */                       if (i28 > 0) {
/* 448 */                           i3 = i33 - i28;
/* 451 */                           i5 = 0;
/* 452 */                           for (int i34 = 0; i34 < size; i34++) {
/* 458 */                               l73 l73Var3 = (l73) arrayList.get(i34);
/* 466 */                               if (l73Var3.f13136b.f20438i0 != 8) {
/* 469 */                                   if (i34 > 0 && i34 >= i14) {
/* 477 */                                       i5 += l73Var3.f13142h.f17886f;
                                            }
/* 482 */                                   i5 += l73Var3.f13139e.f17887g;
/* 483 */                                   if (i34 < i15 && i34 < i) {
/* 492 */                                       i5 += -l73Var3.f13143i.f17886f;
                                            }
                                        }
                                    }
                                } else {
/* 496 */                           i3 = i33;
                                }
/* 500 */                       i8 = 2;
/* 501 */                       if (this.f12994l == 2 && i28 == 0) {
/* 505 */                           i7 = 0;
/* 506 */                           this.f12994l = 0;
                                } else {
/* 509 */                           i7 = 0;
                                }
                            } else {
/* 511 */                       i6 = i25;
/* 513 */                       f2 = 0.5f;
/* 517 */                       i7 = 0;
/* 518 */                       i8 = 2;
                            }
/* 519 */                   if (i5 > i13) {
/* 521 */                       this.f12994l = i8;
                            }
/* 523 */                   if (i4 > 0 && i3 == 0 && i14 == i) {
/* 529 */                       this.f12994l = i8;
                            }
/* 531 */                   int i35 = this.f12994l;
/* 534 */                   if (i35 == 1) {
/* 550 */                       int i36 = i4 > 1 ? (i13 - i5) / (i4 - 1) : i4 == 1 ? (i13 - i5) / 2 : i7;
/* 551 */                       if (i3 > 0) {
/* 553 */                           i36 = i7;
                                }
/* 555 */                       int i37 = i6;
/* 557 */                       for (int i38 = i7; i38 < size; i38++) {
/* 571 */                           l73 l73Var4 = (l73) arrayList.get(z ? size - (i38 + 1) : i38);
/* 573 */                           C2569zz c2569zz4 = l73Var4.f13136b;
/* 575 */                           v70 v70Var3 = l73Var4.f13143i;
/* 577 */                           v70 v70Var4 = l73Var4.f13142h;
/* 583 */                           if (c2569zz4.f20438i0 == 8) {
/* 585 */                               v70Var4.mo6945d(i37);
/* 588 */                               v70Var3.mo6945d(i37);
                                    } else {
/* 592 */                               if (i38 > 0) {
/* 598 */                                   i37 = z ? i37 - i36 : i37 + i36;
                                        }
/* 599 */                               if (i38 > 0 && i38 >= i14) {
/* 611 */                                   i37 = z ? i37 - v70Var4.f17886f : i37 + v70Var4.f17886f;
                                        }
/* 612 */                               if (z) {
/* 614 */                                   v70Var3.mo6945d(i37);
                                        } else {
/* 618 */                                   v70Var4.mo6945d(i37);
                                        }
/* 621 */                               n80 n80Var3 = l73Var4.f13139e;
/* 623 */                               int i39 = n80Var3.f17887g;
/* 627 */                               if (l73Var4.f13138d == enumC2516yz && l73Var4.f13135a == 1) {
/* 634 */                                   i39 = n80Var3.f14161m;
                                        }
/* 640 */                               i37 = z ? i37 - i39 : i37 + i39;
/* 641 */                               if (z) {
/* 643 */                                   v70Var4.mo6945d(i37);
                                        } else {
/* 648 */                                   v70Var3.mo6945d(i37);
                                        }
/* 652 */                               l73Var4.f13141g = true;
/* 654 */                               if (i38 < i15 && i38 < i) {
/* 668 */                                   i37 = z ? i37 - (-v70Var3.f17886f) : i37 + (-v70Var3.f17886f);
                                        }
                                    }
                                }
/* 945 */                       return;
                            }
/* 672 */                   if (i35 == 0) {
/* 679 */                       int i40 = (i13 - i5) / (i4 + 1);
/* 680 */                       if (i3 > 0) {
/* 682 */                           i40 = i7;
                                }
/* 684 */                       int i41 = i6;
/* 686 */                       for (int i42 = i7; i42 < size; i42++) {
/* 700 */                           l73 l73Var5 = (l73) arrayList.get(z ? size - (i42 + 1) : i42);
/* 702 */                           C2569zz c2569zz5 = l73Var5.f13136b;
/* 704 */                           v70 v70Var5 = l73Var5.f13143i;
/* 706 */                           v70 v70Var6 = l73Var5.f13142h;
/* 712 */                           if (c2569zz5.f20438i0 == 8) {
/* 714 */                               v70Var6.mo6945d(i41);
/* 717 */                               v70Var5.mo6945d(i41);
                                    } else {
/* 725 */                               int i43 = z ? i41 - i40 : i41 + i40;
/* 726 */                               if (i42 > 0 && i42 >= i14) {
/* 738 */                                   i43 = z ? i43 - v70Var6.f17886f : i43 + v70Var6.f17886f;
                                        }
/* 739 */                               if (z) {
/* 741 */                                   v70Var5.mo6945d(i43);
                                        } else {
/* 745 */                                   v70Var6.mo6945d(i43);
                                        }
/* 748 */                               n80 n80Var4 = l73Var5.f13139e;
/* 750 */                               int iMin = n80Var4.f17887g;
/* 754 */                               if (l73Var5.f13138d == enumC2516yz && l73Var5.f13135a == 1) {
/* 763 */                                   iMin = Math.min(iMin, n80Var4.f14161m);
                                        }
/* 771 */                               i41 = z ? i43 - iMin : i43 + iMin;
/* 772 */                               if (z) {
/* 774 */                                   v70Var6.mo6945d(i41);
                                        } else {
/* 778 */                                   v70Var5.mo6945d(i41);
                                        }
/* 781 */                               if (i42 < i15 && i42 < i) {
/* 795 */                                   i41 = z ? i41 - (-v70Var5.f17886f) : i41 + (-v70Var5.f17886f);
                                        }
                                    }
                                }
/* 945 */                       return;
                            }
/* 800 */                   if (i35 == 2) {
/* 802 */                       int i44 = this.f13140f;
/* 804 */                       C2569zz c2569zz6 = this.f13136b;
/* 811 */                       float f8 = i44 == 0 ? c2569zz6.f20432f0 : c2569zz6.f20434g0;
/* 813 */                       if (z) {
/* 817 */                           f8 = 1.0f - f8;
                                }
/* 824 */                       int i45 = (int) (((i13 - i5) * f8) + f2);
/* 825 */                       if (i45 < 0 || i3 > 0) {
/* 829 */                           i45 = i7;
                                }
/* 835 */                       int i46 = z ? i6 - i45 : i6 + i45;
/* 838 */                       for (int i47 = i7; i47 < size; i47++) {
/* 852 */                           l73 l73Var6 = (l73) arrayList.get(z ? size - (i47 + 1) : i47);
/* 854 */                           C2569zz c2569zz7 = l73Var6.f13136b;
/* 856 */                           v70 v70Var7 = l73Var6.f13143i;
/* 858 */                           v70 v70Var8 = l73Var6.f13142h;
/* 864 */                           if (c2569zz7.f20438i0 == 8) {
/* 866 */                               v70Var8.mo6945d(i46);
/* 869 */                               v70Var7.mo6945d(i46);
                                    } else {
/* 874 */                               if (i47 > 0 && i47 >= i14) {
/* 886 */                                   i46 = z ? i46 - v70Var8.f17886f : i46 + v70Var8.f17886f;
                                        }
/* 887 */                               if (z) {
/* 889 */                                   v70Var7.mo6945d(i46);
                                        } else {
/* 893 */                                   v70Var8.mo6945d(i46);
                                        }
/* 896 */                               n80 n80Var5 = l73Var6.f13139e;
/* 898 */                               int i48 = n80Var5.f17887g;
/* 902 */                               if (l73Var6.f13138d == enumC2516yz && l73Var6.f13135a == 1) {
/* 909 */                                   i48 = n80Var5.f14161m;
                                        }
/* 917 */                               i46 = z ? i46 - i48 : i46 + i48;
/* 918 */                               if (z) {
/* 920 */                                   v70Var8.mo6945d(i46);
                                        } else {
/* 924 */                                   v70Var7.mo6945d(i46);
                                        }
/* 927 */                               if (i47 < i15 && i47 < i) {
/* 941 */                                   i46 = z ? i46 - (-v70Var7.f17886f) : i46 + (-v70Var7.f17886f);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: d */
                public final void mo1442d() {
/* 1 */             ArrayList arrayList = this.f12993k;
/* 3 */             Iterator it = arrayList.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((l73) it.next()).mo1442d();
                    }
/* 23 */            int size = arrayList.size();
/* 28 */            if (size < 1) {
/* 30 */                return;
                    }
/* 38 */            C2569zz c2569zz = ((l73) arrayList.get(0)).f13136b;
/* 47 */            C2569zz c2569zz2 = ((l73) arrayList.get(size - 1)).f13136b;
/* 49 */            int i = this.f13140f;
/* 51 */            v70 v70Var = this.f13143i;
/* 53 */            v70 v70Var2 = this.f13142h;
/* 55 */            if (i == 0) {
/* 57 */                C2051oz c2051oz = c2569zz.f20404J;
/* 59 */                C2051oz c2051oz2 = c2569zz2.f20406L;
/* 61 */                v70 v70VarM6396i = l73.m6396i(c2051oz, 0);
/* 65 */                int iM7247e = c2051oz.m7247e();
/* 69 */                C2569zz c2569zzM6277m = m6277m();
/* 73 */                if (c2569zzM6277m != null) {
/* 77 */                    iM7247e = c2569zzM6277m.f20404J.m7247e();
                        }
/* 81 */                if (v70VarM6396i != null) {
/* 83 */                    l73.m6394b(v70Var2, v70VarM6396i, iM7247e);
                        }
/* 86 */                v70 v70VarM6396i2 = l73.m6396i(c2051oz2, 0);
/* 90 */                int iM7247e2 = c2051oz2.m7247e();
/* 94 */                C2569zz c2569zzM6278n = m6278n();
/* 98 */                if (c2569zzM6278n != null) {
/* 102 */                   iM7247e2 = c2569zzM6278n.f20406L.m7247e();
                        }
/* 106 */               if (v70VarM6396i2 != null) {
/* 109 */                   l73.m6394b(v70Var, v70VarM6396i2, -iM7247e2);
                        }
                    } else {
/* 113 */               C2051oz c2051oz3 = c2569zz.f20405K;
/* 115 */               C2051oz c2051oz4 = c2569zz2.f20407M;
/* 117 */               v70 v70VarM6396i3 = l73.m6396i(c2051oz3, 1);
/* 121 */               int iM7247e3 = c2051oz3.m7247e();
/* 125 */               C2569zz c2569zzM6277m2 = m6277m();
/* 129 */               if (c2569zzM6277m2 != null) {
/* 133 */                   iM7247e3 = c2569zzM6277m2.f20405K.m7247e();
                        }
/* 137 */               if (v70VarM6396i3 != null) {
/* 139 */                   l73.m6394b(v70Var2, v70VarM6396i3, iM7247e3);
                        }
/* 142 */               v70 v70VarM6396i4 = l73.m6396i(c2051oz4, 1);
/* 146 */               int iM7247e4 = c2051oz4.m7247e();
/* 150 */               C2569zz c2569zzM6278n2 = m6278n();
/* 154 */               if (c2569zzM6278n2 != null) {
/* 158 */                   iM7247e4 = c2569zzM6278n2.f20407M.m7247e();
                        }
/* 162 */               if (v70VarM6396i4 != null) {
/* 165 */                   l73.m6394b(v70Var, v70VarM6396i4, -iM7247e4);
                        }
                    }
/* 168 */           v70Var2.f17881a = this;
/* 170 */           v70Var.f17881a = this;
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: e */
                public final void mo1443e() {
/* 1 */             int i = 0;
                    while (true) {
/* 2 */                 ArrayList arrayList = this.f12993k;
/* 8 */                 if (i >= arrayList.size()) {
/* 22 */                    return;
                        }
/* 16 */                ((l73) arrayList.get(i)).mo1443e();
/* 19 */                i++;
                    }
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: f */
                public final void mo1444f() {
/* 2 */             this.f13137c = null;
/* 6 */             Iterator it = this.f12993k.iterator();
/* 14 */            while (it.hasNext()) {
/* 22 */                ((l73) it.next()).mo1444f();
                    }
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: j */
                public final long mo6276j() {
/* 1 */             ArrayList arrayList = this.f12993k;
/* 3 */             int size = arrayList.size();
/* 7 */             long jMo6276j = 0;
/* 10 */            for (int i = 0; i < size; i++) {
/* 16 */                l73 l73Var = (l73) arrayList.get(i);
/* 34 */                jMo6276j = ((long) l73Var.f13143i.f17886f) + l73Var.mo6276j() + jMo6276j + ((long) l73Var.f13142h.f17886f);
                    }
/* 38 */            return jMo6276j;
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: k */
                public final boolean mo1445k() {
/* 1 */             ArrayList arrayList = this.f12993k;
/* 3 */             int size = arrayList.size();
/* 9 */             for (int i = 0; i < size; i++) {
/* 21 */                if (!((l73) arrayList.get(i)).mo1445k()) {
/* 7 */                     return false;
                        }
                    }
/* 27 */            return true;
                }

                /* JADX INFO: renamed from: m */
                public final C2569zz m6277m() {
/* 1 */             int i = 0;
                    while (true) {
/* 2 */                 ArrayList arrayList = this.f12993k;
/* 8 */                 if (i >= arrayList.size()) {
/* 28 */                    return null;
                        }
/* 16 */                C2569zz c2569zz = ((l73) arrayList.get(i)).f13136b;
/* 22 */                if (c2569zz.f20438i0 != 8) {
/* 24 */                    return c2569zz;
                        }
/* 25 */                i++;
                    }
                }

                /* JADX INFO: renamed from: n */
                public final C2569zz m6278n() {
/* 1 */             ArrayList arrayList = this.f12993k;
/* 9 */             for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 17 */                C2569zz c2569zz = ((l73) arrayList.get(size)).f13136b;
/* 23 */                if (c2569zz.f20438i0 != 8) {
/* 25 */                    return c2569zz;
                        }
                    }
/* 29 */            return null;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ChainRun ");
/* 17 */            sb.append(this.f13140f == 0 ? "horizontal : " : "vertical : ");
/* 30 */            for (l73 l73Var : this.f12993k) {
/* 40 */                sb.append("<");
/* 43 */                sb.append(l73Var);
/* 48 */                sb.append("> ");
                    }
/* 52 */            return sb.toString();
                }
            }
