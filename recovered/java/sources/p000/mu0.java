            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mu0 extends sq0 {
                private static final mu0 DEFAULT_INSTANCE;
                public static final int KEY_VALUE_FIELD_NUMBER = 3;
                public static final int PARAMS_FIELD_NUMBER = 2;
                private static volatile mr1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 1;
                private AbstractC2298vl keyValue_ = AbstractC2298vl.f18234b;
                private su0 params_;
                private int version_;

                static {
/* 3 */             mu0 mu0Var = new mu0();
/* 6 */             DEFAULT_INSTANCE = mu0Var;
/* 10 */            sq0.m8614t(mu0.class, mu0Var);
                }

                /* JADX INFO: renamed from: D */
                public static lu0 m6801D() {
/* 7 */             return (lu0) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: E */
                public static mu0 m6802E(AbstractC2298vl abstractC2298vl, dg0 dg0Var) {
/* 7 */             return (mu0) sq0.m8612r(DEFAULT_INSTANCE, abstractC2298vl, dg0Var);
                }

                /* JADX INFO: renamed from: w */
                public static void m6803w(mu0 mu0Var) {
/* 2 */             mu0Var.version_ = 0;
                }

                /* JADX INFO: renamed from: x */
                public static void m6804x(mu0 mu0Var, su0 su0Var) {
/* 1 */             mu0Var.getClass();
/* 4 */             su0Var.getClass();
/* 7 */             mu0Var.params_ = su0Var;
                }

                /* JADX INFO: renamed from: y */
                public static void m6805y(mu0 mu0Var, C2222tl c2222tl) {
/* 1 */             mu0Var.getClass();
/* 4 */             mu0Var.keyValue_ = c2222tl;
                }

                /* JADX INFO: renamed from: z */
                public static mu0 m6806z() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                /* JADX INFO: renamed from: A */
                public final AbstractC2298vl m6807A() {
/* 1 */             return this.keyValue_;
                }

                /* JADX INFO: renamed from: B */
                public final su0 m6808B() {
/* 1 */             su0 su0Var = this.params_;
                    return su0Var == null ? su0.m8637y() : su0Var;
                }

                /* JADX INFO: renamed from: C */
                public final int m6809C() {
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
/* 52 */                    return new mu0();
                        case 4:
/* 46 */                    return new lu0(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (mu0.class) {
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
            }
