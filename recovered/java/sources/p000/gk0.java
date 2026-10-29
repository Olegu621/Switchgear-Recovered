            package p000;

            import androidx.constraintlayout.widget.C0075b;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gk0 extends y53 {

                /* JADX INFO: renamed from: e1 */
                public C2569zz[] f8662e1;

                /* JADX INFO: renamed from: H0 */
                public int f8639H0 = -1;

                /* JADX INFO: renamed from: I0 */
                public int f8640I0 = -1;

                /* JADX INFO: renamed from: J0 */
                public int f8641J0 = -1;

                /* JADX INFO: renamed from: K0 */
                public int f8642K0 = -1;

                /* JADX INFO: renamed from: L0 */
                public int f8643L0 = -1;

                /* JADX INFO: renamed from: M0 */
                public int f8644M0 = -1;

                /* JADX INFO: renamed from: N0 */
                public float f8645N0 = 0.5f;

                /* JADX INFO: renamed from: O0 */
                public float f8646O0 = 0.5f;

                /* JADX INFO: renamed from: P0 */
                public float f8647P0 = 0.5f;

                /* JADX INFO: renamed from: Q0 */
                public float f8648Q0 = 0.5f;

                /* JADX INFO: renamed from: R0 */
                public float f8649R0 = 0.5f;

                /* JADX INFO: renamed from: S0 */
                public float f8650S0 = 0.5f;

                /* JADX INFO: renamed from: T0 */
                public int f8651T0 = 0;

                /* JADX INFO: renamed from: U0 */
                public int f8652U0 = 0;

                /* JADX INFO: renamed from: V0 */
                public int f8653V0 = 2;

                /* JADX INFO: renamed from: W0 */
                public int f8654W0 = 2;

                /* JADX INFO: renamed from: X0 */
                public int f8655X0 = 0;

                /* JADX INFO: renamed from: Y0 */
                public int f8656Y0 = -1;

                /* JADX INFO: renamed from: Z0 */
                public int f8657Z0 = 0;

                /* JADX INFO: renamed from: a1 */
                public final ArrayList f8658a1 = new ArrayList();

                /* JADX INFO: renamed from: b1 */
                public C2569zz[] f8659b1 = null;

                /* JADX INFO: renamed from: c1 */
                public C2569zz[] f8660c1 = null;

                /* JADX INFO: renamed from: d1 */
                public int[] f8661d1 = null;

                /* JADX INFO: renamed from: f1 */
                public int f8663f1 = 0;

                /* JADX WARN: Code duplicated, block: B:400:0x06d2  */
                /* JADX WARN: Code duplicated, block: B:401:0x06d5 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:402:0x06d7  */
                /* JADX WARN: Code duplicated, block: B:403:0x06de A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:405:0x06e1  */
                /* JADX WARN: Code duplicated, block: B:408:0x06f1  */
                /* JADX WARN: Code duplicated, block: B:409:0x06f4  */
                /* JADX WARN: Code duplicated, block: B:74:0x010e  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p000.y53
                /* JADX INFO: renamed from: V */
                public final void mo1431V(int i, int i2, int i3, int i4) {
                    int i5;
                    int i6;
                    C2569zz[] c2569zzArr;
                    int i7;
                    int i8;
                    int i9;
                    int[] iArr;
                    int i10;
                    ek0 ek0Var;
                    char c;
                    int i11;
                    boolean z;
                    int i12;
                    int i13;
                    int i14;
                    int iCeil;
                    Object obj;
                    C2569zz c2569zz;
                    int i15;
                    int i16;
                    int i17;
                    int i18;
/* 5 */             int i19 = this.f6907v0;
/* 7 */             EnumC2516yz enumC2516yz = EnumC2516yz.f19867c;
/* 9 */             EnumC2516yz enumC2516yz2 = EnumC2516yz.f19866b;
/* 13 */            if (i19 > 0) {
/* 15 */                C2569zz c2569zz2 = this.f20416V;
/* 24 */                InterfaceC2462xi interfaceC2462xi = c2569zz2 != null ? ((a00) c2569zz2).f21y0 : null;
/* 25 */                if (interfaceC2462xi == null) {
/* 27 */                    this.f19493D0 = 0;
/* 29 */                    this.f19494E0 = 0;
/* 31 */                    this.f19492C0 = false;
/* 33 */                    return;
                        }
/* 37 */                for (int i20 = 0; i20 < this.f6907v0; i20++) {
/* 41 */                    C2569zz c2569zz3 = this.f6906u0[i20];
/* 43 */                    if (c2569zz3 != null && !(c2569zz3 instanceof bs0)) {
/* 51 */                        EnumC2516yz enumC2516yzM10471k = c2569zz3.m10471k(0);
/* 55 */                        EnumC2516yz enumC2516yzM10471k2 = c2569zz3.m10471k(1);
/* 59 */                        if (enumC2516yzM10471k != enumC2516yz || c2569zz3.f20455r == 1 || enumC2516yzM10471k2 != enumC2516yz || c2569zz3.f20457s == 1) {
/* 72 */                            if (enumC2516yzM10471k == enumC2516yz) {
/* 74 */                                enumC2516yzM10471k = enumC2516yz2;
                                    }
/* 75 */                            if (enumC2516yzM10471k2 == enumC2516yz) {
/* 77 */                                enumC2516yzM10471k2 = enumC2516yz2;
                                    }
/* 78 */                            C2332wi c2332wi = this.f19495F0;
/* 80 */                            c2332wi.f18637a = enumC2516yzM10471k;
/* 82 */                            c2332wi.f18638b = enumC2516yzM10471k2;
/* 88 */                            c2332wi.f18639c = c2569zz3.m10475r();
/* 94 */                            c2332wi.f18640d = c2569zz3.m10472l();
/* 99 */                            ((C0075b) interfaceC2462xi).m524b(c2569zz3, c2332wi);
/* 104 */                           c2569zz3.m10464P(c2332wi.f18641e);
/* 109 */                           c2569zz3.m10461M(c2332wi.f18642f);
/* 114 */                           c2569zz3.m10458J(c2332wi.f18643g);
                                }
                            }
                        }
                    }
/* 120 */           int i21 = this.f19490A0;
/* 122 */           int i22 = this.f19491B0;
/* 124 */           int i23 = this.f19497w0;
/* 126 */           int i24 = this.f19498x0;
/* 129 */           int[] iArr2 = new int[2];
/* 133 */           int i25 = (i2 - i21) - i22;
/* 135 */           int i26 = this.f8657Z0;
/* 137 */           if (i26 == 1) {
/* 141 */               i25 = (i4 - i23) - i24;
                    }
/* 143 */           int i27 = i25;
/* 145 */           int i28 = this.f8639H0;
/* 148 */           if (i26 == 0) {
/* 150 */               if (i28 == -1) {
/* 152 */                   this.f8639H0 = 0;
                        }
/* 156 */               if (this.f8640I0 == -1) {
/* 158 */                   this.f8640I0 = 0;
                        }
                    } else {
/* 161 */               if (i28 == -1) {
/* 163 */                   this.f8639H0 = 0;
                        }
/* 167 */               if (this.f8640I0 == -1) {
/* 169 */                   this.f8640I0 = 0;
                        }
                    }
/* 171 */           C2569zz[] c2569zzArr2 = this.f6906u0;
/* 173 */           int i29 = 0;
/* 174 */           int i30 = 0;
/* 175 */           int i31 = 0;
                    while (true) {
/* 177 */               i5 = this.f6907v0;
/* 179 */               i6 = i21;
/* 183 */               if (i29 >= i5) {
                            break;
                        }
/* 191 */               if (this.f6906u0[i29].f20438i0 == 8) {
/* 193 */                   i30++;
                        }
/* 195 */               i29++;
/* 197 */               i21 = i6;
                    }
/* 200 */           if (i30 > 0) {
/* 203 */               C2569zz[] c2569zzArr3 = new C2569zz[i5 - i30];
/* 205 */               int i32 = 0;
/* 207 */               int i33 = 0;
/* 210 */               while (i32 < this.f6907v0) {
/* 214 */                   C2569zz c2569zz4 = this.f6906u0[i32];
/* 216 */                   C2569zz[] c2569zzArr4 = c2569zzArr3;
/* 220 */                   if (c2569zz4.f20438i0 != 8) {
/* 222 */                       c2569zzArr4[i33] = c2569zz4;
/* 224 */                       i33++;
                            }
/* 226 */                   i32++;
/* 228 */                   c2569zzArr3 = c2569zzArr4;
                        }
/* 233 */               i5 = i33;
/* 234 */               c2569zzArr = c2569zzArr3;
                    } else {
/* 237 */               c2569zzArr = c2569zzArr2;
                    }
/* 238 */           this.f8662e1 = c2569zzArr;
/* 240 */           this.f8663f1 = i5;
/* 242 */           int i34 = this.f8655X0;
/* 244 */           ArrayList arrayList = this.f8658a1;
/* 246 */           if (i34 != 0) {
/* 248 */               C2051oz c2051oz = this.f20405K;
/* 250 */               C2051oz c2051oz2 = this.f20404J;
/* 254 */               C2051oz c2051oz3 = this.f20406L;
/* 258 */               C2051oz c2051oz4 = this.f20407M;
/* 263 */               if (i34 == 1) {
/* 1105 */                  i7 = i22;
/* 1107 */                  i8 = i23;
/* 1109 */                  i9 = i24;
/* 1113 */                  iArr = iArr2;
/* 1117 */                  i10 = i6;
/* 1123 */                  int i35 = this.f8657Z0;
/* 1125 */                  if (i5 != 0) {
/* 1129 */                      arrayList.clear();
/* 1142 */                      ek0 ek0Var2 = new ek0(this, i35, this.f20404J, this.f20405K, this.f20406L, this.f20407M, i27);
/* 1145 */                      arrayList.add(ek0Var2);
/* 1148 */                      if (i35 == 0) {
/* 1150 */                          i12 = 0;
/* 1152 */                          int i36 = 0;
/* 1153 */                          int i37 = 0;
/* 1154 */                          while (i37 < i5) {
/* 1156 */                              C2569zz c2569zz5 = c2569zzArr[i37];
/* 1158 */                              int iM3954Y = m3954Y(c2569zz5, i27);
/* 1166 */                              if (c2569zz5.f20415U[0] == enumC2516yz) {
/* 1168 */                                  i12++;
                                        }
/* 1170 */                              int i38 = i12;
/* 1187 */                              boolean z2 = (i36 == i27 || (this.f8651T0 + i36) + iM3954Y > i27) && ek0Var2.f7745b != null;
/* 1189 */                              if (!z2 && i37 > 0 && (i14 = this.f8656Y0) > 0 && i37 % i14 == 0) {
/* 1201 */                                  z2 = true;
                                        }
/* 1202 */                              if (z2) {
/* 1214 */                                  ek0Var2 = new ek0(this, i35, this.f20404J, this.f20405K, this.f20406L, this.f20407M, i27);
/* 1217 */                                  ek0Var2.f7757n = i37;
/* 1219 */                                  arrayList.add(ek0Var2);
                                        } else {
/* 1225 */                                  if (i37 > 0) {
/* 1231 */                                      i36 = this.f8651T0 + iM3954Y + i36;
                                            }
/* 1233 */                                  ek0Var2.m3473a(c2569zz5);
/* 1236 */                                  i37++;
/* 1238 */                                  i12 = i38;
                                        }
/* 1222 */                              i36 = iM3954Y;
/* 1233 */                              ek0Var2.m3473a(c2569zz5);
/* 1236 */                              i37++;
/* 1238 */                              i12 = i38;
                                    }
                                } else {
/* 1241 */                          i12 = 0;
/* 1243 */                          int i39 = 0;
/* 1244 */                          int i40 = 0;
/* 1245 */                          while (i40 < i5) {
/* 1247 */                              C2569zz c2569zz6 = c2569zzArr[i40];
/* 1249 */                              int iM3953X = m3953X(c2569zz6, i27);
/* 1259 */                              if (c2569zz6.f20415U[1] == enumC2516yz) {
/* 1261 */                                  i12++;
                                        }
/* 1263 */                              int i41 = i12;
/* 1280 */                              boolean z3 = (i39 == i27 || (this.f8652U0 + i39) + iM3953X > i27) && ek0Var2.f7745b != null;
/* 1282 */                              if (!z3 && i40 > 0 && (i13 = this.f8656Y0) > 0 && i40 % i13 == 0) {
/* 1294 */                                  z3 = true;
                                        }
/* 1295 */                              if (z3) {
/* 1307 */                                  ek0Var2 = new ek0(this, i35, this.f20404J, this.f20405K, this.f20406L, this.f20407M, i27);
/* 1310 */                                  ek0Var2.f7757n = i40;
/* 1312 */                                  arrayList.add(ek0Var2);
                                        } else {
/* 1318 */                                  if (i40 > 0) {
/* 1324 */                                      i39 = this.f8652U0 + iM3953X + i39;
                                            }
/* 1326 */                                  ek0Var2.m3473a(c2569zz6);
/* 1329 */                                  i40++;
/* 1331 */                                  i12 = i41;
                                        }
/* 1315 */                              i39 = iM3953X;
/* 1326 */                              ek0Var2.m3473a(c2569zz6);
/* 1329 */                              i40++;
/* 1331 */                              i12 = i41;
                                    }
                                }
/* 1334 */                      int size = arrayList.size();
/* 1338 */                      int i42 = this.f19490A0;
/* 1340 */                      int i43 = this.f19497w0;
/* 1342 */                      int i44 = this.f19491B0;
/* 1344 */                      int i45 = this.f19498x0;
/* 1346 */                      EnumC2516yz[] enumC2516yzArr = this.f20415U;
/* 1362 */                      boolean z4 = enumC2516yzArr[0] == enumC2516yz2 || enumC2516yzArr[1] == enumC2516yz2;
/* 1363 */                      if (i12 > 0 && z4) {
/* 1369 */                          for (int i46 = 0; i46 < size; i46++) {
/* 1375 */                              ek0 ek0Var3 = (ek0) arrayList.get(i46);
/* 1377 */                              if (i35 == 0) {
/* 1385 */                                  ek0Var3.m3477e(i27 - ek0Var3.m3476d());
                                        } else {
/* 1395 */                                  ek0Var3.m3477e(i27 - ek0Var3.m3475c());
                                        }
                                    }
                                }
/* 1401 */                      int i47 = i42;
/* 1403 */                      int i48 = i43;
/* 1405 */                      int i49 = i44;
/* 1407 */                      int i50 = i45;
/* 1409 */                      C2051oz c2051oz5 = c2051oz;
/* 1411 */                      C2051oz c2051oz6 = c2051oz2;
/* 1415 */                      int iMax = 0;
/* 1416 */                      int i51 = 0;
/* 1417 */                      C2051oz c2051oz7 = c2051oz3;
/* 1419 */                      C2051oz c2051oz8 = c2051oz4;
/* 1421 */                      for (int i52 = 0; i52 < size; i52++) {
/* 1427 */                          ek0 ek0Var4 = (ek0) arrayList.get(i52);
/* 1429 */                          if (i35 == 0) {
/* 1433 */                              if (i52 < size - 1) {
/* 1445 */                                  c2051oz8 = ((ek0) arrayList.get(i52 + 1)).f7745b.f20405K;
/* 1449 */                                  i50 = 0;
                                        } else {
/* 1452 */                                  i50 = this.f19498x0;
/* 1456 */                                  c2051oz8 = c2051oz4;
                                        }
/* 1460 */                              C2051oz c2051oz9 = ek0Var4.f7745b.f20407M;
/* 1468 */                              ek0Var4.m3478f(i35, c2051oz6, c2051oz5, c2051oz7, c2051oz8, i47, i48, i49, i50, i27);
/* 1475 */                              iMax = Math.max(iMax, ek0Var4.m3476d());
/* 1483 */                              int iM3475c = ek0Var4.m3475c() + i51;
/* 1484 */                              if (i52 > 0) {
/* 1488 */                                  iM3475c += this.f8652U0;
                                        }
/* 1489 */                              i51 = iM3475c;
/* 1490 */                              c2051oz5 = c2051oz9;
/* 1492 */                              i48 = 0;
                                    } else {
/* 1497 */                              if (i52 < size - 1) {
/* 1509 */                                  c2051oz7 = ((ek0) arrayList.get(i52 + 1)).f7745b.f20404J;
/* 1513 */                                  i49 = 0;
                                        } else {
/* 1516 */                                  i49 = this.f19491B0;
/* 1520 */                                  c2051oz7 = c2051oz3;
                                        }
/* 1524 */                              C2051oz c2051oz10 = ek0Var4.f7745b.f20406L;
/* 1532 */                              ek0Var4.m3478f(i35, c2051oz6, c2051oz5, c2051oz7, c2051oz8, i47, i48, i49, i50, i27);
/* 1539 */                              int iM3476d = ek0Var4.m3476d() + iMax;
/* 1544 */                              int iMax2 = Math.max(i51, ek0Var4.m3475c());
/* 1548 */                              if (i52 > 0) {
/* 1552 */                                  iM3476d += this.f8651T0;
                                        }
/* 1553 */                              i51 = iMax2;
/* 1554 */                              iMax = iM3476d;
/* 1555 */                              c2051oz6 = c2051oz10;
/* 1557 */                              i47 = 0;
                                    }
                                }
/* 1563 */                      iArr[0] = iMax;
/* 1567 */                      iArr[1] = i51;
                            }
                        } else if (i34 == 2) {
/* 777 */                   i7 = i22;
/* 779 */                   i8 = i23;
/* 781 */                   i9 = i24;
/* 783 */                   iArr = iArr2;
/* 785 */                   i10 = i6;
/* 789 */                   int i53 = this.f8657Z0;
/* 791 */                   int iCeil2 = this.f8656Y0;
/* 793 */                   if (i53 == 0) {
/* 795 */                       if (iCeil2 <= 0) {
/* 799 */                           int i54 = 0;
/* 800 */                           iCeil = 0;
/* 801 */                           for (int i55 = 0; i55 < i5; i55++) {
/* 803 */                               if (i55 > 0) {
/* 807 */                                   i54 += this.f8651T0;
                                        }
/* 808 */                               C2569zz c2569zz7 = c2569zzArr[i55];
/* 810 */                               if (c2569zz7 != null) {
/* 817 */                                   int iM3954Y2 = m3954Y(c2569zz7, i27) + i54;
/* 818 */                                   if (iM3954Y2 > i27) {
                                                break;
                                            }
/* 821 */                                   iCeil++;
/* 823 */                                   i54 = iM3954Y2;
                                        }
                                    }
                                } else {
/* 830 */                           iCeil = iCeil2;
                                }
/* 827 */                       iCeil2 = 0;
                            } else {
/* 832 */                       if (iCeil2 <= 0) {
/* 836 */                           int i56 = 0;
/* 837 */                           int i57 = 0;
/* 838 */                           for (int i58 = 0; i58 < i5; i58++) {
/* 840 */                               if (i58 > 0) {
/* 844 */                                   i56 += this.f8652U0;
                                        }
/* 845 */                               C2569zz c2569zz8 = c2569zzArr[i58];
/* 847 */                               if (c2569zz8 != null) {
/* 854 */                                   int iM3953X2 = m3953X(c2569zz8, i27) + i56;
/* 855 */                                   if (iM3953X2 > i27) {
                                                break;
                                            }
/* 858 */                                   i57++;
/* 860 */                                   i56 = iM3953X2;
                                        }
                                    }
/* 864 */                           iCeil2 = i57;
                                }
/* 865 */                       iCeil = 0;
                            }
/* 869 */                   if (this.f8661d1 == null) {
/* 874 */                       this.f8661d1 = new int[2];
                            }
/* 887 */                   boolean z5 = (iCeil2 == 0 && i53 == 1) || (iCeil == 0 && i53 == 0);
/* 889 */                   while (!z5) {
/* 891 */                       if (i53 == 0) {
/* 901 */                           iCeil2 = (int) Math.ceil(i5 / iCeil);
                                } else {
/* 911 */                           iCeil = (int) Math.ceil(i5 / iCeil2);
                                }
/* 912 */                       C2569zz[] c2569zzArr5 = this.f8660c1;
/* 914 */                       if (c2569zzArr5 == null || c2569zzArr5.length < iCeil) {
/* 919 */                           obj = null;
/* 928 */                           this.f8660c1 = new C2569zz[iCeil];
                                } else {
/* 921 */                           obj = null;
/* 922 */                           Arrays.fill(c2569zzArr5, (Object) null);
                                }
/* 930 */                       C2569zz[] c2569zzArr6 = this.f8659b1;
/* 932 */                       if (c2569zzArr6 == null || c2569zzArr6.length < iCeil2) {
/* 944 */                           this.f8659b1 = new C2569zz[iCeil2];
                                } else {
/* 938 */                           Arrays.fill(c2569zzArr6, obj);
                                }
/* 948 */                       for (int i59 = 0; i59 < iCeil; i59++) {
/* 952 */                           for (int i60 = 0; i60 < iCeil2; i60++) {
/* 956 */                               int i61 = (i60 * iCeil) + i59;
/* 958 */                               if (i53 == 1) {
/* 962 */                                   i61 = (i59 * iCeil2) + i60;
                                        }
/* 964 */                               if (i61 < c2569zzArr.length && (c2569zz = c2569zzArr[i61]) != null) {
/* 972 */                                   int iM3954Y3 = m3954Y(c2569zz, i27);
/* 978 */                                   C2569zz c2569zz9 = this.f8660c1[i59];
/* 980 */                                   if (c2569zz9 == null || c2569zz9.m10475r() < iM3954Y3) {
/* 990 */                                       this.f8660c1[i59] = c2569zz;
                                            }
/* 992 */                                   int iM3953X3 = m3953X(c2569zz, i27);
/* 998 */                                   C2569zz c2569zz10 = this.f8659b1[i60];
/* 1000 */                                  if (c2569zz10 == null || c2569zz10.m10472l() < iM3953X3) {
/* 1010 */                                      this.f8659b1[i60] = c2569zz;
                                            }
                                        }
                                    }
                                }
/* 1020 */                      int iM3954Y4 = 0;
/* 1021 */                      for (int i62 = 0; i62 < iCeil; i62++) {
/* 1025 */                          C2569zz c2569zz11 = this.f8660c1[i62];
/* 1027 */                          if (c2569zz11 != null) {
/* 1029 */                              if (i62 > 0) {
/* 1033 */                                  iM3954Y4 += this.f8651T0;
                                        }
/* 1038 */                              iM3954Y4 = m3954Y(c2569zz11, i27) + iM3954Y4;
                                    }
                                }
/* 1045 */                      int iM3953X4 = 0;
/* 1046 */                      for (int i63 = 0; i63 < iCeil2; i63++) {
/* 1050 */                          C2569zz c2569zz12 = this.f8659b1[i63];
/* 1052 */                          if (c2569zz12 != null) {
/* 1054 */                              if (i63 > 0) {
/* 1058 */                                  iM3953X4 += this.f8652U0;
                                        }
/* 1063 */                              iM3953X4 = m3953X(c2569zz12, i27) + iM3953X4;
                                    }
                                }
/* 1068 */                      iArr[0] = iM3954Y4;
/* 1071 */                      iArr[1] = iM3953X4;
/* 1073 */                      if (i53 == 0) {
/* 1075 */                          if (iM3954Y4 <= i27 || iCeil <= 1) {
/* 1083 */                              z5 = true;
                                    } else {
/* 1079 */                              iCeil--;
                                    }
                                } else if (iM3953X4 <= i27 || iCeil2 <= 1) {
/* 1083 */                          z5 = true;
                                } else {
/* 1090 */                          iCeil2--;
                                }
                            }
/* 1095 */                  int[] iArr3 = this.f8661d1;
/* 1097 */                  iArr3[0] = iCeil;
/* 1099 */                  iArr3[1] = iCeil2;
/* 1101 */                  c = 1;
                        } else if (i34 != 3) {
/* 271 */                   i7 = i22;
/* 273 */                   i8 = i23;
/* 275 */                   i9 = i24;
/* 277 */                   iArr = iArr2;
/* 279 */                   i10 = i6;
                        } else {
/* 285 */                   int i64 = this.f8657Z0;
/* 287 */                   if (i5 == 0) {
/* 271 */                       i7 = i22;
/* 273 */                       i8 = i23;
/* 275 */                       i9 = i24;
/* 277 */                       iArr = iArr2;
/* 279 */                       i10 = i6;
                            } else {
/* 290 */                       arrayList.clear();
/* 311 */                       iArr = iArr2;
/* 315 */                       i9 = i24;
/* 317 */                       i10 = i6;
/* 321 */                       i7 = i22;
/* 323 */                       i8 = i23;
/* 327 */                       ek0 ek0Var5 = new ek0(this, i64, this.f20404J, this.f20405K, this.f20406L, this.f20407M, i27);
/* 330 */                       arrayList.add(ek0Var5);
/* 333 */                       if (i64 == 0) {
/* 335 */                           int i65 = 0;
/* 337 */                           int i66 = 0;
/* 338 */                           i15 = 0;
/* 339 */                           int i67 = 0;
/* 340 */                           while (i65 < i5) {
/* 344 */                               int i68 = i66 + 1;
/* 346 */                               C2569zz c2569zz13 = c2569zzArr[i65];
/* 348 */                               int iM3954Y5 = m3954Y(c2569zz13, i27);
/* 352 */                               int i69 = i64;
/* 358 */                               if (c2569zz13.f20415U[0] == enumC2516yz) {
/* 360 */                                   i15++;
                                        }
/* 362 */                               int i70 = i15;
/* 379 */                               boolean z6 = (i67 == i27 || (this.f8651T0 + i67) + iM3954Y5 > i27) && ek0Var5.f7745b != null;
/* 381 */                               if (!z6 && i65 > 0 && (i18 = this.f8656Y0) > 0 && i68 > i18) {
/* 391 */                                   z6 = true;
                                        }
/* 392 */                               if (z6) {
/* 407 */                                   i17 = i65;
/* 408 */                                   i64 = i69;
/* 410 */                                   ek0Var5 = new ek0(this, i64, this.f20404J, this.f20405K, this.f20406L, this.f20407M, i27);
/* 413 */                                   ek0Var5.f7757n = i17;
/* 415 */                                   arrayList.add(ek0Var5);
/* 418 */                                   i67 = iM3954Y5;
/* 420 */                                   i66 = i68;
                                        } else {
/* 423 */                                   i17 = i65;
/* 424 */                                   i64 = i69;
/* 437 */                                   i67 = i17 > 0 ? this.f8651T0 + iM3954Y5 + i67 : iM3954Y5;
/* 434 */                                   i66 = 0;
                                        }
/* 440 */                               ek0Var5.m3473a(c2569zz13);
/* 443 */                               i65 = i17 + 1;
/* 445 */                               i15 = i70;
                                    }
                                } else {
/* 448 */                           int i71 = 0;
/* 450 */                           int i72 = 0;
/* 451 */                           int i73 = 0;
/* 452 */                           while (i73 < i5) {
/* 454 */                               C2569zz c2569zz14 = c2569zzArr[i73];
/* 456 */                               int iM3953X5 = m3953X(c2569zz14, i27);
/* 466 */                               if (c2569zz14.f20415U[1] == enumC2516yz) {
/* 468 */                                   i71++;
                                        }
/* 470 */                               int i74 = i71;
/* 487 */                               boolean z7 = (i72 == i27 || (this.f8652U0 + i72) + iM3953X5 > i27) && ek0Var5.f7745b != null;
/* 489 */                               if (!z7 && i73 > 0 && (i16 = this.f8656Y0) > 0 && i16 < 0) {
/* 499 */                                   z7 = true;
                                        }
/* 500 */                               if (z7) {
/* 512 */                                   ek0Var5 = new ek0(this, i64, this.f20404J, this.f20405K, this.f20406L, this.f20407M, i27);
/* 515 */                                   ek0Var5.f7757n = i73;
/* 517 */                                   arrayList.add(ek0Var5);
                                        } else {
/* 523 */                                   if (i73 > 0) {
/* 529 */                                       i72 = this.f8652U0 + iM3953X5 + i72;
                                            }
/* 531 */                                   ek0Var5.m3473a(c2569zz14);
/* 534 */                                   i73++;
/* 536 */                                   i71 = i74;
                                        }
/* 520 */                               i72 = iM3953X5;
/* 531 */                               ek0Var5.m3473a(c2569zz14);
/* 534 */                               i73++;
/* 536 */                               i71 = i74;
                                    }
/* 539 */                           i15 = i71;
                                }
/* 540 */                       int size2 = arrayList.size();
/* 544 */                       int i75 = this.f19490A0;
/* 546 */                       int i76 = this.f19497w0;
/* 548 */                       int i77 = this.f19491B0;
/* 550 */                       int i78 = this.f19498x0;
/* 552 */                       EnumC2516yz[] enumC2516yzArr2 = this.f20415U;
/* 568 */                       boolean z8 = enumC2516yzArr2[0] == enumC2516yz2 || enumC2516yzArr2[1] == enumC2516yz2;
/* 569 */                       if (i15 > 0 && z8) {
/* 575 */                           for (int i79 = 0; i79 < size2; i79++) {
/* 581 */                               ek0 ek0Var6 = (ek0) arrayList.get(i79);
/* 583 */                               if (i64 == 0) {
/* 591 */                                   ek0Var6.m3477e(i27 - ek0Var6.m3476d());
                                        } else {
/* 601 */                                   ek0Var6.m3477e(i27 - ek0Var6.m3475c());
                                        }
                                    }
                                }
/* 607 */                       int i80 = i75;
/* 609 */                       int i81 = i76;
/* 611 */                       int i82 = i77;
/* 613 */                       int i83 = i78;
/* 615 */                       C2051oz c2051oz11 = c2051oz;
/* 617 */                       C2051oz c2051oz12 = c2051oz2;
/* 621 */                       int iMax3 = 0;
/* 622 */                       int i84 = 0;
/* 623 */                       C2051oz c2051oz13 = c2051oz3;
/* 625 */                       C2051oz c2051oz14 = c2051oz4;
/* 627 */                       for (int i85 = 0; i85 < size2; i85++) {
/* 633 */                           ek0 ek0Var7 = (ek0) arrayList.get(i85);
/* 635 */                           if (i64 == 0) {
/* 639 */                               if (i85 < size2 - 1) {
/* 651 */                                   c2051oz14 = ((ek0) arrayList.get(i85 + 1)).f7745b.f20405K;
/* 655 */                                   i83 = 0;
                                        } else {
/* 658 */                                   i83 = this.f19498x0;
/* 662 */                                   c2051oz14 = c2051oz4;
                                        }
/* 666 */                               C2051oz c2051oz15 = ek0Var7.f7745b.f20407M;
/* 674 */                               ek0Var7.m3478f(i64, c2051oz12, c2051oz11, c2051oz13, c2051oz14, i80, i81, i82, i83, i27);
/* 681 */                               iMax3 = Math.max(iMax3, ek0Var7.m3476d());
/* 689 */                               int iM3475c2 = ek0Var7.m3475c() + i84;
/* 690 */                               if (i85 > 0) {
/* 694 */                                   iM3475c2 += this.f8652U0;
                                        }
/* 695 */                               i84 = iM3475c2;
/* 696 */                               c2051oz11 = c2051oz15;
/* 698 */                               i81 = 0;
                                    } else {
/* 703 */                               if (i85 < size2 - 1) {
/* 715 */                                   c2051oz13 = ((ek0) arrayList.get(i85 + 1)).f7745b.f20404J;
/* 719 */                                   i82 = 0;
                                        } else {
/* 722 */                                   i82 = this.f19491B0;
/* 726 */                                   c2051oz13 = c2051oz3;
                                        }
/* 730 */                               C2051oz c2051oz16 = ek0Var7.f7745b.f20406L;
/* 738 */                               ek0Var7.m3478f(i64, c2051oz12, c2051oz11, c2051oz13, c2051oz14, i80, i81, i82, i83, i27);
/* 745 */                               int iM3476d2 = ek0Var7.m3476d() + iMax3;
/* 750 */                               int iMax4 = Math.max(i84, ek0Var7.m3475c());
/* 754 */                               if (i85 > 0) {
/* 758 */                                   iM3476d2 += this.f8651T0;
                                        }
/* 759 */                               i84 = iMax4;
/* 760 */                               iMax3 = iM3476d2;
/* 761 */                               c2051oz12 = c2051oz16;
/* 763 */                               i80 = 0;
                                    }
                                }
/* 769 */                       iArr[0] = iMax3;
/* 773 */                       iArr[1] = i84;
                            }
                        }
/* 281 */               c = 1;
                    } else {
/* 1572 */              i7 = i22;
/* 1574 */              i8 = i23;
/* 1576 */              i9 = i24;
/* 1578 */              iArr = iArr2;
/* 1580 */              i10 = i6;
/* 1584 */              int i86 = this.f8657Z0;
/* 1586 */              if (i5 == 0) {
/* 281 */                   c = 1;
                        } else {
/* 1594 */                  if (arrayList.size() == 0) {
/* 1606 */                      ek0Var = new ek0(this, i86, this.f20404J, this.f20405K, this.f20406L, this.f20407M, i27);
/* 1609 */                      arrayList.add(ek0Var);
                            } else {
/* 1619 */                      ek0 ek0Var8 = (ek0) arrayList.get(0);
/* 1621 */                      ek0Var8.f7746c = 0;
/* 1624 */                      ek0Var8.f7745b = null;
/* 1626 */                      ek0Var8.f7755l = 0;
/* 1628 */                      ek0Var8.f7756m = 0;
/* 1630 */                      ek0Var8.f7757n = 0;
/* 1632 */                      ek0Var8.f7758o = 0;
/* 1634 */                      ek0Var8.f7759p = 0;
/* 1674 */                      ek0Var8.m3478f(i86, this.f20404J, this.f20405K, this.f20406L, this.f20407M, this.f19490A0, this.f19497w0, this.f19491B0, this.f19498x0, i27);
/* 1677 */                      ek0Var = ek0Var8;
                            }
/* 1680 */                  for (int i87 = 0; i87 < i5; i87++) {
/* 1684 */                      ek0Var.m3473a(c2569zzArr[i87]);
                            }
/* 1694 */                  i31 = 0;
/* 1696 */                  iArr[0] = ek0Var.m3476d();
/* 1702 */                  c = 1;
/* 1704 */                  iArr[1] = ek0Var.m3475c();
                        }
                    }
/* 1710 */          int iMin = iArr[i31] + i10 + i7;
/* 1716 */          int iMin2 = iArr[c] + i8 + i9;
/* 1722 */          if (i != 1073741824) {
/* 1729 */              if (i == Integer.MIN_VALUE) {
/* 1733 */                  iMin = Math.min(iMin, i2);
                        } else {
/* 1738 */                  i11 = i3;
/* 1740 */                  if (i != 0) {
/* 1743 */                      iMin = i31;
                            }
                        }
/* 1745 */              if (i11 == 1073741824) {
/* 1747 */                  iMin2 = i4;
                        } else if (i11 == Integer.MIN_VALUE) {
/* 1754 */                  iMin2 = Math.min(iMin2, i4);
                        } else if (i11 != 0) {
/* 1762 */                  iMin2 = i31;
                        }
/* 1764 */              this.f19493D0 = iMin;
/* 1766 */              this.f19494E0 = iMin2;
/* 1768 */              m10464P(iMin);
/* 1771 */              m10461M(iMin2);
/* 1776 */              if (this.f6907v0 > 0) {
/* 1778 */                  z = c;
                        } else {
/* 1781 */                  z = i31;
                        }
/* 1783 */              this.f19492C0 = z;
                    }
/* 1724 */          iMin = i2;
/* 1726 */          i11 = i3;
/* 1745 */          if (i11 == 1073741824) {
/* 1747 */              iMin2 = i4;
                    } else if (i11 == Integer.MIN_VALUE) {
/* 1754 */              iMin2 = Math.min(iMin2, i4);
                    } else if (i11 != 0) {
/* 1762 */              iMin2 = i31;
                    }
/* 1764 */          this.f19493D0 = iMin;
/* 1766 */          this.f19494E0 = iMin2;
/* 1768 */          m10464P(iMin);
/* 1771 */          m10461M(iMin2);
/* 1776 */          if (this.f6907v0 > 0) {
/* 1778 */              z = c;
                    } else {
/* 1781 */              z = i31;
                    }
/* 1783 */          this.f19492C0 = z;
                }

                /* JADX INFO: renamed from: X */
                public final int m3953X(C2569zz c2569zz, int i) {
                    C2569zz c2569zz2;
/* 2 */             if (c2569zz == null) {
/* 1 */                 return 0;
                    }
/* 12 */            if (c2569zz.f20415U[1] == EnumC2516yz.f19867c) {
/* 14 */                int i2 = c2569zz.f20457s;
/* 16 */                if (i2 == 0) {
/* 1 */                     return 0;
                        }
/* 20 */                if (i2 == 2) {
/* 26 */                    int i3 = (int) (c2569zz.f20466z * i);
/* 31 */                    if (i3 != c2569zz.m10472l()) {
/* 33 */                        c2569zz.f20433g = true;
/* 47 */                        m10106W(c2569zz, c2569zz.f20415U[0], c2569zz.m10475r(), EnumC2516yz.f19865a, i3);
                            }
/* 50 */                    return i3;
                        }
/* 51 */                c2569zz2 = c2569zz;
/* 52 */                if (i2 == 1) {
/* 54 */                    return c2569zz2.m10472l();
                        }
/* 60 */                if (i2 == 3) {
/* 73 */                    return (int) ((c2569zz2.m10475r() * c2569zz2.f20419Y) + 0.5f);
                        }
                    } else {
/* 75 */                c2569zz2 = c2569zz;
                    }
/* 76 */            return c2569zz2.m10472l();
                }

                /* JADX INFO: renamed from: Y */
                public final int m3954Y(C2569zz c2569zz, int i) {
                    C2569zz c2569zz2;
/* 2 */             if (c2569zz == null) {
/* 1 */                 return 0;
                    }
/* 11 */            if (c2569zz.f20415U[0] == EnumC2516yz.f19867c) {
/* 13 */                int i2 = c2569zz.f20455r;
/* 15 */                if (i2 == 0) {
/* 1 */                     return 0;
                        }
/* 20 */                if (i2 == 2) {
/* 26 */                    int i3 = (int) (c2569zz.f20463w * i);
/* 31 */                    if (i3 != c2569zz.m10475r()) {
/* 33 */                        c2569zz.f20433g = true;
/* 47 */                        m10106W(c2569zz, EnumC2516yz.f19865a, i3, c2569zz.f20415U[1], c2569zz.m10472l());
                            }
/* 50 */                    return i3;
                        }
/* 51 */                c2569zz2 = c2569zz;
/* 52 */                if (i2 == 1) {
/* 54 */                    return c2569zz2.m10475r();
                        }
/* 60 */                if (i2 == 3) {
/* 73 */                    return (int) ((c2569zz2.m10472l() * c2569zz2.f20419Y) + 0.5f);
                        }
                    } else {
/* 75 */                c2569zz2 = c2569zz;
                    }
/* 76 */            return c2569zz2.m10475r();
                }

                @Override // p000.C2569zz
                /* JADX INFO: renamed from: b */
                public final void mo1427b(t71 t71Var, boolean z) {
                    C2569zz c2569zz;
                    float f;
                    int i;
/* 1 */             super.mo1427b(t71Var, z);
/* 4 */             C2569zz c2569zz2 = this.f20416V;
/* 18 */            boolean z2 = c2569zz2 != null && ((a00) c2569zz2).f22z0;
/* 19 */            int i2 = this.f8655X0;
/* 21 */            ArrayList arrayList = this.f8658a1;
/* 23 */            if (i2 != 0) {
/* 25 */                if (i2 == 1) {
/* 318 */                   int size = arrayList.size();
/* 322 */                   int i3 = 0;
/* 323 */                   while (i3 < size) {
/* 338 */                       ((ek0) arrayList.get(i3)).m3474b(z2, i3, i3 == size + (-1));
/* 341 */                       i3++;
                            }
                        } else if (i2 != 2) {
/* 31 */                    if (i2 == 3) {
/* 35 */                        int size2 = arrayList.size();
/* 39 */                        int i4 = 0;
/* 40 */                        while (i4 < size2) {
/* 55 */                            ((ek0) arrayList.get(i4)).m3474b(z2, i4, i4 == size2 + (-1));
/* 58 */                            i4++;
                                }
                            }
                        } else if (this.f8661d1 != null && this.f8660c1 != null && this.f8659b1 != null) {
/* 78 */                    for (int i5 = 0; i5 < this.f8663f1; i5++) {
/* 84 */                        this.f8662e1[i5].m10456E();
                            }
/* 90 */                    int[] iArr = this.f8661d1;
/* 92 */                    int i6 = iArr[0];
/* 94 */                    int i7 = iArr[1];
/* 96 */                    float f2 = this.f8645N0;
/* 98 */                    C2569zz c2569zz3 = null;
/* 99 */                    int i8 = 0;
/* 102 */                   while (i8 < i6) {
/* 104 */                       if (z2) {
/* 108 */                           i = (i6 - i8) - 1;
/* 113 */                           f = 1.0f - this.f8645N0;
                                } else {
/* 115 */                           f = f2;
/* 116 */                           i = i8;
                                }
/* 119 */                       C2569zz c2569zz4 = this.f8660c1[i];
/* 121 */                       if (c2569zz4 != null) {
/* 123 */                           C2051oz c2051oz = c2569zz4.f20404J;
/* 127 */                           if (c2569zz4.f20438i0 != 8) {
/* 130 */                               if (i8 == 0) {
/* 136 */                                   c2569zz4.m10468f(c2051oz, this.f20404J, this.f19490A0);
/* 141 */                                   c2569zz4.f20444l0 = this.f8639H0;
/* 143 */                                   c2569zz4.f20432f0 = f;
                                        }
/* 147 */                               if (i8 == i6 - 1) {
/* 155 */                                   c2569zz4.m10468f(c2569zz4.f20406L, this.f20406L, this.f19491B0);
                                        }
/* 158 */                               if (i8 > 0 && c2569zz3 != null) {
/* 162 */                                   C2051oz c2051oz2 = c2569zz3.f20406L;
/* 166 */                                   c2569zz4.m10468f(c2051oz, c2051oz2, this.f8651T0);
/* 169 */                                   c2569zz3.m10468f(c2051oz2, c2051oz, 0);
                                        }
/* 172 */                               c2569zz3 = c2569zz4;
                                    }
                                }
/* 173 */                       i8++;
/* 175 */                       f2 = f;
                            }
/* 178 */                   for (int i9 = 0; i9 < i7; i9++) {
/* 182 */                       C2569zz c2569zz5 = this.f8659b1[i9];
/* 184 */                       if (c2569zz5 != null) {
/* 186 */                           C2051oz c2051oz3 = c2569zz5.f20405K;
/* 190 */                           if (c2569zz5.f20438i0 != 8) {
/* 193 */                               if (i9 == 0) {
/* 199 */                                   c2569zz5.m10468f(c2051oz3, this.f20405K, this.f19497w0);
/* 204 */                                   c2569zz5.f20446m0 = this.f8640I0;
/* 208 */                                   c2569zz5.f20434g0 = this.f8646O0;
                                        }
/* 212 */                               if (i9 == i7 - 1) {
/* 220 */                                   c2569zz5.m10468f(c2569zz5.f20407M, this.f20407M, this.f19498x0);
                                        }
/* 223 */                               if (i9 > 0 && c2569zz3 != null) {
/* 227 */                                   C2051oz c2051oz4 = c2569zz3.f20407M;
/* 231 */                                   c2569zz5.m10468f(c2051oz3, c2051oz4, this.f8652U0);
/* 234 */                                   c2569zz3.m10468f(c2051oz4, c2051oz3, 0);
                                        }
/* 237 */                               c2569zz3 = c2569zz5;
                                    }
                                }
                            }
/* 242 */                   for (int i10 = 0; i10 < i6; i10++) {
/* 245 */                       for (int i11 = 0; i11 < i7; i11++) {
/* 249 */                           int i12 = (i11 * i6) + i10;
/* 252 */                           if (this.f8657Z0 == 1) {
/* 256 */                               i12 = (i10 * i7) + i11;
                                    }
/* 257 */                           C2569zz[] c2569zzArr = this.f8662e1;
/* 260 */                           if (i12 < c2569zzArr.length && (c2569zz = c2569zzArr[i12]) != null && c2569zz.f20438i0 != 8) {
/* 274 */                               C2569zz c2569zz6 = this.f8660c1[i10];
/* 278 */                               C2569zz c2569zz7 = this.f8659b1[i11];
/* 280 */                               if (c2569zz != c2569zz6) {
/* 286 */                                   c2569zz.m10468f(c2569zz.f20404J, c2569zz6.f20404J, 0);
/* 293 */                                   c2569zz.m10468f(c2569zz.f20406L, c2569zz6.f20406L, 0);
                                        }
/* 296 */                               if (c2569zz != c2569zz7) {
/* 302 */                                   c2569zz.m10468f(c2569zz.f20405K, c2569zz7.f20405K, 0);
/* 309 */                                   c2569zz.m10468f(c2569zz.f20407M, c2569zz7.f20407M, 0);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (arrayList.size() > 0) {
/* 356 */               ((ek0) arrayList.get(0)).m3474b(z2, 0, true);
                    }
/* 359 */           this.f19492C0 = false;
                }

                @Override // p000.cu0, p000.C2569zz
                /* JADX INFO: renamed from: g */
                public final void mo1429g(C2569zz c2569zz, HashMap map) {
/* 1 */             super.mo1429g(c2569zz, map);
/* 4 */             gk0 gk0Var = (gk0) c2569zz;
/* 8 */             this.f8639H0 = gk0Var.f8639H0;
/* 12 */            this.f8640I0 = gk0Var.f8640I0;
/* 16 */            this.f8641J0 = gk0Var.f8641J0;
/* 20 */            this.f8642K0 = gk0Var.f8642K0;
/* 24 */            this.f8643L0 = gk0Var.f8643L0;
/* 28 */            this.f8644M0 = gk0Var.f8644M0;
/* 32 */            this.f8645N0 = gk0Var.f8645N0;
/* 36 */            this.f8646O0 = gk0Var.f8646O0;
/* 40 */            this.f8647P0 = gk0Var.f8647P0;
/* 44 */            this.f8648Q0 = gk0Var.f8648Q0;
/* 48 */            this.f8649R0 = gk0Var.f8649R0;
/* 52 */            this.f8650S0 = gk0Var.f8650S0;
/* 56 */            this.f8651T0 = gk0Var.f8651T0;
/* 60 */            this.f8652U0 = gk0Var.f8652U0;
/* 64 */            this.f8653V0 = gk0Var.f8653V0;
/* 68 */            this.f8654W0 = gk0Var.f8654W0;
/* 72 */            this.f8655X0 = gk0Var.f8655X0;
/* 76 */            this.f8656Y0 = gk0Var.f8656Y0;
/* 80 */            this.f8657Z0 = gk0Var.f8657Z0;
                }
            }
