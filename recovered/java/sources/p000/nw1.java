            package p000;

            import java.io.IOException;
            import java.io.InputStream;
            import java.util.Collections;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nw1 extends tq0 {
                private static final nw1 DEFAULT_INSTANCE;
                private static volatile nr1 PARSER = null;
                public static final int PREFERENCES_FIELD_NUMBER = 1;
                private gc1 preferences_ = gc1.f8537b;

                static {
/* 3 */             nw1 nw1Var = new nw1();
/* 6 */             DEFAULT_INSTANCE = nw1Var;
/* 10 */            tq0.m8855j(nw1.class, nw1Var);
                }

                /* JADX INFO: renamed from: l */
                public static gc1 m7063l(nw1 nw1Var) {
/* 1 */             gc1 gc1Var = nw1Var.preferences_;
/* 5 */             if (!gc1Var.f8538a) {
/* 11 */                nw1Var.preferences_ = gc1Var.m3911b();
                    }
/* 13 */            return nw1Var.preferences_;
                }

                /* JADX INFO: renamed from: n */
                public static lw1 m7064n() {
/* 10 */            return (lw1) ((pq0) DEFAULT_INSTANCE.mo7066c(5));
                }

                /* JADX INFO: renamed from: o */
                public static nw1 m7065o(InputStream inputStream) {
                    AbstractC1006hw c0969gw;
/* 1 */             nw1 nw1Var = DEFAULT_INSTANCE;
/* 4 */             if (inputStream == null) {
/* 6 */                 byte[] bArr = fz0.f8402b;
/* 8 */                 int length = bArr.length;
/* 11 */                c0969gw = new C0895ew(bArr, 0, length, false);
                        try {
/* 14 */                    c0969gw.mo3259l(length);
                        } catch (qz0 e) {
/* 19 */                    C1951n4.m6863n(e);
/* 22 */                    return null;
                        }
                    } else {
/* 26 */                c0969gw = new C0969gw(inputStream);
                    }
/* 29 */            eg0 eg0VarM3427a = eg0.m3427a();
/* 33 */            tq0 tq0VarM8860i = nw1Var.m8860i();
                    try {
/* 37 */                cz1 cz1Var = cz1.f6940c;
/* 39 */                cz1Var.getClass();
/* 46 */                i72 i72VarM2900a = cz1Var.m2900a(tq0VarM8860i.getClass());
/* 52 */                C1771iw c1771iw = (C1771iw) c0969gw.f9337b;
/* 54 */                if (c1771iw == null) {
/* 59 */                    c1771iw = new C1771iw(c0969gw, (byte) 0);
                        }
/* 62 */                i72VarM2900a.mo4494d(tq0VarM8860i, c1771iw, eg0VarM3427a);
/* 65 */                i72VarM2900a.mo4492b(tq0VarM8860i);
/* 73 */                if (tq0.m8854f(tq0VarM8860i, true)) {
/* 75 */                    return (nw1) tq0VarM8860i;
                        }
/* 92 */                throw new qz0(new nx2().getMessage());
                    } catch (nx2 e2) {
/* 146 */               throw new qz0(e2.getMessage());
                    } catch (qz0 e3) {
/* 150 */               if (e3.f15809a) {
/* 162 */                   throw new qz0(e3.getMessage(), e3);
                        }
/* 162 */               throw e3;
                    } catch (IOException e4) {
/* 117 */               if (e4.getCause() instanceof qz0) {
/* 125 */                   throw ((qz0) e4.getCause());
                        }
/* 135 */               throw new qz0(e4.getMessage(), e4);
                    } catch (RuntimeException e5) {
/* 100 */               if (e5.getCause() instanceof qz0) {
/* 108 */                   throw ((qz0) e5.getCause());
                        }
/* 109 */               throw e5;
                    }
                }

                @Override // p000.tq0
                /* JADX INFO: renamed from: c */
                public final Object mo7066c(int i) {
                    nr1 rq0Var;
                    switch (AbstractC0886en.m3520y(i)) {
                        case 0:
/* 76 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 70 */                    return new t02(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", mw1.f14053a});
                        case 3:
/* 52 */                    return new nw1();
                        case 4:
/* 46 */                    return new lw1(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    nr1 nr1Var = PARSER;
/* 15 */                    if (nr1Var != null) {
/* 38 */                        return nr1Var;
                            }
                            synchronized (nw1.class) {
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

                /* JADX INFO: renamed from: m */
                public final Map m7067m() {
/* 3 */             return Collections.unmodifiableMap(this.preferences_);
                }
            }
