            package androidx.preference;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import p000.k50;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 76 */    public class SwitchPreference extends TwoStatePreference {
                public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
/* 2 */             super(context, attributeSet, i, 0);
/* 7 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SwitchPreference, i, 0);
/* 11 */            int i2 = R$styleable.SwitchPreference_summaryOn;
/* 13 */            int i3 = R$styleable.SwitchPreference_android_summaryOn;
/* 19 */            if (typedArrayObtainStyledAttributes.getString(i2) == null) {
/* 21 */                typedArrayObtainStyledAttributes.getString(i3);
                    }
/* 24 */            int i4 = R$styleable.SwitchPreference_summaryOff;
/* 26 */            int i5 = R$styleable.SwitchPreference_android_summaryOff;
/* 32 */            if (typedArrayObtainStyledAttributes.getString(i4) == null) {
/* 34 */                typedArrayObtainStyledAttributes.getString(i5);
                    }
/* 37 */            int i6 = R$styleable.SwitchPreference_switchTextOn;
/* 39 */            int i7 = R$styleable.SwitchPreference_android_switchTextOn;
/* 45 */            if (typedArrayObtainStyledAttributes.getString(i6) == null) {
/* 47 */                typedArrayObtainStyledAttributes.getString(i7);
                    }
/* 50 */            int i8 = R$styleable.SwitchPreference_switchTextOff;
/* 52 */            int i9 = R$styleable.SwitchPreference_android_switchTextOff;
/* 58 */            if (typedArrayObtainStyledAttributes.getString(i8) == null) {
/* 60 */                typedArrayObtainStyledAttributes.getString(i9);
                    }
/* 71 */            typedArrayObtainStyledAttributes.getBoolean(R$styleable.SwitchPreference_disableDependentsState, typedArrayObtainStyledAttributes.getBoolean(R$styleable.SwitchPreference_android_disableDependentsState, false));
/* 74 */            typedArrayObtainStyledAttributes.recycle();
                }

/* 77 */        public SwitchPreference(Context context, AttributeSet attributeSet) {
/* 78 */            this(context, attributeSet, k50.m5981r(context, R$attr.switchPreferenceStyle, R.attr.switchPreferenceStyle));
                }
            }
