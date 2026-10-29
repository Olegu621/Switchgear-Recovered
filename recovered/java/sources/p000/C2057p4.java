            package p000;

            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: renamed from: p4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class C2057p4 extends sq3 {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f14960b = 0;

                public C2057p4(C2094q4 c2094q4, byte b, char c) {
/* 7 */             super(q41.class);
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: h */
                public final AbstractC2313w mo7325h(AbstractC2313w abstractC2313w) {
                    switch (this.f14960b) {
                        case 0:
/* 702 */                   C1914m4 c1914m4 = (C1914m4) abstractC2313w;
/* 704 */                   C1015i4 c1015i4M5691C = C1780j4.m5691C();
/* 708 */                   c1015i4M5691C.m7234e();
/* 715 */                   C1780j4.m5693w((C1780j4) c1015i4M5691C.f14864b);
/* 722 */                   byte[] bArrM7088a = o02.m7088a(c1914m4.m6600y());
/* 727 */                   C2222tl c2222tlM9303c = AbstractC2298vl.m9303c(bArrM7088a, 0, bArrM7088a.length);
/* 731 */                   c1015i4M5691C.m7234e();
/* 738 */                   C1780j4.m5694x((C1780j4) c1015i4M5691C.f14864b, c2222tlM9303c);
/* 741 */                   C2242u4 c2242u4M6601z = c1914m4.m6601z();
/* 745 */                   c1015i4M5691C.m7234e();
/* 752 */                   C1780j4.m5695y((C1780j4) c1015i4M5691C.f14864b, c2242u4M6601z);
/* 759 */                   return (C1780j4) c1015i4M5691C.m7231b();
                        case 1:
/* 417 */                   C0007a5 c0007a5 = (C0007a5) abstractC2313w;
/* 427 */                   C1988o4[] c1988o4Arr = {new C1988o4(2, C0979h5.class)};
/* 433 */                   HashMap map = new HashMap();
/* 441 */                   for (C1988o4 c1988o4 : c1988o4Arr) {
/* 447 */                       boolean zContainsKey = map.containsKey(c1988o4.f14607a);
/* 451 */                       Class cls = c1988o4.f14607a;
/* 453 */                       if (zContainsKey) {
/* 465 */                           C1951n4.m6865p(cls.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 438 */                           return null;
                                }
/* 455 */                       map.put(cls, c1988o4);
                            }
/* 471 */                   if (c1988o4Arr.length > 0) {
/* 475 */                       Class cls2 = c1988o4Arr[0].f14607a;
                            }
/* 477 */                   Collections.unmodifiableMap(map);
/* 480 */                   C1878l5 c1878l5M64y = c0007a5.m64y();
/* 484 */                   C1016i5 c1016i5M5699D = C1781j5.m5699D();
/* 488 */                   C1952n5 c1952n5M6340A = c1878l5M64y.m6340A();
/* 492 */                   c1016i5M5699D.m7234e();
/* 499 */                   C1781j5.m5701x((C1781j5) c1016i5M5699D.f14864b, c1952n5M6340A);
/* 506 */                   byte[] bArrM7088a2 = o02.m7088a(c1878l5M64y.m6341z());
/* 511 */                   C2222tl c2222tlM9303c2 = AbstractC2298vl.m9303c(bArrM7088a2, 0, bArrM7088a2.length);
/* 515 */                   c1016i5M5699D.m7234e();
/* 522 */                   C1781j5.m5702y((C1781j5) c1016i5M5699D.f14864b, c2222tlM9303c2);
/* 525 */                   c1016i5M5699D.m7234e();
/* 532 */                   C1781j5.m5700w((C1781j5) c1016i5M5699D.f14864b);
/* 539 */                   C1781j5 c1781j5 = (C1781j5) c1016i5M5699D.m7231b();
/* 550 */                   C1988o4[] c1988o4Arr2 = {new C1988o4(8, wa1.class)};
/* 556 */                   HashMap map2 = new HashMap();
/* 561 */                   for (C1988o4 c1988o5 : c1988o4Arr2) {
/* 567 */                       boolean zContainsKey2 = map2.containsKey(c1988o5.f14607a);
/* 571 */                       Class cls3 = c1988o5.f14607a;
/* 573 */                       if (zContainsKey2) {
/* 585 */                           C1951n4.m6865p(cls3.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 438 */                           return null;
                                }
/* 575 */                       map2.put(cls3, c1988o5);
                            }
/* 590 */                   if (c1988o4Arr2.length > 0) {
/* 594 */                       Class cls4 = c1988o4Arr2[0].f14607a;
                            }
/* 596 */                   Collections.unmodifiableMap(map2);
/* 599 */                   pu0 pu0VarM65z = c0007a5.m65z();
/* 603 */                   lu0 lu0VarM6801D = mu0.m6801D();
/* 607 */                   lu0VarM6801D.m7234e();
/* 614 */                   mu0.m6803w((mu0) lu0VarM6801D.f14864b);
/* 617 */                   su0 su0VarM7558A = pu0VarM65z.m7558A();
/* 621 */                   lu0VarM6801D.m7234e();
/* 628 */                   mu0.m6804x((mu0) lu0VarM6801D.f14864b, su0VarM7558A);
/* 635 */                   byte[] bArrM7088a3 = o02.m7088a(pu0VarM65z.m7559z());
/* 640 */                   C2222tl c2222tlM9303c3 = AbstractC2298vl.m9303c(bArrM7088a3, 0, bArrM7088a3.length);
/* 644 */                   lu0VarM6801D.m7234e();
/* 651 */                   mu0.m6805y((mu0) lu0VarM6801D.f14864b, c2222tlM9303c3);
/* 658 */                   mu0 mu0Var = (mu0) lu0VarM6801D.m7231b();
/* 660 */                   C2318w4 c2318w4M9702C = C2355x4.m9702C();
/* 664 */                   c2318w4M9702C.m7234e();
/* 671 */                   C2355x4.m9705x((C2355x4) c2318w4M9702C.f14864b, c1781j5);
/* 674 */                   c2318w4M9702C.m7234e();
/* 681 */                   C2355x4.m9706y((C2355x4) c2318w4M9702C.f14864b, mu0Var);
/* 684 */                   c2318w4M9702C.m7234e();
/* 691 */                   C2355x4.m9704w((C2355x4) c2318w4M9702C.f14864b);
/* 699 */                   return (C2355x4) c2318w4M9702C.m7231b();
                        case 2:
/* 357 */                   C2206t5 c2206t5 = (C2206t5) abstractC2313w;
/* 359 */                   C2058p5 c2058p5M7707C = C2095q5.m7707C();
/* 367 */                   byte[] bArrM7088a4 = o02.m7088a(c2206t5.m8693y());
/* 372 */                   C2222tl c2222tlM9303c4 = AbstractC2298vl.m9303c(bArrM7088a4, 0, bArrM7088a4.length);
/* 376 */                   c2058p5M7707C.m7234e();
/* 383 */                   C2095q5.m7711y((C2095q5) c2058p5M7707C.f14864b, c2222tlM9303c4);
/* 386 */                   C2319w5 c2319w5M8694z = c2206t5.m8694z();
/* 390 */                   c2058p5M7707C.m7234e();
/* 397 */                   C2095q5.m7710x((C2095q5) c2058p5M7707C.f14864b, c2319w5M8694z);
/* 400 */                   c2058p5M7707C.m7234e();
/* 407 */                   C2095q5.m7709w((C2095q5) c2058p5M7707C.f14864b);
/* 414 */                   return (C2095q5) c2058p5M7707C.m7231b();
                        case 3:
/* 313 */                   C2523z5 c2523z5M68A = C0008a6.m68A();
/* 321 */                   byte[] bArrM7088a5 = o02.m7088a(((C0833d6) abstractC2313w).m2948x());
/* 326 */                   C2222tl c2222tlM9303c5 = AbstractC2298vl.m9303c(bArrM7088a5, 0, bArrM7088a5.length);
/* 330 */                   c2523z5M68A.m7234e();
/* 337 */                   C0008a6.m71x((C0008a6) c2523z5M68A.f14864b, c2222tlM9303c5);
/* 340 */                   c2523z5M68A.m7234e();
/* 347 */                   C0008a6.m70w((C0008a6) c2523z5M68A.f14864b);
/* 354 */                   return (C0008a6) c2523z5M68A.m7231b();
                        case 4:
/* 267 */                   C0980h6 c0980h6M4476A = C1017i6.m4476A();
/* 275 */                   byte[] bArrM7088a6 = o02.m7088a(((C1879l6) abstractC2313w).m6348x());
/* 280 */                   C2222tl c2222tlM9303c6 = AbstractC2298vl.m9303c(bArrM7088a6, 0, bArrM7088a6.length);
/* 284 */                   c0980h6M4476A.m7234e();
/* 291 */                   C1017i6.m4479x((C1017i6) c0980h6M4476A.f14864b, c2222tlM9303c6);
/* 294 */                   c0980h6M4476A.m7234e();
/* 301 */                   C1017i6.m4478w((C1017i6) c0980h6M4476A.f14864b);
/* 308 */                   return (C1017i6) c0980h6M4476A.m7231b();
                        case 5:
/* 221 */                   C2059p6 c2059p6M7725A = C2096q6.m7725A();
/* 229 */                   byte[] bArrM7088a7 = o02.m7088a(((C2207t6) abstractC2313w).m8703x());
/* 234 */                   C2222tl c2222tlM9303c7 = AbstractC2298vl.m9303c(bArrM7088a7, 0, bArrM7088a7.length);
/* 238 */                   c2059p6M7725A.m7234e();
/* 245 */                   C2096q6.m7728x((C2096q6) c2059p6M7725A.f14864b, c2222tlM9303c7);
/* 248 */                   c2059p6M7725A.m7234e();
/* 255 */                   C2096q6.m7727w((C2096q6) c2059p6M7725A.f14864b);
/* 262 */                   return (C2096q6) c2059p6M7725A.m7231b();
                        case 6:
/* 179 */                   C0191bs c0191bsM2877A = C0818cs.m2877A();
/* 183 */                   c0191bsM2877A.m7234e();
/* 190 */                   C0818cs.m2879w((C0818cs) c0191bsM2877A.f14864b);
/* 193 */                   byte[] bArrM7088a8 = o02.m7088a(32);
/* 198 */                   C2222tl c2222tlM9303c8 = AbstractC2298vl.m9303c(bArrM7088a8, 0, bArrM7088a8.length);
/* 202 */                   c0191bsM2877A.m7234e();
/* 209 */                   C0818cs.m2880x((C0818cs) c0191bsM2877A.f14864b, c2222tlM9303c8);
/* 216 */                   return (C0818cs) c0191bsM2877A.m7231b();
                        case 7:
/* 117 */                   pu0 pu0Var = (pu0) abstractC2313w;
/* 119 */                   lu0 lu0VarM6801D2 = mu0.m6801D();
/* 123 */                   lu0VarM6801D2.m7234e();
/* 130 */                   mu0.m6803w((mu0) lu0VarM6801D2.f14864b);
/* 133 */                   su0 su0VarM7558A2 = pu0Var.m7558A();
/* 137 */                   lu0VarM6801D2.m7234e();
/* 144 */                   mu0.m6804x((mu0) lu0VarM6801D2.f14864b, su0VarM7558A2);
/* 151 */                   byte[] bArrM7088a9 = o02.m7088a(pu0Var.m7559z());
/* 156 */                   C2222tl c2222tlM9303c9 = AbstractC2298vl.m9303c(bArrM7088a9, 0, bArrM7088a9.length);
/* 160 */                   lu0VarM6801D2.m7234e();
/* 167 */                   mu0.m6805y((mu0) lu0VarM6801D2.f14864b, c2222tlM9303c9);
/* 174 */                   return (mu0) lu0VarM6801D2.m7231b();
                        case 8:
/* 86 */                    o41 o41VarM7329A = p41.m7329A();
/* 90 */                    o41VarM7329A.m7234e();
/* 97 */                    p41.m7332x((p41) o41VarM7329A.f14864b, (q41) abstractC2313w);
/* 100 */                   o41VarM7329A.m7234e();
/* 107 */                   p41.m7331w((p41) o41VarM7329A.f14864b);
/* 114 */                   return (p41) o41VarM7329A.m7231b();
                        case 9:
/* 53 */                    t41 t41VarM8953A = u41.m8953A();
/* 57 */                    t41VarM8953A.m7234e();
/* 64 */                    u41.m8956x((u41) t41VarM8953A.f14864b, (v41) abstractC2313w);
/* 67 */                    t41VarM8953A.m7234e();
/* 74 */                    u41.m8955w((u41) t41VarM8953A.f14864b);
/* 81 */                    return (u41) t41VarM8953A.m7231b();
                        default:
/* 11 */                    k93 k93VarM6407A = l93.m6407A();
/* 15 */                    k93VarM6407A.m7234e();
/* 22 */                    l93.m6409w((l93) k93VarM6407A.f14864b);
/* 25 */                    byte[] bArrM7088a10 = o02.m7088a(32);
/* 30 */                    C2222tl c2222tlM9303c10 = AbstractC2298vl.m9303c(bArrM7088a10, 0, bArrM7088a10.length);
/* 34 */                    k93VarM6407A.m7234e();
/* 41 */                    l93.m6410x((l93) k93VarM6407A.f14864b, c2222tlM9303c10);
/* 48 */                    return (l93) k93VarM6407A.m7231b();
                    }
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: j */
                public Map mo7326j() {
                    switch (this.f14960b) {
                        case 0:
/* 455 */                   HashMap map = new HashMap();
/* 460 */                   C1877l4 c1877l4M6596A = C1914m4.m6596A();
/* 464 */                   c1877l4M6596A.m7234e();
/* 471 */                   C1914m4.m6598w((C1914m4) c1877l4M6596A.f14864b);
/* 474 */                   C2205t4 c2205t4M8951z = C2242u4.m8951z();
/* 478 */                   c2205t4M8951z.m7234e();
/* 485 */                   C2242u4.m8949w((C2242u4) c2205t4M8951z.f14864b);
/* 492 */                   C2242u4 c2242u4 = (C2242u4) c2205t4M8951z.m7231b();
/* 494 */                   c1877l4M6596A.m7234e();
/* 501 */                   C1914m4.m6599x((C1914m4) c1877l4M6596A.f14864b, c2242u4);
/* 515 */                   map.put("AES_CMAC", new b41((C1914m4) c1877l4M6596A.m7231b(), 1));
/* 520 */                   C1877l4 c1877l4M6596A2 = C1914m4.m6596A();
/* 524 */                   c1877l4M6596A2.m7234e();
/* 531 */                   C1914m4.m6598w((C1914m4) c1877l4M6596A2.f14864b);
/* 534 */                   C2205t4 c2205t4M8951z2 = C2242u4.m8951z();
/* 538 */                   c2205t4M8951z2.m7234e();
/* 545 */                   C2242u4.m8949w((C2242u4) c2205t4M8951z2.f14864b);
/* 552 */                   C2242u4 c2242u5 = (C2242u4) c2205t4M8951z2.m7231b();
/* 554 */                   c1877l4M6596A2.m7234e();
/* 561 */                   C1914m4.m6599x((C1914m4) c1877l4M6596A2.f14864b, c2242u5);
/* 575 */                   map.put("AES256_CMAC", new b41((C1914m4) c1877l4M6596A2.m7231b(), 1));
/* 580 */                   C1877l4 c1877l4M6596A3 = C1914m4.m6596A();
/* 584 */                   c1877l4M6596A3.m7234e();
/* 591 */                   C1914m4.m6598w((C1914m4) c1877l4M6596A3.f14864b);
/* 594 */                   C2205t4 c2205t4M8951z3 = C2242u4.m8951z();
/* 598 */                   c2205t4M8951z3.m7234e();
/* 605 */                   C2242u4.m8949w((C2242u4) c2205t4M8951z3.f14864b);
/* 612 */                   C2242u4 c2242u6 = (C2242u4) c2205t4M8951z3.m7231b();
/* 614 */                   c1877l4M6596A3.m7234e();
/* 621 */                   C1914m4.m6599x((C1914m4) c1877l4M6596A3.f14864b, c2242u6);
/* 635 */                   map.put("AES256_CMAC_RAW", new b41((C1914m4) c1877l4M6596A3.m7231b(), 3));
/* 638 */                   return Collections.unmodifiableMap(map);
                        case 1:
/* 409 */                   HashMap map2 = new HashMap();
/* 418 */                   map2.put("AES128_CTR_HMAC_SHA256", C2094q4.m7701z(16, 16, 1));
/* 427 */                   map2.put("AES128_CTR_HMAC_SHA256_RAW", C2094q4.m7701z(16, 16, 3));
/* 436 */                   map2.put("AES256_CTR_HMAC_SHA256", C2094q4.m7701z(32, 32, 1));
/* 445 */                   map2.put("AES256_CTR_HMAC_SHA256_RAW", C2094q4.m7701z(32, 32, 3));
/* 448 */                   return Collections.unmodifiableMap(map2);
                        case 2:
/* 363 */                   HashMap map3 = new HashMap();
/* 372 */                   map3.put("AES128_EAX", C2094q4.m7700y(16, 1));
/* 381 */                   map3.put("AES128_EAX_RAW", C2094q4.m7700y(16, 3));
/* 390 */                   map3.put("AES256_EAX", C2094q4.m7700y(32, 1));
/* 399 */                   map3.put("AES256_EAX_RAW", C2094q4.m7700y(32, 3));
/* 402 */                   return Collections.unmodifiableMap(map3);
                        case 3:
/* 317 */                   HashMap map4 = new HashMap();
/* 326 */                   map4.put("AES128_GCM", C2094q4.m7695A(16, 1));
/* 335 */                   map4.put("AES128_GCM_RAW", C2094q4.m7695A(16, 3));
/* 344 */                   map4.put("AES256_GCM", C2094q4.m7695A(32, 1));
/* 353 */                   map4.put("AES256_GCM_RAW", C2094q4.m7695A(32, 3));
/* 356 */                   return Collections.unmodifiableMap(map4);
                        case 4:
/* 271 */                   HashMap map5 = new HashMap();
/* 280 */                   map5.put("AES128_GCM_SIV", C2094q4.m7696B(16, 1));
/* 289 */                   map5.put("AES128_GCM_SIV_RAW", C2094q4.m7696B(16, 3));
/* 298 */                   map5.put("AES256_GCM_SIV", C2094q4.m7696B(32, 1));
/* 307 */                   map5.put("AES256_GCM_SIV_RAW", C2094q4.m7696B(32, 3));
/* 310 */                   return Collections.unmodifiableMap(map5);
                        case 5:
/* 201 */                   HashMap map6 = new HashMap();
/* 206 */                   C2170s6 c2170s6M8701y = C2207t6.m8701y();
/* 210 */                   c2170s6M8701y.m7234e();
/* 217 */                   C2207t6.m8700w((C2207t6) c2170s6M8701y.f14864b);
/* 231 */                   map6.put("AES256_SIV", new b41((C2207t6) c2170s6M8701y.m7231b(), 1));
/* 236 */                   C2170s6 c2170s6M8701y2 = C2207t6.m8701y();
/* 240 */                   c2170s6M8701y2.m7234e();
/* 247 */                   C2207t6.m8700w((C2207t6) c2170s6M8701y2.f14864b);
/* 261 */                   map6.put("AES256_SIV_RAW", new b41((C2207t6) c2170s6M8701y2.m7231b(), 3));
/* 264 */                   return Collections.unmodifiableMap(map6);
                        case 6:
/* 163 */                   HashMap map7 = new HashMap();
/* 177 */                   map7.put("CHACHA20_POLY1305", new b41(C0928fs.m3805w(), 1));
/* 191 */                   map7.put("CHACHA20_POLY1305_RAW", new b41(C0928fs.m3805w(), 3));
/* 194 */                   return Collections.unmodifiableMap(map7);
                        case 7:
/* 57 */                    HashMap map8 = new HashMap();
/* 60 */                    st0 st0Var = st0.SHA256;
/* 68 */                    map8.put("HMAC_SHA256_128BITTAG", C2094q4.m7697C(32, 16, st0Var, 1));
/* 77 */                    map8.put("HMAC_SHA256_128BITTAG_RAW", C2094q4.m7697C(32, 16, st0Var, 3));
/* 86 */                    map8.put("HMAC_SHA256_256BITTAG", C2094q4.m7697C(32, 32, st0Var, 1));
/* 95 */                    map8.put("HMAC_SHA256_256BITTAG_RAW", C2094q4.m7697C(32, 32, st0Var, 3));
/* 100 */                   st0 st0Var2 = st0.SHA512;
/* 108 */                   map8.put("HMAC_SHA512_128BITTAG", C2094q4.m7697C(64, 16, st0Var2, 1));
/* 117 */                   map8.put("HMAC_SHA512_128BITTAG_RAW", C2094q4.m7697C(64, 16, st0Var2, 3));
/* 126 */                   map8.put("HMAC_SHA512_256BITTAG", C2094q4.m7697C(64, 32, st0Var2, 1));
/* 135 */                   map8.put("HMAC_SHA512_256BITTAG_RAW", C2094q4.m7697C(64, 32, st0Var2, 3));
/* 144 */                   map8.put("HMAC_SHA512_512BITTAG", C2094q4.m7697C(64, 64, st0Var2, 1));
/* 153 */                   map8.put("HMAC_SHA512_512BITTAG_RAW", C2094q4.m7697C(64, 64, st0Var2, 3));
/* 156 */                   return Collections.unmodifiableMap(map8);
                        case 8:
                        case 9:
                        default:
/* 12 */                    return super.mo7326j();
                        case 10:
/* 19 */                    HashMap map9 = new HashMap();
/* 33 */                    map9.put("XCHACHA20_POLY1305", new b41(n93.m6949w(), 1));
/* 47 */                    map9.put("XCHACHA20_POLY1305_RAW", new b41(n93.m6949w(), 3));
/* 50 */                    return Collections.unmodifiableMap(map9);
                    }
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: k */
                public final AbstractC2313w mo7327k(AbstractC2298vl abstractC2298vl) {
                    switch (this.f14960b) {
                        case 0:
/* 100 */                   return C1914m4.m6597B(abstractC2298vl, dg0.m3057a());
                        case 1:
/* 91 */                    return C0007a5.m61B(abstractC2298vl, dg0.m3057a());
                        case 2:
/* 82 */                    return C2206t5.m8690B(abstractC2298vl, dg0.m3057a());
                        case 3:
/* 73 */                    return C0833d6.m2947z(abstractC2298vl, dg0.m3057a());
                        case 4:
/* 64 */                    return C1879l6.m6347z(abstractC2298vl, dg0.m3057a());
                        case 5:
/* 55 */                    return C2207t6.m8702z(abstractC2298vl, dg0.m3057a());
                        case 6:
/* 46 */                    return C0928fs.m3806x(abstractC2298vl, dg0.m3057a());
                        case 7:
/* 37 */                    return pu0.m7554C(abstractC2298vl, dg0.m3057a());
                        case 8:
/* 28 */                    return q41.m7703y(abstractC2298vl, dg0.m3057a());
                        case 9:
/* 19 */                    return v41.m9219A(abstractC2298vl, dg0.m3057a());
                        default:
/* 10 */                    return n93.m6950x(abstractC2298vl, dg0.m3057a());
                    }
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: m */
                public final void mo7328m(AbstractC2313w abstractC2313w) throws GeneralSecurityException {
                    switch (this.f14960b) {
                        case 0:
/* 349 */                   C1914m4 c1914m4 = (C1914m4) abstractC2313w;
/* 355 */                   C2094q4.m7698D(c1914m4.m6601z());
/* 364 */                   if (c1914m4.m6600y() == 32) {
/* 372 */                       return;
                            }
/* 369 */                   ds0.m3203t("AesCmacKey size wrong, must be 32 bytes");
/* 372 */                   return;
                        case 1:
/* 162 */                   C0007a5 c0007a5 = (C0007a5) abstractC2313w;
/* 172 */                   C1988o4[] c1988o4Arr = {new C1988o4(2, C0979h5.class)};
/* 178 */                   HashMap map = new HashMap();
/* 186 */                   for (C1988o4 c1988o4 : c1988o4Arr) {
/* 192 */                       boolean zContainsKey = map.containsKey(c1988o4.f14607a);
/* 196 */                       Class cls = c1988o4.f14607a;
/* 198 */                       if (zContainsKey) {
/* 210 */                           C1951n4.m6865p(cls.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 348 */                           return;
                                }
/* 200 */                       map.put(cls, c1988o4);
                            }
/* 216 */                   if (c1988o4Arr.length > 0) {
/* 220 */                       Class cls2 = c1988o4Arr[0].f14607a;
                            }
/* 222 */                   Collections.unmodifiableMap(map);
/* 225 */                   C1878l5 c1878l5M64y = c0007a5.m64y();
/* 233 */                   r13.m8049a(c1878l5M64y.m6341z());
/* 236 */                   C1952n5 c1952n5M6340A = c1878l5M64y.m6340A();
/* 244 */                   if (c1952n5M6340A.m6886y() < 12 || c1952n5M6340A.m6886y() > 16) {
/* 345 */                       ds0.m3203t("invalid IV size");
/* 348 */                       return;
                            }
/* 261 */                   C1988o4[] c1988o4Arr2 = {new C1988o4(8, wa1.class)};
/* 267 */                   HashMap map2 = new HashMap();
/* 272 */                   for (C1988o4 c1988o5 : c1988o4Arr2) {
/* 278 */                       boolean zContainsKey2 = map2.containsKey(c1988o5.f14607a);
/* 282 */                       Class cls3 = c1988o5.f14607a;
/* 284 */                       if (zContainsKey2) {
/* 296 */                           C1951n4.m6865p(cls3.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 348 */                           return;
                                }
/* 286 */                       map2.put(cls3, c1988o5);
                            }
/* 301 */                   if (c1988o4Arr2.length > 0) {
/* 305 */                       Class cls4 = c1988o4Arr2[0].f14607a;
                            }
/* 307 */                   Collections.unmodifiableMap(map2);
/* 310 */                   pu0 pu0VarM65z = c0007a5.m65z();
/* 318 */                   if (pu0VarM65z.m7559z() < 16) {
/* 339 */                       ds0.m3203t("key too short");
/* 348 */                       return;
                            } else {
/* 324 */                       C2094q4.m7699E(pu0VarM65z.m7558A());
/* 335 */                       r13.m8049a(c0007a5.m64y().m6341z());
/* 348 */                       return;
                            }
                        case 2:
/* 126 */                   C2206t5 c2206t5 = (C2206t5) abstractC2313w;
/* 132 */                   r13.m8049a(c2206t5.m8693y());
/* 143 */                   if (c2206t5.m8694z().m9470y() == 12 || c2206t5.m8694z().m9470y() == 16) {
/* 161 */                       return;
                            }
/* 158 */                   ds0.m3203t("invalid IV size; acceptable values have 12 or 16 bytes");
/* 161 */                   return;
                        case 3:
/* 122 */                   r13.m8049a(((C0833d6) abstractC2313w).m2948x());
/* 125 */                   return;
                        case 4:
/* 112 */                   r13.m8049a(((C1879l6) abstractC2313w).m6348x());
/* 115 */                   return;
                        case 5:
/* 66 */                    C2207t6 c2207t6 = (C2207t6) abstractC2313w;
/* 74 */                    if (c2207t6.m8703x() == 64) {
/* 76 */                        return;
                            }
/* 105 */                   throw new InvalidAlgorithmParameterException("invalid key size: " + c2207t6.m8703x() + ". Valid keys must have 64 bytes.");
                        case 6:
/* 65 */                    return;
                        case 7:
/* 43 */                    pu0 pu0Var = (pu0) abstractC2313w;
/* 49 */                    if (pu0Var.m7559z() >= 16) {
/* 55 */                        C2094q4.m7699E(pu0Var.m7558A());
/* 62 */                        return;
                            } else {
/* 59 */                        ds0.m3203t("key too short");
/* 62 */                        return;
                            }
                        case 8:
/* 42 */                    return;
                        case 9:
/* 15 */                    v41 v41Var = (v41) abstractC2313w;
/* 25 */                    if (v41Var.m9222y().isEmpty() || !v41Var.m9223z()) {
/* 36 */                        ds0.m3203t("invalid key format: missing KEK URI or DEK template");
/* 39 */                        return;
                            }
/* 39 */                    return;
                        default:
/* 14 */                    return;
                    }
                }

/* 10 */        public /* synthetic */ C2057p4(Class cls) {
                    super(cls);
                }

/* 11 */        public C2057p4(C2094q4 c2094q4, byte b, int i) {
/* 12 */            super(v41.class);
                }

/* 12 */        public C2057p4(C2094q4 c2094q4, char c) {
/* 13 */            super(C0833d6.class);
                }

/* 13 */        public C2057p4(C2094q4 c2094q4, byte b) {
/* 14 */            super(C2206t5.class);
                }

/* 14 */        public C2057p4(C2094q4 c2094q4, byte b, boolean z) {
/* 15 */            super(C0928fs.class);
                }

/* 15 */        public C2057p4(C2094q4 c2094q4, int i) {
/* 16 */            super(C1879l6.class);
                }

/* 16 */        public C2057p4(C2094q4 c2094q4, byte b, short s) {
/* 17 */            super(n93.class);
                }

/* 17 */        public C2057p4(C2094q4 c2094q4, short s) {
/* 18 */            super(C2207t6.class);
                }

/* 18 */        public C2057p4(C2094q4 c2094q4) {
/* 19 */            super(C0007a5.class);
                }

/* 19 */        public C2057p4(C2094q4 c2094q4, byte b, byte b2) {
/* 20 */            super(pu0.class);
                }
            }
