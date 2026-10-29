            package p000;

            import java.util.UUID;
            
            /* JADX INFO: renamed from: wq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 92 */    public final class C2340wq implements yy2 {

                /* JADX INFO: renamed from: a */
                public final uk1 f18731a;

                public C2340wq(uk1 uk1Var) {
                    Object objMo7025e;
/* 4 */             this.f18731a = uk1Var;
/* 8 */             Object objMo7025e2 = null;
                    try {
/* 9 */                 objMo7025e = uk1Var.mo7025e(rm2.f16184E);
                    } catch (IllegalArgumentException unused) {
/* 14 */                objMo7025e = null;
                    }
/* 15 */            Class cls = (Class) objMo7025e;
/* 19 */            if (cls != null && !cls.equals(lh2.class)) {
/* 32 */                ds0.m3196m("Invalid target class configuration for ", this, ": ", cls);
/* 35 */                throw null;
                    }
/* 42 */            this.f18731a.m9037p(zy2.f20392O, bz2.f2643e);
/* 45 */            uk1 uk1Var2 = this.f18731a;
/* 49 */            uk1Var2.m9037p(rm2.f16184E, lh2.class);
                    try {
/* 54 */                objMo7025e2 = uk1Var2.mo7025e(rm2.f16183D);
                    } catch (IllegalArgumentException unused2) {
                    }
/* 58 */            if (objMo7025e2 == null) {
/* 90 */                uk1Var2.m9037p(rm2.f16183D, lh2.class.getCanonicalName() + "-" + UUID.randomUUID());
                    }
                }

                @Override // p000.uf0
                /* JADX INFO: renamed from: m */
                public uk1 mo2939m() {
/* 1 */             return this.f18731a;
                }

                @Override // p000.yy2
                /* JADX INFO: renamed from: o */
                public zy2 mo7036o() {
/* 9 */             return new mh2(nq1.m7021d(this.f18731a));
                }

/* 93 */        public C2340wq() {
                    Object objMo7025e;
/* 94 */            uk1 uk1VarM9034j = uk1.m9034j();
/* 96 */            this.f18731a = uk1VarM9034j;
                    Object objMo7025e2 = null;
                    try {
/* 98 */                objMo7025e = uk1VarM9034j.mo7025e(rm2.f16184E);
                    } catch (IllegalArgumentException unused) {
                        objMo7025e = null;
                    }
/* 99 */            Class cls = (Class) objMo7025e;
/* 100 */           if (cls != null && !cls.equals(C2303vq.class)) {
/* 101 */               ds0.m3196m("Invalid target class configuration for ", this, ": ", cls);
                        throw null;
                    }
/* 102 */           uk1 uk1Var = this.f18731a;
/* 100 */           uk1Var.m9037p(rm2.f16184E, C2303vq.class);
                    try {
/* 105 */               objMo7025e2 = uk1Var.mo7025e(rm2.f16183D);
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (objMo7025e2 == null) {
/* 107 */               uk1Var.m9037p(rm2.f16183D, C2303vq.class.getCanonicalName() + "-" + UUID.randomUUID());
                    }
                }
            }
