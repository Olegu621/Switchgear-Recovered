            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class p41 extends sq0 {
                private static final p41 DEFAULT_INSTANCE;
                public static final int PARAMS_FIELD_NUMBER = 2;
                private static volatile mr1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 1;
                private q41 params_;
                private int version_;

                static {
/* 3 */             p41 p41Var = new p41();
/* 6 */             DEFAULT_INSTANCE = p41Var;
/* 10 */            sq0.m8614t(p41.class, p41Var);
                }

                /* JADX INFO: renamed from: A */
                public static o41 m7329A() {
/* 7 */             return (o41) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: B */
                public static p41 m7330B(AbstractC2298vl abstractC2298vl, dg0 dg0Var) {
/* 7 */             return (p41) sq0.m8612r(DEFAULT_INSTANCE, abstractC2298vl, dg0Var);
                }

                /* JADX INFO: renamed from: w */
                public static void m7331w(p41 p41Var) {
/* 2 */             p41Var.version_ = 0;
                }

                /* JADX INFO: renamed from: x */
                public static void m7332x(p41 p41Var, q41 q41Var) {
/* 1 */             p41Var.getClass();
/* 4 */             q41Var.getClass();
/* 7 */             p41Var.params_ = q41Var;
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
/* 70 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
                        case 3:
/* 52 */                    return new p41();
                        case 4:
/* 46 */                    return new o41(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (p41.class) {
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
                public final q41 m7333y() {
/* 1 */             q41 q41Var = this.params_;
                    return q41Var == null ? q41.m7702w() : q41Var;
                }

                /* JADX INFO: renamed from: z */
                public final int m7334z() {
/* 1 */             return this.version_;
                }
            }
