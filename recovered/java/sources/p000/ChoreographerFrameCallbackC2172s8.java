            package p000;

            import android.os.SystemClock;
            import android.view.Choreographer;
            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: s8 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ChoreographerFrameCallbackC2172s8 implements Choreographer.FrameCallback {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C0875ec f16470a;

                public ChoreographerFrameCallbackC2172s8(C0875ec c0875ec) {
/* 4 */             this.f16470a = c0875ec;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0049  */
                /* JADX WARN: Code duplicated, block: B:17:0x0051  */
                /* JADX WARN: Code duplicated, block: B:19:0x0062  */
                /* JADX WARN: Code duplicated, block: B:21:0x0066  */
                /* JADX WARN: Code duplicated, block: B:24:0x007d  */
                /* JADX WARN: Code duplicated, block: B:26:0x0083  */
                /* JADX WARN: Code duplicated, block: B:27:0x00bf  */
                /* JADX WARN: Code duplicated, block: B:36:0x012d  */
                /* JADX WARN: Code duplicated, block: B:38:0x013a  */
                /* JADX WARN: Code duplicated, block: B:41:0x0155  */
                /* JADX WARN: Code duplicated, block: B:45:0x016a  */
                /* JADX WARN: Code duplicated, block: B:47:0x0170 A[LOOP:1: B:43:0x0164->B:47:0x0170, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:52:0x0180  */
                /* JADX WARN: Code duplicated, block: B:54:0x0186  */
                /* JADX WARN: Code duplicated, block: B:74:0x0173 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:76:0x018c A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:7:0x0026  */
                /* JADX WARN: Code duplicated, block: B:80:0x0189 A[SYNTHETIC] */
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    long j2;
                    long j3;
                    boolean z;
                    float f;
                    bg2 bg2Var;
                    float f2;
                    bg2 bg2Var2;
                    boolean z2;
                    ArrayList arrayList;
                    ThreadLocal threadLocal;
                    C2209t8 c2209t8;
                    ArrayList arrayList2;
                    int iIndexOf;
                    int i;
                    int size;
/* 11 */            C2209t8 c2209t9 = (C2209t8) ((qc3) this.f16470a.f7613b).f15492b;
/* 13 */            long jUptimeMillis = SystemClock.uptimeMillis();
/* 17 */            ArrayList arrayList3 = c2209t9.f16983b;
/* 19 */            long jUptimeMillis2 = SystemClock.uptimeMillis();
/* 23 */            boolean z3 = false;
/* 24 */            int i2 = 0;
/* 29 */            while (i2 < arrayList3.size()) {
/* 35 */                ag2 ag2Var = (ag2) arrayList3.get(i2);
/* 37 */                if (ag2Var == null) {
/* 39 */                    i2 = i2;
                        } else {
/* 43 */                    le2 le2Var = c2209t9.f16982a;
/* 50 */                    Long l = (Long) le2Var.getOrDefault(ag2Var, null);
/* 52 */                    if (l == null) {
/* 66 */                        j2 = ag2Var.f241g;
/* 72 */                        if (j2 == 0) {
/* 74 */                            ag2Var.f241g = jUptimeMillis;
/* 78 */                            ag2Var.m271a(ag2Var.f236b);
/* 39 */                            i2 = i2;
                                } else {
/* 82 */                            j3 = jUptimeMillis - j2;
/* 84 */                            ag2Var.f241g = jUptimeMillis;
/* 86 */                            z = ag2Var.f247m;
/* 88 */                            f = ag2Var.f246l;
/* 97 */                            if (z) {
/* 101 */                               if (f != Float.MAX_VALUE) {
/* 106 */                                   ag2Var.f245k.f2419i = f;
/* 108 */                                   ag2Var.f246l = Float.MAX_VALUE;
                                        }
/* 115 */                               ag2Var.f236b = (float) ag2Var.f245k.f2419i;
/* 117 */                               ag2Var.f235a = 0.0f;
/* 119 */                               ag2Var.f247m = z3;
/* 121 */                               i2 = i2;
                                    } else {
/* 128 */                               bg2Var = ag2Var.f245k;
/* 130 */                               if (f != Float.MAX_VALUE) {
/* 132 */                                   double d = bg2Var.f2419i;
/* 144 */                                   long j4 = j3 / 2;
/* 154 */                                   lb0 lb0VarM1351a = bg2Var.m1351a(j4, ag2Var.f236b, ag2Var.f235a);
/* 158 */                                   bg2 bg2Var3 = ag2Var.f245k;
/* 163 */                                   bg2Var3.f2419i = ag2Var.f246l;
/* 165 */                                   ag2Var.f246l = Float.MAX_VALUE;
/* 179 */                                   lb0 lb0VarM1351a2 = bg2Var3.m1351a(j4, lb0VarM1351a.f13169a, lb0VarM1351a.f13170b);
/* 185 */                                   ag2Var.f236b = lb0VarM1351a2.f13169a;
/* 189 */                                   ag2Var.f235a = lb0VarM1351a2.f13170b;
                                        } else {
/* 206 */                                   lb0 lb0VarM1351a3 = bg2Var.m1351a(j3, ag2Var.f236b, ag2Var.f235a);
/* 212 */                                   ag2Var.f236b = lb0VarM1351a3.f13169a;
/* 216 */                                   ag2Var.f235a = lb0VarM1351a3.f13170b;
                                        }
/* 220 */                               float fMax = Math.max(ag2Var.f236b, -3.4028235E38f);
/* 224 */                               ag2Var.f236b = fMax;
/* 226 */                               float fMin = Math.min(fMax, Float.MAX_VALUE);
/* 230 */                               ag2Var.f236b = fMin;
/* 232 */                               f2 = ag2Var.f235a;
/* 234 */                               bg2Var2 = ag2Var.f245k;
/* 236 */                               bg2Var2.getClass();
/* 248 */                               if (Math.abs(f2) < bg2Var2.f2415e) {
                                        }
/* 276 */                               z2 = false;
/* 282 */                               float fMin2 = Math.min(ag2Var.f236b, Float.MAX_VALUE);
/* 286 */                               ag2Var.f236b = fMin2;
/* 291 */                               float fMax2 = Math.max(fMin2, -3.4028235E38f);
/* 295 */                               ag2Var.f236b = fMax2;
/* 297 */                               ag2Var.m271a(fMax2);
/* 300 */                               if (z2) {
/* 302 */                                   arrayList = ag2Var.f243i;
/* 305 */                                   ag2Var.f240f = false;
/* 307 */                                   threadLocal = C2209t8.f16981f;
/* 313 */                                   if (threadLocal.get() == null) {
/* 320 */                                       threadLocal.set(new C2209t8());
                                            }
/* 327 */                                   c2209t8 = (C2209t8) threadLocal.get();
/* 331 */                                   c2209t8.f16982a.remove(ag2Var);
/* 334 */                                   arrayList2 = c2209t8.f16983b;
/* 336 */                                   iIndexOf = arrayList2.indexOf(ag2Var);
/* 340 */                                   if (iIndexOf >= 0) {
/* 343 */                                       arrayList2.set(iIndexOf, null);
/* 347 */                                       c2209t8.f16986e = true;
                                            }
/* 351 */                                   ag2Var.f241g = 0L;
/* 354 */                                   ag2Var.f237c = false;
/* 361 */                                   for (i = 0; i < arrayList.size(); i++) {
/* 367 */                                       if (arrayList.get(i) == null) {
/* 376 */                                           throw pm2.m7486i(i, arrayList);
                                                }
                                            }
/* 383 */                                   for (size = arrayList.size() - 1; size >= 0; size--) {
/* 389 */                                       if (arrayList.get(size) == null) {
/* 391 */                                           arrayList.remove(size);
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
/* 123 */                           z2 = true;
/* 282 */                           float fMin3 = Math.min(ag2Var.f236b, Float.MAX_VALUE);
/* 286 */                           ag2Var.f236b = fMin3;
/* 291 */                           float fMax3 = Math.max(fMin3, -3.4028235E38f);
/* 295 */                           ag2Var.f236b = fMax3;
/* 297 */                           ag2Var.m271a(fMax3);
/* 300 */                           if (z2) {
/* 302 */                               arrayList = ag2Var.f243i;
/* 305 */                               ag2Var.f240f = false;
/* 307 */                               threadLocal = C2209t8.f16981f;
/* 313 */                               if (threadLocal.get() == null) {
/* 320 */                                   threadLocal.set(new C2209t8());
                                        }
/* 327 */                               c2209t8 = (C2209t8) threadLocal.get();
/* 331 */                               c2209t8.f16982a.remove(ag2Var);
/* 334 */                               arrayList2 = c2209t8.f16983b;
/* 336 */                               iIndexOf = arrayList2.indexOf(ag2Var);
/* 340 */                               if (iIndexOf >= 0) {
/* 343 */                                   arrayList2.set(iIndexOf, null);
/* 347 */                                   c2209t8.f16986e = true;
                                        }
/* 351 */                               ag2Var.f241g = 0L;
/* 354 */                               ag2Var.f237c = false;
/* 361 */                               while (i < arrayList.size()) {
/* 367 */                                   if (arrayList.get(i) == null) {
/* 376 */                                       throw pm2.m7486i(i, arrayList);
                                            }
                                        }
/* 383 */                               while (size >= 0) {
/* 389 */                                   if (arrayList.get(size) == null) {
/* 391 */                                       arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else if (l.longValue() < jUptimeMillis2) {
/* 63 */                        le2Var.remove(ag2Var);
/* 66 */                        j2 = ag2Var.f241g;
/* 72 */                        if (j2 == 0) {
/* 74 */                            ag2Var.f241g = jUptimeMillis;
/* 78 */                            ag2Var.m271a(ag2Var.f236b);
/* 39 */                            i2 = i2;
                                } else {
/* 82 */                            j3 = jUptimeMillis - j2;
/* 84 */                            ag2Var.f241g = jUptimeMillis;
/* 86 */                            z = ag2Var.f247m;
/* 88 */                            f = ag2Var.f246l;
/* 97 */                            if (z) {
/* 101 */                               if (f != Float.MAX_VALUE) {
/* 106 */                                   ag2Var.f245k.f2419i = f;
/* 108 */                                   ag2Var.f246l = Float.MAX_VALUE;
                                        }
/* 115 */                               ag2Var.f236b = (float) ag2Var.f245k.f2419i;
/* 117 */                               ag2Var.f235a = 0.0f;
/* 119 */                               ag2Var.f247m = z3;
/* 121 */                               i2 = i2;
                                    } else {
/* 128 */                               bg2Var = ag2Var.f245k;
/* 130 */                               if (f != Float.MAX_VALUE) {
/* 132 */                                   double d2 = bg2Var.f2419i;
/* 144 */                                   long j5 = j3 / 2;
/* 154 */                                   lb0 lb0VarM1351a4 = bg2Var.m1351a(j5, ag2Var.f236b, ag2Var.f235a);
/* 158 */                                   bg2 bg2Var4 = ag2Var.f245k;
/* 163 */                                   bg2Var4.f2419i = ag2Var.f246l;
/* 165 */                                   ag2Var.f246l = Float.MAX_VALUE;
/* 179 */                                   lb0 lb0VarM1351a5 = bg2Var4.m1351a(j5, lb0VarM1351a4.f13169a, lb0VarM1351a4.f13170b);
/* 185 */                                   ag2Var.f236b = lb0VarM1351a5.f13169a;
/* 189 */                                   ag2Var.f235a = lb0VarM1351a5.f13170b;
                                        } else {
/* 206 */                                   lb0 lb0VarM1351a6 = bg2Var.m1351a(j3, ag2Var.f236b, ag2Var.f235a);
/* 212 */                                   ag2Var.f236b = lb0VarM1351a6.f13169a;
/* 216 */                                   ag2Var.f235a = lb0VarM1351a6.f13170b;
                                        }
/* 220 */                               float fMax4 = Math.max(ag2Var.f236b, -3.4028235E38f);
/* 224 */                               ag2Var.f236b = fMax4;
/* 226 */                               float fMin4 = Math.min(fMax4, Float.MAX_VALUE);
/* 230 */                               ag2Var.f236b = fMin4;
/* 232 */                               f2 = ag2Var.f235a;
/* 234 */                               bg2Var2 = ag2Var.f245k;
/* 236 */                               bg2Var2.getClass();
/* 248 */                               if (Math.abs(f2) < bg2Var2.f2415e || Math.abs(fMin4 - ((float) bg2Var2.f2419i)) >= bg2Var2.f2414d) {
/* 276 */                                   z2 = false;
                                        } else {
/* 270 */                                   ag2Var.f236b = (float) ag2Var.f245k.f2419i;
/* 272 */                                   ag2Var.f235a = 0.0f;
                                        }
/* 282 */                               float fMin5 = Math.min(ag2Var.f236b, Float.MAX_VALUE);
/* 286 */                               ag2Var.f236b = fMin5;
/* 291 */                               float fMax5 = Math.max(fMin5, -3.4028235E38f);
/* 295 */                               ag2Var.f236b = fMax5;
/* 297 */                               ag2Var.m271a(fMax5);
/* 300 */                               if (z2) {
/* 302 */                                   arrayList = ag2Var.f243i;
/* 305 */                                   ag2Var.f240f = false;
/* 307 */                                   threadLocal = C2209t8.f16981f;
/* 313 */                                   if (threadLocal.get() == null) {
/* 320 */                                       threadLocal.set(new C2209t8());
                                            }
/* 327 */                                   c2209t8 = (C2209t8) threadLocal.get();
/* 331 */                                   c2209t8.f16982a.remove(ag2Var);
/* 334 */                                   arrayList2 = c2209t8.f16983b;
/* 336 */                                   iIndexOf = arrayList2.indexOf(ag2Var);
/* 340 */                                   if (iIndexOf >= 0) {
/* 343 */                                       arrayList2.set(iIndexOf, null);
/* 347 */                                       c2209t8.f16986e = true;
                                            }
/* 351 */                                   ag2Var.f241g = 0L;
/* 354 */                                   ag2Var.f237c = false;
/* 361 */                                   while (i < arrayList.size()) {
/* 367 */                                       if (arrayList.get(i) == null) {
/* 376 */                                           throw pm2.m7486i(i, arrayList);
                                                }
                                            }
/* 383 */                                   while (size >= 0) {
/* 389 */                                       if (arrayList.get(size) == null) {
/* 391 */                                           arrayList.remove(size);
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
/* 123 */                           z2 = true;
/* 282 */                           float fMin6 = Math.min(ag2Var.f236b, Float.MAX_VALUE);
/* 286 */                           ag2Var.f236b = fMin6;
/* 291 */                           float fMax6 = Math.max(fMin6, -3.4028235E38f);
/* 295 */                           ag2Var.f236b = fMax6;
/* 297 */                           ag2Var.m271a(fMax6);
/* 300 */                           if (z2) {
/* 302 */                               arrayList = ag2Var.f243i;
/* 305 */                               ag2Var.f240f = false;
/* 307 */                               threadLocal = C2209t8.f16981f;
/* 313 */                               if (threadLocal.get() == null) {
/* 320 */                                   threadLocal.set(new C2209t8());
                                        }
/* 327 */                               c2209t8 = (C2209t8) threadLocal.get();
/* 331 */                               c2209t8.f16982a.remove(ag2Var);
/* 334 */                               arrayList2 = c2209t8.f16983b;
/* 336 */                               iIndexOf = arrayList2.indexOf(ag2Var);
/* 340 */                               if (iIndexOf >= 0) {
/* 343 */                                   arrayList2.set(iIndexOf, null);
/* 347 */                                   c2209t8.f16986e = true;
                                        }
/* 351 */                               ag2Var.f241g = 0L;
/* 354 */                               ag2Var.f237c = false;
/* 361 */                               while (i < arrayList.size()) {
/* 367 */                                   if (arrayList.get(i) == null) {
/* 376 */                                       throw pm2.m7486i(i, arrayList);
                                            }
                                        }
/* 383 */                               while (size >= 0) {
/* 389 */                                   if (arrayList.get(size) == null) {
/* 391 */                                       arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
/* 39 */                        i2 = i2;
                            }
                        }
/* 397 */               i2++;
/* 399 */               z3 = false;
                    }
/* 404 */           if (c2209t9.f16986e) {
/* 412 */               for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
/* 418 */                   if (arrayList3.get(size2) == null) {
/* 420 */                       arrayList3.remove(size2);
                            }
                        }
/* 427 */               c2209t9.f16986e = false;
                    }
/* 433 */           if (arrayList3.size() > 0) {
/* 437 */               if (c2209t9.f16985d == null) {
/* 446 */                   c2209t9.f16985d = new C0875ec(c2209t9.f16984c);
                        }
/* 448 */               C0875ec c0875ec = c2209t9.f16985d;
/* 458 */               ((Choreographer) c0875ec.f7614c).postFrameCallback((ChoreographerFrameCallbackC2172s8) c0875ec.f7615d);
                    }
                }
            }
