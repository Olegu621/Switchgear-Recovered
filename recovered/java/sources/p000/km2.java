            package p000;

            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class km2 implements View.OnLayoutChangeListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f12879a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ lm2 f12880b;

                public km2(lm2 lm2Var, View view) {
/* 4 */             this.f12880b = lm2Var;
/* 6 */             this.f12879a = view;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
/* 1 */             View view2 = this.f12879a;
/* 7 */             if (view2.getVisibility() == 0) {
/* 11 */                this.f12880b.m6497c(view2);
                    }
                }
            }
