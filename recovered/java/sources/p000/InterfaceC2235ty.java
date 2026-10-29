            package p000;

            import java.util.Iterator;
            import java.util.Objects;
            import java.util.Set;
            
            /* JADX INFO: renamed from: ty */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface InterfaceC2235ty {
                /* JADX INFO: renamed from: n */
                static void m8923n(uk1 uk1Var, InterfaceC2235ty interfaceC2235ty, InterfaceC2235ty interfaceC2235ty2, C1888lf c1888lf) {
/* 7 */             if (!Objects.equals(c1888lf, jw0.f12517A)) {
/* 64 */                uk1Var.m9036o(c1888lf, interfaceC2235ty2.mo7029i(c1888lf), interfaceC2235ty2.mo7025e(c1888lf));
/* 67 */                return;
                    }
/* 14 */            q32 q32Var = (q32) interfaceC2235ty2.mo7023b(c1888lf, null);
/* 20 */            q32 q32Var2 = (q32) interfaceC2235ty.mo7023b(c1888lf, null);
/* 22 */            EnumC2198sy enumC2198syMo7029i = interfaceC2235ty2.mo7029i(c1888lf);
/* 26 */            if (q32Var == null) {
/* 28 */                q32Var = q32Var2;
                    } else if (q32Var2 != null) {
/* 33 */                xt0 xt0Var = q32Var2.f15380a;
/* 35 */                r32 r32Var = q32Var2.f15381b;
/* 37 */                xt0 xt0Var2 = q32Var.f15380a;
/* 39 */                if (xt0Var2 != null) {
/* 41 */                    xt0Var = xt0Var2;
                        }
/* 42 */                r32 r32Var2 = q32Var.f15381b;
/* 44 */                if (r32Var2 != null) {
/* 46 */                    r32Var = r32Var2;
                        }
/* 49 */                q32Var = new q32(xt0Var, r32Var);
                    }
/* 52 */            uk1Var.m9036o(c1888lf, enumC2198syMo7029i, q32Var);
                }

                /* JADX INFO: renamed from: q */
                static nq1 m8924q(InterfaceC2235ty interfaceC2235ty, InterfaceC2235ty interfaceC2235ty2) {
/* 1 */             if (interfaceC2235ty == null && interfaceC2235ty2 == null) {
/* 5 */                 return nq1.f14410c;
                    }
/* 15 */            uk1 uk1VarM9035m = interfaceC2235ty2 != null ? uk1.m9035m(interfaceC2235ty2) : uk1.m9034j();
/* 19 */            if (interfaceC2235ty != null) {
/* 25 */                Iterator it = interfaceC2235ty.mo7024c().iterator();
/* 33 */                while (it.hasNext()) {
/* 41 */                    m8923n(uk1VarM9035m, interfaceC2235ty2, interfaceC2235ty, (C1888lf) it.next());
                        }
                    }
/* 45 */            return nq1.m7021d(uk1VarM9035m);
                }

                /* JADX INFO: renamed from: a */
                void mo7022a(C2076pn c2076pn);

                /* JADX INFO: renamed from: b */
                Object mo7023b(C1888lf c1888lf, Object obj);

                /* JADX INFO: renamed from: c */
                Set mo7024c();

                /* JADX INFO: renamed from: e */
                Object mo7025e(C1888lf c1888lf);

                /* JADX INFO: renamed from: f */
                Set mo7026f(C1888lf c1888lf);

                /* JADX INFO: renamed from: g */
                Object mo7027g(C1888lf c1888lf, EnumC2198sy enumC2198sy);

                /* JADX INFO: renamed from: h */
                boolean mo7028h(C1888lf c1888lf);

                /* JADX INFO: renamed from: i */
                EnumC2198sy mo7029i(C1888lf c1888lf);
            }
