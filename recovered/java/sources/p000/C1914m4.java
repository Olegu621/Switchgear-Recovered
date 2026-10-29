            package p000;
            
            /* JADX INFO: renamed from: m4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1914m4 extends sq0 {
                private static final C1914m4 DEFAULT_INSTANCE;
                public static final int KEY_SIZE_FIELD_NUMBER = 1;
                public static final int PARAMS_FIELD_NUMBER = 2;
                private static volatile mr1 PARSER;
                private int keySize_;
                private C2242u4 params_;

                static {
/* 3 */             C1914m4 c1914m4 = new C1914m4();
/* 6 */             DEFAULT_INSTANCE = c1914m4;
/* 10 */            sq0.m8614t(C1914m4.class, c1914m4);
                }

                /* JADX INFO: renamed from: A */
                public static C1877l4 m6596A() {
/* 7 */             return (C1877l4) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: B */
                public static C1914m4 m6597B(AbstractC2298vl abstractC2298vl, dg0 dg0Var) {
/* 7 */             return (C1914m4) sq0.m8612r(DEFAULT_INSTANCE, abstractC2298vl, dg0Var);
                }

                /* JADX INFO: renamed from: w */
                public static void m6598w(C1914m4 c1914m4) {
/* 3 */             c1914m4.keySize_ = 32;
                }

                /* JADX INFO: renamed from: x */
                public static void m6599x(C1914m4 c1914m4, C2242u4 c2242u4) {
/* 1 */             c1914m4.getClass();
/* 4 */             c1914m4.params_ = c2242u4;
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
/* 70 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
                        case 3:
/* 52 */                    return new C1914m4();
                        case 4:
/* 46 */                    return new C1877l4(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (C1914m4.class) {
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
                public final int m6600y() {
/* 1 */             return this.keySize_;
                }

                /* JADX INFO: renamed from: z */
                public final C2242u4 m6601z() {
/* 1 */             C2242u4 c2242u4 = this.params_;
                    return c2242u4 == null ? C2242u4.m8950x() : c2242u4;
                }
            }
