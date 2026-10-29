            package androidx.preference;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import p000.k50;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 50 */    public class CheckBoxPreference extends TwoStatePreference {
                public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
/* 2 */             super(context, attributeSet, i, 0);
/* 7 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CheckBoxPreference, i, 0);
/* 11 */            int i2 = R$styleable.CheckBoxPreference_summaryOn;
/* 13 */            int i3 = R$styleable.CheckBoxPreference_android_summaryOn;
/* 19 */            if (typedArrayObtainStyledAttributes.getString(i2) == null) {
/* 21 */                typedArrayObtainStyledAttributes.getString(i3);
                    }
/* 24 */            int i4 = R$styleable.CheckBoxPreference_summaryOff;
/* 26 */            int i5 = R$styleable.CheckBoxPreference_android_summaryOff;
/* 32 */            if (typedArrayObtainStyledAttributes.getString(i4) == null) {
/* 34 */                typedArrayObtainStyledAttributes.getString(i5);
                    }
/* 45 */            typedArrayObtainStyledAttributes.getBoolean(R$styleable.CheckBoxPreference_disableDependentsState, typedArrayObtainStyledAttributes.getBoolean(R$styleable.CheckBoxPreference_android_disableDependentsState, false));
/* 48 */            typedArrayObtainStyledAttributes.recycle();
                }

/* 51 */        public CheckBoxPreference(Context context, AttributeSet attributeSet) {
/* 52 */            this(context, attributeSet, k50.m5981r(context, R$attr.checkBoxPreferenceStyle, R.attr.checkBoxPreferenceStyle));
                }
            }
