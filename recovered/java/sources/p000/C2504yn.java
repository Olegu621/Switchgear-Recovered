            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: renamed from: yn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2504yn extends rk1 {

                /* JADX INFO: renamed from: l */
                public e62 f19711l = new e62();

                /* JADX INFO: renamed from: m */
                public a91 f19712m;

                /* JADX INFO: renamed from: n */
                public final C0878ef f19713n;

                public C2504yn(C0878ef c0878ef) {
/* 11 */            this.f19713n = c0878ef;
                }

                @Override // p000.a91
                /* JADX INFO: renamed from: d */
                public final Object mo118d() {
/* 1 */             a91 a91Var = this.f19712m;
                    return a91Var == null ? this.f19713n : a91Var.mo118d();
                }

                @Override // p000.a91
                /* JADX INFO: renamed from: g */
                public final void mo121g() {
/* 3 */             Iterator it = this.f19711l.iterator();
                    while (true) {
/* 8 */                 a62 a62Var = (a62) it;
/* 14 */                if (!a62Var.hasNext()) {
/* 32 */                    return;
                        } else {
/* 28 */                    ((eg1) ((Map.Entry) a62Var.next()).getValue()).m3428a();
                        }
                    }
                }

                @Override // p000.a91
                /* JADX INFO: renamed from: h */
                public final void mo122h() {
/* 3 */             Iterator it = this.f19711l.iterator();
                    while (true) {
/* 8 */                 a62 a62Var = (a62) it;
/* 14 */                if (!a62Var.hasNext()) {
/* 34 */                    return;
                        }
/* 26 */                eg1 eg1Var = (eg1) ((Map.Entry) a62Var.next()).getValue();
/* 30 */                eg1Var.f7679a.mo123i(eg1Var);
                    }
                }

                /* JADX INFO: renamed from: l */
                public final void m10161l(rk1 rk1Var) {
                    Object obj;
                    eg1 eg1Var;
/* 1 */             e62 e62Var = this.f19711l;
/* 3 */             a91 a91Var = this.f19712m;
/* 5 */             if (a91Var != null && (eg1Var = (eg1) e62Var.mo3334b(a91Var)) != null) {
/* 17 */                eg1Var.f7679a.mo123i(eg1Var);
                    }
/* 20 */            this.f19712m = rk1Var;
/* 25 */            C2357x6 c2357x6 = new C2357x6(this, 1);
/* 28 */            if (rk1Var == null) {
/* 98 */                C1951n4.m6868s("source cannot be null");
/* 101 */               return;
                    }
/* 32 */            eg1 eg1Var2 = new eg1(rk1Var, c2357x6);
/* 35 */            b62 b62VarMo3333a = e62Var.mo3333a(rk1Var);
/* 39 */            if (b62VarMo3333a != null) {
/* 41 */                obj = b62VarMo3333a.f2240b;
                    } else {
/* 46 */                b62 b62Var = new b62(rk1Var, eg1Var2);
/* 52 */                e62Var.f7559d++;
/* 54 */                b62 b62Var2 = e62Var.f7557b;
/* 56 */                if (b62Var2 == null) {
/* 58 */                    e62Var.f7556a = b62Var;
/* 60 */                    e62Var.f7557b = b62Var;
                        } else {
/* 63 */                    b62Var2.f2241c = b62Var;
/* 65 */                    b62Var.f2242d = b62Var2;
/* 67 */                    e62Var.f7557b = b62Var;
                        }
/* 69 */                obj = null;
                    }
/* 70 */            eg1 eg1Var3 = (eg1) obj;
/* 72 */            if (eg1Var3 != null && eg1Var3.f7680b != c2357x6) {
/* 81 */                C1951n4.m6859j("This source was already added with the different observer");
                    } else if (eg1Var3 == null && this.f124c > 0) {
/* 92 */                eg1Var2.m3428a();
                    }
                }
            }
