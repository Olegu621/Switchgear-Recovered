            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class h41 extends sq0 {
                private static final h41 DEFAULT_INSTANCE;
                public static final int KEY_DATA_FIELD_NUMBER = 1;
                public static final int KEY_ID_FIELD_NUMBER = 3;
                public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
                private static volatile mr1 PARSER = null;
                public static final int STATUS_FIELD_NUMBER = 2;
                private i31 keyData_;
                private int keyId_;
                private int outputPrefixType_;
                private int status_;

                static {
/* 3 */             h41 h41Var = new h41();
/* 6 */             DEFAULT_INSTANCE = h41Var;
/* 10 */            sq0.m8614t(h41.class, h41Var);
                }

                /* JADX INFO: renamed from: F */
                public static g41 m4102F() {
/* 7 */             return (g41) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: w */
                public static void m4103w(h41 h41Var, i31 i31Var) {
/* 1 */             h41Var.getClass();
/* 4 */             h41Var.keyData_ = i31Var;
                }

                /* JADX INFO: renamed from: x */
                public static void m4104x(h41 h41Var, wq1 wq1Var) {
/* 1 */             h41Var.getClass();
/* 8 */             h41Var.outputPrefixType_ = wq1Var.m9602b();
                }

                /* JADX INFO: renamed from: y */
                public static void m4105y(h41 h41Var) {
/* 1 */             h41Var.getClass();
/* 10 */            h41Var.status_ = u31.ENABLED.m8948a();
                }

                /* JADX INFO: renamed from: z */
                public static void m4106z(h41 h41Var, int i) {
/* 1 */             h41Var.keyId_ = i;
                }

                /* JADX INFO: renamed from: A */
                public final i31 m4107A() {
/* 1 */             i31 i31Var = this.keyData_;
                    return i31Var == null ? i31.m4457z() : i31Var;
                }

                /* JADX INFO: renamed from: B */
                public final int m4108B() {
/* 1 */             return this.keyId_;
                }

                /* JADX INFO: renamed from: C */
                public final wq1 m4109C() {
/* 3 */             wq1 wq1VarM9601a = wq1.m9601a(this.outputPrefixType_);
                    return wq1VarM9601a == null ? wq1.UNRECOGNIZED : wq1VarM9601a;
                }

                /* JADX INFO: renamed from: D */
                public final u31 m4110D() {
                    u31 u31Var;
/* 1 */             int i = this.status_;
/* 3 */             if (i == 0) {
/* 25 */                u31Var = u31.UNKNOWN_STATUS;
                    } else if (i == 1) {
/* 22 */                u31Var = u31.ENABLED;
                    } else if (i != 2) {
/* 16 */                u31Var = i != 3 ? null : u31.DESTROYED;
                    } else {
/* 19 */                u31Var = u31.DISABLED;
                    }
                    return u31Var == null ? u31.UNRECOGNIZED : u31Var;
                }

                /* JADX INFO: renamed from: E */
                public final boolean m4111E() {
                    return this.keyData_ != null;
                }

                @Override // p000.sq0
                /* JADX INFO: renamed from: i */
                public final Object mo54i(int i) {
                    mr1 qq0Var;
                    switch (AbstractC0886en.m3520y(i)) {
                        case 0:
/* 80 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 74 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                        case 3:
/* 52 */                    return new h41();
                        case 4:
/* 46 */                    return new g41(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (h41.class) {
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
