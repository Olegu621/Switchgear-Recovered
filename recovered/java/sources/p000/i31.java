            package p000;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class i31 extends sq0 {
                private static final i31 DEFAULT_INSTANCE;
                public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
                private static volatile mr1 PARSER = null;
                public static final int TYPE_URL_FIELD_NUMBER = 1;
                public static final int VALUE_FIELD_NUMBER = 2;
                private int keyMaterialType_;
                private String typeUrl_ = HttpUrl.FRAGMENT_ENCODE_SET;
                private AbstractC2298vl value_ = AbstractC2298vl.f18234b;

                static {
/* 3 */             i31 i31Var = new i31();
/* 6 */             DEFAULT_INSTANCE = i31Var;
/* 10 */            sq0.m8614t(i31.class, i31Var);
                }

                /* JADX INFO: renamed from: D */
                public static g31 m4453D() {
/* 7 */             return (g31) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: w */
                public static void m4454w(i31 i31Var, String str) {
/* 1 */             i31Var.getClass();
/* 4 */             str.getClass();
/* 7 */             i31Var.typeUrl_ = str;
                }

                /* JADX INFO: renamed from: x */
                public static void m4455x(i31 i31Var, C2222tl c2222tl) {
/* 1 */             i31Var.getClass();
/* 4 */             i31Var.value_ = c2222tl;
                }

                /* JADX INFO: renamed from: y */
                public static void m4456y(i31 i31Var, h31 h31Var) {
/* 1 */             i31Var.getClass();
/* 6 */             if (h31Var != h31.UNRECOGNIZED) {
/* 10 */                i31Var.keyMaterialType_ = h31Var.f8888a;
                    } else {
/* 13 */                h31Var.getClass();
/* 18 */                C1951n4.m6859j("Can't get the number of an unknown enum value.");
                    }
                }

                /* JADX INFO: renamed from: z */
                public static i31 m4457z() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                /* JADX INFO: renamed from: A */
                public final h31 m4458A() {
                    h31 h31Var;
/* 1 */             int i = this.keyMaterialType_;
/* 3 */             if (i == 0) {
/* 31 */                h31Var = h31.UNKNOWN_KEYMATERIAL;
                    } else if (i == 1) {
/* 28 */                h31Var = h31.SYMMETRIC;
                    } else if (i == 2) {
/* 25 */                h31Var = h31.ASYMMETRIC_PRIVATE;
                    } else if (i != 3) {
/* 19 */                h31Var = i != 4 ? null : h31.REMOTE;
                    } else {
/* 22 */                h31Var = h31.ASYMMETRIC_PUBLIC;
                    }
                    return h31Var == null ? h31.UNRECOGNIZED : h31Var;
                }

                /* JADX INFO: renamed from: B */
                public final String m4459B() {
/* 1 */             return this.typeUrl_;
                }

                /* JADX INFO: renamed from: C */
                public final AbstractC2298vl m4460C() {
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
/* 72 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
                        case 3:
/* 52 */                    return new i31();
                        case 4:
/* 46 */                    return new g31(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (i31.class) {
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
