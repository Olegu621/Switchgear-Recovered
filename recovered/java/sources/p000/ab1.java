            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ConcurrentMap;
            import java.util.logging.Logger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ab1 implements nx1 {

                /* JADX INFO: renamed from: a */
                public static final Logger f160a = Logger.getLogger(ab1.class.getName());

                /* JADX INFO: renamed from: b */
                public static final byte[] f161b = {0};

                /* JADX INFO: renamed from: c */
                public static final ab1 f162c = new ab1();

                @Override // p000.nx1
                /* JADX INFO: renamed from: a */
                public final Class mo146a() {
/* 1 */             return wa1.class;
                }

                @Override // p000.nx1
                /* JADX INFO: renamed from: b */
                public final Object mo147b(ra2 ra2Var) throws GeneralSecurityException {
/* 9 */             Iterator it = ((ConcurrentMap) ra2Var.f15955a).values().iterator();
/* 17 */            while (it.hasNext()) {
/* 33 */                for (lx1 lx1Var : (List) it.next()) {
/* 41 */                    de3 de3Var = lx1Var.f13525h;
/* 45 */                    if (de3Var instanceof ya1) {
/* 47 */                        ya1 ya1Var = (ya1) de3Var;
/* 49 */                        byte[] bArr = lx1Var.f13520c;
/* 60 */                        C2335wl c2335wlM9584a = C2335wl.m9584a(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
/* 72 */                        if (!c2335wlM9584a.equals(ya1Var.mo5945J())) {
/* 81 */                            StringBuilder sb = new StringBuilder("Mac Key with parameters ");
/* 88 */                            sb.append(ya1Var.mo5946K());
/* 91 */                            C2335wl c2335wlMo5945J = ya1Var.mo5945J();
/* 97 */                            sb.append(" has wrong output prefix (");
/* 100 */                           sb.append(c2335wlMo5945J);
/* 105 */                           sb.append(") instead of (");
/* 108 */                           sb.append(c2335wlM9584a);
/* 113 */                           sb.append(")");
/* 123 */                           throw new GeneralSecurityException(sb.toString());
                                }
                            }
                        }
                    }
/* 126 */           return new za1(ra2Var);
                }

                @Override // p000.nx1
                /* JADX INFO: renamed from: c */
                public final Class mo148c() {
/* 1 */             return wa1.class;
                }
            }
