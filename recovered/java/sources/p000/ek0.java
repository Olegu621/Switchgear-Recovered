            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ek0 {

                /* JADX INFO: renamed from: a */
                public int f7744a;

                /* JADX INFO: renamed from: d */
                public C2051oz f7747d;

                /* JADX INFO: renamed from: e */
                public C2051oz f7748e;

                /* JADX INFO: renamed from: f */
                public C2051oz f7749f;

                /* JADX INFO: renamed from: g */
                public C2051oz f7750g;

                /* JADX INFO: renamed from: h */
                public int f7751h;

                /* JADX INFO: renamed from: i */
                public int f7752i;

                /* JADX INFO: renamed from: j */
                public int f7753j;

                /* JADX INFO: renamed from: k */
                public int f7754k;

                /* JADX INFO: renamed from: q */
                public int f7760q;

                /* JADX INFO: renamed from: r */
                public final /* synthetic */ gk0 f7761r;

                /* JADX INFO: renamed from: b */
                public C2569zz f7745b = null;

                /* JADX INFO: renamed from: c */
                public int f7746c = 0;

                /* JADX INFO: renamed from: l */
                public int f7755l = 0;

                /* JADX INFO: renamed from: m */
                public int f7756m = 0;

                /* JADX INFO: renamed from: n */
                public int f7757n = 0;

                /* JADX INFO: renamed from: o */
                public int f7758o = 0;

                /* JADX INFO: renamed from: p */
                public int f7759p = 0;

                public ek0(gk0 gk0Var, int i, C2051oz c2051oz, C2051oz c2051oz2, C2051oz c2051oz3, C2051oz c2051oz4, int i2) {
/* 4 */             this.f7761r = gk0Var;
/* 22 */            this.f7744a = i;
/* 24 */            this.f7747d = c2051oz;
/* 26 */            this.f7748e = c2051oz2;
/* 28 */            this.f7749f = c2051oz3;
/* 30 */            this.f7750g = c2051oz4;
/* 34 */            this.f7751h = gk0Var.f19490A0;
/* 38 */            this.f7752i = gk0Var.f19497w0;
/* 42 */            this.f7753j = gk0Var.f19491B0;
/* 46 */            this.f7754k = gk0Var.f19498x0;
/* 48 */            this.f7760q = i2;
                }

                /* JADX INFO: renamed from: a */
                public final void m3473a(C2569zz c2569zz) {
/* 1 */             int i = this.f7744a;
/* 3 */             int i2 = this.f7760q;
/* 7 */             EnumC2516yz enumC2516yz = EnumC2516yz.f19867c;
/* 11 */            gk0 gk0Var = this.f7761r;
/* 13 */            if (i == 0) {
/* 15 */                int iM3954Y = gk0Var.m3954Y(c2569zz, i2);
/* 23 */                if (c2569zz.f20415U[0] == enumC2516yz) {
/* 28 */                    this.f7759p++;
/* 30 */                    iM3954Y = 0;
                        }
/* 43 */                this.f7755l = iM3954Y + (c2569zz.f20438i0 != 8 ? gk0Var.f8651T0 : 0) + this.f7755l;
/* 47 */                int iM3953X = gk0Var.m3953X(c2569zz, this.f7760q);
/* 53 */                if (this.f7745b == null || this.f7746c < iM3953X) {
/* 59 */                    this.f7745b = c2569zz;
/* 61 */                    this.f7746c = iM3953X;
/* 63 */                    this.f7756m = iM3953X;
                        }
                    } else {
/* 66 */                int iM3954Y2 = gk0Var.m3954Y(c2569zz, i2);
/* 72 */                int iM3953X2 = gk0Var.m3953X(c2569zz, this.f7760q);
/* 80 */                if (c2569zz.f20415U[1] == enumC2516yz) {
/* 85 */                    this.f7759p++;
/* 87 */                    iM3953X2 = 0;
                        }
/* 100 */               this.f7756m = iM3953X2 + (c2569zz.f20438i0 != 8 ? gk0Var.f8652U0 : 0) + this.f7756m;
/* 104 */               if (this.f7745b == null || this.f7746c < iM3954Y2) {
/* 110 */                   this.f7745b = c2569zz;
/* 112 */                   this.f7746c = iM3954Y2;
/* 114 */                   this.f7755l = iM3954Y2;
                        }
                    }
/* 119 */           this.f7758o++;
                }

                /* JADX WARN: Code duplicated, block: B:89:0x0105 A[PHI: r5 r9
  0x0105: PHI (r5v25 int) = (r5v23 int), (r5v26 int) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0105: PHI (r9v24 float) = (r9v22 float), (r9v27 float) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX INFO: renamed from: b */
                public final void m3474b(boolean z, int i, boolean z2) {
                    gk0 gk0Var;
                    int i2;
                    int i3;
                    C2569zz c2569zz;
                    boolean z3;
                    char c;
                    int i4;
                    float f;
                    int i5;
/* 3 */             int i6 = this.f7758o;
/* 6 */             int i7 = 0;
                    while (true) {
/* 7 */                 gk0Var = this.f7761r;
/* 9 */                 if (i7 >= i6 || (i5 = this.f7757n + i7) >= gk0Var.f8663f1) {
                            break;
                        }
/* 21 */                C2569zz c2569zz2 = gk0Var.f8662e1[i5];
/* 23 */                if (c2569zz2 != null) {
/* 25 */                    c2569zz2.m10456E();
                        }
/* 28 */                i7++;
                    }
/* 31 */            if (i6 == 0 || this.f7745b == null) {
/* 724 */               return;
                    }
/* 45 */            boolean z4 = z2 && i == 0;
/* 48 */            int i8 = -1;
/* 49 */            int i9 = -1;
/* 50 */            for (int i10 = 0; i10 < i6; i10++) {
/* 61 */                int i11 = this.f7757n + (z ? (i6 - 1) - i10 : i10);
/* 64 */                if (i11 >= gk0Var.f8663f1) {
                            break;
                        }
/* 69 */                C2569zz c2569zz3 = gk0Var.f8662e1[i11];
/* 71 */                if (c2569zz3 != null && c2569zz3.f20438i0 == 0) {
/* 77 */                    if (i8 == -1) {
/* 79 */                        i8 = i10;
                            }
/* 80 */                    i9 = i10;
                        }
                    }
/* 84 */            int i12 = this.f7744a;
/* 86 */            C2569zz c2569zz4 = this.f7745b;
/* 88 */            if (i12 == 0) {
/* 92 */                c2569zz4.f20446m0 = gk0Var.f8640I0;
/* 94 */                C2051oz c2051oz = c2569zz4.f20407M;
/* 96 */                C2051oz c2051oz2 = c2569zz4.f20405K;
/* 98 */                int i13 = this.f7752i;
/* 100 */               if (i > 0) {
/* 104 */                   i13 += gk0Var.f8652U0;
                        }
/* 107 */               c2051oz2.m7243a(this.f7748e, i13);
/* 110 */               if (z2) {
/* 116 */                   c2051oz.m7243a(this.f7750g, this.f7754k);
                        }
/* 119 */               if (i > 0) {
/* 127 */                   this.f7748e.f14927d.f20407M.m7243a(c2051oz2, 0);
                        }
/* 133 */               if (gk0Var.f8654W0 != 3 || c2569zz4.f20399E) {
/* 169 */                   c2569zz = c2569zz4;
                            break;
                        }
/* 139 */               int i14 = 0;
                        while (true) {
/* 140 */                   if (i14 < i6) {
/* 151 */                       int i15 = this.f7757n + (z ? (i6 - 1) - i14 : i14);
/* 154 */                       if (i15 < gk0Var.f8663f1) {
/* 159 */                           c2569zz = gk0Var.f8662e1[i15];
/* 163 */                           if (c2569zz.f20399E) {
                                        break;
                                    } else {
/* 166 */                               i14++;
                                    }
                                }
                            }
/* 169 */                   c2569zz = c2569zz4;
                            break;
                        }
/* 170 */               int i16 = 0;
/* 171 */               C2569zz c2569zz5 = null;
/* 172 */               while (i16 < i6) {
/* 183 */                   int i17 = z ? (i6 - 1) - i16 : i16;
/* 188 */                   int i18 = this.f7757n + i17;
/* 192 */                   if (i18 >= gk0Var.f8663f1) {
/* 724 */                       return;
                            }
/* 198 */                   C2569zz c2569zz6 = gk0Var.f8662e1[i18];
/* 200 */                   if (c2569zz6 == null) {
/* 202 */                       i6 = i6;
/* 204 */                       z3 = z4;
/* 206 */                       i9 = i9;
/* 208 */                       c = 3;
                            } else {
/* 211 */                       C2051oz c2051oz3 = c2569zz6.f20405K;
/* 213 */                       C2051oz c2051oz4 = c2569zz6.f20407M;
/* 215 */                       C2051oz c2051oz5 = c2569zz6.f20404J;
/* 217 */                       z3 = z4;
/* 219 */                       if (i16 == 0) {
/* 227 */                           c2569zz6.m10468f(c2051oz5, this.f7747d, this.f7751h);
                                }
/* 233 */                       if (i17 == 0) {
/* 235 */                           int i19 = gk0Var.f8639H0;
/* 237 */                           float f2 = gk0Var.f8645N0;
/* 241 */                           if (z) {
/* 243 */                               f2 = 1.0f - f2;
                                    }
/* 249 */                           if (this.f7757n == 0 && (i4 = gk0Var.f8641J0) != -1) {
/* 258 */                               f = gk0Var.f8647P0;
/* 260 */                               if (z) {
/* 262 */                                   f = 1.0f - f;
                                        }
                                    } else if (!z2 || (i4 = gk0Var.f8643L0) == -1) {
/* 281 */                               i4 = i19;
/* 283 */                               f = f2;
                                    } else {
/* 276 */                               f = gk0Var.f8649R0;
/* 278 */                               if (z) {
/* 262 */                                   f = 1.0f - f;
                                        }
                                    }
/* 285 */                           c2569zz6.f20444l0 = i4;
/* 287 */                           c2569zz6.f20432f0 = f;
                                }
/* 291 */                       if (i16 == i6 - 1) {
/* 301 */                           c2569zz6.m10468f(c2569zz6.f20406L, this.f7749f, this.f7753j);
                                }
/* 307 */                       if (c2569zz5 != null) {
/* 309 */                           C2051oz c2051oz6 = c2569zz5.f20406L;
/* 313 */                           c2051oz5.m7243a(c2051oz6, gk0Var.f8651T0);
/* 316 */                           if (i16 == i8) {
/* 318 */                               int i20 = this.f7751h;
/* 324 */                               if (c2051oz5.m7250h()) {
/* 326 */                                   c2051oz5.f14931h = i20;
                                        }
                                    }
/* 329 */                           c2051oz6.m7243a(c2051oz5, 0);
/* 334 */                           if (i16 == i9 + 1) {
/* 336 */                               int i21 = this.f7753j;
/* 342 */                               if (c2051oz6.m7250h()) {
/* 344 */                                   c2051oz6.f14931h = i21;
                                        }
                                    }
                                }
/* 346 */                       if (c2569zz6 != c2569zz4) {
/* 348 */                           int i22 = gk0Var.f8654W0;
/* 350 */                           c = 3;
/* 351 */                           if (i22 == 3 && c2569zz.f20399E && c2569zz6 != c2569zz && c2569zz6.f20399E) {
/* 368 */                               c2569zz6.f20408N.m7243a(c2569zz.f20408N, 0);
                                    } else if (i22 == 0) {
/* 409 */                               c2051oz3.m7243a(c2051oz2, 0);
                                    } else if (i22 == 1) {
/* 404 */                               c2051oz4.m7243a(c2051oz, 0);
                                    } else if (z3) {
/* 384 */                               c2051oz3.m7243a(this.f7748e, this.f7752i);
/* 391 */                               c2051oz4.m7243a(this.f7750g, this.f7754k);
                                    } else {
/* 396 */                               c2051oz3.m7243a(c2051oz2, 0);
/* 399 */                               c2051oz4.m7243a(c2051oz, 0);
                                    }
                                } else {
/* 413 */                           c = 3;
                                }
/* 414 */                       c2569zz5 = c2569zz6;
                            }
/* 415 */                   i16++;
/* 418 */                   z4 = z3;
/* 420 */                   i9 = i9;
/* 422 */                   i6 = i6;
                        }
/* 724 */               return;
                    }
/* 428 */           int i23 = i6;
/* 430 */           boolean z5 = z4;
/* 432 */           int i24 = i9;
/* 436 */           c2569zz4.f20444l0 = gk0Var.f8639H0;
/* 438 */           C2051oz c2051oz7 = c2569zz4.f20404J;
/* 440 */           C2051oz c2051oz8 = c2569zz4.f20406L;
/* 442 */           int i25 = this.f7751h;
/* 444 */           if (i > 0) {
/* 448 */               i25 += gk0Var.f8651T0;
                    }
/* 449 */           if (z) {
/* 453 */               c2051oz8.m7243a(this.f7749f, i25);
/* 456 */               if (z2) {
/* 462 */                   c2051oz7.m7243a(this.f7747d, this.f7753j);
                        }
/* 465 */               if (i > 0) {
/* 474 */                   this.f7749f.f14927d.f20404J.m7243a(c2051oz8, 0);
                        }
                    } else {
/* 480 */               c2051oz7.m7243a(this.f7747d, i25);
/* 483 */               if (z2) {
/* 489 */                   c2051oz8.m7243a(this.f7749f, this.f7753j);
                        }
/* 492 */               if (i > 0) {
/* 501 */                   this.f7747d.f14927d.f20406L.m7243a(c2051oz7, 0);
                        }
                    }
/* 504 */           int i26 = 0;
/* 505 */           C2569zz c2569zz7 = null;
                    while (true) {
/* 506 */               int i27 = i23;
/* 508 */               if (i26 >= i27 || (i2 = this.f7757n + i26) >= gk0Var.f8663f1) {
/* 724 */                   return;
                        }
/* 521 */               C2569zz c2569zz8 = gk0Var.f8662e1[i2];
/* 523 */               if (c2569zz8 == null) {
/* 525 */                   i23 = i27;
                        } else {
/* 532 */                   C2051oz c2051oz9 = c2569zz8.f20404J;
/* 534 */                   C2051oz c2051oz10 = c2569zz8.f20405K;
/* 536 */                   C2051oz c2051oz11 = c2569zz8.f20406L;
/* 538 */                   if (i26 == 0) {
/* 544 */                       c2569zz8.m10468f(c2051oz10, this.f7748e, this.f7752i);
/* 547 */                       int i28 = gk0Var.f8640I0;
/* 549 */                       float f3 = gk0Var.f8646O0;
/* 553 */                       if (this.f7757n == 0) {
/* 555 */                           int i29 = gk0Var.f8642K0;
/* 557 */                           i23 = i27;
/* 559 */                           i3 = -1;
/* 560 */                           if (i29 != -1) {
/* 562 */                               f3 = gk0Var.f8648Q0;
                                    }
/* 564 */                           i28 = i29;
/* 578 */                           c2569zz8.f20446m0 = i28;
/* 580 */                           c2569zz8.f20434g0 = f3;
                                } else {
/* 566 */                           i23 = i27;
/* 568 */                           i3 = -1;
                                }
/* 569 */                       if (z2 && (i29 = gk0Var.f8644M0) != i3) {
/* 575 */                           f3 = gk0Var.f8650S0;
/* 564 */                           i28 = i29;
                                }
/* 578 */                       c2569zz8.f20446m0 = i28;
/* 580 */                       c2569zz8.f20434g0 = f3;
                            } else {
/* 583 */                       i23 = i27;
                            }
/* 588 */                   if (i26 == i23 - 1) {
/* 596 */                       c2569zz8.m10468f(c2569zz8.f20407M, this.f7750g, this.f7754k);
                            }
/* 599 */                   if (c2569zz7 != null) {
/* 601 */                       C2051oz c2051oz12 = c2569zz7.f20407M;
/* 605 */                       c2051oz10.m7243a(c2051oz12, gk0Var.f8652U0);
/* 608 */                       if (i26 == i8) {
/* 610 */                           int i30 = this.f7752i;
/* 616 */                           if (c2051oz10.m7250h()) {
/* 618 */                               c2051oz10.f14931h = i30;
                                    }
                                }
/* 621 */                       c2051oz12.m7243a(c2051oz10, 0);
/* 628 */                       if (i26 == i24 + 1) {
/* 630 */                           int i31 = this.f7754k;
/* 636 */                           if (c2051oz12.m7250h()) {
/* 638 */                               c2051oz12.f14931h = i31;
                                    }
                                }
                            }
/* 640 */                   if (c2569zz8 != c2569zz4) {
/* 642 */                       int i32 = gk0Var.f8653V0;
/* 645 */                       if (z) {
/* 647 */                           if (i32 == 0) {
/* 669 */                               c2051oz11.m7243a(c2051oz8, 0);
                                    } else if (i32 == 1) {
/* 664 */                               c2051oz9.m7243a(c2051oz7, 0);
                                    } else if (i32 == 2) {
/* 656 */                               c2051oz9.m7243a(c2051oz7, 0);
/* 659 */                               c2051oz11.m7243a(c2051oz8, 0);
                                    }
                                } else if (i32 == 0) {
/* 716 */                           c2051oz9.m7243a(c2051oz7, 0);
                                } else if (i32 == 1) {
/* 710 */                           c2051oz11.m7243a(c2051oz8, 0);
                                } else if (i32 == 2) {
/* 684 */                           if (z5) {
/* 690 */                               c2051oz9.m7243a(this.f7747d, this.f7751h);
/* 697 */                               c2051oz11.m7243a(this.f7749f, this.f7753j);
                                    } else {
/* 702 */                               c2051oz9.m7243a(c2051oz7, 0);
/* 705 */                               c2051oz11.m7243a(c2051oz8, 0);
                                    }
                                }
                            }
/* 719 */                   c2569zz7 = c2569zz8;
                        }
/* 720 */               i26++;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final int m3475c() {
/* 1 */             int i = this.f7744a;
/* 3 */             int i2 = this.f7756m;
                    return i == 1 ? i2 - this.f7761r.f8652U0 : i2;
                }

                /* JADX INFO: renamed from: d */
                public final int m3476d() {
/* 1 */             int i = this.f7744a;
/* 3 */             int i2 = this.f7755l;
                    return i == 0 ? i2 - this.f7761r.f8651T0 : i2;
                }

                /* JADX INFO: renamed from: e */
                public final void m3477e(int i) {
                    gk0 gk0Var;
                    int i2;
/* 1 */             int i3 = this.f7759p;
/* 3 */             if (i3 == 0) {
/* 205 */               return;
                    }
/* 7 */             int i4 = this.f7758o;
/* 9 */             int i5 = i / i3;
/* 12 */            int i6 = 0;
                    while (true) {
/* 13 */                gk0Var = this.f7761r;
/* 15 */                if (i6 >= i4 || (i2 = this.f7757n + i6) >= gk0Var.f8663f1) {
                            break;
                        }
/* 27 */                C2569zz c2569zz = gk0Var.f8662e1[i2];
/* 29 */                int i7 = this.f7744a;
/* 31 */                EnumC2516yz enumC2516yz = EnumC2516yz.f19865a;
/* 33 */                EnumC2516yz enumC2516yz2 = EnumC2516yz.f19867c;
/* 36 */                if (i7 == 0) {
/* 38 */                    if (c2569zz != null) {
/* 40 */                        EnumC2516yz[] enumC2516yzArr = c2569zz.f20415U;
/* 44 */                        if (enumC2516yzArr[0] == enumC2516yz2 && c2569zz.f20455r == 0) {
/* 59 */                            gk0Var.m10106W(c2569zz, enumC2516yz, i5, enumC2516yzArr[1], c2569zz.m10472l());
                                }
                            }
                        } else if (c2569zz != null) {
/* 66 */                    EnumC2516yz[] enumC2516yzArr2 = c2569zz.f20415U;
/* 70 */                    if (enumC2516yzArr2[1] == enumC2516yz2 && c2569zz.f20457s == 0) {
/* 78 */                        int i8 = i5;
/* 86 */                        gk0Var.m10106W(c2569zz, enumC2516yzArr2[0], c2569zz.m10475r(), enumC2516yz, i8);
/* 89 */                        i5 = i8;
                            }
                        }
/* 90 */                i6++;
                    }
/* 93 */            this.f7755l = 0;
/* 95 */            this.f7756m = 0;
/* 98 */            this.f7745b = null;
/* 100 */           this.f7746c = 0;
/* 102 */           int i9 = this.f7758o;
/* 105 */           for (int i10 = 0; i10 < i9; i10++) {
/* 109 */               int i11 = this.f7757n + i10;
/* 112 */               if (i11 >= gk0Var.f8663f1) {
/* 205 */                   return;
                        }
/* 117 */               C2569zz c2569zz2 = gk0Var.f8662e1[i11];
/* 123 */               if (this.f7744a == 0) {
/* 125 */                   int iM10475r = c2569zz2.m10475r();
/* 129 */                   int i12 = gk0Var.f8651T0;
/* 133 */                   if (c2569zz2.f20438i0 == 8) {
/* 135 */                       i12 = 0;
                            }
/* 140 */                   this.f7755l = iM10475r + i12 + this.f7755l;
/* 144 */                   int iM3953X = gk0Var.m3953X(c2569zz2, this.f7760q);
/* 150 */                   if (this.f7745b == null || this.f7746c < iM3953X) {
/* 156 */                       this.f7745b = c2569zz2;
/* 158 */                       this.f7746c = iM3953X;
/* 160 */                       this.f7756m = iM3953X;
                            }
                        } else {
/* 165 */                   int iM3954Y = gk0Var.m3954Y(c2569zz2, this.f7760q);
/* 171 */                   int iM3953X2 = gk0Var.m3953X(c2569zz2, this.f7760q);
/* 175 */                   int i13 = gk0Var.f8652U0;
/* 179 */                   if (c2569zz2.f20438i0 == 8) {
/* 181 */                       i13 = 0;
                            }
/* 186 */                   this.f7756m = iM3953X2 + i13 + this.f7756m;
/* 190 */                   if (this.f7745b == null || this.f7746c < iM3954Y) {
/* 196 */                       this.f7745b = c2569zz2;
/* 198 */                       this.f7746c = iM3954Y;
/* 200 */                       this.f7755l = iM3954Y;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m3478f(int i, C2051oz c2051oz, C2051oz c2051oz2, C2051oz c2051oz3, C2051oz c2051oz4, int i2, int i3, int i4, int i5, int i6) {
/* 1 */             this.f7744a = i;
/* 3 */             this.f7747d = c2051oz;
/* 5 */             this.f7748e = c2051oz2;
/* 7 */             this.f7749f = c2051oz3;
/* 9 */             this.f7750g = c2051oz4;
/* 11 */            this.f7751h = i2;
/* 13 */            this.f7752i = i3;
/* 15 */            this.f7753j = i4;
/* 17 */            this.f7754k = i5;
/* 19 */            this.f7760q = i6;
                }
            }
