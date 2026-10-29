            package p000;

            import java.io.ByteArrayInputStream;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zd0 extends sq0 {
                private static final zd0 DEFAULT_INSTANCE;
                public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
                public static final int KEYSET_INFO_FIELD_NUMBER = 3;
                private static volatile mr1 PARSER;
                private AbstractC2298vl encryptedKeyset_ = AbstractC2298vl.f18234b;
                private n41 keysetInfo_;

                static {
/* 3 */             zd0 zd0Var = new zd0();
/* 6 */             DEFAULT_INSTANCE = zd0Var;
/* 10 */            sq0.m8614t(zd0.class, zd0Var);
                }

                /* JADX INFO: renamed from: A */
                public static zd0 m10335A(ByteArrayInputStream byteArrayInputStream, dg0 dg0Var) throws pz0 {
/* 8 */             sq0 sq0VarM8613s = sq0.m8613s(DEFAULT_INSTANCE, new C0932fw(byteArrayInputStream), dg0Var);
/* 12 */            sq0.m8608g(sq0VarM8613s);
/* 15 */            return (zd0) sq0VarM8613s;
                }

                /* JADX INFO: renamed from: w */
                public static void m10336w(zd0 zd0Var, C2222tl c2222tl) {
/* 1 */             zd0Var.getClass();
/* 4 */             zd0Var.encryptedKeyset_ = c2222tl;
                }

                /* JADX INFO: renamed from: x */
                public static void m10337x(zd0 zd0Var, n41 n41Var) {
/* 1 */             zd0Var.getClass();
/* 4 */             zd0Var.keysetInfo_ = n41Var;
                }

                /* JADX INFO: renamed from: z */
                public static yd0 m10338z() {
/* 7 */             return (yd0) DEFAULT_INSTANCE.m8618h();
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
/* 70 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
                        case 3:
/* 52 */                    return new zd0();
                        case 4:
/* 46 */                    return new yd0(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (zd0.class) {
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
                public final AbstractC2298vl m10339y() {
/* 1 */             return this.encryptedKeyset_;
                }
            }
