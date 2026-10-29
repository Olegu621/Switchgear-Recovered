            package androidx.preference;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import p000.k50;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 89 */    public abstract class DialogPreference extends Preference {
                public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
/* 2 */             super(context, attributeSet, i, 0);
/* 7 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DialogPreference, i, 0);
/* 11 */            int i3 = R$styleable.DialogPreference_dialogTitle;
/* 13 */            int i4 = R$styleable.DialogPreference_android_dialogTitle;
/* 19 */            if (typedArrayObtainStyledAttributes.getString(i3) == null) {
/* 21 */                typedArrayObtainStyledAttributes.getString(i4);
                    }
/* 24 */            int i5 = R$styleable.DialogPreference_dialogMessage;
/* 26 */            int i6 = R$styleable.DialogPreference_android_dialogMessage;
/* 32 */            if (typedArrayObtainStyledAttributes.getString(i5) == null) {
/* 34 */                typedArrayObtainStyledAttributes.getString(i6);
                    }
/* 37 */            int i7 = R$styleable.DialogPreference_dialogIcon;
/* 39 */            int i8 = R$styleable.DialogPreference_android_dialogIcon;
/* 45 */            if (typedArrayObtainStyledAttributes.getDrawable(i7) == null) {
/* 47 */                typedArrayObtainStyledAttributes.getDrawable(i8);
                    }
/* 50 */            int i9 = R$styleable.DialogPreference_positiveButtonText;
/* 52 */            int i10 = R$styleable.DialogPreference_android_positiveButtonText;
/* 58 */            if (typedArrayObtainStyledAttributes.getString(i9) == null) {
/* 60 */                typedArrayObtainStyledAttributes.getString(i10);
                    }
/* 63 */            int i11 = R$styleable.DialogPreference_negativeButtonText;
/* 65 */            int i12 = R$styleable.DialogPreference_android_negativeButtonText;
/* 71 */            if (typedArrayObtainStyledAttributes.getString(i11) == null) {
/* 73 */                typedArrayObtainStyledAttributes.getString(i12);
                    }
/* 84 */            typedArrayObtainStyledAttributes.getResourceId(R$styleable.DialogPreference_dialogLayout, typedArrayObtainStyledAttributes.getResourceId(R$styleable.DialogPreference_android_dialogLayout, 0));
/* 87 */            typedArrayObtainStyledAttributes.recycle();
                }

/* 90 */        public DialogPreference(Context context, AttributeSet attributeSet, int i) {
/* 91 */            this(context, attributeSet, i, 0);
                }

/* 91 */        public DialogPreference(Context context, AttributeSet attributeSet) {
/* 92 */            this(context, attributeSet, k50.m5981r(context, R$attr.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
                }
            }
