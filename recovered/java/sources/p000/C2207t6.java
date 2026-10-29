            package p000;
            
            /* JADX INFO: renamed from: t6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2207t6 extends sq0 {
                private static final C2207t6 DEFAULT_INSTANCE;
                public static final int KEY_SIZE_FIELD_NUMBER = 1;
                private static volatile mr1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 2;
                private int keySize_;
                private int version_;

                static {
/* 3 */             C2207t6 c2207t6 = new C2207t6();
/* 6 */             DEFAULT_INSTANCE = c2207t6;
/* 10 */            sq0.m8614t(C2207t6.class, c2207t6);
                }

                /* JADX INFO: renamed from: w */
                public static void m8700w(C2207t6 c2207t6) {
/* 3 */             c2207t6.keySize_ = 64;
                }

                /* JADX INFO: renamed from: y */
                public static C2170s6 m8701y() {
/* 7 */             return (C2170s6) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: z */
                public static C2207t6 m8702z(AbstractC2298vl abstractC2298vl, dg0 dg0Var) {
/* 7 */             return (C2207t6) sq0.m8612r(DEFAULT_INSTANCE, abstractC2298vl, dg0Var);
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
/* 70 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
                        case 3:
/* 52 */                    return new C2207t6();
                        case 4:
/* 46 */                    return new C2170s6(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (C2207t6.class) {
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

                /* JADX INFO: renamed from: x */
                public final int m8703x() {
/* 1 */             return this.keySize_;
                }
            }
