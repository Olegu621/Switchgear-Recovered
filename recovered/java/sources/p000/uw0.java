            package p000;

            import android.util.Size;
            import android.view.Surface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class uw0 extends d70 {

                /* JADX INFO: renamed from: o */
                public final /* synthetic */ int f17735o = 0;

                /* JADX INFO: renamed from: p */
                public final Object f17736p;

                public uw0(Surface surface) {
/* 6 */             super(d70.f7022k, 0);
/* 9 */             this.f17736p = surface;
                }

                @Override // p000.d70
                /* JADX INFO: renamed from: f */
                public final s81 mo2956f() {
/* 1 */             int i = this.f17735o;
/* 3 */             Object obj = this.f17736p;
                    switch (i) {
                        case 0:
/* 15 */                    return w11.m9450t((Surface) obj);
                        default:
/* 10 */                    return ((rj2) obj).f16125e;
                    }
                }

/* 11 */        public uw0(Surface surface, Size size, int i) {
/* 12 */            super(size, i);
/* 13 */            this.f17736p = surface;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public uw0(rj2 rj2Var, Size size) {
                    super(size, 34);
/* 14 */            this.f17736p = rj2Var;
                }
            }
