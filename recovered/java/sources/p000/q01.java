            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class q01 extends o01 {

                /* JADX INFO: renamed from: U */
                public final C0156au f15357U;

                /* JADX INFO: renamed from: V */
                public final Object f15358V;

                /* JADX INFO: renamed from: v */
                public final z01 f15359v;

                /* JADX INFO: renamed from: w */
                public final r01 f15360w;

                public q01(z01 z01Var, r01 r01Var, C0156au c0156au, Object obj) {
/* 4 */             this.f15359v = z01Var;
/* 6 */             this.f15360w = r01Var;
/* 8 */             this.f15357U = c0156au;
/* 10 */            this.f15358V = obj;
                }

                @Override // p000.hz0
                /* JADX INFO: renamed from: a */
                public final void mo277a(Throwable th) {
/* 3 */             C0156au c0156auM10233G = z01.m10233G(this.f15357U);
/* 7 */             z01 z01Var = this.f15359v;
/* 9 */             r01 r01Var = this.f15360w;
/* 11 */            Object obj = this.f15358V;
/* 13 */            if (c0156auM10233G != null) {
/* 30 */                while (hu0.m4343n0(c0156auM10233G.f2092v, false, new q01(z01Var, r01Var, c0156auM10233G, obj), 1) == rn1.f16198a) {
/* 33 */                    c0156auM10233G = z01.m10233G(c0156auM10233G);
/* 37 */                    if (c0156auM10233G == null) {
                            }
                        }
/* 32 */                return;
                    }
/* 43 */            z01Var.mo7346g(z01Var.m10255q(r01Var, obj));
                }
            }
