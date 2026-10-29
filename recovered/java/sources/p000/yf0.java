            package p000;

            import android.animation.Animator;
            import com.google.android.material.R$animator;
            import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yf0 extends AbstractC1832ki {

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ ExtendedFloatingActionButton f19594g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public yf0(ExtendedFloatingActionButton extendedFloatingActionButton, d52 d52Var) {
/* 3 */             super(extendedFloatingActionButton, d52Var);
/* 1 */             this.f19594g = extendedFloatingActionButton;
                }

                @Override // p000.AbstractC1832ki
                /* JADX INFO: renamed from: c */
                public final int mo6106c() {
/* 1 */             return R$animator.mtrl_extended_fab_show_motion_spec;
                }

                @Override // p000.AbstractC1832ki
                /* JADX INFO: renamed from: e */
                public final void mo6108e() {
/* 4 */             this.f12781d.f7001a = null;
/* 9 */             this.f19594g.f4726h0 = 0;
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
/* 15 */            ExtendedFloatingActionButton extendedFloatingActionButton = this.f19594g;
/* 17 */            extendedFloatingActionButton.setVisibility(0);
/* 21 */            extendedFloatingActionButton.f4726h0 = 2;
                }

                @Override // p000.AbstractC1832ki
                /* JADX INFO: renamed from: g */
                public final void mo6110g() {
/* 2 */             ExtendedFloatingActionButton extendedFloatingActionButton = this.f19594g;
/* 4 */             extendedFloatingActionButton.setVisibility(0);
/* 9 */             extendedFloatingActionButton.setAlpha(1.0f);
/* 12 */            extendedFloatingActionButton.setScaleY(1.0f);
/* 15 */            extendedFloatingActionButton.setScaleX(1.0f);
                }

                @Override // p000.AbstractC1832ki
                /* JADX INFO: renamed from: h */
                public final boolean mo6111h() {
/* 1 */             int i = ExtendedFloatingActionButton.f4721u0;
/* 3 */             ExtendedFloatingActionButton extendedFloatingActionButton = this.f19594g;
/* 5 */             int visibility = extendedFloatingActionButton.getVisibility();
/* 9 */             int i2 = extendedFloatingActionButton.f4726h0;
/* 12 */            if (visibility != 0) {
/* 15 */                if (i2 != 2) {
/* 21 */                    return false;
                        }
                    } else if (i2 == 1) {
/* 21 */                return false;
                    }
/* 11 */            return true;
                }
            }
