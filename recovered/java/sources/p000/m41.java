            package p000;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class m41 extends sq0 {
                private static final m41 DEFAULT_INSTANCE;
                public static final int KEY_ID_FIELD_NUMBER = 3;
                public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
                private static volatile mr1 PARSER = null;
                public static final int STATUS_FIELD_NUMBER = 2;
                public static final int TYPE_URL_FIELD_NUMBER = 1;
                private int keyId_;
                private int outputPrefixType_;
                private int status_;
                private String typeUrl_ = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             m41 m41Var = new m41();
/* 6 */             DEFAULT_INSTANCE = m41Var;
/* 10 */            sq0.m8614t(m41.class, m41Var);
                }

                /* JADX INFO: renamed from: B */
                public static l41 m6602B() {
/* 7 */             return (l41) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: w */
                public static void m6603w(m41 m41Var, String str) {
/* 1 */             m41Var.getClass();
/* 4 */             str.getClass();
/* 7 */             m41Var.typeUrl_ = str;
                }

                /* JADX INFO: renamed from: x */
                public static void m6604x(m41 m41Var, wq1 wq1Var) {
/* 1 */             m41Var.getClass();
/* 8 */             m41Var.outputPrefixType_ = wq1Var.m9602b();
                }

                /* JADX INFO: renamed from: y */
                public static void m6605y(m41 m41Var, u31 u31Var) {
/* 1 */             m41Var.getClass();
/* 8 */             m41Var.status_ = u31Var.m8948a();
                }

                /* JADX INFO: renamed from: z */
                public static void m6606z(m41 m41Var, int i) {
/* 1 */             m41Var.keyId_ = i;
                }

                /* JADX INFO: renamed from: A */
                public final int m6607A() {
/* 1 */             return this.keyId_;
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
/* 74 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                        case 3:
/* 52 */                    return new m41();
                        case 4:
/* 46 */                    return new l41(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (m41.class) {
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
