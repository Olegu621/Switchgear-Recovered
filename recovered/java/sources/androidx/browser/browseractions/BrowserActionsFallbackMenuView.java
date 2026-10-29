            package androidx.browser.browseractions;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.view.View;
            import android.widget.LinearLayout;
            import androidx.browser.R$dimen;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public class BrowserActionsFallbackMenuView extends LinearLayout {

                /* JADX INFO: renamed from: a */
                public final int f777a;

                /* JADX INFO: renamed from: b */
                public final int f778b;

                public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 14 */            this.f777a = getResources().getDimensionPixelOffset(R$dimen.browser_actions_context_menu_min_padding);
/* 26 */            this.f778b = getResources().getDimensionPixelOffset(R$dimen.browser_actions_context_menu_max_width);
                }

                @Override // android.widget.LinearLayout, android.view.View
                public final void onMeasure(int i, int i2) {
/* 28 */            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f777a * 2), this.f778b), 1073741824), i2);
                }
            }
