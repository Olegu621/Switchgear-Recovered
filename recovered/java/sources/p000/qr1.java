            package p000;

            import android.graphics.Path;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qr1 {

                /* JADX INFO: renamed from: a */
                public final char f15713a;

                /* JADX INFO: renamed from: b */
                public final float[] f15714b;

                public qr1(char c, float[] fArr) {
/* 4 */             this.f15713a = c;
/* 6 */             this.f15714b = fArr;
                }

                /* JADX INFO: renamed from: a */
                public static void m8005a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
                    double d;
                    double d2;
/* 12 */            double radians = Math.toRadians(f7);
/* 16 */            double dCos = Math.cos(radians);
/* 20 */            double dSin = Math.sin(radians);
                    double d3 = f;
                    double d4 = f2;
                    double d5 = f5;
/* 37 */            double d6 = ((d4 * dSin) + (d3 * dCos)) / d5;
                    double d7 = f6;
/* 47 */            double d8 = ((d4 * dCos) + (((double) (-f)) * dSin)) / d7;
                    double d9 = f4;
/* 62 */            double d10 = ((d9 * dSin) + (((double) f3) * dCos)) / d5;
/* 73 */            double d11 = ((d9 * dCos) + (((double) (-f3)) * dSin)) / d7;
/* 75 */            double d12 = d6 - d10;
/* 77 */            double d13 = d8 - d11;
/* 83 */            double d14 = (d6 + d10) / 2.0d;
/* 87 */            double d15 = (d8 + d11) / 2.0d;
/* 95 */            double d16 = (d13 * d13) + (d12 * d12);
/* 105 */           if (d16 == 0.0d) {
/* 109 */               AbstractC1245n0.m4889q("PathParser", " Points are coincident");
/* 112 */               return;
                    }
/* 119 */           double d17 = (1.0d / d16) - 0.25d;
/* 123 */           if (d17 < 0.0d) {
/* 139 */               AbstractC1245n0.m4889q("PathParser", "Points are too far apart " + d16);
/* 152 */               float fSqrt = (float) (Math.sqrt(d16) / 1.99999d);
/* 169 */               m8005a(path, f, f2, f3, f4, f5 * fSqrt, fSqrt * f6, f7, z, z2);
/* 172 */               return;
                    }
/* 175 */           double dSqrt = Math.sqrt(d17);
/* 179 */           double d18 = dSqrt * d12;
/* 181 */           double d19 = dSqrt * d13;
/* 185 */           if (z == z2) {
/* 187 */               d = d14 - d19;
/* 189 */               d2 = d15 + d18;
                    } else {
/* 192 */               d = d14 + d19;
/* 194 */               d2 = d15 - d18;
                    }
/* 200 */           double dAtan2 = Math.atan2(d8 - d2, d6 - d);
/* 214 */           double dAtan3 = Math.atan2(d11 - d2, d10 - d) - dAtan2;
/* 223 */           if (z2 != (dAtan3 >= 0.0d)) {
/* 235 */               dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
                    }
/* 237 */           double d20 = d * d5;
/* 239 */           double d21 = d2 * d7;
/* 245 */           double d22 = (d20 * dCos) - (d21 * dSin);
/* 251 */           double d23 = (d21 * dCos) + (d20 * dSin);
/* 272 */           int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
/* 273 */           double dCos2 = Math.cos(radians);
/* 277 */           double dSin2 = Math.sin(radians);
/* 281 */           double dCos3 = Math.cos(dAtan2);
/* 285 */           double dSin3 = Math.sin(dAtan2);
/* 291 */           double d24 = -d5;
/* 292 */           double d25 = d24 * dCos2;
/* 296 */           double d26 = d7 * dSin2;
/* 300 */           double d27 = (d25 * dSin3) - (d26 * dCos3);
/* 302 */           double d28 = d24 * dSin2;
/* 306 */           double d29 = d7 * dCos2;
/* 315 */           double d30 = dAtan3 / ((double) iCeil);
/* 310 */           double d31 = (dCos3 * d29) + (dSin3 * d28);
/* 319 */           double d32 = d3;
/* 321 */           double d33 = d4;
/* 322 */           int i = 0;
/* 323 */           double d34 = dAtan2;
/* 325 */           while (i < iCeil) {
/* 327 */               double d35 = d34 + d30;
/* 329 */               double dSin4 = Math.sin(d35);
/* 333 */               double dCos4 = Math.cos(d35);
/* 345 */               int i2 = iCeil;
/* 348 */               double d36 = (((d5 * dCos2) * dCos4) + d22) - (d26 * dSin4);
/* 360 */               double d37 = (d29 * dSin4) + (d5 * dSin2 * dCos4) + d23;
/* 366 */               double d38 = (d25 * dSin4) - (d26 * dCos4);
/* 372 */               double d39 = (dCos4 * d29) + (dSin4 * d28);
/* 374 */               double d40 = d35 - d34;
/* 378 */               double dTan = Math.tan(d40 / 2.0d);
/* 402 */               double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d40)) / 3.0d;
/* 433 */               path.rLineTo(0.0f, 0.0f);
/* 456 */               path.cubicTo((float) ((d27 * dSqrt2) + d32), (float) ((d31 * dSqrt2) + d33), (float) (d36 - (dSqrt2 * d38)), (float) (d37 - (dSqrt2 * d39)), (float) d36, (float) d37);
/* 459 */               i++;
/* 461 */               d33 = d37;
/* 462 */               dCos2 = dCos2;
/* 464 */               d28 = d28;
/* 466 */               d34 = d35;
/* 468 */               d31 = d39;
/* 470 */               d32 = d36;
/* 472 */               iCeil = i2;
/* 474 */               d27 = d38;
/* 476 */               d30 = d30;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: b */
                public static void m8006b(qr1[] qr1VarArr, Path path) {
                    int i;
                    float f;
                    float f2;
                    float f3;
                    float f4;
                    float f5;
                    float f6;
                    float f7;
                    float f8;
                    float f9;
                    float f10;
/* 1 */             qr1[] qr1VarArr2 = qr1VarArr;
/* 6 */             float[] fArr = new float[6];
/* 8 */             int length = qr1VarArr2.length;
/* 9 */             int i2 = 0;
/* 10 */            int i3 = 0;
/* 11 */            char c = 'm';
/* 13 */            while (i3 < length) {
/* 15 */                qr1 qr1Var = qr1VarArr2[i3];
/* 17 */                char c2 = qr1Var.f15713a;
/* 19 */                float[] fArr2 = qr1Var.f15714b;
/* 21 */                float f11 = fArr[i2];
/* 25 */                float f12 = fArr[1];
/* 29 */                float f13 = fArr[2];
/* 33 */                float f14 = fArr[3];
/* 37 */                float f15 = fArr[4];
/* 41 */                int i4 = i2;
/* 43 */                float f16 = fArr[5];
                        switch (c2) {
                            case 'A':
                            case 'a':
/* 71 */                        i = 7;
                                break;
                            case 'C':
                            case 'c':
/* 68 */                        i = 6;
                                break;
                            case 'H':
                            case 'V':
                            case 'h':
                            case 'v':
/* 65 */                        i = 1;
                                break;
                            case 'Q':
                            case 'S':
                            case 'q':
                            case 's':
/* 62 */                        i = 4;
                                break;
                            case 'Z':
                            case 'z':
/* 51 */                        path.close();
/* 54 */                        path.moveTo(f15, f16);
/* 57 */                        f11 = f15;
/* 58 */                        f13 = f11;
/* 59 */                        f12 = f16;
/* 60 */                        f14 = f12;
                            default:
/* 48 */                        i = 2;
                                break;
                        }
/* 73 */                float f17 = f15;
/* 75 */                float f18 = f16;
/* 77 */                float f19 = f11;
/* 78 */                float f20 = f12;
/* 79 */                int i5 = i4;
/* 82 */                while (i5 < fArr2.length) {
/* 86 */                    if (c2 == 'A') {
/* 823 */                       fArr2 = fArr2;
/* 825 */                       i5 = i5;
/* 827 */                       qr1Var = qr1Var;
/* 829 */                       float f21 = f20;
/* 832 */                       i3 = i3;
/* 834 */                       int i6 = i5 + 5;
/* 838 */                       int i7 = i5 + 6;
/* 883 */                       m8005a(path, f19, f21, fArr2[i6], fArr2[i7], fArr2[i5], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f ? 1 : i4, fArr2[i5 + 4] != 0.0f ? 1 : i4);
/* 886 */                       f13 = fArr2[i6];
/* 888 */                       f = fArr2[i7];
/* 892 */                       f14 = f;
/* 893 */                       f2 = f13;
                            } else if (c2 == 'C') {
/* 776 */                       fArr2 = fArr2;
/* 778 */                       i5 = i5;
/* 780 */                       i3 = i3;
/* 781 */                       qr1Var = qr1Var;
/* 791 */                       int i8 = i5 + 2;
/* 795 */                       int i9 = i5 + 3;
/* 799 */                       int i10 = i5 + 4;
/* 803 */                       int i11 = i5 + 5;
/* 807 */                       path.cubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i8], fArr2[i9], fArr2[i10], fArr2[i11]);
/* 810 */                       float f22 = fArr2[i10];
/* 812 */                       float f23 = fArr2[i11];
/* 814 */                       f13 = fArr2[i8];
/* 816 */                       f14 = fArr2[i9];
/* 820 */                       f = f23;
/* 821 */                       f2 = f22;
                            } else if (c2 == 'H') {
/* 757 */                       fArr2 = fArr2;
/* 759 */                       i5 = i5;
/* 761 */                       qr1Var = qr1Var;
/* 763 */                       f = f20;
/* 766 */                       i3 = i3;
/* 769 */                       path.lineTo(fArr2[i5], f);
/* 772 */                       f2 = fArr2[i5];
                            } else if (c2 == 'Q') {
/* 717 */                       fArr2 = fArr2;
/* 719 */                       i5 = i5;
/* 721 */                       i3 = i3;
/* 722 */                       qr1Var = qr1Var;
/* 728 */                       int i12 = i5 + 1;
/* 732 */                       int i13 = i5 + 2;
/* 736 */                       int i14 = i5 + 3;
/* 740 */                       path.quadTo(fArr2[i5], fArr2[i12], fArr2[i13], fArr2[i14]);
/* 743 */                       float f24 = fArr2[i5];
/* 745 */                       float f25 = fArr2[i12];
/* 747 */                       float f26 = fArr2[i13];
/* 749 */                       float f27 = fArr2[i14];
/* 751 */                       f13 = f24;
/* 752 */                       f14 = f25;
/* 753 */                       f2 = f26;
/* 754 */                       f = f27;
                            } else if (c2 == 'V') {
/* 698 */                       fArr2 = fArr2;
/* 700 */                       i5 = i5;
/* 702 */                       i3 = i3;
/* 703 */                       qr1Var = qr1Var;
/* 704 */                       f2 = f19;
/* 710 */                       path.lineTo(f2, fArr2[i5]);
/* 713 */                       f = fArr2[i5];
                            } else if (c2 != 'a') {
/* 110 */                       if (c2 == 'c') {
/* 571 */                           fArr2 = fArr2;
/* 573 */                           i5 = i5;
/* 583 */                           int i15 = i5 + 2;
/* 587 */                           int i16 = i5 + 3;
/* 591 */                           int i17 = i5 + 4;
/* 595 */                           int i18 = i5 + 5;
/* 599 */                           path.rCubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i15], fArr2[i16], fArr2[i17], fArr2[i18]);
/* 604 */                           float f28 = fArr2[i15] + f19;
/* 607 */                           float f29 = fArr2[i16] + f20;
/* 610 */                           f19 += fArr2[i17];
/* 613 */                           f20 += fArr2[i18];
/* 614 */                           f13 = f28;
/* 615 */                           f14 = f29;
                                } else if (c2 != 'h') {
/* 118 */                           if (c2 != 'q') {
/* 122 */                               if (c2 != 'v') {
/* 126 */                                   if (c2 == 'L') {
/* 482 */                                       fArr2 = fArr2;
/* 484 */                                       i5 = i5;
/* 490 */                                       int i19 = i5 + 1;
/* 494 */                                       path.lineTo(fArr2[i5], fArr2[i19]);
/* 497 */                                       f2 = fArr2[i5];
/* 499 */                                       f = fArr2[i19];
                                            } else if (c2 == 'M') {
/* 456 */                                       fArr2 = fArr2;
/* 458 */                                       i5 = i5;
/* 462 */                                       f2 = fArr2[i5];
/* 466 */                                       f = fArr2[i5 + 1];
/* 468 */                                       if (i5 > 0) {
/* 470 */                                           path.lineTo(f2, f);
                                                } else {
/* 474 */                                           path.moveTo(f2, f);
/* 477 */                                           f17 = f2;
/* 479 */                                           f18 = f;
                                                }
                                            } else if (c2 == 'S') {
/* 392 */                                       fArr2 = fArr2;
/* 394 */                                       i5 = i5;
/* 400 */                                       if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
/* 418 */                                           f19 = (f19 * 2.0f) - f13;
/* 421 */                                           f20 = (f20 * 2.0f) - f14;
                                                }
/* 413 */                                       float f30 = f19;
/* 414 */                                       float f31 = f20;
/* 425 */                                       int i20 = i5 + 1;
/* 429 */                                       int i21 = i5 + 2;
/* 433 */                                       int i22 = i5 + 3;
/* 437 */                                       path.cubicTo(f30, f31, fArr2[i5], fArr2[i20], fArr2[i21], fArr2[i22]);
/* 440 */                                       f13 = fArr2[i5];
/* 442 */                                       f14 = fArr2[i20];
/* 444 */                                       f2 = fArr2[i21];
/* 446 */                                       f = fArr2[i22];
                                            } else if (c2 == 'T') {
/* 346 */                                       fArr2 = fArr2;
/* 348 */                                       i5 = i5;
/* 354 */                                       if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
/* 370 */                                           f19 = (f19 * 2.0f) - f13;
/* 373 */                                           f20 = (f20 * 2.0f) - f14;
                                                }
/* 376 */                                       int i23 = i5 + 1;
/* 380 */                                       path.quadTo(f19, f20, fArr2[i5], fArr2[i23]);
/* 383 */                                       f2 = fArr2[i5];
/* 385 */                                       f = fArr2[i23];
/* 387 */                                       qr1Var = qr1Var;
/* 388 */                                       f13 = f19;
/* 389 */                                       f14 = f20;
                                            } else if (c2 == 'l') {
/* 324 */                                       fArr2 = fArr2;
/* 326 */                                       i5 = i5;
/* 332 */                                       int i24 = i5 + 1;
/* 336 */                                       path.rLineTo(fArr2[i5], fArr2[i24]);
/* 341 */                                       f19 += fArr2[i5];
/* 342 */                                       f6 = fArr2[i24];
                                            } else if (c2 == 'm') {
/* 292 */                                       fArr2 = fArr2;
/* 294 */                                       i5 = i5;
/* 298 */                                       float f32 = fArr2[i5];
/* 300 */                                       f19 += f32;
/* 303 */                                       float f33 = fArr2[i5 + 1];
/* 305 */                                       f20 += f33;
/* 306 */                                       if (i5 > 0) {
/* 308 */                                           path.rLineTo(f32, f33);
                                                } else {
/* 312 */                                           path.rMoveTo(f32, f33);
/* 315 */                                           qr1Var = qr1Var;
/* 316 */                                           f2 = f19;
/* 317 */                                           f17 = f2;
/* 319 */                                           f = f20;
/* 320 */                                           f18 = f;
                                                }
                                            } else if (c2 != 's') {
/* 156 */                                       if (c2 != 't') {
/* 163 */                                           f2 = f19;
                                                } else {
/* 173 */                                           if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
/* 189 */                                               f9 = f19 - f13;
/* 191 */                                               f10 = f20 - f14;
                                                    } else {
/* 186 */                                               f10 = 0.0f;
/* 187 */                                               f9 = 0.0f;
                                                    }
/* 195 */                                           int i25 = i5 + 1;
/* 199 */                                           path.rQuadTo(f9, f10, fArr2[i5], fArr2[i25]);
/* 202 */                                           float f34 = f9 + f19;
/* 203 */                                           float f35 = f10 + f20;
/* 206 */                                           float f36 = f19 + fArr2[i5];
/* 209 */                                           f20 += fArr2[i25];
/* 210 */                                           f14 = f35;
/* 216 */                                           f2 = f36;
/* 217 */                                           f13 = f34;
                                                }
/* 164 */                                       f = f20;
                                            } else {
/* 221 */                                       if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
/* 240 */                                           f7 = f20 - f14;
/* 238 */                                           f8 = f19 - f13;
                                                } else {
/* 234 */                                           f8 = 0.0f;
/* 235 */                                           f7 = 0.0f;
                                                }
/* 236 */                                       int i26 = i5;
/* 248 */                                       int i27 = i26 + 1;
/* 253 */                                       int i28 = i26 + 2;
/* 258 */                                       int i29 = i26 + 3;
/* 264 */                                       fArr2 = fArr2;
/* 267 */                                       i5 = i26;
/* 271 */                                       path.rCubicTo(f8, f7, fArr2[i26], fArr2[i27], fArr2[i28], fArr2[i29]);
/* 276 */                                       f3 = fArr2[i5] + f19;
/* 279 */                                       f4 = fArr2[i27] + f20;
/* 282 */                                       f19 += fArr2[i28];
/* 283 */                                       f5 = fArr2[i29];
                                            }
/* 453 */                                   qr1Var = qr1Var;
                                        } else {
/* 502 */                                   fArr2 = fArr2;
/* 504 */                                   i5 = i5;
/* 511 */                                   path.rLineTo(0.0f, fArr2[i5]);
/* 514 */                                   f6 = fArr2[i5];
                                        }
/* 344 */                               f20 += f6;
                                    } else {
/* 518 */                               fArr2 = fArr2;
/* 520 */                               i5 = i5;
/* 526 */                               int i30 = i5 + 1;
/* 530 */                               int i31 = i5 + 2;
/* 534 */                               int i32 = i5 + 3;
/* 538 */                               path.rQuadTo(fArr2[i5], fArr2[i30], fArr2[i31], fArr2[i32]);
/* 543 */                               f3 = fArr2[i5] + f19;
/* 546 */                               f4 = fArr2[i30] + f20;
/* 549 */                               f19 += fArr2[i31];
/* 550 */                               f5 = fArr2[i32];
                                    }
/* 285 */                           f20 += f5;
/* 286 */                           f13 = f3;
/* 287 */                           f14 = f4;
                                } else {
/* 554 */                           fArr2 = fArr2;
/* 556 */                           i5 = i5;
/* 563 */                           path.rLineTo(fArr2[i5], 0.0f);
/* 568 */                           f19 += fArr2[i5];
                                }
/* 288 */                       qr1Var = qr1Var;
/* 289 */                       f2 = f19;
/* 290 */                       f = f20;
                            } else {
/* 618 */                       fArr2 = fArr2;
/* 620 */                       i5 = i5;
/* 624 */                       int i33 = i5 + 5;
/* 628 */                       float f37 = fArr2[i33] + f19;
/* 630 */                       int i34 = i5 + 6;
/* 634 */                       float f38 = fArr2[i34] + f20;
/* 669 */                       qr1Var = qr1Var;
/* 670 */                       float f39 = f19;
/* 676 */                       float f40 = f20;
/* 677 */                       i3 = i3;
/* 685 */                       m8005a(path, f39, f40, f37, f38, fArr2[i5], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f ? 1 : i4, fArr2[i5 + 4] != 0.0f ? 1 : i4);
/* 690 */                       f2 = f39 + fArr2[i33];
/* 693 */                       f = f40 + fArr2[i34];
/* 694 */                       f13 = f2;
/* 695 */                       f14 = f;
                            }
/* 894 */                   i5 += i;
/* 896 */                   path = path;
/* 898 */                   qr1Var = qr1Var;
/* 899 */                   c2 = c2;
/* 900 */                   i3 = i3;
/* 903 */                   f19 = f2;
/* 904 */                   f20 = f;
/* 905 */                   c = c2;
/* 906 */                   fArr2 = fArr2;
                        }
/* 916 */               fArr[i4] = f19;
/* 918 */               fArr[1] = f20;
/* 920 */               fArr[2] = f13;
/* 922 */               fArr[3] = f14;
/* 924 */               fArr[4] = f17;
/* 926 */               fArr[5] = f18;
/* 928 */               c = qr1Var.f15713a;
/* 930 */               i3++;
/* 932 */               qr1VarArr2 = qr1VarArr;
/* 936 */               i2 = i4;
                    }
                }
            }
