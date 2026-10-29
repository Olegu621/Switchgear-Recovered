            package p000;
            
            /* JADX INFO: renamed from: cs */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0818cs extends sq0 {
                private static final C0818cs DEFAULT_INSTANCE;
                public static final int KEY_VALUE_FIELD_NUMBER = 2;
                private static volatile mr1 PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 1;
                private AbstractC2298vl keyValue_ = AbstractC2298vl.f18234b;
                private int version_;

                static {
/* 3 */             C0818cs c0818cs = new C0818cs();
/* 6 */             DEFAULT_INSTANCE = c0818cs;
/* 10 */            sq0.m8614t(C0818cs.class, c0818cs);
                }

                /* JADX INFO: renamed from: A */
                public static C0191bs m2877A() {
/* 7 */             return (C0191bs) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: B */
                public static C0818cs m2878B(AbstractC2298vl abstractC2298vl, dg0 dg0Var) {
/* 7 */             return (C0818cs) sq0.m8612r(DEFAULT_INSTANCE, abstractC2298vl, dg0Var);
                }

                /* JADX INFO: renamed from: w */
                public static void m2879w(C0818cs c0818cs) {
/* 2 */             c0818cs.version_ = 0;
                }

                /* JADX INFO: renamed from: x */
                public static void m2880x(C0818cs c0818cs, C2222tl c2222tl) {
/* 1 */             c0818cs.getClass();
/* 4 */             c0818cs.keyValue_ = c2222tl;
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
/* 70 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
                        case 3:
/* 52 */                    return new C0818cs();
                        case 4:
/* 46 */                    return new C0191bs(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (C0818cs.class) {
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
                public final AbstractC2298vl m2881y() {
/* 1 */             return this.keyValue_;
                }

                /* JADX INFO: renamed from: z */
                public final int m2882z() {
/* 1 */             return this.version_;
                }
            }
