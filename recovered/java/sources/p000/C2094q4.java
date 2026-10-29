            package p000;

            import java.security.GeneralSecurityException;
            import java.security.InvalidKeyException;
            import java.util.Collections;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: q4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 21 */    public final class C2094q4 extends kx0 {

                /* JADX INFO: renamed from: e */
                public static final ex1 f15385e = new ex1(C1818k4.class, new C1951n4(0));

                /* JADX INFO: renamed from: f */
                public static final ex1 f15386f = new ex1(nu0.class, new ds0(1));

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f15387d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2094q4() {
/* 19 */            super(mu0.class, new C1988o4(8, wa1.class));
/* 2 */             this.f15387d = 1;
                }

                /* JADX INFO: renamed from: A */
                public static b41 m7695A(int i, int i2) {
/* 1 */             C0205c6 c0205c6M2946y = C0833d6.m2946y();
/* 5 */             c0205c6M2946y.m7234e();
/* 12 */            C0833d6.m2945w((C0833d6) c0205c6M2946y.f14864b, i);
/* 23 */            return new b41((C0833d6) c0205c6M2946y.m7231b(), i2);
                }

                /* JADX INFO: renamed from: B */
                public static b41 m7696B(int i, int i2) {
/* 1 */             C1820k6 c1820k6M6346y = C1879l6.m6346y();
/* 5 */             c1820k6M6346y.m7234e();
/* 12 */            C1879l6.m6345w((C1879l6) c1820k6M6346y.f14864b, i);
/* 23 */            return new b41((C1879l6) c1820k6M6346y.m7231b(), i2);
                }

                /* JADX INFO: renamed from: C */
                public static b41 m7697C(int i, int i2, st0 st0Var, int i3) {
/* 3 */             ou0 ou0VarM7553B = pu0.m7553B();
/* 7 */             ru0 ru0VarM8634B = su0.m8634B();
/* 11 */            ru0VarM8634B.m7234e();
/* 18 */            su0.m8635w((su0) ru0VarM8634B.f14864b, st0Var);
/* 21 */            ru0VarM8634B.m7234e();
/* 28 */            su0.m8636x((su0) ru0VarM8634B.f14864b, i2);
/* 35 */            su0 su0Var = (su0) ru0VarM8634B.m7231b();
/* 37 */            ou0VarM7553B.m7234e();
/* 44 */            pu0.m7555w((pu0) ou0VarM7553B.f14864b, su0Var);
/* 47 */            ou0VarM7553B.m7234e();
/* 54 */            pu0.m7556x((pu0) ou0VarM7553B.f14864b, i);
/* 63 */            return new b41((pu0) ou0VarM7553B.m7231b(), i3);
                }

                /* JADX INFO: renamed from: D */
                public static void m7698D(C2242u4 c2242u4) {
/* 7 */             if (c2242u4.m8952y() < 10) {
/* 26 */                ds0.m3203t("tag size too short");
                    } else {
/* 15 */                if (c2242u4.m8952y() <= 16) {
/* 17 */                    return;
                        }
/* 20 */                ds0.m3203t("tag size too long");
                    }
                }

                /* JADX INFO: renamed from: E */
                public static void m7699E(su0 su0Var) {
/* 7 */             if (su0Var.m8638A() < 10) {
/* 107 */               ds0.m3203t("tag size too small");
/* 110 */               return;
                    }
/* 13 */            int iOrdinal = su0Var.m8639z().ordinal();
/* 20 */            if (iOrdinal == 1) {
/* 98 */                if (su0Var.m8638A() <= 20) {
/* 100 */                   return;
                        }
/* 101 */               ds0.m3203t("tag size too big");
/* 104 */               return;
                    }
/* 23 */            if (iOrdinal == 2) {
/* 85 */                if (su0Var.m8638A() <= 48) {
/* 100 */                   return;
                        }
/* 88 */                ds0.m3203t("tag size too big");
/* 91 */                return;
                    }
/* 26 */            if (iOrdinal == 3) {
/* 72 */                if (su0Var.m8638A() <= 32) {
/* 100 */                   return;
                        }
/* 75 */                ds0.m3203t("tag size too big");
                    } else if (iOrdinal == 4) {
/* 59 */                if (su0Var.m8638A() <= 64) {
/* 100 */                   return;
                        }
/* 62 */                ds0.m3203t("tag size too big");
                    } else if (iOrdinal != 5) {
/* 49 */                ds0.m3203t("unknown hash type");
                    } else {
/* 40 */                if (su0Var.m8638A() <= 28) {
/* 100 */                   return;
                        }
/* 43 */                ds0.m3203t("tag size too big");
                    }
                }

                /* JADX INFO: renamed from: y */
                public static b41 m7700y(int i, int i2) {
/* 1 */             C2169s5 c2169s5M8689A = C2206t5.m8689A();
/* 5 */             c2169s5M8689A.m7234e();
/* 12 */            C2206t5.m8692x((C2206t5) c2169s5M8689A.f14864b, i);
/* 15 */            C2281v5 c2281v5M9469z = C2319w5.m9469z();
/* 19 */            c2281v5M9469z.m7234e();
/* 26 */            C2319w5.m9467w((C2319w5) c2281v5M9469z.f14864b);
/* 33 */            C2319w5 c2319w5 = (C2319w5) c2281v5M9469z.m7231b();
/* 35 */            c2169s5M8689A.m7234e();
/* 42 */            C2206t5.m8691w((C2206t5) c2169s5M8689A.f14864b, c2319w5);
/* 53 */            return new b41((C2206t5) c2169s5M8689A.m7231b(), i2);
                }

                /* JADX INFO: renamed from: z */
                public static b41 m7701z(int i, int i2, int i3) {
/* 3 */             C1819k5 c1819k5M6336B = C1878l5.m6336B();
/* 7 */             C1915m5 c1915m5M6885z = C1952n5.m6885z();
/* 11 */            c1915m5M6885z.m7234e();
/* 18 */            C1952n5.m6883w((C1952n5) c1915m5M6885z.f14864b);
/* 25 */            C1952n5 c1952n5 = (C1952n5) c1915m5M6885z.m7231b();
/* 27 */            c1819k5M6336B.m7234e();
/* 34 */            C1878l5.m6337w((C1878l5) c1819k5M6336B.f14864b, c1952n5);
/* 37 */            c1819k5M6336B.m7234e();
/* 44 */            C1878l5.m6338x((C1878l5) c1819k5M6336B.f14864b, i);
/* 51 */            C1878l5 c1878l5 = (C1878l5) c1819k5M6336B.m7231b();
/* 53 */            ou0 ou0VarM7553B = pu0.m7553B();
/* 57 */            ru0 ru0VarM8634B = su0.m8634B();
/* 61 */            ru0VarM8634B.m7234e();
/* 70 */            su0.m8635w((su0) ru0VarM8634B.f14864b, st0.SHA256);
/* 73 */            ru0VarM8634B.m7234e();
/* 80 */            su0.m8636x((su0) ru0VarM8634B.f14864b, i2);
/* 87 */            su0 su0Var = (su0) ru0VarM8634B.m7231b();
/* 89 */            ou0VarM7553B.m7234e();
/* 96 */            pu0.m7555w((pu0) ou0VarM7553B.f14864b, su0Var);
/* 99 */            ou0VarM7553B.m7234e();
/* 108 */           pu0.m7556x((pu0) ou0VarM7553B.f14864b, 32);
/* 115 */           pu0 pu0Var = (pu0) ou0VarM7553B.m7231b();
/* 117 */           C2522z4 c2522z4M60A = C0007a5.m60A();
/* 121 */           c2522z4M60A.m7234e();
/* 128 */           C0007a5.m62w((C0007a5) c2522z4M60A.f14864b, c1878l5);
/* 131 */           c2522z4M60A.m7234e();
/* 138 */           C0007a5.m63x((C0007a5) c2522z4M60A.f14864b, pu0Var);
/* 147 */           return new b41((C0007a5) c2522z4M60A.m7231b(), i3);
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: l */
                public int mo6293l() {
                    switch (this.f15387d) {
                        case 1:
/* 15 */                    return 2;
                        case 2:
/* 13 */                    return 2;
                        case 3:
                        default:
/* 6 */                     return super.mo6293l();
                        case 4:
/* 11 */                    return 2;
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: m */
                public final String mo6294m() {
                    switch (this.f15387d) {
                        case 0:
/* 36 */                    return "type.googleapis.com/google.crypto.tink.AesCmacKey";
                        case 1:
/* 33 */                    return "type.googleapis.com/google.crypto.tink.HmacKey";
                        case 2:
/* 30 */                    return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
                        case 3:
/* 27 */                    return "type.googleapis.com/google.crypto.tink.AesEaxKey";
                        case 4:
/* 24 */                    return "type.googleapis.com/google.crypto.tink.AesGcmKey";
                        case 5:
/* 21 */                    return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
                        case 6:
/* 18 */                    return "type.googleapis.com/google.crypto.tink.AesSivKey";
                        case 7:
/* 15 */                    return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
                        case 8:
/* 12 */                    return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
                        case 9:
/* 9 */                     return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
                        default:
/* 6 */                     return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: o */
                public final sq3 mo6296o() {
                    switch (this.f15387d) {
                        case 0:
/* 83 */                    return new C2057p4(C1914m4.class);
                        case 1:
/* 75 */                    return new C2057p4(this, (byte) 0, (byte) 0);
                        case 2:
/* 68 */                    return new C2057p4(this);
                        case 3:
/* 62 */                    return new C2057p4(this, (byte) 0);
                        case 4:
/* 55 */                    return new C2057p4(this, (char) 0);
                        case 5:
/* 48 */                    return new C2057p4(this, 0);
                        case 6:
/* 41 */                    return new C2057p4(this, (short) 0);
                        case 7:
/* 34 */                    return new C2057p4(this, (byte) 0, false);
                        case 8:
/* 26 */                    return new C2057p4(this, (byte) 0, (char) 0);
                        case 9:
/* 18 */                    return new C2057p4(this, (byte) 0, 0);
                        default:
/* 10 */                    return new C2057p4(this, (byte) 0, (short) 0);
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: p */
                public final h31 mo6297p() {
/* 1 */             int i = this.f15387d;
/* 3 */             h31 h31Var = h31.REMOTE;
/* 5 */             h31 h31Var2 = h31.SYMMETRIC;
                    switch (i) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
/* 12 */                    return h31Var2;
                        case 8:
                        case 9:
/* 11 */                    return h31Var;
                        default:
/* 10 */                    return h31Var2;
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: q */
                public final AbstractC2313w mo6298q(AbstractC2298vl abstractC2298vl) {
                    switch (this.f15387d) {
                        case 0:
/* 100 */                   return C1780j4.m5692D(abstractC2298vl, dg0.m3057a());
                        case 1:
/* 91 */                    return mu0.m6802E(abstractC2298vl, dg0.m3057a());
                        case 2:
/* 82 */                    return C2355x4.m9703D(abstractC2298vl, dg0.m3057a());
                        case 3:
/* 73 */                    return C2095q5.m7708D(abstractC2298vl, dg0.m3057a());
                        case 4:
/* 64 */                    return C0008a6.m69B(abstractC2298vl, dg0.m3057a());
                        case 5:
/* 55 */                    return C1017i6.m4477B(abstractC2298vl, dg0.m3057a());
                        case 6:
/* 46 */                    return C2096q6.m7726B(abstractC2298vl, dg0.m3057a());
                        case 7:
/* 37 */                    return C0818cs.m2878B(abstractC2298vl, dg0.m3057a());
                        case 8:
/* 28 */                    return p41.m7330B(abstractC2298vl, dg0.m3057a());
                        case 9:
/* 19 */                    return u41.m8954B(abstractC2298vl, dg0.m3057a());
                        default:
/* 10 */                    return l93.m6408B(abstractC2298vl, dg0.m3057a());
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: x */
                public final void mo6304x(AbstractC2313w abstractC2313w) throws GeneralSecurityException {
                    switch (this.f15387d) {
                        case 0:
/* 445 */                   C1780j4 c1780j4 = (C1780j4) abstractC2313w;
/* 451 */                   r13.m8051c(c1780j4.m5697B());
/* 462 */                   if (c1780j4.m5698z().size() == 32) {
/* 468 */                       m7698D(c1780j4.m5696A());
/* 477 */                       return;
                            } else {
/* 474 */                       ds0.m3203t("AesCmacKey size wrong, must be 32 bytes");
/* 477 */                       return;
                            }
                        case 1:
/* 414 */                   mu0 mu0Var = (mu0) abstractC2313w;
/* 420 */                   r13.m8051c(mu0Var.m6809C());
/* 431 */                   if (mu0Var.m6807A().size() >= 16) {
/* 437 */                       m7699E(mu0Var.m6808B());
/* 444 */                       return;
                            } else {
/* 441 */                       ds0.m3203t("key too short");
/* 444 */                       return;
                            }
                        case 2:
/* 230 */                   C2355x4 c2355x4 = (C2355x4) abstractC2313w;
/* 236 */                   r13.m8051c(c2355x4.m9708B());
/* 247 */                   C1988o4[] c1988o4Arr = {new C1988o4(2, C0979h5.class)};
/* 253 */                   HashMap map = new HashMap();
/* 257 */                   C1988o4 c1988o4 = c1988o4Arr[0];
/* 261 */                   boolean zContainsKey = map.containsKey(c1988o4.f14607a);
/* 265 */                   Class cls = c1988o4.f14607a;
/* 269 */                   if (zContainsKey) {
/* 410 */                       C1951n4.m6865p(cls.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 413 */                       return;
                            }
/* 271 */                   map.put(cls, c1988o4);
/* 276 */                   Class cls2 = c1988o4Arr[0].f14607a;
/* 278 */                   Collections.unmodifiableMap(map);
/* 281 */                   C1781j5 c1781j5M9709z = c2355x4.m9709z();
/* 289 */                   r13.m8051c(c1781j5M9709z.m5706C());
/* 300 */                   r13.m8049a(c1781j5M9709z.m5704A().size());
/* 303 */                   C1952n5 c1952n5M5705B = c1781j5M9709z.m5705B();
/* 311 */                   if (c1952n5M5705B.m6886y() < 12 || c1952n5M5705B.m6886y() > 16) {
/* 402 */                       ds0.m3203t("invalid IV size");
/* 413 */                       return;
                            }
/* 328 */                   C1988o4[] c1988o4Arr2 = {new C1988o4(8, wa1.class)};
/* 334 */                   HashMap map2 = new HashMap();
/* 337 */                   C1988o4 c1988o5 = c1988o4Arr2[0];
/* 341 */                   boolean zContainsKey2 = map2.containsKey(c1988o5.f14607a);
/* 345 */                   Class cls3 = c1988o5.f14607a;
/* 347 */                   if (zContainsKey2) {
/* 396 */                       C1951n4.m6865p(cls3.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
/* 413 */                       return;
                            }
/* 349 */                   map2.put(cls3, c1988o5);
/* 354 */                   Class cls4 = c1988o4Arr2[0].f14607a;
/* 356 */                   Collections.unmodifiableMap(map2);
/* 359 */                   mu0 mu0VarM9707A = c2355x4.m9707A();
/* 367 */                   r13.m8051c(mu0VarM9707A.m6809C());
/* 378 */                   if (mu0VarM9707A.m6807A().size() >= 16) {
/* 384 */                       m7699E(mu0VarM9707A.m6808B());
/* 413 */                       return;
                            } else {
/* 388 */                       ds0.m3203t("key too short");
/* 413 */                       return;
                            }
                        case 3:
/* 183 */                   C2095q5 c2095q5 = (C2095q5) abstractC2313w;
/* 189 */                   r13.m8051c(c2095q5.m7713B());
/* 200 */                   r13.m8049a(c2095q5.m7714z().size());
/* 211 */                   if (c2095q5.m7712A().m9470y() == 12 || c2095q5.m7712A().m9470y() == 16) {
/* 229 */                       return;
                            }
/* 226 */                   ds0.m3203t("invalid IV size; acceptable values have 12 or 16 bytes");
/* 229 */                   return;
                        case 4:
/* 162 */                   C0008a6 c0008a6 = (C0008a6) abstractC2313w;
/* 168 */                   r13.m8051c(c0008a6.m73z());
/* 179 */                   r13.m8049a(c0008a6.m72y().size());
/* 182 */                   return;
                        case 5:
/* 141 */                   C1017i6 c1017i6 = (C1017i6) abstractC2313w;
/* 147 */                   r13.m8051c(c1017i6.m4481z());
/* 158 */                   r13.m8049a(c1017i6.m4480y().size());
/* 161 */                   return;
                        case 6:
/* 86 */                    C2096q6 c2096q6 = (C2096q6) abstractC2313w;
/* 92 */                    r13.m8051c(c2096q6.m7730z());
/* 105 */                   if (c2096q6.m7729y().size() == 64) {
/* 107 */                       return;
                            }
/* 140 */                   throw new InvalidKeyException("invalid key size: " + c2096q6.m7729y().size() + ". Valid keys must have 64 bytes.");
                        case 7:
/* 60 */                    C0818cs c0818cs = (C0818cs) abstractC2313w;
/* 66 */                    r13.m8051c(c0818cs.m2882z());
/* 77 */                    if (c0818cs.m2881y().size() == 32) {
/* 85 */                        return;
                            }
/* 82 */                    ds0.m3203t("invalid ChaCha20Poly1305Key: incorrect key length");
/* 85 */                    return;
                        case 8:
/* 56 */                    r13.m8051c(((p41) abstractC2313w).m7334z());
/* 59 */                    return;
                        case 9:
/* 46 */                    r13.m8051c(((u41) abstractC2313w).m8958z());
/* 49 */                    return;
                        default:
/* 14 */                    l93 l93Var = (l93) abstractC2313w;
/* 20 */                    r13.m8051c(l93Var.m6412z());
/* 31 */                    if (l93Var.m6411y().size() == 32) {
/* 39 */                        return;
                            }
/* 36 */                    ds0.m3203t("invalid XChaCha20Poly1305Key: incorrect key length");
/* 39 */                    return;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 22 */        public /* synthetic */ C2094q4(Class cls, C1988o4[] c1988o4Arr, int i) {
                    super(cls, c1988o4Arr);
/* 23 */            this.f15387d = i;
                }
            }
