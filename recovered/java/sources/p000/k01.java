            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class k01 extends z01 {

                /* JADX INFO: renamed from: e */
                public final boolean f12554e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public k01() {
/* 2 */             super(true);
/* 1 */             boolean z = true;
/* 6 */             m10236A(null);
/* 9 */             InterfaceC2563zt interfaceC2563ztM10259w = m10259w();
/* 20 */            C0156au c0156au = interfaceC2563ztM10259w instanceof C0156au ? (C0156au) interfaceC2563ztM10259w : null;
/* 22 */            if (c0156au == null) {
/* 54 */                z = false;
                        break;
                    }
/* 24 */            z01 z01VarM7087o = c0156au.m7087o();
/* 32 */            while (!z01VarM7087o.mo5929t()) {
/* 35 */                InterfaceC2563zt interfaceC2563ztM10259w2 = z01VarM7087o.m10259w();
/* 46 */                C0156au c0156au2 = interfaceC2563ztM10259w2 instanceof C0156au ? (C0156au) interfaceC2563ztM10259w2 : null;
/* 47 */                if (c0156au2 == null) {
/* 54 */                    z = false;
                            break;
                        }
/* 49 */                z01VarM7087o = c0156au2.m7087o();
                    }
/* 55 */            this.f12554e = z;
                }

                @Override // p000.z01
                /* JADX INFO: renamed from: t */
                public final boolean mo5929t() {
/* 1 */             return this.f12554e;
                }

                @Override // p000.z01
                /* JADX INFO: renamed from: u */
                public final boolean mo5930u() {
/* 1 */             return true;
                }
            }
