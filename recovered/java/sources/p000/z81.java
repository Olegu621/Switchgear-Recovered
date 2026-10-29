            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class z81 {

                /* JADX INFO: renamed from: a */
                public final fp1 f19978a;

                /* JADX INFO: renamed from: b */
                public boolean f19979b;

                /* JADX INFO: renamed from: c */
                public int f19980c = -1;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ a91 f19981d;

                public z81(a91 a91Var, fp1 fp1Var) {
/* 4 */             this.f19981d = a91Var;
/* 9 */             this.f19978a = fp1Var;
                }

                /* JADX INFO: renamed from: a */
                public final void m10287a(boolean z) {
/* 3 */             if (z == this.f19979b) {
/* 71 */                return;
                    }
/* 6 */             this.f19979b = z;
/* 13 */            int i = z ? 1 : -1;
/* 14 */            a91 a91Var = this.f19981d;
/* 16 */            int i2 = a91Var.f124c;
/* 19 */            a91Var.f124c = i + i2;
/* 23 */            if (!a91Var.f125d) {
/* 26 */                a91Var.f125d = true;
                        while (true) {
                            try {
/* 29 */                        int i3 = a91Var.f124c;
/* 31 */                        if (i2 == i3) {
                                    break;
                                }
/* 39 */                        boolean z2 = i2 == 0 && i3 > 0;
/* 46 */                        boolean z3 = i2 > 0 && i3 == 0;
/* 47 */                        if (z2) {
/* 49 */                            a91Var.mo121g();
                                } else if (z3) {
/* 57 */                            a91Var.mo122h();
                                }
/* 60 */                        i2 = i3;
                            } catch (Throwable th) {
/* 72 */                        a91Var.f125d = false;
/* 74 */                        throw th;
                            }
                        }
/* 62 */                a91Var.f125d = false;
                    }
/* 66 */            if (this.f19979b) {
/* 68 */                a91Var.m117c(this);
                    }
                }

                /* JADX INFO: renamed from: b */
                public void mo10124b() {
                }

                /* JADX INFO: renamed from: c */
                public boolean mo10125c(g71 g71Var) {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: d */
                public abstract boolean mo9745d();
            }
