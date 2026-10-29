            package p000;

            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.RandomAccess;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pw1 extends tq0 {
                private static final pw1 DEFAULT_INSTANCE;
                private static volatile nr1 PARSER = null;
                public static final int STRINGS_FIELD_NUMBER = 1;
                private dz0 strings_ = ez1.f7925d;

                static {
/* 3 */             pw1 pw1Var = new pw1();
/* 6 */             DEFAULT_INSTANCE = pw1Var;
/* 10 */            tq0.m8855j(pw1.class, pw1Var);
                }

                /* JADX INFO: renamed from: l */
                public static void m7569l(pw1 pw1Var, Set set) {
/* 1 */             dz0 dz0Var = pw1Var.strings_;
/* 8 */             if (!((ez1) dz0Var).f7926a) {
/* 10 */                ez1 ez1Var = (ez1) dz0Var;
/* 12 */                int i = ez1Var.f7928c;
/* 25 */                pw1Var.strings_ = ez1Var.m3618c(i == 0 ? 10 : i * 2);
                    }
/* 27 */            RandomAccess randomAccess = pw1Var.strings_;
/* 29 */            Charset charset = fz0.f8401a;
/* 33 */            if (randomAccess instanceof ArrayList) {
/* 48 */                ((ArrayList) randomAccess).ensureCapacity(set.size() + ((ez1) randomAccess).f7928c);
                    }
/* 51 */            ez1 ez1Var2 = (ez1) randomAccess;
/* 53 */            int i2 = ez1Var2.f7928c;
/* 63 */            for (Object obj : set) {
/* 69 */                if (obj == null) {
/* 89 */                    String str = "Element at index " + (ez1Var2.f7928c - i2) + " is null.";
/* 97 */                    for (int i3 = ez1Var2.f7928c - 1; i3 >= i2; i3--) {
/* 99 */                        ez1Var2.remove(i3);
                            }
/* 105 */                   C1951n4.m6868s(str);
/* 108 */                   return;
                        }
/* 109 */               ez1Var2.add(obj);
                    }
                }

                /* JADX INFO: renamed from: m */
                public static pw1 m7570m() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                /* JADX INFO: renamed from: o */
                public static ow1 m7571o() {
/* 10 */            return (ow1) ((pq0) DEFAULT_INSTANCE.mo7066c(5));
                }

                @Override // p000.tq0
                /* JADX INFO: renamed from: c */
                public final Object mo7066c(int i) {
                    nr1 rq0Var;
                    switch (AbstractC0886en.m3520y(i)) {
                        case 0:
/* 74 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 68 */                    return new t02(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                        case 3:
/* 52 */                    return new pw1();
                        case 4:
/* 46 */                    return new ow1(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    nr1 nr1Var = PARSER;
/* 15 */                    if (nr1Var != null) {
/* 38 */                        return nr1Var;
                            }
                            synchronized (pw1.class) {
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

                /* JADX INFO: renamed from: n */
                public final dz0 m7572n() {
/* 1 */             return this.strings_;
                }
            }
