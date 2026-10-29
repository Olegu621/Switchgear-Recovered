            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class n41 extends sq0 {
                private static final n41 DEFAULT_INSTANCE;
                public static final int KEY_INFO_FIELD_NUMBER = 2;
                private static volatile mr1 PARSER = null;
                public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
                private cz0 keyInfo_ = dz1.f7454d;
                private int primaryKeyId_;

                static {
/* 3 */             n41 n41Var = new n41();
/* 6 */             DEFAULT_INSTANCE = n41Var;
/* 10 */            sq0.m8614t(n41.class, n41Var);
                }

                /* JADX INFO: renamed from: w */
                public static void m6872w(n41 n41Var, int i) {
/* 1 */             n41Var.primaryKeyId_ = i;
                }

                /* JADX INFO: renamed from: x */
                public static void m6873x(n41 n41Var, m41 m41Var) {
/* 1 */             n41Var.getClass();
/* 4 */             cz0 cz0Var = n41Var.keyInfo_;
/* 11 */            if (!((AbstractC0827d0) cz0Var).f6945a) {
/* 13 */                int size = cz0Var.size();
/* 28 */                n41Var.keyInfo_ = cz0Var.mo2899x(size == 0 ? 10 : size * 2);
                    }
/* 32 */            n41Var.keyInfo_.add(m41Var);
                }

                /* JADX INFO: renamed from: z */
                public static k41 m6874z() {
/* 7 */             return (k41) DEFAULT_INSTANCE.m8618h();
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
/* 72 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", m41.class});
                        case 3:
/* 52 */                    return new n41();
                        case 4:
/* 46 */                    return new k41(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (n41.class) {
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
                public final m41 m6875y() {
/* 8 */             return (m41) this.keyInfo_.get(0);
                }
            }
