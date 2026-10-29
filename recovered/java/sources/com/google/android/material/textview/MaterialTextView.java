            package com.google.android.material.textview;

            import android.R;
            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import androidx.appcompat.widget.AppCompatTextView;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$styleable;
            import p000.de3;
            import p000.hd1;
            import p000.yy1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 130 */   public class MaterialTextView extends AppCompatTextView {
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
/* 6 */             super(hd1.m4176a(context, attributeSet, i, 0), attributeSet, i);
/* 9 */             Context context2 = getContext();
/* 15 */            TypedValue typedValueM10197C = yy1.m10197C(context2, R$attr.textAppearanceLineHeightEnabled);
/* 19 */            if (typedValueM10197C != null && typedValueM10197C.type == 18 && typedValueM10197C.data == 0) {
/* 32 */                return;
                    }
/* 33 */            Resources.Theme theme = context2.getTheme();
/* 39 */            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R$styleable.MaterialTextView, i, 0);
/* 47 */            int[] iArr = {R$styleable.MaterialTextView_android_lineHeight, R$styleable.MaterialTextView_lineHeight};
/* 53 */            int iM3034p = -1;
/* 55 */            for (int i2 = 0; i2 < 2 && iM3034p < 0; i2++) {
/* 61 */                iM3034p = de3.m3034p(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
                    }
/* 68 */            typedArrayObtainStyledAttributes.recycle();
/* 71 */            if (iM3034p != -1) {
/* 131 */               return;
                    }
/* 76 */            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, R$styleable.MaterialTextView, i, 0);
/* 82 */            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(R$styleable.MaterialTextView_android_textAppearance, -1);
/* 86 */            typedArrayObtainStyledAttributes2.recycle();
/* 89 */            if (resourceId != -1) {
/* 93 */                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, R$styleable.MaterialTextAppearance);
/* 97 */                Context context3 = getContext();
/* 105 */               int[] iArr2 = {R$styleable.MaterialTextAppearance_android_lineHeight, R$styleable.MaterialTextAppearance_lineHeight};
/* 109 */               int iM3034p2 = -1;
/* 110 */               for (int i3 = 0; i3 < 2 && iM3034p2 < 0; i3++) {
/* 116 */                   iM3034p2 = de3.m3034p(context3, typedArrayObtainStyledAttributes3, iArr2[i3], -1);
                        }
/* 123 */               typedArrayObtainStyledAttributes3.recycle();
/* 126 */               if (iM3034p2 >= 0) {
/* 128 */                   setLineHeight(iM3034p2);
                        }
                    }
                }

                @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
                public final void setTextAppearance(Context context, int i) {
/* 1 */             super.setTextAppearance(context, i);
/* 6 */             TypedValue typedValueM10197C = yy1.m10197C(context, R$attr.textAppearanceLineHeightEnabled);
/* 10 */            if (typedValueM10197C != null && typedValueM10197C.type == 18 && typedValueM10197C.data == 0) {
/* 23 */                return;
                    }
/* 30 */            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, R$styleable.MaterialTextAppearance);
/* 34 */            Context context2 = getContext();
/* 42 */            int[] iArr = {R$styleable.MaterialTextAppearance_android_lineHeight, R$styleable.MaterialTextAppearance_lineHeight};
/* 48 */            int iM3034p = -1;
/* 50 */            for (int i2 = 0; i2 < 2 && iM3034p < 0; i2++) {
/* 56 */                iM3034p = de3.m3034p(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
                    }
/* 63 */            typedArrayObtainStyledAttributes.recycle();
/* 66 */            if (iM3034p >= 0) {
/* 68 */                setLineHeight(iM3034p);
                    }
                }

/* 131 */       public MaterialTextView(Context context, AttributeSet attributeSet) {
/* 132 */           this(context, attributeSet, R.attr.textViewStyle);
                }
            }
