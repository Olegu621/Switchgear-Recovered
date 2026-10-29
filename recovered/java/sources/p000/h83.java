            package p000;

            import android.view.WindowInsets;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class h83 extends f83 {

                /* JADX INFO: renamed from: n */
                public ly0 f8963n;

                /* JADX INFO: renamed from: o */
                public ly0 f8964o;

                /* JADX INFO: renamed from: p */
                public ly0 f8965p;

                public h83(m83 m83Var, WindowInsets windowInsets) {
/* 1 */             super(m83Var, windowInsets);
/* 5 */             this.f8963n = null;
/* 7 */             this.f8964o = null;
/* 9 */             this.f8965p = null;
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: g */
                public ly0 mo4132g() {
/* 3 */             if (this.f8964o == null) {
/* 15 */                this.f8964o = ly0.m6574b(this.f7059c.getMandatorySystemGestureInsets());
                    }
/* 17 */            return this.f8964o;
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: i */
                public ly0 mo4133i() {
/* 3 */             if (this.f8963n == null) {
/* 15 */                this.f8963n = ly0.m6574b(this.f7059c.getSystemGestureInsets());
                    }
/* 17 */            return this.f8963n;
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: k */
                public ly0 mo4134k() {
/* 3 */             if (this.f8965p == null) {
/* 15 */                this.f8965p = ly0.m6574b(this.f7059c.getTappableElementInsets());
                    }
/* 17 */            return this.f8965p;
                }

                @Override // p000.d83, p000.j83
                /* JADX INFO: renamed from: l */
                public m83 mo2972l(int i, int i2, int i3, int i4) {
/* 8 */             return m83.m6620h(this.f7059c.inset(i, i2, i3, i4), null);
                }

                @Override // p000.e83, p000.j83
                /* JADX INFO: renamed from: q */
                public void mo3343q(ly0 ly0Var) {
                }
            }
