            package p000;

            import android.util.Size;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wb2 extends cm0 {

                /* JADX INFO: renamed from: d */
                public final Object f18567d;

                /* JADX INFO: renamed from: e */
                public final gw0 f18568e;

                /* JADX INFO: renamed from: f */
                public final int f18569f;

                /* JADX INFO: renamed from: i */
                public final int f18570i;

                public wb2(mw0 mw0Var, Size size, gw0 gw0Var) {
/* 1 */             super(mw0Var);
/* 9 */             this.f18567d = new Object();
/* 11 */            if (size == null) {
/* 19 */                this.f18569f = this.f2998b.getWidth();
/* 27 */                this.f18570i = this.f2998b.getHeight();
                    } else {
/* 34 */                this.f18569f = size.getWidth();
/* 40 */                this.f18570i = size.getHeight();
                    }
/* 42 */            this.f18568e = gw0Var;
                }

                @Override // p000.cm0, p000.mw0
                public final int getHeight() {
/* 1 */             return this.f18570i;
                }

                @Override // p000.cm0, p000.mw0
                public final int getWidth() {
/* 1 */             return this.f18569f;
                }

                @Override // p000.cm0, p000.mw0
                /* JADX INFO: renamed from: x0 */
                public final gw0 mo1727x0() {
/* 1 */             return this.f18568e;
                }
            }
