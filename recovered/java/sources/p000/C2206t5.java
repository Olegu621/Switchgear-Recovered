            package p000;
            
            /* JADX INFO: renamed from: t5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2206t5 extends sq0 {
                private static final C2206t5 DEFAULT_INSTANCE;
                public static final int KEY_SIZE_FIELD_NUMBER = 2;
                public static final int PARAMS_FIELD_NUMBER = 1;
                private static volatile mr1 PARSER;
                private int keySize_;
                private C2319w5 params_;

                static {
/* 3 */             C2206t5 c2206t5 = new C2206t5();
/* 6 */             DEFAULT_INSTANCE = c2206t5;
/* 10 */            sq0.m8614t(C2206t5.class, c2206t5);
                }

                /* JADX INFO: renamed from: A */
                public static C2169s5 m8689A() {
/* 7 */             return (C2169s5) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: B */
                public static C2206t5 m8690B(AbstractC2298vl abstractC2298vl, dg0 dg0Var) {
/* 7 */             return (C2206t5) sq0.m8612r(DEFAULT_INSTANCE, abstractC2298vl, dg0Var);
                }

                /* JADX INFO: renamed from: w */
                public static void m8691w(C2206t5 c2206t5, C2319w5 c2319w5) {
/* 1 */             c2206t5.getClass();
/* 4 */             c2206t5.params_ = c2319w5;
                }

                /* JADX INFO: renamed from: x */
                public static void m8692x(C2206t5 c2206t5, int i) {
/* 1 */             c2206t5.keySize_ = i;
                }

                @Override // p000.sq0
                /* JADX INFO: renamed from: i */
                public final Object mo54i(int i) {
                    mr1 qq0Var;
                    switch (AbstractC0886en.m3520y(i)) {
                        case 0:
/* 76 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 70 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
                        case 3:
/* 52 */                    return new C2206t5();
                        case 4:
/* 46 */                    return new C2169s5(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (C2206t5.class) {
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

                /* JADX INFO: renamed from: y */
                public final int m8693y() {
/* 1 */             return this.keySize_;
                }

                /* JADX INFO: renamed from: z */
                public final C2319w5 m8694z() {
/* 1 */             C2319w5 c2319w5 = this.params_;
                    return c2319w5 == null ? C2319w5.m9468x() : c2319w5;
                }
            }
