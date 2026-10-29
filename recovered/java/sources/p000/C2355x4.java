            package p000;
            
            /* JADX INFO: renamed from: x4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2355x4 extends sq0 {
                public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
                private static final C2355x4 DEFAULT_INSTANCE;
                public static final int HMAC_KEY_FIELD_NUMBER = 3;
                private static volatile mr1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 1;
                private C1781j5 aesCtrKey_;
                private mu0 hmacKey_;
                private int version_;

                static {
/* 3 */             C2355x4 c2355x4 = new C2355x4();
/* 6 */             DEFAULT_INSTANCE = c2355x4;
/* 10 */            sq0.m8614t(C2355x4.class, c2355x4);
                }

                /* JADX INFO: renamed from: C */
                public static C2318w4 m9702C() {
/* 7 */             return (C2318w4) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: D */
                public static C2355x4 m9703D(AbstractC2298vl abstractC2298vl, dg0 dg0Var) {
/* 7 */             return (C2355x4) sq0.m8612r(DEFAULT_INSTANCE, abstractC2298vl, dg0Var);
                }

                /* JADX INFO: renamed from: w */
                public static void m9704w(C2355x4 c2355x4) {
/* 2 */             c2355x4.version_ = 0;
                }

                /* JADX INFO: renamed from: x */
                public static void m9705x(C2355x4 c2355x4, C1781j5 c1781j5) {
/* 1 */             c2355x4.getClass();
/* 4 */             c1781j5.getClass();
/* 7 */             c2355x4.aesCtrKey_ = c1781j5;
                }

                /* JADX INFO: renamed from: y */
                public static void m9706y(C2355x4 c2355x4, mu0 mu0Var) {
/* 1 */             c2355x4.getClass();
/* 4 */             mu0Var.getClass();
/* 7 */             c2355x4.hmacKey_ = mu0Var;
                }

                /* JADX INFO: renamed from: A */
                public final mu0 m9707A() {
/* 1 */             mu0 mu0Var = this.hmacKey_;
                    return mu0Var == null ? mu0.m6806z() : mu0Var;
                }

                /* JADX INFO: renamed from: B */
                public final int m9708B() {
/* 1 */             return this.version_;
                }

                @Override // p000.sq0
                /* JADX INFO: renamed from: i */
                public final Object mo54i(int i) {
                    mr1 qq0Var;
                    switch (AbstractC0886en.m3520y(i)) {
                        case 0:
/* 78 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 72 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
                        case 3:
/* 52 */                    return new C2355x4();
                        case 4:
/* 46 */                    return new C2318w4(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (C2355x4.class) {
                                try {
/* 20 */                            qq0Var = PARSER;
/* 22 */                            if (qq0Var == null) {
/* 26 */                                qq0Var = new qq0();
/* 29 */                                PARSER = qq0Var;
                                    }
                                } catch (Throwable th) {
/* 37 */                            throw th;
                                }
                                break;
                            }
/* 35 */                    return qq0Var;
                        default:
/* 9 */                     f42.m3660p();
/* 5 */                     return null;
                    }
                }

                /* JADX INFO: renamed from: z */
                public final C1781j5 m9709z() {
/* 1 */             C1781j5 c1781j5 = this.aesCtrKey_;
                    return c1781j5 == null ? C1781j5.m5703z() : c1781j5;
                }
            }
