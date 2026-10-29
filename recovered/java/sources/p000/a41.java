            package p000;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a41 extends sq0 {
                public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
                private static final a41 DEFAULT_INSTANCE;
                public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
                public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
                private static volatile mr1 PARSER = null;
                public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
                public static final int TYPE_URL_FIELD_NUMBER = 2;
                private int keyManagerVersion_;
                private boolean newKeyAllowed_;
                private String primitiveName_ = HttpUrl.FRAGMENT_ENCODE_SET;
                private String typeUrl_ = HttpUrl.FRAGMENT_ENCODE_SET;
                private String catalogueName_ = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             a41 a41Var = new a41();
/* 6 */             DEFAULT_INSTANCE = a41Var;
/* 10 */            sq0.m8614t(a41.class, a41Var);
                }

                @Override // p000.sq0
                /* JADX INFO: renamed from: i */
                public final Object mo54i(int i) {
                    mr1 qq0Var;
                    switch (AbstractC0886en.m3520y(i)) {
                        case 0:
/* 82 */                    return (byte) 1;
                        case 1:
/* 6 */                     return null;
                        case 2:
/* 77 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
                        case 3:
/* 53 */                    return new a41();
                        case 4:
/* 47 */                    return new C0891es(DEFAULT_INSTANCE, 1);
                        case 5:
/* 40 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 14 */                    mr1 mr1Var = PARSER;
/* 16 */                    if (mr1Var != null) {
/* 39 */                        return mr1Var;
                            }
                            synchronized (a41.class) {
                                try {
/* 21 */                            qq0Var = PARSER;
/* 23 */                            if (qq0Var == null) {
/* 27 */                                qq0Var = new qq0();
/* 30 */                                PARSER = qq0Var;
                                    }
                                } catch (Throwable th) {
/* 38 */                            throw th;
                                }
                                break;
                            }
/* 36 */                    return qq0Var;
                        default:
/* 10 */                    f42.m3660p();
/* 6 */                     return null;
                    }
                }
            }
