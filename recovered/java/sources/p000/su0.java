            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class su0 extends sq0 {
                private static final su0 DEFAULT_INSTANCE;
                public static final int HASH_FIELD_NUMBER = 1;
                private static volatile mr1 PARSER = null;
                public static final int TAG_SIZE_FIELD_NUMBER = 2;
                private int hash_;
                private int tagSize_;

                static {
/* 3 */             su0 su0Var = new su0();
/* 6 */             DEFAULT_INSTANCE = su0Var;
/* 10 */            sq0.m8614t(su0.class, su0Var);
                }

                /* JADX INFO: renamed from: B */
                public static ru0 m8634B() {
/* 7 */             return (ru0) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: w */
                public static void m8635w(su0 su0Var, st0 st0Var) {
/* 1 */             su0Var.getClass();
/* 8 */             su0Var.hash_ = st0Var.m8632a();
                }

                /* JADX INFO: renamed from: x */
                public static void m8636x(su0 su0Var, int i) {
/* 1 */             su0Var.tagSize_ = i;
                }

                /* JADX INFO: renamed from: y */
                public static su0 m8637y() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                /* JADX INFO: renamed from: A */
                public final int m8638A() {
/* 1 */             return this.tagSize_;
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
/* 70 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
                        case 3:
/* 52 */                    return new su0();
                        case 4:
/* 46 */                    return new ru0(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (su0.class) {
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
                public final st0 m8639z() {
                    st0 st0Var;
/* 1 */             int i = this.hash_;
/* 3 */             if (i == 0) {
/* 37 */                st0Var = st0.UNKNOWN_HASH;
                    } else if (i == 1) {
/* 34 */                st0Var = st0.SHA1;
                    } else if (i == 2) {
/* 31 */                st0Var = st0.SHA384;
                    } else if (i == 3) {
/* 28 */                st0Var = st0.SHA256;
                    } else if (i != 4) {
/* 22 */                st0Var = i != 5 ? null : st0.SHA224;
                    } else {
/* 25 */                st0Var = st0.SHA512;
                    }
                    return st0Var == null ? st0.UNRECOGNIZED : st0Var;
                }
            }
