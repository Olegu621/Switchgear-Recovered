            package p000;
            
            /* JADX INFO: renamed from: l5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1878l5 extends sq0 {
                private static final C1878l5 DEFAULT_INSTANCE;
                public static final int KEY_SIZE_FIELD_NUMBER = 2;
                public static final int PARAMS_FIELD_NUMBER = 1;
                private static volatile mr1 PARSER;
                private int keySize_;
                private C1952n5 params_;

                static {
/* 3 */             C1878l5 c1878l5 = new C1878l5();
/* 6 */             DEFAULT_INSTANCE = c1878l5;
/* 10 */            sq0.m8614t(C1878l5.class, c1878l5);
                }

                /* JADX INFO: renamed from: B */
                public static C1819k5 m6336B() {
/* 7 */             return (C1819k5) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: w */
                public static void m6337w(C1878l5 c1878l5, C1952n5 c1952n5) {
/* 1 */             c1878l5.getClass();
/* 4 */             c1878l5.params_ = c1952n5;
                }

                /* JADX INFO: renamed from: x */
                public static void m6338x(C1878l5 c1878l5, int i) {
/* 1 */             c1878l5.keySize_ = i;
                }

                /* JADX INFO: renamed from: y */
                public static C1878l5 m6339y() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                /* JADX INFO: renamed from: A */
                public final C1952n5 m6340A() {
/* 1 */             C1952n5 c1952n5 = this.params_;
                    return c1952n5 == null ? C1952n5.m6884x() : c1952n5;
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
/* 52 */                    return new C1878l5();
                        case 4:
/* 46 */                    return new C1819k5(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (C1878l5.class) {
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
                public final int m6341z() {
/* 1 */             return this.keySize_;
                }
            }
