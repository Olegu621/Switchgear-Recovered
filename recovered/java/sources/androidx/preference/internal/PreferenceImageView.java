            package androidx.preference.internal;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.View;
            import android.widget.ImageView;
            import androidx.preference.R$styleable;
            import p000.AbstractC0208c9;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 38 */    public class PreferenceImageView extends ImageView {

                /* JADX INFO: renamed from: a */
                public int f1574a;

                /* JADX INFO: renamed from: b */
                public int f1575b;

                public PreferenceImageView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 7 */             this.f1574a = AbstractC0208c9.API_PRIORITY_OTHER;
/* 9 */             this.f1575b = AbstractC0208c9.API_PRIORITY_OTHER;
/* 14 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PreferenceImageView, i, 0);
/* 24 */            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.PreferenceImageView_maxWidth, AbstractC0208c9.API_PRIORITY_OTHER));
/* 33 */            setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.PreferenceImageView_maxHeight, AbstractC0208c9.API_PRIORITY_OTHER));
/* 36 */            typedArrayObtainStyledAttributes.recycle();
                }

                @Override // android.widget.ImageView
                public int getMaxHeight() {
/* 1 */             return this.f1575b;
                }

                @Override // android.widget.ImageView
                public int getMaxWidth() {
/* 1 */             return this.f1574a;
                }

                @Override // android.widget.ImageView, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             int mode = View.MeasureSpec.getMode(i);
/* 10 */            if (mode == Integer.MIN_VALUE || mode == 0) {
/* 14 */                int size = View.MeasureSpec.getSize(i);
/* 18 */                int maxWidth = getMaxWidth();
/* 22 */                if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
/* 28 */                    i = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
                        }
                    }
/* 32 */            int mode2 = View.MeasureSpec.getMode(i2);
/* 36 */            if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
/* 40 */                int size2 = View.MeasureSpec.getSize(i2);
/* 44 */                int maxHeight = getMaxHeight();
/* 48 */                if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
/* 54 */                    i2 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
                        }
                    }
/* 58 */            super.onMeasure(i, i2);
                }

                @Override // android.widget.ImageView
                public void setMaxHeight(int i) {
/* 1 */             this.f1575b = i;
/* 3 */             super.setMaxHeight(i);
                }

                @Override // android.widget.ImageView
                public void setMaxWidth(int i) {
/* 1 */             this.f1574a = i;
/* 3 */             super.setMaxWidth(i);
                }

/* 39 */        public PreferenceImageView(Context context, AttributeSet attributeSet) {
/* 40 */            this(context, attributeSet, 0);
                }
            }
