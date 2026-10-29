            package p000;

            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class i41 extends sq0 {
                private static final i41 DEFAULT_INSTANCE;
                public static final int KEY_FIELD_NUMBER = 2;
                private static volatile mr1 PARSER = null;
                public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
                private cz0 key_ = dz1.f7454d;
                private int primaryKeyId_;

                static {
/* 3 */             i41 i41Var = new i41();
/* 6 */             DEFAULT_INSTANCE = i41Var;
/* 10 */            sq0.m8614t(i41.class, i41Var);
                }

                /* JADX INFO: renamed from: C */
                public static f41 m4464C() {
/* 7 */             return (f41) DEFAULT_INSTANCE.m8618h();
                }

                /* JADX INFO: renamed from: D */
                public static i41 m4465D(ByteArrayInputStream byteArrayInputStream, dg0 dg0Var) throws pz0 {
/* 8 */             sq0 sq0VarM8613s = sq0.m8613s(DEFAULT_INSTANCE, new C0932fw(byteArrayInputStream), dg0Var);
/* 12 */            sq0.m8608g(sq0VarM8613s);
/* 15 */            return (i41) sq0VarM8613s;
                }

                /* JADX INFO: renamed from: E */
                public static i41 m4466E(byte[] bArr, dg0 dg0Var) {
/* 1 */             i41 i41Var = DEFAULT_INSTANCE;
/* 3 */             int length = bArr.length;
/* 4 */             sq0 sq0VarM8623q = i41Var.m8623q();
                    try {
/* 8 */                 az1 az1Var = az1.f2145c;
/* 10 */                az1Var.getClass();
/* 17 */                h72 h72VarM1182a = az1Var.m1182a(sq0VarM8623q.getClass());
/* 23 */                C0176bd c0176bd = new C0176bd();
/* 26 */                dg0Var.getClass();
/* 31 */                h72VarM1182a.mo4130h(sq0VarM8623q, bArr, 0, length, c0176bd);
/* 34 */                h72VarM1182a.mo4124b(sq0VarM8623q);
/* 37 */                sq0.m8608g(sq0VarM8623q);
/* 40 */                return (i41) sq0VarM8623q;
                    } catch (IOException e) {
/* 56 */                if (e.getCause() instanceof pz0) {
/* 64 */                    throw ((pz0) e.getCause());
                        }
/* 74 */                throw new pz0(e.getMessage(), e);
                    } catch (IndexOutOfBoundsException unused) {
/* 47 */                throw pz0.m7628g();
                    } catch (mx2 e2) {
/* 86 */                throw new pz0(e2.getMessage());
                    } catch (pz0 e3) {
/* 91 */                if (e3.f15349a) {
/* 103 */                   throw new pz0(e3.getMessage(), e3);
                        }
/* 103 */               throw e3;
                    }
                }

                /* JADX INFO: renamed from: w */
                public static void m4467w(i41 i41Var, int i) {
/* 1 */             i41Var.primaryKeyId_ = i;
                }

                /* JADX INFO: renamed from: x */
                public static void m4468x(i41 i41Var, h41 h41Var) {
/* 1 */             i41Var.getClass();
/* 4 */             cz0 cz0Var = i41Var.key_;
/* 11 */            if (!((AbstractC0827d0) cz0Var).f6945a) {
/* 13 */                int size = cz0Var.size();
/* 28 */                i41Var.key_ = cz0Var.mo2899x(size == 0 ? 10 : size * 2);
                    }
/* 32 */            i41Var.key_.add(h41Var);
                }

                /* JADX INFO: renamed from: A */
                public final List m4469A() {
/* 1 */             return this.key_;
                }

                /* JADX INFO: renamed from: B */
                public final int m4470B() {
/* 1 */             return this.primaryKeyId_;
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
/* 72 */                    return new s02(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", h41.class});
                        case 3:
/* 52 */                    return new i41();
                        case 4:
/* 46 */                    return new f41(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    mr1 mr1Var = PARSER;
/* 15 */                    if (mr1Var != null) {
/* 38 */                        return mr1Var;
                            }
                            synchronized (i41.class) {
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
                public final h41 m4471y(int i) {
/* 7 */             return (h41) this.key_.get(i);
                }

                /* JADX INFO: renamed from: z */
                public final int m4472z() {
/* 3 */             return this.key_.size();
                }
            }
