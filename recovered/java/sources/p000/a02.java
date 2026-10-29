            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a02 {

                /* JADX INFO: renamed from: a */
                public final qc3 f23a = new qc3(20);

                /* JADX WARN: Code duplicated, block: B:135:0x02ed  */
                /* JADX WARN: Code duplicated, block: B:137:0x02f8  */
                /* JADX WARN: Code duplicated, block: B:164:0x046c  */
                /* JADX WARN: Code duplicated, block: B:166:0x0471 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:167:0x0473  */
                /* JADX WARN: Code duplicated, block: B:168:0x0479  */
                /* JADX WARN: Code duplicated, block: B:187:0x04b2  */
                /* JADX WARN: Code duplicated, block: B:189:0x04b6 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:190:0x04b8  */
                /* JADX WARN: Code duplicated, block: B:218:0x0544 A[Catch: xt | yl0 -> 0x05b3, TryCatch #2 {xt | yl0 -> 0x05b3, blocks: (B:215:0x052a, B:216:0x0540, B:218:0x0544, B:219:0x0547, B:221:0x054b, B:223:0x0555, B:224:0x055b, B:226:0x0560), top: B:260:0x052a }] */
                /* JADX WARN: Code duplicated, block: B:221:0x054b A[Catch: xt | yl0 -> 0x05b3, TryCatch #2 {xt | yl0 -> 0x05b3, blocks: (B:215:0x052a, B:216:0x0540, B:218:0x0544, B:219:0x0547, B:221:0x054b, B:223:0x0555, B:224:0x055b, B:226:0x0560), top: B:260:0x052a }] */
                /* JADX WARN: Code duplicated, block: B:223:0x0555 A[Catch: xt | yl0 -> 0x05b3, TryCatch #2 {xt | yl0 -> 0x05b3, blocks: (B:215:0x052a, B:216:0x0540, B:218:0x0544, B:219:0x0547, B:221:0x054b, B:223:0x0555, B:224:0x055b, B:226:0x0560), top: B:260:0x052a }] */
                /* JADX WARN: Code duplicated, block: B:310:0x04be A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:317:0x055b A[SYNTHETIC] */
                /* JADX INFO: renamed from: a */
                public final wc0 m13a(C0210cb c0210cb) throws un1, yl0, C2473xt {
                    int i;
                    ni0 ni0Var;
                    ni0 ni0Var2;
                    ni0 ni0Var3;
                    int i2;
                    float f;
                    float f2;
                    C2097q7 c2097q7M2930C;
                    float f3;
                    float f4;
                    float f5;
                    float f6;
                    int i3;
                    s42[] s42VarArr;
                    C2473xt c2473xt;
                    C2183sj c2183sj;
                    int i4;
                    l50 l50VarM7767g;
                    int i5;
                    int i6;
                    boolean z;
                    int i7;
                    int i8;
                    int iAbs;
/* 3 */             C2183sj c2183sjM1595r = c0210cb.m1595r();
/* 7 */             d52 d52Var = new d52(c2183sjM1595r);
/* 13 */            C2220tj c2220tj = new C2220tj(c2183sjM1595r, 1);
/* 18 */            ArrayList arrayList = (ArrayList) c2220tj.f17123c;
/* 20 */            int i9 = c2183sjM1595r.f16652b;
/* 22 */            int i10 = c2183sjM1595r.f16651a;
/* 26 */            int i11 = (i9 * 3) / 388;
/* 28 */            int i12 = 3;
/* 29 */            if (i11 < 3) {
/* 32 */                i11 = 3;
                    }
/* 34 */            int[] iArr = new int[5];
/* 36 */            int i13 = i11 - 1;
/* 38 */            boolean zM8798f = false;
                    while (true) {
/* 40 */                int i14 = 4;
/* 41 */                if (i13 >= i9 || zM8798f) {
                            break;
                        }
/* 45 */                C2220tj.m8794b(iArr);
/* 48 */                int i15 = 0;
/* 49 */                int i16 = 0;
/* 52 */                while (i16 < i10) {
/* 58 */                    if (c2183sjM1595r.m8516b(i16, i13)) {
/* 60 */                        i7 = i12;
/* 64 */                        if ((i15 & 1) == 1) {
/* 66 */                            i15++;
                                }
/* 71 */                        iArr[i15] = iArr[i15] + 1;
/* 73 */                        i8 = i14;
                            } else {
/* 77 */                        i7 = i12;
/* 81 */                        if ((i15 & 1) != 0) {
/* 237 */                           i8 = i14;
/* 242 */                           iArr[i15] = iArr[i15] + 1;
                                } else if (i15 == i14) {
/* 89 */                            if (!C2220tj.m8795d(iArr)) {
/* 208 */                               i8 = i14;
/* 212 */                               iArr[0] = iArr[2];
/* 216 */                               iArr[1] = iArr[i7];
/* 220 */                               iArr[2] = iArr[i8];
/* 222 */                               iArr[i7] = 1;
/* 224 */                               iArr[i8] = 0;
                                    } else if (c2220tj.m8797e(i13, i16, iArr)) {
/* 99 */                                if (c2220tj.f17122b) {
/* 101 */                                   zM8798f = c2220tj.m8798f();
/* 105 */                                   i8 = i14;
                                        } else {
/* 112 */                                   if (arrayList.size() <= 1) {
/* 114 */                                       i8 = i14;
/* 116 */                                       iAbs = 0;
                                                break;
                                            }
/* 119 */                                   Iterator it = arrayList.iterator();
/* 123 */                                   ni0 ni0Var4 = null;
                                            while (true) {
/* 128 */                                       if (!it.hasNext()) {
/* 114 */                                           i8 = i14;
/* 116 */                                           iAbs = 0;
                                                    break;
                                                }
/* 134 */                                       ni0 ni0Var5 = (ni0) it.next();
/* 136 */                                       i8 = i14;
/* 140 */                                       if (ni0Var5.f14275d >= 2) {
/* 142 */                                           if (ni0Var4 != null) {
/* 148 */                                               c2220tj.f17122b = true;
/* 170 */                                               iAbs = ((int) (Math.abs(ni0Var4.f16425a - ni0Var5.f16425a) - Math.abs(ni0Var4.f16426b - ni0Var5.f16426b))) / 2;
                                                        break;
                                                    }
/* 144 */                                           ni0Var4 = ni0Var5;
                                                }
/* 145 */                                       i14 = i8;
                                            }
/* 171 */                                   int i17 = iArr[2];
/* 173 */                                   if (iAbs > i17) {
/* 177 */                                       i13 += (iAbs - i17) - 2;
/* 178 */                                       i16 = i10 - 1;
                                            }
                                        }
/* 180 */                               C2220tj.m8794b(iArr);
/* 183 */                               i11 = 2;
/* 184 */                               i15 = 0;
                                    } else {
/* 187 */                               i8 = i14;
/* 191 */                               iArr[0] = iArr[2];
/* 195 */                               iArr[1] = iArr[i7];
/* 199 */                               iArr[2] = iArr[i8];
/* 201 */                               iArr[i7] = 1;
/* 203 */                               iArr[i8] = 0;
                                    }
/* 205 */                           i15 = i7;
                                } else {
/* 227 */                           i8 = i14;
/* 229 */                           i15++;
/* 234 */                           iArr[i15] = iArr[i15] + 1;
                                }
                            }
/* 244 */                   i16++;
/* 245 */                   i12 = i7;
/* 247 */                   i14 = i8;
                        }
/* 251 */               int i18 = i12;
/* 257 */               if (C2220tj.m8795d(iArr) && c2220tj.m8797e(i13, i10, iArr)) {
/* 265 */                   i11 = iArr[0];
/* 269 */                   if (c2220tj.f17122b) {
/* 271 */                       zM8798f = c2220tj.m8798f();
                            }
                        }
/* 276 */               i13 += i11;
/* 277 */               i12 = i18;
                    }
/* 281 */           int i19 = i12;
/* 287 */           int size = arrayList.size();
/* 293 */           if (size < i19) {
/* 1482 */              throw un1.f17603c;
                    }
/* 296 */           if (size > i19) {
/* 298 */               Iterator it2 = arrayList.iterator();
/* 302 */               float f7 = 0.0f;
/* 303 */               float f8 = 0.0f;
/* 308 */               while (it2.hasNext()) {
/* 316 */                   float f9 = ((ni0) it2.next()).f14274c;
/* 318 */                   f7 += f9;
/* 320 */                   f8 += f9 * f9;
                        }
                        float f10 = size;
/* 323 */               float f11 = f7 / f10;
/* 333 */               float fSqrt = (float) Math.sqrt((f8 / f10) - (f11 * f11));
/* 339 */               Collections.sort(arrayList, new oi0(f11, 1));
/* 346 */               float fMax = Math.max(0.2f * f11, fSqrt);
/* 350 */               int i20 = 0;
/* 356 */               while (i20 < arrayList.size() && arrayList.size() > 3) {
/* 380 */                   if (Math.abs(((ni0) arrayList.get(i20)).f14274c - f11) > fMax) {
/* 382 */                       arrayList.remove(i20);
/* 385 */                       i20--;
                            }
/* 387 */                   i20++;
                        }
                    }
/* 394 */           if (arrayList.size() > 3) {
/* 396 */               Iterator it3 = arrayList.iterator();
/* 400 */               float f12 = 0.0f;
/* 405 */               while (it3.hasNext()) {
/* 415 */                   f12 += ((ni0) it3.next()).f14274c;
                        }
/* 425 */               i = 0;
/* 430 */               Collections.sort(arrayList, new oi0(f12 / arrayList.size(), 0));
/* 442 */               arrayList.subList(3, arrayList.size()).clear();
                    } else {
/* 446 */               i = 0;
                    }
/* 466 */           ni0[] ni0VarArr = {(ni0) arrayList.get(i), (ni0) arrayList.get(1), (ni0) arrayList.get(2)};
/* 474 */           float fM8399a = s42.m8399a(ni0VarArr[i], ni0VarArr[1]);
/* 482 */           float fM8399a2 = s42.m8399a(ni0VarArr[1], ni0VarArr[2]);
/* 490 */           float fM8399a3 = s42.m8399a(ni0VarArr[i], ni0VarArr[2]);
/* 496 */           if (fM8399a2 >= fM8399a && fM8399a2 >= fM8399a3) {
/* 502 */               ni0Var = ni0VarArr[i];
/* 504 */               ni0Var2 = ni0VarArr[1];
/* 506 */               ni0Var3 = ni0VarArr[2];
                    } else if (fM8399a3 < fM8399a2 || fM8399a3 < fM8399a) {
/* 524 */               ni0Var = ni0VarArr[2];
/* 526 */               ni0Var2 = ni0VarArr[i];
/* 528 */               ni0Var3 = ni0VarArr[1];
                    } else {
/* 517 */               ni0Var = ni0VarArr[1];
/* 519 */               ni0Var2 = ni0VarArr[i];
/* 521 */               ni0Var3 = ni0VarArr[2];
                    }
/* 530 */           float f13 = ni0Var.f16425a;
/* 532 */           float f14 = ni0Var.f16426b;
/* 551 */           if (((ni0Var2.f16426b - f14) * (ni0Var3.f16425a - f13)) - ((ni0Var2.f16425a - f13) * (ni0Var3.f16426b - f14)) < 0.0f) {
/* 553 */               ni0 ni0Var6 = ni0Var3;
/* 555 */               ni0Var3 = ni0Var2;
/* 556 */               ni0Var2 = ni0Var6;
                    }
/* 560 */           ni0VarArr[0] = ni0Var2;
/* 562 */           ni0VarArr[1] = ni0Var;
/* 564 */           ni0VarArr[2] = ni0Var3;
/* 566 */           float fM2928A = d52Var.m2928A(ni0Var, ni0Var3);
/* 570 */           float f15 = ni0Var.f16425a;
/* 572 */           float f16 = ni0Var3.f16426b;
/* 574 */           float f17 = ni0Var3.f16425a;
/* 576 */           float fM2928A2 = d52Var.m2928A(ni0Var, ni0Var2);
/* 580 */           float f18 = ni0Var2.f16426b;
/* 584 */           float f19 = ni0Var2.f16425a;
/* 589 */           float f20 = (fM2928A2 + fM2928A) / 2.0f;
/* 594 */           if (f20 < 1.0f) {
/* 1479 */              throw un1.f17603c;
                    }
/* 600 */           float fM8399a4 = s42.m8399a(ni0Var, ni0Var3) / f20;
/* 620 */           int i21 = (int) (fM8399a4 + (fM8399a4 < 0.0f ? -0.5f : 0.5f));
/* 625 */           float fM8399a5 = s42.m8399a(ni0Var, ni0Var2) / f20;
/* 638 */           int i22 = (((int) (fM8399a5 + (fM8399a5 >= 0.0f ? 0.5f : -0.5f))) + i21) / 2;
/* 639 */           int i23 = i22 + 7;
/* 643 */           int i24 = i23 & 3;
/* 645 */           if (i24 == 0) {
/* 667 */               i2 = i22 + 8;
                    } else if (i24 == 2) {
/* 662 */               i2 = i22 + 6;
                    } else {
/* 652 */               if (i24 == 3) {
/* 659 */                   throw un1.f17603c;
                        }
/* 654 */               i2 = i23;
                    }
/* 669 */           int[] iArr2 = f23.f7977e;
/* 674 */           if (i2 % 4 != 1) {
/* 1476 */              throw yl0.m10156a();
                    }
                    try {
/* 680 */               f23 f23VarM3636c = f23.m3636c((i2 - 17) / 4);
/* 688 */               int i25 = (f23VarM3636c.f7979a * 4) + 10;
/* 695 */               if (f23VarM3636c.f7980b.length > 0) {
/* 702 */                   f = f19;
/* 709 */                   float f21 = 1.0f - (3.0f / i25);
/* 715 */                   int iM3503g = (int) AbstractC0886en.m3503g((f17 - f15) + f19, f15, f21, f15);
/* 720 */                   int iM3503g2 = (int) AbstractC0886en.m3503g((f16 - f14) + f18, f14, f21, f14);
/* 721 */                   f2 = f15;
/* 723 */                   int i26 = 4;
                            while (true) {
/* 727 */                       if (i26 <= 16) {
                                    try {
/* 730 */                               c2097q7M2930C = d52Var.m2930C(f20, i26, iM3503g, iM3503g2);
                                        break;
                                    } catch (un1 unused) {
/* 735 */                               i26 <<= 1;
                                    }
                                }
                            }
/* 746 */                   f3 = i2 - 3.5f;
/* 748 */                   if (c2097q7M2930C != null) {
/* 750 */                       f4 = c2097q7M2930C.f16425a;
/* 752 */                       f5 = c2097q7M2930C.f16426b;
/* 754 */                       f6 = f3 - 3.0f;
                            } else {
/* 763 */                       f4 = (f17 - f2) + f;
/* 766 */                       f5 = (f16 - f14) + f18;
/* 768 */                       f6 = f3;
                            }
/* 758 */                   float f22 = f5;
/* 771 */                   float f23 = ni0Var.f16425a;
/* 773 */                   float f24 = ni0Var.f16426b;
/* 775 */                   float f25 = ni0Var3.f16425a;
/* 777 */                   float f26 = ni0Var3.f16426b;
/* 779 */                   float f27 = ni0Var2.f16425a;
/* 781 */                   float f28 = ni0Var2.f16426b;
/* 795 */                   yr1 yr1VarM10172a = yr1.m10172a(3.5f, 3.5f, f3, 3.5f, f6, f6, 3.5f, f3);
/* 799 */                   float f29 = yr1VarM10172a.f19775e;
/* 801 */                   C2097q7 c2097q7 = c2097q7M2930C;
/* 803 */                   float f30 = yr1VarM10172a.f19779i;
/* 805 */                   float f31 = f29 * f30;
/* 809 */                   float f32 = yr1VarM10172a.f19776f;
/* 813 */                   float f33 = yr1VarM10172a.f19778h;
/* 817 */                   float f34 = f31 - (f32 * f33);
/* 821 */                   float f35 = yr1VarM10172a.f19777g;
/* 823 */                   float f36 = f32 * f35;
/* 827 */                   float f37 = yr1VarM10172a.f19774d;
/* 831 */                   float f38 = f36 - (f37 * f30);
/* 837 */                   float f39 = (f37 * f33) - (f29 * f35);
/* 841 */                   float f40 = yr1VarM10172a.f19773c;
/* 843 */                   float f41 = f40 * f33;
/* 847 */                   float f42 = yr1VarM10172a.f19772b;
/* 851 */                   float f43 = f41 - (f42 * f30);
/* 853 */                   float f44 = yr1VarM10172a.f19771a;
/* 859 */                   float f45 = (f30 * f44) - (f40 * f35);
/* 865 */                   float f46 = (f35 * f42) - (f33 * f44);
/* 871 */                   float f47 = (f42 * f32) - (f40 * f29);
/* 877 */                   float f48 = (f40 * f37) - (f32 * f44);
/* 882 */                   float f49 = (f44 * f29) - (f42 * f37);
/* 897 */                   yr1 yr1VarM10172a2 = yr1.m10172a(f23, f24, f25, f26, f4, f22, f27, f28);
/* 901 */                   float f50 = yr1VarM10172a2.f19771a;
/* 905 */                   float f51 = yr1VarM10172a2.f19774d;
/* 910 */                   float f52 = yr1VarM10172a2.f19777g;
/* 914 */                   float f53 = (f52 * f47) + (f51 * f43) + (f50 * f34);
/* 922 */                   float f54 = (f52 * f48) + (f51 * f45) + (f50 * f38);
/* 929 */                   float f55 = (f52 * f49) + (f51 * f46) + (f50 * f39);
/* 930 */                   float f56 = yr1VarM10172a2.f19772b;
/* 934 */                   float f57 = yr1VarM10172a2.f19775e;
/* 939 */                   float f58 = yr1VarM10172a2.f19778h;
/* 943 */                   float f59 = (f58 * f47) + (f57 * f43) + (f56 * f34);
/* 952 */                   float f60 = (f58 * f48) + (f57 * f45) + (f56 * f38);
/* 960 */                   float f61 = (f58 * f49) + (f57 * f46) + (f56 * f39);
/* 961 */                   float f62 = yr1VarM10172a2.f19773c;
/* 965 */                   float f63 = yr1VarM10172a2.f19776f;
/* 971 */                   float f64 = yr1VarM10172a2.f19779i;
/* 975 */                   float f65 = (f47 * f64) + (f43 * f63) + (f34 * f62);
/* 985 */                   float f66 = (f48 * f64) + (f45 * f63) + (f38 * f62);
/* 993 */                   float f67 = (f64 * f49) + (f63 * f46) + (f62 * f39);
/* 994 */                   if (i2 > 0 || i2 <= 0) {
/* 1466 */                      throw un1.f17603c;
                            }
/* 1000 */                  C2183sj c2183sj2 = new C2183sj(i2, i2);
/* 1003 */                  int i27 = i2 * 2;
/* 1005 */                  float[] fArr = new float[i27];
/* 1009 */                  int i28 = 0;
/* 1010 */                  while (i28 < i2) {
/* 1012 */                      int i29 = i2;
/* 1015 */                      float f68 = i28 + 0.5f;
/* 1019 */                      int i30 = 0;
/* 1020 */                      while (i30 < i27) {
/* 1022 */                          int i31 = i30;
/* 1029 */                          fArr[i31] = (i31 / 2) + 0.5f;
/* 1033 */                          fArr[i31 + 1] = f68;
/* 1035 */                          i30 = i31 + 2;
                                }
/* 1039 */                      for (int i32 = 0; i32 < i27; i32 += 2) {
/* 1041 */                          float f69 = fArr[i32];
/* 1043 */                          int i33 = i32 + 1;
/* 1045 */                          float f70 = fArr[i33];
/* 1053 */                          float f71 = (f66 * f70) + (f65 * f69) + f67;
/* 1065 */                          fArr[i32] = (((f54 * f70) + (f53 * f69)) + f55) / f71;
/* 1077 */                          fArr[i33] = (((f70 * f60) + (f69 * f59)) + f61) / f71;
                                }
/* 1082 */                      int i34 = c2183sjM1595r.f16652b;
/* 1084 */                      ni0 ni0Var7 = ni0Var;
/* 1086 */                      ni0 ni0Var8 = ni0Var2;
/* 1088 */                      int i35 = 0;
/* 1089 */                      boolean z2 = true;
/* 1091 */                      while (i35 < i27 && z2) {
/* 1097 */                          int i36 = (int) fArr[i35];
/* 1098 */                          int i37 = i35 + 1;
/* 1100 */                          int i38 = i35;
/* 1104 */                          int i39 = (int) fArr[i37];
/* 1105 */                          float f72 = f55;
/* 1108 */                          if (i36 < -1 || i36 > i10 || i39 < -1 || i39 > i34) {
/* 1155 */                              throw un1.f17603c;
                                    }
/* 1116 */                          if (i36 == -1) {
/* 1118 */                              fArr[i38] = 0.0f;
                                    } else {
/* 1122 */                              if (i36 == i10) {
/* 1127 */                                  fArr[i38] = i10 - 1;
                                        } else {
/* 1130 */                                  z = false;
                                        }
/* 1131 */                              if (i39 == -1) {
/* 1133 */                                  fArr[i37] = 0.0f;
                                        } else {
/* 1138 */                                  if (i39 == i34) {
/* 1143 */                                      fArr[i37] = i34 - 1;
                                            } else {
/* 1146 */                                      z2 = z;
                                            }
/* 1148 */                                  i35 = i38 + 2;
/* 1150 */                                  f55 = f72;
                                        }
/* 1135 */                              z2 = true;
/* 1148 */                              i35 = i38 + 2;
/* 1150 */                              f55 = f72;
                                    }
/* 1120 */                          z = true;
/* 1131 */                          if (i39 == -1) {
/* 1133 */                              fArr[i37] = 0.0f;
                                    } else {
/* 1138 */                              if (i39 == i34) {
/* 1143 */                                  fArr[i37] = i34 - 1;
                                        } else {
/* 1146 */                                  z2 = z;
                                        }
/* 1148 */                              i35 = i38 + 2;
/* 1150 */                              f55 = f72;
                                    }
/* 1135 */                          z2 = true;
/* 1148 */                          i35 = i38 + 2;
/* 1150 */                          f55 = f72;
                                }
/* 1156 */                      float f73 = f55;
/* 1158 */                      int i40 = i27 - 2;
/* 1160 */                      boolean z3 = true;
/* 1161 */                      while (i40 >= 0 && z3) {
/* 1167 */                          int i41 = (int) fArr[i40];
/* 1168 */                          int i42 = i40 + 1;
/* 1170 */                          int i43 = i40;
/* 1174 */                          int i44 = (int) fArr[i42];
/* 1178 */                          if (i41 < -1 || i41 > i10 || i44 < -1 || i44 > i34) {
/* 1220 */                              throw un1.f17603c;
                                    }
/* 1186 */                          if (i41 == -1) {
/* 1188 */                              fArr[i43] = 0.0f;
                                    } else {
/* 1192 */                              if (i41 == i10) {
/* 1197 */                                  fArr[i43] = i10 - 1;
                                        } else {
/* 1200 */                                  z3 = false;
                                        }
/* 1201 */                              if (i44 == -1) {
/* 1203 */                                  fArr[i42] = 0.0f;
                                        } else {
/* 1207 */                                  if (i44 == i34) {
/* 1212 */                                      fArr[i42] = i34 - 1;
                                            }
/* 1215 */                                  i40 = i43 - 2;
                                        }
/* 1205 */                              z3 = true;
/* 1215 */                              i40 = i43 - 2;
                                    }
/* 1190 */                          z3 = true;
/* 1201 */                          if (i44 == -1) {
/* 1203 */                              fArr[i42] = 0.0f;
                                    } else {
/* 1207 */                              if (i44 == i34) {
/* 1212 */                                  fArr[i42] = i34 - 1;
                                        }
/* 1215 */                              i40 = i43 - 2;
                                    }
/* 1205 */                          z3 = true;
/* 1215 */                          i40 = i43 - 2;
                                }
/* 1222 */                      for (int i45 = 0; i45 < i27; i45 += 2) {
                                    try {
/* 1236 */                              if (c2183sjM1595r.m8516b((int) fArr[i45], (int) fArr[i45 + 1])) {
/* 1240 */                                  c2183sj2.m8517c(i45 / 2, i28);
                                        }
                                    } catch (ArrayIndexOutOfBoundsException unused2) {
/* 1248 */                              throw un1.f17603c;
                                    }
                                }
/* 1249 */                      i28++;
/* 1251 */                      i2 = i29;
/* 1253 */                      ni0Var = ni0Var7;
/* 1255 */                      ni0Var2 = ni0Var8;
/* 1257 */                      f55 = f73;
                            }
/* 1261 */                  ni0 ni0Var9 = ni0Var;
/* 1263 */                  ni0 ni0Var10 = ni0Var2;
/* 1265 */                  if (c2097q7 == null) {
/* 1270 */                      i3 = 0;
/* 1268 */                      s42VarArr = new s42[]{ni0Var10, ni0Var9, ni0Var3};
                            } else {
/* 1286 */                      i3 = 0;
/* 1289 */                      s42VarArr = new s42[]{ni0Var10, ni0Var9, ni0Var3, c2097q7};
                            }
/* 1279 */                  s42[] s42VarArr2 = s42VarArr;
/* 1300 */                  qc3 qc3Var = this.f23a;
/* 1302 */                  qc3Var.getClass();
/* 1307 */                  C2220tj c2220tj2 = new C2220tj(c2183sj2, i3);
                            try {
/* 1312 */                      l50VarM7767g = qc3Var.m7767g(c2220tj2);
                            } catch (C2473xt e) {
/* 1318 */                      c2473xt = e;
/* 1319 */                      e = null;
                                try {
/* 1323 */                          c2220tj2.m8804l();
/* 1327 */                          c2220tj2.f17123c = null;
/* 1329 */                          c2220tj2.f17124d = null;
/* 1332 */                          c2220tj2.f17122b = true;
/* 1334 */                          c2220tj2.m8803k();
/* 1337 */                          c2220tj2.m8802j();
/* 1342 */                          c2183sj = (C2183sj) c2220tj2.f17121a;
/* 1344 */                          i4 = 0;
/* 1347 */                          while (i4 < c2183sj.f16651a) {
/* 1349 */                              int i46 = i4 + 1;
/* 1354 */                              for (i5 = i46; i5 < c2183sj.f16652b; i5++) {
/* 1364 */                                  if (c2183sj.m8516b(i4, i5) != c2183sj.m8516b(i5, i4)) {
/* 1366 */                                      c2183sj.m8515a(i5, i4);
/* 1369 */                                      c2183sj.m8515a(i4, i5);
                                            }
                                        }
/* 1375 */                              i4 = i46;
                                    }
/* 1377 */                          l50 l50VarM7767g2 = qc3Var.m7767g(c2220tj2);
/* 1386 */                          l50VarM7767g2.f13111d = new ec0(28);
/* 1388 */                          l50VarM7767g = l50VarM7767g2;
                                } catch (C2473xt | yl0 unused3) {
/* 1460 */                          if (e != null) {
/* 1462 */                              throw e;
                                    }
/* 1463 */                          throw c2473xt;
                                }
                            } catch (yl0 e2) {
/* 1321 */                      e = e2;
/* 1322 */                      c2473xt = null;
/* 1323 */                      c2220tj2.m8804l();
/* 1327 */                      c2220tj2.f17123c = null;
/* 1329 */                      c2220tj2.f17124d = null;
/* 1332 */                      c2220tj2.f17122b = true;
/* 1334 */                      c2220tj2.m8803k();
/* 1337 */                      c2220tj2.m8802j();
/* 1342 */                      c2183sj = (C2183sj) c2220tj2.f17121a;
/* 1344 */                      i4 = 0;
/* 1347 */                      while (i4 < c2183sj.f16651a) {
/* 1349 */                          int i47 = i4 + 1;
/* 1354 */                          while (i5 < c2183sj.f16652b) {
/* 1364 */                              if (c2183sj.m8516b(i4, i5) != c2183sj.m8516b(i5, i4)) {
/* 1366 */                                  c2183sj.m8515a(i5, i4);
/* 1369 */                                  c2183sj.m8515a(i4, i5);
                                        }
                                    }
/* 1375 */                          i4 = i47;
                                }
/* 1377 */                      l50 l50VarM7767g3 = qc3Var.m7767g(c2220tj2);
/* 1386 */                      l50VarM7767g3.f13111d = new ec0(28);
/* 1388 */                      l50VarM7767g = l50VarM7767g3;
                            }
/* 1389 */                  int i48 = l50VarM7767g.f13112e;
/* 1393 */                  if (l50VarM7767g.f13111d != null && s42VarArr2.length >= 3) {
/* 1402 */                      s42 s42Var = s42VarArr2[0];
/* 1406 */                      s42VarArr2[0] = s42VarArr2[r14];
/* 1408 */                      s42VarArr2[r14] = s42Var;
                            }
/* 1414 */                  wc0 wc0Var = new wc0(l50VarM7767g.f13108a, 28);
/* 1417 */                  List list = l50VarM7767g.f13109b;
/* 1419 */                  if (list != null) {
/* 1423 */                      wc0Var.m9525B(r42.f15875a, list);
                            }
/* 1426 */                  String str = l50VarM7767g.f13110c;
/* 1428 */                  if (str != null) {
/* 1432 */                      wc0Var.m9525B(r42.f15876b, str);
                            }
/* 1435 */                  if (i48 >= 0 && (i6 = l50VarM7767g.f13113f) >= 0) {
/* 1447 */                      wc0Var.m9525B(r42.f15877c, Integer.valueOf(i6));
/* 1456 */                      wc0Var.m9525B(r42.f15878d, Integer.valueOf(i48));
                            }
/* 1459 */                  return wc0Var;
                        }
/* 738 */               f = f19;
/* 740 */               f2 = f15;
/* 742 */               c2097q7M2930C = null;
/* 746 */               f3 = i2 - 3.5f;
/* 748 */               if (c2097q7M2930C != null) {
/* 750 */                   f4 = c2097q7M2930C.f16425a;
/* 752 */                   f5 = c2097q7M2930C.f16426b;
/* 754 */                   f6 = f3 - 3.0f;
                        } else {
/* 763 */                   f4 = (f17 - f2) + f;
/* 766 */                   f5 = (f16 - f14) + f18;
/* 768 */                   f6 = f3;
                        }
/* 758 */               float f210 = f5;
/* 771 */               float f211 = ni0Var.f16425a;
/* 773 */               float f212 = ni0Var.f16426b;
/* 775 */               float f213 = ni0Var3.f16425a;
/* 777 */               float f214 = ni0Var3.f16426b;
/* 779 */               float f215 = ni0Var2.f16425a;
/* 781 */               float f216 = ni0Var2.f16426b;
/* 795 */               yr1 yr1VarM10172a3 = yr1.m10172a(3.5f, 3.5f, f3, 3.5f, f6, f6, 3.5f, f3);
/* 799 */               float f217 = yr1VarM10172a3.f19775e;
/* 801 */               C2097q7 c2097q8 = c2097q7M2930C;
/* 803 */               float f310 = yr1VarM10172a3.f19779i;
/* 805 */               float f311 = f217 * f310;
/* 809 */               float f312 = yr1VarM10172a3.f19776f;
/* 813 */               float f313 = yr1VarM10172a3.f19778h;
/* 817 */               float f314 = f311 - (f312 * f313);
/* 821 */               float f315 = yr1VarM10172a3.f19777g;
/* 823 */               float f316 = f312 * f315;
/* 827 */               float f317 = yr1VarM10172a3.f19774d;
/* 831 */               float f318 = f316 - (f317 * f310);
/* 837 */               float f319 = (f317 * f313) - (f217 * f315);
/* 841 */               float f410 = yr1VarM10172a3.f19773c;
/* 843 */               float f411 = f410 * f313;
/* 847 */               float f412 = yr1VarM10172a3.f19772b;
/* 851 */               float f413 = f411 - (f412 * f310);
/* 853 */               float f414 = yr1VarM10172a3.f19771a;
/* 859 */               float f415 = (f310 * f414) - (f410 * f315);
/* 865 */               float f416 = (f315 * f412) - (f313 * f414);
/* 871 */               float f417 = (f412 * f312) - (f410 * f217);
/* 877 */               float f418 = (f410 * f317) - (f312 * f414);
/* 882 */               float f419 = (f414 * f217) - (f412 * f317);
/* 897 */               yr1 yr1VarM10172a4 = yr1.m10172a(f211, f212, f213, f214, f4, f210, f215, f216);
/* 901 */               float f510 = yr1VarM10172a4.f19771a;
/* 905 */               float f511 = yr1VarM10172a4.f19774d;
/* 910 */               float f512 = yr1VarM10172a4.f19777g;
/* 914 */               float f513 = (f512 * f417) + (f511 * f413) + (f510 * f314);
/* 922 */               float f514 = (f512 * f418) + (f511 * f415) + (f510 * f318);
/* 929 */               float f515 = (f512 * f419) + (f511 * f416) + (f510 * f319);
/* 930 */               float f516 = yr1VarM10172a4.f19772b;
/* 934 */               float f517 = yr1VarM10172a4.f19775e;
/* 939 */               float f518 = yr1VarM10172a4.f19778h;
/* 943 */               float f519 = (f518 * f417) + (f517 * f413) + (f516 * f314);
/* 952 */               float f610 = (f518 * f418) + (f517 * f415) + (f516 * f318);
/* 960 */               float f611 = (f518 * f419) + (f517 * f416) + (f516 * f319);
/* 961 */               float f612 = yr1VarM10172a4.f19773c;
/* 965 */               float f613 = yr1VarM10172a4.f19776f;
/* 971 */               float f614 = yr1VarM10172a4.f19779i;
/* 975 */               float f615 = (f417 * f614) + (f413 * f613) + (f314 * f612);
/* 985 */               float f616 = (f418 * f614) + (f415 * f613) + (f318 * f612);
/* 993 */               float f617 = (f614 * f419) + (f613 * f416) + (f612 * f319);
/* 994 */               if (i2 > 0) {
                        }
/* 1466 */              throw un1.f17603c;
                    } catch (IllegalArgumentException unused4) {
/* 1471 */              throw yl0.m10156a();
                    }
                }
            }
