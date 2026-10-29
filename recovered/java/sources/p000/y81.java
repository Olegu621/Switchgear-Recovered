            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class y81 extends z81 implements d71 {

                /* JADX INFO: renamed from: e */
                public final g71 f19519e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ a91 f19520f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public y81(a91 a91Var, g71 g71Var, fp1 fp1Var) {
/* 3 */             super(a91Var, fp1Var);
/* 1 */             this.f19520f = a91Var;
/* 6 */             this.f19519e = g71Var;
                }

                @Override // p000.z81
                /* JADX INFO: renamed from: b */
                public final void mo10124b() {
/* 7 */             this.f19519e.getLifecycle().mo4484b(this);
                }

                @Override // p000.z81
                /* JADX INFO: renamed from: c */
                public final boolean mo10125c(g71 g71Var) {
                    return this.f19519e == g71Var;
                }

                @Override // p000.z81
                /* JADX INFO: renamed from: d */
                public final boolean mo9745d() {
                    return ((i71) this.f19519e.getLifecycle()).f9483c.compareTo(u61.f17377d) >= 0;
                }

                @Override // p000.d71
                public final void onStateChanged(g71 g71Var, t61 t61Var) {
/* 1 */             g71 g71Var2 = this.f19519e;
/* 9 */             u61 u61Var = ((i71) g71Var2.getLifecycle()).f9483c;
/* 13 */            if (u61Var == u61.f17374a) {
/* 19 */                this.f19520f.mo123i(this.f19978a);
/* 22 */                return;
                    }
/* 23 */            u61 u61Var2 = null;
/* 24 */            while (u61Var2 != u61Var) {
/* 30 */                m10287a(mo9745d());
/* 42 */                u61Var2 = u61Var;
/* 39 */                u61Var = ((i71) g71Var2.getLifecycle()).f9483c;
                    }
                }
            }
