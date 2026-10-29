            package p000;
            
            /* JADX INFO: renamed from: fs */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0928fs extends sq0 {
                private static final C0928fs DEFAULT_INSTANCE;
                private static volatile mr1 PARSER;

                static {
/* 3 */             C0928fs c0928fs = new C0928fs();
/* 6 */             DEFAULT_INSTANCE = c0928fs;
/* 10 */            sq0.m8614t(C0928fs.class, c0928fs);
                }

                /* JADX INFO: renamed from: w */
                public static C0928fs m3805w() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                /* JADX INFO: renamed from: x */
                public static C0928fs m3806x(AbstractC2298vl abstractC2298vl, dg0 dg0Var) {
/* 7 */             return (C0928fs) sq0.m8612r(DEFAULT_INSTANCE, abstractC2298vl, dg0Var);
                }

                @Override // p000.sq0
                /* JADX INFO: renamed from: i */
                public final Object mo54i(int i) {
                    mr1 qq0Var;
                    switch (AbstractC0886en.m3520y(i)) {
                        case 0:
/* 69 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 63 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0000", null);
                        case 3:
/* 53 */                    return new C0928fs();
                        case 4:
/* 47 */                    return new C0891es(DEFAULT_INSTANCE, 0);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (C0928fs.class) {
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
