            package p000;
            
            /* JADX INFO: renamed from: a6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0008a6 extends sq0 {
                private static final C0008a6 DEFAULT_INSTANCE;
                public static final int KEY_VALUE_FIELD_NUMBER = 3;
                private static volatile mr1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 1;
                private AbstractC2298vl keyValue_ = AbstractC2298vl.f18234b;
                private int version_;

                static {
/* 3 */             C0008a6 c0008a6 = new C0008a6();
/* 6 */             DEFAULT_INSTANCE = c0008a6;
/* 10 */            sq0.m8614t(C0008a6.class, c0008a6);
                }

                /* JADX INFO: renamed from: A */
                public static C2523z5 m68A() {
/* 7 */             return (C2523z5) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: B */
                public static C0008a6 m69B(AbstractC2298vl abstractC2298vl, dg0 dg0Var) {
/* 7 */             return (C0008a6) sq0.m8612r(DEFAULT_INSTANCE, abstractC2298vl, dg0Var);
                }

                /* JADX INFO: renamed from: w */
                public static void m70w(C0008a6 c0008a6) {
/* 2 */             c0008a6.version_ = 0;
                }

                /* JADX INFO: renamed from: x */
                public static void m71x(C0008a6 c0008a6, C2222tl c2222tl) {
/* 1 */             c0008a6.getClass();
/* 4 */             c0008a6.keyValue_ = c2222tl;
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
/* 70 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
                        case 3:
/* 52 */                    return new C0008a6();
                        case 4:
/* 46 */                    return new C2523z5(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (C0008a6.class) {
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
                public final AbstractC2298vl m72y() {
/* 1 */             return this.keyValue_;
                }

                /* JADX INFO: renamed from: z */
                public final int m73z() {
/* 1 */             return this.version_;
                }
            }
