            package p000;

            import android.animation.Animator;
            import com.google.android.material.R$animator;
            import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xf0 extends AbstractC1832ki {

                /* JADX INFO: renamed from: g */
                public boolean f19072g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ ExtendedFloatingActionButton f19073h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public xf0(ExtendedFloatingActionButton extendedFloatingActionButton, d52 d52Var) {
/* 3 */             super(extendedFloatingActionButton, d52Var);
/* 1 */             this.f19073h = extendedFloatingActionButton;
                }

                @Override // p000.AbstractC1832ki
                /* JADX INFO: renamed from: c */
                public final int mo6106c() {
/* 1 */             return R$animator.mtrl_extended_fab_hide_motion_spec;
                }

                @Override // p000.AbstractC1832ki
                /* JADX INFO: renamed from: d */
                public final void mo6107d() {
/* 1 */             super.mo6107d();
/* 5 */             this.f19072g = true;
                }

                @Override // p000.AbstractC1832ki
                /* JADX INFO: renamed from: e */
                public final void mo6108e() {
/* 4 */             this.f12781d.f7001a = null;
/* 7 */             ExtendedFloatingActionButton extendedFloatingActionButton = this.f19073h;
/* 9 */             extendedFloatingActionButton.f4726h0 = 0;
/* 13 */            if (this.f19072g) {
/* 20 */                return;
                    }
/* 17 */            extendedFloatingActionButton.setVisibility(8);
                }

                @Override // p000.AbstractC1832ki
                /* JADX INFO: renamed from: f */
                public final void mo6109f(Animator animator) {
/* 1 */             d52 d52Var = this.f12781d;
/* 5 */             Animator animator2 = (Animator) d52Var.f7001a;
/* 7 */             if (animator2 != null) {
/* 9 */                 animator2.cancel();
                    }
/* 12 */            d52Var.f7001a = animator;
/* 15 */            this.f19072g = false;
/* 17 */            ExtendedFloatingActionButton extendedFloatingActionButton = this.f19073h;
/* 19 */            extendedFloatingActionButton.setVisibility(0);
/* 23 */            extendedFloatingActionButton.f4726h0 = 1;
                }

                @Override // p000.AbstractC1832ki
                /* JADX INFO: renamed from: g */
                public final void mo6110g() {
/* 5 */             this.f19073h.setVisibility(8);
                }

                @Override // p000.AbstractC1832ki
                /* JADX INFO: renamed from: h */
                public final boolean mo6111h() {
/* 1 */             int i = ExtendedFloatingActionButton.f4721u0;
/* 3 */             ExtendedFloatingActionButton extendedFloatingActionButton = this.f19073h;
/* 5 */             int visibility = extendedFloatingActionButton.getVisibility();
/* 9 */             int i2 = extendedFloatingActionButton.f4726h0;
/* 12 */            if (visibility == 0) {
/* 14 */                if (i2 != 1) {
/* 21 */                    return false;
                        }
                    } else if (i2 == 2) {
/* 21 */                return false;
                    }
/* 11 */            return true;
                }
            }
