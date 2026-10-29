            package p000;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class v41 extends sq0 {
                private static final v41 DEFAULT_INSTANCE;
                public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
                public static final int KEK_URI_FIELD_NUMBER = 1;
                private static volatile mr1 PARSER;
                private w31 dekTemplate_;
                private String kekUri_ = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             v41 v41Var = new v41();
/* 6 */             DEFAULT_INSTANCE = v41Var;
/* 10 */            sq0.m8614t(v41.class, v41Var);
                }

                /* JADX INFO: renamed from: A */
                public static v41 m9219A(AbstractC2298vl abstractC2298vl, dg0 dg0Var) {
/* 7 */             return (v41) sq0.m8612r(DEFAULT_INSTANCE, abstractC2298vl, dg0Var);
                }

                /* JADX INFO: renamed from: w */
                public static v41 m9220w() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                @Override // p000.sq0
                /* JADX INFO: renamed from: i */
                public final Object mo54i(int i) {
                    mr1 qq0Var;
                    switch (AbstractC0886en.m3520y(i)) {
                        case 0:
/* 77 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 71 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
                        case 3:
/* 53 */                    return new v41();
                        case 4:
/* 47 */                    return new C0891es(DEFAULT_INSTANCE, 3);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (v41.class) {
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

                /* JADX INFO: renamed from: x */
                public final w31 m9221x() {
/* 1 */             w31 w31Var = this.dekTemplate_;
                    return w31Var == null ? w31.m9462z() : w31Var;
                }

                /* JADX INFO: renamed from: y */
                public final String m9222y() {
/* 1 */             return this.kekUri_;
                }

                /* JADX INFO: renamed from: z */
                public final boolean m9223z() {
                    return this.dekTemplate_ != null;
                }
            }
