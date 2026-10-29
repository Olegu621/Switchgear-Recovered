            package p000;

            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class b81 extends c81 {
                @Override // p000.c81
                /* JADX INFO: renamed from: a */
                public final void mo101a(Object obj, long j) {
/* 12 */            ((AbstractC0827d0) ((cz0) my2.f14064c.m6313i(obj, j))).f6945a = false;
                }

                @Override // p000.c81
                /* JADX INFO: renamed from: b */
                public final void mo102b(Object obj, long j, Object obj2) {
/* 1 */             ky2 ky2Var = my2.f14064c;
/* 7 */             cz0 cz0VarMo2899x = (cz0) ky2Var.m6313i(obj, j);
/* 13 */            cz0 cz0Var = (cz0) ky2Var.m6313i(obj2, j);
/* 15 */            int size = cz0VarMo2899x.size();
/* 19 */            int size2 = cz0Var.size();
/* 23 */            if (size > 0 && size2 > 0) {
/* 32 */                if (!((AbstractC0827d0) cz0VarMo2899x).f6945a) {
/* 35 */                    cz0VarMo2899x = cz0VarMo2899x.mo2899x(size2 + size);
                        }
/* 39 */                cz0VarMo2899x.addAll(cz0Var);
                    }
/* 42 */            if (size > 0) {
/* 44 */                cz0Var = cz0VarMo2899x;
                    }
/* 45 */            my2.m6830p(obj, j, cz0Var);
                }

                @Override // p000.c81
                /* JADX INFO: renamed from: c */
                public final List mo103c(Object obj, long j) {
/* 7 */             cz0 cz0Var = (cz0) my2.f14064c.m6313i(obj, j);
/* 14 */            if (((AbstractC0827d0) cz0Var).f6945a) {
/* 34 */                return cz0Var;
                    }
/* 16 */            int size = cz0Var.size();
/* 27 */            cz0 cz0VarMo2899x = cz0Var.mo2899x(size == 0 ? 10 : size * 2);
/* 31 */            my2.m6830p(obj, j, cz0VarMo2899x);
/* 34 */            return cz0VarMo2899x;
                }
            }
