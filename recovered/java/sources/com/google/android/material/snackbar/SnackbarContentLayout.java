            package com.google.android.material.snackbar;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.widget.Button;
            import android.widget.LinearLayout;
            import android.widget.TextView;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$id;
            import java.util.WeakHashMap;
            import p000.e33;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SnackbarContentLayout extends LinearLayout {

                /* JADX INFO: renamed from: a */
                public TextView f4938a;

                /* JADX INFO: renamed from: b */
                public Button f4939b;

                /* JADX INFO: renamed from: c */
                public int f4940c;

                public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
                }

                /* JADX INFO: renamed from: a */
                public final boolean m2379a(int i, int i2, int i3) {
                    boolean z;
/* 6 */             if (i != getOrientation()) {
/* 8 */                 setOrientation(i);
/* 11 */                z = true;
                    } else {
/* 13 */                z = false;
                    }
/* 20 */            if (this.f4938a.getPaddingTop() == i2 && this.f4938a.getPaddingBottom() == i3) {
/* 31 */                return z;
                    }
/* 32 */            TextView textView = this.f4938a;
/* 34 */            WeakHashMap weakHashMap = e33.f7494a;
/* 40 */            if (textView.isPaddingRelative()) {
/* 50 */                textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
/* 5 */                 return true;
                    }
/* 62 */            textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
/* 5 */             return true;
                }

                public Button getActionView() {
/* 1 */             return this.f4939b;
                }

                public TextView getMessageView() {
/* 1 */             return this.f4938a;
                }

                @Override // android.view.View
                public final void onFinishInflate() {
/* 1 */             super.onFinishInflate();
/* 12 */            this.f4938a = (TextView) findViewById(R$id.snackbar_text);
/* 22 */            this.f4939b = (Button) findViewById(R$id.snackbar_action);
                }

                @Override // android.widget.LinearLayout, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 9 */             if (getOrientation() == 1) {
/* 86 */                return;
                    }
/* 18 */            int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.design_snackbar_padding_vertical_2lines);
/* 28 */            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.design_snackbar_padding_vertical);
/* 47 */            boolean z = this.f4938a.getLayout().getLineCount() > 1;
/* 48 */            if (!z || this.f4940c <= 0 || this.f4939b.getMeasuredWidth() <= this.f4940c) {
/* 73 */                if (!z) {
/* 76 */                    dimensionPixelSize = dimensionPixelSize2;
                        }
/* 81 */                if (!m2379a(0, dimensionPixelSize, dimensionPixelSize)) {
/* 86 */                    return;
                        }
                    } else if (!m2379a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
/* 86 */                return;
                    }
/* 83 */            super.onMeasure(i, i2);
                }

                public void setMaxInlineActionWidth(int i) {
/* 1 */             this.f4940c = i;
                }
            }
