            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class c91 extends rk1 {

                /* JADX INFO: renamed from: l */
                public final lc3 f2776l;

                /* JADX INFO: renamed from: m */
                public g71 f2777m;

                /* JADX INFO: renamed from: n */
                public zr3 f2778n;

                public c91(lc3 lc3Var) {
/* 4 */             this.f2776l = lc3Var;
/* 8 */             if (lc3Var.f13186a == null) {
/* 10 */                lc3Var.f13186a = this;
                    } else {
/* 15 */                f42.m3656l("There is already a listener registered");
/* 19 */                throw null;
                    }
                }

                @Override // p000.a91
                /* JADX INFO: renamed from: g */
                public final void mo121g() {
/* 1 */             lc3 lc3Var = this.f2776l;
/* 4 */             lc3Var.f13187b = true;
/* 7 */             lc3Var.f13189d = false;
/* 9 */             lc3Var.f13188c = false;
/* 13 */            lc3Var.f13194i.drainPermits();
/* 16 */            lc3Var.m6417a();
/* 24 */            lc3Var.f13192g = new RunnableC2289vd(lc3Var);
/* 26 */            lc3Var.m6418b();
                }

                @Override // p000.a91
                /* JADX INFO: renamed from: h */
                public final void mo122h() {
/* 4 */             this.f2776l.f13187b = false;
                }

                @Override // p000.a91
                /* JADX INFO: renamed from: i */
                public final void mo123i(fp1 fp1Var) {
/* 1 */             super.mo123i(fp1Var);
/* 5 */             this.f2777m = null;
/* 7 */             this.f2778n = null;
                }

                /* JADX INFO: renamed from: l */
                public final void m1551l() {
/* 1 */             g71 g71Var = this.f2777m;
/* 3 */             zr3 zr3Var = this.f2778n;
/* 5 */             if (g71Var == null || zr3Var == null) {
/* 15 */                return;
                    }
/* 9 */             super.mo123i(zr3Var);
/* 12 */            m119e(g71Var, zr3Var);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(64);
/* 10 */            sb.append("LoaderInfo{");
/* 21 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 26 */            sb.append(" #0 : ");
/* 31 */            he3.m4180a(sb, this.f2776l);
/* 36 */            sb.append("}}");
/* 39 */            return sb.toString();
                }
            }
