            package androidx.legacy.widget;

            import android.content.Context;
            import android.graphics.Canvas;
            import android.util.AttributeSet;
            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
/* 13 */    public class Space extends View {
                @Deprecated
                public Space(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 8 */             if (getVisibility() == 0) {
/* 11 */                setVisibility(4);
                    }
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             int suggestedMinimumWidth = getSuggestedMinimumWidth();
/* 5 */             int mode = View.MeasureSpec.getMode(i);
/* 9 */             int size = View.MeasureSpec.getSize(i);
/* 17 */            if (mode == Integer.MIN_VALUE) {
/* 24 */                suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
                    } else if (mode == 1073741824) {
/* 22 */                suggestedMinimumWidth = size;
                    }
/* 28 */            int suggestedMinimumHeight = getSuggestedMinimumHeight();
/* 32 */            int mode2 = View.MeasureSpec.getMode(i2);
/* 36 */            int size2 = View.MeasureSpec.getSize(i2);
/* 40 */            if (mode2 == Integer.MIN_VALUE) {
/* 47 */                suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
                    } else if (mode2 == 1073741824) {
/* 45 */                suggestedMinimumHeight = size2;
                    }
/* 51 */            setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
                }

                @Deprecated
/* 14 */        public Space(Context context, AttributeSet attributeSet) {
/* 15 */            this(context, attributeSet, 0);
                }
            }
