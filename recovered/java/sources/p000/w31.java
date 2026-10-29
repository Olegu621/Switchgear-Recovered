            package p000;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class w31 extends sq0 {
                private static final w31 DEFAULT_INSTANCE;
                public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
                private static volatile mr1 PARSER = null;
                public static final int TYPE_URL_FIELD_NUMBER = 1;
                public static final int VALUE_FIELD_NUMBER = 2;
                private int outputPrefixType_;
                private String typeUrl_ = HttpUrl.FRAGMENT_ENCODE_SET;
                private AbstractC2298vl value_ = AbstractC2298vl.f18234b;

                static {
/* 3 */             w31 w31Var = new w31();
/* 6 */             DEFAULT_INSTANCE = w31Var;
/* 10 */            sq0.m8614t(w31.class, w31Var);
                }

                /* JADX INFO: renamed from: D */
                public static v31 m9458D() {
/* 7 */             return (v31) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: w */
                public static void m9459w(w31 w31Var, String str) {
/* 1 */             w31Var.getClass();
/* 4 */             str.getClass();
/* 7 */             w31Var.typeUrl_ = str;
                }

                /* JADX INFO: renamed from: x */
                public static void m9460x(w31 w31Var, C2222tl c2222tl) {
/* 1 */             w31Var.getClass();
/* 4 */             w31Var.value_ = c2222tl;
                }

                /* JADX INFO: renamed from: y */
                public static void m9461y(w31 w31Var, wq1 wq1Var) {
/* 1 */             w31Var.getClass();
/* 8 */             w31Var.outputPrefixType_ = wq1Var.m9602b();
                }

                /* JADX INFO: renamed from: z */
                public static w31 m9462z() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                /* JADX INFO: renamed from: A */
                public final wq1 m9463A() {
/* 3 */             wq1 wq1VarM9601a = wq1.m9601a(this.outputPrefixType_);
                    return wq1VarM9601a == null ? wq1.UNRECOGNIZED : wq1VarM9601a;
                }

                /* JADX INFO: renamed from: B */
                public final String m9464B() {
/* 1 */             return this.typeUrl_;
                }

                /* JADX INFO: renamed from: C */
                public final AbstractC2298vl m9465C() {
/* 1 */             return this.value_;
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
/* 72 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
                        case 3:
/* 52 */                    return new w31();
                        case 4:
/* 46 */                    return new v31(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (w31.class) {
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
