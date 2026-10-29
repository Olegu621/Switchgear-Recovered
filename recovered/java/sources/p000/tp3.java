            package p000;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.attribution.RequestError;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1697u2;
            import java.lang.reflect.Field;
            import java.nio.charset.Charset;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Segment;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tp3 implements bq3 {

                /* JADX INFO: renamed from: n */
                public static final int[] f17210n = new int[0];

                /* JADX INFO: renamed from: o */
                public static final Unsafe f17211o = tq3.m8874l();

                /* JADX INFO: renamed from: a */
                public final int[] f17212a;

                /* JADX INFO: renamed from: b */
                public final Object[] f17213b;

                /* JADX INFO: renamed from: c */
                public final int f17214c;

                /* JADX INFO: renamed from: d */
                public final int f17215d;

                /* JADX INFO: renamed from: e */
                public final tm3 f17216e;

                /* JADX INFO: renamed from: f */
                public final boolean f17217f;

                /* JADX INFO: renamed from: g */
                public final boolean f17218g;

                /* JADX INFO: renamed from: h */
                public final int[] f17219h;

                /* JADX INFO: renamed from: i */
                public final int f17220i;

                /* JADX INFO: renamed from: j */
                public final int f17221j;

                /* JADX INFO: renamed from: k */
                public final ep3 f17222k;

                /* JADX INFO: renamed from: l */
                public final nq3 f17223l;

                /* JADX INFO: renamed from: m */
                public final qn3 f17224m;

                public tp3(int[] iArr, Object[] objArr, int i, int i2, tm3 tm3Var, boolean z, int[] iArr2, int i3, int i4, ep3 ep3Var, nq3 nq3Var, qn3 qn3Var) {
/* 4 */             this.f17212a = iArr;
/* 6 */             this.f17213b = objArr;
/* 8 */             this.f17214c = i;
/* 10 */            this.f17215d = i2;
/* 12 */            this.f17218g = z;
/* 14 */            boolean z2 = false;
/* 15 */            if (qn3Var != null && (tm3Var instanceof bo3)) {
/* 21 */                z2 = true;
                    }
/* 22 */            this.f17217f = z2;
/* 24 */            this.f17219h = iArr2;
/* 26 */            this.f17220i = i3;
/* 28 */            this.f17221j = i4;
/* 30 */            this.f17222k = ep3Var;
/* 32 */            this.f17223l = nq3Var;
/* 34 */            this.f17224m = qn3Var;
/* 36 */            this.f17216e = tm3Var;
                }

                /* JADX INFO: renamed from: h */
                public static int m8822h(int i) {
/* 3 */             return (i >>> 20) & 255;
                }

                /* JADX INFO: renamed from: i */
                public static boolean m8823i(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof eo3) {
/* 11 */                return ((eo3) obj).m3545m();
                    }
/* 16 */            return true;
                }

                /* JADX INFO: renamed from: j */
                public static void m8824j(Object obj) {
/* 5 */             if (m8823i(obj)) {
/* 7 */                 return;
                    }
/* 18 */            C1951n4.m6859j("Mutating immutable message: ".concat(String.valueOf(obj)));
                }

                /* JADX INFO: renamed from: k */
                public static int m8825k(Object obj, long j) {
/* 7 */             return ((Integer) tq3.m8872j(obj, j)).intValue();
                }

                /* JADX INFO: renamed from: l */
                public static long m8826l(Object obj, long j) {
/* 7 */             return ((Long) tq3.m8872j(obj, j)).longValue();
                }

                /* JADX INFO: renamed from: r */
                public static final void m8827r(int i, Object obj, pi3 pi3Var) throws C1868kw {
/* 3 */             if (!(obj instanceof String)) {
/* 132 */               pi3Var.m7458e(i, (cn3) obj);
/* 135 */               return;
                    }
/* 5 */             String str = (String) obj;
/* 9 */             kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 15 */            kn3Var.m6165j((i << 3) | 2);
/* 18 */            int i2 = kn3Var.f12899c;
/* 20 */            byte[] bArr = kn3Var.f12898b;
/* 22 */            int i3 = kn3Var.f12900d;
                    try {
/* 30 */                int iM6154p = kn3.m6154p(str.length() * 3);
/* 38 */                int iM6154p2 = kn3.m6154p(str.length());
/* 42 */                if (iM6154p2 != iM6154p) {
/* 72 */                    kn3Var.m6165j(zq3.m10424a(str));
/* 75 */                    int i4 = kn3Var.f12900d;
/* 82 */                    kn3Var.f12900d = zq3.m10425b(str, bArr, i4, i2 - i4);
                        } else {
/* 44 */                    int i5 = i3 + iM6154p2;
/* 46 */                    kn3Var.f12900d = i5;
/* 49 */                    int iM10425b = zq3.m10425b(str, bArr, i5, i2 - i5);
/* 53 */                    kn3Var.f12900d = i3;
/* 58 */                    kn3Var.m6165j((iM10425b - i3) - iM6154p2);
/* 61 */                    kn3Var.f12900d = iM10425b;
                        }
                    } catch (IndexOutOfBoundsException e) {
/* 92 */                throw new C1868kw(e);
                    } catch (uq3 e2) {
/* 93 */                kn3Var.f12900d = i3;
/* 105 */               kn3.f12895e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
/* 110 */               byte[] bytes = str.getBytes(so3.f16726a);
                        try {
/* 114 */                   int length = bytes.length;
/* 115 */                   kn3Var.m6165j(length);
/* 118 */                   kn3Var.m6169n(bytes, length);
                        } catch (IndexOutOfBoundsException e3) {
/* 129 */                   throw new C1868kw(e3);
                        }
                    }
                }

                /* JADX INFO: renamed from: s */
                public static mq3 m8828s(Object obj) {
/* 1 */             eo3 eo3Var = (eo3) obj;
/* 3 */             mq3 mq3Var = eo3Var.zzc;
/* 7 */             if (mq3Var != mq3.f13977f) {
/* 15 */                return mq3Var;
                    }
/* 9 */             mq3 mq3VarM6789a = mq3.m6789a();
/* 13 */            eo3Var.zzc = mq3VarM6789a;
/* 15 */            return mq3VarM6789a;
                }

                /* JADX WARN: Code duplicated, block: B:171:0x0349  */
                /* JADX WARN: Code duplicated, block: B:186:0x039b  */
                /* JADX WARN: Code duplicated, block: B:189:0x03a8  */
                /* JADX INFO: renamed from: u */
                public static tp3 m8829u(aq3 aq3Var, ep3 ep3Var, nq3 nq3Var, qn3 qn3Var) {
                    int i;
                    int iCharAt;
                    int iCharAt2;
                    int i2;
                    int i3;
                    int[] iArr;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    char cCharAt;
                    int i8;
                    char cCharAt2;
                    int i9;
                    char cCharAt3;
                    int i10;
                    char cCharAt4;
                    int i11;
                    char cCharAt5;
                    int i12;
                    char cCharAt6;
                    int i13;
                    char cCharAt7;
                    int i14;
                    char cCharAt8;
                    int i15;
                    int i16;
                    int i17;
                    int i18;
                    int iObjectFieldOffset;
                    char c;
                    int i19;
                    int iObjectFieldOffset2;
                    Field fieldM8830v;
                    int i20;
                    char cCharAt9;
                    int i21;
                    Field fieldM8830v2;
                    Field fieldM8830v3;
                    int i22;
                    char cCharAt10;
                    int i23;
                    char cCharAt11;
                    int i24;
                    char cCharAt12;
                    int i25;
                    char cCharAt13;
/* 5 */             if (!(aq3Var instanceof aq3)) {
/* 1017 */              C1697u2.m5431g();
/* 1020 */              return null;
                    }
/* 11 */            char c2 = 2;
/* 16 */            char c3 = (aq3Var.f2062d & 1) == 1 ? (char) 1 : (char) 2;
/* 17 */            String str = aq3Var.f2060b;
/* 19 */            int length = str.length();
/* 23 */            int i26 = 0;
/* 28 */            char c4 = 55296;
/* 31 */            if (str.charAt(0) >= 55296) {
/* 33 */                int i27 = 1;
                        while (true) {
/* 34 */                    i = i27 + 1;
/* 40 */                    if (str.charAt(i27) < 55296) {
                                break;
                            }
/* 42 */                    i27 = i;
                        }
                    } else {
/* 44 */                i = 1;
                    }
/* 45 */            int i28 = i + 1;
/* 47 */            int iCharAt3 = str.charAt(i);
/* 51 */            if (iCharAt3 >= 55296) {
/* 53 */                int i29 = iCharAt3 & 8191;
/* 55 */                int i30 = 13;
                        while (true) {
/* 57 */                    i25 = i28 + 1;
/* 59 */                    cCharAt13 = str.charAt(i28);
/* 63 */                    if (cCharAt13 < 55296) {
                                break;
                            }
/* 68 */                    i29 |= (cCharAt13 & 8191) << i30;
/* 69 */                    i30 += 13;
/* 71 */                    i28 = i25;
                        }
/* 74 */                iCharAt3 = i29 | (cCharAt13 << i30);
/* 75 */                i28 = i25;
                    }
/* 76 */            if (iCharAt3 == 0) {
/* 78 */                iArr = f17210n;
/* 80 */                iCharAt = 0;
/* 81 */                iCharAt2 = 0;
/* 82 */                i3 = 0;
/* 83 */                i5 = 0;
/* 85 */                i6 = 0;
/* 87 */                i4 = 0;
                    } else {
/* 93 */                int i31 = i28 + 1;
/* 95 */                int iCharAt4 = str.charAt(i28);
/* 99 */                if (iCharAt4 >= 55296) {
/* 101 */                   int i32 = iCharAt4 & 8191;
/* 103 */                   int i33 = 13;
                            while (true) {
/* 105 */                       i14 = i31 + 1;
/* 107 */                       cCharAt8 = str.charAt(i31);
/* 111 */                       if (cCharAt8 < 55296) {
                                    break;
                                }
/* 116 */                       i32 |= (cCharAt8 & 8191) << i33;
/* 117 */                       i33 += 13;
/* 119 */                       i31 = i14;
                            }
/* 122 */                   iCharAt4 = i32 | (cCharAt8 << i33);
/* 123 */                   i31 = i14;
                        }
/* 124 */               int i34 = i31 + 1;
/* 126 */               int iCharAt5 = str.charAt(i31);
/* 130 */               if (iCharAt5 >= 55296) {
/* 132 */                   int i35 = iCharAt5 & 8191;
/* 134 */                   int i36 = 13;
                            while (true) {
/* 136 */                       i13 = i34 + 1;
/* 138 */                       cCharAt7 = str.charAt(i34);
/* 142 */                       if (cCharAt7 < 55296) {
                                    break;
                                }
/* 147 */                       i35 |= (cCharAt7 & 8191) << i36;
/* 148 */                       i36 += 13;
/* 150 */                       i34 = i13;
                            }
/* 153 */                   iCharAt5 = i35 | (cCharAt7 << i36);
/* 154 */                   i34 = i13;
                        }
/* 155 */               int i37 = i34 + 1;
/* 157 */               int iCharAt6 = str.charAt(i34);
/* 161 */               if (iCharAt6 >= 55296) {
/* 163 */                   int i38 = iCharAt6 & 8191;
/* 165 */                   int i39 = 13;
                            while (true) {
/* 167 */                       i12 = i37 + 1;
/* 169 */                       cCharAt6 = str.charAt(i37);
/* 173 */                       if (cCharAt6 < 55296) {
                                    break;
                                }
/* 178 */                       i38 |= (cCharAt6 & 8191) << i39;
/* 179 */                       i39 += 13;
/* 181 */                       i37 = i12;
                            }
/* 184 */                   iCharAt6 = i38 | (cCharAt6 << i39);
/* 185 */                   i37 = i12;
                        }
/* 186 */               int i40 = i37 + 1;
/* 188 */               int iCharAt7 = str.charAt(i37);
/* 192 */               if (iCharAt7 >= 55296) {
/* 194 */                   int i41 = iCharAt7 & 8191;
/* 196 */                   int i42 = 13;
                            while (true) {
/* 198 */                       i11 = i40 + 1;
/* 200 */                       cCharAt5 = str.charAt(i40);
/* 204 */                       if (cCharAt5 < 55296) {
                                    break;
                                }
/* 209 */                       i41 |= (cCharAt5 & 8191) << i42;
/* 210 */                       i42 += 13;
/* 212 */                       i40 = i11;
                            }
/* 215 */                   iCharAt7 = i41 | (cCharAt5 << i42);
/* 216 */                   i40 = i11;
                        }
/* 217 */               int i43 = i40 + 1;
/* 219 */               iCharAt = str.charAt(i40);
/* 223 */               if (iCharAt >= 55296) {
/* 225 */                   int i44 = iCharAt & 8191;
/* 227 */                   int i45 = 13;
                            while (true) {
/* 229 */                       i10 = i43 + 1;
/* 231 */                       cCharAt4 = str.charAt(i43);
/* 235 */                       if (cCharAt4 < 55296) {
                                    break;
                                }
/* 240 */                       i44 |= (cCharAt4 & 8191) << i45;
/* 241 */                       i45 += 13;
/* 243 */                       i43 = i10;
                            }
/* 247 */                   iCharAt = i44 | (cCharAt4 << i45);
/* 248 */                   i43 = i10;
                        }
/* 250 */               int i46 = i43 + 1;
/* 252 */               iCharAt2 = str.charAt(i43);
/* 256 */               if (iCharAt2 >= 55296) {
/* 258 */                   int i47 = iCharAt2 & 8191;
/* 260 */                   int i48 = 13;
                            while (true) {
/* 262 */                       i9 = i46 + 1;
/* 264 */                       cCharAt3 = str.charAt(i46);
/* 268 */                       if (cCharAt3 < 55296) {
                                    break;
                                }
/* 274 */                       i47 |= (cCharAt3 & 8191) << i48;
/* 275 */                       i48 += 13;
/* 277 */                       i46 = i9;
                            }
/* 282 */                   iCharAt2 = i47 | (cCharAt3 << i48);
/* 283 */                   i46 = i9;
                        }
/* 285 */               int i49 = i46 + 1;
/* 287 */               int iCharAt8 = str.charAt(i46);
/* 291 */               if (iCharAt8 >= 55296) {
/* 293 */                   int i50 = iCharAt8 & 8191;
/* 295 */                   int i51 = i49;
/* 297 */                   int i52 = 13;
                            while (true) {
/* 299 */                       i8 = i51 + 1;
/* 301 */                       cCharAt2 = str.charAt(i51);
/* 305 */                       if (cCharAt2 < 55296) {
                                    break;
                                }
/* 311 */                       i50 |= (cCharAt2 & 8191) << i52;
/* 312 */                       i52 += 13;
/* 314 */                       i51 = i8;
                            }
/* 319 */                   iCharAt8 = i50 | (cCharAt2 << i52);
/* 320 */                   i2 = i8;
                        } else {
/* 323 */                   i2 = i49;
                        }
/* 325 */               int i53 = i2 + 1;
/* 327 */               int iCharAt9 = str.charAt(i2);
/* 331 */               if (iCharAt9 >= 55296) {
/* 333 */                   int i54 = iCharAt9 & 8191;
/* 335 */                   int i55 = i53;
/* 337 */                   int i56 = 13;
                            while (true) {
/* 339 */                       i7 = i55 + 1;
/* 341 */                       cCharAt = str.charAt(i55);
/* 345 */                       if (cCharAt < 55296) {
                                    break;
                                }
/* 351 */                       i54 |= (cCharAt & 8191) << i56;
/* 352 */                       i56 += 13;
/* 354 */                       i55 = i7;
                            }
/* 359 */                   iCharAt9 = i54 | (cCharAt << i56);
/* 360 */                   i53 = i7;
                        }
/* 364 */               int i57 = iCharAt9 + iCharAt2 + iCharAt8;
/* 367 */               i3 = iCharAt4 + iCharAt4 + iCharAt5;
/* 368 */               iArr = new int[i57];
/* 370 */               i4 = iCharAt9;
/* 372 */               i26 = iCharAt4;
/* 373 */               i5 = iCharAt6;
/* 375 */               i6 = iCharAt7;
/* 377 */               i28 = i53;
                    }
/* 89 */            int[] iArr2 = iArr;
/* 381 */           Unsafe unsafe = f17211o;
/* 383 */           Object[] objArr = aq3Var.f2061c;
/* 387 */           Class<?> cls = aq3Var.f2059a.getClass();
/* 391 */           int i58 = i4 + iCharAt2;
/* 393 */           int i59 = iCharAt + iCharAt;
/* 397 */           int[] iArr3 = new int[iCharAt * 3];
/* 399 */           Object[] objArr2 = new Object[i59];
/* 401 */           int i60 = i4;
/* 403 */           int i61 = i58;
/* 405 */           int i62 = 0;
/* 406 */           int i63 = 0;
                    while (true) {
/* 413 */               boolean z = c3 == c2;
/* 415 */               if (i28 >= length) {
/* 1013 */                  return new tp3(iArr3, objArr2, i5, i6, aq3Var.f2059a, z, iArr2, i4, i58, ep3Var, nq3Var, qn3Var);
                        }
/* 417 */               int i64 = i28 + 1;
/* 419 */               int iCharAt10 = str.charAt(i28);
/* 423 */               if (iCharAt10 >= c4) {
/* 425 */                   int i65 = iCharAt10 & 8191;
/* 427 */                   int i66 = i64;
/* 429 */                   int i67 = 13;
                            while (true) {
/* 431 */                       i24 = i66 + 1;
/* 433 */                       cCharAt12 = str.charAt(i66);
/* 437 */                       if (cCharAt12 < c4) {
                                    break;
                                }
/* 443 */                       i65 |= (cCharAt12 & 8191) << i67;
/* 444 */                       i67 += 13;
/* 446 */                       i66 = i24;
                            }
/* 451 */                   iCharAt10 = i65 | (cCharAt12 << i67);
/* 452 */                   i15 = i24;
                        } else {
/* 455 */                   i15 = i64;
                        }
/* 457 */               int i68 = i15 + 1;
/* 459 */               int iCharAt11 = str.charAt(i15);
/* 463 */               if (iCharAt11 >= c4) {
/* 465 */                   int i69 = iCharAt11 & 8191;
/* 467 */                   int i70 = i68;
/* 469 */                   int i71 = 13;
                            while (true) {
/* 471 */                       i23 = i70 + 1;
/* 473 */                       cCharAt11 = str.charAt(i70);
/* 477 */                       if (cCharAt11 < c4) {
                                    break;
                                }
/* 483 */                       i69 |= (cCharAt11 & 8191) << i71;
/* 484 */                       i71 += 13;
/* 486 */                       i70 = i23;
                            }
/* 491 */                   iCharAt11 = i69 | (cCharAt11 << i71);
/* 492 */                   i16 = i23;
                        } else {
/* 495 */                   i16 = i68;
                        }
/* 499 */               if ((iCharAt11 & Segment.SHARE_MINIMUM) != 0) {
/* 503 */                   iArr2[i63] = i62;
/* 501 */                   i63++;
                        }
/* 507 */               int i72 = iCharAt11 & 255;
/* 509 */               char c5 = c3;
/* 513 */               if (i72 >= 51) {
/* 515 */                   int i73 = i16 + 1;
/* 517 */                   int iCharAt12 = str.charAt(i16);
/* 523 */                   char c6 = 55296;
/* 526 */                   if (iCharAt12 >= 55296) {
/* 528 */                       int i74 = iCharAt12 & 8191;
/* 534 */                       int i75 = i73;
/* 536 */                       int i76 = 13;
                                while (true) {
/* 538 */                           i22 = i75 + 1;
/* 540 */                           cCharAt10 = str.charAt(i75);
/* 544 */                           if (cCharAt10 < c6) {
                                        break;
                                    }
/* 550 */                           i74 |= (cCharAt10 & 8191) << i76;
/* 552 */                           i76 += 13;
/* 554 */                           i75 = i22;
/* 556 */                           c6 = 55296;
                                }
/* 562 */                       iCharAt12 = i74 | (cCharAt10 << i76);
/* 564 */                       i21 = i22;
                            } else {
/* 567 */                       i21 = i73;
                            }
/* 569 */                   int i77 = i21;
/* 571 */                   int i78 = i72 - 51;
/* 573 */                   i17 = length;
/* 577 */                   if (i78 == 9 || i78 == 17) {
/* 618 */                       objArr2[pm2.m7483f(i62, 3, 1)] = objArr[i3];
/* 614 */                       i3++;
                            } else if (i78 == 12 && !z) {
/* 602 */                       objArr2[pm2.m7483f(i62, 3, 1)] = objArr[i3];
/* 598 */                       i3++;
                            }
/* 621 */                   int i79 = iCharAt12 + iCharAt12;
/* 622 */                   Object obj = objArr[i79];
/* 626 */                   if (obj instanceof Field) {
/* 628 */                       fieldM8830v2 = (Field) obj;
                            } else {
/* 635 */                       fieldM8830v2 = m8830v(cls, (String) obj);
/* 639 */                       objArr[i79] = fieldM8830v2;
                            }
/* 630 */                   i18 = i26;
/* 646 */                   int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM8830v2);
/* 647 */                   int i80 = i79 + 1;
/* 649 */                   Object obj2 = objArr[i80];
/* 653 */                   if (obj2 instanceof Field) {
/* 655 */                       fieldM8830v3 = (Field) obj2;
                            } else {
/* 660 */                       fieldM8830v3 = m8830v(cls, (String) obj2);
/* 664 */                       objArr[i80] = fieldM8830v3;
                            }
/* 671 */                   iObjectFieldOffset = iObjectFieldOffset3;
/* 673 */                   i62 = i62;
/* 670 */                   iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM8830v3);
/* 677 */                   i16 = i77;
/* 679 */                   c = 55296;
/* 682 */                   i19 = 0;
                        } else {
/* 685 */                   i17 = length;
/* 687 */                   i18 = i26;
/* 689 */                   int i81 = i3 + 1;
/* 695 */                   Field fieldM8830v4 = m8830v(cls, (String) objArr[i3]);
/* 701 */                   if (i72 == 9 || i72 == 17) {
/* 826 */                       objArr2[pm2.m7483f(i62, 3, 1)] = fieldM8830v4.getType();
                            } else {
/* 715 */                       if (i72 == 27 || i72 == 49) {
/* 811 */                           i3 += 2;
/* 815 */                           objArr2[pm2.m7483f(i62, 3, 1)] = objArr[i81];
                                } else if (i72 != 12 && i72 != 30 && i72 != 44) {
/* 741 */                           if (i72 == 50) {
/* 743 */                               i60++;
/* 745 */                               iArr2[i60] = i62;
/* 747 */                               int i82 = i62 / 3;
/* 749 */                               int i83 = i3 + 2;
/* 753 */                               int i84 = i82 + i82;
/* 755 */                               objArr2[i84] = objArr[i81];
/* 759 */                               if ((iCharAt11 & 2048) != 0) {
/* 767 */                                   objArr2[i84 + 1] = objArr[i83];
/* 763 */                                   i3 += 3;
                                        } else {
/* 780 */                                   i3 = i83;
                                        }
                                    }
/* 835 */                           iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM8830v4);
/* 840 */                           if ((iCharAt11 & 4096) == 4096 || i72 > 17) {
/* 926 */                               c = 55296;
/* 929 */                               i19 = 0;
/* 930 */                               iObjectFieldOffset2 = 1048575;
                                    } else {
/* 846 */                               int i85 = i16 + 1;
/* 848 */                               int iCharAt13 = str.charAt(i16);
/* 855 */                               if (iCharAt13 >= 55296) {
/* 857 */                                   int i86 = iCharAt13 & 8191;
/* 859 */                                   int i87 = 13;
                                            while (true) {
/* 861 */                                       i20 = i85 + 1;
/* 863 */                                       cCharAt9 = str.charAt(i85);
/* 867 */                                       if (cCharAt9 < 55296) {
                                                    break;
                                                }
/* 873 */                                       i86 |= (cCharAt9 & 8191) << i87;
/* 874 */                                       i87 += 13;
/* 876 */                                       i85 = i20;
                                            }
/* 881 */                                   iCharAt13 = i86 | (cCharAt9 << i87);
/* 882 */                                   i85 = i20;
                                        }
/* 888 */                               int i88 = (iCharAt13 / 32) + i18 + i18;
/* 890 */                               Object obj3 = objArr[i88];
/* 894 */                               if (obj3 instanceof Field) {
/* 896 */                                   fieldM8830v = (Field) obj3;
                                        } else {
/* 904 */                                   fieldM8830v = m8830v(cls, (String) obj3);
/* 908 */                                   objArr[i88] = fieldM8830v;
                                        }
/* 900 */                               i16 = i85;
/* 916 */                               i19 = iCharAt13 % 32;
/* 915 */                               iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM8830v);
/* 920 */                               c = 55296;
                                    }
/* 935 */                           if (i72 >= 18 && i72 <= 49) {
/* 943 */                               iArr2[i61] = iObjectFieldOffset;
/* 941 */                               i61++;
                                    }
                                } else if (!z) {
/* 798 */                           i3 += 2;
/* 802 */                           objArr2[pm2.m7483f(i62, 3, 1)] = objArr[i81];
                                }
/* 804 */                       i62 = i62;
/* 835 */                       iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM8830v4);
/* 840 */                       if ((iCharAt11 & 4096) == 4096) {
/* 926 */                           c = 55296;
/* 929 */                           i19 = 0;
/* 930 */                           iObjectFieldOffset2 = 1048575;
                                } else {
/* 926 */                           c = 55296;
/* 929 */                           i19 = 0;
/* 930 */                           iObjectFieldOffset2 = 1048575;
                                }
/* 935 */                       if (i72 >= 18) {
/* 943 */                           iArr2[i61] = iObjectFieldOffset;
/* 941 */                           i61++;
                                }
                            }
/* 828 */                   i3 = i81;
/* 804 */                   i62 = i62;
/* 835 */                   iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM8830v4);
/* 840 */                   if ((iCharAt11 & 4096) == 4096) {
/* 926 */                       c = 55296;
/* 929 */                       i19 = 0;
/* 930 */                       iObjectFieldOffset2 = 1048575;
                            } else {
/* 926 */                       c = 55296;
/* 929 */                       i19 = 0;
/* 930 */                       iObjectFieldOffset2 = 1048575;
                            }
/* 935 */                   if (i72 >= 18) {
/* 943 */                       iArr2[i61] = iObjectFieldOffset;
/* 941 */                       i61++;
                            }
                        }
/* 947 */               int i89 = i62 + 1;
/* 949 */               iArr3[i62] = iCharAt10;
/* 951 */               int i90 = i62 + 2;
/* 975 */               iArr3[i89] = ((iCharAt11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | ((iCharAt11 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 ? 536870912 : 0) | (i72 << 20) | iObjectFieldOffset;
/* 977 */               i62 += 3;
/* 983 */               iArr3[i90] = (i19 << 20) | iObjectFieldOffset2;
/* 985 */               c4 = c;
/* 986 */               i28 = i16;
/* 987 */               c3 = c5;
/* 989 */               length = i17;
/* 991 */               i26 = i18;
/* 993 */               c2 = 2;
                    }
                }

                /* JADX INFO: renamed from: v */
                public static Field m8830v(Class cls, String str) {
                    try {
/* 1 */                 return cls.getDeclaredField(str);
                    } catch (NoSuchFieldException unused) {
/* 6 */                 Field[] declaredFields = cls.getDeclaredFields();
/* 12 */                for (Field field : declaredFields) {
/* 24 */                    if (str.equals(field.getName())) {
/* 26 */                        return field;
                            }
                        }
/* 30 */                String name = cls.getName();
/* 34 */                String string = Arrays.toString(declaredFields);
/* 66 */                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
/* 73 */                fm0.m3796v(sb, "Field ", str, " for ", name);
/* 82 */                f42.m3663s(fm0.m3789o(sb, " not found. Known fields are ", string));
/* 85 */                return null;
                    }
                }

                /* JADX INFO: renamed from: A */
                public final void m8831A(Object obj, int i, long j) {
                    lp3 lp3Var;
/* 1 */             Unsafe unsafe = f17211o;
/* 3 */             Object objM8834D = m8834D(i);
/* 7 */             Object object = unsafe.getObject(obj, j);
/* 16 */            if (!((lp3) object).f13449a) {
/* 18 */                lp3 lp3Var2 = lp3.f13448b;
/* 24 */                if (lp3Var2.isEmpty()) {
/* 28 */                    lp3Var = new lp3();
                        } else {
/* 34 */                    lp3 lp3Var3 = new lp3(lp3Var2);
/* 38 */                    lp3Var3.f13449a = true;
/* 40 */                    lp3Var = lp3Var3;
                        }
/* 41 */                np3.m7020b(lp3Var, object);
/* 44 */                unsafe.putObject(obj, j, lp3Var);
                    }
/* 47 */            objM8834D.getClass();
/* 55 */            throw new ClassCastException();
                }

                /* JADX INFO: renamed from: B */
                public final int m8832B(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, ym3 ym3Var) throws uo3 {
/* 15 */            Unsafe unsafe = f17211o;
/* 26 */            long j2 = this.f17212a[i8 + 2] & 1048575;
                    switch (i7) {
                        case 51:
/* 458 */                   if (i5 != 1) {
/* 456 */                       return i;
                            }
/* 472 */                   unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(w11.m9432h0(bArr, i))));
/* 475 */                   int i9 = i + 8;
/* 477 */                   unsafe.putInt(obj, j2, i4);
/* 480 */                   return i9;
                        case 52:
/* 431 */                   if (i5 != 5) {
/* 429 */                       return i;
                            }
/* 445 */                   unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(w11.m9430g0(bArr, i))));
/* 448 */                   int i10 = i + 4;
/* 450 */                   unsafe.putInt(obj, j2, i4);
/* 453 */                   return i10;
                        case 53:
                        case 54:
/* 408 */                   if (i5 != 0) {
/* 404 */                       return i;
                            }
/* 410 */                   int iM9426e0 = w11.m9426e0(bArr, i, ym3Var);
/* 420 */                   unsafe.putObject(obj, j, Long.valueOf(ym3Var.f19708b));
/* 423 */                   unsafe.putInt(obj, j2, i4);
/* 426 */                   return iM9426e0;
                        case 55:
                        case 62:
/* 383 */                   if (i5 != 0) {
/* 379 */                       return i;
                            }
/* 385 */                   int iM9416Z = w11.m9416Z(bArr, i, ym3Var);
/* 395 */                   unsafe.putObject(obj, j, Integer.valueOf(ym3Var.f19707a));
/* 398 */                   unsafe.putInt(obj, j2, i4);
/* 401 */                   return iM9416Z;
                        case 56:
                        case 65:
/* 358 */                   if (i5 != 1) {
/* 356 */                       return i;
                            }
/* 368 */                   unsafe.putObject(obj, j, Long.valueOf(w11.m9432h0(bArr, i)));
/* 371 */                   int i11 = i + 8;
/* 373 */                   unsafe.putInt(obj, j2, i4);
/* 376 */                   return i11;
                        case 57:
                        case 64:
/* 335 */                   if (i5 != 5) {
/* 333 */                       return i;
                            }
/* 345 */                   unsafe.putObject(obj, j, Integer.valueOf(w11.m9430g0(bArr, i)));
/* 348 */                   int i12 = i + 4;
/* 350 */                   unsafe.putInt(obj, j2, i4);
/* 353 */                   return i12;
                        case 58:
/* 304 */                   if (i5 != 0) {
/* 300 */                       return i;
                            }
/* 306 */                   int iM9426e1 = w11.m9426e0(bArr, i, ym3Var);
/* 324 */                   unsafe.putObject(obj, j, Boolean.valueOf(ym3Var.f19708b != 0));
/* 327 */                   unsafe.putInt(obj, j2, i4);
/* 330 */                   return iM9426e1;
                        case 59:
/* 242 */                   if (i5 != 2) {
/* 238 */                       return i;
                            }
/* 244 */                   int iM9416Z2 = w11.m9416Z(bArr, i, ym3Var);
/* 248 */                   int i13 = ym3Var.f19707a;
/* 250 */                   if (i13 == 0) {
/* 254 */                       unsafe.putObject(obj, j, HttpUrl.FRAGMENT_ENCODE_SET);
                            } else {
/* 262 */                       if ((i6 & 536870912) != 0) {
/* 268 */                           zq3.f20295a.getClass();
/* 275 */                           if (!cg3.m1652a(bArr, iM9416Z2, iM9416Z2 + i13)) {
/* 282 */                               throw uo3.m9059d();
                                    }
                                }
/* 290 */                       unsafe.putObject(obj, j, new String(bArr, iM9416Z2, i13, so3.f16726a));
/* 293 */                       iM9416Z2 += i13;
                            }
/* 294 */                   unsafe.putInt(obj, j2, i4);
/* 297 */                   return iM9416Z2;
                        case 60:
/* 213 */                   if (i5 != 2) {
/* 209 */                       return i;
                            }
/* 215 */                   Object objM8838H = m8838H(i4, obj, i8);
/* 228 */                   int iM9439l0 = w11.m9439l0(objM8838H, m8833C(i8), bArr, i, i2, ym3Var);
/* 232 */                   m8839f(obj, i4, i8, objM8838H);
/* 235 */                   return iM9439l0;
                        case 61:
/* 192 */                   if (i5 != 2) {
/* 188 */                       return i;
                            }
/* 194 */                   int iM9438k0 = w11.m9438k0(bArr, i, ym3Var);
/* 200 */                   unsafe.putObject(obj, j, ym3Var.f19709c);
/* 203 */                   unsafe.putInt(obj, j2, i4);
/* 206 */                   return iM9438k0;
                        case 63:
/* 141 */                   if (i5 != 0) {
/* 137 */                       return i;
                            }
/* 143 */                   int iM9416Z3 = w11.m9416Z(bArr, i, ym3Var);
/* 147 */                   int i14 = ym3Var.f19707a;
/* 149 */                   qm3 qm3VarM8835E = m8835E(i8);
/* 153 */                   if (qm3VarM8835E != null && !qm3VarM8835E.m7953a(i14)) {
/* 171 */                       m8828s(obj).m6792d(i3, Long.valueOf(i14));
/* 174 */                       return iM9416Z3;
                            }
/* 179 */                   unsafe.putObject(obj, j, Integer.valueOf(i14));
/* 182 */                   unsafe.putInt(obj, j2, i4);
/* 185 */                   return iM9416Z3;
                        case 66:
/* 111 */                   if (i5 != 0) {
/* 107 */                       return i;
                            }
/* 113 */                   int iM9416Z4 = w11.m9416Z(bArr, i, ym3Var);
/* 117 */                   int i15 = ym3Var.f19707a;
/* 128 */                   unsafe.putObject(obj, j, Integer.valueOf((i15 >>> 1) ^ (-(i15 & 1))));
/* 131 */                   unsafe.putInt(obj, j2, i4);
/* 134 */                   return iM9416Z4;
                        case 67:
/* 80 */                    if (i5 != 0) {
/* 76 */                        return i;
                            }
/* 82 */                    int iM9426e2 = w11.m9426e0(bArr, i, ym3Var);
/* 86 */                    long j3 = ym3Var.f19708b;
/* 98 */                    unsafe.putObject(obj, j, Long.valueOf((j3 >>> 1) ^ (-(1 & j3))));
/* 101 */                   unsafe.putInt(obj, j2, i4);
/* 104 */                   return iM9426e2;
                        case 68:
/* 39 */                    if (i5 == 3) {
/* 41 */                        Object objM8838H2 = m8838H(i4, obj, i8);
/* 63 */                        int iM8846t = ((tp3) m8833C(i8)).m8846t(objM8838H2, bArr, i, i2, (i3 & (-8)) | 4, ym3Var);
/* 68 */                        ym3Var.f19709c = objM8838H2;
/* 70 */                        m8839f(obj, i4, i8, objM8838H2);
/* 73 */                        return iM8846t;
                            }
                            break;
                    }
/* 34 */            return i;
                }

                /* JADX INFO: renamed from: C */
                public final bq3 m8833C(int i) {
/* 1 */             int i2 = i / 3;
/* 3 */             int i3 = i2 + i2;
/* 4 */             Object[] objArr = this.f17213b;
/* 8 */             bq3 bq3Var = (bq3) objArr[i3];
/* 10 */            if (bq3Var != null) {
/* 12 */                return bq3Var;
                    }
/* 21 */            bq3 bq3VarM10168a = yp3.f19747c.m10168a((Class) objArr[i3 + 1]);
/* 25 */            objArr[i3] = bq3VarM10168a;
/* 27 */            return bq3VarM10168a;
                }

                /* JADX INFO: renamed from: D */
                public final Object m8834D(int i) {
/* 1 */             int i2 = i / 3;
/* 6 */             return this.f17213b[i2 + i2];
                }

                /* JADX INFO: renamed from: E */
                public final qm3 m8835E(int i) {
/* 1 */             int i2 = i / 3;
/* 10 */            return (qm3) this.f17213b[i2 + i2 + 1];
                }

                /* JADX INFO: renamed from: F */
                public final Object m8836F(Object obj, int i) {
/* 1 */             bq3 bq3VarM8833C = m8833C(i);
/* 12 */            int iM8840g = m8840g(i) & 1048575;
/* 17 */            if (!m8842n(i, obj)) {
/* 19 */                return bq3VarM8833C.zza();
                    }
/* 27 */            Object object = f17211o.getObject(obj, iM8840g);
/* 35 */            if (m8823i(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZza = bq3VarM8833C.zza();
/* 42 */            if (object != null) {
/* 44 */                bq3VarM8833C.zzd(objZza, object);
                    }
/* 47 */            return objZza;
                }

                /* JADX INFO: renamed from: G */
                public final void m8837G(int i, Object obj, Object obj2) {
/* 12 */            f17211o.putObject(obj, m8840g(i) & 1048575, obj2);
/* 15 */            m8843o(i, obj);
                }

                /* JADX INFO: renamed from: H */
                public final Object m8838H(int i, Object obj, int i2) {
/* 1 */             bq3 bq3VarM8833C = m8833C(i2);
/* 9 */             if (!m8844p(i, obj, i2)) {
/* 11 */                return bq3VarM8833C.zza();
                    }
/* 27 */            Object object = f17211o.getObject(obj, m8840g(i2) & 1048575);
/* 35 */            if (m8823i(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZza = bq3VarM8833C.zza();
/* 42 */            if (object != null) {
/* 44 */                bq3VarM8833C.zzd(objZza, object);
                    }
/* 47 */            return objZza;
                }

                /* JADX WARN: Code duplicated, block: B:43:0x00db A[PHI: r3
  0x00db: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:84:0x01e8, B:42:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // p000.bq3
                /* JADX INFO: renamed from: a */
                public final int mo1406a(eo3 eo3Var) {
                    int i;
                    long jDoubleToLongBits;
                    int i2;
                    int iFloatToIntBits;
                    int i3;
/* 1 */             int[] iArr = this.f17212a;
/* 3 */             int length = iArr.length;
/* 5 */             int i4 = 0;
/* 6 */             for (int i5 = 0; i5 < length; i5 += 3) {
/* 8 */                 int iM8840g = m8840g(i5);
/* 12 */                int i6 = iArr[i5];
/* 17 */                long j = 1048575 & iM8840g;
/* 23 */                int i7 = 1237;
/* 27 */                int iHashCode = 37;
                        switch (m8822h(iM8840g)) {
                            case 0:
/* 553 */                       i = i4 * 53;
/* 561 */                       jDoubleToLongBits = Double.doubleToLongBits(tq3.f17232c.mo8000x(eo3Var, j));
/* 565 */                       Charset charset = so3.f16726a;
/* 74 */                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 1:
/* 539 */                       i2 = i4 * 53;
/* 547 */                       iFloatToIntBits = Float.floatToIntBits(tq3.f17232c.mo7998u(eo3Var, j));
/* 52 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case 2:
/* 529 */                       i = i4 * 53;
/* 531 */                       jDoubleToLongBits = tq3.m8870h(eo3Var, j);
/* 535 */                       Charset charset2 = so3.f16726a;
/* 74 */                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 3:
/* 519 */                       i = i4 * 53;
/* 521 */                       jDoubleToLongBits = tq3.m8870h(eo3Var, j);
/* 525 */                       Charset charset3 = so3.f16726a;
/* 74 */                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 4:
/* 511 */                       i2 = i4 * 53;
/* 513 */                       iFloatToIntBits = tq3.m8868f(eo3Var, j);
/* 52 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case 5:
/* 501 */                       i = i4 * 53;
/* 503 */                       jDoubleToLongBits = tq3.m8870h(eo3Var, j);
/* 507 */                       Charset charset4 = so3.f16726a;
/* 74 */                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 6:
/* 493 */                       i2 = i4 * 53;
/* 495 */                       iFloatToIntBits = tq3.m8868f(eo3Var, j);
/* 52 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case 7:
/* 479 */                       i3 = i4 * 53;
/* 483 */                       boolean zMo7996q = tq3.f17232c.mo7996q(eo3Var, j);
/* 487 */                       Charset charset5 = so3.f16726a;
/* 489 */                       if (zMo7996q) {
/* 220 */                           i7 = 1231;
                                }
/* 221 */                       i4 = i7 + i3;
                                break;
                            case 8:
/* 465 */                       i2 = i4 * 53;
/* 473 */                       iFloatToIntBits = ((String) tq3.m8872j(eo3Var, j)).hashCode();
/* 52 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case 9:
/* 454 */                       Object objM8872j = tq3.m8872j(eo3Var, j);
/* 458 */                       if (objM8872j != null) {
/* 460 */                           iHashCode = objM8872j.hashCode();
                                }
/* 387 */                       i4 = (i4 * 53) + iHashCode;
                                break;
                            case 10:
/* 442 */                       i2 = i4 * 53;
/* 448 */                       iFloatToIntBits = tq3.m8872j(eo3Var, j).hashCode();
/* 52 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case 11:
/* 434 */                       i2 = i4 * 53;
/* 436 */                       iFloatToIntBits = tq3.m8868f(eo3Var, j);
/* 52 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case 12:
/* 426 */                       i2 = i4 * 53;
/* 428 */                       iFloatToIntBits = tq3.m8868f(eo3Var, j);
/* 52 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 418 */                       i2 = i4 * 53;
/* 420 */                       iFloatToIntBits = tq3.m8868f(eo3Var, j);
/* 52 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case 14:
/* 408 */                       i = i4 * 53;
/* 410 */                       jDoubleToLongBits = tq3.m8870h(eo3Var, j);
/* 414 */                       Charset charset6 = so3.f16726a;
/* 74 */                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 400 */                       i2 = i4 * 53;
/* 402 */                       iFloatToIntBits = tq3.m8868f(eo3Var, j);
/* 52 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case 16:
/* 390 */                       i = i4 * 53;
/* 392 */                       jDoubleToLongBits = tq3.m8870h(eo3Var, j);
/* 396 */                       Charset charset7 = so3.f16726a;
/* 74 */                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                break;
                            case 17:
/* 375 */                       Object objM8872j2 = tq3.m8872j(eo3Var, j);
/* 379 */                       if (objM8872j2 != null) {
/* 381 */                           iHashCode = objM8872j2.hashCode();
                                }
/* 387 */                       i4 = (i4 * 53) + iHashCode;
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case Build.API_LEVELS.API_21 /* 21 */:
                            case Build.API_LEVELS.API_22 /* 22 */:
                            case Build.API_LEVELS.API_23 /* 23 */:
                            case 24:
                            case Build.API_LEVELS.API_25 /* 25 */:
                            case Build.API_LEVELS.API_26 /* 26 */:
                            case Build.API_LEVELS.API_27 /* 27 */:
                            case Build.API_LEVELS.API_28 /* 28 */:
                            case Build.API_LEVELS.API_29 /* 29 */:
                            case Build.API_LEVELS.API_30 /* 30 */:
                            case Build.API_LEVELS.API_31 /* 31 */:
                            case 32:
                            case Build.API_LEVELS.API_33 /* 33 */:
                            case Build.API_LEVELS.API_34 /* 34 */:
                            case Build.API_LEVELS.API_35 /* 35 */:
                            case Build.API_LEVELS.API_36 /* 36 */:
                            case 37:
                            case 38:
                            case 39:
                            case RequestError.NETWORK_FAILURE /* 40 */:
                            case RequestError.NO_DEV_KEY /* 41 */:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
/* 363 */                       i2 = i4 * 53;
/* 369 */                       iFloatToIntBits = tq3.m8872j(eo3Var, j).hashCode();
/* 52 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 351 */                       i2 = i4 * 53;
/* 357 */                       iFloatToIntBits = tq3.m8872j(eo3Var, j).hashCode();
/* 52 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case 51:
/* 329 */                       if (m8844p(i6, eo3Var, i5)) {
/* 331 */                           i = i4 * 53;
/* 343 */                           jDoubleToLongBits = Double.doubleToLongBits(((Double) tq3.m8872j(eo3Var, j)).doubleValue());
/* 347 */                           Charset charset8 = so3.f16726a;
/* 74 */                            i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                }
                                break;
                            case 52:
/* 305 */                       if (m8844p(i6, eo3Var, i5)) {
/* 307 */                           i2 = i4 * 53;
/* 319 */                           iFloatToIntBits = Float.floatToIntBits(((Float) tq3.m8872j(eo3Var, j)).floatValue());
/* 52 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                            case 53:
/* 289 */                       if (m8844p(i6, eo3Var, i5)) {
/* 291 */                           i = i4 * 53;
/* 293 */                           jDoubleToLongBits = m8826l(eo3Var, j);
/* 297 */                           Charset charset9 = so3.f16726a;
/* 74 */                            i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                }
                                break;
                            case 54:
/* 273 */                       if (m8844p(i6, eo3Var, i5)) {
/* 275 */                           i = i4 * 53;
/* 277 */                           jDoubleToLongBits = m8826l(eo3Var, j);
/* 281 */                           Charset charset10 = so3.f16726a;
/* 74 */                            i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                }
                                break;
                            case 55:
/* 259 */                       if (m8844p(i6, eo3Var, i5)) {
/* 261 */                           i2 = i4 * 53;
/* 263 */                           iFloatToIntBits = m8825k(eo3Var, j);
/* 52 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                            case 56:
/* 243 */                       if (m8844p(i6, eo3Var, i5)) {
/* 245 */                           i = i4 * 53;
/* 247 */                           jDoubleToLongBits = m8826l(eo3Var, j);
/* 251 */                           Charset charset11 = so3.f16726a;
/* 74 */                            i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                }
                                break;
                            case 57:
/* 229 */                       if (m8844p(i6, eo3Var, i5)) {
/* 231 */                           i2 = i4 * 53;
/* 233 */                           iFloatToIntBits = m8825k(eo3Var, j);
/* 52 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                            case 58:
/* 202 */                       if (m8844p(i6, eo3Var, i5)) {
/* 204 */                           i3 = i4 * 53;
/* 212 */                           boolean zBooleanValue = ((Boolean) tq3.m8872j(eo3Var, j)).booleanValue();
/* 216 */                           Charset charset12 = so3.f16726a;
/* 218 */                           if (zBooleanValue) {
/* 220 */                               i7 = 1231;
                                    }
/* 221 */                           i4 = i7 + i3;
                                }
                                break;
                            case 59:
/* 182 */                       if (m8844p(i6, eo3Var, i5)) {
/* 184 */                           i2 = i4 * 53;
/* 192 */                           iFloatToIntBits = ((String) tq3.m8872j(eo3Var, j)).hashCode();
/* 52 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                            case 60:
/* 165 */                       if (m8844p(i6, eo3Var, i5)) {
/* 171 */                           i2 = i4 * 53;
/* 173 */                           iFloatToIntBits = tq3.m8872j(eo3Var, j).hashCode();
/* 52 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                            case 61:
/* 148 */                       if (m8844p(i6, eo3Var, i5)) {
/* 150 */                           i2 = i4 * 53;
/* 156 */                           iFloatToIntBits = tq3.m8872j(eo3Var, j).hashCode();
/* 52 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                            case 62:
/* 135 */                       if (m8844p(i6, eo3Var, i5)) {
/* 137 */                           i2 = i4 * 53;
/* 139 */                           iFloatToIntBits = m8825k(eo3Var, j);
/* 52 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                            case 63:
/* 122 */                       if (m8844p(i6, eo3Var, i5)) {
/* 124 */                           i2 = i4 * 53;
/* 126 */                           iFloatToIntBits = m8825k(eo3Var, j);
/* 52 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                            case 64:
/* 109 */                       if (m8844p(i6, eo3Var, i5)) {
/* 111 */                           i2 = i4 * 53;
/* 113 */                           iFloatToIntBits = m8825k(eo3Var, j);
/* 52 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                            case 65:
/* 94 */                        if (m8844p(i6, eo3Var, i5)) {
/* 96 */                            i = i4 * 53;
/* 98 */                            jDoubleToLongBits = m8826l(eo3Var, j);
/* 102 */                           Charset charset13 = so3.f16726a;
/* 74 */                            i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                }
                                break;
                            case 66:
/* 81 */                        if (m8844p(i6, eo3Var, i5)) {
/* 83 */                            i2 = i4 * 53;
/* 85 */                            iFloatToIntBits = m8825k(eo3Var, j);
/* 52 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                            case 67:
/* 60 */                        if (m8844p(i6, eo3Var, i5)) {
/* 62 */                            i = i4 * 53;
/* 64 */                            jDoubleToLongBits = m8826l(eo3Var, j);
/* 68 */                            Charset charset14 = so3.f16726a;
/* 74 */                            i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                                }
                                break;
                            case 68:
/* 40 */                        if (m8844p(i6, eo3Var, i5)) {
/* 46 */                            i2 = i4 * 53;
/* 48 */                            iFloatToIntBits = tq3.m8872j(eo3Var, j).hashCode();
/* 52 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                        }
                    }
/* 577 */           this.f17223l.getClass();
/* 586 */           int iHashCode2 = eo3Var.zzc.hashCode() + (i4 * 53);
/* 589 */           if (!this.f17217f) {
/* 610 */               return iHashCode2;
                    }
/* 595 */           this.f17224m.getClass();
/* 608 */           return ((bo3) eo3Var).zza.f17607a.hashCode() + (iHashCode2 * 53);
                }

                /* JADX WARN: Code duplicated, block: B:15:0x0040  */
                /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0099. Please report as an issue. */
                @Override // p000.bq3
                /* JADX INFO: renamed from: b */
                public final void mo1407b(Object obj, byte[] bArr, int i, int i2, ym3 ym3Var) throws uo3 {
                    int iM8845q;
                    Unsafe unsafe;
                    int i3;
                    int i4;
                    int i5;
                    Object obj2;
                    int i6;
                    int i7;
                    Unsafe unsafe2;
                    Object obj3;
                    int i8;
                    int i9;
                    int i10;
                    int iM8832B;
                    Object obj4;
                    Unsafe unsafe3;
                    ym3 ym3Var2;
                    byte[] bArr2;
                    int iM9426e0;
                    Object obj5;
/* 1 */             tp3 tp3Var = this;
/* 3 */             Object obj6 = obj;
/* 5 */             byte[] bArr3 = bArr;
/* 7 */             i2 = i2;
/* 9 */             ym3Var = ym3Var;
/* 13 */            if (!tp3Var.f17218g) {
/* 898 */               m8846t(obj6, bArr, i, i2, 0, ym3Var);
/* 901 */               return;
                    }
/* 15 */            m8824j(obj6);
/* 18 */            Unsafe unsafe4 = f17211o;
/* 20 */            int i11 = 0;
/* 21 */            int i12 = i;
/* 23 */            int i13 = 0;
/* 24 */            int i14 = 0;
/* 25 */            int i15 = -1;
/* 26 */            int i16 = 1048575;
/* 29 */            while (i12 < i2) {
/* 31 */                int iM9424d0 = i12 + 1;
/* 33 */                int i17 = bArr3[i12];
/* 35 */                if (i17 < 0) {
/* 37 */                    iM9424d0 = w11.m9424d0(i17, bArr3, iM9424d0, ym3Var);
/* 41 */                    i17 = ym3Var.f19707a;
                        }
/* 43 */                i15 = i17 >>> 3;
/* 48 */                int i18 = tp3Var.f17215d;
/* 50 */                int i19 = tp3Var.f17214c;
/* 52 */                if (i15 > i15) {
/* 54 */                    int i20 = i13 / 3;
/* 56 */                    if (i15 < i19 || i15 > i18) {
/* 65 */                        iM8845q = -1;
                            } else {
/* 60 */                        iM8845q = tp3Var.m8845q(i15, i20);
                            }
                        } else if (i15 < i19 || i15 > i18) {
/* 65 */                    iM8845q = -1;
                        } else {
/* 73 */                    iM8845q = tp3Var.m8845q(i15, i11);
                        }
/* 66 */                i13 = iM8845q;
/* 78 */                if (i13 == -1) {
/* 80 */                    unsafe = unsafe4;
/* 82 */                    i3 = i17;
/* 84 */                    i4 = i11;
/* 85 */                    i5 = i4;
/* 87 */                    obj2 = obj6;
/* 88 */                    i6 = iM9424d0;
/* 89 */                    i7 = i15;
                        } else {
/* 92 */                    int i21 = i17 & 7;
/* 96 */                    int[] iArr = tp3Var.f17212a;
/* 98 */                    int i22 = iArr[i13 + 1];
/* 100 */                   int iM8822h = m8822h(i22);
/* 104 */                   i3 = i17;
/* 106 */                   long j = i22 & 1048575;
/* 115 */                   if (iM8822h <= 17) {
/* 119 */                       int i23 = iArr[i13 + 2];
/* 124 */                       int i24 = 1 << (i23 >>> 20);
/* 126 */                       int i25 = i23 & 1048575;
/* 130 */                       int i26 = 1048575;
/* 134 */                       if (i25 != i16) {
/* 136 */                           if (i16 != 1048575) {
/* 139 */                               unsafe4.putInt(obj6, i16, i14);
/* 142 */                               i26 = 1048575;
                                    }
/* 145 */                           if (i25 != i26) {
/* 148 */                               i14 = unsafe4.getInt(obj6, i25);
                                    }
/* 152 */                           i16 = i25;
                                }
                                switch (iM8822h) {
                                    case 0:
/* 557 */                               ym3 ym3Var3 = ym3Var;
/* 558 */                               byte[] bArr4 = bArr3;
/* 560 */                               unsafe2 = unsafe4;
/* 561 */                               iM9424d0 = iM9424d0;
/* 567 */                               if (i21 != 1) {
/* 486 */                                   obj5 = obj6;
/* 597 */                                   i6 = iM9424d0;
/* 598 */                                   unsafe = unsafe2;
/* 600 */                                   i4 = i13;
/* 601 */                                   i7 = i15;
/* 602 */                                   i5 = 0;
/* 604 */                                   obj2 = obj5;
                                        } else {
/* 582 */                                   tq3.f17232c.mo8001z(obj6, j, Double.longBitsToDouble(w11.m9432h0(bArr4, iM9424d0)));
/* 586 */                                   i12 = iM9424d0 + 8;
/* 588 */                                   i14 |= i24;
/* 591 */                                   ym3Var = ym3Var3;
/* 592 */                                   bArr3 = bArr4;
/* 595 */                                   obj6 = obj6;
/* 554 */                                   unsafe4 = unsafe2;
                                        }
                                        break;
                                    case 1:
/* 522 */                               ym3 ym3Var4 = ym3Var;
/* 523 */                               byte[] bArr5 = bArr3;
/* 525 */                               unsafe2 = unsafe4;
/* 526 */                               iM9424d0 = iM9424d0;
/* 530 */                               if (i21 != 5) {
/* 486 */                                   obj5 = obj6;
/* 597 */                                   i6 = iM9424d0;
/* 598 */                                   unsafe = unsafe2;
/* 600 */                                   i4 = i13;
/* 601 */                                   i7 = i15;
/* 602 */                                   i5 = 0;
/* 604 */                                   obj2 = obj5;
                                        } else {
/* 542 */                                   tq3.f17232c.mo7999w(obj6, j, Float.intBitsToFloat(w11.m9430g0(bArr5, iM9424d0)));
/* 545 */                                   i12 = iM9424d0 + 4;
/* 547 */                                   i14 |= i24;
/* 550 */                                   ym3Var = ym3Var4;
/* 551 */                                   bArr3 = bArr5;
/* 554 */                                   unsafe4 = unsafe2;
                                        }
                                        break;
                                    case 2:
                                    case 3:
/* 489 */                               ym3 ym3Var5 = ym3Var;
/* 490 */                               byte[] bArr6 = bArr3;
/* 492 */                               iM9424d0 = iM9424d0;
/* 496 */                               if (i21 != 0) {
/* 485 */                                   unsafe2 = unsafe4;
/* 486 */                                   obj5 = obj6;
/* 597 */                                   i6 = iM9424d0;
/* 598 */                                   unsafe = unsafe2;
/* 600 */                                   i4 = i13;
/* 601 */                                   i7 = i15;
/* 602 */                                   i5 = 0;
/* 604 */                                   obj2 = obj5;
                                        } else {
/* 498 */                                   int iM9426e1 = w11.m9426e0(bArr6, iM9424d0, ym3Var5);
/* 504 */                                   unsafe4.putLong(obj6, j, ym3Var5.f19708b);
/* 508 */                                   i14 |= i24;
/* 511 */                                   ym3Var = ym3Var5;
/* 512 */                                   bArr3 = bArr6;
/* 513 */                                   i12 = iM9426e1;
/* 514 */                                   unsafe4 = unsafe4;
/* 515 */                                   i13 = i13;
/* 516 */                                   i15 = i15;
/* 517 */                                   i11 = 0;
/* 518 */                                   i2 = i2;
                                        }
                                        break;
                                    case 4:
                                    case 11:
/* 457 */                               ym3 ym3Var6 = ym3Var;
/* 458 */                               byte[] bArr7 = bArr3;
/* 460 */                               iM9424d0 = iM9424d0;
/* 464 */                               if (i21 != 0) {
/* 485 */                                   unsafe2 = unsafe4;
/* 486 */                                   obj5 = obj6;
/* 597 */                                   i6 = iM9424d0;
/* 598 */                                   unsafe = unsafe2;
/* 600 */                                   i4 = i13;
/* 601 */                                   i7 = i15;
/* 602 */                                   i5 = 0;
/* 604 */                                   obj2 = obj5;
                                        } else {
/* 466 */                                   int iM9416Z = w11.m9416Z(bArr7, iM9424d0, ym3Var6);
/* 472 */                                   unsafe4.putInt(obj6, j, ym3Var6.f19707a);
/* 475 */                                   i14 |= i24;
/* 478 */                                   ym3Var = ym3Var6;
/* 479 */                                   bArr3 = bArr7;
/* 480 */                                   i2 = i2;
/* 482 */                                   i12 = iM9416Z;
                                        }
                                        break;
                                    case 5:
                                    case 14:
/* 411 */                               byte[] bArr8 = bArr3;
/* 412 */                               Unsafe unsafe5 = unsafe4;
/* 413 */                               ym3 ym3Var7 = ym3Var;
/* 415 */                               obj4 = obj6;
/* 420 */                               if (i21 != 1) {
/* 454 */                                   unsafe2 = unsafe5;
/* 230 */                                   obj5 = obj4;
/* 597 */                                   i6 = iM9424d0;
/* 598 */                                   unsafe = unsafe2;
/* 600 */                                   i4 = i13;
/* 601 */                                   i7 = i15;
/* 602 */                                   i5 = 0;
/* 604 */                                   obj2 = obj5;
                                        } else {
/* 422 */                                   int i27 = iM9424d0;
/* 429 */                                   unsafe4 = unsafe5;
/* 435 */                                   obj6 = obj4;
/* 436 */                                   unsafe4.putLong(obj6, j, w11.m9432h0(bArr8, i27));
/* 439 */                                   i12 = i27 + 8;
/* 441 */                                   i14 |= i24;
/* 444 */                                   ym3Var = ym3Var7;
/* 445 */                                   bArr3 = bArr8;
/* 446 */                                   i2 = i2;
                                        }
                                        break;
                                    case 6:
                                    case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 383 */                               byte[] bArr9 = bArr3;
/* 384 */                               unsafe3 = unsafe4;
/* 385 */                               ym3Var2 = ym3Var;
/* 387 */                               obj4 = obj6;
/* 390 */                               if (i21 != 5) {
/* 312 */                                   unsafe2 = unsafe3;
/* 230 */                                   obj5 = obj4;
/* 597 */                                   i6 = iM9424d0;
/* 598 */                                   unsafe = unsafe2;
/* 600 */                                   i4 = i13;
/* 601 */                                   i7 = i15;
/* 602 */                                   i5 = 0;
/* 604 */                                   obj2 = obj5;
                                        } else {
/* 396 */                                   unsafe3.putInt(obj4, j, w11.m9430g0(bArr9, iM9424d0));
/* 399 */                                   i12 = iM9424d0 + 4;
/* 401 */                                   i14 |= i24;
/* 404 */                                   ym3Var = ym3Var2;
/* 405 */                                   unsafe4 = unsafe3;
/* 406 */                                   bArr3 = bArr9;
/* 223 */                                   obj6 = obj4;
                                        }
                                        break;
                                    case 7:
/* 352 */                               byte[] bArr10 = bArr3;
/* 353 */                               unsafe3 = unsafe4;
/* 354 */                               ym3Var2 = ym3Var;
/* 355 */                               bArr2 = bArr10;
/* 356 */                               obj4 = obj6;
/* 359 */                               if (i21 != 0) {
/* 312 */                                   unsafe2 = unsafe3;
/* 230 */                                   obj5 = obj4;
/* 597 */                                   i6 = iM9424d0;
/* 598 */                                   unsafe = unsafe2;
/* 600 */                                   i4 = i13;
/* 601 */                                   i7 = i15;
/* 602 */                                   i5 = 0;
/* 604 */                                   obj2 = obj5;
                                        } else {
/* 361 */                                   iM9426e0 = w11.m9426e0(bArr2, iM9424d0, ym3Var2);
/* 379 */                                   tq3.f17232c.mo7997s(obj4, j, ym3Var2.f19708b != 0);
/* 344 */                                   i14 |= i24;
/* 346 */                                   byte[] bArr11 = bArr2;
/* 347 */                                   ym3Var = ym3Var2;
/* 348 */                                   unsafe4 = unsafe3;
/* 349 */                                   bArr3 = bArr11;
/* 220 */                                   i12 = iM9426e0;
/* 223 */                                   obj6 = obj4;
                                        }
                                        break;
                                    case 8:
/* 315 */                               byte[] bArr12 = bArr3;
/* 316 */                               unsafe3 = unsafe4;
/* 317 */                               ym3Var2 = ym3Var;
/* 318 */                               bArr2 = bArr12;
/* 319 */                               obj4 = obj6;
/* 323 */                               if (i21 != 2) {
/* 312 */                                   unsafe2 = unsafe3;
/* 230 */                                   obj5 = obj4;
/* 597 */                                   i6 = iM9424d0;
/* 598 */                                   unsafe = unsafe2;
/* 600 */                                   i4 = i13;
/* 601 */                                   i7 = i15;
/* 602 */                                   i5 = 0;
/* 604 */                                   obj2 = obj5;
                                        } else {
/* 335 */                                   iM9426e0 = (536870912 & i22) == 0 ? w11.m9434i0(bArr2, iM9424d0, ym3Var2) : w11.m9436j0(bArr2, iM9424d0, ym3Var2);
/* 341 */                                   unsafe3.putObject(obj4, j, ym3Var2.f19709c);
/* 344 */                                   i14 |= i24;
/* 346 */                                   byte[] bArr13 = bArr2;
/* 347 */                                   ym3Var = ym3Var2;
/* 348 */                                   unsafe4 = unsafe3;
/* 349 */                                   bArr3 = bArr13;
/* 220 */                                   i12 = iM9426e0;
/* 223 */                                   obj6 = obj4;
                                        }
                                        break;
                                    case 9:
/* 264 */                               obj4 = obj6;
/* 266 */                               if (i21 != 2) {
/* 307 */                                   unsafe3 = unsafe4;
/* 308 */                                   ym3Var2 = ym3Var;
/* 312 */                                   unsafe2 = unsafe3;
/* 230 */                                   obj5 = obj4;
/* 597 */                                   i6 = iM9424d0;
/* 598 */                                   unsafe = unsafe2;
/* 600 */                                   i4 = i13;
/* 601 */                                   i7 = i15;
/* 602 */                                   i5 = 0;
/* 604 */                                   obj2 = obj5;
                                        } else {
/* 268 */                                   Unsafe unsafe6 = unsafe4;
/* 269 */                                   Object objM8836F = tp3Var.m8836F(obj4, i13);
/* 278 */                                   byte[] bArr14 = bArr3;
/* 283 */                                   int i28 = iM9424d0;
/* 284 */                                   ym3 ym3Var8 = ym3Var;
/* 285 */                                   int iM9439l0 = w11.m9439l0(objM8836F, tp3Var.m8833C(i13), bArr14, i28, i2, ym3Var8);
/* 292 */                                   tp3Var.m8837G(i13, obj4, objM8836F);
/* 295 */                                   i14 |= i24;
/* 298 */                                   ym3Var = ym3Var8;
/* 299 */                                   unsafe4 = unsafe6;
/* 300 */                                   bArr3 = bArr14;
/* 303 */                                   i12 = iM9439l0;
/* 223 */                                   obj6 = obj4;
                                        }
                                        break;
                                    case 10:
/* 248 */                               obj4 = obj6;
/* 252 */                               if (i21 != 2) {
/* 228 */                                   unsafe2 = unsafe4;
/* 230 */                                   obj5 = obj4;
/* 597 */                                   i6 = iM9424d0;
/* 598 */                                   unsafe = unsafe2;
/* 600 */                                   i4 = i13;
/* 601 */                                   i7 = i15;
/* 602 */                                   i5 = 0;
/* 604 */                                   obj2 = obj5;
                                        } else {
/* 254 */                                   iM9426e0 = w11.m9438k0(bArr3, iM9424d0, ym3Var);
/* 260 */                                   unsafe4.putObject(obj4, j, ym3Var.f19709c);
/* 216 */                                   i14 |= i24;
/* 220 */                                   i12 = iM9426e0;
/* 223 */                                   obj6 = obj4;
                                        }
                                        break;
                                    case 12:
/* 233 */                               obj4 = obj6;
/* 236 */                               if (i21 != 0) {
/* 228 */                                   unsafe2 = unsafe4;
/* 230 */                                   obj5 = obj4;
/* 597 */                                   i6 = iM9424d0;
/* 598 */                                   unsafe = unsafe2;
/* 600 */                                   i4 = i13;
/* 601 */                                   i7 = i15;
/* 602 */                                   i5 = 0;
/* 604 */                                   obj2 = obj5;
                                        } else {
/* 238 */                                   iM9426e0 = w11.m9416Z(bArr3, iM9424d0, ym3Var);
/* 244 */                                   unsafe4.putInt(obj4, j, ym3Var.f19707a);
/* 216 */                                   i14 |= i24;
/* 220 */                                   i12 = iM9426e0;
/* 223 */                                   obj6 = obj4;
                                        }
                                        break;
                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 196 */                               obj4 = obj6;
/* 199 */                               if (i21 != 0) {
/* 228 */                                   unsafe2 = unsafe4;
/* 230 */                                   obj5 = obj4;
/* 597 */                                   i6 = iM9424d0;
/* 598 */                                   unsafe = unsafe2;
/* 600 */                                   i4 = i13;
/* 601 */                                   i7 = i15;
/* 602 */                                   i5 = 0;
/* 604 */                                   obj2 = obj5;
                                        } else {
/* 201 */                                   iM9426e0 = w11.m9416Z(bArr3, iM9424d0, ym3Var);
/* 205 */                                   int i29 = ym3Var.f19707a;
/* 213 */                                   unsafe4.putInt(obj4, j, (i29 >>> 1) ^ (-(i29 & 1)));
/* 216 */                                   i14 |= i24;
/* 220 */                                   i12 = iM9426e0;
/* 223 */                                   obj6 = obj4;
                                        }
                                        break;
                                    case 16:
/* 165 */                               if (i21 != 0) {
/* 160 */                                   unsafe2 = unsafe4;
/* 161 */                                   obj5 = obj6;
/* 162 */                                   iM9424d0 = iM9424d0;
/* 597 */                                   i6 = iM9424d0;
/* 598 */                                   unsafe = unsafe2;
/* 600 */                                   i4 = i13;
/* 601 */                                   i7 = i15;
/* 602 */                                   i5 = 0;
/* 604 */                                   obj2 = obj5;
                                        } else {
/* 167 */                                   int iM9426e2 = w11.m9426e0(bArr3, iM9424d0, ym3Var);
/* 171 */                                   long j2 = ym3Var.f19708b;
/* 182 */                                   unsafe4.putLong(obj6, j, (-(1 & j2)) ^ (j2 >>> 1));
/* 186 */                                   i14 |= i24;
/* 188 */                                   i2 = i2;
/* 190 */                                   i12 = iM9426e2;
                                        }
                                        break;
                                    default:
/* 160 */                               unsafe2 = unsafe4;
/* 161 */                               obj5 = obj6;
/* 162 */                               iM9424d0 = iM9424d0;
/* 597 */                               i6 = iM9424d0;
/* 598 */                               unsafe = unsafe2;
/* 600 */                               i4 = i13;
/* 601 */                               i7 = i15;
/* 602 */                               i5 = 0;
/* 604 */                               obj2 = obj5;
                                        break;
                                }
                            } else {
/* 607 */                       ym3 ym3Var9 = ym3Var;
/* 608 */                       byte[] bArr15 = bArr3;
/* 610 */                       unsafe2 = unsafe4;
/* 611 */                       Object obj7 = obj6;
/* 612 */                       int i30 = iM9424d0;
/* 618 */                       if (iM8822h == 27) {
/* 621 */                           if (i21 == 2) {
/* 627 */                               ro3 ro3VarMo8221I = (ro3) unsafe2.getObject(obj7, j);
/* 634 */                               if (!((vm3) ro3VarMo8221I).f18251a) {
/* 636 */                                   int size = ro3VarMo8221I.size();
/* 646 */                                   ro3VarMo8221I = ro3VarMo8221I.mo8221I(size == 0 ? 10 : size + size);
/* 650 */                                   unsafe2.putObject(obj7, j, ro3VarMo8221I);
                                        }
/* 664 */                               int iM9441m0 = w11.m9441m0(tp3Var.m8833C(i13), i3 == true ? 1 : 0, bArr15, i30, i2, ro3VarMo8221I, ym3Var9);
/* 668 */                               obj6 = obj;
/* 670 */                               bArr3 = bArr;
/* 674 */                               ym3Var = ym3Var;
/* 676 */                               i12 = iM9441m0;
/* 554 */                               unsafe4 = unsafe2;
                                    } else {
/* 678 */                               obj3 = obj;
/* 680 */                               i8 = i30;
/* 681 */                               unsafe = unsafe2;
/* 683 */                               i4 = i13;
/* 684 */                               i9 = i16;
/* 685 */                               i10 = i14;
/* 687 */                               i7 = i15;
/* 688 */                               i5 = 0;
                                    }
                                } else if (iM8822h <= 49) {
/* 702 */                           i4 = i13;
/* 705 */                           i9 = i16;
/* 709 */                           unsafe = unsafe2;
/* 713 */                           i10 = i14;
/* 715 */                           i7 = i15;
/* 718 */                           i5 = 0;
/* 726 */                           iM8832B = tp3Var.m8850z(obj, bArr, i30, i2, i3 == true ? 1 : 0, i7, i21, i4, i22, iM8822h, j, ym3Var);
/* 730 */                           obj6 = obj;
                                    int i31 = i3 == true ? 1 : 0;
/* 733 */                           if (iM8832B != i30) {
/* 731 */                               i3 = i31;
/* 737 */                               i15 = i7;
/* 738 */                               i12 = iM8832B;
/* 739 */                               i13 = i4;
/* 740 */                               i16 = i9;
/* 741 */                               i11 = i5;
/* 743 */                               i14 = i10;
/* 745 */                               unsafe4 = unsafe;
/* 747 */                               bArr3 = bArr;
/* 518 */                               i2 = i2;
                                    } else {
/* 731 */                               i3 = i31;
/* 751 */                               obj2 = obj6;
/* 752 */                               i6 = iM8832B;
/* 753 */                               i16 = i9;
/* 754 */                               i14 = i10;
                                    }
                                } else {
/* 759 */                           i9 = i16;
                                    int i32 = i3 == true ? 1 : 0;
/* 764 */                           unsafe = unsafe2;
/* 766 */                           i10 = i14;
/* 768 */                           i7 = i15;
/* 769 */                           i5 = 0;
/* 771 */                           obj3 = obj;
/* 774 */                           i8 = i30;
/* 775 */                           i4 = i13;
/* 778 */                           if (iM8822h == 50) {
/* 761 */                               i3 = i32;
/* 781 */                               if (i21 == 2) {
/* 786 */                                   tp3Var.m8831A(obj3, i4, j);
/* 790 */                                   throw null;
                                        }
                                    } else {
/* 804 */                               iM8832B = tp3Var.m8832B(obj3, bArr, i8, i2, i3 == true ? 1 : 0, i7, i21, i22, iM8822h, j, i4, ym3Var);
/* 808 */                               obj2 = obj3;
/* 811 */                               if (iM8832B != i8) {
/* 761 */                                   i3 = i32;
/* 810 */                                   i4 = i4;
/* 813 */                                   tp3Var = this;
/* 817 */                                   i15 = i7;
/* 818 */                                   i12 = iM8832B;
/* 819 */                                   i13 = i4;
/* 820 */                                   obj6 = obj2;
/* 740 */                                   i16 = i9;
/* 741 */                                   i11 = i5;
/* 743 */                                   i14 = i10;
/* 745 */                                   unsafe4 = unsafe;
/* 747 */                                   bArr3 = bArr;
/* 518 */                                   i2 = i2;
                                        } else {
/* 761 */                                   i3 = i32;
/* 810 */                                   i4 = i4;
/* 822 */                                   i3 = i3 == true ? 1 : 0;
/* 752 */                                   i6 = iM8832B;
/* 753 */                                   i16 = i9;
/* 754 */                                   i14 = i10;
                                        }
                                    }
                                }
/* 783 */                       obj2 = obj3;
/* 784 */                       i6 = i8;
/* 753 */                       i16 = i9;
/* 754 */                       i14 = i10;
                            }
/* 193 */                   i11 = 0;
                        }
/* 837 */               int iM9443n0 = w11.m9443n0(i3 == true ? 1 : 0, bArr, i6, i2, m8828s(obj2), ym3Var);
/* 841 */               bArr3 = bArr;
/* 843 */               ym3Var = ym3Var;
/* 845 */               i15 = i7;
/* 846 */               i13 = i4;
/* 847 */               obj6 = obj2;
/* 848 */               i11 = i5;
/* 850 */               unsafe4 = unsafe;
/* 852 */               i2 = i2;
/* 853 */               i12 = iM9443n0;
/* 854 */               tp3Var = this;
                    }
/* 858 */           Unsafe unsafe7 = unsafe4;
/* 860 */           Object obj8 = obj6;
/* 861 */           int i33 = i2;
/* 862 */           int i34 = i16;
/* 863 */           int i35 = i14;
/* 868 */           if (i34 != 1048575) {
/* 875 */               unsafe7.putInt(obj8, i34, i35);
                    }
/* 878 */           if (i12 != i33) {
/* 885 */               throw uo3.m9058c();
                    }
                }

                @Override // p000.bq3
                /* JADX INFO: renamed from: c */
                public final boolean mo1408c(eo3 eo3Var, eo3 eo3Var2) {
                    boolean zM2855l;
/* 1 */             int[] iArr = this.f17212a;
/* 3 */             int length = iArr.length;
/* 6 */             for (int i = 0; i < length; i += 3) {
/* 8 */                 int iM8840g = m8840g(i);
/* 15 */                long j = iM8840g & 1048575;
                        switch (m8822h(iM8840g)) {
                            case 0:
/* 432 */                       if (m8841m(eo3Var, eo3Var2, i)) {
/* 434 */                           sq3 sq3Var = tq3.f17232c;
/* 454 */                           if (Double.doubleToLongBits(sq3Var.mo8000x(eo3Var, j)) == Double.doubleToLongBits(sq3Var.mo8000x(eo3Var2, j))) {
                                        continue;
                                        break;
                                    }
                                }
/* 4 */                         return false;
                            case 1:
/* 405 */                       if (m8841m(eo3Var, eo3Var2, i)) {
/* 407 */                           sq3 sq3Var2 = tq3.f17232c;
/* 425 */                           if (Float.floatToIntBits(sq3Var2.mo7998u(eo3Var, j)) == Float.floatToIntBits(sq3Var2.mo7998u(eo3Var2, j))) {
                                        continue;
                                        break;
                                    }
                                }
/* 4 */                         return false;
                            case 2:
/* 386 */                       if (!m8841m(eo3Var, eo3Var2, i) || tq3.m8870h(eo3Var, j) != tq3.m8870h(eo3Var2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 3:
/* 367 */                       if (!m8841m(eo3Var, eo3Var2, i) || tq3.m8870h(eo3Var, j) != tq3.m8870h(eo3Var2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 4:
/* 350 */                       if (!m8841m(eo3Var, eo3Var2, i) || tq3.m8868f(eo3Var, j) != tq3.m8868f(eo3Var2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 5:
/* 330 */                       if (!m8841m(eo3Var, eo3Var2, i) || tq3.m8870h(eo3Var, j) != tq3.m8870h(eo3Var2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 6:
/* 312 */                       if (!m8841m(eo3Var, eo3Var2, i) || tq3.m8868f(eo3Var, j) != tq3.m8868f(eo3Var2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 7:
/* 292 */                       if (m8841m(eo3Var, eo3Var2, i)) {
/* 294 */                           sq3 sq3Var3 = tq3.f17232c;
/* 304 */                           if (sq3Var3.mo7996q(eo3Var, j) == sq3Var3.mo7996q(eo3Var2, j)) {
                                        continue;
                                        break;
                                    }
                                }
/* 4 */                         return false;
                            case 8:
/* 270 */                       if (!m8841m(eo3Var, eo3Var2, i) || !cq3.m2855l(tq3.m8872j(eo3Var, j), tq3.m8872j(eo3Var2, j))) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 9:
/* 248 */                       if (!m8841m(eo3Var, eo3Var2, i) || !cq3.m2855l(tq3.m8872j(eo3Var, j), tq3.m8872j(eo3Var2, j))) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 10:
/* 226 */                       if (!m8841m(eo3Var, eo3Var2, i) || !cq3.m2855l(tq3.m8872j(eo3Var, j), tq3.m8872j(eo3Var2, j))) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 11:
/* 208 */                       if (!m8841m(eo3Var, eo3Var2, i) || tq3.m8868f(eo3Var, j) != tq3.m8868f(eo3Var2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 12:
/* 190 */                       if (!m8841m(eo3Var, eo3Var2, i) || tq3.m8868f(eo3Var, j) != tq3.m8868f(eo3Var2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 172 */                       if (!m8841m(eo3Var, eo3Var2, i) || tq3.m8868f(eo3Var, j) != tq3.m8868f(eo3Var2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 14:
/* 152 */                       if (!m8841m(eo3Var, eo3Var2, i) || tq3.m8870h(eo3Var, j) != tq3.m8870h(eo3Var2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 134 */                       if (!m8841m(eo3Var, eo3Var2, i) || tq3.m8868f(eo3Var, j) != tq3.m8868f(eo3Var2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 16:
/* 114 */                       if (!m8841m(eo3Var, eo3Var2, i) || tq3.m8870h(eo3Var, j) != tq3.m8870h(eo3Var2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 17:
/* 92 */                        if (!m8841m(eo3Var, eo3Var2, i) || !cq3.m2855l(tq3.m8872j(eo3Var, j), tq3.m8872j(eo3Var2, j))) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case Build.API_LEVELS.API_21 /* 21 */:
                            case Build.API_LEVELS.API_22 /* 22 */:
                            case Build.API_LEVELS.API_23 /* 23 */:
                            case 24:
                            case Build.API_LEVELS.API_25 /* 25 */:
                            case Build.API_LEVELS.API_26 /* 26 */:
                            case Build.API_LEVELS.API_27 /* 27 */:
                            case Build.API_LEVELS.API_28 /* 28 */:
                            case Build.API_LEVELS.API_29 /* 29 */:
                            case Build.API_LEVELS.API_30 /* 30 */:
                            case Build.API_LEVELS.API_31 /* 31 */:
                            case 32:
                            case Build.API_LEVELS.API_33 /* 33 */:
                            case Build.API_LEVELS.API_34 /* 34 */:
                            case Build.API_LEVELS.API_35 /* 35 */:
                            case Build.API_LEVELS.API_36 /* 36 */:
                            case 37:
                            case 38:
                            case 39:
                            case RequestError.NETWORK_FAILURE /* 40 */:
                            case RequestError.NO_DEV_KEY /* 41 */:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
/* 80 */                        zM2855l = cq3.m2855l(tq3.m8872j(eo3Var, j), tq3.m8872j(eo3Var2, j));
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 67 */                        zM2855l = cq3.m2855l(tq3.m8872j(eo3Var, j), tq3.m8872j(eo3Var2, j));
                                break;
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                            case 68:
/* 31 */                        long j2 = iArr[i + 2] & 1048575;
/* 41 */                        if (tq3.m8868f(eo3Var, j2) != tq3.m8868f(eo3Var2, j2) || !cq3.m2855l(tq3.m8872j(eo3Var, j), tq3.m8872j(eo3Var2, j))) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            default:
                                continue;
                                break;
                        }
/* 84 */                if (!zM2855l) {
/* 4 */                     return false;
                        }
                    }
/* 462 */           this.f17223l.getClass();
/* 473 */           if (eo3Var.zzc.equals(eo3Var2.zzc)) {
/* 478 */               if (!this.f17217f) {
/* 498 */                   return true;
                        }
/* 482 */               this.f17224m.getClass();
/* 493 */               return ((bo3) eo3Var).zza.equals(((bo3) eo3Var2).zza);
                    }
/* 4 */             return false;
                }

                /* JADX WARN: Code duplicated, block: B:131:0x02e2  */
                /* JADX WARN: Code duplicated, block: B:29:0x008a  */
                /* JADX WARN: Code duplicated, block: B:32:0x0098  */
                /* JADX WARN: Code duplicated, block: B:55:0x0126  */
                @Override // p000.bq3
                /* JADX INFO: renamed from: d */
                public final int mo1409d(eo3 eo3Var) {
                    int i;
                    int iM6155q;
                    int i2;
                    int iM6153o;
                    int i3;
                    int iMo320c;
                    int iM6154p;
                    int iM2852i;
                    int i4;
                    int i5;
                    int iM6154p2;
                    int iM6154p3;
                    int iM6155q2;
                    int size;
                    int iM2841G;
                    int iM2849f;
                    int i6;
                    int iM6154p4;
                    int iM6152a;
/* 3 */             if (!this.f17218g) {
/* 1348 */              return m8849y(eo3Var);
                    }
/* 5 */             Unsafe unsafe = f17211o;
/* 8 */             int i7 = 0;
/* 9 */             int iM6154p5 = 0;
                    while (true) {
/* 10 */                int[] iArr = this.f17212a;
/* 13 */                if (i7 >= iArr.length) {
/* 1337 */                  this.f17223l.getClass();
/* 1346 */                  return eo3Var.zzc.m6791c() + iM6154p5;
                        }
/* 15 */                int iM8840g = m8840g(i7);
/* 19 */                int iM8822h = m8822h(iM8840g);
/* 23 */                int i8 = iArr[i7];
/* 28 */                int i9 = iM8840g & 1048575;
/* 33 */                if (iM8822h >= wn3.f18705b.f18709a && iM8822h <= wn3.f18706c.f18709a) {
/* 43 */                    int i10 = iArr[i7 + 2];
                        }
                        long j = i9;
                        switch (iM8822h) {
                            case 0:
/* 1327 */                      if (m8842n(i7, eo3Var)) {
/* 141 */                           iM6154p5 = pm2.m7494q(i8 << 3, 8, iM6154p5);
                                }
                                break;
                            case 1:
/* 1319 */                      if (m8842n(i7, eo3Var)) {
/* 155 */                           iM6154p5 = pm2.m7494q(i8 << 3, 4, iM6154p5);
                                }
                                break;
                            case 2:
/* 1301 */                      if (m8842n(i7, eo3Var)) {
/* 1307 */                          i = i8 << 3;
/* 1309 */                          iM6155q = kn3.m6155q(tq3.m8870h(eo3Var, j));
/* 353 */                           iM6154p5 = pm2.m7494q(i, iM6155q, iM6154p5);
                                }
                                break;
                            case 3:
/* 1283 */                      if (m8842n(i7, eo3Var)) {
/* 1289 */                          i = i8 << 3;
/* 1291 */                          iM6155q = kn3.m6155q(tq3.m8870h(eo3Var, j));
/* 353 */                           iM6154p5 = pm2.m7494q(i, iM6155q, iM6154p5);
                                }
                                break;
                            case 4:
/* 1265 */                      if (m8842n(i7, eo3Var)) {
/* 1271 */                          i2 = i8 << 3;
/* 1273 */                          iM6153o = kn3.m6153o(tq3.m8868f(eo3Var, j));
/* 177 */                           iM6154p5 = pm2.m7494q(i2, iM6153o, iM6154p5);
                                }
                                break;
                            case 5:
/* 1257 */                      if (m8842n(i7, eo3Var)) {
/* 141 */                           iM6154p5 = pm2.m7494q(i8 << 3, 8, iM6154p5);
                                }
                                break;
                            case 6:
/* 1249 */                      if (m8842n(i7, eo3Var)) {
/* 155 */                           iM6154p5 = pm2.m7494q(i8 << 3, 4, iM6154p5);
                                }
                                break;
                            case 7:
/* 1241 */                      if (m8842n(i7, eo3Var)) {
/* 297 */                           iM6154p5 = pm2.m7494q(i8 << 3, 1, iM6154p5);
                                }
                                break;
                            case 8:
/* 1201 */                      if (m8842n(i7, eo3Var)) {
/* 1203 */                          Object objM8872j = tq3.m8872j(eo3Var, j);
/* 1209 */                          if (objM8872j instanceof cn3) {
/* 1213 */                              i3 = i8 << 3;
/* 1215 */                              Logger logger = kn3.f12895e;
/* 1217 */                              iMo320c = ((cn3) objM8872j).mo320c();
/* 1221 */                              iM6154p = kn3.m6154p(iMo320c);
/* 225 */                               iM6154p5 = pm2.m7494q(i3, iM6154p + iMo320c, iM6154p5);
                                    } else {
/* 1229 */                              i2 = i8 << 3;
/* 1231 */                              iM6153o = kn3.m6156r((String) objM8872j);
/* 177 */                               iM6154p5 = pm2.m7494q(i2, iM6153o, iM6154p5);
                                    }
                                }
                                break;
                            case 9:
/* 1181 */                      if (m8842n(i7, eo3Var)) {
/* 1191 */                          iM2852i = cq3.m2852i(i8, tq3.m8872j(eo3Var, j), m8833C(i7));
/* 77 */                            iM6154p5 += iM2852i;
                                }
                                break;
                            case 10:
/* 1155 */                      if (m8842n(i7, eo3Var)) {
/* 1161 */                          cn3 cn3Var = (cn3) tq3.m8872j(eo3Var, j);
/* 1163 */                          i3 = i8 << 3;
/* 1165 */                          Logger logger2 = kn3.f12895e;
/* 1167 */                          iMo320c = cn3Var.mo320c();
/* 1171 */                          iM6154p = kn3.m6154p(iMo320c);
/* 225 */                           iM6154p5 = pm2.m7494q(i3, iM6154p + iMo320c, iM6154p5);
                                }
                                break;
                            case 11:
/* 1137 */                      if (m8842n(i7, eo3Var)) {
/* 1143 */                          i2 = i8 << 3;
/* 1145 */                          iM6153o = kn3.m6154p(tq3.m8868f(eo3Var, j));
/* 177 */                           iM6154p5 = pm2.m7494q(i2, iM6153o, iM6154p5);
                                }
                                break;
                            case 12:
/* 1119 */                      if (m8842n(i7, eo3Var)) {
/* 1125 */                          i2 = i8 << 3;
/* 1127 */                          iM6153o = kn3.m6153o(tq3.m8868f(eo3Var, j));
/* 177 */                           iM6154p5 = pm2.m7494q(i2, iM6153o, iM6154p5);
                                }
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1111 */                      if (m8842n(i7, eo3Var)) {
/* 155 */                           iM6154p5 = pm2.m7494q(i8 << 3, 4, iM6154p5);
                                }
                                break;
                            case 14:
/* 1103 */                      if (m8842n(i7, eo3Var)) {
/* 141 */                           iM6154p5 = pm2.m7494q(i8 << 3, 8, iM6154p5);
                                }
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1081 */                      if (m8842n(i7, eo3Var)) {
/* 1083 */                          int iM8868f = tq3.m8868f(eo3Var, j);
/* 1089 */                          i4 = iM8868f + iM8868f;
/* 1091 */                          i5 = iM8868f >> 31;
/* 1093 */                          iM6154p2 = kn3.m6154p(i8 << 3);
/* 127 */                           iM6154p5 = pm2.m7494q(i5 ^ i4, iM6154p2, iM6154p5);
                                }
                                break;
                            case 16:
/* 1055 */                      if (m8842n(i7, eo3Var)) {
/* 1057 */                          long jM8870h = tq3.m8870h(eo3Var, j);
/* 1066 */                          iM6154p3 = kn3.m6154p(i8 << 3);
/* 1071 */                          iM6155q2 = kn3.m6155q((jM8870h >> 63) ^ (jM8870h + jM8870h));
/* 104 */                           iM2852i = iM6155q2 + iM6154p3;
/* 77 */                            iM6154p5 += iM2852i;
                                }
                                break;
                            case 17:
/* 1033 */                      if (m8842n(i7, eo3Var)) {
/* 1045 */                          iM2852i = kn3.m6152a(i8, (tm3) tq3.m8872j(eo3Var, j), m8833C(i7));
/* 77 */                            iM6154p5 += iM2852i;
                                }
                                break;
                            case 18:
/* 1023 */                      iM2852i = cq3.m2850g(i8, (List) tq3.m8872j(eo3Var, j));
/* 77 */                        iM6154p5 += iM2852i;
                                break;
                            case 19:
/* 1011 */                      iM2852i = cq3.m2848e(i8, (List) tq3.m8872j(eo3Var, j));
/* 77 */                        iM6154p5 += iM2852i;
                                break;
                            case 20:
/* 977 */                       List list = (List) tq3.m8872j(eo3Var, j);
/* 979 */                       Class cls = cq3.f6887a;
/* 985 */                       if (list.size() == 0) {
/* 739 */                           iM2852i = 0;
                                } else {
/* 999 */                           iM2852i = pm2.m7495r(i8 << 3, list.size(), cq3.m2840F(list));
                                }
/* 77 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 955 */                       List list2 = (List) tq3.m8872j(eo3Var, j);
/* 957 */                       Class cls2 = cq3.f6887a;
/* 959 */                       size = list2.size();
/* 963 */                       if (size == 0) {
/* 739 */                           iM2852i = 0;
                                } else {
/* 967 */                           iM2841G = cq3.m2841G(list2);
/* 748 */                           iM2852i = pm2.m7495r(i8 << 3, size, iM2841G);
                                }
/* 77 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 933 */                       List list3 = (List) tq3.m8872j(eo3Var, j);
/* 935 */                       Class cls3 = cq3.f6887a;
/* 937 */                       size = list3.size();
/* 941 */                       if (size == 0) {
/* 739 */                           iM2852i = 0;
                                } else {
/* 945 */                           iM2841G = cq3.m2844a(list3);
/* 748 */                           iM2852i = pm2.m7495r(i8 << 3, size, iM2841G);
                                }
/* 77 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 923 */                       iM2852i = cq3.m2850g(i8, (List) tq3.m8872j(eo3Var, j));
/* 77 */                        iM6154p5 += iM2852i;
                                break;
                            case 24:
/* 911 */                       iM2852i = cq3.m2848e(i8, (List) tq3.m8872j(eo3Var, j));
/* 77 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 882 */                       List list4 = (List) tq3.m8872j(eo3Var, j);
/* 884 */                       Class cls4 = cq3.f6887a;
/* 886 */                       int size2 = list4.size();
/* 902 */                       iM6154p5 += size2 == 0 ? 0 : (kn3.m6154p(i8 << 3) + 1) * size2;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 872 */                       iM2852i = cq3.m2851h(i8, (List) tq3.m8872j(eo3Var, j));
/* 77 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 860 */                       iM2852i = cq3.m2853j(i8, (List) tq3.m8872j(eo3Var, j), m8833C(i7));
/* 77 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 844 */                       iM2852i = cq3.m2854k(i8, (List) tq3.m8872j(eo3Var, j));
/* 77 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 822 */                       List list5 = (List) tq3.m8872j(eo3Var, j);
/* 824 */                       Class cls5 = cq3.f6887a;
/* 826 */                       size = list5.size();
/* 830 */                       if (size == 0) {
/* 739 */                           iM2852i = 0;
                                } else {
/* 833 */                           iM2841G = cq3.m2845b(list5);
/* 748 */                           iM2852i = pm2.m7495r(i8 << 3, size, iM2841G);
                                }
/* 77 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 802 */                       List list6 = (List) tq3.m8872j(eo3Var, j);
/* 804 */                       Class cls6 = cq3.f6887a;
/* 806 */                       size = list6.size();
/* 810 */                       if (size == 0) {
/* 739 */                           iM2852i = 0;
                                } else {
/* 813 */                           iM2841G = cq3.m2843I(list6);
/* 748 */                           iM2852i = pm2.m7495r(i8 << 3, size, iM2841G);
                                }
/* 77 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 792 */                       iM2852i = cq3.m2848e(i8, (List) tq3.m8872j(eo3Var, j));
/* 77 */                        iM6154p5 += iM2852i;
                                break;
                            case 32:
/* 780 */                       iM2852i = cq3.m2850g(i8, (List) tq3.m8872j(eo3Var, j));
/* 77 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 758 */                       List list7 = (List) tq3.m8872j(eo3Var, j);
/* 760 */                       Class cls7 = cq3.f6887a;
/* 762 */                       size = list7.size();
/* 766 */                       if (size == 0) {
/* 739 */                           iM2852i = 0;
                                } else {
/* 769 */                           iM2841G = cq3.m2846c(list7);
/* 748 */                           iM2852i = pm2.m7495r(i8 << 3, size, iM2841G);
                                }
/* 77 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 729 */                       List list8 = (List) tq3.m8872j(eo3Var, j);
/* 731 */                       Class cls8 = cq3.f6887a;
/* 733 */                       size = list8.size();
/* 737 */                       if (size == 0) {
/* 739 */                           iM2852i = 0;
                                } else {
/* 742 */                           iM2841G = cq3.m2842H(list8);
/* 748 */                           iM2852i = pm2.m7495r(i8 << 3, size, iM2841G);
                                }
/* 77 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 711 */                       iM2849f = cq3.m2849f((List) unsafe.getObject(eo3Var, j));
/* 715 */                       if (iM2849f > 0) {
/* 717 */                           i6 = i8 << 3;
/* 719 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 463 */                           iM6154p5 = pm2.m7492o(i6, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 691 */                       iM2849f = cq3.m2847d((List) unsafe.getObject(eo3Var, j));
/* 695 */                       if (iM2849f > 0) {
/* 697 */                           i6 = i8 << 3;
/* 699 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 463 */                           iM6154p5 = pm2.m7492o(i6, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 37:
/* 671 */                       iM2849f = cq3.m2840F((List) unsafe.getObject(eo3Var, j));
/* 675 */                       if (iM2849f > 0) {
/* 677 */                           i6 = i8 << 3;
/* 679 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 463 */                           iM6154p5 = pm2.m7492o(i6, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 38:
/* 651 */                       iM2849f = cq3.m2841G((List) unsafe.getObject(eo3Var, j));
/* 655 */                       if (iM2849f > 0) {
/* 657 */                           i6 = i8 << 3;
/* 659 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 463 */                           iM6154p5 = pm2.m7492o(i6, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 39:
/* 631 */                       iM2849f = cq3.m2844a((List) unsafe.getObject(eo3Var, j));
/* 635 */                       if (iM2849f > 0) {
/* 637 */                           i6 = i8 << 3;
/* 639 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 463 */                           iM6154p5 = pm2.m7492o(i6, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 611 */                       iM2849f = cq3.m2849f((List) unsafe.getObject(eo3Var, j));
/* 615 */                       if (iM2849f > 0) {
/* 617 */                           i6 = i8 << 3;
/* 619 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 463 */                           iM6154p5 = pm2.m7492o(i6, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 591 */                       iM2849f = cq3.m2847d((List) unsafe.getObject(eo3Var, j));
/* 595 */                       if (iM2849f > 0) {
/* 597 */                           i6 = i8 << 3;
/* 599 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 463 */                           iM6154p5 = pm2.m7492o(i6, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 42:
/* 568 */                       List list9 = (List) unsafe.getObject(eo3Var, j);
/* 570 */                       Class cls9 = cq3.f6887a;
/* 572 */                       iM2849f = list9.size();
/* 576 */                       if (iM2849f > 0) {
/* 578 */                           i6 = i8 << 3;
/* 580 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 463 */                           iM6154p5 = pm2.m7492o(i6, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 43:
/* 551 */                       iM2849f = cq3.m2845b((List) unsafe.getObject(eo3Var, j));
/* 555 */                       if (iM2849f > 0) {
/* 557 */                           i6 = i8 << 3;
/* 559 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 463 */                           iM6154p5 = pm2.m7492o(i6, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 44:
/* 532 */                       iM2849f = cq3.m2843I((List) unsafe.getObject(eo3Var, j));
/* 536 */                       if (iM2849f > 0) {
/* 538 */                           i6 = i8 << 3;
/* 540 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 463 */                           iM6154p5 = pm2.m7492o(i6, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 45:
/* 513 */                       iM2849f = cq3.m2847d((List) unsafe.getObject(eo3Var, j));
/* 517 */                       if (iM2849f > 0) {
/* 519 */                           i6 = i8 << 3;
/* 521 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 463 */                           iM6154p5 = pm2.m7492o(i6, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 46:
/* 494 */                       iM2849f = cq3.m2849f((List) unsafe.getObject(eo3Var, j));
/* 498 */                       if (iM2849f > 0) {
/* 500 */                           i6 = i8 << 3;
/* 502 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 463 */                           iM6154p5 = pm2.m7492o(i6, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 47:
/* 475 */                       iM2849f = cq3.m2846c((List) unsafe.getObject(eo3Var, j));
/* 479 */                       if (iM2849f > 0) {
/* 481 */                           i6 = i8 << 3;
/* 483 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 463 */                           iM6154p5 = pm2.m7492o(i6, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 48:
/* 451 */                       iM2849f = cq3.m2842H((List) unsafe.getObject(eo3Var, j));
/* 455 */                       if (iM2849f > 0) {
/* 457 */                           i6 = i8 << 3;
/* 459 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 463 */                           iM6154p5 = pm2.m7492o(i6, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 49:
/* 409 */                       List list10 = (List) tq3.m8872j(eo3Var, j);
/* 411 */                       bq3 bq3VarM8833C = m8833C(i7);
/* 415 */                       Class cls10 = cq3.f6887a;
/* 417 */                       int size3 = list10.size();
/* 421 */                       if (size3 != 0) {
/* 424 */                           iM6152a = 0;
/* 425 */                           for (int i11 = 0; i11 < size3; i11++) {
/* 437 */                               iM6152a += kn3.m6152a(i8, (tm3) list10.get(i11), bq3VarM8833C);
                                    }
                                } else {
/* 441 */                           iM6152a = 0;
                                }
/* 442 */                       iM6154p5 += iM6152a;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 400 */                       np3.m7019a(tq3.m8872j(eo3Var, j), m8834D(i7));
                                break;
                            case 51:
/* 388 */                       if (m8844p(i8, eo3Var, i7)) {
/* 141 */                           iM6154p5 = pm2.m7494q(i8 << 3, 8, iM6154p5);
                                }
                                break;
                            case 52:
/* 380 */                       if (m8844p(i8, eo3Var, i7)) {
/* 155 */                           iM6154p5 = pm2.m7494q(i8 << 3, 4, iM6154p5);
                                }
                                break;
                            case 53:
/* 363 */                       if (m8844p(i8, eo3Var, i7)) {
/* 369 */                           i = i8 << 3;
/* 371 */                           iM6155q = kn3.m6155q(m8826l(eo3Var, j));
/* 353 */                           iM6154p5 = pm2.m7494q(i, iM6155q, iM6154p5);
                                }
                                break;
                            case 54:
/* 341 */                       if (m8844p(i8, eo3Var, i7)) {
/* 347 */                           i = i8 << 3;
/* 349 */                           iM6155q = kn3.m6155q(m8826l(eo3Var, j));
/* 353 */                           iM6154p5 = pm2.m7494q(i, iM6155q, iM6154p5);
                                }
                                break;
                            case 55:
/* 323 */                       if (m8844p(i8, eo3Var, i7)) {
/* 329 */                           i2 = i8 << 3;
/* 331 */                           iM6153o = kn3.m6153o(m8825k(eo3Var, j));
/* 177 */                           iM6154p5 = pm2.m7494q(i2, iM6153o, iM6154p5);
                                }
                                break;
                            case 56:
/* 315 */                       if (m8844p(i8, eo3Var, i7)) {
/* 141 */                           iM6154p5 = pm2.m7494q(i8 << 3, 8, iM6154p5);
                                }
                                break;
                            case 57:
/* 307 */                       if (m8844p(i8, eo3Var, i7)) {
/* 155 */                           iM6154p5 = pm2.m7494q(i8 << 3, 4, iM6154p5);
                                }
                                break;
                            case 58:
/* 293 */                       if (m8844p(i8, eo3Var, i7)) {
/* 297 */                           iM6154p5 = pm2.m7494q(i8 << 3, 1, iM6154p5);
                                }
                                break;
                            case 59:
/* 255 */                       if (m8844p(i8, eo3Var, i7)) {
/* 257 */                           Object objM8872j2 = tq3.m8872j(eo3Var, j);
/* 263 */                           if (objM8872j2 instanceof cn3) {
/* 267 */                               i3 = i8 << 3;
/* 269 */                               Logger logger3 = kn3.f12895e;
/* 271 */                               iMo320c = ((cn3) objM8872j2).mo320c();
/* 275 */                               iM6154p = kn3.m6154p(iMo320c);
/* 225 */                               iM6154p5 = pm2.m7494q(i3, iM6154p + iMo320c, iM6154p5);
                                    } else {
/* 282 */                               i2 = i8 << 3;
/* 284 */                               iM6153o = kn3.m6156r((String) objM8872j2);
/* 177 */                               iM6154p5 = pm2.m7494q(i2, iM6153o, iM6154p5);
                                    }
                                }
                                break;
                            case 60:
/* 235 */                       if (m8844p(i8, eo3Var, i7)) {
/* 245 */                           iM2852i = cq3.m2852i(i8, tq3.m8872j(eo3Var, j), m8833C(i7));
/* 77 */                            iM6154p5 += iM2852i;
                                }
                                break;
                            case 61:
/* 204 */                       if (m8844p(i8, eo3Var, i7)) {
/* 210 */                           cn3 cn3Var2 = (cn3) tq3.m8872j(eo3Var, j);
/* 212 */                           i3 = i8 << 3;
/* 214 */                           Logger logger4 = kn3.f12895e;
/* 216 */                           iMo320c = cn3Var2.mo320c();
/* 220 */                           iM6154p = kn3.m6154p(iMo320c);
/* 225 */                           iM6154p5 = pm2.m7494q(i3, iM6154p + iMo320c, iM6154p5);
                                }
                                break;
                            case 62:
/* 187 */                       if (m8844p(i8, eo3Var, i7)) {
/* 193 */                           i2 = i8 << 3;
/* 195 */                           iM6153o = kn3.m6154p(m8825k(eo3Var, j));
/* 177 */                           iM6154p5 = pm2.m7494q(i2, iM6153o, iM6154p5);
                                }
                                break;
                            case 63:
/* 165 */                       if (m8844p(i8, eo3Var, i7)) {
/* 171 */                           i2 = i8 << 3;
/* 173 */                           iM6153o = kn3.m6153o(m8825k(eo3Var, j));
/* 177 */                           iM6154p5 = pm2.m7494q(i2, iM6153o, iM6154p5);
                                }
                                break;
                            case 64:
/* 151 */                       if (m8844p(i8, eo3Var, i7)) {
/* 155 */                           iM6154p5 = pm2.m7494q(i8 << 3, 4, iM6154p5);
                                }
                                break;
                            case 65:
/* 137 */                       if (m8844p(i8, eo3Var, i7)) {
/* 141 */                           iM6154p5 = pm2.m7494q(i8 << 3, 8, iM6154p5);
                                }
                                break;
                            case 66:
/* 110 */                       if (m8844p(i8, eo3Var, i7)) {
/* 112 */                           int iM8825k = m8825k(eo3Var, j);
/* 118 */                           i4 = iM8825k + iM8825k;
/* 120 */                           i5 = iM8825k >> 31;
/* 122 */                           iM6154p2 = kn3.m6154p(i8 << 3);
/* 127 */                           iM6154p5 = pm2.m7494q(i5 ^ i4, iM6154p2, iM6154p5);
                                }
                                break;
                            case 67:
/* 84 */                        if (m8844p(i8, eo3Var, i7)) {
/* 86 */                            long jM8826l = m8826l(eo3Var, j);
/* 95 */                            iM6154p3 = kn3.m6154p(i8 << 3);
/* 100 */                           iM6155q2 = kn3.m6155q((jM8826l >> 63) ^ (jM8826l + jM8826l));
/* 104 */                           iM2852i = iM6155q2 + iM6154p3;
/* 77 */                            iM6154p5 += iM2852i;
                                }
                                break;
                            case 68:
/* 61 */                        if (m8844p(i8, eo3Var, i7)) {
/* 73 */                            iM2852i = kn3.m6152a(i8, (tm3) tq3.m8872j(eo3Var, j), m8833C(i7));
/* 77 */                            iM6154p5 += iM2852i;
                                }
                                break;
                        }
/* 1331 */              i7 += 3;
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:194:0x075f  */
                /* JADX WARN: Code duplicated, block: B:8:0x0036  */
                @Override // p000.bq3
                /* JADX INFO: renamed from: e */
                public final void mo1410e(Object obj, pi3 pi3Var) throws C1868kw {
                    Map.Entry entry;
                    int i;
                    boolean z;
                    Map.Entry entry2;
                    int i2;
                    Map.Entry entry3;
/* 7 */             nq3 nq3Var = this.f17223l;
/* 9 */             qn3 qn3Var = this.f17224m;
/* 11 */            boolean z2 = true;
/* 13 */            int[] iArr = this.f17212a;
/* 15 */            int i3 = 1048575;
/* 18 */            boolean z3 = this.f17218g;
/* 20 */            boolean z4 = this.f17217f;
/* 22 */            if (z3) {
/* 24 */                if (z4) {
/* 26 */                    qn3Var.getClass();
/* 32 */                    un3 un3Var = ((bo3) obj).zza;
/* 40 */                    if (un3Var.f17607a.isEmpty()) {
/* 55 */                        entry2 = null;
                            } else {
/* 52 */                        entry2 = (Map.Entry) ((ff2) un3Var.m9046c()).next();
                            }
                        } else {
/* 55 */                    entry2 = null;
                        }
/* 56 */                int length = iArr.length;
/* 57 */                int i4 = 0;
/* 58 */                while (i4 < length) {
/* 60 */                    int iM8840g = m8840g(i4);
/* 64 */                    int i5 = iArr[i4];
/* 66 */                    if (entry2 != null) {
/* 1809 */                      qn3Var.getClass();
/* 1816 */                      pm2.m7490m(entry2.getKey());
/* 1819 */                      throw null;
                            }
                            switch (m8822h(iM8840g)) {
                                case 0:
/* 1767 */                          i2 = i3;
/* 1768 */                          entry3 = entry2;
/* 1776 */                          if (m8842n(i4, obj)) {
/* 1795 */                              ((kn3) pi3Var.f15137a).m6161f(i5, Double.doubleToRawLongBits(tq3.f17232c.mo8000x(obj, iM8840g & i2)));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 1:
/* 1735 */                          i2 = i3;
/* 1736 */                          entry3 = entry2;
/* 1744 */                          if (m8842n(i4, obj)) {
/* 1763 */                              ((kn3) pi3Var.f15137a).m6159d(i5, Float.floatToRawIntBits(tq3.f17232c.mo7998u(obj, iM8840g & i2)));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 2:
/* 1709 */                          i2 = i3;
/* 1710 */                          entry3 = entry2;
/* 1718 */                          if (m8842n(i4, obj)) {
/* 1731 */                              ((kn3) pi3Var.f15137a).m6160e(i5, tq3.m8870h(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 3:
/* 1683 */                          i2 = i3;
/* 1684 */                          entry3 = entry2;
/* 1692 */                          if (m8842n(i4, obj)) {
/* 1705 */                              ((kn3) pi3Var.f15137a).m6160e(i5, tq3.m8870h(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 4:
/* 1651 */                          i2 = i3;
/* 1652 */                          entry3 = entry2;
/* 1660 */                          if (m8842n(i4, obj)) {
/* 1665 */                              int iM8868f = tq3.m8868f(obj, iM8840g & i2);
/* 1671 */                              kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 1675 */                              kn3Var.m6165j(i5 << 3);
/* 1678 */                              kn3Var.m6164i(iM8868f);
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 5:
/* 1624 */                          i2 = i3;
/* 1625 */                          entry3 = entry2;
/* 1633 */                          if (m8842n(i4, obj)) {
/* 1646 */                              ((kn3) pi3Var.f15137a).m6161f(i5, tq3.m8870h(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 6:
/* 1597 */                          i2 = i3;
/* 1598 */                          entry3 = entry2;
/* 1606 */                          if (m8842n(i4, obj)) {
/* 1619 */                              ((kn3) pi3Var.f15137a).m6159d(i5, tq3.m8868f(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 7:
/* 1563 */                          i2 = i3;
/* 1564 */                          entry3 = entry2;
/* 1572 */                          if (m8842n(i4, obj)) {
/* 1579 */                              boolean zMo7996q = tq3.f17232c.mo7996q(obj, iM8840g & i2);
/* 1585 */                              kn3 kn3Var2 = (kn3) pi3Var.f15137a;
/* 1589 */                              kn3Var2.m6165j(i5 << 3);
/* 1592 */                              kn3Var2.m6163h(zMo7996q ? (byte) 1 : (byte) 0);
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 8:
/* 1540 */                          i2 = i3;
/* 1541 */                          entry3 = entry2;
/* 1549 */                          if (m8842n(i4, obj)) {
/* 1558 */                              m8827r(i5, tq3.m8872j(obj, iM8840g & i2), pi3Var);
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 9:
/* 1513 */                          i2 = i3;
/* 1514 */                          entry3 = entry2;
/* 1522 */                          if (m8842n(i4, obj)) {
/* 1535 */                              pi3Var.m7461h(i5, tq3.m8872j(obj, iM8840g & i2), m8833C(i4));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 10:
/* 1488 */                          i2 = i3;
/* 1489 */                          entry3 = entry2;
/* 1497 */                          if (m8842n(i4, obj)) {
/* 1508 */                              pi3Var.m7458e(i5, (cn3) tq3.m8872j(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 11:
/* 1461 */                          i2 = i3;
/* 1462 */                          entry3 = entry2;
/* 1470 */                          if (m8842n(i4, obj)) {
/* 1483 */                              ((kn3) pi3Var.f15137a).m6158c(i5, tq3.m8868f(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 12:
/* 1429 */                          i2 = i3;
/* 1430 */                          entry3 = entry2;
/* 1438 */                          if (m8842n(i4, obj)) {
/* 1443 */                              int iM8868f2 = tq3.m8868f(obj, iM8840g & i2);
/* 1449 */                              kn3 kn3Var3 = (kn3) pi3Var.f15137a;
/* 1453 */                              kn3Var3.m6165j(i5 << 3);
/* 1456 */                              kn3Var3.m6164i(iM8868f2);
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1402 */                          i2 = i3;
/* 1403 */                          entry3 = entry2;
/* 1411 */                          if (m8842n(i4, obj)) {
/* 1424 */                              ((kn3) pi3Var.f15137a).m6159d(i5, tq3.m8868f(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 14:
/* 1375 */                          i2 = i3;
/* 1376 */                          entry3 = entry2;
/* 1384 */                          if (m8842n(i4, obj)) {
/* 1397 */                              ((kn3) pi3Var.f15137a).m6161f(i5, tq3.m8870h(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1352 */                          i2 = i3;
/* 1353 */                          entry3 = entry2;
/* 1361 */                          if (m8842n(i4, obj)) {
/* 1370 */                              pi3Var.m7459f(i5, tq3.m8868f(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 16:
/* 1329 */                          i2 = i3;
/* 1330 */                          entry3 = entry2;
/* 1338 */                          if (m8842n(i4, obj)) {
/* 1347 */                              pi3Var.m7460g(i5, tq3.m8870h(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 17:
/* 1302 */                          i2 = i3;
/* 1303 */                          entry3 = entry2;
/* 1311 */                          if (m8842n(i4, obj)) {
/* 1324 */                              pi3Var.m7462i(i5, tq3.m8872j(obj, iM8840g & i2), m8833C(i4));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 18:
/* 1281 */                          i2 = i3;
/* 1282 */                          entry3 = entry2;
/* 1297 */                          cq3.m2859p(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, false);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 19:
/* 1260 */                          i2 = i3;
/* 1261 */                          entry3 = entry2;
/* 1276 */                          cq3.m2860q(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, false);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 20:
/* 1239 */                          i2 = i3;
/* 1240 */                          entry3 = entry2;
/* 1255 */                          cq3.m2861r(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, false);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case Build.API_LEVELS.API_21 /* 21 */:
/* 1218 */                          i2 = i3;
/* 1219 */                          entry3 = entry2;
/* 1234 */                          cq3.m2862s(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, false);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case Build.API_LEVELS.API_22 /* 22 */:
/* 1197 */                          i2 = i3;
/* 1198 */                          entry3 = entry2;
/* 1213 */                          cq3.m2866w(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, false);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case Build.API_LEVELS.API_23 /* 23 */:
/* 1176 */                          i2 = i3;
/* 1177 */                          entry3 = entry2;
/* 1192 */                          cq3.m2864u(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, false);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 24:
/* 1155 */                          i2 = i3;
/* 1156 */                          entry3 = entry2;
/* 1171 */                          cq3.m2869z(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, false);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case Build.API_LEVELS.API_25 /* 25 */:
/* 1134 */                          i2 = i3;
/* 1135 */                          entry3 = entry2;
/* 1150 */                          cq3.m2837C(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, false);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case Build.API_LEVELS.API_26 /* 26 */:
/* 1113 */                          i2 = i3;
/* 1114 */                          entry3 = entry2;
/* 1129 */                          cq3.m2838D(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case Build.API_LEVELS.API_27 /* 27 */:
/* 1066 */                          i2 = i3;
/* 1067 */                          entry3 = entry2;
/* 1071 */                          int i6 = iArr[i4];
/* 1080 */                          List list = (List) tq3.m8872j(obj, iM8840g & i2);
/* 1082 */                          bq3 bq3VarM8833C = m8833C(i4);
/* 1086 */                          Class cls = cq3.f6887a;
/* 1088 */                          if (list != null && !list.isEmpty()) {
/* 1101 */                              for (int i7 = 0; i7 < list.size(); i7++) {
/* 1107 */                                  pi3Var.m7461h(i6, list.get(i7), bq3VarM8833C);
                                        }
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case Build.API_LEVELS.API_28 /* 28 */:
/* 1045 */                          i2 = i3;
/* 1046 */                          entry3 = entry2;
/* 1061 */                          cq3.m2839E(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case Build.API_LEVELS.API_29 /* 29 */:
/* 1024 */                          i2 = i3;
/* 1025 */                          entry3 = entry2;
/* 1040 */                          cq3.m2867x(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, false);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case Build.API_LEVELS.API_30 /* 30 */:
/* 1003 */                          i2 = i3;
/* 1004 */                          entry3 = entry2;
/* 1019 */                          cq3.m2836B(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, false);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case Build.API_LEVELS.API_31 /* 31 */:
/* 982 */                           i2 = i3;
/* 983 */                           entry3 = entry2;
/* 998 */                           cq3.m2835A(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, false);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 32:
/* 961 */                           i2 = i3;
/* 962 */                           entry3 = entry2;
/* 977 */                           cq3.m2865v(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, false);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case Build.API_LEVELS.API_33 /* 33 */:
/* 940 */                           i2 = i3;
/* 941 */                           entry3 = entry2;
/* 956 */                           cq3.m2868y(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, false);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case Build.API_LEVELS.API_34 /* 34 */:
/* 919 */                           i2 = i3;
/* 920 */                           entry3 = entry2;
/* 935 */                           cq3.m2863t(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, false);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case Build.API_LEVELS.API_35 /* 35 */:
/* 898 */                           i2 = i3;
/* 899 */                           entry3 = entry2;
/* 914 */                           cq3.m2859p(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, true);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case Build.API_LEVELS.API_36 /* 36 */:
/* 877 */                           i2 = i3;
/* 878 */                           entry3 = entry2;
/* 893 */                           cq3.m2860q(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, true);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 37:
/* 856 */                           i2 = i3;
/* 857 */                           entry3 = entry2;
/* 872 */                           cq3.m2861r(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, true);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 38:
/* 835 */                           i2 = i3;
/* 836 */                           entry3 = entry2;
/* 851 */                           cq3.m2862s(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, true);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 39:
/* 814 */                           i2 = i3;
/* 815 */                           entry3 = entry2;
/* 830 */                           cq3.m2866w(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, true);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case RequestError.NETWORK_FAILURE /* 40 */:
/* 793 */                           i2 = i3;
/* 794 */                           entry3 = entry2;
/* 809 */                           cq3.m2864u(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, true);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case RequestError.NO_DEV_KEY /* 41 */:
/* 772 */                           i2 = i3;
/* 773 */                           entry3 = entry2;
/* 788 */                           cq3.m2869z(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, true);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 42:
/* 751 */                           i2 = i3;
/* 752 */                           entry3 = entry2;
/* 767 */                           cq3.m2837C(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, true);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 43:
/* 730 */                           i2 = i3;
/* 731 */                           entry3 = entry2;
/* 746 */                           cq3.m2867x(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, true);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 44:
/* 709 */                           i2 = i3;
/* 710 */                           entry3 = entry2;
/* 725 */                           cq3.m2836B(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, true);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 45:
/* 688 */                           i2 = i3;
/* 689 */                           entry3 = entry2;
/* 704 */                           cq3.m2835A(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, true);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 46:
/* 667 */                           i2 = i3;
/* 668 */                           entry3 = entry2;
/* 683 */                           cq3.m2865v(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, true);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 47:
/* 646 */                           i2 = i3;
/* 647 */                           entry3 = entry2;
/* 662 */                           cq3.m2868y(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, true);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 48:
/* 625 */                           i2 = i3;
/* 626 */                           entry3 = entry2;
/* 641 */                           cq3.m2863t(iArr[i4], (List) tq3.m8872j(obj, iM8840g & i2), pi3Var, true);
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 49:
/* 578 */                           i2 = i3;
/* 579 */                           entry3 = entry2;
/* 581 */                           int i8 = iArr[i4];
/* 590 */                           List list2 = (List) tq3.m8872j(obj, iM8840g & i2);
/* 592 */                           bq3 bq3VarM8833C2 = m8833C(i4);
/* 596 */                           Class cls2 = cq3.f6887a;
/* 598 */                           if (list2 != null && !list2.isEmpty()) {
/* 613 */                               for (int i9 = 0; i9 < list2.size(); i9++) {
/* 619 */                                   pi3Var.m7462i(i8, list2.get(i9), bq3VarM8833C2);
                                        }
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 553 */                           i2 = i3;
/* 554 */                           entry3 = entry2;
/* 563 */                           if (tq3.m8872j(obj, iM8840g & i2) != null) {
/* 571 */                               m8834D(i4).getClass();
/* 574 */                               C1697u2.m5431g();
/* 577 */                               return;
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 51:
/* 518 */                           i2 = i3;
/* 519 */                           entry3 = entry2;
/* 525 */                           if (m8844p(i5, obj, i4)) {
/* 548 */                               ((kn3) pi3Var.f15137a).m6161f(i5, Double.doubleToRawLongBits(((Double) tq3.m8872j(obj, iM8840g & i2)).doubleValue()));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 52:
/* 483 */                           i2 = i3;
/* 484 */                           entry3 = entry2;
/* 490 */                           if (m8844p(i5, obj, i4)) {
/* 513 */                               ((kn3) pi3Var.f15137a).m6159d(i5, Float.floatToRawIntBits(((Float) tq3.m8872j(obj, iM8840g & i2)).floatValue()));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 53:
/* 458 */                           i2 = i3;
/* 459 */                           entry3 = entry2;
/* 465 */                           if (m8844p(i5, obj, i4)) {
/* 478 */                               ((kn3) pi3Var.f15137a).m6160e(i5, m8826l(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 54:
/* 433 */                           i2 = i3;
/* 434 */                           entry3 = entry2;
/* 440 */                           if (m8844p(i5, obj, i4)) {
/* 453 */                               ((kn3) pi3Var.f15137a).m6160e(i5, m8826l(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 55:
/* 403 */                           i2 = i3;
/* 404 */                           entry3 = entry2;
/* 410 */                           if (m8844p(i5, obj, i4)) {
/* 415 */                               int iM8825k = m8825k(obj, iM8840g & i2);
/* 421 */                               kn3 kn3Var4 = (kn3) pi3Var.f15137a;
/* 425 */                               kn3Var4.m6165j(i5 << 3);
/* 428 */                               kn3Var4.m6164i(iM8825k);
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 56:
/* 378 */                           i2 = i3;
/* 379 */                           entry3 = entry2;
/* 385 */                           if (m8844p(i5, obj, i4)) {
/* 398 */                               ((kn3) pi3Var.f15137a).m6161f(i5, m8826l(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 57:
/* 353 */                           i2 = i3;
/* 354 */                           entry3 = entry2;
/* 360 */                           if (m8844p(i5, obj, i4)) {
/* 373 */                               ((kn3) pi3Var.f15137a).m6159d(i5, m8825k(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 58:
/* 317 */                           i2 = i3;
/* 318 */                           entry3 = entry2;
/* 324 */                           if (m8844p(i5, obj, i4)) {
/* 335 */                               boolean zBooleanValue = ((Boolean) tq3.m8872j(obj, iM8840g & i2)).booleanValue();
/* 341 */                               kn3 kn3Var5 = (kn3) pi3Var.f15137a;
/* 345 */                               kn3Var5.m6165j(i5 << 3);
/* 348 */                               kn3Var5.m6163h(zBooleanValue ? (byte) 1 : (byte) 0);
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 59:
/* 296 */                           i2 = i3;
/* 297 */                           entry3 = entry2;
/* 303 */                           if (m8844p(i5, obj, i4)) {
/* 312 */                               m8827r(i5, tq3.m8872j(obj, iM8840g & i2), pi3Var);
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 60:
/* 271 */                           i2 = i3;
/* 272 */                           entry3 = entry2;
/* 278 */                           if (m8844p(i5, obj, i4)) {
/* 291 */                               pi3Var.m7461h(i5, tq3.m8872j(obj, iM8840g & i2), m8833C(i4));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 61:
/* 248 */                           i2 = i3;
/* 249 */                           entry3 = entry2;
/* 255 */                           if (m8844p(i5, obj, i4)) {
/* 266 */                               pi3Var.m7458e(i5, (cn3) tq3.m8872j(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 62:
/* 223 */                           i2 = i3;
/* 224 */                           entry3 = entry2;
/* 230 */                           if (m8844p(i5, obj, i4)) {
/* 243 */                               ((kn3) pi3Var.f15137a).m6158c(i5, m8825k(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 63:
/* 193 */                           i2 = i3;
/* 194 */                           entry3 = entry2;
/* 200 */                           if (m8844p(i5, obj, i4)) {
/* 205 */                               int iM8825k2 = m8825k(obj, iM8840g & i2);
/* 211 */                               kn3 kn3Var6 = (kn3) pi3Var.f15137a;
/* 215 */                               kn3Var6.m6165j(i5 << 3);
/* 218 */                               kn3Var6.m6164i(iM8825k2);
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 64:
/* 169 */                           i2 = i3;
/* 170 */                           entry3 = entry2;
/* 176 */                           if (m8844p(i5, obj, i4)) {
/* 189 */                               ((kn3) pi3Var.f15137a).m6159d(i5, m8825k(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 65:
/* 145 */                           i2 = i3;
/* 146 */                           entry3 = entry2;
/* 152 */                           if (m8844p(i5, obj, i4)) {
/* 165 */                               ((kn3) pi3Var.f15137a).m6161f(i5, m8826l(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 66:
/* 125 */                           i2 = i3;
/* 126 */                           entry3 = entry2;
/* 132 */                           if (m8844p(i5, obj, i4)) {
/* 141 */                               pi3Var.m7459f(i5, m8825k(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 67:
/* 105 */                           i2 = i3;
/* 106 */                           entry3 = entry2;
/* 112 */                           if (m8844p(i5, obj, i4)) {
/* 121 */                               pi3Var.m7460g(i5, m8826l(obj, iM8840g & i2));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                                case 68:
/* 86 */                            if (m8844p(i5, obj, i4)) {
/* 89 */                                i2 = i3;
/* 90 */                                entry3 = entry2;
/* 101 */                               pi3Var.m7462i(i5, tq3.m8872j(obj, iM8840g & i3), m8833C(i4));
                                    }
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                default:
/* 75 */                            i2 = i3;
/* 76 */                            entry3 = entry2;
/* 1798 */                          i4 += 3;
/* 1800 */                          i3 = i2;
/* 1801 */                          entry2 = entry3;
                                    break;
                            }
                        }
/* 1820 */              Map.Entry entry4 = entry2;
/* 1824 */              if (entry4 == null) {
/* 1826 */                  nq3Var.getClass();
/* 1834 */                  ((eo3) obj).zzc.m6790b(pi3Var);
/* 1837 */                  return;
                        }
/* 1838 */              qn3Var.getClass();
/* 1845 */              if (entry4.getKey() != null) {
/* 1847 */                  C1697u2.m5431g();
/* 1850 */                  return;
                        } else {
/* 1851 */                  ar3[] ar3VarArr = ar3.f2064a;
/* 1853 */                  throw null;
                        }
                    }
/* 1854 */          int i10 = 1048575;
/* 1857 */          if (z4) {
/* 1859 */              qn3Var.getClass();
/* 1865 */              un3 un3Var2 = ((bo3) obj).zza;
/* 1873 */              if (un3Var2.f17607a.isEmpty()) {
/* 1888 */                  entry = null;
                        } else {
/* 1885 */                  entry = (Map.Entry) ((ff2) un3Var2.m9046c()).next();
                        }
                    } else {
/* 1888 */              entry = null;
                    }
/* 1890 */          int length2 = iArr.length;
/* 1891 */          Unsafe unsafe = f17211o;
/* 1893 */          int i11 = 0;
/* 1894 */          int i12 = 0;
/* 1895 */          int i13 = 1048575;
/* 1896 */          while (i11 < length2) {
/* 1898 */              int iM8840g2 = m8840g(i11);
/* 1902 */              int i14 = i10;
/* 1904 */              int i15 = iArr[i11];
/* 1906 */              int iM8822h = m8822h(iM8840g2);
/* 1910 */              boolean z5 = z2;
/* 1914 */              if (iM8822h <= 17) {
/* 1918 */                  int i16 = iArr[i11 + 2];
/* 1922 */                  int i17 = i16 & i14;
/* 1924 */                  if (i17 != i13) {
/* 1927 */                      i12 = unsafe.getInt(obj, i17);
/* 1931 */                      i13 = i17;
                            }
/* 1934 */                  i = (z5 ? 1 : 0) << (i16 >>> 20);
                        } else {
/* 1939 */                  i = 0;
                        }
/* 1940 */              if (entry != null) {
/* 3200 */                  qn3Var.getClass();
/* 3207 */                  pm2.m7490m(entry.getKey());
/* 3210 */                  throw null;
                        }
/* 1942 */              int i18 = iM8840g2 & i14;
/* 1944 */              int i19 = i;
/* 1946 */              qn3 qn3Var2 = qn3Var;
                        long j = i18;
                        switch (iM8822h) {
                            case 0:
/* 3170 */                      if ((i12 & i19) != 0) {
/* 3186 */                          ((kn3) pi3Var.f15137a).m6161f(i15, Double.doubleToRawLongBits(tq3.f17232c.mo8000x(obj, j)));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 1:
/* 3147 */                      if ((i12 & i19) != 0) {
/* 3163 */                          ((kn3) pi3Var.f15137a).m6159d(i15, Float.floatToRawIntBits(tq3.f17232c.mo7998u(obj, j)));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 2:
/* 3130 */                      if ((i12 & i19) != 0) {
/* 3140 */                          ((kn3) pi3Var.f15137a).m6160e(i15, unsafe.getLong(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 3:
/* 3113 */                      if ((i12 & i19) != 0) {
/* 3123 */                          ((kn3) pi3Var.f15137a).m6160e(i15, unsafe.getLong(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 4:
/* 3091 */                      if ((i12 & i19) != 0) {
/* 3093 */                          int i20 = unsafe.getInt(obj, j);
/* 3099 */                          kn3 kn3Var7 = (kn3) pi3Var.f15137a;
/* 3103 */                          kn3Var7.m6165j(i15 << 3);
/* 3106 */                          kn3Var7.m6164i(i20);
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 5:
/* 3074 */                      if ((i12 & i19) != 0) {
/* 3084 */                          ((kn3) pi3Var.f15137a).m6161f(i15, unsafe.getLong(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 6:
/* 3056 */                      if ((i12 & i19) != 0) {
/* 3066 */                          ((kn3) pi3Var.f15137a).m6159d(i15, unsafe.getInt(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 7:
/* 3031 */                      if ((i12 & i19) != 0) {
/* 3035 */                          boolean zMo7996q2 = tq3.f17232c.mo7996q(obj, j);
/* 3041 */                          kn3 kn3Var8 = (kn3) pi3Var.f15137a;
/* 3045 */                          kn3Var8.m6165j(i15 << 3);
/* 3048 */                          kn3Var8.m6163h(zMo7996q2 ? (byte) 1 : (byte) 0);
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 8:
/* 3017 */                      if ((i12 & i19) != 0) {
/* 3023 */                          m8827r(i15, unsafe.getObject(obj, j), pi3Var);
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 9:
/* 2999 */                      if ((i12 & i19) != 0) {
/* 3009 */                          pi3Var.m7461h(i15, unsafe.getObject(obj, j), m8833C(i11));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 10:
/* 2983 */                      if ((i12 & i19) != 0) {
/* 2991 */                          pi3Var.m7458e(i15, (cn3) unsafe.getObject(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 11:
/* 2965 */                      if ((i12 & i19) != 0) {
/* 2975 */                          ((kn3) pi3Var.f15137a).m6158c(i15, unsafe.getInt(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 12:
/* 2942 */                      if ((i12 & i19) != 0) {
/* 2944 */                          int i21 = unsafe.getInt(obj, j);
/* 2950 */                          kn3 kn3Var9 = (kn3) pi3Var.f15137a;
/* 2954 */                          kn3Var9.m6165j(i15 << 3);
/* 2957 */                          kn3Var9.m6164i(i21);
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 2924 */                      if ((i12 & i19) != 0) {
/* 2934 */                          ((kn3) pi3Var.f15137a).m6159d(i15, unsafe.getInt(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 14:
/* 2906 */                      if ((i12 & i19) != 0) {
/* 2916 */                          ((kn3) pi3Var.f15137a).m6161f(i15, unsafe.getLong(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 2892 */                      if ((i12 & i19) != 0) {
/* 2898 */                          pi3Var.m7459f(i15, unsafe.getInt(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 16:
/* 2878 */                      if ((i12 & i19) != 0) {
/* 2884 */                          pi3Var.m7460g(i15, unsafe.getLong(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 17:
/* 2860 */                      if ((i12 & i19) != 0) {
/* 2870 */                          pi3Var.m7462i(i15, unsafe.getObject(obj, j), m8833C(i11));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 18:
/* 2852 */                      cq3.m2859p(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, false);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 19:
/* 2838 */                      cq3.m2860q(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, false);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 20:
/* 2824 */                      cq3.m2861r(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, false);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 2810 */                      cq3.m2862s(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, false);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 2796 */                      cq3.m2866w(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, false);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 2782 */                      cq3.m2864u(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, false);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 24:
/* 2768 */                      cq3.m2869z(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, false);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 2754 */                      cq3.m2837C(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, false);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 2740 */                      cq3.m2838D(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 2693 */                      int i22 = iArr[i11];
/* 2699 */                      List list3 = (List) unsafe.getObject(obj, j);
/* 2701 */                      bq3 bq3VarM8833C3 = m8833C(i11);
/* 2705 */                      Class cls3 = cq3.f6887a;
/* 2707 */                      if (list3 != null && !list3.isEmpty()) {
/* 2720 */                          for (int i23 = 0; i23 < list3.size(); i23++) {
/* 2726 */                              pi3Var.m7461h(i22, list3.get(i23), bq3VarM8833C3);
                                    }
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 2686 */                      cq3.m2839E(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 2663 */                      z = false;
/* 2672 */                      cq3.m2867x(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, false);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 2648 */                      z = false;
/* 2657 */                      cq3.m2836B(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, false);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 2633 */                      z = false;
/* 2642 */                      cq3.m2835A(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, false);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 32:
/* 2618 */                      z = false;
/* 2627 */                      cq3.m2865v(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, false);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 2603 */                      z = false;
/* 2612 */                      cq3.m2868y(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, false);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 2594 */                      z = false;
/* 2595 */                      cq3.m2863t(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, false);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 2579 */                      cq3.m2859p(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, z5);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 2564 */                      cq3.m2860q(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, z5);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 37:
/* 2549 */                      cq3.m2861r(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, z5);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 38:
/* 2534 */                      cq3.m2862s(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, z5);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 39:
/* 2519 */                      cq3.m2866w(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, z5);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 2504 */                      cq3.m2864u(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, z5);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 2489 */                      cq3.m2869z(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, z5);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 42:
/* 2474 */                      cq3.m2837C(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, z5);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 43:
/* 2459 */                      cq3.m2867x(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, z5);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 44:
/* 2444 */                      cq3.m2836B(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, z5);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 45:
/* 2429 */                      cq3.m2835A(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, z5);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 46:
/* 2414 */                      cq3.m2865v(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, z5);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 47:
/* 2399 */                      cq3.m2868y(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, z5);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 48:
/* 2384 */                      cq3.m2863t(iArr[i11], (List) unsafe.getObject(obj, j), pi3Var, z5);
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 49:
/* 2335 */                      int i24 = iArr[i11];
/* 2341 */                      List list4 = (List) unsafe.getObject(obj, j);
/* 2343 */                      bq3 bq3VarM8833C4 = m8833C(i11);
/* 2347 */                      Class cls4 = cq3.f6887a;
/* 2349 */                      if (list4 != null && !list4.isEmpty()) {
/* 2362 */                          for (int i25 = 0; i25 < list4.size(); i25++) {
/* 2368 */                              pi3Var.m7462i(i24, list4.get(i25), bq3VarM8833C4);
                                    }
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 2320 */                      if (unsafe.getObject(obj, j) != null) {
/* 2328 */                          m8834D(i11).getClass();
/* 2331 */                          C1697u2.m5431g();
/* 2334 */                          return;
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 51:
/* 2291 */                      if (m8844p(i15, obj, i11)) {
/* 2311 */                          ((kn3) pi3Var.f15137a).m6161f(i15, Double.doubleToRawLongBits(((Double) tq3.m8872j(obj, j)).doubleValue()));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 52:
/* 2262 */                      if (m8844p(i15, obj, i11)) {
/* 2282 */                          ((kn3) pi3Var.f15137a).m6159d(i15, Float.floatToRawIntBits(((Float) tq3.m8872j(obj, j)).floatValue()));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 53:
/* 2243 */                      if (m8844p(i15, obj, i11)) {
/* 2253 */                          ((kn3) pi3Var.f15137a).m6160e(i15, m8826l(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 54:
/* 2224 */                      if (m8844p(i15, obj, i11)) {
/* 2234 */                          ((kn3) pi3Var.f15137a).m6160e(i15, m8826l(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 55:
/* 2200 */                      if (m8844p(i15, obj, i11)) {
/* 2202 */                          int iM8825k3 = m8825k(obj, j);
/* 2208 */                          kn3 kn3Var10 = (kn3) pi3Var.f15137a;
/* 2212 */                          kn3Var10.m6165j(i15 << 3);
/* 2215 */                          kn3Var10.m6164i(iM8825k3);
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 56:
/* 2181 */                      if (m8844p(i15, obj, i11)) {
/* 2191 */                          ((kn3) pi3Var.f15137a).m6161f(i15, m8826l(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 57:
/* 2162 */                      if (m8844p(i15, obj, i11)) {
/* 2172 */                          ((kn3) pi3Var.f15137a).m6159d(i15, m8825k(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 58:
/* 2132 */                      if (m8844p(i15, obj, i11)) {
/* 2140 */                          boolean zBooleanValue2 = ((Boolean) tq3.m8872j(obj, j)).booleanValue();
/* 2146 */                          kn3 kn3Var11 = (kn3) pi3Var.f15137a;
/* 2150 */                          kn3Var11.m6165j(i15 << 3);
/* 2153 */                          kn3Var11.m6163h(zBooleanValue2 ? (byte) 1 : (byte) 0);
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 59:
/* 2117 */                      if (m8844p(i15, obj, i11)) {
/* 2123 */                          m8827r(i15, unsafe.getObject(obj, j), pi3Var);
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 60:
/* 2098 */                      if (m8844p(i15, obj, i11)) {
/* 2108 */                          pi3Var.m7461h(i15, unsafe.getObject(obj, j), m8833C(i11));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 61:
/* 2081 */                      if (m8844p(i15, obj, i11)) {
/* 2089 */                          pi3Var.m7458e(i15, (cn3) unsafe.getObject(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 62:
/* 2063 */                      if (m8844p(i15, obj, i11)) {
/* 2073 */                          ((kn3) pi3Var.f15137a).m6158c(i15, m8825k(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 63:
/* 2040 */                      if (m8844p(i15, obj, i11)) {
/* 2042 */                          int iM8825k4 = m8825k(obj, j);
/* 2048 */                          kn3 kn3Var12 = (kn3) pi3Var.f15137a;
/* 2052 */                          kn3Var12.m6165j(i15 << 3);
/* 2055 */                          kn3Var12.m6164i(iM8825k4);
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 64:
/* 2022 */                      if (m8844p(i15, obj, i11)) {
/* 2032 */                          ((kn3) pi3Var.f15137a).m6159d(i15, m8825k(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 65:
/* 2004 */                      if (m8844p(i15, obj, i11)) {
/* 2014 */                          ((kn3) pi3Var.f15137a).m6161f(i15, m8826l(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 66:
/* 1990 */                      if (m8844p(i15, obj, i11)) {
/* 1996 */                          pi3Var.m7459f(i15, m8825k(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 67:
/* 1976 */                      if (m8844p(i15, obj, i11)) {
/* 1982 */                          pi3Var.m7460g(i15, m8826l(obj, j));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            case 68:
/* 1958 */                      if (m8844p(i15, obj, i11)) {
/* 1968 */                          pi3Var.m7462i(i15, unsafe.getObject(obj, j), m8833C(i11));
                                }
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                            default:
/* 3189 */                      i11 += 3;
/* 3191 */                      qn3Var = qn3Var2;
/* 3192 */                      i10 = i14;
/* 3194 */                      nq3Var = nq3Var;
/* 3196 */                      z2 = true;
                                break;
                        }
                    }
/* 3211 */          nq3 nq3Var2 = nq3Var;
/* 3213 */          qn3 qn3Var3 = qn3Var;
/* 3214 */          if (entry == null) {
/* 3216 */              nq3Var2.getClass();
/* 3224 */              ((eo3) obj).zzc.m6790b(pi3Var);
/* 3227 */              return;
                    }
/* 3228 */          qn3Var3.getClass();
/* 3235 */          if (entry.getKey() == null) {
/* 3241 */              ar3[] ar3VarArr2 = ar3.f2064a;
/* 3243 */              throw null;
                    }
/* 3237 */          C1697u2.m5431g();
                }

                /* JADX INFO: renamed from: f */
                public final void m8839f(Object obj, int i, int i2, Object obj2) {
/* 12 */            f17211o.putObject(obj, m8840g(i2) & 1048575, obj2);
/* 23 */            tq3.m8869g(obj, this.f17212a[i2 + 2] & 1048575, i);
                }

                /* JADX INFO: renamed from: g */
                public final int m8840g(int i) {
/* 5 */             return this.f17212a[i + 1];
                }

                /* JADX INFO: renamed from: m */
                public final boolean m8841m(eo3 eo3Var, eo3 eo3Var2, int i) {
                    return m8842n(i, eo3Var) == m8842n(i, eo3Var2);
                }

                /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
                /* JADX INFO: renamed from: n */
                public final boolean m8842n(int i, Object obj) {
/* 5 */             int i2 = this.f17212a[i + 2];
/* 10 */            long j = i2 & 1048575;
/* 20 */            if (j != 1048575) {
/* 244 */               if (((1 << (i2 >>> 20)) & tq3.m8868f(obj, j)) != 0) {
/* 19 */                    return true;
                        }
/* 18 */                return false;
                    }
/* 22 */            int iM8840g = m8840g(i);
/* 26 */            long j2 = iM8840g & 1048575;
                    switch (m8822h(iM8840g)) {
                        case 0:
/* 232 */                   if (Double.doubleToRawLongBits(tq3.f17232c.mo8000x(obj, j2)) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 1:
/* 217 */                   if (Float.floatToRawIntBits(tq3.f17232c.mo7998u(obj, j2)) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 2:
/* 204 */                   if (tq3.m8870h(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 3:
/* 195 */                   if (tq3.m8870h(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 4:
/* 186 */                   if (tq3.m8868f(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 5:
/* 179 */                   if (tq3.m8870h(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 6:
/* 170 */                   if (tq3.m8868f(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 7:
/* 161 */                   return tq3.f17232c.mo7996q(obj, j2);
                        case 8:
/* 124 */                   Object objM8872j = tq3.m8872j(obj, j2);
/* 130 */                   if (objM8872j instanceof String) {
/* 138 */                       if (((String) objM8872j).isEmpty()) {
/* 18 */                            return false;
                                }
/* 19 */                        return true;
                            }
/* 144 */                   if (!(objM8872j instanceof cn3)) {
/* 155 */                       f42.m3649e();
/* 18 */                        return false;
                            }
/* 152 */                   if (cn3.f3019b.equals(objM8872j)) {
/* 18 */                        return false;
                            }
/* 19 */                    return true;
                        case 9:
/* 120 */                   if (tq3.m8872j(obj, j2) != null) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 10:
/* 112 */                   if (cn3.f3019b.equals(tq3.m8872j(obj, j2))) {
/* 18 */                        return false;
                            }
/* 19 */                    return true;
                        case 11:
/* 98 */                    if (tq3.m8868f(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 12:
/* 90 */                    if (tq3.m8868f(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 82 */                    if (tq3.m8868f(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 14:
/* 74 */                    if (tq3.m8870h(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 64 */                    if (tq3.m8868f(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 16:
/* 56 */                    if (tq3.m8870h(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 17:
/* 46 */                    if (tq3.m8872j(obj, j2) != null) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        default:
/* 38 */                    f42.m3649e();
/* 18 */                    return false;
                    }
                }

                /* JADX INFO: renamed from: o */
                public final void m8843o(int i, Object obj) {
/* 5 */             int i2 = this.f17212a[i + 2];
/* 10 */            long j = 1048575 & i2;
/* 17 */            if (j == 1048575) {
/* 19 */                return;
                    }
/* 30 */            tq3.m8869g(obj, j, (1 << (i2 >>> 20)) | tq3.m8868f(obj, j));
                }

                /* JADX INFO: renamed from: p */
                public final boolean m8844p(int i, Object obj, int i2) {
                    return tq3.m8868f(obj, (long) (this.f17212a[i2 + 2] & 1048575)) == i;
                }

                /* JADX INFO: renamed from: q */
                public final int m8845q(int i, int i2) {
/* 1 */             int[] iArr = this.f17212a;
/* 7 */             int length = (iArr.length / 3) - 1;
/* 8 */             while (i2 <= length) {
/* 12 */                int i3 = (length + i2) >>> 1;
/* 14 */                int i4 = i3 * 3;
/* 16 */                int i5 = iArr[i4];
/* 18 */                if (i == i5) {
/* 20 */                    return i4;
                        }
/* 21 */                if (i < i5) {
/* 23 */                    length = i3 - 1;
                        } else {
/* 26 */                    i2 = i3 + 1;
                        }
                    }
/* 6 */             return -1;
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13201. Try increasing type updates limit count.
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                    */
                /* JADX INFO: renamed from: t */
                public final int m8846t(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, p000.ym3 r37) throws p000.uo3 {
                    /*
                        Method dump skipped, instruction units count: 1320
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.tp3.m8846t(java.lang.Object, byte[], int, int, int, ym3):int");
                }

                /* JADX INFO: renamed from: w */
                public final void m8847w(Object obj, Object obj2, int i) {
/* 5 */             if (m8842n(i, obj2)) {
/* 15 */                int iM8840g = m8840g(i) & 1048575;
/* 16 */                Unsafe unsafe = f17211o;
                        long j = iM8840g;
/* 19 */                Object object = unsafe.getObject(obj2, j);
/* 23 */                if (object == null) {
/* 86 */                    int i2 = this.f17212a[i];
/* 88 */                    String string = obj2.toString();
/* 107 */                   pk3.m7469e(String.valueOf(i2).length() + 38 + string.length(), string, i2);
/* 110 */                   return;
                        }
/* 25 */                bq3 bq3VarM8833C = m8833C(i);
/* 33 */                if (!m8842n(i, obj)) {
/* 39 */                    if (m8823i(object)) {
/* 45 */                        Object objZza = bq3VarM8833C.zza();
/* 49 */                        bq3VarM8833C.zzd(objZza, object);
/* 52 */                        unsafe.putObject(obj, j, objZza);
                            } else {
/* 41 */                        unsafe.putObject(obj, j, object);
                            }
/* 55 */                    m8843o(i, obj);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, j);
/* 67 */                if (!m8823i(object2)) {
/* 69 */                    Object objZza2 = bq3VarM8833C.zza();
/* 73 */                    bq3VarM8833C.zzd(objZza2, object2);
/* 76 */                    unsafe.putObject(obj, j, objZza2);
/* 79 */                    object2 = objZza2;
                        }
/* 80 */                bq3VarM8833C.zzd(object2, object);
                    }
                }

                /* JADX INFO: renamed from: x */
                public final void m8848x(Object obj, Object obj2, int i) {
/* 1 */             int[] iArr = this.f17212a;
/* 3 */             int i2 = iArr[i];
/* 9 */             if (m8844p(i2, obj2, i)) {
/* 19 */                int iM8840g = m8840g(i) & 1048575;
/* 20 */                Unsafe unsafe = f17211o;
                        long j = iM8840g;
/* 23 */                Object object = unsafe.getObject(obj2, j);
/* 27 */                if (object == null) {
/* 94 */                    int i3 = iArr[i];
/* 96 */                    String string = obj2.toString();
/* 115 */                   pk3.m7469e(String.valueOf(i3).length() + 38 + string.length(), string, i3);
/* 118 */                   return;
                        }
/* 29 */                bq3 bq3VarM8833C = m8833C(i);
/* 37 */                if (!m8844p(i2, obj, i)) {
/* 43 */                    if (m8823i(object)) {
/* 49 */                        Object objZza = bq3VarM8833C.zza();
/* 53 */                        bq3VarM8833C.zzd(objZza, object);
/* 56 */                        unsafe.putObject(obj, j, objZza);
                            } else {
/* 45 */                        unsafe.putObject(obj, j, object);
                            }
/* 65 */                    tq3.m8869g(obj, iArr[i + 2] & 1048575, i2);
/* 68 */                    return;
                        }
/* 69 */                Object object2 = unsafe.getObject(obj, j);
/* 77 */                if (!m8823i(object2)) {
/* 79 */                    Object objZza2 = bq3VarM8833C.zza();
/* 83 */                    bq3VarM8833C.zzd(objZza2, object2);
/* 86 */                    unsafe.putObject(obj, j, objZza2);
/* 89 */                    object2 = objZza2;
                        }
/* 90 */                bq3VarM8833C.zzd(object2, object);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:131:0x02f0  */
                /* JADX WARN: Code duplicated, block: B:29:0x0096  */
                /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
                /* JADX WARN: Code duplicated, block: B:55:0x0132  */
                /* JADX INFO: renamed from: y */
                public final int m8849y(eo3 eo3Var) {
                    int i;
                    int i2;
                    int iM6155q;
                    int i3;
                    int iM6153o;
                    int i4;
                    int iMo320c;
                    int iM6154p;
                    int iM2852i;
                    int i5;
                    int i6;
                    int iM6154p2;
                    int iM6154p3;
                    int iM6155q2;
                    int size;
                    int iM2841G;
                    int iM2849f;
                    int i7;
                    int iM6154p4;
                    int iM6152a;
/* 5 */             Unsafe unsafe = f17211o;
/* 7 */             int i8 = 1048575;
/* 10 */            int i9 = 1048575;
/* 11 */            int i10 = 0;
/* 12 */            int iM6154p5 = 0;
/* 13 */            int i11 = 0;
                    while (true) {
/* 14 */                int[] iArr = this.f17212a;
/* 17 */                if (i10 >= iArr.length) {
/* 1311 */                  this.f17223l.getClass();
/* 1320 */                  int iM6791c = eo3Var.zzc.m6791c() + iM6154p5;
/* 1323 */                  if (this.f17217f) {
/* 1327 */                      this.f17224m.getClass();
/* 1333 */                      un3 un3Var = ((bo3) eo3Var).zza;
/* 1339 */                      int size2 = un3Var.f17607a.f9203b.size();
/* 1343 */                      hq3 hq3Var = un3Var.f17607a;
/* 1346 */                      if (size2 > 0) {
/* 1385 */                          Map.Entry entryM4265a = hq3Var.m4265a(0);
/* 1393 */                          if (entryM4265a.getKey() != null) {
/* 1395 */                              C1697u2.m5431g();
/* 1307 */                              return 0;
                                    }
/* 1399 */                          entryM4265a.getValue();
/* 1402 */                          throw null;
                                }
/* 1352 */                      Iterator it = hq3Var.m4266b().iterator();
/* 1360 */                      if (it.hasNext()) {
/* 1367 */                          Map.Entry entry = (Map.Entry) it.next();
/* 1373 */                          if (entry.getKey() != null) {
/* 1375 */                              C1697u2.m5431g();
/* 1307 */                              return 0;
                                    }
/* 1379 */                          entry.getValue();
/* 1382 */                          throw null;
                                }
                            }
/* 1403 */                  return iM6791c;
                        }
/* 19 */                int iM8840g = m8840g(i10);
/* 23 */                int i12 = iArr[i10];
/* 25 */                int iM8822h = m8822h(iM8840g);
/* 32 */                if (iM8822h <= 17) {
/* 36 */                    int i13 = iArr[i10 + 2];
/* 38 */                    int i14 = i13 & i8;
/* 40 */                    int i15 = i13 >>> 20;
/* 42 */                    if (i14 != i9) {
/* 45 */                        i11 = unsafe.getInt(eo3Var, i14);
/* 49 */                        i9 = i14;
                            }
/* 50 */                    i = 1 << i15;
                        } else {
/* 53 */                    i = 0;
                        }
/* 54 */                long j = iM8840g & i8;
                        switch (iM8822h) {
                            case 0:
/* 1296 */                      if ((i11 & i) != 0) {
/* 153 */                           iM6154p5 = pm2.m7494q(i12 << 3, 8, iM6154p5);
                                }
                                break;
                            case 1:
/* 1290 */                      if ((i11 & i) != 0) {
/* 167 */                           iM6154p5 = pm2.m7494q(i12 << 3, 4, iM6154p5);
                                }
                                break;
                            case 2:
/* 1274 */                      if ((i & i11) != 0) {
/* 1280 */                          i2 = i12 << 3;
/* 1282 */                          iM6155q = kn3.m6155q(unsafe.getLong(eo3Var, j));
/* 365 */                           iM6154p5 = pm2.m7494q(i2, iM6155q, iM6154p5);
                                }
                                break;
                            case 3:
/* 1259 */                      if ((i & i11) != 0) {
/* 1265 */                          i2 = i12 << 3;
/* 1267 */                          iM6155q = kn3.m6155q(unsafe.getLong(eo3Var, j));
/* 365 */                           iM6154p5 = pm2.m7494q(i2, iM6155q, iM6154p5);
                                }
                                break;
                            case 4:
/* 1244 */                      if ((i & i11) != 0) {
/* 1250 */                          i3 = i12 << 3;
/* 1252 */                          iM6153o = kn3.m6153o(unsafe.getInt(eo3Var, j));
/* 189 */                           iM6154p5 = pm2.m7494q(i3, iM6153o, iM6154p5);
                                }
                                break;
                            case 5:
/* 1239 */                      if ((i11 & i) != 0) {
/* 153 */                           iM6154p5 = pm2.m7494q(i12 << 3, 8, iM6154p5);
                                }
                                break;
                            case 6:
/* 1233 */                      if ((i11 & i) != 0) {
/* 167 */                           iM6154p5 = pm2.m7494q(i12 << 3, 4, iM6154p5);
                                }
                                break;
                            case 7:
/* 1227 */                      if ((i11 & i) != 0) {
/* 309 */                           iM6154p5 = pm2.m7494q(i12 << 3, 1, iM6154p5);
                                }
                                break;
                            case 8:
/* 1189 */                      if ((i & i11) != 0) {
/* 1191 */                          Object object = unsafe.getObject(eo3Var, j);
/* 1197 */                          if (object instanceof cn3) {
/* 1201 */                              i4 = i12 << 3;
/* 1203 */                              Logger logger = kn3.f12895e;
/* 1205 */                              iMo320c = ((cn3) object).mo320c();
/* 1209 */                              iM6154p = kn3.m6154p(iMo320c);
/* 237 */                               iM6154p5 = pm2.m7494q(i4, iM6154p + iMo320c, iM6154p5);
                                    } else {
/* 1217 */                              i3 = i12 << 3;
/* 1219 */                              iM6153o = kn3.m6156r((String) object);
/* 189 */                               iM6154p5 = pm2.m7494q(i3, iM6153o, iM6154p5);
                                    }
                                }
                                break;
                            case 9:
/* 1172 */                      if ((i & i11) != 0) {
/* 1182 */                          iM2852i = cq3.m2852i(i12, unsafe.getObject(eo3Var, j), m8833C(i10));
/* 89 */                            iM6154p5 += iM2852i;
                                }
                                break;
                            case 10:
/* 1149 */                      if ((i & i11) != 0) {
/* 1155 */                          cn3 cn3Var = (cn3) unsafe.getObject(eo3Var, j);
/* 1157 */                          i4 = i12 << 3;
/* 1159 */                          Logger logger2 = kn3.f12895e;
/* 1161 */                          iMo320c = cn3Var.mo320c();
/* 1165 */                          iM6154p = kn3.m6154p(iMo320c);
/* 237 */                           iM6154p5 = pm2.m7494q(i4, iM6154p + iMo320c, iM6154p5);
                                }
                                break;
                            case 11:
/* 1134 */                      if ((i & i11) != 0) {
/* 1140 */                          i3 = i12 << 3;
/* 1142 */                          iM6153o = kn3.m6154p(unsafe.getInt(eo3Var, j));
/* 189 */                           iM6154p5 = pm2.m7494q(i3, iM6153o, iM6154p5);
                                }
                                break;
                            case 12:
/* 1119 */                      if ((i & i11) != 0) {
/* 1125 */                          i3 = i12 << 3;
/* 1127 */                          iM6153o = kn3.m6153o(unsafe.getInt(eo3Var, j));
/* 189 */                           iM6154p5 = pm2.m7494q(i3, iM6153o, iM6154p5);
                                }
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1114 */                      if ((i11 & i) != 0) {
/* 167 */                           iM6154p5 = pm2.m7494q(i12 << 3, 4, iM6154p5);
                                }
                                break;
                            case 14:
/* 1108 */                      if ((i11 & i) != 0) {
/* 153 */                           iM6154p5 = pm2.m7494q(i12 << 3, 8, iM6154p5);
                                }
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1088 */                      if ((i & i11) != 0) {
/* 1090 */                          int i16 = unsafe.getInt(eo3Var, j);
/* 1096 */                          i5 = i16 + i16;
/* 1098 */                          i6 = i16 >> 31;
/* 1100 */                          iM6154p2 = kn3.m6154p(i12 << 3);
/* 139 */                           iM6154p5 = pm2.m7494q(i6 ^ i5, iM6154p2, iM6154p5);
                                }
                                break;
                            case 16:
/* 1065 */                      if ((i & i11) != 0) {
/* 1067 */                          long j2 = unsafe.getLong(eo3Var, j);
/* 1076 */                          iM6154p3 = kn3.m6154p(i12 << 3);
/* 1081 */                          iM6155q2 = kn3.m6155q((j2 >> 63) ^ (j2 + j2));
/* 116 */                           iM2852i = iM6155q2 + iM6154p3;
/* 89 */                            iM6154p5 += iM2852i;
                                }
                                break;
                            case 17:
/* 1046 */                      if ((i & i11) != 0) {
/* 1058 */                          iM2852i = kn3.m6152a(i12, (tm3) unsafe.getObject(eo3Var, j), m8833C(i10));
/* 89 */                            iM6154p5 += iM2852i;
                                }
                                break;
                            case 18:
/* 1039 */                      iM2852i = cq3.m2850g(i12, (List) unsafe.getObject(eo3Var, j));
/* 89 */                        iM6154p5 += iM2852i;
                                break;
                            case 19:
/* 1027 */                      iM2852i = cq3.m2848e(i12, (List) unsafe.getObject(eo3Var, j));
/* 89 */                        iM6154p5 += iM2852i;
                                break;
                            case 20:
/* 993 */                       List list = (List) unsafe.getObject(eo3Var, j);
/* 995 */                       Class cls = cq3.f6887a;
/* 1001 */                      if (list.size() == 0) {
/* 753 */                           iM2852i = 0;
                                } else {
/* 1015 */                          iM2852i = pm2.m7495r(i12 << 3, list.size(), cq3.m2840F(list));
                                }
/* 89 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 971 */                       List list2 = (List) unsafe.getObject(eo3Var, j);
/* 973 */                       Class cls2 = cq3.f6887a;
/* 975 */                       size = list2.size();
/* 979 */                       if (size == 0) {
/* 753 */                           iM2852i = 0;
                                } else {
/* 983 */                           iM2841G = cq3.m2841G(list2);
/* 763 */                           iM2852i = pm2.m7495r(i12 << 3, size, iM2841G);
                                }
/* 89 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 949 */                       List list3 = (List) unsafe.getObject(eo3Var, j);
/* 951 */                       Class cls3 = cq3.f6887a;
/* 953 */                       size = list3.size();
/* 957 */                       if (size == 0) {
/* 753 */                           iM2852i = 0;
                                } else {
/* 961 */                           iM2841G = cq3.m2844a(list3);
/* 763 */                           iM2852i = pm2.m7495r(i12 << 3, size, iM2841G);
                                }
/* 89 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 939 */                       iM2852i = cq3.m2850g(i12, (List) unsafe.getObject(eo3Var, j));
/* 89 */                        iM6154p5 += iM2852i;
                                break;
                            case 24:
/* 927 */                       iM2852i = cq3.m2848e(i12, (List) unsafe.getObject(eo3Var, j));
/* 89 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 897 */                       List list4 = (List) unsafe.getObject(eo3Var, j);
/* 899 */                       Class cls4 = cq3.f6887a;
/* 901 */                       int size3 = list4.size();
/* 918 */                       iM6154p5 += size3 == 0 ? 0 : (kn3.m6154p(i12 << 3) + 1) * size3;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 887 */                       iM2852i = cq3.m2851h(i12, (List) unsafe.getObject(eo3Var, j));
/* 89 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 875 */                       iM2852i = cq3.m2853j(i12, (List) unsafe.getObject(eo3Var, j), m8833C(i10));
/* 89 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 859 */                       iM2852i = cq3.m2854k(i12, (List) unsafe.getObject(eo3Var, j));
/* 89 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 837 */                       List list5 = (List) unsafe.getObject(eo3Var, j);
/* 839 */                       Class cls5 = cq3.f6887a;
/* 841 */                       size = list5.size();
/* 845 */                       if (size == 0) {
/* 753 */                           iM2852i = 0;
                                } else {
/* 848 */                           iM2841G = cq3.m2845b(list5);
/* 763 */                           iM2852i = pm2.m7495r(i12 << 3, size, iM2841G);
                                }
/* 89 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 817 */                       List list6 = (List) unsafe.getObject(eo3Var, j);
/* 819 */                       Class cls6 = cq3.f6887a;
/* 821 */                       size = list6.size();
/* 825 */                       if (size == 0) {
/* 753 */                           iM2852i = 0;
                                } else {
/* 828 */                           iM2841G = cq3.m2843I(list6);
/* 763 */                           iM2852i = pm2.m7495r(i12 << 3, size, iM2841G);
                                }
/* 89 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 807 */                       iM2852i = cq3.m2848e(i12, (List) unsafe.getObject(eo3Var, j));
/* 89 */                        iM6154p5 += iM2852i;
                                break;
                            case 32:
/* 795 */                       iM2852i = cq3.m2850g(i12, (List) unsafe.getObject(eo3Var, j));
/* 89 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 773 */                       List list7 = (List) unsafe.getObject(eo3Var, j);
/* 775 */                       Class cls7 = cq3.f6887a;
/* 777 */                       size = list7.size();
/* 781 */                       if (size == 0) {
/* 753 */                           iM2852i = 0;
                                } else {
/* 784 */                           iM2841G = cq3.m2846c(list7);
/* 763 */                           iM2852i = pm2.m7495r(i12 << 3, size, iM2841G);
                                }
/* 89 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 743 */                       List list8 = (List) unsafe.getObject(eo3Var, j);
/* 745 */                       Class cls8 = cq3.f6887a;
/* 747 */                       size = list8.size();
/* 751 */                       if (size == 0) {
/* 753 */                           iM2852i = 0;
                                } else {
/* 757 */                           iM2841G = cq3.m2842H(list8);
/* 763 */                           iM2852i = pm2.m7495r(i12 << 3, size, iM2841G);
                                }
/* 89 */                        iM6154p5 += iM2852i;
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 725 */                       iM2849f = cq3.m2849f((List) unsafe.getObject(eo3Var, j));
/* 729 */                       if (iM2849f > 0) {
/* 731 */                           i7 = i12 << 3;
/* 733 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 477 */                           iM6154p5 = pm2.m7492o(i7, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 705 */                       iM2849f = cq3.m2847d((List) unsafe.getObject(eo3Var, j));
/* 709 */                       if (iM2849f > 0) {
/* 711 */                           i7 = i12 << 3;
/* 713 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 477 */                           iM6154p5 = pm2.m7492o(i7, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 37:
/* 685 */                       iM2849f = cq3.m2840F((List) unsafe.getObject(eo3Var, j));
/* 689 */                       if (iM2849f > 0) {
/* 691 */                           i7 = i12 << 3;
/* 693 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 477 */                           iM6154p5 = pm2.m7492o(i7, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 38:
/* 665 */                       iM2849f = cq3.m2841G((List) unsafe.getObject(eo3Var, j));
/* 669 */                       if (iM2849f > 0) {
/* 671 */                           i7 = i12 << 3;
/* 673 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 477 */                           iM6154p5 = pm2.m7492o(i7, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 39:
/* 645 */                       iM2849f = cq3.m2844a((List) unsafe.getObject(eo3Var, j));
/* 649 */                       if (iM2849f > 0) {
/* 651 */                           i7 = i12 << 3;
/* 653 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 477 */                           iM6154p5 = pm2.m7492o(i7, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 625 */                       iM2849f = cq3.m2849f((List) unsafe.getObject(eo3Var, j));
/* 629 */                       if (iM2849f > 0) {
/* 631 */                           i7 = i12 << 3;
/* 633 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 477 */                           iM6154p5 = pm2.m7492o(i7, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 605 */                       iM2849f = cq3.m2847d((List) unsafe.getObject(eo3Var, j));
/* 609 */                       if (iM2849f > 0) {
/* 611 */                           i7 = i12 << 3;
/* 613 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 477 */                           iM6154p5 = pm2.m7492o(i7, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 42:
/* 582 */                       List list9 = (List) unsafe.getObject(eo3Var, j);
/* 584 */                       Class cls9 = cq3.f6887a;
/* 586 */                       iM2849f = list9.size();
/* 590 */                       if (iM2849f > 0) {
/* 592 */                           i7 = i12 << 3;
/* 594 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 477 */                           iM6154p5 = pm2.m7492o(i7, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 43:
/* 565 */                       iM2849f = cq3.m2845b((List) unsafe.getObject(eo3Var, j));
/* 569 */                       if (iM2849f > 0) {
/* 571 */                           i7 = i12 << 3;
/* 573 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 477 */                           iM6154p5 = pm2.m7492o(i7, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 44:
/* 546 */                       iM2849f = cq3.m2843I((List) unsafe.getObject(eo3Var, j));
/* 550 */                       if (iM2849f > 0) {
/* 552 */                           i7 = i12 << 3;
/* 554 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 477 */                           iM6154p5 = pm2.m7492o(i7, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 45:
/* 527 */                       iM2849f = cq3.m2847d((List) unsafe.getObject(eo3Var, j));
/* 531 */                       if (iM2849f > 0) {
/* 533 */                           i7 = i12 << 3;
/* 535 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 477 */                           iM6154p5 = pm2.m7492o(i7, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 46:
/* 508 */                       iM2849f = cq3.m2849f((List) unsafe.getObject(eo3Var, j));
/* 512 */                       if (iM2849f > 0) {
/* 514 */                           i7 = i12 << 3;
/* 516 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 477 */                           iM6154p5 = pm2.m7492o(i7, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 47:
/* 489 */                       iM2849f = cq3.m2846c((List) unsafe.getObject(eo3Var, j));
/* 493 */                       if (iM2849f > 0) {
/* 495 */                           i7 = i12 << 3;
/* 497 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 477 */                           iM6154p5 = pm2.m7492o(i7, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 48:
/* 465 */                       iM2849f = cq3.m2842H((List) unsafe.getObject(eo3Var, j));
/* 469 */                       if (iM2849f > 0) {
/* 471 */                           i7 = i12 << 3;
/* 473 */                           iM6154p4 = kn3.m6154p(iM2849f);
/* 477 */                           iM6154p5 = pm2.m7492o(i7, iM6154p4, iM2849f, iM6154p5);
                                }
                                break;
                            case 49:
/* 421 */                       List list10 = (List) unsafe.getObject(eo3Var, j);
/* 423 */                       bq3 bq3VarM8833C = m8833C(i10);
/* 427 */                       Class cls10 = cq3.f6887a;
/* 429 */                       int size4 = list10.size();
/* 433 */                       if (size4 != 0) {
/* 437 */                           iM6152a = 0;
/* 438 */                           for (int i17 = 0; i17 < size4; i17++) {
/* 450 */                               iM6152a += kn3.m6152a(i12, (tm3) list10.get(i17), bq3VarM8833C);
                                    }
                                } else {
/* 454 */                           iM6152a = 0;
                                }
/* 456 */                       iM6154p5 += iM6152a;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 412 */                       np3.m7019a(unsafe.getObject(eo3Var, j), m8834D(i10));
                                break;
                            case 51:
/* 400 */                       if (m8844p(i12, eo3Var, i10)) {
/* 153 */                           iM6154p5 = pm2.m7494q(i12 << 3, 8, iM6154p5);
                                }
                                break;
                            case 52:
/* 392 */                       if (m8844p(i12, eo3Var, i10)) {
/* 167 */                           iM6154p5 = pm2.m7494q(i12 << 3, 4, iM6154p5);
                                }
                                break;
                            case 53:
/* 375 */                       if (m8844p(i12, eo3Var, i10)) {
/* 381 */                           i2 = i12 << 3;
/* 383 */                           iM6155q = kn3.m6155q(m8826l(eo3Var, j));
/* 365 */                           iM6154p5 = pm2.m7494q(i2, iM6155q, iM6154p5);
                                }
                                break;
                            case 54:
/* 353 */                       if (m8844p(i12, eo3Var, i10)) {
/* 359 */                           i2 = i12 << 3;
/* 361 */                           iM6155q = kn3.m6155q(m8826l(eo3Var, j));
/* 365 */                           iM6154p5 = pm2.m7494q(i2, iM6155q, iM6154p5);
                                }
                                break;
                            case 55:
/* 335 */                       if (m8844p(i12, eo3Var, i10)) {
/* 341 */                           i3 = i12 << 3;
/* 343 */                           iM6153o = kn3.m6153o(m8825k(eo3Var, j));
/* 189 */                           iM6154p5 = pm2.m7494q(i3, iM6153o, iM6154p5);
                                }
                                break;
                            case 56:
/* 327 */                       if (m8844p(i12, eo3Var, i10)) {
/* 153 */                           iM6154p5 = pm2.m7494q(i12 << 3, 8, iM6154p5);
                                }
                                break;
                            case 57:
/* 319 */                       if (m8844p(i12, eo3Var, i10)) {
/* 167 */                           iM6154p5 = pm2.m7494q(i12 << 3, 4, iM6154p5);
                                }
                                break;
                            case 58:
/* 305 */                       if (m8844p(i12, eo3Var, i10)) {
/* 309 */                           iM6154p5 = pm2.m7494q(i12 << 3, 1, iM6154p5);
                                }
                                break;
                            case 59:
/* 267 */                       if (m8844p(i12, eo3Var, i10)) {
/* 269 */                           Object object2 = unsafe.getObject(eo3Var, j);
/* 275 */                           if (object2 instanceof cn3) {
/* 279 */                               i4 = i12 << 3;
/* 281 */                               Logger logger3 = kn3.f12895e;
/* 283 */                               iMo320c = ((cn3) object2).mo320c();
/* 287 */                               iM6154p = kn3.m6154p(iMo320c);
/* 237 */                               iM6154p5 = pm2.m7494q(i4, iM6154p + iMo320c, iM6154p5);
                                    } else {
/* 294 */                               i3 = i12 << 3;
/* 296 */                               iM6153o = kn3.m6156r((String) object2);
/* 189 */                               iM6154p5 = pm2.m7494q(i3, iM6153o, iM6154p5);
                                    }
                                }
                                break;
                            case 60:
/* 247 */                       if (m8844p(i12, eo3Var, i10)) {
/* 257 */                           iM2852i = cq3.m2852i(i12, unsafe.getObject(eo3Var, j), m8833C(i10));
/* 89 */                            iM6154p5 += iM2852i;
                                }
                                break;
                            case 61:
/* 216 */                       if (m8844p(i12, eo3Var, i10)) {
/* 222 */                           cn3 cn3Var2 = (cn3) unsafe.getObject(eo3Var, j);
/* 224 */                           i4 = i12 << 3;
/* 226 */                           Logger logger4 = kn3.f12895e;
/* 228 */                           iMo320c = cn3Var2.mo320c();
/* 232 */                           iM6154p = kn3.m6154p(iMo320c);
/* 237 */                           iM6154p5 = pm2.m7494q(i4, iM6154p + iMo320c, iM6154p5);
                                }
                                break;
                            case 62:
/* 199 */                       if (m8844p(i12, eo3Var, i10)) {
/* 205 */                           i3 = i12 << 3;
/* 207 */                           iM6153o = kn3.m6154p(m8825k(eo3Var, j));
/* 189 */                           iM6154p5 = pm2.m7494q(i3, iM6153o, iM6154p5);
                                }
                                break;
                            case 63:
/* 177 */                       if (m8844p(i12, eo3Var, i10)) {
/* 183 */                           i3 = i12 << 3;
/* 185 */                           iM6153o = kn3.m6153o(m8825k(eo3Var, j));
/* 189 */                           iM6154p5 = pm2.m7494q(i3, iM6153o, iM6154p5);
                                }
                                break;
                            case 64:
/* 163 */                       if (m8844p(i12, eo3Var, i10)) {
/* 167 */                           iM6154p5 = pm2.m7494q(i12 << 3, 4, iM6154p5);
                                }
                                break;
                            case 65:
/* 149 */                       if (m8844p(i12, eo3Var, i10)) {
/* 153 */                           iM6154p5 = pm2.m7494q(i12 << 3, 8, iM6154p5);
                                }
                                break;
                            case 66:
/* 122 */                       if (m8844p(i12, eo3Var, i10)) {
/* 124 */                           int iM8825k = m8825k(eo3Var, j);
/* 130 */                           i5 = iM8825k + iM8825k;
/* 132 */                           i6 = iM8825k >> 31;
/* 134 */                           iM6154p2 = kn3.m6154p(i12 << 3);
/* 139 */                           iM6154p5 = pm2.m7494q(i6 ^ i5, iM6154p2, iM6154p5);
                                }
                                break;
                            case 67:
/* 96 */                        if (m8844p(i12, eo3Var, i10)) {
/* 98 */                            long jM8826l = m8826l(eo3Var, j);
/* 107 */                           iM6154p3 = kn3.m6154p(i12 << 3);
/* 112 */                           iM6155q2 = kn3.m6155q((jM8826l >> 63) ^ (jM8826l + jM8826l));
/* 116 */                           iM2852i = iM6155q2 + iM6154p3;
/* 89 */                            iM6154p5 += iM2852i;
                                }
                                break;
                            case 68:
/* 73 */                        if (m8844p(i12, eo3Var, i10)) {
/* 85 */                            iM2852i = kn3.m6152a(i12, (tm3) unsafe.getObject(eo3Var, j), m8833C(i10));
/* 89 */                            iM6154p5 += iM2852i;
                                }
                                break;
                        }
/* 1300 */              i10 += 3;
/* 1302 */              i8 = 1048575;
                    }
                }

                /* JADX INFO: renamed from: z */
                public final int m8850z(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, ym3 ym3Var) throws uo3 {
/* 8 */             Unsafe unsafe = f17211o;
/* 14 */            ro3 ro3VarMo8221I = (ro3) unsafe.getObject(obj, j2);
/* 21 */            if (!((vm3) ro3VarMo8221I).f18251a) {
/* 23 */                int size = ro3VarMo8221I.size();
/* 33 */                ro3VarMo8221I = ro3VarMo8221I.mo8221I(size == 0 ? 10 : size + size);
/* 37 */                unsafe.putObject(obj, j2, ro3VarMo8221I);
                    }
                    switch (i7) {
                        case 18:
                        case Build.API_LEVELS.API_35 /* 35 */:
/* 588 */                   if (i5 == 2) {
/* 597 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 590 */                   if (i5 == 1) {
/* 593 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 592 */                   return i;
                        case 19:
                        case Build.API_LEVELS.API_36 /* 36 */:
/* 575 */                   if (i5 == 2) {
/* 584 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 577 */                   if (i5 == 5) {
/* 580 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 592 */                   return i;
                        case 20:
                        case Build.API_LEVELS.API_21 /* 21 */:
                        case 37:
                        case 38:
/* 562 */                   if (i5 == 2) {
/* 571 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 564 */                   if (i5 == 0) {
/* 567 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 592 */                   return i;
                        case Build.API_LEVELS.API_22 /* 22 */:
                        case Build.API_LEVELS.API_29 /* 29 */:
                        case 39:
                        case 43:
/* 549 */                   if (i5 == 2) {
/* 558 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 551 */                   if (i5 == 0) {
/* 554 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 592 */                   return i;
                        case Build.API_LEVELS.API_23 /* 23 */:
                        case 32:
                        case RequestError.NETWORK_FAILURE /* 40 */:
                        case 46:
/* 536 */                   if (i5 == 2) {
/* 545 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 538 */                   if (i5 == 1) {
/* 541 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 592 */                   return i;
                        case 24:
                        case Build.API_LEVELS.API_31 /* 31 */:
                        case RequestError.NO_DEV_KEY /* 41 */:
                        case 45:
/* 523 */                   if (i5 == 2) {
/* 532 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 525 */                   if (i5 == 5) {
/* 528 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 592 */                   return i;
                        case Build.API_LEVELS.API_25 /* 25 */:
                        case 42:
/* 510 */                   if (i5 == 2) {
/* 519 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 512 */                   if (i5 == 0) {
/* 515 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 592 */                   return i;
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 317 */                   if (i5 == 2) {
/* 330 */                       if ((j & 536870912) == 0) {
/* 332 */                           int iM9416Z = w11.m9416Z(bArr, i, ym3Var);
/* 336 */                           int i8 = ym3Var.f19707a;
/* 338 */                           if (i8 < 0) {
/* 402 */                               throw uo3.m9057b();
                                    }
/* 340 */                           if (i8 == 0) {
/* 342 */                               ro3VarMo8221I.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                    } else {
/* 353 */                               ro3VarMo8221I.add(new String(bArr, iM9416Z, i8, so3.f16726a));
/* 356 */                               iM9416Z += i8;
                                    }
/* 357 */                           while (iM9416Z < i2) {
/* 359 */                               int iM9416Z2 = w11.m9416Z(bArr, iM9416Z, ym3Var);
/* 365 */                               if (i3 != ym3Var.f19707a) {
/* 397 */                                   return iM9416Z;
                                        }
/* 367 */                               iM9416Z = w11.m9416Z(bArr, iM9416Z2, ym3Var);
/* 371 */                               int i9 = ym3Var.f19707a;
/* 373 */                               if (i9 < 0) {
/* 396 */                                   throw uo3.m9057b();
                                        }
/* 375 */                               if (i9 == 0) {
/* 377 */                                   ro3VarMo8221I.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                        } else {
/* 388 */                                   ro3VarMo8221I.add(new String(bArr, iM9416Z, i9, so3.f16726a));
/* 356 */                                   iM9416Z += i9;
                                        }
                                    }
/* 397 */                           return iM9416Z;
                                }
/* 403 */                       int iM9416Z3 = w11.m9416Z(bArr, i, ym3Var);
/* 407 */                       int i10 = ym3Var.f19707a;
/* 409 */                       if (i10 < 0) {
/* 509 */                           throw uo3.m9057b();
                                }
/* 411 */                       if (i10 == 0) {
/* 413 */                           ro3VarMo8221I.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                } else {
/* 417 */                           int i11 = iM9416Z3 + i10;
/* 421 */                           zq3.f20295a.getClass();
/* 428 */                           if (!cg3.m1652a(bArr, iM9416Z3, i11)) {
/* 504 */                               throw uo3.m9059d();
                                    }
/* 437 */                           ro3VarMo8221I.add(new String(bArr, iM9416Z3, i10, so3.f16726a));
/* 440 */                           iM9416Z3 = i11;
                                }
/* 441 */                       while (iM9416Z3 < i2) {
/* 443 */                           int iM9416Z4 = w11.m9416Z(bArr, iM9416Z3, ym3Var);
/* 449 */                           if (i3 != ym3Var.f19707a) {
/* 499 */                               return iM9416Z3;
                                    }
/* 451 */                           iM9416Z3 = w11.m9416Z(bArr, iM9416Z4, ym3Var);
/* 455 */                           int i12 = ym3Var.f19707a;
/* 457 */                           if (i12 < 0) {
/* 498 */                               throw uo3.m9057b();
                                    }
/* 459 */                           if (i12 == 0) {
/* 461 */                               ro3VarMo8221I.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                    } else {
/* 465 */                               int i13 = iM9416Z3 + i12;
/* 469 */                               zq3.f20295a.getClass();
/* 476 */                               if (!cg3.m1652a(bArr, iM9416Z3, i13)) {
/* 493 */                                   throw uo3.m9059d();
                                        }
/* 485 */                               ro3VarMo8221I.add(new String(bArr, iM9416Z3, i12, so3.f16726a));
/* 440 */                               iM9416Z3 = i13;
                                    }
                                }
/* 499 */                       return iM9416Z3;
                            }
/* 592 */                   return i;
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 290 */                   if (i5 == 2) {
/* 310 */                       return w11.m9441m0(m8833C(i6), i3, bArr, i, i2, ro3VarMo8221I, ym3Var);
                            }
/* 592 */                   return i;
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 198 */                   if (i5 == 2) {
/* 200 */                       int iM9416Z5 = w11.m9416Z(bArr, i, ym3Var);
/* 204 */                       int i14 = ym3Var.f19707a;
/* 206 */                       if (i14 < 0) {
/* 287 */                           throw uo3.m9057b();
                                }
/* 210 */                       if (i14 > bArr.length - iM9416Z5) {
/* 282 */                           throw uo3.m9056a();
                                }
/* 212 */                       if (i14 == 0) {
/* 216 */                           ro3VarMo8221I.add(cn3.f3019b);
                                } else {
/* 224 */                           ro3VarMo8221I.add(cn3.m1731d(bArr, iM9416Z5, i14));
/* 227 */                           iM9416Z5 += i14;
                                }
/* 228 */                       while (iM9416Z5 < i2) {
/* 230 */                           int iM9416Z6 = w11.m9416Z(bArr, iM9416Z5, ym3Var);
/* 236 */                           if (i3 != ym3Var.f19707a) {
/* 277 */                               return iM9416Z5;
                                    }
/* 239 */                           iM9416Z5 = w11.m9416Z(bArr, iM9416Z6, ym3Var);
/* 243 */                           int i15 = ym3Var.f19707a;
/* 245 */                           if (i15 < 0) {
/* 276 */                               throw uo3.m9057b();
                                    }
/* 249 */                           if (i15 > bArr.length - iM9416Z5) {
/* 271 */                               throw uo3.m9056a();
                                    }
/* 251 */                           if (i15 == 0) {
/* 255 */                               ro3VarMo8221I.add(cn3.f3019b);
                                    } else {
/* 263 */                               ro3VarMo8221I.add(cn3.m1731d(bArr, iM9416Z5, i15));
/* 227 */                               iM9416Z5 += i15;
                                    }
                                }
/* 277 */                       return iM9416Z5;
                            }
/* 592 */                   return i;
                        case Build.API_LEVELS.API_30 /* 30 */:
                        case 44:
/* 182 */                   if (i5 == 2) {
/* 192 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 184 */                   if (i5 == 0) {
/* 188 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 592 */                   return i;
                        case Build.API_LEVELS.API_33 /* 33 */:
                        case 47:
/* 168 */                   if (i5 == 2) {
/* 178 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 170 */                   if (i5 == 0) {
/* 174 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 592 */                   return i;
                        case Build.API_LEVELS.API_34 /* 34 */:
                        case 48:
/* 154 */                   if (i5 == 2) {
/* 164 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 156 */                   if (i5 == 0) {
/* 160 */                       C1697u2.m5431g();
/* 40 */                        return 0;
                            }
/* 592 */                   return i;
                        default:
/* 48 */                    if (i5 == 3) {
/* 50 */                        bq3 bq3VarM8833C = m8833C(i6);
/* 56 */                        int i16 = (i3 & (-8)) | 4;
/* 58 */                        Object objZza = bq3VarM8833C.zza();
/* 63 */                        tp3 tp3Var = (tp3) bq3VarM8833C;
/* 79 */                        int iM8846t = tp3Var.m8846t(objZza, bArr, i, i2, i16, ym3Var);
/* 87 */                        int i17 = i16;
/* 89 */                        ym3 ym3Var2 = ym3Var;
/* 91 */                        ym3Var2.f19709c = objZza;
/* 93 */                        bq3VarM8833C.zzj(objZza);
/* 96 */                        ym3Var2.f19709c = objZza;
/* 98 */                        ro3VarMo8221I.add(objZza);
/* 101 */                       while (iM8846t < i2) {
/* 103 */                           int iM9416Z7 = w11.m9416Z(bArr, iM8846t, ym3Var2);
/* 109 */                           if (i3 != ym3Var2.f19707a) {
/* 153 */                               return iM8846t;
                                    }
/* 112 */                           Object objZza2 = bq3VarM8833C.zza();
/* 122 */                           ym3 ym3Var3 = ym3Var2;
/* 124 */                           int i18 = i17;
/* 130 */                           iM8846t = tp3Var.m8846t(objZza2, bArr, iM9416Z7, i2, i18, ym3Var3);
/* 140 */                           ym3Var3.f19709c = objZza2;
/* 142 */                           bq3VarM8833C.zzj(objZza2);
/* 145 */                           ym3Var3.f19709c = objZza2;
/* 147 */                           ro3VarMo8221I.add(objZza2);
/* 150 */                           i17 = i18;
/* 151 */                           ym3Var2 = ym3Var3;
                                }
/* 153 */                       return iM8846t;
                            }
/* 592 */                   return i;
                    }
                }

                @Override // p000.bq3
                public final Object zza() {
/* 11 */            return (eo3) ((eo3) this.f17216e).mo317l(4, null);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:7:0x001f  */
                @Override // p000.bq3
                public final void zzd(Object obj, Object obj2) {
                    Object obj3;
/* 1 */             m8824j(obj);
/* 4 */             obj2.getClass();
/* 7 */             int i = 0;
                    while (true) {
/* 8 */                 int[] iArr = this.f17212a;
/* 11 */                if (i >= iArr.length) {
/* 418 */                   Object obj4 = obj;
/* 421 */                   cq3.m2857n(this.f17223l, obj4, obj2);
/* 426 */                   if (this.f17217f) {
/* 430 */                       cq3.m2856m(this.f17224m, obj4, obj2);
/* 433 */                       return;
                            }
/* 433 */                   return;
                        }
/* 13 */                int iM8840g = m8840g(i);
/* 22 */                int i2 = iArr[i];
/* 20 */                long j = iM8840g & 1048575;
                        switch (m8822h(iM8840g)) {
                            case 0:
/* 398 */                       if (!m8842n(i, obj2)) {
/* 32 */                            obj3 = obj;
                                } else {
/* 400 */                           sq3 sq3Var = tq3.f17232c;
/* 406 */                           obj3 = obj;
/* 407 */                           sq3Var.mo8001z(obj3, j, sq3Var.mo8000x(obj2, j));
/* 410 */                           m8843o(i, obj3);
                                }
                                break;
                            case 1:
/* 378 */                       if (m8842n(i, obj2)) {
/* 380 */                           sq3 sq3Var2 = tq3.f17232c;
/* 386 */                           sq3Var2.mo7999w(obj, j, sq3Var2.mo7998u(obj2, j));
/* 389 */                           m8843o(i, obj);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case 2:
/* 360 */                       if (m8842n(i, obj2)) {
/* 366 */                           tq3.m8871i(obj, j, tq3.m8870h(obj2, j));
/* 369 */                           m8843o(i, obj);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case 3:
/* 342 */                       if (m8842n(i, obj2)) {
/* 348 */                           tq3.m8871i(obj, j, tq3.m8870h(obj2, j));
/* 351 */                           m8843o(i, obj);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case 4:
/* 324 */                       if (m8842n(i, obj2)) {
/* 330 */                           tq3.m8869g(obj, j, tq3.m8868f(obj2, j));
/* 333 */                           m8843o(i, obj);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case 5:
/* 306 */                       if (m8842n(i, obj2)) {
/* 312 */                           tq3.m8871i(obj, j, tq3.m8870h(obj2, j));
/* 315 */                           m8843o(i, obj);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case 6:
/* 288 */                       if (m8842n(i, obj2)) {
/* 294 */                           tq3.m8869g(obj, j, tq3.m8868f(obj2, j));
/* 297 */                           m8843o(i, obj);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case 7:
/* 268 */                       if (m8842n(i, obj2)) {
/* 270 */                           sq3 sq3Var3 = tq3.f17232c;
/* 276 */                           sq3Var3.mo7997s(obj, j, sq3Var3.mo7996q(obj2, j));
/* 279 */                           m8843o(i, obj);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case 8:
/* 250 */                       if (m8842n(i, obj2)) {
/* 256 */                           tq3.m8873k(obj, j, tq3.m8872j(obj2, j));
/* 259 */                           m8843o(i, obj);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case 9:
/* 241 */                       m8847w(obj, obj2, i);
/* 32 */                        obj3 = obj;
                                break;
                            case 10:
/* 227 */                       if (m8842n(i, obj2)) {
/* 233 */                           tq3.m8873k(obj, j, tq3.m8872j(obj2, j));
/* 236 */                           m8843o(i, obj);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case 11:
/* 209 */                       if (m8842n(i, obj2)) {
/* 215 */                           tq3.m8869g(obj, j, tq3.m8868f(obj2, j));
/* 218 */                           m8843o(i, obj);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case 12:
/* 191 */                       if (m8842n(i, obj2)) {
/* 197 */                           tq3.m8869g(obj, j, tq3.m8868f(obj2, j));
/* 200 */                           m8843o(i, obj);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 173 */                       if (m8842n(i, obj2)) {
/* 179 */                           tq3.m8869g(obj, j, tq3.m8868f(obj2, j));
/* 182 */                           m8843o(i, obj);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case 14:
/* 155 */                       if (m8842n(i, obj2)) {
/* 161 */                           tq3.m8871i(obj, j, tq3.m8870h(obj2, j));
/* 164 */                           m8843o(i, obj);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 138 */                       if (m8842n(i, obj2)) {
/* 144 */                           tq3.m8869g(obj, j, tq3.m8868f(obj2, j));
/* 147 */                           m8843o(i, obj);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case 16:
/* 121 */                       if (m8842n(i, obj2)) {
/* 127 */                           tq3.m8871i(obj, j, tq3.m8870h(obj2, j));
/* 130 */                           m8843o(i, obj);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case 17:
/* 113 */                       m8847w(obj, obj2, i);
/* 32 */                        obj3 = obj;
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case Build.API_LEVELS.API_21 /* 21 */:
                            case Build.API_LEVELS.API_22 /* 22 */:
                            case Build.API_LEVELS.API_23 /* 23 */:
                            case 24:
                            case Build.API_LEVELS.API_25 /* 25 */:
                            case Build.API_LEVELS.API_26 /* 26 */:
                            case Build.API_LEVELS.API_27 /* 27 */:
                            case Build.API_LEVELS.API_28 /* 28 */:
                            case Build.API_LEVELS.API_29 /* 29 */:
                            case Build.API_LEVELS.API_30 /* 30 */:
                            case Build.API_LEVELS.API_31 /* 31 */:
                            case 32:
                            case Build.API_LEVELS.API_33 /* 33 */:
                            case Build.API_LEVELS.API_34 /* 34 */:
                            case Build.API_LEVELS.API_35 /* 35 */:
                            case Build.API_LEVELS.API_36 /* 36 */:
                            case 37:
                            case 38:
                            case 39:
                            case RequestError.NETWORK_FAILURE /* 40 */:
                            case RequestError.NO_DEV_KEY /* 41 */:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
/* 109 */                       this.f17222k.mo2829b(obj, obj2, j);
/* 32 */                        obj3 = obj;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 89 */                        Class cls = cq3.f6887a;
/* 103 */                       tq3.m8873k(obj, j, np3.m7020b(tq3.m8872j(obj, j), tq3.m8872j(obj2, j)));
/* 32 */                        obj3 = obj;
                                break;
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
/* 70 */                        if (m8844p(i2, obj2, i)) {
/* 76 */                            tq3.m8873k(obj, j, tq3.m8872j(obj2, j));
/* 85 */                            tq3.m8869g(obj, iArr[i + 2] & 1048575, i2);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case 60:
/* 62 */                        m8848x(obj, obj2, i);
/* 32 */                        obj3 = obj;
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
/* 43 */                        if (m8844p(i2, obj2, i)) {
/* 49 */                            tq3.m8873k(obj, j, tq3.m8872j(obj2, j));
/* 58 */                            tq3.m8869g(obj, iArr[i + 2] & 1048575, i2);
                                }
/* 32 */                        obj3 = obj;
                                break;
                            case 68:
/* 35 */                        m8848x(obj, obj2, i);
/* 32 */                        obj3 = obj;
                                break;
                            default:
/* 32 */                        obj3 = obj;
                                break;
                        }
/* 413 */               i += 3;
/* 415 */               obj = obj3;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:25:0x0068  */
                /* JADX WARN: Code duplicated, block: B:27:0x006e  */
                /* JADX WARN: Code duplicated, block: B:43:0x007b A[SYNTHETIC] */
                @Override // p000.bq3
                public final void zzj(Object obj) {
/* 5 */             if (m8823i(obj)) {
/* 12 */                if (obj instanceof eo3) {
/* 15 */                    eo3 eo3Var = (eo3) obj;
/* 17 */                    eo3Var.m3541c();
/* 20 */                    eo3Var.zzb = 0;
/* 22 */                    eo3Var.m3546n();
                        }
/* 25 */                int[] iArr = this.f17212a;
/* 27 */                int length = iArr.length;
/* 29 */                for (int i = 0; i < length; i += 3) {
/* 31 */                    int iM8840g = m8840g(i);
/* 38 */                    int i2 = 1048575 & iM8840g;
/* 39 */                    int iM8822h = m8822h(iM8840g);
                            long j = i2;
/* 46 */                    if (iM8822h != 9) {
/* 50 */                        if (iM8822h != 60 && iM8822h != 68) {
                                    switch (iM8822h) {
                                        case 17:
/* 109 */                                   if (m8842n(i, obj)) {
/* 121 */                                       m8833C(i).zzj(f17211o.getObject(obj, j));
                                            }
                                            break;
                                        case 18:
                                        case 19:
                                        case 20:
                                        case Build.API_LEVELS.API_21 /* 21 */:
                                        case Build.API_LEVELS.API_22 /* 22 */:
                                        case Build.API_LEVELS.API_23 /* 23 */:
                                        case 24:
                                        case Build.API_LEVELS.API_25 /* 25 */:
                                        case Build.API_LEVELS.API_26 /* 26 */:
                                        case Build.API_LEVELS.API_27 /* 27 */:
                                        case Build.API_LEVELS.API_28 /* 28 */:
                                        case Build.API_LEVELS.API_29 /* 29 */:
                                        case Build.API_LEVELS.API_30 /* 30 */:
                                        case Build.API_LEVELS.API_31 /* 31 */:
                                        case 32:
                                        case Build.API_LEVELS.API_33 /* 33 */:
                                        case Build.API_LEVELS.API_34 /* 34 */:
                                        case Build.API_LEVELS.API_35 /* 35 */:
                                        case Build.API_LEVELS.API_36 /* 36 */:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case RequestError.NETWORK_FAILURE /* 40 */:
                                        case RequestError.NO_DEV_KEY /* 41 */:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
/* 79 */                                    this.f17222k.mo2828a(obj, j);
                                            break;
                                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 60 */                                    Unsafe unsafe = f17211o;
/* 62 */                                    Object object = unsafe.getObject(obj, j);
/* 66 */                                    if (object != null) {
/* 71 */                                        ((lp3) object).f13449a = false;
/* 73 */                                        unsafe.putObject(obj, j, object);
                                            }
                                            break;
                                    }
                                } else if (m8844p(iArr[i], obj, i)) {
/* 101 */                           m8833C(i).zzj(f17211o.getObject(obj, j));
                                }
                            } else if (m8842n(i, obj)) {
/* 121 */                       m8833C(i).zzj(f17211o.getObject(obj, j));
                            }
                        }
/* 129 */               this.f17223l.getClass();
/* 135 */               mq3 mq3Var = ((eo3) obj).zzc;
/* 139 */               if (mq3Var.f13982e) {
/* 141 */                   mq3Var.f13982e = false;
                        }
/* 145 */               if (this.f17217f) {
/* 149 */                   this.f17224m.getClass();
/* 156 */                   ((bo3) obj).zza.m9044a();
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:19:0x0043  */
                /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
                /* JADX WARN: Code duplicated, block: B:55:0x00c8  */
                /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
                @Override // p000.bq3
                public final boolean zzk(Object obj) {
                    int iM8822h;
/* 5 */             int i = 0;
/* 6 */             int i2 = 0;
/* 7 */             int i3 = 1048575;
                    while (true) {
/* 10 */                boolean zM8842n = true;
/* 11 */                if (i >= this.f17220i) {
/* 232 */                   if (this.f17217f) {
/* 236 */                       this.f17224m.getClass();
/* 243 */                       ((bo3) obj).zza.m9047d();
                            }
/* 10 */                    return true;
                        }
/* 15 */                int i4 = this.f17219h[i];
/* 17 */                int[] iArr = this.f17212a;
/* 19 */                int i5 = iArr[i4];
/* 21 */                int iM8840g = m8840g(i4);
/* 27 */                int i6 = iArr[i4 + 2];
/* 29 */                int i7 = i6 & 1048575;
/* 33 */                int i8 = 1 << (i6 >>> 20);
/* 35 */                if (i7 != i3) {
/* 37 */                    if (i7 != 1048575) {
/* 42 */                        i2 = f17211o.getInt(obj, i7);
                            }
/* 46 */                    i3 = i7;
                        }
/* 50 */                if ((268435456 & iM8840g) == 0) {
/* 68 */                    iM8822h = m8822h(iM8840g);
/* 74 */                    if (iM8822h != 9 || iM8822h == 17) {
/* 194 */                       if (i3 == 1048575) {
/* 196 */                           zM8842n = m8842n(i4, obj);
                                } else if ((i8 & i2) == 0) {
/* 205 */                           zM8842n = false;
                                }
/* 206 */                       if (!zM8842n || m8833C(i4).zzk(tq3.m8872j(obj, iM8840g & 1048575))) {
/* 226 */                           i++;
                                }
                            } else {
/* 82 */                        if (iM8822h != 27) {
/* 86 */                            if (iM8822h == 60 || iM8822h == 68) {
/* 134 */                               if (!m8844p(i5, obj, i4) || m8833C(i4).zzk(tq3.m8872j(obj, iM8840g & 1048575))) {
                                        }
                                    } else if (iM8822h != 49) {
/* 98 */                                if (iM8822h == 50 && !((lp3) tq3.m8872j(obj, iM8840g & 1048575)).isEmpty()) {
/* 123 */                                   m8834D(i4).getClass();
/* 126 */                                   C1697u2.m5431g();
/* 1 */                                     return false;
                                        }
                                    }
/* 226 */                           i++;
                                }
/* 161 */                       List list = (List) tq3.m8872j(obj, iM8840g & 1048575);
/* 167 */                       if (list.isEmpty()) {
                                    continue;
                                } else {
/* 169 */                           bq3 bq3VarM8833C = m8833C(i4);
/* 178 */                           for (int i9 = 0; i9 < list.size(); i9++) {
/* 188 */                               if (bq3VarM8833C.zzk(list.get(i9))) {
                                        }
                                    }
                                }
/* 226 */                       i++;
                            }
                        } else {
/* 66 */                    if (i3 == 1048575 ? m8842n(i4, obj) : (i2 & i8) != 0) {
/* 68 */                        iM8822h = m8822h(iM8840g);
/* 74 */                        if (iM8822h != 9) {
                                }
/* 194 */                       if (i3 == 1048575) {
/* 196 */                           zM8842n = m8842n(i4, obj);
                                } else if ((i8 & i2) == 0) {
/* 205 */                           zM8842n = false;
                                }
/* 206 */                       if (!zM8842n) {
                                    continue;
                                }
/* 226 */                       i++;
                            }
                        }
/* 1 */                 return false;
                    }
                }
            }
