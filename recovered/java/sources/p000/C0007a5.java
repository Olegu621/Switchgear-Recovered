            package p000;
            
            /* JADX INFO: renamed from: a5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0007a5 extends sq0 {
                public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
                private static final C0007a5 DEFAULT_INSTANCE;
                public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
                private static volatile mr1 PARSER;
                private C1878l5 aesCtrKeyFormat_;
                private pu0 hmacKeyFormat_;

                static {
/* 3 */             C0007a5 c0007a5 = new C0007a5();
/* 6 */             DEFAULT_INSTANCE = c0007a5;
/* 10 */            sq0.m8614t(C0007a5.class, c0007a5);
                }

                /* JADX INFO: renamed from: A */
                public static C2522z4 m60A() {
/* 7 */             return (C2522z4) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: B */
                public static C0007a5 m61B(AbstractC2298vl abstractC2298vl, dg0 dg0Var) {
/* 7 */             return (C0007a5) sq0.m8612r(DEFAULT_INSTANCE, abstractC2298vl, dg0Var);
                }

                /* JADX INFO: renamed from: w */
                public static void m62w(C0007a5 c0007a5, C1878l5 c1878l5) {
/* 1 */             c0007a5.getClass();
/* 4 */             c0007a5.aesCtrKeyFormat_ = c1878l5;
                }

                /* JADX INFO: renamed from: x */
                public static void m63x(C0007a5 c0007a5, pu0 pu0Var) {
/* 1 */             c0007a5.getClass();
/* 4 */             c0007a5.hmacKeyFormat_ = pu0Var;
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
/* 70 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
                        case 3:
/* 52 */                    return new C0007a5();
                        case 4:
/* 46 */                    return new C2522z4(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (C0007a5.class) {
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
                public final C1878l5 m64y() {
/* 1 */             C1878l5 c1878l5 = this.aesCtrKeyFormat_;
                    return c1878l5 == null ? C1878l5.m6339y() : c1878l5;
                }

                /* JADX INFO: renamed from: z */
                public final pu0 m65z() {
/* 1 */             pu0 pu0Var = this.hmacKeyFormat_;
                    return pu0Var == null ? pu0.m7557y() : pu0Var;
                }
            }
