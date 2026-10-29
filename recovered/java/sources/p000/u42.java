            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class u42 extends o01 {

                /* JADX INFO: renamed from: v */
                public final p01 f17354v;

                public u42(p01 p01Var) {
/* 4 */             this.f17354v = p01Var;
                }

                @Override // p000.hz0
                /* JADX INFO: renamed from: a */
                public final void mo277a(Throwable th) {
/* 5 */             Object objM10260x = m7087o().m10260x();
/* 9 */             boolean z = objM10260x instanceof C1980nx;
/* 11 */            p01 p01Var = this.f17354v;
/* 13 */            if (z) {
/* 15 */                m42 m42Var = o42.f14612b;
/* 25 */                p01Var.resumeWith(pg3.m7426e(((C1980nx) objM10260x).f14555a));
                    } else {
/* 29 */                m42 m42Var2 = o42.f14612b;
/* 35 */                p01Var.resumeWith(j13.m5637B(objM10260x));
                    }
                }
            }
