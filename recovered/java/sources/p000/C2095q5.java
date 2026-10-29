            package p000;
            
            /* JADX INFO: renamed from: q5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2095q5 extends sq0 {
                private static final C2095q5 DEFAULT_INSTANCE;
                public static final int KEY_VALUE_FIELD_NUMBER = 3;
                public static final int PARAMS_FIELD_NUMBER = 2;
                private static volatile mr1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 1;
                private AbstractC2298vl keyValue_ = AbstractC2298vl.f18234b;
                private C2319w5 params_;
                private int version_;

                static {
/* 3 */             C2095q5 c2095q5 = new C2095q5();
/* 6 */             DEFAULT_INSTANCE = c2095q5;
/* 10 */            sq0.m8614t(C2095q5.class, c2095q5);
                }

                /* JADX INFO: renamed from: C */
                public static C2058p5 m7707C() {
/* 7 */             return (C2058p5) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: D */
                public static C2095q5 m7708D(AbstractC2298vl abstractC2298vl, dg0 dg0Var) {
/* 7 */             return (C2095q5) sq0.m8612r(DEFAULT_INSTANCE, abstractC2298vl, dg0Var);
                }

                /* JADX INFO: renamed from: w */
                public static void m7709w(C2095q5 c2095q5) {
/* 2 */             c2095q5.version_ = 0;
                }

                /* JADX INFO: renamed from: x */
                public static void m7710x(C2095q5 c2095q5, C2319w5 c2319w5) {
/* 1 */             c2095q5.getClass();
/* 4 */             c2319w5.getClass();
/* 7 */             c2095q5.params_ = c2319w5;
                }

                /* JADX INFO: renamed from: y */
                public static void m7711y(C2095q5 c2095q5, C2222tl c2222tl) {
/* 1 */             c2095q5.getClass();
/* 4 */             c2095q5.keyValue_ = c2222tl;
                }

                /* JADX INFO: renamed from: A */
                public final C2319w5 m7712A() {
/* 1 */             C2319w5 c2319w5 = this.params_;
                    return c2319w5 == null ? C2319w5.m9468x() : c2319w5;
                }

                /* JADX INFO: renamed from: B */
                public final int m7713B() {
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
/* 72 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
                        case 3:
/* 52 */                    return new C2095q5();
                        case 4:
/* 46 */                    return new C2058p5(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (C2095q5.class) {
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
                public final AbstractC2298vl m7714z() {
/* 1 */             return this.keyValue_;
                }
            }
