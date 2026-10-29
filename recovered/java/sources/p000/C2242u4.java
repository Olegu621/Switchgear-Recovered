            package p000;
            
            /* JADX INFO: renamed from: u4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2242u4 extends sq0 {
                private static final C2242u4 DEFAULT_INSTANCE;
                private static volatile mr1 PARSER = null;
                public static final int TAG_SIZE_FIELD_NUMBER = 1;
                private int tagSize_;

                static {
/* 3 */             C2242u4 c2242u4 = new C2242u4();
/* 6 */             DEFAULT_INSTANCE = c2242u4;
/* 10 */            sq0.m8614t(C2242u4.class, c2242u4);
                }

                /* JADX INFO: renamed from: w */
                public static void m8949w(C2242u4 c2242u4) {
/* 3 */             c2242u4.tagSize_ = 16;
                }

                /* JADX INFO: renamed from: x */
                public static C2242u4 m8950x() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                /* JADX INFO: renamed from: z */
                public static C2205t4 m8951z() {
/* 7 */             return (C2205t4) DEFAULT_INSTANCE.m8618h();
                }

                @Override // p000.sq0
                /* JADX INFO: renamed from: i */
                public final Object mo54i(int i) {
                    mr1 qq0Var;
                    switch (AbstractC0886en.m3520y(i)) {
                        case 0:
/* 74 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 68 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
                        case 3:
/* 52 */                    return new C2242u4();
                        case 4:
/* 46 */                    return new C2205t4(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (C2242u4.class) {
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
                public final int m8952y() {
/* 1 */             return this.tagSize_;
                }
            }
