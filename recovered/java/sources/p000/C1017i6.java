            package p000;
            
            /* JADX INFO: renamed from: i6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1017i6 extends sq0 {
                private static final C1017i6 DEFAULT_INSTANCE;
                public static final int KEY_VALUE_FIELD_NUMBER = 3;
                private static volatile mr1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 1;
                private AbstractC2298vl keyValue_ = AbstractC2298vl.f18234b;
                private int version_;

                static {
/* 3 */             C1017i6 c1017i6 = new C1017i6();
/* 6 */             DEFAULT_INSTANCE = c1017i6;
/* 10 */            sq0.m8614t(C1017i6.class, c1017i6);
                }

                /* JADX INFO: renamed from: A */
                public static C0980h6 m4476A() {
/* 7 */             return (C0980h6) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: B */
                public static C1017i6 m4477B(AbstractC2298vl abstractC2298vl, dg0 dg0Var) {
/* 7 */             return (C1017i6) sq0.m8612r(DEFAULT_INSTANCE, abstractC2298vl, dg0Var);
                }

                /* JADX INFO: renamed from: w */
                public static void m4478w(C1017i6 c1017i6) {
/* 2 */             c1017i6.version_ = 0;
                }

                /* JADX INFO: renamed from: x */
                public static void m4479x(C1017i6 c1017i6, C2222tl c2222tl) {
/* 1 */             c1017i6.getClass();
/* 4 */             c1017i6.keyValue_ = c2222tl;
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
/* 52 */                    return new C1017i6();
                        case 4:
/* 46 */                    return new C0980h6(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (C1017i6.class) {
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
                public final AbstractC2298vl m4480y() {
/* 1 */             return this.keyValue_;
                }

                /* JADX INFO: renamed from: z */
                public final int m4481z() {
/* 1 */             return this.version_;
                }
            }
