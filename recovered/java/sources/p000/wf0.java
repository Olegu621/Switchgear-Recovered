            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorSet;
            import android.animation.PropertyValuesHolder;
            import android.text.TextUtils;
            import android.view.ViewGroup;
            import com.google.android.material.R$animator;
            import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wf0 extends AbstractC1832ki {

                /* JADX INFO: renamed from: g */
                public final zf0 f18600g;

                /* JADX INFO: renamed from: h */
                public final boolean f18601h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ ExtendedFloatingActionButton f18602i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public wf0(ExtendedFloatingActionButton extendedFloatingActionButton, d52 d52Var, zf0 zf0Var, boolean z) {
/* 3 */             super(extendedFloatingActionButton, d52Var);
/* 1 */             this.f18602i = extendedFloatingActionButton;
/* 6 */             this.f18600g = zf0Var;
/* 8 */             this.f18601h = z;
                }

                @Override // p000.AbstractC1832ki
                /* JADX INFO: renamed from: a */
                public final AnimatorSet mo6104a() {
/* 1 */             mk1 mk1Var = this.f12783f;
/* 3 */             if (mk1Var == null) {
/* 8 */                 if (this.f12782e == null) {
/* 20 */                    this.f12782e = mk1.m6668b(this.f12778a, mo6106c());
                        }
/* 22 */                mk1Var = this.f12782e;
/* 24 */                mk1Var.getClass();
                    }
/* 29 */            boolean zM6673g = mk1Var.m6673g("width");
/* 35 */            zf0 zf0Var = this.f18600g;
/* 37 */            ExtendedFloatingActionButton extendedFloatingActionButton = this.f18602i;
/* 40 */            if (zM6673g) {
/* 42 */                PropertyValuesHolder[] propertyValuesHolderArrM6671e = mk1Var.m6671e("width");
/* 64 */                propertyValuesHolderArrM6671e[0].setFloatValues(extendedFloatingActionButton.getWidth(), zf0Var.getWidth());
/* 67 */                mk1Var.m6674h("width", propertyValuesHolderArrM6671e);
                    }
/* 76 */            if (mk1Var.m6673g("height")) {
/* 78 */                PropertyValuesHolder[] propertyValuesHolderArrM6671e2 = mk1Var.m6671e("height");
/* 100 */               propertyValuesHolderArrM6671e2[0].setFloatValues(extendedFloatingActionButton.getHeight(), zf0Var.getHeight());
/* 103 */               mk1Var.m6674h("height", propertyValuesHolderArrM6671e2);
                    }
/* 112 */           if (mk1Var.m6673g("paddingStart")) {
/* 114 */               PropertyValuesHolder[] propertyValuesHolderArrM6671e3 = mk1Var.m6671e("paddingStart");
/* 118 */               PropertyValuesHolder propertyValuesHolder = propertyValuesHolderArrM6671e3[0];
/* 120 */               WeakHashMap weakHashMap = e33.f7494a;
/* 138 */               propertyValuesHolder.setFloatValues(extendedFloatingActionButton.getPaddingStart(), zf0Var.getPaddingStart());
/* 141 */               mk1Var.m6674h("paddingStart", propertyValuesHolderArrM6671e3);
                    }
/* 150 */           if (mk1Var.m6673g("paddingEnd")) {
/* 152 */               PropertyValuesHolder[] propertyValuesHolderArrM6671e4 = mk1Var.m6671e("paddingEnd");
/* 156 */               PropertyValuesHolder propertyValuesHolder2 = propertyValuesHolderArrM6671e4[0];
/* 158 */               WeakHashMap weakHashMap2 = e33.f7494a;
/* 176 */               propertyValuesHolder2.setFloatValues(extendedFloatingActionButton.getPaddingEnd(), zf0Var.getPaddingEnd());
/* 179 */               mk1Var.m6674h("paddingEnd", propertyValuesHolderArrM6671e4);
                    }
/* 188 */           if (mk1Var.m6673g("labelOpacity")) {
/* 190 */               PropertyValuesHolder[] propertyValuesHolderArrM6671e5 = mk1Var.m6671e("labelOpacity");
/* 197 */               boolean z = this.f18601h;
/* 216 */               propertyValuesHolderArrM6671e5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
/* 219 */               mk1Var.m6674h("labelOpacity", propertyValuesHolderArrM6671e5);
                    }
/* 222 */           return m6105b(mk1Var);
                }

                @Override // p000.AbstractC1832ki
                /* JADX INFO: renamed from: c */
                public final int mo6106c() {
                    return this.f18601h ? R$animator.mtrl_extended_fab_change_size_expand_motion_spec : R$animator.mtrl_extended_fab_change_size_collapse_motion_spec;
                }

                @Override // p000.AbstractC1832ki
                /* JADX INFO: renamed from: e */
                public final void mo6108e() {
/* 4 */             this.f12781d.f7001a = null;
/* 6 */             ExtendedFloatingActionButton extendedFloatingActionButton = this.f18602i;
/* 9 */             extendedFloatingActionButton.f4736r0 = false;
/* 11 */            extendedFloatingActionButton.setHorizontallyScrolling(false);
/* 14 */            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
/* 18 */            if (layoutParams == null) {
/* 20 */                return;
                    }
/* 21 */            zf0 zf0Var = this.f18600g;
/* 29 */            layoutParams.width = zf0Var.mo2940p().width;
/* 37 */            layoutParams.height = zf0Var.mo2940p().height;
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
/* 14 */            boolean z = this.f18601h;
/* 16 */            ExtendedFloatingActionButton extendedFloatingActionButton = this.f18602i;
/* 18 */            extendedFloatingActionButton.f4735q0 = z;
/* 21 */            extendedFloatingActionButton.f4736r0 = true;
/* 23 */            extendedFloatingActionButton.setHorizontallyScrolling(true);
                }

                @Override // p000.AbstractC1832ki
                /* JADX INFO: renamed from: g */
                public final void mo6110g() {
/* 1 */             boolean z = this.f18601h;
/* 3 */             ExtendedFloatingActionButton extendedFloatingActionButton = this.f18602i;
/* 5 */             extendedFloatingActionButton.f4735q0 = z;
/* 7 */             ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
/* 11 */            if (layoutParams == null) {
/* 13 */                return;
                    }
/* 14 */            zf0 zf0Var = this.f18600g;
/* 22 */            layoutParams.width = zf0Var.mo2940p().width;
/* 30 */            layoutParams.height = zf0Var.mo2940p().height;
/* 32 */            int paddingStart = zf0Var.getPaddingStart();
/* 36 */            int paddingTop = extendedFloatingActionButton.getPaddingTop();
/* 40 */            int paddingEnd = zf0Var.getPaddingEnd();
/* 44 */            int paddingBottom = extendedFloatingActionButton.getPaddingBottom();
/* 48 */            WeakHashMap weakHashMap = e33.f7494a;
/* 50 */            extendedFloatingActionButton.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
/* 53 */            extendedFloatingActionButton.requestLayout();
                }

                @Override // p000.AbstractC1832ki
                /* JADX INFO: renamed from: h */
                public final boolean mo6111h() {
/* 1 */             ExtendedFloatingActionButton extendedFloatingActionButton = this.f18602i;
                    return this.f18601h == extendedFloatingActionButton.f4735q0 || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
                }
            }
