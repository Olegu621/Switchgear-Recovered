            package androidx.appcompat.widget;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.text.Layout;
            import android.util.AttributeSet;
            import androidx.appcompat.R$styleable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public class DialogTitle extends AppCompatTextView {
                public DialogTitle(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
                }

                @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
                public final void onMeasure(int i, int i2) {
                    int lineCount;
/* 1 */             super.onMeasure(i, i2);
/* 4 */             Layout layout = getLayout();
/* 8 */             if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
/* 67 */                return;
                    }
/* 25 */            setSingleLine(false);
/* 29 */            setMaxLines(2);
/* 45 */            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.TextAppearance, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
/* 51 */            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, 0);
/* 55 */            if (dimensionPixelSize != 0) {
/* 58 */                setTextSize(0, dimensionPixelSize);
                    }
/* 61 */            typedArrayObtainStyledAttributes.recycle();
/* 64 */            super.onMeasure(i, i2);
                }

/* 4 */         public DialogTitle(Context context, AttributeSet attributeSet) {
/* 5 */             super(context, attributeSet);
                }
            }
