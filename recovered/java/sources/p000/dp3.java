            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dp3 extends ep3 {
                @Override // p000.ep3
                /* JADX INFO: renamed from: a */
                public final void mo2828a(Object obj, long j) {
/* 7 */             vm3 vm3Var = (vm3) ((ro3) tq3.m8872j(obj, j));
/* 11 */            if (vm3Var.f18251a) {
/* 14 */                vm3Var.f18251a = false;
                    }
                }

                @Override // p000.ep3
                /* JADX INFO: renamed from: b */
                public final void mo2829b(Object obj, Object obj2, long j) {
/* 5 */             ro3 ro3VarMo8221I = (ro3) tq3.m8872j(obj, j);
/* 11 */            ro3 ro3Var = (ro3) tq3.m8872j(obj2, j);
/* 13 */            int size = ro3VarMo8221I.size();
/* 17 */            int size2 = ro3Var.size();
/* 21 */            if (size > 0 && size2 > 0) {
/* 30 */                if (!((vm3) ro3VarMo8221I).f18251a) {
/* 33 */                    ro3VarMo8221I = ro3VarMo8221I.mo8221I(size2 + size);
                        }
/* 37 */                ro3VarMo8221I.addAll(ro3Var);
                    }
/* 40 */            if (size > 0) {
/* 43 */                ro3Var = ro3VarMo8221I;
                    }
/* 44 */            tq3.m8873k(obj, j, ro3Var);
                }
            }
