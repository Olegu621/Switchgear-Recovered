            package p000;

            import android.view.View;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$layout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hm1 extends rl1 {
                @Override // p000.rl1
                public final int getItemDefaultMarginResId() {
/* 1 */             return R$dimen.mtrl_navigation_rail_icon_margin;
                }

                @Override // p000.rl1
                public final int getItemLayoutResId() {
/* 1 */             return R$layout.mtrl_navigation_rail_item;
                }

                @Override // android.widget.FrameLayout, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 8 */             if (View.MeasureSpec.getMode(i2) == 0) {
/* 31 */                setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState(Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)), i2, 0));
                    }
                }
            }
