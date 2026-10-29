            package androidx.preference;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import p000.ec0;
            import p000.k50;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 40 */    public class EditTextPreference extends DialogPreference {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends Preference.BaseSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0115a();

                    /* JADX INFO: renamed from: a */
                    public final String f1555a;

                    public SavedState(Parcel parcel) {
/* 1 */                 super(parcel);
/* 8 */                 this.f1555a = parcel.readString();
                    }

                    @Override // android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeString(this.f1555a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
/* 2 */             super(context, attributeSet, i, 0);
/* 1 */             int i2 = 0;
/* 7 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EditTextPreference, i, 0);
/* 11 */            int i3 = R$styleable.EditTextPreference_useSimpleSummaryProvider;
/* 21 */            if (typedArrayObtainStyledAttributes.getBoolean(i3, typedArrayObtainStyledAttributes.getBoolean(i3, false))) {
/* 25 */                if (ec0.f7616b == null) {
/* 32 */                    ec0.f7616b = new ec0(i2);
                        }
/* 36 */                this.f1566i = ec0.f7616b;
                    }
/* 38 */            typedArrayObtainStyledAttributes.recycle();
                }

                @Override // androidx.preference.Preference
                /* JADX INFO: renamed from: c */
                public final Object mo760c(TypedArray typedArray, int i) {
/* 1 */             return typedArray.getString(i);
                }

/* 41 */        public EditTextPreference(Context context, AttributeSet attributeSet) {
/* 42 */            this(context, attributeSet, k50.m5981r(context, R$attr.editTextPreferenceStyle, R.attr.editTextPreferenceStyle));
                }
            }
