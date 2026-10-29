            package p000;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class q41 extends sq0 {
                private static final q41 DEFAULT_INSTANCE;
                public static final int KEY_URI_FIELD_NUMBER = 1;
                private static volatile mr1 PARSER;
                private String keyUri_ = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             q41 q41Var = new q41();
/* 6 */             DEFAULT_INSTANCE = q41Var;
/* 10 */            sq0.m8614t(q41.class, q41Var);
                }

                /* JADX INFO: renamed from: w */
                public static q41 m7702w() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                /* JADX INFO: renamed from: y */
                public static q41 m7703y(AbstractC2298vl abstractC2298vl, dg0 dg0Var) {
/* 7 */             return (q41) sq0.m8612r(DEFAULT_INSTANCE, abstractC2298vl, dg0Var);
                }

                @Override // p000.sq0
                /* JADX INFO: renamed from: i */
                public final Object mo54i(int i) {
                    mr1 qq0Var;
                    switch (AbstractC0886en.m3520y(i)) {
                        case 0:
/* 75 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 69 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
                        case 3:
/* 53 */                    return new q41();
                        case 4:
/* 47 */                    return new C0891es(DEFAULT_INSTANCE, 2);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (q41.class) {
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
                public final String m7704x() {
/* 1 */             return this.keyUri_;
                }
            }
