            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pu0 extends sq0 {
                private static final pu0 DEFAULT_INSTANCE;
                public static final int KEY_SIZE_FIELD_NUMBER = 2;
                public static final int PARAMS_FIELD_NUMBER = 1;
                private static volatile mr1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 3;
                private int keySize_;
                private su0 params_;
                private int version_;

                static {
/* 3 */             pu0 pu0Var = new pu0();
/* 6 */             DEFAULT_INSTANCE = pu0Var;
/* 10 */            sq0.m8614t(pu0.class, pu0Var);
                }

                /* JADX INFO: renamed from: B */
                public static ou0 m7553B() {
/* 7 */             return (ou0) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: C */
                public static pu0 m7554C(AbstractC2298vl abstractC2298vl, dg0 dg0Var) {
/* 7 */             return (pu0) sq0.m8612r(DEFAULT_INSTANCE, abstractC2298vl, dg0Var);
                }

                /* JADX INFO: renamed from: w */
                public static void m7555w(pu0 pu0Var, su0 su0Var) {
/* 1 */             pu0Var.getClass();
/* 4 */             pu0Var.params_ = su0Var;
                }

                /* JADX INFO: renamed from: x */
                public static void m7556x(pu0 pu0Var, int i) {
/* 1 */             pu0Var.keySize_ = i;
                }

                /* JADX INFO: renamed from: y */
                public static pu0 m7557y() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                /* JADX INFO: renamed from: A */
                public final su0 m7558A() {
/* 1 */             su0 su0Var = this.params_;
                    return su0Var == null ? su0.m8637y() : su0Var;
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
/* 72 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
                        case 3:
/* 52 */                    return new pu0();
                        case 4:
/* 46 */                    return new ou0(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (pu0.class) {
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
                public final int m7559z() {
/* 1 */             return this.keySize_;
                }
            }
