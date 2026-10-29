            package p000;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rw1 extends tq0 {
                public static final int BOOLEAN_FIELD_NUMBER = 1;
                public static final int BYTES_FIELD_NUMBER = 8;
                private static final rw1 DEFAULT_INSTANCE;
                public static final int DOUBLE_FIELD_NUMBER = 7;
                public static final int FLOAT_FIELD_NUMBER = 2;
                public static final int INTEGER_FIELD_NUMBER = 3;
                public static final int LONG_FIELD_NUMBER = 4;
                private static volatile nr1 PARSER = null;
                public static final int STRING_FIELD_NUMBER = 5;
                public static final int STRING_SET_FIELD_NUMBER = 6;
                private int valueCase_ = 0;
                private Object value_;

                static {
/* 3 */             rw1 rw1Var = new rw1();
/* 6 */             DEFAULT_INSTANCE = rw1Var;
/* 10 */            tq0.m8855j(rw1.class, rw1Var);
                }

                /* JADX INFO: renamed from: D */
                public static qw1 m8295D() {
/* 10 */            return (qw1) ((pq0) DEFAULT_INSTANCE.mo7066c(5));
                }

                /* JADX INFO: renamed from: l */
                public static void m8296l(rw1 rw1Var, long j) {
/* 2 */             rw1Var.valueCase_ = 4;
/* 8 */             rw1Var.value_ = Long.valueOf(j);
                }

                /* JADX INFO: renamed from: m */
                public static void m8297m(rw1 rw1Var, String str) {
/* 1 */             rw1Var.getClass();
/* 5 */             rw1Var.valueCase_ = 5;
/* 7 */             rw1Var.value_ = str;
                }

                /* JADX INFO: renamed from: n */
                public static void m8298n(rw1 rw1Var, pw1 pw1Var) {
/* 1 */             rw1Var.getClass();
/* 4 */             rw1Var.value_ = pw1Var;
/* 7 */             rw1Var.valueCase_ = 6;
                }

                /* JADX INFO: renamed from: o */
                public static void m8299o(rw1 rw1Var, double d) {
/* 2 */             rw1Var.valueCase_ = 7;
/* 8 */             rw1Var.value_ = Double.valueOf(d);
                }

                /* JADX INFO: renamed from: p */
                public static void m8300p(rw1 rw1Var, C2259ul c2259ul) {
/* 1 */             rw1Var.getClass();
/* 6 */             rw1Var.valueCase_ = 8;
/* 8 */             rw1Var.value_ = c2259ul;
                }

                /* JADX INFO: renamed from: q */
                public static void m8301q(rw1 rw1Var, boolean z) {
/* 2 */             rw1Var.valueCase_ = 1;
/* 8 */             rw1Var.value_ = Boolean.valueOf(z);
                }

                /* JADX INFO: renamed from: r */
                public static void m8302r(rw1 rw1Var, float f) {
/* 2 */             rw1Var.valueCase_ = 2;
/* 8 */             rw1Var.value_ = Float.valueOf(f);
                }

                /* JADX INFO: renamed from: s */
                public static void m8303s(rw1 rw1Var, int i) {
/* 2 */             rw1Var.valueCase_ = 3;
/* 8 */             rw1Var.value_ = Integer.valueOf(i);
                }

                /* JADX INFO: renamed from: v */
                public static rw1 m8304v() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                /* JADX INFO: renamed from: A */
                public final String m8305A() {
                    return this.valueCase_ == 5 ? (String) this.value_ : HttpUrl.FRAGMENT_ENCODE_SET;
                }

                /* JADX INFO: renamed from: B */
                public final pw1 m8306B() {
                    return this.valueCase_ == 6 ? (pw1) this.value_ : pw1.m7570m();
                }

                /* JADX INFO: renamed from: C */
                public final int m8307C() {
                    switch (this.valueCase_) {
                        case 0:
/* 25 */                    return 9;
                        case 1:
/* 23 */                    return 1;
                        case 2:
/* 21 */                    return 2;
                        case 3:
/* 19 */                    return 3;
                        case 4:
/* 17 */                    return 4;
                        case 5:
/* 15 */                    return 5;
                        case 6:
/* 13 */                    return 6;
                        case 7:
/* 11 */                    return 7;
                        case 8:
/* 8 */                     return 8;
                        default:
/* 6 */                     return 0;
                    }
                }

                @Override // p000.tq0
                /* JADX INFO: renamed from: c */
                public final Object mo7066c(int i) {
                    nr1 rq0Var;
                    switch (AbstractC0886en.m3520y(i)) {
                        case 0:
/* 78 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 72 */                    return new t02(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", pw1.class});
                        case 3:
/* 52 */                    return new rw1();
                        case 4:
/* 46 */                    return new qw1(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    nr1 nr1Var = PARSER;
/* 15 */                    if (nr1Var != null) {
/* 38 */                        return nr1Var;
                            }
                            synchronized (rw1.class) {
                                try {
/* 20 */                            rq0Var = PARSER;
/* 22 */                            if (rq0Var == null) {
/* 26 */                                rq0Var = new rq0();
/* 29 */                                PARSER = rq0Var;
                                    }
                                } catch (Throwable th) {
/* 37 */                            throw th;
                                }
                                break;
                            }
/* 35 */                    return rq0Var;
                        default:
/* 9 */                     f42.m3660p();
/* 5 */                     return null;
                    }
                }

                /* JADX INFO: renamed from: t */
                public final boolean m8308t() {
/* 4 */             if (this.valueCase_ == 1) {
/* 10 */                return ((Boolean) this.value_).booleanValue();
                    }
/* 15 */            return false;
                }

                /* JADX INFO: renamed from: u */
                public final C2259ul m8309u() {
                    return this.valueCase_ == 8 ? (C2259ul) this.value_ : C2259ul.f17581c;
                }

                /* JADX INFO: renamed from: w */
                public final double m8310w() {
/* 4 */             if (this.valueCase_ == 7) {
/* 10 */                return ((Double) this.value_).doubleValue();
                    }
/* 15 */            return 0.0d;
                }

                /* JADX INFO: renamed from: x */
                public final float m8311x() {
/* 4 */             if (this.valueCase_ == 2) {
/* 10 */                return ((Float) this.value_).floatValue();
                    }
/* 15 */            return 0.0f;
                }

                /* JADX INFO: renamed from: y */
                public final int m8312y() {
/* 4 */             if (this.valueCase_ == 3) {
/* 10 */                return ((Integer) this.value_).intValue();
                    }
/* 15 */            return 0;
                }

                /* JADX INFO: renamed from: z */
                public final long m8313z() {
/* 4 */             if (this.valueCase_ == 4) {
/* 10 */                return ((Long) this.value_).longValue();
                    }
/* 15 */            return 0L;
                }
            }
