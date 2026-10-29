            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ConcurrentMap;
            
            /* JADX INFO: renamed from: mu */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1940mu implements nx1 {

                /* JADX INFO: renamed from: a */
                public static final C1940mu f14026a = new C1940mu();

                @Override // p000.nx1
                /* JADX INFO: renamed from: a */
                public final Class mo146a() {
/* 1 */             return C1903lu.class;
                }

                @Override // p000.nx1
                /* JADX INFO: renamed from: b */
                public final Object mo147b(ra2 ra2Var) throws GeneralSecurityException {
/* 5 */             if (((lx1) ra2Var.f15957c) == null) {
/* 60 */                ds0.m3203t("no primary in primitive set");
/* 63 */                return null;
                    }
/* 15 */            Iterator it = ((ConcurrentMap) ra2Var.f15955a).values().iterator();
/* 23 */            while (it.hasNext()) {
/* 31 */                Iterator it2 = ((List) it.next()).iterator();
/* 39 */                while (it2.hasNext()) {
                        }
                    }
/* 54 */            return new C1903lu();
                }

                @Override // p000.nx1
                /* JADX INFO: renamed from: c */
                public final Class mo148c() {
/* 1 */             return C1903lu.class;
                }
            }
