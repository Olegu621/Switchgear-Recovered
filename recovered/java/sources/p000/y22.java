            package p000;

            import java.util.Arrays;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class y22 extends dx0 {

                /* JADX INFO: renamed from: i */
                public static final y22 f19459i = new y22(null, new Object[0], 0);

                /* JADX INFO: renamed from: d */
                public final transient Object f19460d;

                /* JADX INFO: renamed from: e */
                public final transient Object[] f19461e;

                /* JADX INFO: renamed from: f */
                public final transient int f19462f;

                public y22(Object obj, Object[] objArr, int i) {
/* 4 */             this.f19460d = obj;
/* 6 */             this.f19461e = objArr;
/* 8 */             this.f19462f = i;
                }

                /* JADX WARN: Code duplicated, block: B:74:0x0199  */
                /* JADX WARN: Code duplicated, block: B:76:0x01a1  */
                /* JADX WARN: Code duplicated, block: B:77:0x01b6  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r16v11 */
                /* JADX WARN: Type inference failed for: r16v12 */
                /* JADX WARN: Type inference failed for: r16v13 */
                /* JADX WARN: Type inference failed for: r16v4 */
                /* JADX WARN: Type inference failed for: r3v10 */
                /* JADX WARN: Type inference failed for: r3v12 */
                /* JADX WARN: Type inference failed for: r3v15 */
                /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v19 */
                /* JADX WARN: Type inference failed for: r3v2 */
                /* JADX WARN: Type inference failed for: r3v20 */
                /* JADX WARN: Type inference failed for: r3v23 */
                /* JADX WARN: Type inference failed for: r3v24 */
                /* JADX WARN: Type inference failed for: r3v25 */
                /* JADX WARN: Type inference failed for: r3v3 */
                /* JADX WARN: Type inference failed for: r3v7 */
                /* JADX WARN: Type inference failed for: r4v6 */
                /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
                /* JADX INFO: renamed from: b */
                public static y22 m10086b(int i, Object[] objArr, bx0 bx0Var) {
                    boolean z;
                    int i2;
                    char c;
                    ?? r3;
                    char c2;
                    short[] sArr;
                    boolean z2;
                    int i3;
                    ?? r16;
                    boolean z3;
                    ?? r4;
                    Object[] objArr2;
                    ax0 ax0Var;
                    boolean z4;
/* 1 */             int i4 = i;
/* 3 */             Object[] objArrCopyOf = objArr;
/* 7 */             if (i4 == 0) {
/* 9 */                 return f19459i;
                    }
/* 12 */            ax0 ax0Var2 = null;
/* 12 */            ?? r5 = 0;
/* 12 */            ax0 ax0Var3 = null;
/* 12 */            ax0 ax0Var4 = null;
/* 13 */            boolean z5 = false;
/* 14 */            int i5 = 1;
/* 15 */            if (i4 == 1) {
/* 19 */                Objects.requireNonNull(objArrCopyOf[0]);
/* 24 */                Objects.requireNonNull(objArrCopyOf[1]);
/* 29 */                return new y22(null, objArrCopyOf, 1);
                    }
/* 35 */            yy1.m10215j(i4, objArrCopyOf.length >> 1);
/* 38 */            int iM3850g = fx0.m3850g(i4);
/* 42 */            char c3 = 2;
/* 43 */            if (i4 != 1) {
/* 63 */                int i6 = iM3850g - 1;
/* 69 */                if (iM3850g <= 128) {
/* 71 */                    byte[] bArr = new byte[iM3850g];
/* 73 */                    Arrays.fill(bArr, (byte) -1);
/* 76 */                    int i7 = 0;
/* 77 */                    int i8 = 0;
/* 78 */                    while (i7 < i4) {
/* 80 */                        int i9 = i7 * 2;
/* 82 */                        int i10 = i8 * 2;
/* 84 */                        Object obj = objArrCopyOf[i9];
/* 86 */                        Objects.requireNonNull(obj);
/* 90 */                        Object obj2 = objArrCopyOf[i9 ^ i5];
/* 92 */                        Objects.requireNonNull(obj2);
/* 99 */                        int iM7444z = pg3.m7444z(obj.hashCode());
                                while (true) {
/* 103 */                           int i11 = iM7444z & i6;
/* 104 */                           z2 = z5;
/* 108 */                           i3 = i5;
/* 112 */                           int i12 = bArr[i11] & 255;
/* 113 */                           if (i12 == 255) {
/* 116 */                               bArr[i11] = (byte) i10;
/* 118 */                               if (i8 < i7) {
/* 120 */                                   objArrCopyOf[i10] = obj;
/* 124 */                                   objArrCopyOf[i10 ^ 1] = obj2;
                                        }
/* 126 */                               i8++;
                                        break;
                                    }
/* 135 */                           if (obj.equals(objArrCopyOf[i12 == true ? 1 : 0])) {
/* 139 */                               int i13 = ~i12;
/* 141 */                               Object obj3 = objArrCopyOf[i13 == true ? 1 : 0];
/* 143 */                               Objects.requireNonNull(obj3);
/* 146 */                               ax0Var3 = new ax0(obj, obj2, obj3);
/* 149 */                               objArrCopyOf[i13 == true ? 1 : 0] = obj2;
                                        break;
                                    }
/* 158 */                           iM7444z = i11 + 1;
/* 160 */                           z5 = z2;
/* 162 */                           i5 = i3;
                                }
/* 151 */                       i7++;
/* 153 */                       z5 = z2;
/* 155 */                       i5 = i3;
                            }
/* 165 */                   z = z5;
/* 167 */                   i2 = i5;
/* 169 */                   if (i8 == i4) {
/* 171 */                       r5 = bArr;
                                z4 = z;
                            } else {
/* 173 */                       sArr = new Object[3];
/* 175 */                       sArr[z ? 1 : 0] = bArr;
/* 181 */                       sArr[i2] = Integer.valueOf(i8);
/* 183 */                       sArr[2] = ax0Var3;
/* 185 */                       r5 = sArr;
                                z4 = z;
                            }
                        } else {
/* 187 */                   z = false;
/* 189 */                   i2 = 1;
/* 194 */                   if (iM3850g <= 32768) {
/* 196 */                       sArr = new short[iM3850g];
/* 198 */                       Arrays.fill(sArr, (short) -1);
/* 203 */                       int i14 = 0;
/* 204 */                       for (int i15 = 0; i15 < i4; i15++) {
/* 206 */                           int i16 = i15 * 2;
/* 208 */                           int i17 = i14 * 2;
/* 210 */                           Object obj4 = objArrCopyOf[i16];
/* 212 */                           Objects.requireNonNull(obj4);
/* 217 */                           Object obj5 = objArrCopyOf[i16 ^ 1];
/* 219 */                           Objects.requireNonNull(obj5);
/* 226 */                           int iM7444z2 = pg3.m7444z(obj4.hashCode());
                                    while (true) {
/* 230 */                               int i18 = iM7444z2 & i6;
/* 236 */                               int i19 = sArr[i18] & 65535;
/* 237 */                               if (i19 == 65535) {
/* 240 */                                   sArr[i18] = (short) i17;
/* 242 */                                   if (i14 < i15) {
/* 244 */                                       objArrCopyOf[i17] = obj4;
/* 248 */                                       objArrCopyOf[i17 ^ 1] = obj5;
                                            }
/* 250 */                                   i14++;
                                            break;
                                        }
/* 259 */                               if (obj4.equals(objArrCopyOf[i19 == true ? 1 : 0])) {
/* 263 */                                   int i20 = ~i19;
/* 265 */                                   Object obj6 = objArrCopyOf[i20 == true ? 1 : 0];
/* 267 */                                   Objects.requireNonNull(obj6);
/* 270 */                                   ax0Var4 = new ax0(obj4, obj5, obj6);
/* 273 */                                   objArrCopyOf[i20 == true ? 1 : 0] = obj5;
                                            break;
                                        }
/* 278 */                               iM7444z2 = i18 + 1;
                                    }
                                }
/* 281 */                       if (i14 == i4) {
/* 185 */                           r5 = sArr;
                                    z4 = z;
                                } else {
/* 284 */                           r5 = new Object[]{sArr, Integer.valueOf(i14), ax0Var4};
                                    z4 = z;
                                }
                            } else {
/* 299 */                       int[] iArr = new int[iM3850g];
/* 301 */                       Arrays.fill(iArr, -1);
/* 304 */                       int i21 = 0;
/* 306 */                       int i22 = 0;
/* 307 */                       while (i21 < i4) {
/* 309 */                           int i23 = i21 * 2;
/* 311 */                           int i24 = i22 * 2;
/* 313 */                           Object obj7 = objArrCopyOf[i23];
/* 315 */                           Objects.requireNonNull(obj7);
/* 320 */                           Object obj8 = objArrCopyOf[i23 ^ 1];
/* 322 */                           Objects.requireNonNull(obj8);
/* 329 */                           int iM7444z3 = pg3.m7444z(obj7.hashCode());
                                    while (true) {
/* 333 */                               int i25 = iM7444z3 & i6;
/* 334 */                               int i26 = iArr[i25];
/* 336 */                               if (i26 == -1) {
/* 338 */                                   iArr[i25] = i24;
/* 340 */                                   if (i22 < i21) {
/* 342 */                                       objArrCopyOf[i24] = obj7;
/* 346 */                                       objArrCopyOf[i24 ^ 1] = obj8;
                                            }
/* 348 */                                   i22++;
/* 350 */                                   c2 = c3;
                                            break;
                                        }
/* 353 */                               c2 = c3;
/* 361 */                               if (obj7.equals(objArrCopyOf[i26])) {
/* 365 */                                   int i27 = i26 ^ 1;
/* 367 */                                   Object obj9 = objArrCopyOf[i27];
/* 369 */                                   Objects.requireNonNull(obj9);
/* 372 */                                   ax0Var2 = new ax0(obj7, obj8, obj9);
/* 375 */                                   objArrCopyOf[i27] = obj8;
                                            break;
                                        }
/* 382 */                               iM7444z3 = i25 + 1;
/* 384 */                               c3 = c2;
                                    }
/* 377 */                           i21++;
/* 379 */                           c3 = c2;
                                }
/* 387 */                       c = c3;
/* 389 */                       if (i22 == i4) {
/* 391 */                           r3 = iArr;
                                    r16 = z;
                                } else {
/* 393 */                           Object[] objArr3 = new Object[3];
/* 395 */                           objArr3[0] = iArr;
/* 401 */                           objArr3[1] = Integer.valueOf(i22);
/* 403 */                           objArr3[c] = ax0Var2;
/* 405 */                           r3 = objArr3;
                                    r16 = z;
                                }
                            }
                        }
/* 406 */               z3 = r3 instanceof Object[];
                        r4 = r3;
/* 408 */               if (z3) {
/* 410 */                   objArr2 = (Object[]) r3;
/* 414 */                   ax0Var = (ax0) objArr2[c];
/* 416 */                   if (bx0Var != null) {
/* 443 */                       throw ax0Var.m1177a();
                            }
/* 418 */                   bx0Var.f2632d = ax0Var;
/* 420 */                   Object obj10 = objArr2[r16];
/* 426 */                   int iIntValue = ((Integer) objArr2[i2]).intValue();
/* 432 */                   objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
/* 436 */                   r4 = obj10;
/* 437 */                   i4 = iIntValue;
                        }
/* 446 */               return new y22(r4, objArrCopyOf, i4);
                    }
/* 47 */            Objects.requireNonNull(objArrCopyOf[0]);
/* 52 */            Objects.requireNonNull(objArrCopyOf[1]);
/* 55 */            z4 = false;
/* 57 */            i2 = 1;
/* 59 */            c = 2;
                    r3 = r5;
                    r16 = z4;
/* 406 */           z3 = r3 instanceof Object[];
                    r4 = r3;
/* 408 */           if (z3) {
/* 410 */               objArr2 = (Object[]) r3;
/* 414 */               ax0Var = (ax0) objArr2[c];
/* 416 */               if (bx0Var != null) {
/* 443 */                   throw ax0Var.m1177a();
                        }
/* 418 */               bx0Var.f2632d = ax0Var;
/* 420 */               Object obj11 = objArr2[r16];
/* 426 */               int iIntValue2 = ((Integer) objArr2[i2]).intValue();
/* 432 */               objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
/* 436 */               r4 = obj11;
/* 437 */               i4 = iIntValue2;
                    }
/* 446 */           return new y22(r4, objArrCopyOf, i4);
                }

                /* JADX WARN: Code duplicated, block: B:4:0x0003  */
                @Override // p000.dx0, java.util.Map
                public final Object get(Object obj) {
                    Object obj2;
/* 2 */             if (obj == null) {
/* 4 */                 obj2 = null;
                    } else {
/* 7 */                 Object[] objArr = this.f19461e;
/* 12 */                if (this.f19462f == 1) {
/* 15 */                    Object obj3 = objArr[0];
/* 17 */                    Objects.requireNonNull(obj3);
/* 24 */                    if (obj3.equals(obj)) {
/* 26 */                        obj2 = objArr[1];
/* 28 */                        Objects.requireNonNull(obj2);
                            } else {
/* 4 */                         obj2 = null;
                            }
                        } else {
/* 33 */                    Object obj4 = this.f19460d;
/* 35 */                    if (obj4 == null) {
/* 4 */                         obj2 = null;
                            } else if (obj4 instanceof byte[]) {
/* 43 */                        byte[] bArr = (byte[]) obj4;
/* 46 */                        int length = bArr.length - 1;
/* 52 */                        int iM7444z = pg3.m7444z(obj.hashCode());
                                while (true) {
/* 56 */                            int i = iM7444z & length;
/* 61 */                            int i2 = bArr[i] & 255;
/* 62 */                            if (i2 == 255) {
                                        break;
                                    }
/* 71 */                            if (obj.equals(objArr[i2])) {
/* 75 */                                obj2 = objArr[i2 ^ 1];
                                    } else {
/* 78 */                                iM7444z = i + 1;
                                    }
                                }
/* 4 */                         obj2 = null;
                            } else if (obj4 instanceof short[]) {
/* 86 */                        short[] sArr = (short[]) obj4;
/* 89 */                        int length2 = sArr.length - 1;
/* 95 */                        int iM7444z2 = pg3.m7444z(obj.hashCode());
                                while (true) {
/* 99 */                            int i3 = iM7444z2 & length2;
/* 105 */                           int i4 = sArr[i3] & 65535;
/* 106 */                           if (i4 == 65535) {
                                        break;
                                    }
/* 115 */                           if (obj.equals(objArr[i4])) {
/* 119 */                               obj2 = objArr[i4 ^ 1];
                                    } else {
/* 122 */                               iM7444z2 = i3 + 1;
                                    }
                                }
/* 4 */                         obj2 = null;
                            } else {
/* 125 */                       int[] iArr = (int[]) obj4;
/* 128 */                       int length3 = iArr.length - 1;
/* 133 */                       int iM7444z3 = pg3.m7444z(obj.hashCode());
                                while (true) {
/* 137 */                           int i5 = iM7444z3 & length3;
/* 138 */                           int i6 = iArr[i5];
/* 141 */                           if (i6 == -1) {
                                        break;
                                    }
/* 151 */                           if (obj.equals(objArr[i6])) {
/* 155 */                               obj2 = objArr[i6 ^ 1];
                                    } else {
/* 161 */                               iM7444z3 = i5 + 1;
                                    }
                                }
/* 4 */                         obj2 = null;
                            }
                        }
                    }
/* 157 */           if (obj2 == null) {
/* 1 */                 return null;
                    }
/* 160 */           return obj2;
                }

                @Override // java.util.Map
                public final int size() {
/* 1 */             return this.f19462f;
                }
            }
